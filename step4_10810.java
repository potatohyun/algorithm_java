import java.util.Scanner;

/**
 * step4_10810
 * https://www.acmicpc.net/problem/10810
 */

public class step4_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < M; i++) {
            int s = sc.nextInt(), e = sc.nextInt(), ball_num = sc.nextInt();
            for (int tmp = s-1 ; tmp < e ; tmp++){
                arr[tmp] = ball_num;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }      

        sc.close();

        
    }
    
}
