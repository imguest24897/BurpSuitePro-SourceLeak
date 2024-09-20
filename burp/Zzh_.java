package burp;

class Zzh_ {
  final Zm82 ZC;
  
  private static final String a;
  
  private Zzh_(Zm82 paramZm82) {}
  
  private void Zb(Zez3 paramZez3, short paramShort) {
    if (this.ZC.ZA == 3)
      return; 
    Zebw zebw = new Zebw(this, paramShort);
    paramZez3.Zk(zebw);
  }
  
  private void Zg(Zmxt paramZmxt, short paramShort) {
    if (this.ZC.ZA == 3)
      return; 
    if (this.ZC.ZM.ZQ(paramZmxt.ZlL(), paramShort) && paramZmxt.Zq7().ZTU() == 0)
      this.ZC.ZI.Zh(paramZmxt); 
  }
  
  private void Zz(Zez3 paramZez3) {
    // Byte code:
    //   0: invokestatic Zb : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZC : Lburp/Zm82;
    //   8: getfield ZA : B
    //   11: iconst_3
    //   12: if_icmpne -> 16
    //   15: return
    //   16: aload_1
    //   17: invokestatic Zh : (Lburp/Zez3;)Z
    //   20: ifeq -> 964
    //   23: aload_1
    //   24: checkcast burp/Zmxt
    //   27: astore_3
    //   28: aload_1
    //   29: invokeinterface Zkb : ()Ljava/lang/String;
    //   34: astore #4
    //   36: aload #4
    //   38: bipush #46
    //   40: invokevirtual lastIndexOf : (I)I
    //   43: istore #5
    //   45: iload #5
    //   47: iconst_m1
    //   48: if_icmpne -> 64
    //   51: aload_0
    //   52: getfield ZC : Lburp/Zm82;
    //   55: aload #4
    //   57: invokevirtual Zt : (Ljava/lang/String;)V
    //   60: aload_2
    //   61: ifnonnull -> 95
    //   64: aload_0
    //   65: getfield ZC : Lburp/Zm82;
    //   68: aload #4
    //   70: iconst_0
    //   71: iload #5
    //   73: invokevirtual substring : (II)Ljava/lang/String;
    //   76: invokevirtual Zt : (Ljava/lang/String;)V
    //   79: aload_0
    //   80: getfield ZC : Lburp/Zm82;
    //   83: aload #4
    //   85: iload #5
    //   87: iconst_1
    //   88: iadd
    //   89: invokevirtual substring : (I)Ljava/lang/String;
    //   92: invokevirtual Zg : (Ljava/lang/String;)V
    //   95: aload_3
    //   96: invokeinterface ZlL : ()Lburp/Zlit;
    //   101: astore #6
    //   103: aload_3
    //   104: invokeinterface Zq7 : ()Lburp/Zs73;
    //   109: astore #7
    //   111: aload_3
    //   112: invokeinterface Zqf : ()Lburp/Zrf_;
    //   117: astore #8
    //   119: aload_0
    //   120: getfield ZC : Lburp/Zm82;
    //   123: getfield ZM : Lburp/Zzv5;
    //   126: invokeinterface ZU : ()Z
    //   131: ifeq -> 346
    //   134: aload #7
    //   136: invokeinterface ZTI : ()B
    //   141: iconst_1
    //   142: if_icmpne -> 346
    //   145: aload_0
    //   146: getfield ZC : Lburp/Zm82;
    //   149: getfield ZU : Lburp/Ztdi;
    //   152: aload #6
    //   154: invokeinterface Zf : (Lburp/Zlit;)Lburp/Zmxt;
    //   159: astore #9
    //   161: aconst_null
    //   162: astore #10
    //   164: aload #9
    //   166: ifnull -> 183
    //   169: new burp/Ztgc
    //   172: dup
    //   173: aload #9
    //   175: invokespecial <init> : (Lburp/Zez3;)V
    //   178: invokevirtual ZE : ()Lburp/Zs73;
    //   181: astore #10
    //   183: aload #9
    //   185: ifnull -> 199
    //   188: aload #10
    //   190: invokeinterface ZTU : ()B
    //   195: iconst_2
    //   196: if_icmpeq -> 346
    //   199: aload #9
    //   201: ifnonnull -> 227
    //   204: aload_0
    //   205: getfield ZC : Lburp/Zm82;
    //   208: getfield ZU : Lburp/Ztdi;
    //   211: aload #6
    //   213: aload #7
    //   215: invokeinterface ZTF : ()S
    //   220: invokeinterface Zq : (Lburp/Zlit;S)Lburp/Zez3;
    //   225: astore #9
    //   227: new burp/Zsir
    //   230: dup
    //   231: invokespecial <init> : ()V
    //   234: aload #8
    //   236: invokeinterface Z__ : ()Lburp/Zstu;
    //   241: aload #8
    //   243: invokeinterface Z_O : ()Ljava/lang/String;
    //   248: invokevirtual Zp : (Lburp/Zstu;Ljava/lang/String;)Lburp/Zsir;
    //   251: aload #8
    //   253: invokeinterface Z_B : ()Lburp/Zstu;
    //   258: aload #8
    //   260: invokeinterface Z_z : ()I
    //   265: aload #8
    //   267: invokeinterface Z_V : ()S
    //   272: aload #8
    //   274: invokeinterface Z_F : ()S
    //   279: aload #8
    //   281: invokeinterface Z_I : ()Ljava/lang/String;
    //   286: aload #8
    //   288: invokeinterface Z_a : ()J
    //   293: invokevirtual ZV : (Lburp/Zstu;ISSLjava/lang/String;J)Lburp/Zsir;
    //   296: aload #7
    //   298: invokeinterface ZTU : ()B
    //   303: aload #7
    //   305: invokeinterface ZTI : ()B
    //   310: aload #7
    //   312: invokeinterface ZTF : ()S
    //   317: aload #7
    //   319: invokeinterface ZTR : ()Lburp/Zlit;
    //   324: invokevirtual ZG : (BBSLburp/Zlit;)Lburp/Zsir;
    //   327: aload #9
    //   329: invokevirtual Zd : (Lburp/Zez3;)V
    //   332: aload_0
    //   333: getfield ZC : Lburp/Zm82;
    //   336: getfield ZU : Lburp/Ztdi;
    //   339: aload #9
    //   341: invokeinterface ZR : (Lburp/Zez3;)V
    //   346: aload_0
    //   347: getfield ZC : Lburp/Zm82;
    //   350: getfield ZM : Lburp/Zzv5;
    //   353: invokeinterface ZH : ()S
    //   358: aload #7
    //   360: invokeinterface ZTF : ()S
    //   365: if_icmple -> 372
    //   368: iconst_1
    //   369: goto -> 373
    //   372: iconst_0
    //   373: istore #9
    //   375: iload #9
    //   377: ifeq -> 501
    //   380: ldc '/'
    //   382: aload_3
    //   383: invokeinterface Zkb : ()Ljava/lang/String;
    //   388: invokevirtual equals : (Ljava/lang/Object;)Z
    //   391: ifeq -> 501
    //   394: aload #7
    //   396: invokeinterface ZTI : ()B
    //   401: iconst_1
    //   402: if_icmpne -> 501
    //   405: aload_0
    //   406: getfield ZC : Lburp/Zm82;
    //   409: getfield ZM : Lburp/Zzv5;
    //   412: invokeinterface Zy : ()Z
    //   417: ifeq -> 501
    //   420: aload_0
    //   421: getfield ZC : Lburp/Zm82;
    //   424: getfield ZN : Ljava/util/Set;
    //   427: dup
    //   428: astore #10
    //   430: monitorenter
    //   431: aload_0
    //   432: getfield ZC : Lburp/Zm82;
    //   435: getfield ZN : Ljava/util/Set;
    //   438: aload #6
    //   440: invokeinterface contains : (Ljava/lang/Object;)Z
    //   445: ifne -> 487
    //   448: aload_0
    //   449: getfield ZC : Lburp/Zm82;
    //   452: getfield ZN : Ljava/util/Set;
    //   455: aload #6
    //   457: invokeinterface add : (Ljava/lang/Object;)Z
    //   462: pop
    //   463: aload_0
    //   464: getfield ZC : Lburp/Zm82;
    //   467: aload #6
    //   469: invokeinterface Zd4 : ()[B
    //   474: aload #7
    //   476: invokeinterface ZTF : ()S
    //   481: iconst_1
    //   482: iadd
    //   483: i2s
    //   484: invokevirtual ZG : ([BS)V
    //   487: aload #10
    //   489: monitorexit
    //   490: goto -> 501
    //   493: astore #11
    //   495: aload #10
    //   497: monitorexit
    //   498: aload #11
    //   500: athrow
    //   501: aload_0
    //   502: getfield ZC : Lburp/Zm82;
    //   505: getfield ZK : B
    //   508: ifne -> 561
    //   511: aload #7
    //   513: invokeinterface ZTI : ()B
    //   518: iconst_1
    //   519: if_icmpne -> 561
    //   522: aload #6
    //   524: invokeinterface ZdH : ()[B
    //   529: arraylength
    //   530: iconst_5
    //   531: if_icmple -> 561
    //   534: aload_0
    //   535: getfield ZC : Lburp/Zm82;
    //   538: aload #6
    //   540: invokeinterface ZdH : ()[B
    //   545: invokevirtual Zf : ([B)I
    //   548: iconst_3
    //   549: if_icmple -> 561
    //   552: aload_0
    //   553: getfield ZC : Lburp/Zm82;
    //   556: aload #6
    //   558: invokevirtual ZV : (Lburp/Zlit;)V
    //   561: aload_0
    //   562: getfield ZC : Lburp/Zm82;
    //   565: getfield ZM : Lburp/Zzv5;
    //   568: invokeinterface Zm : ()Z
    //   573: ifne -> 591
    //   576: aload_0
    //   577: getfield ZC : Lburp/Zm82;
    //   580: getfield ZM : Lburp/Zzv5;
    //   583: invokeinterface ZK : ()Z
    //   588: ifeq -> 701
    //   591: aload_0
    //   592: getfield ZC : Lburp/Zm82;
    //   595: getfield Zh : Ljava/util/Set;
    //   598: dup
    //   599: astore #10
    //   601: monitorenter
    //   602: aload_0
    //   603: getfield ZC : Lburp/Zm82;
    //   606: getfield Zh : Ljava/util/Set;
    //   609: aload #6
    //   611: invokeinterface contains : (Ljava/lang/Object;)Z
    //   616: ifne -> 687
    //   619: aload_0
    //   620: getfield ZC : Lburp/Zm82;
    //   623: getfield ZM : Lburp/Zzv5;
    //   626: invokeinterface Zm : ()Z
    //   631: ifeq -> 649
    //   634: aload_0
    //   635: getfield ZC : Lburp/Zm82;
    //   638: aload_3
    //   639: aload #7
    //   641: invokeinterface ZTF : ()S
    //   646: invokevirtual ZG : (Lburp/Zmxt;S)V
    //   649: aload_0
    //   650: getfield ZC : Lburp/Zm82;
    //   653: getfield ZM : Lburp/Zzv5;
    //   656: invokeinterface ZK : ()Z
    //   661: ifeq -> 672
    //   664: aload_0
    //   665: getfield ZC : Lburp/Zm82;
    //   668: aload_3
    //   669: invokevirtual ZF : (Lburp/Zmxt;)V
    //   672: aload_0
    //   673: getfield ZC : Lburp/Zm82;
    //   676: getfield Zh : Ljava/util/Set;
    //   679: aload #6
    //   681: invokeinterface add : (Ljava/lang/Object;)Z
    //   686: pop
    //   687: aload #10
    //   689: monitorexit
    //   690: goto -> 701
    //   693: astore #12
    //   695: aload #10
    //   697: monitorexit
    //   698: aload #12
    //   700: athrow
    //   701: aload #7
    //   703: invokeinterface ZTI : ()B
    //   708: iconst_1
    //   709: if_icmpne -> 964
    //   712: aload #8
    //   714: invokeinterface Z_V : ()S
    //   719: sipush #301
    //   722: if_icmpeq -> 738
    //   725: aload #8
    //   727: invokeinterface Z_V : ()S
    //   732: sipush #302
    //   735: if_icmpne -> 964
    //   738: aload #8
    //   740: invokeinterface Z_B : ()Lburp/Zstu;
    //   745: getstatic burp/Zzh_.a : Ljava/lang/String;
    //   748: iconst_0
    //   749: invokestatic ZV : (Lburp/Zstu;Ljava/lang/String;Z)Ljava/lang/String;
    //   752: astore #10
    //   754: aload #10
    //   756: ifnull -> 964
    //   759: aload #10
    //   761: bipush #9
    //   763: invokevirtual substring : (I)Ljava/lang/String;
    //   766: invokevirtual trim : ()Ljava/lang/String;
    //   769: astore #10
    //   771: aload #10
    //   773: aload #6
    //   775: aload_0
    //   776: getfield ZC : Lburp/Zm82;
    //   779: getfield Zn : Lburp/Zbnt;
    //   782: invokestatic ZL : (Ljava/lang/String;Lburp/Zlit;Lburp/Zbnt;)Lburp/Zlit;
    //   785: astore #11
    //   787: aload #11
    //   789: ifnull -> 964
    //   792: aload #6
    //   794: invokeinterface ZdH : ()[B
    //   799: astore #12
    //   801: aload #11
    //   803: invokeinterface ZdH : ()[B
    //   808: astore #13
    //   810: aload #13
    //   812: arraylength
    //   813: aload #12
    //   815: arraylength
    //   816: iconst_1
    //   817: iadd
    //   818: if_icmpne -> 875
    //   821: aload #13
    //   823: iconst_0
    //   824: aload #13
    //   826: arraylength
    //   827: iconst_1
    //   828: isub
    //   829: aload #12
    //   831: iconst_0
    //   832: aload #12
    //   834: arraylength
    //   835: invokestatic ZI : ([BII[BII)Z
    //   838: ifeq -> 875
    //   841: aload #13
    //   843: aload #13
    //   845: arraylength
    //   846: iconst_1
    //   847: isub
    //   848: baload
    //   849: bipush #47
    //   851: if_icmpne -> 875
    //   854: aload #7
    //   856: iconst_2
    //   857: invokeinterface Zy : (B)V
    //   862: aload_0
    //   863: getfield ZC : Lburp/Zm82;
    //   866: getfield Zj : Lburp/Ztdi;
    //   869: aload_3
    //   870: invokeinterface ZR : (Lburp/Zez3;)V
    //   875: aload_0
    //   876: getfield ZC : Lburp/Zm82;
    //   879: getfield ZM : Lburp/Zzv5;
    //   882: aload #11
    //   884: aload #7
    //   886: invokeinterface ZTF : ()S
    //   891: iconst_1
    //   892: iadd
    //   893: i2s
    //   894: invokeinterface ZQ : (Lburp/Zlit;S)Z
    //   899: ifeq -> 964
    //   902: aload_0
    //   903: getfield ZC : Lburp/Zm82;
    //   906: getfield Zj : Lburp/Ztdi;
    //   909: aload #11
    //   911: aload #7
    //   913: invokeinterface ZTF : ()S
    //   918: iconst_1
    //   919: iadd
    //   920: i2s
    //   921: invokeinterface Zq : (Lburp/Zlit;S)Lburp/Zez3;
    //   926: astore #14
    //   928: new burp/Ztgc
    //   931: dup
    //   932: aload #14
    //   934: invokespecial <init> : (Lburp/Zez3;)V
    //   937: invokevirtual ZE : ()Lburp/Zs73;
    //   940: astore #15
    //   942: aload #15
    //   944: invokeinterface ZTU : ()B
    //   949: ifne -> 964
    //   952: aload_0
    //   953: getfield ZC : Lburp/Zm82;
    //   956: getfield ZI : Lburp/Zt2t;
    //   959: aload #14
    //   961: invokevirtual ZK : (Lburp/Zez3;)V
    //   964: return
    // Exception table:
    //   from	to	target	type
    //   431	490	493	finally
    //   493	498	493	finally
    //   602	690	693	finally
    //   693	698	693	finally
  }
  
