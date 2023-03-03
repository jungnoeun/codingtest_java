import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b2606 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cnt = Integer.parseInt(br.readLine());
    int connect = Integer.parseInt(br.readLine());
    StringTokenizer st;
    Queue<Integer> que = new LinkedList<>();
    
    int[][] arr = new int[cnt+1][cnt+1];
    
    for(int i=0; i<connect; i++) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      
      arr[x][y] = 1;
      arr[y][x] = 1;
    }
    
    boolean[] visited = new boolean[cnt+1];
    visited[1] = true;
    que.add(1);
    int result = 0;
    
    while(!que.isEmpty()) {
      int now = que.poll();
      for(int i=1; i<=cnt; i++) {
        if(arr[now][i] ==1 && !visited[i]) {
          que.add(i);
          visited[i] = true;
          result++;
        }
      }
    }
    
    System.out.println(result);
    
    br.close();
    
  }
}
