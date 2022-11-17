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
     * int 배열에 이름 문자열들을 하나씩 가져와서 alphabet[알파벳-'A']을 가져와서 저장한다.
     * 그리고 (arr[i] * arr[i+1]) % 10 과 같이 하나씩 계산한다.
     */
    
    for(int i=0,j=0; i<nameA.length()*2; i+=2,j++) {
      arr[i] = alphabet[nameA.charAt(j) - 'A'];
      arr[i+1] = alphabet[nameB.charAt(j) - 'A'];
    }
    
    /**
     * 이중 for문을 만들건데,
     * 위의 for문은 몇번 계산을 할건지 세고,
     * 아래 for문은 배열의 길이만큼 하나하나 계산한다.
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
