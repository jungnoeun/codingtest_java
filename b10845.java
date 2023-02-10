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
   * push X: ���� X�� ť�� �ִ� �����̴�.
   * pop: ť���� ���� �տ� �ִ� ������ ����, �� ���� ����Ѵ�. 
   * ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
   * size: ť�� ����ִ� ������ ������ ����Ѵ�.
   * empty: ť�� ��������� 1, �ƴϸ� 0�� ����Ѵ�.
   * front: ť�� ���� �տ� �ִ� ������ ����Ѵ�. 
   * ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
   * back: ť�� ���� �ڿ� �ִ� ������ ����Ѵ�. 
   * ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
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
