package burp;

import java.math.BigInteger;

class Zmdf extends ClassLoader {
  static String Zo;
  
  static Object ZH;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZO(Object paramObject) {
    Zsdl.ZJ = a(20593, -29178);
    Zsdl.Zx = new BigInteger(a(20595, -32248));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zk8f.ZV.charAt(Math.abs(((BigInteger)Zt8m.Zf).intValue() % 32)) <= Ze8j.ZU.charAt(Math.abs(((BigInteger)Zm_u.Zf).intValue() % 32))) {
          try {
            Zz91.Ze(Class.forName(a(20599, 10887)));
            if (bool)
              Zbqo.ZX(Class.forName(a(20604, 28701))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zbqo.ZX(Class.forName(a(20604, 28701)));
    } catch (Throwable throwable) {}
  }
  
  static void Zx(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zn(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zb87.Zb : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zg7e.Zr : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Ze4w.Zd : Ljava/lang/Object;
    //   22: getstatic burp/Zb3d.Zw : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: invokevirtual toByteArray : ()[B
    //   31: astore_3
    //   32: aload_3
    //   33: arraylength
    //   34: iconst_2
    //   35: iadd
    //   36: newarray byte
    //   38: astore #5
    //   40: iconst_0
    //   41: istore #6
    //   43: iload #6
    //   45: aload_3
    //   46: arraylength
    //   47: if_icmpge -> 66
    //   50: aload #5
    //   52: iload #6
    //   54: aload_3
    //   55: iload #6
    //   57: baload
    //   58: bastore
    //   59: iinc #6, 1
    //   62: iload_2
    //   63: ifeq -> 43
    //   66: aload #5
    //   68: arraylength
    //   69: iconst_3
    //   70: idiv
    //   71: iconst_4
    //   72: imul
    //   73: newarray byte
    //   75: astore #4
    //   77: iconst_0
    //   78: istore #6
    //   80: iconst_0
    //   81: istore #7
    //   83: iload #6
    //   85: aload_3
    //   86: arraylength
    //   87: if_icmpge -> 198
    //   90: aload #4
    //   92: iload #7
    //   94: aload #5
    //   96: iload #6
    //   98: baload
    //   99: iconst_2
    //   100: iushr
    //   101: bipush #63
    //   103: iand
    //   104: i2b
    //   105: bastore
    //   106: aload #4
    //   108: iload #7
    //   110: iconst_1
    //   111: iadd
    //   112: aload #5
    //   114: iload #6
    //   116: iconst_1
    //   117: iadd
    //   118: baload
    //   119: iconst_4
    //   120: iushr
    //   121: bipush #15
    //   123: iand
    //   124: aload #5
    //   126: iload #6
    //   128: baload
    //   129: iconst_4
    //   130: ishl
    //   131: bipush #63
    //   133: iand
    //   134: ior
    //   135: i2b
    //   136: bastore
    //   137: aload #4
    //   139: iload #7
    //   141: iconst_2
    //   142: iadd
    //   143: aload #5
    //   145: iload #6
    //   147: iconst_2
    //   148: iadd
    //   149: baload
    //   150: bipush #6
    //   152: iushr
    //   153: iconst_3
    //   154: iand
    //   155: aload #5
    //   157: iload #6
    //   159: iconst_1
    //   160: iadd
    //   161: baload
    //   162: iconst_2
    //   163: ishl
    //   164: bipush #63
    //   166: iand
    //   167: ior
    //   168: i2b
    //   169: bastore
    //   170: aload #4
    //   172: iload #7
    //   174: iconst_3
    //   175: iadd
    //   176: aload #5
    //   178: iload #6
    //   180: iconst_2
    //   181: iadd
    //   182: baload
    //   183: bipush #63
    //   185: iand
    //   186: i2b
    //   187: bastore
    //   188: iinc #6, 3
    //   191: iinc #7, 4
    //   194: iload_2
    //   195: ifeq -> 83
    //   198: iconst_0
    //   199: istore #6
    //   201: iload #6
    //   203: aload #4
    //   205: arraylength
    //   206: if_icmpge -> 390
    //   209: aload #4
    //   211: iload #6
    //   213: baload
    //   214: bipush #26
    //   216: if_icmpge -> 244
    //   219: aload #4
    //   221: iload #6
    //   223: aload #4
    //   225: iload #6
    //   227: baload
    //   228: bipush #65
    //   230: iadd
    //   231: i2b
    //   232: bastore
    //   233: iload_2
    //   234: ifeq -> 383
    //   237: goto -> 244
    //   240: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   243: athrow
    //   244: aload #4
    //   246: iload #6
    //   248: baload
    //   249: bipush #52
    //   251: if_icmpge -> 289
    //   254: goto -> 261
    //   257: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   260: athrow
    //   261: aload #4
    //   263: iload #6
    //   265: aload #4
    //   267: iload #6
    //   269: baload
    //   270: bipush #97
    //   272: iadd
    //   273: bipush #26
    //   275: isub
    //   276: i2b
    //   277: bastore
    //   278: iload_2
    //   279: ifeq -> 383
    //   282: goto -> 289
    //   285: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   288: athrow
    //   289: aload #4
    //   291: iload #6
    //   293: baload
    //   294: bipush #62
    //   296: if_icmpge -> 334
    //   299: goto -> 306
    //   302: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   305: athrow
    //   306: aload #4
    //   308: iload #6
    //   310: aload #4
    //   312: iload #6
    //   314: baload
    //   315: bipush #48
    //   317: iadd
    //   318: bipush #52
    //   320: isub
    //   321: i2b
    //   322: bastore
    //   323: iload_2
    //   324: ifeq -> 383
    //   327: goto -> 334
    //   330: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   333: athrow
    //   334: aload #4
    //   336: iload #6
    //   338: baload
    //   339: bipush #63
    //   341: if_icmpge -> 369
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   350: athrow
    //   351: aload #4
    //   353: iload #6
    //   355: bipush #43
    //   357: bastore
    //   358: iload_2
    //   359: ifeq -> 383
    //   362: goto -> 369
    //   365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   368: athrow
    //   369: aload #4
    //   371: iload #6
    //   373: bipush #47
    //   375: bastore
    //   376: goto -> 383
    //   379: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   382: athrow
    //   383: iinc #6, 1
    //   386: iload_2
    //   387: ifeq -> 201
    //   390: aload #4
    //   392: arraylength
    //   393: iconst_1
    //   394: isub
    //   395: istore #6
    //   397: iload #6
    //   399: aload_3
    //   400: arraylength
    //   401: iconst_4
    //   402: imul
    //   403: iconst_3
    //   404: idiv
    //   405: if_icmple -> 422
    //   408: aload #4
    //   410: iload #6
    //   412: bipush #61
    //   414: bastore
    //   415: iinc #6, -1
    //   418: iload_2
    //   419: ifeq -> 397
    //   422: new java/math/BigInteger
    //   425: dup
    //   426: aload #4
    //   428: invokespecial <init> : ([B)V
    //   431: invokevirtual abs : ()Ljava/math/BigInteger;
    //   434: putstatic burp/Zttd.Zi : Ljava/lang/Object;
    //   437: sipush #20597
    //   440: sipush #-8376
    //   443: invokestatic a : (II)Ljava/lang/String;
    //   446: iconst_1
    //   447: ldc burp/Zlpj
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
    //   565: sipush #20606
    //   568: sipush #-22056
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
    //   604: ifeq -> 466
    //   607: sipush #20607
    //   610: sipush #-20757
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
    //   749: ifeq -> 766
    //   752: iinc #5, 1
    //   755: iload_2
    //   756: ifeq -> 630
    //   759: goto -> 766
    //   762: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   765: athrow
    //   766: getstatic burp/Zmzj.Zm : Ljava/lang/Object;
    //   769: checkcast java/math/BigInteger
    //   772: invokevirtual intValue : ()I
    //   775: i2l
    //   776: invokestatic currentTimeMillis : ()J
    //   779: ladd
    //   780: getstatic burp/Zex0.Ze : Ljava/lang/Object;
    //   783: checkcast java/math/BigInteger
    //   786: invokevirtual intValue : ()I
    //   789: i2l
    //   790: lcmp
    //   791: ifge -> 1123
    //   794: sipush #20596
    //   797: sipush #-32255
    //   800: invokestatic a : (II)Ljava/lang/String;
    //   803: iconst_1
    //   804: ldc burp/Zlr2
    //   806: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   809: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   812: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   815: astore_3
    //   816: aload_3
    //   817: arraylength
    //   818: istore #4
    //   820: iconst_0
    //   821: istore #5
    //   823: iload #5
    //   825: iload #4
    //   827: if_icmpge -> 964
    //   830: aload_3
    //   831: iload #5
    //   833: aaload
    //   834: astore #6
    //   836: aload #6
    //   838: invokevirtual getModifiers : ()I
    //   841: invokestatic isStatic : (I)Z
    //   844: ifne -> 854
    //   847: goto -> 957
    //   850: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   853: athrow
    //   854: aload #6
    //   856: invokevirtual getType : ()Ljava/lang/Class;
    //   859: astore #7
    //   861: aload #7
    //   863: ifnull -> 944
    //   866: aload #7
    //   868: invokevirtual isPrimitive : ()Z
    //   871: ifne -> 944
    //   874: goto -> 881
    //   877: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   880: athrow
    //   881: aload #7
    //   883: invokevirtual getPackage : ()Ljava/lang/Package;
    //   886: ifnull -> 944
    //   889: goto -> 896
    //   892: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   895: athrow
    //   896: aload #7
    //   898: invokevirtual getPackage : ()Ljava/lang/Package;
    //   901: invokevirtual getName : ()Ljava/lang/String;
    //   904: ifnull -> 944
    //   907: goto -> 914
    //   910: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   913: athrow
    //   914: aload #7
    //   916: invokevirtual getPackage : ()Ljava/lang/Package;
    //   919: invokevirtual getName : ()Ljava/lang/String;
    //   922: sipush #20594
    //   925: sipush #22547
    //   928: invokestatic a : (II)Ljava/lang/String;
    //   931: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   934: ifne -> 944
    //   937: goto -> 944
    //   940: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   943: athrow
    //   944: aload #6
    //   946: iconst_1
    //   947: invokevirtual setAccessible : (Z)V
    //   950: aload #6
    //   952: aconst_null
    //   953: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   956: pop
    //   957: iinc #5, 1
    //   960: iload_2
    //   961: ifeq -> 823
    //   964: sipush #20598
    //   967: sipush #-9486
    //   970: invokestatic a : (II)Ljava/lang/String;
    //   973: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   976: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   979: astore_3
    //   980: aload_3
    //   981: arraylength
    //   982: istore #4
    //   984: iconst_0
    //   985: istore #5
    //   987: iload #5
    //   989: iload #4
    //   991: if_icmpge -> 1123
    //   994: aload_3
    //   995: iload #5
    //   997: aaload
    //   998: astore #6
    //   1000: aload #6
    //   1002: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1005: pop
    //   1006: aload #6
    //   1008: invokevirtual getModifiers : ()I
    //   1011: invokestatic isStatic : (I)Z
    //   1014: ifeq -> 1109
    //   1017: aload #6
    //   1019: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1022: arraylength
    //   1023: iconst_2
    //   1024: if_icmpne -> 1109
    //   1027: goto -> 1034
    //   1030: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1033: athrow
    //   1034: aload #6
    //   1036: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1039: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1042: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1045: ifeq -> 1109
    //   1048: goto -> 1055
    //   1051: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1054: athrow
    //   1055: aload #6
    //   1057: iconst_1
    //   1058: invokevirtual setAccessible : (Z)V
    //   1061: aload #6
    //   1063: aconst_null
    //   1064: iconst_2
    //   1065: anewarray java/lang/Object
    //   1068: dup
    //   1069: iconst_0
    //   1070: aload_0
    //   1071: aastore
    //   1072: dup
    //   1073: iconst_1
    //   1074: aload_1
    //   1075: ifnonnull -> 1093
    //   1078: goto -> 1085
    //   1081: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1084: athrow
    //   1085: aload_1
    //   1086: goto -> 1100
    //   1089: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1092: athrow
    //   1093: aload_1
    //   1094: checkcast [B
    //   1097: invokevirtual clone : ()Ljava/lang/Object;
    //   1100: aastore
    //   1101: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1104: pop
    //   1105: iload_2
    //   1106: ifeq -> 1123
    //   1109: iinc #5, 1
    //   1112: iload_2
    //   1113: ifeq -> 987
    //   1116: goto -> 1123
    //   1119: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1122: athrow
    //   1123: getstatic burp/Zxcn.ZF : Ljava/lang/String;
    //   1126: getstatic burp/Zb3l.Zl : Ljava/lang/Object;
    //   1129: checkcast java/math/BigInteger
    //   1132: invokevirtual intValue : ()I
    //   1135: bipush #32
    //   1137: irem
    //   1138: invokestatic abs : (I)I
    //   1141: invokevirtual charAt : (I)C
    //   1144: getstatic burp/Zg1l.Zl : Ljava/lang/String;
    //   1147: getstatic burp/Zl_a.ZP : Ljava/lang/Object;
    //   1150: checkcast java/math/BigInteger
    //   1153: invokevirtual intValue : ()I
    //   1156: bipush #32
    //   1158: irem
    //   1159: invokestatic abs : (I)I
    //   1162: invokevirtual charAt : (I)C
    //   1165: if_icmple -> 1280
    //   1168: getstatic burp/Zx63.ZT : Ljava/lang/String;
    //   1171: getstatic burp/Zg61.Zp : Ljava/lang/Object;
    //   1174: checkcast java/math/BigInteger
    //   1177: invokevirtual intValue : ()I
    //   1180: bipush #32
    //   1182: irem
    //   1183: invokestatic abs : (I)I
    //   1186: invokevirtual charAt : (I)C
    //   1189: getstatic burp/Zgis.Zh : Ljava/lang/String;
    //   1192: getstatic burp/Zmhq.ZK : Ljava/lang/Object;
    //   1195: checkcast java/math/BigInteger
    //   1198: invokevirtual intValue : ()I
    //   1201: bipush #32
    //   1203: irem
    //   1204: invokestatic abs : (I)I
    //   1207: invokevirtual charAt : (I)C
    //   1210: if_icmpgt -> 1280
    //   1213: goto -> 1220
    //   1216: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1219: athrow
    //   1220: getstatic burp/Ztl6.Zb : Ljava/lang/String;
    //   1223: getstatic burp/Zxn9.ZN : Ljava/lang/Object;
    //   1226: checkcast java/math/BigInteger
    //   1229: invokevirtual intValue : ()I
    //   1232: bipush #32
    //   1234: irem
    //   1235: invokestatic abs : (I)I
    //   1238: invokevirtual charAt : (I)C
    //   1241: getstatic burp/Znu.ZF : Ljava/lang/String;
    //   1244: getstatic burp/Ze4a.ZP : Ljava/lang/Object;
    //   1247: checkcast java/math/BigInteger
    //   1250: invokevirtual intValue : ()I
    //   1253: bipush #32
    //   1255: irem
    //   1256: invokestatic abs : (I)I
    //   1259: invokevirtual charAt : (I)C
    //   1262: if_icmpgt -> 1280
    //   1265: goto -> 1272
    //   1268: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1271: athrow
    //   1272: iconst_1
    //   1273: goto -> 1281
    //   1276: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1279: athrow
    //   1280: iconst_0
    //   1281: ireturn
    //   1282: astore_3
    //   1283: new java/lang/Exception
    //   1286: dup
    //   1287: aload_3
    //   1288: invokevirtual getMessage : ()Ljava/lang/String;
    //   1291: invokespecial <init> : (Ljava/lang/String;)V
    //   1294: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1281	1282	java/lang/Throwable
    //   209	237	240	java/lang/Throwable
    //   219	254	257	java/lang/Throwable
    //   244	282	285	java/lang/Throwable
    //   261	299	302	java/lang/Throwable
    //   289	327	330	java/lang/Throwable
    //   306	344	347	java/lang/Throwable
    //   334	362	365	java/lang/Throwable
    //   351	376	379	java/lang/Throwable
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
    //   836	850	850	java/lang/Throwable
    //   861	874	877	java/lang/Throwable
    //   866	889	892	java/lang/Throwable
    //   881	907	910	java/lang/Throwable
    //   896	937	940	java/lang/Throwable
    //   1000	1027	1030	java/lang/Throwable
    //   1017	1048	1051	java/lang/Throwable
    //   1034	1078	1081	java/lang/Throwable
    //   1055	1089	1089	java/lang/Throwable
    //   1100	1116	1119	java/lang/Throwable
    //   1123	1213	1216	java/lang/Throwable
    //   1168	1265	1268	java/lang/Throwable
    //   1220	1276	1276	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Z~MøÄ7k\\tÝÓå|ây÷â\\tG·¶ðás3Á\\t½¶»ß8M3Óçö­UÂt4¤s³Ggcð=0 osjº÷·P¶åRÎ¿ZÝ\\fTèý¡[r`\\tr!b\\fð1çfi¬Ø70Í¨¸u<ï& ëQðaåÍfÅÂÊ{_Ø1¿Ï\\nJz×ã{÷ÕÀî `µÐé~×­Àý tBÊ5©ùkVp¦¼ømÉðÎsS0l'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #90
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
    //   68: ldc '5/±x¶ä\\t\\b¤Eñ÷')'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #6
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
    //   129: putstatic burp/Zmdf.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmdf.b : [Ljava/lang/String;
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
    //   212: bipush #10
    //   214: goto -> 244
    //   217: bipush #110
    //   219: goto -> 244
    //   222: bipush #82
    //   224: goto -> 244
    //   227: bipush #113
    //   229: goto -> 244
    //   232: bipush #126
    //   234: goto -> 244
    //   237: bipush #118
    //   239: goto -> 244
    //   242: bipush #95
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
    //   300: sipush #20592
    //   303: sipush #-292
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zmdf.Zo : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #73
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #87
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #-52
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #-65
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-107
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #-16
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #-69
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #106
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #-125
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #112
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #100
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #51
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #-23
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #46
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #-108
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #-6
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #-93
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #-31
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #105
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #-52
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #15
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #-63
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #-83
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #-21
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: bipush #-112
    //   464: bastore
    //   465: dup
    //   466: bipush #25
    //   468: bipush #44
    //   470: bastore
    //   471: dup
    //   472: bipush #26
    //   474: bipush #17
    //   476: bastore
    //   477: dup
    //   478: bipush #27
    //   480: bipush #-3
    //   482: bastore
    //   483: dup
    //   484: bipush #28
    //   486: bipush #-35
    //   488: bastore
    //   489: dup
    //   490: bipush #29
    //   492: bipush #126
    //   494: bastore
    //   495: dup
    //   496: bipush #30
    //   498: bipush #31
    //   500: bastore
    //   501: dup
    //   502: bipush #31
    //   504: bipush #-58
    //   506: bastore
    //   507: invokespecial <init> : (I[B)V
    //   510: putstatic burp/Zmdf.ZH : Ljava/lang/Object;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5076) & 0xFFFF;
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
      byte b1 = 125;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmdf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */