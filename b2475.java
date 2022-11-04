package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2475 {
  public static void main(String[] args) throws IOException {
    
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   StringTokenizer st = new StringTokenizer(br.readLine());
   
   int[] arr = new int[5];
   int result = 0;
   
   for(int i=0; i<arr.length; i++) {
    arr[i] = Integer.parseInt(st.nextToken());
    arr[i] = arr[i] * arr[i];
    result += arr[i];
   }
   
   System.out.println(result%10);
   
   br.close();
    
  }
}
