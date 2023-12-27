package chapter1;
import java.util.*;
import java.util.Arrays;

public class Main{
    int num;
    String name;
    
    Main(){
        System.out.println("Main constructor is called");
       
    }
    public void Main(){ //void, all objects and primitives
        System.out.println("this is not a constructor");
    }
    public static void main(String[] nbnvbnvbn) {
        Random r = new Random();
        int[] s = new int[]{1,2,3,4,6,7};
        Arrays.sort(s);
        System.out.println("Hello world");
        System.out.println("random number generated is:"+r.nextInt(100));
        main(32);

    }
    static void main(int num){
        System.out.println(num);
    }
    {  num = 32;}
}

