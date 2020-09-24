# Design-Patterns
23种设计模式

## 设计模式七大原则

1）单一职责原则

2）接口隔离原则

3）依赖倒转（倒置）原则

4）里氏替换原则

5）开闭原则

6）迪米特法则

7）合成复用原则

### 单一职责原则

​		对类来说的，即一个类应该只负责一项职责。如类A负责两个不同职责：职责1，职责2。当职责1需求变更而改变A时，可能造成职责2执行错误，所以需要将类A的粒度分解为A1，A2。

**注意事项和细节**

1）降低类的复杂度，一个类只负责一项职责。

2）提高类的可读性，可维护性。

3）降低变更引起的风险。

4）通常情况下，我们应当遵守单一职责原则，只有逻辑足够简单，才可以在代码级违反单一职责原则；只有类中方法数量足够少，可以在方法级别保持单一职责原则。

### 接口隔离原则

1）客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上。

2）![](https://github.com/jackhusky/Design-Patterns/blob/master/images/%E6%8E%A5%E5%8F%A3%E9%9A%94%E7%A6%BB%E5%8E%9F%E5%88%991%E7%B1%BB%E5%9B%BE.png)

3）类A通过接口Interface1依赖B，类C通过接口Interface1依赖D，如果接口Interface1对于类A和类C来说不是最小接口，那么类B和类D必须去实现他们不需要的方法。

4）按隔离原则应该这样处理：将接口Interface1拆分为独立的几个接口（这里我们拆分成3个接口），类A和类C分别与他们需要的接口建立依赖关系。也就是采用接口隔离原则。

### 依赖倒转原则

1）高层模块不应该依赖底层模块，二者都应该依赖其抽象。

2）抽象不应该依赖细节，细节应该依赖抽象。

3）依赖倒转（倒置）的中心思想是面向接口编程。

4）依赖倒转原则是基于这样的设计理念：相对于细节的多变性，抽象的东西要稳定的多。以抽象为基础搭建的架构比以细节为基础的架构要稳定得多。在java中，抽象指的是接口或抽象类，细节就是具体的实现类。

5）使用接口或抽象类的目的是定制好规范，而不涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成。

**依赖传递的三种方式**

- 接口传递
- 构造方法传递
- setter方式传递

> 低层模块尽量都要有抽象类或接口，或者两者都有，程序稳定性更好。
>
> 变量的声明类型尽量是抽象类或接口，这样我们的变量引用和实际对象间，就存在一个缓冲层，利于程序扩展和优化。
>
> 继承时遵循里氏替换原则。

### 里氏替换原则

OO中的继承性的思考

1）继承包含这样一层含义：父类中凡是已经实现好的方法，实际上是在设定规范和契约，虽然它不强制要求所有的子类必须遵循这些契约，但是如果子类对这些已经实现好的房任意修改，就会对整个继承体系造成破坏。

2）继承在给程序设计带来便利的同时，也带来了弊端。比如使用继承会给程序带来侵入性，程序的可移植性降低，增加对象间的耦合性，如果一个类被其他的类所继承，则当这个类需要修改时，必须考虑到所有的子类，并且父类修改后，所有涉及到的子类的功能都有可能产生故障。

3）问题提出：在编程中，如何正确的使用继承？=>里氏替换原则。

里氏替换原则（Liskov Substitution Principle，LSP）通俗来讲就是：子类可以扩展父类的功能，但不能改变父类原有的功能。也就是说：子类继承父类时，除添加新的方法完成新增功能外，尽量不要重写父类的方法。

### 开闭原则

1）开闭原则（Open Closed Priciple）是编程中最基础、最重要的设计原则。

2）一个软件实体如类，模块和函数应该对外扩展开放（对功能提供方），对修改关闭（对使用方）。用抽象构建框架，用实现扩展细节。

3）当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化。

4）编程中遵循其他原则，以及使用设计模式的目的就是遵循开闭原则。







