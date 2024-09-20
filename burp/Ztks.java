package burp;

import java.util.function.BiConsumer;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zeu;
import net.portswigger.browser.Ztf;
import net.portswigger.browser.Ztk;
import net.portswigger.browser.Ztz;
import net.portswigger.browser.Zzr;

public class Ztks implements Ztu3, Zmgs {
  private final Zg10 Zx;
  
  private final Ztwv ZM;
  
  private final Zkl6 ZQ;
  
  private final Zsi7 Zr;
  
  private final Zzgs ZA;
  
  private static final String a;
  
  private Ztks(Zsi7 paramZsi7, Zg10 paramZg10, Ztwv paramZtwv, Zkl6 paramZkl6, Zskh paramZskh) {
    this.ZM = paramZtwv;
    this.Zx = paramZg10;
    this.ZQ = paramZkl6;
    this.Zr = paramZsi7;
    this.ZA = Zzgs.Z_(paramZskh);
    if (Zt2u.ZX.Zb && paramZskh != null)
      Zmgc.BROWSER_SANDBOX_NOT_SUPPORTED.ZK(paramZskh.ZA(), new Object[0]); 
  }
  
  public static Ztks ZW(Zsi7 paramZsi7, Zg10 paramZg10, Ztwv paramZtwv, Zkl6 paramZkl6, Zskh paramZskh) {
    return new Ztks(paramZsi7, paramZg10, paramZtwv, paramZkl6, paramZskh);
  }
  
  public static Ztks Zs() {
    return new Ztks(null, Zg10.ZH(), null, null, null);
  }
  
  public Zmle Zb(Zzmb paramZzmb, Zz1m<Zt35> paramZz1m, Zzzx paramZzzx, Zr_4 paramZr_4, Zgb6 paramZgb6, Zzs1 paramZzs1) throws Ztz {
    Zeu zeu = this.Zr.Zu();
    Zeys zeys = new Zeys(zeu.ZM());
    return new Zmle(zeys, paramZr_4, this.ZQ, paramZgb6, paramZzs1, paramZzmb, paramZz1m, paramZzzx, this.Zx, this.ZA, this.ZM);
  }
  
  public void ZY() {
    this.Zx.ZY();
  }
  
  public Zei7 ZB(String paramString1, String paramString2, Zlit paramZlit, Zstu paramZstu, Zs68 paramZs68, BiConsumer<Zb09, Throwable> paramBiConsumer, Zl5x paramZl5x, long paramLong, Ztpx paramZtpx, Zbza paramZbza, Zsoh paramZsoh, Zz28 paramZz28, boolean paramBoolean1, boolean paramBoolean2, Zzs1 paramZzs1) throws Ztf {
    Zs0v zs0v = new Zs0v(paramZzs1, paramString2, paramZlit, paramZstu, paramZs68, this.ZQ, paramZtpx, paramZbza, paramZsoh, paramZz28, paramBoolean1, paramBoolean2);
    try {
      return new Zei7(this.Zr, zs0v, paramZlit, paramString1, this.Zx, this.ZQ, this.ZM, paramBiConsumer, paramZl5x, paramLong);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.RETHROWN);
      throw new Ztf(exception);
    } 
  }
  
  public Zmlb ZH(Zr69 paramZr69, Ztos<Zt18> paramZtos, Zz1m<Zt35> paramZz1m, Zl2k paramZl2k, Zzzx paramZzzx, Zgb6 paramZgb6, Zr_4 paramZr_4, Zli8 paramZli8, Zeb5 paramZeb5, Zm90 paramZm90, Zzs1 paramZzs1, BiConsumer<String, String> paramBiConsumer) throws Ztf {
    try {
      Zeu zeu = this.Zr.Zu();
      Zeys zeys = new Zeys(zeu.ZM());
      return new Zmlb(paramZm90, zeys, paramZr69, paramZtos, paramZz1m, paramZr_4, this.ZQ, paramZgb6, paramZzs1, Ze2m.AGENT, paramZli8, paramZeb5, paramZzzx, paramZl2k, this.Zx, this.ZA, Zzr.ZU().Zm(paramZr69.Zi().multipliedBy(10L)).ZK(paramZr69.Zr()).Zg(paramZr69.ZH()).ZO(paramZr69.Zd()).Zp(), this.ZM, paramBiConsumer);
    } catch (Ztk ztk) {
      Zah.Zl((Throwable)ztk, Zk_.RETHROWN);
      throw new Ztf(ztk);
    } 
  }
  
  public Zzb Zq(Zkvp paramZkvp, Zz28 paramZz28, Zzmb paramZzmb, Zgb6 paramZgb6, Zzs1 paramZzs1) throws Ztf {
    return new Zzb(this.ZQ, this.Zr, paramZkvp, paramZzs1, paramZzmb, paramZz28, paramZgb6, this.Zx, this.ZA, Zzr.ZU().Zm(paramZzmb.Zi().multipliedBy(10L)).ZK(paramZzmb.Zr()).Zg(paramZzmb.ZH()).Zp(), this.ZM);
  }
  
  public void Zl(Zz9t paramZz9t) {
    if (this.Zr != null) {
      paramZz9t.ZP(a);
      this.Zr.Zl(paramZz9t);
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #102
    //   2: ldc 'y!v8e{9i'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ztks.a : Ljava/lang/String;
    //   11: goto -> 154
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
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #35
    //   82: goto -> 112
    //   85: bipush #77
    //   87: goto -> 112
    //   90: bipush #39
    //   92: goto -> 112
    //   95: bipush #16
    //   97: goto -> 112
    //   100: bipush #67
    //   102: goto -> 112
    //   105: bipush #27
    //   107: goto -> 112
    //   110: bipush #54
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztks.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */