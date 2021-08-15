# Spring Data JPA with H2 database

    Reference link: 
        https://www.baeldung.com/spring-boot-h2-database
        https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#features.sql

## Add Dependencies

``` 
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
```

## Database Configuration

By default, Spring Boot configures the application to connect to an in-memory store with the username sa and an empty password.

## Accessing the H2 Console

Enable H2 console by:
```spring.h2.console.enabled=true```

Go to console after running application by:

```http://localhost:8080/h2-console```

##  Conclusion
