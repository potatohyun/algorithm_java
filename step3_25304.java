import java.util.Scanner;
//////
public class step3_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        for(int i=0;i < N;i++){
            int price = sc.nextInt();
            int cnt = sc.nextInt();
            sum += (price * cnt);
        }
        if (sum == X) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
        
    }
}
