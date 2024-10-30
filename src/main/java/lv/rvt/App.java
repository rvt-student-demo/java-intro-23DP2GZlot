package lv.rvt;

import java.util.Random;
import java.util.Scanner;

public class App {
        public static void main(String[] srgs){
                Scanner scanner = new Scanner(System.in);
                int secretNumber = 1 + (int)(10 * Math.random());  
                int maxAttempts = 3;  
                int attempts, guess;  
                System.out.println("I am thinking of a number from 1 to 10.");  
                System.out.println("You must guess what it is in three tries.");   
                System.out.println( "Enter your guess:"); 
                for (attempts = 0; attempts < maxAttempts; attempts++) {    
                    guess = scanner.nextInt();  
                    if (secretNumber == guess) {  
                        System.out.println("RIGHT!\r\n" + //
                                         "You have won the game.");  
                        break;  
                    } else if (secretNumber > guess && attempts != maxAttempts - 1) {  
                        System.out.println("wrong");  
                    } else if (secretNumber < guess && attempts != maxAttempts - 1) {  
                        System.out.println("wrong");  
                    }  
                }  
                if (attempts == maxAttempts) {  
                    System.out.println("You have lost the game.");
                    System.out.println("The correct number was " + secretNumber);  
                }  
            }  
        }


        
    
        


            

            
            
            
            
        
    


    
    




    




          


        
        









