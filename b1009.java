package codingtest_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b1009{
  public static void main(String[] args) throws IOException{
    
    int cnt =0;
    int []resultArr = null;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    cnt = Integer.parseInt(br.readLine());

    // array 동적할당
    resultArr = new int[cnt];

    
    // 배열에 값 입력
    for(int i=0;i<cnt;i++){
      st = new StringTokenizer(br.readLine()," ");
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int result=1;
      for(int j=0;j<b;j++){ 
        result=(result*a)%10;
      }
     

      if(result == 0){
        System.out.println(10);        
      }
      else{
        System.out.println(result);
      }



    }

  
    //bw.flush();
    //bw.close();
    br.close();


  }

  
}