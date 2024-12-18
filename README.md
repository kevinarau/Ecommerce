
# E-COMMERCE API

Este projeto é uma API para um sistema de e-commerce desenvolvido com Java, Spring Framework, Spring Data JPA e MySQL. A aplicação permite gerenciar products, categorias, Cliente. E é um projeto em evolução.

## 📋 Funcionalidades 

     -> Gestão de Produtos: Criar, listar, atualizar e excluir products.
     -> Gestão de Categorias: Organizar products por categorias.
     -> Integração com MySQL: Persistência e gerenciamento de dados.

## 🛠️ Tecnologias Utilizadas 

         -> Linguagem: Java 17+
         -> Framework: Spring Boot 3.2+
         -> Spring Web (para APIs RESTful)
         -> Spring Data JPA (para interação com o banco de dados)
         -> Banco de Dados: MySQL
         -> Ferramentas adicionais: Maven (gerenciamento de dependências)
         -> Postman (testes de API)
         -> Objetos de Transferência de Dados (DTOs)

  ## 📖 Endpoints Principais 

<h3>Produtos</h3>

      GET /products: Lista todos os products.
      POST /products: Cria um novo produto.
      GET /products/{id}: Retorna um produto pelo ID.
      PUT /products/{id}: Atualiza um produto.
      DELETE /products/{id}: Exclui um produto.

<h3>Lista de Produtos</h3>

          GET /Lista de Produtos: todas as Listas de produtos.
          POST /Nova Lista: Cria uma nova Lista de produtos.


## 📚 Estrutura do Projeto

     src/main/java
            ├── com.example.ecommerce

            ├── controllers # Controladores REST (endpoints da API)

            ├── models          # Entidades (Classes JPA)

            ├── repositories    # Repositórios (interface para banco de dados)

            ├── services        # Lógica de negócios

            └── dto             # Objetos de Transferência de Dados (DTOs)

