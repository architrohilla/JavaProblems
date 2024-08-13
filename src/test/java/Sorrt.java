import java.util.Arrays;

public class Sorrt {
    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for (int j = 0; j< n-1;j++) {
            //swap digits loop
            for (int i = 0; i < n-1-j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] selectionSort(int[] arr){
        int n = arr.length;
        for (int j = n-1; j >= 0; j--) {
//        int j = n-1;
            int max = arr[j];
            int maxIndex = j;
            for (int i = j; i >= 0; i--) {
                if (arr[i] > max) {
                    max = arr[i];
                    maxIndex = i;
                }
            }
            System.out.println(max + ":" + maxIndex);
            if (maxIndex != j) {
                int temp = arr[j];
                arr[j] = max;
                arr[maxIndex] = temp;
            }
        }
        return arr;
    }
    public static int[] insertSort(int[] arr){
        int n = arr.length;
        for(int j=1; j<n ;j++) {
            for (int i = j; i > 0; i--) {
//                int ins = arr[i];
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
                for (int k = 0; k < arr.length; k++) {
                    System.out.print(arr[k] + ", ");
                }
                System.out.println("----");
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {14,13,6,10,12,5,9};
        int[] sortedViaInsert = insertSort(arr);
        int[] sortedViaSelection = selectionSort(arr);
        int[] sortedViaBubble = bubbleSort(arr);
        int[] defaultsorted = Arrays.stream(arr).sorted().toArray();
        // Output with insertion sort method
        System.out.println("Output via Insertion Sort Algo");
        for (int j : sortedViaInsert) {
            System.out.print(j + " ");
        }
        System.out.println("-------");
        //Output with selection sort method
        System.out.println("Output via Selection Sort Algo ");
        for (int j : sortedViaSelection) {
            System.out.print(j + " ");
        }
        System.out.println("-------");
        //Output with bubble sort method
        System.out.println("Output via Bubble Sort Algo");
        for (int j : sortedViaBubble) {
            System.out.print(j + " ");
        }
    }
}
