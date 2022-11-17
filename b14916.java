package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b14916 {
  public static void main(String[] args) throws IOException {
    
    /**
     * 손님이 2원짜리와 5원짜리로만 거스름돈을 달라고 한다.
     * 동전의 개수가 최소가 되도록 거슬러 주어야 한다. 거스름돈이 n인 경우, 
     * 최소 동전의 개수가 몇 개인지 알려주는 프로그램을 작성하시오.
     * 출력: 거스름돈 동전의 최소 개수를 출력한다. 만약 거슬러 줄 수 없으면 -1을 출력한다.
     */
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int money = Integer.parseInt(br.readLine());
    
    /**
     * 이중 for문을 만든건데
     * 위의 for문은 money가 0이 될때까지 5원을 하나씩 줄인다.
     * 아래의 for문은 위에서 계산한 나머지 money에서 2원을 하나씩 줄인다.
     * for문의 내용은 money -5x -2y이다.
     */
    int total = money;
    int coinCnt = 0;
    int mini = 1000000;
    
    for(int i=0; i<=(money/5); i++) {
      total = money;
      coinCnt = 0;
      total = total - 5*i;
      coinCnt = coinCnt + i;
    
      if(total%2 == 0) {
        coinCnt = coinCnt + total/2;
      
        if(coinCnt<mini) {
          mini = coinCnt;
        }
      }
      
    }
    
    if(mini == 1000000) {
      System.out.println(-1);
    }else {
      System.out.println(mini);
    }
     
    br.close();
  }
}
