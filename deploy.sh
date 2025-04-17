#! /bin/bash

mvn clean package

docker compose down
docker compose up --build -d
docker ps -a
docker compose logs -f --tail 500
