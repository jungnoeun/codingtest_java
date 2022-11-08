package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11653 {
  public static void main(String[] args) throws IOException {
    /**
     * ���� N�� �־����� ��, ���μ������ϴ� ���α׷��� �ۼ��Ͻÿ�.
     * N�� ���μ����� ����� �� �ٿ� �ϳ��� ������������ ����Ѵ�. N�� 1�� ��� �ƹ��͵� ������� �ʴ´�.
     * https://www.acmicpc.net/problem/11653
     */
    
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
     int N = Integer.parseInt(br.readLine());
     int[] arr = new int[N+1]; // �Ҽ� ���� ���� �迭
     int countN = N; 
     
     if(N == 1) {
      ;
     }
     
     // �����鼭 ����������� �� = �Ҽ� (i�� N���� -> ������������ �������� �����ϱ�)
     else {
      for(int i=2; i<=N; i++) {
       while(N%i == 0) {
          arr[i]++;
          N/=i;
        }
      }
    
      // ����� ������ŭ �ϳ��� ���
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
