import java.util.Scanner;

/**
 * step2_1330
 * https://www.acmicpc.net/problem/1330
 */

public class step2_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        if (A > B) {
            System.out.println(">");
        }
        else if (A < B) {
            System.out.println("<");
        }
        else if(A==B) {
            System.out.println("==");
        }
    }
}
