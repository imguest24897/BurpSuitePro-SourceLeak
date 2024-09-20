package burp;

import java.util.Map;

public class Zr3k {
  private final Zzq1 Zs;
  
  private final Zt69 ZK;
  
  private final Zrsr Zg;
  
  private final int Zh;
  
  private final Zegg ZF;
  
  private static int Zp;
  
  public Zr3k(Zt69 paramZt69, Zrsr paramZrsr, int paramInt) {
    this.ZK = paramZt69;
    this.Zg = paramZrsr;
    this.Zh = paramInt;
    int i = Zh();
    this.Zs = null;
    this.ZF = null;
    if (Zbqc.Zwu() == null)
      ZB(++i); 
  }
  
  public Zsqx<Zglw> ZS(Map<Zvow, Zzi8> paramMap) {
    return new Zsb0(this, paramMap);
  }
  
  private Zegg ZN(Zr_4 paramZr_4) {
    return (this.ZF != null) ? this.ZF : paramZr_4.<Zegg>ZH(this.Zg);
  }
  
  private Zzq1 ZW(Zr_4 paramZr_4, Map<Zvow, Zzi8> paramMap) {
    return (this.Zs != null) ? this.Zs : paramZr_4.<Zzq1>ZH(this.ZK.Zc(paramMap));
  }
  
  public int ZE() {
    return (this.ZF != null) ? this.ZF.ZSC() : ((this.Zg != null) ? this.Zg.ZR : -1);
  }
  
  public static void ZB(int paramInt) {
    Zp = paramInt;
  }
  
  public static int Zh() {
    return Zp;
  }
  
  public static int ZZ() {
    int i = Zh();
    return (i == 0) ? 4 : 0;
  }
  
  static {
    if (ZZ() != 0)
      ZB(80); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr3k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */