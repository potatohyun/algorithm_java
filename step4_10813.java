import java.util.Scanner;

/**
 * step4_10813
 * https://www.acmicpc.net/problem/10813
 */

public class step4_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i < M; i++) {
            int s = sc.nextInt(), e = sc.nextInt();
            int tmp1 = arr[s-1], tmp2 = arr[e-1];
            arr[s-1] = tmp2;
            arr[e-1] = tmp1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }      

        sc.close();

        
    }
    
}
