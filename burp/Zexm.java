package burp;

import java.util.concurrent.atomic.AtomicBoolean;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zd6;
import net.portswigger.browser.Zjt;
import net.portswigger.browser.Zth;
import net.portswigger.browser.Ztv;
import net.portswigger.browser.Zzz;

public class Zexm {
  private final Zkl6 Zx;
  
  private final Zxrn Zg;
  
  private final Zstu Zc;
  
  private final AtomicBoolean ZM;
  
  private static final String a;
  
  public Zexm(Zkl6 paramZkl6, Zxrn paramZxrn, Zstu paramZstu) {
    this.Zx = paramZkl6;
    this.Zg = paramZxrn;
    this.Zc = paramZstu;
    this.ZM = new AtomicBoolean();
  }
  
  public Zd6 Zm(Ztv paramZtv, Zjt paramZjt) {
    try {
      return ZE(Ztgw.Zn(paramZjt, paramZtv, null, this.Zx)).Zm();
    } catch (Zxgy|Zxg5|java.net.MalformedURLException zxgy) {
      Zah.Zl(zxgy, Zk_.IGNORED);
      return (Zd6)new Zth();
    } 
  }
  
  public Zz0z ZE(Ztgw paramZtgw) {
    // Byte code:
    //   0: invokestatic Zg : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual Zk : ()Lnet/portswigger/browser/Zec;
    //   8: getstatic net/portswigger/browser/Zec.DOCUMENT : Lnet/portswigger/browser/Zec;
    //   11: if_acmpne -> 49
    //   14: aload_0
    //   15: getfield ZM : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   18: invokevirtual get : ()Z
    //   21: ifeq -> 32
    //   24: new burp/Zz5y
    //   27: dup
    //   28: invokespecial <init> : ()V
    //   31: areturn
    //   32: aload_0
    //   33: getfield Zc : Lburp/Zstu;
    //   36: astore_3
    //   37: aload_0
    //   38: getfield ZM : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   41: iconst_1
    //   42: invokevirtual set : (Z)V
    //   45: aload_2
    //   46: ifnonnull -> 55
    //   49: aload_0
    //   50: aload_1
    //   51: invokevirtual Zr : (Lburp/Ztgw;)Lburp/Zstu;
    //   54: astore_3
    //   55: aload_1
    //   56: invokevirtual Zd : ()Lburp/Zski;
    //   59: invokeinterface ZyR : ()Lburp/Zlit;
    //   64: aload_3
    //   65: getstatic burp/Zt0k.NO_HTML_ANALYSIS : Lburp/Zt0k;
    //   68: aload_0
    //   69: getfield Zx : Lburp/Zkl6;
    //   72: invokeinterface ZB : ()Lburp/Zbnt;
    //   77: invokestatic Zt : (Lburp/Zlit;Lburp/Zstu;Lburp/Zt0k;Lburp/Zbnt;)Lburp/Zs68;
    //   80: astore #4
    //   82: aload #4
    //   84: getfield Zb : S
    //   87: sipush #204
    //   90: if_icmpne -> 101
    //   93: new burp/Zz5y
    //   96: dup
    //   97: invokespecial <init> : ()V
    //   100: areturn
    //   101: aload #4
    //   103: getfield Zb : S
    //   106: sipush #300
    //   109: if_icmplt -> 149
    //   112: aload #4
    //   114: getfield Zb : S
    //   117: sipush #400
    //   120: if_icmpge -> 149
    //   123: aload_1
    //   124: invokevirtual Zk : ()Lnet/portswigger/browser/Zec;
    //   127: getstatic net/portswigger/browser/Zec.DOCUMENT : Lnet/portswigger/browser/Zec;
    //   130: if_acmpne -> 149
    //   133: aload #4
    //   135: invokestatic ZW : (Lburp/Zs68;)Lburp/Zgv9;
    //   138: sipush #200
    //   141: invokevirtual ZA : (I)Lburp/Zgv9;
    //   144: invokevirtual Zl : ()Lburp/Zs68;
    //   147: astore #4
    //   149: aload #4
    //   151: astore #5
    //   153: aload #5
    //   155: aload_3
    //   156: <illegal opcode> Zm : (Lburp/Zs68;Lburp/Zstu;)Lburp/Zz0z;
    //   161: areturn
  }
  
  public Zstu Zr(Ztgw paramZtgw) {
    boolean bool = a.equals(paramZtgw.ZC());
    byte[] arrayOfByte = bool ? this.Zg.Zs(paramZtgw.Zk(), paramZtgw.Zd().ZyR()) : Zx7.Zl;
    return Zyf.Zy(arrayOfByte);
  }
  
  private static Zd6 lambda$handleRequest$0(Zs68 paramZs68, Zstu paramZstu) {
    return (Zd6)new Zzz(paramZs68.Zb, Ztfi.Zj(paramZs68), Ztfi.Zu(paramZs68.Zy()), paramZstu.Zb(paramZs68.Zk, paramZstu.Zpu()));
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: ldc '1g.'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zexm.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
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
    //   80: bipush #125
    //   82: goto -> 111
    //   85: bipush #41
    //   87: goto -> 111
    //   90: bipush #113
    //   92: goto -> 111
    //   95: bipush #111
    //   97: goto -> 111
    //   100: iconst_3
    //   101: goto -> 111
    //   104: bipush #51
    //   106: goto -> 111
    //   109: bipush #13
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zexm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */