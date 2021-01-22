FROM openjdk:8-jre
VOLUME /tmp
ADD target/*.jar hello-world.jar
EXPOSE 80
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/myapp.jar"]
