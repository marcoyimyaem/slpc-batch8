package chapter5;

import java.util.*;

public class LamdasL {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Fish", false, true,2));
        animals.add(new Animal("Kangaroo", true, false,5));
        animals.add(new Animal("Rabbit", true, false,1));
        animals.add(new Animal("Turtle", false, true,15));
        animals.add(new Animal("Frog", true, true,5));
        // print(animals, new CheckIfHopper());
        print(animals,a -> a.canHop());
        print(animals,a -> a.canSwim());
        print(animals,a -> a.canSwim() && a.canHop());
        print(animals, a->a.getSpecies().startsWith("F"));
        
        
        
    }
    private static void print(List<Animal> animals,CheckTriat checker){
        for(Animal animal:animals){
            if(checker.test(animal))
                System.out.print(animal +" | ");
        }
        System.out.println();
    }
}

class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;
    private int age;
    public Animal(String speciesName, boolean hopper, boolean swimmer,int age) {
    species = speciesName;
    canHop = hopper;
    canSwim = swimmer;
    this.age = age;
    }
    public boolean canHop() { return canHop; }
    public boolean canSwim() { return canSwim; }
    public String toString() { return species; }
    public int getAge(){ return age;}
    public String getSpecies(){ return species;}
    
   }