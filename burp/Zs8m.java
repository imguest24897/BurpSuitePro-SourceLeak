package burp;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Zs8m<T, C extends Zm_p> {
  private final Zbfi ZA;
  
  private final Predicate<? super T> ZS;
  
  private final C Zg;
  
  private final Consumer<? super T> Zh;
  
  private final Consumer<? super T> Zq;
  
  private final Zl_e Zy;
  
  private final Zbzl<? super T> Zw;
  
  private static String ZL;
  
  public Zs8m(Zbfi paramZbfi, Predicate<? super T> paramPredicate, C paramC, Consumer<? super T> paramConsumer1, Consumer<? super T> paramConsumer2, Zl_e paramZl_e, Zbzl<? super T> paramZbzl) {
    this.ZA = paramZbfi;
    this.ZS = paramPredicate;
    this.Zg = paramC;
    this.Zh = paramConsumer1;
    this.Zq = paramConsumer2;
    this.Zw = paramZbzl;
    this.Zy = paramZl_e;
  }
  
  public void Zw(List<T> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZA : Lburp/Zbfi;
    //   4: invokeinterface ZqM : ()Lburp/Zeko;
    //   9: getstatic burp/Zeko.MINIMIZE_FALSE_NEGATIVES : Lburp/Zeko;
    //   12: invokevirtual Zn : (Lburp/Zeko;)Z
    //   15: istore_3
    //   16: invokestatic ZY : ()Ljava/lang/String;
    //   19: new java/util/LinkedList
    //   22: dup
    //   23: aload_1
    //   24: invokespecial <init> : (Ljava/util/Collection;)V
    //   27: astore #4
    //   29: astore_2
    //   30: aload #4
    //   32: invokeinterface isEmpty : ()Z
    //   37: ifne -> 315
    //   40: aload #4
    //   42: invokeinterface peek : ()Ljava/lang/Object;
    //   47: astore #5
    //   49: iconst_0
    //   50: istore #6
    //   52: iconst_0
    //   53: istore #7
    //   55: aload_0
    //   56: getfield ZS : Ljava/util/function/Predicate;
    //   59: aload #5
    //   61: invokeinterface test : (Ljava/lang/Object;)Z
    //   66: ifeq -> 296
    //   69: invokestatic now : ()Ljava/time/Instant;
    //   72: astore #8
    //   74: aload_0
    //   75: getfield Zh : Ljava/util/function/Consumer;
    //   78: aload #5
    //   80: invokeinterface accept : (Ljava/lang/Object;)V
    //   85: aload_0
    //   86: getfield Zy : Lburp/Zl_e;
    //   89: invokeinterface ZR : ()Z
    //   94: ifne -> 127
    //   97: aload_0
    //   98: getfield Zy : Lburp/Zl_e;
    //   101: invokeinterface ZU : ()Z
    //   106: ifne -> 124
    //   109: goto -> 116
    //   112: invokestatic a : (Lburp/Zg57;)Lburp/Zg57;
    //   115: athrow
    //   116: iconst_1
    //   117: goto -> 125
    //   120: invokestatic a : (Lburp/Zg57;)Lburp/Zg57;
    //   123: athrow
    //   124: iconst_0
    //   125: istore #7
    //   127: goto -> 180
    //   130: astore #9
    //   132: aload #9
    //   134: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   137: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   140: iconst_1
    //   141: istore #7
    //   143: goto -> 180
    //   146: astore #9
    //   148: aload #9
    //   150: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   153: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   156: aload_0
    //   157: getfield Zw : Lburp/Zbzl;
    //   160: aload #5
    //   162: aload #9
    //   164: invokeinterface Zq : (Ljava/lang/Object;Ljava/lang/Throwable;)V
    //   169: iconst_1
    //   170: istore #6
    //   172: goto -> 180
    //   175: astore #10
    //   177: aload #10
    //   179: athrow
    //   180: iload #6
    //   182: ifeq -> 192
    //   185: goto -> 201
    //   188: invokestatic a : (Lburp/Zg57;)Lburp/Zg57;
    //   191: athrow
    //   192: aload_0
    //   193: getfield Zw : Lburp/Zbzl;
    //   196: invokeinterface Zv : ()V
    //   201: iload #7
    //   203: ifeq -> 257
    //   206: iload_3
    //   207: ifeq -> 237
    //   210: goto -> 217
    //   213: invokestatic a : (Lburp/Zg57;)Lburp/Zg57;
    //   216: athrow
    //   217: aload_0
    //   218: getfield Zg : Lburp/Zm_p;
    //   221: invokeinterface Zh : ()V
    //   226: aload_2
    //   227: ifnull -> 292
    //   230: goto -> 237
    //   233: invokestatic a : (Lburp/Zg57;)Lburp/Zg57;
    //   236: athrow
    //   237: aload_0
    //   238: getfield Zg : Lburp/Zm_p;
    //   241: invokeinterface ZC : ()V
    //   246: aload_2
    //   247: ifnull -> 292
    //   250: goto -> 257
    //   253: invokestatic a : (Lburp/Zg57;)Lburp/Zg57;
    //   256: athrow
    //   257: aload_0
    //   258: getfield Zg : Lburp/Zm_p;
    //   261: invokeinterface Zh : ()V
    //   266: aload_0
    //   267: getfield Zq : Ljava/util/function/Consumer;
    //   270: aload #5
    //   272: invokeinterface accept : (Ljava/lang/Object;)V
    //   277: aload #4
    //   279: invokeinterface poll : ()Ljava/lang/Object;
    //   284: pop
    //   285: goto -> 292
    //   288: invokestatic a : (Lburp/Zg57;)Lburp/Zg57;
    //   291: athrow
    //   292: aload_2
    //   293: ifnull -> 311
    //   296: aload #4
    //   298: invokeinterface poll : ()Ljava/lang/Object;
    //   303: pop
    //   304: goto -> 311
    //   307: invokestatic a : (Lburp/Zg57;)Lburp/Zg57;
    //   310: athrow
    //   311: aload_2
    //   312: ifnull -> 30
    //   315: return
    // Exception table:
    //   from	to	target	type
    //   74	109	112	burp/Zg57
    //   74	127	130	burp/Zg57
    //   74	127	146	java/lang/Throwable
    //   74	127	175	finally
    //   97	120	120	burp/Zg57
    //   130	143	175	finally
    //   146	172	175	finally
    //   175	177	175	finally
    //   180	188	188	burp/Zg57
    //   201	210	213	burp/Zg57
    //   206	230	233	burp/Zg57
    //   217	250	253	burp/Zg57
    //   237	285	288	burp/Zg57
    //   292	304	307	burp/Zg57
  }
  
  public static void ZC(String paramString) {
    ZL = paramString;
  }
  
  public static String ZY() {
    return ZL;
  }
  
  private static Zg57 a(Zg57 paramZg57) {
    return paramZg57;
  }
  
  static {
    if (ZY() != null)
      ZC("xRWej"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs8m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */