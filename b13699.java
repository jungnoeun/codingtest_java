package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b13699 {
  public static void main(String[] args) throws IOException {
    /**
     * 다음의 점화식에 의해 정의된 수열 t(n)을 생각하자:
     * t(0)=1
     * t(n)=t(0)*t(n-1)+t(1)*t(n-2)+...+t(n-1)*t(0)
     * t(1)=t(0)*t(0)=1
     * t(2)=t(0)*t(1)+t(1)*t(0)=2
     * t(3)=t(0)*t(2)+t(1)*t(1)+t(2)*t(0)=5
     */
    //
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    
    int sum = 0;
    int[] arr = new int[N+1];
    arr[0] = 1;
    
    for(int i=1; i<N; i++) {
      for(int j = N-i; j>=0 ; j--) {
        arr[i] += arr[i-1]*arr[j];  
      }
      
    }
    
    br.close();
  }
}
