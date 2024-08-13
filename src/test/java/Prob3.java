public class Prob3 {
    public static void main(String[] args){
        int[] arr = {7,5,4,3,3,8,9};
        maxProf(arr);
    }
    public static void maxProf(int[] input){

        int Maxx = 0;
        for (int i = 0; i < input.length-1; i++) {
            int MaxProf = 0;
            for (int j=i+1;j<input.length;j++){
                int prof = 0;
                if(input[j]>input[i]){
                    prof = prof + input[j] - input[i];
                    if(prof>MaxProf){
                        MaxProf = prof;
                    }
                }
            }
            if(MaxProf>Maxx){
                Maxx = MaxProf;
            }
        }
        System.out.println(Maxx);
    }
}