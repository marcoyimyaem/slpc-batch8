package chapter5;

public class VarAgrsL {
    public static int addAllInt(String name,int p,int... x){
        int result=0;
        for(int y:x)
            result+=y;
        System.out.println("Hello "+name); 
        return result;
        
    }
    private void yes1(){}
    protected void yes2(){}
    void yes3(){}

    public static void main(String[] args) {
        System.out.println("the sum of all numbers: "+addAllInt("Marco",9,8,7,2,4,2,1,45,1,5,54,4,45,2,4,4,5,5,5,5,4,52,12,4));
    }
}
//("Marco",9,8,7,2,4,2,1,45,1,5,54,4,45,2,4,4,5,5,5,5,4,52,12,4));
class Method32{
    
    public static void main(String[] args) {
        VarAgrsL vl = new VarAgrsL();
         System.out.println(VarAgrsL.addAllInt("John",14,5,24));
        //  vl.yes1(); //not visible
        vl.yes3();
    }   
}