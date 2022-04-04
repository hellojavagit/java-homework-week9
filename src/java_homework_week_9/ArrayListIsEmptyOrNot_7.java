package java_homework_week_9;


//Write a Java program to test an array list is empty or not. Define array list with
//underground tube names

import java.util.ArrayList;

public class ArrayListIsEmptyOrNot_7 {
    public static void main(String[] args) {
       ArrayList <String> tubeNames = new ArrayList<>();

       tubeNames.add("Jubilee");
       tubeNames.add("Metroplolitan");
       tubeNames.add("District");
       tubeNames.add("Circle");
       tubeNames.add("Bakerloo");
       tubeNames.add("Northern");
       tubeNames.add("Picadally");

       int size = tubeNames.size();
        System.out.println("size of arraylist is :" + size);
        System.out.println();

        System.out.println( tubeNames.isEmpty());
        System.out.println();
        System.out.println("Entered Underground Tube Names are :");
        for (int i =0;i<tubeNames.size();i++)
        {
            System.out.println(tubeNames.get(i));
        }
    }

    }

