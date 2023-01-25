
# Spring IoC Container

- As we know everything in Java is an object, so we can create objects using new keyword. But creating objects using new keyword is not a good practice. 
- It makes our code tightly coupled and difficult to maintain. So we need to use some design pattern to make our code loosely coupled and easy to maintain. 
- Spring framework provides Inversion of Control (IoC) container to achieve loose coupling and maintainability of an application.

## 1. What is IoC Container?

- The Spring IoC container is at the core of the Spring Framework. The container will have the beans and will manage the complete life cycle from creation till destruction of a bean.
- The way that objects are created by spring container is : Instead of creating objects using new keyword, we write code to ask spring container to instantiate the objects. This mechanism is called **Factory Pattern**.

## 2. Factory Pattern ?

- Instead of creating a new object, we will call another object called **factory object** to create the object for us.
- The factory object is responsible for producing new objects.

### 2.1. How factory object creates new objects ?

- The factory object will read a configuration file (blueprint) that contains information about the class name and other information required to create the object.

=> The question is : How does spring achieve this ?

## 3. Spring BeanFactory :

- Spring has **BeanFactory** interface which aims to create and manage objects by reading a spring xml configuration file, which contains all our beans definitions.
- So here spring bean factory acts as a container that creates and manages objects.