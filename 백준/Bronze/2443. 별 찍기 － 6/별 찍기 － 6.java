import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        
        // n개의 줄을 반복
        for (int i = n; i >= 1; i--) {
            // 왼쪽 공백을 출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 별을 출력
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }
    }
}
