package chapter6.classDesign;

public class InterfaceL extends Mammal implements CanFly, CanBurrow,CanSwim{

    @Override
    public int getTemp(){
        return 15;
    }
    @Override
    public void fly(int speed) {
        
    }

    @Override
    public void takeoff() {
        
    }

    @Override
    public double dive() {
        return 0;
    }
    public static void main(String[] args) {
        InterfaceL l1 = new InterfaceL();
        l1.setClassification("dasdas");
        System.out.println(CanBurrow.getDurability());


   }

    @Override
    public void setClassification(String className) {

    }

    @Override
    public String getClassification() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getClassification'");
    }

    @Override
    public void setAge(int age) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAge'");
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }
}

interface CanFly{
    int POWER = 13;
    void fly(int speed);
    abstract void takeoff();
    public abstract double dive();
}
interface CanSwim{
    void setClassification(String className);
}
interface CanBurrow{
    default int getTemp(){
        return 10;
    }
    static int getDurability(){
        return 15;
    } 
    
}