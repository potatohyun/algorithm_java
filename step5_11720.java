import java.util.Scanner;
//////
public class step5_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        // System.out.println(str);
        char[] arr = str.toCharArray();	
        // System.out.println(Arrays.toString(arr));
        int sum = 0;
        for(int i=0;i<N;i++){
            // System.out.println(arr[i]);
            sum += (arr[i] - '0');
        }
        System.out.println(sum);

        sc.close();

    }
}