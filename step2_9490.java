import java.util.Scanner;

/**
 * step2_94900
 * https://www.acmicpc.net/problem/9490
 */

public class step2_9490 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int count = sc.nextInt();
        sc.close();
        String score;
        if (count >= 90){
            score = "A";
        }
        else if (count >= 80) {
            score = "B";
        }
        else if (count >= 70){
            score = "C";
        }
        else if (count >= 60){
            score = "D";
        }
        else {
            score = "F";
        }
        System.out.println(score);
    }
    
}
