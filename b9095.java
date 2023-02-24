import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b9095 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[11];
    int T = Integer.parseInt(br.readLine());
    arr[1] = 1;
    arr[2] = 2;
    arr[3] = 4;
    
    for(int j=4; j<11; j++) {
      arr[j] = arr[j-1] + arr[j-2] + arr[j-3];
    }
    
    for(int i=0 ; i<T; i++) {
      int num = Integer.parseInt(br.readLine());
      System.out.println(arr[num]);
      
    }
    
  }
}
