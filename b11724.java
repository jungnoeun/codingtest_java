import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b11724 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int[][] arr = new int[N+1][N+1];
    boolean[] visited = new boolean[N+1];
    Queue<Integer> que = new LinkedList<>();
    int result = 0;
    
    for(int i=0; i<M; i++) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      arr[x][y] = 1;
      arr[y][x] = 1;
    }
    
    for(int i=1; i<=N; i++) {
      if(!visited[i]) {
        visited[i] = true;
        que.add(i);
        result++;
      }
      
      while(!que.isEmpty()) {
        int now = que.poll();
        for(int j=1; j<=N; j++) {
          if(arr[now][j] == 1 && !visited[j]) {
            que.add(j);
            visited[j] = true;
          }
        }
      }
    }
    
    System.out.println(result);
    br.close();
    
  }
}
