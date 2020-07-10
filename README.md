# ordworld


## 项目开始时间

* 2020-04-02

## 代码开始时间

* 2020-04-04

## 项目开始时间

* 2020-07-10

### API效果展示

![截屏2020-07-10 下午9.36.35](https://tva1.sinaimg.cn/large/007S8ZIlly1ggm7eq1dcdj31ce0u046l.jpg)


# Ord World APIs


**简介**:Ord World APIs


**HOST**:127.0.0.1:8080


**联系人**:liupeng.0@outlook.com


**Version**:1.0


**接口路径**:/v2/api-docs


[TOC]






# 专业信息控制器


## 添加专业信息


**接口地址**:`/Professional/add`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"college": "",
	"department": "",
	"id": 0,
	"number": "",
	"professional": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|professionalInformation|professionalInformation|body|true|专业信息|专业信息|
|&emsp;&emsp;college|学院||false|string||
|&emsp;&emsp;department|系||false|string||
|&emsp;&emsp;id|ID||false|integer(int32)||
|&emsp;&emsp;number|编号||false|string||
|&emsp;&emsp;professional|专业||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 删除专业信息


**接口地址**:`/Professional/delete`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"college": "",
	"department": "",
	"id": 0,
	"number": "",
	"professional": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|professionalInformation|professionalInformation|body|true|专业信息|专业信息|
|&emsp;&emsp;college|学院||false|string||
|&emsp;&emsp;department|系||false|string||
|&emsp;&emsp;id|ID||false|integer(int32)||
|&emsp;&emsp;number|编号||false|string||
|&emsp;&emsp;professional|专业||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 查找所有专业信息


**接口地址**:`/Professional/getAll`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 查找某学院的专业的编号


**接口地址**:`/Professional/getAllNumberByCollege`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"college": "",
	"department": "",
	"id": 0,
	"number": "",
	"professional": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|professionalInformation|professionalInformation|body|true|专业信息|专业信息|
|&emsp;&emsp;college|学院||false|string||
|&emsp;&emsp;department|系||false|string||
|&emsp;&emsp;id|ID||false|integer(int32)||
|&emsp;&emsp;number|编号||false|string||
|&emsp;&emsp;professional|专业||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 查找某系的专业的编号


**接口地址**:`/Professional/getAllNumberByDepartment`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"college": "",
	"department": "",
	"id": 0,
	"number": "",
	"professional": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|professionalInformation|professionalInformation|body|true|专业信息|专业信息|
|&emsp;&emsp;college|学院||false|string||
|&emsp;&emsp;department|系||false|string||
|&emsp;&emsp;id|ID||false|integer(int32)||
|&emsp;&emsp;number|编号||false|string||
|&emsp;&emsp;professional|专业||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 查找某专业的专业的编号


**接口地址**:`/Professional/getAllNumberByProfessional`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"college": "",
	"department": "",
	"id": 0,
	"number": "",
	"professional": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|professionalInformation|professionalInformation|body|true|专业信息|专业信息|
|&emsp;&emsp;college|学院||false|string||
|&emsp;&emsp;department|系||false|string||
|&emsp;&emsp;id|ID||false|integer(int32)||
|&emsp;&emsp;number|编号||false|string||
|&emsp;&emsp;professional|专业||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 通过专业编号查找专业信息


**接口地址**:`/Professional/selectByNumber`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"college": "",
	"department": "",
	"id": 0,
	"number": "",
	"professional": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|professionalInformation|professionalInformation|body|true|专业信息|专业信息|
|&emsp;&emsp;college|学院||false|string||
|&emsp;&emsp;department|系||false|string||
|&emsp;&emsp;id|ID||false|integer(int32)||
|&emsp;&emsp;number|编号||false|string||
|&emsp;&emsp;professional|专业||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 通过ID查找专业信息


**接口地址**:`/Professional/selectOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"college": "",
	"department": "",
	"id": 0,
	"number": "",
	"professional": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|professionalInformation|professionalInformation|body|true|专业信息|专业信息|
|&emsp;&emsp;college|学院||false|string||
|&emsp;&emsp;department|系||false|string||
|&emsp;&emsp;id|ID||false|integer(int32)||
|&emsp;&emsp;number|编号||false|string||
|&emsp;&emsp;professional|专业||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


# 学生控制器


## 学生注册


**接口地址**:`/student/addOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"password": "",
	"password1": "",
	"password2": "",
	"student": {
		"id": 0,
		"imageurl": "",
		"isdelete": 0,
		"name": "",
		"password": 0,
		"phonenumber": "",
		"prodessionalid": 0,
		"studentid": ""
	}
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|reStudent|reStudent|body|true|学生注册登陆修改密码类|学生注册登陆修改密码类|
|&emsp;&emsp;password|登陆密码||false|string||
|&emsp;&emsp;password1|密码||false|string||
|&emsp;&emsp;password2|确认密码||false|string||
|&emsp;&emsp;student|||false|学生表|学生表|
|&emsp;&emsp;&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;imageurl|头像图片||false|string||
|&emsp;&emsp;&emsp;&emsp;isdelete|删除标记||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;name|姓名||false|string||
|&emsp;&emsp;&emsp;&emsp;password|密码值||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;phonenumber|联系方式||false|string||
|&emsp;&emsp;&emsp;&emsp;prodessionalid|专业编号||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;studentid|学生学号||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 学生编辑信息


**接口地址**:`/student/edit`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"password": "",
	"password1": "",
	"password2": "",
	"student": {
		"id": 0,
		"imageurl": "",
		"isdelete": 0,
		"name": "",
		"password": 0,
		"phonenumber": "",
		"prodessionalid": 0,
		"studentid": ""
	}
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|reStudent|reStudent|body|true|学生注册登陆修改密码类|学生注册登陆修改密码类|
|&emsp;&emsp;password|登陆密码||false|string||
|&emsp;&emsp;password1|密码||false|string||
|&emsp;&emsp;password2|确认密码||false|string||
|&emsp;&emsp;student|||false|学生表|学生表|
|&emsp;&emsp;&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;imageurl|头像图片||false|string||
|&emsp;&emsp;&emsp;&emsp;isdelete|删除标记||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;name|姓名||false|string||
|&emsp;&emsp;&emsp;&emsp;password|密码值||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;phonenumber|联系方式||false|string||
|&emsp;&emsp;&emsp;&emsp;prodessionalid|专业编号||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;studentid|学生学号||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 获取所有学生信息


**接口地址**:`/student/getAll`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 学生登陆


**接口地址**:`/student/landing`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"password": "",
	"password1": "",
	"password2": "",
	"student": {
		"id": 0,
		"imageurl": "",
		"isdelete": 0,
		"name": "",
		"password": 0,
		"phonenumber": "",
		"prodessionalid": 0,
		"studentid": ""
	}
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|reStudent|reStudent|body|true|学生注册登陆修改密码类|学生注册登陆修改密码类|
|&emsp;&emsp;password|登陆密码||false|string||
|&emsp;&emsp;password1|密码||false|string||
|&emsp;&emsp;password2|确认密码||false|string||
|&emsp;&emsp;student|||false|学生表|学生表|
|&emsp;&emsp;&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;imageurl|头像图片||false|string||
|&emsp;&emsp;&emsp;&emsp;isdelete|删除标记||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;name|姓名||false|string||
|&emsp;&emsp;&emsp;&emsp;password|密码值||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;phonenumber|联系方式||false|string||
|&emsp;&emsp;&emsp;&emsp;prodessionalid|专业编号||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;studentid|学生学号||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 学生修改密码


**接口地址**:`/student/rePassword`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"password": "",
	"password1": "",
	"password2": "",
	"student": {
		"id": 0,
		"imageurl": "",
		"isdelete": 0,
		"name": "",
		"password": 0,
		"phonenumber": "",
		"prodessionalid": 0,
		"studentid": ""
	}
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|reStudent|reStudent|body|true|学生注册登陆修改密码类|学生注册登陆修改密码类|
|&emsp;&emsp;password|登陆密码||false|string||
|&emsp;&emsp;password1|密码||false|string||
|&emsp;&emsp;password2|确认密码||false|string||
|&emsp;&emsp;student|||false|学生表|学生表|
|&emsp;&emsp;&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;imageurl|头像图片||false|string||
|&emsp;&emsp;&emsp;&emsp;isdelete|删除标记||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;name|姓名||false|string||
|&emsp;&emsp;&emsp;&emsp;password|密码值||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;phonenumber|联系方式||false|string||
|&emsp;&emsp;&emsp;&emsp;prodessionalid|专业编号||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;studentid|学生学号||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 通过联系方式查询学生


**接口地址**:`/student/selectByPhoneNumber`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"imageurl": "",
	"isdelete": 0,
	"name": "",
	"password": 0,
	"phonenumber": "",
	"prodessionalid": 0,
	"studentid": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|student|student|body|true|学生表|学生表|
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;imageurl|头像图片||false|string||
|&emsp;&emsp;isdelete|删除标记||false|integer(int32)||
|&emsp;&emsp;name|姓名||false|string||
|&emsp;&emsp;password|密码值||false|integer(int32)||
|&emsp;&emsp;phonenumber|联系方式||false|string||
|&emsp;&emsp;prodessionalid|专业编号||false|integer(int32)||
|&emsp;&emsp;studentid|学生学号||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 通过学号查询学生


**接口地址**:`/student/selectByStudentID`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"imageurl": "",
	"isdelete": 0,
	"name": "",
	"password": 0,
	"phonenumber": "",
	"prodessionalid": 0,
	"studentid": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|student|student|body|true|学生表|学生表|
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;imageurl|头像图片||false|string||
|&emsp;&emsp;isdelete|删除标记||false|integer(int32)||
|&emsp;&emsp;name|姓名||false|string||
|&emsp;&emsp;password|密码值||false|integer(int32)||
|&emsp;&emsp;phonenumber|联系方式||false|string||
|&emsp;&emsp;prodessionalid|专业编号||false|integer(int32)||
|&emsp;&emsp;studentid|学生学号||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 通过学ID查询学生


**接口地址**:`/student/selectOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"imageurl": "",
	"isdelete": 0,
	"name": "",
	"password": 0,
	"phonenumber": "",
	"prodessionalid": 0,
	"studentid": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|student|student|body|true|学生表|学生表|
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;imageurl|头像图片||false|string||
|&emsp;&emsp;isdelete|删除标记||false|integer(int32)||
|&emsp;&emsp;name|姓名||false|string||
|&emsp;&emsp;password|密码值||false|integer(int32)||
|&emsp;&emsp;phonenumber|联系方式||false|string||
|&emsp;&emsp;prodessionalid|专业编号||false|integer(int32)||
|&emsp;&emsp;studentid|学生学号||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


# 开始测试控制器


## say hello


**接口地址**:`/indexCationPaper/hello`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"imageurl": "",
	"name": "",
	"password": 0,
	"phonenumber": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|conservator|conservator|body|true|管理员|管理员|
|&emsp;&emsp;id|ID||false|integer(int32)||
|&emsp;&emsp;imageurl|头像URL||false|string||
|&emsp;&emsp;name|名称||false|string||
|&emsp;&emsp;password|密码||false|integer(int32)||
|&emsp;&emsp;phonenumber|联系方式||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|管理员|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|id|ID|integer(int32)|integer(int32)|
|imageurl|头像URL|string||
|name|名称|string||
|password|密码|integer(int32)|integer(int32)|
|phonenumber|联系方式|string||


**响应示例**:
```javascript
{
	"id": 0,
	"imageurl": "",
	"name": "",
	"password": 0,
	"phonenumber": ""
}
```


## 获取当前时间


**接口地址**:`/indexCationPaper/now`


**请求方式**:`GET`


**请求数据类型**:`*`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## 获取当前时间


**接口地址**:`/indexCationPaper/now`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK||
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


# 教师控制器


## 教师注册


**接口地址**:`/teacher/add`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"password": "",
	"password1": "",
	"password2": "",
	"teacher": {
		"id": 0,
		"imageurl": "",
		"isdelete": 0,
		"name": "",
		"password": 0,
		"phonenumber": "",
		"professionalid": "",
		"teachernumber": ""
	}
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|reTeacher|reTeacher|body|true|教师注册登陆修改密码类|教师注册登陆修改密码类|
|&emsp;&emsp;password|登陆密码||false|string||
|&emsp;&emsp;password1|密码||false|string||
|&emsp;&emsp;password2|确认密码||false|string||
|&emsp;&emsp;teacher|||false|教师|教师|
|&emsp;&emsp;&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;imageurl|头像URL||false|string||
|&emsp;&emsp;&emsp;&emsp;isdelete|是否注销||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;name|教师名称||false|string||
|&emsp;&emsp;&emsp;&emsp;password|密码||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;phonenumber|联系方式||false|string||
|&emsp;&emsp;&emsp;&emsp;professionalid|专业编号||false|string||
|&emsp;&emsp;&emsp;&emsp;teachernumber|教师编号||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 编辑信息


**接口地址**:`/teacher/edit`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"imageurl": "",
	"isdelete": 0,
	"name": "",
	"password": 0,
	"phonenumber": "",
	"professionalid": "",
	"teachernumber": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|teacher|teacher|body|true|教师|教师|
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;imageurl|头像URL||false|string||
|&emsp;&emsp;isdelete|是否注销||false|integer(int32)||
|&emsp;&emsp;name|教师名称||false|string||
|&emsp;&emsp;password|密码||false|integer(int32)||
|&emsp;&emsp;phonenumber|联系方式||false|string||
|&emsp;&emsp;professionalid|专业编号||false|string||
|&emsp;&emsp;teachernumber|教师编号||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 电话号码查重


**接口地址**:`/teacher/findSamePhoneNumber`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"imageurl": "",
	"isdelete": 0,
	"name": "",
	"password": 0,
	"phonenumber": "",
	"professionalid": "",
	"teachernumber": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|teacher|teacher|body|true|教师|教师|
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;imageurl|头像URL||false|string||
|&emsp;&emsp;isdelete|是否注销||false|integer(int32)||
|&emsp;&emsp;name|教师名称||false|string||
|&emsp;&emsp;password|密码||false|integer(int32)||
|&emsp;&emsp;phonenumber|联系方式||false|string||
|&emsp;&emsp;professionalid|专业编号||false|string||
|&emsp;&emsp;teachernumber|教师编号||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 查询所有教师


**接口地址**:`/teacher/getAll`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 查询某学院所有教师


**接口地址**:`/teacher/getAllByCollege`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"college": "",
	"department": "",
	"id": 0,
	"number": "",
	"professional": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|professionalInformation|professionalInformation|body|true|专业信息|专业信息|
|&emsp;&emsp;college|学院||false|string||
|&emsp;&emsp;department|系||false|string||
|&emsp;&emsp;id|ID||false|integer(int32)||
|&emsp;&emsp;number|编号||false|string||
|&emsp;&emsp;professional|专业||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 查询某专业所有教师


**接口地址**:`/teacher/getAllByProfessional`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"imageurl": "",
	"isdelete": 0,
	"name": "",
	"password": 0,
	"phonenumber": "",
	"professionalid": "",
	"teachernumber": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|teacher|teacher|body|true|教师|教师|
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;imageurl|头像URL||false|string||
|&emsp;&emsp;isdelete|是否注销||false|integer(int32)||
|&emsp;&emsp;name|教师名称||false|string||
|&emsp;&emsp;password|密码||false|integer(int32)||
|&emsp;&emsp;phonenumber|联系方式||false|string||
|&emsp;&emsp;professionalid|专业编号||false|string||
|&emsp;&emsp;teachernumber|教师编号||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 教师登陆


**接口地址**:`/teacher/landing`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"password": "",
	"password1": "",
	"password2": "",
	"teacher": {
		"id": 0,
		"imageurl": "",
		"isdelete": 0,
		"name": "",
		"password": 0,
		"phonenumber": "",
		"professionalid": "",
		"teachernumber": ""
	}
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|reTeacher|reTeacher|body|true|教师注册登陆修改密码类|教师注册登陆修改密码类|
|&emsp;&emsp;password|登陆密码||false|string||
|&emsp;&emsp;password1|密码||false|string||
|&emsp;&emsp;password2|确认密码||false|string||
|&emsp;&emsp;teacher|||false|教师|教师|
|&emsp;&emsp;&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;imageurl|头像URL||false|string||
|&emsp;&emsp;&emsp;&emsp;isdelete|是否注销||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;name|教师名称||false|string||
|&emsp;&emsp;&emsp;&emsp;password|密码||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;phonenumber|联系方式||false|string||
|&emsp;&emsp;&emsp;&emsp;professionalid|专业编号||false|string||
|&emsp;&emsp;&emsp;&emsp;teachernumber|教师编号||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 修改密码


**接口地址**:`/teacher/rePassword`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"password": "",
	"password1": "",
	"password2": "",
	"teacher": {
		"id": 0,
		"imageurl": "",
		"isdelete": 0,
		"name": "",
		"password": 0,
		"phonenumber": "",
		"professionalid": "",
		"teachernumber": ""
	}
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|reTeacher|reTeacher|body|true|教师注册登陆修改密码类|教师注册登陆修改密码类|
|&emsp;&emsp;password|登陆密码||false|string||
|&emsp;&emsp;password1|密码||false|string||
|&emsp;&emsp;password2|确认密码||false|string||
|&emsp;&emsp;teacher|||false|教师|教师|
|&emsp;&emsp;&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;imageurl|头像URL||false|string||
|&emsp;&emsp;&emsp;&emsp;isdelete|是否注销||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;name|教师名称||false|string||
|&emsp;&emsp;&emsp;&emsp;password|密码||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;phonenumber|联系方式||false|string||
|&emsp;&emsp;&emsp;&emsp;professionalid|专业编号||false|string||
|&emsp;&emsp;&emsp;&emsp;teachernumber|教师编号||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 通过教师编号查询教师信息


**接口地址**:`/teacher/selectByNumber`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"imageurl": "",
	"isdelete": 0,
	"name": "",
	"password": 0,
	"phonenumber": "",
	"professionalid": "",
	"teachernumber": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|teacher|teacher|body|true|教师|教师|
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;imageurl|头像URL||false|string||
|&emsp;&emsp;isdelete|是否注销||false|integer(int32)||
|&emsp;&emsp;name|教师名称||false|string||
|&emsp;&emsp;password|密码||false|integer(int32)||
|&emsp;&emsp;phonenumber|联系方式||false|string||
|&emsp;&emsp;professionalid|专业编号||false|string||
|&emsp;&emsp;teachernumber|教师编号||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 通过主键查询单条数据


**接口地址**:`/teacher/selectOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"imageurl": "",
	"isdelete": 0,
	"name": "",
	"password": 0,
	"phonenumber": "",
	"professionalid": "",
	"teachernumber": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|teacher|teacher|body|true|教师|教师|
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;imageurl|头像URL||false|string||
|&emsp;&emsp;isdelete|是否注销||false|integer(int32)||
|&emsp;&emsp;name|教师名称||false|string||
|&emsp;&emsp;password|密码||false|integer(int32)||
|&emsp;&emsp;phonenumber|联系方式||false|string||
|&emsp;&emsp;professionalid|专业编号||false|string||
|&emsp;&emsp;teachernumber|教师编号||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


# 文件名称控制器


## 添加File名称


**接口地址**:`/filename/add`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"filename": "",
	"id": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|filename|filename|body|true|Filename|Filename|
|&emsp;&emsp;filename|||false|string||
|&emsp;&emsp;id|||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 查找File名称


**接口地址**:`/filename/selectByName`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"filename": "",
	"id": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|filename|filename|body|true|Filename|Filename|
|&emsp;&emsp;filename|||false|string||
|&emsp;&emsp;id|||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


# 文件控制器


## 文件下载


**接口地址**:`/File/downloadFile/{fileName}`


**请求方式**:`GET`


**请求数据类型**:`*`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|fileName|fileName|path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Resource|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|description||string||
|file||File|File|
|&emsp;&emsp;absolute||boolean||
|&emsp;&emsp;absoluteFile||File|File|
|&emsp;&emsp;&emsp;&emsp;absolute|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;absoluteFile|||false|File|File|
|&emsp;&emsp;&emsp;&emsp;absolutePath|||false|string||
|&emsp;&emsp;&emsp;&emsp;canonicalFile|||false|File|File|
|&emsp;&emsp;&emsp;&emsp;canonicalPath|||false|string||
|&emsp;&emsp;&emsp;&emsp;directory|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;file|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;freeSpace|||false|integer(int64)||
|&emsp;&emsp;&emsp;&emsp;hidden|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;parent|||false|string||
|&emsp;&emsp;&emsp;&emsp;parentFile|||false|File|File|
|&emsp;&emsp;&emsp;&emsp;path|||false|string||
|&emsp;&emsp;&emsp;&emsp;totalSpace|||false|integer(int64)||
|&emsp;&emsp;&emsp;&emsp;usableSpace|||false|integer(int64)||
|&emsp;&emsp;absolutePath||string||
|&emsp;&emsp;canonicalFile||File|File|
|&emsp;&emsp;&emsp;&emsp;absolute|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;absoluteFile|||false|File|File|
|&emsp;&emsp;&emsp;&emsp;absolutePath|||false|string||
|&emsp;&emsp;&emsp;&emsp;canonicalFile|||false|File|File|
|&emsp;&emsp;&emsp;&emsp;canonicalPath|||false|string||
|&emsp;&emsp;&emsp;&emsp;directory|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;file|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;freeSpace|||false|integer(int64)||
|&emsp;&emsp;&emsp;&emsp;hidden|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;parent|||false|string||
|&emsp;&emsp;&emsp;&emsp;parentFile|||false|File|File|
|&emsp;&emsp;&emsp;&emsp;path|||false|string||
|&emsp;&emsp;&emsp;&emsp;totalSpace|||false|integer(int64)||
|&emsp;&emsp;&emsp;&emsp;usableSpace|||false|integer(int64)||
|&emsp;&emsp;canonicalPath||string||
|&emsp;&emsp;directory||boolean||
|&emsp;&emsp;file||boolean||
|&emsp;&emsp;freeSpace||integer(int64)||
|&emsp;&emsp;hidden||boolean||
|&emsp;&emsp;name||string||
|&emsp;&emsp;parent||string||
|&emsp;&emsp;parentFile||File|File|
|&emsp;&emsp;&emsp;&emsp;absolute|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;absoluteFile|||false|File|File|
|&emsp;&emsp;&emsp;&emsp;absolutePath|||false|string||
|&emsp;&emsp;&emsp;&emsp;canonicalFile|||false|File|File|
|&emsp;&emsp;&emsp;&emsp;canonicalPath|||false|string||
|&emsp;&emsp;&emsp;&emsp;directory|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;file|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;freeSpace|||false|integer(int64)||
|&emsp;&emsp;&emsp;&emsp;hidden|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;parent|||false|string||
|&emsp;&emsp;&emsp;&emsp;parentFile|||false|File|File|
|&emsp;&emsp;&emsp;&emsp;path|||false|string||
|&emsp;&emsp;&emsp;&emsp;totalSpace|||false|integer(int64)||
|&emsp;&emsp;&emsp;&emsp;usableSpace|||false|integer(int64)||
|&emsp;&emsp;path||string||
|&emsp;&emsp;totalSpace||integer(int64)||
|&emsp;&emsp;usableSpace||integer(int64)||
|filename||string||
|inputStream||InputStream|InputStream|
|open||boolean||
|readable||boolean||
|uri||URI|URI|
|&emsp;&emsp;absolute||boolean||
|&emsp;&emsp;authority||string||
|&emsp;&emsp;fragment||string||
|&emsp;&emsp;host||string||
|&emsp;&emsp;opaque||boolean||
|&emsp;&emsp;path||string||
|&emsp;&emsp;port||integer(int32)||
|&emsp;&emsp;query||string||
|&emsp;&emsp;rawAuthority||string||
|&emsp;&emsp;rawFragment||string||
|&emsp;&emsp;rawPath||string||
|&emsp;&emsp;rawQuery||string||
|&emsp;&emsp;rawSchemeSpecificPart||string||
|&emsp;&emsp;rawUserInfo||string||
|&emsp;&emsp;scheme||string||
|&emsp;&emsp;schemeSpecificPart||string||
|&emsp;&emsp;userInfo||string||
|url||URL|URL|
|&emsp;&emsp;authority||string||
|&emsp;&emsp;content||object||
|&emsp;&emsp;defaultPort||integer(int32)||
|&emsp;&emsp;file||string||
|&emsp;&emsp;host||string||
|&emsp;&emsp;path||string||
|&emsp;&emsp;port||integer(int32)||
|&emsp;&emsp;protocol||string||
|&emsp;&emsp;query||string||
|&emsp;&emsp;ref||string||
|&emsp;&emsp;userInfo||string||


**响应示例**:
```javascript
{
	"description": "",
	"file": {
		"absolute": true,
		"absoluteFile": "",
		"absolutePath": "",
		"canonicalFile": "",
		"canonicalPath": "",
		"directory": true,
		"file": true,
		"freeSpace": 0,
		"hidden": true,
		"name": "",
		"parent": "",
		"parentFile": "",
		"path": "",
		"totalSpace": 0,
		"usableSpace": 0
	},
	"filename": "",
	"inputStream": {},
	"open": true,
	"readable": true,
	"uri": {
		"absolute": true,
		"authority": "",
		"fragment": "",
		"host": "",
		"opaque": true,
		"path": "",
		"port": 0,
		"query": "",
		"rawAuthority": "",
		"rawFragment": "",
		"rawPath": "",
		"rawQuery": "",
		"rawSchemeSpecificPart": "",
		"rawUserInfo": "",
		"scheme": "",
		"schemeSpecificPart": "",
		"userInfo": ""
	},
	"url": {
		"authority": "",
		"content": {},
		"defaultPort": 0,
		"file": "",
		"host": "",
		"path": "",
		"port": 0,
		"protocol": "",
		"query": "",
		"ref": "",
		"userInfo": ""
	}
}
```


## 文件下载


**接口地址**:`/File/downloadFile/{fileName}`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|fileName|fileName|path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Resource|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|description||string||
|file||File|File|
|&emsp;&emsp;absolute||boolean||
|&emsp;&emsp;absoluteFile||File|File|
|&emsp;&emsp;&emsp;&emsp;absolute|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;absoluteFile|||false|File|File|
|&emsp;&emsp;&emsp;&emsp;absolutePath|||false|string||
|&emsp;&emsp;&emsp;&emsp;canonicalFile|||false|File|File|
|&emsp;&emsp;&emsp;&emsp;canonicalPath|||false|string||
|&emsp;&emsp;&emsp;&emsp;directory|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;file|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;freeSpace|||false|integer(int64)||
|&emsp;&emsp;&emsp;&emsp;hidden|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;parent|||false|string||
|&emsp;&emsp;&emsp;&emsp;parentFile|||false|File|File|
|&emsp;&emsp;&emsp;&emsp;path|||false|string||
|&emsp;&emsp;&emsp;&emsp;totalSpace|||false|integer(int64)||
|&emsp;&emsp;&emsp;&emsp;usableSpace|||false|integer(int64)||
|&emsp;&emsp;absolutePath||string||
|&emsp;&emsp;canonicalFile||File|File|
|&emsp;&emsp;&emsp;&emsp;absolute|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;absoluteFile|||false|File|File|
|&emsp;&emsp;&emsp;&emsp;absolutePath|||false|string||
|&emsp;&emsp;&emsp;&emsp;canonicalFile|||false|File|File|
|&emsp;&emsp;&emsp;&emsp;canonicalPath|||false|string||
|&emsp;&emsp;&emsp;&emsp;directory|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;file|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;freeSpace|||false|integer(int64)||
|&emsp;&emsp;&emsp;&emsp;hidden|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;parent|||false|string||
|&emsp;&emsp;&emsp;&emsp;parentFile|||false|File|File|
|&emsp;&emsp;&emsp;&emsp;path|||false|string||
|&emsp;&emsp;&emsp;&emsp;totalSpace|||false|integer(int64)||
|&emsp;&emsp;&emsp;&emsp;usableSpace|||false|integer(int64)||
|&emsp;&emsp;canonicalPath||string||
|&emsp;&emsp;directory||boolean||
|&emsp;&emsp;file||boolean||
|&emsp;&emsp;freeSpace||integer(int64)||
|&emsp;&emsp;hidden||boolean||
|&emsp;&emsp;name||string||
|&emsp;&emsp;parent||string||
|&emsp;&emsp;parentFile||File|File|
|&emsp;&emsp;&emsp;&emsp;absolute|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;absoluteFile|||false|File|File|
|&emsp;&emsp;&emsp;&emsp;absolutePath|||false|string||
|&emsp;&emsp;&emsp;&emsp;canonicalFile|||false|File|File|
|&emsp;&emsp;&emsp;&emsp;canonicalPath|||false|string||
|&emsp;&emsp;&emsp;&emsp;directory|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;file|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;freeSpace|||false|integer(int64)||
|&emsp;&emsp;&emsp;&emsp;hidden|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;parent|||false|string||
|&emsp;&emsp;&emsp;&emsp;parentFile|||false|File|File|
|&emsp;&emsp;&emsp;&emsp;path|||false|string||
|&emsp;&emsp;&emsp;&emsp;totalSpace|||false|integer(int64)||
|&emsp;&emsp;&emsp;&emsp;usableSpace|||false|integer(int64)||
|&emsp;&emsp;path||string||
|&emsp;&emsp;totalSpace||integer(int64)||
|&emsp;&emsp;usableSpace||integer(int64)||
|filename||string||
|inputStream||InputStream|InputStream|
|open||boolean||
|readable||boolean||
|uri||URI|URI|
|&emsp;&emsp;absolute||boolean||
|&emsp;&emsp;authority||string||
|&emsp;&emsp;fragment||string||
|&emsp;&emsp;host||string||
|&emsp;&emsp;opaque||boolean||
|&emsp;&emsp;path||string||
|&emsp;&emsp;port||integer(int32)||
|&emsp;&emsp;query||string||
|&emsp;&emsp;rawAuthority||string||
|&emsp;&emsp;rawFragment||string||
|&emsp;&emsp;rawPath||string||
|&emsp;&emsp;rawQuery||string||
|&emsp;&emsp;rawSchemeSpecificPart||string||
|&emsp;&emsp;rawUserInfo||string||
|&emsp;&emsp;scheme||string||
|&emsp;&emsp;schemeSpecificPart||string||
|&emsp;&emsp;userInfo||string||
|url||URL|URL|
|&emsp;&emsp;authority||string||
|&emsp;&emsp;content||object||
|&emsp;&emsp;defaultPort||integer(int32)||
|&emsp;&emsp;file||string||
|&emsp;&emsp;host||string||
|&emsp;&emsp;path||string||
|&emsp;&emsp;port||integer(int32)||
|&emsp;&emsp;protocol||string||
|&emsp;&emsp;query||string||
|&emsp;&emsp;ref||string||
|&emsp;&emsp;userInfo||string||


**响应示例**:
```javascript
{
	"description": "",
	"file": {
		"absolute": true,
		"absoluteFile": "",
		"absolutePath": "",
		"canonicalFile": "",
		"canonicalPath": "",
		"directory": true,
		"file": true,
		"freeSpace": 0,
		"hidden": true,
		"name": "",
		"parent": "",
		"parentFile": "",
		"path": "",
		"totalSpace": 0,
		"usableSpace": 0
	},
	"filename": "",
	"inputStream": {},
	"open": true,
	"readable": true,
	"uri": {
		"absolute": true,
		"authority": "",
		"fragment": "",
		"host": "",
		"opaque": true,
		"path": "",
		"port": 0,
		"query": "",
		"rawAuthority": "",
		"rawFragment": "",
		"rawPath": "",
		"rawQuery": "",
		"rawSchemeSpecificPart": "",
		"rawUserInfo": "",
		"scheme": "",
		"schemeSpecificPart": "",
		"userInfo": ""
	},
	"url": {
		"authority": "",
		"content": {},
		"defaultPort": 0,
		"file": "",
		"host": "",
		"path": "",
		"port": 0,
		"protocol": "",
		"query": "",
		"ref": "",
		"userInfo": ""
	}
}
```


## 单文件上传


**接口地址**:`/File/uploadFile`


**请求方式**:`POST`


**请求数据类型**:`multipart/form-data`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|file|file|formData|true|file||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


# 毕设题目控制器


## 添加毕设题目信息


**接口地址**:`/project/add`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"fileurl": "",
	"id": 0,
	"isselect": 0,
	"studentnumber": "",
	"teacherid": 0,
	"title": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|project|project|body|true|毕设题目|毕设题目|
|&emsp;&emsp;fileurl|描述文件||false|string||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;isselect|是否被选||false|integer(int32)||
|&emsp;&emsp;studentnumber|学生学号||false|string||
|&emsp;&emsp;teacherid|教师ID||false|integer(int32)||
|&emsp;&emsp;title|题目||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 删除毕设题目信息


**接口地址**:`/project/delete`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"fileurl": "",
	"id": 0,
	"isselect": 0,
	"studentnumber": "",
	"teacherid": 0,
	"title": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|project|project|body|true|毕设题目|毕设题目|
|&emsp;&emsp;fileurl|描述文件||false|string||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;isselect|是否被选||false|integer(int32)||
|&emsp;&emsp;studentnumber|学生学号||false|string||
|&emsp;&emsp;teacherid|教师ID||false|integer(int32)||
|&emsp;&emsp;title|题目||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 查询是否有重复毕设题目信息


**接口地址**:`/project/findSame`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"fileurl": "",
	"id": 0,
	"isselect": 0,
	"studentnumber": "",
	"teacherid": 0,
	"title": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|project|project|body|true|毕设题目|毕设题目|
|&emsp;&emsp;fileurl|描述文件||false|string||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;isselect|是否被选||false|integer(int32)||
|&emsp;&emsp;studentnumber|学生学号||false|string||
|&emsp;&emsp;teacherid|教师ID||false|integer(int32)||
|&emsp;&emsp;title|题目||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 查询学生申请


**接口地址**:`/project/findStudentApplication`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"fileurl": "",
	"id": 0,
	"isselect": 0,
	"studentnumber": "",
	"teacherid": 0,
	"title": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|project|project|body|true|毕设题目|毕设题目|
|&emsp;&emsp;fileurl|描述文件||false|string||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;isselect|是否被选||false|integer(int32)||
|&emsp;&emsp;studentnumber|学生学号||false|string||
|&emsp;&emsp;teacherid|教师ID||false|integer(int32)||
|&emsp;&emsp;title|题目||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 查询某所有题目


**接口地址**:`/project/getAll`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"fileurl": "",
	"id": 0,
	"isselect": 0,
	"studentnumber": "",
	"teacherid": 0,
	"title": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|project|project|body|true|毕设题目|毕设题目|
|&emsp;&emsp;fileurl|描述文件||false|string||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;isselect|是否被选||false|integer(int32)||
|&emsp;&emsp;studentnumber|学生学号||false|string||
|&emsp;&emsp;teacherid|教师ID||false|integer(int32)||
|&emsp;&emsp;title|题目||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 查询某个老师的所有题目


**接口地址**:`/project/getAllByTeacherId`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"fileurl": "",
	"id": 0,
	"isselect": 0,
	"studentnumber": "",
	"teacherid": 0,
	"title": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|project|project|body|true|毕设题目|毕设题目|
|&emsp;&emsp;fileurl|描述文件||false|string||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;isselect|是否被选||false|integer(int32)||
|&emsp;&emsp;studentnumber|学生学号||false|string||
|&emsp;&emsp;teacherid|教师ID||false|integer(int32)||
|&emsp;&emsp;title|题目||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 教师重置学生申请


**接口地址**:`/project/reTasksToStudent`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"fileurl": "",
	"id": 0,
	"isselect": 0,
	"studentnumber": "",
	"teacherid": 0,
	"title": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|project|project|body|true|毕设题目|毕设题目|
|&emsp;&emsp;fileurl|描述文件||false|string||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;isselect|是否被选||false|integer(int32)||
|&emsp;&emsp;studentnumber|学生学号||false|string||
|&emsp;&emsp;teacherid|教师ID||false|integer(int32)||
|&emsp;&emsp;title|题目||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 通过ID查找毕设题目信息


**接口地址**:`/project/selectOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"fileurl": "",
	"id": 0,
	"isselect": 0,
	"studentnumber": "",
	"teacherid": 0,
	"title": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|project|project|body|true|毕设题目|毕设题目|
|&emsp;&emsp;fileurl|描述文件||false|string||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;isselect|是否被选||false|integer(int32)||
|&emsp;&emsp;studentnumber|学生学号||false|string||
|&emsp;&emsp;teacherid|教师ID||false|integer(int32)||
|&emsp;&emsp;title|题目||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 批准学生申请


**接口地址**:`/project/tasksToStudent`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"fileurl": "",
	"id": 0,
	"isselect": 0,
	"studentnumber": "",
	"teacherid": 0,
	"title": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|project|project|body|true|毕设题目|毕设题目|
|&emsp;&emsp;fileurl|描述文件||false|string||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;isselect|是否被选||false|integer(int32)||
|&emsp;&emsp;studentnumber|学生学号||false|string||
|&emsp;&emsp;teacherid|教师ID||false|integer(int32)||
|&emsp;&emsp;title|题目||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


# 管理员控制器


## 管理员登陆


**接口地址**:`/Conservator/landing`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"conservator": {
		"id": 0,
		"imageurl": "",
		"name": "",
		"password": 0,
		"phonenumber": ""
	},
	"password": "",
	"password1": "",
	"password2": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|reConservator|reConservator|body|true|管理员注册登陆修改密码类|管理员注册登陆修改密码类|
|&emsp;&emsp;conservator|||false|管理员|管理员|
|&emsp;&emsp;&emsp;&emsp;id|ID||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;imageurl|头像URL||false|string||
|&emsp;&emsp;&emsp;&emsp;name|名称||false|string||
|&emsp;&emsp;&emsp;&emsp;password|密码||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;phonenumber|联系方式||false|string||
|&emsp;&emsp;password|登陆密码||false|string||
|&emsp;&emsp;password1|密码||false|string||
|&emsp;&emsp;password2|确认密码||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 管理员修改密码


**接口地址**:`/Conservator/rePassword`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"conservator": {
		"id": 0,
		"imageurl": "",
		"name": "",
		"password": 0,
		"phonenumber": ""
	},
	"password": "",
	"password1": "",
	"password2": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|reConservator|reConservator|body|true|管理员注册登陆修改密码类|管理员注册登陆修改密码类|
|&emsp;&emsp;conservator|||false|管理员|管理员|
|&emsp;&emsp;&emsp;&emsp;id|ID||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;imageurl|头像URL||false|string||
|&emsp;&emsp;&emsp;&emsp;name|名称||false|string||
|&emsp;&emsp;&emsp;&emsp;password|密码||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;phonenumber|联系方式||false|string||
|&emsp;&emsp;password|登陆密码||false|string||
|&emsp;&emsp;password1|密码||false|string||
|&emsp;&emsp;password2|确认密码||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 管理员注册


**接口地址**:`/Conservator/register`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"conservator": {
		"id": 0,
		"imageurl": "",
		"name": "",
		"password": 0,
		"phonenumber": ""
	},
	"password": "",
	"password1": "",
	"password2": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|reConservator|reConservator|body|true|管理员注册登陆修改密码类|管理员注册登陆修改密码类|
|&emsp;&emsp;conservator|||false|管理员|管理员|
|&emsp;&emsp;&emsp;&emsp;id|ID||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;imageurl|头像URL||false|string||
|&emsp;&emsp;&emsp;&emsp;name|名称||false|string||
|&emsp;&emsp;&emsp;&emsp;password|密码||false|integer(int32)||
|&emsp;&emsp;&emsp;&emsp;phonenumber|联系方式||false|string||
|&emsp;&emsp;password|登陆密码||false|string||
|&emsp;&emsp;password1|密码||false|string||
|&emsp;&emsp;password2|确认密码||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 通过管理员ID获取管理员信息


**接口地址**:`/Conservator/selectByPrimaryKey`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"imageurl": "",
	"name": "",
	"password": 0,
	"phonenumber": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|conservator|conservator|body|true|管理员|管理员|
|&emsp;&emsp;id|ID||false|integer(int32)||
|&emsp;&emsp;imageurl|头像URL||false|string||
|&emsp;&emsp;name|名称||false|string||
|&emsp;&emsp;password|密码||false|integer(int32)||
|&emsp;&emsp;phonenumber|联系方式||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 管理员电话号码查重


**接口地址**:`/Conservator/selectPhoneNumber`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"imageurl": "",
	"name": "",
	"password": 0,
	"phonenumber": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|conservator|conservator|body|true|管理员|管理员|
|&emsp;&emsp;id|ID||false|integer(int32)||
|&emsp;&emsp;imageurl|头像URL||false|string||
|&emsp;&emsp;name|名称||false|string||
|&emsp;&emsp;password|密码||false|integer(int32)||
|&emsp;&emsp;phonenumber|联系方式||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


# 系统公告控制器


## 添加系统公告信息


**接口地址**:`/SystemInformation/add`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"authorid": 0,
	"id": 0,
	"lpcontent": "",
	"lpday": 0,
	"lpmonth": 0,
	"lpyear": 0,
	"title": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|systemInformation|systemInformation|body|true|系统公告实体|系统公告实体|
|&emsp;&emsp;authorid|作者||false|integer(int32)||
|&emsp;&emsp;id|ID||false|integer(int32)||
|&emsp;&emsp;lpcontent|内容||false|string||
|&emsp;&emsp;lpday|日||false|integer(int32)||
|&emsp;&emsp;lpmonth|月||false|integer(int32)||
|&emsp;&emsp;lpyear|年||false|integer(int32)||
|&emsp;&emsp;title|标题||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 删除系统公告信息


**接口地址**:`/SystemInformation/delete`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"authorid": 0,
	"id": 0,
	"lpcontent": "",
	"lpday": 0,
	"lpmonth": 0,
	"lpyear": 0,
	"title": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|systemInformation|systemInformation|body|true|系统公告实体|系统公告实体|
|&emsp;&emsp;authorid|作者||false|integer(int32)||
|&emsp;&emsp;id|ID||false|integer(int32)||
|&emsp;&emsp;lpcontent|内容||false|string||
|&emsp;&emsp;lpday|日||false|integer(int32)||
|&emsp;&emsp;lpmonth|月||false|integer(int32)||
|&emsp;&emsp;lpyear|年||false|integer(int32)||
|&emsp;&emsp;title|标题||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 查询所有系统公告信息


**接口地址**:`/SystemInformation/getAll`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 通过ID查询系统公告信息


**接口地址**:`/SystemInformation/select`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"authorid": 0,
	"id": 0,
	"lpcontent": "",
	"lpday": 0,
	"lpmonth": 0,
	"lpyear": 0,
	"title": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|systemInformation|systemInformation|body|true|系统公告实体|系统公告实体|
|&emsp;&emsp;authorid|作者||false|integer(int32)||
|&emsp;&emsp;id|ID||false|integer(int32)||
|&emsp;&emsp;lpcontent|内容||false|string||
|&emsp;&emsp;lpday|日||false|integer(int32)||
|&emsp;&emsp;lpmonth|月||false|integer(int32)||
|&emsp;&emsp;lpyear|年||false|integer(int32)||
|&emsp;&emsp;title|标题||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 通过管理员ID查询系统公告信息


**接口地址**:`/SystemInformation/selectByAuthor`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"authorid": 0,
	"id": 0,
	"lpcontent": "",
	"lpday": 0,
	"lpmonth": 0,
	"lpyear": 0,
	"title": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|systemInformation|systemInformation|body|true|系统公告实体|系统公告实体|
|&emsp;&emsp;authorid|作者||false|integer(int32)||
|&emsp;&emsp;id|ID||false|integer(int32)||
|&emsp;&emsp;lpcontent|内容||false|string||
|&emsp;&emsp;lpday|日||false|integer(int32)||
|&emsp;&emsp;lpmonth|月||false|integer(int32)||
|&emsp;&emsp;lpyear|年||false|integer(int32)||
|&emsp;&emsp;title|标题||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 通过年查询系统公告信息


**接口地址**:`/SystemInformation/selectByYear`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"authorid": 0,
	"id": 0,
	"lpcontent": "",
	"lpday": 0,
	"lpmonth": 0,
	"lpyear": 0,
	"title": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|systemInformation|systemInformation|body|true|系统公告实体|系统公告实体|
|&emsp;&emsp;authorid|作者||false|integer(int32)||
|&emsp;&emsp;id|ID||false|integer(int32)||
|&emsp;&emsp;lpcontent|内容||false|string||
|&emsp;&emsp;lpday|日||false|integer(int32)||
|&emsp;&emsp;lpmonth|月||false|integer(int32)||
|&emsp;&emsp;lpyear|年||false|integer(int32)||
|&emsp;&emsp;title|标题||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


# 聊天控制器


## 添加聊天信息


**接口地址**:`/chat/add`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"authorid": 0,
	"day": 0,
	"groupid": 0,
	"hour": 0,
	"id": 0,
	"information": "",
	"moment": 0,
	"month": 0,
	"second": 0,
	"type": 0,
	"year": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|chat|chat|body|true|Chat|Chat|
|&emsp;&emsp;authorid|||false|integer(int32)||
|&emsp;&emsp;day|||false|integer(int32)||
|&emsp;&emsp;groupid|||false|integer(int32)||
|&emsp;&emsp;hour|||false|integer(int32)||
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;information|||false|string||
|&emsp;&emsp;moment|||false|integer(int32)||
|&emsp;&emsp;month|||false|integer(int32)||
|&emsp;&emsp;second|||false|integer(int32)||
|&emsp;&emsp;type|||false|integer(int32)||
|&emsp;&emsp;year|||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 获取聊天信息


**接口地址**:`/chat/getByGroupID`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"authorid": 0,
	"day": 0,
	"groupid": 0,
	"hour": 0,
	"id": 0,
	"information": "",
	"moment": 0,
	"month": 0,
	"second": 0,
	"type": 0,
	"year": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|chat|chat|body|true|Chat|Chat|
|&emsp;&emsp;authorid|||false|integer(int32)||
|&emsp;&emsp;day|||false|integer(int32)||
|&emsp;&emsp;groupid|||false|integer(int32)||
|&emsp;&emsp;hour|||false|integer(int32)||
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;information|||false|string||
|&emsp;&emsp;moment|||false|integer(int32)||
|&emsp;&emsp;month|||false|integer(int32)||
|&emsp;&emsp;second|||false|integer(int32)||
|&emsp;&emsp;type|||false|integer(int32)||
|&emsp;&emsp;year|||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 通过ID获取信息


**接口地址**:`/chat/selectOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"authorid": 0,
	"day": 0,
	"groupid": 0,
	"hour": 0,
	"id": 0,
	"information": "",
	"moment": 0,
	"month": 0,
	"second": 0,
	"type": 0,
	"year": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|chat|chat|body|true|Chat|Chat|
|&emsp;&emsp;authorid|||false|integer(int32)||
|&emsp;&emsp;day|||false|integer(int32)||
|&emsp;&emsp;groupid|||false|integer(int32)||
|&emsp;&emsp;hour|||false|integer(int32)||
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;information|||false|string||
|&emsp;&emsp;moment|||false|integer(int32)||
|&emsp;&emsp;month|||false|integer(int32)||
|&emsp;&emsp;second|||false|integer(int32)||
|&emsp;&emsp;type|||false|integer(int32)||
|&emsp;&emsp;year|||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


# 讨论组成员控制器


## 讨论组添加成员


**接口地址**:`/groupnumber/add`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"groupid": 0,
	"id": 0,
	"studentid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|groupnumber|groupnumber|body|true|Groupnumber|Groupnumber|
|&emsp;&emsp;groupid|||false|integer(int32)||
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;studentid|||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 讨论组删除成员


**接口地址**:`/groupnumber/delete`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"groupid": 0,
	"id": 0,
	"studentid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|groupnumber|groupnumber|body|true|Groupnumber|Groupnumber|
|&emsp;&emsp;groupid|||false|integer(int32)||
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;studentid|||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 成员获取讨论组


**接口地址**:`/groupnumber/getAllGroup`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"groupid": 0,
	"id": 0,
	"studentid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|groupnumber|groupnumber|body|true|Groupnumber|Groupnumber|
|&emsp;&emsp;groupid|||false|integer(int32)||
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;studentid|||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 讨论组获取成员


**接口地址**:`/groupnumber/getAllNumber`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"groupid": 0,
	"id": 0,
	"studentid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|groupnumber|groupnumber|body|true|Groupnumber|Groupnumber|
|&emsp;&emsp;groupid|||false|integer(int32)||
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;studentid|||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 通过ID查询


**接口地址**:`/groupnumber/selectByID`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"groupid": 0,
	"id": 0,
	"studentid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|groupnumber|groupnumber|body|true|Groupnumber|Groupnumber|
|&emsp;&emsp;groupid|||false|integer(int32)||
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;studentid|||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


# 讨论组控制器


## 创建讨论组


**接口地址**:`/group/create`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"imageurl": "",
	"name": "",
	"teacherid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|group|group|body|true|Group|Group|
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;imageurl|||false|string||
|&emsp;&emsp;name|||false|string||
|&emsp;&emsp;teacherid|||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 获取所有讨论组


**接口地址**:`/group/getAll`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 查询教师所有讨论组


**接口地址**:`/group/getAllByTeacherId`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"imageurl": "",
	"name": "",
	"teacherid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|group|group|body|true|Group|Group|
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;imageurl|||false|string||
|&emsp;&emsp;name|||false|string||
|&emsp;&emsp;teacherid|||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 讨论组修改头像


**接口地址**:`/group/reImage`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"imageurl": "",
	"name": "",
	"teacherid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|group|group|body|true|Group|Group|
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;imageurl|||false|string||
|&emsp;&emsp;name|||false|string||
|&emsp;&emsp;teacherid|||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 讨论组修改名称


**接口地址**:`/group/reName`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"imageurl": "",
	"name": "",
	"teacherid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|group|group|body|true|Group|Group|
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;imageurl|||false|string||
|&emsp;&emsp;name|||false|string||
|&emsp;&emsp;teacherid|||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 通过讨论组ID讨论组


**接口地址**:`/group/selectOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"imageurl": "",
	"name": "",
	"teacherid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|group|group|body|true|Group|Group|
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;imageurl|||false|string||
|&emsp;&emsp;name|||false|string||
|&emsp;&emsp;teacherid|||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


# 选题管理控制器


## 添加选题申请信息


**接口地址**:`/selecttitle/add`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"applicationdata": "",
	"id": 0,
	"pass": 0,
	"passdata": "",
	"studentid": 0,
	"titleid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|selecttitle|selecttitle|body|true|选题表实体类|选题表实体类|
|&emsp;&emsp;applicationdata|申请日期||false|string||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;pass|是否通过||false|integer(int32)||
|&emsp;&emsp;passdata|审批日期||false|string||
|&emsp;&emsp;studentid|学生ID||false|integer(int32)||
|&emsp;&emsp;titleid|选题ID||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 查询申请信息是否通过


**接口地址**:`/selecttitle/findRepeat1`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"applicationdata": "",
	"id": 0,
	"pass": 0,
	"passdata": "",
	"studentid": 0,
	"titleid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|selecttitle|selecttitle|body|true|选题表实体类|选题表实体类|
|&emsp;&emsp;applicationdata|申请日期||false|string||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;pass|是否通过||false|integer(int32)||
|&emsp;&emsp;passdata|审批日期||false|string||
|&emsp;&emsp;studentid|学生ID||false|integer(int32)||
|&emsp;&emsp;titleid|选题ID||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 查询重复选题申请信息


**接口地址**:`/selecttitle/findRepeat2`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"applicationdata": "",
	"id": 0,
	"pass": 0,
	"passdata": "",
	"studentid": 0,
	"titleid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|selecttitle|selecttitle|body|true|选题表实体类|选题表实体类|
|&emsp;&emsp;applicationdata|申请日期||false|string||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;pass|是否通过||false|integer(int32)||
|&emsp;&emsp;passdata|审批日期||false|string||
|&emsp;&emsp;studentid|学生ID||false|integer(int32)||
|&emsp;&emsp;titleid|选题ID||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 查询学生所有选题申请信息


**接口地址**:`/selecttitle/getAllByStudent`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"applicationdata": "",
	"id": 0,
	"pass": 0,
	"passdata": "",
	"studentid": 0,
	"titleid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|selecttitle|selecttitle|body|true|选题表实体类|选题表实体类|
|&emsp;&emsp;applicationdata|申请日期||false|string||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;pass|是否通过||false|integer(int32)||
|&emsp;&emsp;passdata|审批日期||false|string||
|&emsp;&emsp;studentid|学生ID||false|integer(int32)||
|&emsp;&emsp;titleid|选题ID||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 通过题目ID查询所有选题申请信息


**接口地址**:`/selecttitle/getAllByTitle`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"applicationdata": "",
	"id": 0,
	"pass": 0,
	"passdata": "",
	"studentid": 0,
	"titleid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|selecttitle|selecttitle|body|true|选题表实体类|选题表实体类|
|&emsp;&emsp;applicationdata|申请日期||false|string||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;pass|是否通过||false|integer(int32)||
|&emsp;&emsp;passdata|审批日期||false|string||
|&emsp;&emsp;studentid|学生ID||false|integer(int32)||
|&emsp;&emsp;titleid|选题ID||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 学生申请不通过


**接口地址**:`/selecttitle/notPass`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"applicationdata": "",
	"id": 0,
	"pass": 0,
	"passdata": "",
	"studentid": 0,
	"titleid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|selecttitle|selecttitle|body|true|选题表实体类|选题表实体类|
|&emsp;&emsp;applicationdata|申请日期||false|string||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;pass|是否通过||false|integer(int32)||
|&emsp;&emsp;passdata|审批日期||false|string||
|&emsp;&emsp;studentid|学生ID||false|integer(int32)||
|&emsp;&emsp;titleid|选题ID||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 学生申请通过


**接口地址**:`/selecttitle/pass`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"applicationdata": "",
	"id": 0,
	"pass": 0,
	"passdata": "",
	"studentid": 0,
	"titleid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|selecttitle|selecttitle|body|true|选题表实体类|选题表实体类|
|&emsp;&emsp;applicationdata|申请日期||false|string||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;pass|是否通过||false|integer(int32)||
|&emsp;&emsp;passdata|审批日期||false|string||
|&emsp;&emsp;studentid|学生ID||false|integer(int32)||
|&emsp;&emsp;titleid|选题ID||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 学生申请撤销选题


**接口地址**:`/selecttitle/reApplicationAfterPass`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"applicationdata": "",
	"id": 0,
	"pass": 0,
	"passdata": "",
	"studentid": 0,
	"titleid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|selecttitle|selecttitle|body|true|选题表实体类|选题表实体类|
|&emsp;&emsp;applicationdata|申请日期||false|string||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;pass|是否通过||false|integer(int32)||
|&emsp;&emsp;passdata|审批日期||false|string||
|&emsp;&emsp;studentid|学生ID||false|integer(int32)||
|&emsp;&emsp;titleid|选题ID||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 学生撤销选题申请信息


**接口地址**:`/selecttitle/reApplicationByStudent`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"applicationdata": "",
	"id": 0,
	"pass": 0,
	"passdata": "",
	"studentid": 0,
	"titleid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|selecttitle|selecttitle|body|true|选题表实体类|选题表实体类|
|&emsp;&emsp;applicationdata|申请日期||false|string||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;pass|是否通过||false|integer(int32)||
|&emsp;&emsp;passdata|审批日期||false|string||
|&emsp;&emsp;studentid|学生ID||false|integer(int32)||
|&emsp;&emsp;titleid|选题ID||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 通过ID查询选题申请信息


**接口地址**:`/selecttitle/selectOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"applicationdata": "",
	"id": 0,
	"pass": 0,
	"passdata": "",
	"studentid": 0,
	"titleid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|selecttitle|selecttitle|body|true|选题表实体类|选题表实体类|
|&emsp;&emsp;applicationdata|申请日期||false|string||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;pass|是否通过||false|integer(int32)||
|&emsp;&emsp;passdata|审批日期||false|string||
|&emsp;&emsp;studentid|学生ID||false|integer(int32)||
|&emsp;&emsp;titleid|选题ID||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```


## 学生学号转学生ID


**接口地址**:`/selecttitle/studentNumberToID`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"imageurl": "",
	"isdelete": 0,
	"name": "",
	"password": 0,
	"phonenumber": "",
	"prodessionalid": 0,
	"studentid": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|student|student|body|true|学生表|学生表|
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;imageurl|头像图片||false|string||
|&emsp;&emsp;isdelete|删除标记||false|integer(int32)||
|&emsp;&emsp;name|姓名||false|string||
|&emsp;&emsp;password|密码值||false|integer(int32)||
|&emsp;&emsp;phonenumber|联系方式||false|string||
|&emsp;&emsp;prodessionalid|专业编号||false|integer(int32)||
|&emsp;&emsp;studentid|学生学号||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|通用返回类LPR|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|returnKey|是否成功|boolean||
|returnObject|返回对象|object||
|what|做了什么|string||
|why|为什么错误|string||


**响应示例**:
```javascript
{
	"returnKey": true,
	"returnObject": {},
	"what": "",
	"why": ""
}
```