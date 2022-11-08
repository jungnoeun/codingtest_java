package codingtest_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class b10808 {
  public static void main(String[] args) throws IOException {
    /**
     * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
     * 
     */
    
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     String str = br.readLine();
     int[] arr = new int[27];
     
     // 97~
    
     for(int i=0; i<str.length(); i++) {
      int idx = str.charAt(i) - 97;
      //System.out.println(idx);
      arr[idx]++;
     }
     
     for(int i=0;i<26; i++) {
      bw.write(arr[i] + " ");
     }
    
     bw.flush();
     br.close();
     bw.close();
     
  }
}
