package burp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import net.portswigger.Zvy;

public class Zb0l extends Zb0j {
  private int ZK;
  
  private final File Zd;
  
  private Zry2 Zl;
  
  private Zxd2 ZE;
  
  private final int Zz;
  
  private final List Zc;
  
  private int Ze;
  
  private int ZZ;
  
  private int Zi;
  
  private int[] ZH;
  
  private final List<String>[] ZS;
  
  private int ZA;
  
  private boolean Zw;
  
  private boolean Zy;
  
  private boolean ZO;
  
  private boolean Zk;
  
  private static final String ZC;
  
  private static final String[] Zh;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zb0l(Zzb4 paramZzb4, Zsh9 paramZsh9, File paramFile, Collection<Zrdb> paramCollection, Zz38 paramZz38, Zskh paramZskh, Zbnt paramZbnt, Zey9 paramZey9) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: aload #5
    //   5: aload #6
    //   7: aload #7
    //   9: aload #8
    //   11: invokespecial <init> : (Lburp/Zzb4;Lburp/Zsh9;Lburp/Zz38;Lburp/Zskh;Lburp/Zbnt;Lburp/Zey9;)V
    //   14: invokestatic ZX : ()Z
    //   17: getstatic burp/Zrrh.SCANNER_ISSUES_REPORT_HTML : Lburp/Zrrh;
    //   20: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   23: aload_0
    //   24: aload_3
    //   25: putfield Zd : Ljava/io/File;
    //   28: aload_0
    //   29: iconst_3
    //   30: anewarray java/util/List
    //   33: putfield ZS : [Ljava/util/List;
    //   36: iconst_0
    //   37: istore #10
    //   39: istore #9
    //   41: iload #10
    //   43: aload_0
    //   44: getfield ZS : [Ljava/util/List;
    //   47: arraylength
    //   48: if_icmpge -> 73
    //   51: aload_0
    //   52: getfield ZS : [Ljava/util/List;
    //   55: iload #10
    //   57: new java/util/ArrayList
    //   60: dup
    //   61: invokespecial <init> : ()V
    //   64: aastore
    //   65: iinc #10, 1
    //   68: iload #9
    //   70: ifne -> 41
    //   73: aload_0
    //   74: aload #4
    //   76: invokeinterface size : ()I
    //   81: putfield Zz : I
    //   84: aload_2
    //   85: getfield ZQ : B
    //   88: tableswitch default -> 197, 0 -> 116, 1 -> 143, 2 -> 170
    //   116: aload_0
    //   117: new burp/Zk22
    //   120: dup
    //   121: aload #4
    //   123: aload_0
    //   124: getfield ZB : Lburp/Zr1x;
    //   127: invokespecial <init> : (Ljava/util/Collection;Lburp/Zr1x;)V
    //   130: putfield ZE : Lburp/Zxd2;
    //   133: aload_0
    //   134: iconst_1
    //   135: putfield ZK : I
    //   138: iload #9
    //   140: ifne -> 209
    //   143: aload_0
    //   144: new burp/Zk29
    //   147: dup
    //   148: aload #4
    //   150: aload_0
    //   151: getfield ZB : Lburp/Zr1x;
    //   154: invokespecial <init> : (Ljava/util/Collection;Lburp/Zr1x;)V
    //   157: putfield ZE : Lburp/Zxd2;
    //   160: aload_0
    //   161: iconst_2
    //   162: putfield ZK : I
    //   165: iload #9
    //   167: ifne -> 209
    //   170: aload_0
    //   171: new burp/Zk2q
    //   174: dup
    //   175: aload #4
    //   177: aload_0
    //   178: getfield ZB : Lburp/Zr1x;
    //   181: invokespecial <init> : (Ljava/util/Collection;Lburp/Zr1x;)V
    //   184: putfield ZE : Lburp/Zxd2;
    //   187: aload_0
    //   188: iconst_2
    //   189: putfield ZK : I
    //   192: iload #9
    //   194: ifne -> 209
    //   197: iconst_0
    //   198: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   201: aload_2
    //   202: getfield ZQ : B
    //   205: i2l
    //   206: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   209: aload_0
    //   210: aload_0
    //   211: getfield ZE : Lburp/Zxd2;
    //   214: invokeinterface Z_ : ()Ljava/util/List;
    //   219: putfield Zc : Ljava/util/List;
    //   222: return
  }
  
  protected void ZX() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZR : Ljava/io/FileWriter;
    //   4: sipush #2504
    //   7: sipush #7331
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokevirtual write : (Ljava/lang/String;)V
    //   16: aload_0
    //   17: getfield ZR : Ljava/io/FileWriter;
    //   20: sipush #2437
    //   23: sipush #-15099
    //   26: invokestatic a : (II)Ljava/lang/String;
    //   29: invokevirtual write : (Ljava/lang/String;)V
    //   32: aload_0
    //   33: getfield ZR : Ljava/io/FileWriter;
    //   36: aload_0
    //   37: getfield Zx : Lburp/Zsh9;
    //   40: getfield ZX : [B
    //   43: iconst_0
    //   44: aload_0
    //   45: getfield Zx : Lburp/Zsh9;
    //   48: getfield ZX : [B
    //   51: arraylength
    //   52: invokestatic ZZ : (Ljava/io/Writer;[BII)V
    //   55: aload_0
    //   56: getfield ZR : Ljava/io/FileWriter;
    //   59: sipush #2315
    //   62: sipush #-7798
    //   65: invokestatic a : (II)Ljava/lang/String;
    //   68: invokevirtual write : (Ljava/lang/String;)V
    //   71: invokestatic Zq : ()Z
    //   74: aload_0
    //   75: invokevirtual ZQ : ()V
    //   78: aload_0
    //   79: getfield ZR : Ljava/io/FileWriter;
    //   82: aload_0
    //   83: sipush #2534
    //   86: sipush #-22575
    //   89: invokestatic a : (II)Ljava/lang/String;
    //   92: invokevirtual ZZ : (Ljava/lang/String;)Ljava/lang/String;
    //   95: sipush #2546
    //   98: sipush #10566
    //   101: invokestatic a : (II)Ljava/lang/String;
    //   104: swap
    //   105: sipush #2462
    //   108: sipush #-29610
    //   111: invokestatic a : (II)Ljava/lang/String;
    //   114: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   119: invokevirtual write : (Ljava/lang/String;)V
    //   122: aload_0
    //   123: getfield ZR : Ljava/io/FileWriter;
    //   126: sipush #2324
    //   129: sipush #15793
    //   132: invokestatic a : (II)Ljava/lang/String;
    //   135: invokevirtual write : (Ljava/lang/String;)V
    //   138: aload_0
    //   139: getfield ZR : Ljava/io/FileWriter;
    //   142: aload_0
    //   143: getfield Zx : Lburp/Zsh9;
    //   146: getfield ZX : [B
    //   149: invokestatic ZV : (Ljava/io/Writer;[B)V
    //   152: aload_0
    //   153: getfield ZR : Ljava/io/FileWriter;
    //   156: sipush #2528
    //   159: sipush #-27496
    //   162: invokestatic a : (II)Ljava/lang/String;
    //   165: invokevirtual write : (Ljava/lang/String;)V
    //   168: istore_1
    //   169: aload_0
    //   170: getfield Zx : Lburp/Zsh9;
    //   173: getfield ZM : B
    //   176: ifge -> 230
    //   179: aload_0
    //   180: getfield Zx : Lburp/Zsh9;
    //   183: getfield ZT : B
    //   186: ifge -> 230
    //   189: goto -> 196
    //   192: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   195: athrow
    //   196: aload_0
    //   197: getfield Zx : Lburp/Zsh9;
    //   200: getfield Zx : Z
    //   203: ifne -> 230
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   212: athrow
    //   213: aload_0
    //   214: getfield Zx : Lburp/Zsh9;
    //   217: getfield Zh : Z
    //   220: ifeq -> 2269
    //   223: goto -> 230
    //   226: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   229: athrow
    //   230: aload_0
    //   231: getfield ZR : Ljava/io/FileWriter;
    //   234: sipush #2464
    //   237: sipush #11648
    //   240: invokestatic a : (II)Ljava/lang/String;
    //   243: invokevirtual write : (Ljava/lang/String;)V
    //   246: aload_0
    //   247: getfield Zx : Lburp/Zsh9;
    //   250: getfield ZM : B
    //   253: ifge -> 280
    //   256: goto -> 263
    //   259: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   262: athrow
    //   263: aload_0
    //   264: getfield Zx : Lburp/Zsh9;
    //   267: getfield Zx : Z
    //   270: ifeq -> 1016
    //   273: goto -> 280
    //   276: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   279: athrow
    //   280: aload_0
    //   281: getfield ZR : Ljava/io/FileWriter;
    //   284: aload_0
    //   285: getfield Zx : Lburp/Zsh9;
    //   288: getfield Zx : Z
    //   291: ifeq -> 317
    //   294: goto -> 301
    //   297: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   300: athrow
    //   301: sipush #2310
    //   304: sipush #14380
    //   307: invokestatic a : (II)Ljava/lang/String;
    //   310: goto -> 326
    //   313: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   316: athrow
    //   317: sipush #2518
    //   320: sipush #27873
    //   323: invokestatic a : (II)Ljava/lang/String;
    //   326: iconst_5
    //   327: aload_0
    //   328: getfield Zx : Lburp/Zsh9;
    //   331: getfield ZM : B
    //   334: isub
    //   335: aload_0
    //   336: getfield Zx : Lburp/Zsh9;
    //   339: getfield Zx : Z
    //   342: ifeq -> 353
    //   345: iconst_1
    //   346: goto -> 354
    //   349: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   352: athrow
    //   353: iconst_0
    //   354: iadd
    //   355: aload_0
    //   356: getfield ZE : Lburp/Zxd2;
    //   359: iconst_4
    //   360: iconst_3
    //   361: invokeinterface Zs : (II)I
    //   366: aload_0
    //   367: getfield ZE : Lburp/Zxd2;
    //   370: iconst_4
    //   371: iconst_2
    //   372: invokeinterface Zs : (II)I
    //   377: aload_0
    //   378: getfield ZE : Lburp/Zxd2;
    //   381: iconst_4
    //   382: iconst_1
    //   383: invokeinterface Zs : (II)I
    //   388: aload_0
    //   389: getfield ZE : Lburp/Zxd2;
    //   392: iconst_4
    //   393: invokeinterface Zl : (I)I
    //   398: istore #5
    //   400: istore #6
    //   402: istore #7
    //   404: istore #8
    //   406: istore #9
    //   408: astore #10
    //   410: sipush #2557
    //   413: sipush #26287
    //   416: invokestatic a : (II)Ljava/lang/String;
    //   419: aload #10
    //   421: sipush #2486
    //   424: sipush #502
    //   427: invokestatic a : (II)Ljava/lang/String;
    //   430: iload #9
    //   432: sipush #2331
    //   435: sipush #-4774
    //   438: invokestatic a : (II)Ljava/lang/String;
    //   441: iload #8
    //   443: sipush #2496
    //   446: sipush #-4125
    //   449: invokestatic a : (II)Ljava/lang/String;
    //   452: iload #7
    //   454: sipush #2478
    //   457: sipush #-30111
    //   460: invokestatic a : (II)Ljava/lang/String;
    //   463: iload #6
    //   465: sipush #2521
    //   468: sipush #14268
    //   471: invokestatic a : (II)Ljava/lang/String;
    //   474: iload #5
    //   476: sipush #2347
    //   479: sipush #-29513
    //   482: invokestatic a : (II)Ljava/lang/String;
    //   485: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   490: invokevirtual write : (Ljava/lang/String;)V
    //   493: aload_0
    //   494: getfield Zx : Lburp/Zsh9;
    //   497: getfield ZM : B
    //   500: iconst_3
    //   501: if_icmpgt -> 620
    //   504: aload_0
    //   505: getfield ZR : Ljava/io/FileWriter;
    //   508: aload_0
    //   509: getfield ZE : Lburp/Zxd2;
    //   512: iconst_3
    //   513: iconst_3
    //   514: invokeinterface Zs : (II)I
    //   519: aload_0
    //   520: getfield ZE : Lburp/Zxd2;
    //   523: iconst_3
    //   524: iconst_2
    //   525: invokeinterface Zs : (II)I
    //   530: aload_0
    //   531: getfield ZE : Lburp/Zxd2;
    //   534: iconst_3
    //   535: iconst_1
    //   536: invokeinterface Zs : (II)I
    //   541: aload_0
    //   542: getfield ZE : Lburp/Zxd2;
    //   545: iconst_3
    //   546: invokeinterface Zl : (I)I
    //   551: istore #11
    //   553: istore #12
    //   555: istore #13
    //   557: istore #14
    //   559: sipush #2475
    //   562: sipush #-10021
    //   565: invokestatic a : (II)Ljava/lang/String;
    //   568: iload #14
    //   570: sipush #2322
    //   573: sipush #31746
    //   576: invokestatic a : (II)Ljava/lang/String;
    //   579: iload #13
    //   581: sipush #2323
    //   584: sipush #-5231
    //   587: invokestatic a : (II)Ljava/lang/String;
    //   590: iload #12
    //   592: sipush #2346
    //   595: sipush #23628
    //   598: invokestatic a : (II)Ljava/lang/String;
    //   601: iload #11
    //   603: sipush #2468
    //   606: sipush #-27424
    //   609: invokestatic a : (II)Ljava/lang/String;
    //   612: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   617: invokevirtual write : (Ljava/lang/String;)V
    //   620: aload_0
    //   621: getfield Zx : Lburp/Zsh9;
    //   624: getfield ZM : B
    //   627: iconst_2
    //   628: if_icmpgt -> 747
    //   631: aload_0
    //   632: getfield ZR : Ljava/io/FileWriter;
    //   635: aload_0
    //   636: getfield ZE : Lburp/Zxd2;
    //   639: iconst_2
    //   640: iconst_3
    //   641: invokeinterface Zs : (II)I
    //   646: aload_0
    //   647: getfield ZE : Lburp/Zxd2;
    //   650: iconst_2
    //   651: iconst_2
    //   652: invokeinterface Zs : (II)I
    //   657: aload_0
    //   658: getfield ZE : Lburp/Zxd2;
    //   661: iconst_2
    //   662: iconst_1
    //   663: invokeinterface Zs : (II)I
    //   668: aload_0
    //   669: getfield ZE : Lburp/Zxd2;
    //   672: iconst_2
    //   673: invokeinterface Zl : (I)I
    //   678: istore #15
    //   680: istore #16
    //   682: istore #17
    //   684: istore #18
    //   686: sipush #2343
    //   689: sipush #9766
    //   692: invokestatic a : (II)Ljava/lang/String;
    //   695: iload #18
    //   697: sipush #2488
    //   700: sipush #-26833
    //   703: invokestatic a : (II)Ljava/lang/String;
    //   706: iload #17
    //   708: sipush #2522
    //   711: sipush #3563
    //   714: invokestatic a : (II)Ljava/lang/String;
    //   717: iload #16
    //   719: sipush #2346
    //   722: sipush #23628
    //   725: invokestatic a : (II)Ljava/lang/String;
    //   728: iload #15
    //   730: sipush #2468
    //   733: sipush #-27424
    //   736: invokestatic a : (II)Ljava/lang/String;
    //   739: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   744: invokevirtual write : (Ljava/lang/String;)V
    //   747: aload_0
    //   748: getfield Zx : Lburp/Zsh9;
    //   751: getfield ZM : B
    //   754: iconst_1
    //   755: if_icmpgt -> 874
    //   758: aload_0
    //   759: getfield ZR : Ljava/io/FileWriter;
    //   762: aload_0
    //   763: getfield ZE : Lburp/Zxd2;
    //   766: iconst_1
    //   767: iconst_3
    //   768: invokeinterface Zs : (II)I
    //   773: aload_0
    //   774: getfield ZE : Lburp/Zxd2;
    //   777: iconst_1
    //   778: iconst_2
    //   779: invokeinterface Zs : (II)I
    //   784: aload_0
    //   785: getfield ZE : Lburp/Zxd2;
    //   788: iconst_1
    //   789: iconst_1
    //   790: invokeinterface Zs : (II)I
    //   795: aload_0
    //   796: getfield ZE : Lburp/Zxd2;
    //   799: iconst_1
    //   800: invokeinterface Zl : (I)I
    //   805: istore #19
    //   807: istore #20
    //   809: istore #21
    //   811: istore #22
    //   813: sipush #2348
    //   816: sipush #-26786
    //   819: invokestatic a : (II)Ljava/lang/String;
    //   822: iload #22
    //   824: sipush #2487
    //   827: sipush #18552
    //   830: invokestatic a : (II)Ljava/lang/String;
    //   833: iload #21
    //   835: sipush #2320
    //   838: sipush #26166
    //   841: invokestatic a : (II)Ljava/lang/String;
    //   844: iload #20
    //   846: sipush #2346
    //   849: sipush #23628
    //   852: invokestatic a : (II)Ljava/lang/String;
    //   855: iload #19
    //   857: sipush #2468
    //   860: sipush #-27424
    //   863: invokestatic a : (II)Ljava/lang/String;
    //   866: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   871: invokevirtual write : (Ljava/lang/String;)V
    //   874: aload_0
    //   875: getfield Zx : Lburp/Zsh9;
    //   878: getfield Zx : Z
    //   881: ifeq -> 1000
    //   884: aload_0
    //   885: getfield ZR : Ljava/io/FileWriter;
    //   888: aload_0
    //   889: getfield ZE : Lburp/Zxd2;
    //   892: iconst_m1
    //   893: iconst_3
    //   894: invokeinterface Zs : (II)I
    //   899: aload_0
    //   900: getfield ZE : Lburp/Zxd2;
    //   903: iconst_m1
    //   904: iconst_2
    //   905: invokeinterface Zs : (II)I
    //   910: aload_0
    //   911: getfield ZE : Lburp/Zxd2;
    //   914: iconst_m1
    //   915: iconst_1
    //   916: invokeinterface Zs : (II)I
    //   921: aload_0
    //   922: getfield ZE : Lburp/Zxd2;
    //   925: iconst_m1
    //   926: invokeinterface Zl : (I)I
    //   931: istore #23
    //   933: istore #24
    //   935: istore #25
    //   937: istore #26
    //   939: sipush #2499
    //   942: sipush #17008
    //   945: invokestatic a : (II)Ljava/lang/String;
    //   948: iload #26
    //   950: sipush #2444
    //   953: sipush #23265
    //   956: invokestatic a : (II)Ljava/lang/String;
    //   959: iload #25
    //   961: sipush #2467
    //   964: sipush #23810
    //   967: invokestatic a : (II)Ljava/lang/String;
    //   970: iload #24
    //   972: sipush #2346
    //   975: sipush #23628
    //   978: invokestatic a : (II)Ljava/lang/String;
    //   981: iload #23
    //   983: sipush #2468
    //   986: sipush #-27424
    //   989: invokestatic a : (II)Ljava/lang/String;
    //   992: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   997: invokevirtual write : (Ljava/lang/String;)V
    //   1000: aload_0
    //   1001: getfield ZR : Ljava/io/FileWriter;
    //   1004: sipush #2545
    //   1007: sipush #6168
    //   1010: invokestatic a : (II)Ljava/lang/String;
    //   1013: invokevirtual write : (Ljava/lang/String;)V
    //   1016: aload_0
    //   1017: getfield Zx : Lburp/Zsh9;
    //   1020: getfield ZT : B
    //   1023: ifge -> 1043
    //   1026: aload_0
    //   1027: getfield Zx : Lburp/Zsh9;
    //   1030: getfield Zh : Z
    //   1033: ifeq -> 2253
    //   1036: goto -> 1043
    //   1039: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1042: athrow
    //   1043: iconst_0
    //   1044: istore_2
    //   1045: getstatic burp/Zk29.ZA : Ljava/util/Collection;
    //   1048: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1053: astore_3
    //   1054: aload_3
    //   1055: invokeinterface hasNext : ()Z
    //   1060: ifeq -> 1097
    //   1063: aload_3
    //   1064: invokeinterface next : ()Ljava/lang/Object;
    //   1069: checkcast java/lang/Byte
    //   1072: invokevirtual byteValue : ()B
    //   1075: istore #4
    //   1077: iload_2
    //   1078: aload_0
    //   1079: getfield ZE : Lburp/Zxd2;
    //   1082: iload #4
    //   1084: invokeinterface Zl : (I)I
    //   1089: invokestatic max : (II)I
    //   1092: istore_2
    //   1093: iload_1
    //   1094: ifeq -> 1054
    //   1097: aload_0
    //   1098: iload_2
    //   1099: invokevirtual ZY : (I)V
    //   1102: aload_0
    //   1103: getfield ZR : Ljava/io/FileWriter;
    //   1106: aload_0
    //   1107: getfield Ze : I
    //   1110: iconst_1
    //   1111: iadd
    //   1112: sipush #2454
    //   1115: sipush #-22818
    //   1118: invokestatic a : (II)Ljava/lang/String;
    //   1121: swap
    //   1122: sipush #2318
    //   1125: sipush #-31198
    //   1128: invokestatic a : (II)Ljava/lang/String;
    //   1131: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   1136: invokevirtual write : (Ljava/lang/String;)V
    //   1139: iconst_0
    //   1140: istore_3
    //   1141: iload_3
    //   1142: aload_0
    //   1143: getfield Ze : I
    //   1146: if_icmpge -> 1208
    //   1149: aload_0
    //   1150: getfield ZR : Ljava/io/FileWriter;
    //   1153: aload_0
    //   1154: getfield Zi : I
    //   1157: iload_3
    //   1158: aload_0
    //   1159: getfield ZZ : I
    //   1162: imul
    //   1163: sipush #2524
    //   1166: sipush #12705
    //   1169: invokestatic a : (II)Ljava/lang/String;
    //   1172: dup_x2
    //   1173: pop
    //   1174: sipush #2537
    //   1177: sipush #-29840
    //   1180: invokestatic a : (II)Ljava/lang/String;
    //   1183: swap
    //   1184: sipush #2506
    //   1187: sipush #-9641
    //   1190: invokestatic a : (II)Ljava/lang/String;
    //   1193: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   1198: invokevirtual write : (Ljava/lang/String;)V
    //   1201: iinc #3, 1
    //   1204: iload_1
    //   1205: ifeq -> 1141
    //   1208: iload_2
    //   1209: aload_0
    //   1210: getfield ZZ : I
    //   1213: irem
    //   1214: aload_0
    //   1215: getfield ZZ : I
    //   1218: iconst_2
    //   1219: idiv
    //   1220: if_icmple -> 1287
    //   1223: aload_0
    //   1224: getfield ZR : Ljava/io/FileWriter;
    //   1227: aload_0
    //   1228: getfield Zi : I
    //   1231: iconst_2
    //   1232: idiv
    //   1233: aload_0
    //   1234: getfield Ze : I
    //   1237: aload_0
    //   1238: getfield ZZ : I
    //   1241: imul
    //   1242: sipush #2531
    //   1245: sipush #-26462
    //   1248: invokestatic a : (II)Ljava/lang/String;
    //   1251: dup_x2
    //   1252: pop
    //   1253: sipush #2345
    //   1256: sipush #4032
    //   1259: invokestatic a : (II)Ljava/lang/String;
    //   1262: swap
    //   1263: sipush #2492
    //   1266: sipush #-20423
    //   1269: invokestatic a : (II)Ljava/lang/String;
    //   1272: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   1277: invokevirtual write : (Ljava/lang/String;)V
    //   1280: goto -> 1287
    //   1283: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1286: athrow
    //   1287: aload_0
    //   1288: getfield ZR : Ljava/io/FileWriter;
    //   1291: iconst_5
    //   1292: aload_0
    //   1293: getfield Zx : Lburp/Zsh9;
    //   1296: getfield ZT : B
    //   1299: isub
    //   1300: aload_0
    //   1301: getfield Zx : Lburp/Zsh9;
    //   1304: getfield Zh : Z
    //   1307: ifeq -> 1318
    //   1310: iconst_1
    //   1311: goto -> 1319
    //   1314: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1317: athrow
    //   1318: iconst_0
    //   1319: iadd
    //   1320: aload_0
    //   1321: getfield Ze : I
    //   1324: aload_0
    //   1325: sipush #2559
    //   1328: sipush #-30772
    //   1331: invokestatic a : (II)Ljava/lang/String;
    //   1334: invokevirtual ZZ : (Ljava/lang/String;)Ljava/lang/String;
    //   1337: aload_0
    //   1338: iconst_4
    //   1339: iconst_3
    //   1340: invokevirtual Zn : (II)I
    //   1343: aload_0
    //   1344: sipush #2441
    //   1347: sipush #27033
    //   1350: invokestatic a : (II)Ljava/lang/String;
    //   1353: invokevirtual ZZ : (Ljava/lang/String;)Ljava/lang/String;
    //   1356: aload_0
    //   1357: iconst_4
    //   1358: iconst_2
    //   1359: invokevirtual Zn : (II)I
    //   1362: aload_0
    //   1363: sipush #2507
    //   1366: sipush #6740
    //   1369: invokestatic a : (II)Ljava/lang/String;
    //   1372: invokevirtual ZZ : (Ljava/lang/String;)Ljava/lang/String;
    //   1375: aload_0
    //   1376: iconst_4
    //   1377: iconst_1
    //   1378: invokevirtual Zn : (II)I
    //   1381: istore #27
    //   1383: astore #28
    //   1385: istore #29
    //   1387: astore #30
    //   1389: istore #31
    //   1391: astore #32
    //   1393: istore #33
    //   1395: istore #34
    //   1397: sipush #2332
    //   1400: sipush #20457
    //   1403: invokestatic a : (II)Ljava/lang/String;
    //   1406: iload #34
    //   1408: sipush #2473
    //   1411: sipush #26841
    //   1414: invokestatic a : (II)Ljava/lang/String;
    //   1417: iload #33
    //   1419: sipush #2550
    //   1422: sipush #21981
    //   1425: invokestatic a : (II)Ljava/lang/String;
    //   1428: aload #32
    //   1430: sipush #2501
    //   1433: sipush #25135
    //   1436: invokestatic a : (II)Ljava/lang/String;
    //   1439: iload #31
    //   1441: sipush #2341
    //   1444: sipush #-17419
    //   1447: invokestatic a : (II)Ljava/lang/String;
    //   1450: aload #30
    //   1452: sipush #2538
    //   1455: sipush #22675
    //   1458: invokestatic a : (II)Ljava/lang/String;
    //   1461: iload #29
    //   1463: sipush #2351
    //   1466: sipush #-21910
    //   1469: invokestatic a : (II)Ljava/lang/String;
    //   1472: aload #28
    //   1474: sipush #2538
    //   1477: sipush #22675
    //   1480: invokestatic a : (II)Ljava/lang/String;
    //   1483: iload #27
    //   1485: sipush #2556
    //   1488: sipush #11749
    //   1491: invokestatic a : (II)Ljava/lang/String;
    //   1494: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   1499: invokevirtual write : (Ljava/lang/String;)V
    //   1502: aload_0
    //   1503: getfield Zx : Lburp/Zsh9;
    //   1506: getfield ZT : B
    //   1509: iconst_3
    //   1510: if_icmpgt -> 1686
    //   1513: aload_0
    //   1514: getfield ZR : Ljava/io/FileWriter;
    //   1517: aload_0
    //   1518: getfield Ze : I
    //   1521: aload_0
    //   1522: sipush #2432
    //   1525: sipush #9937
    //   1528: invokestatic a : (II)Ljava/lang/String;
    //   1531: invokevirtual ZZ : (Ljava/lang/String;)Ljava/lang/String;
    //   1534: aload_0
    //   1535: iconst_3
    //   1536: iconst_3
    //   1537: invokevirtual Zn : (II)I
    //   1540: aload_0
    //   1541: sipush #2513
    //   1544: sipush #2626
    //   1547: invokestatic a : (II)Ljava/lang/String;
    //   1550: invokevirtual ZZ : (Ljava/lang/String;)Ljava/lang/String;
    //   1553: aload_0
    //   1554: iconst_3
    //   1555: iconst_2
    //   1556: invokevirtual Zn : (II)I
    //   1559: aload_0
    //   1560: sipush #2305
    //   1563: sipush #-24918
    //   1566: invokestatic a : (II)Ljava/lang/String;
    //   1569: invokevirtual ZZ : (Ljava/lang/String;)Ljava/lang/String;
    //   1572: aload_0
    //   1573: iconst_3
    //   1574: iconst_1
    //   1575: invokevirtual Zn : (II)I
    //   1578: istore #35
    //   1580: astore #36
    //   1582: istore #37
    //   1584: astore #38
    //   1586: istore #39
    //   1588: astore #40
    //   1590: istore #41
    //   1592: sipush #2512
    //   1595: sipush #8996
    //   1598: invokestatic a : (II)Ljava/lang/String;
    //   1601: iload #41
    //   1603: sipush #2558
    //   1606: sipush #22118
    //   1609: invokestatic a : (II)Ljava/lang/String;
    //   1612: aload #40
    //   1614: sipush #2538
    //   1617: sipush #22675
    //   1620: invokestatic a : (II)Ljava/lang/String;
    //   1623: iload #39
    //   1625: sipush #2351
    //   1628: sipush #-21910
    //   1631: invokestatic a : (II)Ljava/lang/String;
    //   1634: aload #38
    //   1636: sipush #2538
    //   1639: sipush #22675
    //   1642: invokestatic a : (II)Ljava/lang/String;
    //   1645: iload #37
    //   1647: sipush #2351
    //   1650: sipush #-21910
    //   1653: invokestatic a : (II)Ljava/lang/String;
    //   1656: aload #36
    //   1658: sipush #2538
    //   1661: sipush #22675
    //   1664: invokestatic a : (II)Ljava/lang/String;
    //   1667: iload #35
    //   1669: sipush #2490
    //   1672: sipush #27455
    //   1675: invokestatic a : (II)Ljava/lang/String;
    //   1678: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   1683: invokevirtual write : (Ljava/lang/String;)V
    //   1686: aload_0
    //   1687: getfield Zx : Lburp/Zsh9;
    //   1690: getfield ZT : B
    //   1693: iconst_2
    //   1694: if_icmpgt -> 1870
    //   1697: aload_0
    //   1698: getfield ZR : Ljava/io/FileWriter;
    //   1701: aload_0
    //   1702: getfield Ze : I
    //   1705: aload_0
    //   1706: sipush #2443
    //   1709: sipush #-11467
    //   1712: invokestatic a : (II)Ljava/lang/String;
    //   1715: invokevirtual ZZ : (Ljava/lang/String;)Ljava/lang/String;
    //   1718: aload_0
    //   1719: iconst_2
    //   1720: iconst_3
    //   1721: invokevirtual Zn : (II)I
    //   1724: aload_0
    //   1725: sipush #2511
    //   1728: sipush #-25385
    //   1731: invokestatic a : (II)Ljava/lang/String;
    //   1734: invokevirtual ZZ : (Ljava/lang/String;)Ljava/lang/String;
    //   1737: aload_0
    //   1738: iconst_2
    //   1739: iconst_2
    //   1740: invokevirtual Zn : (II)I
    //   1743: aload_0
    //   1744: sipush #2449
    //   1747: sipush #26468
    //   1750: invokestatic a : (II)Ljava/lang/String;
    //   1753: invokevirtual ZZ : (Ljava/lang/String;)Ljava/lang/String;
    //   1756: aload_0
    //   1757: iconst_2
    //   1758: iconst_1
    //   1759: invokevirtual Zn : (II)I
    //   1762: istore #42
    //   1764: astore #43
    //   1766: istore #44
    //   1768: astore #45
    //   1770: istore #46
    //   1772: astore #47
    //   1774: istore #48
    //   1776: sipush #2491
    //   1779: sipush #-22925
    //   1782: invokestatic a : (II)Ljava/lang/String;
    //   1785: iload #48
    //   1787: sipush #2558
    //   1790: sipush #22118
    //   1793: invokestatic a : (II)Ljava/lang/String;
    //   1796: aload #47
    //   1798: sipush #2538
    //   1801: sipush #22675
    //   1804: invokestatic a : (II)Ljava/lang/String;
    //   1807: iload #46
    //   1809: sipush #2351
    //   1812: sipush #-21910
    //   1815: invokestatic a : (II)Ljava/lang/String;
    //   1818: aload #45
    //   1820: sipush #2538
    //   1823: sipush #22675
    //   1826: invokestatic a : (II)Ljava/lang/String;
    //   1829: iload #44
    //   1831: sipush #2351
    //   1834: sipush #-21910
    //   1837: invokestatic a : (II)Ljava/lang/String;
    //   1840: aload #43
    //   1842: sipush #2538
    //   1845: sipush #22675
    //   1848: invokestatic a : (II)Ljava/lang/String;
    //   1851: iload #42
    //   1853: sipush #2490
    //   1856: sipush #27455
    //   1859: invokestatic a : (II)Ljava/lang/String;
    //   1862: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   1867: invokevirtual write : (Ljava/lang/String;)V
    //   1870: aload_0
    //   1871: getfield Zx : Lburp/Zsh9;
    //   1874: getfield ZT : B
    //   1877: iconst_1
    //   1878: if_icmpgt -> 2054
    //   1881: aload_0
    //   1882: getfield ZR : Ljava/io/FileWriter;
    //   1885: aload_0
    //   1886: getfield Ze : I
    //   1889: aload_0
    //   1890: sipush #2334
    //   1893: sipush #-5499
    //   1896: invokestatic a : (II)Ljava/lang/String;
    //   1899: invokevirtual ZZ : (Ljava/lang/String;)Ljava/lang/String;
    //   1902: aload_0
    //   1903: iconst_1
    //   1904: iconst_3
    //   1905: invokevirtual Zn : (II)I
    //   1908: aload_0
    //   1909: sipush #2304
    //   1912: sipush #15526
    //   1915: invokestatic a : (II)Ljava/lang/String;
    //   1918: invokevirtual ZZ : (Ljava/lang/String;)Ljava/lang/String;
    //   1921: aload_0
    //   1922: iconst_1
    //   1923: iconst_2
    //   1924: invokevirtual Zn : (II)I
    //   1927: aload_0
    //   1928: sipush #2311
    //   1931: sipush #-30750
    //   1934: invokestatic a : (II)Ljava/lang/String;
    //   1937: invokevirtual ZZ : (Ljava/lang/String;)Ljava/lang/String;
    //   1940: aload_0
    //   1941: iconst_1
    //   1942: iconst_1
    //   1943: invokevirtual Zn : (II)I
    //   1946: istore #49
    //   1948: astore #50
    //   1950: istore #51
    //   1952: astore #52
    //   1954: istore #53
    //   1956: astore #54
    //   1958: istore #55
    //   1960: sipush #2477
    //   1963: sipush #-25526
    //   1966: invokestatic a : (II)Ljava/lang/String;
    //   1969: iload #55
    //   1971: sipush #2558
    //   1974: sipush #22118
    //   1977: invokestatic a : (II)Ljava/lang/String;
    //   1980: aload #54
    //   1982: sipush #2538
    //   1985: sipush #22675
    //   1988: invokestatic a : (II)Ljava/lang/String;
    //   1991: iload #53
    //   1993: sipush #2351
    //   1996: sipush #-21910
    //   1999: invokestatic a : (II)Ljava/lang/String;
    //   2002: aload #52
    //   2004: sipush #2538
    //   2007: sipush #22675
    //   2010: invokestatic a : (II)Ljava/lang/String;
    //   2013: iload #51
    //   2015: sipush #2351
    //   2018: sipush #-21910
    //   2021: invokestatic a : (II)Ljava/lang/String;
    //   2024: aload #50
    //   2026: sipush #2538
    //   2029: sipush #22675
    //   2032: invokestatic a : (II)Ljava/lang/String;
    //   2035: iload #49
    //   2037: sipush #2490
    //   2040: sipush #27455
    //   2043: invokestatic a : (II)Ljava/lang/String;
    //   2046: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   2051: invokevirtual write : (Ljava/lang/String;)V
    //   2054: aload_0
    //   2055: getfield Zx : Lburp/Zsh9;
    //   2058: getfield Zh : Z
    //   2061: ifeq -> 2237
    //   2064: aload_0
    //   2065: getfield ZR : Ljava/io/FileWriter;
    //   2068: aload_0
    //   2069: getfield Ze : I
    //   2072: aload_0
    //   2073: sipush #2330
    //   2076: sipush #22993
    //   2079: invokestatic a : (II)Ljava/lang/String;
    //   2082: invokevirtual ZZ : (Ljava/lang/String;)Ljava/lang/String;
    //   2085: aload_0
    //   2086: iconst_m1
    //   2087: iconst_3
    //   2088: invokevirtual Zn : (II)I
    //   2091: aload_0
    //   2092: sipush #2526
    //   2095: sipush #-30142
    //   2098: invokestatic a : (II)Ljava/lang/String;
    //   2101: invokevirtual ZZ : (Ljava/lang/String;)Ljava/lang/String;
    //   2104: aload_0
    //   2105: iconst_m1
    //   2106: iconst_2
    //   2107: invokevirtual Zn : (II)I
    //   2110: aload_0
    //   2111: sipush #2553
    //   2114: sipush #-6632
    //   2117: invokestatic a : (II)Ljava/lang/String;
    //   2120: invokevirtual ZZ : (Ljava/lang/String;)Ljava/lang/String;
    //   2123: aload_0
    //   2124: iconst_m1
    //   2125: iconst_1
    //   2126: invokevirtual Zn : (II)I
    //   2129: istore #56
    //   2131: astore #57
    //   2133: istore #58
    //   2135: astore #59
    //   2137: istore #60
    //   2139: astore #61
    //   2141: istore #62
    //   2143: sipush #2503
    //   2146: sipush #26150
    //   2149: invokestatic a : (II)Ljava/lang/String;
    //   2152: iload #62
    //   2154: sipush #2558
    //   2157: sipush #22118
    //   2160: invokestatic a : (II)Ljava/lang/String;
    //   2163: aload #61
    //   2165: sipush #2538
    //   2168: sipush #22675
    //   2171: invokestatic a : (II)Ljava/lang/String;
    //   2174: iload #60
    //   2176: sipush #2351
    //   2179: sipush #-21910
    //   2182: invokestatic a : (II)Ljava/lang/String;
    //   2185: aload #59
    //   2187: sipush #2538
    //   2190: sipush #22675
    //   2193: invokestatic a : (II)Ljava/lang/String;
    //   2196: iload #58
    //   2198: sipush #2351
    //   2201: sipush #-21910
    //   2204: invokestatic a : (II)Ljava/lang/String;
    //   2207: aload #57
    //   2209: sipush #2538
    //   2212: sipush #22675
    //   2215: invokestatic a : (II)Ljava/lang/String;
    //   2218: iload #56
    //   2220: sipush #2490
    //   2223: sipush #27455
    //   2226: invokestatic a : (II)Ljava/lang/String;
    //   2229: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   2234: invokevirtual write : (Ljava/lang/String;)V
    //   2237: aload_0
    //   2238: getfield ZR : Ljava/io/FileWriter;
    //   2241: sipush #2551
    //   2244: sipush #21052
    //   2247: invokestatic a : (II)Ljava/lang/String;
    //   2250: invokevirtual write : (Ljava/lang/String;)V
    //   2253: aload_0
    //   2254: getfield ZR : Ljava/io/FileWriter;
    //   2257: sipush #2509
    //   2260: sipush #25987
    //   2263: invokestatic a : (II)Ljava/lang/String;
    //   2266: invokevirtual write : (Ljava/lang/String;)V
    //   2269: aload_0
    //   2270: new burp/Zry2
    //   2273: dup
    //   2274: aload_0
    //   2275: getfield ZR : Ljava/io/FileWriter;
    //   2278: invokespecial <init> : (Ljava/io/Writer;)V
    //   2281: putfield Zl : Lburp/Zry2;
    //   2284: aload_0
    //   2285: getfield ZR : Ljava/io/FileWriter;
    //   2288: sipush #2516
    //   2291: sipush #5122
    //   2294: invokestatic a : (II)Ljava/lang/String;
    //   2297: invokevirtual write : (Ljava/lang/String;)V
    //   2300: aload_0
    //   2301: iconst_0
    //   2302: invokevirtual Zx : (B)Z
    //   2305: pop
    //   2306: aload_0
    //   2307: getfield ZR : Ljava/io/FileWriter;
    //   2310: sipush #2539
    //   2313: sipush #21528
    //   2316: invokestatic a : (II)Ljava/lang/String;
    //   2319: invokevirtual write : (Ljava/lang/String;)V
    //   2322: aload_0
    //   2323: iconst_1
    //   2324: invokevirtual Zx : (B)Z
    //   2327: ifne -> 2338
    //   2330: iconst_1
    //   2331: goto -> 2339
    //   2334: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2337: athrow
    //   2338: iconst_0
    //   2339: istore_2
    //   2340: new java/util/Date
    //   2343: dup
    //   2344: invokespecial <init> : ()V
    //   2347: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   2350: sipush #2438
    //   2353: sipush #-14077
    //   2356: invokestatic a : (II)Ljava/lang/String;
    //   2359: swap
    //   2360: ldc '.'
    //   2362: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2367: astore_3
    //   2368: iload_2
    //   2369: ifeq -> 2426
    //   2372: aload_0
    //   2373: getfield Zz : I
    //   2376: aload_0
    //   2377: getfield ZA : I
    //   2380: isub
    //   2381: ifle -> 2426
    //   2384: goto -> 2391
    //   2387: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2390: athrow
    //   2391: aload_3
    //   2392: aload_0
    //   2393: getfield Zz : I
    //   2396: aload_0
    //   2397: getfield ZA : I
    //   2400: isub
    //   2401: sipush #2308
    //   2404: sipush #-7106
    //   2407: invokestatic a : (II)Ljava/lang/String;
    //   2410: swap
    //   2411: sipush #2339
    //   2414: sipush #9589
    //   2417: invokestatic a : (II)Ljava/lang/String;
    //   2420: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   2425: astore_3
    //   2426: aload_0
    //   2427: getfield ZR : Ljava/io/FileWriter;
    //   2430: aload_3
    //   2431: invokevirtual write : (Ljava/lang/String;)V
    //   2434: aload_0
    //   2435: getfield ZR : Ljava/io/FileWriter;
    //   2438: sipush #2458
    //   2441: sipush #-28071
    //   2444: invokestatic a : (II)Ljava/lang/String;
    //   2447: invokevirtual write : (Ljava/lang/String;)V
    //   2450: aload_0
    //   2451: getfield Zx : Lburp/Zsh9;
    //   2454: getfield Zc : Z
    //   2457: ifne -> 2471
    //   2460: aload_0
    //   2461: invokevirtual Ze : ()V
    //   2464: goto -> 2471
    //   2467: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2470: athrow
    //   2471: invokestatic Zwu : ()[Lburp/Zbqc;
    //   2474: ifnonnull -> 2500
    //   2477: iload_1
    //   2478: ifeq -> 2496
    //   2481: goto -> 2488
    //   2484: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2487: athrow
    //   2488: iconst_0
    //   2489: goto -> 2497
    //   2492: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2495: athrow
    //   2496: iconst_1
    //   2497: invokestatic ZZ : (Z)V
    //   2500: return
    // Exception table:
    //   from	to	target	type
    //   169	189	192	java/io/IOException
    //   179	206	209	java/io/IOException
    //   196	223	226	java/io/IOException
    //   213	256	259	java/io/IOException
    //   230	273	276	java/io/IOException
    //   263	294	297	java/io/IOException
    //   280	313	313	java/io/IOException
    //   326	349	349	java/io/IOException
    //   1016	1036	1039	java/io/IOException
    //   1208	1280	1283	java/io/IOException
    //   1287	1314	1314	java/io/IOException
    //   2269	2334	2334	java/io/IOException
    //   2368	2384	2387	java/io/IOException
    //   2426	2464	2467	java/io/IOException
    //   2471	2481	2484	java/io/IOException
    //   2477	2492	2492	java/io/IOException
  }
  
  void Ze() {
    boolean bool = Zsh9.ZX();
    try {
      File file1 = this.Zd.getParentFile();
      File file2 = new File(file1, a(2471, 14104));
      try {
        if (!file2.exists())
          file2.mkdir(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      String[] arrayOfString = Zh;
      int i = arrayOfString.length;
      byte b = 0;
      while (b < i) {
        String str = arrayOfString[b];
        byte[] arrayOfByte = Zgyo.ZJ(a(2533, 28524) + a(2533, 28524));
        FileOutputStream fileOutputStream = new FileOutputStream(new File(file2, str));
        fileOutputStream.write(arrayOfByte);
        fileOutputStream.close();
        b++;
        if (!bool)
          break; 
      } 
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private boolean Zx(byte paramByte) throws IOException {
    this.ZH = new int[3];
    Iterator<List> iterator = this.Zc.iterator();
    boolean bool = Zsh9.ZX();
    while (iterator.hasNext()) {
      Zrdb zrdb;
      Zree zree;
      List<Zrdb> list = iterator.next();
      switch (this.Zx.ZQ) {
        case 0:
          zrdb = list.get(0);
          zree = ZQ(zrdb);
          Zc(paramByte, zree.ZZV(), 0, zree);
        case 1:
          zrdb = ((List<Zrdb>)list.get(0)).get(0);
          Zc(paramByte, Zls9.ZV(zrdb.ZaJ()) + Zls9.ZV(zrdb.ZaJ()), 0, (Zree)null);
        case 2:
          zrdb = ((List<Zrdb>)list.get(0)).get(0);
        default:
          Zuh.Zv(false, Zqf.Zk, this.Zx.ZQ);
          break;
      } 
      try {
        if (this.Zx.ZQ == 0)
          continue; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      for (List<Zrdb> list1 : list) {
        Zree zree1 = ZQ(list1.get(0));
        try {
          Zc(paramByte, zree1.ZZV(), 1, zree1);
          if (!ZT(paramByte, list1))
            return false; 
        } catch (IOException iOException) {
          throw a(null);
        } 
        if (!bool)
          break; 
      } 
      if (!bool)
        break; 
      continue;
      if (!ZT(paramByte, (List)SYNTHETIC_LOCAL_VARIABLE_4))
        return false; 
    } 
    return true;
  }
  
  private boolean ZT(byte paramByte, List paramList) throws IOException {
    // Byte code:
    //   0: invokestatic Zq : ()Z
    //   3: istore_3
    //   4: aload_2
    //   5: invokeinterface size : ()I
    //   10: iconst_1
    //   11: if_icmpne -> 181
    //   14: iload_1
    //   15: lookupswitch default -> 168, 0 -> 44, 1 -> 55
    //   40: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   43: athrow
    //   44: iload_3
    //   45: ifeq -> 874
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   54: athrow
    //   55: aload_2
    //   56: iconst_0
    //   57: invokeinterface get : (I)Ljava/lang/Object;
    //   62: checkcast burp/Zrdb
    //   65: astore #4
    //   67: aload_0
    //   68: aload #4
    //   70: invokevirtual Zg : (Lburp/Zrdb;)V
    //   73: aload_0
    //   74: aload #4
    //   76: invokevirtual ZA : (Lburp/Zrdb;)V
    //   79: aload_0
    //   80: aload #4
    //   82: invokevirtual Zn : (Lburp/Zrdb;)V
    //   85: aload_0
    //   86: aload #4
    //   88: invokevirtual ZF : (Lburp/Zrdb;)V
    //   91: aload_0
    //   92: getfield ZR : Ljava/io/FileWriter;
    //   95: sipush #2484
    //   98: sipush #-26271
    //   101: invokestatic a : (II)Ljava/lang/String;
    //   104: invokevirtual write : (Ljava/lang/String;)V
    //   107: aload_0
    //   108: getfield ZR : Ljava/io/FileWriter;
    //   111: invokevirtual flush : ()V
    //   114: aload_0
    //   115: dup
    //   116: getfield ZA : I
    //   119: iconst_1
    //   120: iadd
    //   121: putfield ZA : I
    //   124: aload_0
    //   125: getfield Z_ : Lburp/Zz38;
    //   128: ifnull -> 874
    //   131: aload_0
    //   132: getfield Z_ : Lburp/Zz38;
    //   135: bipush #100
    //   137: aload_0
    //   138: getfield ZA : I
    //   141: imul
    //   142: aload_0
    //   143: getfield Zz : I
    //   146: idiv
    //   147: invokeinterface ZB : (I)Z
    //   152: ifne -> 874
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   161: athrow
    //   162: iconst_0
    //   163: ireturn
    //   164: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   167: athrow
    //   168: iconst_0
    //   169: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   172: iload_1
    //   173: i2l
    //   174: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   177: iload_3
    //   178: ifeq -> 874
    //   181: iload_1
    //   182: lookupswitch default -> 602, 0 -> 212, 1 -> 223
    //   208: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   211: athrow
    //   212: iload_3
    //   213: ifeq -> 618
    //   216: goto -> 223
    //   219: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   222: athrow
    //   223: aload_0
    //   224: getfield ZR : Ljava/io/FileWriter;
    //   227: aload_2
    //   228: invokeinterface size : ()I
    //   233: sipush #2529
    //   236: sipush #30797
    //   239: invokestatic a : (II)Ljava/lang/String;
    //   242: swap
    //   243: sipush #2317
    //   246: sipush #7127
    //   249: invokestatic a : (II)Ljava/lang/String;
    //   252: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   257: invokevirtual write : (Ljava/lang/String;)V
    //   260: aload_2
    //   261: iconst_0
    //   262: invokeinterface get : (I)Ljava/lang/Object;
    //   267: checkcast burp/Zrdb
    //   270: invokeinterface ZaB : ()Lburp/Zmzk;
    //   275: astore #4
    //   277: iconst_1
    //   278: istore #5
    //   280: iload #5
    //   282: aload_2
    //   283: invokeinterface size : ()I
    //   288: if_icmpge -> 348
    //   291: aload_2
    //   292: iload #5
    //   294: invokeinterface get : (I)Ljava/lang/Object;
    //   299: checkcast burp/Zrdb
    //   302: invokeinterface ZaB : ()Lburp/Zmzk;
    //   307: aload #4
    //   309: invokestatic ZI : (Lburp/Zgpi;Lburp/Zgpi;)Z
    //   312: ifne -> 321
    //   315: aconst_null
    //   316: astore #4
    //   318: goto -> 348
    //   321: goto -> 341
    //   324: astore #6
    //   326: aload #6
    //   328: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   331: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   334: aload_0
    //   335: getfield ZB : Lburp/Zr1x;
    //   338: invokevirtual ZV : ()V
    //   341: iinc #5, 1
    //   344: iload_3
    //   345: ifeq -> 280
    //   348: aload_2
    //   349: invokeinterface iterator : ()Ljava/util/Iterator;
    //   354: astore #5
    //   356: aload #5
    //   358: invokeinterface hasNext : ()Z
    //   363: ifeq -> 534
    //   366: aload #5
    //   368: invokeinterface next : ()Ljava/lang/Object;
    //   373: checkcast burp/Zrdb
    //   376: astore #6
    //   378: aload_0
    //   379: getfield ZH : [I
    //   382: aload_0
    //   383: getfield ZK : I
    //   386: dup2
    //   387: iaload
    //   388: iconst_1
    //   389: iadd
    //   390: iastore
    //   391: aload_0
    //   392: getfield Zl : Lburp/Zry2;
    //   395: aload_0
    //   396: aload_0
    //   397: getfield ZK : I
    //   400: iconst_0
    //   401: invokevirtual Zm : (II)Ljava/lang/String;
    //   404: sipush #2306
    //   407: sipush #-1769
    //   410: invokestatic a : (II)Ljava/lang/String;
    //   413: swap
    //   414: sipush #2460
    //   417: sipush #-2926
    //   420: invokestatic a : (II)Ljava/lang/String;
    //   423: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   428: invokevirtual write : (Ljava/lang/String;)V
    //   431: aload #4
    //   433: ifnonnull -> 463
    //   436: aload_0
    //   437: getfield Zl : Lburp/Zry2;
    //   440: aload #6
    //   442: invokeinterface ZaB : ()Lburp/Zmzk;
    //   447: invokeinterface toString : ()Ljava/lang/String;
    //   452: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   455: pop
    //   456: goto -> 463
    //   459: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   462: athrow
    //   463: aload_0
    //   464: getfield Zl : Lburp/Zry2;
    //   467: aload #6
    //   469: invokeinterface Za0 : ()Ljava/lang/String;
    //   474: invokestatic Zy : (Ljava/lang/String;)[B
    //   477: invokestatic ZV : (Ljava/io/Writer;[B)V
    //   480: aload_0
    //   481: getfield Zl : Lburp/Zry2;
    //   484: sipush #2494
    //   487: sipush #-15837
    //   490: invokestatic a : (II)Ljava/lang/String;
    //   493: invokevirtual write : (Ljava/lang/String;)V
    //   496: aload_0
    //   497: getfield Zl : Lburp/Zry2;
    //   500: invokevirtual Zn : ()V
    //   503: goto -> 356
    //   506: astore #6
    //   508: aload #6
    //   510: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   513: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   516: aload_0
    //   517: getfield ZB : Lburp/Zr1x;
    //   520: invokevirtual ZV : ()V
    //   523: aload_0
    //   524: getfield Zl : Lburp/Zry2;
    //   527: invokevirtual Zu : ()V
    //   530: iload_3
    //   531: ifeq -> 356
    //   534: aload_0
    //   535: getfield ZR : Ljava/io/FileWriter;
    //   538: sipush #2493
    //   541: sipush #-1337
    //   544: invokestatic a : (II)Ljava/lang/String;
    //   547: invokevirtual write : (Ljava/lang/String;)V
    //   550: aload_0
    //   551: getfield ZH : [I
    //   554: aload_0
    //   555: getfield ZK : I
    //   558: dup2
    //   559: iaload
    //   560: aload_2
    //   561: invokeinterface size : ()I
    //   566: isub
    //   567: iastore
    //   568: aload_0
    //   569: aload_2
    //   570: iconst_0
    //   571: invokeinterface get : (I)Ljava/lang/Object;
    //   576: checkcast burp/Zrdb
    //   579: invokevirtual Zn : (Lburp/Zrdb;)V
    //   582: aload_0
    //   583: getfield ZR : Ljava/io/FileWriter;
    //   586: sipush #2327
    //   589: sipush #30420
    //   592: invokestatic a : (II)Ljava/lang/String;
    //   595: invokevirtual write : (Ljava/lang/String;)V
    //   598: iload_3
    //   599: ifeq -> 618
    //   602: iconst_0
    //   603: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   606: iload_1
    //   607: i2l
    //   608: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   611: goto -> 618
    //   614: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   617: athrow
    //   618: aload_2
    //   619: invokeinterface iterator : ()Ljava/util/Iterator;
    //   624: astore #4
    //   626: aload #4
    //   628: invokeinterface hasNext : ()Z
    //   633: ifeq -> 874
    //   636: aload #4
    //   638: invokeinterface next : ()Ljava/lang/Object;
    //   643: astore #5
    //   645: aload #5
    //   647: checkcast burp/Zrdb
    //   650: astore #6
    //   652: iload_1
    //   653: lookupswitch default -> 861, 0 -> 680, 1 -> 725
    //   680: aload_0
    //   681: iload_1
    //   682: aload #6
    //   684: invokeinterface ZaB : ()Lburp/Zmzk;
    //   689: invokeinterface toString : ()Ljava/lang/String;
    //   694: aload #6
    //   696: invokeinterface Za0 : ()Ljava/lang/String;
    //   701: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   706: aload_0
    //   707: getfield ZK : I
    //   710: aconst_null
    //   711: invokevirtual Zc : (BLjava/lang/String;ILburp/Zree;)V
    //   714: iload_3
    //   715: ifeq -> 870
    //   718: goto -> 725
    //   721: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   724: athrow
    //   725: aload_0
    //   726: iload_1
    //   727: aload #6
    //   729: invokeinterface ZaB : ()Lburp/Zmzk;
    //   734: invokeinterface toString : ()Ljava/lang/String;
    //   739: aload #6
    //   741: invokeinterface Za0 : ()Ljava/lang/String;
    //   746: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   751: aload_0
    //   752: getfield ZK : I
    //   755: aconst_null
    //   756: invokevirtual Zc : (BLjava/lang/String;ILburp/Zree;)V
    //   759: aload_0
    //   760: aload #6
    //   762: invokevirtual Zg : (Lburp/Zrdb;)V
    //   765: aload_0
    //   766: aload #6
    //   768: invokevirtual ZA : (Lburp/Zrdb;)V
    //   771: aload_0
    //   772: aload #6
    //   774: invokevirtual ZF : (Lburp/Zrdb;)V
    //   777: aload_0
    //   778: getfield ZR : Ljava/io/FileWriter;
    //   781: sipush #2484
    //   784: sipush #-26271
    //   787: invokestatic a : (II)Ljava/lang/String;
    //   790: invokevirtual write : (Ljava/lang/String;)V
    //   793: aload_0
    //   794: getfield ZR : Ljava/io/FileWriter;
    //   797: invokevirtual flush : ()V
    //   800: aload_0
    //   801: dup
    //   802: getfield ZA : I
    //   805: iconst_1
    //   806: iadd
    //   807: putfield ZA : I
    //   810: aload_0
    //   811: getfield Z_ : Lburp/Zz38;
    //   814: ifnull -> 870
    //   817: goto -> 824
    //   820: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   823: athrow
    //   824: aload_0
    //   825: getfield Z_ : Lburp/Zz38;
    //   828: bipush #100
    //   830: aload_0
    //   831: getfield ZA : I
    //   834: imul
    //   835: aload_0
    //   836: getfield Zz : I
    //   839: idiv
    //   840: invokeinterface ZB : (I)Z
    //   845: ifne -> 870
    //   848: goto -> 855
    //   851: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   854: athrow
    //   855: iconst_0
    //   856: ireturn
    //   857: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   860: athrow
    //   861: iconst_0
    //   862: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   865: iload_1
    //   866: i2l
    //   867: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   870: iload_3
    //   871: ifeq -> 626
    //   874: iconst_1
    //   875: ireturn
    // Exception table:
    //   from	to	target	type
    //   4	40	40	java/lang/Exception
    //   14	48	51	java/lang/Exception
    //   67	155	158	java/lang/Exception
    //   131	164	164	java/lang/Exception
    //   168	208	208	java/lang/Exception
    //   181	216	219	java/lang/Exception
    //   291	318	324	java/lang/Exception
    //   366	503	506	java/lang/Exception
    //   378	456	459	java/lang/Exception
    //   534	611	614	java/lang/Exception
    //   652	718	721	java/lang/Exception
    //   680	817	820	java/lang/Exception
    //   725	848	851	java/lang/Exception
    //   824	857	857	java/lang/Exception
  }
  
  private void Zg(Zrdb paramZrdb) {
    // Byte code:
    //   0: invokestatic ZX : ()Z
    //   3: istore_2
    //   4: aload_0
    //   5: aload_1
    //   6: invokevirtual Zj : (Lburp/Zrdb;)Ljava/lang/String;
    //   9: astore #4
    //   11: aload_0
    //   12: getfield Zx : Lburp/Zsh9;
    //   15: getfield Zc : Z
    //   18: ifeq -> 70
    //   21: aload #4
    //   23: iconst_0
    //   24: aload #4
    //   26: sipush #2481
    //   29: sipush #-23419
    //   32: invokestatic a : (II)Ljava/lang/String;
    //   35: invokevirtual indexOf : (Ljava/lang/String;)I
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: sipush #2466
    //   44: sipush #30513
    //   47: invokestatic a : (II)Ljava/lang/String;
    //   50: swap
    //   51: sipush #2469
    //   54: sipush #-10286
    //   57: invokestatic a : (II)Ljava/lang/String;
    //   60: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   65: astore_3
    //   66: iload_2
    //   67: ifne -> 101
    //   70: aload_0
    //   71: aload #4
    //   73: invokevirtual ZZ : (Ljava/lang/String;)Ljava/lang/String;
    //   76: sipush #2450
    //   79: sipush #-11786
    //   82: invokestatic a : (II)Ljava/lang/String;
    //   85: swap
    //   86: sipush #2459
    //   89: sipush #15327
    //   92: invokestatic a : (II)Ljava/lang/String;
    //   95: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   100: astore_3
    //   101: aload_0
    //   102: getfield Zl : Lburp/Zry2;
    //   105: aload_3
    //   106: aload_1
    //   107: invokeinterface ZaJ : ()B
    //   112: invokestatic Zx : (B)Ljava/lang/String;
    //   115: aload_1
    //   116: invokeinterface Zac : ()B
    //   121: invokestatic ZO : (B)Ljava/lang/String;
    //   124: astore #6
    //   126: astore #7
    //   128: astore #8
    //   130: sipush #2313
    //   133: sipush #20602
    //   136: invokestatic a : (II)Ljava/lang/String;
    //   139: aload #8
    //   141: sipush #2535
    //   144: sipush #-14720
    //   147: invokestatic a : (II)Ljava/lang/String;
    //   150: aload #7
    //   152: sipush #2433
    //   155: sipush #25315
    //   158: invokestatic a : (II)Ljava/lang/String;
    //   161: aload #6
    //   163: sipush #2344
    //   166: sipush #932
    //   169: invokestatic a : (II)Ljava/lang/String;
    //   172: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   177: invokevirtual write : (Ljava/lang/String;)V
    //   180: aload_0
    //   181: getfield Zl : Lburp/Zry2;
    //   184: aload_1
    //   185: invokeinterface ZaB : ()Lburp/Zmzk;
    //   190: invokeinterface toString : ()Ljava/lang/String;
    //   195: invokestatic Zy : (Ljava/lang/String;)[B
    //   198: invokestatic ZV : (Ljava/io/Writer;[B)V
    //   201: aload_0
    //   202: getfield Zl : Lburp/Zry2;
    //   205: sipush #2309
    //   208: sipush #25974
    //   211: invokestatic a : (II)Ljava/lang/String;
    //   214: invokevirtual write : (Ljava/lang/String;)V
    //   217: aload_0
    //   218: getfield Zl : Lburp/Zry2;
    //   221: aload_1
    //   222: invokeinterface Zax : ()[B
    //   227: invokestatic ZV : (Ljava/io/Writer;[B)V
    //   230: aload_0
    //   231: getfield Zl : Lburp/Zry2;
    //   234: sipush #2337
    //   237: sipush #31467
    //   240: invokestatic a : (II)Ljava/lang/String;
    //   243: invokevirtual write : (Ljava/lang/String;)V
    //   246: aload_1
    //   247: invokeinterface Za6 : ()Lburp/Zvs;
    //   252: getstatic burp/Zzu2.EXTENSION_GENERATED : Lburp/Zzu2;
    //   255: if_acmpne -> 358
    //   258: aconst_null
    //   259: astore #5
    //   261: aload_1
    //   262: invokeinterface ZaT : ()Lburp/Ztlj;
    //   267: getstatic burp/Ztz3.EXTENSION_NAME : Lburp/Ztz3;
    //   270: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   273: astore #5
    //   275: aload #5
    //   277: ifnonnull -> 307
    //   280: aload_0
    //   281: getfield Zl : Lburp/Zry2;
    //   284: sipush #2436
    //   287: sipush #-27017
    //   290: invokestatic a : (II)Ljava/lang/String;
    //   293: invokevirtual write : (Ljava/lang/String;)V
    //   296: iload_2
    //   297: ifne -> 358
    //   300: goto -> 307
    //   303: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   306: athrow
    //   307: aload_0
    //   308: getfield Zl : Lburp/Zry2;
    //   311: sipush #2483
    //   314: sipush #20738
    //   317: invokestatic a : (II)Ljava/lang/String;
    //   320: invokevirtual write : (Ljava/lang/String;)V
    //   323: aload_0
    //   324: getfield Zl : Lburp/Zry2;
    //   327: aload #5
    //   329: invokestatic Zy : (Ljava/lang/String;)[B
    //   332: invokestatic ZV : (Ljava/io/Writer;[B)V
    //   335: aload_0
    //   336: getfield Zl : Lburp/Zry2;
    //   339: sipush #2457
    //   342: sipush #-29393
    //   345: invokestatic a : (II)Ljava/lang/String;
    //   348: invokevirtual write : (Ljava/lang/String;)V
    //   351: goto -> 358
    //   354: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   357: athrow
    //   358: aload_0
    //   359: getfield Zl : Lburp/Zry2;
    //   362: invokevirtual Zn : ()V
    //   365: goto -> 390
    //   368: astore_3
    //   369: aload_3
    //   370: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   373: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   376: aload_0
    //   377: getfield ZB : Lburp/Zr1x;
    //   380: invokevirtual ZV : ()V
    //   383: aload_0
    //   384: getfield Zl : Lburp/Zry2;
    //   387: invokevirtual Zu : ()V
    //   390: return
    // Exception table:
    //   from	to	target	type
    //   4	365	368	java/lang/Exception
    //   275	300	303	java/lang/Exception
    //   280	351	354	java/lang/Exception
  }
  
  private String ZZ(String paramString) {
    if (this.Zx.Zc) {
      byte[] arrayOfByte = Zgyo.ZJ(a(2472, -22947) + a(2472, -22947));
      arrayOfByte = Zvy.ZZ(arrayOfByte);
      String str = Zkb.ZG(arrayOfByte);
      return a(2451, -196) + a(2451, -196);
    } 
    return a(2541, -2870) + a(2541, -2870);
  }
  
  private void ZA(Zrdb paramZrdb) {
    try {
      if (this.Zx.Za) {
        String str = paramZrdb.Zai();
        try {
          if (str != null) {
            this.Zl.write(a(2307, -18503));
            this.Zl.write(str);
            this.Zl.write(a(2532, 26591));
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
      } 
      this.Zl.Zn();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      this.ZB.ZV();
      this.Zl.Zu();
    } 
    try {
      if (this.Zx.Zf) {
        String str = paramZrdb.ZaR();
        try {
          if (str != null) {
            this.Zl.write(a(2319, -27780));
            this.Zl.write(str);
            this.Zl.write(a(2446, -11069));
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
      } 
      this.Zl.Zn();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      this.ZB.ZV();
      this.Zl.Zu();
    } 
  }
  
  private void Zn(Zrdb paramZrdb) {
    Zree zree = ZQ(paramZrdb);
    try {
      if (this.Zx.Zg) {
        String str = zree.ZZA();
        try {
          if (str != null) {
            try {
            
            } catch (Exception exception) {
              throw a(null);
            } 
            this.Zl.write((paramZrdb.Zai() == null) ? a(2326, -4785) : a(2552, -25988));
            this.Zl.write(a(2476, -29400));
            this.Zl.write(str);
            this.Zl.write(a(2446, -11069));
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
      } 
      this.Zl.Zn();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      this.ZB.ZV();
      this.Zl.Zu();
    } 
    try {
      if (this.Zx.ZL) {
        String str = zree.ZZH();
        try {
          if (str != null) {
            try {
            
            } catch (Exception exception) {
              throw a(null);
            } 
            this.Zl.write((paramZrdb.ZaR() == null) ? a(2536, 4311) : a(2333, -10086));
            this.Zl.write(a(2497, 10562));
            this.Zl.write(str);
            this.Zl.write(a(2446, -11069));
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
      } 
      this.Zl.Zn();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      this.ZB.ZV();
      this.Zl.Zu();
    } 
    try {
      if (this.Zx.Zj) {
        String str = zree.ZZK();
        try {
          if (str != null) {
            this.Zl.write(a(2543, -4437));
            this.Zl.write(a(2497, 10562));
            this.Zl.write(str);
            this.Zl.write(a(2446, -11069));
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
      } 
      this.Zl.Zn();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      this.ZB.ZV();
      this.Zl.Zu();
    } 
    try {
      if (this.Zx.ZR) {
        String str = zree.ZZF();
        try {
          if (str != null) {
            this.Zl.write(a(2453, 16898));
            this.Zl.write(a(2497, 10562));
            this.Zl.write(str);
            this.Zl.write(a(2446, -11069));
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
      } 
      this.Zl.Zn();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      this.ZB.ZV();
      this.Zl.Zu();
    } 
  }
  
  private void ZF(Zrdb paramZrdb) {
    try {
      ZS(paramZrdb);
      Zrux zrux = new Zrux(this, paramZrdb);
      paramZrdb.Za7().Zj(zrux::lambda$writeRequestResponseAndCollaboratorEvents$0);
      this.Zl.Zn();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      this.ZB.ZV();
      this.Zl.Zu();
    } 
  }
  
  private void ZS(Zrdb paramZrdb) {
    Zg3j zg3j = new Zg3j(this);
    paramZrdb.Za7().Zj(zg3j::lambda$writeRequestResponseAndCollaboratorEvents$0);
  }
  
  private void Zc(byte paramByte, String paramString, int paramInt, Zree paramZree) {
    // Byte code:
    //   0: invokestatic ZX : ()Z
    //   3: istore #5
    //   5: iload_1
    //   6: lookupswitch default -> 732, 0 -> 32, 1 -> 299
    //   32: aconst_null
    //   33: astore #6
    //   35: iload_3
    //   36: tableswitch default -> 169, 0 -> 64, 1 -> 95, 2 -> 134
    //   64: aload_0
    //   65: getfield ZH : [I
    //   68: iconst_0
    //   69: dup2
    //   70: iaload
    //   71: iconst_1
    //   72: iadd
    //   73: iastore
    //   74: aload_0
    //   75: getfield ZH : [I
    //   78: iconst_1
    //   79: iconst_0
    //   80: iastore
    //   81: aload_0
    //   82: getfield ZH : [I
    //   85: iconst_0
    //   86: iaload
    //   87: invokestatic toString : (I)Ljava/lang/String;
    //   90: astore #6
    //   92: goto -> 169
    //   95: aload_0
    //   96: getfield ZH : [I
    //   99: iconst_1
    //   100: dup2
    //   101: iaload
    //   102: iconst_1
    //   103: iadd
    //   104: iastore
    //   105: aload_0
    //   106: getfield ZH : [I
    //   109: iconst_2
    //   110: iconst_0
    //   111: iastore
    //   112: aload_0
    //   113: getfield ZH : [I
    //   116: iconst_0
    //   117: iaload
    //   118: aload_0
    //   119: getfield ZH : [I
    //   122: iconst_1
    //   123: iaload
    //   124: <illegal opcode> makeConcatWithConstants : (II)Ljava/lang/String;
    //   129: astore #6
    //   131: goto -> 169
    //   134: aload_0
    //   135: getfield ZH : [I
    //   138: iconst_2
    //   139: dup2
    //   140: iaload
    //   141: iconst_1
    //   142: iadd
    //   143: iastore
    //   144: aload_0
    //   145: getfield ZH : [I
    //   148: iconst_0
    //   149: iaload
    //   150: aload_0
    //   151: getfield ZH : [I
    //   154: iconst_1
    //   155: iaload
    //   156: aload_0
    //   157: getfield ZH : [I
    //   160: iconst_2
    //   161: iaload
    //   162: <illegal opcode> makeConcatWithConstants : (III)Ljava/lang/String;
    //   167: astore #6
    //   169: aload_0
    //   170: getfield ZS : [Ljava/util/List;
    //   173: iload_3
    //   174: aaload
    //   175: aload #6
    //   177: invokeinterface add : (Ljava/lang/Object;)Z
    //   182: pop
    //   183: iload_3
    //   184: aload_0
    //   185: getfield Zx : Lburp/Zsh9;
    //   188: getfield Ze : B
    //   191: if_icmpge -> 748
    //   194: aload_0
    //   195: getfield Zl : Lburp/Zry2;
    //   198: iload_3
    //   199: aload #6
    //   201: aload #6
    //   203: astore #11
    //   205: astore #12
    //   207: istore #13
    //   209: sipush #2495
    //   212: sipush #-31162
    //   215: invokestatic a : (II)Ljava/lang/String;
    //   218: iload #13
    //   220: sipush #2325
    //   223: sipush #8823
    //   226: invokestatic a : (II)Ljava/lang/String;
    //   229: aload #12
    //   231: sipush #2523
    //   234: sipush #-31634
    //   237: invokestatic a : (II)Ljava/lang/String;
    //   240: aload #11
    //   242: sipush #2463
    //   245: sipush #8427
    //   248: invokestatic a : (II)Ljava/lang/String;
    //   251: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   256: invokevirtual write : (Ljava/lang/String;)V
    //   259: aload_2
    //   260: invokestatic Zy : (Ljava/lang/String;)[B
    //   263: astore #7
    //   265: aload_0
    //   266: getfield Zl : Lburp/Zry2;
    //   269: aload #7
    //   271: iconst_0
    //   272: aload #7
    //   274: arraylength
    //   275: invokestatic ZZ : (Ljava/io/Writer;[BII)V
    //   278: aload_0
    //   279: getfield Zl : Lburp/Zry2;
    //   282: sipush #2435
    //   285: sipush #-16684
    //   288: invokestatic a : (II)Ljava/lang/String;
    //   291: invokevirtual write : (Ljava/lang/String;)V
    //   294: iload #5
    //   296: ifne -> 748
    //   299: aload_0
    //   300: getfield ZH : [I
    //   303: iload_3
    //   304: dup2
    //   305: iaload
    //   306: iconst_1
    //   307: iadd
    //   308: iastore
    //   309: aload_0
    //   310: iload_3
    //   311: iconst_0
    //   312: invokevirtual Zm : (II)Ljava/lang/String;
    //   315: astore #6
    //   317: aload_0
    //   318: getfield Zl : Lburp/Zry2;
    //   321: iload_3
    //   322: aload #6
    //   324: aload #6
    //   326: astore #14
    //   328: astore #15
    //   330: istore #16
    //   332: sipush #2312
    //   335: sipush #24756
    //   338: invokestatic a : (II)Ljava/lang/String;
    //   341: iload #16
    //   343: sipush #2515
    //   346: sipush #-10907
    //   349: invokestatic a : (II)Ljava/lang/String;
    //   352: aload #15
    //   354: sipush #2460
    //   357: sipush #-2926
    //   360: invokestatic a : (II)Ljava/lang/String;
    //   363: aload #14
    //   365: sipush #2434
    //   368: sipush #-7217
    //   371: invokestatic a : (II)Ljava/lang/String;
    //   374: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   379: invokevirtual write : (Ljava/lang/String;)V
    //   382: aload #4
    //   384: ifnull -> 415
    //   387: aload #4
    //   389: invokeinterface Za6 : ()Lburp/Zvs;
    //   394: getstatic burp/Zzu2.EXTENSION_GENERATED : Lburp/Zzu2;
    //   397: if_acmpeq -> 415
    //   400: goto -> 407
    //   403: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   406: athrow
    //   407: iconst_1
    //   408: goto -> 416
    //   411: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   414: athrow
    //   415: iconst_0
    //   416: istore #7
    //   418: iload #7
    //   420: ifeq -> 512
    //   423: aload #4
    //   425: invokeinterface ZZV : ()Ljava/lang/String;
    //   430: invokestatic Zw : (Ljava/lang/String;)Ljava/lang/String;
    //   433: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   436: astore #8
    //   438: sipush #2520
    //   441: sipush #346
    //   444: invokestatic a : (II)Ljava/lang/String;
    //   447: iconst_2
    //   448: anewarray java/lang/Object
    //   451: dup
    //   452: iconst_0
    //   453: aload #4
    //   455: invokeinterface Za6 : ()Lburp/Zvs;
    //   460: invokeinterface ZS : ()I
    //   465: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   468: aastore
    //   469: dup
    //   470: iconst_1
    //   471: aload #8
    //   473: aastore
    //   474: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   477: astore #9
    //   479: aload_0
    //   480: getfield Zl : Lburp/Zry2;
    //   483: aload #9
    //   485: sipush #2548
    //   488: sipush #-28306
    //   491: invokestatic a : (II)Ljava/lang/String;
    //   494: swap
    //   495: sipush #2460
    //   498: sipush #-2926
    //   501: invokestatic a : (II)Ljava/lang/String;
    //   504: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   509: invokevirtual write : (Ljava/lang/String;)V
    //   512: aload_2
    //   513: invokestatic Zy : (Ljava/lang/String;)[B
    //   516: astore #8
    //   518: aload_0
    //   519: getfield Zl : Lburp/Zry2;
    //   522: aload #8
    //   524: iconst_0
    //   525: aload #8
    //   527: arraylength
    //   528: invokestatic ZZ : (Ljava/io/Writer;[BII)V
    //   531: iload #7
    //   533: ifeq -> 559
    //   536: aload_0
    //   537: getfield Zl : Lburp/Zry2;
    //   540: sipush #2340
    //   543: sipush #27545
    //   546: invokestatic a : (II)Ljava/lang/String;
    //   549: invokevirtual write : (Ljava/lang/String;)V
    //   552: goto -> 559
    //   555: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   558: athrow
    //   559: aload_0
    //   560: getfield Zl : Lburp/Zry2;
    //   563: sipush #2446
    //   566: sipush #-11069
    //   569: invokestatic a : (II)Ljava/lang/String;
    //   572: invokevirtual write : (Ljava/lang/String;)V
    //   575: aload_0
    //   576: iload_3
    //   577: iconst_m1
    //   578: invokevirtual Zm : (II)Ljava/lang/String;
    //   581: astore #9
    //   583: aload #9
    //   585: ifnull -> 628
    //   588: aload_0
    //   589: getfield Zl : Lburp/Zry2;
    //   592: aload #9
    //   594: sipush #2316
    //   597: sipush #-1922
    //   600: invokestatic a : (II)Ljava/lang/String;
    //   603: swap
    //   604: sipush #2482
    //   607: sipush #-28618
    //   610: invokestatic a : (II)Ljava/lang/String;
    //   613: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   618: invokevirtual write : (Ljava/lang/String;)V
    //   621: goto -> 628
    //   624: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   627: athrow
    //   628: aload_0
    //   629: iload_3
    //   630: iconst_1
    //   631: invokevirtual Zm : (II)Ljava/lang/String;
    //   634: astore #10
    //   636: aload #10
    //   638: ifnull -> 711
    //   641: aload_0
    //   642: getfield Zl : Lburp/Zry2;
    //   645: aload #9
    //   647: ifnonnull -> 673
    //   650: goto -> 657
    //   653: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   656: athrow
    //   657: sipush #2336
    //   660: sipush #6099
    //   663: invokestatic a : (II)Ljava/lang/String;
    //   666: goto -> 682
    //   669: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   672: athrow
    //   673: sipush #2519
    //   676: sipush #20912
    //   679: invokestatic a : (II)Ljava/lang/String;
    //   682: aload #10
    //   684: sipush #2470
    //   687: sipush #-21691
    //   690: invokestatic a : (II)Ljava/lang/String;
    //   693: swap
    //   694: sipush #2508
    //   697: sipush #-32678
    //   700: invokestatic a : (II)Ljava/lang/String;
    //   703: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   708: invokevirtual write : (Ljava/lang/String;)V
    //   711: aload_0
    //   712: getfield Zl : Lburp/Zry2;
    //   715: sipush #2314
    //   718: sipush #-13612
    //   721: invokestatic a : (II)Ljava/lang/String;
    //   724: invokevirtual write : (Ljava/lang/String;)V
    //   727: iload #5
    //   729: ifne -> 748
    //   732: iconst_0
    //   733: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   736: iload_1
    //   737: i2l
    //   738: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   741: goto -> 748
    //   744: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   747: athrow
    //   748: aload_0
    //   749: getfield Zl : Lburp/Zry2;
    //   752: invokevirtual Zn : ()V
    //   755: goto -> 782
    //   758: astore #6
    //   760: aload #6
    //   762: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   765: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   768: aload_0
    //   769: getfield ZB : Lburp/Zr1x;
    //   772: invokevirtual ZV : ()V
    //   775: aload_0
    //   776: getfield Zl : Lburp/Zry2;
    //   779: invokevirtual Zu : ()V
    //   782: return
    // Exception table:
    //   from	to	target	type
    //   5	755	758	java/lang/Exception
    //   332	400	403	java/lang/Exception
    //   387	411	411	java/lang/Exception
    //   518	552	555	java/lang/Exception
    //   583	621	624	java/lang/Exception
    //   636	650	653	java/lang/Exception
    //   641	669	669	java/lang/Exception
    //   711	741	744	java/lang/Exception
  }
  
  private String Zm(int paramInt1, int paramInt2) {
    int i = this.ZH[paramInt1] - 1;
    if (paramInt2 != 0) {
      i += paramInt2;
      if (i < 0 || i >= this.ZS[paramInt1].size())
        return null; 
    } 
    return this.ZS[paramInt1].get(i);
  }
  
  private String Zj(Zrdb paramZrdb) {
    // Byte code:
    //   0: invokestatic Zq : ()Z
    //   3: istore_2
    //   4: sipush #2517
    //   7: sipush #17186
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: astore_3
    //   14: aload_1
    //   15: invokeinterface ZaJ : ()B
    //   20: tableswitch default -> 136, -1 -> 60, 0 -> 136, 1 -> 136, 2 -> 116, 3 -> 96, 4 -> 76
    //   60: aload_3
    //   61: sipush #2342
    //   64: sipush #1925
    //   67: invokestatic a : (II)Ljava/lang/String;
    //   70: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   75: areturn
    //   76: aload_3
    //   77: sipush #2448
    //   80: sipush #-21933
    //   83: invokestatic a : (II)Ljava/lang/String;
    //   86: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   91: astore_3
    //   92: iload_2
    //   93: ifeq -> 152
    //   96: aload_3
    //   97: sipush #2498
    //   100: sipush #-20135
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   111: astore_3
    //   112: iload_2
    //   113: ifeq -> 152
    //   116: aload_3
    //   117: sipush #2329
    //   120: sipush #-25092
    //   123: invokestatic a : (II)Ljava/lang/String;
    //   126: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   131: astore_3
    //   132: iload_2
    //   133: ifeq -> 152
    //   136: aload_3
    //   137: sipush #2338
    //   140: sipush #-14023
    //   143: invokestatic a : (II)Ljava/lang/String;
    //   146: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   151: astore_3
    //   152: aload_1
    //   153: invokeinterface Zac : ()B
    //   158: tableswitch default -> 224, 1 -> 224, 2 -> 204, 3 -> 184
    //   184: aload_3
    //   185: sipush #2474
    //   188: sipush #-26216
    //   191: invokestatic a : (II)Ljava/lang/String;
    //   194: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   199: astore_3
    //   200: iload_2
    //   201: ifeq -> 240
    //   204: aload_3
    //   205: sipush #2328
    //   208: sipush #-26718
    //   211: invokestatic a : (II)Ljava/lang/String;
    //   214: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   219: astore_3
    //   220: iload_2
    //   221: ifeq -> 240
    //   224: aload_3
    //   225: sipush #2361
    //   228: sipush #8177
    //   231: invokestatic a : (II)Ljava/lang/String;
    //   234: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   239: astore_3
    //   240: aload_3
    //   241: sipush #2554
    //   244: sipush #-8391
    //   247: invokestatic a : (II)Ljava/lang/String;
    //   250: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   255: areturn
  }
  
  private int Zn(int paramInt1, int paramInt2) {
    return (int)Math.ceil(this.Zi / this.ZZ * this.ZE.Zs(paramInt1, paramInt2));
  }
  
  void ZY(int paramInt) {
    this.ZZ = 1;
    byte b = 0;
    boolean bool = Zsh9.ZX();
    do {
      int i = (int)Math.pow(10.0D, b);
      int m = 10;
      int j = 1 * i;
      int k = (int)Math.ceil(paramInt / j);
      if (k <= 5 && m <= 10)
        break; 
      this.ZZ = j;
      m = k;
      if (m <= 10)
        break; 
      j = 2 * i;
      k = (int)Math.ceil(paramInt / j);
      if (k <= 5 && m <= 10)
        break; 
      this.ZZ = j;
      m = k;
      if (m <= 10)
        break; 
      j = 5 * i;
      k = (int)Math.ceil(paramInt / j);
      if (k <= 5 && m <= 10)
        break; 
      this.ZZ = j;
      m = k;
      if (m <= 10)
        break; 
      b++;
    } while (bool);
    this.Ze = (int)Math.ceil(paramInt / this.ZZ);
    if (this.Ze < 5)
      this.Ze = 5; 
    this.Zi = 750 / (this.Ze + 1);
  }
  
  private void ZQ() throws IOException {
    StringBuilder stringBuilder = new StringBuilder(ZC);
    int i = stringBuilder.indexOf(a(2360, 29268));
    int j = i + a(2540, -31171).length();
    boolean bool = Zsh9.Zq();
    String str = "";
    if (this.Zx.Zc) {
      StringBuilder stringBuilder1 = new StringBuilder();
      String[] arrayOfString = Zh;
      int k = arrayOfString.length;
      byte b = 0;
      while (b < k) {
        String str1 = arrayOfString[b];
        try {
          if (str1.startsWith(a(2555, -10739)))
            stringBuilder1.append(a(2544, 7839)).append(str1, 0, str1.indexOf('.')).append(a(2530, -7906)).append(ZZ(str1)).append(a(2547, 25042)); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        b++;
        if (bool)
          break; 
      } 
      str = stringBuilder1.toString();
    } 
    stringBuilder.replace(i, j, str);
    this.ZR.write(stringBuilder.toString());
  }
  
  private static void lambda$writeRequestResponseAndCollaboratorEvents$0(Zrmw paramZrmw, Zgkc paramZgkc) {
    paramZgkc.Zu2().Zf(paramZrmw);
  }
  
  static {
    // Byte code:
    //   0: sipush #179
    //   3: anewarray java/lang/String
    //   6: astore #5
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc 'LBúÍ/¤*ü{ZÝ·ë =ð«6ÉR#}C;\\bPÎE¿EË§í°2 Mð70¶#Pv´·ûý}Nü\\fXÑpa ÐB¾1Hl É°·âÐéF[\g\\nKoøêU-1­C^;¥áØÀ¶A¤i¶#}>~-hÓ$þæê±ù*¯%ÞAÊôÓHÈ>b%@Fð2¶ëT[.wfQP5ï·!¶i½Ã\\rê.þïHä\\r¨JR^WJ£xÞ¡!~SAfÇp=eîi½}Hù4ÞA)æ¥ö´\\bêê(\\býò'=Æ«,O8vÈ°:Ü²y.ÿê×È£29<R9MGï\ù°yÔÚ|f°tÜ¾ÙÌ(²m½IÃJÈbûÓ©ë|éxÓ öðý¢.\\t,7é_øK;%_ËÝËï-§ÊÁ_A*G}EÒÁH.©ê&ão¹7'EµR kuó¹²Ch¸°È£ekHhñaä¦w=S­ð}¸L}o$óK»#ÒzzXÊa­\\n G¼-üæ¨8ù)S·1GÇú73ÍÈáñô÷èmë,ÏüC°¹Ðä¦ÕN¼~1¨\\bkÆ¥ø ùªbZ*dzL£93xÒ¿fîûw>ßy8é«X£ú"Oç¹è©*e®¯êÖèß\\bJÃç'X\\rak!ý7­ôÙÃêðLJ>þÿJ\qIv´'ñ.Uà¸{ÛMÕõá[hÚ«mQvg W+çúLâmò°^­õ.ïê_ªMkÉS;ô<C'Jß=A÷ß¦óNî«\\bHåÚiÐSz Mõ<OKÐ+Ya]GJgûá!|mJÍßï« e{ÃYÊ£íØ ?òÍ4\\bCð!Ñx)%Ìßz¥¨"\\fòºÏn©¶nø1\\n~Ý¶ó¸áB³¥¼9{¬æ]¾¿¤bß³\\tß{1¡á»Ñ!8l\N¿-Êýô<Ý­N_µ¿:å¾VÑ\\tÔï&ÆT¸\\bQm{e_°ª`¨<¶m9(R\\nºi:!ÆÌ>þPP¸gýÑk²Ò¦kSü£ÌvÄéØ0±ðÙs0ƒ(½s$¡Ù DÓ4hÔ\\t'^Aq?oJ¦dp¾N­n»WñýuGéMû" Ëiî_F\Møÿ\OCÄÎgÉ)||#bÁàk«ó]#s1­º¬I?´#yó8½ãËF;C\\nÏP%MþÐ¥-ÙOiôWqb²9Aýçñù&CýùÝ¹çMIð\\f6L2TÐÀ½ci¯ð³v. wñ vx´¯{È±ÁÆ1¬<  N¯Ö­Bâ¾ûÄª&¤ ®u)Öoâvê_&%°E´§?­M¨úýzÝ~â¨+ÒÂéÃ¨¦_£èÖ&¼O+\\bË0p¦¦t\\t,ÍÇZ¨\\t3Ëû©lÉÂh°?ÃçW°v²ëMcAÓÌ"$¦àPþâ©iåK$Z,åü\ù \\nÃ_M[ðá%x×9£1P¦Úm¬¦ËzàÃSÅð:¼~;*ÖA9á£Íë©"ÉO$9=ÌY%O}ôÒ{¶Sf:Óê³anÅêÞ8t-8á×ãô*®¥ï)ã8ÛÜQÔhã CÅÂÅzVAü®à>R $+\\t\\f:KQ}PÖågÊÙÚ²¯tU´/<Jîb\\fÆQíë´ËÕ+,³áäwNRr¿¬Êdl\4|0¼®-IvTF\\n-ÞµÊ£góõÊÁ òç Y#G¯ÃÇüw5ÛvÂ9îu82Ô;B«½}i­_©P¬¾µå/kÆIBÕWKvº³º¼J-K×u\\fÁÄÜXë{\\rrÓá¢T ÿÏëU\\bÃü\\rÙÚH@»ãÀí³ÙòÙ¶MãyÅØ(i¿±$K\¥ÆvQ£D$Õ"h5:¯ö3Ë'îµ·*GsêsµÓÉYê´qbÊ:Ê±Øb*cªAé:oCsn#B¬Å³\\rpËÈ;$±6­t9ØèÖPÿY¹bÉ°8¸eá2z:¥ëÂTÜè®pq¨,Å]Bw\\b£jÆz£$4b¦´.>hE+\\fy"ÅÙh$èÁòu5ñá®á~Ò¿÷(ùÆgDª´>!ÆòI½ûò~QC£F¸D?x;\\t  `t*\\t0.Ý#.Å7Ack§\\b2¯DÉÒ7ñ¼î.6'.ìÖÿïYN#´sÀ²X`Ñ;A°x1Â×  ¼­nc'ñ4!c5°æ[·ÓÂIëï\\r^ÄføxÚS´WpfÿÈÔZ\\\fëkÀ´"Éº\\bé÷ÇÖ·6½É¬LÀäc2n4¤?©7|EÕJg¤ßz¿i6DærùÌ¯øI÷; ç$:¦]b ¨;õ{óoëSæ©¶¯*ôëÒÃTÓÐª£¾?¤Î»7B_ëàðûq£n9¦ãÉ«iR)®-\\r¼#±À*»¯ê%BAYôkÓÂôk-P7KÆ¿Ñüª@T¥3_W¨÷z§4ÁV=x(Ö-\\rg}s ÁXmðô7ÜPHßUz%ð(Jþ£¡îÈß©QÔ()«Ï7§(x`Kº°ë}Ý®íC<¤=Qà)øÏ»ªØo þ+ÛPb?^x)çOâÊ}(Ã§\ÉçêñÕN7\\rx\\r\\bjrM±\\rÏÏ8\\r« 8ø±ÂDª-öxøý±=Ö¨.ä=í;\\nò@9°X³}À3N^?n½ß»fõE3io®Dm^}Ü²4 ø@þl¶qÔtµ\\bÄÙ@éx@.æ\\t¨ÅvÇ=Ûö¼¦,>_XHr ·tZ¸î§×ýe+j¯ÿ¯êBt­Â½F!bâÂ¨~ É¨ü~ØþkÂmôì#-ÛUJdHÛ¿swíÌ®hKÒ¦Ð{H~õíT×ökl°©YåW°`iO$ §{i¿2Wª>aðWÉºS'Üa+çXÞ¨1ö;Ð»Z: ÿ0Ìµ¤$(L»MGÉßö\\tR͝W\àrÍàÒm(À^cIô4"'¼ô)«Ä3\\b¯5Ã\\b¨ÿèZÔ«¿sK«}<\\b-,ëSÆ\\f­Ckêç7×Ì²4 "þU³îÍ¼à;\\ta»-ÿÙ\\nê)¶èl2\ÔÅ}LûïÞ?É«\\bvnC·fªhÒâ_©Ðp:Íß\\nï¼¬¸7à3po¯cí¤¯-±!¥ÉËX»k$Ê¹[:hQS¿½ÙÜv:\\nJ:±\\rn£WÝ¾®AERs|%üÒüùæ¢/HkãS?aÈ,ºøª éj°Ã­´ý«Ñï=Ï·«öP¤Ûlh/\\b£º1KMªäRB7mßçáëD?ÄJÝt{R¨^PiðZnüÕâÍÌÖo®Õã­F4¼TÅ=;4Vj-f§ÿ¬jÓßý}¼µë's]IX_"o&Ø½º8VS°Â]â*eÑUæp¶|­üÅÂÙ.A } APR¢îµøjâ5:kDûF_Ã¯«+P\ç»À!P&³2êµÂ&w%IDõW¢\\n¶f9kG«,Å¨YñùXmG¼ÜþÕï`ö§1ü`&7ÆïLóséõ\\br·n¨åQT3Y¨÷zr§8Á×\\rxüß\\rÍR÷­XÎù8µ@ýµÛ2®Eàx¥ø,è+%OÂÂmÊ/Ø½;E"KéüC6^¢O¶ ÄoÕÞuÛî¤»¿BdÈ,¢mùÓ Vçô¹ºqZÜ'ð2Sð1¯ÇçTÍªñ}®GjQ¦È<o²!»KñVò.cíÍóRsùÀÕZäÕD\\n%V8zû2²ÉpW^¸j?Ù\\b2"±eR(¨íc¼¨`£?ÜIiKØ\±ÚÞö¥ALj>sJzÖÇ¤´}þH)¨Õ4åÝGG°t}\\rdèvÿ&ñáËFJ`ç¼mñCáÈñ]@4ðÄ©¦pðHÜ±<¾ù.ôµ¾1(0k6³"ísðú=RF.L'aÊÇr({ZSîÕòºüît?fùþÒïfõ5àPùîcRÚA¿¶Ü¬kÞù\\fw¦3ãtÓ.p|Lºõ¶1d+üxí£¿¦pkþ\û`Ð\\rË_\\f¾+bËNCò¿/uÒÔ#U½®Ö´°è¡ûíyzrc£ù&±ýÒ±½÷Vq|%k:Fÿ¬@1P7ëiÎ'bzBqN'´Hµ@Òº#íKl¯^IÙ{?ñáTp×[`\\r\£ù5¨\\bOÑPÑèÒksé\\f\\bì¥ÚðN¡_"Ü?L·®ò1èÞçsQì\\f9Y\\rû¾Æ¼x/;ÖÔç\\b}ªAÍ¶ÙáôÎËZµî\\r(CaìÎu¯%ÊSïYU6á»ä»Ñµæ)ÿK±FzÛb%æ<^M,oñ}1ÿ¦yô¶Æ/é+_oVrÚm¯E \\nÿ¿CZÄ²ÊXt¿ü8²#08(ÝÓ\¦s¶2Â³Ùé3oÒaQT¨?]4®Ûêë?(\\rÜ÷5Ãõ®À¹làl?á8 k_+>\\tzIãg­CP£ÆÎ¨Äg#îÿÐ3í±RÓK$f='YXþð»»ÄBHñþì¹'«7\\b>Í{ðp\é½¾Ü\\fî¸Å(lÇç5\\nqZ=`£9m}ûD`Ùm0ÊbôÃØ¶þ±â½/ äÖ\\r5kôlxè\\bÐåêàX\\rÔf 0¨"gÎ®rH8ëïÔåørR ¿Äè}\\fsÁ#SÖ]¡|d¨õª¡SÓWqr»!ö2Ðk®áÞDY=¡Â<VÚÄªëbr~nÐÉ»¿ÉBXý$ê¡ÂZ!\\nOk³½Ï\cE&Êñ4ð¹çoüÿß²ä%çs¬IÍAjà:ö[}2àYù:ã1Eà!ñ¡NÝ¾UÒüçjÛUãt½ C&ÝÂñLèTá²\\rü¹(8.©yÍt©sù\\nÏ¬É©J\\n¥yó¡äD MoïÛ­¬\\nÄn::áyáÊmý®g4c:ió".»JÐ*ãt²ý,KxÆG¼é®ç4s1oð|Wó#sÎvÔC?<^l51ÓA¬!}Rê¤ë§ÕN&¹û>½(@kX4¦ÒÉ(öC?Oìnëø­¦^6?ä\\tögÃ5%kÊòýÁ]×A"¦Ð\\nd3fçÊ@ÁBëºý~íùÀäê¶]ëÅXo¯¸S±ËÏ+K7¡/XÛO¬ðìÿëDüüMÍ§]UgÌwh0ló¹Êì?ü¾32ûlêùiàïe¥#ì\\nüÃõmÊR¿;WÈZìgã mÿø©2{ó*\\fM\\t¾{{Íte|Z3þ(¶æaë³ù\\n4ýÎqîù×io¥­Q!jüã\\t·6ÂÊÅU©yÈ!ÝÂÕO{!ÞÂÖ·üCÔöñ\\bCüIÔè³­ÉE\\bf ¶\\nRv 1!\Ûÿö¢Ýú9¿(A5Bm\\bMROgu\\fÒß4ï;:Ã©tRZó üåªp¸>+´ZZ¯vÝo2Eºö;lÉ(Ó¬_~£¾Âú³ÅÝrQçópÇ_`}tö{ùÍ3¿MÔI;'ÔfA£!Âgª}\\by\\brë;(ýù¾§,\\t^SH_¾åÜÅÏÂZ°¤ãFZT*;Aá.â7½l, 'ÞíZmrèL3HMHoLéêSÂ çWºL´Á`=ÍÔè¸ÉhXÏkªÊ/fç ' ?r|¤Ë7Ø²Böx(\è}ê÷Å\\n[ª¡õ¸Ò\\bpµwXDü £ýùÉ¬ÏKûÓP«Ì¦%ÆöÜ@ÖPP\\nÙ?öÞ.¤99g]<pÁ/þ¯\\rÚy\\t»©pÆv<ó\\rù?{|*Ù\\n`gâðGî{ô -)ûQ´!~½Õ³­5¹ÐÝæ5H|Ñ'Ñ#À""àÛºFü9W«å¢=ok~($ xE6z¿¦\\f£ S|[`c?Ý´bÛ)QFrf¤ÊÕþfp«\\fÀÂ üúó&ôGÕG£Ý¤¢>ÚÜH°\\r#¸QÇx0¡XqdÜsG¢^Æ&3&½¬Ûì¢ù=Þ(i\\b]Ù89v¼l`Z'/å`ÁÑÐ-Ô)ÿcO÷£¢¶h 8Ä¾s5Ì±<Ïª!%¼\\fñwe^þU®åUVíÒðü5í}&?qREoÜùx\\rs|Ú5ÓØ6\\n-M:*)a§ï6\\rõäÌØçÖÅ4 âxlä®á Aö°Qôk¾âCgÄû<ÐïbuïßP~K2.Ø,fõ¯ Èl$K>F]ñNçÒÔûá"9Hð(AälklâÈ'ßø>Ñk§3NÆO[ä¬|ñ{÷~;ÍìoÞ[Û­µ ¥cö ÐÑ7ægA\E\\n£¨Q¾çîÊ\\f`lô>0-DûFó­8ÚÎV!Ì¬,©gÝÚÞ~b%(Úc­7´>çº'p5ò*;@*ÁÜ¶^¤TçáÙ\\n\\b#*V9n5ùóöm¼¹Òßàxr+Ì¦wmUò£xózqÈ¸)æ9J2Ö:à|Ë/-Bc/´oëúÖ¯3Æ4©©K¯£CK6%nÀùìíEqåö{6%âAª@"ÏãHº±/æÊôjH/< \\nÄ|Yp½ck+Âû&3Õô[Sæ¸nÓ5AdBÔÏÏª9¯ÃýáÖðíØjÇØÃ/ÖI¨"lþ¢øZ\\tå-Îé±ùÛÑlUUUãc ­!ìôr`9¿ôñ"ûJZäzÑEW+ÌùJBkÏ@¼=:/â¦½d[¤®ÈÑ/Ó|N;\\t&´òðÖöÁ¨B»23§vX½7©Q9ÞË­êCÜÚâásí¨n©ßgÿrù?[TÅ`úRÆWZO/ßybFã«'Ñ£=¥R5>tª~aêÂ¡i1ro`5Y<<Þ<Î\\r}ç·ñTù:ë÷­[\\nDiÌÅ&/Â\\r.\\tÓQEæLá¡ul.p½h!f²v\\bæ4?Z£ÖAÅò-¯i\\n£PÌÖd¢êhq¸7ùÎ¯^ÊfÈ©ã4\\nErc$¡`«Z%VÁ+·ÖübN\\fó(²).zñûåÝz\\t d\\n.´ ·5âàç8fûÓæ¡ø^à<'Ñs6j­}+ÛoP×È7¶"ùþ/ÏÚ®ñ­îõJ\\t+\\n;5;²s¨snBÚÄÔ÷¬LÁú-²XGãÙGF%¢T uÞL©ÂÆ#uó3{sÈ¬`Í¹2êÔjÊ·"z'&þ÷Q¥P¾Z*³qÆ(Ë;ò»! ¢IñÉûª´&P÷ á¼¿"`gÃëca4°ÿIÙOBÂ°oÙ§cÎÁs\\n¦µÏÔÅQx¶V¨Ìö=Â²³;~füàï!`:àù648ü~ðÕhÝHPëþ_1å²HîÇý,y°gÖa³ b½ÝSçËè±ê÷ké±Õ@ØHì¿®_ow>¾®\\b=Õ|LêéÙ_MrÀd<{Ý' ØÿV78àu Xo-r¹2á×ÝL7 ÈÌè3ªÚL^=Ä÷g¨Ñô£ÆéN©Vy£Ï\\b<1C ÄT¬>U·­kÅpÞØüyéSÁ8"Bt¼ÎÂlº¡±¥(²ú½¡P!ûòª(|û¯VìÿMFB* /uîÉ¨²|Îè!Ô[þùF9tâå¡ë Qÿ%s-@iõ\\b{XÚô+ÓêÉWi~¾ÍLè¦¿# O`èp«Ïû\\rY->`¬K¤#VÏèb\\r¹[ª Yn\\bï S!.!JÏ«ä©\\r½]¯{êLÉüR-}Þx(uáÄù0t4%¸9Ç8¢;ìS®Ùè©}k\\t{ô*0Q[tû¦å(½«µ÷ÂðóD®1>Ä/îÌYûg^O!tô{#³$;ïÕÊÁhö\\t:¿\\b_¬i³j§Ï$æaÍðùSTÒ¾idd^¿6ÎîËÈ`Þz^V.Å"îEsª¡Ë#Àú)\\n¡#\\t=3Mûy`Êãý\\rÕÚmeµN¹a®uq²¼,G\\rB}\\bâjäy¯Èû"Ó¹C~Sû1P\\f\\fEO·?¶ÖXl-F§|!x{/sN±9^IäøZÌÑ»¾tûÉW×Ù&o%ÕÉ§X­§ó¶Ù¡ãjÎ¼f¹¸ÊyN[ªÃ²{3\\r:µ²7"4ë¸x©ñÂÚ>À6Æ7§×áæa_<´­H'ë­¼ÓGY¢ì§ü\\bù=°î²äôï9fÓÂÍV²³mÄíÈ'q­,ÇÄÚðÎ¨.øæÕ)XXÍÌÌÌea.2d'4móE\\bR'ø!õ¹n((ÙÂv3|QôýÎ ¬"JôKy\\f"~P:3£4z«ûùtG\\f]ÎÏ½üêÚÂ­j¾z+'aÔ)HÄ+Ú5¦õ¼ÆgàÝÒËßUx³(çx`çzÉ¦³|ÌJ/'3{Eæ\¬S©É¨ðßù2D2uJüûÍ·^í¡Ùª«½Ê²#¾â±á\\n[{4)êyHT[³Bi*ì¯h þ(dM¼"»~(þ\\tÊZrHQkÇc®8}óåÒøÄÂ-×ILÃË&·HMÄp$eÞù\\nÀ¯\\b~£ æÙ@èuÅbõmQ-Ð\>Ä\\bÏRvùÄoe¾ðÕëß,«át\\b5Ry÷°îI÷«Ý¿N±)b\\t\¾éûXÀçE^BÆöþ<ÛÍl~¶hvÙóRRp´i[-Dâ&¶¦÷b'ðÂR`µâ¦5«º@ï1^ïy~´_üøèzh±±ÃSîa5ZËÏ£QÎ¶\\n«¹~õ!AJf5¼~\\f5>ñ\\rÙmAm§Ï¸òõyn&0,p¬÷d(n¦'I46c×°º[<Ù°@ÁXW«¯÷ÓZfè&gð0^K Ñ \\t·d!ºtSÜÑäkË$¡êËñç^=5·ð°îE\\nÌ×õå@ÖPF'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: bipush #17
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #84
    //   26: iinc #0, 1
    //   29: aload_2
    //   30: iload_0
    //   31: dup
    //   32: iload_1
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 145
    //   41: aload #5
    //   43: swap
    //   44: iload_3
    //   45: iinc #3, 1
    //   48: swap
    //   49: aastore
    //   50: iload_0
    //   51: iload_1
    //   52: iadd
    //   53: dup
    //   54: istore_0
    //   55: iload #4
    //   57: if_icmpge -> 69
    //   60: aload_2
    //   61: iload_0
    //   62: invokevirtual charAt : (I)C
    //   65: istore_1
    //   66: goto -> 24
    //   69: ldc 'ä (ÜÄOx§ÇÅ)´u æçNOàþÇpñ.Å{\\f/±³ÍQæä gCUÅ-'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: bipush #25
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #63
    //   85: iinc #0, 1
    //   88: aload_2
    //   89: iload_0
    //   90: dup
    //   91: iload_1
    //   92: iadd
    //   93: invokevirtual substring : (II)Ljava/lang/String;
    //   96: iconst_0
    //   97: goto -> 145
    //   100: aload #5
    //   102: swap
    //   103: iload_3
    //   104: iinc #3, 1
    //   107: swap
    //   108: aastore
    //   109: iload_0
    //   110: iload_1
    //   111: iadd
    //   112: dup
    //   113: istore_0
    //   114: iload #4
    //   116: if_icmpge -> 128
    //   119: aload_2
    //   120: iload_0
    //   121: invokevirtual charAt : (I)C
    //   124: istore_1
    //   125: goto -> 83
    //   128: aload #5
    //   130: putstatic burp/Zb0l.a : [Ljava/lang/String;
    //   133: sipush #179
    //   136: anewarray java/lang/String
    //   139: putstatic burp/Zb0l.b : [Ljava/lang/String;
    //   142: goto -> 304
    //   145: dup_x2
    //   146: pop
    //   147: invokevirtual toCharArray : ()[C
    //   150: dup_x1
    //   151: arraylength
    //   152: dup_x2
    //   153: pop
    //   154: iconst_0
    //   155: istore #6
    //   157: dup2_x1
    //   158: pop2
    //   159: dup_x2
    //   160: iconst_1
    //   161: if_icmpgt -> 263
    //   164: dup2
    //   165: swap
    //   166: iload #6
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #6
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #72
    //   218: goto -> 247
    //   221: bipush #74
    //   223: goto -> 247
    //   226: bipush #106
    //   228: goto -> 247
    //   231: bipush #120
    //   233: goto -> 247
    //   236: bipush #117
    //   238: goto -> 247
    //   241: bipush #61
    //   243: goto -> 247
    //   246: iconst_2
    //   247: ixor
    //   248: ixor
    //   249: i2c
    //   250: castore
    //   251: iinc #6, 1
    //   254: dup
    //   255: ifne -> 263
    //   258: dup2
    //   259: dup_x1
    //   260: goto -> 168
    //   263: dup2_x1
    //   264: pop2
    //   265: dup_x2
    //   266: iload #6
    //   268: if_icmpgt -> 164
    //   271: pop
    //   272: new java/lang/String
    //   275: dup_x1
    //   276: swap
    //   277: invokespecial <init> : ([C)V
    //   280: invokevirtual intern : ()Ljava/lang/String;
    //   283: swap
    //   284: pop
    //   285: swap
    //   286: tableswitch default -> 41, 0 -> 100
    //   304: new java/lang/String
    //   307: dup
    //   308: sipush #2480
    //   311: sipush #-11168
    //   314: invokestatic a : (II)Ljava/lang/String;
    //   317: invokestatic ZJ : (Ljava/lang/String;)[B
    //   320: invokespecial <init> : ([B)V
    //   323: putstatic burp/Zb0l.ZC : Ljava/lang/String;
    //   326: bipush #26
    //   328: anewarray java/lang/String
    //   331: dup
    //   332: iconst_0
    //   333: sipush #2500
    //   336: sipush #-16070
    //   339: invokestatic a : (II)Ljava/lang/String;
    //   342: aastore
    //   343: dup
    //   344: iconst_1
    //   345: sipush #2461
    //   348: sipush #16427
    //   351: invokestatic a : (II)Ljava/lang/String;
    //   354: aastore
    //   355: dup
    //   356: iconst_2
    //   357: sipush #2452
    //   360: sipush #28384
    //   363: invokestatic a : (II)Ljava/lang/String;
    //   366: aastore
    //   367: dup
    //   368: iconst_3
    //   369: sipush #2350
    //   372: sipush #23695
    //   375: invokestatic a : (II)Ljava/lang/String;
    //   378: aastore
    //   379: dup
    //   380: iconst_4
    //   381: sipush #2510
    //   384: sipush #-12620
    //   387: invokestatic a : (II)Ljava/lang/String;
    //   390: aastore
    //   391: dup
    //   392: iconst_5
    //   393: sipush #2349
    //   396: sipush #-30038
    //   399: invokestatic a : (II)Ljava/lang/String;
    //   402: aastore
    //   403: dup
    //   404: bipush #6
    //   406: sipush #2489
    //   409: sipush #27847
    //   412: invokestatic a : (II)Ljava/lang/String;
    //   415: aastore
    //   416: dup
    //   417: bipush #7
    //   419: sipush #2505
    //   422: sipush #-16488
    //   425: invokestatic a : (II)Ljava/lang/String;
    //   428: aastore
    //   429: dup
    //   430: bipush #8
    //   432: sipush #2442
    //   435: sipush #13395
    //   438: invokestatic a : (II)Ljava/lang/String;
    //   441: aastore
    //   442: dup
    //   443: bipush #9
    //   445: sipush #2465
    //   448: sipush #7680
    //   451: invokestatic a : (II)Ljava/lang/String;
    //   454: aastore
    //   455: dup
    //   456: bipush #10
    //   458: sipush #2455
    //   461: sipush #7830
    //   464: invokestatic a : (II)Ljava/lang/String;
    //   467: aastore
    //   468: dup
    //   469: bipush #11
    //   471: sipush #2502
    //   474: sipush #9029
    //   477: invokestatic a : (II)Ljava/lang/String;
    //   480: aastore
    //   481: dup
    //   482: bipush #12
    //   484: sipush #2549
    //   487: bipush #44
    //   489: invokestatic a : (II)Ljava/lang/String;
    //   492: aastore
    //   493: dup
    //   494: bipush #13
    //   496: sipush #2447
    //   499: sipush #7445
    //   502: invokestatic a : (II)Ljava/lang/String;
    //   505: aastore
    //   506: dup
    //   507: bipush #14
    //   509: sipush #2456
    //   512: sipush #20495
    //   515: invokestatic a : (II)Ljava/lang/String;
    //   518: aastore
    //   519: dup
    //   520: bipush #15
    //   522: sipush #2321
    //   525: sipush #-9179
    //   528: invokestatic a : (II)Ljava/lang/String;
    //   531: aastore
    //   532: dup
    //   533: bipush #16
    //   535: sipush #2485
    //   538: sipush #-3511
    //   541: invokestatic a : (II)Ljava/lang/String;
    //   544: aastore
    //   545: dup
    //   546: bipush #17
    //   548: sipush #2527
    //   551: sipush #-25964
    //   554: invokestatic a : (II)Ljava/lang/String;
    //   557: aastore
    //   558: dup
    //   559: bipush #18
    //   561: sipush #2363
    //   564: sipush #3896
    //   567: invokestatic a : (II)Ljava/lang/String;
    //   570: aastore
    //   571: dup
    //   572: bipush #19
    //   574: sipush #2542
    //   577: sipush #5897
    //   580: invokestatic a : (II)Ljava/lang/String;
    //   583: aastore
    //   584: dup
    //   585: bipush #20
    //   587: sipush #2439
    //   590: sipush #23954
    //   593: invokestatic a : (II)Ljava/lang/String;
    //   596: aastore
    //   597: dup
    //   598: bipush #21
    //   600: sipush #2440
    //   603: sipush #-6297
    //   606: invokestatic a : (II)Ljava/lang/String;
    //   609: aastore
    //   610: dup
    //   611: bipush #22
    //   613: sipush #2445
    //   616: sipush #-22569
    //   619: invokestatic a : (II)Ljava/lang/String;
    //   622: aastore
    //   623: dup
    //   624: bipush #23
    //   626: sipush #2335
    //   629: sipush #21264
    //   632: invokestatic a : (II)Ljava/lang/String;
    //   635: aastore
    //   636: dup
    //   637: bipush #24
    //   639: sipush #2525
    //   642: sipush #21719
    //   645: invokestatic a : (II)Ljava/lang/String;
    //   648: aastore
    //   649: dup
    //   650: bipush #25
    //   652: sipush #2479
    //   655: sipush #-17540
    //   658: invokestatic a : (II)Ljava/lang/String;
    //   661: aastore
    //   662: putstatic burp/Zb0l.Zh : [Ljava/lang/String;
    //   665: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x989) & 0xFFFF;
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
      byte b1 = 75;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb0l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */