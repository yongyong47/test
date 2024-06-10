import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        
        for (int i = 1; i <= n; i++) {
            // 공백을 출력하는 루프
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 별을 출력하는 루프
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }
    }
}
