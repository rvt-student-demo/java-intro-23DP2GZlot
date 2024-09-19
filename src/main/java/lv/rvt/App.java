package lv.rvt;

import java.util.Scanner;

public class App 
{
    

    public static void main ( String[] args ) {
        Scanner reader = new Scanner(System.in);
       
        int first = Integer.valueOf(reader.nextLine());
        int second = Integer.valueOf(reader.nextLine());

        if (first > second) {
            System.out.println(first + " is greater than " + second);
        }if (first < second) {
            System.out.println(first + " is smaller than " + second);
        }if (first == second) {
            System.out.println(first + " is equal than " + second);
            
}
}
}




