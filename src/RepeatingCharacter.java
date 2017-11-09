import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Ashwin on 11/8/17.
 */
public class RepeatingCharacter {
    public int findRepeatingCharacter(String s) {
        //int[] p = new int[s.length()];
        if (s == null || s.length() == 0) {
            return 0;
        }

        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (!linkedHashMap.containsKey(s.charAt(i))) {
                linkedHashMap.put(s.charAt(i), 1);
            } else {
                if(s.charAt(i) != s.charAt(i-1)) {
                    linkedHashMap.put(s.charAt(i), linkedHashMap.get(s.charAt(i)) + 1);
                }
            }
        }


        int maxValue = (Collections.max(linkedHashMap.values()));
        for (Map.Entry<Character, Integer> entry : linkedHashMap.entrySet()) {
            if(entry.getValue() == maxValue) {
                return (s.indexOf(entry.getKey()));
                //break;
            }

        }

        return 0;

    }
}
