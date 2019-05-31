git 与github关联

创建github账号

安装git客户端

ssh-keygen -t rsa -C "770782836@qq.com" //生成ssh key  获取pub内容

在github 上增加ssh key 

验证是否成功

ssh -T git@github.com 

设置提交时候的用户名和邮箱

` git config --global user.name  "name"`//你的GitHub登陆名

` git config --global user.email "123@126.com"`//你的GitHub注册邮箱

` git remote add origin https://github.com/hailin1994/learn.git`//关联仓库

新增文件

`git add .`

`git commit`

`git push -u origin master  `

更新文件

`git pull`











