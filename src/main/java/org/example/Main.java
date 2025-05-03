package org.example;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        System.out.println(obj.hashCode());

        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj2.hashCode());

    }
}


//notes
/*Definition of Singleton Design Pattern:
*The Singleton Design Pattern is a creational design pattern that ensures a class has only one instance throughout the lifetime of the application and provides a global point of access to that instance.
*
* 1. static variable
* 2. private constructor
* 3. global access
*
*
*  Use Cases of Singleton:
Logging (only one logger instance)
Database connections
Configuration managers
File systems
*
*
*
* Singleton is thread safe
* NO, a basic singleton is not thread-safe.
If multiple threads access the getInstance() method at the same time (before the instance is created), they may create multiple instances, breaking the Singleton rule.
Caching systems
* 1. Synchronized Method (Easy & Safe, but slower):
*
*
* */
