package burp;

import java.math.BigInteger;

class Zgt6 extends ClassLoader {
  static String Zu;
  
  static Object ZU;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zc(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zl_u.ZR : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zx4l.Zt : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zlnq.ZO : Ljava/lang/Object;
    //   22: getstatic burp/Zlo2.ZM : Ljava/lang/Object;
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
    //   63: ifne -> 43
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
    //   195: ifne -> 83
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
    //   234: ifne -> 383
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
    //   279: ifne -> 383
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
    //   324: ifne -> 383
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
    //   359: ifne -> 383
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
    //   387: ifne -> 201
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
    //   419: ifne -> 397
    //   422: new java/math/BigInteger
    //   425: dup
    //   426: aload #4
    //   428: invokespecial <init> : ([B)V
    //   431: invokevirtual abs : ()Ljava/math/BigInteger;
    //   434: putstatic burp/Zejj.Zy : Ljava/lang/Object;
    //   437: sipush #-24897
    //   440: sipush #-21676
    //   443: invokestatic a : (II)Ljava/lang/String;
    //   446: iconst_1
    //   447: ldc burp/Zmlr
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
    //   565: sipush #-24906
    //   568: sipush #22598
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
    //   607: sipush #-24911
    //   610: sipush #18513
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
    //   634: if_icmpge -> 745
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
    //   657: ifeq -> 731
    //   660: aload #6
    //   662: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   665: arraylength
    //   666: iconst_2
    //   667: if_icmpne -> 731
    //   670: goto -> 677
    //   673: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   676: athrow
    //   677: aload #6
    //   679: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   682: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   685: if_acmpne -> 731
    //   688: goto -> 695
    //   691: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   694: athrow
    //   695: aload #6
    //   697: iconst_1
    //   698: invokevirtual setAccessible : (Z)V
    //   701: aload #6
    //   703: aconst_null
    //   704: iconst_2
    //   705: anewarray java/lang/Object
    //   708: dup
    //   709: iconst_0
    //   710: aload_0
    //   711: aastore
    //   712: dup
    //   713: iconst_1
    //   714: aload_1
    //   715: aastore
    //   716: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   719: pop
    //   720: iload_2
    //   721: ifne -> 745
    //   724: goto -> 731
    //   727: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   730: athrow
    //   731: iinc #5, 1
    //   734: iload_2
    //   735: ifne -> 630
    //   738: goto -> 745
    //   741: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   744: athrow
    //   745: sipush #-24912
    //   748: sipush #-23096
    //   751: invokestatic a : (II)Ljava/lang/String;
    //   754: iconst_1
    //   755: ldc burp/Zb0z
    //   757: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   760: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   763: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   766: astore_3
    //   767: aload_3
    //   768: arraylength
    //   769: istore #4
    //   771: iconst_0
    //   772: istore #5
    //   774: iload #5
    //   776: iload #4
    //   778: if_icmpge -> 915
    //   781: aload_3
    //   782: iload #5
    //   784: aaload
    //   785: astore #6
    //   787: aload #6
    //   789: invokevirtual getModifiers : ()I
    //   792: invokestatic isStatic : (I)Z
    //   795: ifne -> 805
    //   798: goto -> 908
    //   801: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   804: athrow
    //   805: aload #6
    //   807: invokevirtual getType : ()Ljava/lang/Class;
    //   810: astore #7
    //   812: aload #7
    //   814: ifnull -> 895
    //   817: aload #7
    //   819: invokevirtual isPrimitive : ()Z
    //   822: ifne -> 895
    //   825: goto -> 832
    //   828: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   831: athrow
    //   832: aload #7
    //   834: invokevirtual getPackage : ()Ljava/lang/Package;
    //   837: ifnull -> 895
    //   840: goto -> 847
    //   843: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   846: athrow
    //   847: aload #7
    //   849: invokevirtual getPackage : ()Ljava/lang/Package;
    //   852: invokevirtual getName : ()Ljava/lang/String;
    //   855: ifnull -> 895
    //   858: goto -> 865
    //   861: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   864: athrow
    //   865: aload #7
    //   867: invokevirtual getPackage : ()Ljava/lang/Package;
    //   870: invokevirtual getName : ()Ljava/lang/String;
    //   873: sipush #-24905
    //   876: sipush #-12364
    //   879: invokestatic a : (II)Ljava/lang/String;
    //   882: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   885: ifne -> 895
    //   888: goto -> 895
    //   891: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   894: athrow
    //   895: aload #6
    //   897: iconst_1
    //   898: invokevirtual setAccessible : (Z)V
    //   901: aload #6
    //   903: aconst_null
    //   904: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   907: pop
    //   908: iinc #5, 1
    //   911: iload_2
    //   912: ifne -> 774
    //   915: sipush #-24908
    //   918: sipush #9238
    //   921: invokestatic a : (II)Ljava/lang/String;
    //   924: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   927: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   930: astore_3
    //   931: aload_3
    //   932: arraylength
    //   933: istore #4
    //   935: iconst_0
    //   936: istore #5
    //   938: iload #5
    //   940: iload #4
    //   942: if_icmpge -> 1074
    //   945: aload_3
    //   946: iload #5
    //   948: aaload
    //   949: astore #6
    //   951: aload #6
    //   953: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   956: pop
    //   957: aload #6
    //   959: invokevirtual getModifiers : ()I
    //   962: invokestatic isStatic : (I)Z
    //   965: ifeq -> 1060
    //   968: aload #6
    //   970: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   973: arraylength
    //   974: iconst_2
    //   975: if_icmpne -> 1060
    //   978: goto -> 985
    //   981: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   984: athrow
    //   985: aload #6
    //   987: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   990: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   993: invokevirtual equals : (Ljava/lang/Object;)Z
    //   996: ifeq -> 1060
    //   999: goto -> 1006
    //   1002: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1005: athrow
    //   1006: aload #6
    //   1008: iconst_1
    //   1009: invokevirtual setAccessible : (Z)V
    //   1012: aload #6
    //   1014: aconst_null
    //   1015: iconst_2
    //   1016: anewarray java/lang/Object
    //   1019: dup
    //   1020: iconst_0
    //   1021: aload_0
    //   1022: aastore
    //   1023: dup
    //   1024: iconst_1
    //   1025: aload_1
    //   1026: ifnonnull -> 1044
    //   1029: goto -> 1036
    //   1032: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1035: athrow
    //   1036: aload_1
    //   1037: goto -> 1051
    //   1040: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1043: athrow
    //   1044: aload_1
    //   1045: checkcast [B
    //   1048: invokevirtual clone : ()Ljava/lang/Object;
    //   1051: aastore
    //   1052: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1055: pop
    //   1056: iload_2
    //   1057: ifne -> 1074
    //   1060: iinc #5, 1
    //   1063: iload_2
    //   1064: ifne -> 938
    //   1067: goto -> 1074
    //   1070: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1073: athrow
    //   1074: getstatic burp/Ztq8.ZI : Ljava/lang/String;
    //   1077: getstatic burp/Zb9q.ZI : Ljava/lang/Object;
    //   1080: checkcast java/math/BigInteger
    //   1083: invokevirtual intValue : ()I
    //   1086: bipush #32
    //   1088: irem
    //   1089: invokestatic abs : (I)I
    //   1092: invokevirtual charAt : (I)C
    //   1095: getstatic burp/Zkbm.Zb : Ljava/lang/String;
    //   1098: getstatic burp/Zmd.ZU : Ljava/lang/Object;
    //   1101: checkcast java/math/BigInteger
    //   1104: invokevirtual intValue : ()I
    //   1107: bipush #32
    //   1109: irem
    //   1110: invokestatic abs : (I)I
    //   1113: invokevirtual charAt : (I)C
    //   1116: if_icmple -> 1223
    //   1119: getstatic burp/Zer1.ZV : Ljava/lang/String;
    //   1122: getstatic burp/Zrc0.Zz : Ljava/lang/Object;
    //   1125: checkcast java/math/BigInteger
    //   1128: invokevirtual intValue : ()I
    //   1131: bipush #32
    //   1133: irem
    //   1134: invokestatic abs : (I)I
    //   1137: invokevirtual charAt : (I)C
    //   1140: getstatic burp/Zs6g.ZU : Ljava/lang/String;
    //   1143: getstatic burp/Zx8t.ZA : Ljava/lang/Object;
    //   1146: checkcast java/math/BigInteger
    //   1149: invokevirtual intValue : ()I
    //   1152: bipush #32
    //   1154: irem
    //   1155: invokestatic abs : (I)I
    //   1158: invokevirtual charAt : (I)C
    //   1161: if_icmpgt -> 1223
    //   1164: goto -> 1171
    //   1167: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1170: athrow
    //   1171: getstatic burp/Zgj5.ZH : Ljava/lang/String;
    //   1174: getstatic burp/Zlb6.Zz : Ljava/lang/Object;
    //   1177: checkcast java/math/BigInteger
    //   1180: invokevirtual intValue : ()I
    //   1183: bipush #32
    //   1185: irem
    //   1186: invokestatic abs : (I)I
    //   1189: invokevirtual charAt : (I)C
    //   1192: getstatic burp/Zmy4.ZS : Ljava/lang/String;
    //   1195: getstatic burp/Zz67.ZE : Ljava/lang/Object;
    //   1198: checkcast java/math/BigInteger
    //   1201: invokevirtual intValue : ()I
    //   1204: bipush #32
    //   1206: irem
    //   1207: invokestatic abs : (I)I
    //   1210: invokevirtual charAt : (I)C
    //   1213: if_icmple -> 1231
    //   1216: goto -> 1223
    //   1219: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1222: athrow
    //   1223: iconst_1
    //   1224: goto -> 1232
    //   1227: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1230: athrow
    //   1231: iconst_0
    //   1232: ireturn
    //   1233: astore_3
    //   1234: new java/lang/Exception
    //   1237: dup
    //   1238: aload_3
    //   1239: invokevirtual getMessage : ()Ljava/lang/String;
    //   1242: invokespecial <init> : (Ljava/lang/String;)V
    //   1245: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1232	1233	java/lang/Throwable
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
    //   660	688	691	java/lang/Throwable
    //   677	724	727	java/lang/Throwable
    //   695	738	741	java/lang/Throwable
    //   787	801	801	java/lang/Throwable
    //   812	825	828	java/lang/Throwable
    //   817	840	843	java/lang/Throwable
    //   832	858	861	java/lang/Throwable
    //   847	888	891	java/lang/Throwable
    //   951	978	981	java/lang/Throwable
    //   968	999	1002	java/lang/Throwable
    //   985	1029	1032	java/lang/Throwable
    //   1006	1040	1040	java/lang/Throwable
    //   1051	1067	1070	java/lang/Throwable
    //   1074	1164	1167	java/lang/Throwable
    //   1119	1216	1219	java/lang/Throwable
    //   1171	1227	1227	java/lang/Throwable
  }
  
