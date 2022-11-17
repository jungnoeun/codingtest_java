package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b9657 {
  public static void main(String[] args) throws IOException {
    // 돌은 1개, 3개 또는 4개 가져갈 수 있다. 마지막 돌을 가져가는 사람이 게임을 이기게 된다.
    // 게임은 상근이가 먼저 시작한다.
    // 상근이가 게임을 이기면 SK를, 창영이가 게임을 이기면 CY을 출력한다.
    // 내가 먼저 가져간다고 가정하면,
    // (N - 1) OR (N -3) OR (N -4)
    // 0 -> 다른 사람
    // 1 -> 나
    // 2 -> 다른 사람 승리
    // 3 -> 나
    // 4 -> 나
    // 5 -> 나
    // 6 -> 나

    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    
    
    if(N%7 ==0 || N%7 ==2) {
      System.out.println("CY"); 
      
    }else {
      System.out.println("SK");
    }
    
    br.close();
  }
}
