public class SumOddEven {
    public static void sumDigits(int numb){
        int sumEven = 0;
        int sumOdd = 0;
        while(numb>0){
            int temp = numb%10;
            if(temp%2==0){
                sumEven+=temp;
            }
            else{
                sumOdd+=temp;
            }
            numb = numb/10;
        }
        System.out.println(sumEven + " " + sumOdd);
    }
    public static void main(String[] args){
        int a = 98765;
        sumDigits(a);
    }
}
