import java.util.Scanner;

/**
 * step7_10798
 * https://www.acmicpc.net/problem/10798
 */


// 문자열 덧셈
// concat이나 +로 더할 수 있지만 한번 선언된 문자열은 변경이 불가능하다.
// 따라서 변경을 하려면 StringBuffer와 append()를 사용해줘야한다.
// 참고 : https://junghn.tistory.com/entry/JAVA-%EB%AC%B8%EC%9E%90%EC%97%B4-%EB%B6%99%EC%9D%B4%EB%8A%94-%EB%B0%A9%EB%B2%95concat-StringBuilder-StringBuffer
 public class step7_10798 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        int max_str = 0 ;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
            // 최대길이 찾기
            if (arr[i].length() > max_str) {
                max_str = arr[i].length() ;
            }
        }

        //문자열 합치기
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < max_str; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].length()>i) {
                    result.append(String.valueOf(arr[j].charAt(i)));
                }
                
            }
        }
        System.out.println(result);
        sc.close();
    }
 }