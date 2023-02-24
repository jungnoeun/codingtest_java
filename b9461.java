import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b9461 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());

    long[] pado = new long[101];
    pado[0] = 0;
    pado[1] = 1;
    pado[2] = 1;
    pado[3] = 1;
    pado[4] = 2;
    pado[5] = 2;
    
    for(int j=6; j<101; j++) {
      pado[j] = pado[j-5] + pado[j-1];
    }
    
    for(int i=0; i<T; i++) {
      int N = Integer.parseInt(br.readLine());
      System.out.println(pado[N]);
    }
    
  }
}
