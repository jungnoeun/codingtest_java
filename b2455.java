package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2455 {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    int min=0, plus=0;
    int now=0;
    int max=0;
    
    for(int i=0;i<4;i++) {
      
      st = new StringTokenizer(br.readLine());
      min = Integer.parseInt(st.nextToken());
      plus = Integer.parseInt(st.nextToken());
      
      // 내리는 사람 수 계산
      now = now - min;
      
      // 타는 사람 수 계산
      now = now + plus;
      
      
      if(max<now) {
        max = now;
      }
      
      
    }
    
    System.out.println(max);
    br.close();
    
  }
}
