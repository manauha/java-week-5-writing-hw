package homework_week_9;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer values:
 * And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> peopleNumber = new HashMap<>();
        // Add keys and values (Name, ID)
        peopleNumber.put("MONDAY", 102);
        peopleNumber.put("TUESDAY", 103);
        peopleNumber.put("WEDNESDAY", 104);
        peopleNumber.put("THURSDAY", 105);
        peopleNumber.put("FRIDAY", 106);
        peopleNumber.put("SATURDAY",101);
        peopleNumber.put("SUNDAY", 107);

        for (Map.Entry<String, Integer> peopleNum : peopleNumber.entrySet()){
            System.out.println(peopleNum.getKey() + " = " + peopleNum.getValue());
        }
    }
}
