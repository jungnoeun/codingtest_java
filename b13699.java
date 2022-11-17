package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b13699 {
  public static void main(String[] args) throws IOException {
    /**
     * ������ ��ȭ�Ŀ� ���� ���ǵ� ���� t(n)�� ��������:
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
     * ���� for���� ����ǵ�
     * �� �� for���� ����� ����� �Ұ��� ���� ���� --> N�� �ݺ�
     * �Ʒ� for���� 0~N-1 & N-1~0�� ���� ���� 
     * ���� for���� ������ ��������� ���Ͽ� �����ϴ� ����.
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
