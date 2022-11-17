package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b9656 {
  public static void main(String[] args) throws IOException {
    // 돌은 1개 또는 3개 가져갈 수 있다. 마지막 돌을 가져가는 사람이 게임을 지게 된다.
    // 상근이가 게임을 이기면 SK를, 창영이가 게임을 이기면 CY을 출력한다.
    // (N - 1) OR (N -3) = 1 -> 내가 승리 -> N = 2, 4
    // (N - 1) OR (N -3) = 2 -> 다른 사람 승리 -> N = 3,5
    // (N - 1) OR (N -3) = 3 -> 내가 승리 -> N = 4,6
    /**
     * (N - 1) OR (N -3) = 4 
     * 1. 4 -1 = 3, 3 - 0 = 0 -> 다른 사람 승리 -> N = 5,7
     */
    // (N - 1) OR (N -3) = 5 -> 내가 승리 -> N = 6,8
    // (N - 1) OR (N -3) = 6 -> 다른 사람 승리 -> N = 7,9
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    
    if(N%2==0) {
      System.out.println("SK");
    }else {
      System.out.println("CY");
    }
    
    br.close();
  }
}
