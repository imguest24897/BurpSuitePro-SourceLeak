package burp;

import burp.api.montoya.logger.LoggerCaptureHttpRequestResponse;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Zxw7 implements Zl2h {
  private final Zz0n Zb;
  
  private final Ztwv ZN;
  
  private final Zgzy ZF;
  
  private final Zxgc Zd;
  
  private final Zt3h Zq;
  
  private final Zgb6 ZU;
  
  private final Ztyg Zk;
  
  private final Zgq7 ZP;
  
  private final Supplier<Zkrj> Zu;
  
  private final Zrny Ze;
  
  private final Zs0g ZV;
  
  private final Zg0s ZW;
  
  private final Zs2g Zz;
  
  private final Zz_s ZQ;
  
  private final Zbiv ZR;
  
  private final Zerg Zr;
  
  private final Zkl6 ZC;
  
  private final Zlba Z_;
  
  private final Zg09 Zy;
  
  private final Zkg9 Zo;
  
  private final Zegl ZD;
  
  private final Ztdi ZB;
  
  private final Zkf3 ZA;
  
  private final Zm6v ZT;
  
  private final Zgx0 Zi;
  
  private final Zm6x Zp;
  
  private static final String a;
  
  Zxw7(Zz0n paramZz0n, Ztwv paramZtwv, Zgzy paramZgzy, Zxgc paramZxgc, Zt3h paramZt3h, Zgb6 paramZgb6, Ztyg paramZtyg, Zgq7 paramZgq7, Supplier<Zkrj> paramSupplier, Zrny paramZrny, Zs0g paramZs0g, Zg0s paramZg0s, Zs2g paramZs2g, Zz_s paramZz_s, Zbiv paramZbiv, Zerg paramZerg, Zkl6 paramZkl6, Zegl paramZegl, Zlba paramZlba, Zg09 paramZg09, Zkg9 paramZkg9, Ztdi paramZtdi, Zkf3 paramZkf3, Zm6v paramZm6v, Zgx0 paramZgx0, Zm6x paramZm6x) {
    this.Zb = paramZz0n;
    this.ZN = paramZtwv;
    int[] arrayOfInt = Zkyq.ZM();
    try {
      this.ZF = paramZgzy;
      this.Zd = paramZxgc;
      this.Zq = paramZt3h;
      this.ZU = paramZgb6;
      this.Zk = paramZtyg;
      this.ZP = paramZgq7;
      this.Zu = paramSupplier;
      this.Ze = paramZrny;
      this.ZV = paramZs0g;
      this.ZW = paramZg0s;
      this.Zz = paramZs2g;
      this.ZQ = paramZz_s;
      this.ZR = paramZbiv;
      this.Zr = paramZerg;
      this.ZC = paramZkl6;
      this.Z_ = paramZlba;
      this.Zy = paramZg09;
      this.Zo = paramZkg9;
      this.ZD = paramZegl;
      this.ZB = paramZtdi;
      this.ZA = paramZkf3;
      this.ZT = paramZm6v;
      this.Zi = paramZgx0;
      this.Zp = paramZm6x;
      if (Zbqc.Zwu() == null)
        Zkyq.ZB(new int[5]); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public Zmot ZX(Ztj1 paramZtj1, Zlog paramZlog, Zlfb paramZlfb, Zskh paramZskh, Supplier<Zbs1> paramSupplier, Zl1k paramZl1k, Zsju paramZsju, Consumer<Zs4l<LoggerCaptureHttpRequestResponse, Boolean>> paramConsumer) {
    Zbvx zbvx = new Zbvx(paramZlfb, paramZtj1);
    Zg9t zg9t = new Zg9t(this.ZD, paramZskh, paramZl1k, paramZsju, paramZlog.Zd5().ZaI(), this.ZT, paramConsumer);
    boolean bool = paramZlog.ZnH().ZVV();
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Zgd zgd = bool ? new Zgd(this.ZB, paramZlog.ZnH().ZVX()) : null;
    Zeaq zeaq = new Zeaq(paramZtj1, paramZlfb, paramSupplier, this.ZN, this.ZQ, paramZskh, this.ZC, zg9t, this.ZB, this.Zq, zgd, this.Zr, this.Zd, this.ZF, this.Zi, this.ZA, this.Zp, this.Zb);
    return new Zmot(this.ZR, paramZlfb, zbvx, zeaq.ZB(bool), paramZtj1.Zr());
  }
  
  public Zmor ZE(Ztj1 paramZtj1, Zr5h paramZr5h, Zlfb paramZlfb, Zskh paramZskh, Supplier<Zbs1> paramSupplier, Zl1k paramZl1k, Zsju paramZsju, Zlli<Zt1o> paramZlli, Consumer<Zs4l<LoggerCaptureHttpRequestResponse, Boolean>> paramConsumer) {
    Zbvz zbvz = new Zbvz(paramZlfb, paramZtj1);
    Zg9t zg9t = new Zg9t(this.ZD, paramZskh, paramZl1k, paramZsju, paramZr5h.Zd5().ZaI(), this.ZT, paramConsumer);
    Zb_e zb_e = new Zb_e(paramZlfb, paramSupplier, this.Z_, this.Zy, paramZtj1, this.Zb, this.ZN, this.ZU, this.Zk, this.ZP, this.Ze, this.ZV, this.ZW, this.Zz, this.ZQ, paramZskh, this.Zr, this.ZC, this.Zo, zg9t, paramZlli, this.Zp);
    return new Zmor(this.ZR, paramZlfb, zbvz, zb_e.Zt(), paramZtj1.Zr());
  }
  
  public Zmoy ZA(Ztj1 paramZtj1, Zzep paramZzep, Zlfb paramZlfb, Zskh paramZskh, Supplier<Zbs1> paramSupplier, Zl1k paramZl1k, Zsju paramZsju, Zlli<Zt1o> paramZlli, Consumer<Zs4l<LoggerCaptureHttpRequestResponse, Boolean>> paramConsumer) {
    Zbvz zbvz = new Zbvz(paramZlfb, paramZtj1);
    Zg9t zg9t = new Zg9t(this.ZD, paramZskh, paramZl1k, paramZsju, paramZzep.Zd5().ZaI(), this.ZT, paramConsumer);
    int[] arrayOfInt = Zkyq.ZM();
    boolean bool = paramZzep.ZnH().ZVV();
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Zgd zgd = bool ? new Zgd(this.ZB, paramZzep.ZnH().ZVX()) : null;
    Zls8 zls8 = new Zls8(paramZlfb, paramSupplier, this.Z_, this.Zy, paramZtj1, this.Zb, this.ZN, this.ZU, this.Zk, this.ZP, this.Zu.get(), this.Ze, this.ZV, this.ZW, this.Zz, this.ZQ, paramZskh, this.Zr, this.ZC, this.Zo, zg9t, this.ZB, this.Zq, zgd, this.Zd, this.ZF, this.Zi, this.ZA, paramZlli, this.Zp);
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[2]); 
    return new Zmoy(this.ZR, paramZlfb, zbvz, zls8.ZQ(bool), paramZtj1.Zr());
  }
  
  public Zxsz Zh(Ztj1 paramZtj1, Ztr3 paramZtr3, Zlfb paramZlfb, Zskh paramZskh, Supplier<Zbs1> paramSupplier, Zl1k paramZl1k, Zsju paramZsju, Zlli<Zt1o> paramZlli, Consumer<Zs4l<LoggerCaptureHttpRequestResponse, Boolean>> paramConsumer) {
    Zl2b zl2b = new Zl2b(paramZlfb, paramZtj1);
    Zg9t zg9t = new Zg9t(this.ZD, paramZskh, paramZl1k, paramZsju, paramZtr3.Zd5().ZaI(), this.ZT, paramConsumer);
    Zgh7 zgh7 = new Zgh7(paramZlfb, paramSupplier, this.Z_, this.Zy, paramZtj1, this.Zb, this.ZN, this.ZU, this.Zk, this.ZP, this.Ze, this.ZV, this.ZW, this.Zz, this.ZQ, paramZskh, this.Zr, this.ZC, this.Zo, zg9t, paramZlli, this.Zp);
    return new Zxsz(this.ZR, paramZlfb, zl2b, zgh7, paramZtj1.Zr());
  }
  
  public Zes4 Zn(Ztj1 paramZtj1, Ze9i paramZe9i, Zlfb paramZlfb) {
    Ze7u ze7u = new Ze7u(paramZlfb, paramZtj1);
    Zb80 zb80 = new Zb80(paramZlfb, paramZtj1, this.Zd, this.Zr, this.ZB, this.Zi, this.Zp);
    return new Zes4(this.ZR, paramZlfb, ze7u, zb80, paramZtj1.Zr());
  }
  
  public Zmau Zu(Ztj1 paramZtj1, Zzys paramZzys, Zlfb paramZlfb, Supplier<Zbs1> paramSupplier) {
    throw new UnsupportedOperationException(a);
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #39
    //   2: ldc 'b1gIyC0VfWyBC:VLKhQB;whBD4VsLyT9jH<GR9pIhQ>qJnZw@}WR?kQnVS:%VlFT6lF<EV<jWe^1q@}G'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zxw7.a : Ljava/lang/String;
    //   11: goto -> 152
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 126
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 104
    //   80: bipush #16
    //   82: goto -> 110
    //   85: bipush #120
    //   87: goto -> 110
    //   90: bipush #81
    //   92: goto -> 110
    //   95: bipush #34
    //   97: goto -> 110
    //   100: iconst_2
    //   101: goto -> 110
    //   104: bipush #59
    //   106: goto -> 110
    //   109: iconst_4
    //   110: ixor
    //   111: ixor
    //   112: i2c
    //   113: castore
    //   114: iinc #0, 1
    //   117: dup
    //   118: ifne -> 126
    //   121: dup2
    //   122: dup_x1
    //   123: goto -> 35
    //   126: dup2_x1
    //   127: pop2
    //   128: dup_x2
    //   129: iload_0
    //   130: if_icmpgt -> 32
    //   133: pop
    //   134: new java/lang/String
    //   137: dup_x1
    //   138: swap
    //   139: invokespecial <init> : ([C)V
    //   142: invokevirtual intern : ()Ljava/lang/String;
    //   145: swap
    //   146: pop
    //   147: swap
    //   148: pop
    //   149: goto -> 8
    //   152: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxw7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */