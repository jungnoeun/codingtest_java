package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2480 {
  public static void main(String[] args) throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    int C = Integer.parseInt(st.nextToken());
    int result = 0;
    
    if(A == B) {
      if(B == C) {
          result = 10000 + (A * 1000);
      }
      else {
        result = 1000 + (A * 100);
      }
    }
    
    else if(A == C) { // A != B & A == C -> 1 2 1
      result = 1000 + (A * 100);
    }
    
    else if(B == C) { // B == C & A!=B & A != C -> 1 2 2
      result = 1000 + (B * 100);
    }
    
    
    else {
      int max =0;
      if(A>B) { 
        max = A;
        if(max < C) {
          max = C;
        }
      }
      else {
        max = B;
        if(max<C) {
          max = C;
        }
      }
    
      result = max * 100;
    }
    
    System.out.println(result);
    
    /**
     * 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
     */
    
    
  }
  
}
