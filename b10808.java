package codingtest_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class b10808 {
  public static void main(String[] args) throws IOException {
    /**
     * ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. �� ���ĺ��� �ܾ �� ���� ���ԵǾ� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
