package Polyporphism.RunTime;

public class Test // create class
{
    void show( String a, int b ) // crate method same argument
    {
        System.out.println("1");

    }
}
class XYZ extends Test   // inherit class Test use extends keyword
{
    void show(String a ,int b) // create method same name diff class
    {
        System.out.println("2");
    }
    public static void main (String [] args)
    {
        Test t = new Test(); // create object Test class call only text class method
        XYZ x = new XYZ();

        t.show("abc",29);  // call only Test class method
        x.show("vbd",98);  // call only XYZ class method
    }
}

