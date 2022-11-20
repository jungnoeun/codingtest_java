package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1100 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String chessPan;
    int chessNum = 0;
    int sum = 0;
    
    while(chessNum<8) {
      
      chessPan = br.readLine();
      String[] chess = chessPan.split("");
      for(int i=0; i<chess.length; i++) {
        if(chessNum%2 == 0 && i%2 == 0 && chess[i].equals("F")) sum++;
        if(chessNum%2 == 1 && i%2 == 1 && chess[i].equals("F")) sum++;
        
      }
      chessPan = "";
      chessNum++;
    }
    
    System.out.println(sum);
    br.close();
  }
}
