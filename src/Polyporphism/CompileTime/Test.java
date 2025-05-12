package Polyporphism.CompileTime;

public class Test
{
    //void show(Object a)  // Auto Promotions
    void show (int a)// create method int pass parameter int a
    {
        System.out.println("Argument int A");
    }
    void  show(String a ) // pass the parameter string b
    {
        System.out.println("Argument String A");
    }

    public static void main(String []args)
    {
        Test t = new Test(); // create object
        t.show(100);    // call the method 1
        t.show("abc"); // call method 2
        //t.show('C');      // Auto-Promotion
    }

}
