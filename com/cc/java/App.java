package com.cc.java;

public class App {

   public static void main(String[] args) {

      // Cat cat = new Cat();
      // System.out.println("Blick von aussen: " + cat);
      // cat.tellYourAddress();

      // Cat cat1 = new Cat();
      // System.out.println("Blick von aussen: " + cat1);
      // cat1.tellYourAddress();

      // System.out.println(cat1.futter + " " + cat1.dose);

      // System.out.println(cat1.doseGeben());
      // System.out.println(cat1.dose);

      // System.out.println("-----------------------------------------");

      // System.out.println(cat1.name);
      // System.out.println(cat1.age);
      // System.out.println(cat1.futter + cat1.huhu + cat1.dose);

      // Cat cat1 = new Cat();
      // System.out.println(cat1.name);
      // System.out.println(cat1.age);
      Cat cat = new Cat("Grizabella", 29);
      cat.age = 32;
      // cat.name = "Grizabella";
      // cat.age = 29;
      System.out.println(cat.tellYourName() + cat.space + cat.tellYourAge());

      System.out.println("---------------------");

      Cat cat1 = new Cat("Alonzo", 35);
      // cat1.name = "Alonzo";
      // cat1.age = 35;
      System.out.println(cat1.tellYourName() + cat1.space + cat1.tellYourAge());
   }
}
