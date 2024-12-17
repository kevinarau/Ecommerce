
## E-COMMERCE API

Este projeto é uma API para um sistema de e-commerce desenvolvido com Java, Spring Framework, Spring Data JPA e MySQL. A aplicação permite gerenciar products, categorias, Cliente. E é um projeto em evolução.

### 📋 Funcionalidades 

ºGestão de Produtos: Criar, listar, atualizar e excluir products.

ºGestão de Categorias: Organizar products por categorias.

ºIntegração com MySQL: Persistência e gerenciamento de dados.

### 🛠️ Tecnologias Utilizadas 

ºLinguagem: Java 17+

ºFramework: Spring Boot 3.2+

ºSpring Web (para APIs RESTful)

ºSpring Data JPA (para interação com o banco de dados)

ºBanco de Dados: MySQL

ºFerramentas adicionais: Maven (gerenciamento de dependências)

Postman (testes de API)

Dados (DTOs)

### 📖 Endpoints Principais 

ºProdutos

GET /products: Lista todos os products.

POST /products: Cria um novo produto.

GET /products/{id}: Retorna um produto pelo ID.

PUT /products/{id}: Atualiza um produto.

DELETE /products/{id}: Exclui um produto.

ºCategorias

GET /categories: Lista todas as categorias.

POST /categories: Cria uma nova categoria.


### 📚 Estrutura do Projeto

src/main/java
├── com.example.ecommerce

│   ├── controllers # Controladores REST (endpoints da API)

│   ├── models          # Entidades (Classes JPA)

│   ├── repositories    # Repositórios (interface para banco de dados)

│   ├── services        # Lógica de negócios

│   └── dto             # Objetos de Transferência de Dados (DTOs)
