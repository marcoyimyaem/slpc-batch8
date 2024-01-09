package chapter2;

import java.util.Scanner;

public class LoopsL {
    public static void main(String[] args) {
        int x = 1,y=6,z = 1;

        while(x<=5){
            System.out.print("x="+x+"\t");
            x++;

        }
        do{
            System.out.println("y="+y+"\t");
            y++;
        }while (y<=5);
        for(int a = 10;a>1;a--)
            System.out.println("a="+a);
        // for(;;) infinite loop
        //             System.out.println("a=");

        // for(;a>1;) valid
        String [] colors = {"Red","Green","Pink","Blue","Black","White"};
        for(String color: colors)
            System.out.println(color);
        // for (Student student : students) {
        //     student.LastName;
            
        // }

        // if(){
        //     if()
        //     else if()
        //     else
        // }
        // else{}
        for(int q=1;q<=10;q++){
            for(int w = 1;w<=10;w++)
                System.out.print(q*w+"\t");
            System.out.println();
        }
//optional labels
        System.out.println("******************************");
        ROW: for(int q=1;q<=10;q++){
        COL:    for(int w = 1;w<=10;w++){
                    System.out.print(q*w+"\t");
                    if(w==5)
                        break COL;
                    }
        NOTLOOP:    System.out.println();
        }

        System.out.println("******************************");
        ROW: for(int q=1;q<=10;q++){
        COL:    for(int w = 1;w<=10;w++){
                    if(w==5)
                        continue COL;
                    System.out.print(q*w+"\t");
                    }
                    
        NOTLOOP:    System.out.println();

        }
        
        float average = 0;
        int [] grades = {75,85,74,95,84,91};
        for(int grade: grades)
            {
                average +=grade;
            }
        System.out.println("your average grade is - "+average/6);
        Scanner input = new Scanner(System.in);
        float average2 = 0;
        int numofItems =0;
        System.out.println("enter grades ");

        while (input.hasNextInt()) {
            average2+=input.nextInt();
            numofItems++;
        }
        input.close();
        System.out.println("your average2 grade is - " + average2/numofItems);
        
                    
    }
}
