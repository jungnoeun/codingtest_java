import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class b2164 {
  
  
  
  // 맨앞의 숫자 삭제
  // 그 다음의 맨앞 숫자를 맨뒤에 넣기
  public static int card_game(List<Integer> current) {
    
    if(current.size() == 1) {
      return current.get(0);
    }
    else {
      List<Integer> keep = new ArrayList<>();
    
      for(int i=0; i<current.size(); i++) {
        if((i+1) % 2 == 0) keep.add(current.get(i));
      }
    
      if(current.size() % 2 == 1) {
        int num = keep.remove(0);
        keep.add(num);
      } 
      
      return card_game(keep);
    }
  }
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    
    List<Integer> list = new ArrayList<>();
    
    for(int i=1; i<=N; i++) {
      list.add(i);
    }
    
    int result = card_game(list);
    
    System.out.println(result);
    
    br.close();
  }
}
