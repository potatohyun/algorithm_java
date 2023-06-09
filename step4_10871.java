import java.util.Scanner;

/**
 * step4_10871
 * https://www.acmicpc.net/problem/10871
 */

public class step4_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        
        int[] array = new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < X) {
                System.out.print(array[i]+" ");
            }
        }

        sc.close();
        

        
    }
    
}
