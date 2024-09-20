package burp;

import java.math.BigInteger;

class Zg97 extends ClassLoader {
  static String ZX;
  
  static Object Zc;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zw(Object paramObject) {
    Zb9k.Za = a(-2803, 14469);
    Zb9k.Zi = new BigInteger(a(-2792, -31975));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zty5.Za.charAt(Math.abs(((BigInteger)Zs6g.Zq).intValue() % 32)) > Zl1u.ZO.charAt(Math.abs(((BigInteger)Zls_.ZR).intValue() % 32))) {
          try {
            Zs6g.ZN(Class.forName(a(-2785, 23109)));
            if (!bool)
              Zgyc.Zg(Class.forName(a(-2793, -20034))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgyc.Zg(Class.forName(a(-2793, -20034)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZW(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zs59.Zw : Ljava/lang/Object;
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
    //   416: putstatic burp/Ztes.ZX : Ljava/lang/Object;
    //   419: sipush #-2791
    //   422: getstatic burp/Zgdt.Zb : Ljava/lang/Object;
    //   425: checkcast java/math/BigInteger
    //   428: getstatic burp/Ztte.ZR : Ljava/lang/Object;
    //   431: checkcast java/math/BigInteger
    //   434: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   437: putstatic burp/Zr3x.Zb : Ljava/lang/Object;
    //   440: sipush #-13140
    //   443: invokestatic a : (II)Ljava/lang/String;
    //   446: iconst_1
    //   447: ldc burp/Zg2z
    //   449: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   452: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   455: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   458: astore_3
    //   459: aload_3
    //   460: arraylength
    //   461: istore #4
    //   463: iconst_0
    //   464: istore #5
    //   466: iload #5
    //   468: iload #4
    //   470: if_icmpge -> 607
    //   473: aload_3
    //   474: iload #5
    //   476: aaload
    //   477: astore #6
    //   479: aload #6
    //   481: invokevirtual getModifiers : ()I
    //   484: invokestatic isStatic : (I)Z
    //   487: ifne -> 497
    //   490: goto -> 600
    //   493: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   496: athrow
    //   497: aload #6
    //   499: invokevirtual getType : ()Ljava/lang/Class;
    //   502: astore #7
    //   504: aload #7
    //   506: ifnull -> 587
    //   509: aload #7
    //   511: invokevirtual isPrimitive : ()Z
    //   514: ifne -> 587
    //   517: goto -> 524
    //   520: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   523: athrow
    //   524: aload #7
    //   526: invokevirtual getPackage : ()Ljava/lang/Package;
    //   529: ifnull -> 587
    //   532: goto -> 539
    //   535: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   538: athrow
    //   539: aload #7
    //   541: invokevirtual getPackage : ()Ljava/lang/Package;
    //   544: invokevirtual getName : ()Ljava/lang/String;
    //   547: ifnull -> 587
    //   550: goto -> 557
    //   553: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   556: athrow
    //   557: aload #7
    //   559: invokevirtual getPackage : ()Ljava/lang/Package;
    //   562: invokevirtual getName : ()Ljava/lang/String;
    //   565: sipush #-2812
    //   568: sipush #-449
    //   571: invokestatic a : (II)Ljava/lang/String;
    //   574: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   577: ifne -> 587
    //   580: goto -> 587
    //   583: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   586: athrow
    //   587: aload #6
    //   589: iconst_1
    //   590: invokevirtual setAccessible : (Z)V
    //   593: aload #6
    //   595: aconst_null
    //   596: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   599: pop
    //   600: iinc #5, 1
    //   603: iload_2
    //   604: ifne -> 466
    //   607: sipush #-2811
    //   610: sipush #2067
    //   613: invokestatic a : (II)Ljava/lang/String;
    //   616: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   619: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   622: astore_3
    //   623: aload_3
    //   624: arraylength
    //   625: istore #4
    //   627: iconst_0
    //   628: istore #5
    //   630: iload #5
    //   632: iload #4
    //   634: if_icmpge -> 766
    //   637: aload_3
    //   638: iload #5
    //   640: aaload
    //   641: astore #6
    //   643: aload #6
    //   645: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   648: pop
    //   649: aload #6
    //   651: invokevirtual getModifiers : ()I
    //   654: invokestatic isStatic : (I)Z
    //   657: ifeq -> 752
    //   660: aload #6
    //   662: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   665: arraylength
    //   666: iconst_2
    //   667: if_icmpne -> 752
    //   670: goto -> 677
    //   673: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   676: athrow
    //   677: aload #6
    //   679: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   682: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   685: invokevirtual equals : (Ljava/lang/Object;)Z
    //   688: ifeq -> 752
    //   691: goto -> 698
    //   694: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   697: athrow
    //   698: aload #6
    //   700: iconst_1
    //   701: invokevirtual setAccessible : (Z)V
    //   704: aload #6
    //   706: aconst_null
    //   707: iconst_2
    //   708: anewarray java/lang/Object
    //   711: dup
    //   712: iconst_0
    //   713: aload_0
    //   714: aastore
    //   715: dup
    //   716: iconst_1
    //   717: aload_1
    //   718: ifnonnull -> 736
    //   721: goto -> 728
    //   724: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   727: athrow
    //   728: aload_1
    //   729: goto -> 743
    //   732: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   735: athrow
    //   736: aload_1
    //   737: checkcast [B
    //   740: invokevirtual clone : ()Ljava/lang/Object;
    //   743: aastore
    //   744: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   747: pop
    //   748: iload_2
    //   749: ifne -> 766
    //   752: iinc #5, 1
    //   755: iload_2
    //   756: ifne -> 630
    //   759: goto -> 766
    //   762: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   765: athrow
    //   766: iconst_0
    //   767: istore_3
    //   768: getstatic burp/Zs_.ZC : Ljava/lang/String;
    //   771: getstatic burp/Zxsb.ZN : Ljava/lang/Object;
    //   774: checkcast java/math/BigInteger
    //   777: invokevirtual intValue : ()I
    //   780: bipush #32
    //   782: irem
    //   783: invokestatic abs : (I)I
    //   786: invokevirtual charAt : (I)C
    //   789: getstatic burp/Zr3x.ZM : Ljava/lang/String;
    //   792: getstatic burp/Zz9p.Zw : Ljava/lang/Object;
    //   795: checkcast java/math/BigInteger
    //   798: invokevirtual intValue : ()I
    //   801: bipush #32
    //   803: irem
    //   804: invokestatic abs : (I)I
    //   807: invokevirtual charAt : (I)C
    //   810: if_icmpgt -> 1154
    //   813: sipush #-2798
    //   816: sipush #10265
    //   819: invokestatic a : (II)Ljava/lang/String;
    //   822: iconst_1
    //   823: ldc burp/Zb14
    //   825: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   828: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   831: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   834: astore #4
    //   836: aload #4
    //   838: arraylength
    //   839: istore #5
    //   841: iconst_0
    //   842: istore #6
    //   844: iload #6
    //   846: iload #5
    //   848: if_icmpge -> 986
    //   851: aload #4
    //   853: iload #6
    //   855: aaload
    //   856: astore #7
    //   858: aload #7
    //   860: invokevirtual getModifiers : ()I
    //   863: invokestatic isStatic : (I)Z
    //   866: ifne -> 876
    //   869: goto -> 979
    //   872: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   875: athrow
    //   876: aload #7
    //   878: invokevirtual getType : ()Ljava/lang/Class;
    //   881: astore #8
    //   883: aload #8
    //   885: ifnull -> 966
    //   888: aload #8
    //   890: invokevirtual isPrimitive : ()Z
    //   893: ifne -> 966
    //   896: goto -> 903
    //   899: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   902: athrow
    //   903: aload #8
    //   905: invokevirtual getPackage : ()Ljava/lang/Package;
    //   908: ifnull -> 966
    //   911: goto -> 918
    //   914: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   917: athrow
    //   918: aload #8
    //   920: invokevirtual getPackage : ()Ljava/lang/Package;
    //   923: invokevirtual getName : ()Ljava/lang/String;
    //   926: ifnull -> 966
    //   929: goto -> 936
    //   932: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   935: athrow
    //   936: aload #8
    //   938: invokevirtual getPackage : ()Ljava/lang/Package;
    //   941: invokevirtual getName : ()Ljava/lang/String;
    //   944: sipush #-2787
    //   947: sipush #-26289
    //   950: invokestatic a : (II)Ljava/lang/String;
    //   953: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   956: ifne -> 966
    //   959: goto -> 966
    //   962: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   965: athrow
    //   966: aload #7
    //   968: iconst_1
    //   969: invokevirtual setAccessible : (Z)V
    //   972: aload #7
    //   974: aconst_null
    //   975: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   978: pop
    //   979: iinc #6, 1
    //   982: iload_2
    //   983: ifne -> 844
    //   986: sipush #-2794
    //   989: sipush #17647
    //   992: invokestatic a : (II)Ljava/lang/String;
    //   995: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   998: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1001: astore #4
    //   1003: aload #4
    //   1005: arraylength
    //   1006: istore #5
    //   1008: iconst_0
    //   1009: istore #6
    //   1011: iload #6
    //   1013: iload #5
    //   1015: if_icmpge -> 1151
    //   1018: aload #4
    //   1020: iload #6
    //   1022: aaload
    //   1023: astore #7
    //   1025: aload #7
    //   1027: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1030: pop
    //   1031: aload #7
    //   1033: invokevirtual getModifiers : ()I
    //   1036: invokestatic isStatic : (I)Z
    //   1039: ifeq -> 1137
    //   1042: aload #7
    //   1044: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1047: arraylength
    //   1048: iconst_2
    //   1049: if_icmpne -> 1137
    //   1052: goto -> 1059
    //   1055: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1058: athrow
    //   1059: aload #7
    //   1061: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1064: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1067: if_acmpne -> 1137
    //   1070: goto -> 1077
    //   1073: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1076: athrow
    //   1077: aload #7
    //   1079: iconst_1
    //   1080: invokevirtual setAccessible : (Z)V
    //   1083: aload #7
    //   1085: aconst_null
    //   1086: iconst_2
    //   1087: anewarray java/lang/Object
    //   1090: dup
    //   1091: iconst_0
    //   1092: aload_0
    //   1093: aastore
    //   1094: dup
    //   1095: iconst_1
    //   1096: aload_1
    //   1097: ifnonnull -> 1115
    //   1100: goto -> 1107
    //   1103: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1106: athrow
    //   1107: aload_1
    //   1108: goto -> 1122
    //   1111: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1114: athrow
    //   1115: aload_1
    //   1116: checkcast [B
    //   1119: invokevirtual clone : ()Ljava/lang/Object;
    //   1122: aastore
    //   1123: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1126: checkcast java/lang/Boolean
    //   1129: invokevirtual booleanValue : ()Z
    //   1132: istore_3
    //   1133: iload_2
    //   1134: ifne -> 1151
    //   1137: iinc #6, 1
    //   1140: iload_2
    //   1141: ifne -> 1011
    //   1144: goto -> 1151
    //   1147: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1150: athrow
    //   1151: goto -> 1492
    //   1154: sipush #-2799
    //   1157: sipush #6175
    //   1160: invokestatic a : (II)Ljava/lang/String;
    //   1163: iconst_1
    //   1164: ldc burp/Ztuj
    //   1166: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1169: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1172: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1175: astore #4
    //   1177: aload #4
    //   1179: arraylength
    //   1180: istore #5
    //   1182: iconst_0
    //   1183: istore #6
    //   1185: iload #6
    //   1187: iload #5
    //   1189: if_icmpge -> 1327
    //   1192: aload #4
    //   1194: iload #6
    //   1196: aaload
    //   1197: astore #7
    //   1199: aload #7
    //   1201: invokevirtual getModifiers : ()I
    //   1204: invokestatic isStatic : (I)Z
    //   1207: ifne -> 1217
    //   1210: goto -> 1320
    //   1213: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1216: athrow
    //   1217: aload #7
    //   1219: invokevirtual getType : ()Ljava/lang/Class;
    //   1222: astore #8
    //   1224: aload #8
    //   1226: ifnull -> 1307
    //   1229: aload #8
    //   1231: invokevirtual isPrimitive : ()Z
    //   1234: ifne -> 1307
    //   1237: goto -> 1244
    //   1240: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1243: athrow
    //   1244: aload #8
    //   1246: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1249: ifnull -> 1307
    //   1252: goto -> 1259
    //   1255: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1258: athrow
    //   1259: aload #8
    //   1261: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1264: invokevirtual getName : ()Ljava/lang/String;
    //   1267: ifnull -> 1307
    //   1270: goto -> 1277
    //   1273: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1276: athrow
    //   1277: aload #8
    //   1279: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1282: invokevirtual getName : ()Ljava/lang/String;
    //   1285: sipush #-2787
    //   1288: sipush #-26289
    //   1291: invokestatic a : (II)Ljava/lang/String;
    //   1294: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1297: ifne -> 1307
    //   1300: goto -> 1307
    //   1303: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1306: athrow
    //   1307: aload #7
    //   1309: iconst_1
    //   1310: invokevirtual setAccessible : (Z)V
    //   1313: aload #7
    //   1315: aconst_null
    //   1316: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1319: pop
    //   1320: iinc #6, 1
    //   1323: iload_2
    //   1324: ifne -> 1185
    //   1327: sipush #-2789
    //   1330: sipush #-7275
    //   1333: invokestatic a : (II)Ljava/lang/String;
    //   1336: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1339: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1342: astore #4
    //   1344: aload #4
    //   1346: arraylength
    //   1347: istore #5
    //   1349: iconst_0
    //   1350: istore #6
    //   1352: iload #6
    //   1354: iload #5
    //   1356: if_icmpge -> 1492
    //   1359: aload #4
    //   1361: iload #6
    //   1363: aaload
    //   1364: astore #7
    //   1366: aload #7
    //   1368: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1371: pop
    //   1372: aload #7
    //   1374: invokevirtual getModifiers : ()I
    //   1377: invokestatic isStatic : (I)Z
    //   1380: ifeq -> 1478
    //   1383: aload #7
    //   1385: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1388: arraylength
    //   1389: iconst_2
    //   1390: if_icmpne -> 1478
    //   1393: goto -> 1400
    //   1396: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1399: athrow
    //   1400: aload #7
    //   1402: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1405: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1408: if_acmpne -> 1478
    //   1411: goto -> 1418
    //   1414: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1417: athrow
    //   1418: aload #7
    //   1420: iconst_1
    //   1421: invokevirtual setAccessible : (Z)V
    //   1424: aload #7
    //   1426: aconst_null
    //   1427: iconst_2
    //   1428: anewarray java/lang/Object
    //   1431: dup
    //   1432: iconst_0
    //   1433: aload_0
    //   1434: aastore
    //   1435: dup
    //   1436: iconst_1
    //   1437: aload_1
    //   1438: ifnonnull -> 1456
    //   1441: goto -> 1448
    //   1444: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1447: athrow
    //   1448: aload_1
    //   1449: goto -> 1463
    //   1452: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1455: athrow
    //   1456: aload_1
    //   1457: checkcast [B
    //   1460: invokevirtual clone : ()Ljava/lang/Object;
    //   1463: aastore
    //   1464: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1467: checkcast java/lang/Boolean
    //   1470: invokevirtual booleanValue : ()Z
    //   1473: istore_3
    //   1474: iload_2
    //   1475: ifne -> 1492
    //   1478: iinc #6, 1
    //   1481: iload_2
    //   1482: ifne -> 1352
    //   1485: goto -> 1492
    //   1488: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1491: athrow
    //   1492: iload_3
    //   1493: ifeq -> 1498
    //   1496: iload_3
    //   1497: ireturn
    //   1498: getstatic burp/Zewo.ZM : Ljava/lang/String;
    //   1501: getstatic burp/Zxyq.ZQ : Ljava/lang/Object;
    //   1504: checkcast java/math/BigInteger
    //   1507: invokevirtual intValue : ()I
    //   1510: bipush #32
    //   1512: irem
    //   1513: invokestatic abs : (I)I
    //   1516: invokevirtual charAt : (I)C
    //   1519: getstatic burp/Zezz.Zi : Ljava/lang/String;
    //   1522: getstatic burp/Zgwq.Ze : Ljava/lang/Object;
    //   1525: checkcast java/math/BigInteger
    //   1528: invokevirtual intValue : ()I
    //   1531: bipush #32
    //   1533: irem
    //   1534: invokestatic abs : (I)I
    //   1537: invokevirtual charAt : (I)C
    //   1540: if_icmple -> 1885
    //   1543: sipush #-2788
    //   1546: sipush #30776
    //   1549: invokestatic a : (II)Ljava/lang/String;
    //   1552: iconst_1
    //   1553: ldc burp/Zle6
    //   1555: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1558: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1561: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1564: astore #4
    //   1566: aload #4
    //   1568: arraylength
    //   1569: istore #5
    //   1571: iconst_0
    //   1572: istore #6
    //   1574: iload #6
    //   1576: iload #5
    //   1578: if_icmpge -> 1716
    //   1581: aload #4
    //   1583: iload #6
    //   1585: aaload
    //   1586: astore #7
    //   1588: aload #7
    //   1590: invokevirtual getModifiers : ()I
    //   1593: invokestatic isStatic : (I)Z
    //   1596: ifne -> 1606
    //   1599: goto -> 1709
    //   1602: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1605: athrow
    //   1606: aload #7
    //   1608: invokevirtual getType : ()Ljava/lang/Class;
    //   1611: astore #8
    //   1613: aload #8
    //   1615: ifnull -> 1696
    //   1618: aload #8
    //   1620: invokevirtual isPrimitive : ()Z
    //   1623: ifne -> 1696
    //   1626: goto -> 1633
    //   1629: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1632: athrow
    //   1633: aload #8
    //   1635: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1638: ifnull -> 1696
    //   1641: goto -> 1648
    //   1644: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1647: athrow
    //   1648: aload #8
    //   1650: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1653: invokevirtual getName : ()Ljava/lang/String;
    //   1656: ifnull -> 1696
    //   1659: goto -> 1666
    //   1662: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1665: athrow
    //   1666: aload #8
    //   1668: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1671: invokevirtual getName : ()Ljava/lang/String;
    //   1674: sipush #-2787
    //   1677: sipush #-26289
    //   1680: invokestatic a : (II)Ljava/lang/String;
    //   1683: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1686: ifne -> 1696
    //   1689: goto -> 1696
    //   1692: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1695: athrow
    //   1696: aload #7
    //   1698: iconst_1
    //   1699: invokevirtual setAccessible : (Z)V
    //   1702: aload #7
    //   1704: aconst_null
    //   1705: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1708: pop
    //   1709: iinc #6, 1
    //   1712: iload_2
    //   1713: ifne -> 1574
    //   1716: sipush #-2790
    //   1719: sipush #6337
    //   1722: invokestatic a : (II)Ljava/lang/String;
    //   1725: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1728: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1731: astore #4
    //   1733: aload #4
    //   1735: arraylength
    //   1736: istore #5
    //   1738: iconst_0
    //   1739: istore #6
    //   1741: iload #6
    //   1743: iload #5
    //   1745: if_icmpge -> 1881
    //   1748: aload #4
    //   1750: iload #6
    //   1752: aaload
    //   1753: astore #7
    //   1755: aload #7
    //   1757: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1760: pop
    //   1761: aload #7
    //   1763: invokevirtual getModifiers : ()I
    //   1766: invokestatic isStatic : (I)Z
    //   1769: ifeq -> 1867
    //   1772: aload #7
    //   1774: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1777: arraylength
    //   1778: iconst_2
    //   1779: if_icmpne -> 1867
    //   1782: goto -> 1789
    //   1785: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1788: athrow
    //   1789: aload #7
    //   1791: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1794: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1797: if_acmpne -> 1867
    //   1800: goto -> 1807
    //   1803: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1806: athrow
    //   1807: aload #7
    //   1809: iconst_1
    //   1810: invokevirtual setAccessible : (Z)V
    //   1813: aload #7
    //   1815: aconst_null
    //   1816: iconst_2
    //   1817: anewarray java/lang/Object
    //   1820: dup
    //   1821: iconst_0
    //   1822: aload_0
    //   1823: aastore
    //   1824: dup
    //   1825: iconst_1
    //   1826: aload_1
    //   1827: ifnonnull -> 1845
    //   1830: goto -> 1837
    //   1833: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1836: athrow
    //   1837: aload_1
    //   1838: goto -> 1852
    //   1841: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1844: athrow
    //   1845: aload_1
    //   1846: checkcast [B
    //   1849: invokevirtual clone : ()Ljava/lang/Object;
    //   1852: aastore
    //   1853: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1856: checkcast java/lang/Boolean
    //   1859: invokevirtual booleanValue : ()Z
    //   1862: istore_3
    //   1863: iload_2
    //   1864: ifne -> 1881
    //   1867: iinc #6, 1
    //   1870: iload_2
    //   1871: ifne -> 1741
    //   1874: goto -> 1881
    //   1877: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1880: athrow
    //   1881: iload_2
    //   1882: ifne -> 2223
    //   1885: sipush #-2816
    //   1888: sipush #-6533
    //   1891: invokestatic a : (II)Ljava/lang/String;
    //   1894: iconst_1
    //   1895: ldc burp/Zlh2
    //   1897: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1900: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1903: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1906: astore #4
    //   1908: aload #4
    //   1910: arraylength
    //   1911: istore #5
    //   1913: iconst_0
    //   1914: istore #6
    //   1916: iload #6
    //   1918: iload #5
    //   1920: if_icmpge -> 2058
    //   1923: aload #4
    //   1925: iload #6
    //   1927: aaload
    //   1928: astore #7
    //   1930: aload #7
    //   1932: invokevirtual getModifiers : ()I
    //   1935: invokestatic isStatic : (I)Z
    //   1938: ifne -> 1948
    //   1941: goto -> 2051
    //   1944: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1947: athrow
    //   1948: aload #7
    //   1950: invokevirtual getType : ()Ljava/lang/Class;
    //   1953: astore #8
    //   1955: aload #8
    //   1957: ifnull -> 2038
    //   1960: aload #8
    //   1962: invokevirtual isPrimitive : ()Z
    //   1965: ifne -> 2038
    //   1968: goto -> 1975
    //   1971: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1974: athrow
    //   1975: aload #8
    //   1977: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1980: ifnull -> 2038
    //   1983: goto -> 1990
    //   1986: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1989: athrow
    //   1990: aload #8
    //   1992: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1995: invokevirtual getName : ()Ljava/lang/String;
    //   1998: ifnull -> 2038
    //   2001: goto -> 2008
    //   2004: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2007: athrow
    //   2008: aload #8
    //   2010: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2013: invokevirtual getName : ()Ljava/lang/String;
    //   2016: sipush #-2787
    //   2019: sipush #-26289
    //   2022: invokestatic a : (II)Ljava/lang/String;
    //   2025: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2028: ifne -> 2038
    //   2031: goto -> 2038
    //   2034: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2037: athrow
    //   2038: aload #7
    //   2040: iconst_1
    //   2041: invokevirtual setAccessible : (Z)V
    //   2044: aload #7
    //   2046: aconst_null
    //   2047: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2050: pop
    //   2051: iinc #6, 1
    //   2054: iload_2
    //   2055: ifne -> 1916
    //   2058: sipush #-2813
    //   2061: sipush #6327
    //   2064: invokestatic a : (II)Ljava/lang/String;
    //   2067: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2070: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2073: astore #4
    //   2075: aload #4
    //   2077: arraylength
    //   2078: istore #5
    //   2080: iconst_0
    //   2081: istore #6
    //   2083: iload #6
    //   2085: iload #5
    //   2087: if_icmpge -> 2223
    //   2090: aload #4
    //   2092: iload #6
    //   2094: aaload
    //   2095: astore #7
    //   2097: aload #7
    //   2099: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2102: pop
    //   2103: aload #7
    //   2105: invokevirtual getModifiers : ()I
    //   2108: invokestatic isStatic : (I)Z
    //   2111: ifeq -> 2209
    //   2114: aload #7
    //   2116: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2119: arraylength
    //   2120: iconst_2
    //   2121: if_icmpne -> 2209
    //   2124: goto -> 2131
    //   2127: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2130: athrow
    //   2131: aload #7
    //   2133: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2136: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2139: if_acmpne -> 2209
    //   2142: goto -> 2149
    //   2145: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2148: athrow
    //   2149: aload #7
    //   2151: iconst_1
    //   2152: invokevirtual setAccessible : (Z)V
    //   2155: aload #7
    //   2157: aconst_null
    //   2158: iconst_2
    //   2159: anewarray java/lang/Object
    //   2162: dup
    //   2163: iconst_0
    //   2164: aload_0
    //   2165: aastore
    //   2166: dup
    //   2167: iconst_1
    //   2168: aload_1
    //   2169: ifnonnull -> 2187
    //   2172: goto -> 2179
    //   2175: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2178: athrow
    //   2179: aload_1
    //   2180: goto -> 2194
    //   2183: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2186: athrow
    //   2187: aload_1
    //   2188: checkcast [B
    //   2191: invokevirtual clone : ()Ljava/lang/Object;
    //   2194: aastore
    //   2195: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2198: checkcast java/lang/Boolean
    //   2201: invokevirtual booleanValue : ()Z
    //   2204: istore_3
    //   2205: iload_2
    //   2206: ifne -> 2223
    //   2209: iinc #6, 1
    //   2212: iload_2
    //   2213: ifne -> 2083
    //   2216: goto -> 2223
    //   2219: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2222: athrow
    //   2223: iload_3
    //   2224: ifeq -> 2229
    //   2227: iload_3
    //   2228: ireturn
    //   2229: getstatic burp/Zs59.Zc : Ljava/lang/String;
    //   2232: getstatic burp/Zr_k.Zx : Ljava/lang/Object;
    //   2235: checkcast java/math/BigInteger
    //   2238: invokevirtual intValue : ()I
    //   2241: bipush #32
    //   2243: irem
    //   2244: invokestatic abs : (I)I
    //   2247: invokevirtual charAt : (I)C
    //   2250: getstatic burp/Zzy5.ZD : Ljava/lang/String;
    //   2253: getstatic burp/Zxd0.Za : Ljava/lang/Object;
    //   2256: checkcast java/math/BigInteger
    //   2259: invokevirtual intValue : ()I
    //   2262: bipush #32
    //   2264: irem
    //   2265: invokestatic abs : (I)I
    //   2268: invokevirtual charAt : (I)C
    //   2271: if_icmpgt -> 2616
    //   2274: sipush #-2810
    //   2277: sipush #12538
    //   2280: invokestatic a : (II)Ljava/lang/String;
    //   2283: iconst_1
    //   2284: ldc burp/Zzna
    //   2286: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2289: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2292: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2295: astore #4
    //   2297: aload #4
    //   2299: arraylength
    //   2300: istore #5
    //   2302: iconst_0
    //   2303: istore #6
    //   2305: iload #6
    //   2307: iload #5
    //   2309: if_icmpge -> 2447
    //   2312: aload #4
    //   2314: iload #6
    //   2316: aaload
    //   2317: astore #7
    //   2319: aload #7
    //   2321: invokevirtual getModifiers : ()I
    //   2324: invokestatic isStatic : (I)Z
    //   2327: ifne -> 2337
    //   2330: goto -> 2440
    //   2333: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2336: athrow
    //   2337: aload #7
    //   2339: invokevirtual getType : ()Ljava/lang/Class;
    //   2342: astore #8
    //   2344: aload #8
    //   2346: ifnull -> 2427
    //   2349: aload #8
    //   2351: invokevirtual isPrimitive : ()Z
    //   2354: ifne -> 2427
    //   2357: goto -> 2364
    //   2360: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2363: athrow
    //   2364: aload #8
    //   2366: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2369: ifnull -> 2427
    //   2372: goto -> 2379
    //   2375: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2378: athrow
    //   2379: aload #8
    //   2381: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2384: invokevirtual getName : ()Ljava/lang/String;
    //   2387: ifnull -> 2427
    //   2390: goto -> 2397
    //   2393: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2396: athrow
    //   2397: aload #8
    //   2399: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2402: invokevirtual getName : ()Ljava/lang/String;
    //   2405: sipush #-2787
    //   2408: sipush #-26289
    //   2411: invokestatic a : (II)Ljava/lang/String;
    //   2414: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2417: ifne -> 2427
    //   2420: goto -> 2427
    //   2423: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2426: athrow
    //   2427: aload #7
    //   2429: iconst_1
    //   2430: invokevirtual setAccessible : (Z)V
    //   2433: aload #7
    //   2435: aconst_null
    //   2436: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2439: pop
    //   2440: iinc #6, 1
    //   2443: iload_2
    //   2444: ifne -> 2305
    //   2447: sipush #-2795
    //   2450: sipush #24035
    //   2453: invokestatic a : (II)Ljava/lang/String;
    //   2456: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2459: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2462: astore #4
    //   2464: aload #4
    //   2466: arraylength
    //   2467: istore #5
    //   2469: iconst_0
    //   2470: istore #6
    //   2472: iload #6
    //   2474: iload #5
    //   2476: if_icmpge -> 2612
    //   2479: aload #4
    //   2481: iload #6
    //   2483: aaload
    //   2484: astore #7
    //   2486: aload #7
    //   2488: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2491: pop
    //   2492: aload #7
    //   2494: invokevirtual getModifiers : ()I
    //   2497: invokestatic isStatic : (I)Z
    //   2500: ifeq -> 2598
    //   2503: aload #7
    //   2505: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2508: arraylength
    //   2509: iconst_2
    //   2510: if_icmpne -> 2598
    //   2513: goto -> 2520
    //   2516: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2519: athrow
    //   2520: aload #7
    //   2522: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2525: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2528: if_acmpne -> 2598
    //   2531: goto -> 2538
    //   2534: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2537: athrow
    //   2538: aload #7
    //   2540: iconst_1
    //   2541: invokevirtual setAccessible : (Z)V
    //   2544: aload #7
    //   2546: aconst_null
    //   2547: iconst_2
    //   2548: anewarray java/lang/Object
    //   2551: dup
    //   2552: iconst_0
    //   2553: aload_0
    //   2554: aastore
    //   2555: dup
    //   2556: iconst_1
    //   2557: aload_1
    //   2558: ifnonnull -> 2576
    //   2561: goto -> 2568
    //   2564: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2567: athrow
    //   2568: aload_1
    //   2569: goto -> 2583
    //   2572: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2575: athrow
    //   2576: aload_1
    //   2577: checkcast [B
    //   2580: invokevirtual clone : ()Ljava/lang/Object;
    //   2583: aastore
    //   2584: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2587: checkcast java/lang/Boolean
    //   2590: invokevirtual booleanValue : ()Z
    //   2593: istore_3
    //   2594: iload_2
    //   2595: ifne -> 2612
    //   2598: iinc #6, 1
    //   2601: iload_2
    //   2602: ifne -> 2472
    //   2605: goto -> 2612
    //   2608: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2611: athrow
    //   2612: iload_2
    //   2613: ifne -> 2954
    //   2616: sipush #-2786
    //   2619: sipush #-12240
    //   2622: invokestatic a : (II)Ljava/lang/String;
    //   2625: iconst_1
    //   2626: ldc burp/Zthx
    //   2628: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2631: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2634: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2637: astore #4
    //   2639: aload #4
    //   2641: arraylength
    //   2642: istore #5
    //   2644: iconst_0
    //   2645: istore #6
    //   2647: iload #6
    //   2649: iload #5
    //   2651: if_icmpge -> 2789
    //   2654: aload #4
    //   2656: iload #6
    //   2658: aaload
    //   2659: astore #7
    //   2661: aload #7
    //   2663: invokevirtual getModifiers : ()I
    //   2666: invokestatic isStatic : (I)Z
    //   2669: ifne -> 2679
    //   2672: goto -> 2782
    //   2675: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2678: athrow
    //   2679: aload #7
    //   2681: invokevirtual getType : ()Ljava/lang/Class;
    //   2684: astore #8
    //   2686: aload #8
    //   2688: ifnull -> 2769
    //   2691: aload #8
    //   2693: invokevirtual isPrimitive : ()Z
    //   2696: ifne -> 2769
    //   2699: goto -> 2706
    //   2702: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2705: athrow
    //   2706: aload #8
    //   2708: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2711: ifnull -> 2769
    //   2714: goto -> 2721
    //   2717: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2720: athrow
    //   2721: aload #8
    //   2723: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2726: invokevirtual getName : ()Ljava/lang/String;
    //   2729: ifnull -> 2769
    //   2732: goto -> 2739
    //   2735: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2738: athrow
    //   2739: aload #8
    //   2741: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2744: invokevirtual getName : ()Ljava/lang/String;
    //   2747: sipush #-2787
    //   2750: sipush #-26289
    //   2753: invokestatic a : (II)Ljava/lang/String;
    //   2756: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2759: ifne -> 2769
    //   2762: goto -> 2769
    //   2765: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2768: athrow
    //   2769: aload #7
    //   2771: iconst_1
    //   2772: invokevirtual setAccessible : (Z)V
    //   2775: aload #7
    //   2777: aconst_null
    //   2778: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2781: pop
    //   2782: iinc #6, 1
    //   2785: iload_2
    //   2786: ifne -> 2647
    //   2789: sipush #-2809
    //   2792: sipush #-18837
    //   2795: invokestatic a : (II)Ljava/lang/String;
    //   2798: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2801: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2804: astore #4
    //   2806: aload #4
    //   2808: arraylength
    //   2809: istore #5
    //   2811: iconst_0
    //   2812: istore #6
    //   2814: iload #6
    //   2816: iload #5
    //   2818: if_icmpge -> 2954
    //   2821: aload #4
    //   2823: iload #6
    //   2825: aaload
    //   2826: astore #7
    //   2828: aload #7
    //   2830: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2833: pop
    //   2834: aload #7
    //   2836: invokevirtual getModifiers : ()I
    //   2839: invokestatic isStatic : (I)Z
    //   2842: ifeq -> 2940
    //   2845: aload #7
    //   2847: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2850: arraylength
    //   2851: iconst_2
    //   2852: if_icmpne -> 2940
    //   2855: goto -> 2862
    //   2858: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2861: athrow
    //   2862: aload #7
    //   2864: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2867: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2870: if_acmpne -> 2940
    //   2873: goto -> 2880
    //   2876: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2879: athrow
    //   2880: aload #7
    //   2882: iconst_1
    //   2883: invokevirtual setAccessible : (Z)V
    //   2886: aload #7
    //   2888: aconst_null
    //   2889: iconst_2
    //   2890: anewarray java/lang/Object
    //   2893: dup
    //   2894: iconst_0
    //   2895: aload_0
    //   2896: aastore
    //   2897: dup
    //   2898: iconst_1
    //   2899: aload_1
    //   2900: ifnonnull -> 2918
    //   2903: goto -> 2910
    //   2906: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2909: athrow
    //   2910: aload_1
    //   2911: goto -> 2925
    //   2914: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2917: athrow
    //   2918: aload_1
    //   2919: checkcast [B
    //   2922: invokevirtual clone : ()Ljava/lang/Object;
    //   2925: aastore
    //   2926: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2929: checkcast java/lang/Boolean
    //   2932: invokevirtual booleanValue : ()Z
    //   2935: istore_3
    //   2936: iload_2
    //   2937: ifne -> 2954
    //   2940: iinc #6, 1
    //   2943: iload_2
    //   2944: ifne -> 2814
    //   2947: goto -> 2954
    //   2950: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2953: athrow
    //   2954: iload_3
    //   2955: ifeq -> 2960
    //   2958: iload_3
    //   2959: ireturn
    //   2960: getstatic burp/Zs6g.ZU : Ljava/lang/String;
    //   2963: getstatic burp/Zebj.Zf : Ljava/lang/Object;
    //   2966: checkcast java/math/BigInteger
    //   2969: invokevirtual intValue : ()I
    //   2972: bipush #32
    //   2974: irem
    //   2975: invokestatic abs : (I)I
    //   2978: invokevirtual charAt : (I)C
    //   2981: getstatic burp/Zre1.ZA : Ljava/lang/String;
    //   2984: getstatic burp/Zz0j.Zn : Ljava/lang/Object;
    //   2987: checkcast java/math/BigInteger
    //   2990: invokevirtual intValue : ()I
    //   2993: bipush #32
    //   2995: irem
    //   2996: invokestatic abs : (I)I
    //   2999: invokevirtual charAt : (I)C
    //   3002: if_icmple -> 3347
    //   3005: sipush #-2800
    //   3008: sipush #28421
    //   3011: invokestatic a : (II)Ljava/lang/String;
    //   3014: iconst_1
    //   3015: ldc burp/Ztvp
    //   3017: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3020: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3023: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3026: astore #4
    //   3028: aload #4
    //   3030: arraylength
    //   3031: istore #5
    //   3033: iconst_0
    //   3034: istore #6
    //   3036: iload #6
    //   3038: iload #5
    //   3040: if_icmpge -> 3178
    //   3043: aload #4
    //   3045: iload #6
    //   3047: aaload
    //   3048: astore #7
    //   3050: aload #7
    //   3052: invokevirtual getModifiers : ()I
    //   3055: invokestatic isStatic : (I)Z
    //   3058: ifne -> 3068
    //   3061: goto -> 3171
    //   3064: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3067: athrow
    //   3068: aload #7
    //   3070: invokevirtual getType : ()Ljava/lang/Class;
    //   3073: astore #8
    //   3075: aload #8
    //   3077: ifnull -> 3158
    //   3080: aload #8
    //   3082: invokevirtual isPrimitive : ()Z
    //   3085: ifne -> 3158
    //   3088: goto -> 3095
    //   3091: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3094: athrow
    //   3095: aload #8
    //   3097: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3100: ifnull -> 3158
    //   3103: goto -> 3110
    //   3106: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3109: athrow
    //   3110: aload #8
    //   3112: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3115: invokevirtual getName : ()Ljava/lang/String;
    //   3118: ifnull -> 3158
    //   3121: goto -> 3128
    //   3124: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3127: athrow
    //   3128: aload #8
    //   3130: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3133: invokevirtual getName : ()Ljava/lang/String;
    //   3136: sipush #-2787
    //   3139: sipush #-26289
    //   3142: invokestatic a : (II)Ljava/lang/String;
    //   3145: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3148: ifne -> 3158
    //   3151: goto -> 3158
    //   3154: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3157: athrow
    //   3158: aload #7
    //   3160: iconst_1
    //   3161: invokevirtual setAccessible : (Z)V
    //   3164: aload #7
    //   3166: aconst_null
    //   3167: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3170: pop
    //   3171: iinc #6, 1
    //   3174: iload_2
    //   3175: ifne -> 3036
    //   3178: sipush #-2815
    //   3181: sipush #7495
    //   3184: invokestatic a : (II)Ljava/lang/String;
    //   3187: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3190: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3193: astore #4
    //   3195: aload #4
    //   3197: arraylength
    //   3198: istore #5
    //   3200: iconst_0
    //   3201: istore #6
    //   3203: iload #6
    //   3205: iload #5
    //   3207: if_icmpge -> 3343
    //   3210: aload #4
    //   3212: iload #6
    //   3214: aaload
    //   3215: astore #7
    //   3217: aload #7
    //   3219: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3222: pop
    //   3223: aload #7
    //   3225: invokevirtual getModifiers : ()I
    //   3228: invokestatic isStatic : (I)Z
    //   3231: ifeq -> 3329
    //   3234: aload #7
    //   3236: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3239: arraylength
    //   3240: iconst_2
    //   3241: if_icmpne -> 3329
    //   3244: goto -> 3251
    //   3247: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3250: athrow
    //   3251: aload #7
    //   3253: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3256: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3259: if_acmpne -> 3329
    //   3262: goto -> 3269
    //   3265: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3268: athrow
    //   3269: aload #7
    //   3271: iconst_1
    //   3272: invokevirtual setAccessible : (Z)V
    //   3275: aload #7
    //   3277: aconst_null
    //   3278: iconst_2
    //   3279: anewarray java/lang/Object
    //   3282: dup
    //   3283: iconst_0
    //   3284: aload_0
    //   3285: aastore
    //   3286: dup
    //   3287: iconst_1
    //   3288: aload_1
    //   3289: ifnonnull -> 3307
    //   3292: goto -> 3299
    //   3295: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3298: athrow
    //   3299: aload_1
    //   3300: goto -> 3314
    //   3303: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3306: athrow
    //   3307: aload_1
    //   3308: checkcast [B
    //   3311: invokevirtual clone : ()Ljava/lang/Object;
    //   3314: aastore
    //   3315: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3318: checkcast java/lang/Boolean
    //   3321: invokevirtual booleanValue : ()Z
    //   3324: istore_3
    //   3325: iload_2
    //   3326: ifne -> 3343
    //   3329: iinc #6, 1
    //   3332: iload_2
    //   3333: ifne -> 3203
    //   3336: goto -> 3343
    //   3339: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3342: athrow
    //   3343: iload_2
    //   3344: ifne -> 3685
    //   3347: sipush #-2804
    //   3350: sipush #15198
    //   3353: invokestatic a : (II)Ljava/lang/String;
    //   3356: iconst_1
    //   3357: ldc burp/Zl1q
    //   3359: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3362: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3365: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3368: astore #4
    //   3370: aload #4
    //   3372: arraylength
    //   3373: istore #5
    //   3375: iconst_0
    //   3376: istore #6
    //   3378: iload #6
    //   3380: iload #5
    //   3382: if_icmpge -> 3520
    //   3385: aload #4
    //   3387: iload #6
    //   3389: aaload
    //   3390: astore #7
    //   3392: aload #7
    //   3394: invokevirtual getModifiers : ()I
    //   3397: invokestatic isStatic : (I)Z
    //   3400: ifne -> 3410
    //   3403: goto -> 3513
    //   3406: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3409: athrow
    //   3410: aload #7
    //   3412: invokevirtual getType : ()Ljava/lang/Class;
    //   3415: astore #8
    //   3417: aload #8
    //   3419: ifnull -> 3500
    //   3422: aload #8
    //   3424: invokevirtual isPrimitive : ()Z
    //   3427: ifne -> 3500
    //   3430: goto -> 3437
    //   3433: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3436: athrow
    //   3437: aload #8
    //   3439: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3442: ifnull -> 3500
    //   3445: goto -> 3452
    //   3448: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3451: athrow
    //   3452: aload #8
    //   3454: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3457: invokevirtual getName : ()Ljava/lang/String;
    //   3460: ifnull -> 3500
    //   3463: goto -> 3470
    //   3466: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3469: athrow
    //   3470: aload #8
    //   3472: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3475: invokevirtual getName : ()Ljava/lang/String;
    //   3478: sipush #-2787
    //   3481: sipush #-26289
    //   3484: invokestatic a : (II)Ljava/lang/String;
    //   3487: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3490: ifne -> 3500
    //   3493: goto -> 3500
    //   3496: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3499: athrow
    //   3500: aload #7
    //   3502: iconst_1
    //   3503: invokevirtual setAccessible : (Z)V
    //   3506: aload #7
    //   3508: aconst_null
    //   3509: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3512: pop
    //   3513: iinc #6, 1
    //   3516: iload_2
    //   3517: ifne -> 3378
    //   3520: sipush #-2796
    //   3523: sipush #-26093
    //   3526: invokestatic a : (II)Ljava/lang/String;
    //   3529: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3532: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3535: astore #4
    //   3537: aload #4
    //   3539: arraylength
    //   3540: istore #5
    //   3542: iconst_0
    //   3543: istore #6
    //   3545: iload #6
    //   3547: iload #5
    //   3549: if_icmpge -> 3685
    //   3552: aload #4
    //   3554: iload #6
    //   3556: aaload
    //   3557: astore #7
    //   3559: aload #7
    //   3561: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3564: pop
    //   3565: aload #7
    //   3567: invokevirtual getModifiers : ()I
    //   3570: invokestatic isStatic : (I)Z
    //   3573: ifeq -> 3671
    //   3576: aload #7
    //   3578: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3581: arraylength
    //   3582: iconst_2
    //   3583: if_icmpne -> 3671
    //   3586: goto -> 3593
    //   3589: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3592: athrow
    //   3593: aload #7
    //   3595: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3598: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3601: if_acmpne -> 3671
    //   3604: goto -> 3611
    //   3607: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3610: athrow
    //   3611: aload #7
    //   3613: iconst_1
    //   3614: invokevirtual setAccessible : (Z)V
    //   3617: aload #7
    //   3619: aconst_null
    //   3620: iconst_2
    //   3621: anewarray java/lang/Object
    //   3624: dup
    //   3625: iconst_0
    //   3626: aload_0
    //   3627: aastore
    //   3628: dup
    //   3629: iconst_1
    //   3630: aload_1
    //   3631: ifnonnull -> 3649
    //   3634: goto -> 3641
    //   3637: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3640: athrow
    //   3641: aload_1
    //   3642: goto -> 3656
    //   3645: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3648: athrow
    //   3649: aload_1
    //   3650: checkcast [B
    //   3653: invokevirtual clone : ()Ljava/lang/Object;
    //   3656: aastore
    //   3657: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3660: checkcast java/lang/Boolean
    //   3663: invokevirtual booleanValue : ()Z
    //   3666: istore_3
    //   3667: iload_2
    //   3668: ifne -> 3685
    //   3671: iinc #6, 1
    //   3674: iload_2
    //   3675: ifne -> 3545
    //   3678: goto -> 3685
    //   3681: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3684: athrow
    //   3685: iload_3
    //   3686: ireturn
    //   3687: astore_3
    //   3688: new java/lang/Exception
    //   3691: dup
    //   3692: aload_3
    //   3693: invokevirtual getMessage : ()Ljava/lang/String;
    //   3696: invokespecial <init> : (Ljava/lang/String;)V
    //   3699: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1497	3687	java/lang/Throwable
    //   191	219	222	java/lang/Throwable
    //   201	236	239	java/lang/Throwable
    //   226	264	267	java/lang/Throwable
    //   243	281	284	java/lang/Throwable
    //   271	309	312	java/lang/Throwable
    //   288	326	329	java/lang/Throwable
    //   316	344	347	java/lang/Throwable
    //   333	358	361	java/lang/Throwable
    //   479	493	493	java/lang/Throwable
    //   504	517	520	java/lang/Throwable
    //   509	532	535	java/lang/Throwable
    //   524	550	553	java/lang/Throwable
    //   539	580	583	java/lang/Throwable
    //   643	670	673	java/lang/Throwable
    //   660	691	694	java/lang/Throwable
    //   677	721	724	java/lang/Throwable
    //   698	732	732	java/lang/Throwable
    //   743	759	762	java/lang/Throwable
    //   858	872	872	java/lang/Throwable
    //   883	896	899	java/lang/Throwable
    //   888	911	914	java/lang/Throwable
    //   903	929	932	java/lang/Throwable
    //   918	959	962	java/lang/Throwable
    //   1025	1052	1055	java/lang/Throwable
    //   1042	1070	1073	java/lang/Throwable
    //   1059	1100	1103	java/lang/Throwable
    //   1077	1111	1111	java/lang/Throwable
    //   1133	1144	1147	java/lang/Throwable
    //   1199	1213	1213	java/lang/Throwable
    //   1224	1237	1240	java/lang/Throwable
    //   1229	1252	1255	java/lang/Throwable
    //   1244	1270	1273	java/lang/Throwable
    //   1259	1300	1303	java/lang/Throwable
    //   1366	1393	1396	java/lang/Throwable
    //   1383	1411	1414	java/lang/Throwable
    //   1400	1441	1444	java/lang/Throwable
    //   1418	1452	1452	java/lang/Throwable
    //   1474	1485	1488	java/lang/Throwable
    //   1498	2228	3687	java/lang/Throwable
    //   1588	1602	1602	java/lang/Throwable
    //   1613	1626	1629	java/lang/Throwable
    //   1618	1641	1644	java/lang/Throwable
    //   1633	1659	1662	java/lang/Throwable
    //   1648	1689	1692	java/lang/Throwable
    //   1755	1782	1785	java/lang/Throwable
    //   1772	1800	1803	java/lang/Throwable
    //   1789	1830	1833	java/lang/Throwable
    //   1807	1841	1841	java/lang/Throwable
    //   1863	1874	1877	java/lang/Throwable
    //   1930	1944	1944	java/lang/Throwable
    //   1955	1968	1971	java/lang/Throwable
    //   1960	1983	1986	java/lang/Throwable
    //   1975	2001	2004	java/lang/Throwable
    //   1990	2031	2034	java/lang/Throwable
    //   2097	2124	2127	java/lang/Throwable
    //   2114	2142	2145	java/lang/Throwable
    //   2131	2172	2175	java/lang/Throwable
    //   2149	2183	2183	java/lang/Throwable
    //   2205	2216	2219	java/lang/Throwable
    //   2229	2959	3687	java/lang/Throwable
    //   2319	2333	2333	java/lang/Throwable
    //   2344	2357	2360	java/lang/Throwable
    //   2349	2372	2375	java/lang/Throwable
    //   2364	2390	2393	java/lang/Throwable
    //   2379	2420	2423	java/lang/Throwable
    //   2486	2513	2516	java/lang/Throwable
    //   2503	2531	2534	java/lang/Throwable
    //   2520	2561	2564	java/lang/Throwable
    //   2538	2572	2572	java/lang/Throwable
    //   2594	2605	2608	java/lang/Throwable
    //   2661	2675	2675	java/lang/Throwable
    //   2686	2699	2702	java/lang/Throwable
    //   2691	2714	2717	java/lang/Throwable
    //   2706	2732	2735	java/lang/Throwable
    //   2721	2762	2765	java/lang/Throwable
    //   2828	2855	2858	java/lang/Throwable
    //   2845	2873	2876	java/lang/Throwable
    //   2862	2903	2906	java/lang/Throwable
    //   2880	2914	2914	java/lang/Throwable
    //   2936	2947	2950	java/lang/Throwable
    //   2960	3686	3687	java/lang/Throwable
    //   3050	3064	3064	java/lang/Throwable
    //   3075	3088	3091	java/lang/Throwable
    //   3080	3103	3106	java/lang/Throwable
    //   3095	3121	3124	java/lang/Throwable
    //   3110	3151	3154	java/lang/Throwable
    //   3217	3244	3247	java/lang/Throwable
    //   3234	3262	3265	java/lang/Throwable
    //   3251	3292	3295	java/lang/Throwable
    //   3269	3303	3303	java/lang/Throwable
    //   3325	3336	3339	java/lang/Throwable
    //   3392	3406	3406	java/lang/Throwable
    //   3417	3430	3433	java/lang/Throwable
    //   3422	3445	3448	java/lang/Throwable
    //   3437	3463	3466	java/lang/Throwable
    //   3452	3493	3496	java/lang/Throwable
    //   3559	3586	3589	java/lang/Throwable
    //   3576	3604	3607	java/lang/Throwable
    //   3593	3634	3637	java/lang/Throwable
    //   3611	3645	3645	java/lang/Throwable
    //   3667	3678	3681	java/lang/Throwable
  }
  
  static void Zp(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #26
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'æQ*Ü Ã\\bÁ2)°ÓS÷ì\\tãËm[´÷QÊ\\t8Pü4ÚÁo\\tôç|z½\\tÜ¦"§ná$\\ta=Q§¶3â ní¼ËûÐ0øtL°s6K®K}/¾\\toRü¼iÒ íÆ¬.\\tö+Ï7qzÔ\\tWGû¡CMKØ(ÍGñAX:Ï$ñúþ´¡xBHm©ð4ë"ÿÒ[\\bYÏnnN¢lBõ$¶  ëÞæ0:éýåÂn¢Î8«æ)\\t³îg+ ØÐ\\tC£Ý»\\tPå75î¡%\\t«£dzÔ<Q\\bæ·Qp\\t5¿· e$¥\\tAáÞÊÂ\\tnÍÜOm¬1M¿2ÖZ×¯öµý\\fÕÖvï ÑT[)QÊH;C\\bO Ó$0kX«ÉËÝ>ã¿³ÈpK"Ã¸^6¥>þs\\b\\t¢<Eq^kP¥È'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #50
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
    //   68: ldc 'BµM ÕlL ¸¼¬µSáRö*ò1óc\\tIïõÃàyò×Qcð·'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #78
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
    //   129: putstatic burp/Zg97.a : [Ljava/lang/String;
    //   132: bipush #26
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zg97.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 258
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #59
    //   214: goto -> 242
    //   217: bipush #81
    //   219: goto -> 242
    //   222: bipush #94
    //   224: goto -> 242
    //   227: iconst_3
    //   228: goto -> 242
    //   231: bipush #91
    //   233: goto -> 242
    //   236: bipush #117
    //   238: goto -> 242
    //   241: iconst_3
    //   242: ixor
    //   243: ixor
    //   244: i2c
    //   245: castore
    //   246: iinc #6, 1
    //   249: dup
    //   250: ifne -> 258
    //   253: dup2
    //   254: dup_x1
    //   255: goto -> 166
    //   258: dup2_x1
    //   259: pop2
    //   260: dup_x2
    //   261: iload #6
    //   263: if_icmpgt -> 162
    //   266: pop
    //   267: new java/lang/String
    //   270: dup_x1
    //   271: swap
    //   272: invokespecial <init> : ([C)V
    //   275: invokevirtual intern : ()Ljava/lang/String;
    //   278: swap
    //   279: pop
    //   280: swap
    //   281: tableswitch default -> 40, 0 -> 99
    //   300: sipush #-2797
    //   303: sipush #-1887
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zg97.ZX : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #-2814
    //   319: sipush #8772
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zg97.Zc : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF514) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg97.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */