import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b1427 {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    String N = br.readLine();
    List<Integer> list = new ArrayList<>();
    for(int i=0; i<N.length(); i++) {
      int num = N.charAt(i) - '0';
      list.add(num);
    }
    
    Collections.sort(list, Collections.reverseOrder());
    
    for (Integer l : list) {
      bw.write(String.valueOf(l));
    }
    
    br.close();
    bw.flush();
    bw.close();
    
  }
}
