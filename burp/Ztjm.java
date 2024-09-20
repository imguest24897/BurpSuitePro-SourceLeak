package burp;

import java.util.Collections;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

class Ztjm implements Zrbc, Zz09 {
  private final Zl5x ZA;
  
  private final Ze3n Zl;
  
  private final BiConsumer<Zb09, Throwable> ZE;
  
  private final Ztbx ZU;
  
  private final Zbnt Zd;
  
  private final Zkm8 ZB;
  
  private final Ztl Ze;
  
  private final Zz_q ZC;
  
  private final byte[] Zt;
  
  private final Zz1i ZS;
  
  private final Function<Ztpx, Zmhe> Zm;
  
  private final Zg56 ZM;
  
  Ztjm(Zl5x paramZl5x, Ze3n paramZe3n, Zz1i paramZz1i, Function<Ztpx, Zmhe> paramFunction, BiConsumer<Zb09, Throwable> paramBiConsumer, Ztbx paramZtbx, Zbnt paramZbnt, Zkm8 paramZkm8, Ztl paramZtl, Zz_q paramZz_q, byte[] paramArrayOfbyte, Zg56 paramZg56) {
    this.ZA = paramZl5x;
    this.Zl = paramZe3n;
    this.ZS = paramZz1i;
    this.Zm = paramFunction;
    this.ZE = paramBiConsumer;
    this.ZU = paramZtbx;
    this.Zd = paramZbnt;
    this.ZB = paramZkm8;
    this.Ze = paramZtl;
    this.ZC = paramZz_q;
    this.Zt = paramArrayOfbyte;
    this.ZM = paramZg56;
  }
  
  public void ZC(Zrj paramZrj, Zlsy paramZlsy, Ztpx paramZtpx) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zm : Ljava/util/function/Function;
    //   4: aload_3
    //   5: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
    //   10: checkcast burp/Zmhe
    //   13: astore #5
    //   15: aload_0
    //   16: getfield ZU : Lburp/Ztbx;
    //   19: getfield Zn : Lburp/Zsjk;
    //   22: invokevirtual Z_ : ()B
    //   25: istore #6
    //   27: invokestatic ZU : ()I
    //   30: iconst_0
    //   31: istore #7
    //   33: istore #4
    //   35: aload_0
    //   36: getfield Ze : Lburp/Ztl;
    //   39: aload #5
    //   41: aload_0
    //   42: getfield Zt : [B
    //   45: iload #6
    //   47: invokevirtual Z_ : (Lburp/Zmhe;[BB)V
    //   50: aload #5
    //   52: invokeinterface ZR : ()Z
    //   57: ifne -> 85
    //   60: aload #5
    //   62: invokeinterface ZU : ()Z
    //   67: ifne -> 85
    //   70: goto -> 77
    //   73: invokestatic a : (Lburp/Zg57;)Lburp/Zg57;
    //   76: athrow
    //   77: iconst_1
    //   78: goto -> 86
    //   81: invokestatic a : (Lburp/Zg57;)Lburp/Zg57;
    //   84: athrow
    //   85: iconst_0
    //   86: istore #7
    //   88: goto -> 156
    //   91: astore #8
    //   93: aload #8
    //   95: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   98: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   101: iconst_1
    //   102: istore #7
    //   104: goto -> 156
    //   107: astore #8
    //   109: aload #8
    //   111: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   114: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   117: aload_0
    //   118: getfield ZE : Ljava/util/function/BiConsumer;
    //   121: aload_0
    //   122: getfield ZA : Lburp/Zl5x;
    //   125: aload_0
    //   126: getfield ZS : Lburp/Zz1i;
    //   129: aload_0
    //   130: getfield ZA : Lburp/Zl5x;
    //   133: invokeinterface Zd : (Lburp/Zl5x;)J
    //   138: aload #8
    //   140: invokestatic ZB : (Ljava/lang/Throwable;)Ljava/util/Collection;
    //   143: invokestatic Zh : (Lburp/Zl5x;JLjava/util/Collection;)Lburp/Zk1m;
    //   146: invokevirtual Zn : ()Lburp/Zb09;
    //   149: aload #8
    //   151: invokeinterface accept : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   156: aload_0
    //   157: getfield Ze : Lburp/Ztl;
    //   160: invokevirtual ZJ : ()Z
    //   163: ifne -> 235
    //   166: iload #7
    //   168: ifne -> 235
    //   171: goto -> 178
    //   174: invokestatic a : (Lburp/Zg57;)Lburp/Zg57;
    //   177: athrow
    //   178: aload_2
    //   179: new burp/Zzhv
    //   182: dup
    //   183: aload_0
    //   184: getfield Zd : Lburp/Zbnt;
    //   187: aload_0
    //   188: getfield Zl : Lburp/Ze3n;
    //   191: aload_0
    //   192: getfield ZS : Lburp/Zz1i;
    //   195: aload_0
    //   196: getfield ZA : Lburp/Zl5x;
    //   199: aload_0
    //   200: getfield ZB : Lburp/Zkm8;
    //   203: aload_0
    //   204: getfield Ze : Lburp/Ztl;
    //   207: aload_0
    //   208: getfield ZC : Lburp/Zz_q;
    //   211: aload_0
    //   212: getfield ZM : Lburp/Zg56;
    //   215: invokespecial <init> : (Lburp/Zbnt;Lburp/Ze3n;Lburp/Zz1i;Lburp/Zl5x;Lburp/Zkm8;Lburp/Ztl;Lburp/Zz_q;Lburp/Zg56;)V
    //   218: invokeinterface Ze : (Lburp/Zmgr;)V
    //   223: iload #4
    //   225: ifeq -> 261
    //   228: goto -> 235
    //   231: invokestatic a : (Lburp/Zg57;)Lburp/Zg57;
    //   234: athrow
    //   235: iload #7
    //   237: ifeq -> 261
    //   240: goto -> 247
    //   243: invokestatic a : (Lburp/Zg57;)Lburp/Zg57;
    //   246: athrow
    //   247: aload_2
    //   248: aload_0
    //   249: invokeinterface ZR : (Lburp/Zz09;)V
    //   254: goto -> 261
    //   257: invokestatic a : (Lburp/Zg57;)Lburp/Zg57;
    //   260: athrow
    //   261: return
    // Exception table:
    //   from	to	target	type
    //   35	70	73	burp/Zg57
    //   35	88	91	burp/Zg57
    //   35	88	107	java/lang/Throwable
    //   60	81	81	burp/Zg57
    //   156	171	174	burp/Zg57
    //   166	228	231	burp/Zg57
    //   178	240	243	burp/Zg57
    //   235	254	257	burp/Zg57
  }
  
  public Set<? extends Zz09> Zs() {
    return Collections.singleton(this);
  }
  
  private static Zg57 a(Zg57 paramZg57) {
    return paramZg57;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztjm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */