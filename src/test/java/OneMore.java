public class OneMore {
    public static void main(String[] args){
        //find the 3rd largest element in the array
        int[] arr = {1, 14, 2, 16, 10, 20};
        largest(arr);
    }
    public static void largest(int[] arr){
        int largest1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest1){
                largest1 = arr[i];
            }
        }

        int largest2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest2 && arr[i]<largest1){
                largest2 = arr[i];
            }
        }
        int largest3 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest3 && arr[i]<largest2){
                largest3 = arr[i];
            }
        }
        System.out.println("largest 1 " + largest1);
        System.out.println("largest 2 " + largest2);
        System.out.println("largest 3 " + largest3);
    }
}
