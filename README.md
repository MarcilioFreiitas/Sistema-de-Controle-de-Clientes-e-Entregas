# Sistema de Controle de Clientes e Entregas 🚚

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


## API's usadas 🗺️:

- Google Maps API 🗺️: A Google Maps API é uma ferramenta poderosa para exibir mapas interativos em aplicativos. Ela permite que você mostre os clientes cadastrados em um mapa, facilitando a visualização e a navegação. A integração com a Google Maps API é essencial para fornecer uma experiência visual rica para os usuários.

- API de Geocodificação do Google 🌐: Essa API é responsável por converter endereços em coordenadas geográficas (latitude e longitude). Quando um cliente é cadastrado com um endereço, você pode usar essa API para obter as coordenadas correspondentes. Isso é especialmente útil para preencher automaticamente o formulário com as informações corretas e garantir que os clientes estejam posicionados corretamente no mapa.

API de clientes 🚀: O sistema possui uma API de clientes para salvar sua informações e guardar no banco de dados da aplicação.

## Tecnologias Utilizadas 🛠️

- **Java 17+** e **Spring Boot 3+** para o back-end.
- **Angular 17+** para a interface do usuário.
- **Ferramenta de Persistência de Dados:** H2
- **Docker:** Para criar um ambiente de desenvolvimento consistente.

## Como Executar o Projeto ▶️ 


 **Baixando as imagens**:
 - Certifique-se de ter o Docker instalado na sua máquina.
 - No diretório do seu projeto, existe um arquivo chamado `docker-compose.yml`.
 - Dentro desse arquivo estão as configurações da do Docker-compose. 
       ``` yaml
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
    
    
 - Execute o comando  ``` docker-compose up ``` no mesmo diretório onde está o `docker-compose.yml`, isso baixará as imagens necessárias e iniciará os serviços. 🚀

    - Caso tenha feito alterações na configuração ou imagem dos serviços, o Docker Compose detectará e reiniciará os containers automaticamente. Para evitar isso, use a flag `--no-recreate`.
    - Se quiser forçar a recriação de todos os containers, use a flag `--force-recreate`.

 **Acessando sua aplicação** 🚀
 - Acesse a aplicação no navegador ou por meio de chamadas HTTP para o serviço definido no `docker-compose.yml`.
 - http://localhost:4200/
 
  **Documentação de API com Swagger** 🚀
   - O Swagger é uma ferramenta que simplifica o desenvolvimento e o consumo de APIs (Interfaces de Programação de Aplicativos). Ele fornece uma documentação automática, interativa e padronizada, tornando a comunicação entre equipes de desenvolvedores e a integração de 
     serviços mais eficaz.
  - Acesse a documentação da API de cadastro de clientes no endereço: http://localhost:8080/swagger-ui/index.html
    
   **Acesso ao banco de dados** 🚀
  - Acesse o banco de dados da aplicação no endereço: http://localhost:8080/h2-console

   **Link do frontend:** https://github.com/MarcilioFreiitas/Sistema-de-Controle-de-Clientes-e-Entregas-Frontend 
   







