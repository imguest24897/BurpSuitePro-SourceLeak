package burp;

import java.io.IOException;
import java.net.Socket;

abstract class Ztc1 implements Zb_d {
  static final Zmi4 ZE = new Zzzo();
  
  private final Zzen Zd;
  
  private final Zrgd Zc;
  
  private final Zg6h Zh;
  
  private final Zxy1 Zp;
  
  private final Zmi4 Zu;
  
  private final Zrps ZL;
  
  Ztc1(Zzen paramZzen, Zrgd paramZrgd, Zg6h paramZg6h, Zxy1 paramZxy1, Zmi4 paramZmi4, Zrps paramZrps) {
    this.Zd = paramZzen;
    this.Zc = paramZrgd;
    this.Zh = paramZg6h;
    this.Zp = paramZxy1;
    this.Zu = paramZmi4;
    this.ZL = paramZrps;
  }
  
  abstract Zgke ZE(Socket paramSocket, Zmzk paramZmzk, long paramLong1, Zl6g paramZl6g, long paramLong2, Zgz4 paramZgz4, Zx86 paramZx86, Ztf5 paramZtf5, Zlm7 paramZlm7, Zmi4 paramZmi4, Zbfh paramZbfh, Ze6i paramZe6i, Ztjd paramZtjd, Ztv4 paramZtv4) throws IOException;
  
  abstract boolean Zt();
  
  abstract Ze6i Zl(Zbip paramZbip);
  
