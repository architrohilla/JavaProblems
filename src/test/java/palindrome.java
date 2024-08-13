public class palindrome {
    public static boolean fun(String input){
        char[] chars = input.toCharArray();
        int j = chars.length-1;
        System.out.println(chars.length);
            for (int i = 0; i < chars.length/2; i++) {
                if (chars[j] != chars[i]) {
                    return false;
                }
                else if (chars[j] == chars[i]) {
                    j--;
                }
            }
            return true;
    }
    public static void main(String[] args){
        String s = "maaaaddaaaam";
        boolean result = fun(s);
        System.out.println(result);
    }
}
