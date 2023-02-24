import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class b17478 {
  static int N;
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // bw.write("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������." + "\n");
    N = Integer.parseInt(br.readLine());
    System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
    fibo(0, "");
    
  }
  
  public static void fibo(int cnt, String under) {
    
    if(cnt == N) {
      System.out.println(under + "\"����Լ��� ������?\"");
      System.out.println(under + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
      System.out.println(under + "��� �亯�Ͽ���.");
      
      return;
    }

    System.out.println(under + "\"����Լ��� ������?\"");
    System.out.println(under + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
    System.out.println(under + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
    System.out.println(under + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
  
    
   fibo(cnt+1, under + "____");
   System.out.println(under + "��� �亯�Ͽ���.");
  }
  
}
