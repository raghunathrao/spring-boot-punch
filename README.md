## Spring Security OAuth - New Stack

### Relevant information:

1. `spring-boot-punch-oauth-server` is a Keycloak Authorization Server wrapped as a Spring Boot application
2. There is one OAuth Client registered in the Authorization Server:
   1. Client Id: punch-client
   3. Redirect Uri: http://localhost:8888/
3. `spring-boot-punch-resource-server` is a Spring Boot based RESTFul API, acting as a backend Application, integrated with Keycloak oAuth2, Prometheus,  Micrometer, spring cache, swagger api doc

4. There are two users registered in the Authorization Server:
   1. user1 / 123
   2. user2 / pass
5. The module uses the new OAuth stack with Java 11.

## Relevant Articles:

- [Spring REST API + OAuth2](https://www.baeldung.com/rest-api-spring-oauth2-angular)
- [Keycloak Embedded in a Spring Boot Application](https://www.baeldung.com/keycloak-embedded-in-spring-boot-app)
- [A simple way of using Micrometer, Prometheus and Grafana (Spring Boot 2)](https://www.north-47.com/knowledge-base/a-simple-way-of-using-micrometer-prometheus-and-grafana-spring-boot-2/)
