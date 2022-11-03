package codingtest_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class b2292 {

  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int dest = Integer.parseInt(br.readLine());
    int end = 1;
    int cnt = 1;
    
    while( dest > end ) {
      end += 6 * cnt;
      cnt++;
    }
    
  
    
    bw.write(String.valueOf(cnt));
    bw.flush();
    br.close();
    bw.close();
    
  }
  
}
