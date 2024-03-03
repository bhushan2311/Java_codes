package com.company;

abstract class Pen
{
    abstract public void write();
    abstract public void refill();
}
class FountainPen extends Pen
{
    @Override
    public void write(){
        System.out.println("I am overriden write method of abstract class Pen");
    }
    @Override
    public void refill(){
        System.out.println("I am overriden refill method of abstract class Pen");
    }
    public void changeNib(){
        System.out.println("I am changeNib method of concrete class Fountain pen");
    }
}
//--------------------------------------------------------
class Monkey
{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Bitten");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal
{
    @Override
    public void eat(){
        System.out.println("Eating is Comman in all living being");
    }
    @Override
    public void sleep(){
        System.out.println("All living being needs Sleep");
    }
    public void speak(){
        System.out.println("Speaking");
    }
}
//---------------------------------------------------------
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
public void ring(){
    System.out.println("Ringing");
        }
void lift(){
    System.out.println("Lifting");
        }
 void disconnect(){
     System.out.println("Disconnecting");
        }
        void TataIndicom(){
            System.out.println("I am Tata Indicom");
        }
}
//---------------------------------------------------------

interface TVremote{
    void changeVolume();
    void changeChannel();
}
interface SmartTVremote extends TVremote
{
    void playGame1();
    void playGame2();
}
class TV implements TVremote,SmartTVremote
{
   public void changeVolume(){
       System.out.println("Decreasing");
    }
    public void changeChannel(){
        System.out.println("Changing");
    }
   public void playGame1(){
       System.out.println("Snake And Ladders");
    }
    public void playGame2(){
        System.out.println("LUDO");
    }
}
public class CWH_PracticeSet_Abstract_Interfaces {
    public static void main(String[] args) {
        FountainPen p=new FountainPen();
        p.write(); p.refill(); p.changeNib();
//        Pen p1=new FountainPen();
//        p1.refill(); p1.write();
        System.out.println("------------------------------------------------");

        Human h=new Human();
        h.eat(); h.sleep(); h.bite(); h.jump();
        Monkey m = new Human();
//        m.speak();          //------------>Error  but can access jump() & access()
        BasicAnimal b= new Human();
//        m.speak();          //  ------>Error  but can access eat() & sleep

        System.out.println("------------------------------------------------");
        SmartTelephone st= new SmartTelephone();
        st.disconnect(); st.lift(); st.ring(); st.TataIndicom();
        Telephone t =new SmartTelephone();
//        t.TataIndicom();           // ------->Error cant access its child class methods but can access its own method
        System.out.println("------------------------------------------------");
        TV t1 = new TV();
        t1.changeChannel(); t1.changeVolume(); t1.playGame1(); t1.playGame2();
    }
}
