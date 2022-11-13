package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b5613 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int sum = Integer.parseInt(br.readLine());
    String str = "";
    int num = 0;
    
    while(true) 
    {
      str = br.readLine();
      
      if(str.equals("=")) break;
      
      num = Integer.parseInt(br.readLine());
      
      if(str.equals("+")) {
        sum += num; 
      }else if(str.equals("-")) {
        sum -= num;
      }else if(str.equals("*")) {
        sum *= num;
      }else if(str.equals("/")) {
        sum /= num;
      }
      
    }
    
    System.out.println(sum);
    
    br.close();
  }
}