  public void Zp(Zlli<Zt10> paramZlli) {
    paramZlli.ZE(Zt10.ZH, this::lambda$subscribeTo$1);
    paramZlli.ZE(Zt10.ZA, this::lambda$subscribeTo$2);
    paramZlli.ZE(Zt10.Zo, this::lambda$subscribeTo$4);
  }
  
  private void lambda$subscribeTo$4(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$subscribeTo$3);
  }
  
  private void lambda$subscribeTo$3(Zzze paramZzze) {
    Zg(paramZzze.Zs(), paramZzze.Zj());
  }
  
  private void lambda$subscribeTo$2(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zz);
  }
  
  private void lambda$subscribeTo$1(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$subscribeTo$0);
  }
  
  private void lambda$subscribeTo$0(Ztws paramZtws) {
    Zb(paramZtws.ZW(), paramZtws.ZU());
  }
  
  static {
    // Byte code:
    //   0: bipush #24
    //   2: ldc 'E\\bx~~u\\tG]'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zzh_.a : Ljava/lang/String;
    //   11: goto -> 152
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 126
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 108, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #49
    //   82: goto -> 110
    //   85: bipush #127
    //   87: goto -> 110
    //   90: iconst_3
    //   91: goto -> 110
    //   94: bipush #7
    //   96: goto -> 110
    //   99: bipush #18
    //   101: goto -> 110
    //   104: iconst_4
    //   105: goto -> 110
    //   108: bipush #126
    //   110: ixor
    //   111: ixor
    //   112: i2c
    //   113: castore
    //   114: iinc #0, 1
    //   117: dup
    //   118: ifne -> 126
    //   121: dup2
    //   122: dup_x1
    //   123: goto -> 35
    //   126: dup2_x1
    //   127: pop2
    //   128: dup_x2
    //   129: iload_0
    //   130: if_icmpgt -> 32
    //   133: pop
    //   134: new java/lang/String
    //   137: dup_x1
    //   138: swap
    //   139: invokespecial <init> : ([C)V
    //   142: invokevirtual intern : ()Ljava/lang/String;
    //   145: swap
    //   146: pop
    //   147: swap
    //   148: pop
    //   149: goto -> 8
    //   152: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzh_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */