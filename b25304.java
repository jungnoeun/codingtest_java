package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b25304 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int X = Integer.parseInt(br.readLine());
    int N = Integer.parseInt(br.readLine());
    int a,b;
    StringTokenizer st;
    int result=0;
    
    for(int i=0; i<N; i++) {
      st = new StringTokenizer(br.readLine());
      a = Integer.parseInt(st.nextToken());
      b = Integer.parseInt(st.nextToken());
      
      result = result + (a*b);
    }
    
    if(result == X) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
   
    br.close();
  }
}
