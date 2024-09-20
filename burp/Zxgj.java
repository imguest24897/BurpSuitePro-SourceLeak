package burp;

import java.util.List;
import java.util.regex.Pattern;
import net.portswigger.Zkb;

class Zxgj implements Zzva {
  private final Zbnt ZT;
  
  private final Zr_4 Zl;
  
  private final Zrgd Z_;
  
  private final Zskh ZM;
  
  private final Zlr9 ZQ;
  
  private final Zz9e Zk;
  
  private final Zxzh ZS;
  
  private final Zelf Zo;
  
  private final Zey9 Zt;
  
  private final Zs1e Zb;
  
  private final String Zy;
  
  private final String ZU;
  
  private final byte[] Zf;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zxgj(Zbnt paramZbnt, Zr_4 paramZr_4, Zrgd paramZrgd, Zskh paramZskh, Zlr9 paramZlr9, Zz9e paramZz9e, Zxzh paramZxzh, Zelf paramZelf, Zey9 paramZey9, Zs1e paramZs1e) {
    this.ZT = paramZbnt;
    this.Zl = paramZr_4;
    this.Z_ = paramZrgd;
    this.ZM = paramZskh;
    this.ZQ = paramZlr9;
    this.Zk = paramZz9e;
    this.ZS = paramZxzh;
    this.Zo = paramZelf;
    this.Zt = paramZey9;
    this.Zb = paramZs1e;
    this.Zy = paramZs1e.ZD();
    this.ZU = this.Zy.toLowerCase();
    this.Zf = Zkb.Zy(this.Zy);
  }
  
  public Zsgw ZA(Ze44 paramZe44, int paramInt, Zsxd paramZsxd, Zlgm paramZlgm) {
    // Byte code:
    //   0: invokestatic Zr : ()Z
    //   3: istore #5
    //   5: aload_1
    //   6: ifnull -> 43
    //   9: aload_1
    //   10: getstatic burp/Zgsg.INFO : Lburp/Zgsg;
    //   13: iload_2
    //   14: aload_0
    //   15: getfield Zb : Lburp/Zs1e;
    //   18: invokevirtual Zu : ()Ljava/lang/String;
    //   21: sipush #-22972
    //   24: sipush #3626
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: swap
    //   31: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   36: aconst_null
    //   37: invokeinterface ZP : (Lburp/Zgsg;ILjava/lang/String;Ljava/lang/String;)Lburp/Zm3k;
    //   42: pop
    //   43: aload_0
    //   44: getfield Zb : Lburp/Zs1e;
    //   47: invokevirtual Zr : ()B
    //   50: lookupswitch default -> 844, 0 -> 76, 1 -> 356
    //   76: aload_3
    //   77: invokeinterface ZG : ()Lburp/Zg3d;
    //   82: invokeinterface ZR : ()Lburp/Zefx;
    //   87: astore #6
    //   89: aload_0
    //   90: getfield Zk : Lburp/Zz9e;
    //   93: aload #6
    //   95: invokeinterface Zx : (Lburp/Zefx;)Lburp/Zsxd;
    //   100: astore_3
    //   101: aload_1
    //   102: ifnull -> 129
    //   105: aload_1
    //   106: getstatic burp/Zgsg.CURRENT_REQUEST_MADE : Lburp/Zgsg;
    //   109: iload_2
    //   110: iconst_1
    //   111: iadd
    //   112: sipush #-22975
    //   115: sipush #10745
    //   118: invokestatic a : (II)Ljava/lang/String;
    //   121: aconst_null
    //   122: aload_3
    //   123: invokeinterface ZR : (Lburp/Zgsg;ILjava/lang/String;Ljava/lang/String;Lburp/Zsxd;)Lburp/Zm3k;
    //   128: pop
    //   129: aload_3
    //   130: invokeinterface Zg : ()Ljava/util/List;
    //   135: astore #7
    //   137: aload #7
    //   139: invokeinterface isEmpty : ()Z
    //   144: ifeq -> 161
    //   147: aload_3
    //   148: invokeinterface ZG : ()Lburp/Zg3d;
    //   153: invokeinterface Ze : ()Lburp/Zb6q;
    //   158: goto -> 177
    //   161: aload #7
    //   163: iconst_0
    //   164: invokeinterface get : (I)Ljava/lang/Object;
    //   169: checkcast burp/Zg3d
    //   172: invokeinterface Ze : ()Lburp/Zb6q;
    //   177: astore #8
    //   179: aload #8
    //   181: ifnonnull -> 188
    //   184: iconst_0
    //   185: goto -> 195
    //   188: aload #8
    //   190: invokeinterface Ze : ()S
    //   195: istore #9
    //   197: aload #8
    //   199: ifnonnull -> 206
    //   202: aconst_null
    //   203: goto -> 213
    //   206: aload #8
    //   208: invokeinterface Zm : ()Ljava/util/List;
    //   213: astore #10
    //   215: aload #8
    //   217: ifnonnull -> 224
    //   220: aconst_null
    //   221: goto -> 236
    //   224: aload #8
    //   226: invokeinterface Za : ()Lburp/Zstu;
    //   231: invokeinterface ZiD : ()[B
    //   236: astore #11
    //   238: aload #8
    //   240: ifnonnull -> 247
    //   243: iconst_0
    //   244: goto -> 254
    //   247: aload #8
    //   249: invokeinterface Zs : ()I
    //   254: istore #12
    //   256: aload_0
    //   257: aload #6
    //   259: iload #9
    //   261: aload #10
    //   263: aload #11
    //   265: iload #12
    //   267: aload_0
    //   268: getfield ZT : Lburp/Zbnt;
    //   271: invokevirtual Zc : (Lburp/Zefx;SLjava/util/List;[BILburp/Zbnt;)Z
    //   274: ifeq -> 314
    //   277: aload_1
    //   278: ifnull -> 304
    //   281: aload_1
    //   282: getstatic burp/Zgsg.INFO_GOOD : Lburp/Zgsg;
    //   285: iload_2
    //   286: iconst_2
    //   287: iadd
    //   288: sipush #-22971
    //   291: sipush #-17649
    //   294: invokestatic a : (II)Ljava/lang/String;
    //   297: aconst_null
    //   298: invokeinterface ZP : (Lburp/Zgsg;ILjava/lang/String;Ljava/lang/String;)Lburp/Zm3k;
    //   303: pop
    //   304: new burp/Zsgw
    //   307: dup
    //   308: aload_3
    //   309: iconst_1
    //   310: invokespecial <init> : (Lburp/Zsxd;Z)V
    //   313: areturn
    //   314: aload_1
    //   315: ifnull -> 341
    //   318: aload_1
    //   319: getstatic burp/Zgsg.INFO_BAD : Lburp/Zgsg;
    //   322: iload_2
    //   323: iconst_2
    //   324: iadd
    //   325: sipush #-22970
    //   328: sipush #18460
    //   331: invokestatic a : (II)Ljava/lang/String;
    //   334: aconst_null
    //   335: invokeinterface ZP : (Lburp/Zgsg;ILjava/lang/String;Ljava/lang/String;)Lburp/Zm3k;
    //   340: pop
    //   341: new burp/Ze5m
    //   344: dup
    //   345: aload #6
    //   347: invokespecial <init> : (Lburp/Zefx;)V
    //   350: astore_3
    //   351: iload #5
    //   353: ifeq -> 844
    //   356: aload_0
    //   357: getfield Zb : Lburp/Zs1e;
    //   360: invokevirtual ZM : ()Lburp/Zlil;
    //   363: ifnonnull -> 375
    //   366: new burp/Zsgw
    //   369: dup
    //   370: aload_3
    //   371: invokespecial <init> : (Lburp/Zsxd;)V
    //   374: areturn
    //   375: aload_0
    //   376: getfield Zb : Lburp/Zs1e;
    //   379: invokevirtual Zq : ()Z
    //   382: ifeq -> 467
    //   385: aload_0
    //   386: dup
    //   387: astore #6
    //   389: monitorenter
    //   390: aload_0
    //   391: getfield Zb : Lburp/Zs1e;
    //   394: invokevirtual Zb : ()I
    //   397: aload_0
    //   398: getfield Zb : Lburp/Zs1e;
    //   401: invokevirtual Zx : ()I
    //   404: if_icmpge -> 446
    //   407: aload_1
    //   408: ifnull -> 434
    //   411: aload_1
    //   412: getstatic burp/Zgsg.INFO : Lburp/Zgsg;
    //   415: iload_2
    //   416: iconst_1
    //   417: iadd
    //   418: sipush #-22966
    //   421: sipush #-18253
    //   424: invokestatic a : (II)Ljava/lang/String;
    //   427: aconst_null
    //   428: invokeinterface ZP : (Lburp/Zgsg;ILjava/lang/String;Ljava/lang/String;)Lburp/Zm3k;
    //   433: pop
    //   434: new burp/Zsgw
    //   437: dup
    //   438: aload_3
    //   439: invokespecial <init> : (Lburp/Zsxd;)V
    //   442: aload #6
    //   444: monitorexit
    //   445: areturn
    //   446: aload_0
    //   447: getfield Zb : Lburp/Zs1e;
    //   450: invokevirtual Zd : ()V
    //   453: aload #6
    //   455: monitorexit
    //   456: goto -> 467
    //   459: astore #13
    //   461: aload #6
    //   463: monitorexit
    //   464: aload #13
    //   466: athrow
    //   467: aload_1
    //   468: ifnull -> 514
    //   471: aload_1
    //   472: getstatic burp/Zgsg.RUNNING_MACRO : Lburp/Zgsg;
    //   475: iload_2
    //   476: iconst_1
    //   477: iadd
    //   478: aload_0
    //   479: getfield Zb : Lburp/Zs1e;
    //   482: invokevirtual ZM : ()Lburp/Zlil;
    //   485: invokevirtual toString : ()Ljava/lang/String;
    //   488: sipush #-22974
    //   491: sipush #-24906
    //   494: invokestatic a : (II)Ljava/lang/String;
    //   497: swap
    //   498: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   503: aload_0
    //   504: getfield Zy : Ljava/lang/String;
    //   507: aload_3
    //   508: invokeinterface ZR : (Lburp/Zgsg;ILjava/lang/String;Ljava/lang/String;Lburp/Zsxd;)Lburp/Zm3k;
    //   513: pop
    //   514: new burp/Zz9y
    //   517: dup
    //   518: aload_0
    //   519: getfield Zb : Lburp/Zs1e;
    //   522: invokevirtual ZM : ()Lburp/Zlil;
    //   525: aload_0
    //   526: getfield ZS : Lburp/Zxzh;
    //   529: aload_0
    //   530: getfield ZQ : Lburp/Zlr9;
    //   533: new burp/Zruk
    //   536: dup
    //   537: aload_1
    //   538: iload_2
    //   539: iconst_2
    //   540: iadd
    //   541: invokespecial <init> : (Lburp/Ze44;I)V
    //   544: aload_0
    //   545: getfield ZT : Lburp/Zbnt;
    //   548: aload_0
    //   549: getfield Zt : Lburp/Zey9;
    //   552: aload_0
    //   553: getfield Zl : Lburp/Zr_4;
    //   556: aload_0
    //   557: getfield Z_ : Lburp/Zrgd;
    //   560: invokespecial <init> : (Lburp/Zlil;Lburp/Zxzh;Lburp/Zlr9;Lburp/Zrxw;Lburp/Zbnt;Lburp/Zey9;Lburp/Zr_4;Lburp/Zrgd;)V
    //   563: astore #6
    //   565: aload #6
    //   567: invokevirtual run : ()V
    //   570: aload #6
    //   572: invokevirtual ZQ : ()Ljava/util/List;
    //   575: astore #7
    //   577: aload #7
    //   579: invokeinterface isEmpty : ()Z
    //   584: ifeq -> 630
    //   587: aload_1
    //   588: ifnull -> 614
    //   591: aload_1
    //   592: getstatic burp/Zgsg.INFO_BAD : Lburp/Zgsg;
    //   595: iload_2
    //   596: iconst_2
    //   597: iadd
    //   598: sipush #-22965
    //   601: sipush #28307
    //   604: invokestatic a : (II)Ljava/lang/String;
    //   607: aconst_null
    //   608: invokeinterface ZP : (Lburp/Zgsg;ILjava/lang/String;Ljava/lang/String;)Lburp/Zm3k;
    //   613: pop
    //   614: new burp/Zsgw
    //   617: dup
    //   618: aload_3
    //   619: aload_0
    //   620: getfield Zb : Lburp/Zs1e;
    //   623: invokevirtual ZP : ()Z
    //   626: invokespecial <init> : (Lburp/Zsxd;Z)V
    //   629: areturn
    //   630: aload #7
    //   632: aload #7
    //   634: invokeinterface size : ()I
    //   639: iconst_1
    //   640: isub
    //   641: invokeinterface get : (I)Ljava/lang/Object;
    //   646: checkcast burp/Zkg1
    //   649: astore #8
    //   651: aload #8
    //   653: getfield ZP : Lburp/Zs68;
    //   656: ifnonnull -> 695
    //   659: aload_1
    //   660: ifnull -> 686
    //   663: aload_1
    //   664: getstatic burp/Zgsg.INFO_BAD : Lburp/Zgsg;
    //   667: iload_2
    //   668: iconst_2
    //   669: iadd
    //   670: sipush #-22976
    //   673: sipush #31364
    //   676: invokestatic a : (II)Ljava/lang/String;
    //   679: aconst_null
    //   680: invokeinterface ZP : (Lburp/Zgsg;ILjava/lang/String;Ljava/lang/String;)Lburp/Zm3k;
    //   685: pop
    //   686: new burp/Zsgw
    //   689: dup
    //   690: aload_3
    //   691: invokespecial <init> : (Lburp/Zsxd;)V
    //   694: areturn
    //   695: aload_0
    //   696: aload_0
    //   697: getfield Zt : Lburp/Zey9;
    //   700: aload #8
    //   702: invokevirtual Zod : ()Lburp/Zmzk;
    //   705: aload #8
    //   707: getfield Zx : Lburp/Zstu;
    //   710: invokeinterface ZiD : ()[B
    //   715: invokevirtual ZY : (Lburp/Zmzk;[B)Lburp/Zefx;
    //   718: aload #8
    //   720: getfield ZP : Lburp/Zs68;
    //   723: getfield Zb : S
    //   726: aload #8
    //   728: getfield ZP : Lburp/Zs68;
    //   731: getfield ZP : Ljava/util/List;
    //   734: aload #8
    //   736: getfield Za : Lburp/Zstu;
    //   739: ifnonnull -> 746
    //   742: aconst_null
    //   743: goto -> 756
    //   746: aload #8
    //   748: getfield Za : Lburp/Zstu;
    //   751: invokeinterface ZiD : ()[B
    //   756: aload #8
    //   758: getfield ZP : Lburp/Zs68;
    //   761: getfield Zk : I
    //   764: aload_0
    //   765: getfield ZT : Lburp/Zbnt;
    //   768: invokevirtual Zc : (Lburp/Zefx;SLjava/util/List;[BILburp/Zbnt;)Z
    //   771: ifeq -> 817
    //   774: aload_1
    //   775: ifnull -> 801
    //   778: aload_1
    //   779: getstatic burp/Zgsg.INFO_GOOD : Lburp/Zgsg;
    //   782: iload_2
    //   783: iconst_2
    //   784: iadd
    //   785: sipush #-22973
    //   788: sipush #-27834
    //   791: invokestatic a : (II)Ljava/lang/String;
    //   794: aconst_null
    //   795: invokeinterface ZP : (Lburp/Zgsg;ILjava/lang/String;Ljava/lang/String;)Lburp/Zm3k;
    //   800: pop
    //   801: new burp/Zsgw
    //   804: dup
    //   805: aload_3
    //   806: aload_0
    //   807: getfield Zb : Lburp/Zs1e;
    //   810: invokevirtual ZP : ()Z
    //   813: invokespecial <init> : (Lburp/Zsxd;Z)V
    //   816: areturn
    //   817: aload_1
    //   818: ifnull -> 844
    //   821: aload_1
    //   822: getstatic burp/Zgsg.INFO_BAD : Lburp/Zgsg;
    //   825: iload_2
    //   826: iconst_2
    //   827: iadd
    //   828: sipush #-22969
    //   831: sipush #-15308
    //   834: invokestatic a : (II)Ljava/lang/String;
    //   837: aconst_null
    //   838: invokeinterface ZP : (Lburp/Zgsg;ILjava/lang/String;Ljava/lang/String;)Lburp/Zm3k;
    //   843: pop
    //   844: aload_0
    //   845: getfield Zb : Lburp/Zs1e;
    //   848: invokevirtual Zf : ()Z
    //   851: ifeq -> 918
    //   854: aload_0
    //   855: getfield Zb : Lburp/Zs1e;
    //   858: invokevirtual ZL : ()Lburp/Ztb;
    //   861: getstatic burp/Ztb.NONE : Lburp/Ztb;
    //   864: if_acmpeq -> 918
    //   867: aload_0
    //   868: getfield Zb : Lburp/Zs1e;
    //   871: invokevirtual Zp : ()Lburp/Zb81;
    //   874: astore #6
    //   876: aload_0
    //   877: getfield Zo : Lburp/Zelf;
    //   880: aload #6
    //   882: aload_0
    //   883: getfield ZM : Lburp/Zskh;
    //   886: aload_0
    //   887: getfield ZQ : Lburp/Zlr9;
    //   890: aload_0
    //   891: getfield Zk : Lburp/Zz9e;
    //   894: aload_0
    //   895: getfield ZS : Lburp/Zxzh;
    //   898: invokevirtual ZX : (Lburp/Zb81;Lburp/Zskh;Lburp/Zlr9;Lburp/Zz9e;Lburp/Zxzh;)Lburp/Zzva;
    //   901: astore #7
    //   903: aload #7
    //   905: aload_1
    //   906: iload_2
    //   907: iconst_1
    //   908: iadd
    //   909: aload_3
    //   910: aload #4
    //   912: invokeinterface ZA : (Lburp/Ze44;ILburp/Zsxd;Lburp/Zlgm;)Lburp/Zsgw;
    //   917: areturn
    //   918: new burp/Zsgw
    //   921: dup
    //   922: aload_3
    //   923: invokespecial <init> : (Lburp/Zsxd;)V
    //   926: areturn
    // Exception table:
    //   from	to	target	type
    //   390	445	459	finally
    //   446	456	459	finally
    //   459	464	459	finally
  }
  
