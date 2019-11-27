FROM openjdk:8
EXPOSE 9100
ADD /build/libs/auth-0.0.1.jar  auth-server.jar
ENTRYPOINT ["java" , "-jar" , "auth-server.jar"]