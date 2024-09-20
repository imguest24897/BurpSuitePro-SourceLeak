package burp;

import java.util.List;

public class Ze9t {
  protected List<Zsq8> ZE;
  
  protected int Zo;
  
  private static int ZD;
  
  public List<Zsq8> Zx() {
    return this.ZE;
  }
  
  public int Zj() {
    return this.Zo;
  }
  
  public boolean ZH() {
    return (this.ZE != null && !this.ZE.isEmpty() && this.Zo != 0);
  }
  
  public static void ZN(int paramInt) {
    ZD = paramInt;
  }
  
  public static int Zh() {
    return ZD;
  }
  
  public static int Zd() {
    int i = Zh();
    return (i == 0) ? 61 : 0;
  }
  
  static {
    if (Zh() != 0)
      ZN(119); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze9t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */