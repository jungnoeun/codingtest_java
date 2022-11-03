package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2480 {
  public static void main(String[] args) throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    int C = Integer.parseInt(st.nextToken());
    int result = 0;
    
    if(A == B) {
      if(B == C) {
          result = 10000 + (A * 1000);
      }
      else {
        result = 1000 + (A * 100);
      }
    }
    
    else if(A == C) { // A != B & A == C -> 1 2 1
      result = 1000 + (A * 100);
    }
    
    else if(B == C) { // B == C & A!=B & A != C -> 1 2 2
      result = 1000 + (B * 100);
    }
    
    
    else {
      int max =0;
      if(A>B) { 
        max = A;
        if(max < C) {
          max = C;
        }
      }
      else {
        max = B;
        if(max<C) {
          max = C;
        }
      }
    
      result = max * 100;
    }
    
    System.out.println(result);
    
    /**
     * ���� ���� 3���� ������ 10,000��+(���� ��)��1,000���� ����� �ް� �ȴ�. 
���� ���� 2���� ������ ��쿡�� 1,000��+(���� ��)��100���� ����� �ް� �ȴ�. 
��� �ٸ� ���� ������ ��쿡�� (�� �� ���� ū ��)��100���� ����� �ް� �ȴ�.  
     */
    
    
  }
  
}
