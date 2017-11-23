package fabrica.controller.dto.geral;

import fabrica.controller.dto.DTO;
import fabrica.model.domain.geral.Pessoa;

/**
 * @author gabriel
 * @version 1.0.0
 */
public class PessoaDTO extends DTO<Pessoa> {

    private String nome;

    private String email;

    public String cpf;

    public static PessoaDTO converterDominio(Pessoa p) {
        PessoaDTO dto = new PessoaDTO();
            dto.nome = p.getNome();
            dto.email = p.getEmail();
            dto.cpf = p.getCpf();
        return dto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