  public Zgke Ze(Socket paramSocket, Zmzk paramZmzk, Zmu8 paramZmu8, long paramLong) throws IOException {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: invokevirtual Zt : ()Z
    //   5: invokevirtual setTcpNoDelay : (Z)V
    //   8: aload_1
    //   9: aload_0
    //   10: getfield ZL : Lburp/Zrps;
    //   13: invokestatic ZP : (Lburp/Zrps;)I
    //   16: invokevirtual setSoTimeout : (I)V
    //   19: new burp/Zl6g
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: astore #7
    //   28: new burp/Zbip
    //   31: dup
    //   32: aload #7
    //   34: sipush #1000
    //   37: aload_0
    //   38: aload_2
    //   39: <illegal opcode> ZP : (Lburp/Ztc1;Lburp/Zmzk;)Lburp/Zsm2;
    //   44: invokespecial <init> : (Lburp/Zl6g;ILburp/Zsm2;)V
    //   47: astore #8
    //   49: new burp/Ze55
    //   52: dup
    //   53: aload #7
    //   55: invokespecial <init> : (Lburp/Zl6g;)V
    //   58: astore #9
    //   60: new burp/Ze0y
    //   63: dup
    //   64: aload #7
    //   66: invokespecial <init> : (Lburp/Zl6g;)V
    //   69: astore #10
    //   71: new burp/Zm2
    //   74: dup
    //   75: aload #8
    //   77: aload #10
    //   79: invokespecial <init> : (Lburp/Zbip;Lburp/Ze0y;)V
    //   82: astore #11
    //   84: new burp/Zsen
    //   87: dup
    //   88: aload #9
    //   90: invokespecial <init> : (Lburp/Ze55;)V
    //   93: astore #12
    //   95: new java/util/concurrent/CopyOnWriteArrayList
    //   98: dup
    //   99: invokespecial <init> : ()V
    //   102: astore #13
    //   104: aload_0
    //   105: getfield Zh : Lburp/Zg6h;
    //   108: invokeinterface Zt : ()J
    //   113: lstore #14
    //   115: new burp/Zlm7
    //   118: dup
    //   119: getstatic burp/Zz51.APPLICATION : Lburp/Zz51;
    //   122: lload #14
    //   124: invokespecial <init> : (Lburp/Zz51;J)V
    //   127: astore #16
    //   129: new burp/Zs5t
    //   132: dup
    //   133: getstatic burp/Zz51.APPLICATION : Lburp/Zz51;
    //   136: lload #14
    //   138: invokespecial <init> : (Lburp/Zz51;J)V
    //   141: astore #17
    //   143: new burp/Zgz4
    //   146: dup
    //   147: aload #16
    //   149: aload_3
    //   150: invokespecial <init> : (Lburp/Zlm7;Lburp/Zmu8;)V
    //   153: astore #18
    //   155: new java/util/concurrent/atomic/AtomicReference
    //   158: dup
    //   159: invokespecial <init> : ()V
    //   162: astore #19
    //   164: new burp/Zx86
    //   167: dup
    //   168: invokespecial <init> : ()V
    //   171: astore #20
    //   173: new java/util/concurrent/atomic/AtomicReference
    //   176: dup
    //   177: invokespecial <init> : ()V
    //   180: astore #21
    //   182: new burp/Zlan
    //   185: dup
    //   186: aload #18
    //   188: aload #19
    //   190: dup
    //   191: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   194: pop
    //   195: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   200: aload #13
    //   202: new burp/Ze23
    //   205: dup
    //   206: aload_0
    //   207: aload #21
    //   209: invokespecial <init> : (Lburp/Ztc1;Ljava/util/concurrent/atomic/AtomicReference;)V
    //   212: aload #20
    //   214: aload #16
    //   216: invokespecial <init> : (Lburp/Zgz4;Ljava/util/function/Supplier;Ljava/util/List;Lburp/Zxoq;Lburp/Zx86;Lburp/Zlm7;)V
    //   219: astore #22
    //   221: invokestatic ZL : ()[Ljava/lang/String;
    //   224: new burp/Zenp
    //   227: dup
    //   228: aload_0
    //   229: getfield Zc : Lburp/Zrgd;
    //   232: invokespecial <init> : (Lburp/Zrgd;)V
    //   235: astore #23
    //   237: new burp/Zbfh
    //   240: dup
    //   241: aload #19
    //   243: dup
    //   244: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   247: pop
    //   248: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   253: aload #22
    //   255: aload_0
    //   256: aload_2
    //   257: <illegal opcode> Zz : (Lburp/Ztc1;Lburp/Zmzk;)Lburp/Zqb;
    //   262: aload_0
    //   263: aload_2
    //   264: <illegal opcode> Zj : (Lburp/Ztc1;Lburp/Zmzk;)Lburp/Ztt7;
    //   269: aload #23
    //   271: aload #20
    //   273: aload #8
    //   275: aload_0
    //   276: getfield Zd : Lburp/Zzen;
    //   279: aload_0
    //   280: getfield Zu : Lburp/Zmi4;
    //   283: invokeinterface ZK : ()Lburp/Zryu;
    //   288: aload #16
    //   290: aload #17
    //   292: invokespecial <init> : (Ljava/util/function/Supplier;Lburp/Zlan;Lburp/Zqb;Lburp/Ztt7;Lburp/Ztf5;Lburp/Zx86;Lburp/Zbip;Lburp/Zzen;Lburp/Zryu;Lburp/Zlm7;Lburp/Zs5t;)V
    //   295: astore #24
    //   297: aload #21
    //   299: aload #24
    //   301: invokevirtual set : (Ljava/lang/Object;)V
    //   304: new burp/Zgh2
    //   307: dup
    //   308: aload #23
    //   310: aload #16
    //   312: aload #20
    //   314: invokespecial <init> : (Lburp/Ztf5;Lburp/Zlm7;Lburp/Zx86;)V
    //   317: astore #25
    //   319: new burp/Ztjd
    //   322: dup
    //   323: aload #11
    //   325: aload_1
    //   326: invokevirtual getOutputStream : ()Ljava/io/OutputStream;
    //   329: aload #16
    //   331: aload #22
    //   333: aload #20
    //   335: aload #25
    //   337: invokespecial <init> : (Lburp/Zih;Ljava/io/OutputStream;Lburp/Zst8;Lburp/Zlan;Lburp/Zx86;Lburp/Zl8p;)V
    //   340: astore #26
    //   342: aload #19
    //   344: aload #26
    //   346: invokevirtual set : (Ljava/lang/Object;)V
    //   349: new burp/Zgv
    //   352: dup
    //   353: aload #26
    //   355: aload #8
    //   357: aload #18
    //   359: aload #25
    //   361: aload #24
    //   363: aload #24
    //   365: invokespecial <init> : (Lburp/Ztjd;Lburp/Zbip;Lburp/Zk98;Lburp/Zl8p;Lburp/Zxoq;Lburp/Zsoa;)V
    //   368: astore #27
    //   370: astore #6
    //   372: new burp/Zzbw
    //   375: dup
    //   376: aload #27
    //   378: invokespecial <init> : (Lburp/Zgv;)V
    //   381: astore #28
    //   383: aload_1
    //   384: invokevirtual getInputStream : ()Ljava/io/InputStream;
    //   387: astore #29
    //   389: new java/util/concurrent/atomic/AtomicLong
    //   392: dup
    //   393: lconst_0
    //   394: invokespecial <init> : (J)V
    //   397: astore #30
    //   399: new burp/Zgb_
    //   402: dup
    //   403: aload #18
    //   405: aload #29
    //   407: invokespecial <init> : (Lburp/Zlo;Ljava/io/InputStream;)V
    //   410: astore #31
    //   412: new burp/Zb4s
    //   415: dup
    //   416: aload #28
    //   418: new burp/Zt1k
    //   421: dup
    //   422: aload #16
    //   424: aload_0
    //   425: getfield Zu : Lburp/Zmi4;
    //   428: invokeinterface ZE : ()Lburp/Zryu;
    //   433: aload #26
    //   435: invokespecial <init> : (Lburp/Zst8;Lburp/Zryu;Lburp/Ztjd;)V
    //   438: invokespecial <init> : (Lburp/Zzwx;Lburp/Zevl;)V
    //   441: astore #32
    //   443: new burp/Ztv4
    //   446: dup
    //   447: aload #18
    //   449: aload #32
    //   451: aload #12
    //   453: aload #31
    //   455: aload #22
    //   457: aload #23
    //   459: aload #16
    //   461: aload #30
    //   463: aload #20
    //   465: aload #24
    //   467: <illegal opcode> ZS : (Lburp/Zbfh;)Lburp/Zzsh;
    //   472: invokespecial <init> : (Lburp/Zlo;Lburp/Zkoj;Lburp/Zsen;Lburp/Zgb_;Lburp/Zlan;Lburp/Ztf5;Lburp/Zst8;Ljava/util/concurrent/atomic/AtomicLong;Lburp/Zx86;Lburp/Zzsh;)V
    //   475: astore #33
    //   477: aload_0
    //   478: aload_1
    //   479: aload_2
    //   480: lload #4
    //   482: aload #7
    //   484: lload #14
    //   486: aload #18
    //   488: aload #20
    //   490: aload #23
    //   492: aload #16
    //   494: aload_0
    //   495: getfield Zu : Lburp/Zmi4;
    //   498: aload #24
    //   500: aload_0
    //   501: aload #8
    //   503: invokevirtual Zl : (Lburp/Zbip;)Lburp/Ze6i;
    //   506: aload #26
    //   508: aload #33
    //   510: invokevirtual ZE : (Ljava/net/Socket;Lburp/Zmzk;JLburp/Zl6g;JLburp/Zgz4;Lburp/Zx86;Lburp/Ztf5;Lburp/Zlm7;Lburp/Zmi4;Lburp/Zbfh;Lburp/Ze6i;Lburp/Ztjd;Lburp/Ztv4;)Lburp/Zgke;
    //   513: astore #34
    //   515: aload #34
    //   517: invokeinterface ZN : ()V
    //   522: aload #18
    //   524: invokevirtual ZU : ()Z
    //   527: ifeq -> 542
    //   530: new burp/Zsl_
    //   533: dup
    //   534: invokespecial <init> : ()V
    //   537: athrow
    //   538: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   541: athrow
    //   542: aload #34
    //   544: invokestatic Zwu : ()[Lburp/Zbqc;
    //   547: ifnonnull -> 564
    //   550: iconst_1
    //   551: anewarray java/lang/String
    //   554: invokestatic Zx : ([Ljava/lang/String;)V
    //   557: goto -> 564
    //   560: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   563: athrow
    //   564: areturn
    // Exception table:
    //   from	to	target	type
    //   515	538	538	java/io/IOException
    //   542	557	560	java/io/IOException
  }
  
  private static int ZP(Zrps paramZrps) {
    int i = paramZrps.Zb();
    return (i == 0) ? 0 : ((i < 100) ? (i + 100) : (int)(1.1D * i));
  }
  
  private static void lambda$createConnection$3(Zbfh paramZbfh, Zsp paramZsp) throws Zzt7, Zmfz {
    paramZbfh.Zm(paramZsp.ZD).ZF(paramZsp);
  }
  
  private void lambda$createConnection$2(Zmzk paramZmzk) {
    this.Zp.Zn(Zzxk.SERVER_SENT_EVENTS, paramZmzk);
  }
  
  private void lambda$createConnection$1(Zmzk paramZmzk) {
    this.Zp.Zn(Zzxk.HTTP_3_ADVERTISED, paramZmzk);
  }
  
  private void lambda$createConnection$0(Zmzk paramZmzk) {
    this.Zp.Zn(Zzxk.HTTP_2_CONNECT_PROTOCOL_ENABLED, paramZmzk);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztc1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */