import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Tech {
    public static void main(String[] args){
        //We have to remove the duplicate integers from this array
        int[] arr = {1,2,3,4,5,6,1,2,3};
        removeDuplicate(arr);
    }
    public static void removeDuplicate(int[] arr){
        HashMap<Integer,Integer> ints = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            ints.put(arr[i],1);
        }

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        
        int siz = ints.size();
//        System.out.println(siz);
        int[] output = new int[siz];
        int i = 0;
        for(Map.Entry<Integer,Integer> entry : ints.entrySet()){
            output[i] = entry.getKey();
            i++;
        }
        System.out.println("Array after removing duplicates");
        for (int j = 0; j < output.length; j++) {
            System.out.print(output[j] + ",");
        }
    }
}
//try{
// WebElement abc = driver.findElement(By.id(""))}
//catch(){
// System.out.print("We found exception")}