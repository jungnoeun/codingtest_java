package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11022 {
  public static void main(String[] args) throws IOException {
    
  
    
    /**
     * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
     * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
     * 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
     */
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    int A, B;
    String result = "";
    
    for(int i=0;i<testCase; i++){
      st = new StringTokenizer(br.readLine());
      A = Integer.parseInt(st.nextToken());
      B = Integer.parseInt(st.nextToken());
      
      sb.append("Case #").append(i+1);
      sb.append(": ").append(A).append(" + ").append(B).append(" = ").append(A+B);
      result = sb.toString();
      System.out.println(result);
      
      sb.setLength(0);
    }

     br.close();
    
  }
}
