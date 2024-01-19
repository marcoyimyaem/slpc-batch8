package chapter5;

public class PassByVal {
    static int p = 0;
    public static void main(String[] args) {
        int x = 4;
        PassByVal pbv = new PassByVal();
        pbv.intNum(56);
        System.out.println(x);
    }
    public void intNum(int x){
        x = 5;
    }
    
}
