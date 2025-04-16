package bj_2025_04;
import java.util.Scanner;

public class bj_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int repeat = n / 4;
        for (int i = 0; i < repeat; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}


