Demo of the Spring Cloud stack
==
Instruction on how to launch the demo and cloud stack tools.


## Spring Cloud Config:
There are 3 Maven modules:
* `config-server` - a Spring Cloud Config server that maintains and publishes application configuration
* `configuration` - a module to store configuration data in YAML files (multiple profiles) 
* `composer-service` - a demo service that connects with the Spring Cloud Config which retrieves a list of music composers based on two profiles (Russian, German) and a default profile.

#### How to launch:
```
./run-spring-cloud-config-demo.sh
```
#### How to test:
```aidl
curl localhost:7001/composer-service/german    
curl localhost:7001/composer-service/russian 
```
```
#Comments:
#config server runs on 7001         
#the config profile is `german` or `russian`
#the name of the app is `composer-service`
```
```
curl localhost:[SOME_RANDOM_POST]/composer
```
```
#Comments:
#the proper service `composer-service` which obtains config from Spring Cloud Config
#runs on a random port that is written in the starting log
#substitute [SOME_RANDOM_PORT] with that number
```
## Spring Cloud Netflix Eureka & Spring Cloud Feign:

#### How to launch:


```
./run-spring-cloud-eureka-demo.sh
```

#### How to test:
Open `http://localhost:7002/` in the browser. (This is the Eureka dashboard.)
Observe that `EUREKA-CLIENT-1` and `EUREKA-CLIENT-2` are registered in Eureka.
```
curl localhost:7002
```

