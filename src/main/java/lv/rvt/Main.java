package lv.rvt;
import java.util.Arrays;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) throws Exception {
        
        int[] intArr = {5, 4, 3, 7, 6, 2};
        double[] doubleArr = {5.6, 5.7, 5.9, 5.8};
        String[] stringArr = {"aa", "cc", "bb", "ab"};

        //Parastā masīva printēšana
        System.out.println(
            Arrays.toString(intArr)
        );

        //Masīva kārtošana
        Arrays.sort(doubleArr);

        System.out.println(
            Arrays.toString(stringArr)
        );
    }
}