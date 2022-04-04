package java_homework_week_9;

import java.util.HashSet;
import java.util.Set;

//Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
//Show which numbers are between 1 and 10 are in the set.
// (Hint: use for loop and if else)

public class HashSetContainsNumber_8 {
    public static void main(String[] args) {
        // creating an HashSet  called set
        Set <Integer> set = new HashSet<>();
        set.add(4); // Adding values to the set
        set.add(7);
        set.add(8);
        for ( int i =0;i<= 10;i++)// checking if elements are in the set using for and if else loops
        {
            if ( set.contains(i))
            {
                System.out.println(i + " is in the set");
            }
            else
                System.out.println(i + " Not in the Set");
        }
    }
}
