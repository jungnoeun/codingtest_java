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
     * �������� c d e f g a b C, �� 8�� ������ �̷�����ִ�. �� �������� 8�� ���� ������ ���� ���ڷ� �ٲپ� ǥ���Ѵ�. c�� 1��, d�� 2��, ..., C�� 8�� �ٲ۴�.
     * 1���� 8���� ���ʴ�� �����Ѵٸ� ascending, 8���� 1���� ���ʴ�� �����Ѵٸ� descending, �� �� �ƴ϶�� mixed �̴�.
     * ������ ������ �־����� ��, �̰��� ascending����, descending����, �ƴϸ� mixed���� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
