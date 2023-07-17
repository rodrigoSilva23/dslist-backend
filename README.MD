# dslist - backend!

Projeto DSList - Intensivão Java Spring, projeto criado para melhorar e consolidar meu aprendizado com java, agradeço ao https://devsuperior.com.br pelo conteúdo gratuito.

projeto referencia: [ DSList - devsuperior](https://github.com/devsuperior/dslist-backend.git) 

## Funcionalidades

- Busca de game
- Busca de game pelo ID
- Busca do tipo de game
- Busca do tipo de game pelo ID
- Busca game pelo tipo

## Tecnologias Utilizadas

- docker
- docker-compose
- java - Spring Boot

## Pré-requisitos

Antes de iniciar a instalação do projeto, certifique-se de ter os seguintes requisitos instalados em sua máquina:

- Docker: [Como instalar o Docker](https://www.docker.com/get-started/)
- Docker Compose

Verifique se todas as dependências necessárias estão instaladas antes de prosseguir com os seguintes passos.

## Passo 1: Clonar o repositório

```bash
  git clone https://github.com/rodrigoSilva23/dslist-backend.git
```

## Passo 2: Instalação

```bash
    docker-compose up
```

## rotas

  ### lista todos os games
- http://localhost:8080/games

  ### lista um unico games baseado no ID
- http://localhost:8080/games/1

  ### lista os tipo de game
- http://localhost:8080//lists

  ### lista os games baseado no seu tipo
- http://localhost:8080/lists/2/games


## Link para acessar o banco postgres

- http://localhost:5050/

## Author

- [@rodrigosilvaDev23](https://github.com/rodrigoSilva23)

## Licença

Este projeto está licenciado sob a Licença MIT. Consulte o arquivo [LICENSE](https://opensource.org/licenses/MIT) para obter mais informações.
