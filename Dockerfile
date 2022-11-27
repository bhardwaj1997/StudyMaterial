FROM maven:3.8.4-openjdk-8 as build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src src
RUN mvn package -Dmaven.test.skip
 
FROM tomcat:8.5.73-jre8-openjdk-slim
COPY --from=build /app/target/multistage-war-0.0.1-SNAPSHOT.war ${CATALINA_HOME}/webapps/multistage-war-0.0.1-SNAPSHOT.war
EXPOSE 8080
ENTRYPOINT ["catalina.sh", "run"]
