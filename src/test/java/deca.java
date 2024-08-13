public class deca {
    public static int[] decode(int[] encoded, int first) {
        int[] decoded = new int[encoded.length + 1];
        decoded[0] = first;
        for(int i=1;i<decoded.length;i++){
            decoded[i] = encoded[i-1]^decoded[i-1];
        }
        return decoded;
    }
    public static void main(String[] args){
        int[] encoded = {6,2,7,3};
        int first = 4;
        int[] decoded = decode(encoded,first);
        for (int i = 0; i < decoded.length; i++) {
            System.out.println(decoded[i]);
        }
    }
}
