public class ToThePower {
    public static long power(int x, int n) {
        //Write your code here
        long pow = 1;
        if(n==0){
            return 1;
        }
        else if(x==0){
            return 0;
        }
        else{
            while(n>=1){
                pow = pow*x;
                n--;
            }
            return pow;
        }
    }
    public static void main(String[] args){
        int num = 3;
        int power = 6;
        long result = power(num,power);
        System.out.println(result);
    }
}
