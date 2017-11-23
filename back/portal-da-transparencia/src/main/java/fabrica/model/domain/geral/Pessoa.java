package fabrica.model.domain.geral;


import fabrica.model.dao.Entidade;
import fabrica.model.domain.ExcecaoNegocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import static fabrica.util.UtilValidacao.REGEX_EMAIL;
import static fabrica.util.UtilValidacao.validaString;

/**
 * @author gabriel
 * @version 1.0.0
 *          <p>
 *          Entidade que representa a pessoa dentro do sistema
 *          sendo que uma pessoa sempre estará associada a um
 *          ou mais papeis,  estes terão influência em cada modúlo
 *          da aplicação, sendo que todos os modúlos compartilham
 *          da mesma pessoa porém as diferem pelo seu papel.
 *          As operaçõoes com o registro de Pessoa
 *          diz respeito a todos os modúlos da aplicação.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Pessoa extends Entidade {

    @Column(length = 50)
    private String nome;

    @Column(length = 50)
    private String email;

    @Column(length = 11)
    public String cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, String email, String cpf) {
        this.nome = validaString(nome, 50, () -> {
            throw new ExcecaoNegocio(
                    10, "Erro nome pessoa", "Nome pessoa nulo vazio ou com mais 50 caracteres."
            );
        });
        this.email = validaString(email, 50, REGEX_EMAIL, () -> {
            throw new ExcecaoNegocio(
                    20, "Erro email pessoa", "E-mail pessoa nulo, vazio ou inválido."
            );
        });
        this.cpf = validaString(cpf, 11, "[0-9]{11}", () -> {
            throw new ExcecaoNegocio(
                    30, "Erro cpf", "Cpf pessoa, vazio ou inválido."
            );
        });
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }
}
