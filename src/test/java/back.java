public class back {
    public static void main(String[] args){
        int[] arr = {-1,-2,-4,1,2,5,4};
        int missingNo = missing(arr);
        System.out.println("missing no is " + missingNo);
    }
    public static int missing(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=i+1; j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]+1){
                if(arr[i-1]>0) {
                    return arr[i - 1] + 1;
                }
            }
        }
        return -1;
    }
}

