package Inheritance.Single;

public class A // parent class
{
    void showA() // a class method
    {
        System.out.println("a class method");
    }

    public static class B extends A // inherit class A (B is Child-class)
    {
        void showB()  // b class method
        {
            System.out.println("b class method");
        }
        public static void main(String []args )
        {
            A obj1 = new A(); // create A class object
            obj1.showA();    // call method but only claas A call method
            // obj1.showB();

            B obj2 = new B(); // create b class object call the A&B class method
            obj2.showB();
            obj1.showA();
        }
    }
}
