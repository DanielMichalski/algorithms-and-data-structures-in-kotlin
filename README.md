Algorithms and data structures in Kotlin
----------------------------------------
[![Kotlin CI with Maven](https://github.com/DanielMichalski/algorithms-and-data-structures-in-kotlin/workflows/Kotlin%20CI%20with%20Maven/badge.svg)](https://github.com/DanielMichalski/algorithms-and-data-structures-in-kotlin/actions?query=workflow%3A%22Kotlin+CI+with+Maven%22)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://github.com/DanielMichalski/algorithms-and-data-structures-in-kotlin/blob/master/LICENSE)

This project is written in Kotlin and Groovy and aims to present solutions with time and memory complexity for some famous algorithms.

## Documentation
The documentation is divided into several sections:
* [Building the application](#building-the-application)
* [Running tests](#running-tests)

## Building the application
#### On Windows
```bash
## Build application from base directory using Maven Wrapper
mvnw.cmd clean install
```

#### On MacOS/ Linux
```bash
## Build application from base directory using Maven Wrapper
./mvnw clean install
```

## Running tests
#### On Windows
```bash
## Run Spock tests using Maven Wrapper
mvnw.cmd surefire:test
```

#### On MacOS/ Linux
```bash
## Run Spock tests using Maven Wrapper
./mvnw surefire:test
```
