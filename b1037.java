package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1037 {
  public static void main(String[] args) throws IOException {
    /**
     * 양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다. 
     * 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.
     * https://www.acmicpc.net/problem/1037
     */
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cnt = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr = new int [cnt];
    int tmp;
    
    for(int i=0; i<cnt; i++) {
      arr[i] = Integer.parseInt(st.nextToken());  
    }
    
    // 약수가 1개일때 -> 약수는 자기자신 포함x
    if(cnt == 1) {
      System.out.println(arr[0]*arr[0]);
    }
    
    // 약수가 1개가 아닐때 -> 가장 큰 약수 * 가장 작은 약수 = N -> 정렬
    else {
      for(int i=0; i<cnt-1; i++) {
        for(int j=i; j<cnt; j++) {
          if(arr[j] > arr[i]){
            tmp = arr[j];
            arr[j] = arr[i];
            arr[i] = tmp;
          }
        }
      }
      
      System.out.println(arr[0]*arr[cnt-1]);
    }
    
    br.close();
  }
}
