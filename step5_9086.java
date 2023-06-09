import java.util.Scanner;

/**
 * step5_9086
 * https://www.acmicpc.net/problem/9086
 */

//  문자열 입력받기
//  sc.next();//띄어쓰기로 끊음
//  sc.nextLine(); //줄바꿈을 기준으로 끊음

//  문자열 인덱스 처리
// String.charAt() + String.valueOf()

// 처음 풀 때 문자열을 nextLine로 받았는데 그러면 띄어쓰기도 문자열로 인식되서 무한한걸로 받아서 인덱싱 안된다... 뭐 그런오류인거 같음

public class step5_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String tmp = sc.next();
            System.out.println(String.valueOf(tmp.charAt(0))+String.valueOf(tmp.charAt(tmp.length()-1)));
        }
        sc.close();
    }
}
