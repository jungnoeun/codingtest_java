package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10926 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringBuilder sb = new StringBuilder();
    String str = br.readLine();
    String plusStr = "??!";
    
    sb.append(str);
    sb.append(plusStr);
    
    System.out.println(sb);
    br.close();
    
  }
  
}
