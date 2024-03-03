package com.company;

interface Bicycle
{
    int a=42;                         //properties are by default final i.e. fixed values
    void brakes(int decrement);
    void Speedup(int increment);
    void fun();
}

interface BicycleHorn
{
    int a = 89;
    void hornk3g();
    void hornmhn();
    void fun(int a);
}

class AvonCycle implements Bicycle,BicycleHorn    // can use multiple interface where multiple abstract not possible in abstract class
{
    void someFunction(){        //proof that, can also define other method rather than interface methods
//        System.out.println(a);     // // compilation error: Reference to 'a' is ambiguous, both Bicycle.a and BicycleHorn.a is matched
        System.out.println(Bicycle.a+" "+BicycleHorn.a);    // interfaceName.variableName required when two interfaces have same name variables and they are implemented by same class
    }
    public void brakes(int decrement){
        System.out.println("Applied brakes");
    }
    public void Speedup(int increment){
        System.out.println("Speed Ups");
    }
    public void hornk3g(){
        System.out.println("Kabhi Khushi Kabhi gum pee pee pe");
    }
    public void hornmhn(){
        System.out.println("Main hoon na poo poo po");
    }

    public void fun(){ // method of Bicycle interface

    }

    public void fun(int a){  // method fo BicycleHorn interface
        System.out.println("a");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        AvonCycle c = new AvonCycle();
        c.brakes(1);
        c.Speedup(5);

//        c.a=12;                      //cannot assign values to variables of interface as they are final

        //System.out.println(c.a);          //-----Runs Perfectly------

        c.hornk3g();
        c.hornmhn();

    }
}
