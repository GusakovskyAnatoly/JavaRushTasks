package com.javarush.task.task20.task2017;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Десериализация
*/

public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) {
        try {
           if (objectStream.readObject() instanceof B)
               throw new Exception();
            A a = (A) objectStream.readObject();
            return a;
        }
        catch (Exception e) {
            System.out.println("Error message!");
            return null;
        }

    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
