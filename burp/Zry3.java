package burp;

public class Zry3 {
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zlit ZL(String paramString, Zlit paramZlit, Zbnt paramZbnt) {
    // Byte code:
    //   0: invokestatic ZE : ()[I
    //   3: astore_3
    //   4: aload_0
    //   5: ifnull -> 22
    //   8: aload_0
    //   9: invokevirtual isEmpty : ()Z
    //   12: ifeq -> 24
    //   15: goto -> 22
    //   18: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   21: athrow
    //   22: aconst_null
    //   23: areturn
    //   24: aload_0
    //   25: iconst_0
    //   26: invokevirtual charAt : (I)C
    //   29: istore #5
    //   31: iload #5
    //   33: lookupswitch default -> 113, 35 -> 111, 45 -> 100, 46 -> 100, 47 -> 100, 63 -> 100, 95 -> 100, 126 -> 100
    //   100: aload_3
    //   101: ifnull -> 130
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   110: athrow
    //   111: aload_1
    //   112: areturn
    //   113: iload #5
    //   115: invokestatic isLetterOrDigit : (C)Z
    //   118: ifeq -> 128
    //   121: goto -> 130
    //   124: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   127: athrow
    //   128: aconst_null
    //   129: areturn
    //   130: aload_0
    //   131: invokestatic Zn : (Ljava/lang/String;)Ljava/lang/String;
    //   134: astore_0
    //   135: aload_0
    //   136: ldc '#'
    //   138: invokevirtual indexOf : (Ljava/lang/String;)I
    //   141: dup
    //   142: istore #6
    //   144: iconst_m1
    //   145: if_icmpeq -> 156
    //   148: aload_0
    //   149: iconst_0
    //   150: iload #6
    //   152: invokevirtual substring : (II)Ljava/lang/String;
    //   155: astore_0
    //   156: aload_0
    //   157: iconst_1
    //   158: invokestatic ZO : (Ljava/lang/String;Z)I
    //   161: dup
    //   162: istore #7
    //   164: iconst_m1
    //   165: if_icmpeq -> 188
    //   168: aload_0
    //   169: iload #7
    //   171: invokevirtual substring : (I)Ljava/lang/String;
    //   174: astore #8
    //   176: aload_0
    //   177: iconst_0
    //   178: iload #7
    //   180: invokevirtual substring : (II)Ljava/lang/String;
    //   183: astore_0
    //   184: aload_3
    //   185: ifnull -> 192
    //   188: ldc ''
    //   190: astore #8
    //   192: aload_0
    //   193: ldc '\'
    //   195: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   198: ifeq -> 210
    //   201: aload_0
    //   202: bipush #92
    //   204: bipush #47
    //   206: invokevirtual replace : (CC)Ljava/lang/String;
    //   209: astore_0
    //   210: aload_0
    //   211: aload #8
    //   213: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   218: astore_0
    //   219: aload_1
    //   220: ifnull -> 247
    //   223: aload_1
    //   224: invokeinterface Zdr : ()Z
    //   229: ifeq -> 247
    //   232: goto -> 239
    //   235: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   238: athrow
    //   239: iconst_1
    //   240: goto -> 248
    //   243: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   246: athrow
    //   247: iconst_0
    //   248: istore #9
    //   250: aload_0
    //   251: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   254: astore #10
    //   256: aload #10
    //   258: sipush #18679
    //   261: sipush #9720
    //   264: invokestatic a : (II)Ljava/lang/String;
    //   267: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   270: ifne -> 345
    //   273: aload #10
    //   275: sipush #18664
    //   278: sipush #7943
    //   281: invokestatic a : (II)Ljava/lang/String;
    //   284: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   287: ifne -> 345
    //   290: goto -> 297
    //   293: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   296: athrow
    //   297: aload #10
    //   299: sipush #18677
    //   302: sipush #2540
    //   305: invokestatic a : (II)Ljava/lang/String;
    //   308: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   311: ifne -> 345
    //   314: goto -> 321
    //   317: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   320: athrow
    //   321: aload #10
    //   323: sipush #18669
    //   326: sipush #353
    //   329: invokestatic a : (II)Ljava/lang/String;
    //   332: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   335: ifeq -> 359
    //   338: goto -> 345
    //   341: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   344: athrow
    //   345: aload_0
    //   346: aload_2
    //   347: invokestatic Zb : (Ljava/lang/String;Lburp/Zbnt;)Lburp/Zlit;
    //   350: astore #4
    //   352: aload #4
    //   354: ifnonnull -> 815
    //   357: aconst_null
    //   358: areturn
    //   359: aload_0
    //   360: sipush #18687
    //   363: sipush #-22384
    //   366: invokestatic a : (II)Ljava/lang/String;
    //   369: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   372: ifeq -> 545
    //   375: iload #9
    //   377: ifeq -> 408
    //   380: goto -> 387
    //   383: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   386: athrow
    //   387: aload_0
    //   388: sipush #18682
    //   391: sipush #9567
    //   394: invokestatic a : (II)Ljava/lang/String;
    //   397: swap
    //   398: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   403: astore_0
    //   404: aload_3
    //   405: ifnull -> 425
    //   408: aload_0
    //   409: sipush #18672
    //   412: sipush #29244
    //   415: invokestatic a : (II)Ljava/lang/String;
    //   418: swap
    //   419: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   424: astore_0
    //   425: new java/net/URL
    //   428: dup
    //   429: aload_0
    //   430: invokespecial <init> : (Ljava/lang/String;)V
    //   433: astore #11
    //   435: aload #11
    //   437: invokevirtual getHost : ()Ljava/lang/String;
    //   440: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   443: astore #12
    //   445: aload #12
    //   447: invokestatic Zc : (Ljava/lang/String;)Z
    //   450: ifne -> 455
    //   453: aconst_null
    //   454: areturn
    //   455: aload #11
    //   457: invokevirtual getPort : ()I
    //   460: iconst_m1
    //   461: if_icmpne -> 514
    //   464: new burp/Zax
    //   467: dup
    //   468: aload #12
    //   470: iload #9
    //   472: ifeq -> 492
    //   475: goto -> 482
    //   478: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   481: athrow
    //   482: sipush #443
    //   485: goto -> 494
    //   488: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   491: athrow
    //   492: bipush #80
    //   494: iload #9
    //   496: aload #11
    //   498: invokevirtual getFile : ()Ljava/lang/String;
    //   501: invokestatic Zy : (Ljava/lang/String;)[B
    //   504: aload_2
    //   505: invokespecial <init> : (Ljava/lang/String;IZ[BLburp/Zbnt;)V
    //   508: astore #4
    //   510: aload_3
    //   511: ifnull -> 541
    //   514: new burp/Zax
    //   517: dup
    //   518: aload #12
    //   520: aload #11
    //   522: invokevirtual getPort : ()I
    //   525: iload #9
    //   527: aload #11
    //   529: invokevirtual getFile : ()Ljava/lang/String;
    //   532: invokestatic Zy : (Ljava/lang/String;)[B
    //   535: aload_2
    //   536: invokespecial <init> : (Ljava/lang/String;IZ[BLburp/Zbnt;)V
    //   539: astore #4
    //   541: aload_3
    //   542: ifnull -> 815
    //   545: aload_0
    //   546: ldc '/'
    //   548: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   551: ifeq -> 595
    //   554: goto -> 561
    //   557: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   560: athrow
    //   561: aload_1
    //   562: ifnull -> 595
    //   565: goto -> 572
    //   568: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   571: athrow
    //   572: new burp/Zax
    //   575: dup
    //   576: aload_1
    //   577: invokeinterface Zdz : ()Lburp/Zmzk;
    //   582: aload_0
    //   583: invokestatic Zy : (Ljava/lang/String;)[B
    //   586: invokespecial <init> : (Lburp/Zmzk;[B)V
    //   589: astore #4
    //   591: aload_3
    //   592: ifnull -> 815
    //   595: aload_0
    //   596: ldc '''
    //   598: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   601: ifeq -> 613
    //   604: goto -> 611
    //   607: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   610: athrow
    //   611: aconst_null
    //   612: areturn
    //   613: aload_1
    //   614: ifnull -> 714
    //   617: aload_1
    //   618: invokeinterface Zd4 : ()[B
    //   623: invokestatic ZG : ([B)Ljava/lang/String;
    //   626: astore #11
    //   628: iload #7
    //   630: ifne -> 647
    //   633: aload #11
    //   635: aload_0
    //   636: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   641: astore #11
    //   643: aload_3
    //   644: ifnull -> 690
    //   647: aload #11
    //   649: ldc '/'
    //   651: invokevirtual lastIndexOf : (Ljava/lang/String;)I
    //   654: dup
    //   655: istore #12
    //   657: ifle -> 682
    //   660: aload #11
    //   662: iconst_0
    //   663: iload #12
    //   665: iconst_1
    //   666: iadd
    //   667: invokevirtual substring : (II)Ljava/lang/String;
    //   670: aload_0
    //   671: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   676: astore #11
    //   678: aload_3
    //   679: ifnull -> 690
    //   682: aload_0
    //   683: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   688: astore #11
    //   690: new burp/Zax
    //   693: dup
    //   694: aload_1
    //   695: invokeinterface Zdz : ()Lburp/Zmzk;
    //   700: aload #11
    //   702: invokestatic Zy : (Ljava/lang/String;)[B
    //   705: invokespecial <init> : (Lburp/Zmzk;[B)V
    //   708: astore #4
    //   710: aload_3
    //   711: ifnull -> 815
    //   714: new java/net/URL
    //   717: dup
    //   718: aload_0
    //   719: sipush #18686
    //   722: sipush #17870
    //   725: invokestatic a : (II)Ljava/lang/String;
    //   728: swap
    //   729: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   734: invokespecial <init> : (Ljava/lang/String;)V
    //   737: astore #11
    //   739: aload #11
    //   741: invokevirtual getHost : ()Ljava/lang/String;
    //   744: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   747: astore #12
    //   749: aload #12
    //   751: invokestatic Zc : (Ljava/lang/String;)Z
    //   754: ifne -> 759
    //   757: aconst_null
    //   758: areturn
    //   759: aload #11
    //   761: invokevirtual getPort : ()I
    //   764: istore #13
    //   766: iload #13
    //   768: iconst_m1
    //   769: if_icmpne -> 776
    //   772: bipush #80
    //   774: istore #13
    //   776: aload #11
    //   778: invokevirtual getFile : ()Ljava/lang/String;
    //   781: astore #14
    //   783: aload #14
    //   785: invokevirtual isEmpty : ()Z
    //   788: ifeq -> 795
    //   791: ldc '/'
    //   793: astore #14
    //   795: new burp/Zax
    //   798: dup
    //   799: aload #12
    //   801: iload #13
    //   803: iconst_0
    //   804: aload #14
    //   806: invokestatic Zy : (Ljava/lang/String;)[B
    //   809: aload_2
    //   810: invokespecial <init> : (Ljava/lang/String;IZ[BLburp/Zbnt;)V
    //   813: astore #4
    //   815: aload #4
    //   817: invokeinterface ZdH : ()[B
    //   822: invokestatic ZG : ([B)Ljava/lang/String;
    //   825: astore_0
    //   826: aload_0
    //   827: iconst_1
    //   828: invokestatic ZO : (Ljava/lang/String;Z)I
    //   831: dup
    //   832: istore #7
    //   834: iconst_m1
    //   835: if_icmpeq -> 846
    //   838: aload_0
    //   839: iconst_0
    //   840: iload #7
    //   842: invokevirtual substring : (II)Ljava/lang/String;
    //   845: astore_0
    //   846: aload_0
    //   847: astore #11
    //   849: aload_0
    //   850: ldc '%'
    //   852: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   855: ifeq -> 863
    //   858: aload_0
    //   859: invokestatic Zm : (Ljava/lang/String;)Ljava/lang/String;
    //   862: astore_0
    //   863: aload_0
    //   864: ldc '%'
    //   866: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   869: ifeq -> 888
    //   872: aload_0
    //   873: ldc '%'
    //   875: sipush #18680
    //   878: sipush #-26910
    //   881: invokestatic a : (II)Ljava/lang/String;
    //   884: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   887: astore_0
    //   888: aload_0
    //   889: ldc ' '
    //   891: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   894: ifeq -> 913
    //   897: aload_0
    //   898: ldc ' '
    //   900: sipush #18673
    //   903: sipush #-17287
    //   906: invokestatic a : (II)Ljava/lang/String;
    //   909: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   912: astore_0
    //   913: aload_0
    //   914: ldc '+'
    //   916: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   919: ifeq -> 938
    //   922: aload_0
    //   923: ldc '+'
    //   925: sipush #18666
    //   928: sipush #7516
    //   931: invokestatic a : (II)Ljava/lang/String;
    //   934: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   937: astore_0
    //   938: aload_0
    //   939: ldc '/'
    //   941: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   944: ifne -> 954
    //   947: aload_0
    //   948: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   953: astore_0
    //   954: aload_0
    //   955: bipush #13
    //   957: invokevirtual indexOf : (I)I
    //   960: dup
    //   961: istore #12
    //   963: iconst_m1
    //   964: if_icmpeq -> 975
    //   967: aload_0
    //   968: iconst_0
    //   969: iload #12
    //   971: invokevirtual substring : (II)Ljava/lang/String;
    //   974: astore_0
    //   975: aload_0
    //   976: bipush #10
    //   978: invokevirtual indexOf : (I)I
    //   981: dup
    //   982: istore #12
    //   984: iconst_m1
    //   985: if_icmpeq -> 996
    //   988: aload_0
    //   989: iconst_0
    //   990: iload #12
    //   992: invokevirtual substring : (II)Ljava/lang/String;
    //   995: astore_0
    //   996: aload_0
    //   997: sipush #18676
    //   1000: sipush #18298
    //   1003: invokestatic a : (II)Ljava/lang/String;
    //   1006: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   1009: ifeq -> 1055
    //   1012: aload_0
    //   1013: sipush #18681
    //   1016: sipush #30193
    //   1019: invokestatic a : (II)Ljava/lang/String;
    //   1022: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   1025: ifeq -> 1055
    //   1028: goto -> 1035
    //   1031: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1034: athrow
    //   1035: aload_0
    //   1036: sipush #18681
    //   1039: sipush #30193
    //   1042: invokestatic a : (II)Ljava/lang/String;
    //   1045: ldc '/'
    //   1047: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1050: astore_0
    //   1051: aload_3
    //   1052: ifnull -> 1012
    //   1055: aload_0
    //   1056: sipush #18667
    //   1059: sipush #10641
    //   1062: invokestatic a : (II)Ljava/lang/String;
    //   1065: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   1068: ifeq -> 1231
    //   1071: aload_0
    //   1072: sipush #18670
    //   1075: sipush #1398
    //   1078: invokestatic a : (II)Ljava/lang/String;
    //   1081: invokevirtual lastIndexOf : (Ljava/lang/String;)I
    //   1084: dup
    //   1085: istore #13
    //   1087: iconst_m1
    //   1088: if_icmpeq -> 1205
    //   1091: iload #13
    //   1093: iconst_3
    //   1094: isub
    //   1095: iflt -> 1137
    //   1098: aload_0
    //   1099: iload #13
    //   1101: iconst_3
    //   1102: isub
    //   1103: iload #13
    //   1105: invokevirtual substring : (II)Ljava/lang/String;
    //   1108: sipush #18678
    //   1111: sipush #22958
    //   1114: invokestatic a : (II)Ljava/lang/String;
    //   1117: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1120: ifeq -> 1137
    //   1123: iinc #13, -3
    //   1126: aload_3
    //   1127: ifnull -> 1091
    //   1130: goto -> 1137
    //   1133: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1136: athrow
    //   1137: goto -> 1154
    //   1140: astore #15
    //   1142: aload #15
    //   1144: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   1147: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1150: aload_3
    //   1151: ifnull -> 1205
    //   1154: aload_0
    //   1155: iconst_0
    //   1156: iload #13
    //   1158: invokevirtual substring : (II)Ljava/lang/String;
    //   1161: ldc '/'
    //   1163: invokevirtual lastIndexOf : (Ljava/lang/String;)I
    //   1166: dup
    //   1167: istore #14
    //   1169: iconst_m1
    //   1170: if_icmpne -> 1180
    //   1173: goto -> 1205
    //   1176: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1179: athrow
    //   1180: aload_0
    //   1181: iconst_0
    //   1182: iload #14
    //   1184: invokevirtual substring : (II)Ljava/lang/String;
    //   1187: aload_0
    //   1188: iload #13
    //   1190: iconst_3
    //   1191: iadd
    //   1192: invokevirtual substring : (I)Ljava/lang/String;
    //   1195: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1200: astore_0
    //   1201: aload_3
    //   1202: ifnull -> 1071
    //   1205: aload_0
    //   1206: sipush #18670
    //   1209: sipush #1398
    //   1212: invokestatic a : (II)Ljava/lang/String;
    //   1215: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1218: ifeq -> 1231
    //   1221: aload_0
    //   1222: iconst_3
    //   1223: invokevirtual substring : (I)Ljava/lang/String;
    //   1226: astore_0
    //   1227: aload_3
    //   1228: ifnull -> 1205
    //   1231: aload_0
    //   1232: sipush #18665
    //   1235: sipush #18636
    //   1238: invokestatic a : (II)Ljava/lang/String;
    //   1241: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   1244: ifeq -> 1290
    //   1247: aload_0
    //   1248: sipush #18665
    //   1251: sipush #18636
    //   1254: invokestatic a : (II)Ljava/lang/String;
    //   1257: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   1260: ifeq -> 1290
    //   1263: goto -> 1270
    //   1266: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1269: athrow
    //   1270: aload_0
    //   1271: sipush #18665
    //   1274: sipush #18636
    //   1277: invokestatic a : (II)Ljava/lang/String;
    //   1280: ldc '/'
    //   1282: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1285: astore_0
    //   1286: aload_3
    //   1287: ifnull -> 1247
    //   1290: aload_0
    //   1291: sipush #18684
    //   1294: sipush #17765
    //   1297: invokestatic a : (II)Ljava/lang/String;
    //   1300: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   1303: ifeq -> 1318
    //   1306: aload_0
    //   1307: iconst_0
    //   1308: aload_0
    //   1309: invokevirtual length : ()I
    //   1312: iconst_1
    //   1313: isub
    //   1314: invokevirtual substring : (II)Ljava/lang/String;
    //   1317: astore_0
    //   1318: aload_0
    //   1319: sipush #18668
    //   1322: sipush #31625
    //   1325: invokestatic a : (II)Ljava/lang/String;
    //   1328: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   1331: ifeq -> 1374
    //   1334: aload_0
    //   1335: iconst_0
    //   1336: aload_0
    //   1337: invokevirtual length : ()I
    //   1340: iconst_3
    //   1341: isub
    //   1342: invokevirtual substring : (II)Ljava/lang/String;
    //   1345: ldc '/'
    //   1347: invokevirtual lastIndexOf : (Ljava/lang/String;)I
    //   1350: dup
    //   1351: istore #13
    //   1353: iconst_m1
    //   1354: if_icmpne -> 1364
    //   1357: ldc '/'
    //   1359: astore_0
    //   1360: aload_3
    //   1361: ifnull -> 1374
    //   1364: aload_0
    //   1365: iconst_0
    //   1366: iload #13
    //   1368: iconst_1
    //   1369: iadd
    //   1370: invokevirtual substring : (II)Ljava/lang/String;
    //   1373: astore_0
    //   1374: aload_0
    //   1375: aload #11
    //   1377: if_acmpeq -> 1407
    //   1380: new burp/Zax
    //   1383: dup
    //   1384: aload #4
    //   1386: invokeinterface Zdz : ()Lburp/Zmzk;
    //   1391: aload_0
    //   1392: aload #8
    //   1394: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1399: invokestatic Zy : (Ljava/lang/String;)[B
    //   1402: invokespecial <init> : (Lburp/Zmzk;[B)V
    //   1405: astore #4
    //   1407: aload #4
    //   1409: areturn
    //   1410: astore #5
    //   1412: aload #5
    //   1414: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   1417: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1420: aconst_null
    //   1421: areturn
    //   1422: astore #5
    //   1424: aload #5
    //   1426: getstatic net/portswigger/Zk_.IMPOSSIBLE : Lnet/portswigger/Zk_;
    //   1429: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1432: aconst_null
    //   1433: areturn
    // Exception table:
    //   from	to	target	type
    //   4	15	18	java/lang/Exception
    //   4	23	1410	java/net/MalformedURLException
    //   4	23	1422	burp/Zxgy
    //   4	23	1422	burp/Zxg5
    //   24	112	1410	java/net/MalformedURLException
    //   24	112	1422	burp/Zxgy
    //   24	112	1422	burp/Zxg5
    //   31	104	107	java/lang/Exception
    //   113	124	124	java/lang/Exception
    //   113	129	1410	java/net/MalformedURLException
    //   113	129	1422	burp/Zxgy
    //   113	129	1422	burp/Zxg5
    //   130	358	1410	java/net/MalformedURLException
    //   130	358	1422	burp/Zxgy
    //   130	358	1422	burp/Zxg5
    //   219	232	235	java/lang/Exception
    //   223	243	243	java/lang/Exception
    //   256	290	293	java/lang/Exception
    //   273	314	317	java/lang/Exception
    //   297	338	341	java/lang/Exception
    //   359	380	383	java/lang/Exception
    //   359	454	1410	java/net/MalformedURLException
    //   359	454	1422	burp/Zxgy
    //   359	454	1422	burp/Zxg5
    //   455	475	478	java/lang/Exception
    //   455	612	1410	java/net/MalformedURLException
    //   455	612	1422	burp/Zxgy
    //   455	612	1422	burp/Zxg5
    //   464	488	488	java/lang/Exception
    //   541	554	557	java/lang/Exception
    //   545	565	568	java/lang/Exception
    //   591	604	607	java/lang/Exception
    //   613	758	1410	java/net/MalformedURLException
    //   613	758	1422	burp/Zxgy
    //   613	758	1422	burp/Zxg5
    //   759	1409	1410	java/net/MalformedURLException
    //   759	1409	1422	burp/Zxgy
    //   759	1409	1422	burp/Zxg5
    //   996	1028	1031	java/lang/Exception
    //   1091	1137	1140	java/lang/Exception
    //   1098	1130	1133	java/lang/Exception
    //   1169	1176	1176	java/lang/Exception
    //   1231	1263	1266	java/lang/Exception
  }
  
