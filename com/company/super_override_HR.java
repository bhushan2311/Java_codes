package com.company;

class Cycle
{

    public String show_string()
    {
        return " I am a cycle with an engine.";
    }
}
class MotorCycle extends Cycle
{
    @Override
    public String show_string()
    {
        return "My ancestor is a cycle";
    }
    public MotorCycle(String s)
    {
        System.out.println(s + super.show_string());
        System.out.println(this.show_string() + " who is a vehicle with pedals.");
    }
}
public class super_override_HR {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        MotorCycle m = new MotorCycle("Hello I am a motorcycle,");

    }
}
