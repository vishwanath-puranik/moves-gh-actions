FROM neowu/jre:17.0.4
EXPOSE 8083
RUN mkdir /app
COPY /home/runner/work/moves-gh-actions/moves-gh-actions/build/libs/service-login-0.0.1-SNAPSHOT.jar /app/service-login.jar
# COPY build/libs/*.jar app.jar
# ARG JAR_FILE="build/libs/service-login-0.0.1-SNAPSHOT.jar"
# COPY ${JAR_FILE} /app/app.jar
 ENTRYPOINT [ "java","-jar","/app/service-login.jar" ]
