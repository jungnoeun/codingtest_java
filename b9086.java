package codingtest_java;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class b9086 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str;
    int Tnum = Integer.parseInt(br.readLine());
    for(int i=0; i<Tnum; i++) {
      str = br.readLine();
      System.out.println(str.charAt(0) + "" + str.charAt(str.length()-1));
      str = "";
    }
  
    br.close();
  }
}
