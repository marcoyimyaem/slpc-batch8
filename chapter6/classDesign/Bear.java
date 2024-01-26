package chapter6.classDesign;

public class Bear {
    public static void eat(){
        System.out.println("Bear is eating");
    }
    
}

class Panda extends Bear{
    public static void eat(){
        System.out.println("Panda Bear is chewing bamboo");
        
    }
    //  void callBear(){
    //     super.eat();
    // }
    public static void main(String[] args) {
        Panda p1 = new Panda();
        Bear p2 = new Panda();
        Panda.eat();
        p1.eat();
        p2.eat();
    }
}