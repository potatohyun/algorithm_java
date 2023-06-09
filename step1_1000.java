/**
 * step1_1000
 * https://www.acmicpc.net/problem/1000
 */

//  java에서 입력값 받는 방법 1
//  system.in.read() : 정수형을 입력받음. 이걸로 받은 값은 아스키코드의 십진수로 표현된다.
//  java에서 입력값 받는 방법 2
//  Scanner : 유니코드로 문자를 입력 받는다.

import java.io.IOException;
import java.util.Scanner;

public class step1_1000 {
    public static void main(String[] args) throws IOException{
        
        // 방법1
        // int v1;
        // v1 = System.in.read();
        // System.out.println(v1);  // 0 -> 48

        // 방법2
        // Scanner sc = new Scanner(System.in);
        // int v1 = sc.nextInt();
        // System.out.println(v1);     // 0 -> 0
        // sc.close();

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        System.out.println(A+B);
    }
}
