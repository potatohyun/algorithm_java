import java.util.Scanner;

/**
 * step4_10807
 * https://www.acmicpc.net/problem/10807
 */

public class step4_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        int cnt = 0;

        for(int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        
        int v= sc.nextInt();

        for(int i = 0; i < array.length; i++) {
            if (v == array[i]){
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();

        
    }
    
}
