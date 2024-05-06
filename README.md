# Spring with Redis cache

A simple API using Spring Boot and Redis cache.

### Used technologies

* [Java](https://www.java.com/)
* [Docker](https://www.docker.com/)
* [PostgreSQL](https://www.postgresql.org/)
* [Redis](https://redis.io/)
* [Spring Boot](https://spring.io/projects/spring-boot)

## Dependencies and versions

* Docker - Version: 26.1.1 or higher
* Java(JDK) - Version: 17 or higher
* PostgreSQL - Version: 14.0 or higher
* Redis - Version: 6.0.0 or higher

### Getting Started

There are some ways to run this project.

#### Using Docker

```shell
docker compose up -d
```

After that you can check on [localhost:8080/ibge?state=PE](http://localhost:8080/ibge?state=PE) to see the result.

#### Using Maven

```shell
./mvnw spring-boot:run
```

## Routes

```http request
GET /ibge?state={state}
```

```http request
POST /cache?cacheName=companies
```

To cache companies table.

```http request
PUT /cache
```

To update application cache.

```http request
GET /company
```
