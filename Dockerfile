FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/helloworldxu1.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar

