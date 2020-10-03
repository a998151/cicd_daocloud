FROM maven:3 AS bd
WORKIR /code
COPY ./ /code
RUN mvn package -Dmaven.test.skip=true

FROM java:8
COPY --from=db /code/target/*.jar /app.jar
CMD java -jar /app.jar