//Create hash map whose keys are1 to 15 and its values cube of keys.

import java.util.HashMap;
import java.util.Map;

public class CubeHashMap {
    public static void main(String[] args) {
        // Create a HashMap to store keys and values
        HashMap<Integer, Integer> map = new HashMap<>();

        // Populate the HashMap with keys from 1 to 15 and their cubes as values
        for (int i = 1; i <= 15; i++) {
           // System.out.println(map.put(i, i *i *i)); // this shows the how map allocate the space for key & values
            map.put(i, i * i * i);
        }

        // Print the HashMap to verify the results
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: "+entry.getKey() +", Value: " + entry.getValue());
        }
    }
}
