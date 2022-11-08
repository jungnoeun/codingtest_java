package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1297 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    double D = Double.parseDouble(st.nextToken());
    double H = Double.parseDouble(st.nextToken());
    double W = Double.parseDouble(st.nextToken());
    double multV = 0;
    
    //���簢�� �밢�� ���ϴ� ����: (���̺��� * x)^2 + (�ʺ���� * x)^2 = (�밢������)^2
    multV = (D*D) / ((H*H)+(W*W));
    multV = Math.sqrt(multV);
    
    int height = (int)(H * multV);
    int width = (int)(W * multV);
    
    System.out.println(String.valueOf(height) + " " + String.valueOf(width));
    br.close();
  }
}
