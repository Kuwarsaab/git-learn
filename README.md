# Git-Learn

A comprehensive guide and collection of resources to help beginners learn Git and GitHub, curated by [Kuwarsaab](https://github.com/Kuwarsaab).

## Table of Contents
- [Introduction](#introduction)
- [Getting Started](#getting-started)
- [Git Basics](#git-basics)
- [Branching and Merging](#branching-and-merging)
- [Working with GitHub](#working-with-github)
- [Advanced Git Commands](#advanced-git-commands)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Git is a powerful version control system that enables developers to track changes, collaborate, and maintain their codebase effectively. **Git-Learn** is designed to help you get comfortable with the essential concepts and commands of Git and GitHub.

Whether you're completely new to Git or want to enhance your skills, this repository will serve as your learning companion.

## Getting Started

To start using Git, you need to install it on your machine. Follow these links for installation guides:

- [Git for Windows](https://gitforwindows.org/)
- [Git for Mac](https://www.atlassian.com/git/tutorials/install-git#mac-os-x)
- [Git for Linux](https://www.atlassian.com/git/tutorials/install-git#linux)

Once installed, you can verify the installation by running the following command in your terminal:

``bash
git --version

## Git Basics
Start with the basic Git commands for managing repositories and tracking changes.

1. Initialize a repository
    bash
    git init
   
2. Clone a repository
    bash
    git clone <repository-url>

3. Check the status of your repository
    bash
    git status
   
4. Stage changes
    bash
    git add <file-name>
    
5. Commit changes
    bash
    git commit -m "Your commit message"

## Branching and Merging
Branches in Git allow you to work on different parts of your project simultaneously. Here’s how to work with them:

1. Create a new branch
    bash
    git branch <branch-name>

2. Switch to a branch
    bash
    git checkout <branch-name>
    
3. Merge branches
    bash
    git merge <branch-name>
    
4. Delete a branch
    bash
    git branch -d <branch-name>

## Working with GitHub
After learning basic Git commands, integrate your local repository with GitHub:

1. Add a remote
    bash
    git remote add origin <repository-url>

2. Push changes to GitHub
    bash
    git push origin <branch-name>
    
3. Pull changes from GitHub
    bash
    git pull origin <branch-name>

4. Fork and create a pull request: Learn how to fork repositories, make changes, and create pull requests on GitHub to collaborate with others.

## Advanced Git Commands
Once you're comfortable with the basics, explore these advanced commands:

1. Stashing changes
    bash
    git stash

2. Viewing commit history 
    bash
    git log
   
3. Reverting a commit
    bash
    git revert <commit-hash>
    
4. Resetting changes
    bash
    git reset <commit-hash>

## Contributing
We welcome contributions! If you have any tips or resources that would benefit beginners, feel free to open an issue or submit a pull request.

Steps to Contribute:
1. Fork the repository
2. Create a new branch (git checkout -b feature-branch)
3. Commit your changes (git commit -m "Add feature")
4. Push to the branch (git push origin feature-branch)
5. Open a pull request

## License
This project is licensed under the MIT License - see the LICENSE file for details.

Happy Coding!

Created with ❤️ by Kuwarsaab


This `README.md` provides a clear overview of the purpose, usage, and contribution guidelines for the repository. Let me know if you'd like any further customization!
