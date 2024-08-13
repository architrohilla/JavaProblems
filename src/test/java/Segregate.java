import java.util.ArrayList;
import java.util.List;

public class Segregate {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        segr(arr);
    }
    public static void segr(int[] input){
//        int countEven = 0;
        List<Integer> OddList = new ArrayList<>();
        List<Integer> EvenList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if(input[i]%2==0){
                EvenList.add(input[i]);
            }
            else {
                OddList.add(input[i]);
            }
        }
        System.out.println("Odd numbers");
        for (int a : OddList) {
            System.out.print(a + ",");
        }
        System.out.println("Even numbers");
        for (int a : EvenList) {
            System.out.print(a + ",");
        }
//        System.out.println("Even no" + countEven);
//        int[] Even = new int[countEven];
//        int[] Odd = new int[input.length - countEven];
//        for (int i = 0; i < input.length; i++) {
//            int j = 0;
//            int k =0;
//            if(input[i]%2==0){
//                Even[j] = input[i];
//                System.out.println(Even[j]);
//                j++;
//            }
//            else {
//                Odd[k] = input[i];
//                k++;
//                System.out.println(Odd[k]);
//            }
//        }
//        for (int i = 0; i < Even.length; i++) {
//            System.out.print(Even[i] + ",");
//        }
//        for (int i = 0; i < Odd.length; i++) {
//            System.out.print(Odd[i] + ",");
//        }
    }
}
