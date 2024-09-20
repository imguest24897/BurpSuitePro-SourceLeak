package burp;

import java.util.function.Supplier;
import net.portswigger.Zoq;

public class Zeaq {
  private final Zlfb ZA;
  
  private final Supplier<Zbs1> Zd;
  
  private final Ztj1 ZZ;
  
  private final Ztwv Ze;
  
  private final Zz_s ZR;
  
  private final Zskh ZG;
  
  private final Zkl6 Za;
  
  private final Zg9t ZY;
  
  private final Ztdi Zu;
  
  private final Zt3h ZL;
  
  private final Zgd Zo;
  
  private final Zerg Zf;
  
  private final Zxgc Zy;
  
  private final Zgzy ZP;
  
  private final Zgx0 Zj;
  
  private final Zkf3 Zr;
  
  private final Zm6x ZN;
  
  private final Zz0n ZD;
  
  private static Zbqc[] Zh;
  
  public Zeaq(Ztj1 paramZtj1, Zlfb paramZlfb, Supplier<Zbs1> paramSupplier, Ztwv paramZtwv, Zz_s paramZz_s, Zskh paramZskh, Zkl6 paramZkl6, Zg9t paramZg9t, Ztdi paramZtdi, Zt3h paramZt3h, Zgd paramZgd, Zerg paramZerg, Zxgc paramZxgc, Zgzy paramZgzy, Zgx0 paramZgx0, Zkf3 paramZkf3, Zm6x paramZm6x, Zz0n paramZz0n) {
    this.ZA = paramZlfb;
    this.Zd = paramSupplier;
    this.ZZ = paramZtj1;
    this.Ze = paramZtwv;
    this.ZR = paramZz_s;
    this.ZG = paramZskh;
    this.Za = paramZkl6;
    this.ZY = paramZg9t;
    this.Zu = paramZtdi;
    this.ZL = paramZt3h;
    this.Zo = paramZgd;
    this.Zf = paramZerg;
    this.Zy = paramZxgc;
    this.ZP = paramZgzy;
    this.Zj = paramZgx0;
    Zbqc[] arrayOfZbqc = ZS();
    this.Zr = paramZkf3;
    this.ZN = paramZm6x;
    this.ZD = paramZz0n;
    if (Zbqc.Zwu() == null)
      ZV(new Zbqc[4]); 
  }
  
  public Zoq<Zbhv> ZB(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: <illegal opcode> get : (Lburp/Zeaq;Z)Ljava/util/function/Supplier;
    //   7: invokestatic ZZ : (Ljava/util/function/Supplier;)Lnet/portswigger/Zoq;
    //   10: areturn
  }
  
  private Zbhv ZH(boolean paramBoolean) {
    return paramBoolean ? new Zbhm(this.ZZ, this.ZA, this.Zd, this.ZR, this.ZG, this.ZY, this.Zf, this.Zu, this.Zy, this.Zj, this.ZL, this.Zo, this.ZP, this.Za, this.Ze, this.Zr, this.ZN, this.ZD) : new Zbhv(this.ZZ, this.ZA, this.Zd, this.ZR, this.ZG, this.ZY, this.Zf, this.Zu, this.Zy, this.Zj, this.ZN, this.ZD);
  }
  
  private Zbhv lambda$detailsPanelProvider$0(boolean paramBoolean) {
    return ZH(paramBoolean);
  }
  
  public static void ZV(Zbqc[] paramArrayOfZbqc) {
    Zh = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZS() {
    return Zh;
  }
  
  static {
    if (ZS() != null)
      ZV(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeaq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */