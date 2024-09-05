package lv.rvt;


import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ievadi savu vardu:");

        String name = scanner.nextLine();

        System.out.println("Sveiks " + name);

        System.out.println("Hello RVT!");
        int age = 17;
        boolean isOnline = true;
        
    }

}
