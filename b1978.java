package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1978 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr = new int[N];
    int cnt = 0;
    
    for(int i=0; i<N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
      boolean ox = Isdecimal(arr[i]);
      if(ox == true) {
        cnt++;
      }
    }
    
    System.out.println(cnt);
    br.close();
    
    /**
     * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
    * 입력
    * 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
     */
    
  }
  
  static boolean Isdecimal(int num) {
    boolean ox = true;
    // 2 3 5 7 / 11 13 17 19 23 29 31
    if( num != 2 && num % 2 == 0 ){ // 6
      ox = false;
    }
    else if(num != 3 && num % 3 == 0 ) { 
      ox = false;
    }
    else if(num != 5 && num % 5 == 0 ) { 
      ox = false;
    }
    else if(num != 7 && num % 7 == 0 ) { 
      ox = false;
    }
    else if(num != 11 && num % 11 == 0 ) { 
      ox = false;
    }
    else if(num != 13 && num % 13 == 0 ) { 
      ox = false;
    }
    else if(num != 17 && num % 17 == 0 ) { 
      ox = false;
    }
    else if(num != 19 && num % 19 == 0 ) { 
      ox = false;
    }
    else if(num != 23 && num % 23 == 0 ) { 
      ox = false;
    }
    else if(num != 29 && num % 29 == 0 ) { 
      ox = false;
    }
    else if(num != 31 && num % 31 == 0 ) { 
      ox = false;
    }
    else if( num == 1 ){
      ox = false;
    }
    
    
    return ox;
  }
  
}
