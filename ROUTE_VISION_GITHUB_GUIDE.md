Route Vision — GitHub Guide

University Transport Management & Tracking System

Repository: https://github.com/yasinarafatsami466/Route-vision

This guide explains how our Route Vision team should use Git and GitHub for coding, sharing code, creating branches, pushing changes, and working together safely.

It is written for beginners, so follow the steps in order.

⸻

1. What is Git and GitHub?

Git

Git is a version control system. It keeps track of changes in our project files.

GitHub

GitHub is an online platform where our Git repository is stored and where team members can collaborate.

Simple idea

VS Code → Git → GitHub

We write code in VS Code → Git tracks the changes → GitHub stores and shares the project.

⸻

2. Our Route Vision Repository

Our main repository is:

Route Vision

GitHub:

https://github.com/yasinarafatsami466/Route-vision

The project is a University Transport Management & Tracking System.

Main features include:

* Bus and route management
* Bus schedules
* Bus availability
* Real-time bus location
* Approximate arrival time
* Driver information
* Driver ratings and feedback
* Admin management

⸻

3. Team Structure

There are 5 members in the Route Vision team.

The recommended branch structure is:

Member	Branch
Team Leader — Sami	sami-user
Member 2	feature/bus-management
Member 3	feature/driver-management
Member 4	feature/route-schedule
Member 5	feature/feedback-rating

Important: Each member should normally work on their own branch.

Do not directly edit another member’s branch unless the team leader asks you to do so.

⸻

4. Before Starting

Make sure Git is installed.

Check Git:

git --version

Check Java:

java -version

Check Java compiler:

javac -version

If javac is not recognized, a JDK may not be installed correctly or Java may not be added to PATH.

For Java development, use a proper JDK, not only a JRE.

⸻

5. First-Time Git Setup

If Git asks for your identity, configure your name.

Use your own name:

git config --global user.name "Your Name"

Configure your GitHub email:

git config --global user.email "your-email@example.com"

Check the settings:

git config --global --list

Use the GitHub account/email that you normally use for your project contributions.

⸻

6. How to Clone Route Vision

If you do not have the project on your computer yet, clone it.

Open Terminal or PowerShell and run:

git clone https://github.com/yasinarafatsami466/Route-vision.git

Go inside the project folder:

cd Route-vision

Check the files:

ls

On Windows PowerShell, you can also use:

Get-ChildItem

⸻

7. Check the Current Branch

Always check your branch before starting work.

git branch

The branch with * is your current branch.

Example:

  main
* feature/bus-management

This means you are currently working on:

feature/bus-management

⸻

8. Check Repository Status

Before making changes:

git status

A clean repository may show:

nothing to commit, working tree clean

This is good.

⸻

9. Main Branch vs Feature Branch

main

The main branch should contain the stable project version.

Feature Branch

Each member should create a separate branch for their work.

Examples:

feature/bus-management
feature/driver-management
feature/route-schedule
feature/feedback-rating

Recommended workflow

main
 │
 ├── feature/bus-management
 │
 ├── feature/driver-management
 │
 ├── feature/route-schedule
 │
 └── feature/feedback-rating

Members work on their own branches and create Pull Requests when their work is ready.

⸻

10. Create Your Own Feature Branch

First go to the main branch:

git checkout main

Update main:

git pull

Create a new branch:

git checkout -b feature/your-feature-name

Example:

git checkout -b feature/bus-management

Check the branch:

git branch

⸻

11. Daily Work — Recommended Workflow

Every time you start working, follow this process:

Step 1 — Check your branch

git branch

Step 2 — Check status

git status

Step 3 — Update your branch if necessary

git pull

Step 4 — Write or modify code

Open the project in VS Code.

Step 5 — Check changes

git status

Step 6 — Stage changes

git add .

Step 7 — Commit

git commit -m "Add bus management"

Step 8 — Push

git push

If this is the first push of a new branch:

git push -u origin feature/bus-management

⸻

12. What is git add?

git add tells Git which changed files should be included in the next commit.

To add everything:

git add .

To add one specific file:

git add filename.java

Example:

git add Bus.java

⸻

13. What is a Commit?

A commit saves a version of your changes in Git.

Example:

git commit -m "Add bus management"

Good commit messages should clearly describe the change.

Good examples

git commit -m "Add bus class"
git commit -m "Implement driver management"
git commit -m "Add route schedule feature"
git commit -m "Fix bus availability bug"

Avoid unclear messages

update
changes
done
hello
test

Use meaningful messages.

⸻

14. What is git push?

git push uploads your local commits to GitHub.

git push

For a new branch:

git push -u origin feature/bus-management

After the first push, normally:

git push

is enough.

⸻

15. What is a Pull Request?

A Pull Request (PR) is a request to merge your branch into another branch.

Example:

feature/bus-management
          ↓
        Pull Request
          ↓
         main

A PR allows the team leader to review the code before merging.

⸻

16. How to Create a Pull Request

After pushing your branch:

git push

Go to the Route Vision GitHub repository.

GitHub may show:

Compare & pull request

Click it.

Select:

Base: main

Compare: your feature branch

Example:

base: main
compare: feature/bus-management

Then click:

Create pull request

⸻

17. Pull Request Title

Use a clear title.

Examples:

Add Bus Management Feature
Add Driver Management
Implement Route and Schedule
Add Feedback and Rating System

⸻

18. Pull Request Description

A good PR description should explain:

What did you change?

Why did you change it?

What files/features were added?

Example:

## What I Changed
- Added Bus class
- Added bus information management
- Added bus availability feature
## Testing
- Tested Bus class
- Checked project compilation
- Verified basic functionality

⸻

19. Code Review

Before merging a Pull Request, the team leader should check:

* Does the code compile?
* Does the feature work?
* Is the code understandable?
* Does it follow the project structure?
* Does it break existing features?
* Are unnecessary files included?
* Are passwords or private information included?

If everything is okay, merge the PR.

⸻

20. VS Code Git Workflow

You can use Git through VS Code without typing every command.

Open the project in VS Code.

Click:

Source Control

on the left sidebar.

You will see changed files.

Stage files

Click the + button beside a file.

Or stage everything using:

Stage All Changes

Write commit message

Example:

Add bus management

Click:

Commit

Then click:

Sync Changes / Push

depending on the VS Code version.

⸻

21. Important VS Code Rule

Before committing, always check what you changed.

Do not blindly commit everything if you have unrelated files.

For example, avoid accidentally committing:

* .env
* passwords
* personal files
* IDE temporary files
* build files
* unnecessary screenshots
* large generated files

⸻

22. How to Check Changed Files

Use:

git status

To see detailed changes:

git diff

⸻

23. How to See Commit History

git log --oneline

Example:

f94d564 Resolve README merge conflict
e8565d5 Update Route Vision README

⸻

24. How to See All Branches

git branch -a

This shows local and remote branches.

⸻

25. How to Switch Branches

Switch to main:

git checkout main

Switch to your feature branch:

git checkout feature/bus-management

⸻

26. How to Create a New Branch

git checkout -b feature/new-feature

Example:

git checkout -b feature/driver-management

⸻

27. How to Update Your Local Main Branch

Before starting new work:

git checkout main

Then:

git pull

Now your local main should contain the latest version from GitHub.

⸻

28. How to Delete a Local Branch

Only delete a branch when you are sure it is no longer needed.

git branch -d feature/branch-name

Example:

git branch -d feature/bus-management

Do not delete another member’s branch without permission.

⸻

29. Common Problem: git is not recognized

If Windows shows:

git is not recognized

Git may not be installed or PATH may not be configured.

Check:

git --version

If it still does not work, install Git and restart VS Code.

⸻

30. Common Problem: javac is not recognized

If you see:

javac is not recognized

Java Runtime may be installed, but the Java Development Kit may not be installed or configured correctly.

Check:

java -version

Then:

javac -version

For Java development, install a JDK and make sure its bin directory is available in PATH.

After installation, restart VS Code.

⸻

31. Common Problem: not a git repository

If you see:

fatal: not a git repository

You are probably not inside the project folder.

Check your current location.

Then go to your project folder.

Example:

cd Route-Vision

Then:

git status

⸻

32. Common Problem: Permission Denied

If GitHub says permission denied:

1. Make sure you are logged into the correct GitHub account.
2. Make sure you accepted the repository collaborator invitation.
3. Make sure you have permission to push to the repository.
4. Check the remote URL.

git remote -v

⸻

33. Common Problem: Push Rejected

You may see something like:

rejected
non-fast-forward

This usually means the remote branch has changes that your local branch does not have.

First check your branch:

git branch

Then update:

git pull

If Git reports conflicts, do not panic.

Follow the conflict-resolution section below.

Do not use git push --force as a normal solution.

⸻

34. Merge Conflict

A merge conflict happens when Git cannot automatically decide which version of a file should be kept.

You may see:

<<<<<<< HEAD
your changes
=======
other changes
>>>>>>> main

These are conflict markers.

⸻

35. How to Resolve a Conflict

Open the conflicted file in VS Code.

You may see options such as:

* Accept Current Change
* Accept Incoming Change
* Accept Both Changes
* Compare Changes

Choose the correct version based on the project requirements.

Then remove all conflict markers:

<<<<<<<
=======
>>>>>>>

Save the file.

Check status:

git status

Stage the resolved file:

git add filename

Example:

git add README.md

Commit:

git commit -m "Resolve merge conflict"

Then push:

git push

⸻

36. Important: Do Not Type :wq in Normal Terminal

Sometimes Git opens a text editor called Vim when creating a commit.

If you see a Vim screen:

1. Press Esc
2. Type:

:wq

3. Press Enter.

This saves the commit message and exits Vim.

:wq works inside Vim. It is not a normal Git or terminal command.

⸻

37. If Vim Becomes Confusing

If you are stuck inside Vim, press:

Esc

Then type:

:q!

and press Enter.

This exits without saving.

After that, you can run the Git command again.

⸻

38. Nothing to Commit

If Git says:

nothing to commit, working tree clean

It means there are no new changes to commit.

Check:

git status

If your work is already committed, you may only need:

git push

⸻

39. Accidentally Changed the Wrong File

First check:

git status

If you have not committed the changes yet, inspect them:

git diff

Do not immediately delete or reset files if you are not sure what happened.

Ask the team leader before using destructive commands.

⸻

40. Important Safety Rule

Avoid using commands such as:

git push --force

unless the team leader specifically tells you to use it.

Force pushing can overwrite remote history and cause problems for other team members.

⸻

41. Keep Branches Small and Focused

One branch should normally focus on one feature.

Good:

feature/bus-management

Bad:

feature/everything

For example, if you are assigned Bus Management, focus on:

* Bus class
* Bus information
* Bus availability
* Related functionality

Do not modify unrelated parts of the project unnecessarily.

⸻

42. Avoid Working on the Same Files

If two members edit the same Java file at the same time, merge conflicts can happen.

Try to divide work clearly.

Example:

Member	Main Work
Sami	Project integration / main coordination
Member 2	Bus Management
Member 3	Driver Management
Member 4	Route & Schedule
Member 5	Feedback & Rating

Coordinate before modifying shared files.

⸻

43. Recommended Team Workflow

The overall process should be:

Clone Repository
       ↓
Create Feature Branch
       ↓
Write Code in VS Code
       ↓
Test Code
       ↓
git status
       ↓
git add
       ↓
git commit
       ↓
git push
       ↓
Create Pull Request
       ↓
Code Review
       ↓
Merge into main
       ↓
Pull latest main
       ↓
Start next feature

⸻

44. Quick Daily Commands

Check status

git status

Check branch

git branch

Update project

git pull

Stage changes

git add .

Commit

git commit -m "Describe your change"

Push

git push

View branches

git branch -a

View history

git log --oneline

Check remote

git remote -v

⸻

45. New Team Member — Complete Setup

If a new team member joins the project, follow these steps.

Step 1 — Accept GitHub invitation

Accept the invitation to the Route Vision repository.

Step 2 — Clone repository

git clone https://github.com/yasinarafatsami466/Route-vision.git

Step 3 — Enter project

cd Route-Vision

Step 4 — Check branches

git branch -a

Step 5 — Update main

git checkout main
git pull

Step 6 — Create feature branch

git checkout -b feature/your-feature-name

Step 7 — Work in VS Code

Write and test your code.

Step 8 — Stage

git add .

Step 9 — Commit

git commit -m "Add your feature"

Step 10 — Push

git push -u origin feature/your-feature-name

Step 11 — Create Pull Request

Go to GitHub and create a Pull Request from your feature branch to main.

⸻

46. Before Creating a Pull Request

Make sure:

* [ ]	Code compiles
* [ ]	Feature works
* [ ]	No unnecessary files are included
* [ ]	No passwords/API keys are included
* [ ]	Commit message is meaningful
* [ ]	Branch contains only relevant changes
* [ ]	You tested your changes
* [ ]	You checked git status

Check:

git status

⸻

47. Before Merging a Pull Request

The team leader/reviewer should check:

* [ ]	Correct branch
* [ ]	Correct feature
* [ ]	Code quality
* [ ]	No unnecessary changes
* [ ]	No conflict
* [ ]	Project still runs
* [ ]	Feature works as expected

Only then merge the Pull Request.

⸻

48. GitHub Collaboration Rules

Rule 1

Always work on your own feature branch.

Rule 2

Do not directly push to main unless the team leader allows it.

Rule 3

Pull the latest changes before starting new work.

Rule 4

Use meaningful commit messages.

Rule 5

Do not commit passwords or private information.

Rule 6

Do not use force push unless specifically instructed.

Rule 7

Test your code before creating a Pull Request.

Rule 8

Keep your Pull Request focused on one feature.

Rule 9

If you get a conflict, ask for help instead of deleting files randomly.

Rule 10

Communicate with the team before changing shared files.

⸻

49. Most Important Commands — Cheat Sheet

Start

git status

Check branch

git branch

Update

git pull

Create branch

git checkout -b feature/my-feature

Stage

git add .

Commit

git commit -m "Add my feature"

Push

git push

First push of new branch

git push -u origin feature/my-feature

View remote

git remote -v

View history

git log --oneline

⸻

50. Final Recommended Workflow

For every coding session, remember:

CHECK
  ↓
PULL
  ↓
CODE
  ↓
TEST
  ↓
STATUS
  ↓
ADD
  ↓
COMMIT
  ↓
PUSH
  ↓
PULL REQUEST
  ↓
REVIEW
  ↓
MERGE

⸻

51. Golden Rule

Never work directly on main unless the team leader specifically asks you to.

The safest Route Vision workflow is:

main
 ↓
Create Feature Branch
 ↓
Code
 ↓
Test
 ↓
Commit
 ↓
Push
 ↓
Pull Request
 ↓
Review
 ↓
Merge

Work separately → Commit clearly → Push safely → Create PR → Review → Merge

⸻

Route Vision Team

Project: Route Vision
Type: University Transport Management & Tracking System
Language: Java
Database: MySQL
Location Service: GPS / Location Services
Team Size: 5
Team Leader: Sami

⸻

Remember

If you are confused about any Git command, do not randomly run commands that can delete or overwrite work.

First run:

git status

Then check the current branch:

git branch

These two commands are the safest starting point for most Git problems.

Happy Coding — Route Vision Team 🚍
