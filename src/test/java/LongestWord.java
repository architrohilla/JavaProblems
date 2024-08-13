import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestWord {
    public static List<String> findLongestWords(List<String> words){
        Map<String,Integer> countMap = new HashMap<>();
        int maxLength = 0;
        for(int i=0;i< words.size();i++){
            countMap.put(words.get(i),words.get(i).length());
            if(words.get(i).length()>maxLength){
                maxLength = words.get(i).length();
            }
        }
        List<String> retu = new ArrayList<>();
        int i = 0;
        for(Map.Entry<String,Integer> entry: countMap.entrySet()){
            if (entry.getValue()==maxLength){
//                retu.add(i,entry.getKey());
                retu.add(entry.getKey());
                i++;
            }
        }
        return retu;
    }
    public static void main(String[] args){
        List<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Mango");
        words.add("Pear");
        words.add("Grape");
        words.add("Orange");
        List<String> output = findLongestWords(words);
        for (String s:output){
            System.out.println(s);
        }
    }
}
