import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b2750 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    
    List<Integer> list = new ArrayList<>();
    for(int i=0 ;i<N; i++) {
      list.add(Integer.parseInt(br.readLine()));
    }
    
    Collections.sort(list);
    
    for (Integer i : list) {
      System.out.println(String.valueOf(i));
    }
    
    br.close();
    
  }
}
