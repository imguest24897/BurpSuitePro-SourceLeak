package burp;

import java.util.Map;

public class Ztw7 implements Zb8d {
  private final Zg_ Ze;
  
  private static int[] ZA;
  
  public Ztw7(Map<String, Zgho> paramMap, Zb8d... paramVarArgs) {
    this.Ze = new Zmjf(paramMap, paramVarArgs);
  }
  
  public Zg_ Zo() {
    return this.Ze;
  }
  
  public static void Zt(int[] paramArrayOfint) {
    ZA = paramArrayOfint;
  }
  
  public static int[] Zz() {
    return ZA;
  }
  
  static {
    if (Zz() == null)
      Zt(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztw7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */