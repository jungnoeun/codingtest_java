import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2193 {
  public static void main(String[] args) throws IOException {
    
    /**
     * ��ģ���� 0���� �������� �ʴ´�.
     * ��ģ�������� 1�� �� �� �������� ��Ÿ���� �ʴ´�. ��, 11�� �κ� ���ڿ��� ���� �ʴ´�.
     */
    
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int N = Integer.parseInt(br.readLine());
     
     long[] arr = new long[91];
     
     arr[0] = 0;
     arr[1] = 1; // 1
    //  arr[2] = 1; // 10
    //  arr[3] = 2; // 100 101
    //  arr[4] = 3; // 1000 1001 1010 
    //  arr[5] = 4; // 10000 10001 10010 10101 
    //  arr[6] = 7; // 100000 100001 100010 100100 101000 101010 101001
     
     for(int i=2; i<=N; i++) {
      arr[i] = arr[i-2] + arr[i-1];
     }
    
    System.out.println(arr[N]);
     
  }
}
