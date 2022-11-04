package codingtest_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b3003 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int[] ch = {1,1,2,2,2,8};
    int[] arr = new int[ch.length];
    
    for(int i=0; i<arr.length; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
      arr[i] = ch[i] - arr[i];
      bw.write(String.valueOf(arr[i] +" "));
    }
    
    bw.flush();
    br.close();
    bw.close();
    
  }
  
}
