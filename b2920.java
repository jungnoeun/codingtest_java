package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b2920 {
   public static void main(String[] args) throws IOException {
    
    /**
     * 
     * 다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.
     * 1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
     * 연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.
     * 
     */
    
     
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr= new int[8];
    final String asc = "ascending", desc = "descending", mix = "mixed";
    int[] ascArr = new int[] {1,2,3,4,5,6,7,8};
    int[] descArr = new int[] {8,7,6,5,4,3,2,1};
     
    for(int i=0; i<arr.length; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    if(Arrays.equals(arr, ascArr)) {
      System.out.println(asc);
    }
    else if(Arrays.equals(arr, descArr)) {
      System.out.println(desc);
    }
    else {
      System.out.println(mix);
    }
     
     
    br.close();

   }
}
