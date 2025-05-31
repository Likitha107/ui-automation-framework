```markdown
# UI Automation Project

This is a **Java Selenium TestNG** framework for automating UI tests.

## Features

- Java, Selenium WebDriver, TestNG
- Page Object Model (POM)
- ExtentReports with screenshots on failure
- Maven for build management
- Jenkins-ready for CI/CD

## Prerequisites

- Java JDK 8 or above
- Maven installed
- ChromeDriver / GeckoDriver / EdgeDriver (depending on the browser)

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/UIAutomationProject.git
   cd UIAutomationProject
   ```

2. Update configuration in `src/main/resources/config.properties`:
   ```properties
   baseUrl=https://yourapplication.com
   browser=chrome
   username=yourusername
   password=yourpassword
   ```

3. Run tests using Maven:
   ```bash
   mvn clean test
   ```

4. View reports:
   - Open the `reports/` folder to see the ExtentReports HTML file with detailed test results.

## Project Structure

```
UIAutomationProject/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── base/                # Base classes
│   │   │   ├── pages/               # Page Object Model classes
│   │   │   ├── utils/               # Utility classes (Config reader, Logger, etc.)
│   ├── test/
│   │   ├── java/
│   │   │   ├── tests/               # Test classes
│   └── resources/
│       ├── config.properties        # Configuration file
├── testng.xml                       # TestNG suite file
├── reports/                         # ExtentReports output
├── pom.xml                          # Maven dependencies
└── README.md                        # Project documentation
```

## Jenkins Integration

1. Create a new Jenkins job.
2. In the **Build** section, add:
   ```bash
   mvn clean test
   ```
3. Configure the **Git** repository URL.
4. Set up build triggers (poll SCM, webhooks, etc.) if desired.
5. View build and test results in Jenkins.

## Future Enhancements

- Data-driven testing using Excel or CSV
- API testing module with Rest Assured
- Docker support for cross-browser execution

```
