package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q17265 {
    public static int min = Integer.MAX_VALUE;
    public static int max = Integer.MIN_VALUE;
    public static int[] dx = {1, 0};
    public static int[] dy = {0, 1};

    public static char[][] board = new char[6][6];

    public static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int i=0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j < N; j++){
                board[i][j] = st.nextToken().charAt(0);
            }
        }

        dfs(0, 0, board[0][0] - '0', board[0][0], board);
        System.out.print(max + " " + min);
    }

    public static void dfs(int x, int y, int ans, char what, char[][] map){
        for (int i=0; i < 2; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx <= N-1 && ny <= N-1){
                switch (board[nx][ny]){
                    case '+' :
                        dfs(nx, ny, ans, '+', map);
                        break;
                    case '-' :
                        dfs(nx, ny, ans, '-', map);
                        break;
                    case '*' :
                        dfs(nx, ny, ans, '*', map);
                        break;
                    default :
                        int check = 0;
                        switch (what){
                            case '+' :
                                check = ans + (board[nx][ny] - '0');
                                break;

                            case '-' :
                                check = ans - (board[nx][ny] - '0');
                                break;

                            case '*' :
                                check = ans * (board[nx][ny] - '0');
                                break;
                        }
                        if (nx == N-1 && ny == N-1){
                            max = Math.max(max, check);
                            min = Math.min(min, check);
                            return;
                        }
                        dfs(nx, ny, check, board[nx][ny], map);
                }
            }
        }
    }
}
