package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11719 {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String str = "";
    
    while((str = br.readLine()) != null || str == "\n") {
      System.out.println(str);
      str = "";  
    }
    
    br.close();
  }
}
  