package exercises;
import java.util.Scanner;
import java.lang.String;
public class Alice {
    public static void main(String[] args){
        String givenPara = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String givenStr = givenPara.toUpperCase();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter search word: ");
        String userWord = input.nextLine();
        String searchWord = userWord.toUpperCase();
        System.out.println("Search term entered by user is found in string: "+givenStr.contains(searchWord));
        int startIndex = givenStr.indexOf(searchWord);
        System.out.println("Starting index of the search term '"+userWord+"' entered by the user: " +startIndex);
        System.out.println("Length of the search term entered by the user( '"+userWord+"' ): "+searchWord.length());
        int substrAddress = startIndex + searchWord.length() ;
        String myStr = givenPara.substring(0,givenPara.length());
        String word2remove = myStr.substring(startIndex,substrAddress);
        System.out.println("The search term entered by the user( '"+userWord+"' ),\n is found in the given string as '"+word2remove+"'");
        System.out.println("The original given string is :-");
        System.out.println("        "+myStr);//copy of original string by LC
        String str4 = myStr.replaceAll(word2remove, "");
        System.out.println("The original given string after removing the search term '"+userWord+"' is :-");
        System.out.println("        "+str4);
    }
}
