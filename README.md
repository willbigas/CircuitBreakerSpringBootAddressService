# Circuit Breaker Spring Boot Address Service

Este repositório contém o **Address Service**, um serviço de endereços utilizado pelo [Order Service](https://github.com/willbigas/CircuitBreakerSpringBootOrderService) em uma implementação de **Circuit Breaker**. Este serviço fornece informações de endereço que são consumidas pelo serviço de pedidos.

## Visão Geral

O **Circuit Breaker Spring Boot Address Service** é um serviço REST simples, desenvolvido em **Spring Boot**, que expõe endpoints para fornecer informações de endereço. Ele é projetado para ser chamado pelo **Order Service**, que usa o padrão **Circuit Breaker** para gerenciar falhas e aumentar a resiliência na comunicação.

## Tecnologias Utilizadas

Este projeto utiliza as seguintes tecnologias:

- **Spring Boot**: Framework para criação de serviços REST.
- **Spring Data JPA**: Simplifica o acesso a dados usando JPA.
- **H2 Database**: Banco de dados em memória para desenvolvimento e testes rápidos.
- **Lombok**: Redução de boilerplate através de anotações.

## Dependências

```groovy
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    compileOnly 'org.projectlombok:lombok'
    developmentOnly 'org.springframework.boot:spring-boot-devtools'
    runtimeOnly 'com.h2database:h2'
    annotationProcessor 'org.projectlombok:lombok'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
    testRuntimeOnly 'org.junit.platform:junit-platform-launcher'
}
