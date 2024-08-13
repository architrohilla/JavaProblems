import java.util.ArrayList;
import java.util.List;

public class LongestWord2 {
    public static void main(String[] args){
        List<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Mango");
        words.add("Pineapple");
        words.add("Grape");
        words.add("Orange");
        List<String> output = findLongestWords(words);
        for (String s:output){
            System.out.println(s);
        }
    }
    public static List<String> findLongestWords(List<String> words){
        int maxLength = 0;
        int i;
        List<String> back = new ArrayList<>();
        for(i=0;i< words.size();i++){
            if(words.get(i).length()>maxLength){
                maxLength = words.get(i).length();
            }
        }
        for(i=0;i< words.size();i++){
            if (words.get(i).length()==maxLength){
                back.add(words.get(i));
            }
        }
        return back;
    }
}
