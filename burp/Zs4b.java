package burp;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import net.portswigger.Zsy;

public class Zs4b {
  private final Ztwv Zx;
  
  private final Zrgd ZF;
  
  private final Zsy ZH;
  
  private final Ztbb Zc;
  
  private final Zbnt ZJ;
  
  private final Zzen ZC;
  
  private final Zmi4 Zu;
  
  private final Zlvt ZK;
  
  private final AtomicLong ZN;
  
  public Zs4b(Ztwv paramZtwv, Zrgd paramZrgd, Zsy paramZsy, Ztbb paramZtbb, Zbnt paramZbnt, Zzen paramZzen, Zmi4 paramZmi4, Zlvt paramZlvt) {
    this.Zx = paramZtwv;
    this.ZF = paramZrgd;
    this.ZH = paramZsy;
    this.Zc = paramZtbb;
    this.ZJ = paramZbnt;
    this.ZC = paramZzen;
    this.Zu = paramZmi4;
    this.ZK = paramZlvt;
    this.ZN = new AtomicLong();
  }
  
  public Zrot ZQ(Socket paramSocket, Consumer<Long> paramConsumer) throws IOException {
    return ZW(new AtomicReference<>(), paramSocket, paramConsumer);
  }
  
  Zrot ZW(AtomicReference<Zmzs> paramAtomicReference, Socket paramSocket, Consumer<Long> paramConsumer) throws IOException {
    // Byte code:
    //   0: aload_2
    //   1: iconst_1
    //   2: invokevirtual setTcpNoDelay : (Z)V
    //   5: invokestatic ZL : ()[Ljava/lang/String;
    //   8: new burp/Zl6g
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: astore #5
    //   17: new burp/Zbip
    //   20: dup
    //   21: aload #5
    //   23: aload_0
    //   24: getfield ZK : Lburp/Zlvt;
    //   27: invokevirtual ZL : ()I
    //   30: aload_0
    //   31: getfield Zu : Lburp/Zmi4;
    //   34: invokeinterface ZK : ()Lburp/Zryu;
    //   39: invokeinterface Zs : ()I
    //   44: invokespecial <init> : (Lburp/Zl6g;II)V
    //   47: astore #6
    //   49: new burp/Ze55
    //   52: dup
    //   53: aload #5
    //   55: invokespecial <init> : (Lburp/Zl6g;)V
    //   58: astore #7
    //   60: new burp/Ze0y
    //   63: dup
    //   64: aload #5
    //   66: invokespecial <init> : (Lburp/Zl6g;)V
    //   69: astore #8
    //   71: new burp/Zm2
    //   74: dup
    //   75: aload #6
    //   77: aload #8
    //   79: invokespecial <init> : (Lburp/Zbip;Lburp/Ze0y;)V
    //   82: astore #9
    //   84: new burp/Zsen
    //   87: dup
    //   88: aload #7
    //   90: invokespecial <init> : (Lburp/Ze55;)V
    //   93: astore #10
    //   95: astore #4
    //   97: new java/util/concurrent/CopyOnWriteArrayList
    //   100: dup
    //   101: invokespecial <init> : ()V
    //   104: astore #11
    //   106: aload_0
    //   107: getfield ZN : Ljava/util/concurrent/atomic/AtomicLong;
    //   110: invokevirtual incrementAndGet : ()J
    //   113: lstore #12
    //   115: new burp/Zlm7
    //   118: dup
    //   119: getstatic burp/Zz51.PROXY : Lburp/Zz51;
    //   122: lload #12
    //   124: invokespecial <init> : (Lburp/Zz51;J)V
    //   127: astore #14
    //   129: new burp/Zs5t
    //   132: dup
    //   133: getstatic burp/Zz51.PROXY : Lburp/Zz51;
    //   136: lload #12
    //   138: invokespecial <init> : (Lburp/Zz51;J)V
    //   141: astore #15
    //   143: new burp/Zgz4
    //   146: dup
    //   147: aload #14
    //   149: new burp/Zspv
    //   152: dup
    //   153: aload_3
    //   154: lload #12
    //   156: <illegal opcode> run : (Ljava/util/function/Consumer;J)Ljava/lang/Runnable;
    //   161: invokespecial <init> : (Ljava/lang/Runnable;)V
    //   164: invokespecial <init> : (Lburp/Zlm7;Lburp/Zmu8;)V
    //   167: astore #16
    //   169: new java/util/concurrent/atomic/AtomicReference
    //   172: dup
    //   173: invokespecial <init> : ()V
    //   176: astore #17
    //   178: new burp/Zx86
    //   181: dup
    //   182: invokespecial <init> : ()V
    //   185: astore #18
    //   187: new burp/Zlan
    //   190: dup
    //   191: aload #16
    //   193: aload #17
    //   195: dup
    //   196: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   199: pop
    //   200: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   205: aload #11
    //   207: new burp/Zxy2
    //   210: dup
    //   211: aload_0
    //   212: aload_1
    //   213: invokespecial <init> : (Lburp/Zs4b;Ljava/util/concurrent/atomic/AtomicReference;)V
    //   216: aload #18
    //   218: aload #14
    //   220: invokespecial <init> : (Lburp/Zgz4;Ljava/util/function/Supplier;Ljava/util/List;Lburp/Zxoq;Lburp/Zx86;Lburp/Zlm7;)V
    //   223: astore #19
    //   225: new burp/Zvo8
    //   228: dup
    //   229: aload #6
    //   231: invokespecial <init> : (Lburp/Zbip;)V
    //   234: astore #20
    //   236: new burp/Zzis
    //   239: dup
    //   240: aload_0
    //   241: getfield Zc : Lburp/Ztbb;
    //   244: aload_0
    //   245: getfield ZC : Lburp/Zzen;
    //   248: new burp/Zsv4
    //   251: dup
    //   252: aload_0
    //   253: getfield ZJ : Lburp/Zbnt;
    //   256: invokespecial <init> : (Lburp/Zbnt;)V
    //   259: invokespecial <init> : (Lburp/Ztbb;Lburp/Zzen;Lburp/Zlnx;)V
    //   262: astore #21
    //   264: new burp/Zenp
    //   267: dup
    //   268: aload_0
    //   269: getfield ZF : Lburp/Zrgd;
    //   272: invokespecial <init> : (Lburp/Zrgd;)V
    //   275: astore #22
    //   277: new burp/Zmzs
    //   280: dup
    //   281: aload #17
    //   283: dup
    //   284: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   287: pop
    //   288: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   293: aload #11
    //   295: lload #12
    //   297: aload #19
    //   299: aload #22
    //   301: aload #6
    //   303: aload #18
    //   305: aload_0
    //   306: getfield Zu : Lburp/Zmi4;
    //   309: invokeinterface ZK : ()Lburp/Zryu;
    //   314: aload #14
    //   316: aload #15
    //   318: aload #20
    //   320: aload #21
    //   322: invokespecial <init> : (Ljava/util/function/Supplier;Ljava/util/List;JLburp/Zlan;Lburp/Ztf5;Lburp/Zbip;Lburp/Zx86;Lburp/Zryu;Lburp/Zst8;Lburp/Zs5t;Lburp/Ze_w;Lburp/Ze8l;)V
    //   325: astore #23
    //   327: aload_1
    //   328: aload #23
    //   330: invokevirtual set : (Ljava/lang/Object;)V
    //   333: new burp/Zgh2
    //   336: dup
    //   337: aload #22
    //   339: aload #14
    //   341: aload #18
    //   343: invokespecial <init> : (Lburp/Ztf5;Lburp/Zlm7;Lburp/Zx86;)V
    //   346: astore #24
    //   348: new burp/Ztjd
    //   351: dup
    //   352: aload #9
    //   354: aload_2
    //   355: invokevirtual getOutputStream : ()Ljava/io/OutputStream;
    //   358: aload #14
    //   360: aload #19
    //   362: aload #18
    //   364: aload #24
    //   366: invokespecial <init> : (Lburp/Zih;Ljava/io/OutputStream;Lburp/Zst8;Lburp/Zlan;Lburp/Zx86;Lburp/Zl8p;)V
    //   369: astore #25
    //   371: aload #17
    //   373: aload #25
    //   375: invokevirtual set : (Ljava/lang/Object;)V
    //   378: new burp/Zgv
    //   381: dup
    //   382: aload #25
    //   384: aload #6
    //   386: aload #16
    //   388: aload #24
    //   390: aload #23
    //   392: aload #23
    //   394: invokespecial <init> : (Lburp/Ztjd;Lburp/Zbip;Lburp/Zk98;Lburp/Zl8p;Lburp/Zxoq;Lburp/Zsoa;)V
    //   397: astore #26
    //   399: aload_2
    //   400: invokevirtual getInputStream : ()Ljava/io/InputStream;
    //   403: astore #27
    //   405: new java/util/concurrent/atomic/AtomicLong
    //   408: dup
    //   409: lconst_0
    //   410: invokespecial <init> : (J)V
    //   413: astore #28
    //   415: new burp/Zgb_
    //   418: dup
    //   419: aload #16
    //   421: aload #27
    //   423: invokespecial <init> : (Lburp/Zlo;Ljava/io/InputStream;)V
    //   426: astore #29
    //   428: new burp/Zb4s
    //   431: dup
    //   432: aload #26
    //   434: new burp/Zt1k
    //   437: dup
    //   438: aload #14
    //   440: aload_0
    //   441: getfield Zu : Lburp/Zmi4;
    //   444: invokeinterface ZE : ()Lburp/Zryu;
    //   449: aload #25
    //   451: invokespecial <init> : (Lburp/Zst8;Lburp/Zryu;Lburp/Ztjd;)V
    //   454: invokespecial <init> : (Lburp/Zzwx;Lburp/Zevl;)V
    //   457: astore #30
    //   459: new burp/Ztv4
    //   462: dup
    //   463: aload #16
    //   465: aload #30
    //   467: aload #10
    //   469: aload #29
    //   471: aload #19
    //   473: aload #22
    //   475: aload #14
    //   477: aload #28
    //   479: aload #18
    //   481: aload #23
    //   483: <illegal opcode> ZS : (Lburp/Zmzs;)Lburp/Zzsh;
    //   488: invokespecial <init> : (Lburp/Zlo;Lburp/Zkoj;Lburp/Zsen;Lburp/Zgb_;Lburp/Zlan;Lburp/Ztf5;Lburp/Zst8;Ljava/util/concurrent/atomic/AtomicLong;Lburp/Zx86;Lburp/Zzsh;)V
    //   491: astore #31
    //   493: new burp/Zzv2
    //   496: dup
    //   497: aload #27
    //   499: aload #16
    //   501: invokespecial <init> : (Ljava/io/InputStream;Lburp/Zgz4;)V
    //   504: astore #32
    //   506: new burp/Zrot
    //   509: dup
    //   510: aload_0
    //   511: getfield Zx : Lburp/Ztwv;
    //   514: dup
    //   515: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   518: pop
    //   519: <illegal opcode> ZH : (Lburp/Ztwv;)Lburp/Zza4;
    //   524: lload #12
    //   526: aload #14
    //   528: aload #11
    //   530: aload #5
    //   532: aload #16
    //   534: aload #31
    //   536: aload #25
    //   538: aload #32
    //   540: aload #23
    //   542: aload #22
    //   544: aload_0
    //   545: getfield ZH : Lnet/portswigger/Zsy;
    //   548: aload #28
    //   550: aload #18
    //   552: aload_0
    //   553: getfield Zu : Lburp/Zmi4;
    //   556: aload_0
    //   557: getfield ZK : Lburp/Zlvt;
    //   560: invokespecial <init> : (Lburp/Zza4;JLburp/Zlm7;Ljava/util/List;Lburp/Zl6g;Lburp/Zgz4;Lburp/Ztv4;Lburp/Ztjd;Lburp/Zzv2;Lburp/Zmzs;Lburp/Ztf5;Lnet/portswigger/Zsy;Ljava/util/concurrent/atomic/AtomicLong;Lburp/Zx86;Lburp/Zmi4;Lburp/Zlvt;)V
    //   563: aload #4
    //   565: ifnull -> 575
    //   568: iconst_3
    //   569: anewarray burp/Zbqc
    //   572: invokestatic Zr : ([Lburp/Zbqc;)V
    //   575: areturn
  }
  
  private static void lambda$createConnection$1(Zmzs paramZmzs, Zsp paramZsp) throws Zzt7, Zmfz {
    paramZmzs.ZC(paramZsp.ZD).ZA(paramZsp);
  }
  
  private static void lambda$createConnection$0(Consumer<Long> paramConsumer, long paramLong) {
    paramConsumer.accept(Long.valueOf(paramLong));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs4b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */