package chapter6;
import chapter5.StaticImport;
import static chapter5.StaticImport.*;
public class StaticMain {
    public static void main(String[] args) {
        StaticImport si1 = new StaticImport();
        si1.una();
        tres();
        una();
        doz();
    }   
}
