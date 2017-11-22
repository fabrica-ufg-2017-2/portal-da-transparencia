# Teste de arquitetura projeto da Fabrica de Software 

[![N|Solid](http://inf.ufg.br/sites/default/files/marca-inf.png)](http://inf.ufg.br/)
Repositórito criado para testar arquitetura do sistemas Portal da Trnaparência.

- Requisitos para desenvolver neste projeto.
	- IDE Eclipse, Netbeans ou Intelij.
	- Git.
	- Banco de dados Mysql.  
- Passos para configurar seu ambiente.
	- Criar banco de dados com nome *portaltransparencia*.
	- Configurar usúario *root* com senha *123456*.
	- Importar projeto usando seu ide favorito usando a opção de importar projeto Maven.
	- Rodar projeto dando um Run na classe principal.
	- Voce pode customizar essas configurações através dos parametros:
		- DNSBD: -> Dns ou Ip do banco
		- NOMEBD: -> Nome do banco de dados.
		- PORTBD: -> Porta do bando de dados.
		- USUBD: -> Nome de usúario do banco de dados.
		- SENHBD: -> Senha do banco de dados.
		- PORTAWS: -> Porta do servidor.
	- Exemplo de comando maven para rodar a aplicação: ```mvn clean package && java -jar target/fabrica-jar-with-dependencies.jar DNSBD:localhost NOMEBD:novobanco PORTBD:3306 USUBD:root SENHBD:123456```
	
Clone o projeto abra em seu IDE favorito usando a opção import maven project. 


