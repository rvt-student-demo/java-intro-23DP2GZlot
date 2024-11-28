package lv.rvt;
import java.io.*;

public class Person {
    private String name;
    private int age;
    private int height; 
    private int weight; 

    // Constructor
    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Height: " + height + " cm, Weight: " + weight + " kg";
    }

    public int getAge() {
        return age;
    }
    public int getPersonList() {
        return age;

    }
}
