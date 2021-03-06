# Selenium for podium
Selenium project using docker and maven

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. The instructions are for mac only.

### Prerequisites

Docker

```
https://hub.docker.com/editions/community/docker-ce-desktop-mac
```

Homebrew

```
https://docs.brew.sh/Installation
```

Java 8

```
brew cask install adoptopenjdk8
```

Local browser drivers

```
brew cask install chromedriver
brew install geckodriver
```

Clone the project locally

```
https://github.com/monsonms/com.podium.git
```


### Running the tests

To run tests locally

```
mvn -P chrome,localhost,nogrid clean test
mvn -P firefox,localhost,nogrid clean test
```

To run tests in docker

```
docker-compose up -d 
docker exec -it selenium_tests mvn -P chrome,localhost,grid clean test
docker exec -it selenium_tests mvn -P firefox,localhost,grid clean test
docker-compose down
```


