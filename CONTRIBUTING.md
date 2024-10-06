# Contributing Guidelines to git-learn

Thank you for considering contributing to the **git-learn** project! Your help is highly appreciated. To make the contribution process smooth and productive, please follow the guidelines below.

## Table of Contents
1. [Getting Started](#getting-started)
2. [How to Contribute](#how-to-contribute)
    - [Reporting Bugs](#reporting-bugs)
    - [Suggesting Enhancements](#suggesting-enhancements)
    - [Submitting Code](#submitting-code)
3. [Style Guide](#style-guide)
4. [Code of Conduct](#code-of-conduct)
5. [License](#license)

---

## Getting Started

1. **Fork the Repository**  
   Start by forking the repository to your GitHub account.

2. **Clone the Repository**  
   Clone your fork locally to your machine:
   ```bash
   git clone https://github.com/Kuwarsaab/git-learn.git

3. **Create a Branch**
   Create a new branch for your feature or bugfix:

   ```bash
   git checkout -b your-branch-name
   
4. **Set Up the Project**
   Make sure you have the required dependencies installed. Run the following command to install the dependencies:

   ```bash
   ./gradlew build

---

## Hacktoberfest Contributions

We are taking part in [Hacktoberfest 11](https://hacktoberfest.com/)!

Before you start to contribute to our project in order to satisfy [Hacktoberfest requirements](https://hacktoberfest.com/participation/#contributors), please bare in mind the following:

* There is not a Hacktoberfest t-shirt this year [(see their FAQ)](https://hacktoberfest.com/participation/#faq).
* There is not an infinite opportunity to contribute to the Learn-Spring-Framework project.

### Hacktoberfest Specific Contribution rules

As Hacktoberfest attracts a lot of contributors (which is awesome), it does require a more rigid and strictly enforced set of guidelines than the average contribution.

These are as follows:

1. Typo fixes will not count (by themselves).

Whilst fixing typos is a great thing to do, lets bundle them in with actual contributions if we see them!

2. The same basic rules apply.

- Content must be in English.
- Maximum of 8 links per topic.
- Follow the below style guide for content.

Contributions to the project that meet these requirements will be given the label `hacktoberfest-accepted` and merged, contributions that do not meet the requirements will simply be closed.

Any attempts at spam PRs will be given the `spam` tag. If you recieve 2 `spam` tags against you, you will be [disqualified from Hacktoberfest](https://hacktoberfest.com/participation/#spam).

---

### How to Contribute
1. **Reporting Bugs**
   If you find a bug, please create an issue on GitHub with the following information:

   - A clear and descriptive title.
   - Steps to reproduce the issue.
   - Expected and actual behavior.
   - Any relevant logs or screenshots.

2. **Suggesting Enhancements**
   To suggest a new feature or improvement:
  
   - Open an issue with [Enhancement] in the title.
   - Provide as much detail as possible about the feature.
   - Discuss the benefits and potential use cases.

3. **Submitting Code**
   - Ensure your code follows the Style Guide.
   - Commit your changes:
     ```bash
     git commit -m "Descriptive message of your changes"
   - Push your branch:
     ```bash
     git push origin your-branch-name
   - Create a Pull Request on GitHub.
   
Before submitting, make sure that:
  Tests pass locally.
  You provide a clear and detailed description of the changes.

---

### **Style Guide**

Please follow these coding conventions:
   - Java: Use Java 11 or higher.
   - Code Formatting: Ensure consistent formatting (indentation, spacing) using your IDE’s auto-format feature.
   - Tests: Write unit tests for all new functionality and ensure all tests pass.

### **Code of Conduct**

By participating in this project, you agree to abide by the Code of Conduct. Please ensure a welcoming environment for everyone.

---

### **License**

By contributing to this repository, you agree that your contributions will be licensed under the MIT License.


(Feel free to adjust this template according to your project's specifics, but it covers the essential guidelines for contribution!)
