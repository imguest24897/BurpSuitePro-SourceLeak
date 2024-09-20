package burp;

import net.portswigger.Zoq;

public class Zb80 {
  private final Zlfb Zq;
  
  private final Ztj1 ZS;
  
  private final Zxgc ZP;
  
  private final Zerg Zi;
  
  private final Ztdi ZW;
  
  private final Zgx0 Zz;
  
  private final Zm6x Za;
  
  private static int Zp;
  
  public Zb80(Zlfb paramZlfb, Ztj1 paramZtj1, Zxgc paramZxgc, Zerg paramZerg, Ztdi paramZtdi, Zgx0 paramZgx0, Zm6x paramZm6x) {
    this.Zq = paramZlfb;
    this.ZS = paramZtj1;
    this.ZP = paramZxgc;
    this.Zi = paramZerg;
    int i = Zz();
    this.ZW = paramZtdi;
    this.Zz = paramZgx0;
    this.Za = paramZm6x;
    if (Zbqc.Zwu() == null)
      ZC(++i); 
  }
  
  public Zoq<Zbhc> Zr(Zkye paramZkye) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> get : (Lburp/Zb80;Lburp/Zkye;)Ljava/util/function/Supplier;
    //   7: invokestatic ZZ : (Ljava/util/function/Supplier;)Lnet/portswigger/Zoq;
    //   10: areturn
  }
  
  private Zbhc Zn(Zkye paramZkye) {
    return new Zbhc(this.ZS, this.Zq, this.ZP, this.Zi, this.ZW, this.Zz, paramZkye, this.Za);
  }
  
  private Zbhc lambda$detailsPanelProvider$0(Zkye paramZkye) {
    return Zn(paramZkye);
  }
  
  public static void ZC(int paramInt) {
    Zp = paramInt;
  }
  
  public static int Zz() {
    return Zp;
  }
  
  public static int Zy() {
    int i = Zz();
    return (i == 0) ? 32 : 0;
  }
  
  static {
    if (Zy() == 0)
      ZC(39); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb80.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */