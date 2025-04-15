package bj_2025_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        double a = Double.parseDouble(input[0]);
        double b = Double.parseDouble(input[1]);

        System.out.println(a / b);

        br.close();
    }
}
