package com.company;
//to use getter and setter attributes must be private
class demo
{
    private int id;
    private String name;

    public void set(int setid){
//        if(setid<10 || setid>100)
//            System.out.println("ID must be in between 10 and 100");      //one of use of get & set is used to set boundary
//        else
            this.id=setid;                          //this can be or cannot be used
        //System.out.println(id);
    }
    public int get(){
        if(id<10 || id>100)
            System.out.println("ID must be in between 10 and 100");      //one of use of get & set is used to set boundary
        else
            return id;
        return 0;
    }

    public void setname(String n){
            this.name=n;
        }
        public String getName(){ return name;}
}

public class Getter_Setter {
    public static void main(String[] args) {
        demo d = new demo();
//        System.out.println("ID "+d.id + " Name "+d.name);    //if int & name aren't private
//       d.set(254);
        d.set(99);
       System.out.println(d.get());

       d.setname("John");
       System.out.println(d.getName());
    }
}
