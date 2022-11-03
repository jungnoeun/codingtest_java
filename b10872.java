package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10872 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int N = Integer.parseInt(br.readLine());
    int result = 1;
    
    if(N == 0) result = 1;
    
    else {
      for(int i=N;i>0;i--) {
        result = result * i;
      }
    }
    
    System.out.println(result);
    
    br.close();
    
  }
  
}
