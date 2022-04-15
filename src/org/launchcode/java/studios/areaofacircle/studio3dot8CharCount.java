package org.launchcode.java.studios.areaofacircle;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;

public class studio3dot8CharCount {
    public static void main(String[] args) {
        int p =0;
        //String testString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String testString = "I am Hannah.";
        char[] charactersInString = testString.toCharArray();
        System.out.println(Arrays.toString(charactersInString));
        //Print to console:{ I=1, a-3, m=1, H=1, a=3, n=2, n=2, a=3, h=1}
        HashMap<Character, Integer> letterCount = new HashMap<>();

        for (char alphabet : charactersInString) {
            System.out.println(p);
            System.out.println(alphabet);
            if (letterCount.containsKey(alphabet)) {
                System.out.println(alphabet +" is in the HASHMAP letterCount.");
                letterCount.put(alphabet, letterCount.get(alphabet)+1);
            }//end of IF conditional
            else{System.out.println("Not present in letterCount HASHMap so adding this");
              letterCount.put(alphabet,1);
              p++;
            }  System.out.println("p = " +p);
            System.out.println("done with number "+p+" iteration");
            System.out.println("______________________________");

        }
        for (Character i : letterCount.keySet()) {
            System.out.println("key: " + i + " value: " + letterCount.get(i));
        }
    }
}