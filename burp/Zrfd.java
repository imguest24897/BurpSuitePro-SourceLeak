package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zsy;
import net.portswigger.Zuh;

public class Zrfd {
  private static final Zrb4 ZF;
  
  private final Zzir ZV;
  
  private final Zz5p Zc;
  
  private final Zrag Zd;
  
  private final Zzkr ZN;
  
  private final Zxwj Zf;
  
  private final Zr_4 Za;
  
  private final Zr_4 Zz;
  
  private final Zg41 ZQ;
  
  private final Zsus ZU;
  
  private final Zg0s ZZ;
  
  private final Zs4c ZS;
  
  private final Zr3n Z_;
  
  private final Zgse Zi;
  
  private final Zew2 Zo;
  
  private final Zxea ZW;
  
  private final Zskh Zx;
  
  private final Zkl6 ZH;
  
  private final Zsy ZE;
  
  private final Ztdi ZC;
  
  private final Zt6o Zh;
  
  private final Zmvn ZA;
  
  private final Zkf3 ZB;
  
  private final Zerg ZT;
  
  private final Znn Zn;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrfd(Zzir paramZzir, Zz5p paramZz5p, Zrag paramZrag, Zzkr paramZzkr, Zxwj paramZxwj, Zr_4 paramZr_41, Zr_4 paramZr_42, Zg41 paramZg41, Zsus paramZsus, Zg0s paramZg0s, Zs4c paramZs4c, Zr3n paramZr3n, Zgse paramZgse, Zew2 paramZew2, Zxea paramZxea, Zskh paramZskh, Zkl6 paramZkl6, Zsy paramZsy, Ztdi paramZtdi, Zt6o paramZt6o, Zmvn paramZmvn, Zkf3 paramZkf3, Zerg paramZerg, Znn paramZnn) {
    this.ZV = paramZzir;
    this.Zc = paramZz5p;
    this.Zd = paramZrag;
    this.ZN = paramZzkr;
    this.Zf = paramZxwj;
    this.Za = paramZr_41;
    this.Zz = paramZr_42;
    this.ZQ = paramZg41;
    this.ZU = paramZsus;
    this.ZZ = paramZg0s;
    this.ZS = paramZs4c;
    this.Z_ = paramZr3n;
    this.Zi = paramZgse;
    this.Zo = paramZew2;
    this.ZW = paramZxea;
    this.Zx = paramZskh;
    this.ZH = paramZkl6;
    this.ZE = paramZsy;
    this.ZC = paramZtdi;
    this.Zh = paramZt6o;
    this.ZA = paramZmvn;
    this.ZB = paramZkf3;
    this.ZT = paramZerg;
    this.Zn = paramZnn;
  }
  
  public Ztj1 Ze(Ztvd paramZtvd, Zm0l paramZm0l, Zzys paramZzys, Zb_x paramZb_x, Zl2h paramZl2h, Zb2y paramZb2y, Zto9 paramZto9, Zskh paramZskh) {
    Zp(paramZzys);
    return ZQ(paramZzys, paramZtvd, paramZm0l, paramZb2y, null, null, paramZb_x, paramZl2h, paramZto9, paramZskh, false, this.ZC.Zk());
  }
  
  private void Zp(Zzys paramZzys) {
    boolean bool = paramZzys.ZNH().ZeY().ZPQ();
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    boolean bool1 = !this.Za.Zi() ? true : false;
    try {
      if (!bool1) {
        try {
          if (bool) {
            this.ZV.Zv9().ZV_().add(paramZzys);
            return;
          } 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    this.ZV.Zv9().ZV_().add(paramZzys);
  }
  
  public Ztj1 Zq(Zkv4 paramZkv4, Zm0l paramZm0l) {
    return ZP(paramZkv4, paramZm0l, this::lambda$launchScanTask$0, false, false);
  }
  
  public Ztj1 ZP(Zkv4 paramZkv4, Zm0l paramZm0l, Zsv0 paramZsv0, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: new burp/Zkg9
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #10
    //   9: aconst_null
    //   10: astore #11
    //   12: aconst_null
    //   13: astore #12
    //   15: invokestatic Zd : ()I
    //   18: aload_0
    //   19: getfield Zf : Lburp/Zxwj;
    //   22: invokeinterface ZL : ()I
    //   27: istore #16
    //   29: invokestatic Zo : ()Ljava/lang/String;
    //   32: astore #17
    //   34: istore #6
    //   36: aload_0
    //   37: getfield Zx : Lburp/Zskh;
    //   40: iload #16
    //   42: invokeinterface ZD : (I)Lburp/Zskh;
    //   47: getstatic burp/Zeew.SCANNER : Lburp/Zeew;
    //   50: invokeinterface ZQ : (Lburp/Zeew;)Lburp/Zskh;
    //   55: astore #19
    //   57: iload #5
    //   59: ifne -> 88
    //   62: new net/portswigger/Zgl
    //   65: dup
    //   66: aload #17
    //   68: invokespecial <init> : (Ljava/lang/String;)V
    //   71: getstatic burp/Zec3.SCANNER_CONFIG_IDS : Lburp/Zec3;
    //   74: aload_1
    //   75: invokevirtual ZT : ()Ljava/lang/String;
    //   78: invokestatic Zz : (Lnet/portswigger/Zgl;Lnet/portswigger/Zrmw;Ljava/lang/String;)V
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   87: athrow
    //   88: aload_0
    //   89: getfield ZC : Lburp/Ztdi;
    //   92: astore #20
    //   94: aload_1
    //   95: getfield Zj : Lburp/Ztfs;
    //   98: getfield ZO : Lburp/Zkcl;
    //   101: astore #21
    //   103: getstatic burp/Zshn.Zk : [I
    //   106: aload #21
    //   108: invokevirtual ordinal : ()I
    //   111: iaload
    //   112: tableswitch default -> 1371, 1 -> 148, 2 -> 472, 3 -> 472, 4 -> 856, 5 -> 856
    //   148: aload_0
    //   149: aload_1
    //   150: invokevirtual ZM : (Lburp/Zkv4;)Lburp/Zkkg;
    //   153: astore #22
    //   155: aload_0
    //   156: aload_1
    //   157: aload #22
    //   159: iload #16
    //   161: aload #19
    //   163: invokevirtual ZS : (Lburp/Zkv4;Lburp/Zkkg;ILburp/Zskh;)Lburp/Zzkp;
    //   166: astore #23
    //   168: aload_0
    //   169: getfield Za : Lburp/Zr_4;
    //   172: new burp/Zkie
    //   175: dup
    //   176: iload #16
    //   178: invokespecial <init> : (I)V
    //   181: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   186: checkcast burp/Zb4g
    //   189: astore #24
    //   191: aload #24
    //   193: aload_0
    //   194: getfield ZS : Lburp/Zs4c;
    //   197: invokestatic ZF : (Lburp/Zb4g;Lburp/Zs4c;)V
    //   200: aload #23
    //   202: invokevirtual ZVQ : ()Lburp/Zl7h;
    //   205: astore #25
    //   207: aload_0
    //   208: getfield Za : Lburp/Zr_4;
    //   211: new burp/Zmsi
    //   214: dup
    //   215: iload #16
    //   217: aload #17
    //   219: getstatic burp/Zkcl.SCAN_CRAWL : Lburp/Zkcl;
    //   222: aload_1
    //   223: invokevirtual ZM : (Lburp/Zkv4;)Ljava/lang/String;
    //   226: getstatic burp/Zkcl.SCAN_CRAWL : Lburp/Zkcl;
    //   229: aload_1
    //   230: invokevirtual Zx : (Lburp/Zkv4;)Ljava/lang/String;
    //   233: aload #25
    //   235: aload #24
    //   237: invokespecial <init> : (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lburp/Zl7h;Lburp/Zb4g;)V
    //   240: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   245: checkcast burp/Zlog
    //   248: astore #26
    //   250: aload_0
    //   251: getfield ZW : Lburp/Zxea;
    //   254: aload #26
    //   256: invokevirtual Zt : (Lburp/Zgna;)Lburp/Zto9;
    //   259: astore #8
    //   261: new burp/Zlz4
    //   264: dup
    //   265: aload #25
    //   267: invokespecial <init> : (Lburp/Zl7h;)V
    //   270: astore #14
    //   272: new burp/Ztos
    //   275: dup
    //   276: invokestatic Zq : ()Lburp/Zt18;
    //   279: invokespecial <init> : (Lburp/Zt3y;)V
    //   282: astore #27
    //   284: aload #25
    //   286: invokeinterface ZVV : ()Z
    //   291: istore #28
    //   293: iload #28
    //   295: ifeq -> 316
    //   298: aload_0
    //   299: aload #25
    //   301: invokeinterface ZVX : ()Lburp/Zskz;
    //   306: invokevirtual ZK : (Lburp/Zskz;)Lburp/Ztdi;
    //   309: goto -> 320
    //   312: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   315: athrow
    //   316: aload_0
    //   317: getfield ZC : Lburp/Ztdi;
    //   320: astore #20
    //   322: aload #27
    //   324: <illegal opcode> Zk : (Lburp/Ztos;)Lburp/Ztuv;
    //   329: astore #29
    //   331: aload #23
    //   333: invokevirtual ZV1 : ()Lburp/Zr69;
    //   336: invokeinterface ZY : ()Z
    //   341: ifeq -> 364
    //   344: aload_0
    //   345: getfield ZA : Lburp/Zmvn;
    //   348: aload #20
    //   350: aload #29
    //   352: invokeinterface Zq : (Lburp/Ztdi;Lburp/Ztuv;)Lburp/Zzs1;
    //   357: goto -> 367
    //   360: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   363: athrow
    //   364: getstatic burp/Zel_.Za : Lburp/Zel_;
    //   367: astore #30
    //   369: iload #28
    //   371: ifeq -> 402
    //   374: new burp/Zzz2
    //   377: dup
    //   378: aload #20
    //   380: aload #25
    //   382: invokeinterface ZVU : ()Lburp/Zzg7;
    //   387: iconst_0
    //   388: aload_0
    //   389: getfield Za : Lburp/Zr_4;
    //   392: invokespecial <init> : (Lburp/Ztdi;Lburp/Zzg7;ZLburp/Zr_4;)V
    //   395: goto -> 405
    //   398: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   401: athrow
    //   402: getstatic burp/Zkf3.Zm : Lburp/Zkf3;
    //   405: astore #18
    //   407: aload_0
    //   408: getfield Zc : Lburp/Zz5p;
    //   411: aload #26
    //   413: aload #23
    //   415: invokevirtual ZV1 : ()Lburp/Zr69;
    //   418: aload #14
    //   420: aload #19
    //   422: aload #8
    //   424: aload #27
    //   426: aload #20
    //   428: aload #30
    //   430: iload #28
    //   432: ifeq -> 444
    //   435: aload #18
    //   437: goto -> 448
    //   440: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   443: athrow
    //   444: aload_0
    //   445: getfield ZB : Lburp/Zkf3;
    //   448: invokevirtual Zg : (Lburp/Zlog;Lburp/Zr69;Lburp/Zlz4;Lburp/Zskh;Lburp/Ztos;Lburp/Ztos;Lburp/Ztdi;Lburp/Zzs1;Lburp/Zkf3;)Lburp/Zezo;
    //   451: astore #9
    //   453: aload #26
    //   455: astore #7
    //   457: aload #14
    //   459: astore #13
    //   461: getstatic burp/Zze0.DASHBOARD_CREATE_TASK_CRAWL : Lburp/Zze0;
    //   464: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   467: iload #6
    //   469: ifeq -> 1380
    //   472: aload_0
    //   473: getfield Za : Lburp/Zr_4;
    //   476: new burp/Zkie
    //   479: dup
    //   480: iload #16
    //   482: invokespecial <init> : (I)V
    //   485: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   490: checkcast burp/Zb4g
    //   493: astore #22
    //   495: aload #22
    //   497: aload_0
    //   498: getfield ZS : Lburp/Zs4c;
    //   501: invokestatic ZF : (Lburp/Zb4g;Lburp/Zs4c;)V
    //   504: aload_0
    //   505: aload_1
    //   506: iconst_0
    //   507: invokevirtual Zc : (Lburp/Zkv4;Z)Lburp/Zlw;
    //   510: astore #23
    //   512: aload_0
    //   513: getfield Za : Lburp/Zr_4;
    //   516: iload #5
    //   518: ifeq -> 531
    //   521: getstatic burp/Zrfd.ZF : Lburp/Zrb4;
    //   524: goto -> 538
    //   527: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   530: athrow
    //   531: new burp/Zrb4
    //   534: dup
    //   535: invokespecial <init> : ()V
    //   538: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   543: checkcast burp/Zl5o
    //   546: astore #24
    //   548: aload_0
    //   549: aload_1
    //   550: iload #16
    //   552: aload #17
    //   554: aload #23
    //   556: aload #22
    //   558: aload #24
    //   560: invokevirtual Zf : (Lburp/Zkv4;ILjava/lang/String;Lburp/Zlw;Lburp/Zb4g;Lburp/Zl5o;)Lburp/Zr5h;
    //   563: astore #25
    //   565: aload_0
    //   566: getfield ZW : Lburp/Zxea;
    //   569: aload #25
    //   571: invokevirtual Zt : (Lburp/Zgna;)Lburp/Zto9;
    //   574: astore #8
    //   576: new burp/Zgq5
    //   579: dup
    //   580: aload #25
    //   582: invokeinterface Zdm : ()Lburp/Zz1i;
    //   587: invokeinterface ZHD : ()Lburp/Zefk;
    //   592: invokespecial <init> : (Lburp/Zefk;)V
    //   595: astore #15
    //   597: getstatic burp/Zkf3.Zm : Lburp/Zkf3;
    //   600: astore #18
    //   602: new burp/Zg09
    //   605: dup
    //   606: aload #25
    //   608: invokeinterface Zdm : ()Lburp/Zz1i;
    //   613: invokeinterface ZHU : ()Lburp/Zefg;
    //   618: invokespecial <init> : (Lburp/Zefg;)V
    //   621: astore #12
    //   623: aload_0
    //   624: getfield ZQ : Lburp/Zg41;
    //   627: aload #23
    //   629: invokevirtual ZRE : ()Lburp/Zz1i;
    //   632: aload #23
    //   634: invokevirtual ZRi : ()Lburp/Zkq4;
    //   637: aload #12
    //   639: aload #8
    //   641: invokevirtual Zy : (Lburp/Zz1i;Lburp/Zkq4;Lburp/Zg09;Lburp/Ztos;)Lburp/Zb9a;
    //   644: astore #11
    //   646: aload_0
    //   647: getfield Zc : Lburp/Zz5p;
    //   650: aload #25
    //   652: aload #10
    //   654: aload #11
    //   656: aload #23
    //   658: invokevirtual ZRi : ()Lburp/Zkq4;
    //   661: aload #15
    //   663: aload #8
    //   665: aload #19
    //   667: aload_0
    //   668: getfield ZC : Lburp/Ztdi;
    //   671: aload_0
    //   672: getfield Zn : Lburp/Znn;
    //   675: aload_0
    //   676: getfield ZA : Lburp/Zmvn;
    //   679: aload_0
    //   680: getfield ZC : Lburp/Ztdi;
    //   683: invokeinterface Zn : (Lburp/Ztdi;)Lburp/Zzs1;
    //   688: aload_3
    //   689: iload #4
    //   691: iload #5
    //   693: invokevirtual Zp : (Lburp/Zr5h;Lburp/Zkg9;Lburp/Zb9a;Lburp/Zkq4;Lburp/Zgq5;Lburp/Zto9;Lburp/Zskh;Lburp/Ztdi;Lburp/Znn;Lburp/Zzs1;Lburp/Zsv0;ZZ)Lburp/Zriy;
    //   696: astore #9
    //   698: aload_1
    //   699: getfield Zj : Lburp/Ztfs;
    //   702: getfield ZR : Ljava/util/List;
    //   705: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   710: aload_0
    //   711: aload #23
    //   713: aload_1
    //   714: <illegal opcode> apply : (Lburp/Zrfd;Lburp/Zlw;Lburp/Zkv4;)Ljava/util/function/Function;
    //   719: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   724: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   729: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   734: aload #11
    //   736: dup
    //   737: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   740: pop
    //   741: <illegal opcode> accept : (Lburp/Zb9a;)Ljava/util/function/Consumer;
    //   746: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   751: aload #25
    //   753: astore #7
    //   755: aload #15
    //   757: astore #13
    //   759: iload #5
    //   761: ifne -> 795
    //   764: aload #21
    //   766: getstatic burp/Zkcl.API_AUDIT : Lburp/Zkcl;
    //   769: if_acmpne -> 789
    //   772: goto -> 779
    //   775: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   778: athrow
    //   779: getstatic burp/Zze0.DASHBOARD_CREATE_TASK_API_AUDIT : Lburp/Zze0;
    //   782: goto -> 792
    //   785: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   788: athrow
    //   789: getstatic burp/Zze0.DASHBOARD_CREATE_TASK_AUDIT : Lburp/Zze0;
    //   792: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   795: aload #7
    //   797: invokeinterface ZNs : ()Lburp/Zkcl;
    //   802: getstatic burp/Zkcl.API_AUDIT : Lburp/Zkcl;
    //   805: if_acmpne -> 853
    //   808: aload_1
    //   809: getfield Zj : Lburp/Ztfs;
    //   812: astore #27
    //   814: aload #27
    //   816: instanceof burp/Ztf3
    //   819: ifeq -> 853
    //   822: aload #27
    //   824: checkcast burp/Ztf3
    //   827: astore #26
    //   829: aload #26
    //   831: getfield Zv : Z
    //   834: ifeq -> 847
    //   837: getstatic burp/Zze0.SCANNER_API_FILE_UPLOAD_SCAN : Lburp/Zze0;
    //   840: goto -> 850
    //   843: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   846: athrow
    //   847: getstatic burp/Zze0.SCANNER_API_URL_SCAN : Lburp/Zze0;
    //   850: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   853: goto -> 1380
    //   856: aload_0
    //   857: aload_1
    //   858: invokevirtual ZM : (Lburp/Zkv4;)Lburp/Zkkg;
    //   861: astore #22
    //   863: aload_0
    //   864: aload_1
    //   865: aload #22
    //   867: iload #16
    //   869: aload #19
    //   871: invokevirtual ZS : (Lburp/Zkv4;Lburp/Zkkg;ILburp/Zskh;)Lburp/Zzkp;
    //   874: astore #23
    //   876: aload_0
    //   877: getfield Za : Lburp/Zr_4;
    //   880: new burp/Zkie
    //   883: dup
    //   884: iload #16
    //   886: invokespecial <init> : (I)V
    //   889: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   894: checkcast burp/Zb4g
    //   897: astore #24
    //   899: aload #24
    //   901: aload_0
    //   902: getfield ZS : Lburp/Zs4c;
    //   905: invokestatic ZF : (Lburp/Zb4g;Lburp/Zs4c;)V
    //   908: aload #23
    //   910: invokevirtual ZVQ : ()Lburp/Zl7h;
    //   913: astore #25
    //   915: aload_0
    //   916: aload_1
    //   917: aload #23
    //   919: getfield ZV1 : Lburp/Zr69;
    //   922: invokeinterface ZV : ()Z
    //   927: ifne -> 938
    //   930: iconst_1
    //   931: goto -> 939
    //   934: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   937: athrow
    //   938: iconst_0
    //   939: invokevirtual Zc : (Lburp/Zkv4;Z)Lburp/Zlw;
    //   942: astore #26
    //   944: aload_0
    //   945: getfield Za : Lburp/Zr_4;
    //   948: new burp/Zsl
    //   951: dup
    //   952: iload #16
    //   954: aload #17
    //   956: aload #21
    //   958: aload #21
    //   960: aload_1
    //   961: invokevirtual ZM : (Lburp/Zkv4;)Ljava/lang/String;
    //   964: aload #21
    //   966: aload_1
    //   967: invokevirtual Zx : (Lburp/Zkv4;)Ljava/lang/String;
    //   970: aload #25
    //   972: aload #26
    //   974: invokevirtual ZRE : ()Lburp/Zz1i;
    //   977: aload #24
    //   979: aload_0
    //   980: getfield Za : Lburp/Zr_4;
    //   983: new burp/Zrb4
    //   986: dup
    //   987: invokespecial <init> : ()V
    //   990: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   995: checkcast burp/Zl5o
    //   998: invokespecial <init> : (ILjava/lang/String;Lburp/Zkcl;Ljava/lang/String;Ljava/lang/String;Lburp/Zl7h;Lburp/Zz1i;Lburp/Zb4g;Lburp/Zl5o;)V
    //   1001: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   1006: checkcast burp/Zzep
    //   1009: astore #27
    //   1011: aload_0
    //   1012: getfield ZW : Lburp/Zxea;
    //   1015: aload #27
    //   1017: invokevirtual Zt : (Lburp/Zgna;)Lburp/Zto9;
    //   1020: astore #8
    //   1022: new burp/Zlz4
    //   1025: dup
    //   1026: aload #25
    //   1028: invokespecial <init> : (Lburp/Zl7h;)V
    //   1031: astore #14
    //   1033: new burp/Zgq5
    //   1036: dup
    //   1037: aload #27
    //   1039: invokeinterface Zdm : ()Lburp/Zz1i;
    //   1044: invokeinterface ZHD : ()Lburp/Zefk;
    //   1049: invokespecial <init> : (Lburp/Zefk;)V
    //   1052: astore #15
    //   1054: new burp/Zbz0
    //   1057: dup
    //   1058: aload #27
    //   1060: aload #14
    //   1062: aload #15
    //   1064: invokespecial <init> : (Lburp/Zzep;Lburp/Zlz4;Lburp/Zgq5;)V
    //   1067: astore #28
    //   1069: new burp/Zg09
    //   1072: dup
    //   1073: aload #27
    //   1075: invokeinterface Zdm : ()Lburp/Zz1i;
    //   1080: invokeinterface ZHU : ()Lburp/Zefg;
    //   1085: invokespecial <init> : (Lburp/Zefg;)V
    //   1088: astore #12
    //   1090: aload_0
    //   1091: getfield ZQ : Lburp/Zg41;
    //   1094: aload #27
    //   1096: invokeinterface Zdm : ()Lburp/Zz1i;
    //   1101: aload #26
    //   1103: invokevirtual ZRi : ()Lburp/Zkq4;
    //   1106: aload #12
    //   1108: aload #8
    //   1110: invokevirtual Zy : (Lburp/Zz1i;Lburp/Zkq4;Lburp/Zg09;Lburp/Ztos;)Lburp/Zb9a;
    //   1113: astore #11
    //   1115: new burp/Ztos
    //   1118: dup
    //   1119: invokestatic Zq : ()Lburp/Zt18;
    //   1122: invokespecial <init> : (Lburp/Zt3y;)V
    //   1125: astore #29
    //   1127: aload #25
    //   1129: invokeinterface ZVV : ()Z
    //   1134: istore #30
    //   1136: iload #30
    //   1138: ifeq -> 1159
    //   1141: aload_0
    //   1142: aload #25
    //   1144: invokeinterface ZVX : ()Lburp/Zskz;
    //   1149: invokevirtual ZK : (Lburp/Zskz;)Lburp/Ztdi;
    //   1152: goto -> 1163
    //   1155: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   1158: athrow
    //   1159: aload_0
    //   1160: getfield ZC : Lburp/Ztdi;
    //   1163: astore #20
    //   1165: aload #29
    //   1167: <illegal opcode> Zk : (Lburp/Ztos;)Lburp/Ztuv;
    //   1172: astore #31
    //   1174: aload #23
    //   1176: invokevirtual ZV1 : ()Lburp/Zr69;
    //   1179: invokeinterface ZY : ()Z
    //   1184: ifeq -> 1207
    //   1187: aload_0
    //   1188: getfield ZA : Lburp/Zmvn;
    //   1191: aload #20
    //   1193: aload #31
    //   1195: invokeinterface Zq : (Lburp/Ztdi;Lburp/Ztuv;)Lburp/Zzs1;
    //   1200: goto -> 1210
    //   1203: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   1206: athrow
    //   1207: getstatic burp/Zel_.Za : Lburp/Zel_;
    //   1210: astore #32
    //   1212: iload #30
    //   1214: ifeq -> 1245
    //   1217: new burp/Zzz2
    //   1220: dup
    //   1221: aload #20
    //   1223: aload #25
    //   1225: invokeinterface ZVU : ()Lburp/Zzg7;
    //   1230: iconst_0
    //   1231: aload_0
    //   1232: getfield Za : Lburp/Zr_4;
    //   1235: invokespecial <init> : (Lburp/Ztdi;Lburp/Zzg7;ZLburp/Zr_4;)V
    //   1238: goto -> 1248
    //   1241: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   1244: athrow
    //   1245: getstatic burp/Zkf3.Zm : Lburp/Zkf3;
    //   1248: astore #18
    //   1250: aload_0
    //   1251: getfield Zc : Lburp/Zz5p;
    //   1254: aload #27
    //   1256: aload #23
    //   1258: invokevirtual ZV1 : ()Lburp/Zr69;
    //   1261: aload #10
    //   1263: aload #26
    //   1265: invokevirtual ZRi : ()Lburp/Zkq4;
    //   1268: aload #11
    //   1270: aload #14
    //   1272: aload #15
    //   1274: aload #8
    //   1276: aload #29
    //   1278: aload #19
    //   1280: aload #20
    //   1282: iload #30
    //   1284: ifeq -> 1301
    //   1287: new burp/Znn
    //   1290: dup
    //   1291: invokespecial <init> : ()V
    //   1294: goto -> 1305
    //   1297: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   1300: athrow
    //   1301: aload_0
    //   1302: getfield Zn : Lburp/Znn;
    //   1305: aload #32
    //   1307: iload #30
    //   1309: ifeq -> 1321
    //   1312: aload #18
    //   1314: goto -> 1325
    //   1317: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   1320: athrow
    //   1321: aload_0
    //   1322: getfield ZB : Lburp/Zkf3;
    //   1325: aload_3
    //   1326: iload #4
    //   1328: invokevirtual ZS : (Lburp/Zzep;Lburp/Zr69;Lburp/Zkg9;Lburp/Zkq4;Lburp/Zb9a;Lburp/Zlz4;Lburp/Zgq5;Lburp/Zto9;Lburp/Ztos;Lburp/Zskh;Lburp/Ztdi;Lburp/Znn;Lburp/Zzs1;Lburp/Zkf3;Lburp/Zsv0;Z)Lburp/Zxn8;
    //   1331: astore #9
    //   1333: aload #27
    //   1335: astore #7
    //   1337: aload #28
    //   1339: astore #13
    //   1341: getstatic burp/Zze0.DASHBOARD_CREATE_TASK_CRAWL_AND_AUDIT : Lburp/Zze0;
    //   1344: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   1347: aload #21
    //   1349: getstatic burp/Zkcl.SOAP_API_AUDIT : Lburp/Zkcl;
    //   1352: if_acmpne -> 1368
    //   1355: getstatic burp/Zze0.SCANNER_SOAP_API_SCAN : Lburp/Zze0;
    //   1358: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   1361: goto -> 1368
    //   1364: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   1367: athrow
    //   1368: goto -> 1380
    //   1371: iconst_0
    //   1372: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   1375: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   1378: aconst_null
    //   1379: areturn
    //   1380: iload #5
    //   1382: ifne -> 1414
    //   1385: new net/portswigger/Zgl
    //   1388: dup
    //   1389: aload #17
    //   1391: invokespecial <init> : (Ljava/lang/String;)V
    //   1394: getstatic burp/Zv8r.SCANNER_TASK_SOURCE : Lburp/Zv8r;
    //   1397: aload_1
    //   1398: getfield ZP : Lburp/Zlj4;
    //   1401: invokevirtual Zf : ()J
    //   1404: invokestatic Ze : (Lnet/portswigger/Zgl;Lnet/portswigger/Zzr;J)V
    //   1407: goto -> 1414
    //   1410: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   1413: athrow
    //   1414: aload_2
    //   1415: aload #7
    //   1417: invokeinterface ZPo : ()I
    //   1422: invokeinterface ZQ : (I)V
    //   1427: aload_0
    //   1428: getfield Zi : Lburp/Zgse;
    //   1431: aload #11
    //   1433: aload #12
    //   1435: aload #10
    //   1437: aload #20
    //   1439: aload #18
    //   1441: invokevirtual Zc : (Lburp/Zlba;Lburp/Zg09;Lburp/Zkg9;Lburp/Ztdi;Lburp/Zkf3;)Lburp/Zl2h;
    //   1444: astore #22
    //   1446: aload_0
    //   1447: aload #7
    //   1449: aload #9
    //   1451: aload_2
    //   1452: aload_1
    //   1453: getfield ZM : Lburp/Zb2y;
    //   1456: aload #12
    //   1458: aload #10
    //   1460: aload #13
    //   1462: aload #22
    //   1464: aload #8
    //   1466: aload #19
    //   1468: aload #20
    //   1470: invokeinterface Zk : ()Lburp/Zlli;
    //   1475: invokevirtual Zu : (Lburp/Zgna;Lburp/Zrbm;Lburp/Zm0l;Lburp/Zb2y;Lburp/Zg09;Lburp/Zkg9;Lburp/Zs79;Lburp/Zl2h;Lburp/Zto9;Lburp/Zskh;Lburp/Zlli;)Lburp/Ztj1;
    //   1478: areturn
    // Exception table:
    //   from	to	target	type
    //   57	81	84	java/lang/NumberFormatException
    //   293	312	312	java/lang/NumberFormatException
    //   331	360	360	java/lang/NumberFormatException
    //   369	398	398	java/lang/NumberFormatException
    //   407	440	440	java/lang/NumberFormatException
    //   512	527	527	java/lang/NumberFormatException
    //   759	772	775	java/lang/NumberFormatException
    //   764	785	785	java/lang/NumberFormatException
    //   829	843	843	java/lang/NumberFormatException
    //   915	934	934	java/lang/NumberFormatException
    //   1136	1155	1155	java/lang/NumberFormatException
    //   1174	1203	1203	java/lang/NumberFormatException
    //   1212	1241	1241	java/lang/NumberFormatException
    //   1250	1297	1297	java/lang/NumberFormatException
    //   1305	1317	1317	java/lang/NumberFormatException
    //   1341	1361	1364	java/lang/NumberFormatException
    //   1380	1407	1410	java/lang/NumberFormatException
  }
  
  private Zr5h Zf(Zkv4 paramZkv4, int paramInt, String paramString, Zlw paramZlw, Zb4g paramZb4g, Zl5o paramZl5o) {
    try {
      if (paramZkv4.Zj.ZO.equals(Zkcl.API_AUDIT))
        return this.Za.<Zr5h>ZH(new Zsue(paramInt, paramString, Zkcl.API_AUDIT.ZM(paramZkv4), Zkcl.API_AUDIT.Zx(paramZkv4), paramZlw.ZRE(), paramZb4g, paramZl5o)); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return this.Za.<Zr5h>ZH(new Zs21(paramInt, paramString, Zkcl.SCAN_AUDIT.ZM(paramZkv4), Zkcl.SCAN_AUDIT.Zx(paramZkv4), paramZlw.ZRE(), paramZb4g, paramZl5o));
  }
  
  private Zkkg ZM(Zkv4 paramZkv4) {
    Zkkg zkkg = Zkkg.Z_(this.Za);
    zkkg.Zd(this.ZS.ZD(new String[] { a(-18865, -2107) }));
    Objects.requireNonNull(zkkg);
    paramZkv4.ZK.ZU.stream().map(Zkbn::ZR).forEach(zkkg::Zd);
    return zkkg;
  }
  
  private Zzkp ZS(Zkv4 paramZkv4, Zkkg paramZkkg, int paramInt, Zskh paramZskh) {
    Zl34 zl341 = this.Za.<Zl34>ZH(new Ztwg(true));
    Zl34 zl342 = this.Za.<Zl34>ZH(new Ztwg(false));
    Zlor zlor = paramZkv4.Zj.Zj.Ze(zl341, zl342, this.Za);
    List<Zs7s> list = paramZkv4.ZI.ZQ;
    Zefg<Zs7s> zefg = Zkk.Zl(this.Za, Zs7s.Zx, list.size());
    zefg.addAll(list);
    List<Zko4> list1 = paramZkv4.ZI.ZF;
    Zefg<Zgpi> zefg1 = Zkk.Zl(this.Za, Zko4.ZS, list1.size());
    zefg1.addAll((Collection)list1);
    int i = ZD();
    Zr69 zr69 = Zkmg.Zn(paramZkkg, this.ZE, zlor, paramZskh, paramZkv4.ZY, i);
    boolean bool = paramZkv4.Zj.ZL;
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    Zl7h zl7h = this.Za.<Zl7h>ZH(new Zt61(paramInt, bool, zr69, paramZkkg, paramZkv4.Zj.Zp, paramZkv4.ZI.ZF, paramZkv4.ZI.ZQ, bool ? this.Za.<Zrim>ZH(new Zxb(new Zrim[] { this.Za.<Zrim>ZH(new Zrno()), this.Za.<Zrim>ZH(new Zei4()) }, )) : this.ZV.ZvT().Znv(), bool ? this.Za.<Zg4y>ZH(new Zxo2()) : this.ZV.ZvT().ZnS(), zl341, zl342, i, this.ZH.ZB()));
    zl7h.Zw(zr69);
    return new Zzkp(zl7h, zr69);
  }
  
  private Zlw Zc(Zkv4 paramZkv4, boolean paramBoolean) {
    Zx_7 zx_7 = Zx_7.ZM(this.Za);
    zx_7.Zd(this.ZS.ZD(new String[0]));
    Objects.requireNonNull(zx_7);
    paramZkv4.ZK.ZU.stream().map(Zkbn::ZR).forEach(zx_7::Zd);
    ZQ(zx_7.Zk());
    Zmj1 zmj1 = this.Za.<Zmj1>ZH(new Zmo1(paramZkv4.ZU.Zf()));
    Zz1i zz1i = this.Za.<Zz1i>ZH(new Zbuf(zx_7, zmj1));
    Zkq4 zkq4 = Zkq4.Zk(zz1i, paramBoolean);
    return new Zlw(zz1i, zkq4);
  }
  
  public static void ZQ(Zxz8 paramZxz8) {
    try {
      if (paramZxz8.ZmV()) {
        Objects.requireNonNull(paramZxz8);
        Zzu2.ZA().filter(Predicate.not(paramZxz8::ZE)).forEach(Zrfd::lambda$reportDisabledIssuesTelemetry$4);
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  private Ztj1 Zu(Zgna paramZgna, Zrbm paramZrbm, Zm0l paramZm0l, Zb2y paramZb2y, Zg09 paramZg09, Zkg9 paramZkg9, Zs79 paramZs79, Zl2h paramZl2h, Zto9 paramZto9, Zskh paramZskh, Zlli<Zt10> paramZlli) {
    this.ZV.Zv9().ZV_().add(paramZgna);
    return ZQ(paramZgna, paramZrbm, paramZm0l, paramZb2y, paramZg09, paramZkg9, paramZs79, paramZl2h, paramZto9, paramZskh, true, paramZlli);
  }
  
  private Ztj1 ZQ(Zgna paramZgna, Zrbm paramZrbm, Zm0l paramZm0l, Zb2y paramZb2y, Zg09 paramZg09, Zkg9 paramZkg9, Zs79 paramZs79, Zl2h paramZl2h, Zto9 paramZto9, Zskh paramZskh, boolean paramBoolean, Zlli<Zt10> paramZlli) {
    Zr5_ zr5_ = Zb(paramZb2y);
    Zx41 zx41 = new Zx41(paramZs79);
    Ztj1 ztj1 = this.Zd.ZN(Zb_6.Zb().Zp(paramZgna).ZW(paramZrbm).ZQ(zr5_).Zj(zx41).ZF(paramZto9).Zp(paramZskh));
    try {
      paramZm0l.ZI(ztj1, paramZgna, paramZskh, paramZrbm, paramZg09, paramZkg9, zx41, zx41.Zf(), paramZl2h, paramZlli, false);
      if (paramBoolean)
        try {
          if (this.ZV.Zv9().ZVR().ZuM() == Zmti.RUNNING)
            ztj1.Zq(); 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return ztj1;
  }
  
  public void Za(Zm0l paramZm0l) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZV : Lburp/Zzir;
    //   4: invokeinterface Zv9 : ()Lburp/Zz4b;
    //   9: invokeinterface ZV_ : ()Lburp/Zefg;
    //   14: astore_3
    //   15: invokestatic ZV : ()I
    //   18: aload_3
    //   19: invokeinterface Zz6 : ()Ljava/lang/Object;
    //   24: dup
    //   25: astore #4
    //   27: monitorenter
    //   28: istore_2
    //   29: aload_3
    //   30: invokeinterface iterator : ()Ljava/util/Iterator;
    //   35: astore #5
    //   37: aload #5
    //   39: invokeinterface hasNext : ()Z
    //   44: ifeq -> 76
    //   47: aload #5
    //   49: invokeinterface next : ()Ljava/lang/Object;
    //   54: checkcast burp/Zgna
    //   57: astore #6
    //   59: aload_0
    //   60: aload_1
    //   61: aload #6
    //   63: invokevirtual Zl : (Lburp/Zm0l;Lburp/Zgna;)V
    //   66: aload_0
    //   67: aload #6
    //   69: invokevirtual ZY : (Lburp/Zgna;)V
    //   72: iload_2
    //   73: ifne -> 37
    //   76: aload #4
    //   78: monitorexit
    //   79: goto -> 90
    //   82: astore #7
    //   84: aload #4
    //   86: monitorexit
    //   87: aload #7
    //   89: athrow
    //   90: return
    // Exception table:
    //   from	to	target	type
    //   29	79	82	finally
    //   82	87	82	finally
  }
  
  private void ZY(Zgna paramZgna) {
    int i = Zbiv.Zd();
    if (paramZgna instanceof Zzys) {
      Zzys zzys = (Zzys)paramZgna;
      try {
        zzys.ZNH().ZeF().ZvQ().stream().map(Zsmr::ZaP).filter(Zrfd::lambda$fireStartupTelemetryForPersistedTasks$5).forEach(Zrfd::lambda$fireStartupTelemetryForPersistedTasks$6);
        if (i != 0) {
          if (paramZgna instanceof Zr5h) {
            Zr5h zr5h = (Zr5h)paramZgna;
            zr5h.Zdm().ZHU().stream().map(Zsmr::ZaP).filter(Zrfd::lambda$fireStartupTelemetryForPersistedTasks$5).forEach(Zrfd::lambda$fireStartupTelemetryForPersistedTasks$8);
          } 
          return;
        } 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      return;
    } 
    if (paramZgna instanceof Zr5h) {
      Zr5h zr5h = (Zr5h)paramZgna;
      zr5h.Zdm().ZHU().stream().map(Zsmr::ZaP).filter(Zrfd::lambda$fireStartupTelemetryForPersistedTasks$5).forEach(Zrfd::lambda$fireStartupTelemetryForPersistedTasks$8);
    } 
  }
  
  public void Zc(Zm0l paramZm0l, Zgna paramZgna) {
    this.ZV.Zv9().ZV_().add(paramZgna);
    Zl(paramZm0l, paramZgna);
  }
  
  private void Zl(Zm0l paramZm0l, Zgna paramZgna) {
    // Byte code:
    //   0: new java/util/concurrent/atomic/AtomicReference
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: invokestatic ZV : ()I
    //   12: aconst_null
    //   13: astore #6
    //   15: istore_3
    //   16: aconst_null
    //   17: astore #7
    //   19: aconst_null
    //   20: astore #9
    //   22: aload_2
    //   23: invokeinterface ZPo : ()I
    //   28: istore #14
    //   30: aload_0
    //   31: getfield Zx : Lburp/Zskh;
    //   34: iload #14
    //   36: invokeinterface ZD : (I)Lburp/Zskh;
    //   41: getstatic burp/Zeew.SCANNER : Lburp/Zeew;
    //   44: invokeinterface ZQ : (Lburp/Zeew;)Lburp/Zskh;
    //   49: astore #15
    //   51: aload_2
    //   52: invokeinterface ZPw : ()Z
    //   57: ifne -> 68
    //   60: iconst_1
    //   61: goto -> 69
    //   64: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   67: athrow
    //   68: iconst_0
    //   69: istore #16
    //   71: aload_0
    //   72: getfield ZW : Lburp/Zxea;
    //   75: aload_2
    //   76: invokevirtual Zt : (Lburp/Zgna;)Lburp/Zto9;
    //   79: astore #17
    //   81: aload_0
    //   82: getfield ZC : Lburp/Ztdi;
    //   85: astore #18
    //   87: getstatic burp/Zshn.Zk : [I
    //   90: aload_2
    //   91: invokeinterface ZNs : ()Lburp/Zkcl;
    //   96: invokevirtual ordinal : ()I
    //   99: iaload
    //   100: tableswitch default -> 1563, 1 -> 156, 2 -> 461, 3 -> 461, 4 -> 646, 5 -> 646, 6 -> 1111, 7 -> 1284, 8 -> 1328, 9 -> 1328, 10 -> 1487
    //   156: aload_2
    //   157: checkcast burp/Zlog
    //   160: astore #19
    //   162: aload #19
    //   164: invokeinterface ZnH : ()Lburp/Zl7h;
    //   169: astore #20
    //   171: aload #20
    //   173: invokeinterface ZVk : ()V
    //   178: new burp/Zlz4
    //   181: dup
    //   182: aload #20
    //   184: invokespecial <init> : (Lburp/Zl7h;)V
    //   187: astore #11
    //   189: aload #11
    //   191: astore #10
    //   193: aload #20
    //   195: invokestatic Zv : (Lburp/Zl7h;)Lburp/Zkkg;
    //   198: astore #21
    //   200: new burp/Zlor
    //   203: dup
    //   204: aload #20
    //   206: invokeinterface ZVY : ()Lburp/Zl34;
    //   211: aload #20
    //   213: invokeinterface ZVE : ()Lburp/Zl34;
    //   218: aload_0
    //   219: getfield Zz : Lburp/Zr_4;
    //   222: aload_0
    //   223: getfield Za : Lburp/Zr_4;
    //   226: aload_0
    //   227: getfield ZH : Lburp/Zkl6;
    //   230: invokeinterface Zq : ()Lburp/Zr1j;
    //   235: invokespecial <init> : (Lburp/Zl34;Lburp/Zl34;Lburp/Zr_4;Lburp/Zr_4;Lburp/Zr1j;)V
    //   238: astore #22
    //   240: aload #21
    //   242: aload_0
    //   243: getfield ZE : Lnet/portswigger/Zsy;
    //   246: aload #22
    //   248: aload #15
    //   250: iconst_0
    //   251: aload #20
    //   253: invokeinterface ZVT : ()I
    //   258: invokestatic Zn : (Lburp/Zkkg;Lnet/portswigger/Zsy;Lburp/Zz28;Lburp/Zskh;ZI)Lburp/Zr69;
    //   261: astore #23
    //   263: new burp/Ztos
    //   266: dup
    //   267: invokestatic Zq : ()Lburp/Zt18;
    //   270: invokespecial <init> : (Lburp/Zt3y;)V
    //   273: astore #24
    //   275: aload #20
    //   277: invokeinterface ZVV : ()Z
    //   282: istore #25
    //   284: iload #25
    //   286: ifeq -> 307
    //   289: aload_0
    //   290: aload #20
    //   292: invokeinterface ZVX : ()Lburp/Zskz;
    //   297: invokevirtual ZK : (Lburp/Zskz;)Lburp/Ztdi;
    //   300: goto -> 311
    //   303: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   306: athrow
    //   307: aload_0
    //   308: getfield ZC : Lburp/Ztdi;
    //   311: astore #18
    //   313: aload #24
    //   315: <illegal opcode> Zk : (Lburp/Ztos;)Lburp/Ztuv;
    //   320: astore #26
    //   322: aload #23
    //   324: invokeinterface ZY : ()Z
    //   329: ifeq -> 352
    //   332: aload_0
    //   333: getfield ZA : Lburp/Zmvn;
    //   336: aload #18
    //   338: aload #26
    //   340: invokeinterface Zq : (Lburp/Ztdi;Lburp/Ztuv;)Lburp/Zzs1;
    //   345: goto -> 355
    //   348: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   351: athrow
    //   352: getstatic burp/Zel_.Za : Lburp/Zel_;
    //   355: astore #27
    //   357: iload #25
    //   359: ifeq -> 390
    //   362: new burp/Zzz2
    //   365: dup
    //   366: aload #18
    //   368: aload #20
    //   370: invokeinterface ZVU : ()Lburp/Zzg7;
    //   375: iconst_0
    //   376: aload_0
    //   377: getfield Za : Lburp/Zr_4;
    //   380: invokespecial <init> : (Lburp/Ztdi;Lburp/Zzg7;ZLburp/Zr_4;)V
    //   383: goto -> 393
    //   386: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   389: athrow
    //   390: getstatic burp/Zkf3.Zm : Lburp/Zkf3;
    //   393: astore #28
    //   395: aload_0
    //   396: getfield Z_ : Lburp/Zr3n;
    //   399: aload #19
    //   401: aload #23
    //   403: aload #11
    //   405: aload #15
    //   407: aload #17
    //   409: aload #24
    //   411: aload #18
    //   413: aload #27
    //   415: iload #25
    //   417: ifeq -> 429
    //   420: aload #28
    //   422: goto -> 433
    //   425: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   428: athrow
    //   429: aload_0
    //   430: getfield ZB : Lburp/Zkf3;
    //   433: invokevirtual Zp : (Lburp/Zlog;Lburp/Zr69;Lburp/Zlz4;Lburp/Zskh;Lburp/Ztos;Lburp/Ztos;Lburp/Ztdi;Lburp/Zzs1;Lburp/Zkf3;)Lburp/Zezo;
    //   436: astore #5
    //   438: aload_0
    //   439: getfield Zi : Lburp/Zgse;
    //   442: aload #6
    //   444: aload #7
    //   446: aload #9
    //   448: aload #18
    //   450: aload #28
    //   452: invokevirtual Zc : (Lburp/Zlba;Lburp/Zg09;Lburp/Zkg9;Lburp/Ztdi;Lburp/Zkf3;)Lburp/Zl2h;
    //   455: astore #13
    //   457: iload_3
    //   458: ifne -> 1584
    //   461: aload_2
    //   462: checkcast burp/Zr5h
    //   465: astore #19
    //   467: new burp/Zg09
    //   470: dup
    //   471: aload #19
    //   473: invokeinterface Zdm : ()Lburp/Zz1i;
    //   478: invokeinterface ZHU : ()Lburp/Zefg;
    //   483: invokespecial <init> : (Lburp/Zefg;)V
    //   486: astore #7
    //   488: aload #19
    //   490: invokeinterface Zdm : ()Lburp/Zz1i;
    //   495: iconst_0
    //   496: invokestatic Zk : (Lburp/Zz1i;Z)Lburp/Zkq4;
    //   499: astore #8
    //   501: aload_0
    //   502: getfield ZQ : Lburp/Zg41;
    //   505: aload #19
    //   507: invokeinterface Zdm : ()Lburp/Zz1i;
    //   512: aload #8
    //   514: aload #7
    //   516: aload #17
    //   518: invokevirtual Zy : (Lburp/Zz1i;Lburp/Zkq4;Lburp/Zg09;Lburp/Ztos;)Lburp/Zb9a;
    //   521: astore #6
    //   523: new burp/Zkg9
    //   526: dup
    //   527: invokespecial <init> : ()V
    //   530: astore #9
    //   532: new burp/Zrs8
    //   535: dup
    //   536: aload #19
    //   538: aload_0
    //   539: getfield ZZ : Lburp/Zg0s;
    //   542: invokespecial <init> : (Lburp/Zr5h;Lburp/Zg0s;)V
    //   545: astore #20
    //   547: new burp/Zgq5
    //   550: dup
    //   551: aload #20
    //   553: invokevirtual ZG : ()Lburp/Zefk;
    //   556: invokespecial <init> : (Lburp/Zefk;)V
    //   559: astore #12
    //   561: aload #12
    //   563: astore #10
    //   565: aload #19
    //   567: invokeinterface Zdm : ()Lburp/Zz1i;
    //   572: astore #21
    //   574: aload #21
    //   576: invokestatic Zv : (Lburp/Zz1i;)V
    //   579: aload_0
    //   580: getfield Z_ : Lburp/Zr3n;
    //   583: aload #19
    //   585: aload #6
    //   587: aload #8
    //   589: aload #9
    //   591: aload #12
    //   593: aload #17
    //   595: aload #15
    //   597: aload_0
    //   598: getfield ZC : Lburp/Ztdi;
    //   601: aload_0
    //   602: getfield ZA : Lburp/Zmvn;
    //   605: aload_0
    //   606: getfield ZC : Lburp/Ztdi;
    //   609: invokeinterface Zn : (Lburp/Ztdi;)Lburp/Zzs1;
    //   614: aload_0
    //   615: getfield Zn : Lburp/Znn;
    //   618: invokevirtual Zn : (Lburp/Zr5h;Lburp/Zb9a;Lburp/Zkq4;Lburp/Zkg9;Lburp/Zgq5;Lburp/Zto9;Lburp/Zskh;Lburp/Ztdi;Lburp/Zzs1;Lburp/Znn;)Lburp/Zriy;
    //   621: astore #5
    //   623: aload_0
    //   624: getfield Zi : Lburp/Zgse;
    //   627: aload #6
    //   629: aload #7
    //   631: aload #9
    //   633: aload #18
    //   635: getstatic burp/Zkf3.Zm : Lburp/Zkf3;
    //   638: invokevirtual Zc : (Lburp/Zlba;Lburp/Zg09;Lburp/Zkg9;Lburp/Ztdi;Lburp/Zkf3;)Lburp/Zl2h;
    //   641: astore #13
    //   643: goto -> 1584
    //   646: aload_2
    //   647: checkcast burp/Zzep
    //   650: astore #19
    //   652: new burp/Zg09
    //   655: dup
    //   656: aload #19
    //   658: invokeinterface Zdm : ()Lburp/Zz1i;
    //   663: invokeinterface ZHU : ()Lburp/Zefg;
    //   668: invokespecial <init> : (Lburp/Zefg;)V
    //   671: astore #7
    //   673: new burp/Zrs8
    //   676: dup
    //   677: aload #19
    //   679: aload_0
    //   680: getfield ZZ : Lburp/Zg0s;
    //   683: invokespecial <init> : (Lburp/Zr5h;Lburp/Zg0s;)V
    //   686: astore #20
    //   688: aload #19
    //   690: invokeinterface ZnH : ()Lburp/Zl7h;
    //   695: astore #21
    //   697: aload #21
    //   699: invokeinterface ZVk : ()V
    //   704: aload #19
    //   706: invokeinterface Zdm : ()Lburp/Zz1i;
    //   711: aload #21
    //   713: invokeinterface ZV6 : ()Lburp/Zrmh;
    //   718: invokeinterface Zzf : ()Z
    //   723: ifne -> 734
    //   726: iconst_1
    //   727: goto -> 735
    //   730: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   733: athrow
    //   734: iconst_0
    //   735: invokestatic Zk : (Lburp/Zz1i;Z)Lburp/Zkq4;
    //   738: astore #8
    //   740: aload_0
    //   741: getfield ZQ : Lburp/Zg41;
    //   744: aload #19
    //   746: invokeinterface Zdm : ()Lburp/Zz1i;
    //   751: aload #8
    //   753: aload #7
    //   755: aload #17
    //   757: invokevirtual Zy : (Lburp/Zz1i;Lburp/Zkq4;Lburp/Zg09;Lburp/Ztos;)Lburp/Zb9a;
    //   760: astore #6
    //   762: new burp/Zkg9
    //   765: dup
    //   766: invokespecial <init> : ()V
    //   769: astore #9
    //   771: new burp/Zlz4
    //   774: dup
    //   775: aload #21
    //   777: invokespecial <init> : (Lburp/Zl7h;)V
    //   780: astore #11
    //   782: new burp/Zgq5
    //   785: dup
    //   786: aload #20
    //   788: invokevirtual ZG : ()Lburp/Zefk;
    //   791: invokespecial <init> : (Lburp/Zefk;)V
    //   794: astore #12
    //   796: new burp/Zbz0
    //   799: dup
    //   800: aload #19
    //   802: aload #11
    //   804: aload #12
    //   806: invokespecial <init> : (Lburp/Zzep;Lburp/Zlz4;Lburp/Zgq5;)V
    //   809: astore #10
    //   811: aload #21
    //   813: invokestatic Zv : (Lburp/Zl7h;)Lburp/Zkkg;
    //   816: astore #22
    //   818: new burp/Zlor
    //   821: dup
    //   822: aload #21
    //   824: invokeinterface ZVY : ()Lburp/Zl34;
    //   829: aload #21
    //   831: invokeinterface ZVE : ()Lburp/Zl34;
    //   836: aload_0
    //   837: getfield Zz : Lburp/Zr_4;
    //   840: aload_0
    //   841: getfield Za : Lburp/Zr_4;
    //   844: aconst_null
    //   845: invokespecial <init> : (Lburp/Zl34;Lburp/Zl34;Lburp/Zr_4;Lburp/Zr_4;Lburp/Zr1j;)V
    //   848: astore #23
    //   850: aload #22
    //   852: aload_0
    //   853: getfield ZE : Lnet/portswigger/Zsy;
    //   856: aload #23
    //   858: aload #15
    //   860: iconst_0
    //   861: aload #21
    //   863: invokeinterface ZVT : ()I
    //   868: invokestatic Zn : (Lburp/Zkkg;Lnet/portswigger/Zsy;Lburp/Zz28;Lburp/Zskh;ZI)Lburp/Zr69;
    //   871: astore #24
    //   873: aload #19
    //   875: invokeinterface Zdm : ()Lburp/Zz1i;
    //   880: invokestatic Zv : (Lburp/Zz1i;)V
    //   883: new burp/Ztos
    //   886: dup
    //   887: invokestatic Zq : ()Lburp/Zt18;
    //   890: invokespecial <init> : (Lburp/Zt3y;)V
    //   893: astore #25
    //   895: aload #21
    //   897: invokeinterface ZVV : ()Z
    //   902: istore #26
    //   904: iload #26
    //   906: ifeq -> 927
    //   909: aload_0
    //   910: aload #21
    //   912: invokeinterface ZVX : ()Lburp/Zskz;
    //   917: invokevirtual ZK : (Lburp/Zskz;)Lburp/Ztdi;
    //   920: goto -> 931
    //   923: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   926: athrow
    //   927: aload_0
    //   928: getfield ZC : Lburp/Ztdi;
    //   931: astore #18
    //   933: aload #25
    //   935: <illegal opcode> Zk : (Lburp/Ztos;)Lburp/Ztuv;
    //   940: astore #27
    //   942: aload #24
    //   944: invokeinterface ZY : ()Z
    //   949: ifeq -> 972
    //   952: aload_0
    //   953: getfield ZA : Lburp/Zmvn;
    //   956: aload #18
    //   958: aload #27
    //   960: invokeinterface Zq : (Lburp/Ztdi;Lburp/Ztuv;)Lburp/Zzs1;
    //   965: goto -> 975
    //   968: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   971: athrow
    //   972: getstatic burp/Zel_.Za : Lburp/Zel_;
    //   975: astore #28
    //   977: iload #26
    //   979: ifeq -> 1010
    //   982: new burp/Zzz2
    //   985: dup
    //   986: aload #18
    //   988: aload #21
    //   990: invokeinterface ZVU : ()Lburp/Zzg7;
    //   995: iconst_0
    //   996: aload_0
    //   997: getfield Za : Lburp/Zr_4;
    //   1000: invokespecial <init> : (Lburp/Ztdi;Lburp/Zzg7;ZLburp/Zr_4;)V
    //   1003: goto -> 1013
    //   1006: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   1009: athrow
    //   1010: getstatic burp/Zkf3.Zm : Lburp/Zkf3;
    //   1013: astore #29
    //   1015: aload_0
    //   1016: getfield Z_ : Lburp/Zr3n;
    //   1019: aload #19
    //   1021: aload #24
    //   1023: aload #6
    //   1025: aload #8
    //   1027: aload #9
    //   1029: aload #11
    //   1031: aload #12
    //   1033: aload #17
    //   1035: aload #25
    //   1037: aload #15
    //   1039: aload #18
    //   1041: aload #28
    //   1043: iload #26
    //   1045: ifeq -> 1057
    //   1048: aload #29
    //   1050: goto -> 1061
    //   1053: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   1056: athrow
    //   1057: aload_0
    //   1058: getfield ZB : Lburp/Zkf3;
    //   1061: iload #26
    //   1063: ifeq -> 1080
    //   1066: new burp/Znn
    //   1069: dup
    //   1070: invokespecial <init> : ()V
    //   1073: goto -> 1084
    //   1076: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   1079: athrow
    //   1080: aload_0
    //   1081: getfield Zn : Lburp/Znn;
    //   1084: invokevirtual Zb : (Lburp/Zzep;Lburp/Zr69;Lburp/Zb9a;Lburp/Zkq4;Lburp/Zkg9;Lburp/Zlz4;Lburp/Zgq5;Lburp/Zto9;Lburp/Ztos;Lburp/Zskh;Lburp/Ztdi;Lburp/Zzs1;Lburp/Zkf3;Lburp/Znn;)Lburp/Zxn8;
    //   1087: astore #5
    //   1089: aload_0
    //   1090: getfield Zi : Lburp/Zgse;
    //   1093: aload #6
    //   1095: aload #7
    //   1097: aload #9
    //   1099: aload #18
    //   1101: aload #29
    //   1103: invokevirtual Zc : (Lburp/Zlba;Lburp/Zg09;Lburp/Zkg9;Lburp/Ztdi;Lburp/Zkf3;)Lburp/Zl2h;
    //   1106: astore #13
    //   1108: goto -> 1584
    //   1111: aload_2
    //   1112: checkcast burp/Ztr3
    //   1115: astore #19
    //   1117: new burp/Zg09
    //   1120: dup
    //   1121: aload #19
    //   1123: invokeinterface Zdm : ()Lburp/Zz1i;
    //   1128: invokeinterface ZHU : ()Lburp/Zefg;
    //   1133: invokespecial <init> : (Lburp/Zefg;)V
    //   1136: astore #7
    //   1138: aload #19
    //   1140: invokeinterface Zdm : ()Lburp/Zz1i;
    //   1145: iconst_0
    //   1146: invokestatic Zk : (Lburp/Zz1i;Z)Lburp/Zkq4;
    //   1149: astore #8
    //   1151: aload_0
    //   1152: getfield ZQ : Lburp/Zg41;
    //   1155: aload #19
    //   1157: invokeinterface Zdm : ()Lburp/Zz1i;
    //   1162: aload #8
    //   1164: aload #7
    //   1166: aload #17
    //   1168: invokevirtual Zy : (Lburp/Zz1i;Lburp/Zkq4;Lburp/Zg09;Lburp/Ztos;)Lburp/Zb9a;
    //   1171: astore #6
    //   1173: new burp/Zkg9
    //   1176: dup
    //   1177: invokespecial <init> : ()V
    //   1180: astore #9
    //   1182: new burp/Zgq5
    //   1185: dup
    //   1186: aload #19
    //   1188: invokeinterface Zdm : ()Lburp/Zz1i;
    //   1193: invokeinterface ZHD : ()Lburp/Zefk;
    //   1198: invokespecial <init> : (Lburp/Zefk;)V
    //   1201: astore #12
    //   1203: aload #12
    //   1205: astore #10
    //   1207: aload #19
    //   1209: invokeinterface Zdm : ()Lburp/Zz1i;
    //   1214: invokestatic Zv : (Lburp/Zz1i;)V
    //   1217: aload_0
    //   1218: getfield Z_ : Lburp/Zr3n;
    //   1221: aload #19
    //   1223: aload #6
    //   1225: aload #8
    //   1227: aload #9
    //   1229: aload #12
    //   1231: aload #17
    //   1233: aload #15
    //   1235: aload_0
    //   1236: getfield ZC : Lburp/Ztdi;
    //   1239: aload_0
    //   1240: getfield ZA : Lburp/Zmvn;
    //   1243: aload_0
    //   1244: getfield ZC : Lburp/Ztdi;
    //   1247: invokeinterface Zn : (Lburp/Ztdi;)Lburp/Zzs1;
    //   1252: aload_0
    //   1253: getfield Zn : Lburp/Znn;
    //   1256: invokevirtual Zq : (Lburp/Ztr3;Lburp/Zb9a;Lburp/Zkq4;Lburp/Zkg9;Lburp/Zgq5;Lburp/Zto9;Lburp/Zskh;Lburp/Ztdi;Lburp/Zzs1;Lburp/Znn;)Lburp/Zriy;
    //   1259: astore #5
    //   1261: aload_0
    //   1262: getfield Zi : Lburp/Zgse;
    //   1265: aload #6
    //   1267: aload #7
    //   1269: aload #9
    //   1271: aload #18
    //   1273: getstatic burp/Zkf3.Zm : Lburp/Zkf3;
    //   1276: invokevirtual Zc : (Lburp/Zlba;Lburp/Zg09;Lburp/Zkg9;Lburp/Ztdi;Lburp/Zkf3;)Lburp/Zl2h;
    //   1279: astore #13
    //   1281: goto -> 1584
    //   1284: aload_0
    //   1285: getfield Z_ : Lburp/Zr3n;
    //   1288: aload_2
    //   1289: checkcast burp/Ze9i
    //   1292: aload #17
    //   1294: invokevirtual Zc : (Lburp/Ze9i;Lburp/Ztos;)Lburp/Zbur;
    //   1297: astore #5
    //   1299: invokestatic ZB : ()Lburp/Zs79;
    //   1302: astore #10
    //   1304: aload_0
    //   1305: getfield Zi : Lburp/Zgse;
    //   1308: aload #6
    //   1310: aload #7
    //   1312: aload #9
    //   1314: aload #18
    //   1316: getstatic burp/Zkf3.Zm : Lburp/Zkf3;
    //   1319: invokevirtual Zc : (Lburp/Zlba;Lburp/Zg09;Lburp/Zkg9;Lburp/Ztdi;Lburp/Zkf3;)Lburp/Zl2h;
    //   1322: astore #13
    //   1324: iload_3
    //   1325: ifne -> 1584
    //   1328: aload_2
    //   1329: checkcast burp/Ztr3
    //   1332: astore #19
    //   1334: new burp/Zg09
    //   1337: dup
    //   1338: aload #19
    //   1340: invokeinterface Zdm : ()Lburp/Zz1i;
    //   1345: invokeinterface ZHU : ()Lburp/Zefg;
    //   1350: invokespecial <init> : (Lburp/Zefg;)V
    //   1353: astore #7
    //   1355: aload #19
    //   1357: invokeinterface Zdm : ()Lburp/Zz1i;
    //   1362: iconst_0
    //   1363: invokestatic Zk : (Lburp/Zz1i;Z)Lburp/Zkq4;
    //   1366: astore #8
    //   1368: aload_0
    //   1369: getfield ZQ : Lburp/Zg41;
    //   1372: aload #19
    //   1374: invokeinterface Zdm : ()Lburp/Zz1i;
    //   1379: aload #8
    //   1381: aload #7
    //   1383: aload #17
    //   1385: invokevirtual Zy : (Lburp/Zz1i;Lburp/Zkq4;Lburp/Zg09;Lburp/Ztos;)Lburp/Zb9a;
    //   1388: astore #6
    //   1390: new burp/Zkg9
    //   1393: dup
    //   1394: invokespecial <init> : ()V
    //   1397: astore #9
    //   1399: new burp/Zgq5
    //   1402: dup
    //   1403: aload #19
    //   1405: invokeinterface Zdm : ()Lburp/Zz1i;
    //   1410: invokeinterface ZHD : ()Lburp/Zefk;
    //   1415: invokespecial <init> : (Lburp/Zefk;)V
    //   1418: astore #12
    //   1420: aload #12
    //   1422: astore #10
    //   1424: aload_0
    //   1425: getfield Zi : Lburp/Zgse;
    //   1428: aload #6
    //   1430: aload #7
    //   1432: aload #9
    //   1434: aload #18
    //   1436: getstatic burp/Zkf3.Zm : Lburp/Zkf3;
    //   1439: invokevirtual Zc : (Lburp/Zlba;Lburp/Zg09;Lburp/Zkg9;Lburp/Ztdi;Lburp/Zkf3;)Lburp/Zl2h;
    //   1442: astore #13
    //   1444: aload_0
    //   1445: getfield Z_ : Lburp/Zr3n;
    //   1448: aload_2
    //   1449: checkcast burp/Ztr3
    //   1452: aload #8
    //   1454: aload #12
    //   1456: aload #17
    //   1458: aload #15
    //   1460: aload #18
    //   1462: aload_0
    //   1463: getfield ZA : Lburp/Zmvn;
    //   1466: aload #18
    //   1468: invokeinterface Zn : (Lburp/Ztdi;)Lburp/Zzs1;
    //   1473: aload #7
    //   1475: aload_0
    //   1476: getfield Zn : Lburp/Znn;
    //   1479: invokevirtual ZW : (Lburp/Ztr3;Lburp/Zkq4;Lburp/Zgq5;Lburp/Zto9;Lburp/Zskh;Lburp/Ztdi;Lburp/Zzs1;Lburp/Zg09;Lburp/Znn;)Lburp/Zriy;
    //   1482: astore #5
    //   1484: goto -> 1584
    //   1487: aload_0
    //   1488: aload_2
    //   1489: checkcast burp/Zzys
    //   1492: aload #4
    //   1494: dup
    //   1495: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1498: pop
    //   1499: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   1504: aload #17
    //   1506: invokevirtual Za : (Lburp/Zzys;Ljava/util/function/Supplier;Lburp/Zto9;)Ljava/util/Optional;
    //   1509: astore #19
    //   1511: aload #19
    //   1513: invokevirtual isPresent : ()Z
    //   1516: ifeq -> 1554
    //   1519: aload #19
    //   1521: invokevirtual get : ()Ljava/lang/Object;
    //   1524: checkcast burp/Zls4
    //   1527: astore #20
    //   1529: aload #20
    //   1531: invokevirtual Zc : ()Lburp/Zegh;
    //   1534: astore #5
    //   1536: aload #20
    //   1538: invokevirtual ZT : ()Lburp/Zb_x;
    //   1541: astore #10
    //   1543: aload #20
    //   1545: invokevirtual Zh : ()Lburp/Zl2h;
    //   1548: astore #13
    //   1550: iload_3
    //   1551: ifne -> 1559
    //   1554: return
    //   1555: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   1558: athrow
    //   1559: iload_3
    //   1560: ifne -> 1584
    //   1563: iconst_0
    //   1564: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   1567: aload_2
    //   1568: invokeinterface ZNs : ()Lburp/Zkcl;
    //   1573: invokevirtual toString : ()Ljava/lang/String;
    //   1576: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   1579: return
    //   1580: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   1583: athrow
    //   1584: aload_0
    //   1585: getfield ZN : Lburp/Zzkr;
    //   1588: aload_2
    //   1589: invokeinterface ZPm : ()I
    //   1594: invokevirtual ZZ : (I)Lburp/Zr5_;
    //   1597: astore #19
    //   1599: new burp/Zx41
    //   1602: dup
    //   1603: aload #10
    //   1605: invokespecial <init> : (Lburp/Zs79;)V
    //   1608: astore #20
    //   1610: aload_0
    //   1611: getfield Zd : Lburp/Zrag;
    //   1614: invokestatic Zb : ()Lburp/Zb_6;
    //   1617: aload_2
    //   1618: invokevirtual Zp : (Lburp/Zgna;)Lburp/Zb_6;
    //   1621: aload #5
    //   1623: invokevirtual ZW : (Lburp/Zrbm;)Lburp/Zb_6;
    //   1626: aload #19
    //   1628: invokevirtual ZQ : (Lburp/Zr5_;)Lburp/Zb_6;
    //   1631: aload #20
    //   1633: invokevirtual Zj : (Lburp/Zr4u;)Lburp/Zb_6;
    //   1636: aload #17
    //   1638: invokevirtual ZF : (Lburp/Zto9;)Lburp/Zb_6;
    //   1641: aload #15
    //   1643: invokevirtual Zp : (Lburp/Zskh;)Lburp/Zb_6;
    //   1646: invokevirtual ZN : (Lburp/Zb_6;)Lburp/Ztj1;
    //   1649: astore #21
    //   1651: aload #4
    //   1653: aload #21
    //   1655: invokevirtual set : (Ljava/lang/Object;)V
    //   1658: aload_1
    //   1659: aload #21
    //   1661: aload_2
    //   1662: aload #15
    //   1664: aload #5
    //   1666: aload #7
    //   1668: aload #9
    //   1670: aload #20
    //   1672: aload #20
    //   1674: invokevirtual Zf : ()Lburp/Zlli;
    //   1677: aload #13
    //   1679: aload #18
    //   1681: invokeinterface Zk : ()Lburp/Zlli;
    //   1686: iconst_1
    //   1687: invokeinterface ZI : (Lburp/Ztj1;Lburp/Zgna;Lburp/Zskh;Lburp/Zrbm;Lburp/Zg09;Lburp/Zkg9;Ljava/util/function/Supplier;Lburp/Zlli;Lburp/Zl2h;Lburp/Zlli;Z)V
    //   1692: iload #16
    //   1694: ifeq -> 1709
    //   1697: aload #21
    //   1699: invokevirtual Zq : ()V
    //   1702: goto -> 1709
    //   1705: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   1708: athrow
    //   1709: aload #5
    //   1711: invokeinterface ZW : ()V
    //   1716: return
    // Exception table:
    //   from	to	target	type
    //   51	64	64	java/lang/NumberFormatException
    //   284	303	303	java/lang/NumberFormatException
    //   322	348	348	java/lang/NumberFormatException
    //   357	386	386	java/lang/NumberFormatException
    //   395	425	425	java/lang/NumberFormatException
    //   697	730	730	java/lang/NumberFormatException
    //   904	923	923	java/lang/NumberFormatException
    //   942	968	968	java/lang/NumberFormatException
    //   977	1006	1006	java/lang/NumberFormatException
    //   1015	1053	1053	java/lang/NumberFormatException
    //   1061	1076	1076	java/lang/NumberFormatException
    //   1550	1555	1555	java/lang/NumberFormatException
    //   1559	1580	1580	java/lang/NumberFormatException
    //   1651	1702	1705	java/lang/NumberFormatException
  }
  
  private Ztdi ZK(Zskz paramZskz) {
    return this.Zh.ZS(paramZskz);
  }
  
  private Optional<Zls4> Za(Zzys paramZzys, Supplier<Ztj1> paramSupplier, Zto9 paramZto9) {
    try {
      Zlvv zlvv = this.Zo.ZM(paramZzys, paramSupplier, paramZto9);
      Zls4 zls4 = new Zls4(zlvv.Zi(), zlvv.ZR(), zlvv.Ze());
      return Optional.of(zls4);
    } catch (Exception exception) {
      Zah.ZU(exception, a(-18871, 30490), Zk_.UNEXPECTED);
      this.Zx.ZS(exception, String.format(a(-18872, 20372), new Object[] { paramZzys.ZPK() }));
      return Optional.empty();
    } 
  }
  
  private void Zr(Zm0l paramZm0l, Zr_4 paramZr_4) {
    Zgin zgin = new Zgin(Zkcl.LIVE_PASSIVE_CRAWL, true, false, false, Zmet.EVERYTHING, null, false);
    Zqu zqu = paramZr_4.<Zqu>ZH(new Zgz8());
    zqu.ZJ(true);
    zqu.Za(true);
    zqu.ZW(true);
    zqu.ZN(true);
    zqu.ZN(Zmet.SUITE);
    Zzkm zzkm = new Zzkm();
    zqu.Zl(zzkm);
    Zb8b zb8b = new Zb8b(a(-18866, -359), false, zzkm, new Zmln[] { Zmln.LIVE_PASSIVE_CRAWLING });
    Zgyw zgyw = new Zgyw(Collections.singletonList(zb8b));
    Zru5 zru5 = new Zru5(zgin, zgyw, Zb2y.ZX());
    Zp(zru5, paramZm0l);
  }
  
  public void ZR(Zz8a paramZz8a, Zm0l paramZm0l, Zr_4 paramZr_4) {
    Zr(paramZm0l, paramZr_4);
    ZN(paramZz8a, paramZm0l);
  }
  
  public void Zp(Zru5 paramZru5, Zm0l paramZm0l) {
    // Byte code:
    //   0: aload_1
    //   1: getfield ZA : Lburp/Zgin;
    //   4: getfield ZJ : Lburp/Zkcl;
    //   7: astore #5
    //   9: invokestatic Zd : ()I
    //   12: new burp/Zkg9
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: astore #6
    //   21: aconst_null
    //   22: astore #9
    //   24: istore_3
    //   25: aconst_null
    //   26: astore #10
    //   28: aload_0
    //   29: getfield Zf : Lburp/Zxwj;
    //   32: invokeinterface ZL : ()I
    //   37: istore #14
    //   39: aload_0
    //   40: getfield Zx : Lburp/Zskh;
    //   43: iload #14
    //   45: invokeinterface ZD : (I)Lburp/Zskh;
    //   50: getstatic burp/Zeew.SCANNER : Lburp/Zeew;
    //   53: invokeinterface ZQ : (Lburp/Zeew;)Lburp/Zskh;
    //   58: astore #15
    //   60: getstatic burp/Zshn.Zk : [I
    //   63: aload #5
    //   65: invokevirtual ordinal : ()I
    //   68: iaload
    //   69: tableswitch default -> 982, 6 -> 100, 7 -> 442, 8 -> 634, 9 -> 634
    //   100: aload_0
    //   101: aload_1
    //   102: invokevirtual Zf : (Lburp/Zru5;)Lburp/Zrdd;
    //   105: astore #16
    //   107: aload_0
    //   108: getfield Za : Lburp/Zr_4;
    //   111: invokestatic ZM : (Lburp/Zr_4;)Lburp/Zx_7;
    //   114: astore #17
    //   116: aload #17
    //   118: aload_0
    //   119: getfield ZS : Lburp/Zs4c;
    //   122: iconst_0
    //   123: anewarray java/lang/String
    //   126: invokevirtual ZD : ([Ljava/lang/String;)Lburp/Zmf_;
    //   129: invokevirtual Zd : (Lburp/Zmf_;)V
    //   132: aload_1
    //   133: getfield Zf : Lburp/Zgyw;
    //   136: getfield ZU : Ljava/util/List;
    //   139: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   144: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   149: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   154: aload #17
    //   156: dup
    //   157: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   160: pop
    //   161: <illegal opcode> accept : (Lburp/Zx_7;)Ljava/util/function/Consumer;
    //   166: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   171: aload_0
    //   172: getfield Za : Lburp/Zr_4;
    //   175: new burp/Zmo1
    //   178: dup
    //   179: getstatic burp/Zz5.ZO : Lburp/Zz5;
    //   182: invokevirtual Zf : ()Lburp/Ztmd;
    //   185: invokespecial <init> : (Lburp/Ztmd;)V
    //   188: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   193: checkcast burp/Zmj1
    //   196: astore #18
    //   198: aload_0
    //   199: getfield Za : Lburp/Zr_4;
    //   202: new burp/Zbuf
    //   205: dup
    //   206: aload #17
    //   208: aload #18
    //   210: invokespecial <init> : (Lburp/Zx_7;Lburp/Zmj1;)V
    //   213: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   218: checkcast burp/Zz1i
    //   221: astore #19
    //   223: aload_0
    //   224: getfield Za : Lburp/Zr_4;
    //   227: new burp/Zgwv
    //   230: dup
    //   231: iload #14
    //   233: invokestatic Zo : ()Ljava/lang/String;
    //   236: getstatic burp/Zkcl.LIVE_AUDIT : Lburp/Zkcl;
    //   239: aload_1
    //   240: invokevirtual ZN : (Lburp/Zru5;)Ljava/lang/String;
    //   243: getstatic burp/Zkcl.LIVE_AUDIT : Lburp/Zkcl;
    //   246: aload_1
    //   247: invokevirtual ZE : (Lburp/Zru5;)Ljava/lang/String;
    //   250: aload #19
    //   252: aload_1
    //   253: getfield ZA : Lburp/Zgin;
    //   256: aload #16
    //   258: invokevirtual ZNm : ()Lburp/Zl34;
    //   261: aload #16
    //   263: invokevirtual ZN1 : ()Lburp/Zl34;
    //   266: invokespecial <init> : (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lburp/Zz1i;Lburp/Zgin;Lburp/Zl34;Lburp/Zl34;)V
    //   269: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   274: checkcast burp/Ztr3
    //   277: astore #20
    //   279: aload_0
    //   280: getfield ZW : Lburp/Zxea;
    //   283: aload #20
    //   285: invokevirtual Zt : (Lburp/Zgna;)Lburp/Zto9;
    //   288: astore #8
    //   290: aload #20
    //   292: invokeinterface Zd5 : ()Lburp/Zb4g;
    //   297: aload_0
    //   298: getfield ZS : Lburp/Zs4c;
    //   301: invokestatic ZF : (Lburp/Zb4g;Lburp/Zs4c;)V
    //   304: new burp/Zgq5
    //   307: dup
    //   308: aload #20
    //   310: invokeinterface Zdm : ()Lburp/Zz1i;
    //   315: invokeinterface ZHD : ()Lburp/Zefk;
    //   320: invokespecial <init> : (Lburp/Zefk;)V
    //   323: astore #13
    //   325: new burp/Zg09
    //   328: dup
    //   329: aload #20
    //   331: invokeinterface Zdm : ()Lburp/Zz1i;
    //   336: invokeinterface ZHU : ()Lburp/Zefg;
    //   341: invokespecial <init> : (Lburp/Zefg;)V
    //   344: astore #10
    //   346: aload #20
    //   348: invokeinterface Zdm : ()Lburp/Zz1i;
    //   353: iconst_0
    //   354: invokestatic Zk : (Lburp/Zz1i;Z)Lburp/Zkq4;
    //   357: astore #11
    //   359: aload_0
    //   360: getfield ZQ : Lburp/Zg41;
    //   363: aload #20
    //   365: invokeinterface Zdm : ()Lburp/Zz1i;
    //   370: aload #11
    //   372: aload #10
    //   374: aload #8
    //   376: invokevirtual Zy : (Lburp/Zz1i;Lburp/Zkq4;Lburp/Zg09;Lburp/Ztos;)Lburp/Zb9a;
    //   379: astore #9
    //   381: aload_0
    //   382: getfield Zc : Lburp/Zz5p;
    //   385: aload #20
    //   387: aload #9
    //   389: aload #11
    //   391: aload #6
    //   393: aload #13
    //   395: aload #8
    //   397: aload #15
    //   399: aload_0
    //   400: getfield ZC : Lburp/Ztdi;
    //   403: aload_0
    //   404: getfield Zn : Lburp/Znn;
    //   407: aload_0
    //   408: getfield ZA : Lburp/Zmvn;
    //   411: aload_0
    //   412: getfield ZC : Lburp/Ztdi;
    //   415: invokeinterface Zn : (Lburp/Ztdi;)Lburp/Zzs1;
    //   420: aload_0
    //   421: <illegal opcode> ZU : (Lburp/Zrfd;)Lburp/Zsv0;
    //   426: invokevirtual Zj : (Lburp/Ztr3;Lburp/Zb9a;Lburp/Zkq4;Lburp/Zkg9;Lburp/Zgq5;Lburp/Zto9;Lburp/Zskh;Lburp/Ztdi;Lburp/Znn;Lburp/Zzs1;Lburp/Zsv0;)Lburp/Zriy;
    //   429: astore #4
    //   431: aload #20
    //   433: astore #7
    //   435: aload #13
    //   437: astore #12
    //   439: goto -> 1001
    //   442: aload_0
    //   443: getfield Za : Lburp/Zr_4;
    //   446: new burp/Ze2i
    //   449: dup
    //   450: invokespecial <init> : ()V
    //   453: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   458: checkcast burp/Zs98
    //   461: astore #16
    //   463: aload #16
    //   465: invokeinterface ZCE : ()Lburp/Zqu;
    //   470: astore #17
    //   472: aload #17
    //   474: aload_0
    //   475: getfield ZS : Lburp/Zs4c;
    //   478: iconst_0
    //   479: anewarray java/lang/String
    //   482: invokevirtual ZD : ([Ljava/lang/String;)Lburp/Zmf_;
    //   485: invokeinterface Zd : (Lburp/Zmf_;)V
    //   490: aload_1
    //   491: getfield Zf : Lburp/Zgyw;
    //   494: getfield ZU : Ljava/util/List;
    //   497: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   502: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   507: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   512: aload #16
    //   514: invokeinterface ZCE : ()Lburp/Zqu;
    //   519: dup
    //   520: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   523: pop
    //   524: <illegal opcode> accept : (Lburp/Zqu;)Ljava/util/function/Consumer;
    //   529: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   534: aload_0
    //   535: aload_1
    //   536: invokevirtual Zf : (Lburp/Zru5;)Lburp/Zrdd;
    //   539: astore #18
    //   541: aload_0
    //   542: getfield Za : Lburp/Zr_4;
    //   545: new burp/Zgw1
    //   548: dup
    //   549: iload #14
    //   551: invokestatic Zo : ()Ljava/lang/String;
    //   554: getstatic burp/Zkcl.LIVE_PASSIVE_CRAWL : Lburp/Zkcl;
    //   557: aload_1
    //   558: invokevirtual ZN : (Lburp/Zru5;)Ljava/lang/String;
    //   561: getstatic burp/Zkcl.LIVE_PASSIVE_CRAWL : Lburp/Zkcl;
    //   564: aload_1
    //   565: invokevirtual ZE : (Lburp/Zru5;)Ljava/lang/String;
    //   568: aload #16
    //   570: aload_1
    //   571: getfield ZA : Lburp/Zgin;
    //   574: aload #18
    //   576: invokevirtual ZNm : ()Lburp/Zl34;
    //   579: aload #18
    //   581: invokevirtual ZN1 : ()Lburp/Zl34;
    //   584: invokespecial <init> : (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lburp/Zs98;Lburp/Zgin;Lburp/Zl34;Lburp/Zl34;)V
    //   587: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   592: checkcast burp/Ze9i
    //   595: astore #19
    //   597: aload_0
    //   598: getfield ZW : Lburp/Zxea;
    //   601: aload #19
    //   603: invokevirtual Zt : (Lburp/Zgna;)Lburp/Zto9;
    //   606: astore #8
    //   608: aload_0
    //   609: getfield Zc : Lburp/Zz5p;
    //   612: aload #19
    //   614: aload #8
    //   616: invokevirtual Zu : (Lburp/Ze9i;Lburp/Ztos;)Lburp/Zbur;
    //   619: astore #4
    //   621: aload #19
    //   623: astore #7
    //   625: invokestatic ZB : ()Lburp/Zs79;
    //   628: astore #12
    //   630: iload_3
    //   631: ifeq -> 1001
    //   634: aload_0
    //   635: aload_1
    //   636: invokevirtual Zf : (Lburp/Zru5;)Lburp/Zrdd;
    //   639: astore #16
    //   641: aload_0
    //   642: getfield Za : Lburp/Zr_4;
    //   645: invokestatic ZM : (Lburp/Zr_4;)Lburp/Zx_7;
    //   648: astore #17
    //   650: aload #17
    //   652: aload_0
    //   653: getfield ZS : Lburp/Zs4c;
    //   656: iconst_0
    //   657: anewarray java/lang/String
    //   660: invokevirtual ZD : ([Ljava/lang/String;)Lburp/Zmf_;
    //   663: invokevirtual Zd : (Lburp/Zmf_;)V
    //   666: aload_1
    //   667: getfield Zf : Lburp/Zgyw;
    //   670: getfield ZU : Ljava/util/List;
    //   673: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   678: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   683: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   688: aload #17
    //   690: dup
    //   691: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   694: pop
    //   695: <illegal opcode> accept : (Lburp/Zx_7;)Ljava/util/function/Consumer;
    //   700: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   705: aload_0
    //   706: getfield Za : Lburp/Zr_4;
    //   709: new burp/Zmo1
    //   712: dup
    //   713: getstatic burp/Zz5.ZO : Lburp/Zz5;
    //   716: invokevirtual Zf : ()Lburp/Ztmd;
    //   719: invokespecial <init> : (Lburp/Ztmd;)V
    //   722: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   727: checkcast burp/Zmj1
    //   730: astore #18
    //   732: aload_0
    //   733: getfield Za : Lburp/Zr_4;
    //   736: new burp/Zbuf
    //   739: dup
    //   740: aload #17
    //   742: aload #18
    //   744: invokespecial <init> : (Lburp/Zx_7;Lburp/Zmj1;)V
    //   747: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   752: checkcast burp/Zz1i
    //   755: astore #19
    //   757: aload_0
    //   758: getfield Za : Lburp/Zr_4;
    //   761: new burp/Zgwv
    //   764: dup
    //   765: iload #14
    //   767: invokestatic Zo : ()Ljava/lang/String;
    //   770: ldc ''
    //   772: ldc ''
    //   774: aload #19
    //   776: aload_1
    //   777: getfield ZA : Lburp/Zgin;
    //   780: aload #16
    //   782: invokevirtual ZNm : ()Lburp/Zl34;
    //   785: aload #16
    //   787: invokevirtual ZN1 : ()Lburp/Zl34;
    //   790: invokespecial <init> : (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lburp/Zz1i;Lburp/Zgin;Lburp/Zl34;Lburp/Zl34;)V
    //   793: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   798: checkcast burp/Ztr3
    //   801: astore #20
    //   803: aload_0
    //   804: getfield ZW : Lburp/Zxea;
    //   807: aload #20
    //   809: invokevirtual Zt : (Lburp/Zgna;)Lburp/Zto9;
    //   812: astore #8
    //   814: aload #20
    //   816: invokeinterface Zd5 : ()Lburp/Zb4g;
    //   821: aload_0
    //   822: getfield ZS : Lburp/Zs4c;
    //   825: invokestatic ZF : (Lburp/Zb4g;Lburp/Zs4c;)V
    //   828: new burp/Zgq5
    //   831: dup
    //   832: aload #20
    //   834: invokeinterface Zdm : ()Lburp/Zz1i;
    //   839: invokeinterface ZHD : ()Lburp/Zefk;
    //   844: invokespecial <init> : (Lburp/Zefk;)V
    //   847: astore #13
    //   849: new burp/Zg09
    //   852: dup
    //   853: aload #20
    //   855: invokeinterface Zdm : ()Lburp/Zz1i;
    //   860: invokeinterface ZHU : ()Lburp/Zefg;
    //   865: invokespecial <init> : (Lburp/Zefg;)V
    //   868: astore #10
    //   870: aload #20
    //   872: invokeinterface Zdm : ()Lburp/Zz1i;
    //   877: aload #5
    //   879: aload_0
    //   880: getfield ZS : Lburp/Zs4c;
    //   883: invokestatic Zc : (Lburp/Zz1i;Lburp/Zkcl;Lburp/Zs4c;)V
    //   886: aload #20
    //   888: invokeinterface Zdm : ()Lburp/Zz1i;
    //   893: iconst_0
    //   894: invokestatic Zk : (Lburp/Zz1i;Z)Lburp/Zkq4;
    //   897: astore #11
    //   899: aload_0
    //   900: getfield ZQ : Lburp/Zg41;
    //   903: aload #20
    //   905: invokeinterface Zdm : ()Lburp/Zz1i;
    //   910: aload #11
    //   912: aload #10
    //   914: aload #8
    //   916: invokevirtual Zy : (Lburp/Zz1i;Lburp/Zkq4;Lburp/Zg09;Lburp/Ztos;)Lburp/Zb9a;
    //   919: astore #9
    //   921: aload_0
    //   922: getfield Zc : Lburp/Zz5p;
    //   925: aload #20
    //   927: aload #9
    //   929: aload #6
    //   931: aload #11
    //   933: aload #13
    //   935: aload #8
    //   937: aload #15
    //   939: aload_0
    //   940: getfield ZC : Lburp/Ztdi;
    //   943: aload_0
    //   944: getfield Zn : Lburp/Znn;
    //   947: aload_0
    //   948: getfield ZA : Lburp/Zmvn;
    //   951: aload_0
    //   952: getfield ZC : Lburp/Ztdi;
    //   955: invokeinterface Zn : (Lburp/Ztdi;)Lburp/Zzs1;
    //   960: aload_0
    //   961: <illegal opcode> ZU : (Lburp/Zrfd;)Lburp/Zsv0;
    //   966: invokevirtual Zt : (Lburp/Ztr3;Lburp/Zb9a;Lburp/Zkg9;Lburp/Zkq4;Lburp/Zgq5;Lburp/Zto9;Lburp/Zskh;Lburp/Ztdi;Lburp/Znn;Lburp/Zzs1;Lburp/Zsv0;)Lburp/Zriy;
    //   969: astore #4
    //   971: aload #20
    //   973: astore #7
    //   975: aload #13
    //   977: astore #12
    //   979: goto -> 1001
    //   982: iconst_0
    //   983: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   986: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   989: aconst_null
    //   990: astore #4
    //   992: aconst_null
    //   993: astore #7
    //   995: aconst_null
    //   996: astore #8
    //   998: aconst_null
    //   999: astore #12
    //   1001: aload_0
    //   1002: aload #7
    //   1004: aload #4
    //   1006: aload_2
    //   1007: aload_1
    //   1008: getfield ZM : Lburp/Zb2y;
    //   1011: aload #10
    //   1013: aload #6
    //   1015: aload #12
    //   1017: aload_0
    //   1018: getfield Zi : Lburp/Zgse;
    //   1021: aload #9
    //   1023: aload #10
    //   1025: aload #6
    //   1027: aload_0
    //   1028: getfield ZC : Lburp/Ztdi;
    //   1031: getstatic burp/Zkf3.Zm : Lburp/Zkf3;
    //   1034: invokevirtual Zc : (Lburp/Zlba;Lburp/Zg09;Lburp/Zkg9;Lburp/Ztdi;Lburp/Zkf3;)Lburp/Zl2h;
    //   1037: aload #8
    //   1039: aload #15
    //   1041: aload_0
    //   1042: getfield ZC : Lburp/Ztdi;
    //   1045: invokeinterface Zk : ()Lburp/Zlli;
    //   1050: invokevirtual Zu : (Lburp/Zgna;Lburp/Zrbm;Lburp/Zm0l;Lburp/Zb2y;Lburp/Zg09;Lburp/Zkg9;Lburp/Zs79;Lburp/Zl2h;Lburp/Zto9;Lburp/Zskh;Lburp/Zlli;)Lburp/Ztj1;
    //   1053: pop
    //   1054: return
  }
  
  private Zrdd Zf(Zru5 paramZru5) {
    Zl34 zl341 = this.Za.<Zl34>ZH(new Ztwg(true));
    Zl34 zl342 = this.Za.<Zl34>ZH(new Ztwg(false));
    try {
      if (paramZru5.ZA.ZI == Zmet.CUSTOM)
        paramZru5.ZA.ZS.ZO(zl341, zl342, this.Za); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return new Zrdd(zl341, zl342);
  }
  
  private void ZN(Zz8a paramZz8a, Zm0l paramZm0l) {
    Zgin zgin = new Zgin(Zkcl.LIVE_AUDIT, true, false, false, Zmet.EVERYTHING, null, true);
    Optional<Zrve> optional = paramZz8a.Zt(a(-18867, -15884));
    try {
      if (optional.isEmpty()) {
        Zuh.Zb(false, Zqf.Zr);
        return;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    Zgyw zgyw = new Zgyw(Collections.singletonList(optional.get()));
    Zru5 zru5 = new Zru5(zgin, zgyw, Zb2y.ZX());
    Zp(zru5, paramZm0l);
  }
  
  public Zr5_ Zb(Zb2y paramZb2y) {
    Optional<Integer> optional = paramZb2y.ZC();
    try {
      if (optional.isPresent())
        return this.ZN.ZZ(((Integer)optional.get()).intValue()); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    Ztau ztau = new Ztau(paramZb2y.ZA().get());
    return this.ZN.Ze(ztau, new Zs3t(ztau));
  }
  
  public static int ZD() {
    String str = Zgkt.Zj();
    try {
      if (a(-18868, 4417).equals(str))
        return Integer.MAX_VALUE; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      return Integer.parseInt(str);
    } catch (NumberFormatException numberFormatException) {
      Zah.ZU(numberFormatException, str, Zk_.UNEXPECTED);
      return -1;
    } 
  }
  
  private static void Zv(Zz1i paramZz1i) {
    paramZz1i.ZHU().forEach(paramZz1i::lambda$resetRunningActiveScanQueueItems$14);
  }
  
  private static void lambda$resetRunningActiveScanQueueItems$14(Zz1i paramZz1i, Zbza paramZbza) {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/util/List
    //   4: dup
    //   5: iconst_0
    //   6: getstatic burp/Zl5x.ZX : Ljava/util/List;
    //   9: aastore
    //   10: dup
    //   11: iconst_1
    //   12: getstatic burp/Zl5x.ZI : Ljava/util/List;
    //   15: aastore
    //   16: invokestatic of : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   19: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   24: invokeinterface flatMap : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   29: aload_1
    //   30: aload_0
    //   31: <illegal opcode> accept : (Lburp/Zbza;Lburp/Zz1i;)Ljava/util/function/Consumer;
    //   36: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   41: return
  }
  
  private static void lambda$resetRunningActiveScanQueueItems$13(Zbza paramZbza, Zz1i paramZz1i, Enum paramEnum) {
    try {
      if (paramZbza.ZW((Zl5x)paramEnum).ZW()) {
        try {
        
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        paramZbza.Zu((Zl5x)paramEnum, (paramZz1i.Zd((Zl5x)paramEnum) == 0L) ? Zlby.UNINITIALIZED : Zlby.UNINITIALIZED_WITH_ERROR);
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  private static void lambda$fireStartupTelemetryForPersistedTasks$8(Byte paramByte) {
    Zm2.Zi(Zv8r.SCANNER_SCAN_QUEUE_HIGHLIGHT, paramByte.byteValue());
  }
  
  private static void lambda$fireStartupTelemetryForPersistedTasks$6(Byte paramByte) {
    Zm2.Zi(Zv8r.INTRUDER_ATTACK_RESULTS_HIGHLIGHT, paramByte.byteValue());
  }
  
  private static boolean lambda$fireStartupTelemetryForPersistedTasks$5(Byte paramByte) {
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return (paramByte.byteValue() != Zmtd.NONE.index);
  }
  
  private static void lambda$reportDisabledIssuesTelemetry$4(Zzu2 paramZzu2) {
    Zm2.ZB(Zec3.SCANNER_ISSUE_TYPE_DISABLED, paramZzu2.name());
  }
  
  private Zbza lambda$launchScanTask$2(Zlw paramZlw, Zkv4 paramZkv4, Zll9 paramZll9) {
    return this.ZU.ZL(paramZlw.ZRi(), paramZll9, paramZkv4.Zj.Zo);
  }
  
  private static void lambda$launchScanTask$1(Ztos paramZtos, Zez3 paramZez3) {
    paramZtos.ZD(new Zxr8<>(Zt18.Zu, paramZez3));
  }
  
  private List lambda$launchScanTask$0() {
    return this.ZT.ZM().ZQ();
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'e{\\f|Äq÷õ¼gKª×äH-)ó{ -8ÆþÄ~\\fv@îIöx:ðë´£0!pñ»!Ç¨}·f´]ÀwÚïÏÊvÆ¤iÃ¶úGáòÐÀX<x&_}å36KÞ¡nÌ&³í'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #10
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #107
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'eè¥OÇ¯\0$ïÉú_[Óu¬Cý|ºN×<øÞR\\fàÇ4©âgóàèTÇ¬dKUÃq{ó{c«Ki4ÅjaÍ'+;#SíD,W¯cR«6y5Ø;idKò­Vtå@en_ ,|rÙH,ÛIÎp÷q^è,> \\teÊVþoÿæ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #68
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #21
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zrfd.a : [Ljava/lang/String;
    //   132: bipush #6
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrfd.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #17
    //   214: goto -> 243
    //   217: bipush #124
    //   219: goto -> 243
    //   222: iconst_2
    //   223: goto -> 243
    //   226: bipush #125
    //   228: goto -> 243
    //   231: bipush #100
    //   233: goto -> 243
    //   236: bipush #124
    //   238: goto -> 243
    //   241: bipush #117
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: new burp/Zrb4
    //   303: dup
    //   304: iconst_1
    //   305: invokespecial <init> : (I)V
    //   308: putstatic burp/Zrfd.ZF : Lburp/Zrb4;
    //   311: return
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB64C) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      byte b1 = 118;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrfd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */