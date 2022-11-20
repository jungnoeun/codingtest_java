package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2495 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    for(int i=0; i<3; i++) {
      String num = br.readLine();  // 1. �� �Է�
      int result = continueNum(num); // 2. ���� ���ڰ� �����Ͽ� ������ ���� �� ����
      if(result == 0) {
        System.out.println(1);
      }else {
        System.out.println(result+1);  
      }
      
    }
    
    br.close();
  }
  
  static int continueNum(String num) {
    int res=0;
    int maxNum =0;
    
    // �Ǿպ��� ���� ���ڰ��� ���ϱ�
    for(int i=0; i<=num.length()-2; i++) {
      for(int j=i+1; j<num.length(); j++) {
        // ���ӵ� ���ڰ� ������ ��� +1 
        if(num.charAt(i) == num.charAt(j)) {
          res++;
        } else {
          break;
        }
        
      }
      // �ִ� ���� ���ϱ�
      if(res>=maxNum) maxNum = res;
        
      res = 0;
      
    }
    
    return maxNum;
  }
}
