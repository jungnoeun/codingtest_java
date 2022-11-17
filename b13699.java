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
    
    long[] arr = new long[N+2];
    arr[0] = 1;
    arr[1] = 1;
    
    /**
     * 이중 for문을 만들건데
     * 맨 위 for문은 몇번의 계산을 할건지 세는 역할 --> N번 반복
     * 아래 for문은 0~N-1 & N-1~0을 세는 역할 
     * 이중 for문의 내용은 곱셈결과를 더하여 저장하는 내용.
     */
    
    for(int i=2 ; i<=N; i++) { 
      for(int j = 0; j<i ; j++) { 
        arr[i] += arr[j]*arr[i-j-1];  
      }
    }
    
    System.out.println(arr[N]);
    
    br.close();
  }
}
