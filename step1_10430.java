/**
 * ste1_10430
 * https://www.acmicpc.net/problem/10430
 */

import java.util.Scanner;

// 문자열을 정수로 변환
// 방법1
// Integer.parseInt()
// 방법2
// Integer.valueOf()
// 방법2 는 new Interger(Integer.parseInt(s))와 동일한 셈이다. 즉 객체로 반환한다.

// 정수를 문자열로 반환 : Integer.toString(123) 

// 타입 확인 .getClass().getName()

public class step1_10430 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String tmp = sc.nextLine();
    sc.close();

    String[] stringsList = tmp.split("\\s");
    int A = Integer.parseInt(stringsList[0]);
    int B = Integer.parseInt(stringsList[1]);
    int C = Integer.parseInt(stringsList[2]);
    System.out.println((A+B)%C);
    System.out.println(((A%C) + (B%C))%C);
    System.out.println((A*B)%C);
    System.out.println(((A%C)*(B%C))%C);
   } 
}
