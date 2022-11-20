package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b17202 {
  public static void main(String[] args) throws IOException {
    
    /**
     * https://www.acmicpc.net/problem/17202
     */
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] A = br.readLine().split("");
    String[] B = br.readLine().split("");
   
    int[] pnum = new int[16];
    for(int i=0,j=0; i<A.length; i++, j=j+2) {
      pnum[j] = Integer.parseInt(A[i]);
      pnum[j+1] = Integer.parseInt(B[i]);
      
    }
    
    
    
    for (int i=0; i<pnum.length-2; i++) {
      for(int j=0; j<pnum.length-1; j++) {
        pnum[j] = (pnum[j] + pnum[j+1]) % 10;
        // System.out.println("pnum["+j+"] = " + pnum[j]);
      }
    }
    
    if(pnum[0] == 0) {
      System.out.println(""+pnum[0]+""+pnum[1]);
    }else {
      System.out.println(""+pnum[0]+""+pnum[1]);
    }
    
    
    br.close();
  }
}
