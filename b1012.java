import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b1012 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Queue<Pos> que = new LinkedList<>();
    
    int T = Integer.parseInt(br.readLine());
    int result;
    
    for(int i=0; i<T; i++) {
      que.clear();
      result = 0;
      StringTokenizer st = new StringTokenizer(br.readLine());
      int M = Integer.parseInt(st.nextToken());
      int N = Integer.parseInt(st.nextToken());
      int K = Integer.parseInt(st.nextToken());
    
      int[][] arr = new int[N+1][M+1];
      boolean[][] visited = new boolean[N+1][M+1];
    
      for(int j=0; j<K; j++) {
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        arr[y][x] = 1;
      }
      
      for(int j=0; j<N; j++) {
        for(int k=0; k<M; k++) {
          if(arr[j][k] == 1 && !visited[j][k]) {
            que.add(new Pos(k,j));  
            visited[j][k] = true;    
            result++;      
          }
          
          while(!que.isEmpty()) {
            Pos pos = que.poll();
            int x = pos.x;
            int y = pos.y;
          
            if(y<N-1 && arr[y+1][x]==1 && !visited[y+1][x]) { // N=10 y<9. 접근은 9까지 가능. arr[9]
              visited[y+1][x] = true;
              que.add(new Pos(x, y+1));
            }
            if(x<M-1 && arr[y][x+1]==1 && !visited[y][x+1]) {
              visited[y][x+1] = true;
              que.add(new Pos(x+1, y));
            }
            
            if(y>0 && arr[y-1][x]==1 && !visited[y-1][x]) { // N=10 y<9. 접근은 9까지 가능. arr[9]
              visited[y-1][x] = true;
              que.add(new Pos(x, y-1));
            }
            
            if(x>0 && arr[y][x-1]==1 && !visited[y][x-1]) {
              visited[y][x-1] = true;
              que.add(new Pos(x-1, y));
            }
            
          }
          
        }
      }
      System.out.println(result);
    }
    
    br.close();
  }
  
  static class Pos {
    int x;
    int y;
    
    Pos(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }
  
}
