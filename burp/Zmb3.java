package burp;

import java.util.Collection;
import java.util.List;

public class Zmb3 extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: invokestatic Zz : ()[Ljava/lang/String;
    //   3: astore #11
    //   5: aload #5
    //   7: invokevirtual Zs : ()Z
    //   10: ifne -> 22
    //   13: iconst_0
    //   14: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   17: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   20: aconst_null
    //   21: areturn
    //   22: aload #5
    //   24: invokevirtual Zt : ()Lburp/Zt38;
    //   27: astore #12
    //   29: new java/util/ArrayList
    //   32: dup
    //   33: invokespecial <init> : ()V
    //   36: astore #13
    //   38: new java/util/ArrayList
    //   41: dup
    //   42: invokespecial <init> : ()V
    //   45: astore #14
    //   47: aload #12
    //   49: invokeinterface ZCr : ()Lburp/Zefg;
    //   54: invokeinterface iterator : ()Ljava/util/Iterator;
    //   59: astore #15
    //   61: aload #15
    //   63: invokeinterface hasNext : ()Z
    //   68: ifeq -> 103
    //   71: aload #15
    //   73: invokeinterface next : ()Ljava/lang/Object;
    //   78: checkcast burp/Zsdr
    //   81: astore #16
    //   83: aload_0
    //   84: aload #16
    //   86: invokeinterface toString : ()Ljava/lang/String;
    //   91: aload #13
    //   93: aload #14
    //   95: invokevirtual Zk : (Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;)V
    //   98: aload #11
    //   100: ifnull -> 61
    //   103: new java/lang/StringBuilder
    //   106: dup
    //   107: sipush #-18371
    //   110: sipush #4456
    //   113: invokestatic a : (II)Ljava/lang/String;
    //   116: invokespecial <init> : (Ljava/lang/String;)V
    //   119: astore #15
    //   121: aload #13
    //   123: invokeinterface isEmpty : ()Z
    //   128: ifne -> 287
    //   131: aload #15
    //   133: sipush #-18383
    //   136: sipush #28870
    //   139: invokestatic a : (II)Ljava/lang/String;
    //   142: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: pop
    //   146: aload #15
    //   148: aload #13
    //   150: invokeinterface size : ()I
    //   155: iconst_1
    //   156: if_icmpne -> 171
    //   159: sipush #-18386
    //   162: sipush #19867
    //   165: invokestatic a : (II)Ljava/lang/String;
    //   168: goto -> 180
    //   171: sipush #-18396
    //   174: sipush #-3802
    //   177: invokestatic a : (II)Ljava/lang/String;
    //   180: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: pop
    //   184: aload #15
    //   186: sipush #-18400
    //   189: sipush #4437
    //   192: invokestatic a : (II)Ljava/lang/String;
    //   195: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: pop
    //   199: aload #13
    //   201: invokeinterface iterator : ()Ljava/util/Iterator;
    //   206: astore #16
    //   208: aload #16
    //   210: invokeinterface hasNext : ()Z
    //   215: ifeq -> 272
    //   218: aload #16
    //   220: invokeinterface next : ()Ljava/lang/Object;
    //   225: checkcast java/lang/String
    //   228: astore #17
    //   230: aload #15
    //   232: sipush #-18375
    //   235: sipush #-3271
    //   238: invokestatic a : (II)Ljava/lang/String;
    //   241: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   244: pop
    //   245: aload #15
    //   247: aload #17
    //   249: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   252: aload #15
    //   254: sipush #-18395
    //   257: sipush #30958
    //   260: invokestatic a : (II)Ljava/lang/String;
    //   263: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: pop
    //   267: aload #11
    //   269: ifnull -> 208
    //   272: aload #15
    //   274: sipush #-18393
    //   277: sipush #2510
    //   280: invokestatic a : (II)Ljava/lang/String;
    //   283: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   286: pop
    //   287: aload #14
    //   289: invokeinterface isEmpty : ()Z
    //   294: ifne -> 498
    //   297: aload #13
    //   299: invokeinterface isEmpty : ()Z
    //   304: ifne -> 327
    //   307: aload #15
    //   309: sipush #-18369
    //   312: sipush #15913
    //   315: invokestatic a : (II)Ljava/lang/String;
    //   318: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   321: pop
    //   322: aload #11
    //   324: ifnull -> 342
    //   327: aload #15
    //   329: sipush #-18391
    //   332: sipush #-12362
    //   335: invokestatic a : (II)Ljava/lang/String;
    //   338: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   341: pop
    //   342: aload #15
    //   344: sipush #-18381
    //   347: sipush #-17190
    //   350: invokestatic a : (II)Ljava/lang/String;
    //   353: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   356: pop
    //   357: aload #15
    //   359: aload #14
    //   361: invokeinterface size : ()I
    //   366: iconst_1
    //   367: if_icmpne -> 382
    //   370: sipush #-18387
    //   373: sipush #-16088
    //   376: invokestatic a : (II)Ljava/lang/String;
    //   379: goto -> 391
    //   382: sipush #-18392
    //   385: sipush #4349
    //   388: invokestatic a : (II)Ljava/lang/String;
    //   391: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   394: pop
    //   395: aload #15
    //   397: sipush #-18376
    //   400: sipush #-15929
    //   403: invokestatic a : (II)Ljava/lang/String;
    //   406: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   409: pop
    //   410: aload #14
    //   412: invokeinterface iterator : ()Ljava/util/Iterator;
    //   417: astore #16
    //   419: aload #16
    //   421: invokeinterface hasNext : ()Z
    //   426: ifeq -> 483
    //   429: aload #16
    //   431: invokeinterface next : ()Ljava/lang/Object;
    //   436: checkcast java/lang/String
    //   439: astore #17
    //   441: aload #15
    //   443: sipush #-18375
    //   446: sipush #-3271
    //   449: invokestatic a : (II)Ljava/lang/String;
    //   452: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   455: pop
    //   456: aload #15
    //   458: aload #17
    //   460: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   463: aload #15
    //   465: sipush #-18395
    //   468: sipush #30958
    //   471: invokestatic a : (II)Ljava/lang/String;
    //   474: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   477: pop
    //   478: aload #11
    //   480: ifnull -> 419
    //   483: aload #15
    //   485: sipush #-18393
    //   488: sipush #2510
    //   491: invokestatic a : (II)Ljava/lang/String;
    //   494: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   497: pop
    //   498: aload #15
    //   500: aload #4
    //   502: aload #5
    //   504: sipush #-18385
    //   507: sipush #-21638
    //   510: invokestatic a : (II)Ljava/lang/String;
    //   513: invokestatic ZE : (Ljava/lang/StringBuilder;Lburp/Ztlj;Lburp/Ztub;Ljava/lang/String;)V
    //   516: aload #15
    //   518: invokevirtual toString : ()Ljava/lang/String;
    //   521: areturn
  }
  
  private void Zk(String paramString, Collection<String> paramCollection1, Collection<String> paramCollection2) {
    // Byte code:
    //   0: invokestatic Zz : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: aload_1
    //   6: sipush #-18384
    //   9: sipush #-7934
    //   12: invokestatic a : (II)Ljava/lang/String;
    //   15: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   18: ifeq -> 49
    //   21: aload_2
    //   22: aload_1
    //   23: sipush #-18394
    //   26: sipush #-18416
    //   29: invokestatic a : (II)Ljava/lang/String;
    //   32: invokevirtual length : ()I
    //   35: invokevirtual substring : (I)Ljava/lang/String;
    //   38: invokeinterface add : (Ljava/lang/Object;)Z
    //   43: pop
    //   44: aload #4
    //   46: ifnull -> 101
    //   49: aload_1
    //   50: sipush #-18388
    //   53: sipush #27113
    //   56: invokestatic a : (II)Ljava/lang/String;
    //   59: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   62: ifeq -> 93
    //   65: aload_3
    //   66: aload_1
    //   67: sipush #-18374
    //   70: sipush #31984
    //   73: invokestatic a : (II)Ljava/lang/String;
    //   76: invokevirtual length : ()I
    //   79: invokevirtual substring : (I)Ljava/lang/String;
    //   82: invokeinterface add : (Ljava/lang/Object;)Z
    //   87: pop
    //   88: aload #4
    //   90: ifnull -> 101
    //   93: iconst_0
    //   94: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   97: aload_1
    //   98: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   101: return
  }
  
  public String Z_(List<Zrdb> paramList) {
    // Byte code:
    //   0: new java/util/TreeSet
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic Zz : ()[Ljava/lang/String;
    //   11: new java/util/TreeSet
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #4
    //   20: astore_2
    //   21: aload_1
    //   22: invokeinterface iterator : ()Ljava/util/Iterator;
    //   27: astore #5
    //   29: aload #5
    //   31: invokeinterface hasNext : ()Z
    //   36: ifeq -> 121
    //   39: aload #5
    //   41: invokeinterface next : ()Ljava/lang/Object;
    //   46: checkcast burp/Zrdb
    //   49: astore #6
    //   51: aload #6
    //   53: invokeinterface Za7 : ()Lburp/Ztub;
    //   58: invokevirtual Zt : ()Lburp/Zt38;
    //   61: invokeinterface ZCr : ()Lburp/Zefg;
    //   66: astore #7
    //   68: aload #7
    //   70: invokeinterface iterator : ()Ljava/util/Iterator;
    //   75: astore #8
    //   77: aload #8
    //   79: invokeinterface hasNext : ()Z
    //   84: ifeq -> 117
    //   87: aload #8
    //   89: invokeinterface next : ()Ljava/lang/Object;
    //   94: checkcast burp/Zsdr
    //   97: astore #9
    //   99: aload_0
    //   100: aload #9
    //   102: invokeinterface toString : ()Ljava/lang/String;
    //   107: aload_3
    //   108: aload #4
    //   110: invokevirtual Zk : (Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;)V
    //   113: aload_2
    //   114: ifnull -> 77
    //   117: aload_2
    //   118: ifnull -> 29
    //   121: new java/lang/StringBuilder
    //   124: dup
    //   125: invokespecial <init> : ()V
    //   128: astore #5
    //   130: aload #5
    //   132: aload_1
    //   133: invokeinterface size : ()I
    //   138: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   141: pop
    //   142: aload #5
    //   144: sipush #-18397
    //   147: sipush #-22822
    //   150: invokestatic a : (II)Ljava/lang/String;
    //   153: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: pop
    //   157: aload_3
    //   158: invokevirtual isEmpty : ()Z
    //   161: ifne -> 332
    //   164: aload #5
    //   166: sipush #-18378
    //   169: sipush #28089
    //   172: invokestatic a : (II)Ljava/lang/String;
    //   175: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: pop
    //   179: aload_3
    //   180: invokevirtual size : ()I
    //   183: istore #6
    //   185: iload #6
    //   187: iconst_1
    //   188: if_icmpne -> 210
    //   191: aload #5
    //   193: sipush #-18398
    //   196: sipush #-3369
    //   199: invokestatic a : (II)Ljava/lang/String;
    //   202: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: pop
    //   206: aload_2
    //   207: ifnull -> 233
    //   210: aload #5
    //   212: iload #6
    //   214: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   217: pop
    //   218: aload #5
    //   220: sipush #-18372
    //   223: sipush #-22594
    //   226: invokestatic a : (II)Ljava/lang/String;
    //   229: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: pop
    //   233: aload #5
    //   235: sipush #-18390
    //   238: sipush #32202
    //   241: invokestatic a : (II)Ljava/lang/String;
    //   244: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: pop
    //   248: aload_3
    //   249: invokevirtual iterator : ()Ljava/util/Iterator;
    //   252: astore #7
    //   254: aload #7
    //   256: invokeinterface hasNext : ()Z
    //   261: ifeq -> 317
    //   264: aload #7
    //   266: invokeinterface next : ()Ljava/lang/Object;
    //   271: checkcast java/lang/String
    //   274: astore #8
    //   276: aload #5
    //   278: sipush #-18399
    //   281: sipush #17800
    //   284: invokestatic a : (II)Ljava/lang/String;
    //   287: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   290: pop
    //   291: aload #5
    //   293: aload #8
    //   295: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   298: aload #5
    //   300: sipush #-18389
    //   303: sipush #215
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   312: pop
    //   313: aload_2
    //   314: ifnull -> 254
    //   317: aload #5
    //   319: sipush #-18379
    //   322: sipush #1386
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   331: pop
    //   332: aload #4
    //   334: invokevirtual isEmpty : ()Z
    //   337: ifeq -> 346
    //   340: aload #5
    //   342: invokevirtual toString : ()Ljava/lang/String;
    //   345: areturn
    //   346: aload_3
    //   347: invokevirtual isEmpty : ()Z
    //   350: ifne -> 372
    //   353: aload #5
    //   355: sipush #-18377
    //   358: sipush #27493
    //   361: invokestatic a : (II)Ljava/lang/String;
    //   364: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   367: pop
    //   368: aload_2
    //   369: ifnull -> 387
    //   372: aload #5
    //   374: sipush #-18373
    //   377: sipush #-14003
    //   380: invokestatic a : (II)Ljava/lang/String;
    //   383: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   386: pop
    //   387: aload #4
    //   389: invokevirtual size : ()I
    //   392: istore #6
    //   394: iload #6
    //   396: iconst_1
    //   397: if_icmpne -> 419
    //   400: aload #5
    //   402: sipush #-18382
    //   405: sipush #6570
    //   408: invokestatic a : (II)Ljava/lang/String;
    //   411: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   414: pop
    //   415: aload_2
    //   416: ifnull -> 442
    //   419: aload #5
    //   421: iload #6
    //   423: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   426: pop
    //   427: aload #5
    //   429: sipush #-18370
    //   432: sipush #-19607
    //   435: invokestatic a : (II)Ljava/lang/String;
    //   438: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   441: pop
    //   442: aload #5
    //   444: sipush #-18380
    //   447: sipush #24640
    //   450: invokestatic a : (II)Ljava/lang/String;
    //   453: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   456: pop
    //   457: aload #4
    //   459: invokevirtual iterator : ()Ljava/util/Iterator;
    //   462: astore #7
    //   464: aload #7
    //   466: invokeinterface hasNext : ()Z
    //   471: ifeq -> 527
    //   474: aload #7
    //   476: invokeinterface next : ()Ljava/lang/Object;
    //   481: checkcast java/lang/String
    //   484: astore #8
    //   486: aload #5
    //   488: sipush #-18375
    //   491: sipush #-3271
    //   494: invokestatic a : (II)Ljava/lang/String;
    //   497: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   500: pop
    //   501: aload #5
    //   503: aload #8
    //   505: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   508: aload #5
    //   510: sipush #-18395
    //   513: sipush #30958
    //   516: invokestatic a : (II)Ljava/lang/String;
    //   519: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   522: pop
    //   523: aload_2
    //   524: ifnull -> 464
    //   527: aload #5
    //   529: sipush #-18393
    //   532: sipush #2510
    //   535: invokestatic a : (II)Ljava/lang/String;
    //   538: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   541: pop
    //   542: aload #5
    //   544: invokevirtual toString : ()Ljava/lang/String;
    //   547: invokestatic Zwu : ()[Lburp/Zbqc;
    //   550: ifnonnull -> 560
    //   553: iconst_4
    //   554: anewarray java/lang/String
    //   557: invokestatic Za : ([Ljava/lang/String;)V
    //   560: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #32
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'e·áQ"b´î\\r{\\tyÔY$­H~§²E2EE!.¾óõlÑU+\\n|B-ñPBKd¦@Q<îâôù8Æõ?hCûK¸2ZPÝú_íÀ+Ý"ß,8£~ÝqÆ£mH¥ÐÇMmc²Ô}îUubÈÅ§uÐ0÷ÝY@¿ñ~*ÅÁ³É©cÀáHÇÛòmglXÈD¡\\f6ºcÿðúÉÎA]©\\bÂ4²Ë«uSÑkï²è±>ßUÚã½ zURÏIdxÙ1 ÂoN/°óã\\bt¹«¡lÔFç"QÛq[özl ApÄÿYx4Ùßg¥eWa~²@-¦Ü¾ÿ¨øDxhõ.õß«bóT'à¥Kè2[KìöÌoUtÈc,´«`¶^ãÕ¬"hæ?R?¼jÚ\¬YÉ3£\\tSÆuVG'yÌÌàéÖ5bÚ~©ìæàÉ]eüÃ[étÎWõÊ¤ÐÄ+æº1jú5k§gpç4CVCqIÛPà«yC9«íª\\t^=\\nåìÍ·îUuWHXÚá­é1¼`>`½ts_HN²0úYå\\bU_É¦åý>ÚëÕ,ïZ²X\\ry]V½?ÁïÏ½2.YH-&·ÏR\7ý·üoÞ äë<Bñ!q%{Úÿæ¤Õ¢äG³_Etÿ·Æ+vYÆ¦¼ÀÜröÐ96Ýns«çsãø÷a!ÁÿÓ7\FL;³Ø¦0o'úY¤°pï#oJ8ûH \"gq>£4i2¸ µ1}IbÈ)¨lÚ%-j1y8#öÃ|]áÓ4ÅYX=srBóë¦QDõ,bLZ ±ßcÝñqCXEjUX?áPÐ>X·¯\\b/\\bÎ×È]+£Aó¥¼¦P³Q°¹Y¢{^þ°<³[Ü#îûq&§'"h÷Icuré®Âu°¿æÔã±×1Æµ£¯ ¡´ÔªZÅNJßÀÉ3Vª}w]Í4d Kë1 á[{FÛìCpt×6å.¬5<ÜýÐ´×¦ýàAÞå· xÃÝXcÞ,ñÜÄ[G?;Ìb ¡ü÷VÜÜJ$½¤uÙ'\\tjRî£0åe_ï\\tµ'½@u4ÝÛNnú'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #8
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #7
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
    //   68: ldc 'syøòÄL³K9qÂ\\bî!òç ÑÌCÒ[ÿíîfI±ºµÚ«Ü&DÄ.¥'É\\rYÒ?ùvÙ÷Á7uf!RdN¤èÔèÝiq¡ÉÏé9è¥©ã4x=L±'q@iû£a½'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #116
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #72
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
    //   129: putstatic burp/Zmb3.a : [Ljava/lang/String;
    //   132: bipush #32
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmb3.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #70
    //   214: goto -> 243
    //   217: bipush #98
    //   219: goto -> 243
    //   222: bipush #25
    //   224: goto -> 243
    //   227: bipush #27
    //   229: goto -> 243
    //   232: bipush #89
    //   234: goto -> 243
    //   237: iconst_2
    //   238: goto -> 243
    //   241: bipush #124
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB826) & 0xFFFF;
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
      byte b1 = 95;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmb3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */