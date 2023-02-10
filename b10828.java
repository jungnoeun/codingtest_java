import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
   * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
   * 명령은 총 다섯 가지이다.
   * push X: 정수 X를 스택에 넣는 연산이다.
   * pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
   * size: 스택에 들어있는 정수의 개수를 출력한다.
   * empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
   * top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
   */

public class b10828 {
  
  static List<Integer> list = new ArrayList<>();
  
  // push X: 정수 X를 스택에 넣는 연산이다.
  public static void pushX(int x) {
    list.add(x);
  }
  
  public static int popX() {
    int size = sizeX();
    if(size == 0) {
      return -1;
    } else {
      Integer popNum = list.get(size - 1);
      list.remove(size-1);
      return popNum.intValue();
    }
  }
  
  public static int sizeX() {
    int size = list.size();
    return size;
  }
  
  public static int emptyX() {
    int size = sizeX();
    if(size <= 0) {
      return 1;
    }
    return 0;
  }
  
  public static int topX() {
    int size = sizeX();
    if(emptyX() > 0) {
      return -1;
    }
    int topX = list.get(size-1);
    return topX;
  }
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int N = Integer.parseInt(br.readLine());
    
    StringTokenizer st;
    
    for(int i=0; i<N; i++) {
      st = new StringTokenizer(br.readLine());
      String doin = st.nextToken();
      if(doin.equals("push")) {
        int num = Integer.parseInt(st.nextToken());
        pushX(num);
      } else if (doin.equals("pop")) {
        bw.write(popX() + "\n");
      } else if(doin.equals("size")) {
        bw.write(sizeX() + "\n");
      } else if(doin.equals("empty")) {
        bw.write(emptyX() + "\n");
      } else if(doin.equals("top")) {
        bw.write(topX() + "\n");
      } 
      
    }    
    bw.flush();
    bw.close();
    br.close();
    
  }
  
}