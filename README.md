# 目录

1、 什么是异常

2、异常体系结构

3、Java异常处理机制

4、处理异常

5、自定义异常

6、总结

# 1、什么是异常

- 实际工作中，遇到的勤快不可能是非常完美的。比如：你写的某个模块，用户输入不一定符合你的要求、你的程序要打开某个文件，这个文件可能不存在或者文件格式不对，你要读取数据库的数据，数据可能是空的等。我们的程序再跑着，内存或硬盘可能满了。等等。
- 软件程序再运行过程中，非常可能遇到刚刚提到的这些异常，我们叫异常，英文是：exception，意识是例外。这些例外情况，或者叫异常，怎么让我们写的程序做出合理的处理，而不至于程序奔溃。
- 异常指程序运行中出现的不期而至的各种状况，如：文件找不到、网络连接失败、非法参数等。
- 异常发生在程序运行期间，他影响了正常的程序执行流程。

## 简单分类

- 要理解java异常处理是如何工作的，你需要掌握以下三种类型的异常
  - 检查性异常：最具代表的检查性异常是用户错误或问题引起的异常，这是程序员无法预见的。例如要打开一个不存在文件时，一个异常就发生了，这些异常在编译时不能被简单地忽略。
  - 运行时异常：运行的异常是可能被程序员避免的异常。与检查性异常相反，运行的异常可以在编译时忽略。
  - 错误ERROR：错误不是异常，而是脱离程序员控制的问题。错误在代码中通常被忽略。例如当栈溢出时，一个错误就发生了，它们在编译也检查不到的。 

# 2、异常体系结构 

- java把异常当作对象来处理，并定义一个基类java.lang.Throwable作为所有异常的超类。
- 在java api中已经定义了许多异常，这些异常分为两大类，错误Error和异常Excption

![](https://github.com/GISERJayY/JavaLesson_6/blob/main/%E5%9B%BE%E7%89%87/1690613565862.jpg?raw=true)

 ## Error

- Error类对象由Java虚拟机生成并抛出，大多数错误与代码编写者所执行的操作无关。
- Java虚拟机运行错误（Virtual MachineError)，当JVM不再有继续执行操作所需的内存资源时，将出现OutOfMemoryError。这些异常发生时，java虚拟几（JVM）一般会选择线程终止；
- 还有发生在虚拟机试图执行应用时，如类定义错误（NoClassDefFoundError）、链接错误（LinkageError）。这些错误是不可查的，因为它们在应用程序的控制和处理能力之外，而且绝大多数是程序运行时不允许出现的状况。

## Exception

-  在Exceptionpidi 分支中有一个重要的子类RuntimeException（运行时异常）
  - ArrayIndexOutOfBoundsException（数组下标越界）
  - NullPointException（空指针异常）
  - AritheticException（算术异常）
  - MissingResourceException（丢失资源）
  - ClassNotFoundException（找不到类）等异常，这些异常是不检查异常，程序中可以选择捕获处理，也可以不处理。
- 这些异常一般是由程序逻辑错误引起的，程序应该从逻辑角度尽可能避免这些类异常发生；
- Error和Exception的区别：Error通常是灾难性的致命错误，是程序无法控制和处理的，当出现这些异常时，java虚拟机（JVM）一般会选择终止线程；Eexcepion通常情况下是可以被程序处理的，并且在程序中应该尽可能的去处理这些异常。

# 3、异常处理机制

- 抛出异常
- 捕获异常
- 异常处理五个关键字
  - try、catch、finally、throw、throws

# 4、自定义异常

- 使用java内置的异常类可以描述在编程过程时出现的大部分异常情况。除此之外，用户还可以自定义异常。用户自定义异常类，只需继承Exception类即可。
- 在程序中使用自定义异常类，大体可分为以下几个步骤：

1、创建自定义异常类

2、在方法中通过throw关键字抛出异常对象

3、如果在当前抛出异常的方法中处理异常，可以使用try-catch语句捕获处理；否则在方法的声明处通过throws关键字指明要抛出给方法调用的异常，继续进行下一步操作。

4、在出现异常方法的调用者中捕获并处理异常。

# 5、实际应用中的经验总结

- 处理运行时异常时，采用逻辑去合理规避同时辅助try-catch 处理
- 在多重catch块后面，可以加一个catch（Exception）来处理可能会被遗漏的异常
- 对于不确定的代码，也可以加上try-catch，处理潜在的异常
- ***<u>尽量去处理异常，切记只是简单地调用printStackTrace()去打印输出</u>***
- 具体如何处理异常，要根据不同业 务需求和异常类型去决定
- 尽量添加finally语句块去释放占用的资源
