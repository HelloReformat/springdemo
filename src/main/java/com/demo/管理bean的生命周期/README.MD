## 初始化以及销毁

通过在bean的声明中设置`init-method`和`init-destroy-method`属性，可以为bean指定初始化或者销毁的方法





## bean的后置处理器

作用：可以在容器调用初始化方法前后进行调整

实现：自定义后置处理器类必须继承`BeanPostProcessor`接口，并在配置文件中声明

使用范围：针对所有bean的实例，但也可以通过过滤的方式，选择特定的对象







## Spring IOC容器对Bean的生命周期进行管理的过程

1. 通过构造器或工厂方法创建Bean实例


2. 通过Bean的 属性设置来调用对象的setter方法进行赋值 和 引用别的容器

3. 将实例传递给Bean后置处理器的`postProcessBeforeInitialization`方法

4. 调用bean的初始化方法

5. 将bean传递给Bean后置处理器的`postProcessAfterInitialization`方法

6. 将bean引用返回给申请的变量

7. bean关闭时，调用bean销毁方法

