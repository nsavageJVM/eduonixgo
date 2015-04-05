## Eduonix Increase Productivity with Golang Programming 

## Package Structure

-- Dockerfile

     / main

        -- executable Go applications

     / restserver

        -- adapted from sleepy please see below

     / go-rest-client

        -- Java rest Client JBoss JAX-RS 2.0 Client 
     

## Build Instructions

-- Everything for the backend builds in the Dockerfile from the bash shell


####  1. Build the Docker Image with  docker build -t="eduonix/golangtools:1.0.0" .
####  2. Run the Container with docker run -t -i eduonix/golangtools:1.0.0 

-- step 2 above lands you in the main executable directories in a bash shell, then you build the Go code

--

-- the client builds with maven

#### mvn clean package


## Run Instructions

-- BackEnd

#### Run the Container with the correct pupblished port  docker run -t  -i  -p 8000:8000 eduonix/golangtools:1.0.0

-- client

#### Run the client with mvn exec:java tin the same directory as the go-rest-client pom.xml



## Go rest server from https://github.com/dougblack/sleepy

-- sleepy is released under the MIT license please comply with this license if you bootstrap an application with this code
-- http://opensource.org/licenses/MIT




