# window and execute the following command:
$ mvn clean package dockerfile:build

# Now we are going to use docker-compose to start the actual image.  To start the docker image, stay in the directory containing  your chapter 5 source code and  Run the following command: 
$ docker-compose -f docker/docker-compose.yml up
