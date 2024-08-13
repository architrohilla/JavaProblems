public class Problem2 {
    public static void main(String[] args){
        int[] arr = {7,5,2,3,3,6,5};
        maxProf(arr);
    }
    public static void maxProf(int[] input){
        int prof = 0;
        for (int i = 0; i < input.length-1; i++) {
            if(input[i]<input[i+1]){
                int diff = input[i+1]-input[i];
                prof = prof + diff;
            }
        }
        System.out.println(prof);
    }
}
