package lv.rvt;


import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet savu vardu:");
        String name = scanner.nextLine();

        System.out.println("Ievadiet savu uzvardu:");
        String username = scanner.nextLine();

        System.out.println("Ievadiet savu gruppu:");
        String gruppa = scanner.nextLine();

        System.out.println(name + " " + username + " " + gruppa + " " );
        
        
    }

}
