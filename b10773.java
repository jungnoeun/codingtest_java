import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class b10773 {
  
  static List<Integer> list = new ArrayList<>();
  
  public static void pushX(int x) {
    list.add(x);
  }
  
  public static void popX() {
    list.remove(sizeX()-1);
  }
  
  public static int sizeX() {
    if(list.isEmpty()) {
      return 0;
    }
    return list.size();
  }
   
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int N = Integer.parseInt(br.readLine());
    
    for(int i=0; i<N; i++) {
      int num = Integer.parseInt(br.readLine());
      if(num != 0) {
        pushX(num);
      } else {
        popX();
      }
    }
    
    int sum =0;
    for(int i=0; i < list.size(); i++) {
      sum += list.get(i).intValue();
    }
    
    System.out.println(sum);
    
    br.close();
  
    
  }
}
