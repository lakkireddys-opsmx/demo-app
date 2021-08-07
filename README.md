## Sample Springboot application with metrics endpoint for Prometheus scraping

### To create executable jar file
`./gradlew bootJar`

### To run the application
`java -jar build/libs/sampleapp-0.0.1.jar`

### App endpoint for prometheus to collect metrics
`localhost:8080/prometheus`

### To build the docker image
`docker build -t opsmx/sampleapp_docker .`