# Alura - API Rest Voll Med

### Trilha de Spring Boot Avançado Alura

Cursos da trilha 👨‍💻

- https://cursos.alura.com.br/course/java-jdbc-banco-dados


- https://cursos.alura.com.br/course/persistencia-jpa-introducao-hibernate


- https://cursos.alura.com.br/course/java-trabalhando-lambdas-streams-spring-framework


- https://cursos.alura.com.br/course/spring-boot-3-desenvolva-api-rest-java

Criamos um API REST utilizando Spring Boot e também desenvolvemos um CRUD.

Aprendemos o que é o Spring Boot e quais suas principais diferenças quando comparado ao Spring tradicional. Usamos o Spring Initializr para fazer a construção do nosso projeto.

Entendemos como funciona a estrutura de diretórios e como funciona o arquivo "pom.xml". Aprendemos a utilizar alguns de seus módulos, como Web, Validação e Spring Data JPA.

Usamos outras bibliotecas, como o driver do MySQL, o Flyway e o Lombok. Também aprendemos como funcionam as configurações em um projeto com Spring Boot.

Aprendemos a fazer migrations para ter controle do histórico de evolução do banco de dados e a implementar a API Rest a partir da criação dos controllers. Aprendemos a usar repositories, para simplificar o acesso ao banco de dados e ao JPA.

Fizemos o mapeamento das entidades JPA. Implementamos, também, o CRUD com validações.


- https://cursos.alura.com.br/course/spring-boot-aplique-boas-praticas-proteja-api-rest


- https://cursos.alura.com.br/course/spring-boot-3-documente-teste-prepare-api-deploy

# Collection da api Vollmed - JSON

