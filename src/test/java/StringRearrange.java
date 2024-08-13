class StringRearrange{
    public static String rearrangeMethod(String s,int indexx){
        String[] words = s.split("\\s+");
        if(words.length<=1){
            return s;
        }
        StringBuilder stBuilder = new StringBuilder();
        for(int i=indexx;i<words.length;i++){
            stBuilder.append(words[i]);
            stBuilder.append(" ");
        }
        for (int i=0; i<indexx; i++){
            stBuilder.append(words[i]);
            if(i<indexx-1){
                stBuilder.append(" ");
            }
        }
        return stBuilder.toString();
    }
    public static void main(String[] args){
        String s = "The quick";
        int indexx = 1;
        System.out.println(rearrangeMethod(s,indexx));
    }
}