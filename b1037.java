package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1037 {
  public static void main(String[] args) throws IOException {
    /**
     * ��� A�� N�� ��¥ ����� �Ƿ���, N�� A�� ����̰�, A�� 1�� N�� �ƴϾ�� �Ѵ�. 
     * � �� N�� ��¥ ����� ��� �־��� ��, N�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
    
    // ����� 1���϶� -> ����� �ڱ��ڽ� ����x
    if(cnt == 1) {
      System.out.println(arr[0]*arr[0]);
    }
    
    // ����� 1���� �ƴҶ� -> ���� ū ��� * ���� ���� ��� = N -> ����
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
