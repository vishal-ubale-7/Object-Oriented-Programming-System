package Encapsulation;

public class Employee
{
    private int empid;        // create private keyword

    public void setEmpid(int eid)
    {
        empid=eid;            // create setter method
    }
    public int getEmpid()
    {
        return empid;        // create getter method
    }
}

class Company
{
    public static void main(String[] args)
    {
        Employee e = new Employee(); // create object Company class
        e.setEmpid(10);              // set the value
        System.out.println(e.getEmpid()); // get the value
    }
}
