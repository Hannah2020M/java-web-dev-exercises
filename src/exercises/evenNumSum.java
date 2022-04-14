package exercises;

import java.util.ArrayList;

public class evenNumSum {
    public static Integer getEvenSum(ArrayList<Integer> arr2sum) {
        System.out.println("\n Even numbers in the given ArrayList :- ");
        int sum = 0;
        for (int i : arr2sum) {
            if ((i % 2 == 0)) {
                System.out.print(i + ", ");
                sum += i;
            }
        }
        System.out.println(" ");
        return sum;
    }
}
