import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReverseStringgg {
    public static void main(String[] args){
        String name = "123456543267";
        revMethod(name);
    }
    public static void revMethod(String input){
        char[] arr = input.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if(!map1.containsKey(input.charAt(i))){
                map1.put(input.charAt(i),1);
            }
            else{
                map1.put(input.charAt(i), map1.get(input.charAt(i))+1);
            }
        }
        for(Map.Entry<Character, Integer> entry: map1.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
