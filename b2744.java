package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2744 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String first = br.readLine();

    for(int i=0; i<first.length(); i++) {
      char ch = first.charAt(i);
      if(Character.isUpperCase(ch)) {
        System.out.print(String.valueOf(ch).toLowerCase());
      }else {
        System.out.print(String.valueOf(ch).toUpperCase());
      }
    }
    
    br.close();
  }
}
