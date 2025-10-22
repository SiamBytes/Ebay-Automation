🧪 eBay Automation Framework
📋 Project Overview

The eBay Automation Framework is designed to automate end-to-end testing for the eBay web application.
It validates major user flows such as product search, filtering, adding items to the cart, and verifying product details.
The framework follows Behavior-Driven Development (BDD) principles with Cucumber, ensuring clear communication between QA, development, and business teams.

🚀 Key Features

Automates search and filter functionality for various product categories

Performs data-driven testing using Cucumber Scenario Outlines

Generates detailed HTML and JSON reports

Handles synchronization with explicit and implicit waits

Uses Page Object Model (POM) for better reusability and maintenance

Integrated with Maven for dependency management and build execution

Supports cross-browser testing (Chrome, Edge, Firefox)

🧰 Tools & Technologies
Category	Tools / Libraries
Language	Java
Build Tool	Maven
Test Framework	TestNG / JUnit
BDD Tool	Cucumber
Automation Tool	Selenium WebDriver
API Testing (optional)	RestAssured
Reporting	Extent Reports / Cucumber HTML
Version Control	Git & GitHub
IDE	Eclipse / IntelliJ IDEA
🏗️ Framework Structure
eBayAutomation/
│
├── src
│   ├── main
│   │   └── java
│   │       └── com.ebay.pages        # Page Object classes
│   └── test
│       └── java
│           └── com.ebay.tests        # Step Definitions & Runners
│
├── features/
│   ├── search.feature                # Product Search Scenarios
│   ├── filter.feature                # Filter & Category Scenarios
│   └── cart.feature                  # Add to Cart Scenarios
│
├── pom.xml                           # Maven Dependencies
├── testng.xml                        # TestNG Suite file
├── cucumber.properties                # Cucumber Configurations
└── README.md                         # Project Documentation
⚙️ Setup & Execution
Prerequisites

Install Java 17+

Install Maven

Install Git

Configure ChromeDriver / GeckoDriver in system PATH

Clone Repository
git clone https://github.com/YourUsername/eBayAutomation.git
cd eBayAutomation
Run Tests with Maven
mvn test -Dcucumber.features="src/test/resources/features/search.feature"
🧾 Reporting

After test execution, reports are generated automatically in:
target/cucumber-reports/
You can open the HTML report in a browser to view the execution summary and screenshots (if configured).

📈 Future Enhancements

Add API integration testing for product endpoints

Integrate with Jenkins for CI/CD

Include data-driven testing from Excel/CSV

Expand test coverage for user login, checkout, and payment flows

👤 Author

MD Siam Hossain
📍 New York, USA
💼 QA Automation Engineer | SDET
