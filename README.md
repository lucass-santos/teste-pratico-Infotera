# Teste Prático Infotera
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/lucass-santos/teste-pratico-Infotera/blob/main/LICENSE) 



# Sobre o projeto

Teste prático para a vaga de desenvolvedor júnior Java da empresa Infotera.

O webservice tem a finalidade de consumir uma api externa e devolver um resultado previsto de informações obtidas através da API acessada.   
[Link das instruções](https://complete-owl-84d.notion.site/Teste-Back-end-ae387315f23646e391993444b27dbca2)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- Spring WebFlux / WebClient

# Como executar o projeto

Pré-requisito: Java 17

Após clonar o projeto e iniciar o sistema será necessário informar no corpo das requisições o JSON para autenticação. A autenticação está ocorrendo em cada requisição realizada.

### Lista de hoteis:
http://localhost:8080/search/{destination}/{start}/{end}/{occupancy}

### Detalhe do hotel:
http://localhost:8080/hotel/{keyDetail}

JSON que deve ser passado no corpo das requisições:
```
{
    "username": "sandboxws",
    "password": "!sdb2022#",
    "client": "SANDBOX",
    "agency": "2"
}
```
