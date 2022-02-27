
import java.util.*;

public class breaking_of_word {
    static void wordBreak(int n, List<String> dict, String s)
    {
        String ans="";
        wordBreakUtil(n, s, dict, ans);
    }

    static void wordBreakUtil(int n, String s, List<String> dict, String ans)
    {
        for(int i = 1; i <= n; i++)
        {
            String prefix=s.substring(0, i);
            if(dict.contains(prefix))
            {
                if(i == n)
                {
                    ans += prefix;
                    System.out.println(ans);
                    return;
                }
                wordBreakUtil(n - i, s.substring(i,n), dict, ans+prefix+" ");
            }
        }
    }

    public static <T> List<T> ArrayToListConversion(T arr[])
    {
        List<T> list = Arrays.asList(arr);
        return list;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int nDic = sc.nextInt();
        String dic[] = new String[nDic+1];
        for(int i = 0; i <= nDic; i++)
        {
            dic[i] = sc.nextLine();
        }
        String inputsentence = sc.nextLine();
        int nInputsentence = inputsentence.length();

        List<String> dictioanry = ArrayToListConversion(dic);

        wordBreak(nInputsentence,dictioanry,inputsentence);
    }
}
