package java_homework_week_9;

import java.util.ArrayList;

 //Write a Java program to create a new array list, add some colours (string) and
//printout the collection using for each loop
public class ArrayListColours_4 {
    public static void main(String[] args) {
        ArrayList<String> colour = new ArrayList<>();// Arraylist creation

        colour.add("Green");
        colour.add("Orange");
        colour.add("Purple");
        colour.add("Pink");
        colour.add("Red");

        int size = colour.size();
        System.out.println("Size of ArrayList is :" + size);
        System.out.println();

        for (int i = 0; i<colour.size(); i++)// using simple  for loop to get the data from arraylist
        {
            System.out.println(colour.get(i));
        }

       // for (String col : colour) // using foreach loop to get the data from arraylist
        //{
            //System.out.println(col);
       // }
    }
}
