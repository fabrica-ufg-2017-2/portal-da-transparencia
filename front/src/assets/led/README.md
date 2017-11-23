## Large External Data (led)

#### Qual a finalidade da pasta led?
----
A pasta led tem como finalidade armazenar grandes quantidades de dados em formato de arquivo .JSON.
Estes arquivos servirão como mock, a fim de popular as telas front-end.

### Qual a estrutura desta pasta?
----
* <nome-do-modulo>.json
Exemplo: pesquisa.json

### Como estruturar meu arquivo .json?
----
* Cada chave do arquivo json é uma tabela:
* No arquivo pesquisa.json, por exemplo, a chave "projetos" é uma tabela e a chave "grupos" é outra.

### Como rodar meu arquivo json como uma database?
----
> npm install -g json-server
* Agora vá no arquivo package.json e configure seu script, seguindo o modelo:
  * "db:pesquisa": "json-server -w ./src/assets/led/pesquisa.json"
* Para rodar finalmente:
> npm run db:pesquisa
* Confira no seu browser em localhost:3000 se está rodando corretamente.