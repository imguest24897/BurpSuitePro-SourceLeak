package burp;

class Zlch {
  private final Zrdb Zo;
  
  private final Zree Zn;
  
  private final boolean ZA;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zlch(Zrdb paramZrdb, Zree paramZree, boolean paramBoolean) {
    this.Zo = paramZrdb;
    this.Zn = paramZree;
    this.ZA = paramBoolean;
  }
  
  String Z_(boolean paramBoolean) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: getstatic burp/Zt00.DEFAULT_FONT : Lburp/Zt00;
    //   11: invokevirtual ZV : ()Ljava/awt/Font;
    //   14: astore #4
    //   16: invokestatic ZL : ()[Lburp/Zbqc;
    //   19: aload #4
    //   21: invokevirtual getFamily : ()Ljava/lang/String;
    //   24: sipush #14475
    //   27: sipush #21725
    //   30: invokestatic a : (II)Ljava/lang/String;
    //   33: swap
    //   34: sipush #14506
    //   37: sipush #-31684
    //   40: invokestatic a : (II)Ljava/lang/String;
    //   43: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   48: astore #5
    //   50: aload #4
    //   52: invokevirtual getSize : ()I
    //   55: iconst_2
    //   56: isub
    //   57: sipush #14527
    //   60: sipush #31035
    //   63: invokestatic a : (II)Ljava/lang/String;
    //   66: swap
    //   67: sipush #14522
    //   70: sipush #-19209
    //   73: invokestatic a : (II)Ljava/lang/String;
    //   76: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   81: astore #6
    //   83: sipush #14514
    //   86: sipush #-12745
    //   89: invokestatic a : (II)Ljava/lang/String;
    //   92: iconst_4
    //   93: anewarray java/lang/Object
    //   96: dup
    //   97: iconst_0
    //   98: getstatic burp/Zlkk.FOREGROUND : Lburp/Zlkk;
    //   101: invokevirtual ZC : ()Ljava/lang/String;
    //   104: aastore
    //   105: dup
    //   106: iconst_1
    //   107: aload #5
    //   109: aastore
    //   110: dup
    //   111: iconst_2
    //   112: aload #6
    //   114: aastore
    //   115: dup
    //   116: iconst_3
    //   117: getstatic burp/Zlkk.HTML_LINK_FOREGROUND : Lburp/Zlkk;
    //   120: invokevirtual ZC : ()Ljava/lang/String;
    //   123: aastore
    //   124: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   127: astore #7
    //   129: aload_3
    //   130: sipush #14474
    //   133: sipush #-24268
    //   136: invokestatic a : (II)Ljava/lang/String;
    //   139: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: pop
    //   143: aload_3
    //   144: sipush #14479
    //   147: sipush #12573
    //   150: invokestatic a : (II)Ljava/lang/String;
    //   153: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: aload #7
    //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: sipush #14516
    //   164: sipush #28846
    //   167: invokestatic a : (II)Ljava/lang/String;
    //   170: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: pop
    //   174: aload_3
    //   175: sipush #14511
    //   178: sipush #27297
    //   181: invokestatic a : (II)Ljava/lang/String;
    //   184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: pop
    //   188: astore_2
    //   189: iload_1
    //   190: ifeq -> 522
    //   193: aload_3
    //   194: sipush #14518
    //   197: sipush #-13516
    //   200: invokestatic a : (II)Ljava/lang/String;
    //   203: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: aload_0
    //   207: getfield Zn : Lburp/Zree;
    //   210: invokeinterface ZZV : ()Ljava/lang/String;
    //   215: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: sipush #14517
    //   221: sipush #-32168
    //   224: invokestatic a : (II)Ljava/lang/String;
    //   227: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: pop
    //   231: aload_3
    //   232: sipush #14507
    //   235: sipush #23411
    //   238: invokestatic a : (II)Ljava/lang/String;
    //   241: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   244: pop
    //   245: aload_3
    //   246: sipush #14523
    //   249: sipush #-12467
    //   252: invokestatic a : (II)Ljava/lang/String;
    //   255: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: pop
    //   259: aload_3
    //   260: sipush #14502
    //   263: sipush #-13116
    //   266: invokestatic a : (II)Ljava/lang/String;
    //   269: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   272: invokestatic ZH : ()F
    //   275: ldc 8.0
    //   277: fmul
    //   278: f2i
    //   279: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   282: sipush #14509
    //   285: sipush #-26570
    //   288: invokestatic a : (II)Ljava/lang/String;
    //   291: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   294: pop
    //   295: aload_3
    //   296: aload_0
    //   297: getfield ZA : Z
    //   300: ifeq -> 315
    //   303: aload_0
    //   304: getfield Zo : Lburp/Zrdb;
    //   307: invokeinterface ZaJ : ()B
    //   312: goto -> 324
    //   315: aload_0
    //   316: getfield Zo : Lburp/Zrdb;
    //   319: invokeinterface Zaw : ()B
    //   324: invokestatic Zx : (B)Ljava/lang/String;
    //   327: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   330: pop
    //   331: aload_3
    //   332: sipush #14476
    //   335: sipush #-12384
    //   338: invokestatic a : (II)Ljava/lang/String;
    //   341: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   344: pop
    //   345: aload_3
    //   346: sipush #14510
    //   349: sipush #28119
    //   352: invokestatic a : (II)Ljava/lang/String;
    //   355: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   358: pop
    //   359: aload_3
    //   360: aload_0
    //   361: getfield ZA : Z
    //   364: ifeq -> 379
    //   367: aload_0
    //   368: getfield Zo : Lburp/Zrdb;
    //   371: invokeinterface Zac : ()B
    //   376: goto -> 388
    //   379: aload_0
    //   380: getfield Zo : Lburp/Zrdb;
    //   383: invokeinterface Zak : ()B
    //   388: invokestatic ZO : (B)Ljava/lang/String;
    //   391: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   394: pop
    //   395: aload_3
    //   396: sipush #14525
    //   399: sipush #-20405
    //   402: invokestatic a : (II)Ljava/lang/String;
    //   405: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   408: pop
    //   409: aload_3
    //   410: sipush #14499
    //   413: sipush #12867
    //   416: invokestatic a : (II)Ljava/lang/String;
    //   419: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   422: pop
    //   423: aload_0
    //   424: getfield Zo : Lburp/Zrdb;
    //   427: invokeinterface ZaB : ()Lburp/Zmzk;
    //   432: astore #8
    //   434: aload_3
    //   435: aload #8
    //   437: ifnonnull -> 445
    //   440: ldc ''
    //   442: goto -> 452
    //   445: aload #8
    //   447: invokeinterface toString : ()Ljava/lang/String;
    //   452: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   455: aload_0
    //   456: getfield Zo : Lburp/Zrdb;
    //   459: invokeinterface Zax : ()[B
    //   464: astore #9
    //   466: aload #9
    //   468: ifnull -> 480
    //   471: aload_3
    //   472: aload #9
    //   474: invokestatic ZG : ([B)Ljava/lang/String;
    //   477: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   480: aload_3
    //   481: sipush #14525
    //   484: sipush #-20405
    //   487: invokestatic a : (II)Ljava/lang/String;
    //   490: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   493: pop
    //   494: aload_3
    //   495: sipush #14508
    //   498: sipush #8285
    //   501: invokestatic a : (II)Ljava/lang/String;
    //   504: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   507: pop
    //   508: aload_3
    //   509: sipush #14497
    //   512: sipush #-13367
    //   515: invokestatic a : (II)Ljava/lang/String;
    //   518: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   521: pop
    //   522: aload_0
    //   523: getfield Zo : Lburp/Zrdb;
    //   526: invokeinterface Za6 : ()Lburp/Zvs;
    //   531: invokeinterface ZH : ()Z
    //   536: ifeq -> 705
    //   539: aload_0
    //   540: getfield Zo : Lburp/Zrdb;
    //   543: invokeinterface ZaT : ()Lburp/Ztlj;
    //   548: getstatic burp/Ztz3.EXTENSION_NAME : Lburp/Ztz3;
    //   551: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   554: astore #8
    //   556: aload #8
    //   558: ifnonnull -> 625
    //   561: aload_3
    //   562: sipush #14501
    //   565: sipush #23886
    //   568: invokestatic a : (II)Ljava/lang/String;
    //   571: iconst_1
    //   572: anewarray java/lang/Object
    //   575: dup
    //   576: iconst_0
    //   577: aload_0
    //   578: getfield Zo : Lburp/Zrdb;
    //   581: invokeinterface Za6 : ()Lburp/Zvs;
    //   586: getstatic burp/Zzu2.EXTENSION_GENERATED : Lburp/Zzu2;
    //   589: if_acmpne -> 604
    //   592: sipush #14515
    //   595: sipush #21530
    //   598: invokestatic a : (II)Ljava/lang/String;
    //   601: goto -> 613
    //   604: sipush #14498
    //   607: sipush #-27022
    //   610: invokestatic a : (II)Ljava/lang/String;
    //   613: aastore
    //   614: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   617: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   620: pop
    //   621: aload_2
    //   622: ifnonnull -> 705
    //   625: aload_3
    //   626: sipush #14526
    //   629: sipush #30229
    //   632: invokestatic a : (II)Ljava/lang/String;
    //   635: iconst_1
    //   636: anewarray java/lang/Object
    //   639: dup
    //   640: iconst_0
    //   641: aload_0
    //   642: getfield Zo : Lburp/Zrdb;
    //   645: invokeinterface Za6 : ()Lburp/Zvs;
    //   650: getstatic burp/Zzu2.EXTENSION_GENERATED : Lburp/Zzu2;
    //   653: if_acmpne -> 668
    //   656: sipush #14504
    //   659: sipush #-31977
    //   662: invokestatic a : (II)Ljava/lang/String;
    //   665: goto -> 677
    //   668: sipush #14512
    //   671: sipush #27033
    //   674: invokestatic a : (II)Ljava/lang/String;
    //   677: aastore
    //   678: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   681: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   684: pop
    //   685: aload_3
    //   686: aload #8
    //   688: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   691: aload_3
    //   692: sipush #14472
    //   695: sipush #14395
    //   698: invokestatic a : (II)Ljava/lang/String;
    //   701: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   704: pop
    //   705: aload_0
    //   706: getfield Zo : Lburp/Zrdb;
    //   709: invokeinterface Zai : ()Ljava/lang/String;
    //   714: astore #8
    //   716: aload #8
    //   718: ifnull -> 749
    //   721: aload_3
    //   722: sipush #14524
    //   725: sipush #-31270
    //   728: invokestatic a : (II)Ljava/lang/String;
    //   731: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   734: pop
    //   735: aload_0
    //   736: aload_3
    //   737: aload #8
    //   739: invokevirtual Zp : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   742: aload_3
    //   743: ldc '\\n'
    //   745: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   748: pop
    //   749: aload_0
    //   750: getfield Zo : Lburp/Zrdb;
    //   753: invokeinterface ZaR : ()Ljava/lang/String;
    //   758: astore #9
    //   760: aload #9
    //   762: ifnull -> 793
    //   765: aload_3
    //   766: sipush #14519
    //   769: sipush #17132
    //   772: invokestatic a : (II)Ljava/lang/String;
    //   775: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   778: pop
    //   779: aload_0
    //   780: aload_3
    //   781: aload #9
    //   783: invokevirtual Zp : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   786: aload_3
    //   787: ldc '\\n'
    //   789: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   792: pop
    //   793: aload #8
    //   795: ifnonnull -> 803
    //   798: aload #9
    //   800: ifnull -> 817
    //   803: aload_3
    //   804: sipush #14520
    //   807: sipush #14855
    //   810: invokestatic a : (II)Ljava/lang/String;
    //   813: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   816: pop
    //   817: aload_0
    //   818: getfield Zn : Lburp/Zree;
    //   821: invokeinterface ZZA : ()Ljava/lang/String;
    //   826: astore #10
    //   828: aload #10
    //   830: ifnull -> 878
    //   833: aload_3
    //   834: aload #8
    //   836: ifnonnull -> 851
    //   839: sipush #14496
    //   842: sipush #12580
    //   845: invokestatic a : (II)Ljava/lang/String;
    //   848: goto -> 860
    //   851: sipush #14521
    //   854: sipush #-11236
    //   857: invokestatic a : (II)Ljava/lang/String;
    //   860: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   863: pop
    //   864: aload_0
    //   865: aload_3
    //   866: aload #10
    //   868: invokevirtual Zp : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   871: aload_3
    //   872: ldc '\\n'
    //   874: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   877: pop
    //   878: aload_0
    //   879: getfield Zn : Lburp/Zree;
    //   882: invokeinterface ZZH : ()Ljava/lang/String;
    //   887: astore #11
    //   889: aload #11
    //   891: ifnull -> 939
    //   894: aload_3
    //   895: aload #9
    //   897: ifnonnull -> 912
    //   900: sipush #14505
    //   903: sipush #25143
    //   906: invokestatic a : (II)Ljava/lang/String;
    //   909: goto -> 921
    //   912: sipush #14500
    //   915: sipush #19624
    //   918: invokestatic a : (II)Ljava/lang/String;
    //   921: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   924: pop
    //   925: aload_0
    //   926: aload_3
    //   927: aload #11
    //   929: invokevirtual Zp : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   932: aload_3
    //   933: ldc '\\n'
    //   935: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   938: pop
    //   939: aload #10
    //   941: ifnonnull -> 949
    //   944: aload #11
    //   946: ifnull -> 963
    //   949: aload_3
    //   950: sipush #14503
    //   953: sipush #12353
    //   956: invokestatic a : (II)Ljava/lang/String;
    //   959: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   962: pop
    //   963: aload_0
    //   964: getfield Zn : Lburp/Zree;
    //   967: invokeinterface ZZK : ()Ljava/lang/String;
    //   972: astore #12
    //   974: aload #12
    //   976: ifnull -> 1007
    //   979: aload_3
    //   980: sipush #14513
    //   983: sipush #-24768
    //   986: invokestatic a : (II)Ljava/lang/String;
    //   989: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   992: pop
    //   993: aload_3
    //   994: aload #12
    //   996: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   999: pop
    //   1000: aload_3
    //   1001: ldc '\\n'
    //   1003: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1006: pop
    //   1007: aload_0
    //   1008: getfield Zn : Lburp/Zree;
    //   1011: invokeinterface ZZF : ()Ljava/lang/String;
    //   1016: astore #13
    //   1018: aload #13
    //   1020: ifnull -> 1051
    //   1023: aload_3
    //   1024: sipush #14473
    //   1027: sipush #1185
    //   1030: invokestatic a : (II)Ljava/lang/String;
    //   1033: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1036: pop
    //   1037: aload_3
    //   1038: aload #13
    //   1040: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1043: pop
    //   1044: aload_3
    //   1045: ldc '\\n'
    //   1047: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1050: pop
    //   1051: aload_3
    //   1052: sipush #14477
    //   1055: sipush #-31273
    //   1058: invokestatic a : (II)Ljava/lang/String;
    //   1061: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1064: pop
    //   1065: aload_3
    //   1066: invokevirtual toString : ()Ljava/lang/String;
    //   1069: invokestatic Zwu : ()[Lburp/Zbqc;
    //   1072: ifnonnull -> 1082
    //   1075: iconst_3
    //   1076: anewarray burp/Zbqc
    //   1079: invokestatic Zo : ([Lburp/Zbqc;)V
    //   1082: areturn
  }
  
  private void Zp(StringBuilder paramStringBuilder, String paramString) {
    Zbqc[] arrayOfZbqc = Zxaf.ZL();
    if (this.Zo.Za6() == Zzu2.BCHECK_GENERATED) {
      Zrlp.ZO(paramStringBuilder, paramString, false);
      if (arrayOfZbqc == null) {
        paramStringBuilder.append(paramString);
        return;
      } 
      return;
    } 
    paramStringBuilder.append(paramString);
  }
  
  static {
    // Byte code:
    //   0: bipush #39
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Cnë×éçbHÿÁÕ])óÒ¾Ç@HÎé`Næ'^>·Äic£¶«(¬*aE0ÝÔüÙP½¸Qò+ ðÃÿCÇÄ3ÖT*;X|!Vî¸^Áá3%ÍPGK)<B-ã£m;dÚ^MN\\tò~%9ê4wYå"ó(9ó¢@È\\r£<p]zKØÈÞåNý\\bêf÷gøýP\\tÓwRëûoI,,G,ñ\\nÐRãÿ"ýhze>IË-ªe!º·@âQY"¡>¡õÙEçMÿ(©-0`&wø96\\b'çàõK\\\n·©d**H âej/+aJèúau<Äô¼M«ìïSÔO\´ ©ã/àÂqíur]ûÀ_ö^+È|Îñ1n8\\n£´V(ZCU(ÊÇÜ\\nê\\r¡¸uå;?}\\t¼´>ÿ7Qvg4~÷Öøí\\nPa(¤ç\\rá©=\\b(ÓK«°¦Äó" ¡\\r¨I¤Òøj3Èa,s¹zg"ú!Ì»88ÞÃ#4°<Faþ[-S¿ä5ÉVÕy¿¥ÇÙÑæ¤étò9"7#@T\\f"4éV³É%óBÉUòõk¡Ë9<¨e ê(tìÉÂEcI{L¯ÆøµÃÜî1ëêMÞ³.s=nÇÞ î¤þLg *ÇÄÆÉZá8ÖéXçwÿqkn3±¢0ÈAed-þ­êwÎXÀ`8öùìXGÝ;ÆnäÂªá¯W§CãwÒÐ"4xNÉÕÝn¢+»ÎÝ]&7n'_S×Ó®_(&uUüä ¥l§Tiu©\\rµQ·¦ãÙ9Îª8ÚHWRh8w:«Â§½Ø5¨û¹çÂm£æZinIgpîâÉ9÷\\bùfç"\\np´-úÃE­BØý°wÔSüPñ;+\\f5­ lnO*'aÈ¯uöÚK­WYnVdd0£yNð½¯;öaj>¥ªç3Ù`Ö\\rÖOm¨ÝÅ­Zn÷\\t·EÅã·ÄÈÍ+ô£¡'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #27
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #15
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc 'fvÇî_¿*E\\nË³\Ý'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #11
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: iconst_1
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 82
    //   126: aload #5
    //   128: putstatic burp/Zlch.a : [Ljava/lang/String;
    //   131: bipush #39
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zlch.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #100
    //   214: goto -> 244
    //   217: bipush #54
    //   219: goto -> 244
    //   222: bipush #105
    //   224: goto -> 244
    //   227: bipush #105
    //   229: goto -> 244
    //   232: bipush #49
    //   234: goto -> 244
    //   237: bipush #90
    //   239: goto -> 244
    //   242: bipush #78
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x38A9) & 0xFFFF;
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
      byte b1 = 65;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlch.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */