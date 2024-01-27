package chapter6.classDesign;

public class AbstractL {
    public static void main(String[] args) {
        System.out.println("test compile");
        // Animals anim1 = new Animals();
    }
    
}
class Dog extends Mammal{
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getClassification(){
        return classification;
    }
    public void setClassification(String className){
        classification = className;
    }


    void msg(){
        System.out.println(getName()+" "+getClassification());
    }
}

abstract class Animals{
    protected String name;
    protected int age;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public abstract void setAge(int age);
    public abstract void setName(String name);

}

abstract class Mammal extends Animals{
    protected String classification;
    public abstract String getClassification();
    public abstract void setClassification(String className);
}

class Poodle extends Dog{
    
}