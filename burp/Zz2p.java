package burp;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Ztf;

public class Zz2p {
  private final int ZB;
  
  private final Zrgd Zb;
  
  private final Zskh Zu;
  
  private final Ztks ZW;
  
  private final Zzs1 ZH;
  
  private final Zb1c Z_;
  
  private final Zz5u ZE;
  
  private final BiConsumer<Zb09, Throwable> ZY;
  
  private final Zl5x ZK;
  
  private final long Zj;
  
  private final Zbza Zk;
  
  private final Zsoh Zh;
  
  private final Zz28 ZL;
  
  private final Zlli<Zt13> ZT;
  
  private static String[] ZP;
  
  private static final String a;
  
  public Zz2p(int paramInt, Zrgd paramZrgd, Zskh paramZskh, Ztks paramZtks, Zzs1 paramZzs1, Zb1c paramZb1c, Zz5u paramZz5u, BiConsumer<Zb09, Throwable> paramBiConsumer, Zl5x paramZl5x, long paramLong, Zbza paramZbza, Zsoh paramZsoh, Zz28 paramZz28, Zlli<Zt13> paramZlli) {
    this.ZB = paramInt;
    this.Zb = Objects.<Zrgd>requireNonNull(paramZrgd);
    this.Zu = paramZskh;
    this.ZW = paramZtks;
    this.ZH = paramZzs1;
    this.Z_ = paramZb1c;
    this.ZE = paramZz5u;
    String[] arrayOfString = ZC();
    try {
      this.ZY = paramBiConsumer;
      this.ZK = paramZl5x;
      this.Zj = paramLong;
      this.Zk = paramZbza;
      this.Zh = paramZsoh;
      this.ZL = paramZz28;
      this.ZT = paramZlli;
      if (arrayOfString != null)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public void ZM(Ztpx paramZtpx, Zefx paramZefx, Zb6q paramZb6q, Zs68 paramZs68, Zldf paramZldf) {
    Zi(paramZtpx, paramZefx, Collections.emptyList(), paramZb6q, paramZs68, paramZldf, Zsll.TRACING_DISABLED, null, false);
  }
  
  public void Zj(Ztpx paramZtpx, Zefx paramZefx, Zb6q paramZb6q, Zs68 paramZs68, Zldf paramZldf) {
    Zi(paramZtpx, paramZefx, Collections.emptyList(), paramZb6q, paramZs68, paramZldf, Zsll.TRACING_DISABLED, null, true);
  }
  
  public void Zf(Ztpx paramZtpx, Zefx paramZefx, List<String> paramList, Zb6q paramZb6q, Zs68 paramZs68, Zldf paramZldf, Zsll paramZsll, byte[] paramArrayOfbyte) {
    Zi(paramZtpx, paramZefx, paramList, paramZb6q, paramZs68, paramZldf, paramZsll, paramArrayOfbyte, false);
  }
  
  private void Zi(Ztpx paramZtpx, Zefx paramZefx, List<String> paramList, Zb6q paramZb6q, Zs68 paramZs68, Zldf paramZldf, Zsll paramZsll, byte[] paramArrayOfbyte, boolean paramBoolean) {
    try {
    
    } catch (Ztf ztf) {
      throw a(null);
    } 
    boolean bool = (this.ZE.ZE6() > 0) ? true : false;
    try {
      if (bool)
        try {
          if (paramZb6q != null)
            try {
              if (paramZb6q.ZF() > 0)
                try {
                  if (paramZs68.ZH.ZJ == 256 && !paramZs68.ZH.Zl)
                    try {
                      String str1 = this.Z_.ZJ();
                      String str2 = (new Zs7o(paramZefx, paramZsll, paramList, str1, paramArrayOfbyte, paramBoolean)).ZI();
                      try {
                        if (str2.contains("\000"))
                          throw new UnsupportedOperationException(a + a); 
                      } catch (Ztf ztf) {
                        throw a(null);
                      } 
                      (new Ztd2(this.Zb, this.ZW, this.ZH, this.ZE, str2, str1, paramZldf, paramZefx, paramZb6q, paramZs68, this.Zu, this.ZY, this.ZK, this.Zj, paramZtpx, this.Zk, this.Zh, this.ZL, this.ZT)).Zs();
                    } catch (Ztf ztf) {
                      Zah.Zl((Throwable)ztf, Zk_.COMMON_RUNTIME_FAILURE);
                    }  
                } catch (Ztf ztf) {
                  throw a(null);
                }  
            } catch (Ztf ztf) {
              throw a(null);
            }  
        } catch (Ztf ztf) {
          throw a(null);
        }  
    } catch (Ztf ztf) {
      throw a(null);
    } 
  }
  
  public static void ZJ(String[] paramArrayOfString) {
    ZP = paramArrayOfString;
  }
  
  public static String[] ZC() {
    return ZP;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZC : ()[Ljava/lang/String;
    //   3: ifnull -> 13
    //   6: iconst_5
    //   7: anewarray java/lang/String
    //   10: invokestatic ZJ : ([Ljava/lang/String;)V
    //   13: bipush #61
    //   15: ldc 'e-v'95\\bCv:>.]L8 03? 4(C^8!=6^'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Zz2p.a : Ljava/lang/String;
    //   24: goto -> 166
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 140
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #18
    //   94: goto -> 124
    //   97: bipush #67
    //   99: goto -> 124
    //   102: bipush #107
    //   104: goto -> 124
    //   107: bipush #105
    //   109: goto -> 124
    //   112: bipush #108
    //   114: goto -> 124
    //   117: bipush #103
    //   119: goto -> 124
    //   122: bipush #64
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 48
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 45
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 21
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz2p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */