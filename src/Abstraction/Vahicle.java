package Abstraction;

  abstract class Vehicle   // create abstract class
{
     abstract void start(); // create abstract method
}
class Car extends Vehicle   // extend vehicle class
{
    void start()      // declared the abstract method with body
    {
        System.out.println("car start with key");
    }
}
class Shooter extends Vehicle   // extends Vehicle class
{
    void start()    //declared abstract method with body
    {
        System.out.println("shooter start with kick");
    }
    public static void main(String []args)
    {
        // not create abstract class object
        // Vehicle v = new Vehicle();
        // v.start();

        Car c = new Car(); // create the Car class object
        c.start();         // call the method

        Shooter s = new Shooter();  // create the Shooter class object
        s.start();                  // call the method
    }
}