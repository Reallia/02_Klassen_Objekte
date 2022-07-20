package com.cc.java;

public class Cat {
   public String futter = "CaFu";
   public int dose = 5;

   public String name;
   public int age;
   public char space;
   
    public Cat(String name, int age) {
    this.name = name;
    this.age = age;
    }

    public void tellYourAddress(){
        System.out.println("Blick von innen: " + this);
    }

    public int doseGeben(){
        dose--;
        return dose;
    }

    public String tellYourName(){
        return this.name;
    }

    public int tellYourAge() {
        return this.age;
    }
}
