package lv.rvt;
import java.util.*;
import java.io.*;
import java.nio.file.StandardOpenOption;

public class Main {
 public static void main(String[] args) throws Exception{
    Scanner scanner = new Scanner(System.in);

    boolean isProgramRunning = true;
    System.out.println("Welcome to person manager, type \"help\" to see available commands.");
    while (isProgramRunning) {
        String command = scanner.nextLine();

        if (command.equals("exit")){
            System.out.println("Thanks, bye, bye!");
            isProgramRunning = false;
        }else if (command.equals("show")){

        }

        System.out.println("Your command was " + command);
    }
 }
    
}








    









    
  
  
      
      
  

        
    



        
    
        


            

            
            
            
            
        
    


    
    




    




          


        
        









