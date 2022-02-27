import java.util.*;
public class matching_pairs {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);
        int result = 0;
        int i = 0;

        while (i < n) {
            int number = array[i];
            int count = 1;
            i++;
            while (i < n && array[i] == number) {
                count++;
                i++;
            }
            if (count >= 2) {
                result = result + count / 2;
            }
        }

        System.out.println(result);
    }
}
