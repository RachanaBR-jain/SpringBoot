SpringBoot Actuator:
*Actuator is used to monitor and manage application in production
*Provide number of endpoints
-beans: complete list of Spring beans in our application
-health: Application health information
-metrics: Application metrics
-mappings: Details about request Mappings

By default actuator will give health status of the application (status:up/down)
Setp:
1)Add spring-boot-starter-actuator dependeny in pom.xml
2)Run
http://localhost:8080/actuator
o/p
{
"_links": {
"self": {
"href": "http://localhost:8080/actuator",
"templated": false
},
"health": {
"href": "http://localhost:8080/actuator/health",
"templated": false
},
"health-path": {
"href": "http://localhost:8080/actuator/health/{*path}",
"templated": true
}
}
}
3)to get extra information
go to application.properties and add
--> management.endpoints.web.exposure.include=*
or only required
management.endpoints.web.exposure.include= health, metrics


0/p
{
"_links": {
"self": {
"href": "http://localhost:8080/actuator",
"templated": false
},
"beans": {
"href": "http://localhost:8080/actuator/beans",
"templated": false
},
"caches-cache": {
"href": "http://localhost:8080/actuator/caches/{cache}",
"templated": true
},
"caches": {
"href": "http://localhost:8080/actuator/caches",
"templated": false
},
"health": {
"href": "http://localhost:8080/actuator/health",
"templated": false
},
"health-path": {
"href": "http://localhost:8080/actuator/health/{*path}",
"templated": true
},
"info": {
"href": "http://localhost:8080/actuator/info",
"templated": false
},
"conditions": {
"href": "http://localhost:8080/actuator/conditions",
"templated": false
},
"configprops": {
"href": "http://localhost:8080/actuator/configprops",
"templated": false
},
"configprops-prefix": {
"href": "http://localhost:8080/actuator/configprops/{prefix}",
"templated": true
},
"env-toMatch": {
"href": "http://localhost:8080/actuator/env/{toMatch}",
"templated": true
},
"env": {
"href": "http://localhost:8080/actuator/env",
"templated": false
},
"loggers": {
"href": "http://localhost:8080/actuator/loggers",
"templated": false
},
"loggers-name": {
"href": "http://localhost:8080/actuator/loggers/{name}",
"templated": true
},
"heapdump": {
"href": "http://localhost:8080/actuator/heapdump",
"templated": false
},
"threaddump": {
"href": "http://localhost:8080/actuator/threaddump",
"templated": false
},
"metrics-requiredMetricName": {
"href": "http://localhost:8080/actuator/metrics/{requiredMetricName}",
"templated": true
},
"metrics": {
"href": "http://localhost:8080/actuator/metrics",
"templated": false
},
"scheduledtasks": {
"href": "http://localhost:8080/actuator/scheduledtasks",
"templated": false
},
"mappings": {
"href": "http://localhost:8080/actuator/mappings",
"templated": false
}
}
}
