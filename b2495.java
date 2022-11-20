package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2495 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    for(int i=0; i<3; i++) {
      String num = br.readLine();  // 1. 수 입력
      int result = continueNum(num); // 2. 같은 숫자가 연속하여 나오는 가장 긴 길이
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
    
    // 맨앞부터 같은 숫자개수 구하기
    for(int i=0; i<=num.length()-2; i++) {
      for(int j=i+1; j<num.length(); j++) {
        // 연속된 숫자가 나오는 경우 +1 
        if(num.charAt(i) == num.charAt(j)) {
          res++;
        } else {
          break;
        }
        
      }
      // 최대 길이 구하기
      if(res>=maxNum) maxNum = res;
        
      res = 0;
      
    }
    
    return maxNum;
  }
}
