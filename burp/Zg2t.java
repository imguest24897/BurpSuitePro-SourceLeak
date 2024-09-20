package burp;

import java.util.Objects;
import net.portswigger.Zkb;
import net.portswigger.Zm2;

public class Zg2t extends Zg2b<Zeo2> {
  private static final Zgik<Zeo2> Zu;
  
  private static final Zgik<Zeo2> Zi;
  
  private static final Zgik<Zeo2> ZT;
  
  private static final Zgik<Zeo2> ZV;
  
  private static final Zgik<Zeo2> Zj;
  
  private static final Zgik<Zeo2> ZD;
  
  private static final Zgik<Zeo2> Zc;
  
  private static final Zgik<Zeo2> ZI;
  
  public static final Zmk7<Zeo2> Zz;
  
  public static final Zmk7<Zeo2> Zv;
  
  public static final Zmk7<Zeo2> ZU;
  
  public static final Zmk7<Zeo2> ZJ;
  
  public static final Zmk7<Zeo2> ZS;
  
  public static final Zmk7<Zeo2> Zg;
  
  public static final Zmk7<Zeo2> Zp;
  
  public static final Zmk7<Zeo2> ZQ;
  
  public static final Zmk7<Zeo2> Zo;
  
  public static final Zmk7<Zeo2> Zf;
  
  public static final Zmk7<Zeo2> ZB;
  
  public static final Zmk7<Zeo2> ZX;
  
  public static final Zmk7<Zeo2> ZW;
  
  public static final Zmk7<Zeo2> ZH;
  
  public static final Zmk7<Zeo2> ZM;
  
  public static final Zmk7<Zeo2> Zm;
  
  public static final Zmk7<Zeo2> Zq;
  
  public static final Zmk7<Zeo2> Zt;
  
  private static final Zmk7<Zeo2> ZA;
  
  private static final Zgjg<Zeo2> ZL;
  
  public Zg2t() {
    super(ZL);
    ZE(Zu);
    ZE(Zi);
    ZE(ZT);
    ZE(ZV);
    ZE(ZD);
    ZE(Zc);
    ZE(Zj);
    ZE(ZI);
  }
  
  private static Object lambda$static$12(Zeo2 paramZeo2) {
    return Long.valueOf(paramZeo2.ZXm().toMillis());
  }
  
  private static Object lambda$static$11(Zeo2 paramZeo2) {
    return Long.valueOf(paramZeo2.ZXp().toMillis());
  }
  
  private static Object lambda$static$10(Zeo2 paramZeo2) {
    return Objects.requireNonNullElse(paramZeo2.ZXj(), "");
  }
  
  private static Object lambda$static$9(Zeo2 paramZeo2) {
    return Objects.requireNonNullElse(paramZeo2.ZAs(), "");
  }
  
  private static Object lambda$static$8(Zeo2 paramZeo2) {
    return Objects.requireNonNullElse(paramZeo2.ZXw(), "");
  }
  
  private static Object lambda$static$7(Zeo2 paramZeo2) {
    return Objects.requireNonNullElse(paramZeo2.ZXF(), "");
  }
  
  private static Object lambda$static$6(Zeo2 paramZeo2) {
    return Zk8m.Zz(paramZeo2.ZXy());
  }
  
  private static Object lambda$static$5(Zeo2 paramZeo2) {
    return Boolean.valueOf((paramZeo2.ZX9() != null || paramZeo2.ZXq() != null));
  }
  
  private static void lambda$static$4(Zeo2 paramZeo2, Object paramObject) {
    byte b = ((Byte)paramObject).byteValue();
    paramZeo2.ZB(b);
    Zlxk.ZS = paramZeo2.ZaP();
    Zm2.Zi(Zv8r.PROXY_HISTORY_HIGHLIGHT, b);
  }
  
  private static Object lambda$static$3(Zeo2 paramZeo2) {
    return Integer.valueOf((paramZeo2.ZEe() == -1) ? 0 : paramZeo2.ZEe());
  }
  
  private static Object lambda$static$2(Zeo2 paramZeo2) {
    return Boolean.valueOf(paramZeo2.ZlL().Zdr());
  }
  
  private static Object lambda$static$1(Zeo2 paramZeo2) {
    return Zkb.ZG(paramZeo2.ZlL().ZdH());
  }
  
  private static Object lambda$static$0(Zeo2 paramZeo2) {
    Zmzk zmzk = paramZeo2.ZlL().Zdz();
    return (zmzk != null) ? new Zz4(zmzk.ZJ1().intern(), zmzk.toString().intern()) : new Zz4("", "");
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc '<uj16Sc*y -bz10]1bm 7bj1+\\t4DSxC\\th5hp3,\\n<iw =<czt*I\\tbp'=BN`{&,_R4hj<7:bq?1I-AM-dj8=-ds1)ll55'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #9
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #21
    //   25: iinc #1, 1
    //   28: aload_3
    //   29: iload_1
    //   30: dup
    //   31: iload_2
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 130
    //   40: aload_0
    //   41: swap
    //   42: iload #4
    //   44: iinc #4, 1
    //   47: swap
    //   48: aastore
    //   49: iload_1
    //   50: iload_2
    //   51: iadd
    //   52: dup
    //   53: istore_1
    //   54: iload #5
    //   56: if_icmpge -> 68
    //   59: aload_3
    //   60: iload_1
    //   61: invokevirtual charAt : (I)C
    //   64: istore_2
    //   65: goto -> 23
    //   68: ldc 'AH)z.\\bK3\Z\\tgm9[K4z|\R5'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #13
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #48
    //   84: iinc #1, 1
    //   87: aload_3
    //   88: iload_1
    //   89: dup
    //   90: iload_2
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 130
    //   99: aload_0
    //   100: swap
    //   101: iload #4
    //   103: iinc #4, 1
    //   106: swap
    //   107: aastore
    //   108: iload_1
    //   109: iload_2
    //   110: iadd
    //   111: dup
    //   112: istore_1
    //   113: iload #5
    //   115: if_icmpge -> 127
    //   118: aload_3
    //   119: iload_1
    //   120: invokevirtual charAt : (I)C
    //   123: istore_2
    //   124: goto -> 82
    //   127: goto -> 288
    //   130: dup_x2
    //   131: pop
    //   132: invokevirtual toCharArray : ()[C
    //   135: dup_x1
    //   136: arraylength
    //   137: dup_x2
    //   138: pop
    //   139: iconst_0
    //   140: istore #6
    //   142: dup2_x1
    //   143: pop2
    //   144: dup_x2
    //   145: iconst_1
    //   146: if_icmpgt -> 248
    //   149: dup2
    //   150: swap
    //   151: iload #6
    //   153: dup2_x1
    //   154: caload
    //   155: swap
    //   156: iload #6
    //   158: bipush #7
    //   160: irem
    //   161: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #108
    //   202: goto -> 232
    //   205: bipush #24
    //   207: goto -> 232
    //   210: bipush #11
    //   212: goto -> 232
    //   215: bipush #65
    //   217: goto -> 232
    //   220: bipush #77
    //   222: goto -> 232
    //   225: bipush #119
    //   227: goto -> 232
    //   230: bipush #47
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 153
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 149
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 40, 0 -> 99
    //   288: new burp/Zgik
    //   291: dup
    //   292: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   297: invokespecial <init> : (Ljava/util/function/Function;)V
    //   300: putstatic burp/Zg2t.Zu : Lburp/Zgik;
    //   303: new burp/Zgik
    //   306: dup
    //   307: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   312: invokespecial <init> : (Ljava/util/function/Function;)V
    //   315: putstatic burp/Zg2t.Zi : Lburp/Zgik;
    //   318: new burp/Zgik
    //   321: dup
    //   322: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   327: invokespecial <init> : (Ljava/util/function/Function;)V
    //   330: putstatic burp/Zg2t.ZT : Lburp/Zgik;
    //   333: new burp/Zgik
    //   336: dup
    //   337: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   342: invokespecial <init> : (Ljava/util/function/Function;)V
    //   345: putstatic burp/Zg2t.ZV : Lburp/Zgik;
    //   348: new burp/Zgik
    //   351: dup
    //   352: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   357: invokespecial <init> : (Ljava/util/function/Function;)V
    //   360: putstatic burp/Zg2t.Zj : Lburp/Zgik;
    //   363: new burp/Zgik
    //   366: dup
    //   367: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   372: invokespecial <init> : (Ljava/util/function/Function;)V
    //   375: putstatic burp/Zg2t.ZD : Lburp/Zgik;
    //   378: new burp/Zgik
    //   381: dup
    //   382: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   387: invokespecial <init> : (Ljava/util/function/Function;)V
    //   390: putstatic burp/Zg2t.Zc : Lburp/Zgik;
    //   393: new burp/Zgik
    //   396: dup
    //   397: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   402: invokespecial <init> : (Ljava/util/function/Function;)V
    //   405: putstatic burp/Zg2t.ZI : Lburp/Zgik;
    //   408: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   413: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   416: ldc '#'
    //   418: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   421: ldc java/lang/Integer
    //   423: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   426: bipush #6
    //   428: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   431: <illegal opcode> ZG : ()Lburp/Zzbi;
    //   436: invokevirtual ZR : (Lburp/Zzbi;)Lburp/Zz_2;
    //   439: new burp/Zlxk
    //   442: dup
    //   443: invokespecial <init> : ()V
    //   446: invokevirtual Zb : ()Ljavax/swing/table/TableCellEditor;
    //   449: invokevirtual ZE : (Ljavax/swing/table/TableCellEditor;)Lburp/Zz_2;
    //   452: getstatic javax/swing/SortOrder.ASCENDING : Ljavax/swing/SortOrder;
    //   455: invokevirtual ZV : (Ljavax/swing/SortOrder;)Lburp/Zz_2;
    //   458: invokevirtual ZH : ()Lburp/Zmk7;
    //   461: putstatic burp/Zg2t.Zz : Lburp/Zmk7;
    //   464: getstatic burp/Zg2t.Zu : Lburp/Zgik;
    //   467: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   470: aload_0
    //   471: iconst_3
    //   472: aaload
    //   473: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   476: ldc burp/Zz4
    //   478: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   481: bipush #25
    //   483: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   486: new burp/Zmqu
    //   489: dup
    //   490: invokespecial <init> : ()V
    //   493: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   496: new burp/Zzlw
    //   499: dup
    //   500: invokespecial <init> : ()V
    //   503: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   506: invokevirtual ZH : ()Lburp/Zmk7;
    //   509: putstatic burp/Zg2t.Zv : Lburp/Zmk7;
    //   512: getstatic burp/Zg2t.Zi : Lburp/Zgik;
    //   515: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   518: aload_0
    //   519: bipush #10
    //   521: aaload
    //   522: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   525: ldc java/lang/String
    //   527: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   530: bipush #8
    //   532: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   535: invokevirtual ZH : ()Lburp/Zmk7;
    //   538: putstatic burp/Zg2t.ZU : Lburp/Zmk7;
    //   541: getstatic burp/Zg2t.ZT : Lburp/Zgik;
    //   544: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   547: aload_0
    //   548: bipush #9
    //   550: aaload
    //   551: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   554: ldc java/lang/String
    //   556: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   559: bipush #30
    //   561: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   564: invokevirtual ZH : ()Lburp/Zmk7;
    //   567: putstatic burp/Zg2t.ZJ : Lburp/Zmk7;
    //   570: getstatic burp/Zg2t.ZV : Lburp/Zgik;
    //   573: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   576: aload_0
    //   577: bipush #15
    //   579: aaload
    //   580: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   583: ldc java/lang/Boolean
    //   585: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   588: bipush #8
    //   590: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   593: new burp/Zbgu
    //   596: dup
    //   597: invokespecial <init> : ()V
    //   600: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   603: invokevirtual ZH : ()Lburp/Zmk7;
    //   606: putstatic burp/Zg2t.ZS : Lburp/Zmk7;
    //   609: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   614: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   617: aload_0
    //   618: bipush #7
    //   620: aaload
    //   621: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   624: ldc java/lang/Boolean
    //   626: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   629: bipush #8
    //   631: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   634: new burp/Zbgu
    //   637: dup
    //   638: invokespecial <init> : ()V
    //   641: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   644: invokevirtual ZH : ()Lburp/Zmk7;
    //   647: putstatic burp/Zg2t.Zg : Lburp/Zmk7;
    //   650: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   655: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   658: aload_0
    //   659: iconst_1
    //   660: aaload
    //   661: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   664: ldc java/lang/Short
    //   666: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   669: bipush #12
    //   671: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   674: new burp/Zmqp
    //   677: dup
    //   678: invokespecial <init> : ()V
    //   681: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   684: new burp/Zs46
    //   687: dup
    //   688: invokespecial <init> : ()V
    //   691: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   694: invokevirtual ZH : ()Lburp/Zmk7;
    //   697: putstatic burp/Zg2t.Zp : Lburp/Zmk7;
    //   700: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   705: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   708: aload_0
    //   709: bipush #6
    //   711: aaload
    //   712: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   715: ldc java/lang/Integer
    //   717: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   720: bipush #8
    //   722: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   725: new burp/Zmqp
    //   728: dup
    //   729: invokespecial <init> : ()V
    //   732: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   735: new burp/Zs46
    //   738: dup
    //   739: invokespecial <init> : ()V
    //   742: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   745: invokevirtual ZH : ()Lburp/Zmk7;
    //   748: putstatic burp/Zg2t.ZQ : Lburp/Zmk7;
    //   751: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   756: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   759: aload_0
    //   760: iconst_5
    //   761: aaload
    //   762: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   765: ldc java/lang/String
    //   767: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   770: bipush #10
    //   772: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   775: invokevirtual ZH : ()Lburp/Zmk7;
    //   778: putstatic burp/Zg2t.Zo : Lburp/Zmk7;
    //   781: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   786: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   789: aload_0
    //   790: iconst_0
    //   791: aaload
    //   792: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   795: ldc java/lang/String
    //   797: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   800: bipush #10
    //   802: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   805: invokevirtual ZH : ()Lburp/Zmk7;
    //   808: putstatic burp/Zg2t.Zf : Lburp/Zmk7;
    //   811: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   816: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   819: aload_0
    //   820: bipush #13
    //   822: aaload
    //   823: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   826: ldc java/lang/String
    //   828: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   831: bipush #20
    //   833: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   836: invokevirtual ZH : ()Lburp/Zmk7;
    //   839: putstatic burp/Zg2t.ZB : Lburp/Zmk7;
    //   842: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   847: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   850: aload_0
    //   851: iconst_4
    //   852: aaload
    //   853: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   856: ldc java/lang/String
    //   858: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   861: bipush #15
    //   863: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   866: invokevirtual ZH : ()Lburp/Zmk7;
    //   869: putstatic burp/Zg2t.ZX : Lburp/Zmk7;
    //   872: getstatic burp/Zg2t.ZD : Lburp/Zgik;
    //   875: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   878: aload_0
    //   879: bipush #12
    //   881: aaload
    //   882: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   885: ldc java/lang/Boolean
    //   887: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   890: bipush #6
    //   892: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   895: new burp/Zbgu
    //   898: dup
    //   899: invokespecial <init> : ()V
    //   902: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   905: invokevirtual ZH : ()Lburp/Zmk7;
    //   908: putstatic burp/Zg2t.ZW : Lburp/Zmk7;
    //   911: getstatic burp/Zg2t.Zc : Lburp/Zgik;
    //   914: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   917: aload_0
    //   918: iconst_2
    //   919: aaload
    //   920: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   923: ldc java/lang/String
    //   925: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   928: bipush #16
    //   930: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   933: invokevirtual ZH : ()Lburp/Zmk7;
    //   936: putstatic burp/Zg2t.ZH : Lburp/Zmk7;
    //   939: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   944: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   947: aload_0
    //   948: bipush #11
    //   950: aaload
    //   951: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   954: ldc java/lang/String
    //   956: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   959: bipush #16
    //   961: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   964: invokevirtual ZH : ()Lburp/Zmk7;
    //   967: putstatic burp/Zg2t.ZM : Lburp/Zmk7;
    //   970: getstatic burp/Zg2t.Zj : Lburp/Zgik;
    //   973: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   976: aload_0
    //   977: bipush #14
    //   979: aaload
    //   980: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   983: ldc java/lang/Long
    //   985: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   988: bipush #12
    //   990: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   993: new burp/Zmqw
    //   996: dup
    //   997: invokespecial <init> : ()V
    //   1000: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   1003: invokevirtual ZH : ()Lburp/Zmk7;
    //   1006: putstatic burp/Zg2t.Zm : Lburp/Zmk7;
    //   1009: getstatic burp/Zg2t.ZI : Lburp/Zgik;
    //   1012: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   1015: aload_0
    //   1016: bipush #16
    //   1018: aaload
    //   1019: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   1022: ldc java/lang/Integer
    //   1024: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   1027: bipush #12
    //   1029: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   1032: new burp/Zmqp
    //   1035: dup
    //   1036: invokespecial <init> : ()V
    //   1039: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   1042: new burp/Zs46
    //   1045: dup
    //   1046: invokespecial <init> : ()V
    //   1049: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   1052: invokevirtual ZH : ()Lburp/Zmk7;
    //   1055: putstatic burp/Zg2t.Zq : Lburp/Zmk7;
    //   1058: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   1063: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   1066: aload_0
    //   1067: bipush #17
    //   1069: aaload
    //   1070: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   1073: ldc java/lang/Long
    //   1075: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   1078: bipush #12
    //   1080: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   1083: iconst_1
    //   1084: invokevirtual ZP : (Z)Lburp/Zz_2;
    //   1087: new burp/Zmq4
    //   1090: dup
    //   1091: invokespecial <init> : ()V
    //   1094: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   1097: new burp/Zbst
    //   1100: dup
    //   1101: invokespecial <init> : ()V
    //   1104: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   1107: invokevirtual ZH : ()Lburp/Zmk7;
    //   1110: putstatic burp/Zg2t.Zt : Lburp/Zmk7;
    //   1113: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   1118: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   1121: aload_0
    //   1122: bipush #8
    //   1124: aaload
    //   1125: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   1128: ldc java/lang/Long
    //   1130: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   1133: bipush #12
    //   1135: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   1138: iconst_0
    //   1139: invokevirtual ZP : (Z)Lburp/Zz_2;
    //   1142: new burp/Zmq4
    //   1145: dup
    //   1146: invokespecial <init> : ()V
    //   1149: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   1152: new burp/Zbst
    //   1155: dup
    //   1156: invokespecial <init> : ()V
    //   1159: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   1162: invokevirtual ZH : ()Lburp/Zmk7;
    //   1165: putstatic burp/Zg2t.ZA : Lburp/Zmk7;
    //   1168: new burp/Zgjg
    //   1171: dup
    //   1172: bipush #19
    //   1174: anewarray burp/Zmk7
    //   1177: dup
    //   1178: iconst_0
    //   1179: getstatic burp/Zg2t.Zz : Lburp/Zmk7;
    //   1182: aastore
    //   1183: dup
    //   1184: iconst_1
    //   1185: getstatic burp/Zg2t.Zv : Lburp/Zmk7;
    //   1188: aastore
    //   1189: dup
    //   1190: iconst_2
    //   1191: getstatic burp/Zg2t.ZU : Lburp/Zmk7;
    //   1194: aastore
    //   1195: dup
    //   1196: iconst_3
    //   1197: getstatic burp/Zg2t.ZJ : Lburp/Zmk7;
    //   1200: aastore
    //   1201: dup
    //   1202: iconst_4
    //   1203: getstatic burp/Zg2t.ZS : Lburp/Zmk7;
    //   1206: aastore
    //   1207: dup
    //   1208: iconst_5
    //   1209: getstatic burp/Zg2t.Zg : Lburp/Zmk7;
    //   1212: aastore
    //   1213: dup
    //   1214: bipush #6
    //   1216: getstatic burp/Zg2t.Zp : Lburp/Zmk7;
    //   1219: aastore
    //   1220: dup
    //   1221: bipush #7
    //   1223: getstatic burp/Zg2t.ZQ : Lburp/Zmk7;
    //   1226: aastore
    //   1227: dup
    //   1228: bipush #8
    //   1230: getstatic burp/Zg2t.Zo : Lburp/Zmk7;
    //   1233: aastore
    //   1234: dup
    //   1235: bipush #9
    //   1237: getstatic burp/Zg2t.Zf : Lburp/Zmk7;
    //   1240: aastore
    //   1241: dup
    //   1242: bipush #10
    //   1244: getstatic burp/Zg2t.ZB : Lburp/Zmk7;
    //   1247: aastore
    //   1248: dup
    //   1249: bipush #11
    //   1251: getstatic burp/Zg2t.ZX : Lburp/Zmk7;
    //   1254: aastore
    //   1255: dup
    //   1256: bipush #12
    //   1258: getstatic burp/Zg2t.ZW : Lburp/Zmk7;
    //   1261: aastore
    //   1262: dup
    //   1263: bipush #13
    //   1265: getstatic burp/Zg2t.ZH : Lburp/Zmk7;
    //   1268: aastore
    //   1269: dup
    //   1270: bipush #14
    //   1272: getstatic burp/Zg2t.ZM : Lburp/Zmk7;
    //   1275: aastore
    //   1276: dup
    //   1277: bipush #15
    //   1279: getstatic burp/Zg2t.Zm : Lburp/Zmk7;
    //   1282: aastore
    //   1283: dup
    //   1284: bipush #16
    //   1286: getstatic burp/Zg2t.Zq : Lburp/Zmk7;
    //   1289: aastore
    //   1290: dup
    //   1291: bipush #17
    //   1293: getstatic burp/Zg2t.Zt : Lburp/Zmk7;
    //   1296: aastore
    //   1297: dup
    //   1298: bipush #18
    //   1300: getstatic burp/Zg2t.ZA : Lburp/Zmk7;
    //   1303: aastore
    //   1304: invokespecial <init> : ([Lburp/Zmk7;)V
    //   1307: putstatic burp/Zg2t.ZL : Lburp/Zgjg;
    //   1310: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg2t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */