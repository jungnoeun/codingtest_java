package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11945 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    String result = "";
    
    for(int i=0; i<N; i++) {
      String str = br.readLine();
      for(int j=M-1; j>=0; j--) {
        result = result+str.charAt(j);
      }
      System.out.println(result);
      result = "";
    }
    
    br.close();
  }
}
