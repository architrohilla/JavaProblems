import java.util.HashMap;
import java.util.Map;

public class Duplicate {
    public static void main(String[] args) {
        String[] arr = {"Java", "C", "C", "Java", "Ruby", "Python", "C", "Java","Java"};
        HashMap<String,Integer> result =funct(arr);
        for(Map.Entry<String,Integer> entry : result.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }

    public static HashMap<String, Integer> funct(String[] arr) {
        HashMap<String, Integer> count = new HashMap<>();
        for (int j = 0; j < arr.length; j++) {
            if (!count.containsKey(arr[j])) {
                count.put(arr[j], 1);
            }
            else{
                count.put(arr[j],count.get(arr[j])+1);
            }
        }
        return count;
    }
}
