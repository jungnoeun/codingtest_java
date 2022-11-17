package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2748 {
  // static int[] arr2;
  public static void main(String[] args) throws IOException {
    
    // Fn = Fn-1 + Fn-2 (n กร 2)
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    // arr2 = new int[N+1];
    long[] arr = new long[N+2];
     
    arr[0] = 0;
    arr[1] = 1;
    
    for(int i=2; i<=N; i++) {
      arr[i] = arr[i-1] + arr[i-2];
    }
    
    System.out.println(arr[N]);
    // System.out.println(fibo(N));
    br.close();
  }
  
  // static int fibo(int num) {
  //   if(num<2) arr2[num] = num;
    
  //   else {
  //     arr2[num] = fibo(num-2) + fibo(num-1);
  //   }
    
  //   return arr2[num];
  // }
  
}
