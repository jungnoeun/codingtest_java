package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11653 {
  public static void main(String[] args) throws IOException {
    /**
     * 정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
     * N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.
     * https://www.acmicpc.net/problem/11653
     */
    
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
     int N = Integer.parseInt(br.readLine());
     int[] arr = new int[N+1]; // 소수 개수 담을 배열
     int countN = N; 
     
     if(N == 1) {
      ;
     }
     
     // 나누면서 나누어떨어지는 것 = 소수 (i는 N까지 -> 나눠떨어지지 않을수도 있으니까)
     else {
      for(int i=2; i<=N; i++) {
       while(N%i == 0) {
          arr[i]++;
          N/=i;
        }
      }
    
      // 계산한 개수만큼 하나씩 출력
      for(int i=2; i<=countN; i++) {
        int countArr = arr[i];
        while(countArr>0){
          System.out.println(i);
          countArr--;
        }
      }
    }
    
    br.close();
  }
}
