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

### 迪米特法则

1）一个对象应该对其他对象保持最少的了解。

2）类与类关系越密切，耦合度越大。

3）迪米特法则（Demeter Priciple）又叫最少知道原则，即一个类对自己依赖的类知道得越少越好。也就是说，对于被依赖的类不管多么复杂，都尽量将逻辑封装在类的内部。对外除了提供的public方法，不对外泄露任何信息。

4）迪米特法则还有个更简单的定义：只与直接的朋友通信。

5）直接的朋友：每个对象都会与其他对象有耦合关系，只要两个对象之间有耦合关系，我们就说这两个对象之间是朋友关系。耦合的方式很多，依赖，关联，关联，组合，聚合等。其中，我们称出现成员变量，方法参数，方法返回值中的类为直接的朋友，而出现在局部变量中的类不是直接的朋友。也就是说，陌生的类最好不要以局部变量的形式出现在类的内部。

> 迪米特法则的核心是降低类之间的耦合。
>
> 但是注意：由于每个类都减少了不必要的依赖，因此迪米特法则只是要求降低类间(对象间)耦合关系， 并不是要求完全没有依赖关系。

### 合成复用原则

合成复用原则（Composite Reuse Principle，CRP）是尽量使用合成/聚合的方式，而不是使用继承。如果要使用继承关系，则必须严格遵循里氏替换原则。

## 设计模式类型

### 创建型模式

1）单例（Singleton）模式：某个类只能生成一个实例，该类提供了一个全局访问点供外部获取该实例，其拓展是有限多例模式。

2）抽象工厂（AbstractFactory）模式：提供一个创建产品族的接口，其每个子类可以生产一系列相关的产品。

3）原型（Prototype）模式：将一个对象作为原型，通过对其进行复制而克隆出多个和原型类似的新实例。

4）建造者（Builder）模式：将一个复杂对象分解成多个相对简单的部分，然后根据不同需要分别创建它们，最后构建成该复杂对象。

5）工厂方法（FactoryMethod）模式：定义一个用于创建产品的接口，由子类决定生产什么产品。

### 结构型模式

1）适配器（Adapter）模式：将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。

2）桥接（Bridge）模式：将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现的，从而降低了抽象和实现这两个可变维度的耦合度。

3）装饰（Decorator）模式：动态地给对象增加一些职责，即增加其额外的功能。

4）组合（Composite）模式：将对象组合成树状层次结构，使用户对单个对象和组合对象具有一致的访问性。

5）外观（Facade）模式：为多个复杂的子系统提供一个一致的接口，使这些子系统更加容易被访问。

6）享元（Flyweight）模式：运用共享技术来有效地支持大量细粒度对象的复用。

7）代理（Proxy）模式：为某对象提供一种代理以控制对该对象的访问。即客户端通过代理间接地访问该对象，从而限制、增强或修改该对象的一些特性。

### 行为型模式

1）模板方法（Template Method）模式：定义一个操作中的算法骨架，将算法的一些步骤延迟到子类中，使得子类在可以不改变该算法结构的情况下重定义该算法的某些特定步骤。

2）命令（Command）模式：将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。

3）访问者（Visitor）模式：在不改变集合元素的前提下，为一个集合中的每个元素提供多种访问方式，即每个元素有多个访问者对象访问。

4）迭代器（Iterator）模式：提供一种方法来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。

5）观察者（Observer）模式：多个对象间存在一对多关系，当一个对象发生改变时，把这种改变通知给其他多个对象，从而影响其他对象的行为。

6）中介者（Mediator）模式：定义一个中介对象来简化原有对象之间的交互关系，降低系统中对象间的耦合度，使原有对象之间不必相互了解。

7）备忘录（Memento）模式：在不破坏封装性的前提下，获取并保存一个对象的内部状态，以便以后恢复它。

8）解释器（Interpreter）模式：提供如何定义语言的文法，以及对语言句子的解释方法，即解释器。

9）状态（State）模式：允许一个对象在其内部状态发生改变时改变其行为能力。

10）策略（Strategy）模式：定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的改变不会影响使用算法的客户。

11）职责链（Chain of Responsibility）模式：把请求从链中的一个对象传到下一个对象，直到请求被响应为止。通过这种方式去除对象之间的耦合。

## 单例设计模式

​		所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例， 并且该类只提供一个取得其对象实例的方法(静态方法)。

​		例如，Windows 中只能打开一个任务管理器，这样可以避免因打开多个任务管理器窗口而造成内存资源的浪费，或出现各个窗口显示内容的不一致等错误。

​		[单例模式有八种方式：](https://github.com/jackhusky/Design-Patterns/tree/master/design-singleton/src/main/java/alex/study/singleton)

- **饿汉式（静态常量）**
- **饿汉式（静态代码块）**
- 懒汉式（线程不安全）
- 懒汉式（线程安全，同步方法）
- 懒汉式（线程安全，同步代码块）
- **双重检查**
- **静态内部类**
- **枚举**

JDK中的源码实现

```java
public class Runtime {
    private static Runtime currentRuntime = new Runtime();

    /**
     * Returns the runtime object associated with the current Java application.
     * Most of the methods of class <code>Runtime</code> are instance
     * methods and must be invoked with respect to the current runtime object.
     *
     * @return  the <code>Runtime</code> object associated with the current
     *          Java application.
     */
    public static Runtime getRuntime() {
        return currentRuntime;
    }

    /** Don't let anyone else instantiate this class */
    private Runtime() {}
```

> 1)	单例模式保证了 系统内存中该类只存在一个对象，节省了系统资源，对于一些需要频繁创建销毁的对象，使用单例模式可以提高系统性能。
>
> 2)	当想实例化一个单例类的时候，必须要记住使用相应的获取对象的方法，而不是使用 new。
>
> 3)	单例模式使用的场景：需要频繁的进行创建和销毁的对象、创建对象时耗时过多或耗费资源过多(即：重量级对象)，但又经常用到的对象、工具类对象、频繁访问数据库或文件的对象(比如数据源、session 工厂等)。

## 简单工厂模式

工厂模式的定义：定义一个创建产品对象的工厂接口，将产品对象的实际创建工作推迟到具体子工厂类当中。这满足创建型模式中所要求的“创建与使用相分离”的特点。

按实际业务场景划分，工厂模式有 3 种不同的实现方式，分别是简单工厂模式、工厂方法模式和抽象工厂模式。

我们把被创建的对象称为“产品”，把创建产品的对象称为“工厂”。如果要创建的产品不多，只要一个工厂类就可以完成，这种模式叫“简单工厂模式”。

在简单工厂模式中创建实例的方法通常为静态（static）方法，因此简单工厂模式（Simple Factory Pattern）又叫作静态工厂方法模式（Static Factory Method Pattern）。

简单来说，简单工厂模式有一个具体的工厂类，可以生成多个不同的产品，属于创建型设计模式。简单工厂模式不在 GoF 23 种设计模式之列。

简单工厂模式每增加一个产品就要增加一个具体产品类和一个对应的具体工厂类，这增加了系统的复杂度，违背了“开闭原则”。

> “工厂方法模式”是对简单工厂模式的进一步抽象化，其好处是可以使系统在不修改原来代码的情况下引进新的产品，即满足开闭原则。

### 优点和缺点

**优点：**

1、工厂类包含必要的逻辑判断，可以决定在什么时候创建哪一个产品的实例。客户端可以免除直接创建产品对象的职责，很方便的创建出相应的产品。工厂和产品的职责区分明确。

2、客户端无需知道所创建具体产品的类名，只需知道参数即可。

3、也可以引入配置文件，在不修改客户端代码的情况下更换和添加新的具体产品类。

**缺点：**

1、简单工厂模式的工厂类单一，负责所有产品的创建，职责过重，一旦异常，整个系统将受影响。且工厂类代码会非常臃肿，违背高聚合原则。

2、使用简单工厂模式会增加系统中类的个数（引入新的工厂类），增加系统的复杂度和理解难度。

3、系统扩展困难，一旦增加新产品不得不修改工厂逻辑，在产品类型较多时，可能造成逻辑过于复杂。

4、简单工厂模式使用了 static 工厂方法，造成工厂角色无法形成基于继承的等级结构。

**应用场景：**

对于产品种类相对较少的情况，考虑使用简单工厂模式。使用简单工厂模式的客户端只需要传入工厂类的参数，不需要关心如何创建对象的逻辑，可以很方便地创建所需产品。

### 模式的结构和实现

[简单工厂模式实现](https://github.com/jackhusky/Design-Patterns/tree/master/design-simplefactory/src/main/java/alex/study/simplefactory)的主要角色如下：

- 简单工厂（SimpleFactory）：是简单工厂模式的核心，负责实现创建所有实例的内部逻辑。工厂类的创建产品类的方法可以被外界直接调用，创建所需的产品对象。

- 抽象产品（Product）：是简单工厂创建的所有对象的父类，负责描述所有实例共有的公共接口。

- 具体产品（ConcreteProduct）：是简单工厂模式的创建目标。

![简单工厂模式](https://github.com/jackhusky/Design-Patterns/blob/master/images/简单工厂模式.png)

## 工厂方法模式

“工厂方法模式”是对简单工厂模式的进一步抽象化，其好处是可以使系统在不修改原来代码的情况下引进新的产品，即满足开闭原则。

### 优点和缺点

**优点：**

- 用户只需要知道具体工厂的名称就可得到所要的产品，无须知道产品的具体创建过程。
- 灵活性增强，对于新产品的创建，只需多写一个相应的工厂类。
- 典型的解耦框架。高层模块只需要知道产品的抽象类，无须关心其他实现类，满足迪米特法则、依赖倒置原则和里氏替换原则。

**缺点：**

- 类的个数容易过多，增加复杂度
- 增加了系统的抽象性和理解难度
- 抽象产品只能生产一种产品，此弊端可使用抽象工厂模式解决。

**应用场景：**

- 客户只知道创建产品的工厂名，而不知道具体的产品名。如 TCL 电视工厂、海信电视工厂等。
- 创建对象的任务由多个具体子工厂中的某一个完成，而抽象工厂只提供创建产品的接口。
- 客户不关心创建产品的细节，只关心产品的品牌

### 模式的结构和实现

[工厂方法模式实现](https://github.com/jackhusky/Design-Patterns/tree/master/design-factorymethod/src/main/java/alex/study/factorymethod)的主要角色如下：

- 抽象工厂（Abstract Factory）：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法 newProduct() 来创建产品。
- 具体工厂（ConcreteFactory）：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。
- 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能。
- 具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间一一对应。

![工厂方法模式](https://github.com/jackhusky/Design-Patterns/blob/master/images/工厂方法模式.png)

## 抽象工厂模式

工厂方法模式中考虑的是一类产品的生产，如畜牧场只养动物、电视机厂只生产电视机、计算机软件学院只培养计算机软件专业的学生等。

同种类称为同等级，也就是说：工厂方法模式只考虑生产同等级的产品，但是在现实生活中许多工厂是综合型的工厂，能生产多等级（种类） 的产品，如农场里既养动物又种植物，电器厂既生产电视机又生产洗衣机或空调，大学既有软件专业又有生物专业等。

本节要介绍的抽象工厂模式将考虑多等级产品的生产，将同一个具体工厂所生产的位于不同等级的一组产品称为一个产品族，图 示的是海尔工厂和 TCL 工厂所生产的电视机与空调对应的关系图。

![抽象工厂模式-产品登记和产品族](https://github.com/jackhusky/Design-Patterns/blob/master/images/抽象工厂模式-产品登记和产品族.png)

### 模式的定义与特点

抽象工厂（AbstractFactory）模式的定义：是一种为访问类提供一个创建一组相关或相互依赖对象的接口，且访问类无须指定所要产品的具体类就能得到同族的不同等级的产品的模式结构。

抽象工厂模式是工厂方法模式的升级版本，工厂方法模式只生产一个等级的产品，而抽象工厂模式可生产多个等级的产品。

使用抽象工厂模式一般要满足以下条件。

- 系统中有多个产品族，每个具体工厂创建同一族但属于不同等级结构的产品。
- 系统一次只可能消费其中某一族产品，即同族的产品一起使用。

抽象工厂模式除了具有工厂方法模式的优点外，其他主要优点如下。

- 可以在类的内部对产品族中相关联的多等级产品共同管理，而不必专门引入多个新的类来进行管理。
- 当需要产品族时，抽象工厂可以保证客户端始终只使用同一个产品的产品组。
- 抽象工厂增强了程序的可扩展性，当增加一个新的产品族时，不需要修改原代码，满足开闭原则。

其缺点是：当产品族中需要增加一个新的产品时，所有的工厂类都需要进行修改。增加了系统的抽象性和理解难度。

### 模式的结构与实现

抽象工厂模式同工厂方法模式一样，也是由抽象工厂、具体工厂、抽象产品和具体产品等 4 个要素构成，但抽象工厂中方法个数不同，抽象产品的个数也不同。现在我们来分析其基本结构和实现方法。

[抽象工厂模式实现](https://github.com/jackhusky/Design-Patterns/tree/master/disign-abstractfactory/src/main/java/alex/study/abstractfactory)的主要角色如下：

- 抽象工厂（Abstract Factory）：提供了创建产品的接口，它包含多个创建产品的方法 newProduct()，可以创建多个不同等级的产品。
- 具体工厂（Concrete Factory）：主要是实现抽象工厂中的多个抽象方法，完成具体产品的创建。
- 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品。
- 具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间是多对一的关系。

![抽象工厂模式](https://github.com/jackhusky/Design-Patterns/blob/master/images/抽象工厂模式.png)

## 原型设计模式

在有些系统中，存在大量相同或相似对象的创建问题，如果用传统的构造函数来创建对象，会比较复杂且耗时耗资源，用原型模式生成对象就很高效，就像孙悟空拔下猴毛轻轻一吹就变出很多孙悟空一样简单。

### 原型模式的定义与特点

原型（Prototype）模式的定义如下：用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。在这里，原型实例指定了要创建的对象的种类。用这种方式创建对象非常高效，根本无须知道对象创建的细节。

**原型模式的优点：**

- Java自带的原型模式基于内存二进制流的复制，在性能上比直接 new 一个对象更加优良。
- 可以使用深克隆方式保存对象的状态，使用原型模式将对象复制一份，并将其状态保存起来，简化了创建对象的过程，以便在需要的时候使用（例如恢复到历史某一状态），可辅助实现撤销操作。

**原型模式的缺点**：

- 需要为每一个类都配置一个 clone 方法
- clone 方法位于类的内部，当对已有类进行改造的时候，需要修改代码，违背了开闭原则。
- 当实现深克隆时，需要编写较为复杂的代码，而且当对象之间存在多重嵌套引用时，为了实现深克隆，每一层对象对应的类都必须支持深克隆，实现起来会比较麻烦。因此，深克隆、浅克隆需要运用得当。

### 原型模式的结构与实现

原型模式实现的主要角色：

- 抽象原型类：规定了具体原型对象必须实现的接口。

- 具体原型类：实现抽象原型类的 clone() 方法，它是可被复制的对象。

- 访问类：使用具体原型类中的 clone() 方法来复制新的对象。

![原型设计模式](https://github.com/jackhusky/Design-Patterns/blob/master/images/原型设计模式.png)

原型模式的克隆分为浅克隆和深克隆。

- 浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，仍指向原有属性所指向的对象的内存地址。
- 深克隆：创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址。

