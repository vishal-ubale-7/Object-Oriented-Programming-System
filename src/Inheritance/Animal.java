package Inheritance;

public class Animal  //parent class

{
    void run ()    //create method
    {
        System.out.println("I am running");
    }

    static class Dog extends Animal  // use extends keyword to perform inheritance
    {
        public static void main(String []args )
        {
            Dog d = new Dog(); // create object
            d.run(); // call the run method
        }
    }
}
