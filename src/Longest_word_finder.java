import java.util.List;
import java.util.Scanner;

public class Longest_word_finder {
    static String LongestWord(String sentence)
    {
        int longeststringLength=0;
        String longestword = "test";
        String[] arrOfStr = sentence.split(" ");

        for (String a : arrOfStr) {
            int stringLength = a.length();
            if(longeststringLength<stringLength) {
                longeststringLength=stringLength;
                longestword=a;
            }
        }
        return longestword;
    }

    public static void main(String args[])
    {


        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(LongestWord(sentence));

    }
}
