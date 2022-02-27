import java.util.Scanner;

public class sum_me_up {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int sum = 0;
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        String AdmissionNo = sc.nextLine();
        System.out.println(AdmissionNo);
        int admissionNo = Integer.valueOf(AdmissionNo);

        while (admissionNo > 9) {
            while ( 0 < admissionNo) {
                temp = admissionNo % 10;
                admissionNo /= 10;
                sum = temp + sum;
            }
            admissionNo=sum;
            sum=0;
        }
        System.out.println(admissionNo);
    }
}
