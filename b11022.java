package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11022 {
  public static void main(String[] args) throws IOException {
    
  
    
    /**
     * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
     * ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
     * �� �׽�Ʈ ���̽����� "Case #x: A + B = C" �������� ����Ѵ�. x�� �׽�Ʈ ���̽� ��ȣ�̰� 1���� �����ϸ�, C�� A+B�̴�.
     */
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    int A, B;
    String result = "";
    
    for(int i=0;i<testCase; i++){
      st = new StringTokenizer(br.readLine());
      A = Integer.parseInt(st.nextToken());
      B = Integer.parseInt(st.nextToken());
      
      sb.append("Case #").append(i+1);
      sb.append(": ").append(A).append(" + ").append(B).append(" = ").append(A+B);
      result = sb.toString();
      System.out.println(result);
      
      sb.setLength(0);
    }

     br.close();
    
  }
}
