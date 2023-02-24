import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1463 {
  public static void main(String[] args) throws IOException {
    
    /**
     * https://www.acmicpc.net/problem/1463
     * 
     * ���� X�� ����� �� �ִ� ������ ������ ���� �� ���� �̴�.
     * 1. X�� 3���� ������ ��������, 3���� ������.
     * 2. X�� 2�� ������ ��������, 2�� ������.
     * 3. 1�� ����.
     * ���� N�� �־����� ��, ���� ���� ���� �� ���� ������ ����ؼ� 1�� ������� �Ѵ�. 
     * ������ ����ϴ� Ƚ���� �ּڰ��� ����Ͻÿ�.
     */
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    
    int[] arr = new int[N+1];
    arr[0] = 0;
    arr[1] = 0;
    

    for(int i=2; i<=N; i++) {
      arr[i] = arr[i-1] + 1;
      if(i%2 ==0) {
        arr[i] = Math.min(arr[i], arr[i/2]+1);
      }if(i%3 ==0) {
        arr[i] = Math.min(arr[i], arr[i/3]+1);
      }
    }
    
    System.out.println(arr[N]);
    
    br.close();
  }
}
