package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11179 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long num = Long.parseLong(br.readLine());
    long num2 = num;
    StringBuilder sb = new StringBuilder();
    
    // 뒤집힌 2진수 구하기
    while(num2>=2) {
      long remain = num2%2;
      long div = num2/2;
      sb.append(remain);
      num2 = div;
    }
    
    String str = sb.append(num2).toString();
    // 2진수를 10진수로 바꾸기
    int res = Integer.valueOf(str,2);
    System.out.println(res);
    
    br.close();
  
  }
  
}
