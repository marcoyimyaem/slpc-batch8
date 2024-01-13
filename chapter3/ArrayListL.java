package chapter3;
import java.util.*;

public class ArrayListL {
    public static void main(String[] args) {
        List<Food> Fooder = new ArrayList<>();
        Fooder.add(new Food(95, "Tapsilog", 2));
        Fooder.add(new Food(65, "Pares", 1));
        Fooder.add(new Food(99, "Halo-halo", 2));
        Food p = new Food();        
        System.out.println(Fooder.size());
        System.out.println("Total bill: P"+p.subtotal(Fooder));
        
    }
    
}

class Food{
    private int price;
    private String name;
    private int quantity;

    public Food(){}
    public Food(int price, String name, int quantity){
        this.price = price;
        this.name = name;
        this.quantity = quantity;

    }
    
    public int subtotal(List<Food> foods){
        int subtotal = 0;
        for(Food food: foods){
            subtotal+= food.price * food.quantity;
            System.out.println("*********\nItem name: "+food.name+"\nFood price: "+food.price+"\n qty: "+food.quantity+"\n******");
        }
        return subtotal;


    }
}