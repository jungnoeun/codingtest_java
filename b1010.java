package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1010 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringTokenizer st;
    int N=0, M=0;
    int result = 0;
    
    
    for(int i=0; i<T; i++) {
      st = new StringTokenizer(br.readLine());
      N = Integer.parseInt(st.nextToken());
      M = Integer.parseInt(st.nextToken());
      result = 0;
      
      for(int k=1; k<=M-N; k++) {
        
     }
      
      System.out.println(result);
      
    }
    
    br.close();
    
     
     /**
      * 3
      2 2
      1 5
      13 29
      */
  }
  
  int countNum(int num) {
    int result=0;
    for(int i=1;i<=num;i++) {
      result += i;
    }
    return result;
  }
  
  
}
