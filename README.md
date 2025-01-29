# Desafio POO - DIO

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

## 📌 Sobre o Projeto
Este repositório contém a implementação do **Desafio de Programação Orientada a Objetos (POO)** proposto pela **DIO (Digital Innovation One)**. O objetivo é aplicar os princípios da programação orientada a objetos em Java, utilizando boas práticas de design.

## 🚀 Tecnologias Utilizadas
- **Java**
- **Spring Boot**
- **Maven**
- **Lombok**
- **JUnit**

## 🏗️ Arquitetura do Projeto
O projeto segue a estrutura baseada em camadas:
```
📂 src
 ├── 📂 main
 │   ├── 📂 java
 │   │   └── com.jciterceros.desafio
 │   │       ├── 📂 domain  # Entidades do domínio
 │   │       ├── 📂 service # Regras de negócio
 │   │       ├── 📂 repository # Persistência de dados
 │   │       ├── 📂 controller # Endpoints da API
 │   │       └── Application.java # Classe principal
 │   └── 📂 resources
 │       ├── application.properties # Configurações do projeto
 ├── 📂 test  # Testes unitários e de integração
```

## 🎯 Desafios Implementados
- [x] Criar classes que representam entidades do domínio
- [x] Aplicar os conceitos de **Herança, Encapsulamento e Polimorfismo**
- [x] Implementar interfaces para regras de negócio
- [x] Utilizar **Streams API** para manipulação de coleções
- [x] Criar testes unitários com **JUnit**

## 🛠️ Como Executar o Projeto
### Pré-requisitos:
- Java 17+
- Maven 3+

### Clonar o repositório:
```sh
git clone https://github.com/jciterceros/desafio-poo-dio.git
cd desafio-poo-dio
```

### Compilar e executar:
```sh
mvn clean install
mvn spring-boot:run
```

### Executar testes:
```sh
mvn test
```

## 📜 Licença
Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 👨‍💻 Autor
Desenvolvido por **Fernando Flores Terceros**
- 🔗 [LinkedIn](https://www.linkedin.com/in/fernando-flores-terceros-83486625)
- 🔗 [GitHub](https://github.com/jciterceros)

---
💡 *Sinta-se à vontade para contribuir, abrir issues e propor melhorias!* 🚀
