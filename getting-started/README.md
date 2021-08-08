# Spring Boot Getting Started

## Import spring boot dependencies to parent pom.xml
```
<dependencyManagement>
    <dependencies>
    <!-- Using Spring Boot without the Parent POM -->
        <dependency>
            <!-- Import dependency management from Spring Boot -->
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-dependencies</artifactId>
            <version>${spring.boot.version}</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```

##  Add spring-boot-started-web
```
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>
```

##  Write the code
```
@RequestMapping("/api")
@RestController
@SpringBootApplication
public class GettingStartedApplication {

    public static void main(String[] args) {
        SpringApplication.run(GettingStartedApplication.class, args);
    }

    @GetMapping("/hello-world")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello World!");
    }

}
```

## Running Application

Goto browser and paste url: http://localhost:8080/api/hello-world to check result.

## Creating an Executable Jar

Add spring boot build plugin
```
<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
            <executions>
                <execution>
                    <goals>
                        <goal>repackage</goal> # to executable without spring-boot-started-parent
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```
Run mvn package to build jar file.
