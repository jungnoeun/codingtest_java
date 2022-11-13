package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2864 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    
    String A = st.nextToken();
    String B = st.nextToken();
    
    System.out.print(countLeast(A) + countLeast(B) + " ");
    System.out.print(countMax(A) + countMax(B));
    
    br.close();
  }
  
  static int countLeast(String A) {
    int result=0;
    String sum = "";
    
    String[] strArr = A.split("");
    for (String s : strArr) {
      if(s.equals("6")) {
        sum = sum + "5";
      }else {
        sum = sum + s;
      }
    }
    
    result = Integer.parseInt(sum);
    
    return result;
  }
  
  static int countMax(String A) {
    int result=0;
    String sum = "";
    
    String[] strArr = A.split("");
    for (String s : strArr) {
      if(s.equals("5")) {
        sum = sum + "6";
      }else {
        sum = sum + s;
      }
    }
    
    result = Integer.parseInt(sum);
    
    return result;
  }
}
