package burp;

import java.math.BigInteger;

class Zsx6 extends ClassLoader {
  static Object ZN;
  
  static String ZJ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZL(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZB(Object paramObject) {
    Zgde.Zr = a(17868, -10238);
    Zgde.ZG = new BigInteger(a(17869, 29667));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zg27.ZP.charAt(Math.abs(((BigInteger)Zkde.Zk).intValue() % 32)) > Zmd.Zf.charAt(Math.abs(((BigInteger)Zrfl.Z_).intValue() % 32))) {
          try {
            Zm81.ZZ(Class.forName(a(17871, -10975)));
            if (bool)
              Zstf.Zz(Class.forName(a(17856, -11776))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zstf.Zz(Class.forName(a(17856, -11776)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zs(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zkff.Zr : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: iconst_0
    //   15: istore #5
    //   17: iconst_0
    //   18: istore #6
    //   20: iload #6
    //   22: aload_3
    //   23: arraylength
    //   24: if_icmpge -> 169
    //   27: aload_3
    //   28: iload #6
    //   30: baload
    //   31: istore #7
    //   33: iload #7
    //   35: bipush #48
    //   37: if_icmplt -> 54
    //   40: iload #7
    //   42: bipush #57
    //   44: if_icmple -> 152
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   53: athrow
    //   54: iload #7
    //   56: bipush #65
    //   58: if_icmplt -> 82
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   67: athrow
    //   68: iload #7
    //   70: bipush #90
    //   72: if_icmple -> 152
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   81: athrow
    //   82: iload #7
    //   84: bipush #97
    //   86: if_icmplt -> 110
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   95: athrow
    //   96: iload #7
    //   98: bipush #122
    //   100: if_icmple -> 152
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   109: athrow
    //   110: iload #7
    //   112: bipush #43
    //   114: if_icmpeq -> 152
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   123: athrow
    //   124: iload #7
    //   126: bipush #47
    //   128: if_icmpeq -> 152
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   137: athrow
    //   138: iload #7
    //   140: bipush #61
    //   142: if_icmpne -> 162
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   151: athrow
    //   152: iinc #5, 1
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   161: athrow
    //   162: iinc #6, 1
    //   165: iload_2
    //   166: ifne -> 20
    //   169: iload #5
    //   171: newarray byte
    //   173: astore #6
    //   175: iconst_0
    //   176: istore #7
    //   178: iconst_0
    //   179: istore #8
    //   181: iload #8
    //   183: aload_3
    //   184: arraylength
    //   185: if_icmpge -> 337
    //   188: aload_3
    //   189: iload #8
    //   191: baload
    //   192: istore #9
    //   194: iload #9
    //   196: bipush #48
    //   198: if_icmplt -> 215
    //   201: iload #9
    //   203: bipush #57
    //   205: if_icmple -> 313
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   214: athrow
    //   215: iload #9
    //   217: bipush #65
    //   219: if_icmplt -> 243
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   228: athrow
    //   229: iload #9
    //   231: bipush #90
    //   233: if_icmple -> 313
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   242: athrow
    //   243: iload #9
    //   245: bipush #97
    //   247: if_icmplt -> 271
    //   250: goto -> 257
    //   253: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   256: athrow
    //   257: iload #9
    //   259: bipush #122
    //   261: if_icmple -> 313
    //   264: goto -> 271
    //   267: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   270: athrow
    //   271: iload #9
    //   273: bipush #43
    //   275: if_icmpeq -> 313
    //   278: goto -> 285
    //   281: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   284: athrow
    //   285: iload #9
    //   287: bipush #47
    //   289: if_icmpeq -> 313
    //   292: goto -> 299
    //   295: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   298: athrow
    //   299: iload #9
    //   301: bipush #61
    //   303: if_icmpne -> 330
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   312: athrow
    //   313: aload #6
    //   315: iload #7
    //   317: iload #9
    //   319: bastore
    //   320: iinc #7, 1
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   329: athrow
    //   330: iinc #8, 1
    //   333: iload_2
    //   334: ifne -> 181
    //   337: aload #6
    //   339: astore #4
    //   341: aload #4
    //   343: astore_3
    //   344: aload_3
    //   345: arraylength
    //   346: istore #5
    //   348: aload_3
    //   349: iload #5
    //   351: iconst_1
    //   352: isub
    //   353: baload
    //   354: bipush #61
    //   356: if_icmpne -> 366
    //   359: iinc #5, -1
    //   362: iload_2
    //   363: ifne -> 348
    //   366: iload #5
    //   368: aload_3
    //   369: arraylength
    //   370: iconst_4
    //   371: idiv
    //   372: isub
    //   373: newarray byte
    //   375: astore #6
    //   377: iconst_0
    //   378: istore #7
    //   380: iload #7
    //   382: aload_3
    //   383: arraylength
    //   384: if_icmpge -> 646
    //   387: aload_3
    //   388: iload #7
    //   390: baload
    //   391: bipush #61
    //   393: if_icmpne -> 412
    //   396: aload_3
    //   397: iload #7
    //   399: iconst_0
    //   400: bastore
    //   401: iload_2
    //   402: ifne -> 639
    //   405: goto -> 412
    //   408: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   411: athrow
    //   412: aload_3
    //   413: iload #7
    //   415: baload
    //   416: bipush #47
    //   418: if_icmpne -> 445
    //   421: goto -> 428
    //   424: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   427: athrow
    //   428: aload_3
    //   429: iload #7
    //   431: bipush #63
    //   433: bastore
    //   434: iload_2
    //   435: ifne -> 639
    //   438: goto -> 445
    //   441: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   444: athrow
    //   445: aload_3
    //   446: iload #7
    //   448: baload
    //   449: bipush #43
    //   451: if_icmpne -> 478
    //   454: goto -> 461
    //   457: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   460: athrow
    //   461: aload_3
    //   462: iload #7
    //   464: bipush #62
    //   466: bastore
    //   467: iload_2
    //   468: ifne -> 639
    //   471: goto -> 478
    //   474: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   477: athrow
    //   478: aload_3
    //   479: iload #7
    //   481: baload
    //   482: bipush #48
    //   484: if_icmplt -> 533
    //   487: goto -> 494
    //   490: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   493: athrow
    //   494: aload_3
    //   495: iload #7
    //   497: baload
    //   498: bipush #57
    //   500: if_icmpgt -> 533
    //   503: goto -> 510
    //   506: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   509: athrow
    //   510: aload_3
    //   511: iload #7
    //   513: aload_3
    //   514: iload #7
    //   516: baload
    //   517: bipush #-4
    //   519: isub
    //   520: i2b
    //   521: bastore
    //   522: iload_2
    //   523: ifne -> 639
    //   526: goto -> 533
    //   529: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   532: athrow
    //   533: aload_3
    //   534: iload #7
    //   536: baload
    //   537: bipush #97
    //   539: if_icmplt -> 588
    //   542: goto -> 549
    //   545: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   548: athrow
    //   549: aload_3
    //   550: iload #7
    //   552: baload
    //   553: bipush #122
    //   555: if_icmpgt -> 588
    //   558: goto -> 565
    //   561: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   564: athrow
    //   565: aload_3
    //   566: iload #7
    //   568: aload_3
    //   569: iload #7
    //   571: baload
    //   572: bipush #71
    //   574: isub
    //   575: i2b
    //   576: bastore
    //   577: iload_2
    //   578: ifne -> 639
    //   581: goto -> 588
    //   584: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   587: athrow
    //   588: aload_3
    //   589: iload #7
    //   591: baload
    //   592: bipush #65
    //   594: if_icmplt -> 639
    //   597: goto -> 604
    //   600: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   603: athrow
    //   604: aload_3
    //   605: iload #7
    //   607: baload
    //   608: bipush #90
    //   610: if_icmpgt -> 639
    //   613: goto -> 620
    //   616: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   619: athrow
    //   620: aload_3
    //   621: iload #7
    //   623: aload_3
    //   624: iload #7
    //   626: baload
    //   627: bipush #65
    //   629: isub
    //   630: i2b
    //   631: bastore
    //   632: goto -> 639
    //   635: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   638: athrow
    //   639: iinc #7, 1
    //   642: iload_2
    //   643: ifne -> 380
    //   646: iconst_0
    //   647: istore #7
    //   649: iconst_0
    //   650: istore #8
    //   652: iload #8
    //   654: aload #6
    //   656: arraylength
    //   657: iconst_2
    //   658: isub
    //   659: if_icmpge -> 762
    //   662: aload #6
    //   664: iload #8
    //   666: aload_3
    //   667: iload #7
    //   669: baload
    //   670: iconst_2
    //   671: ishl
    //   672: sipush #255
    //   675: iand
    //   676: aload_3
    //   677: iload #7
    //   679: iconst_1
    //   680: iadd
    //   681: baload
    //   682: iconst_4
    //   683: iushr
    //   684: iconst_3
    //   685: iand
    //   686: ior
    //   687: i2b
    //   688: bastore
    //   689: aload #6
    //   691: iload #8
    //   693: iconst_1
    //   694: iadd
    //   695: aload_3
    //   696: iload #7
    //   698: iconst_1
    //   699: iadd
    //   700: baload
    //   701: iconst_4
    //   702: ishl
    //   703: sipush #255
    //   706: iand
    //   707: aload_3
    //   708: iload #7
    //   710: iconst_2
    //   711: iadd
    //   712: baload
    //   713: iconst_2
    //   714: iushr
    //   715: bipush #15
    //   717: iand
    //   718: ior
    //   719: i2b
    //   720: bastore
    //   721: aload #6
    //   723: iload #8
    //   725: iconst_2
    //   726: iadd
    //   727: aload_3
    //   728: iload #7
    //   730: iconst_2
    //   731: iadd
    //   732: baload
    //   733: bipush #6
    //   735: ishl
    //   736: sipush #255
    //   739: iand
    //   740: aload_3
    //   741: iload #7
    //   743: iconst_3
    //   744: iadd
    //   745: baload
    //   746: bipush #63
    //   748: iand
    //   749: ior
    //   750: i2b
    //   751: bastore
    //   752: iinc #7, 4
    //   755: iinc #8, 3
    //   758: iload_2
    //   759: ifne -> 652
    //   762: iload #8
    //   764: aload #6
    //   766: arraylength
    //   767: if_icmpge -> 804
    //   770: aload #6
    //   772: iload #8
    //   774: aload_3
    //   775: iload #7
    //   777: baload
    //   778: iconst_2
    //   779: ishl
    //   780: sipush #255
    //   783: iand
    //   784: aload_3
    //   785: iload #7
    //   787: iconst_1
    //   788: iadd
    //   789: baload
    //   790: iconst_4
    //   791: iushr
    //   792: iconst_3
    //   793: iand
    //   794: ior
    //   795: i2b
    //   796: bastore
    //   797: goto -> 804
    //   800: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   803: athrow
    //   804: iinc #8, 1
    //   807: iload #8
    //   809: aload #6
    //   811: arraylength
    //   812: if_icmpge -> 852
    //   815: aload #6
    //   817: iload #8
    //   819: aload_3
    //   820: iload #7
    //   822: iconst_1
    //   823: iadd
    //   824: baload
    //   825: iconst_4
    //   826: ishl
    //   827: sipush #255
    //   830: iand
    //   831: aload_3
    //   832: iload #7
    //   834: iconst_2
    //   835: iadd
    //   836: baload
    //   837: iconst_2
    //   838: iushr
    //   839: bipush #15
    //   841: iand
    //   842: ior
    //   843: i2b
    //   844: bastore
    //   845: goto -> 852
    //   848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   851: athrow
    //   852: aload #6
    //   854: astore #4
    //   856: new java/math/BigInteger
    //   859: dup
    //   860: aload #4
    //   862: invokespecial <init> : ([B)V
    //   865: invokevirtual abs : ()Ljava/math/BigInteger;
    //   868: putstatic burp/Zl1n.ZM : Ljava/lang/Object;
    //   871: ldc2_w 8682522807148012
    //   874: invokestatic currentTimeMillis : ()J
    //   877: lxor
    //   878: lstore #4
    //   880: lload #4
    //   882: ldc2_w 25214903917
    //   885: lmul
    //   886: ldc2_w 11
    //   889: ladd
    //   890: ldc2_w 281474976710655
    //   893: land
    //   894: lstore #4
    //   896: lload #4
    //   898: bipush #32
    //   900: lshl
    //   901: lstore #6
    //   903: lload #4
    //   905: ldc2_w 25214903917
    //   908: lmul
    //   909: ldc2_w 11
    //   912: ladd
    //   913: ldc2_w 281474976710655
    //   916: land
    //   917: lstore #4
    //   919: lload #6
    //   921: lload #4
    //   923: ladd
    //   924: lstore #6
    //   926: bipush #16
    //   928: newarray byte
    //   930: dup
    //   931: iconst_0
    //   932: bipush #48
    //   934: bastore
    //   935: dup
    //   936: iconst_1
    //   937: bipush #49
    //   939: bastore
    //   940: dup
    //   941: iconst_2
    //   942: bipush #50
    //   944: bastore
    //   945: dup
    //   946: iconst_3
    //   947: bipush #51
    //   949: bastore
    //   950: dup
    //   951: iconst_4
    //   952: bipush #52
    //   954: bastore
    //   955: dup
    //   956: iconst_5
    //   957: bipush #53
    //   959: bastore
    //   960: dup
    //   961: bipush #6
    //   963: bipush #54
    //   965: bastore
    //   966: dup
    //   967: bipush #7
    //   969: bipush #55
    //   971: bastore
    //   972: dup
    //   973: bipush #8
    //   975: bipush #56
    //   977: bastore
    //   978: dup
    //   979: bipush #9
    //   981: bipush #57
    //   983: bastore
    //   984: dup
    //   985: bipush #10
    //   987: bipush #97
    //   989: bastore
    //   990: dup
    //   991: bipush #11
    //   993: bipush #98
    //   995: bastore
    //   996: dup
    //   997: bipush #12
    //   999: bipush #99
    //   1001: bastore
    //   1002: dup
    //   1003: bipush #13
    //   1005: bipush #100
    //   1007: bastore
    //   1008: dup
    //   1009: bipush #14
    //   1011: bipush #101
    //   1013: bastore
    //   1014: dup
    //   1015: bipush #15
    //   1017: bipush #102
    //   1019: bastore
    //   1020: astore #8
    //   1022: bipush #64
    //   1024: newarray byte
    //   1026: astore #9
    //   1028: bipush #64
    //   1030: istore #10
    //   1032: bipush #16
    //   1034: istore #11
    //   1036: iload #11
    //   1038: iconst_1
    //   1039: isub
    //   1040: i2l
    //   1041: lstore #12
    //   1043: aload #9
    //   1045: iinc #10, -1
    //   1048: iload #10
    //   1050: aload #8
    //   1052: lload #6
    //   1054: lload #12
    //   1056: land
    //   1057: l2i
    //   1058: baload
    //   1059: bastore
    //   1060: lload #6
    //   1062: iconst_4
    //   1063: lushr
    //   1064: lstore #6
    //   1066: lload #6
    //   1068: lconst_0
    //   1069: lcmp
    //   1070: ifne -> 1043
    //   1073: bipush #64
    //   1075: iload #10
    //   1077: isub
    //   1078: newarray byte
    //   1080: astore_3
    //   1081: iconst_0
    //   1082: istore #14
    //   1084: iload #14
    //   1086: aload_3
    //   1087: arraylength
    //   1088: if_icmpge -> 1110
    //   1091: aload_3
    //   1092: iload #14
    //   1094: aload #9
    //   1096: iload #10
    //   1098: iload #14
    //   1100: iadd
    //   1101: baload
    //   1102: bastore
    //   1103: iinc #14, 1
    //   1106: iload_2
    //   1107: ifne -> 1084
    //   1110: aload_3
    //   1111: arraylength
    //   1112: bipush #10
    //   1114: if_icmplt -> 880
    //   1117: getstatic burp/Zg27.ZQ : Ljava/lang/Object;
    //   1120: checkcast java/math/BigInteger
    //   1123: invokevirtual toByteArray : ()[B
    //   1126: astore_3
    //   1127: new java/lang/StringBuilder
    //   1130: dup
    //   1131: invokespecial <init> : ()V
    //   1134: astore #5
    //   1136: aload #5
    //   1138: sipush #17865
    //   1141: sipush #30905
    //   1144: invokestatic a : (II)Ljava/lang/String;
    //   1147: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1150: pop
    //   1151: aload_3
    //   1152: astore #6
    //   1154: aload #6
    //   1156: arraylength
    //   1157: istore #7
    //   1159: iconst_0
    //   1160: istore #8
    //   1162: iload #8
    //   1164: iload #7
    //   1166: if_icmpge -> 1192
    //   1169: aload #6
    //   1171: iload #8
    //   1173: baload
    //   1174: istore #9
    //   1176: aload #5
    //   1178: iload #9
    //   1180: i2c
    //   1181: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1184: pop
    //   1185: iinc #8, 1
    //   1188: iload_2
    //   1189: ifne -> 1162
    //   1192: aload #5
    //   1194: sipush #17866
    //   1197: sipush #-10107
    //   1200: invokestatic a : (II)Ljava/lang/String;
    //   1203: ldc ''
    //   1205: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1208: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1211: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1214: pop
    //   1215: aload #5
    //   1217: sipush #17864
    //   1220: sipush #5046
    //   1223: invokestatic a : (II)Ljava/lang/String;
    //   1226: ldc ''
    //   1228: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1231: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1234: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1237: pop
    //   1238: aload #5
    //   1240: invokevirtual toString : ()Ljava/lang/String;
    //   1243: invokevirtual getBytes : ()[B
    //   1246: astore #4
    //   1248: aload #4
    //   1250: astore_3
    //   1251: aload_3
    //   1252: arraylength
    //   1253: bipush #8
    //   1255: iadd
    //   1256: bipush #6
    //   1258: ishr
    //   1259: iconst_1
    //   1260: iadd
    //   1261: bipush #16
    //   1263: imul
    //   1264: newarray int
    //   1266: astore #5
    //   1268: iconst_0
    //   1269: istore #6
    //   1271: iload #6
    //   1273: aload_3
    //   1274: arraylength
    //   1275: if_icmpge -> 1318
    //   1278: aload_3
    //   1279: iload #6
    //   1281: baload
    //   1282: sipush #255
    //   1285: iand
    //   1286: istore #7
    //   1288: aload #5
    //   1290: iload #6
    //   1292: iconst_2
    //   1293: ishr
    //   1294: dup2
    //   1295: iaload
    //   1296: iload #7
    //   1298: bipush #24
    //   1300: iload #6
    //   1302: iconst_4
    //   1303: irem
    //   1304: bipush #8
    //   1306: imul
    //   1307: isub
    //   1308: ishl
    //   1309: ior
    //   1310: iastore
    //   1311: iinc #6, 1
    //   1314: iload_2
    //   1315: ifne -> 1271
    //   1318: aload #5
    //   1320: iload #6
    //   1322: iconst_2
    //   1323: ishr
    //   1324: dup2
    //   1325: iaload
    //   1326: sipush #128
    //   1329: bipush #24
    //   1331: iload #6
    //   1333: iconst_4
    //   1334: irem
    //   1335: bipush #8
    //   1337: imul
    //   1338: isub
    //   1339: ishl
    //   1340: ior
    //   1341: iastore
    //   1342: aload #5
    //   1344: aload #5
    //   1346: arraylength
    //   1347: iconst_1
    //   1348: isub
    //   1349: aload_3
    //   1350: arraylength
    //   1351: bipush #8
    //   1353: imul
    //   1354: iastore
    //   1355: bipush #80
    //   1357: newarray int
    //   1359: astore #7
    //   1361: ldc 1732584193
    //   1363: istore #8
    //   1365: ldc -271733879
    //   1367: istore #9
    //   1369: ldc -1732584194
    //   1371: istore #10
    //   1373: ldc 271733878
    //   1375: istore #11
    //   1377: ldc -1009589776
    //   1379: istore #12
    //   1381: iconst_0
    //   1382: istore #6
    //   1384: iload #6
    //   1386: aload #5
    //   1388: arraylength
    //   1389: if_icmpge -> 1711
    //   1392: iload #8
    //   1394: istore #13
    //   1396: iload #9
    //   1398: istore #14
    //   1400: iload #10
    //   1402: istore #15
    //   1404: iload #11
    //   1406: istore #16
    //   1408: iload #12
    //   1410: istore #17
    //   1412: iconst_0
    //   1413: istore #18
    //   1415: iload #18
    //   1417: bipush #80
    //   1419: if_icmpge -> 1669
    //   1422: iload #18
    //   1424: bipush #16
    //   1426: if_icmpge -> 1453
    //   1429: aload #7
    //   1431: iload #18
    //   1433: aload #5
    //   1435: iload #6
    //   1437: iload #18
    //   1439: iadd
    //   1440: iaload
    //   1441: iastore
    //   1442: iload_2
    //   1443: ifne -> 1508
    //   1446: goto -> 1453
    //   1449: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1452: athrow
    //   1453: aload #7
    //   1455: iload #18
    //   1457: iconst_3
    //   1458: isub
    //   1459: iaload
    //   1460: aload #7
    //   1462: iload #18
    //   1464: bipush #8
    //   1466: isub
    //   1467: iaload
    //   1468: ixor
    //   1469: aload #7
    //   1471: iload #18
    //   1473: bipush #14
    //   1475: isub
    //   1476: iaload
    //   1477: ixor
    //   1478: aload #7
    //   1480: iload #18
    //   1482: bipush #16
    //   1484: isub
    //   1485: iaload
    //   1486: ixor
    //   1487: istore #19
    //   1489: iload #19
    //   1491: iconst_1
    //   1492: ishl
    //   1493: iload #19
    //   1495: bipush #31
    //   1497: iushr
    //   1498: ior
    //   1499: istore #20
    //   1501: aload #7
    //   1503: iload #18
    //   1505: iload #20
    //   1507: iastore
    //   1508: iload #8
    //   1510: iconst_5
    //   1511: ishl
    //   1512: iload #8
    //   1514: bipush #27
    //   1516: iushr
    //   1517: ior
    //   1518: istore #19
    //   1520: iload #19
    //   1522: iload #12
    //   1524: iadd
    //   1525: aload #7
    //   1527: iload #18
    //   1529: iaload
    //   1530: iadd
    //   1531: iload #18
    //   1533: bipush #20
    //   1535: if_icmpge -> 1561
    //   1538: ldc 1518500249
    //   1540: iload #9
    //   1542: iload #10
    //   1544: iand
    //   1545: iload #9
    //   1547: iconst_m1
    //   1548: ixor
    //   1549: iload #11
    //   1551: iand
    //   1552: ior
    //   1553: iadd
    //   1554: goto -> 1631
    //   1557: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1560: athrow
    //   1561: iload #18
    //   1563: bipush #40
    //   1565: if_icmpge -> 1586
    //   1568: ldc 1859775393
    //   1570: iload #9
    //   1572: iload #10
    //   1574: ixor
    //   1575: iload #11
    //   1577: ixor
    //   1578: iadd
    //   1579: goto -> 1631
    //   1582: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1585: athrow
    //   1586: iload #18
    //   1588: bipush #60
    //   1590: if_icmpge -> 1620
    //   1593: ldc -1894007588
    //   1595: iload #9
    //   1597: iload #10
    //   1599: iand
    //   1600: iload #9
    //   1602: iload #11
    //   1604: iand
    //   1605: ior
    //   1606: iload #10
    //   1608: iload #11
    //   1610: iand
    //   1611: ior
    //   1612: iadd
    //   1613: goto -> 1631
    //   1616: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1619: athrow
    //   1620: ldc -899497514
    //   1622: iload #9
    //   1624: iload #10
    //   1626: ixor
    //   1627: iload #11
    //   1629: ixor
    //   1630: iadd
    //   1631: iadd
    //   1632: istore #20
    //   1634: iload #11
    //   1636: istore #12
    //   1638: iload #10
    //   1640: istore #11
    //   1642: iload #9
    //   1644: bipush #30
    //   1646: ishl
    //   1647: iload #9
    //   1649: iconst_2
    //   1650: iushr
    //   1651: ior
    //   1652: istore #10
    //   1654: iload #8
    //   1656: istore #9
    //   1658: iload #20
    //   1660: istore #8
    //   1662: iinc #18, 1
    //   1665: iload_2
    //   1666: ifne -> 1415
    //   1669: iload #8
    //   1671: iload #13
    //   1673: iadd
    //   1674: istore #8
    //   1676: iload #9
    //   1678: iload #14
    //   1680: iadd
    //   1681: istore #9
    //   1683: iload #10
    //   1685: iload #15
    //   1687: iadd
    //   1688: istore #10
    //   1690: iload #11
    //   1692: iload #16
    //   1694: iadd
    //   1695: istore #11
    //   1697: iload #12
    //   1699: iload #17
    //   1701: iadd
    //   1702: istore #12
    //   1704: iinc #6, 16
    //   1707: iload_2
    //   1708: ifne -> 1384
    //   1711: iconst_5
    //   1712: newarray int
    //   1714: dup
    //   1715: iconst_0
    //   1716: iload #8
    //   1718: iastore
    //   1719: dup
    //   1720: iconst_1
    //   1721: iload #9
    //   1723: iastore
    //   1724: dup
    //   1725: iconst_2
    //   1726: iload #10
    //   1728: iastore
    //   1729: dup
    //   1730: iconst_3
    //   1731: iload #11
    //   1733: iastore
    //   1734: dup
    //   1735: iconst_4
    //   1736: iload #12
    //   1738: iastore
    //   1739: astore #13
    //   1741: bipush #20
    //   1743: newarray byte
    //   1745: astore #14
    //   1747: iconst_0
    //   1748: istore #15
    //   1750: iload #15
    //   1752: bipush #20
    //   1754: if_icmpge -> 1795
    //   1757: aload #13
    //   1759: iload #15
    //   1761: iconst_4
    //   1762: idiv
    //   1763: iaload
    //   1764: istore #16
    //   1766: iconst_3
    //   1767: iload #15
    //   1769: iconst_4
    //   1770: irem
    //   1771: isub
    //   1772: bipush #8
    //   1774: imul
    //   1775: istore #17
    //   1777: aload #14
    //   1779: iload #15
    //   1781: iload #16
    //   1783: iload #17
    //   1785: iushr
    //   1786: i2b
    //   1787: bastore
    //   1788: iinc #15, 1
    //   1791: iload_2
    //   1792: ifne -> 1750
    //   1795: aload #14
    //   1797: astore #4
    //   1799: sipush #17859
    //   1802: sipush #-10047
    //   1805: invokestatic a : (II)Ljava/lang/String;
    //   1808: iconst_1
    //   1809: ldc burp/Zewq
    //   1811: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1814: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1817: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1820: astore_3
    //   1821: aload_3
    //   1822: arraylength
    //   1823: istore #4
    //   1825: iconst_0
    //   1826: istore #5
    //   1828: iload #5
    //   1830: iload #4
    //   1832: if_icmpge -> 1969
    //   1835: aload_3
    //   1836: iload #5
    //   1838: aaload
    //   1839: astore #6
    //   1841: aload #6
    //   1843: invokevirtual getModifiers : ()I
    //   1846: invokestatic isStatic : (I)Z
    //   1849: ifne -> 1859
    //   1852: goto -> 1962
    //   1855: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1858: athrow
    //   1859: aload #6
    //   1861: invokevirtual getType : ()Ljava/lang/Class;
    //   1864: astore #7
    //   1866: aload #7
    //   1868: ifnull -> 1949
    //   1871: aload #7
    //   1873: invokevirtual isPrimitive : ()Z
    //   1876: ifne -> 1949
    //   1879: goto -> 1886
    //   1882: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1885: athrow
    //   1886: aload #7
    //   1888: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1891: ifnull -> 1949
    //   1894: goto -> 1901
    //   1897: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1900: athrow
    //   1901: aload #7
    //   1903: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1906: invokevirtual getName : ()Ljava/lang/String;
    //   1909: ifnull -> 1949
    //   1912: goto -> 1919
    //   1915: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1918: athrow
    //   1919: aload #7
    //   1921: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1924: invokevirtual getName : ()Ljava/lang/String;
    //   1927: sipush #17867
    //   1930: sipush #4016
    //   1933: invokestatic a : (II)Ljava/lang/String;
    //   1936: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1939: ifne -> 1949
    //   1942: goto -> 1949
    //   1945: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1948: athrow
    //   1949: aload #6
    //   1951: iconst_1
    //   1952: invokevirtual setAccessible : (Z)V
    //   1955: aload #6
    //   1957: aconst_null
    //   1958: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1961: pop
    //   1962: iinc #5, 1
    //   1965: iload_2
    //   1966: ifne -> 1828
    //   1969: sipush #17857
    //   1972: sipush #19087
    //   1975: invokestatic a : (II)Ljava/lang/String;
    //   1978: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1981: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1984: astore_3
    //   1985: aload_3
    //   1986: arraylength
    //   1987: istore #4
    //   1989: iconst_0
    //   1990: istore #5
    //   1992: iload #5
    //   1994: iload #4
    //   1996: if_icmpge -> 2107
    //   1999: aload_3
    //   2000: iload #5
    //   2002: aaload
    //   2003: astore #6
    //   2005: aload #6
    //   2007: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2010: pop
    //   2011: aload #6
    //   2013: invokevirtual getModifiers : ()I
    //   2016: invokestatic isStatic : (I)Z
    //   2019: ifeq -> 2093
    //   2022: aload #6
    //   2024: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2027: arraylength
    //   2028: iconst_2
    //   2029: if_icmpne -> 2093
    //   2032: goto -> 2039
    //   2035: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2038: athrow
    //   2039: aload #6
    //   2041: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2044: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2047: if_acmpne -> 2093
    //   2050: goto -> 2057
    //   2053: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2056: athrow
    //   2057: aload #6
    //   2059: iconst_1
    //   2060: invokevirtual setAccessible : (Z)V
    //   2063: aload #6
    //   2065: aconst_null
    //   2066: iconst_2
    //   2067: anewarray java/lang/Object
    //   2070: dup
    //   2071: iconst_0
    //   2072: aload_0
    //   2073: aastore
    //   2074: dup
    //   2075: iconst_1
    //   2076: aload_1
    //   2077: aastore
    //   2078: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2081: pop
    //   2082: iload_2
    //   2083: ifne -> 2107
    //   2086: goto -> 2093
    //   2089: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2092: athrow
    //   2093: iinc #5, 1
    //   2096: iload_2
    //   2097: ifne -> 1992
    //   2100: goto -> 2107
    //   2103: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2106: athrow
    //   2107: getstatic burp/Zkde.Zb : Ljava/lang/String;
    //   2110: getstatic burp/Zlfi.ZV : Ljava/lang/Object;
    //   2113: checkcast java/math/BigInteger
    //   2116: invokevirtual intValue : ()I
    //   2119: bipush #32
    //   2121: irem
    //   2122: invokestatic abs : (I)I
    //   2125: invokevirtual charAt : (I)C
    //   2128: getstatic burp/Zs9x.ZY : Ljava/lang/String;
    //   2131: getstatic burp/Zbu.ZW : Ljava/lang/Object;
    //   2134: checkcast java/math/BigInteger
    //   2137: invokevirtual intValue : ()I
    //   2140: bipush #32
    //   2142: irem
    //   2143: invokestatic abs : (I)I
    //   2146: invokevirtual charAt : (I)C
    //   2149: if_icmple -> 2256
    //   2152: getstatic burp/Zk5y.ZZ : Ljava/lang/String;
    //   2155: getstatic burp/Ze7y.Zh : Ljava/lang/Object;
    //   2158: checkcast java/math/BigInteger
    //   2161: invokevirtual intValue : ()I
    //   2164: bipush #32
    //   2166: irem
    //   2167: invokestatic abs : (I)I
    //   2170: invokevirtual charAt : (I)C
    //   2173: getstatic burp/Zd8.ZK : Ljava/lang/String;
    //   2176: getstatic burp/Ze6k.Zs : Ljava/lang/Object;
    //   2179: checkcast java/math/BigInteger
    //   2182: invokevirtual intValue : ()I
    //   2185: bipush #32
    //   2187: irem
    //   2188: invokestatic abs : (I)I
    //   2191: invokevirtual charAt : (I)C
    //   2194: if_icmple -> 2256
    //   2197: goto -> 2204
    //   2200: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2203: athrow
    //   2204: getstatic burp/Zty2.ZR : Ljava/lang/String;
    //   2207: getstatic burp/Ze3z.Zf : Ljava/lang/Object;
    //   2210: checkcast java/math/BigInteger
    //   2213: invokevirtual intValue : ()I
    //   2216: bipush #32
    //   2218: irem
    //   2219: invokestatic abs : (I)I
    //   2222: invokevirtual charAt : (I)C
    //   2225: getstatic burp/Zsmn.Zo : Ljava/lang/String;
    //   2228: getstatic burp/Zly7.Zt : Ljava/lang/Object;
    //   2231: checkcast java/math/BigInteger
    //   2234: invokevirtual intValue : ()I
    //   2237: bipush #32
    //   2239: irem
    //   2240: invokestatic abs : (I)I
    //   2243: invokevirtual charAt : (I)C
    //   2246: if_icmpgt -> 2264
    //   2249: goto -> 2256
    //   2252: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2255: athrow
    //   2256: iconst_1
    //   2257: goto -> 2265
    //   2260: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2263: athrow
    //   2264: iconst_0
    //   2265: ireturn
    //   2266: astore_3
    //   2267: new java/lang/Exception
    //   2270: dup
    //   2271: aload_3
    //   2272: invokevirtual getMessage : ()Ljava/lang/String;
    //   2275: invokespecial <init> : (Ljava/lang/String;)V
    //   2278: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2265	2266	java/lang/Throwable
    //   33	47	50	java/lang/Throwable
    //   40	61	64	java/lang/Throwable
    //   54	75	78	java/lang/Throwable
    //   68	89	92	java/lang/Throwable
    //   82	103	106	java/lang/Throwable
    //   96	117	120	java/lang/Throwable
    //   110	131	134	java/lang/Throwable
    //   124	145	148	java/lang/Throwable
    //   138	155	158	java/lang/Throwable
    //   194	208	211	java/lang/Throwable
    //   201	222	225	java/lang/Throwable
    //   215	236	239	java/lang/Throwable
    //   229	250	253	java/lang/Throwable
    //   243	264	267	java/lang/Throwable
    //   257	278	281	java/lang/Throwable
    //   271	292	295	java/lang/Throwable
    //   285	306	309	java/lang/Throwable
    //   299	323	326	java/lang/Throwable
    //   387	405	408	java/lang/Throwable
    //   396	421	424	java/lang/Throwable
    //   412	438	441	java/lang/Throwable
    //   428	454	457	java/lang/Throwable
    //   445	471	474	java/lang/Throwable
    //   461	487	490	java/lang/Throwable
    //   478	503	506	java/lang/Throwable
    //   494	526	529	java/lang/Throwable
    //   510	542	545	java/lang/Throwable
    //   533	558	561	java/lang/Throwable
    //   549	581	584	java/lang/Throwable
    //   565	597	600	java/lang/Throwable
    //   588	613	616	java/lang/Throwable
    //   604	632	635	java/lang/Throwable
    //   762	797	800	java/lang/Throwable
    //   804	845	848	java/lang/Throwable
    //   1422	1446	1449	java/lang/Throwable
    //   1520	1557	1557	java/lang/Throwable
    //   1561	1582	1582	java/lang/Throwable
    //   1586	1616	1616	java/lang/Throwable
    //   1841	1855	1855	java/lang/Throwable
    //   1866	1879	1882	java/lang/Throwable
    //   1871	1894	1897	java/lang/Throwable
    //   1886	1912	1915	java/lang/Throwable
    //   1901	1942	1945	java/lang/Throwable
    //   2005	2032	2035	java/lang/Throwable
    //   2022	2050	2053	java/lang/Throwable
    //   2039	2086	2089	java/lang/Throwable
    //   2057	2100	2103	java/lang/Throwable
    //   2107	2197	2200	java/lang/Throwable
    //   2152	2249	2252	java/lang/Throwable
    //   2204	2260	2260	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ntGK»%~YÇ >>|z6"d\\r©ü_ç§þ±·øz#ÃcF¢Q¿¯\\tèJøßQJ\\td~ED¿;=ì Æ«Â¨×éRFæÁ}Þý/%]±ux UÙÅ¥MÏ%g'6"u>þÃr\\ndV½Ø55ÝÂD3ï:G+ÏÞE«÷åTÅ¨q }2¤o&ìÁòÙtï|À5¼FÕ!ìÆ¤ô º!¡zÎn\\fåÔrA-2*»½{ÌP)[À`é¾\\tèzvX5M E`¢-Á®)ï·¼öÓVDäIÀ²lç@µrç,OÖµÝðE°rÐX:ó#jí'àÈfl0ôKqm1:u hu*'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #89
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
    //   67: ldc '29t1UE\\t@À:§GÖeu'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #35
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
    //   128: putstatic burp/Zsx6.a : [Ljava/lang/String;
    //   131: bipush #12
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zsx6.b : [Ljava/lang/String;
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
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 216, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: iconst_2
    //   213: goto -> 243
    //   216: bipush #67
    //   218: goto -> 243
    //   221: bipush #105
    //   223: goto -> 243
    //   226: bipush #59
    //   228: goto -> 243
    //   231: bipush #120
    //   233: goto -> 243
    //   236: bipush #38
    //   238: goto -> 243
    //   241: bipush #93
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
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: sipush #17858
    //   307: sipush #4212
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zsx6.ZN : Ljava/lang/Object;
    //   319: sipush #17870
    //   322: sipush #12556
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zsx6.ZJ : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x45CB) & 0xFFFF;
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
      byte b1 = 117;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsx6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */