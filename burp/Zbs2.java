package burp;

import java.util.List;

public class Zbs2 implements Zehc {
  private final Ze3n ZL;
  
  private static boolean Zi;
  
  public Zbs2(Ze3n paramZe3n) {
    this.ZL = paramZe3n;
  }
  
  public Ztk8 Zb() {
    List<Zl1r> list1 = Zv(Zzia.ZH(this.ZL.ZA()));
    List<Zl1r> list2 = Zv((this.ZL.Zp()).ZM);
    boolean bool = Zf();
    if (list1 == null && list2 == null)
      return Ztk8.ZD(); 
    Zvow zvow = this.ZL.Zt().ZK(list1).Z_(list2);
    if (!bool)
      Zbqc.Zr(new Zbqc[3]); 
    return Ztk8.ZY(Zlut.ZO(this.ZL.Za(), this.ZL.ZN(), zvow));
  }
  
  public Zlcm ZP() {
    return Zlcm.PPR_VulnerableViewState;
  }
  
  private List<Zl1r> Zv(Zzjh paramZzjh) {
    return (paramZzjh == null) ? null : (paramZzjh.Zd.ZZ ? null : (paramZzjh.Zd.Zn ? null : Zrlp.Zc(paramZzjh.Zn)));
  }
  
  public static void ZQ(boolean paramBoolean) {
    Zi = paramBoolean;
  }
  
  public static boolean ZF() {
    return Zi;
  }
  
  public static boolean Zf() {
    boolean bool = ZF();
    return !bool;
  }
  
  static {
    if (!Zf())
      ZQ(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbs2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */