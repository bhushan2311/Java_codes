package com.company;

interface Camera
{
    void takesnap();
    void takevideo();
    private void Loading4k(){             //as it is private, it cannot use out of this interface
        System.out.println("Loading 4K...");
    }
    default void takevideo4k(){                //need not to redefine or implement in subclass which implements this interface
        Loading4k();
        System.out.println("Taking Video in 4K");
    }
}
interface Wifi
{
    void searchnetwork();
    void connectnetwork();
}
class Cellphone
{
    public void makecall(long phoneno){
        System.out.println("Calling "+phoneno);
    }
    public void pickcall(){
        System.out.println("Ringing");
    }
}
class SmartPhone extends Cellphone implements Camera,Wifi         //one class extends superclass and implements more than one interface
{
    //Defining Camera Interface Methods
    public void takesnap(){
        System.out.println("Clicking snap");
    }
    public void takevideo(){
        System.out.println("Taking video");
    }
    //Defining Wifi Interface methods
    public void searchnetwork(){
        System.out.println("Searching Network");
    }
    public void connectnetwork(){
        System.out.println("Connecting Searched Network");
    }
}
public class Interface_default {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.makecall(2488139);
        s.pickcall();

        s.takesnap();
        s.takevideo();
        s.takevideo4k();

        s.searchnetwork();
        s.connectnetwork();
    }
}
