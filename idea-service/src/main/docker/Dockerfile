FROM adoptopenjdk/openjdk11:alpine-slim
RUN mkdir /opt/app

copy -0.0.3.jar /opt/app/app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /opt/app/app.jar" ]


