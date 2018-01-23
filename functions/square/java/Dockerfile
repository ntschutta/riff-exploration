FROM projectriff/java-function-invoker:0.0.2
ARG FUNCTION_JAR=/target/square-java-0.0.1-SNAPSHOT.jar
ARG FUNCTION_CLASS=com.example.riffsquared.RiffSquared
ADD target/square-java-0.0.1-SNAPSHOT.jar $FUNCTION_JAR
ENV FUNCTION_URI file://${FUNCTION_JAR}?handler=${FUNCTION_CLASS}