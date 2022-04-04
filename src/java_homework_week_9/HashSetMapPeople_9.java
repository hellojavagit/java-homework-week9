package java_homework_week_9;

import java.util.HashMap;
import java.util.Map;

//Create a HashMap object called people that will store String keys and Integervalues:
// And use for each loop to iterate the value from Map.
public class HashSetMapPeople_9 {
    public static void main(String[] args) {
        Map <String,Integer>  people = new HashMap<>();
        people.put("ABC" , 123);
        people.put("DEF" , 456);
        people.put("GHI", 789);

        for (Map.Entry<String,Integer> people1 : people.entrySet())
        {
            System.out.println(people1);
    }
}
}