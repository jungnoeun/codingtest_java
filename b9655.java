package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b9655 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    // ����̰� ������ �̱�� SK��, â���̰� ������ �̱�� CY�� ����Ѵ�.
    // ���� ���� �������ٰ� �����Ҷ�,
    // (N - 1) OR (N -3) = 1 -> �ٸ� ��� �¸� -> N = 2, 4
    // (N - 1) OR (N -3) = 2 -> ���� �¸� -> N = 3,5
    // (N - 1) OR (N -3) = 3 -> �ٸ� ��� �¸� -> N = 4,6
    /**
     * (N - 1) OR (N -3) = 4 
     * 1. 4 -1 = 3, 3 - 0 = 0 -> ���� �¸� -> N = 5,7
     */
    // (N - 1) OR (N -3) = 5 -> �ٸ� ��� �¸� -> N = 6,8
    // (N - 1) OR (N -3) = 6 -> ���� �¸� -> N = 7,9
    
    if(N%2 == 0) {
      System.out.println("CY");
    }else {
      System.out.println("SK");
    }
    
    br.close();
  }
}
