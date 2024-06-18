CLASS AND OBJECT

A class in Java is a set of objects which shares common characteristics/ behavior and common properties/ attributes.
It is a user-defined blueprint or prototype from which objects are created.
For example, Student is a class while a particular student named Anunay is an object.

Declaration

access_modifier class <class_name>
{  
    data member;  
    method;  
    constructor;
    nested class;
}

How to Create an Object of a Class

1. Using new Keyword

It is most common and used way to create an object in Java

// creating object of class Test
Test t = new Test();

Code Sample:

class Lamp {
  
  // stores the value for light
  // true if light is on
  // false if light is off
  boolean isOn;

  // method to turn on the light
  void turnOn() {
    isOn = true;
    System.out.println("Light on? " + isOn);

  }

  // method to turnoff the light
  void turnOff() {
    isOn = false;
    System.out.println("Light on? " + isOn);
  }
}

class Main {
  public static void main(String[] args) {

    // create objects led and halogen
    Lamp led = new Lamp();
    Lamp halogen = new Lamp();

    // turn on the light by
    // calling method turnOn()
    led.turnOn();

    // turn off the light by
    // calling method turnOff()
    halogen.turnOff();
  }
}





















All classes have at least one constructor. If a class does not explicitly declare any, the Java compiler automatically provides a no-argument 
constructor, also called the default constructor. This default constructor calls the class parent’s no-argument constructoror the Object class 
constructor if the class has no other parent (as the Object class is the parent of all classes either directly or indirectly). 



