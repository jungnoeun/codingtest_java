package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2525 {
  public static void main(String[] args) throws IOException {
    
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int hour = Integer.parseInt(st.nextToken());
    int min = Integer.parseInt(st.nextToken());
    
    int need = Integer.parseInt(br.readLine());
    
    int plusH = need / 60;
    int plusM = need % 60;
    
    
    // 분 계산
    min = min + plusM;
    if(min >= 60) {
      hour = hour + (min/60);
      min = min%60; 
    }
    
    // 시 계산
    hour = hour + plusH;
    if(hour >= 24) {
      hour = hour - 24;
    }
    
  
    System.out.println(hour + " " + min);
    
    
  }
  
}
