public class Abc {
        public static String defangIPaddr(String address) {
            char[] arr = address.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                String temp;
                temp = String.valueOf(arr[i]);
                if (temp.equals(".")) {
                    sb.append("[.]");
                }
                else{
                    sb.append(temp);
                }
            }
            return sb.toString();
        }
    public static String defangIPaddr2(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                sb.append("[.]");
            }
            else{
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }
    public static int countWords(String[] sentences){
            int maxCount = 0;
        for (int i = 0; i < sentences.length; i++) {
            int count = 1;
            for (int j = 0; j < sentences[i].length(); j++) {
                if(sentences[i].charAt(j)==' '){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount = count;
            }
        }
        return maxCount;
    }
    public static void main(String[] args){
            // input for defangIPaddr
//        String inp = "1.1.1.1";
//        String opu = defangIPaddr2(inp);
//        System.out.println("Final value of X is " + opu);
        //input for countWords
        String[] sent = {"alice and bob love leetcode a big word", "i think so too", "this is great thanks very much"};
        int maxi = countWords(sent);
        System.out.println(maxi);
    }
}
