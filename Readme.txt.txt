Get Production Ready application with SpringBoot- profiles/envirnment
Different profiles or envirnment are:
1)DEV -trace
2)QA
3)INT/Pre-prod/Stage
4)PROD - info
Different envirnment needs different configurations like different logging levels, different DB, different Webservices
       
Setps to add profiles/envirnment specific configurations
1)add: application-dev, application-prod files in java/main/resource
2)->in application-dev.properties
logging.level.org.springframework = trace

3)->in application-prod.properties
logging.level.org.springframework = info

4)->in application.properties
logging.level.org.springframework = debug
#spring.profiles.active = prod
spring.profiles.active = dev

now the log will show only "info" details for prod , "trace" details for dev envirnment


Different logging levels-
logging level as trace will give all the below loggings(debug,info,warning,error)
some for othe loggings
1)trace
2)debug
3)info
4)warning
5)error

6)off



