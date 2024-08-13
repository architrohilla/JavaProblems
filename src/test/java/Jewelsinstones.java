import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Jewelsinstones {
    public static int countJewels(String jewels, String stones) {
        Map<Character, Integer> hm = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < stones.length(); i++) {
            char temp = stones.charAt(i);
            if(!hm.containsKey(temp)){
                hm.put(temp, 1);
            }
            else{
                hm.put(temp,hm.get(temp)+1);
            }
        }
        for (int i = 0; i < jewels.length(); i++) {
            if(hm.containsKey(jewels.charAt(i))){
                counter = counter + hm.get(jewels.charAt(i));
            }
        }
        return counter;
    }
    public static int countJewelUsingSet(String jewels, String stones){
        Set<Character> hm = new HashSet<>();
        int counter = 0;
        for (int i = 0; i < jewels.length(); i++) {
            hm.add(jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++) {
            if(hm.contains(stones.charAt(i))){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args){
        String j = "aA";
        String s = "aAAaabbbb";
        System.out.println("Counted using hashmap : "+ countJewels(j,s));
        System.out.println("Counted using hashset : " + countJewelUsingSet(j,s));
    }
}