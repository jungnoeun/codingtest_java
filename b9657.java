package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b9657 {
  public static void main(String[] args) throws IOException {
    // ���� 1��, 3�� �Ǵ� 4�� ������ �� �ִ�. ������ ���� �������� ����� ������ �̱�� �ȴ�.
    // ������ ����̰� ���� �����Ѵ�.
    // ����̰� ������ �̱�� SK��, â���̰� ������ �̱�� CY�� ����Ѵ�.
    // ���� ���� �������ٰ� �����ϸ�,
    // (N - 1) OR (N -3) OR (N -4)
    // 0 -> �ٸ� ���
    // 1 -> ��
    // 2 -> �ٸ� ��� �¸�
    // 3 -> ��
    // 4 -> ��
    // 5 -> ��
    // 6 -> ��

    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    
    
    if(N%7 ==0 || N%7 ==2) {
      System.out.println("CY"); 
      
    }else {
      System.out.println("SK");
    }
    
    br.close();
  }
}
