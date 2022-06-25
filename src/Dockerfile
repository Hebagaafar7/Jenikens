FROM openjdk:11.0.6-jre
VOLUME /tmp
EXPOSE 7777
ADD target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]