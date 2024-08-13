import java.util.HashMap;
import java.util.Map;

public class Occurence {
    public static void main(String[] args){
        String name = "Archit Rohilla";
        findOccurence(name);
    }
    public static void findOccurence(String input1){
        HashMap<Character, Integer> map1 = new HashMap<>();
        String input = input1.toLowerCase();
        System.out.println("Input String " + input);
        for (int i = 0; i < input.length(); i++) {
            char temp = input.charAt(i);
            if(!map1.containsKey(temp)){
                map1.put(temp,1);
            }
            else{
                map1.put(temp, map1.get(temp)+1);
            }
        }
        for(Map.Entry<Character, Integer> entry: map1.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

// Feature : I want to create a new user
// Given : www.xyz.com
// And : /create
// When : request method - GET/POST
// AND
// 

// @Given(){
//
// }