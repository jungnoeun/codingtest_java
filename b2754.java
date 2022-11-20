package codingtest_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class b2754 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String cRes = br.readLine();
    HashMap<String, String> result = new HashMap<>();
    result.put("A+", "4.3");
    result.put("A0", "4.0");
    result.put("A-", "3.7");
    result.put("B+", "3.3");
    result.put("B0", "3.0");
    result.put("B-", "2.7");
    result.put("C+", "2.3");
    result.put("C0", "2.0");
    result.put("C-", "1.7");
    result.put("D+", "1.3");
    result.put("D0", "1.0");
    result.put("D-", "0.7");
    result.put("F", "0.0");

    System.out.println(result.get(cRes));
    br.close();
  }
}
