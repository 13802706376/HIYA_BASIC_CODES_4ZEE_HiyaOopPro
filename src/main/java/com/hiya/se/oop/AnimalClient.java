package com.hiya.se.oop;

public class AnimalClient
{

    public static void main(String args[])
    {
        Animal animal = new Dog();
        animal.speak(); // 汪汪...
        animal = new Cat();
        animal.speak();// 喵喵...
    }

}
