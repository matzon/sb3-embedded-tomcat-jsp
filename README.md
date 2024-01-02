# Minimal example using Spring Boot 3 + JSP

This is just a small example for using Spring Boot 3 and JSP with Embedded Tomcat.

While it is generally trivial to use SB and static resources, some quirks need to be handled when using JSP:

## Dependencies
In order for Embedded Tomcat to process JSPs, we need to ensure that the Jasper compiler is present

    <dependency>
        <groupId>org.apache.tomcat.embed</groupId>
        <artifactId>tomcat-embed-jasper</artifactId>
        <scope>provided</scope>
    </dependency>

Furthermore, we must also include JSTL (API), in order to trigger Springs automatic configuration of JSTL Views (InternalResourceViewResolver)

    <dependency>
        <groupId>org.glassfish.web</groupId>
        <artifactId>jakarta.servlet.jsp.jstl</artifactId>
    </dependency>

And the actual implementation

    <dependency>
        <groupId>org.glassfish.web</groupId>
        <artifactId>jakarta.servlet.jsp.jstl</artifactId>
    </dependency>

*Note, both of these must match the Spring Boot version of the Embedded Tomcat servlet spec*

## Running
This project can be run using 
> mvn spring-boot:run

from within the service module.

When running from within your IDE, some manual configuration may be required. 
Specifically for IntelliJ IDEA, you will need to configure the working directory and configure it to 
```
$MODULE_WORKING_DIR$
```

as well as enable this option
> Add dependencies with "provided" scope to classpath