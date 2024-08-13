public class Revers {
    public static void main(String[] args){
        String input="Hello World! How are you?";
        reverse(input);
//        System.out.println(rev);
    }
    public static void reverse(String input){
        String[] arr = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< arr.length;i++){
            String str = arr[i];
            char[] ar = str.toCharArray();
            int k = ar.length-1;
            for (int j = 0; j < k/2; j++) {
                char temp = ar[j];
                ar[j] = ar[k];
                ar[k] = temp;
                k--;
            }
            String temp = String.valueOf(ar);
//            StringBuilder sb2 = new StringBuilder();
//            sb2.append(arr[i]);
//            sb2.reverse();
//            String temp = sb2.toString();
            sb.append(temp);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
// "olleH !dlroW woH era ?uoy"