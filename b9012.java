import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class b9012 {
  
  /**
   * 입력
   * 입력 데이터는 표준 입력을 사용한다. 
   * 입력은 T개의 테스트 데이터로 주어진다. 
   * 입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다. 
   * 각 테스트 데이터의 첫째 줄에는 괄호 문자열이 한 줄에 주어진다. 
   * 하나의 괄호 문자열의 길이는 2 이상 50 이하이다. 
   * 출력
   * 출력은 표준 출력을 사용한다. 
   * 만일 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 “YES”, 아니면 “NO”를 한 줄에 하나씩 차례대로 출력해야 한다. 
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
