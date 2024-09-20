package burp;

import net.portswigger.Zsy;

public class Zt3g implements Zrbu {
  private final int Zy;
  
  private final int ZK;
  
  private final Zeko Zj;
  
  private final Zsy ZU;
  
  private final Zbjl ZT;
  
  private static int Zr;
  
  public Zt3g(Zsy paramZsy, Zbjl paramZbjl, int paramInt1, int paramInt2, Zeko paramZeko) {
    this.ZU = paramZsy;
    this.ZT = paramZbjl;
    this.Zy = paramInt1;
    this.ZK = paramInt2;
    this.Zj = paramZeko;
  }
  
  public Zzwz Zc(Zxs7 paramZxs7) {
    return new Zzjm(this.Zy, this.ZK, this.ZT, this.Zj, this.ZU, paramZxs7);
  }
  
  public static void ZE(int paramInt) {
    Zr = paramInt;
  }
  
  public static int Zx() {
    return Zr;
  }
  
  public static int ZJ() {
    int i = Zx();
    return (i == 0) ? 106 : 0;
  }
  
  static {
    if (Zx() == 0)
      ZE(108); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt3g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */