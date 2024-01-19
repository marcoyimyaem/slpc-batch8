package chapter4;

public class MethodL {
    int loop;
    protected static String msg = "protected String";
    public int loop(){
        return 1;
    }
    private int loopPrivate(){
        return 3;
    }
    protected static final int loopProtected(){
        return 4;
    }
    void sayMoney(){
        return ;
    }
    public static void main(String[] args) {
        MethodL ml = new MethodL();
        MethodLPrivate m2 = new MethodLPrivate();
        System.out.println(ml.loop);
        System.out.println(ml.loopPrivate());
        System.out.println(ml.loopProtected());
        System.out.println(m2.num((int)m2.longs())); //m2.num((int)9L) 
    }
}

class MethodLPrivate{
    public int x(){
        MethodL m2 = new MethodL();
        //System.out.println(m2.loopPrivate());
        System.out.println(m2.loopProtected());
        return 0;
    }
    public int num(int a){
        int result = 0;
        if(a==4)   
            result = a;
        return result;
    }
    public long longs(){
        return 9L;
    }
}