{
"_type": "export",
"__export_format": 4,
"__export_date": "2023-12-13T22:18:35.108Z",
"__export_source": "insomnia.desktop.app:v8.4.5",
"resources": [
{
"_id": "req_8ea4973903fe4b1da013c03bac0056cd",
"parentId": "wrk_7852a6e021f942779fd8fa23a93907ba",
"modified": 1702421841144,
"created": 1702081615626,
"url": "localhost:8080/hello",
"name": "/hello",
"description": "",
"method": "GET",
"body": {},
"parameters": [],
"headers": [
{
"name": "User-Agent",
"value": "insomnia/8.3.0"
}
],
"authentication": {},
"metaSortKey": -1702392861217,
"isPrivate": false,
"settingStoreCookies": true,
"settingSendCookies": true,
"settingDisableRenderRequestBody": false,
"settingEncodeUrl": true,
"settingRebuildPath": true,
"settingFollowRedirects": "global",
"_type": "request"
},
{
"_id": "wrk_7852a6e021f942779fd8fa23a93907ba",
"parentId": null,
"modified": 1702081610288,
"created": 1702081610288,
"name": "Alura - API Voll Med",
"description": "",
"scope": "collection",
"_type": "workspace"
},
{
"_id": "req_dd3e4e889c6340fdb5ce4a3ec03b2bdd",
"parentId": "wrk_7852a6e021f942779fd8fa23a93907ba",
"modified": 1702421843113,
"created": 1702406443002,
"url": "localhost:8080/medicos",
"name": "/medicos",
"description": "",
"method": "GET",
"body": {},
"parameters": [],
"headers": [
{
"name": "User-Agent",
"value": "insomnia/8.4.5"
}
],
"authentication": {},
"metaSortKey": -1702392861167,
"isPrivate": false,
"settingStoreCookies": true,
"settingSendCookies": true,
"settingDisableRenderRequestBody": false,
"settingEncodeUrl": true,
"settingRebuildPath": true,
"settingFollowRedirects": "global",
"_type": "request"
},
{
"_id": "req_365a142b11614a71b43ffb09ab0210a9",
"parentId": "wrk_7852a6e021f942779fd8fa23a93907ba",
"modified": 1702421844757,
"created": 1702421233146,
"url": "localhost:8080/pacientes",
"name": "/pacientes",
"description": "",
"method": "GET",
"body": {},
"parameters": [],
"headers": [
{
"name": "User-Agent",
"value": "insomnia/8.4.5"
}
],
"authentication": {},
"metaSortKey": -1702392861142,
"isPrivate": false,
"settingStoreCookies": true,
"settingSendCookies": true,
"settingDisableRenderRequestBody": false,
"settingEncodeUrl": true,
"settingRebuildPath": true,
"settingFollowRedirects": "global",
"_type": "request"
},
{
"_id": "req_fc6db1b347d545b78bafc8a3b09a6bf0",
"parentId": "wrk_7852a6e021f942779fd8fa23a93907ba",
"modified": 1702421268378,
"created": 1702392861117,
"url": "localhost:8080/pacientes",
"name": "/pacientes",
"description": "",
"method": "POST",
"body": {
"mimeType": "application/json",
"text": {
"nome": "Ana Pintinho",
"email": "ana.pinto@paciente.med",
"telefone": "11993119124",
"cpf": "465.414.425-97",
"endereco": {
"logradouro": "rua 1",
"bairro": "bairro",
"cep": "12345678",
"cidade": "Brasilia",
"uf": "DF",
"numero": "",
"complemento": ""
}
}
},
"parameters": [],
"headers": [
{
"name": "Content-Type",
"value": "application/json"
},
{
"name": "User-Agent",
"value": "insomnia/8.4.5"
}
],
"authentication": {},
"metaSortKey": -1702392861117,
"isPrivate": false,
"settingStoreCookies": true,
"settingSendCookies": true,
"settingDisableRenderRequestBody": false,
"settingEncodeUrl": true,
"settingRebuildPath": true,
"settingFollowRedirects": "global",
"_type": "request"
},
{
"_id": "req_9bac8d33f78b48babd5fd19a5deffa46",
"parentId": "wrk_7852a6e021f942779fd8fa23a93907ba",
"modified": 1702345971443,
"created": 1702081730948,
"url": "localhost:8080/medicos",
"name": "/medicos",
"description": "",
"method": "POST",
"body": {
"mimeType": "application/json",
"text": {
"nome": "Bruninho Pinto",
"email": "bruninho.pinto@voll.med",
"crm": "45653",
"especialidade": "CARDIOLOGIA",
"telefone": "11995119124",
"endereco": {
"logradouro": "rua 1",
"bairro": "bairro",
"cep": "12345678",
"cidade": "Brasilia",
"uf": "DF",
"numero": "",
"complemento": ""
}
}
},
"parameters": [],
"headers": [
{
"name": "Content-Type",
"value": "application/json"
},
{
"name": "User-Agent",
"value": "insomnia/8.4.5"
}
],
"authentication": {},
"metaSortKey": -1702081730948,
"isPrivate": false,
"settingStoreCookies": true,
"settingSendCookies": true,
"settingDisableRenderRequestBody": false,
"settingEncodeUrl": true,
"settingRebuildPath": true,
"settingFollowRedirects": "global",
"_type": "request"
},
{
"_id": "req_9d494b8640f4454d93833980789d5cb6",
"parentId": "wrk_7852a6e021f942779fd8fa23a93907ba",
"modified": 1702423463850,
"created": 1702421825464,
"url": "localhost:8080/medicos",
"name": "/medicos",
"description": "",
"method": "PUT",
"body": {
"mimeType": "application/json",
"text": {
"id": "4",
"telefone": "122345678"
}
},
"parameters": [],
"headers": [
{
"name": "Content-Type",
"value": "application/json"
},
{
"name": "User-Agent",
"value": "insomnia/8.4.5"
}
],
"authentication": {},
"metaSortKey": -1702081630041.25,
"isPrivate": false,
"settingStoreCookies": true,
"settingSendCookies": true,
"settingDisableRenderRequestBody": false,
"settingEncodeUrl": true,
"settingRebuildPath": true,
"settingFollowRedirects": "global",
"_type": "request"
},
{
"_id": "req_e1915f12b2ca4421b9b9ce2b47f74fff",
"parentId": "wrk_7852a6e021f942779fd8fa23a93907ba",
"modified": 1702423951785,
"created": 1702423883385,
"url": "localhost:8080/pacientes",
"name": "/pacientes",
"description": "",
"method": "PUT",
"body": {
"mimeType": "application/json",
"text": {
"id": "2",
"nome": "Débora Macedo",
"email": "debora-macedo@hotmail.com"
}
},
"parameters": [],
"headers": [
{
"name": "Content-Type",
"value": "application/json"
},
{
"name": "User-Agent",
"value": "insomnia/8.4.5"
}
],
"authentication": {},
"metaSortKey": -1699229237573.125,
"isPrivate": false,
"settingStoreCookies": true,
"settingSendCookies": true,
"settingDisableRenderRequestBody": false,
"settingEncodeUrl": true,
"settingRebuildPath": true,
"settingFollowRedirects": "global",
"_type": "request"
},
{
"_id": "req_9de5f742e52a49afa40f23aa17676bd4",
"parentId": "wrk_7852a6e021f942779fd8fa23a93907ba",
"modified": 1702426792179,
"created": 1702425872669,
"url": "localhost:8080/medicos/7",
"name": "/medicos",
"description": "",
"method": "DELETE",
"body": {},
"parameters": [],
"headers": [
{
"name": "User-Agent",
"value": "insomnia/8.4.5"
}
],
"authentication": {},
"metaSortKey": -1699229237473.125,
"isPrivate": false,
"settingStoreCookies": true,
"settingSendCookies": true,
"settingDisableRenderRequestBody": false,
"settingEncodeUrl": true,
"settingRebuildPath": true,
"settingFollowRedirects": "global",
"_type": "request"
},
{
"_id": "req_b36f547cd2974da7b4b05cfc315d724c",
"parentId": "wrk_7852a6e021f942779fd8fa23a93907ba",
"modified": 1702427411562,
"created": 1702427397347,
"url": "localhost:8080/pacientes/3",
"name": "/pacientes",
"description": "",
"method": "DELETE",
"body": {},
"parameters": [],
"headers": [
{
"name": "User-Agent",
"value": "insomnia/8.4.5"
}
],
"authentication": {},
"metaSortKey": -1697803041289.0625,
"isPrivate": false,
"settingStoreCookies": true,
"settingSendCookies": true,
"settingDisableRenderRequestBody": false,
"settingEncodeUrl": true,
"settingRebuildPath": true,
"settingFollowRedirects": "global",
"_type": "request"
},
{
"_id": "env_3fbc2d8648d435baf53c6df182e1bbf7316e82fc",
"parentId": "wrk_7852a6e021f942779fd8fa23a93907ba",
"modified": 1702081610291,
"created": 1702081610291,
"name": "Base Environment",
"data": {},
"dataPropertyOrder": null,
"color": null,
"isPrivate": false,
"metaSortKey": 1702081610291,
"_type": "environment"
},
{
"_id": "jar_3fbc2d8648d435baf53c6df182e1bbf7316e82fc",
"parentId": "wrk_7852a6e021f942779fd8fa23a93907ba",
"modified": 1702081610292,
"created": 1702081610293,
"name": "Default Jar",
"cookies": [],
"_type": "cookie_jar"
}
]
}

