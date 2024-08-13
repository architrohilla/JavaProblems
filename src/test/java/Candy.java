import java.util.ArrayList;
import java.util.List;

public class Candy {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //calculate highest no of candies
        int max = 0;
        List<Boolean> output = new ArrayList<>();
        for(int i=0; i<candies.length;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]+extraCandies >= max){
                output.add(true);
            }
            else{
                output.add(false);
            }
        }
        return output;
    }
    public static void main(String[] args){
        int[] can = {2,3,1,1};
        int ex = 2;
        List<Boolean> output = kidsWithCandies(can,ex);
        for (Boolean bool : output){
            System.out.println(bool);
        }
    }
}
