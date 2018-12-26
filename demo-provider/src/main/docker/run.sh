#!/bin/sh
echo "********************************************************"
echo "Starting the Demo Provider"
echo "********************************************************"
java -Djava.security.egd=file:/dev/./urandom  -Dserver.port=$SERVER_PORT \
     -Deureka.client.serviceUrl.defaultZone=$EUREKASERVER_URI   \
     -jar /usr/local/demoprovider/@project.build.finalName@.jar
