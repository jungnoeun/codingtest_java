import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class b10845 {
  /**
   * push X: 정수 X를 큐에 넣는 연산이다.
   * pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 
   * 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
   * size: 큐에 들어있는 정수의 개수를 출력한다.
   * empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
   * front: 큐의 가장 앞에 있는 정수를 출력한다. 
   * 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
   * back: 큐의 가장 뒤에 있는 정수를 출력한다. 
   * 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
   * 
   */
  
  static List<Integer> list = new ArrayList<>();
  
   public static void pushX(int x) {
    list.add(x);
    
   }
   
   public static int popX() {
    if(emptyX() > 0) {
      return -1;
    }
    Integer popNum = list.get(0);
    list.remove(0);
    return popNum.intValue();
   }
   public static int sizeX() {
    return list.size();
   }
   public static int emptyX() {
    if(list.isEmpty()) {
      return 1;
    }
    return 0;
   }
   public static int frontX() {
    if(emptyX() > 0) {
      return -1;
    }
    Integer frontX = list.get(0);
    return frontX.intValue();
   }
   public static int backX() {
    if(emptyX() > 0) {
      return -1;
    }
    int size = sizeX();
    Integer backX = list.get(size-1);
    return backX.intValue();
   }
   
   
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    StringTokenizer st;
    int N = Integer.parseInt(br.readLine());
    
    for(int i=0; i<N; i++) {
      st = new StringTokenizer(br.readLine());
      String doin = st.nextToken();
      if(doin.equals("push")) {
        int x = Integer.parseInt(st.nextToken());
        pushX(x);
      }else if(doin.equals("pop")) {
        bw.write(popX() + "\n");
      }else if(doin.equals("size")) {
        bw.write(sizeX() + "\n");
      }else if(doin.equals("empty")) {
        bw.write(emptyX() + "\n");
      }else if(doin.equals("front")) {
        bw.write(frontX() + "\n");
      }else if(doin.equals("back")) {
        bw.write(backX() + "\n");
      }
      
    }
    bw.flush();
    bw.close();
    br.close();
    
  }
}
