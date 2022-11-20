package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1463 {
  public static void main(String[] args) throws IOException {
    
    /**
     * https://www.acmicpc.net/problem/1463
     * ù° �ٿ� ������ �ϴ� Ƚ���� �ּڰ��� ����Ѵ�.
     */
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int cnt = 0;
    
    while(true) {
      if(N == 1) break;
      
      cnt++;
      if(N%3 == 0) N = N/3;
      else if(N%2 == 0) N = N/2;
      else {
        N--;
      }
    }
    
    
    
    br.close();
  }
}
