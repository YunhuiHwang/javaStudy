package bj_2025_04;

import java.util.Scanner;

public class bj_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m >= 45) {
            m = m - 45;
        } else {
            h = h - 1;
            m = 60 + m - 45;
            if (h < 0) {
                h = 23;
            }
        }

        System.out.println(h + " " + m);
    }
}
