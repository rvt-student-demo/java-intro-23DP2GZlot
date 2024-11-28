package lv.rvt;
import java.io.*;
import java.util.ArrayList;

public class PersonManeger {
    public static void main(String[] args) throws Exception{
        ArrayList<Person> persons = PersonManeger.getPersonList();
        for (Person person : persons){
            System.out.println(person);
        }
    }
}
