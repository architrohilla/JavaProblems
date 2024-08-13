import java.util.ArrayList;
import java.util.List;

public class gtmn {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,4,6,8,8};
        secondHighest(arr);
        List<Integer> number = new ArrayList<>();
        String a = "";
    }
    public static void secondHighest(int[] arr){
        int highest = arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]>highest){
                highest = arr[i];
            }
        }
        int second = arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]>second && arr[i]!=highest){
                second = arr[i];
            }
        }
        System.out.println(second);
    }
}
// checked and unchecked exception
// singleton design pattern
// how to switch from native to web in appium
// how scrolling works in appium - implement
// 3 common adb commands
// 3 common exceptions in appium
// how to go to home
// how to put app in background
// how to access notification bar
// how to run appium suite from command line
// table in selenium
// how to take screenshot - implement
// polymorphism in java
// pillars of java
// overriding and overloading
// switch b/w 2 apps in using appium
// how to parse text message using appium
// how to interact with permission dialogs in appium
// order of execution beforeSuite, beforeClass
// how to launch app and set desired capabilities
// listeners in testNG
// create db connection