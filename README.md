# Demo of Quarkus, Kafka and Avro

## Prerequisites

```bash
docker-compose up -d
```

_NOTE:_ stop the infrastructure with: `docker-compose down; docker-compose rm`

## Build and Run

```bash
mvn compile quarkus:dev
```

To build the native executable:

```bash
mvn package -Pnative
```

## Demo

```bash
curl --header "Content-Type: application/json" \
  --request POST \
  --data '{"title":"The Shawshank Redemption","year":1994}' \
  http://localhost:8080/movies

curl --header "Content-Type: application/json" \
  --request POST \
  --data '{"title":"The Godfather","year":1972}' \
  http://localhost:8080/movies

curl --header "Content-Type: application/json" \
  --request POST \
  --data '{"title":"The Dark Knight","year":2008}' \
  http://localhost:8080/movies  

curl --header "Content-Type: application/json" \
  --request POST \
  --data '{"title":"12 Angry Men","year":1957}' \
  http://localhost:8080/movies    
```
