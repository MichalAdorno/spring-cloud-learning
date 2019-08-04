#!/bin/bash
mvn -pl config-server spring-boot:run &
sleep 5 &
mvn -pl eureka-discovery spring-boot:run &
sleep 5 &
mvn -pl eureka-client-service-1 spring-boot:run -Dspring-boot.run.profiles=german &
mvn -pl eureka-client-service-2 spring-boot:run -Dspring-boot.run.profiles=russian