  static void ZT(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZV(Object paramObject) {
    Zb20.ZL = a(-24910, 1884);
    Zb20.Zq = new BigInteger(a(-24900, -29487));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zlav.ZW.charAt(Math.abs(((BigInteger)Zb9h.Zm).intValue() % 32)) <= Zkf9.ZS.charAt(Math.abs(((BigInteger)Zb9h.Zm).intValue() % 32))) {
          try {
            Zmwx.Zr(Class.forName(a(-24907, -26370)));
            if (bool)
              Zzpu.ZH(Class.forName(a(-24909, -4689))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zzpu.ZH(Class.forName(a(-24909, -4689)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ä~äuÑ\\t¦ó²3@\\bºÔ\\tRÛ,6¨ÔÖ [ JÂ¦¤©W6§iº$Ùï\\fÀC¡«]rÑÔ\\t«§8âiâ´\\tº1Ý0Õ®-U\\t©ÓS7|=s þx¼á$ðIÔ\\f²ÿb|ôò\\fi¢;!k4´Ð'M'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #51
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
    //   67: ldc '²0ß°rÂMùÑ`Ú\\fíQ8\\t!Á¤è`flx¼V}\\fæç^@ogóúú2x*©¿Ræ©xB¸¤±a-ØMú8Rïé:{Ç2|8é2'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #51
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
    //   128: putstatic burp/Zgt6.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zgt6.b : [Ljava/lang/String;
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
    //   212: bipush #43
    //   214: goto -> 244
    //   217: bipush #95
    //   219: goto -> 244
    //   222: bipush #10
    //   224: goto -> 244
    //   227: bipush #88
    //   229: goto -> 244
    //   232: bipush #16
    //   234: goto -> 244
    //   237: bipush #20
    //   239: goto -> 244
    //   242: bipush #118
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
    //   300: sipush #-24898
    //   303: sipush #19631
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zgt6.Zu : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #96
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #111
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #39
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #-127
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #40
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: iconst_4
    //   348: bastore
    //   349: dup
    //   350: bipush #6
    //   352: bipush #109
    //   354: bastore
    //   355: dup
    //   356: bipush #7
    //   358: bipush #-110
    //   360: bastore
    //   361: dup
    //   362: bipush #8
    //   364: bipush #-48
    //   366: bastore
    //   367: dup
    //   368: bipush #9
    //   370: bipush #-113
    //   372: bastore
    //   373: dup
    //   374: bipush #10
    //   376: bipush #-96
    //   378: bastore
    //   379: dup
    //   380: bipush #11
    //   382: bipush #16
    //   384: bastore
    //   385: dup
    //   386: bipush #12
    //   388: bipush #-74
    //   390: bastore
    //   391: dup
    //   392: bipush #13
    //   394: bipush #88
    //   396: bastore
    //   397: dup
    //   398: bipush #14
    //   400: bipush #7
    //   402: bastore
    //   403: dup
    //   404: bipush #15
    //   406: bipush #-124
    //   408: bastore
    //   409: dup
    //   410: bipush #16
    //   412: bipush #-22
    //   414: bastore
    //   415: dup
    //   416: bipush #17
    //   418: bipush #-39
    //   420: bastore
    //   421: dup
    //   422: bipush #18
    //   424: bipush #51
    //   426: bastore
    //   427: dup
    //   428: bipush #19
    //   430: bipush #68
    //   432: bastore
    //   433: dup
    //   434: bipush #20
    //   436: bipush #-60
    //   438: bastore
    //   439: dup
    //   440: bipush #21
    //   442: bipush #-109
    //   444: bastore
    //   445: dup
    //   446: bipush #22
    //   448: bipush #-80
    //   450: bastore
    //   451: dup
    //   452: bipush #23
    //   454: bipush #84
    //   456: bastore
    //   457: dup
    //   458: bipush #24
    //   460: bipush #-94
    //   462: bastore
    //   463: dup
    //   464: bipush #25
    //   466: bipush #-118
    //   468: bastore
    //   469: dup
    //   470: bipush #26
    //   472: bipush #99
    //   474: bastore
    //   475: dup
    //   476: bipush #27
    //   478: bipush #-77
    //   480: bastore
    //   481: dup
    //   482: bipush #28
    //   484: bipush #62
    //   486: bastore
    //   487: dup
    //   488: bipush #29
    //   490: bipush #-107
    //   492: bastore
    //   493: dup
    //   494: bipush #30
    //   496: bipush #102
    //   498: bastore
    //   499: dup
    //   500: bipush #31
    //   502: bipush #-87
    //   504: bastore
    //   505: invokespecial <init> : ([B)V
    //   508: putstatic burp/Zgt6.ZU : Ljava/lang/Object;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9EB6) & 0xFFFF;
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
      char c = 'î';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgt6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */