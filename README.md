# MySerenity

This project contains Java interview-practice code for:
- Java core concepts
- Selenium UI automation
- RestAssured API automation
- Maven-based CI/CD setup

## Project structure

```text
src/
├── main/
│   └── java/
│       ├── com/practice/app/App.java
│       └── com/practice/utils/ConfigReader.java
├── test/
│   └── java/
│       ├── com/practice/api/
│       │   ├── TodoApiTest.java
│       │   ├── CrudApiPractice.java
│       │   └── ...
│       └── com/practice/web/
│           ├── LoginPageTest.java
│           └── pages/
│               └── LoginPage.java
└── test/resources/
    └── config.properties
```

## Prerequisites

- Java 17+
- Maven 3.9+
- Docker (optional)
- Jenkins (optional)

## Run tests locally

```bash
./mvnw test
```

## Run only Selenium test

```bash
./mvnw test -Dtest=com.practice.web.LoginPageTest
```

## Run only API tests

```bash
./mvnw test -Dtest=com.practice.api.*
```

## Build the JAR

```bash
./mvnw package
```

## Run with Docker

```bash
docker-compose up --build
```

## Jenkins setup

1. Install the following Jenkins plugins:
   - GitHub plugin
   - Pipeline plugin
   - JUnit plugin
2. Create a new Pipeline job.
3. Point it to this repository.
4. Use the existing `Jenkinsfile` in the repo root.
5. Configure a GitHub webhook for push events.

### GitHub webhook example

- Go to GitHub repo -> Settings -> Webhooks -> Add webhook
- Payload URL: `http://<your-jenkins-host>/github-webhook/`
- Content type: `application/json`
- Trigger: `Just the push event`

## GitHub Actions

This repo includes `.github/workflows/ci.yml`.
It runs automatically on pushes and pull requests to `main` and `master`.

## Notes

- Selenium tests use WebDriverManager to manage ChromeDriver automatically.
- API tests use JSONPlaceholder for interview-practice calls.
- The Selenium login example is a demonstration flow and can be adapted to a real app.