  private boolean Zh(String paramString) {
    if (this.Zb.Zc()) {
      Pattern pattern = this.Zb.ZK();
      return (pattern != null && pattern.matcher(paramString).find());
    } 
    return this.Zb.ZI() ? paramString.contains(this.Zy) : ((Zsw8.Zf(paramString, this.ZU, 0, paramString.length()) >= 0));
  }
  
  private boolean Zc(Zefx paramZefx, short paramShort, List<String> paramList, byte[] paramArrayOfbyte, int paramInt, Zbnt paramZbnt) {
    // Byte code:
    //   0: invokestatic ZI : ()Z
    //   3: istore #7
    //   5: iconst_0
    //   6: istore #8
    //   8: aload_0
    //   9: getfield Zb : Lburp/Zs1e;
    //   12: invokevirtual ZF : ()Z
    //   15: ifeq -> 66
    //   18: aload_3
    //   19: ifnull -> 66
    //   22: aload_3
    //   23: invokeinterface iterator : ()Ljava/util/Iterator;
    //   28: astore #9
    //   30: iload #8
    //   32: ifne -> 66
    //   35: aload #9
    //   37: invokeinterface hasNext : ()Z
    //   42: ifeq -> 66
    //   45: aload_0
    //   46: aload #9
    //   48: invokeinterface next : ()Ljava/lang/Object;
    //   53: checkcast java/lang/String
    //   56: invokevirtual Zh : (Ljava/lang/String;)Z
    //   59: istore #8
    //   61: iload #7
    //   63: ifne -> 30
    //   66: aload_0
    //   67: getfield Zb : Lburp/Zs1e;
    //   70: invokevirtual Za : ()Z
    //   73: ifeq -> 148
    //   76: iload #8
    //   78: ifne -> 148
    //   81: aload #4
    //   83: ifnull -> 148
    //   86: aload_0
    //   87: getfield Zb : Lburp/Zs1e;
    //   90: invokevirtual Zc : ()Z
    //   93: ifeq -> 120
    //   96: aload_0
    //   97: aload #4
    //   99: iload #5
    //   101: aload #4
    //   103: arraylength
    //   104: iload #5
    //   106: isub
    //   107: invokestatic Zo : ([BII)Ljava/lang/String;
    //   110: invokevirtual Zh : (Ljava/lang/String;)Z
    //   113: istore #8
    //   115: iload #7
    //   117: ifne -> 148
    //   120: aload #4
    //   122: aload_0
    //   123: getfield Zf : [B
    //   126: aload_0
    //   127: getfield Zb : Lburp/Zs1e;
    //   130: invokevirtual ZI : ()Z
    //   133: iload #5
    //   135: invokestatic ZG : ([B[BZI)I
    //   138: iflt -> 145
    //   141: iconst_1
    //   142: goto -> 146
    //   145: iconst_0
    //   146: istore #8
    //   148: aload_0
    //   149: getfield Zb : Lburp/Zs1e;
    //   152: invokevirtual Zo : ()Z
    //   155: ifeq -> 216
    //   158: iload #8
    //   160: ifne -> 216
    //   163: aload_1
    //   164: invokeinterface ZT : ()Lburp/Zmzk;
    //   169: aload_1
    //   170: invokeinterface Zb : ()Lburp/Zefx;
    //   175: invokeinterface ZD : ()[B
    //   180: aload #4
    //   182: aload_3
    //   183: iload #5
    //   185: iload_2
    //   186: bipush #31
    //   188: aload #6
    //   190: invokestatic ZO : (Lburp/Zmzk;[B[BLjava/util/List;ISILburp/Zbnt;)Lburp/Zs0d;
    //   193: astore #9
    //   195: aload #9
    //   197: ifnull -> 216
    //   200: aload_0
    //   201: aload #9
    //   203: invokevirtual ZM : ()Lburp/Zlit;
    //   206: invokeinterface toString : ()Ljava/lang/String;
    //   211: invokevirtual Zh : (Ljava/lang/String;)Z
    //   214: istore #8
    //   216: aload_0
    //   217: getfield Zb : Lburp/Zs1e;
    //   220: invokevirtual Zy : ()Z
    //   223: iload #8
    //   225: if_icmpne -> 232
    //   228: iconst_1
    //   229: goto -> 233
    //   232: iconst_0
    //   233: ireturn
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'j©H¨JéSaÎ ¼#ëDAugþqÕª²Ô $§Wß£¼Ì\\nÒzR¸#*uUòåâ!*wOZG5¨\\tút"â©I \\fÊò¹np÷/c¦ÿA©ûâ\\tòrÑ%EòøüÈ¶À\\rÒNÐ¿»^)\\nÊÙ¼8,^°6ß¸xF®]M|plAHGÙI+.å>eôó°!§<·Ä]@§ùV­°-U6jü+Ü&09,L'Ë«|èÌYÉe¦\\r¬"Ù#³ OAuD\\nUçygÁ§'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #25
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
    //   68: ldc '{>ÕùâØRí¼NÔmR/r~÷ó÷ØãÌ|à¶¶¤o°*'>ËÆtÕHCii(\\fç+dÍ¼?ÒDõÞ\\b,÷õ­áÎaËïJç÷lPI|ün\\nÿa%$xÊµÜuDVý:Ü'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #69
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #28
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
    //   129: putstatic burp/Zxgj.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zxgj.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #105
    //   214: goto -> 244
    //   217: bipush #67
    //   219: goto -> 244
    //   222: bipush #88
    //   224: goto -> 244
    //   227: bipush #117
    //   229: goto -> 244
    //   232: bipush #6
    //   234: goto -> 244
    //   237: bipush #117
    //   239: goto -> 244
    //   242: bipush #16
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA643) & 0xFFFF;
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
      byte b1 = 5;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxgj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */