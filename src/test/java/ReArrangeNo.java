public class ReArrangeNo {
    public static void rearrange(int arr[],int n) {
        //Write your code here
        int[] output = new int[n];
        int o = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<0){
                output[o] = arr[i];
                o++;
            }
        }
        for (int i=0;i< arr.length;i++){
            if(arr[i]>=0){
                output[o]=arr[i];
                o++;
            }
        }
        for (int j : output) {
            System.out.println(j);
        }

    }
    public static void main(String[] args){
        int arr[] = {3, -1, 4, -2, 0, -5, 8, -7};
        int n = arr.length;
        rearrange(arr,n);
    }
}
