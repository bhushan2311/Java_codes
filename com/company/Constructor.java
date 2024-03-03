package com.company;

/*class Default_const              //this class is just typed outside
{
    int a,b,c;
    public Default_const()
    {
//        int a=1; int b=2; int c=3;
        a=1; b=2; c=3;
    }
    public int show(){
        return a+b+c;             // to know more about return
    }

}*/
public class Constructor {
    //private int l,b,h;

    public Constructor(int l,int b,int h)             //parametrised Constructor
   {
        //l=10; b=12; h=11;
       System.out.println("Output of Parametrised constructor");
        System.out.println("Length "+l + " breadth "+b +" Height "+h);
    }
    int a,b,c;
    public Constructor()          //Constructor Overloading     //this method(class) is just copy pasted from above for Const. Over.
    {
//        int a=1; int b=2; int c=3;
        a=1; b=2; c=3;
    }
    public int show(){
        return (a+b+c);
    }
    public static void main(String []args)
    {
        Constructor c = new Constructor(10,12,11);          //called parametrised constructor
        //Default_const d = new Default_const();  //can use if there is Default class as written at top
        //int d=c.show();                        //  --------------------||----------------------------

        Constructor c1 = new Constructor();                        //called parametrised constructor
        int r=c1.show();
        System.out.println("Result by default constructor "+r);
    }
}
