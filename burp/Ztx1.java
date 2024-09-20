package burp;

import java.util.List;

public abstract class Ztx1 implements Zp {
  private final List<Zlp9> ZC;
  
  private final Zlz5 Zt;
  
  private final Zmdl Zi;
  
  private static boolean Zz;
  
  public Ztx1(List<Zlp9> paramList, Zlz5 paramZlz5, Zmdl paramZmdl) {
    this.ZC = paramList;
    this.Zt = paramZlz5;
    this.Zi = paramZmdl;
  }
  
  public boolean ZD(Zmaj paramZmaj) {
    return Zlp9.Za(this.ZC, paramZmaj.Zy.ZN());
  }
  
  public void ZF(Zmaj paramZmaj) {
    this.Zi.Zr(paramZmaj);
  }
  
  public void Zg(Zz4_ paramZz4_) {
    this.Zt.Zg(paramZz4_, this.Zi);
  }
  
  public void ZW(Zmz6 paramZmz6, Zly1 paramZly1, long paramLong) {
    this.Zt.ZQ(paramZmz6, paramZly1, paramLong, this.Zi);
  }
  
  public static void Zi(boolean paramBoolean) {
    Zz = paramBoolean;
  }
  
  public static boolean Zj() {
    return Zz;
  }
  
  public static boolean ZC() {
    boolean bool = Zj();
    return !bool;
  }
  
  static {
    if (Zj())
      Zi(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztx1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */