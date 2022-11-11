package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2442 {
  public static void main(String[] args) throws IOException {
    /**
     * 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., 
     * N번째 줄에는 별 2×N-1개를 찍는 문제
     * 별은 가운데를 기준으로 대칭이어야 한다.
     * 
     * n = 5
     * 공4별1
     * 공3별3
     * 공2별5
     * 공1별7
     * 공0별9
     */
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int star = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    int num = 1;
    
    for(int i=star; i>0; i--) { // 5 4 3 2 1
      for(int j = i-1; j>0; j--) {
        sb.append(" ");
      }
      for(int j=1; j<=2*(star-i+1)-1; j++) { // 1 2 3 4 5
        sb.append("*");
      }
      
      if(i!=1) sb.append("\n");
    }
     
    System.out.println(sb);
    br.close();
  }
}
