import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2630 {
  
  static int white = 0;
  static int blue = 0;
  static int[][] arr;
  static int end;
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st;
    end = N;
    arr = new int[N][N];
    
    for(int i=0; i<N; i++) {
      st = new StringTokenizer(br.readLine());
      for(int j=0; j<N; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    
    
    
  }
  
  public static void fibo(int N, int M) {
    
    if(N >= end-1 || M <end-1) {
      fibo(N, M+1);
    } 
    if(M >= end-1 || N<end-1) {
      fibo(N+1,M);
    }
    if(N >=end-1 || M >= end-1) {
      return;
    }
    
    if(arr[N][M] != arr[N][M+1]) {
      if(M == 1) {
        blue++;
      } else {
        white++;
      }
      fibo(N, N+1);
    }

    
    if(arr[N][M] != arr[N+1][M]) {
      if(N == 1) {
        blue++;
      } else {
        white++;
      }
      fibo(N+1, M);
    }
  
    
  }
  
}
