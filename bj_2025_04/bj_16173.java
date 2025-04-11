package kr.co.javastudy.bj;

import java.util.Scanner;

public class bj_16173 {
    static int N;
    static int[][] map;
    static boolean[][] visited;

    static boolean dfs(int x, int y) {
        if (x >= N || y >= N || visited[x][y]) {
            return false;
        }
        visited[x][y] = true;

        if (map[x][y] == -1) {
            return true;
        }

        int jump = map[x][y];
        return dfs(x + jump, y) || dfs(x, y + jump);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        boolean result= dfs(0, 0);

        System.out.println(result ? "HaruHaru" : "Hing");
    }
}