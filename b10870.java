package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10870 {
  /**
   * 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
   * 이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
   * 입력 첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.
   * 출력 첫째 줄에 n번째 피보나치 수를 출력한다.
   * @param args
   */
  
  
  public static void main(String[] args) throws IOException {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  //  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
   int N = Integer.parseInt(br.readLine());
   int result = fibo(N);
  
   System.out.println(result);
    
  }
  
  public static int fibo(int num) {
    if(num == 0) {
      return 0;
    }
    if(num == 1) {
      return 1;
    } 
    
    return fibo(num-1) + fibo(num-2);
  }
  
}
