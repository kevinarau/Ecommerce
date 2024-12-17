
## E-COMMERCE API

Este projeto é uma API para um sistema de e-commerce desenvolvido com Java, Spring Framework, Spring Data JPA e MySQL. A aplicação permite gerenciar produtos, categorias, Cliente. E é um projeto em evolução.

### 📋 Funcionalidades 

     ºGestão de Produtos: Criar, listar, atualizar e excluir produtos.

     ºGestão de Categorias: Organizar produtos por categorias.

     ºIntegração com MySQL: Persistência e gerenciamento de dados.

### 🛠️ Tecnologias Utilizadas 

     ºLinguagem: Java 17+

     ºFramework: Spring Boot 3.2+

     ºSpring Web (para APIs RESTful)

     ºSpring Data JPA (para interação com o banco de dados)

    ºBanco de Dados: MySQL

     ºFerramentas adicionais: Maven (gerenciamento de dependências)

     °Postman (testes de API)

     ºDados (DTOs)
     
     ºHibernate(validator)

### 📖 Endpoints Principais 

ºProdutos

     GET /products: Lista todos os produtos.

     POST /products: Cria um novo produto.

    GET /products/{id}: Retorna um produto pelo ID.

    PUT /products/{id}: Atualiza um produto.

    DELETE /products/{id}: Exclui um produto.

ºCategorias

    GET /categories: Lista todas as categorias.

    POST /categories: Cria uma nova categoria.

ºCliente

      GET /cliente: Lista todos os cliente.

     POST /cliente: Cadastra um novo cliente.

      GET /cliente/{id}: Retorna produtos do cliente pelo ID do cliente.

      PUT /cliente/{id}: Atualiza um cliente.


### 📚 Estrutura do Projeto

src/main/java
├── com.example.ecommerce

│   ├── controllers # Controladores REST (endpoints da API)

│   ├── models          # Entidades (Classes JPA)

│   ├── repositories    # Repositórios (interface para banco de dados)

│   ├── services        # Lógica de negócios

│   └── dto             # Objetos de Transferência de Dados (DTOs)
