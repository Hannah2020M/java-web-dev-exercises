package org.launchcode.java.studios.areaofacircle;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.lang.String;

public class studio3dot8CharCount {
    public static void main(String[] args) {
        //String testString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String testString = "I am coding";
        char[] charactersInString = testString.toCharArray();
        HashMap<Character, Integer> count = new HashMap<>();
        //iterate across characters in char[]
        for (char character : charactersInString) {
            //check if already in Hashmap as a key
            if (count.containsKey(character)) {
                //Increment the counter and increment value of key
                count.put(character, count.get(character) + 1);
                //count.getValue() +=;
            } else {//add and increment counter
                count.put(character, 1);
            }
            int mapCount = 0;
            for (Map.Entry<Character, Integer> entry : count.entrySet()) {
              System.out.println("map "+entry.getKey());
              System.out.print(entry.getKey() + " : " + entry.getValue()+ "   $$$");
              System.out.println("map done  "+count+"  iteration");
            }

            //  for(char c: count){System.out.println(c);}
            //if not
            // add and increment counter

        }

    }
}
    //  String myStr = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
//        String[] charactersInString = myStr.toCharArray();
//        int l = myStr.length();
//        System.out.println(l);
//       HashMap<Character, Integer> results = new HashMap<>();
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter character: ");
//        String userWord =  (input.nextLine());
//        System.out.println("user entered : "+userWord);
//        int c = 0;
//        for (int i = 0; i < l; i++) {
//        // System.out.println(myStr.contains(userWord));
//           // System.out.println(charactersInString[i]);
//            System.out.println(userWord);
//            if(charactersInString[i] == userWord){
//           // if(5<6){
//                c++;
//                System.out.println(userWord);
//              //  System.out.println(myStr.charAt[i]);
//            } System.out.println(c);
//            //System.out.println(myStr.charAt(i));
//             //  c = Character.char(userWord);
//        }
//
////        String string = "sashimi";
////
//    int count = 0;
//    String myStr = "I am coding";
//        for(int i=0;i<string.length();i++){
//        if(myStr.charAt(i).equals('I')){
//        count++;
//        }
//        }
////
////        System.out.println("The number of letter i is " + count);
//
