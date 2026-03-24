# Spring Starter v2

A clean Spring Boot starter project for learning and sharing.

## What this project includes
- A proper Spring Boot entry point
- A separate controller class
- A root endpoint for browser testing
- A `/hello` endpoint with a query parameter
- A `/ping` endpoint for quick checks
- Basic tests for context loading and endpoint behavior
- Gradle Wrapper for easier setup

## Tech stack
- Java 17
- Spring Boot
- Gradle Wrapper

## Project structure
```text
spring-starter-v2/
├── build.gradle
├── settings.gradle
├── gradlew
├── gradlew.bat
├── gradle/wrapper/
├── src/main/java/live/learnwithchampak/demo/
│   ├── DemoApplication.java
│   └── controller/
│       └── HelloController.java
├── src/main/resources/
│   └── application.properties
└── src/test/java/live/learnwithchampak/demo/
    ├── DemoApplicationTests.java
    └── controller/
        └── HelloControllerTest.java
```

## Run the project
### Windows
```bash
gradlew.bat bootRun
```

### macOS / Linux
```bash
./gradlew bootRun
```

The application starts on:
```text
http://localhost:8080
```

## Try the endpoints
Open these in your browser:

```text
http://localhost:8080/
http://localhost:8080/ping
http://localhost:8080/hello
http://localhost:8080/hello?name=Champak
```

## Example responses
### GET /
```text
Spring Starter v2 is running.
```

### GET /ping
```text
pong
```

### GET /hello
```text
Hello World!
```

### GET /hello?name=Champak
```text
Hello Champak!
```

## Run tests
### Windows
```bash
gradlew.bat test
```

### macOS / Linux
```bash
./gradlew test
```

## Notes
- Use the Gradle Wrapper instead of a system Gradle install when possible.
- The first run may download dependencies from Maven Central.
- Java 17 should be installed and available on your system.

## Suggested next steps
- Add a service layer
- Return JSON instead of plain text
- Add POST endpoints
- Connect a database later

## License
This project includes the existing license file from the original demo.
