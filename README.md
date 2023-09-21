# Redis Spring Boot Starter

This is a sample project to setup a basic save and get flow in redis with spring boot .

## How to Run

1. ``mvn clean install``
2. ``docker-compose up ``
3. `cd target`
4. `java -jar redis-springboot-starter-0.0.1-SNAPSHOT.jar`

## How to Test

### Save a Key Value Pair

`curl 'http://localhost:8080/redis/pair' \
--header 'Content-Type: application/json' \
--data '{
"key":"name",
"value":"SampleName"
}'`

### Get Value By Key

`curl 'http://localhost:8080/redis/pair_value?key=name'`