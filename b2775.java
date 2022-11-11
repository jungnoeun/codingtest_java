package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2775 {
  
  //static int[][] arr ;
  //arr = new int[15][15];
  
  public static void main(String[] args) throws IOException {
    /**
     * 
     * �� ����Ʈ�� ���ָ� �Ϸ��� ������ �ִµ�, 
     * ��a���� bȣ�� ����� �ڽ��� �Ʒ�(a-1)���� 1ȣ���� bȣ���� ������� ���� �ո�ŭ ������� ������ ��ƾ� �Ѵ١� 
     * �� ��� ������ �� ��Ű�� ���;� �Ѵ�.
     * ����Ʈ�� ����ִ� ���� ���� ��� ���ֹε��� �� ��� ������ ��Ű�� �Դٰ� �������� ��, 
     * �־����� ���� ���� k�� n�� ���� k���� nȣ���� �� ���� ��� �ִ��� ����϶�. 
     * ��, ����Ʈ���� 0������ �ְ� �������� 1ȣ���� ������, 0���� iȣ���� i���� ���.
     * https://www.acmicpc.net/problem/2775
     */
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int testCase = Integer.parseInt(br.readLine());
    int[][] apt = new int[15][15];
    int k,n;
    
    for(int i=0; i<15; i++) {
      apt[i][1] = 1;
      apt[0][i] = i;
    }
    
    // 2�� 2ȣ -> 1�� 1ȣ + 1�� 2ȣ
    for(int i=1; i<15; i++) {
      for(int j=2; j<15; j++) {
        apt[i][j] = apt[i-1][j] + apt[i][j-1];
      }
    }
    
    for(int i=0; i<testCase; i++) {
      k = Integer.parseInt(br.readLine());
      n = Integer.parseInt(br.readLine());
      
      System.out.println(apt[k][n]);
    }

    br.close();
  }

}
