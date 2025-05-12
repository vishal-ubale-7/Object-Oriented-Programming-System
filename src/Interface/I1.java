package Interface;

 interface I1
 {
     public static final int a = 10; //  declared variable in interface
      void show(); // create abstract method
 }
 interface I2
 {
     void run();
 }
 interface I3
 {
     void eat();
 }
 class Test implements I1, I2,I3
 {
     public void show()  // add the public keyword
     {
         System.out.println("I1 Interface method");
     }

     public void run() // declared I2 interface
     {
         System.out.println("I2 Interface method");
     }

     public void eat()  // declared I3 interface
     {
         System.out.println("I3 Interface method");
     }

     public static void main(String []args)
     {
         Test t = new Test(); // create the object Test class
         t.show();            // call I1 interface method
         t.run();             // call I2 interface method
         t.eat();             // call I3 interface method
     }
 }

