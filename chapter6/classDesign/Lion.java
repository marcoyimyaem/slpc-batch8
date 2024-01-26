package chapter6.classDesign;

public class Lion extends Animal {

    public Lion(String name, int age, float weight, boolean isMale, boolean isWild,int numberOfTeeth, int speed) {
        // asdasdfqawsdf
        super(name, numberOfTeeth, speed, isMale, isWild);
        
        this.numberOfTeeth = numberOfTeeth;
        this.speed = speed;
    }
    int numberOfTeeth;
    int speed;
    public String animalSound(){
        return "Roar";
    }
    public static void main(String[] args) {
        Lion simba = new Lion("Simba", 15, 12,true, true, 32, 50);
        System.out.println(simba.getName());
        System.out.println(simba.animalSound());

    }
    
}
class Wolf extends Animal{

    public Wolf(String name, int age, float weight, boolean isMale, boolean isWild) {
        super(name, age, weight, isMale, isWild);
        
    }
    public String animalSound(){
        return "Howl UwU";
    }

    public static void main(String[] args) {
        Wolf lobo = new Wolf("Ursa", 0, 0, false, false);
        System.out.println(lobo.animalSound());
    }

}