package java_homework_week_9;

import java.util.ArrayList;
import java.util.Iterator;
//Write a Java program to iterate through all elements in an array list using
//Iterator.
public class ArrayListIterator_5 {

    public static void main(String[] args) {

        ArrayList<Integer> elements = new ArrayList<>();//defining ArrayList
        elements.add(10);
        elements.add(20);
        elements.add(30);
        elements.add(40);
        elements.add(50);
        elements.add(60);

        int size = elements.size();//assinging arraylist size to size variable
        System.out.println("Size of ArrayList is : " + elements.size());
        System.out.println();

        //for(int i =0;i<elements.size();i++)// to get elements using for loop from arrayList
        //{
        //    System.out.println( elements.get(i));
        //}
        Iterator itr = elements.iterator();//using iterator to get the elements in ArrayList
        while(itr.hasNext())//loop works till expression is true
        {
            System.out.println(itr.next());
        }
    }
}
