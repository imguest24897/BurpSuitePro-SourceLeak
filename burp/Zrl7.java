package burp;

import java.util.List;
import java.util.function.Supplier;

public class Zrl7 {
  private static final String[] a;
  
  private static final String[] b;
  
  public static List<Zx8_> ZN(Zlit paramZlit, List<Ztu8> paramList, Zbnt paramZbnt) {
    return ZS(paramZlit, paramList, paramZbnt, Zrl7::lambda$getForms$0);
  }
  
  public static List<Zx8_> ZS(Zlit paramZlit, List<Ztu8> paramList, Zbnt paramZbnt, Supplier<Boolean> paramSupplier) {
    // Byte code:
    //   0: invokestatic ZE : ()[I
    //   3: astore #4
    //   5: new java/util/ArrayList
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: astore #5
    //   14: new burp/Ztsp
    //   17: dup
    //   18: aload_0
    //   19: aload_2
    //   20: aload_1
    //   21: invokespecial <init> : (Lburp/Zlit;Lburp/Zbnt;Ljava/util/List;)V
    //   24: invokevirtual Zt : ()Lburp/Zlit;
    //   27: astore_0
    //   28: aload_1
    //   29: invokeinterface listIterator : ()Ljava/util/ListIterator;
    //   34: astore #6
    //   36: aload #6
    //   38: invokeinterface hasNext : ()Z
    //   43: ifeq -> 2080
    //   46: aload_3
    //   47: invokeinterface get : ()Ljava/lang/Object;
    //   52: checkcast java/lang/Boolean
    //   55: invokevirtual booleanValue : ()Z
    //   58: ifeq -> 70
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   67: athrow
    //   68: aconst_null
    //   69: areturn
    //   70: aconst_null
    //   71: astore #7
    //   73: iconst_0
    //   74: istore #8
    //   76: aload #6
    //   78: invokeinterface hasNext : ()Z
    //   83: ifeq -> 174
    //   86: aload #6
    //   88: invokeinterface next : ()Ljava/lang/Object;
    //   93: checkcast burp/Ztu8
    //   96: astore #7
    //   98: aload #7
    //   100: invokeinterface ZlP : ()Lburp/Zs_n;
    //   105: ifnull -> 168
    //   108: sipush #-31801
    //   111: sipush #11397
    //   114: invokestatic a : (II)Ljava/lang/String;
    //   117: aload #7
    //   119: invokeinterface ZlP : ()Lburp/Zs_n;
    //   124: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   129: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   132: ifeq -> 168
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   141: athrow
    //   142: aload #7
    //   144: invokeinterface ZlD : ()B
    //   149: iconst_4
    //   150: if_icmpne -> 174
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   159: athrow
    //   160: iconst_1
    //   161: istore #8
    //   163: aload #4
    //   165: ifnull -> 174
    //   168: aconst_null
    //   169: astore #7
    //   171: goto -> 76
    //   174: aload #7
    //   176: ifnonnull -> 186
    //   179: goto -> 2080
    //   182: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   185: athrow
    //   186: aload #7
    //   188: invokeinterface ZlP : ()Lburp/Zs_n;
    //   193: astore #9
    //   195: aload #9
    //   197: sipush #-31805
    //   200: sipush #23993
    //   203: invokestatic a : (II)Ljava/lang/String;
    //   206: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   211: astore #10
    //   213: aload #10
    //   215: ifnonnull -> 226
    //   218: aload_0
    //   219: astore #11
    //   221: aload #4
    //   223: ifnull -> 243
    //   226: aload #10
    //   228: aload_0
    //   229: aload_2
    //   230: invokestatic ZL : (Ljava/lang/String;Lburp/Zlit;Lburp/Zbnt;)Lburp/Zlit;
    //   233: astore #11
    //   235: aload #11
    //   237: ifnonnull -> 243
    //   240: aload_0
    //   241: astore #11
    //   243: new burp/Zch
    //   246: dup
    //   247: aload #11
    //   249: aload #7
    //   251: invokespecial <init> : (Lburp/Zlit;Lburp/Ztu8;)V
    //   254: astore #12
    //   256: aload #5
    //   258: aload #12
    //   260: invokeinterface add : (Ljava/lang/Object;)Z
    //   265: pop
    //   266: iload #8
    //   268: ifeq -> 278
    //   271: goto -> 36
    //   274: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   277: athrow
    //   278: aload #6
    //   280: invokeinterface hasNext : ()Z
    //   285: ifeq -> 2075
    //   288: aload_3
    //   289: invokeinterface get : ()Ljava/lang/Object;
    //   294: checkcast java/lang/Boolean
    //   297: invokevirtual booleanValue : ()Z
    //   300: ifeq -> 312
    //   303: goto -> 310
    //   306: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   309: athrow
    //   310: aconst_null
    //   311: areturn
    //   312: aload #6
    //   314: invokeinterface next : ()Ljava/lang/Object;
    //   319: checkcast burp/Ztu8
    //   322: astore #7
    //   324: aload #7
    //   326: invokeinterface ZlD : ()B
    //   331: iconst_1
    //   332: if_icmpne -> 376
    //   335: sipush #-31783
    //   338: sipush #23763
    //   341: invokestatic a : (II)Ljava/lang/String;
    //   344: aload #7
    //   346: invokeinterface ZlP : ()Lburp/Zs_n;
    //   351: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   356: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   359: ifeq -> 376
    //   362: goto -> 369
    //   365: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   368: athrow
    //   369: goto -> 2075
    //   372: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   375: athrow
    //   376: aload #7
    //   378: invokeinterface ZlD : ()B
    //   383: ifeq -> 411
    //   386: aload #7
    //   388: invokeinterface ZlD : ()B
    //   393: iconst_4
    //   394: if_icmpeq -> 411
    //   397: goto -> 404
    //   400: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   403: athrow
    //   404: goto -> 278
    //   407: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   410: athrow
    //   411: aload #7
    //   413: invokeinterface ZlP : ()Lburp/Zs_n;
    //   418: astore #13
    //   420: sipush #-31793
    //   423: sipush #12861
    //   426: invokestatic a : (II)Ljava/lang/String;
    //   429: aload #13
    //   431: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   436: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   439: ifeq -> 1214
    //   442: aload #13
    //   444: sipush #-31777
    //   447: sipush #-15175
    //   450: invokestatic a : (II)Ljava/lang/String;
    //   453: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   458: astore #14
    //   460: aload #14
    //   462: ifnull -> 472
    //   465: aload #14
    //   467: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   470: astore #14
    //   472: aload #13
    //   474: sipush #-31804
    //   477: sipush #13785
    //   480: invokestatic a : (II)Ljava/lang/String;
    //   483: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   488: astore #15
    //   490: aload #13
    //   492: sipush #-31785
    //   495: sipush #4470
    //   498: invokestatic a : (II)Ljava/lang/String;
    //   501: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   506: astore #16
    //   508: sipush #-31806
    //   511: sipush #-20012
    //   514: invokestatic a : (II)Ljava/lang/String;
    //   517: aload #14
    //   519: invokevirtual equals : (Ljava/lang/Object;)Z
    //   522: ifeq -> 571
    //   525: aload #16
    //   527: ldc ''
    //   529: invokestatic requireNonNullElse : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   532: checkcast java/lang/String
    //   535: astore #16
    //   537: aload #12
    //   539: invokeinterface ZZp : ()Lburp/Zefg;
    //   544: new burp/Zc7
    //   547: dup
    //   548: getstatic burp/Zl2w.TEXT : Lburp/Zl2w;
    //   551: aload #7
    //   553: aload #15
    //   555: aload #16
    //   557: invokespecial <init> : (Lburp/Zl2w;Lburp/Ztu8;Ljava/lang/String;Ljava/lang/String;)V
    //   560: invokeinterface add : (Ljava/lang/Object;)Z
    //   565: pop
    //   566: aload #4
    //   568: ifnull -> 1209
    //   571: sipush #-31779
    //   574: sipush #21287
    //   577: invokestatic a : (II)Ljava/lang/String;
    //   580: aload #14
    //   582: invokevirtual equals : (Ljava/lang/Object;)Z
    //   585: ifeq -> 636
    //   588: goto -> 595
    //   591: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   594: athrow
    //   595: aload #12
    //   597: invokeinterface ZZp : ()Lburp/Zefg;
    //   602: new burp/Zc7
    //   605: dup
    //   606: getstatic burp/Zl2w.HIDDEN : Lburp/Zl2w;
    //   609: aload #7
    //   611: aload #15
    //   613: aload #16
    //   615: invokespecial <init> : (Lburp/Zl2w;Lburp/Ztu8;Ljava/lang/String;Ljava/lang/String;)V
    //   618: invokeinterface add : (Ljava/lang/Object;)Z
    //   623: pop
    //   624: aload #4
    //   626: ifnull -> 1209
    //   629: goto -> 636
    //   632: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   635: athrow
    //   636: sipush #-31780
    //   639: sipush #-1730
    //   642: invokestatic a : (II)Ljava/lang/String;
    //   645: aload #14
    //   647: invokevirtual equals : (Ljava/lang/Object;)Z
    //   650: ifeq -> 701
    //   653: goto -> 660
    //   656: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   659: athrow
    //   660: aload #12
    //   662: invokeinterface ZZp : ()Lburp/Zefg;
    //   667: new burp/Zc7
    //   670: dup
    //   671: getstatic burp/Zl2w.SUBMIT : Lburp/Zl2w;
    //   674: aload #7
    //   676: aload #15
    //   678: aload #16
    //   680: invokespecial <init> : (Lburp/Zl2w;Lburp/Ztu8;Ljava/lang/String;Ljava/lang/String;)V
    //   683: invokeinterface add : (Ljava/lang/Object;)Z
    //   688: pop
    //   689: aload #4
    //   691: ifnull -> 1209
    //   694: goto -> 701
    //   697: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   700: athrow
    //   701: sipush #-31778
    //   704: sipush #31397
    //   707: invokestatic a : (II)Ljava/lang/String;
    //   710: aload #14
    //   712: invokevirtual equals : (Ljava/lang/Object;)Z
    //   715: ifeq -> 771
    //   718: goto -> 725
    //   721: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   724: athrow
    //   725: aload #16
    //   727: ldc ''
    //   729: invokestatic requireNonNullElse : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   732: checkcast java/lang/String
    //   735: astore #16
    //   737: aload #12
    //   739: invokeinterface ZZp : ()Lburp/Zefg;
    //   744: new burp/Zc7
    //   747: dup
    //   748: getstatic burp/Zl2w.PASSWORD : Lburp/Zl2w;
    //   751: aload #7
    //   753: aload #15
    //   755: aload #16
    //   757: invokespecial <init> : (Lburp/Zl2w;Lburp/Ztu8;Ljava/lang/String;Ljava/lang/String;)V
    //   760: invokeinterface add : (Ljava/lang/Object;)Z
    //   765: pop
    //   766: aload #4
    //   768: ifnull -> 1209
    //   771: sipush #-31784
    //   774: sipush #-23263
    //   777: invokestatic a : (II)Ljava/lang/String;
    //   780: aload #14
    //   782: invokevirtual equals : (Ljava/lang/Object;)Z
    //   785: ifeq -> 848
    //   788: goto -> 795
    //   791: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   794: athrow
    //   795: aload #16
    //   797: sipush #-31792
    //   800: sipush #-26308
    //   803: invokestatic a : (II)Ljava/lang/String;
    //   806: invokestatic requireNonNullElse : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   809: checkcast java/lang/String
    //   812: astore #16
    //   814: aload #12
    //   816: invokeinterface ZZp : ()Lburp/Zefg;
    //   821: new burp/Zc7
    //   824: dup
    //   825: getstatic burp/Zl2w.CHECKBOX : Lburp/Zl2w;
    //   828: aload #7
    //   830: aload #15
    //   832: aload #16
    //   834: invokespecial <init> : (Lburp/Zl2w;Lburp/Ztu8;Ljava/lang/String;Ljava/lang/String;)V
    //   837: invokeinterface add : (Ljava/lang/Object;)Z
    //   842: pop
    //   843: aload #4
    //   845: ifnull -> 1209
    //   848: sipush #-31795
    //   851: sipush #-21965
    //   854: invokestatic a : (II)Ljava/lang/String;
    //   857: aload #14
    //   859: invokevirtual equals : (Ljava/lang/Object;)Z
    //   862: ifeq -> 925
    //   865: goto -> 872
    //   868: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   871: athrow
    //   872: aload #16
    //   874: sipush #-31802
    //   877: sipush #19052
    //   880: invokestatic a : (II)Ljava/lang/String;
    //   883: invokestatic requireNonNullElse : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   886: checkcast java/lang/String
    //   889: astore #16
    //   891: aload #12
    //   893: invokeinterface ZZp : ()Lburp/Zefg;
    //   898: new burp/Zc7
    //   901: dup
    //   902: getstatic burp/Zl2w.RADIO : Lburp/Zl2w;
    //   905: aload #7
    //   907: aload #15
    //   909: aload #16
    //   911: invokespecial <init> : (Lburp/Zl2w;Lburp/Ztu8;Ljava/lang/String;Ljava/lang/String;)V
    //   914: invokeinterface add : (Ljava/lang/Object;)Z
    //   919: pop
    //   920: aload #4
    //   922: ifnull -> 1209
    //   925: sipush #-31788
    //   928: sipush #4916
    //   931: invokestatic a : (II)Ljava/lang/String;
    //   934: aload #14
    //   936: invokevirtual equals : (Ljava/lang/Object;)Z
    //   939: ifeq -> 990
    //   942: goto -> 949
    //   945: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   948: athrow
    //   949: aload #12
    //   951: invokeinterface ZZp : ()Lburp/Zefg;
    //   956: new burp/Zc7
    //   959: dup
    //   960: getstatic burp/Zl2w.FILE : Lburp/Zl2w;
    //   963: aload #7
    //   965: aload #15
    //   967: aload #16
    //   969: invokespecial <init> : (Lburp/Zl2w;Lburp/Ztu8;Ljava/lang/String;Ljava/lang/String;)V
    //   972: invokeinterface add : (Ljava/lang/Object;)Z
    //   977: pop
    //   978: aload #4
    //   980: ifnull -> 1209
    //   983: goto -> 990
    //   986: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   989: athrow
    //   990: sipush #-31782
    //   993: sipush #-15648
    //   996: invokestatic a : (II)Ljava/lang/String;
    //   999: aload #14
    //   1001: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1004: ifeq -> 1055
    //   1007: goto -> 1014
    //   1010: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1013: athrow
    //   1014: aload #12
    //   1016: invokeinterface ZZp : ()Lburp/Zefg;
    //   1021: new burp/Zc7
    //   1024: dup
    //   1025: getstatic burp/Zl2w.IMAGE : Lburp/Zl2w;
    //   1028: aload #7
    //   1030: aload #15
    //   1032: aload #16
    //   1034: invokespecial <init> : (Lburp/Zl2w;Lburp/Ztu8;Ljava/lang/String;Ljava/lang/String;)V
    //   1037: invokeinterface add : (Ljava/lang/Object;)Z
    //   1042: pop
    //   1043: aload #4
    //   1045: ifnull -> 1209
    //   1048: goto -> 1055
    //   1051: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1054: athrow
    //   1055: sipush #-31803
    //   1058: sipush #3412
    //   1061: invokestatic a : (II)Ljava/lang/String;
    //   1064: aload #14
    //   1066: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1069: ifeq -> 1125
    //   1072: goto -> 1079
    //   1075: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1078: athrow
    //   1079: aload #16
    //   1081: ldc ''
    //   1083: invokestatic requireNonNullElse : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1086: checkcast java/lang/String
    //   1089: astore #16
    //   1091: aload #12
    //   1093: invokeinterface ZZp : ()Lburp/Zefg;
    //   1098: new burp/Zc7
    //   1101: dup
    //   1102: getstatic burp/Zl2w.NUMBER : Lburp/Zl2w;
    //   1105: aload #7
    //   1107: aload #15
    //   1109: aload #16
    //   1111: invokespecial <init> : (Lburp/Zl2w;Lburp/Ztu8;Ljava/lang/String;Ljava/lang/String;)V
    //   1114: invokeinterface add : (Ljava/lang/Object;)Z
    //   1119: pop
    //   1120: aload #4
    //   1122: ifnull -> 1209
    //   1125: sipush #-31791
    //   1128: sipush #4418
    //   1131: invokestatic a : (II)Ljava/lang/String;
    //   1134: aload #14
    //   1136: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1139: ifeq -> 1156
    //   1142: goto -> 1149
    //   1145: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1148: athrow
    //   1149: goto -> 1209
    //   1152: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1155: athrow
    //   1156: sipush #-31790
    //   1159: sipush #26397
    //   1162: invokestatic a : (II)Ljava/lang/String;
    //   1165: aload #14
    //   1167: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1170: ifeq -> 1180
    //   1173: goto -> 1209
    //   1176: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1179: athrow
    //   1180: aload #12
    //   1182: invokeinterface ZZp : ()Lburp/Zefg;
    //   1187: new burp/Zc7
    //   1190: dup
    //   1191: getstatic burp/Zl2w.TEXT : Lburp/Zl2w;
    //   1194: aload #7
    //   1196: aload #15
    //   1198: aload #16
    //   1200: invokespecial <init> : (Lburp/Zl2w;Lburp/Ztu8;Ljava/lang/String;Ljava/lang/String;)V
    //   1203: invokeinterface add : (Ljava/lang/Object;)Z
    //   1208: pop
    //   1209: aload #4
    //   1211: ifnull -> 2070
    //   1214: sipush #-31798
    //   1217: sipush #-22246
    //   1220: invokestatic a : (II)Ljava/lang/String;
    //   1223: aload #13
    //   1225: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   1230: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1233: ifeq -> 1376
    //   1236: goto -> 1243
    //   1239: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1242: athrow
    //   1243: sipush #-31786
    //   1246: sipush #2757
    //   1249: invokestatic a : (II)Ljava/lang/String;
    //   1252: aload #13
    //   1254: sipush #-31807
    //   1257: sipush #-11030
    //   1260: invokestatic a : (II)Ljava/lang/String;
    //   1263: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   1268: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1271: ifne -> 1307
    //   1274: goto -> 1281
    //   1277: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1280: athrow
    //   1281: aload #13
    //   1283: sipush #-31807
    //   1286: sipush #-11030
    //   1289: invokestatic a : (II)Ljava/lang/String;
    //   1292: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   1297: ifnonnull -> 2070
    //   1300: goto -> 1307
    //   1303: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1306: athrow
    //   1307: aload #12
    //   1309: invokeinterface ZZp : ()Lburp/Zefg;
    //   1314: new burp/Zc7
    //   1317: dup
    //   1318: getstatic burp/Zl2w.SUBMIT : Lburp/Zl2w;
    //   1321: aload #7
    //   1323: aload #13
    //   1325: sipush #-31787
    //   1328: sipush #18447
    //   1331: invokestatic a : (II)Ljava/lang/String;
    //   1334: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   1339: aload #13
    //   1341: sipush #-31799
    //   1344: sipush #21735
    //   1347: invokestatic a : (II)Ljava/lang/String;
    //   1350: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   1355: invokespecial <init> : (Lburp/Zl2w;Lburp/Ztu8;Ljava/lang/String;Ljava/lang/String;)V
    //   1358: invokeinterface add : (Ljava/lang/Object;)Z
    //   1363: pop
    //   1364: aload #4
    //   1366: ifnull -> 2070
    //   1369: goto -> 1376
    //   1372: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1375: athrow
    //   1376: sipush #-31800
    //   1379: sipush #-11710
    //   1382: invokestatic a : (II)Ljava/lang/String;
    //   1385: aload #13
    //   1387: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   1392: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1395: ifeq -> 1760
    //   1398: goto -> 1405
    //   1401: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1404: athrow
    //   1405: aload #13
    //   1407: sipush #-31787
    //   1410: sipush #18447
    //   1413: invokestatic a : (II)Ljava/lang/String;
    //   1416: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   1421: astore #14
    //   1423: aload #13
    //   1425: sipush #-31794
    //   1428: sipush #-14628
    //   1431: invokestatic a : (II)Ljava/lang/String;
    //   1434: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   1439: ifnull -> 1450
    //   1442: iconst_1
    //   1443: goto -> 1451
    //   1446: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1449: athrow
    //   1450: iconst_0
    //   1451: istore #15
    //   1453: aload #6
    //   1455: invokeinterface hasNext : ()Z
    //   1460: ifeq -> 1755
    //   1463: aload #6
    //   1465: invokeinterface next : ()Ljava/lang/Object;
    //   1470: checkcast burp/Ztu8
    //   1473: astore #16
    //   1475: aload #16
    //   1477: invokeinterface ZlD : ()B
    //   1482: iconst_1
    //   1483: if_icmpne -> 1527
    //   1486: sipush #-31781
    //   1489: sipush #15133
    //   1492: invokestatic a : (II)Ljava/lang/String;
    //   1495: aload #16
    //   1497: invokeinterface ZlP : ()Lburp/Zs_n;
    //   1502: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   1507: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1510: ifeq -> 1527
    //   1513: goto -> 1520
    //   1516: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1519: athrow
    //   1520: goto -> 1755
    //   1523: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1526: athrow
    //   1527: aload #16
    //   1529: invokeinterface ZlD : ()B
    //   1534: ifeq -> 1555
    //   1537: aload #16
    //   1539: invokeinterface ZlD : ()B
    //   1544: iconst_4
    //   1545: if_icmpne -> 1453
    //   1548: goto -> 1555
    //   1551: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1554: athrow
    //   1555: sipush #-31796
    //   1558: sipush #-731
    //   1561: invokestatic a : (II)Ljava/lang/String;
    //   1564: aload #16
    //   1566: invokeinterface ZlP : ()Lburp/Zs_n;
    //   1571: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   1576: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1579: ifne -> 1589
    //   1582: goto -> 1453
    //   1585: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1588: athrow
    //   1589: aload #16
    //   1591: invokeinterface ZlP : ()Lburp/Zs_n;
    //   1596: sipush #-31799
    //   1599: sipush #21735
    //   1602: invokestatic a : (II)Ljava/lang/String;
    //   1605: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   1610: astore #17
    //   1612: iload #15
    //   1614: ifeq -> 1627
    //   1617: getstatic burp/Zl2w.SELECT_MULTIPLE : Lburp/Zl2w;
    //   1620: goto -> 1630
    //   1623: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1626: athrow
    //   1627: getstatic burp/Zl2w.SELECT : Lburp/Zl2w;
    //   1630: astore #18
    //   1632: aload #17
    //   1634: ifnull -> 1677
    //   1637: aload #12
    //   1639: invokeinterface ZZp : ()Lburp/Zefg;
    //   1644: new burp/Zc7
    //   1647: dup
    //   1648: aload #18
    //   1650: aload #16
    //   1652: aload #14
    //   1654: aload #17
    //   1656: invokespecial <init> : (Lburp/Zl2w;Lburp/Ztu8;Ljava/lang/String;Ljava/lang/String;)V
    //   1659: invokeinterface add : (Ljava/lang/Object;)Z
    //   1664: pop
    //   1665: aload #4
    //   1667: ifnull -> 1453
    //   1670: goto -> 1677
    //   1673: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1676: athrow
    //   1677: aload #6
    //   1679: invokeinterface hasNext : ()Z
    //   1684: ifeq -> 1750
    //   1687: aload #6
    //   1689: invokeinterface next : ()Ljava/lang/Object;
    //   1694: checkcast burp/Ztu8
    //   1697: astore #19
    //   1699: aload #19
    //   1701: invokeinterface ZlD : ()B
    //   1706: iconst_3
    //   1707: if_icmpne -> 1750
    //   1710: aload #12
    //   1712: invokeinterface ZZp : ()Lburp/Zefg;
    //   1717: new burp/Zc7
    //   1720: dup
    //   1721: aload #18
    //   1723: aload #16
    //   1725: aload #14
    //   1727: aload #19
    //   1729: invokeinterface Zlv : ()Ljava/lang/String;
    //   1734: invokespecial <init> : (Lburp/Zl2w;Lburp/Ztu8;Ljava/lang/String;Ljava/lang/String;)V
    //   1737: invokeinterface add : (Ljava/lang/Object;)Z
    //   1742: pop
    //   1743: goto -> 1750
    //   1746: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1749: athrow
    //   1750: aload #4
    //   1752: ifnull -> 1453
    //   1755: aload #4
    //   1757: ifnull -> 2070
    //   1760: sipush #-31797
    //   1763: sipush #4074
    //   1766: invokestatic a : (II)Ljava/lang/String;
    //   1769: aload #13
    //   1771: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   1776: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1779: ifeq -> 2070
    //   1782: goto -> 1789
    //   1785: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1788: athrow
    //   1789: aload #7
    //   1791: invokeinterface ZlD : ()B
    //   1796: iconst_4
    //   1797: if_icmpne -> 1814
    //   1800: goto -> 1807
    //   1803: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1806: athrow
    //   1807: goto -> 278
    //   1810: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1813: athrow
    //   1814: aload #13
    //   1816: sipush #-31787
    //   1819: sipush #18447
    //   1822: invokestatic a : (II)Ljava/lang/String;
    //   1825: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   1830: astore #14
    //   1832: new java/lang/StringBuilder
    //   1835: dup
    //   1836: invokespecial <init> : ()V
    //   1839: astore #15
    //   1841: aload #6
    //   1843: invokeinterface hasNext : ()Z
    //   1848: ifeq -> 2070
    //   1851: aload #6
    //   1853: invokeinterface next : ()Ljava/lang/Object;
    //   1858: checkcast burp/Ztu8
    //   1861: astore #16
    //   1863: aload #16
    //   1865: invokeinterface ZlP : ()Lburp/Zs_n;
    //   1870: ifnonnull -> 1901
    //   1873: aload #15
    //   1875: aload #16
    //   1877: invokeinterface Zlv : ()Ljava/lang/String;
    //   1882: invokevirtual trim : ()Ljava/lang/String;
    //   1885: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1888: pop
    //   1889: aload #4
    //   1891: ifnull -> 2065
    //   1894: goto -> 1901
    //   1897: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1900: athrow
    //   1901: aload #16
    //   1903: sipush #-31808
    //   1906: sipush #-11409
    //   1909: invokestatic a : (II)Ljava/lang/String;
    //   1912: invokestatic Zb : (Lburp/Ztu8;Ljava/lang/String;)Z
    //   1915: ifeq -> 1969
    //   1918: goto -> 1925
    //   1921: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1924: athrow
    //   1925: aload #12
    //   1927: invokeinterface ZZp : ()Lburp/Zefg;
    //   1932: new burp/Zc7
    //   1935: dup
    //   1936: getstatic burp/Zl2w.TEXTAREA : Lburp/Zl2w;
    //   1939: aload #7
    //   1941: aload #14
    //   1943: aload #15
    //   1945: invokevirtual toString : ()Ljava/lang/String;
    //   1948: invokespecial <init> : (Lburp/Zl2w;Lburp/Ztu8;Ljava/lang/String;Ljava/lang/String;)V
    //   1951: invokeinterface add : (Ljava/lang/Object;)Z
    //   1956: pop
    //   1957: aload #4
    //   1959: ifnull -> 2070
    //   1962: goto -> 1969
    //   1965: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1968: athrow
    //   1969: aload #16
    //   1971: sipush #-31783
    //   1974: sipush #23763
    //   1977: invokestatic a : (II)Ljava/lang/String;
    //   1980: invokestatic Zb : (Lburp/Ztu8;Ljava/lang/String;)Z
    //   1983: ifeq -> 2045
    //   1986: goto -> 1993
    //   1989: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1992: athrow
    //   1993: aload #12
    //   1995: invokeinterface ZZp : ()Lburp/Zefg;
    //   2000: new burp/Zc7
    //   2003: dup
    //   2004: getstatic burp/Zl2w.TEXTAREA : Lburp/Zl2w;
    //   2007: aload #7
    //   2009: aload #14
    //   2011: aload #15
    //   2013: invokevirtual toString : ()Ljava/lang/String;
    //   2016: invokespecial <init> : (Lburp/Zl2w;Lburp/Ztu8;Ljava/lang/String;Ljava/lang/String;)V
    //   2019: invokeinterface add : (Ljava/lang/Object;)Z
    //   2024: pop
    //   2025: aload #6
    //   2027: invokeinterface previous : ()Ljava/lang/Object;
    //   2032: pop
    //   2033: aload #4
    //   2035: ifnull -> 2070
    //   2038: goto -> 2045
    //   2041: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2044: athrow
    //   2045: aload #15
    //   2047: aload #16
    //   2049: invokeinterface Zlr : ()Ljava/lang/String;
    //   2054: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2057: pop
    //   2058: goto -> 2065
    //   2061: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2064: athrow
    //   2065: aload #4
    //   2067: ifnull -> 1841
    //   2070: aload #4
    //   2072: ifnull -> 278
    //   2075: aload #4
    //   2077: ifnull -> 36
    //   2080: goto -> 2093
    //   2083: astore #6
    //   2085: aload #6
    //   2087: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   2090: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   2093: aload #5
    //   2095: areturn
    // Exception table:
    //   from	to	target	type
    //   14	69	2083	java/lang/Exception
    //   36	61	64	java/lang/Exception
    //   70	311	2083	java/lang/Exception
    //   98	135	138	java/lang/Exception
    //   108	153	156	java/lang/Exception
    //   174	182	182	java/lang/Exception
    //   256	274	274	java/lang/Exception
    //   278	303	306	java/lang/Exception
    //   312	2080	2083	java/lang/Exception
    //   324	362	365	java/lang/Exception
    //   335	372	372	java/lang/Exception
    //   376	397	400	java/lang/Exception
    //   386	407	407	java/lang/Exception
    //   537	588	591	java/lang/Exception
    //   571	629	632	java/lang/Exception
    //   595	653	656	java/lang/Exception
    //   636	694	697	java/lang/Exception
    //   660	718	721	java/lang/Exception
    //   737	788	791	java/lang/Exception
    //   814	865	868	java/lang/Exception
    //   891	942	945	java/lang/Exception
    //   925	983	986	java/lang/Exception
    //   949	1007	1010	java/lang/Exception
    //   990	1048	1051	java/lang/Exception
    //   1014	1072	1075	java/lang/Exception
    //   1091	1142	1145	java/lang/Exception
    //   1125	1152	1152	java/lang/Exception
    //   1156	1176	1176	java/lang/Exception
    //   1209	1236	1239	java/lang/Exception
    //   1214	1274	1277	java/lang/Exception
    //   1243	1300	1303	java/lang/Exception
    //   1281	1369	1372	java/lang/Exception
    //   1307	1398	1401	java/lang/Exception
    //   1423	1446	1446	java/lang/Exception
    //   1475	1513	1516	java/lang/Exception
    //   1486	1523	1523	java/lang/Exception
    //   1527	1548	1551	java/lang/Exception
    //   1555	1585	1585	java/lang/Exception
    //   1612	1623	1623	java/lang/Exception
    //   1632	1670	1673	java/lang/Exception
    //   1699	1743	1746	java/lang/Exception
    //   1755	1782	1785	java/lang/Exception
    //   1760	1800	1803	java/lang/Exception
    //   1789	1810	1810	java/lang/Exception
    //   1863	1894	1897	java/lang/Exception
    //   1873	1918	1921	java/lang/Exception
    //   1901	1962	1965	java/lang/Exception
    //   1925	1986	1989	java/lang/Exception
    //   1969	2038	2041	java/lang/Exception
    //   1993	2058	2061	java/lang/Exception
  }
  
  private static boolean Zb(Ztu8 paramZtu8, String paramString) {
    return (paramString.equalsIgnoreCase(paramZtu8.ZlP().ZJ3()) && paramZtu8.ZlD() == 1);
  }
  
  private static Boolean lambda$getForms$0() {
    return Boolean.valueOf(false);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #31
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¼19DºídÝ\\bÜoJm`~Ë½ ÝÁáØÎÜ"\\tn±O43½\\bç©&ýÚx¦xé`æÜJWäù/ºþ$_\\bÙá"¦}5XtMýëeµ»gÿ_©hÎ\\r"0g_¹nþ\\bwq»e¬ ë¯7\\br|%R(èw1t¢:) î=-r8¬ÁEé>`ÑìÛ®^Y§Ä'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #19
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
    //   68: ldc 'Q\\\b»Uûaò'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_5
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #106
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
    //   128: putstatic burp/Zrl7.a : [Ljava/lang/String;
    //   131: bipush #31
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zrl7.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #74
    //   214: goto -> 243
    //   217: bipush #48
    //   219: goto -> 243
    //   222: bipush #96
    //   224: goto -> 243
    //   227: iconst_2
    //   228: goto -> 243
    //   231: bipush #117
    //   233: goto -> 243
    //   236: bipush #126
    //   238: goto -> 243
    //   241: bipush #58
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF83CC) & 0xFFFF;
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
      byte b1 = 22;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrl7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */