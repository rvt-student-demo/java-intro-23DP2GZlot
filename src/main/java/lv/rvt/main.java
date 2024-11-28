package lv.rvt;

import java.io.*;
import java.util.ArrayList;

public class main {
  public static void main(String[] args){
  ArrayList<Person> persons = new ArrayList<>();
  String fileName = "persons.csv";

  // Step 1: Read the file
  try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
      String line = reader.readLine(); // Skip the header line
      while ((line = reader.readLine()) != null) {
          String[] parts = line.split(",");
          String name = parts[0];
          int age = Integer.parseInt(parts[1]);
          int weight = Integer.parseInt(parts[2]);
          int height = Integer.parseInt(parts[3]);
          persons.add(new Person(name, age, height, weight));

          

          
      }
  } catch (IOException e) {
      System.err.println("Error reading file: " + e.getMessage());
  }

  // Step 2: Print each Person object
  for (Person person : persons) {
      System.out.println(person);
  }

  // Step 3: Calculate and print average age
  if (!persons.isEmpty()) {
      double totalAge = 0;
      for (Person person : persons) {
        totalAge += person.getAge();
          
      }
      double averageAge = totalAge / persons.size();
      System.out.printf("Average age: %.2f\n", averageAge);
  }
}

}







    









    
  
  
      
      
  

        
    



        
    
        


            

            
            
            
            
        
    


    
    




    




          


        
        









