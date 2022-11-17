package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b15312 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String nameA = br.readLine();
    String nameB = br.readLine();
    int[] alphabet = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
    
    int[] arr = new int[nameA.length()*2];
    
    /**
     * int �迭�� �̸� ���ڿ����� �ϳ��� �����ͼ� alphabet[���ĺ�-'A']�� �����ͼ� �����Ѵ�.
     * �׸��� (arr[i] * arr[i+1]) % 10 �� ���� �ϳ��� ����Ѵ�.
     */
    
    for(int i=0,j=0; i<nameA.length()*2; i+=2,j++) {
      arr[i] = alphabet[nameA.charAt(j) - 'A'];
      arr[i+1] = alphabet[nameB.charAt(j) - 'A'];
    }
    
    /**
     * ���� for���� ����ǵ�,
     * ���� for���� ��� ����� �Ұ��� ����,
     * �Ʒ� for���� �迭�� ���̸�ŭ �ϳ��ϳ� ����Ѵ�.
     */
    
    for(int i=0; i<arr.length-2; i++) {
      for(int j=0; j<arr.length-1; j++) {
        arr[j] = (arr[j] + arr[j+1]) % 10;
      }
    }
    
    if(arr[0] == 0) {
      System.out.println("0" + arr[1]);
    }else {
      System.out.println("" + arr[0] + arr[1]);
    }
    
    br.close();
    
  }
}
