import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b10451 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringTokenizer st;
    Queue<Integer> que = new LinkedList<>(); 
    int result = 0;
    
    for(int i=0; i<T; i++) {
      int N = Integer.parseInt(br.readLine());
      st = new StringTokenizer(br.readLine());
      result = 0;
      que.clear();
      int[][] arr = new int[N+1][N+1];
      boolean[] visited = new boolean[N+1];
      
      for(int j=1; j<=N; j++) {
        int next = Integer.parseInt(st.nextToken());
        arr[j][next] = 1; 
      }
      
      for(int j=1; j<=N; j++) {
        if(!visited[j]) {
          visited[j] = true;
          que.add(j);
          result++;
        }
        
        while(!que.isEmpty()) {
          int now = que.poll();
          for(int k=1; k<=N; k++) {
            if(arr[now][k]==1 && !visited[k]) {
              visited[k] = true;
              que.add(k);
            }
          }
        }
        
      }
    
      System.out.println(result);
    }
    
    br.close();
  }
}
