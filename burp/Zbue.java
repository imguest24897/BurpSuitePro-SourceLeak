package burp;

import java.util.regex.Matcher;

public class Zbue {
  private final Matcher ZY;
  
  private final boolean Zh;
  
  private static int[] ZO;
  
  public Zbue(Matcher paramMatcher, boolean paramBoolean) {
    this.ZY = paramMatcher;
    this.Zh = paramBoolean;
  }
  
  public Matcher Zr() {
    return this.ZY;
  }
  
  public boolean Zp() {
    return this.Zh;
  }
  
  public static void ZM(int[] paramArrayOfint) {
    ZO = paramArrayOfint;
  }
  
  public static int[] ZI() {
    return ZO;
  }
  
  static {
    if (ZI() != null)
      ZM(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbue.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */