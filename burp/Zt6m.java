package burp;

public class Zt6m {
  private final StringBuilder ZC = new StringBuilder();
  
  private int ZF;
  
  private boolean ZY;
  
  private static int Zz;
  
  public Zt6m() {
    int i = Zo();
    this.ZF = 0;
    this.ZY = false;
    if (i != 0)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public Zt6m Zr(String paramString) {
    ZV();
    this.ZC.append(paramString);
    return this;
  }
  
  public Zt6m Zu() {
    this.ZF++;
    Zx();
    int i = Zl();
    if (Zbqc.Zwu() == null)
      Zz(++i); 
    return this;
  }
  
  public Zt6m Zw() {
    this.ZF--;
    return this;
  }
  
  public Zt6m Zx() {
    this.ZC.append("\n");
    this.ZY = true;
    return this;
  }
  
  private void ZV() {
    if (this.ZY)
      this.ZC.append(ZF()); 
    this.ZY = false;
  }
  
  private String ZF() {
    return " ".repeat(2 * this.ZF);
  }
  
  public String toString() {
    return this.ZC.toString();
  }
  
  public static void Zz(int paramInt) {
    Zz = paramInt;
  }
  
  public static int Zl() {
    return Zz;
  }
  
  public static int Zo() {
    int i = Zl();
    return (i == 0) ? 70 : 0;
  }
  
  static {
    if (Zo() != 0)
      Zz(118); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt6m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */