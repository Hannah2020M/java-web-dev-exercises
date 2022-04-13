package exercises;

import java.lang.String;
import java.util.Arrays;

public class Array3dot7 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 5, 8};
        int l1 = arr1.length;
        String drSeuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        for (int i = 0; i < l1; i++) {
            if ((arr1[i] % 2) != 0) {
                System.out.println(arr1[i]);
            }//end of IF loopPrintsONLYoddNum in arr1
        }//end of 1st for-each LOOP on arr1
        String[] arr2 = drSeuss.split(" ");
        System.out.println(Arrays.toString(arr2));
        System.out.println("length of arr2 = "+arr2.length);
        String[] arr3 = drSeuss.split(",");
        System.out.println(Arrays.toString(arr3));
        System.out.println("length of arr3 = "+arr3.length);
        System.out.println("         Elements of array containing the "+arr3.length+" parts  of string drSeuss :-" );
        for (String y : arr3) System.out.println(y);
    }
}