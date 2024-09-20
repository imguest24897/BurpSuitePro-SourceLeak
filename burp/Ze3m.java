package burp;

public class Ze3m {
  private final Zeuf ZP;
  
  private final Zlkk Zr;
  
  private Zmcx Zu = Zmcx.LINE_SIZE;
  
  private Zlkk ZF;
  
  private Zlkk Zh;
  
  private Zlkk ZS;
  
  private Zlkk Zg;
  
  private static int[] Zk;
  
  public static Ze3m ZC(Zeuf paramZeuf, Zlkk paramZlkk) {
    return new Ze3m(paramZeuf, paramZlkk);
  }
  
  public Ze3m(Zeuf paramZeuf, Zlkk paramZlkk) {
    this.ZP = paramZeuf;
    this.Zr = paramZlkk;
    this.ZF = paramZlkk;
    this.Zh = paramZlkk;
    this.ZS = paramZlkk;
    this.Zg = paramZlkk;
  }
  
  public Ze3m ZG(Zlkk paramZlkk) {
    this.ZF = paramZlkk;
    return this;
  }
  
  public Ze3m Zc(Zlkk paramZlkk) {
    this.Zh = paramZlkk;
    return this;
  }
  
  public Ze3m Zr(Zlkk paramZlkk) {
    this.ZS = paramZlkk;
    return this;
  }
  
  public Ze3m ZU(Zmcx paramZmcx) {
    this.Zu = paramZmcx;
    return this;
  }
  
  public Ze9n Z_() {
    return new Ze9n(this.ZP, this.Zu, this.Zr, this.ZF, this.Zh, this.ZS, this.Zg);
  }
  
  public static void ZQ(int[] paramArrayOfint) {
    Zk = paramArrayOfint;
  }
  
  public static int[] ZJ() {
    return Zk;
  }
  
  static {
    if (ZJ() == null)
      ZQ(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze3m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */