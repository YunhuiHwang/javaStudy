package java.bj_2025_04;

import java.util.Scanner;

public class bj_10871_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            if (A < X) {
                System.out.print(A + " ");
            }
        }
    }
}
