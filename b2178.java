import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b2178 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    Queue<Pos> que = new LinkedList<>();
    
    st = new StringTokenizer(br.readLine());
    
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    
    int[][] box = new int[N+1][M+1];
    int[] dy = {1,0,-1,0};
    int[] dx = {0,1,0,-1};
    
    for(int i=1; i<=N; i++) {
      String line = br.readLine();
      for(int j=1; j<=M; j++) {
        box[i][j] = line.charAt(j-1) - '0';
      }
      line = "";
    }
    
    que.add(new Pos(1, 1));
    
    while(!que.isEmpty()) {
      Pos pos = que.poll();
      int y = pos.y;
      int x = pos.x;
      
      for(int i=0; i<4; i++) {
        int ny = y + dy[i];
        int nx = x + dx[i];
        
        if(ny<=0 || ny>N || nx<=0 || nx>M) continue;
        
        if(box[ny][nx] == 1) {
          box[ny][nx] = box[y][x] + 1;
          que.add(new Pos(ny, nx));
        }
      }
    }
    
    System.out.println(box[N][M]);
    
  }
  
  static class Pos {
    int x;
    int y;
    
    Pos(int y, int x) {
      this.y = y;
      this.x = x;
    }
  }
  
}
