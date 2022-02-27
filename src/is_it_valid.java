import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class is_it_valid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String regex = "[a-zA-Z][a-zA-Z0-9_]{2,23}[a-zA-Z0-9]";

        Pattern p=Pattern.compile(regex);
        Matcher m = p.matcher(input);
        boolean b= Pattern.matches(regex,input);
        if(b){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}
