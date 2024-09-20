package burp;

import java.util.Set;

public class Zt41 implements Zrcg {
  private final Set<? extends Zmgr> ZX;
  
  private static String[] ZF;
  
  public Zt41(Set<? extends Zmgr> paramSet) {
    this.ZX = paramSet;
  }
  
  public Set<? extends Zmgr> Zc() {
    return this.ZX;
  }
  
  public static void Ze(String[] paramArrayOfString) {
    ZF = paramArrayOfString;
  }
  
  public static String[] Zi() {
    return ZF;
  }
  
  static {
    if (Zi() != null)
      Ze(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt41.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */