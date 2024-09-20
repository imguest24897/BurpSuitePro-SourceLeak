package burp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.portswigger.Zkb;

class Zspf {
  private static final Class[] Za;
  
  private final byte[] Zy;
  
  private int ZQ;
  
  private byte[] Zt;
  
  private boolean Zp;
  
  private List<Object> Zs;
  
  private Map<String, Object> Zu;
  
  private static final String a;
  
  Zspf(byte[] paramArrayOfbyte) {
    this.Zy = paramArrayOfbyte;
  }
  
  private void Zw() {
    this.Zs = new ArrayList();
    this.Zu = new HashMap<>();
    this.Zt = new byte[256];
  }
  
  static boolean ZJ(byte[] paramArrayOfbyte) {
    try {
      if (paramArrayOfbyte.length > 1)
        try {
          if (paramArrayOfbyte[1] == 60);
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return false;
  }
  
  Zzlm Zy() throws Exception {
    // Byte code:
    //   0: invokestatic ZV : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zy : [B
    //   8: iconst_1
    //   9: baload
    //   10: bipush #60
    //   12: if_icmpne -> 142
    //   15: aload_0
    //   16: invokevirtual Zw : ()V
    //   19: aload_0
    //   20: invokevirtual Zq : ()Lburp/Zk2x;
    //   23: astore_2
    //   24: iconst_0
    //   25: istore_3
    //   26: aload_0
    //   27: getfield Zp : Z
    //   30: ifne -> 104
    //   33: aload_0
    //   34: getfield Zy : [B
    //   37: arraylength
    //   38: aload_0
    //   39: getfield ZQ : I
    //   42: isub
    //   43: lookupswitch default -> 92, 0 -> 80, 20 -> 86, 32 -> 86
    //   76: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   79: athrow
    //   80: iconst_0
    //   81: istore_3
    //   82: aload_1
    //   83: ifnonnull -> 104
    //   86: iconst_1
    //   87: istore_3
    //   88: aload_1
    //   89: ifnonnull -> 104
    //   92: aload_0
    //   93: iconst_1
    //   94: putfield Zp : Z
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: new burp/Zzlm
    //   107: dup
    //   108: iconst_1
    //   109: aload_2
    //   110: aload_0
    //   111: getfield Zp : Z
    //   114: iload_3
    //   115: aload_0
    //   116: getfield Zy : [B
    //   119: invokespecial <init> : (BLburp/Zk2x;ZZ[B)V
    //   122: invokestatic Zwu : ()[Lburp/Zbqc;
    //   125: ifnonnull -> 141
    //   128: iconst_3
    //   129: newarray int
    //   131: invokestatic Z_ : ([I)V
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   140: athrow
    //   141: areturn
    //   142: new java/lang/Exception
    //   145: dup
    //   146: getstatic burp/Zspf.a : Ljava/lang/String;
    //   149: invokespecial <init> : (Ljava/lang/String;)V
    //   152: athrow
    // Exception table:
    //   from	to	target	type
    //   26	76	76	java/lang/Exception
    //   88	97	100	java/lang/Exception
    //   104	134	137	java/lang/Exception
  }
  
  private Zk2x Zq() {
    // Byte code:
    //   0: invokestatic ZV : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zp : Z
    //   8: ifeq -> 25
    //   11: new burp/Zk2x
    //   14: dup
    //   15: iconst_0
    //   16: aconst_null
    //   17: invokespecial <init> : (BLjava/lang/Object;)V
    //   20: areturn
    //   21: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   24: athrow
    //   25: aload_0
    //   26: invokevirtual ZK : ()Ljava/lang/String;
    //   29: astore_2
    //   30: aload_0
    //   31: getfield ZQ : I
    //   34: aload_0
    //   35: getfield Zy : [B
    //   38: arraylength
    //   39: if_icmpge -> 63
    //   42: aload_0
    //   43: getfield Zy : [B
    //   46: aload_0
    //   47: getfield ZQ : I
    //   50: baload
    //   51: bipush #60
    //   53: if_icmpeq -> 73
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   62: athrow
    //   63: new burp/Zk2x
    //   66: dup
    //   67: iconst_5
    //   68: aload_2
    //   69: invokespecial <init> : (BLjava/lang/Object;)V
    //   72: areturn
    //   73: aload_0
    //   74: dup
    //   75: getfield ZQ : I
    //   78: iconst_1
    //   79: iadd
    //   80: putfield ZQ : I
    //   83: aload_2
    //   84: invokevirtual length : ()I
    //   87: iconst_1
    //   88: if_icmpne -> 1084
    //   91: aload_2
    //   92: iconst_0
    //   93: invokevirtual charAt : (I)C
    //   96: istore #4
    //   98: iload #4
    //   100: lookupswitch default -> 1064, 64 -> 691, 98 -> 1025, 104 -> 854, 105 -> 457, 108 -> 556, 111 -> 506, 112 -> 176, 116 -> 296
    //   176: aload_0
    //   177: getfield Zy : [B
    //   180: aload_0
    //   181: getfield ZQ : I
    //   184: baload
    //   185: bipush #59
    //   187: if_icmpeq -> 207
    //   190: goto -> 197
    //   193: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   196: athrow
    //   197: aload_0
    //   198: invokevirtual Zq : ()Lburp/Zk2x;
    //   201: astore #5
    //   203: aload_1
    //   204: ifnonnull -> 219
    //   207: new burp/Zk2x
    //   210: dup
    //   211: bipush #100
    //   213: aconst_null
    //   214: invokespecial <init> : (BLjava/lang/Object;)V
    //   217: astore #5
    //   219: aload_0
    //   220: dup
    //   221: getfield ZQ : I
    //   224: iconst_1
    //   225: iadd
    //   226: putfield ZQ : I
    //   229: aload_0
    //   230: getfield Zy : [B
    //   233: aload_0
    //   234: getfield ZQ : I
    //   237: baload
    //   238: bipush #62
    //   240: if_icmpeq -> 253
    //   243: aload_0
    //   244: invokevirtual Zq : ()Lburp/Zk2x;
    //   247: astore #6
    //   249: aload_1
    //   250: ifnonnull -> 265
    //   253: new burp/Zk2x
    //   256: dup
    //   257: bipush #100
    //   259: aconst_null
    //   260: invokespecial <init> : (BLjava/lang/Object;)V
    //   263: astore #6
    //   265: aload_0
    //   266: dup
    //   267: getfield ZQ : I
    //   270: iconst_1
    //   271: iadd
    //   272: putfield ZQ : I
    //   275: new burp/Zk2x
    //   278: dup
    //   279: bipush #15
    //   281: new burp/Zbl0
    //   284: dup
    //   285: aload #5
    //   287: aload #6
    //   289: invokespecial <init> : (Lburp/Zk2x;Lburp/Zk2x;)V
    //   292: invokespecial <init> : (BLjava/lang/Object;)V
    //   295: areturn
    //   296: aload_0
    //   297: getfield Zy : [B
    //   300: aload_0
    //   301: getfield ZQ : I
    //   304: baload
    //   305: bipush #59
    //   307: if_icmpeq -> 320
    //   310: aload_0
    //   311: invokevirtual Zq : ()Lburp/Zk2x;
    //   314: astore #5
    //   316: aload_1
    //   317: ifnonnull -> 332
    //   320: new burp/Zk2x
    //   323: dup
    //   324: bipush #100
    //   326: aconst_null
    //   327: invokespecial <init> : (BLjava/lang/Object;)V
    //   330: astore #5
    //   332: aload_0
    //   333: dup
    //   334: getfield ZQ : I
    //   337: iconst_1
    //   338: iadd
    //   339: putfield ZQ : I
    //   342: aload_0
    //   343: getfield Zy : [B
    //   346: aload_0
    //   347: getfield ZQ : I
    //   350: baload
    //   351: bipush #59
    //   353: if_icmpeq -> 366
    //   356: aload_0
    //   357: invokevirtual Zq : ()Lburp/Zk2x;
    //   360: astore #6
    //   362: aload_1
    //   363: ifnonnull -> 378
    //   366: new burp/Zk2x
    //   369: dup
    //   370: bipush #100
    //   372: aconst_null
    //   373: invokespecial <init> : (BLjava/lang/Object;)V
    //   376: astore #6
    //   378: aload_0
    //   379: dup
    //   380: getfield ZQ : I
    //   383: iconst_1
    //   384: iadd
    //   385: putfield ZQ : I
    //   388: aload_0
    //   389: getfield Zy : [B
    //   392: aload_0
    //   393: getfield ZQ : I
    //   396: baload
    //   397: bipush #62
    //   399: if_icmpeq -> 412
    //   402: aload_0
    //   403: invokevirtual Zq : ()Lburp/Zk2x;
    //   406: astore #7
    //   408: aload_1
    //   409: ifnonnull -> 424
    //   412: new burp/Zk2x
    //   415: dup
    //   416: bipush #100
    //   418: aconst_null
    //   419: invokespecial <init> : (BLjava/lang/Object;)V
    //   422: astore #7
    //   424: aload_0
    //   425: dup
    //   426: getfield ZQ : I
    //   429: iconst_1
    //   430: iadd
    //   431: putfield ZQ : I
    //   434: new burp/Zk2x
    //   437: dup
    //   438: bipush #16
    //   440: new burp/Zxap
    //   443: dup
    //   444: aload #5
    //   446: aload #6
    //   448: aload #7
    //   450: invokespecial <init> : (Lburp/Zk2x;Lburp/Zk2x;Lburp/Zk2x;)V
    //   453: invokespecial <init> : (BLjava/lang/Object;)V
    //   456: areturn
    //   457: iconst_0
    //   458: istore #5
    //   460: aload_0
    //   461: invokevirtual ZK : ()Ljava/lang/String;
    //   464: invokestatic parseInt : (Ljava/lang/String;)I
    //   467: istore #5
    //   469: goto -> 482
    //   472: astore #6
    //   474: aload #6
    //   476: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   479: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   482: aload_0
    //   483: dup
    //   484: getfield ZQ : I
    //   487: iconst_1
    //   488: iadd
    //   489: putfield ZQ : I
    //   492: new burp/Zk2x
    //   495: dup
    //   496: iconst_2
    //   497: iload #5
    //   499: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   502: invokespecial <init> : (BLjava/lang/Object;)V
    //   505: areturn
    //   506: aload_0
    //   507: getfield Zy : [B
    //   510: aload_0
    //   511: getfield ZQ : I
    //   514: baload
    //   515: bipush #116
    //   517: if_icmpne -> 528
    //   520: iconst_1
    //   521: goto -> 529
    //   524: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   527: athrow
    //   528: iconst_0
    //   529: istore #5
    //   531: aload_0
    //   532: dup
    //   533: getfield ZQ : I
    //   536: iconst_2
    //   537: iadd
    //   538: putfield ZQ : I
    //   541: new burp/Zk2x
    //   544: dup
    //   545: bipush #103
    //   547: iload #5
    //   549: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   552: invokespecial <init> : (BLjava/lang/Object;)V
    //   555: areturn
    //   556: new java/util/ArrayList
    //   559: dup
    //   560: invokespecial <init> : ()V
    //   563: astore #5
    //   565: aload_0
    //   566: getfield Zy : [B
    //   569: aload_0
    //   570: getfield ZQ : I
    //   573: baload
    //   574: bipush #62
    //   576: if_icmpeq -> 669
    //   579: aload_0
    //   580: getfield Zp : Z
    //   583: ifne -> 669
    //   586: aload_0
    //   587: getfield Zy : [B
    //   590: aload_0
    //   591: getfield ZQ : I
    //   594: baload
    //   595: bipush #59
    //   597: if_icmpeq -> 630
    //   600: goto -> 607
    //   603: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   606: athrow
    //   607: aload #5
    //   609: aload_0
    //   610: invokevirtual Zq : ()Lburp/Zk2x;
    //   613: invokeinterface add : (Ljava/lang/Object;)Z
    //   618: pop
    //   619: aload_1
    //   620: ifnonnull -> 655
    //   623: goto -> 630
    //   626: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   629: athrow
    //   630: aload #5
    //   632: new burp/Zk2x
    //   635: dup
    //   636: bipush #100
    //   638: aconst_null
    //   639: invokespecial <init> : (BLjava/lang/Object;)V
    //   642: invokeinterface add : (Ljava/lang/Object;)Z
    //   647: pop
    //   648: goto -> 655
    //   651: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   654: athrow
    //   655: aload_0
    //   656: dup
    //   657: getfield ZQ : I
    //   660: iconst_1
    //   661: iadd
    //   662: putfield ZQ : I
    //   665: aload_1
    //   666: ifnonnull -> 565
    //   669: aload_0
    //   670: dup
    //   671: getfield ZQ : I
    //   674: iconst_1
    //   675: iadd
    //   676: putfield ZQ : I
    //   679: new burp/Zk2x
    //   682: dup
    //   683: bipush #22
    //   685: aload #5
    //   687: invokespecial <init> : (BLjava/lang/Object;)V
    //   690: areturn
    //   691: new java/util/ArrayList
    //   694: dup
    //   695: invokespecial <init> : ()V
    //   698: astore #5
    //   700: aload_0
    //   701: getfield Zy : [B
    //   704: aload_0
    //   705: getfield ZQ : I
    //   708: baload
    //   709: bipush #62
    //   711: if_icmpeq -> 801
    //   714: aload_0
    //   715: getfield Zp : Z
    //   718: ifne -> 801
    //   721: aload_0
    //   722: getfield Zy : [B
    //   725: aload_0
    //   726: getfield ZQ : I
    //   729: baload
    //   730: bipush #59
    //   732: if_icmpeq -> 769
    //   735: goto -> 742
    //   738: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   741: athrow
    //   742: aload #5
    //   744: new burp/Zk2x
    //   747: dup
    //   748: iconst_5
    //   749: aload_0
    //   750: invokevirtual ZK : ()Ljava/lang/String;
    //   753: invokespecial <init> : (BLjava/lang/Object;)V
    //   756: invokeinterface add : (Ljava/lang/Object;)Z
    //   761: pop
    //   762: goto -> 769
    //   765: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   768: athrow
    //   769: aload #5
    //   771: new burp/Zk2x
    //   774: dup
    //   775: bipush #100
    //   777: aconst_null
    //   778: invokespecial <init> : (BLjava/lang/Object;)V
    //   781: invokeinterface add : (Ljava/lang/Object;)Z
    //   786: pop
    //   787: aload_0
    //   788: dup
    //   789: getfield ZQ : I
    //   792: iconst_1
    //   793: iadd
    //   794: putfield ZQ : I
    //   797: aload_1
    //   798: ifnonnull -> 700
    //   801: aload_0
    //   802: dup
    //   803: getfield ZQ : I
    //   806: iconst_1
    //   807: iadd
    //   808: putfield ZQ : I
    //   811: aload #5
    //   813: invokeinterface size : ()I
    //   818: anewarray burp/Zk2x
    //   821: astore #6
    //   823: aload #5
    //   825: aload #6
    //   827: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   832: pop
    //   833: new burp/Zk2x
    //   836: dup
    //   837: bipush #20
    //   839: new burp/Zt5g
    //   842: dup
    //   843: ldc java/lang/String
    //   845: aload #6
    //   847: invokespecial <init> : (Ljava/lang/Object;[Lburp/Zk2x;)V
    //   850: invokespecial <init> : (BLjava/lang/Object;)V
    //   853: areturn
    //   854: new java/util/ArrayList
    //   857: dup
    //   858: invokespecial <init> : ()V
    //   861: astore #5
    //   863: aload_0
    //   864: getfield Zy : [B
    //   867: aload_0
    //   868: getfield ZQ : I
    //   871: baload
    //   872: bipush #62
    //   874: if_icmpeq -> 981
    //   877: aload_0
    //   878: getfield Zp : Z
    //   881: ifne -> 981
    //   884: aload_0
    //   885: invokevirtual Zq : ()Lburp/Zk2x;
    //   888: astore #6
    //   890: aload_0
    //   891: dup
    //   892: getfield ZQ : I
    //   895: iconst_1
    //   896: iadd
    //   897: putfield ZQ : I
    //   900: aload_0
    //   901: getfield Zy : [B
    //   904: aload_0
    //   905: getfield ZQ : I
    //   908: baload
    //   909: bipush #59
    //   911: if_icmpeq -> 924
    //   914: aload_0
    //   915: invokevirtual Zq : ()Lburp/Zk2x;
    //   918: astore #7
    //   920: aload_1
    //   921: ifnonnull -> 936
    //   924: new burp/Zk2x
    //   927: dup
    //   928: bipush #100
    //   930: aconst_null
    //   931: invokespecial <init> : (BLjava/lang/Object;)V
    //   934: astore #7
    //   936: aload_0
    //   937: dup
    //   938: getfield ZQ : I
    //   941: iconst_1
    //   942: iadd
    //   943: putfield ZQ : I
    //   946: aload #5
    //   948: new burp/Zk2x
    //   951: dup
    //   952: bipush #126
    //   954: iconst_2
    //   955: anewarray burp/Zk2x
    //   958: dup
    //   959: iconst_0
    //   960: aload #6
    //   962: aastore
    //   963: dup
    //   964: iconst_1
    //   965: aload #7
    //   967: aastore
    //   968: invokespecial <init> : (BLjava/lang/Object;)V
    //   971: invokeinterface add : (Ljava/lang/Object;)Z
    //   976: pop
    //   977: aload_1
    //   978: ifnonnull -> 863
    //   981: aload_0
    //   982: dup
    //   983: getfield ZQ : I
    //   986: iconst_1
    //   987: iadd
    //   988: putfield ZQ : I
    //   991: aload #5
    //   993: invokeinterface size : ()I
    //   998: anewarray burp/Zk2x
    //   1001: astore #6
    //   1003: aload #5
    //   1005: aload #6
    //   1007: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   1012: pop
    //   1013: new burp/Zk2x
    //   1016: dup
    //   1017: bipush #127
    //   1019: aload #6
    //   1021: invokespecial <init> : (BLjava/lang/Object;)V
    //   1024: areturn
    //   1025: aload_0
    //   1026: invokevirtual ZK : ()Ljava/lang/String;
    //   1029: invokestatic Zy : (Ljava/lang/String;)[B
    //   1032: invokestatic Zt : ([B)[B
    //   1035: astore_3
    //   1036: aload_0
    //   1037: dup
    //   1038: getfield ZQ : I
    //   1041: iconst_1
    //   1042: iadd
    //   1043: putfield ZQ : I
    //   1046: new burp/Zk2x
    //   1049: dup
    //   1050: bipush #50
    //   1052: new burp/Zb8h
    //   1055: dup
    //   1056: aload_3
    //   1057: invokespecial <init> : ([B)V
    //   1060: invokespecial <init> : (BLjava/lang/Object;)V
    //   1063: areturn
    //   1064: aload_0
    //   1065: aload_2
    //   1066: invokevirtual Zw : (Ljava/lang/String;)Lburp/Zk2x;
    //   1069: astore #5
    //   1071: aload_0
    //   1072: dup
    //   1073: getfield ZQ : I
    //   1076: iconst_1
    //   1077: iadd
    //   1078: putfield ZQ : I
    //   1081: aload #5
    //   1083: areturn
    //   1084: aload_2
    //   1085: iconst_0
    //   1086: invokevirtual charAt : (I)C
    //   1089: bipush #64
    //   1091: if_icmpne -> 1124
    //   1094: aload_0
    //   1095: aload_2
    //   1096: iconst_1
    //   1097: invokevirtual substring : (I)Ljava/lang/String;
    //   1100: invokevirtual ZU : (Ljava/lang/String;)Ljava/lang/Object;
    //   1103: astore_3
    //   1104: aload_0
    //   1105: aload_3
    //   1106: invokevirtual ZX : (Ljava/lang/Object;)Lburp/Zk2x;
    //   1109: astore #4
    //   1111: aload_0
    //   1112: dup
    //   1113: getfield ZQ : I
    //   1116: iconst_1
    //   1117: iadd
    //   1118: putfield ZQ : I
    //   1121: aload #4
    //   1123: areturn
    //   1124: aload_0
    //   1125: aload_2
    //   1126: invokevirtual Zw : (Ljava/lang/String;)Lburp/Zk2x;
    //   1129: astore_3
    //   1130: aload_0
    //   1131: dup
    //   1132: getfield ZQ : I
    //   1135: iconst_1
    //   1136: iadd
    //   1137: putfield ZQ : I
    //   1140: aload_3
    //   1141: areturn
    //   1142: astore_2
    //   1143: aload_2
    //   1144: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   1147: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1150: aload_0
    //   1151: iconst_1
    //   1152: putfield Zp : Z
    //   1155: new burp/Zk2x
    //   1158: dup
    //   1159: iconst_0
    //   1160: aconst_null
    //   1161: invokespecial <init> : (BLjava/lang/Object;)V
    //   1164: areturn
    // Exception table:
    //   from	to	target	type
    //   4	21	21	java/lang/NumberFormatException
    //   25	72	1142	java/lang/Exception
    //   30	56	59	java/lang/NumberFormatException
    //   73	295	1142	java/lang/Exception
    //   98	190	193	java/lang/NumberFormatException
    //   296	456	1142	java/lang/Exception
    //   457	505	1142	java/lang/Exception
    //   460	469	472	java/lang/NumberFormatException
    //   506	524	524	java/lang/NumberFormatException
    //   506	555	1142	java/lang/Exception
    //   556	690	1142	java/lang/Exception
    //   579	600	603	java/lang/NumberFormatException
    //   586	623	626	java/lang/NumberFormatException
    //   607	648	651	java/lang/NumberFormatException
    //   691	853	1142	java/lang/Exception
    //   714	735	738	java/lang/NumberFormatException
    //   721	762	765	java/lang/NumberFormatException
    //   854	1024	1142	java/lang/Exception
    //   1025	1063	1142	java/lang/Exception
    //   1064	1083	1142	java/lang/Exception
    //   1084	1123	1142	java/lang/Exception
    //   1124	1141	1142	java/lang/Exception
  }
  
  private String ZK() {
    int[] arrayOfInt = Zzlm.ZV();
    byte b = 0;
    while (this.ZQ < this.Zy.length) {
      try {
        switch (this.Zy[this.ZQ]) {
          case 59:
          case 60:
          case 62:
            return Zkb.Zo(this.Zt, 0, b);
          case 92:
          
          default:
            this.Zt[b] = this.Zy[this.ZQ];
            b++;
            break;
        } 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      this.ZQ++;
      continue;
      if (b >= this.Zt.length) {
        byte[] arrayOfByte = new byte[this.Zt.length * 2];
        System.arraycopy(this.Zt, 0, arrayOfByte, 0, this.Zt.length);
        this.Zt = arrayOfByte;
        if (arrayOfInt == null)
          break; 
      } 
    } 
    return Zkb.Zo(this.Zt, 0, b);
  }
  
  private Object ZU(String paramString) {
    int i = ZK(paramString);
    Object object = Zv(i);
    if (object == null) {
      object = new Zxxa(paramString);
      this.Zs.add(object);
    } 
    return object;
  }
  
  private int ZK(String paramString) {
    int i = 0;
    int j = paramString.length();
    int k = 0;
    int[] arrayOfInt = Zzlm.ZV();
    while (k < j) {
      switch (paramString.charAt(k)) {
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
          i *= 10;
          i += paramString.charAt(k) - 48;
        default:
          i = -1;
          k = j;
          break;
      } 
      k++;
      continue;
      if (arrayOfInt == null)
        break; 
    } 
    return i;
  }
  
  private Object Zv(int paramInt) {
    try {
      if (paramInt == -1)
        return null; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (paramInt <= 49)
        return Za[paramInt]; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return this.Zs.get(paramInt - 50);
  }
  
  private Zk2x ZX(Object paramObject) {
    // Byte code:
    //   0: invokestatic ZV : ()[I
    //   3: astore_2
    //   4: new java/util/ArrayList
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_3
    //   12: aload_0
    //   13: getfield Zy : [B
    //   16: aload_0
    //   17: getfield ZQ : I
    //   20: baload
    //   21: bipush #62
    //   23: if_icmpeq -> 114
    //   26: aload_0
    //   27: getfield Zp : Z
    //   30: ifne -> 114
    //   33: aload_0
    //   34: getfield Zy : [B
    //   37: aload_0
    //   38: getfield ZQ : I
    //   41: baload
    //   42: bipush #59
    //   44: if_icmpeq -> 76
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   53: athrow
    //   54: aload_3
    //   55: aload_0
    //   56: invokevirtual Zq : ()Lburp/Zk2x;
    //   59: invokeinterface add : (Ljava/lang/Object;)Z
    //   64: pop
    //   65: aload_2
    //   66: ifnonnull -> 100
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   75: athrow
    //   76: aload_3
    //   77: new burp/Zk2x
    //   80: dup
    //   81: bipush #100
    //   83: aconst_null
    //   84: invokespecial <init> : (BLjava/lang/Object;)V
    //   87: invokeinterface add : (Ljava/lang/Object;)Z
    //   92: pop
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: aload_0
    //   101: dup
    //   102: getfield ZQ : I
    //   105: iconst_1
    //   106: iadd
    //   107: putfield ZQ : I
    //   110: aload_2
    //   111: ifnonnull -> 12
    //   114: aload_3
    //   115: invokeinterface size : ()I
    //   120: anewarray burp/Zk2x
    //   123: astore #4
    //   125: aload_3
    //   126: aload #4
    //   128: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   133: pop
    //   134: new burp/Zk2x
    //   137: dup
    //   138: bipush #20
    //   140: new burp/Zt5g
    //   143: dup
    //   144: aload_1
    //   145: aload #4
    //   147: invokespecial <init> : (Ljava/lang/Object;[Lburp/Zk2x;)V
    //   150: invokespecial <init> : (BLjava/lang/Object;)V
    //   153: areturn
    // Exception table:
    //   from	to	target	type
    //   26	47	50	java/lang/NumberFormatException
    //   33	69	72	java/lang/NumberFormatException
    //   54	93	96	java/lang/NumberFormatException
  }
  
  private Zk2x Zw(String paramString) {
    // Byte code:
    //   0: invokestatic ZV : ()[I
    //   3: astore_2
    //   4: aload_0
    //   5: aload_1
    //   6: invokevirtual ZK : (Ljava/lang/String;)I
    //   9: istore #4
    //   11: iload #4
    //   13: iconst_m1
    //   14: if_icmpeq -> 47
    //   17: aload_0
    //   18: getfield Zu : Ljava/util/Map;
    //   21: aload_1
    //   22: aload_0
    //   23: iload #4
    //   25: <illegal opcode> apply : (Lburp/Zspf;I)Ljava/util/function/Function;
    //   30: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   35: pop
    //   36: aload_2
    //   37: ifnonnull -> 108
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   46: athrow
    //   47: new burp/Zxxa
    //   50: dup
    //   51: aload_1
    //   52: invokespecial <init> : (Ljava/lang/String;)V
    //   55: astore_3
    //   56: aload_0
    //   57: getfield Zs : Ljava/util/List;
    //   60: aload_3
    //   61: invokeinterface add : (Ljava/lang/Object;)Z
    //   66: pop
    //   67: aload_0
    //   68: getfield Zs : Ljava/util/List;
    //   71: invokeinterface size : ()I
    //   76: bipush #50
    //   78: iadd
    //   79: istore #5
    //   81: aload_0
    //   82: getfield Zu : Ljava/util/Map;
    //   85: iload #5
    //   87: invokestatic toString : (I)Ljava/lang/String;
    //   90: aload_3
    //   91: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   96: pop
    //   97: aload_0
    //   98: getfield Zs : Ljava/util/List;
    //   101: aload_3
    //   102: invokeinterface add : (Ljava/lang/Object;)Z
    //   107: pop
    //   108: aload_0
    //   109: invokevirtual ZK : ()Ljava/lang/String;
    //   112: astore #5
    //   114: new burp/Zk2x
    //   117: dup
    //   118: bipush #50
    //   120: new burp/Zb8h
    //   123: dup
    //   124: aload #5
    //   126: invokestatic Zy : (Ljava/lang/String;)[B
    //   129: invokespecial <init> : ([B)V
    //   132: invokespecial <init> : (BLjava/lang/Object;)V
    //   135: areturn
    // Exception table:
    //   from	to	target	type
    //   11	40	43	java/lang/NumberFormatException
  }
  
  private Object lambda$consumeTypeConverterValue$0(int paramInt, String paramString) {
    return Zv(paramInt);
  }
  
  static {
    // Byte code:
    //   0: bipush #115
    //   2: ldc '_muz]zpn1;<_A,?O]=?3QT.,bv0z'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zspf.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #98
    //   82: goto -> 111
    //   85: bipush #113
    //   87: goto -> 111
    //   90: iconst_2
    //   91: goto -> 111
    //   94: bipush #38
    //   96: goto -> 111
    //   99: bipush #104
    //   101: goto -> 111
    //   104: bipush #14
    //   106: goto -> 111
    //   109: bipush #127
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: iconst_5
    //   154: anewarray java/lang/Class
    //   157: dup
    //   158: iconst_0
    //   159: ldc java/lang/Object
    //   161: aastore
    //   162: dup
    //   163: iconst_1
    //   164: ldc java/util/Hashtable
    //   166: aastore
    //   167: dup
    //   168: iconst_2
    //   169: ldc java/awt/Color
    //   171: aastore
    //   172: dup
    //   173: iconst_3
    //   174: ldc java/lang/Short
    //   176: aastore
    //   177: dup
    //   178: iconst_4
    //   179: ldc java/lang/Long
    //   181: aastore
    //   182: putstatic burp/Zspf.Za : [Ljava/lang/Class;
    //   185: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zspf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */