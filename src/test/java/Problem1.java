import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    //
    public static void main(String[] args){
        String input = "Fhgabcdefhdfhdjabcdefkdfdlkabckjgkjabcdelkljl";
        stringFrequency(input);
    }
    public static void stringFrequency(String input){
        int len = 5;
        Map<String, Integer> mapp = new HashMap<>();
        for (int i = 0; i < input.length()-4; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < i+5; j++) {
                char temp = input.charAt(j);
                sb.append(temp);
            }
            String temp1 = sb.toString();
//            System.out.println(temp1);
            if(!mapp.containsKey(temp1)){
                mapp.put(temp1,1);
            }
            else{
                mapp.put(temp1, mapp.get(temp1)+1);
            }
        }
        for (Map.Entry<String,Integer> entry: mapp.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
