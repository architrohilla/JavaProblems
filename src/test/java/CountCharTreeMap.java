import java.util.Map;
import java.util.TreeMap;

public class CountCharTreeMap {
        public static void functMap(String s){
        TreeMap<Character, Integer> digitCounter = new TreeMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (digitCounter.containsKey(c)) {
                digitCounter.put(c, digitCounter.get(c) + 1);
            } else {
                digitCounter.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : digitCounter.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
        public static void main (String[]args){
        String s = "Archit Rohilla";
        String neo = s.toLowerCase();
        functMap(neo);
    }
}