import java.util.Arrays;
import java.util.Scanner;

/**
 * step4_10818
 * https://www.acmicpc.net/problem/10818
 */

//  배열 보이게 출력 : Arrays.toString(배열)

//  java 에서 최대 최소

// 방법1
// for 문

// 방법2
// Arrays.sort(배열명)

// 방법3
// Arrays.stream(arr).max().getAsInt())
// Arrays.stream(arr).min().getAsInt())
// stream에 관한거 : https://wakestand.tistory.com/419

public class step4_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        System.out.println(arr[0] + " " + arr[N-1] );


        sc.close();
    }
}
