## Sample Springboot application with metrics endpoint for Prometheus scraping

### To Package / create jar file
`./mvnw package`

### To run the application
`java -jar target/sampleapp.jar`

### App endpoint for prometheus to collect metrics
`localhost:8080/prometheus`

### To build the docker image
`docker build -t opsmx/sampleapp_docker .`