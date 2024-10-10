
# Git Cheat Sheet

## Blogs you can refer:

- https://levelup.gitconnected.com/use-git-like-a-senior-engineer-ef6d741c898e
- https://learngitbranching.js.org/

## Steps to Get Started

1. **Download Git on your local machine**

    [Download Git](https://git-scm.com/downloads)
    
2. **Check for Git in CMD/Terminal**
    
    ```bash
    git -v
    ```
    
3. **Configure your local Git (one time)**
    
    ```bash
    git config --global user.name YOUR_NAME
    git config --global user.email MY_NAME@example.com
    ```
    
4. **Check for the configuration**
    
    ```bash
    git config --list
    ```
    
5. **Install** **Git Graph** **in VS Code**
6. **Initialize Git Repository**
7. **Git Status**
    
    ```bash
    git status
    ```
    
8. **Add file to the staging area**
    
    ```bash
    git add index.html   // add single file
    git add .  // add all files
    ```
    
9. **Commit changes** 
    
    ```bash
    git commit -m "your commit message"
    ```

10. **Push changes to the remote repository**

```bash
    git push origin main  // push to the main branch
    ```
    
## Additional Commands

- reset
- rebase
- merge
- squash
- pull origin
- remote
- right commits
- MD syntax
- branch
    - cherrypick
- pull request
- merge conflicts
- issue

## .gitignore

## Right Commits

> feat - a new feature
> fix - a bug fix
> docs - changes in documentation
> style - everything related to styling
> refactor - code changes that neither fixes a bug nor adds a feature
> test - everything related to testing
> chore - updating build tasks, package manager configs, etc…
