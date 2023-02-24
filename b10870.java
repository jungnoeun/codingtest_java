package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10870 {
  /**
   * �Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
   * �̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n �� 2)�� �ȴ�.
   * �Է� ù° �ٿ� n�� �־�����. n�� 20���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
   * ��� ù° �ٿ� n��° �Ǻ���ġ ���� ����Ѵ�.
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
