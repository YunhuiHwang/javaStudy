package bj_2025_04;
import java.util.Scanner;

public class bj_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();  // 총 금액
        int n = sc.nextInt();      // 항목 수
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int price = sc.nextInt();
            int count = sc.nextInt();
            sum += price * count;
        }

        if (sum == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


