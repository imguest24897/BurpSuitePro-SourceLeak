package burp;

public class Zxll implements Zmxz {
  private final Zmxz Zl;
  
  private static Zbqc[] Zq;
  
  public Zxll(Zmxz paramZmxz) {
    this.Zl = paramZmxz;
  }
  
  public Zl4m Zi(Zrdb paramZrdb1, Zrdb paramZrdb2, Zz1h paramZz1h) {
    return (paramZrdb1.Za6() != paramZrdb2.Za6()) ? Zl4m.ZX : this.Zl.Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
  
  public static void ZS(Zbqc[] paramArrayOfZbqc) {
    Zq = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZT() {
    return Zq;
  }
  
  static {
    if (ZT() == null)
      ZS(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxll.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */