//SCM - Source Code Management
//GIT vs SVN - GIT onle covers the changes, SVN whole files
//GITHUB vs GITHUB
//MASTER and BRANCH - main branch,
//REMOTE - remote loacalisation for your repo, (ORIGIN repo)
//CLONE - local copy of the repositorium,
//COMMIT and PUSH - making revision local and pushing the commit to repositerium,
//FETCH or PULL -  download the changes

//SHA - unique id key of change in time
//HEAD - is the place we started typing "git status"
//.gitignore - for data that you dont want to

//GIT CONFIG:
/*
Sudo apt-get
git config –list
git config –global user.name “adamTomasiewicz”
git config –global user.email adam.tomasiewicz@outlook.com
git config –global color.ui true
https://help.github.com/en/articles/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent
ssh-keygen -t rsa -b 4096 -C "adam.tomasiewicz@outlook.com"
*/
//GIT COMMANDS:
/*
git init git _example
git init book.txt ; get init .
git status
mkdir, rm, rm -r folder/, ls, cd ..
git rm --cached book.txt
git add ., git commit -m"initial commit" ; git commit --amend
git log
git checkout -- book.txt ;
git diff ;
git add book.txt
git reset head book.txt
git stash ; git stash pop
git checkout -b "more_commands"
git checkout master
git merge (branch_name || orgin/branch_name)
git branch -d more_commands
git branch
git remote
git remote -v
git remote add (origin || dupa) remote_address_url
git remote rm (origin || dupa)
git push --help
git pull origin master
git push origin master (--force) (!!)
git push origin -u master (upstream set)
git revert SHA
git revert --abort
gir revert continue
git reset SHA - cofa sie do miejsca --hard


*/


package pl.adamTomasiewicz.b_akademia.a_basics;

public class Day5_git {
}
