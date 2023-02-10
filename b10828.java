import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
   * ������ �����ϴ� ������ ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
   * ����� �� �ټ� �����̴�.
   * push X: ���� X�� ���ÿ� �ִ� �����̴�.
   * pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
   * size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
   * empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
   * top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
   */

public class b10828 {
  
  static List<Integer> list = new ArrayList<>();
  
  // push X: ���� X�� ���ÿ� �ִ� �����̴�.
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