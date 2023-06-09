import java.util.Scanner;

/**
 * step3_2739
 * https://www.acmicpc.net/problem/2739
 */

public class step3_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        sc.close();
        for (int i = 1; i < 10; i++) {
            System.out.println(Integer.toString(A)+" * "+Integer.toString(i)+" = "+i*A);
        }
        
    }
}
