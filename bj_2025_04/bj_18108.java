package bj_2025_04;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int beYear = Integer.parseInt(br.readLine());
        int adYear = beYear - 543;

        System.out.println(adYear);

        br.close();
    }
}
