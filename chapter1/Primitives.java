package chapter1;

public class Primitives {

    static int number;
    static Main m;
    public static void main(String[] args) {
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        String s1,s2, s3 = "yes",s4 =  "no";
        // String if = "hello";
        String Try="gfgdfg";
        System.out.println(number);
        {  int y = number;}
        System.out.println(notValid(34));
        // System.out.println(y); //error
        // public int getMe(){
        //     return 1;
        // }

    }
    static int notValid(int x){
        int y = 10; 
        // int x; 
        int reply = x + y; // DOES NOT COMPILE
        return reply;
    }

    public int valid() {
        int y = 10;
        int x; // x is declared here
        x = 3; // and initialized here
        int reply = x + y;
        return reply;
       }
}
