FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=*.jar
COPY ./target/${JAR_FILE} demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]