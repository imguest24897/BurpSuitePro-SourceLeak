package burp;

import java.math.BigInteger;

class Zb3d extends ClassLoader {
  static String Zr;
  
  static Object Zw;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zq(Object paramObject) {
    Zz3b.Zi = a(-6295, 26436);
    Zz3b.Zu = new BigInteger(a(-6293, 8405));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zgis.Zh.charAt(Math.abs(((BigInteger)Zz7m.Zh).intValue() % 32)) > Zlf7.ZM.charAt(Math.abs(((BigInteger)Ze8j.ZQ).intValue() % 32))) {
          try {
            Zbf9.ZE(Class.forName(a(-6294, 5989)));
            if (!bool)
              Zxn4.ZD(Class.forName(a(-6291, -2868))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zxn4.ZD(Class.forName(a(-6291, -2868)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZK(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zsjw.Zw : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: aload_3
    //   15: arraylength
    //   16: iconst_2
    //   17: iadd
    //   18: newarray byte
    //   20: astore #5
    //   22: iconst_0
    //   23: istore #6
    //   25: iload #6
    //   27: aload_3
    //   28: arraylength
    //   29: if_icmpge -> 48
    //   32: aload #5
    //   34: iload #6
    //   36: aload_3
    //   37: iload #6
    //   39: baload
    //   40: bastore
    //   41: iinc #6, 1
    //   44: iload_2
    //   45: ifne -> 25
    //   48: aload #5
    //   50: arraylength
    //   51: iconst_3
    //   52: idiv
    //   53: iconst_4
    //   54: imul
    //   55: newarray byte
    //   57: astore #4
    //   59: iconst_0
    //   60: istore #6
    //   62: iconst_0
    //   63: istore #7
    //   65: iload #6
    //   67: aload_3
    //   68: arraylength
    //   69: if_icmpge -> 180
    //   72: aload #4
    //   74: iload #7
    //   76: aload #5
    //   78: iload #6
    //   80: baload
    //   81: iconst_2
    //   82: iushr
    //   83: bipush #63
    //   85: iand
    //   86: i2b
    //   87: bastore
    //   88: aload #4
    //   90: iload #7
    //   92: iconst_1
    //   93: iadd
    //   94: aload #5
    //   96: iload #6
    //   98: iconst_1
    //   99: iadd
    //   100: baload
    //   101: iconst_4
    //   102: iushr
    //   103: bipush #15
    //   105: iand
    //   106: aload #5
    //   108: iload #6
    //   110: baload
    //   111: iconst_4
    //   112: ishl
    //   113: bipush #63
    //   115: iand
    //   116: ior
    //   117: i2b
    //   118: bastore
    //   119: aload #4
    //   121: iload #7
    //   123: iconst_2
    //   124: iadd
    //   125: aload #5
    //   127: iload #6
    //   129: iconst_2
    //   130: iadd
    //   131: baload
    //   132: bipush #6
    //   134: iushr
    //   135: iconst_3
    //   136: iand
    //   137: aload #5
    //   139: iload #6
    //   141: iconst_1
    //   142: iadd
    //   143: baload
    //   144: iconst_2
    //   145: ishl
    //   146: bipush #63
    //   148: iand
    //   149: ior
    //   150: i2b
    //   151: bastore
    //   152: aload #4
    //   154: iload #7
    //   156: iconst_3
    //   157: iadd
    //   158: aload #5
    //   160: iload #6
    //   162: iconst_2
    //   163: iadd
    //   164: baload
    //   165: bipush #63
    //   167: iand
    //   168: i2b
    //   169: bastore
    //   170: iinc #6, 3
    //   173: iinc #7, 4
    //   176: iload_2
    //   177: ifne -> 65
    //   180: iconst_0
    //   181: istore #6
    //   183: iload #6
    //   185: aload #4
    //   187: arraylength
    //   188: if_icmpge -> 372
    //   191: aload #4
    //   193: iload #6
    //   195: baload
    //   196: bipush #26
    //   198: if_icmpge -> 226
    //   201: aload #4
    //   203: iload #6
    //   205: aload #4
    //   207: iload #6
    //   209: baload
    //   210: bipush #65
    //   212: iadd
    //   213: i2b
    //   214: bastore
    //   215: iload_2
    //   216: ifne -> 365
    //   219: goto -> 226
    //   222: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   225: athrow
    //   226: aload #4
    //   228: iload #6
    //   230: baload
    //   231: bipush #52
    //   233: if_icmpge -> 271
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   242: athrow
    //   243: aload #4
    //   245: iload #6
    //   247: aload #4
    //   249: iload #6
    //   251: baload
    //   252: bipush #97
    //   254: iadd
    //   255: bipush #26
    //   257: isub
    //   258: i2b
    //   259: bastore
    //   260: iload_2
    //   261: ifne -> 365
    //   264: goto -> 271
    //   267: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   270: athrow
    //   271: aload #4
    //   273: iload #6
    //   275: baload
    //   276: bipush #62
    //   278: if_icmpge -> 316
    //   281: goto -> 288
    //   284: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   287: athrow
    //   288: aload #4
    //   290: iload #6
    //   292: aload #4
    //   294: iload #6
    //   296: baload
    //   297: bipush #48
    //   299: iadd
    //   300: bipush #52
    //   302: isub
    //   303: i2b
    //   304: bastore
    //   305: iload_2
    //   306: ifne -> 365
    //   309: goto -> 316
    //   312: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   315: athrow
    //   316: aload #4
    //   318: iload #6
    //   320: baload
    //   321: bipush #63
    //   323: if_icmpge -> 351
    //   326: goto -> 333
    //   329: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   332: athrow
    //   333: aload #4
    //   335: iload #6
    //   337: bipush #43
    //   339: bastore
    //   340: iload_2
    //   341: ifne -> 365
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   350: athrow
    //   351: aload #4
    //   353: iload #6
    //   355: bipush #47
    //   357: bastore
    //   358: goto -> 365
    //   361: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   364: athrow
    //   365: iinc #6, 1
    //   368: iload_2
    //   369: ifne -> 183
    //   372: aload #4
    //   374: arraylength
    //   375: iconst_1
    //   376: isub
    //   377: istore #6
    //   379: iload #6
    //   381: aload_3
    //   382: arraylength
    //   383: iconst_4
    //   384: imul
    //   385: iconst_3
    //   386: idiv
    //   387: if_icmple -> 404
    //   390: aload #4
    //   392: iload #6
    //   394: bipush #61
    //   396: bastore
    //   397: iinc #6, -1
    //   400: iload_2
    //   401: ifne -> 379
    //   404: new java/math/BigInteger
    //   407: dup
    //   408: aload #4
    //   410: invokespecial <init> : ([B)V
    //   413: invokevirtual abs : ()Ljava/math/BigInteger;
    //   416: putstatic burp/Zg7e.Zr : Ljava/lang/Object;
    //   419: sipush #-6290
    //   422: sipush #-29865
    //   425: invokestatic a : (II)Ljava/lang/String;
    //   428: iconst_1
    //   429: ldc burp/Zsk2
    //   431: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   434: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   437: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   440: astore_3
    //   441: aload_3
    //   442: arraylength
    //   443: istore #4
    //   445: iconst_0
    //   446: istore #5
    //   448: iload #5
    //   450: iload #4
    //   452: if_icmpge -> 589
    //   455: aload_3
    //   456: iload #5
    //   458: aaload
    //   459: astore #6
    //   461: aload #6
    //   463: invokevirtual getModifiers : ()I
    //   466: invokestatic isStatic : (I)Z
    //   469: ifne -> 479
    //   472: goto -> 582
    //   475: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   478: athrow
    //   479: aload #6
    //   481: invokevirtual getType : ()Ljava/lang/Class;
    //   484: astore #7
    //   486: aload #7
    //   488: ifnull -> 569
    //   491: aload #7
    //   493: invokevirtual isPrimitive : ()Z
    //   496: ifne -> 569
    //   499: goto -> 506
    //   502: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   505: athrow
    //   506: aload #7
    //   508: invokevirtual getPackage : ()Ljava/lang/Package;
    //   511: ifnull -> 569
    //   514: goto -> 521
    //   517: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   520: athrow
    //   521: aload #7
    //   523: invokevirtual getPackage : ()Ljava/lang/Package;
    //   526: invokevirtual getName : ()Ljava/lang/String;
    //   529: ifnull -> 569
    //   532: goto -> 539
    //   535: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   538: athrow
    //   539: aload #7
    //   541: invokevirtual getPackage : ()Ljava/lang/Package;
    //   544: invokevirtual getName : ()Ljava/lang/String;
    //   547: sipush #-6300
    //   550: sipush #11520
    //   553: invokestatic a : (II)Ljava/lang/String;
    //   556: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   559: ifne -> 569
    //   562: goto -> 569
    //   565: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   568: athrow
    //   569: aload #6
    //   571: iconst_1
    //   572: invokevirtual setAccessible : (Z)V
    //   575: aload #6
    //   577: aconst_null
    //   578: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   581: pop
    //   582: iinc #5, 1
    //   585: iload_2
    //   586: ifne -> 448
    //   589: sipush #-6296
    //   592: sipush #29740
    //   595: invokestatic a : (II)Ljava/lang/String;
    //   598: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   601: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   604: astore_3
    //   605: aload_3
    //   606: arraylength
    //   607: istore #4
    //   609: iconst_0
    //   610: istore #5
    //   612: iload #5
    //   614: iload #4
    //   616: if_icmpge -> 748
    //   619: aload_3
    //   620: iload #5
    //   622: aaload
    //   623: astore #6
    //   625: aload #6
    //   627: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   630: pop
    //   631: aload #6
    //   633: invokevirtual getModifiers : ()I
    //   636: invokestatic isStatic : (I)Z
    //   639: ifeq -> 734
    //   642: aload #6
    //   644: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   647: arraylength
    //   648: iconst_2
    //   649: if_icmpne -> 734
    //   652: goto -> 659
    //   655: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   658: athrow
    //   659: aload #6
    //   661: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   664: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   667: invokevirtual equals : (Ljava/lang/Object;)Z
    //   670: ifeq -> 734
    //   673: goto -> 680
    //   676: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   679: athrow
    //   680: aload #6
    //   682: iconst_1
    //   683: invokevirtual setAccessible : (Z)V
    //   686: aload #6
    //   688: aconst_null
    //   689: iconst_2
    //   690: anewarray java/lang/Object
    //   693: dup
    //   694: iconst_0
    //   695: aload_0
    //   696: aastore
    //   697: dup
    //   698: iconst_1
    //   699: aload_1
    //   700: ifnonnull -> 718
    //   703: goto -> 710
    //   706: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   709: athrow
    //   710: aload_1
    //   711: goto -> 725
    //   714: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   717: athrow
    //   718: aload_1
    //   719: checkcast [B
    //   722: invokevirtual clone : ()Ljava/lang/Object;
    //   725: aastore
    //   726: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   729: pop
    //   730: iload_2
    //   731: ifne -> 748
    //   734: iinc #5, 1
    //   737: iload_2
    //   738: ifne -> 612
    //   741: goto -> 748
    //   744: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   747: athrow
    //   748: getstatic burp/Zx4u.Zn : Ljava/lang/Object;
    //   751: checkcast java/math/BigInteger
    //   754: invokevirtual toByteArray : ()[B
    //   757: astore_3
    //   758: iconst_0
    //   759: istore #5
    //   761: iconst_0
    //   762: istore #6
    //   764: iload #6
    //   766: aload_3
    //   767: arraylength
    //   768: if_icmpge -> 913
    //   771: aload_3
    //   772: iload #6
    //   774: baload
    //   775: istore #7
    //   777: iload #7
    //   779: bipush #48
    //   781: if_icmplt -> 798
    //   784: iload #7
    //   786: bipush #57
    //   788: if_icmple -> 896
    //   791: goto -> 798
    //   794: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   797: athrow
    //   798: iload #7
    //   800: bipush #65
    //   802: if_icmplt -> 826
    //   805: goto -> 812
    //   808: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   811: athrow
    //   812: iload #7
    //   814: bipush #90
    //   816: if_icmple -> 896
    //   819: goto -> 826
    //   822: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   825: athrow
    //   826: iload #7
    //   828: bipush #97
    //   830: if_icmplt -> 854
    //   833: goto -> 840
    //   836: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   839: athrow
    //   840: iload #7
    //   842: bipush #122
    //   844: if_icmple -> 896
    //   847: goto -> 854
    //   850: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   853: athrow
    //   854: iload #7
    //   856: bipush #43
    //   858: if_icmpeq -> 896
    //   861: goto -> 868
    //   864: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   867: athrow
    //   868: iload #7
    //   870: bipush #47
    //   872: if_icmpeq -> 896
    //   875: goto -> 882
    //   878: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   881: athrow
    //   882: iload #7
    //   884: bipush #61
    //   886: if_icmpne -> 906
    //   889: goto -> 896
    //   892: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   895: athrow
    //   896: iinc #5, 1
    //   899: goto -> 906
    //   902: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   905: athrow
    //   906: iinc #6, 1
    //   909: iload_2
    //   910: ifne -> 764
    //   913: iload #5
    //   915: newarray byte
    //   917: astore #6
    //   919: iconst_0
    //   920: istore #7
    //   922: iconst_0
    //   923: istore #8
    //   925: iload #8
    //   927: aload_3
    //   928: arraylength
    //   929: if_icmpge -> 1081
    //   932: aload_3
    //   933: iload #8
    //   935: baload
    //   936: istore #9
    //   938: iload #9
    //   940: bipush #48
    //   942: if_icmplt -> 959
    //   945: iload #9
    //   947: bipush #57
    //   949: if_icmple -> 1057
    //   952: goto -> 959
    //   955: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   958: athrow
    //   959: iload #9
    //   961: bipush #65
    //   963: if_icmplt -> 987
    //   966: goto -> 973
    //   969: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   972: athrow
    //   973: iload #9
    //   975: bipush #90
    //   977: if_icmple -> 1057
    //   980: goto -> 987
    //   983: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   986: athrow
    //   987: iload #9
    //   989: bipush #97
    //   991: if_icmplt -> 1015
    //   994: goto -> 1001
    //   997: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1000: athrow
    //   1001: iload #9
    //   1003: bipush #122
    //   1005: if_icmple -> 1057
    //   1008: goto -> 1015
    //   1011: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1014: athrow
    //   1015: iload #9
    //   1017: bipush #43
    //   1019: if_icmpeq -> 1057
    //   1022: goto -> 1029
    //   1025: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1028: athrow
    //   1029: iload #9
    //   1031: bipush #47
    //   1033: if_icmpeq -> 1057
    //   1036: goto -> 1043
    //   1039: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1042: athrow
    //   1043: iload #9
    //   1045: bipush #61
    //   1047: if_icmpne -> 1074
    //   1050: goto -> 1057
    //   1053: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1056: athrow
    //   1057: aload #6
    //   1059: iload #7
    //   1061: iload #9
    //   1063: bastore
    //   1064: iinc #7, 1
    //   1067: goto -> 1074
    //   1070: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1073: athrow
    //   1074: iinc #8, 1
    //   1077: iload_2
    //   1078: ifne -> 925
    //   1081: aload #6
    //   1083: astore #4
    //   1085: aload #4
    //   1087: astore_3
    //   1088: aload_3
    //   1089: arraylength
    //   1090: istore #5
    //   1092: aload_3
    //   1093: iload #5
    //   1095: iconst_1
    //   1096: isub
    //   1097: baload
    //   1098: bipush #61
    //   1100: if_icmpne -> 1110
    //   1103: iinc #5, -1
    //   1106: iload_2
    //   1107: ifne -> 1092
    //   1110: iload #5
    //   1112: aload_3
    //   1113: arraylength
    //   1114: iconst_4
    //   1115: idiv
    //   1116: isub
    //   1117: newarray byte
    //   1119: astore #6
    //   1121: iconst_0
    //   1122: istore #7
    //   1124: iload #7
    //   1126: aload_3
    //   1127: arraylength
    //   1128: if_icmpge -> 1390
    //   1131: aload_3
    //   1132: iload #7
    //   1134: baload
    //   1135: bipush #61
    //   1137: if_icmpne -> 1156
    //   1140: aload_3
    //   1141: iload #7
    //   1143: iconst_0
    //   1144: bastore
    //   1145: iload_2
    //   1146: ifne -> 1383
    //   1149: goto -> 1156
    //   1152: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1155: athrow
    //   1156: aload_3
    //   1157: iload #7
    //   1159: baload
    //   1160: bipush #47
    //   1162: if_icmpne -> 1189
    //   1165: goto -> 1172
    //   1168: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1171: athrow
    //   1172: aload_3
    //   1173: iload #7
    //   1175: bipush #63
    //   1177: bastore
    //   1178: iload_2
    //   1179: ifne -> 1383
    //   1182: goto -> 1189
    //   1185: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1188: athrow
    //   1189: aload_3
    //   1190: iload #7
    //   1192: baload
    //   1193: bipush #43
    //   1195: if_icmpne -> 1222
    //   1198: goto -> 1205
    //   1201: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1204: athrow
    //   1205: aload_3
    //   1206: iload #7
    //   1208: bipush #62
    //   1210: bastore
    //   1211: iload_2
    //   1212: ifne -> 1383
    //   1215: goto -> 1222
    //   1218: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1221: athrow
    //   1222: aload_3
    //   1223: iload #7
    //   1225: baload
    //   1226: bipush #48
    //   1228: if_icmplt -> 1277
    //   1231: goto -> 1238
    //   1234: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1237: athrow
    //   1238: aload_3
    //   1239: iload #7
    //   1241: baload
    //   1242: bipush #57
    //   1244: if_icmpgt -> 1277
    //   1247: goto -> 1254
    //   1250: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1253: athrow
    //   1254: aload_3
    //   1255: iload #7
    //   1257: aload_3
    //   1258: iload #7
    //   1260: baload
    //   1261: bipush #-4
    //   1263: isub
    //   1264: i2b
    //   1265: bastore
    //   1266: iload_2
    //   1267: ifne -> 1383
    //   1270: goto -> 1277
    //   1273: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1276: athrow
    //   1277: aload_3
    //   1278: iload #7
    //   1280: baload
    //   1281: bipush #97
    //   1283: if_icmplt -> 1332
    //   1286: goto -> 1293
    //   1289: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1292: athrow
    //   1293: aload_3
    //   1294: iload #7
    //   1296: baload
    //   1297: bipush #122
    //   1299: if_icmpgt -> 1332
    //   1302: goto -> 1309
    //   1305: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1308: athrow
    //   1309: aload_3
    //   1310: iload #7
    //   1312: aload_3
    //   1313: iload #7
    //   1315: baload
    //   1316: bipush #71
    //   1318: isub
    //   1319: i2b
    //   1320: bastore
    //   1321: iload_2
    //   1322: ifne -> 1383
    //   1325: goto -> 1332
    //   1328: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1331: athrow
    //   1332: aload_3
    //   1333: iload #7
    //   1335: baload
    //   1336: bipush #65
    //   1338: if_icmplt -> 1383
    //   1341: goto -> 1348
    //   1344: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1347: athrow
    //   1348: aload_3
    //   1349: iload #7
    //   1351: baload
    //   1352: bipush #90
    //   1354: if_icmpgt -> 1383
    //   1357: goto -> 1364
    //   1360: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1363: athrow
    //   1364: aload_3
    //   1365: iload #7
    //   1367: aload_3
    //   1368: iload #7
    //   1370: baload
    //   1371: bipush #65
    //   1373: isub
    //   1374: i2b
    //   1375: bastore
    //   1376: goto -> 1383
    //   1379: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1382: athrow
    //   1383: iinc #7, 1
    //   1386: iload_2
    //   1387: ifne -> 1124
    //   1390: iconst_0
    //   1391: istore #7
    //   1393: iconst_0
    //   1394: istore #8
    //   1396: iload #8
    //   1398: aload #6
    //   1400: arraylength
    //   1401: iconst_2
    //   1402: isub
    //   1403: if_icmpge -> 1506
    //   1406: aload #6
    //   1408: iload #8
    //   1410: aload_3
    //   1411: iload #7
    //   1413: baload
    //   1414: iconst_2
    //   1415: ishl
    //   1416: sipush #255
    //   1419: iand
    //   1420: aload_3
    //   1421: iload #7
    //   1423: iconst_1
    //   1424: iadd
    //   1425: baload
    //   1426: iconst_4
    //   1427: iushr
    //   1428: iconst_3
    //   1429: iand
    //   1430: ior
    //   1431: i2b
    //   1432: bastore
    //   1433: aload #6
    //   1435: iload #8
    //   1437: iconst_1
    //   1438: iadd
    //   1439: aload_3
    //   1440: iload #7
    //   1442: iconst_1
    //   1443: iadd
    //   1444: baload
    //   1445: iconst_4
    //   1446: ishl
    //   1447: sipush #255
    //   1450: iand
    //   1451: aload_3
    //   1452: iload #7
    //   1454: iconst_2
    //   1455: iadd
    //   1456: baload
    //   1457: iconst_2
    //   1458: iushr
    //   1459: bipush #15
    //   1461: iand
    //   1462: ior
    //   1463: i2b
    //   1464: bastore
    //   1465: aload #6
    //   1467: iload #8
    //   1469: iconst_2
    //   1470: iadd
    //   1471: aload_3
    //   1472: iload #7
    //   1474: iconst_2
    //   1475: iadd
    //   1476: baload
    //   1477: bipush #6
    //   1479: ishl
    //   1480: sipush #255
    //   1483: iand
    //   1484: aload_3
    //   1485: iload #7
    //   1487: iconst_3
    //   1488: iadd
    //   1489: baload
    //   1490: bipush #63
    //   1492: iand
    //   1493: ior
    //   1494: i2b
    //   1495: bastore
    //   1496: iinc #7, 4
    //   1499: iinc #8, 3
    //   1502: iload_2
    //   1503: ifne -> 1396
    //   1506: iload #8
    //   1508: aload #6
    //   1510: arraylength
    //   1511: if_icmpge -> 1548
    //   1514: aload #6
    //   1516: iload #8
    //   1518: aload_3
    //   1519: iload #7
    //   1521: baload
    //   1522: iconst_2
    //   1523: ishl
    //   1524: sipush #255
    //   1527: iand
    //   1528: aload_3
    //   1529: iload #7
    //   1531: iconst_1
    //   1532: iadd
    //   1533: baload
    //   1534: iconst_4
    //   1535: iushr
    //   1536: iconst_3
    //   1537: iand
    //   1538: ior
    //   1539: i2b
    //   1540: bastore
    //   1541: goto -> 1548
    //   1544: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1547: athrow
    //   1548: iinc #8, 1
    //   1551: iload #8
    //   1553: aload #6
    //   1555: arraylength
    //   1556: if_icmpge -> 1596
    //   1559: aload #6
    //   1561: iload #8
    //   1563: aload_3
    //   1564: iload #7
    //   1566: iconst_1
    //   1567: iadd
    //   1568: baload
    //   1569: iconst_4
    //   1570: ishl
    //   1571: sipush #255
    //   1574: iand
    //   1575: aload_3
    //   1576: iload #7
    //   1578: iconst_2
    //   1579: iadd
    //   1580: baload
    //   1581: iconst_2
    //   1582: iushr
    //   1583: bipush #15
    //   1585: iand
    //   1586: ior
    //   1587: i2b
    //   1588: bastore
    //   1589: goto -> 1596
    //   1592: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1595: athrow
    //   1596: aload #6
    //   1598: astore #4
    //   1600: getstatic burp/Zti7.Zc : Ljava/lang/String;
    //   1603: getstatic burp/Zkkl.ZE : Ljava/lang/Object;
    //   1606: checkcast java/math/BigInteger
    //   1609: invokevirtual intValue : ()I
    //   1612: bipush #32
    //   1614: irem
    //   1615: invokestatic abs : (I)I
    //   1618: invokevirtual charAt : (I)C
    //   1621: getstatic burp/Zbnk.Zg : Ljava/lang/String;
    //   1624: getstatic burp/Zsn9.Zg : Ljava/lang/Object;
    //   1627: checkcast java/math/BigInteger
    //   1630: invokevirtual intValue : ()I
    //   1633: bipush #32
    //   1635: irem
    //   1636: invokestatic abs : (I)I
    //   1639: invokevirtual charAt : (I)C
    //   1642: if_icmple -> 1749
    //   1645: getstatic burp/Zle9.Zm : Ljava/lang/String;
    //   1648: getstatic burp/Zek4.ZR : Ljava/lang/Object;
    //   1651: checkcast java/math/BigInteger
    //   1654: invokevirtual intValue : ()I
    //   1657: bipush #32
    //   1659: irem
    //   1660: invokestatic abs : (I)I
    //   1663: invokevirtual charAt : (I)C
    //   1666: getstatic burp/Zbze.ZK : Ljava/lang/String;
    //   1669: getstatic burp/Zrye.Zx : Ljava/lang/Object;
    //   1672: checkcast java/math/BigInteger
    //   1675: invokevirtual intValue : ()I
    //   1678: bipush #32
    //   1680: irem
    //   1681: invokestatic abs : (I)I
    //   1684: invokevirtual charAt : (I)C
    //   1687: if_icmpgt -> 1749
    //   1690: goto -> 1697
    //   1693: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1696: athrow
    //   1697: getstatic burp/Zmzj.Zb : Ljava/lang/String;
    //   1700: getstatic burp/Zr17.ZR : Ljava/lang/Object;
    //   1703: checkcast java/math/BigInteger
    //   1706: invokevirtual intValue : ()I
    //   1709: bipush #32
    //   1711: irem
    //   1712: invokestatic abs : (I)I
    //   1715: invokevirtual charAt : (I)C
    //   1718: getstatic burp/Zx4u.ZL : Ljava/lang/String;
    //   1721: getstatic burp/Zea9.Zt : Ljava/lang/Object;
    //   1724: checkcast java/math/BigInteger
    //   1727: invokevirtual intValue : ()I
    //   1730: bipush #32
    //   1732: irem
    //   1733: invokestatic abs : (I)I
    //   1736: invokevirtual charAt : (I)C
    //   1739: if_icmple -> 1757
    //   1742: goto -> 1749
    //   1745: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1748: athrow
    //   1749: iconst_1
    //   1750: goto -> 1758
    //   1753: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1756: athrow
    //   1757: iconst_0
    //   1758: ireturn
    //   1759: astore_3
    //   1760: new java/lang/Exception
    //   1763: dup
    //   1764: aload_3
    //   1765: invokevirtual getMessage : ()Ljava/lang/String;
    //   1768: invokespecial <init> : (Ljava/lang/String;)V
    //   1771: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1758	1759	java/lang/Throwable
    //   191	219	222	java/lang/Throwable
    //   201	236	239	java/lang/Throwable
    //   226	264	267	java/lang/Throwable
    //   243	281	284	java/lang/Throwable
    //   271	309	312	java/lang/Throwable
    //   288	326	329	java/lang/Throwable
    //   316	344	347	java/lang/Throwable
    //   333	358	361	java/lang/Throwable
    //   461	475	475	java/lang/Throwable
    //   486	499	502	java/lang/Throwable
    //   491	514	517	java/lang/Throwable
    //   506	532	535	java/lang/Throwable
    //   521	562	565	java/lang/Throwable
    //   625	652	655	java/lang/Throwable
    //   642	673	676	java/lang/Throwable
    //   659	703	706	java/lang/Throwable
    //   680	714	714	java/lang/Throwable
    //   725	741	744	java/lang/Throwable
    //   777	791	794	java/lang/Throwable
    //   784	805	808	java/lang/Throwable
    //   798	819	822	java/lang/Throwable
    //   812	833	836	java/lang/Throwable
    //   826	847	850	java/lang/Throwable
    //   840	861	864	java/lang/Throwable
    //   854	875	878	java/lang/Throwable
    //   868	889	892	java/lang/Throwable
    //   882	899	902	java/lang/Throwable
    //   938	952	955	java/lang/Throwable
    //   945	966	969	java/lang/Throwable
    //   959	980	983	java/lang/Throwable
    //   973	994	997	java/lang/Throwable
    //   987	1008	1011	java/lang/Throwable
    //   1001	1022	1025	java/lang/Throwable
    //   1015	1036	1039	java/lang/Throwable
    //   1029	1050	1053	java/lang/Throwable
    //   1043	1067	1070	java/lang/Throwable
    //   1131	1149	1152	java/lang/Throwable
    //   1140	1165	1168	java/lang/Throwable
    //   1156	1182	1185	java/lang/Throwable
    //   1172	1198	1201	java/lang/Throwable
    //   1189	1215	1218	java/lang/Throwable
    //   1205	1231	1234	java/lang/Throwable
    //   1222	1247	1250	java/lang/Throwable
    //   1238	1270	1273	java/lang/Throwable
    //   1254	1286	1289	java/lang/Throwable
    //   1277	1302	1305	java/lang/Throwable
    //   1293	1325	1328	java/lang/Throwable
    //   1309	1341	1344	java/lang/Throwable
    //   1332	1357	1360	java/lang/Throwable
    //   1348	1376	1379	java/lang/Throwable
    //   1506	1541	1544	java/lang/Throwable
    //   1548	1589	1592	java/lang/Throwable
    //   1600	1690	1693	java/lang/Throwable
    //   1645	1742	1745	java/lang/Throwable
    //   1697	1753	1753	java/lang/Throwable
  }
  
  static void Zx(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '$cøÿê»ê(^=épæw Á0Í³E¨^ÞYê³ :ýßD+Tà=û>ï;Jº%¦ÜO©h¥oÏ\~1~K¹0ä1¥+Z_z\\t0 \\t_//\\tøUã¸ÆÕß \\rÐ­lEÓÝß!üe©mûl\\tp¼ÃÆgkÃ**¤\\tÕuF¼rCÏ üÒÏþBÈö¡í¦Â¢°Éde\\by3%¾\\rR\\tè©»Ée;a¸'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #77
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #100
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
    //   68: ldc 'Þn«?ÒK@UW;KSDWûrGÍvû?\\r¦Zs·TÈîNòR¿\\r³5¥P.;êGíb}kû`ýÙÓÄ=\\bÚ¾§Â'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #76
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #103
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
    //   129: putstatic burp/Zb3d.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zb3d.b : [Ljava/lang/String;
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
    //   212: bipush #51
    //   214: goto -> 244
    //   217: bipush #55
    //   219: goto -> 244
    //   222: bipush #116
    //   224: goto -> 244
    //   227: bipush #89
    //   229: goto -> 244
    //   232: bipush #102
    //   234: goto -> 244
    //   237: bipush #93
    //   239: goto -> 244
    //   242: bipush #42
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
    //   300: sipush #-6289
    //   303: sipush #26147
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zb3d.Zr : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #-6292
    //   319: sipush #-21781
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zb3d.Zw : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE76C) & 0xFFFF;
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
      char c = '²';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb3d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */