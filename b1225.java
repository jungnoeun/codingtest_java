package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1225 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    String inputN = st.nextToken();
    String inputM = st.nextToken();
    int cn, cm, pm=1;
    long sum=0;
    
    for(int i=0; i<inputN.length(); i++) {
      cn = inputN.charAt(i) - '0';
      if(i==0 && cn ==0) break;
      
      for(int j=0; j<inputM.length(); j++) {
        cm = inputM.charAt(j) - '0';
        sum += (cm * cn);
        if(j==0 && cm==0) {
          pm=0;
          sum=0;
          break;
        }
      }
      if(pm == 0) {
        break;
      }
    }
    
    
    // while(N!=0) {
    //   cn = N%10;
    //   N = N/10;
      
    //   cm = pm;
    //   M = pm;
    //   while(M!=0) {
    //     cm = M%10;
    //     sum += (cn*cm);
    //     M = M/10;
    //   }
    // }
    
    
    System.out.println(sum);
    br.close();
  }
}
