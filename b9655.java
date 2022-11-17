package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b9655 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    // 상근이가 게임을 이기면 SK를, 창영이가 게임을 이기면 CY을 출력한다.
    // 내가 먼저 가져간다고 가정할때,
    // (N - 1) OR (N -3) = 1 -> 다른 사람 승리 -> N = 2, 4
    // (N - 1) OR (N -3) = 2 -> 내가 승리 -> N = 3,5
    // (N - 1) OR (N -3) = 3 -> 다른 사람 승리 -> N = 4,6
    /**
     * (N - 1) OR (N -3) = 4 
     * 1. 4 -1 = 3, 3 - 0 = 0 -> 내가 승리 -> N = 5,7
     */
    // (N - 1) OR (N -3) = 5 -> 다른 사람 승리 -> N = 6,8
    // (N - 1) OR (N -3) = 6 -> 내가 승리 -> N = 7,9
    
    if(N%2 == 0) {
      System.out.println("CY");
    }else {
      System.out.println("SK");
    }
    
    br.close();
  }
}
