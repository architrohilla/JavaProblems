public class palindromeNo {
    public static void main(String[] args){
        int a = 1771;
        if (palMethod(a)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
    public static boolean palMethod(int num){
        String str = Integer.toString(num);
        int j = str.length()-1;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(j)!=str.charAt(i)){
                return false;
            }
            else{
                j--;
            }
        }
        return true;
    }
}
