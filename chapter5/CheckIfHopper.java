package chapter5;

public class CheckIfHopper implements CheckTriat {

    @Override
    public boolean test(Animal a) {
       return a.canHop();
    }
    
}
