#!/bin/bash
mvn -pl config-server spring-boot:run &
sleep 5 &
mvn -pl composer-service spring-boot:run -Dspring-boot.run.profiles=german &
mvn -pl composer-service spring-boot:run -Dspring-boot.run.profiles=russian
