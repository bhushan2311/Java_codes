package com.company;

class std
{
    int age,x=10;
    String name;
    static char batch='A';
    public void details(int a,String n)
    {
        age=a;name=n;
//        age = 999;
        batch = 'S';
//        System.out.println("Name="+n + " Age="+a + "Batch="+batch);
//        System.out.println(batch);
        System.out.println("Name="+n + " Age="+a + " batch:"+batch);
    }
    public static void show()
    {
//        System.out.println(x);      // cant access instance variable
        batch='B';                          // only static variable can access by static function not other variable...
        System.out.println("Batch "+batch);
    }

}

public class StaticDataMembers {

    public static void main(String args[])
    {
        String s1 = "aa";

        std s = new std();
//        System.out.println(s.age);
        System.out.println("Batch "+std.batch);  //static data members are always call by class name in main method
        s.details(13,"Aarti");
        s.details(13,"Bhushan");
        System.out.println(s.batch);
//        System.out.println(s.age);
//        System.out.println("S: "+s.batch);

//        std.show();
//        s.show();                // why it is accessing using object? it supposed to access using class name.
//        System.out.println("S: "+s.batch);
        s.details(13,"Astha");
        s.details(13,"Sarvesh");

//        System.out.println(s.name);
    }
}

//------------------------------------------------------------------------------

//class static_out{
//    public int x;
//    static int y;
//    void cal(int a,int b){
//        x+=a;
//        y+=b;
//    }
//
//    static{    // static block
//        i = 3;
//    }
//    static int i;
//}
//
//public class StaticDataMembers {
//    public static void main(String args[]) {
//        static_out s1 = new static_out();
//        static_out s2 = new static_out();
//        s1.x = 0;
//        s1.y = 0;
//        s1.cal(1,2);
//        s2.x=0;
//        s2.cal(2,3);
//        System.out.println(s1.x+" "+s2.y+" "+s2.x);
//
//        static_out s4 = new static_out();
//        static_out s3 = new static_out();
//        s4.x = 1;
//        System.out.println(s3.x);
//
//        System.out.println(s3.i);
//    }
//}