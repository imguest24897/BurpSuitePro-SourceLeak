package burp;

public class Zstm implements Zzbt {
  private final Zzbt Zj;
  
  private static String[] ZF;
  
  public Zstm(Zzbt paramZzbt) {
    this.Zj = paramZzbt;
  }
  
  public boolean Zv(Zb2e paramZb2e) {
    return paramZb2e.ZBf().Za9() ? false : ((paramZb2e.ZBb() != Zb9y.ISSUE_FOUND) ? false : this.Zj.Zv(paramZb2e));
  }
  
  public static void ZF(String[] paramArrayOfString) {
    ZF = paramArrayOfString;
  }
  
  public static String[] ZQ() {
    return ZF;
  }
  
  static {
    if (ZQ() != null)
      ZF(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zstm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */