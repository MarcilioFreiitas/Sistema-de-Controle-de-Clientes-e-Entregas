# Sistema de Controle de Clientes e Entregas 🚚🌟

Este projeto é um sistema para controle de clientes e entregas, permitindo o cadastro de clientes com informações geográficas e visualização no mapa. Vamos mergulhar nos detalhes:

## Requisitos Funcionais 📋

- **Cadastro de Clientes:**
  - Código
  - Nome
  - CNPJ
  - Endereço com localização geográfica

- **Visualização no Mapa:**
  - Os clientes devem ser exibidos em um mapa interativo.
  - Opções de filtro para facilitar a busca.

## Tecnologias Utilizadas 🛠️

- **Java 17+** e **Spring Boot 3+** para o back-end.
- **Angular 17+** para a interface do usuário.
- **Ferramenta de Persistência de Dados:** H2
- **Docker:** Para criar um ambiente de desenvolvimento consistente.

## Como Executar o Projeto ▶️ 


 **Baixando as imagens**:
    - Certifique-se de ter o Docker instalado na sua máquina.
    - No diretório do seu projeto, crie um arquivo chamado `docker-compose.yml`.
    - Dentro desse arquivo, defina os serviços da sua aplicação. Por exemplo:
        ```yaml
        version: '3.8'
        services:
          frontend:
            image: marcilio777/maximatech:frontend
            ports:
              - "4200:80"
          backend:
            image: marcilio777/maximatech:backend
            ports:
              - "8080:8080"
        ```
    - Execute o comando no mesmo diretório onde está o `docker-compose.yml`:
        ```bash
        docker-compose up
        ```
    - Isso baixará as imagens necessárias e iniciará os serviços. 🚀

    - Caso tenha feito alterações na configuração ou imagem dos serviços, o Docker Compose detectará e reiniciará os containers automaticamente. Para evitar isso, use a flag `--no-recreate`.
    - Se quiser forçar a recriação de todos os containers, use a flag `--force-recreate`.

 **Acessando sua aplicação** 🚀
    - Acesse a aplicação no navegador ou por meio de chamadas HTTP para o serviço definido no `docker-compose.yml`.
    - http://localhost:4200/
 
  **Documentação de API ** 🚀
  - Acesse a documentação da API no endereço: http://localhost:8080/swagger-ui/index.html
    
   **Acesso ao banco de dados ** 🚀
    - Acesse o banco de dados da aplicação no endereço: http://localhost:8080/h2-console
   







