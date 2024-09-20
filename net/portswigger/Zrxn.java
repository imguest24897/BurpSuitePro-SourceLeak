package net.portswigger;

import java.util.Optional;

class Zrxn implements Zak {
  final StringBuilder Zv;
  
  final Ziv ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zrxn(Ziv paramZiv, StringBuilder paramStringBuilder) {}
  
  public void ZJ(Zkr paramZkr) {
    String str = Ziv.Zw();
    if (paramZkr.Zm)
      return; 
    this.Zv.append(a(-29538, -13906)).append(paramZkr.Za()).append(a(-29547, -26825));
    Class<?>[] arrayOfClass = paramZkr.ZF;
    int i = arrayOfClass.length;
    byte b = 0;
    while (b < i) {
      Class<?> clazz = arrayOfClass[b];
      ((Optional)Ziv.Zm(this.ZE.ZD, "").apply(clazz)).ifPresent(this.Zv::lambda$visit$0);
      b++;
      if (str == null)
        break; 
    } 
  }
  
  public void ZT(Zrmx paramZrmx) {
    // Byte code:
    //   0: invokestatic Zw : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: getfield ZF : Z
    //   8: ifeq -> 12
    //   11: return
    //   12: aload_1
    //   13: getfield Zp : Ljava/lang/reflect/Type;
    //   16: checkcast java/lang/Class
    //   19: astore_3
    //   20: aload_3
    //   21: invokevirtual isEnum : ()Z
    //   24: ifeq -> 335
    //   27: iconst_0
    //   28: istore #4
    //   30: aload_1
    //   31: getfield ZP : Ljava/util/List;
    //   34: invokeinterface size : ()I
    //   39: istore #5
    //   41: iload #5
    //   43: anewarray net/portswigger/Zuc
    //   46: astore #6
    //   48: iconst_0
    //   49: istore #7
    //   51: iload #7
    //   53: iload #5
    //   55: if_icmpge -> 153
    //   58: aload_1
    //   59: getfield ZP : Ljava/util/List;
    //   62: iload #7
    //   64: invokeinterface get : (I)Ljava/lang/Object;
    //   69: checkcast net/portswigger/Zmx
    //   72: astore #8
    //   74: sipush #-29548
    //   77: sipush #3927
    //   80: invokestatic a : (II)Ljava/lang/String;
    //   83: iconst_1
    //   84: anewarray java/lang/Object
    //   87: dup
    //   88: iconst_0
    //   89: aload #8
    //   91: getfield ZV : Ljava/lang/String;
    //   94: aastore
    //   95: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   98: astore #9
    //   100: aload #6
    //   102: iload #7
    //   104: new net/portswigger/Zuc
    //   107: dup
    //   108: aload_0
    //   109: getfield ZE : Lnet/portswigger/Ziv;
    //   112: aload #9
    //   114: invokevirtual length : ()I
    //   117: aload #9
    //   119: invokespecial <init> : (Lnet/portswigger/Ziv;ILjava/lang/String;)V
    //   122: aastore
    //   123: aload #6
    //   125: iload #7
    //   127: aaload
    //   128: getfield ZA : I
    //   131: iload #4
    //   133: if_icmple -> 146
    //   136: aload #6
    //   138: iload #7
    //   140: aaload
    //   141: getfield ZA : I
    //   144: istore #4
    //   146: iinc #7, 1
    //   149: aload_2
    //   150: ifnonnull -> 51
    //   153: aload_1
    //   154: getfield ZP : Ljava/util/List;
    //   157: astore #7
    //   159: iconst_0
    //   160: istore #8
    //   162: iload #8
    //   164: iload #5
    //   166: if_icmpge -> 315
    //   169: aload #7
    //   171: iload #8
    //   173: invokeinterface get : (I)Ljava/lang/Object;
    //   178: checkcast net/portswigger/Zmx
    //   181: astore #9
    //   183: aload_0
    //   184: getfield Zv : Ljava/lang/StringBuilder;
    //   187: bipush #34
    //   189: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   192: aload #9
    //   194: getfield ZV : Ljava/lang/String;
    //   197: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: bipush #34
    //   202: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   205: pop
    //   206: aload #6
    //   208: iload #8
    //   210: aaload
    //   211: astore #10
    //   213: aload #9
    //   215: getfield Za : Ljava/lang/String;
    //   218: ifnull -> 298
    //   221: iconst_0
    //   222: istore #11
    //   224: iload #11
    //   226: iload #4
    //   228: aload #10
    //   230: getfield ZA : I
    //   233: isub
    //   234: if_icmpge -> 254
    //   237: aload_0
    //   238: getfield Zv : Ljava/lang/StringBuilder;
    //   241: bipush #32
    //   243: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   246: pop
    //   247: iinc #11, 1
    //   250: aload_2
    //   251: ifnonnull -> 224
    //   254: aload_0
    //   255: getfield Zv : Ljava/lang/StringBuilder;
    //   258: sipush #-29543
    //   261: sipush #21828
    //   264: invokestatic a : (II)Ljava/lang/String;
    //   267: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: pop
    //   271: aload_0
    //   272: getfield Zv : Ljava/lang/StringBuilder;
    //   275: aload #9
    //   277: getfield Za : Ljava/lang/String;
    //   280: sipush #-29551
    //   283: sipush #-15185
    //   286: invokestatic a : (II)Ljava/lang/String;
    //   289: ldc ' '
    //   291: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   294: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   297: pop
    //   298: aload_0
    //   299: getfield Zv : Ljava/lang/StringBuilder;
    //   302: bipush #10
    //   304: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   307: pop
    //   308: iinc #8, 1
    //   311: aload_2
    //   312: ifnonnull -> 162
    //   315: aload_0
    //   316: getfield Zv : Ljava/lang/StringBuilder;
    //   319: aload_0
    //   320: getfield Zv : Ljava/lang/StringBuilder;
    //   323: invokevirtual length : ()I
    //   326: iconst_1
    //   327: isub
    //   328: invokevirtual setLength : (I)V
    //   331: aload_2
    //   332: ifnonnull -> 856
    //   335: iconst_0
    //   336: istore #4
    //   338: aload_1
    //   339: getfield ZP : Ljava/util/List;
    //   342: invokeinterface size : ()I
    //   347: istore #5
    //   349: iload #5
    //   351: anewarray net/portswigger/Zuc
    //   354: astore #6
    //   356: iconst_0
    //   357: istore #7
    //   359: iload #7
    //   361: iload #5
    //   363: if_icmpge -> 527
    //   366: aload_1
    //   367: getfield ZP : Ljava/util/List;
    //   370: iload #7
    //   372: invokeinterface get : (I)Ljava/lang/Object;
    //   377: checkcast net/portswigger/Zmx
    //   380: astore #8
    //   382: aload #6
    //   384: iload #7
    //   386: new net/portswigger/Zuc
    //   389: dup
    //   390: aload_0
    //   391: getfield ZE : Lnet/portswigger/Ziv;
    //   394: sipush #-29542
    //   397: sipush #-19291
    //   400: invokestatic a : (II)Ljava/lang/String;
    //   403: iconst_2
    //   404: anewarray java/lang/Object
    //   407: dup
    //   408: iconst_0
    //   409: aload #8
    //   411: getfield ZV : Ljava/lang/String;
    //   414: aastore
    //   415: dup
    //   416: iconst_1
    //   417: aload_0
    //   418: getfield ZE : Lnet/portswigger/Ziv;
    //   421: getfield ZD : Lnet/portswigger/Ztj;
    //   424: aload #8
    //   426: getfield Ze : Ljava/lang/reflect/Type;
    //   429: invokevirtual Zz : (Ljava/lang/reflect/Type;)Ljava/lang/String;
    //   432: aastore
    //   433: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   436: invokevirtual length : ()I
    //   439: sipush #-29549
    //   442: sipush #-28126
    //   445: invokestatic a : (II)Ljava/lang/String;
    //   448: iconst_2
    //   449: anewarray java/lang/Object
    //   452: dup
    //   453: iconst_0
    //   454: aload #8
    //   456: getfield ZV : Ljava/lang/String;
    //   459: aastore
    //   460: dup
    //   461: iconst_1
    //   462: aload_0
    //   463: getfield ZE : Lnet/portswigger/Ziv;
    //   466: getfield ZD : Lnet/portswigger/Ztj;
    //   469: aload #8
    //   471: getfield Ze : Ljava/lang/reflect/Type;
    //   474: aload_0
    //   475: getfield ZE : Lnet/portswigger/Ziv;
    //   478: getfield ZD : Lnet/portswigger/Ztj;
    //   481: ldc ''
    //   483: invokestatic Zm : (Lnet/portswigger/Ztj;Ljava/lang/String;)Ljava/util/function/Function;
    //   486: invokevirtual ZQ : (Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/lang/String;
    //   489: aastore
    //   490: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   493: invokespecial <init> : (Lnet/portswigger/Ziv;ILjava/lang/String;)V
    //   496: aastore
    //   497: aload #6
    //   499: iload #7
    //   501: aaload
    //   502: getfield ZA : I
    //   505: iload #4
    //   507: if_icmple -> 520
    //   510: aload #6
    //   512: iload #7
    //   514: aaload
    //   515: getfield ZA : I
    //   518: istore #4
    //   520: iinc #7, 1
    //   523: aload_2
    //   524: ifnonnull -> 359
    //   527: aload_0
    //   528: getfield Zv : Ljava/lang/StringBuilder;
    //   531: sipush #-29544
    //   534: sipush #28925
    //   537: invokestatic a : (II)Ljava/lang/String;
    //   540: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   543: pop
    //   544: iconst_0
    //   545: istore #7
    //   547: iload #7
    //   549: iload #5
    //   551: if_icmpge -> 846
    //   554: iload #7
    //   556: iload #5
    //   558: iconst_1
    //   559: isub
    //   560: if_icmpne -> 567
    //   563: iconst_1
    //   564: goto -> 568
    //   567: iconst_0
    //   568: istore #8
    //   570: aload_1
    //   571: getfield ZP : Ljava/util/List;
    //   574: iload #7
    //   576: invokeinterface get : (I)Ljava/lang/Object;
    //   581: checkcast net/portswigger/Zmx
    //   584: astore #9
    //   586: aload #6
    //   588: iload #7
    //   590: aaload
    //   591: astore #10
    //   593: aload_0
    //   594: getfield Zv : Ljava/lang/StringBuilder;
    //   597: sipush #-29550
    //   600: sipush #-3403
    //   603: invokestatic a : (II)Ljava/lang/String;
    //   606: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   609: aload #10
    //   611: getfield Zg : Ljava/lang/String;
    //   614: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   617: pop
    //   618: iload #8
    //   620: ifne -> 633
    //   623: aload_0
    //   624: getfield Zv : Ljava/lang/StringBuilder;
    //   627: bipush #44
    //   629: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   632: pop
    //   633: aload_1
    //   634: getfield Zc : Lnet/portswigger/Znu;
    //   637: ifnonnull -> 644
    //   640: aconst_null
    //   641: goto -> 662
    //   644: aload_1
    //   645: getfield Zc : Lnet/portswigger/Znu;
    //   648: getfield ZW : Lnet/portswigger/Zrx_;
    //   651: aload #9
    //   653: getfield ZV : Ljava/lang/String;
    //   656: invokevirtual ZW : (Ljava/lang/String;)Lnet/portswigger/Zm7;
    //   659: getfield ZN : Ljava/lang/String;
    //   662: astore #11
    //   664: aload #9
    //   666: getfield Za : Ljava/lang/String;
    //   669: ifnonnull -> 677
    //   672: aload #11
    //   674: ifnull -> 742
    //   677: iload #8
    //   679: ifeq -> 692
    //   682: aload_0
    //   683: getfield Zv : Ljava/lang/StringBuilder;
    //   686: bipush #32
    //   688: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   691: pop
    //   692: iconst_0
    //   693: istore #12
    //   695: iload #12
    //   697: iload #4
    //   699: aload #10
    //   701: getfield ZA : I
    //   704: isub
    //   705: if_icmpge -> 725
    //   708: aload_0
    //   709: getfield Zv : Ljava/lang/StringBuilder;
    //   712: bipush #32
    //   714: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   717: pop
    //   718: iinc #12, 1
    //   721: aload_2
    //   722: ifnonnull -> 695
    //   725: aload_0
    //   726: getfield Zv : Ljava/lang/StringBuilder;
    //   729: sipush #-29541
    //   732: sipush #-5275
    //   735: invokestatic a : (II)Ljava/lang/String;
    //   738: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   741: pop
    //   742: aload #9
    //   744: getfield Za : Ljava/lang/String;
    //   747: ifnull -> 777
    //   750: aload_0
    //   751: getfield Zv : Ljava/lang/StringBuilder;
    //   754: aload #9
    //   756: getfield Za : Ljava/lang/String;
    //   759: sipush #-29539
    //   762: sipush #4592
    //   765: invokestatic a : (II)Ljava/lang/String;
    //   768: ldc ' '
    //   770: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   773: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   776: pop
    //   777: aload #11
    //   779: ifnull -> 829
    //   782: aload #9
    //   784: getfield Za : Ljava/lang/String;
    //   787: ifnull -> 807
    //   790: aload_0
    //   791: getfield Zv : Ljava/lang/StringBuilder;
    //   794: sipush #-29552
    //   797: sipush #-20696
    //   800: invokestatic a : (II)Ljava/lang/String;
    //   803: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   806: pop
    //   807: aload_0
    //   808: getfield Zv : Ljava/lang/StringBuilder;
    //   811: sipush #-29540
    //   814: sipush #-7651
    //   817: invokestatic a : (II)Ljava/lang/String;
    //   820: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   823: aload #11
    //   825: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   828: pop
    //   829: aload_0
    //   830: getfield Zv : Ljava/lang/StringBuilder;
    //   833: bipush #10
    //   835: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   838: pop
    //   839: iinc #7, 1
    //   842: aload_2
    //   843: ifnonnull -> 547
    //   846: aload_0
    //   847: getfield Zv : Ljava/lang/StringBuilder;
    //   850: ldc '}'
    //   852: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   855: pop
    //   856: return
  }
  
  private static void lambda$visit$0(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append(a(-29537, -12290));
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Xú~¯Ó\\bPÆûäÌÊð%ñ¸\\rJì#ÃbÚ,Ö8¦oAõ\\r°|ôhò:J·Y%êª9îB:P³\\b`÷ý«$\\bR'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #73
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc '\\t¶ÂÕÆÃ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_4
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #89
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic net/portswigger/Zrxn.a : [Ljava/lang/String;
    //   130: bipush #14
    //   132: anewarray java/lang/String
    //   135: putstatic net/portswigger/Zrxn.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #70
    //   214: goto -> 244
    //   217: bipush #38
    //   219: goto -> 244
    //   222: bipush #76
    //   224: goto -> 244
    //   227: bipush #82
    //   229: goto -> 244
    //   232: bipush #85
    //   234: goto -> 244
    //   237: bipush #17
    //   239: goto -> 244
    //   242: bipush #8
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8C98) & 0xFFFF;
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
      char c = '';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrxn.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */