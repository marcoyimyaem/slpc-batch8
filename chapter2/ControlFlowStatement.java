package chapter2;

import java.util.Scanner;

public class ControlFlowStatement {
    public static void main(String[] args) {
        boolean isReady = false;
        int y = 10;
        if(isReady){
            System.out.println("I am ready.");
            y=0;
        }
        System.out.println("done "+y);

        int time = 17;
        if(time<12)
            System.out.println("Good Morning");
        else
            System.out.println("Good afternoon");

        int time2 = 22;
        if(time2<12)
            System.out.println("Good Morning");
        else if(time2>12 && time2<18)
            System.out.println("Good Afternoon");
        else if(time2>18 && time2<24)
            System.out.println("Good Eve");    
        
        else
            System.out.println("invalid time");
        int dayofweek = 5;
        switch (dayofweek) {// int Integer,byte Byte,short Short, char Char, String, enum final and literals
            
            case 1: System.out.println("monday"); break;
            case 2: System.out.println("tuesday"); break;
            case 3: System.out.println("wednesday"); break;
            default:
                System.out.println("invalid day");
                break;
            case 4: System.out.println("thursday"); break;
            case 5: System.out.println("friday"); break;
            case 6: System.out.println("saturday"); break;
            case 7: System.out.println("sunday"); break;
        }
        Scanner input = new Scanner(System.in);
        System.out.println("enter a numer");
        System.out.println(input.nextInt()+" is a good number");
    }
}
