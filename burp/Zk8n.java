package burp;

import java.util.Arrays;

public class Zk8n {
  private static String[] Zi;
  
  static boolean ZA(Zgzk... paramVarArgs) {
    return Arrays.<Zgzk>stream(paramVarArgs).allMatch(Zgzk::ZN);
  }
  
  public static void ZW(String[] paramArrayOfString) {
    Zi = paramArrayOfString;
  }
  
  public static String[] Zq() {
    return Zi;
  }
  
  static {
    if (Zq() != null)
      ZW(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk8n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */