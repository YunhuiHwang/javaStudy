package kr.co.javastudy.bj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_9996_02 {
    /*
     * 파일 개수 N개 입력(1<=N<=100)
     * a*b, ab*f, ab*bc 처럼 별이 가운데 들어가는 패턴 입력
     * '*'에다가 임의의 알파벳 넣으면 파일 이름 복구 가능(패턴보다 짧으면 X)
     * 파일 이름 N개 입력
     * 이름 패턴 일치하면 DA, 아니면 NE
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String ptn = br.readLine();
        String[] ptnArr = ptn.split("\\*");
        for (int i = 0; i < num; i++) {
            String name = br.readLine();
            if (name.length() < (ptn.length() - 1)) {
                System.out.println("NE");
            } else {
                if (name.startsWith(ptnArr[0]) && name.endsWith(ptnArr[1])) {
                    System.out.println("DA");
                } else {
                    System.out.println("NE");
                }
            }
        }
        br.close();
    }
}
