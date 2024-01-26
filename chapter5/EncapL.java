package chapter5;

public class EncapL {
    public static void main(String[] args) {
        ImmutableSwan im = new ImmutableSwan("Tita",3);
        System.out.println("Name:"+im.getName()+"\nnumer of eggs: "+im.getNumberOfEggs());
    }
    
}
class ImmutableSwan{
    public ImmutableSwan(String name,int numberOfEggs){
        this.name = name;
        if(numberOfEggs>=0)
            this.numberOfEggs = numberOfEggs;
        else{
            System.out.println("invalid number of eggs");
            this.numberOfEggs = 0;
        }
    }
    private String name;
    private int numberOfEggs;

    public String getName() {
        return this.name;
    }

    public int getNumberOfEggs() {
        return this.numberOfEggs;
    }
}