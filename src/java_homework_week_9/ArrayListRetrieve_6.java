package java_homework_week_9;

import java.util.ArrayList;

//Write a Java program to retrieve an element (at a specified index) from a given
// array list
public class ArrayListRetrieve_6 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();//defining array list
        myList.add(100);
        myList.add(200);
        myList.add(300);//adding elements to arraylist
        myList.add(400);
        myList.add(500);
        myList.add(600);
        myList.add(700);
        myList.add(800);
        myList.add(900);

        int size = myList.size();// to get the size of arraylist
        System.out.println("Size of Arraylist is " + size);
        System.out.println();

        System.out.println("Element at position 4 is " + myList.get(4));// retrieve element at position 4
        System.out.println("Element at position 8 is : " + myList.get(7));

    }
}