  public static Zlit Zb(String paramString, Zbnt paramZbnt) {
    String str = paramString.toLowerCase();
    return str.startsWith(a(18674, -13493)) ? Zp(a(18686, 17870) + a(18686, 17870), paramZbnt) : (str.startsWith(a(18675, 28953)) ? Zp(a(18683, 6392) + a(18683, 6392), paramZbnt) : Zp(paramString, paramZbnt));
  }
  
  private static Zlit Zp(String paramString, Zbnt paramZbnt) {
    // Byte code:
    //   0: invokestatic ZE : ()[I
    //   3: astore_2
    //   4: new java/net/URL
    //   7: dup
    //   8: aload_0
    //   9: invokespecial <init> : (Ljava/lang/String;)V
    //   12: astore_3
    //   13: aload_3
    //   14: invokevirtual getProtocol : ()Ljava/lang/String;
    //   17: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   20: astore #4
    //   22: aload #4
    //   24: sipush #18685
    //   27: sipush #11810
    //   30: invokestatic a : (II)Ljava/lang/String;
    //   33: invokevirtual equals : (Ljava/lang/Object;)Z
    //   36: istore #5
    //   38: aload_3
    //   39: invokevirtual getHost : ()Ljava/lang/String;
    //   42: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   45: astore #6
    //   47: aload #6
    //   49: invokevirtual length : ()I
    //   52: iconst_3
    //   53: if_icmple -> 125
    //   56: aload #6
    //   58: iconst_0
    //   59: invokevirtual charAt : (I)C
    //   62: bipush #91
    //   64: if_icmpne -> 125
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   73: athrow
    //   74: aload #6
    //   76: aload #6
    //   78: invokevirtual length : ()I
    //   81: iconst_1
    //   82: isub
    //   83: invokevirtual charAt : (I)C
    //   86: bipush #93
    //   88: if_icmpne -> 125
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   97: athrow
    //   98: aload #6
    //   100: iconst_1
    //   101: aload #6
    //   103: invokevirtual length : ()I
    //   106: iconst_1
    //   107: isub
    //   108: invokevirtual substring : (II)Ljava/lang/String;
    //   111: astore #7
    //   113: aload #7
    //   115: invokestatic ZE : (Ljava/lang/String;)Z
    //   118: ifeq -> 125
    //   121: aload #7
    //   123: astore #6
    //   125: aload #6
    //   127: invokestatic Zc : (Ljava/lang/String;)Z
    //   130: ifne -> 135
    //   133: aconst_null
    //   134: areturn
    //   135: aload_3
    //   136: invokevirtual getPort : ()I
    //   139: istore #7
    //   141: aload_3
    //   142: invokevirtual getFile : ()Ljava/lang/String;
    //   145: astore #8
    //   147: iload #7
    //   149: iconst_m1
    //   150: if_icmpne -> 178
    //   153: iload #5
    //   155: ifeq -> 174
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   164: athrow
    //   165: sipush #443
    //   168: istore #7
    //   170: aload_2
    //   171: ifnull -> 178
    //   174: bipush #80
    //   176: istore #7
    //   178: aload #8
    //   180: ldc '/'
    //   182: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   185: ifne -> 197
    //   188: aload #8
    //   190: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   195: astore #8
    //   197: new burp/Zax
    //   200: dup
    //   201: aload #6
    //   203: iload #7
    //   205: iload #5
    //   207: aload #8
    //   209: invokestatic Zy : (Ljava/lang/String;)[B
    //   212: aload_1
    //   213: invokespecial <init> : (Ljava/lang/String;IZ[BLburp/Zbnt;)V
    //   216: areturn
    //   217: astore_3
    //   218: aload_3
    //   219: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   222: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   225: aconst_null
    //   226: areturn
    // Exception table:
    //   from	to	target	type
    //   4	134	217	java/net/MalformedURLException
    //   4	134	217	burp/Zxg5
    //   4	134	217	burp/Zxgy
    //   47	67	70	java/net/MalformedURLException
    //   56	91	94	java/net/MalformedURLException
    //   135	216	217	java/net/MalformedURLException
    //   135	216	217	burp/Zxg5
    //   135	216	217	burp/Zxgy
    //   147	158	161	java/net/MalformedURLException
  }
  
  public static String ZK(String paramString) {
    if (paramString == null)
      return null; 
    int i = paramString.indexOf("#");
    return (i != -1) ? paramString.substring(i + 1) : null;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #23
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÀyßÆNÙÑYÜ\\b$Jæø+jÐkØÉ[ÀÀA©UÅ°¨t¤0PVÈJ/|>Ã¤®°CYìûSe$]æb#\\bAçJM¾ÜbËL¢õs.Í.?Ñ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_3
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #48
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc '>ÈMÆ<ÜX,'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #6
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #112
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
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zry3.a : [Ljava/lang/String;
    //   131: bipush #23
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zry3.b : [Ljava/lang/String;
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
    //   212: bipush #113
    //   214: goto -> 244
    //   217: bipush #35
    //   219: goto -> 244
    //   222: bipush #107
    //   224: goto -> 244
    //   227: bipush #105
    //   229: goto -> 244
    //   232: bipush #37
    //   234: goto -> 244
    //   237: bipush #42
    //   239: goto -> 244
    //   242: bipush #21
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x48F8) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zry3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */