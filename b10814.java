import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class b10814 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int N = Integer.parseInt(br.readLine());
    Person[] p = new Person[N];
    for(int i=0; i<N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
    
      int age = Integer.parseInt(st.nextToken());
      String name = st.nextToken();
      p[i] = new Person(age, name);
    }
    
    Arrays.sort(p, new Comparator<Person>() {
      @Override
      public int compare(Person p1, Person p2) {
        return p1.age -p2.age;
      }
    });
    
    StringBuilder sb = new StringBuilder();
    for (int j=0; j<N; j++) {
      sb.append(p[j]); // ��ü�� ����ϸ� �ش� �ε����� ��ü�� toString() �� ���
    }
    System.out.println(sb);
    
  }
  
  public static class Person {
    int age;
    String name;
    
    public Person(int age, String name) {
      this.age = age;
      this.name = name;
    }
    
    @Override
		public String toString() {
			return age + " " + name + "\n";
		}
    
  }
}
