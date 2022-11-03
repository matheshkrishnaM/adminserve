FROM openjdk:8
EXPOSE 8080
ADD target/member-0.0.1-SNAPSHOT.jar member.jar
ENTRYPOINT ["java","-jar","/member.jar"]