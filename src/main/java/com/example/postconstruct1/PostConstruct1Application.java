package com.example.postconstruct1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PostConstruct1Application {

    public static void main(String[] args) {
        SpringApplication.run(PostConstruct1Application.class, args);
    }

}



// Execution Results
//  .   ____          _            __ _ _
//          /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
//          ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
//          \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
//          '  |____| .__|_| |_|_| |_\__, | / / / /
//          =========|_|==============|___/=/_/_/_/
//          :: Spring Boot ::                (v2.7.2)
//
//          2022-07-30 00:39:46.664  INFO 4699 --- [           main] c.e.p.PostConstruct1Application          : Starting PostConstruct1Application using Java 11.0.16 on AULXCWNYHTXF with PID 4699 (/Users/Prakash.Dhavamani/IdeaProjects/springboots/PostConstruct1/target/classes started by Prakash.Dhavamani in /Users/Prakash.Dhavamani/IdeaProjects/springboots/PostConstruct1)
//          2022-07-30 00:39:46.685  INFO 4699 --- [           main] c.e.p.PostConstruct1Application          : No active profile set, falling back to 1 default profile: "default"
//        2022-07-30 00:39:47.677  INFO 4699 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
//        2022-07-30 00:39:47.683  INFO 4699 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
//        2022-07-30 00:39:47.683  INFO 4699 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.65]
//        2022-07-30 00:39:47.748  INFO 4699 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
//        2022-07-30 00:39:47.748  INFO 4699 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 920 ms
//        Constructor: customer controller
//        Constructor: customerService
//        Customer [name=Prakash1, location=Sydney]
//        get customer
//        2022-07-30 00:39:48.109  INFO 4699 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
//        2022-07-30 00:39:48.126  INFO 4699 --- [           main] c.e.p.PostConstruct1Application          : Started PostConstruct1Application in 1.861 seconds (JVM running for 2.528)
