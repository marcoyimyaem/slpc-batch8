package chapter2;

public class JavaOps {
    public static void main(String[] args) {
        int y = 4;
        double x = 3 + 2 * --y;
        System.out.println(x);
        int marc = 0;
        marc++;
        System.out.println(marc);
        System.out.println(--marc);
        System.out.println(3<<2);
        // 0000 0011
        // 0000 1100
        System.out.println(20>>2);
        //0001 0100
        //0000 0101
        Integer test = 20;
        System.out.println(Integer.toBinaryString(test));
        System.out.println((20>>3)+5);
        //0001 0100
        //1000 0010
    }
}
