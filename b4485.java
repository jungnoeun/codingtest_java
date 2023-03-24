import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b4485 {
 public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  StringTokenizer st;
  
  int N = Integer.parseInt(br.readLine());
  int[][] arr = new int[N][N];
  for(int i=0; i<N; i++) {
    st = new StringTokenizer(br.readLine());
    for(int j=0; j<N; j++) {
      arr[i][j] = Integer.parseInt(st.nextToken());
    }
  }
  
  
 } 
}