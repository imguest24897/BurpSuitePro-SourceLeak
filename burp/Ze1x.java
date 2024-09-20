package burp;

public class Ze1x extends Ze3y implements Zeel {
  private Zb3t Zv;
  
  private static int ZF;
  
  public void ZX(Zgce paramZgce) {
    this.Zv = paramZgce;
  }
  
  public void Zm(Zgc4 paramZgc4) {
    this.Zv = paramZgc4;
  }
  
  public void ZH(Zgc2 paramZgc2) {
    this.Zv = paramZgc2;
  }
  
  public Zb3t ZC() {
    return this.Zv;
  }
  
  public void ZO() {
    this.Zv = null;
  }
  
  public static void ZZ(int paramInt) {
    ZF = paramInt;
  }
  
  public static int Zx() {
    return ZF;
  }
  
  public static int ZA() {
    int i = Zx();
    return (i == 0) ? 115 : 0;
  }
  
  static {
    if (Zx() != 0)
      ZZ(91); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze1x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */