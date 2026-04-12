# Las Motos son Mi passion
## Integrantes
Victoria Molina Martínez 
Daniela Suárez Quirós
## Diseño de Software

## Micronaut 4.10.11 Documentation

- [User Guide](https://docs.micronaut.io/4.10.11/guide/index.html)
- [API Reference](https://docs.micronaut.io/4.10.11/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/4.10.11/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

- [Micronaut Gradle Plugin documentation](https://micronaut-projects.github.io/micronaut-gradle-plugin/latest/)
- [GraalVM Gradle Plugin documentation](https://graalvm.github.io/native-build-tools/latest/gradle-plugin.html)
- [Shadow Gradle Plugin](https://gradleup.com/shadow/)
## Feature http-server-jdk documentation


- [Micronaut Built-In Java HTTP Server Runtime documentation](https://micronaut-projects.github.io/micronaut-servlet/latest/guide/#httpServer)


- [https://docs.oracle.com/javase/8/docs/jre/api/net/httpserver/spec/com/sun/net/httpserver/HttpServer.html](https://docs.oracle.com/javase/8/docs/jre/api/net/httpserver/spec/com/sun/net/httpserver/HttpServer.html)


## Feature micronaut-aot documentation


- [Micronaut AOT documentation](https://micronaut-projects.github.io/micronaut-aot/latest/guide/)


## Feature jdbc-hikari documentation


- [Micronaut Hikari JDBC Connection Pool documentation](https://micronaut-projects.github.io/micronaut-sql/latest/guide/index.html#jdbc)


## Feature serialization-jackson documentation


- [Micronaut Serialization Jackson Core documentation](https://micronaut-projects.github.io/micronaut-serialization/latest/guide/)

HOW TO RUN TOUR SERVICE LOCALLY
=================================

REQUIREMENTS
------------
- Java 21 installed
- Verify with: java -version

RUNNING THE SERVICE
-------------------
From the tour_service/ folder in your terminal:

   gradlew.bat run

The server starts at: http://localhost:8080/tours

When you see "Server Running: http://localhost:8080/tours" it is ready.

STOPPING THE SERVICE
--------------------
Ctrl + C in the terminal where the service is running.

TESTING WITH POWERSHELL
------------------------
Create a tour:
   Invoke-RestMethod -Method Post -Uri http://localhost:8080/tours -ContentType "application/json" -Body '{"nombre":"Tour en Lancha","ubicacion":"Lago Arenal","precio":45.00}'

List all tours:
   Invoke-RestMethod http://localhost:8080/tours

TESTING WITH GIT BASH
----------------------
Create a tour:
   curl -X POST http://localhost:8080/tours -H "Content-Type: application/json" -d '{"nombre":"Tour en Lancha","ubicacion":"Rio Reventazon","precio":45.00}'

List all tours:
   curl http://localhost:8080/tours

NOTES
-----
- Keep the terminal open while the service is running.
- Data is lost on restart (H2 in-memory database).
