SpEL--Spring表达性语言
+ 是一种支持运行时，查询和操作对象的表达性语言
+ 使用#{ }作为界定符
+ 为bean的属性 进行动态赋值 提供了遍历

**可以实现**<br>
1.通过bean的id对bean进行引用<br>
2.调用方法以及引用对象中的属性<br>
3.计算表达式中的值<br>
4.正则表达式的匹配<br>

 SpEL 字面量：<br>
整数：#{8}<br>
小数：#{8.8}<br>
科学计数法：#{1e4}<br>
String：可以使用单引号或者双引号作为字符串的定界符号。<br>
Boolean：#{true}<br>

SpEL引用bean , 属性和方法：<br>
引用其他对象:#{car}<br>
引用其他对象的属性：#{car.brand}<br>
调用其它方法 , 还可以链式操作：#{car.toString()}<br>
调用静态方法静态属性：#{T(java.lang.Math).PI}<br>

 SpEL支持的运算符号：<br>
算术运算符：+，-，*，/，%，^(加号还可以用作字符串连接)<br>
比较运算符：< , > , == , >= , <= , lt , gt , eg , le , ge<br>
逻辑运算符：and , or , not , |<br>
if-else 运算符(类似三目运算符)：？:(temary), ?:(Elvis)<br>
正则表达式：#{admin.email matches '[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}'}<br>
 