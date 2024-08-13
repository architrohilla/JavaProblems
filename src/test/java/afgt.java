import java.util.HashMap;
import java.util.Map;

public class afgt {
    public static void main(String[] args){
        String input = "abbc";
        String input2 = "cbab";
        boolean outp = compare(input,input2);
        System.out.println("Strings matched : " + outp );
    }
    public static boolean compare(String input1, String input2){
        HashMap<Character,Integer> map1 = new HashMap<>();
        for (int i = 0; i < input1.length(); i++) {
            if (!map1.containsKey(input1.charAt(i))){
                map1.put(input1.charAt(i),1);
            }
            else {
                map1.put(input1.charAt(i), map1.get(input1.charAt(i)) + 1 );
            }
        }

        for (int i = 0; i < input2.length(); i++) {
            if (map1.containsKey(input2.charAt(i))){
                map1.put(input2.charAt(i),map1.get(input2.charAt(i)) - 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map1.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        for (Integer value : map1.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}
