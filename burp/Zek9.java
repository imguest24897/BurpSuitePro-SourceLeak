package burp;

public class Zek9 extends Zeku {
  private final boolean Zv;
  
  private static int Zy;
  
  public Zek9(int paramInt) {
    this(paramInt, false);
  }
  
  public Zek9(int paramInt, boolean paramBoolean) {
    super(paramInt, 1);
    this.Zv = paramBoolean;
  }
  
  public boolean ZP() {
    return this.Zv;
  }
  
  public void ZB(Zkit paramZkit, Zgpi paramZgpi1, Zgpi paramZgpi2) {
    boolean bool = paramZkit.Zi(paramZgpi1, this);
    paramZkit.ZH(paramZgpi2, this, bool);
  }
  
  public void ZK(Zs7v paramZs7v) {
    paramZs7v.Zb(this);
  }
  
  public static void ZF(int paramInt) {
    Zy = paramInt;
  }
  
  public static int Zx() {
    return Zy;
  }
  
  public static int Zp() {
    int i = Zx();
    return (i == 0) ? 119 : 0;
  }
  
  static {
    if (Zp() == 0)
      ZF(48); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zek9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */