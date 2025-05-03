package org.example;

// Singleton Class
public class Singleton {
    // Step 1: Create a private static instance
    private static Singleton instance;

    // Step 2: Make the constructor private (so no one else can create an object)
    private Singleton() {
        System.out.println("Singleton instance created!");

    }

    // Step 3: Create a public method to provide access to the instance
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();  // create only once
        }
        return instance;
    }
}



/*1. Synchronized Method (Easy & Safe, but slower):
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

// Double-Checked Locking (Efficient & Thread-safe):

public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

 */

