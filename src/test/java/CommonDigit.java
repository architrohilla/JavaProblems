public class CommonDigit {
    public static void main(String[] args){
        int num1 = 234;
        int num2 = 343;
        boolean val = digitFunct(num1, num2);
        System.out.println(val);
    }
    public static boolean digitFunct(int num1, int  num2){
        int digits = 0;
        int temp2 = num1;
        while(temp2>0){
            int temp = temp2%10;
            digits++;
            temp2 = temp2/10;
        }
        System.out.println("Value of digits is " + digits);
        int[] numArr1 = new int[digits];
//        while(num1>0){
//            int i=0;
//            int temp = num1%10;
//            System.out.println(temp);
//            numArr1[i] = temp;
//            i++;
//            num1=num1/10;
//        }
        for(int i=0;i<digits;i++){
            int temp = num1%10;
            numArr1[i] = temp;
            num1=num1/10;
        }
        while(num2>0){
            int temp = num2%10;
            for(int i=0;i<digits;i++){
                if(numArr1[i]==temp){
                    return true;
                }
            }
            num2 = num2/10;
        }
        return false;
    }
}
