import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class b9012 {
  
  /**
   * �Է�
   * �Է� �����ʹ� ǥ�� �Է��� ����Ѵ�. 
   * �Է��� T���� �׽�Ʈ �����ͷ� �־�����. 
   * �Է��� ù ��° �ٿ��� �Է� �������� ���� ��Ÿ���� ���� T�� �־�����. 
   * �� �׽�Ʈ �������� ù° �ٿ��� ��ȣ ���ڿ��� �� �ٿ� �־�����. 
   * �ϳ��� ��ȣ ���ڿ��� ���̴� 2 �̻� 50 �����̴�. 
   * ���
   * ����� ǥ�� ����� ����Ѵ�. 
   * ���� �Է� ��ȣ ���ڿ��� �ùٸ� ��ȣ ���ڿ�(VPS)�̸� ��YES��, �ƴϸ� ��NO���� �� �ٿ� �ϳ��� ���ʴ�� ����ؾ� �Ѵ�. 
   */
  
  static List<Integer> list = new ArrayList<>();
   
  public static void pushX() {
    list.add(1);
  }
  public static int popX() {
    int size = sizeX();
    if(size <= 0) {
      return 0;
    }
    list.remove(size-1);
    return 1;
  }
  public static int sizeX() {
    if(list.isEmpty()) {
      return 0;
    }
    return list.size();
  }
   
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int T = Integer.parseInt(br.readLine());
    int popNum = 1;
    for(int i=0; i<T; i++) {
      list.clear();
      String input = br.readLine();
      for(int j=0; j<input.length(); j++) {
        popNum = 1;
        if(input.charAt(j) == '(') {
          pushX();
        } else if(input.charAt(j) == ')') {
          popNum = popX();
        }
        
        if(j == input.length()-1 && list.isEmpty() && popNum == 1) {
          bw.write("YES" + "\n");
          break;
        }
        if(j == input.length()-1 && !list.isEmpty()) {
          bw.write("NO" + "\n");
          break;
        }
        if(popNum == 0 ) {
          bw.write("NO" + "\n");
          break;
        }
        
      }
    }    

    bw.flush();
    bw.close();
    br.close();
    
  }
}
