package Inheritance.Hierachical;


public class A
{
     void showA()
     {
         System.out.println("a class method");
     }
}
class B extends A
{
    void showB()
    {
        System.out.println("b class method");
    }
}
class C extends A
{
    void shoeC()
    {
        System.out.println("c class method");
    }
    public static void main(String []args)
    {
        // call only class A method
        A obj1 = new A();
        obj1.showA();
        System.out.println("_________________________________");

        // call only class A method & B
        B obj2 = new B();
        obj2.showA();
        obj2.showB();
        System.out.println("_____________________________________");

        // call only C class method & A class method not B class method
        C obj3 = new C();
        obj3.shoeC();
        obj3.showA();
        System.out.println("________________________________________");

    }
}

