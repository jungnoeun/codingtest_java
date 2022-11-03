package codingtest_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b10250 {
  public static void main(String[] args) throws IOException {
    
    int T;
    int H, W, N; // 類 熱, 寞 偃熱, 槳椒 熱
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    T = Integer.parseInt(br.readLine());
    
  
    
    StringTokenizer st;
    String result = "";
    int X=0, Y=0;
    
    
    for(int i=0; i<T; i++) {
     
      st = new StringTokenizer(br.readLine()," ");
      H = Integer.parseInt(st.nextToken());
      W = Integer.parseInt(st.nextToken());
      N = Integer.parseInt(st.nextToken());
     
      
      if(N%H == 0) {
        Y = N/H;
        X = H;
      }
      else {
        Y = N/H + 1;
        X = N % H;
      }
      
      
      
      if(Y<10){
        result = String.valueOf(X) +"0"+ String.valueOf(Y);
      }
      else {
        result = String.valueOf(X) + String.valueOf(Y);
      }
      
      
      
      bw.write(result + "\n");
      
      
      /**
       * 2
          6 12 10
          30 50 72
       */
      
    }
    
    bw.flush();
    br.close();
    br.close();
    
  }
}
