class Sample {
    public static void charCheck(int asc) {
        if(asc>=65 && asc<=90){
            System.out.println("Uppercase");
        }
        else if(asc>=97 && asc<=122){
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Neither");
        }
    }
    public static int pivotIndex(int[] nums) {
        for (int j = 0; j < nums.length; j++) {
            int sumLeft = 0;
            int sumRight = 0;
            System.out.println("Iteration no : " + (j+1));
            for (int i = 0; i < j; i++) {
                sumLeft += nums[i];
            }
            System.out.println("Sum left : "+ sumLeft);
            for (int i = j+1; i < nums.length; i++) {
                sumRight += nums[i];
            }
            System.out.println("Sum Right : " + sumRight);
            if (sumLeft == sumRight){
                return j;
            }
            else if(nums[j]==sumRight || nums[j]==sumLeft){
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        char ch = 'a';
        int asc = (int) ch;
//        charCheck(asc);
        int[] nums = {1,7,3,6,5,22};
        int pivot = pivotIndex(nums);
        System.out.println(pivot);

    }
}