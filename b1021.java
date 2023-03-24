import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class b1021 {
  
  static LinkedList<Integer> q = new LinkedList<>();
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    st = new StringTokenizer(br.readLine());
    
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    
    int result = 0;
    
    int[] arr = new int[M+1];
    st = new StringTokenizer(br.readLine());
    for(int i=0; i<M; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    for(int i=1; i<=N; i++) {
      q.add(i);
    }
    for(int i=0; i<M; i++) {
      if(check(arr[i])){
        while(arr[i]!=q.get(0)) {
          q.addLast(q.pollFirst());
          result++;
        }
      }
      else {
        while(arr[i]!=q.get(0)) {
          q.addFirst(q.pollLast());
          result++;
        }
      }
      q.poll();
    }
    
    
    System.out.println(result);
    
    // List<Integer> list = new ArrayList<>();
    // for(int i=0; i<N; i++) {
    //   list.add(i+1);
    // }
    
    // //System.out.println("arr.length = " + arr.length);
    
    // for(int i=0; i<M; i++) {
    //   int index = 0;
      
    //   // 찾으려는 숫자가 배열의 어느위치에 있는지 알아야 함
    //   int findNum = arr[i];
      
    //   if(list.get(0) == findNum) {
    //     list.remove(0);
    //     continue;
    //   }
      
    //   for(int j=0; j<N; j++) {
    //     if(findNum == list.get(j)) {
    //       index = j;
    //       break;
    //     }
    //   }
      
    //   int size = list.size();
    //   Boolean isRemove = true;
      
    //   if(index > size/2) { // 12345
    //     int it = size - index -1;
    //     for(int j=0; j<it; j++) {
    //       int last = list.get(size-1);
    //       list.add(0,last);
    //       result++;
    //     }
    //   }
    //   else {
    //     int it = index;
    //     for(int j=0; j<=it; j++) {
    //       isRemove = true;
    //       int front = list.get(0);
          
    //       if(front == findNum) {
    //         list.remove(0);
    //         break;
    //       }
          
    //       for(int k=0; k<arr.length; k++){
    //         if(front == arr[k]) {
    //           list.remove(0);
    //           list.add(front);
    //           isRemove = false;
    //           result++;
    //           break;
    //         }
    //       }
    //       if(!isRemove) continue; 
          
    //       list.remove(0);
    //     }
    //   }
      
      
    // }
    
    
  }
  
  // 중간 순서보다 전에 있는지 확인하는 함수
  public static boolean check(int a) {
    for(int i=0; i<=q.size()/2; i++) {
      if(a == q.get(i)) return true;
    }
    return false;
  }
}
