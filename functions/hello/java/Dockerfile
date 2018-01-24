FROM projectriff/java-function-invoker:0.0.2
ARG FUNCTION_JAR=/target/hello-java-0.0.1-SNAPSHOT.jar
ARG FUNCTION_CLASS=com.example.riffhello.RiffHello
ADD target/hello-java-0.0.1-SNAPSHOT.jar $FUNCTION_JAR
ENV FUNCTION_URI file://${FUNCTION_JAR}?handler=${FUNCTION_CLASS}