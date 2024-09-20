package burp;

import java.util.EnumSet;

public class Zme1 extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zme1() {
    super(EnumSet.of(Zzqz.FLAGS));
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: aload #4
    //   2: getstatic burp/Ztz3.CERTIFICATE_DETAILS : Lburp/Ztz3;
    //   5: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   8: invokestatic Zn : (Ljava/lang/String;)Ljava/util/List;
    //   11: astore #12
    //   13: invokestatic Za : ()[Lburp/Zbqc;
    //   16: new java/util/ArrayList
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: astore #13
    //   25: iconst_0
    //   26: istore #14
    //   28: iconst_0
    //   29: istore #15
    //   31: astore #11
    //   33: iload #15
    //   35: aload #12
    //   37: invokeinterface size : ()I
    //   42: if_icmpge -> 309
    //   45: aload #12
    //   47: iload #15
    //   49: invokeinterface get : (I)Ljava/lang/Object;
    //   54: checkcast burp/Zgaq
    //   57: getfield Zy : I
    //   60: istore #16
    //   62: iload #16
    //   64: iconst_4
    //   65: iand
    //   66: ifeq -> 108
    //   69: iload #15
    //   71: ifne -> 78
    //   74: iconst_1
    //   75: goto -> 79
    //   78: iconst_0
    //   79: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   82: iload #15
    //   84: i2l
    //   85: iload #16
    //   87: i2l
    //   88: invokestatic ZC : (ZLnet/portswigger/Zqf;JJ)V
    //   91: aload #13
    //   93: sipush #-25404
    //   96: sipush #28245
    //   99: invokestatic a : (II)Ljava/lang/String;
    //   102: invokeinterface add : (Ljava/lang/Object;)Z
    //   107: pop
    //   108: iload #16
    //   110: bipush #8
    //   112: iand
    //   113: ifeq -> 158
    //   116: iload #15
    //   118: ifne -> 125
    //   121: iconst_1
    //   122: goto -> 126
    //   125: iconst_0
    //   126: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   129: iload #15
    //   131: i2l
    //   132: iload #16
    //   134: i2l
    //   135: invokestatic ZC : (ZLnet/portswigger/Zqf;JJ)V
    //   138: aload #13
    //   140: sipush #-25379
    //   143: sipush #7705
    //   146: invokestatic a : (II)Ljava/lang/String;
    //   149: invokeinterface add : (Ljava/lang/Object;)Z
    //   154: pop
    //   155: iconst_1
    //   156: istore #14
    //   158: iload #16
    //   160: iconst_1
    //   161: iand
    //   162: ifeq -> 233
    //   165: iload #15
    //   167: ifne -> 199
    //   170: aload #13
    //   172: sipush #-25395
    //   175: sipush #-15389
    //   178: invokestatic a : (II)Ljava/lang/String;
    //   181: invokeinterface add : (Ljava/lang/Object;)Z
    //   186: pop
    //   187: aload #11
    //   189: ifnull -> 233
    //   192: iconst_5
    //   193: anewarray burp/Zbqc
    //   196: invokestatic Zr : ([Lburp/Zbqc;)V
    //   199: aload #13
    //   201: iload #15
    //   203: sipush #-25401
    //   206: sipush #-32533
    //   209: invokestatic a : (II)Ljava/lang/String;
    //   212: swap
    //   213: sipush #-25399
    //   216: sipush #26906
    //   219: invokestatic a : (II)Ljava/lang/String;
    //   222: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   227: invokeinterface add : (Ljava/lang/Object;)Z
    //   232: pop
    //   233: iload #16
    //   235: iconst_2
    //   236: iand
    //   237: ifeq -> 301
    //   240: iload #15
    //   242: ifne -> 267
    //   245: aload #13
    //   247: sipush #-25378
    //   250: sipush #-25789
    //   253: invokestatic a : (II)Ljava/lang/String;
    //   256: invokeinterface add : (Ljava/lang/Object;)Z
    //   261: pop
    //   262: aload #11
    //   264: ifnull -> 301
    //   267: aload #13
    //   269: iload #15
    //   271: sipush #-25391
    //   274: sipush #-20164
    //   277: invokestatic a : (II)Ljava/lang/String;
    //   280: swap
    //   281: sipush #-25392
    //   284: sipush #-6748
    //   287: invokestatic a : (II)Ljava/lang/String;
    //   290: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   295: invokeinterface add : (Ljava/lang/Object;)Z
    //   300: pop
    //   301: iinc #15, 1
    //   304: aload #11
    //   306: ifnull -> 33
    //   309: new java/lang/StringBuilder
    //   312: dup
    //   313: invokespecial <init> : ()V
    //   316: astore #15
    //   318: aload #13
    //   320: invokeinterface isEmpty : ()Z
    //   325: ifeq -> 348
    //   328: aload #15
    //   330: sipush #-25407
    //   333: sipush #-4076
    //   336: invokestatic a : (II)Ljava/lang/String;
    //   339: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   342: pop
    //   343: aload #11
    //   345: ifnull -> 525
    //   348: aload #15
    //   350: sipush #-25387
    //   353: sipush #15865
    //   356: invokestatic a : (II)Ljava/lang/String;
    //   359: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: pop
    //   363: aload #15
    //   365: aload #13
    //   367: invokeinterface size : ()I
    //   372: iconst_1
    //   373: if_icmpne -> 388
    //   376: sipush #-25408
    //   379: sipush #-7781
    //   382: invokestatic a : (II)Ljava/lang/String;
    //   385: goto -> 397
    //   388: sipush #-25400
    //   391: sipush #-1220
    //   394: invokestatic a : (II)Ljava/lang/String;
    //   397: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   400: pop
    //   401: aload #15
    //   403: sipush #-25380
    //   406: sipush #-10630
    //   409: invokestatic a : (II)Ljava/lang/String;
    //   412: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   415: pop
    //   416: aload #13
    //   418: invokeinterface iterator : ()Ljava/util/Iterator;
    //   423: astore #16
    //   425: aload #16
    //   427: invokeinterface hasNext : ()Z
    //   432: ifeq -> 490
    //   435: aload #16
    //   437: invokeinterface next : ()Ljava/lang/Object;
    //   442: checkcast java/lang/String
    //   445: astore #17
    //   447: aload #15
    //   449: sipush #-25386
    //   452: sipush #30440
    //   455: invokestatic a : (II)Ljava/lang/String;
    //   458: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   461: pop
    //   462: aload #15
    //   464: aload #17
    //   466: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   469: pop
    //   470: aload #15
    //   472: sipush #-25398
    //   475: sipush #-11490
    //   478: invokestatic a : (II)Ljava/lang/String;
    //   481: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   484: pop
    //   485: aload #11
    //   487: ifnull -> 425
    //   490: aload #15
    //   492: sipush #-25390
    //   495: sipush #-26406
    //   498: invokestatic a : (II)Ljava/lang/String;
    //   501: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   504: pop
    //   505: iload #14
    //   507: ifeq -> 525
    //   510: aload #15
    //   512: sipush #-25377
    //   515: sipush #-22257
    //   518: invokestatic a : (II)Ljava/lang/String;
    //   521: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   524: pop
    //   525: aload #15
    //   527: sipush #-25385
    //   530: sipush #-9500
    //   533: invokestatic a : (II)Ljava/lang/String;
    //   536: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   539: pop
    //   540: aload #15
    //   542: aload #12
    //   544: invokeinterface size : ()I
    //   549: iconst_1
    //   550: if_icmpne -> 565
    //   553: sipush #-25403
    //   556: sipush #1565
    //   559: invokestatic a : (II)Ljava/lang/String;
    //   562: goto -> 574
    //   565: sipush #-25402
    //   568: sipush #-26942
    //   571: invokestatic a : (II)Ljava/lang/String;
    //   574: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   577: pop
    //   578: iconst_0
    //   579: istore #16
    //   581: iload #16
    //   583: aload #12
    //   585: invokeinterface size : ()I
    //   590: if_icmpge -> 798
    //   593: iload #16
    //   595: ifne -> 629
    //   598: aload #12
    //   600: invokeinterface size : ()I
    //   605: iconst_1
    //   606: if_icmple -> 661
    //   609: aload #15
    //   611: sipush #-25406
    //   614: sipush #-23315
    //   617: invokestatic a : (II)Ljava/lang/String;
    //   620: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   623: pop
    //   624: aload #11
    //   626: ifnull -> 661
    //   629: aload #15
    //   631: sipush #-25388
    //   634: sipush #2428
    //   637: invokestatic a : (II)Ljava/lang/String;
    //   640: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   643: iload #16
    //   645: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   648: sipush #-25389
    //   651: sipush #-7442
    //   654: invokestatic a : (II)Ljava/lang/String;
    //   657: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   660: pop
    //   661: aload #12
    //   663: iload #16
    //   665: invokeinterface get : (I)Ljava/lang/Object;
    //   670: checkcast burp/Zgaq
    //   673: astore #17
    //   675: aload #15
    //   677: sipush #-25405
    //   680: sipush #-15538
    //   683: invokestatic a : (II)Ljava/lang/String;
    //   686: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   689: pop
    //   690: aload #15
    //   692: aload #17
    //   694: getfield ZY : Ljava/lang/String;
    //   697: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   700: aload #15
    //   702: sipush #-25394
    //   705: sipush #3981
    //   708: invokestatic a : (II)Ljava/lang/String;
    //   711: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   714: pop
    //   715: aload #15
    //   717: aload #17
    //   719: getfield ZK : Ljava/lang/String;
    //   722: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   725: aload #15
    //   727: sipush #-25396
    //   730: sipush #-1261
    //   733: invokestatic a : (II)Ljava/lang/String;
    //   736: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   739: pop
    //   740: aload #15
    //   742: aload #17
    //   744: getfield ZJ : Ljava/lang/String;
    //   747: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   750: aload #15
    //   752: sipush #-25393
    //   755: sipush #29244
    //   758: invokestatic a : (II)Ljava/lang/String;
    //   761: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   764: pop
    //   765: aload #15
    //   767: aload #17
    //   769: getfield ZX : Ljava/lang/String;
    //   772: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   775: aload #15
    //   777: sipush #-25397
    //   780: sipush #-16716
    //   783: invokestatic a : (II)Ljava/lang/String;
    //   786: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   789: pop
    //   790: iinc #16, 1
    //   793: aload #11
    //   795: ifnull -> 581
    //   798: aload #15
    //   800: invokevirtual toString : ()Ljava/lang/String;
    //   803: areturn
  }
  
  public Zl4m Zc(Zrdb paramZrdb1, Zrdb paramZrdb2, Zgvn paramZgvn, Zz1h paramZz1h) {
    return Zp.Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '!"Îa¢h´\\rÈí¨Q Gæt¦9­ä+­I2¯8[2ü§hã²c¦÷Z@g(øß¸è}Ò2Ý:V ²¿ø¿.Í/-´^®fDàU¸ùo©È%äåÝÜÑ\\fE \\r°ònÈ$3ÌMÞºil©Tñd´bæ6æRªäÎd;Âw8ÌÚ®\\niå6Ø,Æ\\tî_]p)Ò¼'iìð9M_?Í\\b'y÷T¹²I42i{IaéÃ\\r9¯MàGP.$hÝv8ð«£×5ÌUÜýª¯ë è]aéápä®ëßÊHV5ý64>VC@ÂIÀéó·åîv8XBM*MÁ<Ù³·®$Z<úD\\rKszP.N2Gâ9X;©.sU?#bâì¸´Ç±¬Ñ;hgÕá'°OÒ/ºÄÆëß*ÀêñJJ½íÿØd*ë/À¹\\r24Ý\\b-»À-G_\+14¾·ûqùìBÉpÿp¼8\\rì@VªÏSh5L(- ñÔÜÙa÷&]Ò\\n\\rpó¡9krSçlÀ¬~7\ôqZT+öcO3¨è±8b×k®Ìít'bIwt&ÂEf[´\\rç@ùYºÆyÓ\\r¨ñU µouÁ¨@+¼¾Ó·ù<%á´!Ú¾¥WÀñÁ+ÇvZ\\bçþ»`m»þ4Ï\\ru&ÎJ®ñ¼b\\fâóÂ°m\\r.1±³VQÊÔwÉQ\\nÓAó{r×|··Øô\\re3ruNwË]ý8E#Æ÷Á}#\\n «!>ªýµ*-Ì MÉ ä3ÍÚzÛ^nO^XÌº»%&,<õótdè ß2!CPsÓ{|ÒÏ$éÍ¯Z$úÖé\\faÊ$ Ã|îf÷Õ{6ð \\n)§]^2;Ð&m¶2§<´ÆëjÆÂe\\b¼ä¢ü$Â«@}t®9JBÕ2\\r?ãçþF(£4\\b)á°§J?bùýÓ³~\\fxøµN.øé»Ñ\\b£Ûd¥ý¢'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #64
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #20
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
    //   68: ldc '¾âUÞÍÉ¥0­,î 7eýQÔÌMm'n¥õG>DűöVMQZ]Ï{ôó¹³O¹\\b9%Ð«<r-éQîÅlAU´hü¼Qò*RD}\ÑÛÕøóHµe"%û\\bø´;µ³IgGA'×ET&égá+¡\\nàÿëa"æÑ¸pöÊ),~\\röÿÞ>+ßmorbMQ&ý¨¯òqZ·scºà`]1¸;Y©¡©j§"`Ë%/¥^½º\\bÌeØ4ø7(å&à,³¥±)ASwÝê{hø¡ôz¹N+þrù'tåäJÎlæ:°Ôwÿ;9ùde7Ð|*ÖÆ¡µ®5ô?Â{,¥)ºÀé­®5zÓÓ'¾¨{0Ñv[à¶ñáSì½f \\tÊÁÚ1R³5óÚ_­@ß\\n&Õ5_Áy²COõH8i®ÒÑ§*g×¶*=Ëcà$WEhÎq,­D®@EýÎ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #37
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #90
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
    //   129: putstatic burp/Zme1.a : [Ljava/lang/String;
    //   132: bipush #28
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zme1.b : [Ljava/lang/String;
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
    //   212: bipush #38
    //   214: goto -> 243
    //   217: bipush #62
    //   219: goto -> 243
    //   222: iconst_3
    //   223: goto -> 243
    //   226: bipush #49
    //   228: goto -> 243
    //   231: bipush #7
    //   233: goto -> 243
    //   236: bipush #127
    //   238: goto -> 243
    //   241: bipush #35
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
    int i = (paramInt1 ^ 0xFFFF9CC4) & 0xFFFF;
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
      char c = 'ä';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zme1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */