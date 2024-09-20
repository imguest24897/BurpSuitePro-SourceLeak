package burp;

import java.net.UnknownHostException;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.locks.Lock;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zefd implements Zz9e {
  private final Zbnt ZN;
  
  private final Zrgd ZS;
  
  private final Zz28 Zw;
  
  private final Zsil ZU;
  
  private final Zzen ZL;
  
  private final Ztb7 ZG;
  
  private final Zgs4 ZD;
  
  private final Zzxn Z_;
  
  private final Zgg0 Ze;
  
  private final Zesd ZI;
  
  private final Zlc6 Zp;
  
  private final Zeak ZV;
  
  private final Zk86 ZB;
  
  private final Zkoq ZF;
  
  private final Zrps Zt;
  
  private final Zb2 Zc;
  
  private final Zl7q ZC;
  
  private final Zl2u Zv;
  
  private final Zxtb ZJ;
  
  private final Zbnx ZT;
  
  private final Zey9 Zu;
  
  public Zefd(Zz28 paramZz28, Ztb7 paramZtb7, Zrgd paramZrgd, Zgs4 paramZgs4, Zzxn paramZzxn, Zsil paramZsil, Zzen paramZzen, Zgg0 paramZgg0, Zesd paramZesd, Zlc6 paramZlc6, Zeak paramZeak, Zk86 paramZk86, Zkoq paramZkoq, Zrps paramZrps, Zl2u paramZl2u, Zxtb paramZxtb, Zb2 paramZb2, Zl7q paramZl7q, Zbnx paramZbnx, Zbnt paramZbnt, Zey9 paramZey9) {
    this.ZB = paramZk86;
    this.Zv = paramZl2u;
    this.ZN = paramZbnt;
    this.Zw = paramZz28;
    this.ZG = paramZtb7;
    this.ZD = paramZgs4;
    this.ZU = paramZsil;
    this.ZL = paramZzen;
    this.Z_ = paramZzxn;
    this.Ze = paramZgg0;
    this.ZS = paramZrgd;
    this.ZI = paramZesd;
    this.Zp = paramZlc6;
    this.ZV = paramZeak;
    this.ZF = paramZkoq;
    this.Zt = paramZrps;
    this.Zc = paramZb2;
    this.ZC = paramZl7q;
    this.ZJ = paramZxtb;
    this.ZT = paramZbnx;
    this.Zu = paramZey9;
  }
  
  public Zsxd Zh(Zefx paramZefx, Zlhj paramZlhj) {
    Zs9p zs9p = new Zs9p(paramZefx);
    Zb10 zb10 = new Zb10(this.ZS, zs9p, paramZlhj);
    try {
      this.ZI.Zh(paramZefx.ZT());
      ZZ(zs9p, zb10);
    } catch (UnknownHostException unknownHostException) {
      Zah.Zl(unknownHostException, Zk_.COMMON_RUNTIME_FAILURE);
      this.ZL.ZE().Zx(Zt21.APPLICATION, paramZefx.ZT());
      zb10.ZL(unknownHostException);
    } 
    return zb10.Zo();
  }
  
  private void ZZ(Zs9p paramZs9p, Zb10 paramZb10) {
    this.ZD.ZS(paramZs9p.ZA());
    int i = this.ZB.Zf();
    Zzb1 zzb1 = this.Z_.Ze(i, paramZs9p.ZA(), paramZb10.Zr());
    paramZs9p.ZX(zzb1.ZV);
    paramZb10.ZA(zzb1.Z_);
    Lock lock = this.ZV.ZA(paramZs9p.Zj(), this.ZJ);
    lock.lock();
    try {
      Zb(i, paramZs9p, paramZb10, lock);
    } finally {
      lock.unlock();
    } 
  }
  
  private void Zb(int paramInt, Zs9p paramZs9p, Zb10 paramZb10, Lock paramLock) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #6
    //   3: iconst_0
    //   4: istore #7
    //   6: invokestatic Zo : ()I
    //   9: iconst_0
    //   10: istore #8
    //   12: aconst_null
    //   13: astore #9
    //   15: istore #5
    //   17: new burp/Zgb2
    //   20: dup
    //   21: aload_3
    //   22: aload_0
    //   23: getfield ZL : Lburp/Zzen;
    //   26: invokespecial <init> : (Lburp/Zb10;Lburp/Zzen;)V
    //   29: astore #10
    //   31: aload_0
    //   32: getfield ZT : Lburp/Zbnx;
    //   35: aload_0
    //   36: getfield Zt : Lburp/Zrps;
    //   39: aload_0
    //   40: getfield Zv : Lburp/Zl2u;
    //   43: aload_0
    //   44: getfield ZJ : Lburp/Zxtb;
    //   47: aload_0
    //   48: getfield ZC : Lburp/Zl7q;
    //   51: aload_0
    //   52: getfield ZL : Lburp/Zzen;
    //   55: aload_0
    //   56: getfield ZU : Lburp/Zsil;
    //   59: aload #10
    //   61: aload #10
    //   63: invokeinterface Zz : (Lburp/Zrps;Lburp/Zgzx;Lburp/Zxtv;Lburp/Zl7q;Lburp/Zzen;Lburp/Zsil;Lburp/Zthe;Lburp/Ztxn;)Lburp/Zea5;
    //   68: astore #11
    //   70: aload_0
    //   71: getfield ZF : Lburp/Zkoq;
    //   74: invokeinterface ZA : ()J
    //   79: lstore #12
    //   81: aconst_null
    //   82: astore #14
    //   84: aload #11
    //   86: aload_2
    //   87: invokevirtual Zj : ()Lburp/Zmzk;
    //   90: invokeinterface Zw : (Lburp/Zmzk;)Lburp/Zlvr;
    //   95: astore #14
    //   97: goto -> 134
    //   100: astore #15
    //   102: aload #15
    //   104: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   107: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   110: aload_0
    //   111: getfield ZL : Lburp/Zzen;
    //   114: invokeinterface ZE : ()Lburp/Zmu_;
    //   119: aload_2
    //   120: invokevirtual Zj : ()Lburp/Zmzk;
    //   123: invokeinterface Zl : (Lburp/Zmzk;)V
    //   128: aload_3
    //   129: aload #15
    //   131: invokevirtual ZH : (Ljava/lang/Exception;)V
    //   134: aload #4
    //   136: invokeinterface unlock : ()V
    //   141: aload #14
    //   143: ifnonnull -> 151
    //   146: return
    //   147: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: aload_0
    //   152: getfield Zp : Lburp/Zlc6;
    //   155: aload #14
    //   157: aload_0
    //   158: getfield Zv : Lburp/Zl2u;
    //   161: aload_0
    //   162: getfield ZJ : Lburp/Zxtb;
    //   165: aload_0
    //   166: getfield ZC : Lburp/Zl7q;
    //   169: aload_2
    //   170: invokevirtual ZA : ()Lburp/Zefx;
    //   173: aload_2
    //   174: invokevirtual Zj : ()Lburp/Zmzk;
    //   177: aload_3
    //   178: aload_0
    //   179: getfield ZU : Lburp/Zsil;
    //   182: invokeinterface ZQ : ()Lburp/Zm5u;
    //   187: invokevirtual Zr : (Lburp/Zlvr;Lburp/Zgzx;Lburp/Zxtv;Lburp/Zl7q;Lburp/Zefx;Lburp/Zmzk;Lburp/Zto5;Lburp/Zm5u;)Lburp/Zgph;
    //   190: astore #15
    //   192: aload #15
    //   194: aload_2
    //   195: invokevirtual Zr : ()Lburp/Zefx;
    //   198: invokevirtual Zn : (Lburp/Zefx;)Lburp/Zefx;
    //   201: astore #16
    //   203: iconst_1
    //   204: istore #8
    //   206: aload_2
    //   207: aload #16
    //   209: invokevirtual ZX : (Lburp/Zefx;)V
    //   212: aload_3
    //   213: invokevirtual Z_ : ()V
    //   216: aload_0
    //   217: getfield ZU : Lburp/Zsil;
    //   220: invokeinterface ZZ : ()Lburp/Zg4n;
    //   225: getstatic burp/Zg4n.ABORT : Lburp/Zg4n;
    //   228: if_acmpne -> 294
    //   231: aload_0
    //   232: getfield Ze : Lburp/Zgg0;
    //   235: lload #12
    //   237: aload #14
    //   239: invokeinterface ZH : ()J
    //   244: aload_3
    //   245: invokevirtual ZE : ()Ljava/time/Instant;
    //   248: invokevirtual toEpochMilli : ()J
    //   251: aload_2
    //   252: invokevirtual Zr : ()Lburp/Zefx;
    //   255: invokeinterface ZM : (JJJLburp/Zefx;)V
    //   260: aload_0
    //   261: getfield ZL : Lburp/Zzen;
    //   264: aload_2
    //   265: invokevirtual Zr : ()Lburp/Zefx;
    //   268: invokeinterface Zz : (Lburp/Zefx;)V
    //   273: aload_3
    //   274: invokevirtual ZM : ()V
    //   277: aload_0
    //   278: getfield ZL : Lburp/Zzen;
    //   281: getstatic burp/Zewh.ABORTED : Lburp/Zewh;
    //   284: aload_3
    //   285: invokevirtual Zo : ()Lburp/Zsxd;
    //   288: invokeinterface ZD : (Lburp/Zewh;Lburp/Zsxd;)V
    //   293: return
    //   294: aload #15
    //   296: aload_2
    //   297: invokevirtual Zr : ()Lburp/Zefx;
    //   300: invokevirtual Zm : (Lburp/Zefx;)Z
    //   303: ifeq -> 307
    //   306: return
    //   307: aload #15
    //   309: iload_1
    //   310: aload_2
    //   311: invokevirtual Zr : ()Lburp/Zefx;
    //   314: aload_3
    //   315: invokevirtual Zr : ()Lburp/Zlhj;
    //   318: invokevirtual Zb : (ILburp/Zefx;Lburp/Zlhj;)Lburp/Zm7u;
    //   321: astore #9
    //   323: aload #15
    //   325: aload #9
    //   327: aload_2
    //   328: invokevirtual Zr : ()Lburp/Zefx;
    //   331: aload_0
    //   332: getfield ZU : Lburp/Zsil;
    //   335: invokevirtual ZR : (Lburp/Zm7u;Lburp/Zefx;Lburp/Zsil;)Lburp/Zg4n;
    //   338: getstatic burp/Zg4n.ABORT : Lburp/Zg4n;
    //   341: if_acmpne -> 445
    //   344: aload_0
    //   345: getfield Ze : Lburp/Zgg0;
    //   348: lload #12
    //   350: aload #14
    //   352: invokeinterface ZH : ()J
    //   357: aload_3
    //   358: invokevirtual ZE : ()Ljava/time/Instant;
    //   361: invokevirtual toEpochMilli : ()J
    //   364: aload_2
    //   365: invokevirtual Zr : ()Lburp/Zefx;
    //   368: aload #9
    //   370: aload #9
    //   372: aload_3
    //   373: invokevirtual Zf : ()Ljava/time/Instant;
    //   376: invokestatic Zr : (Lburp/Zm7u;Ljava/time/Instant;)Ljava/time/Duration;
    //   379: aload #9
    //   381: aload_3
    //   382: invokevirtual Zf : ()Ljava/time/Instant;
    //   385: invokestatic Zp : (Lburp/Zm7u;Ljava/time/Instant;)Ljava/time/Duration;
    //   388: aload_3
    //   389: invokevirtual Zr : ()Lburp/Zlhj;
    //   392: getfield ZO : Ljava/lang/String;
    //   395: aload_3
    //   396: invokevirtual Zr : ()Lburp/Zlhj;
    //   399: getfield Zh : B
    //   402: invokeinterface Zc : (JJJLburp/Zefx;Lburp/Zb6q;Ljava/time/Duration;Ljava/time/Duration;Ljava/lang/String;B)V
    //   407: aload_0
    //   408: getfield ZL : Lburp/Zzen;
    //   411: aload_2
    //   412: invokevirtual Zr : ()Lburp/Zefx;
    //   415: aload #9
    //   417: invokeinterface ZK : (Lburp/Zefx;Lburp/Zb6q;)V
    //   422: aload_3
    //   423: aload #9
    //   425: invokevirtual Zv : (Lburp/Zm7u;)V
    //   428: aload_0
    //   429: getfield ZL : Lburp/Zzen;
    //   432: getstatic burp/Zewh.ABORTED : Lburp/Zewh;
    //   435: aload_3
    //   436: invokevirtual Zo : ()Lburp/Zsxd;
    //   439: invokeinterface ZD : (Lburp/Zewh;Lburp/Zsxd;)V
    //   444: return
    //   445: aload #9
    //   447: invokeinterface Ze : ()S
    //   452: lookupswitch default -> 613, 101 -> 488, 401 -> 517, 407 -> 565
    //   488: aload #15
    //   490: aload_2
    //   491: invokevirtual Zr : ()Lburp/Zefx;
    //   494: aload #9
    //   496: invokevirtual Zl : (Lburp/Zefx;Lburp/Zm7u;)V
    //   499: aload_3
    //   500: aload #9
    //   502: invokevirtual Zg : (Lburp/Zm7u;)V
    //   505: iload #5
    //   507: ifne -> 626
    //   510: goto -> 517
    //   513: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   516: athrow
    //   517: aload_0
    //   518: getfield ZL : Lburp/Zzen;
    //   521: invokeinterface ZE : ()Lburp/Zmu_;
    //   526: getstatic burp/Zt21.APPLICATION : Lburp/Zt21;
    //   529: aload_2
    //   530: invokevirtual Zj : ()Lburp/Zmzk;
    //   533: invokeinterface ZS : (Lburp/Zt21;Lburp/Zmzk;)V
    //   538: aload_3
    //   539: aload #9
    //   541: new burp/Zryf
    //   544: dup
    //   545: aload #9
    //   547: invokespecial <init> : (Lburp/Zm7u;)V
    //   550: invokevirtual ZE : (Lburp/Zm7u;Ljava/lang/Exception;)V
    //   553: iload #5
    //   555: ifne -> 626
    //   558: goto -> 565
    //   561: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   564: athrow
    //   565: aload_0
    //   566: getfield ZL : Lburp/Zzen;
    //   569: invokeinterface ZE : ()Lburp/Zmu_;
    //   574: getstatic burp/Zt21.PROXY : Lburp/Zt21;
    //   577: aload_2
    //   578: invokevirtual Zj : ()Lburp/Zmzk;
    //   581: invokeinterface ZS : (Lburp/Zt21;Lburp/Zmzk;)V
    //   586: aload_3
    //   587: aload #9
    //   589: new burp/Zry8
    //   592: dup
    //   593: aload #9
    //   595: invokespecial <init> : (Lburp/Zm7u;)V
    //   598: invokevirtual ZE : (Lburp/Zm7u;Ljava/lang/Exception;)V
    //   601: iload #5
    //   603: ifne -> 626
    //   606: goto -> 613
    //   609: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   612: athrow
    //   613: aload_3
    //   614: aload #9
    //   616: invokevirtual Zg : (Lburp/Zm7u;)V
    //   619: goto -> 626
    //   622: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   625: athrow
    //   626: aload_0
    //   627: getfield ZD : Lburp/Zgs4;
    //   630: aload_2
    //   631: invokevirtual Zj : ()Lburp/Zmzk;
    //   634: aload #9
    //   636: invokeinterface Zm : ()Ljava/util/List;
    //   641: invokeinterface ZG : (Lburp/Zmzk;Ljava/util/List;)V
    //   646: aload_0
    //   647: getfield ZU : Lburp/Zsil;
    //   650: invokeinterface Zx : ()Lburp/Zx_o;
    //   655: getstatic burp/Zx_o.Zm : Lburp/Zx_o;
    //   658: if_acmpeq -> 1034
    //   661: aload_0
    //   662: getfield Zc : Lburp/Zb2;
    //   665: invokeinterface Zz : ()Ljava/util/Set;
    //   670: invokeinterface isEmpty : ()Z
    //   675: ifne -> 1034
    //   678: goto -> 685
    //   681: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   684: athrow
    //   685: aload_0
    //   686: getfield ZC : Lburp/Zl7q;
    //   689: invokeinterface ZB : ()V
    //   694: aload_0
    //   695: getfield Zc : Lburp/Zb2;
    //   698: invokeinterface Zz : ()Ljava/util/Set;
    //   703: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   708: <illegal opcode> applyAsInt : ()Ljava/util/function/ToIntFunction;
    //   713: invokeinterface mapToInt : (Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
    //   718: invokeinterface sum : ()I
    //   723: istore #17
    //   725: aload_2
    //   726: invokevirtual Zj : ()Lburp/Zmzk;
    //   729: aload_2
    //   730: invokevirtual Zr : ()Lburp/Zefx;
    //   733: invokeinterface Zb : ()Lburp/Zefx;
    //   738: invokeinterface ZD : ()[B
    //   743: aload #9
    //   745: invokeinterface Za : ()Lburp/Zstu;
    //   750: invokeinterface ZiD : ()[B
    //   755: aload #9
    //   757: invokeinterface Zm : ()Ljava/util/List;
    //   762: aload #9
    //   764: invokeinterface Zs : ()I
    //   769: aload #9
    //   771: invokeinterface Ze : ()S
    //   776: iload #17
    //   778: aload_0
    //   779: getfield ZN : Lburp/Zbnt;
    //   782: invokestatic ZO : (Lburp/Zmzk;[B[BLjava/util/List;ISILburp/Zbnt;)Lburp/Zs0d;
    //   785: astore #18
    //   787: aload #18
    //   789: ifnull -> 1034
    //   792: aload_0
    //   793: getfield Ze : Lburp/Zgg0;
    //   796: lload #12
    //   798: aload #14
    //   800: invokeinterface ZH : ()J
    //   805: aload_3
    //   806: invokevirtual ZE : ()Ljava/time/Instant;
    //   809: invokevirtual toEpochMilli : ()J
    //   812: aload_2
    //   813: invokevirtual Zr : ()Lburp/Zefx;
    //   816: aload #9
    //   818: aload #9
    //   820: aload_3
    //   821: invokevirtual Zf : ()Ljava/time/Instant;
    //   824: invokestatic Zr : (Lburp/Zm7u;Ljava/time/Instant;)Ljava/time/Duration;
    //   827: aload #9
    //   829: aload_3
    //   830: invokevirtual Zf : ()Ljava/time/Instant;
    //   833: invokestatic Zp : (Lburp/Zm7u;Ljava/time/Instant;)Ljava/time/Duration;
    //   836: aload_3
    //   837: invokevirtual Zr : ()Lburp/Zlhj;
    //   840: getfield ZO : Ljava/lang/String;
    //   843: aload_3
    //   844: invokevirtual Zr : ()Lburp/Zlhj;
    //   847: getfield Zh : B
    //   850: invokeinterface Zc : (JJJLburp/Zefx;Lburp/Zb6q;Ljava/time/Duration;Ljava/time/Duration;Ljava/lang/String;B)V
    //   855: iconst_1
    //   856: istore #6
    //   858: aload #15
    //   860: invokevirtual ZW : ()V
    //   863: aload #18
    //   865: invokevirtual ZM : ()Lburp/Zlit;
    //   868: invokeinterface Zdz : ()Lburp/Zmzk;
    //   873: astore #19
    //   875: aload_2
    //   876: invokevirtual Zj : ()Lburp/Zmzk;
    //   879: astore #20
    //   881: aload #19
    //   883: aload #20
    //   885: invokeinterface equals : (Ljava/lang/Object;)Z
    //   890: ifne -> 901
    //   893: iconst_1
    //   894: goto -> 902
    //   897: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   900: athrow
    //   901: iconst_0
    //   902: istore #21
    //   904: iload #21
    //   906: ifeq -> 1017
    //   909: aload_0
    //   910: getfield Zv : Lburp/Zl2u;
    //   913: invokevirtual Zh : ()V
    //   916: aload_0
    //   917: getfield ZJ : Lburp/Zxtb;
    //   920: invokevirtual ZL : ()Lburp/Zly6;
    //   923: astore #22
    //   925: aload_0
    //   926: getfield ZJ : Lburp/Zxtb;
    //   929: aload #22
    //   931: invokeinterface ZU : ()Lburp/Zly6;
    //   936: invokevirtual Zb : (Lburp/Zly6;)V
    //   939: aload_0
    //   940: getfield Zc : Lburp/Zb2;
    //   943: invokeinterface Zm : ()Z
    //   948: ifeq -> 973
    //   951: aload_0
    //   952: getfield ZJ : Lburp/Zxtb;
    //   955: getstatic burp/Ze45.ATTEMPT_HTTP2 : Lburp/Ze45;
    //   958: invokevirtual Zx : (Lburp/Ze45;)V
    //   961: iload #5
    //   963: ifne -> 1017
    //   966: goto -> 973
    //   969: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   972: athrow
    //   973: aload #9
    //   975: invokeinterface Zp : ()Lburp/Zl6b;
    //   980: getstatic burp/Zl6b.HTTP_2 : Lburp/Zl6b;
    //   983: if_acmpne -> 1003
    //   986: goto -> 993
    //   989: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   992: athrow
    //   993: getstatic burp/Ze45.ONLY_HTTP2 : Lburp/Ze45;
    //   996: goto -> 1006
    //   999: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1002: athrow
    //   1003: getstatic burp/Ze45.SUPPRESS_HTTP2 : Lburp/Ze45;
    //   1006: astore #23
    //   1008: aload_0
    //   1009: getfield ZJ : Lburp/Zxtb;
    //   1012: aload #23
    //   1014: invokevirtual Zx : (Lburp/Ze45;)V
    //   1017: aload_0
    //   1018: aload #18
    //   1020: aload_2
    //   1021: aload_3
    //   1022: aload #9
    //   1024: invokeinterface Zg : ()Ljava/util/List;
    //   1029: invokevirtual ZQ : (Lburp/Zs0d;Lburp/Zs9p;Lburp/Zb10;Ljava/util/List;)Z
    //   1032: istore #7
    //   1034: goto -> 1392
    //   1037: astore #16
    //   1039: aload #16
    //   1041: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   1044: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1047: aload_0
    //   1048: getfield ZL : Lburp/Zzen;
    //   1051: invokeinterface ZE : ()Lburp/Zmu_;
    //   1056: aload_2
    //   1057: invokevirtual Zj : ()Lburp/Zmzk;
    //   1060: invokeinterface Zl : (Lburp/Zmzk;)V
    //   1065: goto -> 1392
    //   1068: astore #16
    //   1070: aload #16
    //   1072: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   1075: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1078: aload_0
    //   1079: getfield ZL : Lburp/Zzen;
    //   1082: invokeinterface ZE : ()Lburp/Zmu_;
    //   1087: aload_2
    //   1088: invokevirtual Zj : ()Lburp/Zmzk;
    //   1091: invokeinterface ZE : (Lburp/Zmzk;)V
    //   1096: aload #16
    //   1098: getfield Zs : Lburp/Zm7u;
    //   1101: astore #9
    //   1103: aload_3
    //   1104: aload_2
    //   1105: invokevirtual Zr : ()Lburp/Zefx;
    //   1108: aload #9
    //   1110: aload #16
    //   1112: invokevirtual ZE : (Lburp/Zefx;Lburp/Zm7u;Ljava/lang/Exception;)V
    //   1115: goto -> 1392
    //   1118: astore #16
    //   1120: aload #16
    //   1122: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   1125: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1128: aload #16
    //   1130: instanceof burp/Zryf
    //   1133: ifeq -> 1169
    //   1136: aload_0
    //   1137: getfield ZL : Lburp/Zzen;
    //   1140: invokeinterface ZE : ()Lburp/Zmu_;
    //   1145: getstatic burp/Zt21.APPLICATION : Lburp/Zt21;
    //   1148: aload_2
    //   1149: invokevirtual Zj : ()Lburp/Zmzk;
    //   1152: invokeinterface ZS : (Lburp/Zt21;Lburp/Zmzk;)V
    //   1157: iload #5
    //   1159: ifne -> 1343
    //   1162: goto -> 1169
    //   1165: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1168: athrow
    //   1169: aload #16
    //   1171: instanceof burp/Zry8
    //   1174: ifeq -> 1217
    //   1177: goto -> 1184
    //   1180: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1183: athrow
    //   1184: aload_0
    //   1185: getfield ZL : Lburp/Zzen;
    //   1188: invokeinterface ZE : ()Lburp/Zmu_;
    //   1193: getstatic burp/Zt21.PROXY : Lburp/Zt21;
    //   1196: aload_2
    //   1197: invokevirtual Zj : ()Lburp/Zmzk;
    //   1200: invokeinterface ZS : (Lburp/Zt21;Lburp/Zmzk;)V
    //   1205: iload #5
    //   1207: ifne -> 1343
    //   1210: goto -> 1217
    //   1213: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1216: athrow
    //   1217: aload #16
    //   1219: instanceof burp/Zry6
    //   1222: ifeq -> 1273
    //   1225: goto -> 1232
    //   1228: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1231: athrow
    //   1232: aload_0
    //   1233: getfield ZL : Lburp/Zzen;
    //   1236: invokeinterface ZE : ()Lburp/Zmu_;
    //   1241: getstatic burp/Zt21.APPLICATION : Lburp/Zt21;
    //   1244: aload_2
    //   1245: invokevirtual Zj : ()Lburp/Zmzk;
    //   1248: aload #16
    //   1250: checkcast burp/Zry6
    //   1253: getfield Zs : I
    //   1256: invokeinterface ZI : (Lburp/Zt21;Lburp/Zmzk;I)V
    //   1261: iload #5
    //   1263: ifne -> 1343
    //   1266: goto -> 1273
    //   1269: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1272: athrow
    //   1273: aload #16
    //   1275: instanceof burp/Zryl
    //   1278: ifeq -> 1329
    //   1281: goto -> 1288
    //   1284: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1287: athrow
    //   1288: aload_0
    //   1289: getfield ZL : Lburp/Zzen;
    //   1292: invokeinterface ZE : ()Lburp/Zmu_;
    //   1297: getstatic burp/Zt21.PROXY : Lburp/Zt21;
    //   1300: aload_2
    //   1301: invokevirtual Zj : ()Lburp/Zmzk;
    //   1304: aload #16
    //   1306: checkcast burp/Zryl
    //   1309: getfield Zs : I
    //   1312: invokeinterface ZI : (Lburp/Zt21;Lburp/Zmzk;I)V
    //   1317: iload #5
    //   1319: ifne -> 1343
    //   1322: goto -> 1329
    //   1325: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1328: athrow
    //   1329: iconst_0
    //   1330: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   1333: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   1336: goto -> 1343
    //   1339: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1342: athrow
    //   1343: aload #16
    //   1345: getfield Ze : Lburp/Zm7u;
    //   1348: astore #9
    //   1350: aload_3
    //   1351: aload #9
    //   1353: aload #16
    //   1355: invokevirtual ZE : (Lburp/Zm7u;Ljava/lang/Exception;)V
    //   1358: goto -> 1392
    //   1361: astore #16
    //   1363: aload #16
    //   1365: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   1368: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1371: aload_0
    //   1372: getfield ZL : Lburp/Zzen;
    //   1375: invokeinterface ZE : ()Lburp/Zmu_;
    //   1380: invokeinterface Ze : ()V
    //   1385: aload_3
    //   1386: aload #16
    //   1388: invokevirtual Zq : (Ljava/lang/Exception;)V
    //   1391: return
    //   1392: aload #15
    //   1394: invokevirtual ZW : ()V
    //   1397: iload #8
    //   1399: ifeq -> 1484
    //   1402: iload #6
    //   1404: ifne -> 1484
    //   1407: goto -> 1414
    //   1410: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1413: athrow
    //   1414: aload_0
    //   1415: getfield Ze : Lburp/Zgg0;
    //   1418: lload #12
    //   1420: aload #14
    //   1422: invokeinterface ZH : ()J
    //   1427: aload_3
    //   1428: invokevirtual ZE : ()Ljava/time/Instant;
    //   1431: invokevirtual toEpochMilli : ()J
    //   1434: aload_2
    //   1435: invokevirtual Zr : ()Lburp/Zefx;
    //   1438: aload #9
    //   1440: aload #9
    //   1442: aload_3
    //   1443: invokevirtual Zf : ()Ljava/time/Instant;
    //   1446: invokestatic Zr : (Lburp/Zm7u;Ljava/time/Instant;)Ljava/time/Duration;
    //   1449: aload #9
    //   1451: aload_3
    //   1452: invokevirtual Zf : ()Ljava/time/Instant;
    //   1455: invokestatic Zp : (Lburp/Zm7u;Ljava/time/Instant;)Ljava/time/Duration;
    //   1458: aload_3
    //   1459: invokevirtual Zr : ()Lburp/Zlhj;
    //   1462: getfield ZO : Ljava/lang/String;
    //   1465: aload_3
    //   1466: invokevirtual Zr : ()Lburp/Zlhj;
    //   1469: getfield Zh : B
    //   1472: invokeinterface Zc : (JJJLburp/Zefx;Lburp/Zb6q;Ljava/time/Duration;Ljava/time/Duration;Ljava/lang/String;B)V
    //   1477: goto -> 1484
    //   1480: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1483: athrow
    //   1484: iload #7
    //   1486: ifne -> 1512
    //   1489: aload_0
    //   1490: getfield ZL : Lburp/Zzen;
    //   1493: getstatic burp/Zewh.COMPLETED : Lburp/Zewh;
    //   1496: aload_3
    //   1497: invokevirtual Zo : ()Lburp/Zsxd;
    //   1500: invokeinterface ZD : (Lburp/Zewh;Lburp/Zsxd;)V
    //   1505: goto -> 1512
    //   1508: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1511: athrow
    //   1512: return
    // Exception table:
    //   from	to	target	type
    //   84	97	100	java/io/IOException
    //   134	147	147	java/io/IOException
    //   192	293	1037	java/io/IOException
    //   192	293	1068	burp/Zgsm
    //   192	293	1118	burp/Zryo
    //   192	293	1118	burp/Zryj
    //   192	293	1361	burp/Zxt3
    //   294	306	1037	java/io/IOException
    //   294	306	1068	burp/Zgsm
    //   294	306	1118	burp/Zryo
    //   294	306	1118	burp/Zryj
    //   294	306	1361	burp/Zxt3
    //   307	444	1037	java/io/IOException
    //   307	444	1068	burp/Zgsm
    //   307	444	1118	burp/Zryo
    //   307	444	1118	burp/Zryj
    //   307	444	1361	burp/Zxt3
    //   445	510	513	java/io/IOException
    //   445	1034	1037	java/io/IOException
    //   445	1034	1068	burp/Zgsm
    //   445	1034	1118	burp/Zryo
    //   445	1034	1118	burp/Zryj
    //   445	1034	1361	burp/Zxt3
    //   488	558	561	java/io/IOException
    //   517	606	609	java/io/IOException
    //   565	619	622	java/io/IOException
    //   626	678	681	java/io/IOException
    //   881	897	897	java/io/IOException
    //   925	966	969	java/io/IOException
    //   951	986	989	java/io/IOException
    //   973	999	999	java/io/IOException
    //   1120	1162	1165	java/io/IOException
    //   1136	1177	1180	java/io/IOException
    //   1169	1210	1213	java/io/IOException
    //   1184	1225	1228	java/io/IOException
    //   1217	1266	1269	java/io/IOException
    //   1232	1281	1284	java/io/IOException
    //   1273	1322	1325	java/io/IOException
    //   1288	1336	1339	java/io/IOException
    //   1392	1407	1410	java/io/IOException
    //   1402	1477	1480	java/io/IOException
    //   1484	1505	1508	java/io/IOException
  }
  
  private boolean ZQ(Zs0d paramZs0d, Zs9p paramZs9p, Zb10 paramZb10, List<String> paramList) {
    try {
      Zmzk zmzk = paramZb10.ZH();
      Zefx zefx1 = paramZs9p.Zr();
      Zs9z zs9z = new Zs9z(paramZs9p.Zk(), zmzk, paramZs9p.Zj(), zefx1.Zb().ZD(), paramZs0d);
      Zx_o zx_o = this.ZU.Zx();
      if (zx_o.ZE(this.Zw, zs9z) == Zswo.STOP) {
        this.ZL.Zt(zs9z);
        return false;
      } 
      Zlit zlit = paramZs0d.ZM();
      try {
      
      } catch (Exception exception) {
        throw a(null);
      } 
      boolean bool = (this.ZG.Zc(zlit.Zdz()) != null) ? true : false;
      Zefx zefx2 = Zz3g.Zo(zefx1, this.Zc.Zv(), paramList, zlit, bool, paramZs0d.Zs(), this.Zu);
      Optional<Zefx> optional = zx_o.ZC(zs9z, zefx2);
      if (optional.isEmpty())
        return false; 
      Zefx zefx3 = optional.get();
      this.ZL.Zb(zs9z, zefx3);
      paramZs9p.Zz(zefx3);
      ZZ(paramZs9p, paramZb10);
      return true;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return false;
    } 
  }
  
  private static Duration Zr(Zm7u paramZm7u, Instant paramInstant) {
    return (paramInstant == null || paramZm7u == null || paramZm7u.ZR() == null) ? Zsxd.ZG : Duration.between(paramInstant, paramZm7u.ZR());
  }
  
  private static Duration Zp(Zm7u paramZm7u, Instant paramInstant) {
    return (paramInstant == null || paramZm7u == null || paramZm7u.ZQ() == null) ? Zsxd.ZG : Duration.between(paramInstant, paramZm7u.ZQ());
  }
  
  private static int lambda$issueRequestUnderLock$0(Zzz1 paramZzz1) {
    return paramZzz1.bitValue;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zefd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */