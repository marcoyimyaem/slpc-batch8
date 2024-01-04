package chapter2;

import java.util.Random;

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
        int q = 4;
        long p = 10;
        // q = q+p;
        System.out.println(q+=p); // compound assgnment ops : q = (type of q) q+p 
        long t = 4;
        long h = (t=5);
        //(5)
        System.err.println(t +"*****"+ h);
        Random r = new Random();
        Random z = new Random();
        System.out.println(r instanceof Random);
        JavaOps jo = new JavaOps();
        // System.out.println(jo instanceof Random);
        

        
    }
}
