# Sistema de Gerenciamento de Produtos Backend

## Descrição

Este projeto é uma aplicação full-stack desenvolvida com Spring Boot no back-end e Angular no front-end. A aplicação simula a gestão de produtos, permitindo adicionar, editar, visualizar e deletar produtos.

## Funcionalidades

- Listar produtos
- Adicionar novo produto
- Editar produto
- Deletar produto

## Tecnologias Utilizadas
### Back-end (Spring Boot)

- **Java 21**
- **Spring Boot 3.3.4**
- **Spring Data JPA** - Persistência de dados
- **Banco de dados H2** - Banco de dados em memória
- **@ControllerAdvice** - Tratamento global de exceções
- **Maven 3.9.8** - Gerenciamento de Dependencias

## Configuração do Projeto

### Clonando o Repositório do Projeto Back

git clone https://github.com/joeljunior123/SGP.git
cd sgp

### Download dependencias BackEnd

Rodar ```mvn clean install``` para baixar todas dependencias do projeto do BackEnd.

## Servidor de Desenvolvimento BackEnd

Execute ```mvn spring-boot:run``` para iniciar um servidor de desenvolvimento. A aplicação estará disponível em http://localhost:8080.

## Endpoints da API

- GET /products - Retorna todos os produtos
- GET /products/{id} - Retorna o produto com o ID especificado
- GET /products/search?{name} - Retorna produtos com base no nome
- POST /products - Adiciona um novo produto
- PUT /products/{id} - Atualiza o produto com o ID especificado
- DELETE /products/{id} - Deleta o produto com o ID especificado

## Considerações Finais

Este projeto foi desenvolvido como parte de um desafio técnico e tem como foco a implementação de funcionalidades básicas de uma aplicação de cadastro de produtos. A comunicação entre o front-end e o back-end é feita via API REST.
