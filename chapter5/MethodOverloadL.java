package chapter5;

public class MethodOverloadL {
    
}


class Character{
    String name;
    int Str;
    float hp;
    boolean canFly;
    int range;
    int charID;

    public String Char(short s){
        return "Short type";
    }
    public String Char(byte s){
        return "byte type";
    }
    public void Char(){} //Char(4)
    int Char(int Str){
        System.out.println("int");
        return Str;
    }
    float Char(float x){ //Char(4.0F)
        System.out.println("float");
        return 0;
    }
    boolean Char(boolean canFly){
        System.out.println("boolean");
        return (this.canFly == false)? (this.canFly=true):false;
    }
    String Char(String name){
        this.name = name;
        return "this is a string value: "+name;
    }
    @Override
    public String toString(){
        return "this is an override to string method";
    }
    String Char(int... numbers){
        return "Var args";
    }
    // String Char(int[] numbers){
    //     return "Array";
    // }
    int Char(int a,int b){
        System.out.println("int");
        return a+b;
    }
    int Char(Integer Str){
        System.out.println("Integer");
        return Str;
    }
    String Char(Object obj){
        System.out.println("Object");
        return obj.toString();
    }
    public static void main(String[] args) {
        Character mol = new Character();
        short q = 1;
        byte w = 2;
        Integer p = 34;
        System.out.println(mol);
        System.out.println(mol.Char(q));
        System.out.println(mol.Char(w));
        System.out.println(mol.Char("gfdhfgh"));
        System.out.println(mol.Char(q+w));
        System.out.println(mol.Char(1,1));
        System.out.println(mol.Char(1,1,1));
        System.out.println(mol.Char(1));
        System.out.println(mol.Char(p));
        System.out.println(mol.Char(3.33));
        System.out.println(mol.Char(new Main2()));
        
        
        
    }
}