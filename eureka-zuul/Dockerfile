FROM openjdk:8
EXPOSE 8762
ADD /build/libs/eureka-zuul-0.0.1.jar  proxy-eureka-zuul-server.jar
ENTRYPOINT ["java" , "-jar" , "proxy-eureka-zuul-server.jar"]