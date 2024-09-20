package burp;

import java.util.function.Supplier;
import net.portswigger.Zoq;

public class Zgh7 {
  private final Zlfb ZG;
  
  private final Supplier<Zbs1> Zm;
  
  private final Zlba Zu;
  
  private final Zg09 Zc;
  
  private final Ztj1 ZY;
  
  private final Zz0n ZI;
  
  private final Ztwv Zy;
  
  private final Zgb6 ZH;
  
  private final Ztyg Zj;
  
  private final Zgq7 Zg;
  
  private final Zrny ZJ;
  
  private final Zs0g ZN;
  
  private final Zg0s Zf;
  
  private final Zs2g Za;
  
  private final Zz_s ZV;
  
  private final Zskh Zs;
  
  private final Zerg ZQ;
  
  private final Zkl6 ZT;
  
  private final Zkg9 Zq;
  
  private final Zg9t Zp;
  
  private final Zlli<Zt1o> ZP;
  
  private final Zm6x ZZ;
  
  private static boolean Zz;
  
  public Zgh7(Zlfb paramZlfb, Supplier<Zbs1> paramSupplier, Zlba paramZlba, Zg09 paramZg09, Ztj1 paramZtj1, Zz0n paramZz0n, Ztwv paramZtwv, Zgb6 paramZgb6, Ztyg paramZtyg, Zgq7 paramZgq7, Zrny paramZrny, Zs0g paramZs0g, Zg0s paramZg0s, Zs2g paramZs2g, Zz_s paramZz_s, Zskh paramZskh, Zerg paramZerg, Zkl6 paramZkl6, Zkg9 paramZkg9, Zg9t paramZg9t, Zlli<Zt1o> paramZlli, Zm6x paramZm6x) {
    this.ZG = paramZlfb;
    this.Zm = paramSupplier;
    this.Zu = paramZlba;
    this.Zc = paramZg09;
    this.ZY = paramZtj1;
    this.ZI = paramZz0n;
    this.Zy = paramZtwv;
    this.ZH = paramZgb6;
    this.Zj = paramZtyg;
    this.Zg = paramZgq7;
    this.ZJ = paramZrny;
    this.ZN = paramZs0g;
    this.Zf = paramZg0s;
    boolean bool = Ze();
    this.Za = paramZs2g;
    this.ZV = paramZz_s;
    this.Zs = paramZskh;
    this.ZQ = paramZerg;
    this.ZT = paramZkl6;
    this.Zq = paramZkg9;
    this.Zp = paramZg9t;
    this.ZP = paramZlli;
    this.ZZ = paramZm6x;
    if (Zbqc.Zwu() == null)
      Zv(!bool); 
  }
  
  public Zoq<Zbhk> ZZ(Zt0s paramZt0s) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> get : (Lburp/Zgh7;Lburp/Zt0s;)Ljava/util/function/Supplier;
    //   7: invokestatic ZZ : (Ljava/util/function/Supplier;)Lnet/portswigger/Zoq;
    //   10: areturn
  }
  
  private Zbhk Zn(Zt0s paramZt0s) {
    return new Zbhk(this.ZY, this.ZG, paramZt0s, this.Zm, this.ZQ, this.Zu, this.Zj, this.Zg, this.ZT, this.Zc, this.Zq, this.ZV, this.Zs, this.Zp, this.ZI, this.Zy, this.ZH, this.ZJ, this.ZN, this.Zf, this.Za, this.ZP, this.ZZ);
  }
  
  private Zbhk lambda$detailsPanelProvider$0(Zt0s paramZt0s) {
    return Zn(paramZt0s);
  }
  
  public static void Zv(boolean paramBoolean) {
    Zz = paramBoolean;
  }
  
  public static boolean ZQ() {
    return Zz;
  }
  
  public static boolean Ze() {
    boolean bool = ZQ();
    return !bool;
  }
  
  static {
    if (Ze())
      Zv(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgh7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */