import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ReverseOrder {
    public static void main(String[] args){
        String name = "Archit Rohilla";
        stringRev(name);
    }
    public static void stringRev(String name1){
        char[] input = name1.toLowerCase().toCharArray();
        HashMap<Character,Integer> name = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            name.put(input[i],1);
        }
        for(Map.Entry<Character,Integer> entry: name.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        for (int i = input.length-1; i >= 0 ; i--) {
            char temp = input[i];
            if(name.get(temp)>0){
                sb.append(temp);
                name.put(temp,name.get(temp)-1);
            }
        }
        System.out.println(sb);
    }
}
