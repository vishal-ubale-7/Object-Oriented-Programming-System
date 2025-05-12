package Inheritance.Multilevel;

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
class C extends B
{
    void showC()
    {
        System.out.println("c class method");
    }
    public static void main(String []args )
    {
        // ony class the A class method
        A obj1 = new A();
        obj1.showA();
        System.out.println("____________________________________");
         //Class B only class A&B class method not c
         B obj2 = new B();
         obj2.showA();
         obj2.showB();
        System.out.println("________________________________");

         // C class obj3 is class the all class method
         C obj3 = new C();
         obj3.showA();
         obj3.showB();
         obj3.showC();
        System.out.println("____________________________________");

    }
}
