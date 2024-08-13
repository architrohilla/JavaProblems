public class InsertWord {
    public static void insertWordMiddle(String original, String toInsert) {
        //Write your code here
        String[] words = original.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length/2;i++){
            sb.append(words[i]);
            sb.append(" ");
        }
        sb.append(toInsert).append(" ");
        for(int i=words.length/2;i<words.length;i++){
            sb.append(words[i]);
            if(i< words.length-1){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args){
        String s1 = "Hello World 123 456";
        String s2 = "programming";
        insertWordMiddle(s1,s2);
    }
}
