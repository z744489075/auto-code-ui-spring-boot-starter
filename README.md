# auto-code-ui-spring-boot-starter
欢迎使用auto-code-ui-spring-boot-starter可视化界面代码生成器.
#### 介绍
传统的java web配置过于繁琐.spring boot的核心思想就是基于约定的配置.所以如果你是spring boot项目 
只需要简短的几步就能配置 `单表`,`一对一`,`一对多`,`多对多`可视化界面代码生成器.
如果你还在使用传统的java web工程.请看这篇 [如何与java-web集成](https://gitee.com/ztp/auto-code-ui).

#### 软件架构

1.spring boot

2.auto-code-ui

#### 安装教程 [实例demo](https://gitee.com/ztp/auto-code-springboot-demo)

1. 增加pom.xml jar包
```xml
<!-- pagehelper 分页插件 -->
<dependency>
    <groupId>com.github.pagehelper</groupId>
    <artifactId>pagehelper-spring-boot-starter</artifactId>
    <version>1.2.10</version>
</dependency>
<!-- 代码生成器可视化视图 -->
<dependency>
    <groupId>com.zengtengpeng</groupId>
    <artifactId>auto-code-ui-spring-boot-starter</artifactId>
    <version>1.0.0</version>
</dependency>
```
2. application.properties增加属性 (更多参数请参考 [auto-code](https://gitee.com/ztp/auto-code#3))
```
#pagehelper插件
pagehelper.helperDialect=mysql
pagehelper.reasonable=true
pagehelper.supportMethodsArguments=true
pagehelper.params=count=countSql

#代码生成器配置
#生成代码的项目根路径
auto-code.parentPath=E:\\resource\\workspaceJDB\\auto-code-springboot-demo
#生成代码的父包 如父包是com.zengtengpeng.test  controller将在com.zengtengpeng.test.controller下 bean 将在com.zengtengpeng.test.bean下 ,service,dao同理
auto-code.parentPack=com.zengtengpeng.simple
```

3. 集成完毕,启动自己的项目,访问 http://localhost:8080/auto-code-ui/ui/index.html.界面如下:
![global](http://images.zengtengpeng.com/auto-code-ui/global.png)

