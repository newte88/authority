authority
=========

Spring MVC+Mybatis3.0+ExtJS

Spring3 MVC 教程 （Mybatis+ExtJS基本权限管理） 说明：
 1.验证码：采用开源的https://code.google.com/p/kaptcha/。 代码自己修改了部分。
 2.上传文件：swfupload，参考论坛里面的另外一个帖子。 
 3.ext的tab非iframe模式，只加载一次ExtJS，速度还可以～自己命名jsp里面的变量的时候注意变量ID不要重复 参加下面部分js代码 。
 4.框架采用了mybatis+spring3MVC，应该说是学习springmvc的好例子。代码都有详细注释。 
 5.js的加载采用了yepnope，是一个基于条件的异步资源（JS和CSS）加载工具。
 6.mybatis的配置文件的生成采用了自己修改的mybatis的工具。mybatis-generator 修改版。

其他： 附件为maven构建的工程，需要lib的可以去网盘下载，里面也有base_power.pdm文件，可以自己转为mysql的脚本。
 建库语句在war包里面的readme文件夹下面，或者authority\src\main\webapp\readme。

网址：http://www.iteye.com/topic/1119744