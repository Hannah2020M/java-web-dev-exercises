package exercises;
import java.lang.String;
public class Array3dot7 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 5, 8};
        int l = arr1.length;
        String drSeuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
//        for (int i=0; i<l; i++) {
//            System.out.println(arr1[i]);
//        }//end of 1st for-each LOOP on arr1 to printALLelements of arr1

        for (int i=0; i<l; i++) {
            if ((arr1[i] % 2) != 0) {
                System.out.println(arr1[i]);
            }//end of IF loopPrintsONLYoddNum in arr1
        }//end of 1st for-each LOOP on arr1
       String[] arr2 = drSeuss.split(" ",5);
        System.out.println(arr2);
    }
}
