package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2442 {
  public static void main(String[] args) throws IOException {
    /**
     * ù° �ٿ��� �� 1��, ��° �ٿ��� �� 3��, ..., 
     * N��° �ٿ��� �� 2��N-1���� ��� ����
     * ���� ����� �������� ��Ī�̾�� �Ѵ�.
     * 
     * n = 5
     * ��4��1
     * ��3��3
     * ��2��5
     * ��1��7
     * ��0��9
     */
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int star = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    int num = 1;
    
    for(int i=star; i>0; i--) { // 5 4 3 2 1
      for(int j = i-1; j>0; j--) {
        sb.append(" ");
      }
      for(int j=1; j<=2*(star-i+1)-1; j++) { // 1 2 3 4 5
        sb.append("*");
      }
      
      if(i!=1) sb.append("\n");
    }
     
    System.out.println(sb);
    br.close();
  }
}
