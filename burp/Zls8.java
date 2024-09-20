package burp;

import java.util.function.Supplier;
import net.portswigger.Zoq;

public class Zls8 {
  private final Zlfb ZX;
  
  private final Supplier<Zbs1> Zh;
  
  private final Zlba Zi;
  
  private final Zg09 Zb;
  
  private final Ztj1 Zl;
  
  private final Zz0n ZD;
  
  private final Ztwv Zf;
  
  private final Zgb6 Zv;
  
  private final Ztyg ZF;
  
  private final Zgq7 ZH;
  
  private final Zkrj ZP;
  
  private final Zrny Zu;
  
  private final Zs0g ZA;
  
  private final Zg0s Zt;
  
  private final Zs2g ZC;
  
  private final Zz_s Zg;
  
  private final Zskh ZL;
  
  private final Zerg ZT;
  
  private final Zkl6 Zq;
  
  private final Zkg9 Zw;
  
  private final Zg9t Zd;
  
  private final Ztdi ZQ;
  
  private final Zt3h Zc;
  
  private final Zgd Zn;
  
  private final Zxgc Zz;
  
  private final Zgzy ZM;
  
  private final Zgx0 ZS;
  
  private final Zkf3 Zo;
  
  private final Zlli<Zt1o> ZE;
  
  private final Zm6x ZB;
  
  private static String[] Zr;
  
  public Zls8(Zlfb paramZlfb, Supplier<Zbs1> paramSupplier, Zlba paramZlba, Zg09 paramZg09, Ztj1 paramZtj1, Zz0n paramZz0n, Ztwv paramZtwv, Zgb6 paramZgb6, Ztyg paramZtyg, Zgq7 paramZgq7, Zkrj paramZkrj, Zrny paramZrny, Zs0g paramZs0g, Zg0s paramZg0s, Zs2g paramZs2g, Zz_s paramZz_s, Zskh paramZskh, Zerg paramZerg, Zkl6 paramZkl6, Zkg9 paramZkg9, Zg9t paramZg9t, Ztdi paramZtdi, Zt3h paramZt3h, Zgd paramZgd, Zxgc paramZxgc, Zgzy paramZgzy, Zgx0 paramZgx0, Zkf3 paramZkf3, Zlli<Zt1o> paramZlli, Zm6x paramZm6x) {
    this.ZX = paramZlfb;
    this.Zh = paramSupplier;
    this.Zi = paramZlba;
    this.Zb = paramZg09;
    this.Zl = paramZtj1;
    this.ZD = paramZz0n;
    this.Zf = paramZtwv;
    this.Zv = paramZgb6;
    this.ZF = paramZtyg;
    this.ZH = paramZgq7;
    this.ZP = paramZkrj;
    this.Zu = paramZrny;
    this.ZA = paramZs0g;
    this.Zt = paramZg0s;
    this.ZC = paramZs2g;
    this.Zg = paramZz_s;
    this.ZL = paramZskh;
    this.ZT = paramZerg;
    this.Zq = paramZkl6;
    this.Zw = paramZkg9;
    this.Zd = paramZg9t;
    this.ZQ = paramZtdi;
    this.Zc = paramZt3h;
    this.Zn = paramZgd;
    this.Zz = paramZxgc;
    this.ZM = paramZgzy;
    String[] arrayOfString = ZH();
    this.ZS = paramZgx0;
    this.Zo = paramZkf3;
    this.ZE = paramZlli;
    this.ZB = paramZm6x;
    if (Zbqc.Zwu() == null)
      Zg(new String[5]); 
  }
  
  public Zoq<Zbhb> ZQ(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: <illegal opcode> get : (Lburp/Zls8;Z)Ljava/util/function/Supplier;
    //   7: invokestatic ZZ : (Ljava/util/function/Supplier;)Lnet/portswigger/Zoq;
    //   10: areturn
  }
  
  private Zbhb ZW(boolean paramBoolean) {
    return paramBoolean ? new Zbhe(this.Zl, this.ZX, this.Zh, this.ZT, this.Zi, this.ZF, this.ZH, this.Zq, this.Zb, this.Zw, this.Zg, this.ZL, this.Zd, this.ZD, this.Zf, this.Zv, this.ZP, this.Zu, this.ZA, this.Zt, this.ZC, this.ZQ, this.Zc, this.Zn, this.Zz, this.ZM, this.ZS, this.Zo, this.ZE, this.ZB) : new Zbhb(this.Zl, this.ZX, this.Zh, this.ZT, this.Zi, this.ZF, this.ZH, this.Zq, this.Zb, this.Zw, this.Zg, this.ZL, this.Zd, this.ZD, this.Zf, this.Zv, this.Zu, this.ZA, this.Zt, this.ZC, this.ZE, this.ZB);
  }
  
  private Zbhb lambda$detailsPanelProvider$0(boolean paramBoolean) {
    return ZW(paramBoolean);
  }
  
  public static void Zg(String[] paramArrayOfString) {
    Zr = paramArrayOfString;
  }
  
  public static String[] ZH() {
    return Zr;
  }
  
  static {
    if (ZH() != null)
      Zg(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zls8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */