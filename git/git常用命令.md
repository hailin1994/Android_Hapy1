### **Git架构**

**仓库**

一个git仓库包含工作目录，与.git目录。其中.git目录是工作目录的下的一级子目录。

由于所有版本控制相关信息都在该.git目录下，整个工作目录保持与未版本控制时一样的状态。

**.git目录**

该目录下包含所有的配置，日志，分支，头(HEAD)等版本控制所需的全部信息。

**工作目录**

即版本控制管理的对象。是某项工作进行的需要增减文件，变更文件内容等操作所包含于的目录。该目录下的所有文件或目录内容可以被git管理。

**缓存区 (Index)**

主要用来保存下一次需要提交（正式修改）到git仓库中的内容。又称为Cache, Staging Area等。

**提交 (Commit)**

一次提交的表示一组针对工作目录内容的修改或操作。例如新增了5个文件，删除了2个，修改3个。这些修改信息一次性纳入git仓库中，形成了对工作目录整体的新的快照。在git中一次提交即对应于新的快照，即可看作一个临时版本。“提交”总是从缓冲区发出。

**分支(Branch)**

分支可以看作一个指针，总是指向一个版本树中的一个"提交"。分支帮助用户指示版本树中的某个分支。

**标签(Tag)**

标签代表了版本历史中的某些特殊点的标识，例如用来标识版本发布点 (v1.0, 等等)

**头 (HEAD)**

HEAD即指向当前分支的指针。在git操作的命令中HEAD取当前分支指向的"版本"(对应于提交，标签等）

**文件状态**

已修改（Modified） - 文件已修改，且没有存入缓存或者版本库已缓存（Staged） - 文件最新修改已放入缓存区中，但尚未存入版本库已提交（Committed） - 文件最新修改已存入版本库**Git可管理广义的内容**

计算机科学相关的版本管理各种设计工程的版本管理**命令**

**初始化（init）**

初始化工作目录，使之能够被git管理。会生成子目录“.git”.

$ git init

**配置（config）**

可以在配置文件.gitconfig中设置，配置文件一般在用户的HOME路径下。也可以通过命令行设置，如

$ git config --global user.email 邮箱机制

$ git config --global user.name 用户名

**帮助（help）**

有多种方式获取git的整体帮助，或者某个命令的帮助。

$ git help

\# 获取某个命令的帮助 git help <command_here>

$ git help add

\# 或者 git <command_here> --help

$ git add --help

**忽略的文件 ignore files**

明确令git不管理某些文件或者目录。通常这是开发者私有文件，或者临时生成的文件。把这些文件或目录名添加到.gitignore文件中。

$ echo"temp/" >> .gitignore

$ echo"private_key" >> .gitignore

**状态（status）**

显示当前工作区与暂存区（Index）的粗略状态。

\# 显示某些文件已修改，哪些文件已准备提交等信息

$ git status

\# 了解git status的更多用法

$ git help status

**添加 （add）**

将文件加入缓存区

\# 添加文件

$ git add HelloWorld.java

\# 添加子目录下的文件

$ git add /path/to/file/HelloWorld.c

\# 通配符方式添加多个文件

$ git add ./*.java

\# 添加工作目录下的所有文件

$ git add -A

**分支（branch）**

该命令用于管理分支。可以查看，修改，创建，删除分支。、

\# 列出所有分支

$ git branch -a

\# 创建新分支

$ git branch myNewBranch

\# 删除分支

$ git branch -d myBranch

\# 重命名分支： git branch -m <oldname> <newname>

$ git branch -m myBranchName myNewBranchName

\# 修改分支描述

$ git branch myBranchName --edit-description

**标签（tag）**

管理标签，标签一般是对当前git仓库的快照设置一个标志。标签包括轻量（lightweight）与可标注（annotated），后者允许记录更多信息。

\# 列出标签

$ git tag

\# 创建可标注标签：-a表示可标注类型，-m 选项加一个说明

$ git tag -a v2.0 -m 'my version 2.0'

\# 显示某个标签相关的信息

$ git show v2.0

\# 把本端的标签v2.0（的版本）推送到远端

$ git push origin v2.0

\# 把本端所有的标签（的版本）推送到远端

$ git push origin --tags

**切换（checkout）**

工作区的文件更换为某个分支或提交的版本.

\# 切换到缺省分支，一般是master分支

$ git checkout

\# 切换至某分支

$ git checkout branchName

\#创建新分支并切换到该分支，等价于:"git branch <name>; git checkout <name>"

$ git checkout -b newBranch

**克隆（clone）**

克隆远端的git仓库至本地。并且为新创建仓库中的所有分支绑定对应的远端分支。

\# 克隆

$ git clone URI路径

\# 浅克隆-快速克隆。注意如果不设置–no–single-branch，只会克隆HEAD所在的分支。--depth表示克隆的最近版本数

$ git clone --depth 1 URI路径

**提交（commit）**

将缓存区（Index）中的内容提交到git仓库中

\# 提交时填写说明(message)

$ git commit -m "Added multiplyNumbers() function to HelloWorld.c"

\# 提交时带数字签名（由提交者的GPG密钥生成）

$ git commit -S -m "signed commit message"

\# 自动将修改的文件加入缓存区（Index），再进行提交。

$ git commit -a -m "Modified foo.php and removed bar.php"

\# 把本次提交与最后一次提交合并（删除最后一次提交，加入合并后的提交）

$ git commit --amend -m "Correct message"

**显示差异（diff）**

显示工作目录、缓存区（Index）、当前git库版本之间的差异

\# 显示工作目录与缓存区（Index）之间的差异

$ git diff

\# 显示缓存区（Index）与当前git库版本之间的差异

$ git diff --cached

\# 显示工作目录与当前git库版本之间的差异

$ git diff HEAD

**查找grep**

快速查找git库的内容.

可能配置:

\# grep结果显示行号

$ git config --global grep.lineNumber true

\# 定义快捷命令g对于grep且美化输出结果

$ git config --global alias.g "grep --break --heading --line-number"

\# 在所有的java文件中查找字符串"variableName"

$ git grep 'variableName' -- '*.java'

**日志（log）**

显示提交到git仓库的记录信息.

\# 显示所有提交

$ git log

\# 以简化单行方式显示（每个提交）

$ git log --oneline

\# 只显示合并的提交

$ git log --merges

\# 在提交行的左侧以字符串图像的方式表示版本变化情况

$ git log --graph

**合并 （merge）**

把外部的分支的修改，合并入当前分支.

\# 把其他某个分支，合并入当前分支.

$ git merge branchName

\# --no-ff标志标识，对任何情况合并都生成新的版本（因为有的优化可以不生成新的版本）

$ git merge --no-ff branchName

**改名 （mv）**

改名或者移动文件

\#改名文件

$ git mv HelloWorld.c HelloNewWorld.c

\#移动文件

$ git mv HelloWorld.c ./new/path/HelloWorld.c

\#强制改名或者移动文件（适用于目的文件已经存在的情况）

$ git mv -f myFile existingFile

**拖动（pull）**

把某个版本从远端git仓库中拖出，并且合并到本端的某个分支

\# git pull <remote> <branch>：把远端origin的master分支拖动到本端git仓库

\# 过程是拖动到本端的“远端镜像”分支，再合并入其对应的本端分支

$ git pull origin master

\# 如果当前分支与某个“远端分支”绑定，则先把其远端分支拖动到本地，再合并入当前分支

$ git pull

\# 合并到本端分支的策略是采用rebase（即本端修改在远端最新版本之上的单线演进）

$ git pull origin master --rebase

**推送（push）**

把本端分支与修改推送至远端的分支并合并

\# git push <remote> <branch>：把本端的branch分支推送到远端git仓库中

$ git push origin master

\# 如果不设置远端名称，将会推送所有与远端绑定的本端分支

$ git push

\#在命令中加-u标志，可以在推送之前立即设置本端分支的远端绑定（以后无需再设）。以下含义是在将本端的master分支与origin(远端名）上的master绑定

$ git push -u origin master

**暂存（stash）**

保存当前暂存区(Index)与工作目录中的变更内容到git中的某个存储区域。再必要的时候，可以取出这些变更并合并到当前工作目录与暂存区（Index）

如果工作区由变更为保存，而执行pull操作会报错。因此需要先用stash保存修改，并使得工作区变为“干净”状态。此时可以执行pull操作。

stash以类似堆栈的方式存储保存的"修改"

\#列出所有存储的“修改”，最新的位于最上部

$git stash list

\# 弹出堆栈顶部的“修改”，并实施于工作目录或者暂存区（Index）。

$ git stash pop

\# 实施堆栈顶部的“修改”，但不弹出

$ git stash apply

\# 实施堆栈顶部起第2个的“修改”（0序），但不弹出

git stash apply stash@{1}

\# 抛弃/删除堆栈顶部的“修改”

git stash drop

**重整（rebase）**

把一个分支上的提交转移到另外一个分支上。这样有可能把两个分支合并成一个。

一个重要准则：不要重整已经提交到公共仓库的版本。

\# 把特性开发分支重整到主分支上

$ git rebase master experimentBranch

**复位 （reset）**

通常reset命令，变更当前的HEAD某个版本，也可以根据HEAD指向的内容，更新存储区（Index）或工作目录。

\# 复位缓存区，用HEAD指向的内容更新缓存区（Index）

$ git reset

\# 复位缓存区，用HEAD指向的内容更新缓存区（Index）与工作目录

$ git reset --hard

\# 先移动HEAD指针，再用$get reset的操作.

$ git reset 31f2bb1

\# 先移动HEAD指针，再用git reset --hard的操作

$ git reset --hard 31f2bb1

\# 只移动HEAD指针

$ git reset --soft31f2bb1

**参考日志 （reflog）**

reflog以时间由近到远列出所有的git操作, 缺省时间长度是90天。因为有些操作的结果没有直接的版本或标签对应，比如历史版本经过rebase等原因在现有版本树中已经找不到了，这些历史版本都可以在reflog中找到。

\# 列出参考日志

$ git reflog

$git reset 

**回退（revert）**

回退用于对某个提交的修改，做反操作的修改，在效果上实现回退。回退在git仓库中产生一个新的提交。回退针对的“提交”与该回退之间，可能存在若干其他的提交。但“回退”只回退对应提交的修改，而保留其他提交的修改。

\# 回退特定提交

$ git revert <commit>

**删除（rm）**

删除文件的同时，也变更git工作目录与缓存区（Index）的状态

\# 删除文件

$ git rm /pather/to/the/file/HelloWorld.c

