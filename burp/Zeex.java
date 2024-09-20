package burp;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zeex {
  private static final byte[] ZM;
  
  private static final byte[] ZC;
  
  private static final Zzrd Zt;
  
  private static final Zzrd Zn;
  
  private static Zzrd ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static List<Zt8g> ZW(Zrdu paramZrdu, Zstu paramZstu, int paramInt1, int paramInt2, Zsba paramZsba, String paramString) {
    return ZG(paramZrdu, paramZstu, paramInt1, paramInt2, paramZsba, paramString, Zeex::lambda$parseParameters$0);
  }
  
  public static List<Zt8g> ZG(Zrdu paramZrdu, Zstu paramZstu, int paramInt1, int paramInt2, Zsba paramZsba, String paramString, Supplier<Boolean> paramSupplier) {
    // Byte code:
    //   0: invokestatic ZS : ()[Lburp/Zbqc;
    //   3: astore #7
    //   5: new java/util/LinkedList
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: astore #8
    //   14: getstatic burp/Zg8b.ZC : [I
    //   17: aload #4
    //   19: invokevirtual ordinal : ()I
    //   22: iaload
    //   23: tableswitch default -> 1999, 1 -> 56, 2 -> 517, 3 -> 1156, 4 -> 1560, 5 -> 1983
    //   56: iload_2
    //   57: istore #9
    //   59: iload #9
    //   61: iload_3
    //   62: if_icmpge -> 499
    //   65: aload #6
    //   67: invokeinterface get : ()Ljava/lang/Object;
    //   72: checkcast java/lang/Boolean
    //   75: invokevirtual booleanValue : ()Z
    //   78: ifeq -> 84
    //   81: aload #8
    //   83: areturn
    //   84: iload #9
    //   86: istore #10
    //   88: iconst_m1
    //   89: istore #11
    //   91: iconst_m1
    //   92: istore #12
    //   94: iconst_m1
    //   95: istore #13
    //   97: iconst_0
    //   98: istore #14
    //   100: iload #9
    //   102: iload_3
    //   103: if_icmpge -> 286
    //   106: iload #10
    //   108: iload #9
    //   110: if_icmpne -> 171
    //   113: aload_1
    //   114: iload #9
    //   116: invokeinterface Zp : (I)B
    //   121: bipush #10
    //   123: if_icmpeq -> 153
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   132: athrow
    //   133: aload_1
    //   134: iload #9
    //   136: invokeinterface Zp : (I)B
    //   141: bipush #13
    //   143: if_icmpne -> 171
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   152: athrow
    //   153: iinc #10, 1
    //   156: iinc #9, 1
    //   159: aload #7
    //   161: ifnull -> 100
    //   164: goto -> 171
    //   167: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   170: athrow
    //   171: aload_1
    //   172: iload #9
    //   174: invokeinterface Zp : (I)B
    //   179: bipush #61
    //   181: if_icmpne -> 193
    //   184: iload #9
    //   186: istore #11
    //   188: aload #7
    //   190: ifnull -> 286
    //   193: aload_1
    //   194: iload #9
    //   196: invokeinterface Zp : (I)B
    //   201: bipush #38
    //   203: if_icmpne -> 233
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   212: athrow
    //   213: iconst_1
    //   214: istore #14
    //   216: iload #9
    //   218: istore #11
    //   220: iload #9
    //   222: istore #12
    //   224: iload #9
    //   226: istore #13
    //   228: aload #7
    //   230: ifnull -> 286
    //   233: aload_1
    //   234: iload #9
    //   236: invokeinterface Zp : (I)B
    //   241: bipush #32
    //   243: if_icmpge -> 278
    //   246: goto -> 253
    //   249: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   252: athrow
    //   253: aload_1
    //   254: iload #9
    //   256: invokeinterface Zp : (I)B
    //   261: iflt -> 278
    //   264: goto -> 271
    //   267: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   270: athrow
    //   271: goto -> 286
    //   274: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   277: athrow
    //   278: iinc #9, 1
    //   281: aload #7
    //   283: ifnull -> 100
    //   286: iload #11
    //   288: iconst_m1
    //   289: if_icmpne -> 309
    //   292: iload #9
    //   294: istore #11
    //   296: iload #9
    //   298: istore #12
    //   300: iload #9
    //   302: istore #13
    //   304: aload #7
    //   306: ifnull -> 420
    //   309: iload #14
    //   311: ifne -> 420
    //   314: goto -> 321
    //   317: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   320: athrow
    //   321: iload #9
    //   323: iconst_1
    //   324: iadd
    //   325: istore #12
    //   327: iconst_m1
    //   328: istore #13
    //   330: iload #9
    //   332: iload_3
    //   333: if_icmpge -> 411
    //   336: aload_1
    //   337: iload #9
    //   339: invokeinterface Zp : (I)B
    //   344: bipush #38
    //   346: if_icmpeq -> 387
    //   349: aload_1
    //   350: iload #9
    //   352: invokeinterface Zp : (I)B
    //   357: bipush #32
    //   359: if_icmpge -> 396
    //   362: goto -> 369
    //   365: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   368: athrow
    //   369: aload_1
    //   370: iload #9
    //   372: invokeinterface Zp : (I)B
    //   377: iflt -> 396
    //   380: goto -> 387
    //   383: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   386: athrow
    //   387: iload #9
    //   389: istore #13
    //   391: aload #7
    //   393: ifnull -> 411
    //   396: iinc #9, 1
    //   399: aload #7
    //   401: ifnull -> 330
    //   404: goto -> 411
    //   407: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   410: athrow
    //   411: iload #13
    //   413: iconst_m1
    //   414: if_icmpne -> 420
    //   417: iload_3
    //   418: istore #13
    //   420: iload #11
    //   422: iload #10
    //   424: if_icmple -> 488
    //   427: aload #8
    //   429: new burp/Zck
    //   432: dup
    //   433: aload_0
    //   434: aload_1
    //   435: iload #10
    //   437: iload #11
    //   439: invokeinterface Zb : (II)Lburp/Zstu;
    //   444: invokeinterface Zis : ()Ljava/lang/String;
    //   449: aload_1
    //   450: iload #12
    //   452: iload #13
    //   454: invokeinterface Zb : (II)Lburp/Zstu;
    //   459: invokeinterface Zis : ()Ljava/lang/String;
    //   464: iload #10
    //   466: iload #11
    //   468: iload #12
    //   470: iload #13
    //   472: invokespecial <init> : (Lburp/Zrdu;Ljava/lang/String;Ljava/lang/String;IIII)V
    //   475: invokeinterface add : (Ljava/lang/Object;)Z
    //   480: pop
    //   481: goto -> 488
    //   484: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   487: athrow
    //   488: iload #13
    //   490: iconst_1
    //   491: iadd
    //   492: istore #9
    //   494: aload #7
    //   496: ifnull -> 59
    //   499: goto -> 1999
    //   502: astore #9
    //   504: aload #9
    //   506: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   509: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   512: aload #7
    //   514: ifnull -> 1999
    //   517: aload #5
    //   519: sipush #15069
    //   522: sipush #-15352
    //   525: invokestatic a : (II)Ljava/lang/String;
    //   528: invokevirtual indexOf : (Ljava/lang/String;)I
    //   531: istore #9
    //   533: iload #9
    //   535: iconst_m1
    //   536: if_icmpne -> 546
    //   539: goto -> 1999
    //   542: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   545: athrow
    //   546: iinc #9, 9
    //   549: aload #5
    //   551: iload #9
    //   553: invokevirtual substring : (I)Ljava/lang/String;
    //   556: invokevirtual trim : ()Ljava/lang/String;
    //   559: invokestatic Zy : (Ljava/lang/String;)[B
    //   562: astore #10
    //   564: iload_2
    //   565: istore #11
    //   567: iload #11
    //   569: iload_3
    //   570: if_icmpge -> 1138
    //   573: aload #6
    //   575: invokeinterface get : ()Ljava/lang/Object;
    //   580: checkcast java/lang/Boolean
    //   583: invokevirtual booleanValue : ()Z
    //   586: ifeq -> 592
    //   589: aload #8
    //   591: areturn
    //   592: getstatic burp/Zeex.Zt : Lburp/Zzrd;
    //   595: aload_1
    //   596: iload #11
    //   598: iload_3
    //   599: invokevirtual Zi : (Lburp/Zstu;II)Lburp/Zbu4;
    //   602: invokevirtual ZR : ()I
    //   605: istore #11
    //   607: iload #11
    //   609: iconst_m1
    //   610: if_icmpne -> 620
    //   613: goto -> 1138
    //   616: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   619: athrow
    //   620: iload #11
    //   622: bipush #6
    //   624: iadd
    //   625: istore #12
    //   627: aload_1
    //   628: bipush #34
    //   630: iload #12
    //   632: iload_3
    //   633: invokestatic ZT : (Lburp/Zstu;BII)I
    //   636: istore #13
    //   638: iload #13
    //   640: iconst_m1
    //   641: if_icmpne -> 651
    //   644: goto -> 1138
    //   647: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   650: athrow
    //   651: iload #13
    //   653: iconst_1
    //   654: iadd
    //   655: istore #11
    //   657: aload_1
    //   658: bipush #10
    //   660: iload #12
    //   662: iload_3
    //   663: invokestatic ZT : (Lburp/Zstu;BII)I
    //   666: istore #14
    //   668: iload #14
    //   670: ifle -> 776
    //   673: getstatic burp/Zeex.Zn : Lburp/Zzrd;
    //   676: aload_1
    //   677: iload #11
    //   679: iload #14
    //   681: invokevirtual Zi : (Lburp/Zstu;II)Lburp/Zbu4;
    //   684: invokevirtual ZR : ()I
    //   687: istore #15
    //   689: iload #15
    //   691: ifle -> 776
    //   694: iinc #15, 10
    //   697: aload_1
    //   698: bipush #34
    //   700: iload #15
    //   702: iload #14
    //   704: invokestatic ZT : (Lburp/Zstu;BII)I
    //   707: istore #16
    //   709: iload #16
    //   711: ifle -> 776
    //   714: aload #8
    //   716: new burp/Zck
    //   719: dup
    //   720: getstatic burp/Zrdu.MULTIPART_PARAM_ATTR : Lburp/Zrdu;
    //   723: sipush #15064
    //   726: sipush #21477
    //   729: invokestatic a : (II)Ljava/lang/String;
    //   732: aload_1
    //   733: iload #15
    //   735: iload #16
    //   737: invokeinterface Zb : (II)Lburp/Zstu;
    //   742: invokeinterface Zis : ()Ljava/lang/String;
    //   747: iload #15
    //   749: bipush #10
    //   751: isub
    //   752: iload #15
    //   754: iconst_2
    //   755: isub
    //   756: iload #15
    //   758: iload #16
    //   760: invokespecial <init> : (Lburp/Zrdu;Ljava/lang/String;Ljava/lang/String;IIII)V
    //   763: invokeinterface add : (Ljava/lang/Object;)Z
    //   768: pop
    //   769: goto -> 776
    //   772: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   775: athrow
    //   776: iconst_0
    //   777: istore #15
    //   779: iload #11
    //   781: iload_3
    //   782: if_icmpge -> 852
    //   785: aload_1
    //   786: iload #11
    //   788: invokeinterface Zp : (I)B
    //   793: bipush #32
    //   795: if_icmplt -> 801
    //   798: iconst_0
    //   799: istore #15
    //   801: aload_1
    //   802: iload #11
    //   804: invokeinterface Zp : (I)B
    //   809: bipush #10
    //   811: if_icmpeq -> 829
    //   814: iinc #11, 1
    //   817: aload #7
    //   819: ifnull -> 779
    //   822: goto -> 829
    //   825: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   828: athrow
    //   829: iload #15
    //   831: ifeq -> 841
    //   834: goto -> 852
    //   837: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   840: athrow
    //   841: iconst_1
    //   842: istore #15
    //   844: iinc #11, 1
    //   847: aload #7
    //   849: ifnull -> 779
    //   852: iload #11
    //   854: iload_3
    //   855: if_icmplt -> 865
    //   858: goto -> 1138
    //   861: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   864: athrow
    //   865: iinc #11, 1
    //   868: iload #11
    //   870: istore #16
    //   872: aload_1
    //   873: aload #10
    //   875: iconst_1
    //   876: iload #11
    //   878: iload_3
    //   879: invokestatic Zd : (Lburp/Zstu;[BZII)I
    //   882: istore #11
    //   884: iload #11
    //   886: iconst_m1
    //   887: if_icmpeq -> 903
    //   890: iload #11
    //   892: iload_3
    //   893: if_icmple -> 906
    //   896: goto -> 903
    //   899: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   902: athrow
    //   903: iload_3
    //   904: istore #11
    //   906: iload #11
    //   908: iconst_1
    //   909: isub
    //   910: iload #16
    //   912: if_icmple -> 967
    //   915: aload_1
    //   916: iload #11
    //   918: iconst_1
    //   919: isub
    //   920: invokeinterface Zp : (I)B
    //   925: bipush #10
    //   927: if_icmpeq -> 967
    //   930: aload_1
    //   931: iload #11
    //   933: iconst_1
    //   934: isub
    //   935: invokeinterface Zp : (I)B
    //   940: bipush #13
    //   942: if_icmpeq -> 967
    //   945: goto -> 952
    //   948: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   951: athrow
    //   952: iinc #11, -1
    //   955: aload #7
    //   957: ifnull -> 906
    //   960: goto -> 967
    //   963: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   966: athrow
    //   967: iload #11
    //   969: iconst_1
    //   970: isub
    //   971: iload #16
    //   973: if_icmple -> 1008
    //   976: aload_1
    //   977: iload #11
    //   979: iconst_1
    //   980: isub
    //   981: invokeinterface Zp : (I)B
    //   986: bipush #10
    //   988: if_icmpne -> 1008
    //   991: goto -> 998
    //   994: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   997: athrow
    //   998: iinc #11, -1
    //   1001: goto -> 1008
    //   1004: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1007: athrow
    //   1008: iload #11
    //   1010: iconst_1
    //   1011: isub
    //   1012: iload #16
    //   1014: if_icmplt -> 1049
    //   1017: aload_1
    //   1018: iload #11
    //   1020: iconst_1
    //   1021: isub
    //   1022: invokeinterface Zp : (I)B
    //   1027: bipush #13
    //   1029: if_icmpne -> 1049
    //   1032: goto -> 1039
    //   1035: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1038: athrow
    //   1039: iinc #11, -1
    //   1042: goto -> 1049
    //   1045: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1048: athrow
    //   1049: iload #11
    //   1051: istore #17
    //   1053: new burp/Zck
    //   1056: dup
    //   1057: aload_0
    //   1058: aload_1
    //   1059: iload #12
    //   1061: iload #13
    //   1063: invokeinterface Zb : (II)Lburp/Zstu;
    //   1068: invokeinterface Zis : ()Ljava/lang/String;
    //   1073: aload_1
    //   1074: iload #16
    //   1076: iload #17
    //   1078: invokeinterface Zb : (II)Lburp/Zstu;
    //   1083: invokeinterface Zis : ()Ljava/lang/String;
    //   1088: iload #12
    //   1090: iload #13
    //   1092: iload #16
    //   1094: iload #17
    //   1096: aload_1
    //   1097: iload #13
    //   1099: iconst_1
    //   1100: iadd
    //   1101: iload #16
    //   1103: iconst_1
    //   1104: isub
    //   1105: invokeinterface Zb : (II)Lburp/Zstu;
    //   1110: invokeinterface Zis : ()Ljava/lang/String;
    //   1115: invokevirtual trim : ()Ljava/lang/String;
    //   1118: invokespecial <init> : (Lburp/Zrdu;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;)V
    //   1121: astore #18
    //   1123: aload #8
    //   1125: aload #18
    //   1127: invokeinterface add : (Ljava/lang/Object;)Z
    //   1132: pop
    //   1133: aload #7
    //   1135: ifnull -> 567
    //   1138: goto -> 1999
    //   1141: astore #11
    //   1143: aload #11
    //   1145: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   1148: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1151: aload #7
    //   1153: ifnull -> 1999
    //   1156: iload_2
    //   1157: istore #9
    //   1159: iload #9
    //   1161: iload_3
    //   1162: if_icmpge -> 1542
    //   1165: aload #6
    //   1167: invokeinterface get : ()Ljava/lang/Object;
    //   1172: checkcast java/lang/Boolean
    //   1175: invokevirtual booleanValue : ()Z
    //   1178: ifeq -> 1184
    //   1181: aload #8
    //   1183: areturn
    //   1184: iload #9
    //   1186: istore #10
    //   1188: iconst_m1
    //   1189: istore #11
    //   1191: iload #9
    //   1193: iload_3
    //   1194: if_icmpge -> 1272
    //   1197: aload_1
    //   1198: iload #9
    //   1200: invokeinterface Zp : (I)B
    //   1205: bipush #61
    //   1207: if_icmpne -> 1219
    //   1210: iload #9
    //   1212: istore #11
    //   1214: aload #7
    //   1216: ifnull -> 1272
    //   1219: aload_1
    //   1220: iload #9
    //   1222: invokeinterface Zp : (I)B
    //   1227: bipush #32
    //   1229: if_icmpge -> 1264
    //   1232: goto -> 1239
    //   1235: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1238: athrow
    //   1239: aload_1
    //   1240: iload #9
    //   1242: invokeinterface Zp : (I)B
    //   1247: iflt -> 1264
    //   1250: goto -> 1257
    //   1253: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1256: athrow
    //   1257: goto -> 1272
    //   1260: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1263: athrow
    //   1264: iinc #9, 1
    //   1267: aload #7
    //   1269: ifnull -> 1191
    //   1272: iload #11
    //   1274: iconst_m1
    //   1275: if_icmpeq -> 1542
    //   1278: iload #11
    //   1280: iload #10
    //   1282: if_icmpne -> 1299
    //   1285: goto -> 1292
    //   1288: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1291: athrow
    //   1292: goto -> 1542
    //   1295: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1298: athrow
    //   1299: iload #9
    //   1301: iconst_1
    //   1302: iadd
    //   1303: istore #12
    //   1305: iconst_m1
    //   1306: istore #13
    //   1308: iload #9
    //   1310: iload_3
    //   1311: if_icmpge -> 1389
    //   1314: aload_1
    //   1315: iload #9
    //   1317: invokeinterface Zp : (I)B
    //   1322: bipush #59
    //   1324: if_icmpeq -> 1365
    //   1327: aload_1
    //   1328: iload #9
    //   1330: invokeinterface Zp : (I)B
    //   1335: bipush #32
    //   1337: if_icmpge -> 1374
    //   1340: goto -> 1347
    //   1343: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1346: athrow
    //   1347: aload_1
    //   1348: iload #9
    //   1350: invokeinterface Zp : (I)B
    //   1355: iflt -> 1374
    //   1358: goto -> 1365
    //   1361: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1364: athrow
    //   1365: iload #9
    //   1367: istore #13
    //   1369: aload #7
    //   1371: ifnull -> 1389
    //   1374: iinc #9, 1
    //   1377: aload #7
    //   1379: ifnull -> 1308
    //   1382: goto -> 1389
    //   1385: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1388: athrow
    //   1389: iload #13
    //   1391: iconst_m1
    //   1392: if_icmpne -> 1398
    //   1395: iload_3
    //   1396: istore #13
    //   1398: aload #8
    //   1400: new burp/Zck
    //   1403: dup
    //   1404: aload_0
    //   1405: aload_1
    //   1406: iload #10
    //   1408: iload #11
    //   1410: invokeinterface Zb : (II)Lburp/Zstu;
    //   1415: invokeinterface Zis : ()Ljava/lang/String;
    //   1420: aload_1
    //   1421: iload #12
    //   1423: iload #13
    //   1425: invokeinterface Zb : (II)Lburp/Zstu;
    //   1430: invokeinterface Zis : ()Ljava/lang/String;
    //   1435: iload #10
    //   1437: iload #11
    //   1439: iload #12
    //   1441: iload #13
    //   1443: invokespecial <init> : (Lburp/Zrdu;Ljava/lang/String;Ljava/lang/String;IIII)V
    //   1446: invokeinterface add : (Ljava/lang/Object;)Z
    //   1451: pop
    //   1452: iload #9
    //   1454: iload_3
    //   1455: if_icmpge -> 1524
    //   1458: aload_1
    //   1459: iload #9
    //   1461: invokeinterface Zp : (I)B
    //   1466: bipush #32
    //   1468: if_icmple -> 1516
    //   1471: aload_1
    //   1472: iload #9
    //   1474: invokeinterface Zp : (I)B
    //   1479: iflt -> 1516
    //   1482: goto -> 1489
    //   1485: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1488: athrow
    //   1489: aload_1
    //   1490: iload #9
    //   1492: invokeinterface Zp : (I)B
    //   1497: bipush #59
    //   1499: if_icmpeq -> 1516
    //   1502: goto -> 1509
    //   1505: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1508: athrow
    //   1509: goto -> 1524
    //   1512: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1515: athrow
    //   1516: iinc #9, 1
    //   1519: aload #7
    //   1521: ifnull -> 1452
    //   1524: iload #9
    //   1526: iload_3
    //   1527: if_icmpne -> 1537
    //   1530: goto -> 1542
    //   1533: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1536: athrow
    //   1537: aload #7
    //   1539: ifnull -> 1159
    //   1542: goto -> 1999
    //   1545: astore #9
    //   1547: aload #9
    //   1549: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   1552: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1555: aload #7
    //   1557: ifnull -> 1999
    //   1560: aload_1
    //   1561: iload_2
    //   1562: iload_3
    //   1563: iconst_1
    //   1564: aload #6
    //   1566: aconst_null
    //   1567: invokestatic ZB : (Lburp/Zstu;IIBLjava/util/function/Supplier;Ljava/lang/String;)Ljava/util/List;
    //   1570: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1575: astore #9
    //   1577: aconst_null
    //   1578: astore #10
    //   1580: iconst_m1
    //   1581: istore #11
    //   1583: aload #9
    //   1585: invokeinterface hasNext : ()Z
    //   1590: ifeq -> 1999
    //   1593: aload #6
    //   1595: invokeinterface get : ()Ljava/lang/Object;
    //   1600: checkcast java/lang/Boolean
    //   1603: invokevirtual booleanValue : ()Z
    //   1606: ifeq -> 1616
    //   1609: aload #8
    //   1611: areturn
    //   1612: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1615: athrow
    //   1616: aload #9
    //   1618: invokeinterface next : ()Ljava/lang/Object;
    //   1623: checkcast burp/Ztu8
    //   1626: astore #12
    //   1628: aload #12
    //   1630: invokeinterface ZlD : ()B
    //   1635: tableswitch default -> 1969, 0 -> 1668, 1 -> 1793, 2 -> 1969, 3 -> 1869, 4 -> 1668
    //   1668: aload #12
    //   1670: invokeinterface ZlP : ()Lburp/Zs_n;
    //   1675: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   1680: astore #10
    //   1682: aload #12
    //   1684: invokeinterface ZlP : ()Lburp/Zs_n;
    //   1689: invokeinterface ZJo : ()Lburp/Zefg;
    //   1694: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1699: astore #13
    //   1701: aload #13
    //   1703: invokeinterface hasNext : ()Z
    //   1708: ifeq -> 1788
    //   1711: aload #13
    //   1713: invokeinterface next : ()Ljava/lang/Object;
    //   1718: checkcast burp/Zs5n
    //   1721: astore #14
    //   1723: aload #8
    //   1725: new burp/Zck
    //   1728: dup
    //   1729: getstatic burp/Zrdu.XML_ATTR : Lburp/Zrdu;
    //   1732: aload #14
    //   1734: invokeinterface ZQd : ()Ljava/lang/String;
    //   1739: aload #14
    //   1741: invokeinterface ZQG : ()Ljava/lang/String;
    //   1746: aload #14
    //   1748: invokeinterface ZQD : ()I
    //   1753: aload #14
    //   1755: invokeinterface ZQn : ()I
    //   1760: aload #14
    //   1762: invokeinterface ZQs : ()I
    //   1767: aload #14
    //   1769: invokeinterface ZQc : ()I
    //   1774: invokespecial <init> : (Lburp/Zrdu;Ljava/lang/String;Ljava/lang/String;IIII)V
    //   1777: invokeinterface add : (Ljava/lang/Object;)Z
    //   1782: pop
    //   1783: aload #7
    //   1785: ifnull -> 1701
    //   1788: aload #7
    //   1790: ifnull -> 1969
    //   1793: iload #11
    //   1795: ifne -> 1969
    //   1798: goto -> 1805
    //   1801: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1804: athrow
    //   1805: aload #8
    //   1807: new burp/Zck
    //   1810: dup
    //   1811: getstatic burp/Zrdu.XML_PARAM : Lburp/Zrdu;
    //   1814: aload #10
    //   1816: ifnonnull -> 1835
    //   1819: goto -> 1826
    //   1822: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1825: athrow
    //   1826: ldc ''
    //   1828: goto -> 1837
    //   1831: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1834: athrow
    //   1835: aload #10
    //   1837: ldc ''
    //   1839: iconst_m1
    //   1840: iconst_m1
    //   1841: aload #12
    //   1843: invokeinterface ZlK : ()I
    //   1848: aload #12
    //   1850: invokeinterface ZlK : ()I
    //   1855: invokespecial <init> : (Lburp/Zrdu;Ljava/lang/String;Ljava/lang/String;IIII)V
    //   1858: invokeinterface add : (Ljava/lang/Object;)Z
    //   1863: pop
    //   1864: aload #7
    //   1866: ifnull -> 1969
    //   1869: aload_1
    //   1870: aload #12
    //   1872: invokeinterface ZlK : ()I
    //   1877: aload #12
    //   1879: invokeinterface Zli : ()I
    //   1884: invokeinterface Zb : (II)Lburp/Zstu;
    //   1889: invokeinterface Zis : ()Ljava/lang/String;
    //   1894: astore #13
    //   1896: aload #13
    //   1898: invokevirtual trim : ()Ljava/lang/String;
    //   1901: invokevirtual length : ()I
    //   1904: ifle -> 1969
    //   1907: aload #8
    //   1909: new burp/Zck
    //   1912: dup
    //   1913: getstatic burp/Zrdu.XML_PARAM : Lburp/Zrdu;
    //   1916: aload #10
    //   1918: ifnonnull -> 1937
    //   1921: goto -> 1928
    //   1924: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1927: athrow
    //   1928: ldc ''
    //   1930: goto -> 1939
    //   1933: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1936: athrow
    //   1937: aload #10
    //   1939: aload #13
    //   1941: iconst_m1
    //   1942: iconst_m1
    //   1943: aload #12
    //   1945: invokeinterface ZlK : ()I
    //   1950: aload #12
    //   1952: invokeinterface Zli : ()I
    //   1957: invokespecial <init> : (Lburp/Zrdu;Ljava/lang/String;Ljava/lang/String;IIII)V
    //   1960: invokeinterface add : (Ljava/lang/Object;)Z
    //   1965: pop
    //   1966: goto -> 1969
    //   1969: aload #12
    //   1971: invokeinterface ZlD : ()B
    //   1976: istore #11
    //   1978: aload #7
    //   1980: ifnull -> 1583
    //   1983: aload #8
    //   1985: aload_1
    //   1986: iload_2
    //   1987: iload_3
    //   1988: aload #6
    //   1990: invokestatic ZS : (Lburp/Zstu;IILjava/util/function/Supplier;)Ljava/util/List;
    //   1993: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   1998: pop
    //   1999: aload #8
    //   2001: areturn
    // Exception table:
    //   from	to	target	type
    //   56	83	502	java/lang/Exception
    //   84	499	502	java/lang/Exception
    //   106	126	129	java/lang/Exception
    //   113	146	149	java/lang/Exception
    //   133	164	167	java/lang/Exception
    //   188	206	209	java/lang/Exception
    //   228	246	249	java/lang/Exception
    //   233	264	267	java/lang/Exception
    //   253	274	274	java/lang/Exception
    //   304	314	317	java/lang/Exception
    //   336	362	365	java/lang/Exception
    //   349	380	383	java/lang/Exception
    //   391	404	407	java/lang/Exception
    //   420	481	484	java/lang/Exception
    //   533	542	542	java/lang/Exception
    //   564	591	1141	java/lang/Exception
    //   592	1138	1141	java/lang/Exception
    //   607	616	616	java/lang/Exception
    //   638	647	647	java/lang/Exception
    //   709	769	772	java/lang/Exception
    //   801	822	825	java/lang/Exception
    //   829	837	837	java/lang/Exception
    //   852	861	861	java/lang/Exception
    //   884	896	899	java/lang/Exception
    //   915	945	948	java/lang/Exception
    //   930	960	963	java/lang/Exception
    //   967	991	994	java/lang/Exception
    //   976	1001	1004	java/lang/Exception
    //   1008	1032	1035	java/lang/Exception
    //   1017	1042	1045	java/lang/Exception
    //   1156	1183	1545	java/lang/Exception
    //   1184	1542	1545	java/lang/Exception
    //   1214	1232	1235	java/lang/Exception
    //   1219	1250	1253	java/lang/Exception
    //   1239	1260	1260	java/lang/Exception
    //   1272	1285	1288	java/lang/Exception
    //   1278	1295	1295	java/lang/Exception
    //   1314	1340	1343	java/lang/Exception
    //   1327	1358	1361	java/lang/Exception
    //   1369	1382	1385	java/lang/Exception
    //   1458	1482	1485	java/lang/Exception
    //   1471	1502	1505	java/lang/Exception
    //   1489	1512	1512	java/lang/Exception
    //   1524	1533	1533	java/lang/Exception
    //   1593	1612	1612	java/lang/Exception
    //   1788	1798	1801	java/lang/Exception
    //   1793	1819	1822	java/lang/Exception
    //   1805	1831	1831	java/lang/Exception
    //   1896	1921	1924	java/lang/Exception
    //   1907	1933	1933	java/lang/Exception
  }
  
  public static List<Zt8g> ZZ(Zstu paramZstu) {
    return ZF(paramZstu, Zeex::lambda$parseParameters$0);
  }
  
  public static List<Zt8g> ZF(Zstu paramZstu, Supplier<Boolean> paramSupplier) {
    int[] arrayOfInt = Zmpa.Za(paramZstu);
    return (arrayOfInt == null) ? new LinkedList<>() : ZG(Zrdu.URL_PARAM, paramZstu, arrayOfInt[0] + 1, arrayOfInt[1], Zsba.URL_ENCODED, null, paramSupplier);
  }
  
  public static List<Zt8g> ZJ(Zstu paramZstu, Zz1p paramZz1p) {
    String str = Zgyj.ZZ(paramZz1p.ZG(), a(15066, -20174), false);
    Zsba zsba = Zq(str, paramZstu, paramZz1p.ZO());
    return ZY(paramZstu, zsba, str, paramZz1p.ZO());
  }
  
  public static List<Zt8g> ZY(Zstu paramZstu, Zsba paramZsba, String paramString, int paramInt) {
    return ZW(paramZstu, paramZsba, paramString, paramInt, Zeex::lambda$parseParameters$0);
  }
  
  public static List<Zt8g> ZB(Zstu paramZstu, String paramString, int paramInt) {
    Zsba zsba = Zq(paramString, paramZstu, paramInt);
    return ZY(paramZstu, zsba, paramString, paramInt);
  }
  
  public static List<Zt8g> ZW(Zstu paramZstu, Zsba paramZsba, String paramString, int paramInt, Supplier<Boolean> paramSupplier) {
    switch (Zg8b.ZC[paramZsba.ordinal()]) {
      case 6:
      case 7:
      
      case 1:
      
      case 2:
      
      case 4:
      
      case 5:
      
    } 
    Zuh.Zv(false, Zqf.Zk, paramZsba.Zi());
    return new LinkedList<>();
  }
  
  public static List<Zt8g> ZA(Zstu paramZstu) {
    return Zy(paramZstu, Zeex::lambda$parseParameters$0);
  }
  
  public static List<Zt8g> Zy(Zstu paramZstu, Supplier<Boolean> paramSupplier) {
    // Byte code:
    //   0: new java/util/LinkedList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZS : ()[Lburp/Zbqc;
    //   11: getstatic burp/Zeex.ZP : Lburp/Zzrd;
    //   14: aload_0
    //   15: invokevirtual ZG : (Lburp/Zstu;)Lburp/Zbu4;
    //   18: invokevirtual ZR : ()I
    //   21: istore #4
    //   23: astore_2
    //   24: iload #4
    //   26: iconst_m1
    //   27: if_icmpeq -> 196
    //   30: aload_1
    //   31: invokeinterface get : ()Ljava/lang/Object;
    //   36: checkcast java/lang/Boolean
    //   39: invokevirtual booleanValue : ()Z
    //   42: ifeq -> 47
    //   45: aload_3
    //   46: areturn
    //   47: iload #4
    //   49: getstatic net/portswigger/Zdo.ZR : [B
    //   52: arraylength
    //   53: iadd
    //   54: istore #4
    //   56: iconst_0
    //   57: istore #5
    //   59: iload #4
    //   61: aload_0
    //   62: invokeinterface Zpu : ()I
    //   67: if_icmpge -> 110
    //   70: aload_0
    //   71: iload #4
    //   73: invokeinterface Zp : (I)B
    //   78: bipush #33
    //   80: if_icmpge -> 110
    //   83: aload_0
    //   84: iload #4
    //   86: invokeinterface Zp : (I)B
    //   91: bipush #10
    //   93: if_icmpne -> 103
    //   96: iconst_1
    //   97: istore #5
    //   99: aload_2
    //   100: ifnull -> 110
    //   103: iinc #4, 1
    //   106: aload_2
    //   107: ifnull -> 59
    //   110: iload #5
    //   112: ifeq -> 118
    //   115: goto -> 24
    //   118: aload_0
    //   119: bipush #10
    //   121: iconst_1
    //   122: iload #4
    //   124: aload_0
    //   125: invokeinterface Zpu : ()I
    //   130: invokestatic Zq : (Lburp/Zstu;BZII)I
    //   133: istore #6
    //   135: iload #6
    //   137: iconst_m1
    //   138: if_icmpne -> 149
    //   141: aload_0
    //   142: invokeinterface Zpu : ()I
    //   147: istore #6
    //   149: aload_3
    //   150: getstatic burp/Zrdu.COOKIE : Lburp/Zrdu;
    //   153: aload_0
    //   154: iload #4
    //   156: iload #6
    //   158: getstatic burp/Zsba.COOKIES : Lburp/Zsba;
    //   161: aconst_null
    //   162: aload_1
    //   163: invokestatic ZG : (Lburp/Zrdu;Lburp/Zstu;IILburp/Zsba;Ljava/lang/String;Ljava/util/function/Supplier;)Ljava/util/List;
    //   166: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   171: pop
    //   172: getstatic burp/Zeex.ZP : Lburp/Zzrd;
    //   175: aload_0
    //   176: iload #6
    //   178: aload_0
    //   179: invokeinterface Zpu : ()I
    //   184: invokevirtual Zi : (Lburp/Zstu;II)Lburp/Zbu4;
    //   187: invokevirtual ZR : ()I
    //   190: istore #4
    //   192: aload_2
    //   193: ifnull -> 24
    //   196: aload_3
    //   197: areturn
  }
  
  public static Zsba Zq(String paramString, Zstu paramZstu, int paramInt) {
    if (paramInt == -1 || paramInt == paramZstu.Zpu())
      return Zsba.NONE; 
    Zsba zsba1 = Zmyf.ZA(paramZstu, paramInt);
    if (zsba1 != Zsba.NONE)
      return zsba1; 
    if (paramString == null)
      return Zsba.URL_ENCODED; 
    Zsba zsba2 = Zsba.ZQ(paramString.substring(a(15067, -20083).length()).strip());
    return (zsba2 == Zsba.NONE) ? Zsba.URL_ENCODED : zsba2;
  }
  
  public static List<Zlou> Zp(Zstu paramZstu) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: invokeinterface Zpu : ()I
    //   8: istore_3
    //   9: invokestatic ZS : ()[Lburp/Zbqc;
    //   12: iconst_0
    //   13: istore #4
    //   15: astore_1
    //   16: iload_2
    //   17: iload_3
    //   18: if_icmpge -> 47
    //   21: aload_0
    //   22: iload_2
    //   23: invokeinterface Zp : (I)B
    //   28: bipush #32
    //   30: if_icmple -> 47
    //   33: iinc #2, 1
    //   36: aload_1
    //   37: ifnull -> 16
    //   40: iconst_1
    //   41: anewarray burp/Zbqc
    //   44: invokestatic Zr : ([Lburp/Zbqc;)V
    //   47: iload_2
    //   48: iload_3
    //   49: if_icmpge -> 71
    //   52: aload_0
    //   53: iload_2
    //   54: invokeinterface Zp : (I)B
    //   59: bipush #32
    //   61: if_icmpne -> 71
    //   64: iinc #2, 1
    //   67: aload_1
    //   68: ifnull -> 47
    //   71: new java/util/LinkedList
    //   74: dup
    //   75: invokespecial <init> : ()V
    //   78: astore #5
    //   80: iload_2
    //   81: iload_3
    //   82: if_icmpge -> 281
    //   85: aload_0
    //   86: iload_2
    //   87: invokeinterface Zp : (I)B
    //   92: bipush #47
    //   94: if_icmpeq -> 100
    //   97: aload #5
    //   99: areturn
    //   100: iinc #2, 1
    //   103: iload_2
    //   104: istore #6
    //   106: iload_2
    //   107: iload_3
    //   108: if_icmpge -> 172
    //   111: aload_0
    //   112: iload_2
    //   113: invokeinterface Zp : (I)B
    //   118: istore #7
    //   120: iload #7
    //   122: bipush #32
    //   124: if_icmple -> 172
    //   127: iload #7
    //   129: bipush #47
    //   131: if_icmpeq -> 172
    //   134: iload #7
    //   136: bipush #63
    //   138: if_icmpeq -> 172
    //   141: iload #7
    //   143: bipush #59
    //   145: if_icmpeq -> 172
    //   148: iload #7
    //   150: bipush #38
    //   152: if_icmpeq -> 172
    //   155: iload #7
    //   157: bipush #61
    //   159: if_icmpne -> 165
    //   162: goto -> 172
    //   165: iinc #2, 1
    //   168: aload_1
    //   169: ifnull -> 106
    //   172: iload_2
    //   173: iload #6
    //   175: isub
    //   176: ifle -> 277
    //   179: aload_0
    //   180: iload_2
    //   181: invokeinterface Zp : (I)B
    //   186: bipush #47
    //   188: if_icmpeq -> 236
    //   191: aload #5
    //   193: getstatic burp/Zrdu.PATH_FILENAME_PARAM : Lburp/Zrdu;
    //   196: iinc #4, 1
    //   199: iload #4
    //   201: invokestatic toString : (I)Ljava/lang/String;
    //   204: aload_0
    //   205: iload #6
    //   207: iload_2
    //   208: invokeinterface Zb : (II)Lburp/Zstu;
    //   213: invokeinterface Zis : ()Ljava/lang/String;
    //   218: iconst_m1
    //   219: iconst_m1
    //   220: iload #6
    //   222: iload_2
    //   223: invokestatic ZO : (Lburp/Zrdu;Ljava/lang/String;Ljava/lang/String;IIII)Lburp/Zlou;
    //   226: invokeinterface add : (Ljava/lang/Object;)Z
    //   231: pop
    //   232: aload_1
    //   233: ifnull -> 277
    //   236: aload #5
    //   238: getstatic burp/Zrdu.PATH_FOLDER_PARAM : Lburp/Zrdu;
    //   241: iinc #4, 1
    //   244: iload #4
    //   246: invokestatic toString : (I)Ljava/lang/String;
    //   249: aload_0
    //   250: iload #6
    //   252: iload_2
    //   253: invokeinterface Zb : (II)Lburp/Zstu;
    //   258: invokeinterface Zis : ()Ljava/lang/String;
    //   263: iconst_m1
    //   264: iconst_m1
    //   265: iload #6
    //   267: iload_2
    //   268: invokestatic ZO : (Lburp/Zrdu;Ljava/lang/String;Ljava/lang/String;IIII)Lburp/Zlou;
    //   271: invokeinterface add : (Ljava/lang/Object;)Z
    //   276: pop
    //   277: aload_1
    //   278: ifnull -> 80
    //   281: aload #5
    //   283: areturn
  }
  
  public static Zlqn Zk(List<String> paramList, int paramInt, Zstu paramZstu, Supplier<Boolean> paramSupplier) {
    if (((Boolean)paramSupplier.get()).booleanValue())
      return new Zlqn(); 
    List<Zt8g> list = ZF(paramZstu, paramSupplier);
    if (((Boolean)paramSupplier.get()).booleanValue())
      return new Zlqn(); 
    list.addAll(Zy(paramZstu, paramSupplier));
    if (((Boolean)paramSupplier.get()).booleanValue())
      return new Zlqn(); 
    String str = Zgyj.ZZ(paramList, a(15065, 22359), false);
    Zsba zsba = Zq(str, paramZstu, paramInt);
    list.addAll(ZW(paramZstu, zsba, str, paramInt, paramSupplier));
    return new Zlqn(list, zsba);
  }
  
  private static Boolean lambda$parseParameters$0() {
    return Boolean.valueOf(false);
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ªÀK\\n,7ÛÑZ^\\bó(ãÀpáÏÑ\\rëEGº­¦ºB'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #13
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #42
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
    //   67: ldc '~á4yUMT¨\\tß6¿µ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #13
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #75
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
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
    //   128: putstatic burp/Zeex.a : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zeex.b : [Ljava/lang/String;
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
    //   212: bipush #64
    //   214: goto -> 244
    //   217: bipush #6
    //   219: goto -> 244
    //   222: bipush #60
    //   224: goto -> 244
    //   227: bipush #75
    //   229: goto -> 244
    //   232: bipush #107
    //   234: goto -> 244
    //   237: bipush #87
    //   239: goto -> 244
    //   242: bipush #13
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: bipush #6
    //   302: newarray byte
    //   304: dup
    //   305: iconst_0
    //   306: bipush #110
    //   308: bastore
    //   309: dup
    //   310: iconst_1
    //   311: bipush #97
    //   313: bastore
    //   314: dup
    //   315: iconst_2
    //   316: bipush #109
    //   318: bastore
    //   319: dup
    //   320: iconst_3
    //   321: bipush #101
    //   323: bastore
    //   324: dup
    //   325: iconst_4
    //   326: bipush #61
    //   328: bastore
    //   329: dup
    //   330: iconst_5
    //   331: bipush #34
    //   333: bastore
    //   334: putstatic burp/Zeex.ZM : [B
    //   337: bipush #10
    //   339: newarray byte
    //   341: dup
    //   342: iconst_0
    //   343: bipush #102
    //   345: bastore
    //   346: dup
    //   347: iconst_1
    //   348: bipush #105
    //   350: bastore
    //   351: dup
    //   352: iconst_2
    //   353: bipush #108
    //   355: bastore
    //   356: dup
    //   357: iconst_3
    //   358: bipush #101
    //   360: bastore
    //   361: dup
    //   362: iconst_4
    //   363: bipush #110
    //   365: bastore
    //   366: dup
    //   367: iconst_5
    //   368: bipush #97
    //   370: bastore
    //   371: dup
    //   372: bipush #6
    //   374: bipush #109
    //   376: bastore
    //   377: dup
    //   378: bipush #7
    //   380: bipush #101
    //   382: bastore
    //   383: dup
    //   384: bipush #8
    //   386: bipush #61
    //   388: bastore
    //   389: dup
    //   390: bipush #9
    //   392: bipush #34
    //   394: bastore
    //   395: putstatic burp/Zeex.ZC : [B
    //   398: getstatic burp/Zeex.ZM : [B
    //   401: iconst_0
    //   402: iconst_0
    //   403: invokestatic ZJ : ([BZZ)Lburp/Zzrd;
    //   406: putstatic burp/Zeex.Zt : Lburp/Zzrd;
    //   409: getstatic burp/Zeex.ZC : [B
    //   412: iconst_0
    //   413: iconst_0
    //   414: invokestatic ZJ : ([BZZ)Lburp/Zzrd;
    //   417: putstatic burp/Zeex.Zn : Lburp/Zzrd;
    //   420: new java/lang/String
    //   423: dup
    //   424: getstatic net/portswigger/Zdo.ZR : [B
    //   427: invokespecial <init> : ([B)V
    //   430: invokestatic ZG : (Ljava/lang/String;)Lburp/Zzrd;
    //   433: putstatic burp/Zeex.ZP : Lburp/Zzrd;
    //   436: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3AD9) & 0xFFFF;
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
      byte b1 = 42;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeex.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */