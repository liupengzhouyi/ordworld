# 数据库物理结构



## 聊天信息表

| Field       | Type         | Null | Key  | Default | Extra          | 说明       |
| ----------- | ------------ | ---- | ---- | ------- | -------------- | ---------- |
| id          | int(11)      | NO   | PRI  | NULL    | auto_increment | 自增ID     |
| groupid     | int(11)      | NO   |      | NULL    |                | 小组ID     |
| type        | int(11)      | NO   |      | NULL    |                | 发言人类型 |
| authorid    | int(11)      | NO   |      | NULL    |                | 作者ID     |
| information | varchar(100) | NO   |      | NULL    |                | 聊天信息   |
| year        | int(11)      | NO   |      | NULL    |                | 年         |
| month       | int(11)      | NO   |      | NULL    |                | 月         |
| day         | int(11)      | NO   |      | NULL    |                | 日         |
| hour        | int(11)      | NO   |      | NULL    |                | 小时       |
| moment      | int(11)      | NO   |      | NULL    |                | 分钟       |
| second      | int(11)      | NO   |      | NULL    |                | 秒         |

## 管理员表

| Field       | Type         | Null | Key  | Default | Extra          | 说明     |
| ----------- | ------------ | ---- | ---- | ------- | -------------- | -------- |
| id          | int(11)      | NO   | PRI  | NULL    | auto_increment | ID       |
| imageURL    | varchar(200) | YES  |      | NULL    |                | 头像URL  |
| name        | varchar(20)  | YES  |      | NULL    |                | 名称     |
| password    | int(11)      | YES  |      | NULL    |                | 密码     |
| phoneNumber | varchar(20)  | YES  |      | NULL    |                | 联系方式 |


## 文件名称表

| Field    | Type         | Null | Key  | Default | Extra          | 说明     |
| -------- | ------------ | ---- | ---- | ------- | -------------- | -------- |
| id       | int(11)      | NO   | PRI  | NULL    | auto_increment | 自增ID   |
| filename | varchar(200) | NO   | UNI  | NULL    |                | 文件名称 |

##  讨论群组表

| Field     | Type         | Null | Key  | Default | Extra          | 说明     |
| --------- | ------------ | ---- | ---- | ------- | -------------- | -------- |
| id        | int(11)      | NO   | PRI  | NULL    | auto_increment | 自增ID   |
| teacherID | int(11)      | NO   |      | NULL    |                | 教师ID   |
| imageURL  | varchar(200) | YES  |      | NULL    |                | 图片     |
| name      | varchar(50)  | NO   |      | NULL    |                | 小组名称 |

## 群组成员表

| Field     | Type    | Null | Key  | Default | Extra          | 说明   |
| --------- | ------- | ---- | ---- | ------- | -------------- | ------ |
| id        | int(11) | NO   | PRI  | NULL    | auto_increment | 自增ID |
| groupId   | int(11) | NO   |      | NULL    |                | 小组ID |
| studentId | int(11) | NO   |      | NULL    |                | 学生ID |

## 专业信息表

| Field        | Type        | Null | Key  | Default | Extra          | 说明 |
| ------------ | ----------- | ---- | ---- | ------- | -------------- | ---- |
| id           | int(11)     | NO   | PRI  | NULL    | auto_increment | ID   |
| number       | varchar(10) | NO   | UNI  | NULL    |                | 编号 |
| college      | varchar(20) | NO   |      | NULL    |                | 学院 |
| department   | varchar(20) | NO   |      | NULL    |                | 系   |
| professional | varchar(20) | NO   |      | NULL    |                | 专业 |

## 论文题目表

| Field         | Type         | Null | Key  | Default | Extra          | 说明     |
| ------------- | ------------ | ---- | ---- | ------- | -------------- | -------- |
| id            | int(11)      | NO   | PRI  | NULL    | auto_increment | 自增ID   |
| teacherId     | int(11)      | NO   |      | NULL    |                | 教师ID   |
| title         | varchar(100) | NO   |      | NULL    |                | 题目     |
| fileUrl       | varchar(200) | NO   |      | NULL    |                | 描述文件 |
| isSelect      | int(11)      | NO   |      | NULL    |                | 是否被选 |
| studentNumber | varchar(20)  | YES  |      | NULL    |                | 学生学号 |



## 论文文件表

| Field         | Type         | Null | Key  | Default | Extra          | 说明         |
| ------------- | ------------ | ---- | ---- | ------- | -------------- | ------------ |
| id            | int(11)      | NO   | PRI  | NULL    | auto_increment | 自增ID       |
| titleId       | int(11)      | NO   |      | NULL    |                | 题目ID       |
| teacherNumber | varchar(20)  | NO   |      | NULL    |                | 教师编号     |
| studentNumber | varchar(20)  | NO   |      | NULL    |                | 学生学号     |
| name          | varchar(50)  | NO   |      | NULL    |                | 文件描述名称 |
| introduction  | varchar(100) | YES  |      | NULL    |                | 文件描述     |
| fileurl       | varchar(200) | NO   |      | NULL    |                | 文件下载地址 |
| upladData     | varchar(30)  | NO   |      | NULL    |                | 上传日期     |
| versionKey    | int(11)      | NO   |      | NULL    |                | 是否有效     |
| version       | varchar(10)  | NO   |      | NULL    |                | 版本         |
| approvalData  | varchar(30)  | YES  |      | NULL    |                | 教师批复时间 |
| approval      | varchar(200) | YES  |      | NULL    |                | 教师批复内容 |

## 选题表

| Field           | Type        | Null | Key  | Default | Extra          | 说明     |
| --------------- | ----------- | ---- | ---- | ------- | -------------- | -------- |
| id              | int(11)     | NO   | PRI  | NULL    | auto_increment | 自增ID   |
| studentId       | int(11)     | NO   |      | NULL    |                | 学生ID   |
| titleId         | int(11)     | NO   |      | NULL    |                | 选题ID   |
| applicationData | varchar(30) | NO   |      | NULL    |                | 申请日期 |
| passData        | varchar(30) | NO   |      | NULL    |                | 审批日期 |
| pass            | int(11)     | NO   |      | 0       |                | 是否通过 |

## 学生表

| Field          | Type         | Null | Key  | Default | Extra          | 说明     |
| -------------- | ------------ | ---- | ---- | ------- | -------------- | -------- |
| id             | int(11)      | NO   | PRI  | NULL    | auto_increment | 自增ID   |
| studentID      | varchar(10)  | NO   | UNI  | NULL    |                | 学生学号 |
| password       | int(11)      | NO   |      | NULL    |                | 密码值   |
| imageURL       | varchar(200) | YES  |      | NULL    |                | 头像图片 |
| prodessionalId | int(11)      | NO   |      | NULL    |                | 专业编号 |
| phoneNumber    | varchar(20)  | NO   | UNI  | NULL    |                | 联系方式 |
| isDelete       | int(11)      | NO   |      | NULL    |                | 删除标记 |
| name           | varchar(20)  | YES  |      | NULL    |                | 姓名     |

## 系统公告表

| Field     | Type          | Null | Key  | Default | Extra          | 说明 |
| --------- | ------------- | ---- | ---- | ------- | -------------- | ---- |
| id        | int(11)       | NO   | PRI  | NULL    | auto_increment | ID   |
| authorId  | int(11)       | NO   |      | NULL    |                | 作者 |
| title     | varchar(50)   | NO   |      | NULL    |                | 标题 |
| lpcontent | varchar(1024) | NO   |      | NULL    |                | 内容 |
| lpyear    | int(11)       | NO   |      | NULL    |                | 年   |
| lpmonth   | int(11)       | NO   |      | NULL    |                | 月   |
| lpday     | int(11)       | NO   |      | NULL    |                | 日   |

## 教师表

| Field          | Type         | Null | Key  | Default | Extra          | 说明     |
| -------------- | ------------ | ---- | ---- | ------- | -------------- | -------- |
| id             | int(11)      | NO   | PRI  | NULL    | auto_increment | 自增ID   |
| imageURL       | varchar(200) | YES  |      | NULL    |                | 头像URL  |
| teacherNumber  | varchar(20)  | NO   | UNI  | NULL    |                | 教师编号 |
| password       | int(11)      | NO   |      | NULL    |                | 密码     |
| phoneNumber    | varchar(20)  | YES  |      | NULL    |                | 联系方式 |
| professionalId | varchar(10)  | YES  |      | NULL    |                | 专业编号 |
| isDelete       | int(11)      | YES  |      | 0       |                | 是否注销 |
| name           | varchar(20)  | YES  |      | NULL    |                | 教师名称 |