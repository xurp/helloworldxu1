FROM openjdk:8-jdk-alpine
COPY target/helloworldxu1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
# VOLUME /tmp
# ADD target/helloworldxu1.jar app.jar
# ENV JAVA_OPTS=""
# ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar


