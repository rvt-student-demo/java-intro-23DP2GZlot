package lv.rvt;

import java.util.Scanner;

public class App 
{
    

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        int i = 1;
        int res = 1;
        int number = Integer.valueOf(scanner.nextLine());
        for (i = 2; i <= number; i++) 
           res *= i; 
        System.out.println("Factorial: " + res);
       
          
     
    
       
            
}
}
        
        









