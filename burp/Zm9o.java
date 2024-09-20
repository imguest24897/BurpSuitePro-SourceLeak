package burp;

import java.util.List;
import net.portswigger.Zgl;
import net.portswigger.Zm2;
import net.portswigger.browser.Zc8;
import net.portswigger.browser.Zci;
import net.portswigger.browser.Zja;
import net.portswigger.browser.Zji;
import net.portswigger.browser.Zu;

public class Zm9o {
  private final Zmo4 Zp;
  
  private final Zji ZF;
  
  private final Ztos<Zt1w> ZX;
  
  private final Zer_ Zc;
  
  private final Zja Zt;
  
  private static Zbqc[] ZZ;
  
  public Zm9o(Zmo4 paramZmo4, Zji paramZji, Zer_ paramZer_, Ztos<Zt1w> paramZtos, Zja paramZja) {
    this.Zp = paramZmo4;
    this.ZF = paramZji;
    this.Zc = paramZer_;
    this.ZX = paramZtos;
    this.Zt = paramZja;
  }
  
  public void ZI(Zg96 paramZg96, Zmle paramZmle, Zggg paramZggg) {
    // Byte code:
    //   0: invokestatic ZX : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: new net/portswigger/Zgl
    //   8: dup
    //   9: invokestatic Zo : ()Ljava/lang/String;
    //   12: invokespecial <init> : (Ljava/lang/String;)V
    //   15: astore #5
    //   17: aload_2
    //   18: invokevirtual Zy : ()V
    //   21: aload_2
    //   22: aload_3
    //   23: getfield ZE : Lnet/portswigger/browser/Zjx;
    //   26: aload_3
    //   27: getfield Zs : Lnet/portswigger/browser/Zdr;
    //   30: invokevirtual Zc : (Lnet/portswigger/browser/Zd_;Lnet/portswigger/browser/Zdr;)V
    //   33: iconst_0
    //   34: istore #6
    //   36: iload #6
    //   38: ifne -> 350
    //   41: aload_3
    //   42: invokevirtual ZR : ()Z
    //   45: ifeq -> 67
    //   48: aload_0
    //   49: aload #5
    //   51: aload_3
    //   52: invokevirtual Zv : (Lnet/portswigger/Zgl;Lburp/Zggg;)V
    //   55: aload #4
    //   57: ifnonnull -> 350
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   66: athrow
    //   67: aload_3
    //   68: invokevirtual ZG : ()I
    //   71: iconst_3
    //   72: if_icmpne -> 97
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   81: athrow
    //   82: aload_0
    //   83: getstatic net/portswigger/browser/Zci.EXCEEDED_MAXIMUM_RESTARTS : Lnet/portswigger/browser/Zci;
    //   86: invokevirtual Zf : (Lnet/portswigger/browser/Zci;)V
    //   89: aload_0
    //   90: aload #5
    //   92: aload_3
    //   93: invokevirtual Zd : (Lnet/portswigger/Zgl;Lburp/Zggg;)V
    //   96: return
    //   97: aload_3
    //   98: invokevirtual Zw : ()I
    //   101: bipush #75
    //   103: if_icmpne -> 121
    //   106: aload_0
    //   107: getstatic net/portswigger/browser/Zci.EXCEEDED_MAXIMUM_REQUESTS : Lnet/portswigger/browser/Zci;
    //   110: invokevirtual Zf : (Lnet/portswigger/browser/Zci;)V
    //   113: aload_0
    //   114: aload #5
    //   116: aload_3
    //   117: invokevirtual Zd : (Lnet/portswigger/Zgl;Lburp/Zggg;)V
    //   120: return
    //   121: ldc2_w 500
    //   124: invokestatic ofMillis : (J)Ljava/time/Duration;
    //   127: invokestatic Zc : (Ljava/time/Duration;)Lnet/portswigger/browser/Zjf;
    //   130: astore #7
    //   132: aload_2
    //   133: aload #7
    //   135: aload_3
    //   136: getfield Zs : Lnet/portswigger/browser/Zdr;
    //   139: invokevirtual Zc : (Lnet/portswigger/browser/Zd_;Lnet/portswigger/browser/Zdr;)V
    //   142: aload_0
    //   143: getfield Zc : Lburp/Zer_;
    //   146: aload_2
    //   147: invokevirtual ZX : (Lburp/Zmle;)Lnet/portswigger/browser/Zjw;
    //   150: astore #8
    //   152: aload_0
    //   153: getfield Zc : Lburp/Zer_;
    //   156: aload_2
    //   157: invokevirtual ZN : (Lburp/Zmle;)Lnet/portswigger/browser/Zt3;
    //   160: astore #9
    //   162: aload_0
    //   163: getfield Zt : Lnet/portswigger/browser/Zja;
    //   166: aload #8
    //   168: aload #9
    //   170: invokevirtual Zo : (Lnet/portswigger/browser/Zjw;Lnet/portswigger/browser/Zt3;)Lnet/portswigger/browser/Zc8;
    //   173: astore #10
    //   175: aload_0
    //   176: aload_1
    //   177: aload #10
    //   179: aload_3
    //   180: invokevirtual ZI : ()Ljava/util/List;
    //   183: invokevirtual ZD : (Lburp/Zg96;Lnet/portswigger/browser/Zc8;Ljava/util/List;)Lnet/portswigger/browser/Zu;
    //   186: astore #11
    //   188: getstatic burp/Zkvf.ZV : [I
    //   191: aload #11
    //   193: invokevirtual ZrB : ()Lnet/portswigger/browser/Zdg;
    //   196: invokevirtual ordinal : ()I
    //   199: iaload
    //   200: tableswitch default -> 345, 1 -> 232, 2 -> 232, 3 -> 304, 4 -> 342
    //   232: aload_0
    //   233: getfield ZF : Lnet/portswigger/browser/Zji;
    //   236: aload #11
    //   238: aload #9
    //   240: invokevirtual Zh : (Lnet/portswigger/browser/Zu;Lnet/portswigger/browser/Zt3;)Ljava/util/List;
    //   243: astore #12
    //   245: aload #12
    //   247: invokeinterface iterator : ()Ljava/util/Iterator;
    //   252: astore #13
    //   254: aload #13
    //   256: invokeinterface hasNext : ()Z
    //   261: ifeq -> 291
    //   264: aload #13
    //   266: invokeinterface next : ()Ljava/lang/Object;
    //   271: checkcast net/portswigger/browser/Zd_
    //   274: astore #14
    //   276: aload_2
    //   277: aload #14
    //   279: aload_3
    //   280: getfield Zs : Lnet/portswigger/browser/Zdr;
    //   283: invokevirtual Zc : (Lnet/portswigger/browser/Zd_;Lnet/portswigger/browser/Zdr;)V
    //   286: aload #4
    //   288: ifnonnull -> 254
    //   291: aload_3
    //   292: aload #11
    //   294: aload #12
    //   296: invokevirtual Zm : (Lnet/portswigger/browser/Zu;Ljava/util/List;)V
    //   299: aload #4
    //   301: ifnonnull -> 345
    //   304: aload_3
    //   305: invokevirtual Zs : ()V
    //   308: aload_2
    //   309: invokevirtual Zy : ()V
    //   312: aload_2
    //   313: aload_3
    //   314: getfield ZE : Lnet/portswigger/browser/Zjx;
    //   317: aload_3
    //   318: getfield Zs : Lnet/portswigger/browser/Zdr;
    //   321: invokevirtual Zc : (Lnet/portswigger/browser/Zd_;Lnet/portswigger/browser/Zdr;)V
    //   324: aload_3
    //   325: aload #11
    //   327: invokevirtual ZC : (Lnet/portswigger/browser/Zu;)V
    //   330: aload #4
    //   332: ifnonnull -> 345
    //   335: goto -> 342
    //   338: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   341: athrow
    //   342: iconst_1
    //   343: istore #6
    //   345: aload #4
    //   347: ifnonnull -> 36
    //   350: iload #6
    //   352: ifeq -> 407
    //   355: aload_3
    //   356: ldc2_w 500
    //   359: invokestatic ofMillis : (J)Ljava/time/Duration;
    //   362: invokestatic Zc : (Ljava/time/Duration;)Lnet/portswigger/browser/Zjf;
    //   365: invokevirtual ZM : (Lnet/portswigger/browser/Zer;)V
    //   368: aload_3
    //   369: invokevirtual ZA : ()Lnet/portswigger/browser/Zc5;
    //   372: astore #7
    //   374: aload_0
    //   375: getfield ZX : Lburp/Ztos;
    //   378: new burp/Zxr8
    //   381: dup
    //   382: getstatic burp/Zt1w.ZF : Lburp/Zlnb;
    //   385: new burp/Zrb0
    //   388: dup
    //   389: aload #7
    //   391: invokespecial <init> : (Lnet/portswigger/browser/Zc5;)V
    //   394: invokespecial <init> : (Lburp/Zlnb;Ljava/lang/Object;)V
    //   397: invokevirtual ZD : (Lburp/Zxr8;)V
    //   400: aload_0
    //   401: aload #5
    //   403: aload_3
    //   404: invokevirtual Zj : (Lnet/portswigger/Zgl;Lburp/Zggg;)V
    //   407: goto -> 491
    //   410: astore #6
    //   412: aload #6
    //   414: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   417: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   420: aload_0
    //   421: getstatic net/portswigger/browser/Zci.INVALID_STEP_GENERATED : Lnet/portswigger/browser/Zci;
    //   424: aload_3
    //   425: invokevirtual Zr : (Lnet/portswigger/browser/Zci;Lburp/Zggg;)V
    //   428: aload_0
    //   429: aload #5
    //   431: aload_3
    //   432: invokevirtual Zd : (Lnet/portswigger/Zgl;Lburp/Zggg;)V
    //   435: goto -> 491
    //   438: astore #6
    //   440: aload #6
    //   442: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   445: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   448: aload_0
    //   449: getstatic net/portswigger/browser/Zci.CONNECTION_FAILED : Lnet/portswigger/browser/Zci;
    //   452: aload_3
    //   453: invokevirtual Zr : (Lnet/portswigger/browser/Zci;Lburp/Zggg;)V
    //   456: aload_0
    //   457: aload #5
    //   459: aload_3
    //   460: invokevirtual Zd : (Lnet/portswigger/Zgl;Lburp/Zggg;)V
    //   463: goto -> 491
    //   466: astore #6
    //   468: aload #6
    //   470: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   473: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   476: aload_0
    //   477: getstatic net/portswigger/browser/Zci.STEP_REPLAY_FAILED : Lnet/portswigger/browser/Zci;
    //   480: aload_3
    //   481: invokevirtual Zr : (Lnet/portswigger/browser/Zci;Lburp/Zggg;)V
    //   484: aload_0
    //   485: aload #5
    //   487: aload_3
    //   488: invokevirtual Zd : (Lnet/portswigger/Zgl;Lburp/Zggg;)V
    //   491: return
    // Exception table:
    //   from	to	target	type
    //   17	96	410	net/portswigger/browser/Zcy
    //   17	96	438	burp/Zx_l
    //   17	96	466	net/portswigger/browser/Ztk
    //   17	96	466	java/lang/InterruptedException
    //   17	96	466	java/lang/RuntimeException
    //   41	60	63	net/portswigger/browser/Zcy
    //   48	75	78	net/portswigger/browser/Zcy
    //   97	120	410	net/portswigger/browser/Zcy
    //   97	120	438	burp/Zx_l
    //   97	120	466	net/portswigger/browser/Ztk
    //   97	120	466	java/lang/InterruptedException
    //   97	120	466	java/lang/RuntimeException
    //   121	407	410	net/portswigger/browser/Zcy
    //   121	407	438	burp/Zx_l
    //   121	407	466	net/portswigger/browser/Ztk
    //   121	407	466	java/lang/InterruptedException
    //   121	407	466	java/lang/RuntimeException
    //   291	335	338	net/portswigger/browser/Zcy
  }
  
