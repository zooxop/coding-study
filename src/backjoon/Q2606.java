package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2606 {

    public static int[][] node;
    public static boolean[] visit;

    public static void bfs(int val){
        Queue<Integer> queue = new LinkedList<>();

        visit[val] = true;
        queue.offer(val);

        int cnt = 0;
        while(!queue.isEmpty()){
            int x = queue.poll();

            for(int i=1; i < node.length; i++){
                if(node[x][i] == 1 && !visit[i]){
                    queue.offer(i);
                    visit[i] = true;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        int pair = Integer.parseInt(br.readLine());

        node = new int[cnt+1][cnt+1];
        visit = new boolean[cnt+1];

        for(int i=0; i < pair; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            node[a][b] = 1;
            node[b][a] = 1;
        }

        bfs(1);

    }
}
