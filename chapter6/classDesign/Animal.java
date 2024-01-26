package chapter6.classDesign;

public class Animal {

    public Animal(String name, int age, float weight, boolean isMale, boolean isWild) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isMale = isMale;
        this.isWild = isWild;
    }
    public String animalSound(){
        return "unknown noise";
    }
    protected String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isIsMale() {
        return this.isMale;
    }

    public boolean getIsMale() {
        return this.isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public boolean isIsWild() {
        return this.isWild;
    }

    public boolean getIsWild() {
        return this.isWild;
    }

    public void setIsWild(boolean isWild) {
        this.isWild = isWild;
    }
    protected int age;
    protected float weight;
    protected boolean isMale;
    protected boolean isWild;
}
