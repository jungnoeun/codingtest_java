package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b14916 {
  public static void main(String[] args) throws IOException {
    
    /**
     * �մ��� 2��¥���� 5��¥���θ� �Ž������� �޶�� �Ѵ�.
     * ������ ������ �ּҰ� �ǵ��� �Ž��� �־�� �Ѵ�. �Ž������� n�� ���, 
     * �ּ� ������ ������ �� ������ �˷��ִ� ���α׷��� �ۼ��Ͻÿ�.
     * ���: �Ž����� ������ �ּ� ������ ����Ѵ�. ���� �Ž��� �� �� ������ -1�� ����Ѵ�.
     */
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int money = Integer.parseInt(br.readLine());
    
    /**
     * ���� for���� ����ǵ�
     * ���� for���� money�� 0�� �ɶ����� 5���� �ϳ��� ���δ�.
     * �Ʒ��� for���� ������ ����� ������ money���� 2���� �ϳ��� ���δ�.
     * for���� ������ money -5x -2y�̴�.
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