  private void Zv(Zgl paramZgl, Zggg paramZggg) {
    Zm2.Ze(paramZgl, Zv8r.SCANNER_AI_RECORDED_LOGIN_CANCELLED_RETRY_COUNT, paramZggg.ZG());
    Zm2.Ze(paramZgl, Zv8r.SCANNER_AI_RECORDED_LOGIN_CANCELLED_STEP_COUNT, paramZggg.Zw());
  }
  
  private void Zj(Zgl paramZgl, Zggg paramZggg) {
    Zm2.Ze(paramZgl, Zv8r.SCANNER_AI_RECORDED_LOGIN_SUCCESS_RETRY_COUNT, paramZggg.ZG());
    Zm2.Ze(paramZgl, Zv8r.SCANNER_AI_RECORDED_LOGIN_SUCCESS_STEP_COUNT, paramZggg.Zw());
  }
  
  private void Zd(Zgl paramZgl, Zggg paramZggg) {
    Zm2.Ze(paramZgl, Zv8r.SCANNER_AI_RECORDED_LOGIN_FAILURE_RETRY_COUNT, paramZggg.ZG());
    Zm2.Ze(paramZgl, Zv8r.SCANNER_AI_RECORDED_LOGIN_FAILURE_STEP_COUNT, paramZggg.Zw());
  }
  
  private void Zf(Zci paramZci) {
    this.ZX.ZD(new Zxr8(Zt1w.Zt, new Zl0l(paramZci)));
  }
  
  private Zu ZD(Zg96 paramZg96, Zc8 paramZc8, List<Zu> paramList) throws Zx_l {
    Zk9l zk9l = new Zk9l(paramZg96);
    Zgxj zgxj = new Zgxj(zk9l, paramList, paramZc8);
    return this.Zp.ZB(zgxj);
  }
  
  private void Zr(Zci paramZci, Zggg paramZggg) {
    try {
      if (!paramZggg.ZR())
        this.ZX.ZD(new Zxr8(Zt1w.Zt, new Zl0l(paramZci))); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public Ztos<Zt1w> ZW() {
    return this.ZX;
  }
  
  public static void ZX(Zbqc[] paramArrayOfZbqc) {
    ZZ = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZX() {
    return ZZ;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    if (ZX() == null)
      ZX(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm9o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */