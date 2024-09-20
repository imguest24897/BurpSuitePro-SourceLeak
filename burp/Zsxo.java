package burp;

import java.math.BigInteger;

class Zsxo extends ClassLoader {
  static Object Za;
  
  static String ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zk(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zzyr.Za : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zr1z.Zi : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zrcy.Zr : Ljava/lang/Object;
    //   22: getstatic burp/Zxzz.ZM : Ljava/lang/Object;
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
    //   434: putstatic burp/Zlh8.Zm : Ljava/lang/Object;
    //   437: sipush #-30869
    //   440: getstatic burp/Zxo7.Zi : Ljava/lang/Object;
    //   443: checkcast java/math/BigInteger
    //   446: getstatic burp/Zlck.Zr : Ljava/lang/Object;
    //   449: checkcast java/math/BigInteger
    //   452: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   455: putstatic burp/Zlo5.Zf : Ljava/lang/Object;
    //   458: sipush #5076
    //   461: invokestatic a : (II)Ljava/lang/String;
    //   464: iconst_1
    //   465: ldc burp/Zcc
    //   467: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   470: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   473: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   476: astore_3
    //   477: aload_3
    //   478: arraylength
    //   479: istore #4
    //   481: iconst_0
    //   482: istore #5
    //   484: iload #5
    //   486: iload #4
    //   488: if_icmpge -> 625
    //   491: aload_3
    //   492: iload #5
    //   494: aaload
    //   495: astore #6
    //   497: aload #6
    //   499: invokevirtual getModifiers : ()I
    //   502: invokestatic isStatic : (I)Z
    //   505: ifne -> 515
    //   508: goto -> 618
    //   511: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   514: athrow
    //   515: aload #6
    //   517: invokevirtual getType : ()Ljava/lang/Class;
    //   520: astore #7
    //   522: aload #7
    //   524: ifnull -> 605
    //   527: aload #7
    //   529: invokevirtual isPrimitive : ()Z
    //   532: ifne -> 605
    //   535: goto -> 542
    //   538: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   541: athrow
    //   542: aload #7
    //   544: invokevirtual getPackage : ()Ljava/lang/Package;
    //   547: ifnull -> 605
    //   550: goto -> 557
    //   553: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   556: athrow
    //   557: aload #7
    //   559: invokevirtual getPackage : ()Ljava/lang/Package;
    //   562: invokevirtual getName : ()Ljava/lang/String;
    //   565: ifnull -> 605
    //   568: goto -> 575
    //   571: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   574: athrow
    //   575: aload #7
    //   577: invokevirtual getPackage : ()Ljava/lang/Package;
    //   580: invokevirtual getName : ()Ljava/lang/String;
    //   583: sipush #-30858
    //   586: sipush #-16372
    //   589: invokestatic a : (II)Ljava/lang/String;
    //   592: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   595: ifne -> 605
    //   598: goto -> 605
    //   601: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   604: athrow
    //   605: aload #6
    //   607: iconst_1
    //   608: invokevirtual setAccessible : (Z)V
    //   611: aload #6
    //   613: aconst_null
    //   614: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   617: pop
    //   618: iinc #5, 1
    //   621: iload_2
    //   622: ifne -> 484
    //   625: sipush #-30860
    //   628: sipush #-24474
    //   631: invokestatic a : (II)Ljava/lang/String;
    //   634: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   637: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   640: astore_3
    //   641: aload_3
    //   642: arraylength
    //   643: istore #4
    //   645: iconst_0
    //   646: istore #5
    //   648: iload #5
    //   650: iload #4
    //   652: if_icmpge -> 784
    //   655: aload_3
    //   656: iload #5
    //   658: aaload
    //   659: astore #6
    //   661: aload #6
    //   663: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   666: pop
    //   667: aload #6
    //   669: invokevirtual getModifiers : ()I
    //   672: invokestatic isStatic : (I)Z
    //   675: ifeq -> 770
    //   678: aload #6
    //   680: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   683: arraylength
    //   684: iconst_2
    //   685: if_icmpne -> 770
    //   688: goto -> 695
    //   691: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   694: athrow
    //   695: aload #6
    //   697: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   700: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   703: invokevirtual equals : (Ljava/lang/Object;)Z
    //   706: ifeq -> 770
    //   709: goto -> 716
    //   712: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   715: athrow
    //   716: aload #6
    //   718: iconst_1
    //   719: invokevirtual setAccessible : (Z)V
    //   722: aload #6
    //   724: aconst_null
    //   725: iconst_2
    //   726: anewarray java/lang/Object
    //   729: dup
    //   730: iconst_0
    //   731: aload_0
    //   732: aastore
    //   733: dup
    //   734: iconst_1
    //   735: aload_1
    //   736: ifnonnull -> 754
    //   739: goto -> 746
    //   742: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   745: athrow
    //   746: aload_1
    //   747: goto -> 761
    //   750: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   753: athrow
    //   754: aload_1
    //   755: checkcast [B
    //   758: invokevirtual clone : ()Ljava/lang/Object;
    //   761: aastore
    //   762: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   765: pop
    //   766: iload_2
    //   767: ifne -> 784
    //   770: iinc #5, 1
    //   773: iload_2
    //   774: ifne -> 648
    //   777: goto -> 784
    //   780: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   783: athrow
    //   784: iconst_0
    //   785: istore_3
    //   786: getstatic burp/Zli5.Zq : Ljava/lang/String;
    //   789: getstatic burp/Zr2i.ZD : Ljava/lang/Object;
    //   792: checkcast java/math/BigInteger
    //   795: invokevirtual intValue : ()I
    //   798: bipush #32
    //   800: irem
    //   801: invokestatic abs : (I)I
    //   804: invokevirtual charAt : (I)C
    //   807: getstatic burp/Zzym.Zj : Ljava/lang/String;
    //   810: getstatic burp/Zzgh.ZV : Ljava/lang/Object;
    //   813: checkcast java/math/BigInteger
    //   816: invokevirtual intValue : ()I
    //   819: bipush #32
    //   821: irem
    //   822: invokestatic abs : (I)I
    //   825: invokevirtual charAt : (I)C
    //   828: if_icmpgt -> 1172
    //   831: sipush #-30879
    //   834: sipush #-2718
    //   837: invokestatic a : (II)Ljava/lang/String;
    //   840: iconst_1
    //   841: ldc burp/Zlfg
    //   843: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   846: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   849: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   852: astore #4
    //   854: aload #4
    //   856: arraylength
    //   857: istore #5
    //   859: iconst_0
    //   860: istore #6
    //   862: iload #6
    //   864: iload #5
    //   866: if_icmpge -> 1004
    //   869: aload #4
    //   871: iload #6
    //   873: aaload
    //   874: astore #7
    //   876: aload #7
    //   878: invokevirtual getModifiers : ()I
    //   881: invokestatic isStatic : (I)Z
    //   884: ifne -> 894
    //   887: goto -> 997
    //   890: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   893: athrow
    //   894: aload #7
    //   896: invokevirtual getType : ()Ljava/lang/Class;
    //   899: astore #8
    //   901: aload #8
    //   903: ifnull -> 984
    //   906: aload #8
    //   908: invokevirtual isPrimitive : ()Z
    //   911: ifne -> 984
    //   914: goto -> 921
    //   917: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   920: athrow
    //   921: aload #8
    //   923: invokevirtual getPackage : ()Ljava/lang/Package;
    //   926: ifnull -> 984
    //   929: goto -> 936
    //   932: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   935: athrow
    //   936: aload #8
    //   938: invokevirtual getPackage : ()Ljava/lang/Package;
    //   941: invokevirtual getName : ()Ljava/lang/String;
    //   944: ifnull -> 984
    //   947: goto -> 954
    //   950: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   953: athrow
    //   954: aload #8
    //   956: invokevirtual getPackage : ()Ljava/lang/Package;
    //   959: invokevirtual getName : ()Ljava/lang/String;
    //   962: sipush #-30855
    //   965: sipush #-18731
    //   968: invokestatic a : (II)Ljava/lang/String;
    //   971: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   974: ifne -> 984
    //   977: goto -> 984
    //   980: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   983: athrow
    //   984: aload #7
    //   986: iconst_1
    //   987: invokevirtual setAccessible : (Z)V
    //   990: aload #7
    //   992: aconst_null
    //   993: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   996: pop
    //   997: iinc #6, 1
    //   1000: iload_2
    //   1001: ifne -> 862
    //   1004: sipush #-30865
    //   1007: sipush #-7365
    //   1010: invokestatic a : (II)Ljava/lang/String;
    //   1013: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1016: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1019: astore #4
    //   1021: aload #4
    //   1023: arraylength
    //   1024: istore #5
    //   1026: iconst_0
    //   1027: istore #6
    //   1029: iload #6
    //   1031: iload #5
    //   1033: if_icmpge -> 1169
    //   1036: aload #4
    //   1038: iload #6
    //   1040: aaload
    //   1041: astore #7
    //   1043: aload #7
    //   1045: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1048: pop
    //   1049: aload #7
    //   1051: invokevirtual getModifiers : ()I
    //   1054: invokestatic isStatic : (I)Z
    //   1057: ifeq -> 1155
    //   1060: aload #7
    //   1062: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1065: arraylength
    //   1066: iconst_2
    //   1067: if_icmpne -> 1155
    //   1070: goto -> 1077
    //   1073: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1076: athrow
    //   1077: aload #7
    //   1079: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1082: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1085: if_acmpne -> 1155
    //   1088: goto -> 1095
    //   1091: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1094: athrow
    //   1095: aload #7
    //   1097: iconst_1
    //   1098: invokevirtual setAccessible : (Z)V
    //   1101: aload #7
    //   1103: aconst_null
    //   1104: iconst_2
    //   1105: anewarray java/lang/Object
    //   1108: dup
    //   1109: iconst_0
    //   1110: aload_0
    //   1111: aastore
    //   1112: dup
    //   1113: iconst_1
    //   1114: aload_1
    //   1115: ifnonnull -> 1133
    //   1118: goto -> 1125
    //   1121: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1124: athrow
    //   1125: aload_1
    //   1126: goto -> 1140
    //   1129: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1132: athrow
    //   1133: aload_1
    //   1134: checkcast [B
    //   1137: invokevirtual clone : ()Ljava/lang/Object;
    //   1140: aastore
    //   1141: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1144: checkcast java/lang/Boolean
    //   1147: invokevirtual booleanValue : ()Z
    //   1150: istore_3
    //   1151: iload_2
    //   1152: ifne -> 1169
    //   1155: iinc #6, 1
    //   1158: iload_2
    //   1159: ifne -> 1029
    //   1162: goto -> 1169
    //   1165: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1168: athrow
    //   1169: goto -> 1510
    //   1172: sipush #-30864
    //   1175: sipush #21126
    //   1178: invokestatic a : (II)Ljava/lang/String;
    //   1181: iconst_1
    //   1182: ldc burp/Zxee
    //   1184: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1187: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1190: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1193: astore #4
    //   1195: aload #4
    //   1197: arraylength
    //   1198: istore #5
    //   1200: iconst_0
    //   1201: istore #6
    //   1203: iload #6
    //   1205: iload #5
    //   1207: if_icmpge -> 1345
    //   1210: aload #4
    //   1212: iload #6
    //   1214: aaload
    //   1215: astore #7
    //   1217: aload #7
    //   1219: invokevirtual getModifiers : ()I
    //   1222: invokestatic isStatic : (I)Z
    //   1225: ifne -> 1235
    //   1228: goto -> 1338
    //   1231: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1234: athrow
    //   1235: aload #7
    //   1237: invokevirtual getType : ()Ljava/lang/Class;
    //   1240: astore #8
    //   1242: aload #8
    //   1244: ifnull -> 1325
    //   1247: aload #8
    //   1249: invokevirtual isPrimitive : ()Z
    //   1252: ifne -> 1325
    //   1255: goto -> 1262
    //   1258: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1261: athrow
    //   1262: aload #8
    //   1264: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1267: ifnull -> 1325
    //   1270: goto -> 1277
    //   1273: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1276: athrow
    //   1277: aload #8
    //   1279: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1282: invokevirtual getName : ()Ljava/lang/String;
    //   1285: ifnull -> 1325
    //   1288: goto -> 1295
    //   1291: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1294: athrow
    //   1295: aload #8
    //   1297: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1300: invokevirtual getName : ()Ljava/lang/String;
    //   1303: sipush #-30855
    //   1306: sipush #-18731
    //   1309: invokestatic a : (II)Ljava/lang/String;
    //   1312: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1315: ifne -> 1325
    //   1318: goto -> 1325
    //   1321: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1324: athrow
    //   1325: aload #7
    //   1327: iconst_1
    //   1328: invokevirtual setAccessible : (Z)V
    //   1331: aload #7
    //   1333: aconst_null
    //   1334: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1337: pop
    //   1338: iinc #6, 1
    //   1341: iload_2
    //   1342: ifne -> 1203
    //   1345: sipush #-30861
    //   1348: sipush #31387
    //   1351: invokestatic a : (II)Ljava/lang/String;
    //   1354: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1357: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1360: astore #4
    //   1362: aload #4
    //   1364: arraylength
    //   1365: istore #5
    //   1367: iconst_0
    //   1368: istore #6
    //   1370: iload #6
    //   1372: iload #5
    //   1374: if_icmpge -> 1510
    //   1377: aload #4
    //   1379: iload #6
    //   1381: aaload
    //   1382: astore #7
    //   1384: aload #7
    //   1386: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1389: pop
    //   1390: aload #7
    //   1392: invokevirtual getModifiers : ()I
    //   1395: invokestatic isStatic : (I)Z
    //   1398: ifeq -> 1496
    //   1401: aload #7
    //   1403: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1406: arraylength
    //   1407: iconst_2
    //   1408: if_icmpne -> 1496
    //   1411: goto -> 1418
    //   1414: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1417: athrow
    //   1418: aload #7
    //   1420: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1423: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1426: if_acmpne -> 1496
    //   1429: goto -> 1436
    //   1432: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1435: athrow
    //   1436: aload #7
    //   1438: iconst_1
    //   1439: invokevirtual setAccessible : (Z)V
    //   1442: aload #7
    //   1444: aconst_null
    //   1445: iconst_2
    //   1446: anewarray java/lang/Object
    //   1449: dup
    //   1450: iconst_0
    //   1451: aload_0
    //   1452: aastore
    //   1453: dup
    //   1454: iconst_1
    //   1455: aload_1
    //   1456: ifnonnull -> 1474
    //   1459: goto -> 1466
    //   1462: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1465: athrow
    //   1466: aload_1
    //   1467: goto -> 1481
    //   1470: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1473: athrow
    //   1474: aload_1
    //   1475: checkcast [B
    //   1478: invokevirtual clone : ()Ljava/lang/Object;
    //   1481: aastore
    //   1482: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1485: checkcast java/lang/Boolean
    //   1488: invokevirtual booleanValue : ()Z
    //   1491: istore_3
    //   1492: iload_2
    //   1493: ifne -> 1510
    //   1496: iinc #6, 1
    //   1499: iload_2
    //   1500: ifne -> 1370
    //   1503: goto -> 1510
    //   1506: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1509: athrow
    //   1510: iload_3
    //   1511: ifeq -> 1516
    //   1514: iload_3
    //   1515: ireturn
    //   1516: getstatic burp/Ze5f.Zt : Ljava/lang/String;
    //   1519: getstatic burp/Zsbt.Zl : Ljava/lang/Object;
    //   1522: checkcast java/math/BigInteger
    //   1525: invokevirtual intValue : ()I
    //   1528: bipush #32
    //   1530: irem
    //   1531: invokestatic abs : (I)I
    //   1534: invokevirtual charAt : (I)C
    //   1537: getstatic burp/Zl50.Zm : Ljava/lang/String;
    //   1540: getstatic burp/Zrhp.Zw : Ljava/lang/Object;
    //   1543: checkcast java/math/BigInteger
    //   1546: invokevirtual intValue : ()I
    //   1549: bipush #32
    //   1551: irem
    //   1552: invokestatic abs : (I)I
    //   1555: invokevirtual charAt : (I)C
    //   1558: if_icmple -> 1903
    //   1561: sipush #-30856
    //   1564: sipush #-10054
    //   1567: invokestatic a : (II)Ljava/lang/String;
    //   1570: iconst_1
    //   1571: ldc burp/Zmjw
    //   1573: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1576: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1579: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1582: astore #4
    //   1584: aload #4
    //   1586: arraylength
    //   1587: istore #5
    //   1589: iconst_0
    //   1590: istore #6
    //   1592: iload #6
    //   1594: iload #5
    //   1596: if_icmpge -> 1734
    //   1599: aload #4
    //   1601: iload #6
    //   1603: aaload
    //   1604: astore #7
    //   1606: aload #7
    //   1608: invokevirtual getModifiers : ()I
    //   1611: invokestatic isStatic : (I)Z
    //   1614: ifne -> 1624
    //   1617: goto -> 1727
    //   1620: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1623: athrow
    //   1624: aload #7
    //   1626: invokevirtual getType : ()Ljava/lang/Class;
    //   1629: astore #8
    //   1631: aload #8
    //   1633: ifnull -> 1714
    //   1636: aload #8
    //   1638: invokevirtual isPrimitive : ()Z
    //   1641: ifne -> 1714
    //   1644: goto -> 1651
    //   1647: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1650: athrow
    //   1651: aload #8
    //   1653: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1656: ifnull -> 1714
    //   1659: goto -> 1666
    //   1662: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1665: athrow
    //   1666: aload #8
    //   1668: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1671: invokevirtual getName : ()Ljava/lang/String;
    //   1674: ifnull -> 1714
    //   1677: goto -> 1684
    //   1680: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1683: athrow
    //   1684: aload #8
    //   1686: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1689: invokevirtual getName : ()Ljava/lang/String;
    //   1692: sipush #-30855
    //   1695: sipush #-18731
    //   1698: invokestatic a : (II)Ljava/lang/String;
    //   1701: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1704: ifne -> 1714
    //   1707: goto -> 1714
    //   1710: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1713: athrow
    //   1714: aload #7
    //   1716: iconst_1
    //   1717: invokevirtual setAccessible : (Z)V
    //   1720: aload #7
    //   1722: aconst_null
    //   1723: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1726: pop
    //   1727: iinc #6, 1
    //   1730: iload_2
    //   1731: ifne -> 1592
    //   1734: sipush #-30852
    //   1737: sipush #-5827
    //   1740: invokestatic a : (II)Ljava/lang/String;
    //   1743: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1746: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1749: astore #4
    //   1751: aload #4
    //   1753: arraylength
    //   1754: istore #5
    //   1756: iconst_0
    //   1757: istore #6
    //   1759: iload #6
    //   1761: iload #5
    //   1763: if_icmpge -> 1899
    //   1766: aload #4
    //   1768: iload #6
    //   1770: aaload
    //   1771: astore #7
    //   1773: aload #7
    //   1775: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1778: pop
    //   1779: aload #7
    //   1781: invokevirtual getModifiers : ()I
    //   1784: invokestatic isStatic : (I)Z
    //   1787: ifeq -> 1885
    //   1790: aload #7
    //   1792: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1795: arraylength
    //   1796: iconst_2
    //   1797: if_icmpne -> 1885
    //   1800: goto -> 1807
    //   1803: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1806: athrow
    //   1807: aload #7
    //   1809: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1812: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1815: if_acmpne -> 1885
    //   1818: goto -> 1825
    //   1821: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1824: athrow
    //   1825: aload #7
    //   1827: iconst_1
    //   1828: invokevirtual setAccessible : (Z)V
    //   1831: aload #7
    //   1833: aconst_null
    //   1834: iconst_2
    //   1835: anewarray java/lang/Object
    //   1838: dup
    //   1839: iconst_0
    //   1840: aload_0
    //   1841: aastore
    //   1842: dup
    //   1843: iconst_1
    //   1844: aload_1
    //   1845: ifnonnull -> 1863
    //   1848: goto -> 1855
    //   1851: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1854: athrow
    //   1855: aload_1
    //   1856: goto -> 1870
    //   1859: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1862: athrow
    //   1863: aload_1
    //   1864: checkcast [B
    //   1867: invokevirtual clone : ()Ljava/lang/Object;
    //   1870: aastore
    //   1871: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1874: checkcast java/lang/Boolean
    //   1877: invokevirtual booleanValue : ()Z
    //   1880: istore_3
    //   1881: iload_2
    //   1882: ifne -> 1899
    //   1885: iinc #6, 1
    //   1888: iload_2
    //   1889: ifne -> 1759
    //   1892: goto -> 1899
    //   1895: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1898: athrow
    //   1899: iload_2
    //   1900: ifne -> 2241
    //   1903: sipush #-30880
    //   1906: sipush #4408
    //   1909: invokestatic a : (II)Ljava/lang/String;
    //   1912: iconst_1
    //   1913: ldc burp/Zmzj
    //   1915: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1918: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1921: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1924: astore #4
    //   1926: aload #4
    //   1928: arraylength
    //   1929: istore #5
    //   1931: iconst_0
    //   1932: istore #6
    //   1934: iload #6
    //   1936: iload #5
    //   1938: if_icmpge -> 2076
    //   1941: aload #4
    //   1943: iload #6
    //   1945: aaload
    //   1946: astore #7
    //   1948: aload #7
    //   1950: invokevirtual getModifiers : ()I
    //   1953: invokestatic isStatic : (I)Z
    //   1956: ifne -> 1966
    //   1959: goto -> 2069
    //   1962: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1965: athrow
    //   1966: aload #7
    //   1968: invokevirtual getType : ()Ljava/lang/Class;
    //   1971: astore #8
    //   1973: aload #8
    //   1975: ifnull -> 2056
    //   1978: aload #8
    //   1980: invokevirtual isPrimitive : ()Z
    //   1983: ifne -> 2056
    //   1986: goto -> 1993
    //   1989: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1992: athrow
    //   1993: aload #8
    //   1995: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1998: ifnull -> 2056
    //   2001: goto -> 2008
    //   2004: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2007: athrow
    //   2008: aload #8
    //   2010: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2013: invokevirtual getName : ()Ljava/lang/String;
    //   2016: ifnull -> 2056
    //   2019: goto -> 2026
    //   2022: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2025: athrow
    //   2026: aload #8
    //   2028: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2031: invokevirtual getName : ()Ljava/lang/String;
    //   2034: sipush #-30855
    //   2037: sipush #-18731
    //   2040: invokestatic a : (II)Ljava/lang/String;
    //   2043: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2046: ifne -> 2056
    //   2049: goto -> 2056
    //   2052: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2055: athrow
    //   2056: aload #7
    //   2058: iconst_1
    //   2059: invokevirtual setAccessible : (Z)V
    //   2062: aload #7
    //   2064: aconst_null
    //   2065: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2068: pop
    //   2069: iinc #6, 1
    //   2072: iload_2
    //   2073: ifne -> 1934
    //   2076: sipush #-30862
    //   2079: sipush #30298
    //   2082: invokestatic a : (II)Ljava/lang/String;
    //   2085: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2088: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2091: astore #4
    //   2093: aload #4
    //   2095: arraylength
    //   2096: istore #5
    //   2098: iconst_0
    //   2099: istore #6
    //   2101: iload #6
    //   2103: iload #5
    //   2105: if_icmpge -> 2241
    //   2108: aload #4
    //   2110: iload #6
    //   2112: aaload
    //   2113: astore #7
    //   2115: aload #7
    //   2117: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2120: pop
    //   2121: aload #7
    //   2123: invokevirtual getModifiers : ()I
    //   2126: invokestatic isStatic : (I)Z
    //   2129: ifeq -> 2227
    //   2132: aload #7
    //   2134: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2137: arraylength
    //   2138: iconst_2
    //   2139: if_icmpne -> 2227
    //   2142: goto -> 2149
    //   2145: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2148: athrow
    //   2149: aload #7
    //   2151: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2154: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2157: if_acmpne -> 2227
    //   2160: goto -> 2167
    //   2163: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2166: athrow
    //   2167: aload #7
    //   2169: iconst_1
    //   2170: invokevirtual setAccessible : (Z)V
    //   2173: aload #7
    //   2175: aconst_null
    //   2176: iconst_2
    //   2177: anewarray java/lang/Object
    //   2180: dup
    //   2181: iconst_0
    //   2182: aload_0
    //   2183: aastore
    //   2184: dup
    //   2185: iconst_1
    //   2186: aload_1
    //   2187: ifnonnull -> 2205
    //   2190: goto -> 2197
    //   2193: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2196: athrow
    //   2197: aload_1
    //   2198: goto -> 2212
    //   2201: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2204: athrow
    //   2205: aload_1
    //   2206: checkcast [B
    //   2209: invokevirtual clone : ()Ljava/lang/Object;
    //   2212: aastore
    //   2213: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2216: checkcast java/lang/Boolean
    //   2219: invokevirtual booleanValue : ()Z
    //   2222: istore_3
    //   2223: iload_2
    //   2224: ifne -> 2241
    //   2227: iinc #6, 1
    //   2230: iload_2
    //   2231: ifne -> 2101
    //   2234: goto -> 2241
    //   2237: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2240: athrow
    //   2241: iload_3
    //   2242: ifeq -> 2247
    //   2245: iload_3
    //   2246: ireturn
    //   2247: getstatic burp/Zz20.ZX : Ljava/lang/String;
    //   2250: getstatic burp/Ztlz.ZW : Ljava/lang/Object;
    //   2253: checkcast java/math/BigInteger
    //   2256: invokevirtual intValue : ()I
    //   2259: bipush #32
    //   2261: irem
    //   2262: invokestatic abs : (I)I
    //   2265: invokevirtual charAt : (I)C
    //   2268: getstatic burp/Zl8f.ZK : Ljava/lang/String;
    //   2271: getstatic burp/Zl06.Zw : Ljava/lang/Object;
    //   2274: checkcast java/math/BigInteger
    //   2277: invokevirtual intValue : ()I
    //   2280: bipush #32
    //   2282: irem
    //   2283: invokestatic abs : (I)I
    //   2286: invokevirtual charAt : (I)C
    //   2289: if_icmple -> 2634
    //   2292: sipush #-30877
    //   2295: sipush #9189
    //   2298: invokestatic a : (II)Ljava/lang/String;
    //   2301: iconst_1
    //   2302: ldc burp/Zzgh
    //   2304: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2307: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2310: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2313: astore #4
    //   2315: aload #4
    //   2317: arraylength
    //   2318: istore #5
    //   2320: iconst_0
    //   2321: istore #6
    //   2323: iload #6
    //   2325: iload #5
    //   2327: if_icmpge -> 2465
    //   2330: aload #4
    //   2332: iload #6
    //   2334: aaload
    //   2335: astore #7
    //   2337: aload #7
    //   2339: invokevirtual getModifiers : ()I
    //   2342: invokestatic isStatic : (I)Z
    //   2345: ifne -> 2355
    //   2348: goto -> 2458
    //   2351: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2354: athrow
    //   2355: aload #7
    //   2357: invokevirtual getType : ()Ljava/lang/Class;
    //   2360: astore #8
    //   2362: aload #8
    //   2364: ifnull -> 2445
    //   2367: aload #8
    //   2369: invokevirtual isPrimitive : ()Z
    //   2372: ifne -> 2445
    //   2375: goto -> 2382
    //   2378: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2381: athrow
    //   2382: aload #8
    //   2384: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2387: ifnull -> 2445
    //   2390: goto -> 2397
    //   2393: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2396: athrow
    //   2397: aload #8
    //   2399: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2402: invokevirtual getName : ()Ljava/lang/String;
    //   2405: ifnull -> 2445
    //   2408: goto -> 2415
    //   2411: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2414: athrow
    //   2415: aload #8
    //   2417: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2420: invokevirtual getName : ()Ljava/lang/String;
    //   2423: sipush #-30855
    //   2426: sipush #-18731
    //   2429: invokestatic a : (II)Ljava/lang/String;
    //   2432: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2435: ifne -> 2445
    //   2438: goto -> 2445
    //   2441: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2444: athrow
    //   2445: aload #7
    //   2447: iconst_1
    //   2448: invokevirtual setAccessible : (Z)V
    //   2451: aload #7
    //   2453: aconst_null
    //   2454: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2457: pop
    //   2458: iinc #6, 1
    //   2461: iload_2
    //   2462: ifne -> 2323
    //   2465: sipush #-30863
    //   2468: sipush #16354
    //   2471: invokestatic a : (II)Ljava/lang/String;
    //   2474: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2477: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2480: astore #4
    //   2482: aload #4
    //   2484: arraylength
    //   2485: istore #5
    //   2487: iconst_0
    //   2488: istore #6
    //   2490: iload #6
    //   2492: iload #5
    //   2494: if_icmpge -> 2630
    //   2497: aload #4
    //   2499: iload #6
    //   2501: aaload
    //   2502: astore #7
    //   2504: aload #7
    //   2506: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2509: pop
    //   2510: aload #7
    //   2512: invokevirtual getModifiers : ()I
    //   2515: invokestatic isStatic : (I)Z
    //   2518: ifeq -> 2616
    //   2521: aload #7
    //   2523: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2526: arraylength
    //   2527: iconst_2
    //   2528: if_icmpne -> 2616
    //   2531: goto -> 2538
    //   2534: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2537: athrow
    //   2538: aload #7
    //   2540: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2543: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2546: if_acmpne -> 2616
    //   2549: goto -> 2556
    //   2552: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2555: athrow
    //   2556: aload #7
    //   2558: iconst_1
    //   2559: invokevirtual setAccessible : (Z)V
    //   2562: aload #7
    //   2564: aconst_null
    //   2565: iconst_2
    //   2566: anewarray java/lang/Object
    //   2569: dup
    //   2570: iconst_0
    //   2571: aload_0
    //   2572: aastore
    //   2573: dup
    //   2574: iconst_1
    //   2575: aload_1
    //   2576: ifnonnull -> 2594
    //   2579: goto -> 2586
    //   2582: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2585: athrow
    //   2586: aload_1
    //   2587: goto -> 2601
    //   2590: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2593: athrow
    //   2594: aload_1
    //   2595: checkcast [B
    //   2598: invokevirtual clone : ()Ljava/lang/Object;
    //   2601: aastore
    //   2602: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2605: checkcast java/lang/Boolean
    //   2608: invokevirtual booleanValue : ()Z
    //   2611: istore_3
    //   2612: iload_2
    //   2613: ifne -> 2630
    //   2616: iinc #6, 1
    //   2619: iload_2
    //   2620: ifne -> 2490
    //   2623: goto -> 2630
    //   2626: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2629: athrow
    //   2630: iload_2
    //   2631: ifne -> 2972
    //   2634: sipush #-30874
    //   2637: sipush #-12484
    //   2640: invokestatic a : (II)Ljava/lang/String;
    //   2643: iconst_1
    //   2644: ldc burp/Zrcx
    //   2646: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2649: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2652: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2655: astore #4
    //   2657: aload #4
    //   2659: arraylength
    //   2660: istore #5
    //   2662: iconst_0
    //   2663: istore #6
    //   2665: iload #6
    //   2667: iload #5
    //   2669: if_icmpge -> 2807
    //   2672: aload #4
    //   2674: iload #6
    //   2676: aaload
    //   2677: astore #7
    //   2679: aload #7
    //   2681: invokevirtual getModifiers : ()I
    //   2684: invokestatic isStatic : (I)Z
    //   2687: ifne -> 2697
    //   2690: goto -> 2800
    //   2693: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2696: athrow
    //   2697: aload #7
    //   2699: invokevirtual getType : ()Ljava/lang/Class;
    //   2702: astore #8
    //   2704: aload #8
    //   2706: ifnull -> 2787
    //   2709: aload #8
    //   2711: invokevirtual isPrimitive : ()Z
    //   2714: ifne -> 2787
    //   2717: goto -> 2724
    //   2720: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2723: athrow
    //   2724: aload #8
    //   2726: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2729: ifnull -> 2787
    //   2732: goto -> 2739
    //   2735: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2738: athrow
    //   2739: aload #8
    //   2741: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2744: invokevirtual getName : ()Ljava/lang/String;
    //   2747: ifnull -> 2787
    //   2750: goto -> 2757
    //   2753: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2756: athrow
    //   2757: aload #8
    //   2759: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2762: invokevirtual getName : ()Ljava/lang/String;
    //   2765: sipush #-30855
    //   2768: sipush #-18731
    //   2771: invokestatic a : (II)Ljava/lang/String;
    //   2774: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2777: ifne -> 2787
    //   2780: goto -> 2787
    //   2783: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2786: athrow
    //   2787: aload #7
    //   2789: iconst_1
    //   2790: invokevirtual setAccessible : (Z)V
    //   2793: aload #7
    //   2795: aconst_null
    //   2796: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2799: pop
    //   2800: iinc #6, 1
    //   2803: iload_2
    //   2804: ifne -> 2665
    //   2807: sipush #-30859
    //   2810: sipush #10913
    //   2813: invokestatic a : (II)Ljava/lang/String;
    //   2816: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2819: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2822: astore #4
    //   2824: aload #4
    //   2826: arraylength
    //   2827: istore #5
    //   2829: iconst_0
    //   2830: istore #6
    //   2832: iload #6
    //   2834: iload #5
    //   2836: if_icmpge -> 2972
    //   2839: aload #4
    //   2841: iload #6
    //   2843: aaload
    //   2844: astore #7
    //   2846: aload #7
    //   2848: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2851: pop
    //   2852: aload #7
    //   2854: invokevirtual getModifiers : ()I
    //   2857: invokestatic isStatic : (I)Z
    //   2860: ifeq -> 2958
    //   2863: aload #7
    //   2865: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2868: arraylength
    //   2869: iconst_2
    //   2870: if_icmpne -> 2958
    //   2873: goto -> 2880
    //   2876: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2879: athrow
    //   2880: aload #7
    //   2882: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2885: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2888: if_acmpne -> 2958
    //   2891: goto -> 2898
    //   2894: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2897: athrow
    //   2898: aload #7
    //   2900: iconst_1
    //   2901: invokevirtual setAccessible : (Z)V
    //   2904: aload #7
    //   2906: aconst_null
    //   2907: iconst_2
    //   2908: anewarray java/lang/Object
    //   2911: dup
    //   2912: iconst_0
    //   2913: aload_0
    //   2914: aastore
    //   2915: dup
    //   2916: iconst_1
    //   2917: aload_1
    //   2918: ifnonnull -> 2936
    //   2921: goto -> 2928
    //   2924: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2927: athrow
    //   2928: aload_1
    //   2929: goto -> 2943
    //   2932: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2935: athrow
    //   2936: aload_1
    //   2937: checkcast [B
    //   2940: invokevirtual clone : ()Ljava/lang/Object;
    //   2943: aastore
    //   2944: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2947: checkcast java/lang/Boolean
    //   2950: invokevirtual booleanValue : ()Z
    //   2953: istore_3
    //   2954: iload_2
    //   2955: ifne -> 2972
    //   2958: iinc #6, 1
    //   2961: iload_2
    //   2962: ifne -> 2832
    //   2965: goto -> 2972
    //   2968: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2971: athrow
    //   2972: iload_3
    //   2973: ifeq -> 2978
    //   2976: iload_3
    //   2977: ireturn
    //   2978: getstatic burp/Zke7.Zl : Ljava/lang/String;
    //   2981: getstatic burp/Zzyr.Za : Ljava/lang/Object;
    //   2984: checkcast java/math/BigInteger
    //   2987: invokevirtual intValue : ()I
    //   2990: bipush #32
    //   2992: irem
    //   2993: invokestatic abs : (I)I
    //   2996: invokevirtual charAt : (I)C
    //   2999: getstatic burp/Zkt7.ZM : Ljava/lang/String;
    //   3002: getstatic burp/Zre5.Zo : Ljava/lang/Object;
    //   3005: checkcast java/math/BigInteger
    //   3008: invokevirtual intValue : ()I
    //   3011: bipush #32
    //   3013: irem
    //   3014: invokestatic abs : (I)I
    //   3017: invokevirtual charAt : (I)C
    //   3020: if_icmpgt -> 3365
    //   3023: sipush #-30868
    //   3026: sipush #908
    //   3029: invokestatic a : (II)Ljava/lang/String;
    //   3032: iconst_1
    //   3033: ldc burp/Ztsj
    //   3035: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3038: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3041: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3044: astore #4
    //   3046: aload #4
    //   3048: arraylength
    //   3049: istore #5
    //   3051: iconst_0
    //   3052: istore #6
    //   3054: iload #6
    //   3056: iload #5
    //   3058: if_icmpge -> 3196
    //   3061: aload #4
    //   3063: iload #6
    //   3065: aaload
    //   3066: astore #7
    //   3068: aload #7
    //   3070: invokevirtual getModifiers : ()I
    //   3073: invokestatic isStatic : (I)Z
    //   3076: ifne -> 3086
    //   3079: goto -> 3189
    //   3082: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3085: athrow
    //   3086: aload #7
    //   3088: invokevirtual getType : ()Ljava/lang/Class;
    //   3091: astore #8
    //   3093: aload #8
    //   3095: ifnull -> 3176
    //   3098: aload #8
    //   3100: invokevirtual isPrimitive : ()Z
    //   3103: ifne -> 3176
    //   3106: goto -> 3113
    //   3109: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3112: athrow
    //   3113: aload #8
    //   3115: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3118: ifnull -> 3176
    //   3121: goto -> 3128
    //   3124: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3127: athrow
    //   3128: aload #8
    //   3130: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3133: invokevirtual getName : ()Ljava/lang/String;
    //   3136: ifnull -> 3176
    //   3139: goto -> 3146
    //   3142: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3145: athrow
    //   3146: aload #8
    //   3148: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3151: invokevirtual getName : ()Ljava/lang/String;
    //   3154: sipush #-30855
    //   3157: sipush #-18731
    //   3160: invokestatic a : (II)Ljava/lang/String;
    //   3163: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3166: ifne -> 3176
    //   3169: goto -> 3176
    //   3172: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3175: athrow
    //   3176: aload #7
    //   3178: iconst_1
    //   3179: invokevirtual setAccessible : (Z)V
    //   3182: aload #7
    //   3184: aconst_null
    //   3185: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3188: pop
    //   3189: iinc #6, 1
    //   3192: iload_2
    //   3193: ifne -> 3054
    //   3196: sipush #-30873
    //   3199: sipush #-17465
    //   3202: invokestatic a : (II)Ljava/lang/String;
    //   3205: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3208: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3211: astore #4
    //   3213: aload #4
    //   3215: arraylength
    //   3216: istore #5
    //   3218: iconst_0
    //   3219: istore #6
    //   3221: iload #6
    //   3223: iload #5
    //   3225: if_icmpge -> 3361
    //   3228: aload #4
    //   3230: iload #6
    //   3232: aaload
    //   3233: astore #7
    //   3235: aload #7
    //   3237: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3240: pop
    //   3241: aload #7
    //   3243: invokevirtual getModifiers : ()I
    //   3246: invokestatic isStatic : (I)Z
    //   3249: ifeq -> 3347
    //   3252: aload #7
    //   3254: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3257: arraylength
    //   3258: iconst_2
    //   3259: if_icmpne -> 3347
    //   3262: goto -> 3269
    //   3265: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3268: athrow
    //   3269: aload #7
    //   3271: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3274: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3277: if_acmpne -> 3347
    //   3280: goto -> 3287
    //   3283: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3286: athrow
    //   3287: aload #7
    //   3289: iconst_1
    //   3290: invokevirtual setAccessible : (Z)V
    //   3293: aload #7
    //   3295: aconst_null
    //   3296: iconst_2
    //   3297: anewarray java/lang/Object
    //   3300: dup
    //   3301: iconst_0
    //   3302: aload_0
    //   3303: aastore
    //   3304: dup
    //   3305: iconst_1
    //   3306: aload_1
    //   3307: ifnonnull -> 3325
    //   3310: goto -> 3317
    //   3313: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3316: athrow
    //   3317: aload_1
    //   3318: goto -> 3332
    //   3321: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3324: athrow
    //   3325: aload_1
    //   3326: checkcast [B
    //   3329: invokevirtual clone : ()Ljava/lang/Object;
    //   3332: aastore
    //   3333: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3336: checkcast java/lang/Boolean
    //   3339: invokevirtual booleanValue : ()Z
    //   3342: istore_3
    //   3343: iload_2
    //   3344: ifne -> 3361
    //   3347: iinc #6, 1
    //   3350: iload_2
    //   3351: ifne -> 3221
    //   3354: goto -> 3361
    //   3357: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3360: athrow
    //   3361: iload_2
    //   3362: ifne -> 3703
    //   3365: sipush #-30857
    //   3368: sipush #26241
    //   3371: invokestatic a : (II)Ljava/lang/String;
    //   3374: iconst_1
    //   3375: ldc burp/Zgvf
    //   3377: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3380: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3383: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3386: astore #4
    //   3388: aload #4
    //   3390: arraylength
    //   3391: istore #5
    //   3393: iconst_0
    //   3394: istore #6
    //   3396: iload #6
    //   3398: iload #5
    //   3400: if_icmpge -> 3538
    //   3403: aload #4
    //   3405: iload #6
    //   3407: aaload
    //   3408: astore #7
    //   3410: aload #7
    //   3412: invokevirtual getModifiers : ()I
    //   3415: invokestatic isStatic : (I)Z
    //   3418: ifne -> 3428
    //   3421: goto -> 3531
    //   3424: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3427: athrow
    //   3428: aload #7
    //   3430: invokevirtual getType : ()Ljava/lang/Class;
    //   3433: astore #8
    //   3435: aload #8
    //   3437: ifnull -> 3518
    //   3440: aload #8
    //   3442: invokevirtual isPrimitive : ()Z
    //   3445: ifne -> 3518
    //   3448: goto -> 3455
    //   3451: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3454: athrow
    //   3455: aload #8
    //   3457: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3460: ifnull -> 3518
    //   3463: goto -> 3470
    //   3466: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3469: athrow
    //   3470: aload #8
    //   3472: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3475: invokevirtual getName : ()Ljava/lang/String;
    //   3478: ifnull -> 3518
    //   3481: goto -> 3488
    //   3484: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3487: athrow
    //   3488: aload #8
    //   3490: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3493: invokevirtual getName : ()Ljava/lang/String;
    //   3496: sipush #-30855
    //   3499: sipush #-18731
    //   3502: invokestatic a : (II)Ljava/lang/String;
    //   3505: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3508: ifne -> 3518
    //   3511: goto -> 3518
    //   3514: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3517: athrow
    //   3518: aload #7
    //   3520: iconst_1
    //   3521: invokevirtual setAccessible : (Z)V
    //   3524: aload #7
    //   3526: aconst_null
    //   3527: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3530: pop
    //   3531: iinc #6, 1
    //   3534: iload_2
    //   3535: ifne -> 3396
    //   3538: sipush #-30876
    //   3541: sipush #9138
    //   3544: invokestatic a : (II)Ljava/lang/String;
    //   3547: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3550: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3553: astore #4
    //   3555: aload #4
    //   3557: arraylength
    //   3558: istore #5
    //   3560: iconst_0
    //   3561: istore #6
    //   3563: iload #6
    //   3565: iload #5
    //   3567: if_icmpge -> 3703
    //   3570: aload #4
    //   3572: iload #6
    //   3574: aaload
    //   3575: astore #7
    //   3577: aload #7
    //   3579: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3582: pop
    //   3583: aload #7
    //   3585: invokevirtual getModifiers : ()I
    //   3588: invokestatic isStatic : (I)Z
    //   3591: ifeq -> 3689
    //   3594: aload #7
    //   3596: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3599: arraylength
    //   3600: iconst_2
    //   3601: if_icmpne -> 3689
    //   3604: goto -> 3611
    //   3607: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3610: athrow
    //   3611: aload #7
    //   3613: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3616: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3619: if_acmpne -> 3689
    //   3622: goto -> 3629
    //   3625: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3628: athrow
    //   3629: aload #7
    //   3631: iconst_1
    //   3632: invokevirtual setAccessible : (Z)V
    //   3635: aload #7
    //   3637: aconst_null
    //   3638: iconst_2
    //   3639: anewarray java/lang/Object
    //   3642: dup
    //   3643: iconst_0
    //   3644: aload_0
    //   3645: aastore
    //   3646: dup
    //   3647: iconst_1
    //   3648: aload_1
    //   3649: ifnonnull -> 3667
    //   3652: goto -> 3659
    //   3655: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3658: athrow
    //   3659: aload_1
    //   3660: goto -> 3674
    //   3663: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3666: athrow
    //   3667: aload_1
    //   3668: checkcast [B
    //   3671: invokevirtual clone : ()Ljava/lang/Object;
    //   3674: aastore
    //   3675: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3678: checkcast java/lang/Boolean
    //   3681: invokevirtual booleanValue : ()Z
    //   3684: istore_3
    //   3685: iload_2
    //   3686: ifne -> 3703
    //   3689: iinc #6, 1
    //   3692: iload_2
    //   3693: ifne -> 3563
    //   3696: goto -> 3703
    //   3699: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3702: athrow
    //   3703: iload_3
    //   3704: ifeq -> 3709
    //   3707: iload_3
    //   3708: ireturn
    //   3709: getstatic burp/Zz6t.Zx : Ljava/lang/String;
    //   3712: getstatic burp/Zz0w.ZF : Ljava/lang/Object;
    //   3715: checkcast java/math/BigInteger
    //   3718: invokevirtual intValue : ()I
    //   3721: bipush #32
    //   3723: irem
    //   3724: invokestatic abs : (I)I
    //   3727: invokevirtual charAt : (I)C
    //   3730: getstatic burp/Zzo5.ZX : Ljava/lang/String;
    //   3733: getstatic burp/Zzr5.Za : Ljava/lang/Object;
    //   3736: checkcast java/math/BigInteger
    //   3739: invokevirtual intValue : ()I
    //   3742: bipush #32
    //   3744: irem
    //   3745: invokestatic abs : (I)I
    //   3748: invokevirtual charAt : (I)C
    //   3751: if_icmple -> 4096
    //   3754: sipush #-30866
    //   3757: sipush #6345
    //   3760: invokestatic a : (II)Ljava/lang/String;
    //   3763: iconst_1
    //   3764: ldc burp/Zl8s
    //   3766: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3769: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3772: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3775: astore #4
    //   3777: aload #4
    //   3779: arraylength
    //   3780: istore #5
    //   3782: iconst_0
    //   3783: istore #6
    //   3785: iload #6
    //   3787: iload #5
    //   3789: if_icmpge -> 3927
    //   3792: aload #4
    //   3794: iload #6
    //   3796: aaload
    //   3797: astore #7
    //   3799: aload #7
    //   3801: invokevirtual getModifiers : ()I
    //   3804: invokestatic isStatic : (I)Z
    //   3807: ifne -> 3817
    //   3810: goto -> 3920
    //   3813: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3816: athrow
    //   3817: aload #7
    //   3819: invokevirtual getType : ()Ljava/lang/Class;
    //   3822: astore #8
    //   3824: aload #8
    //   3826: ifnull -> 3907
    //   3829: aload #8
    //   3831: invokevirtual isPrimitive : ()Z
    //   3834: ifne -> 3907
    //   3837: goto -> 3844
    //   3840: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3843: athrow
    //   3844: aload #8
    //   3846: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3849: ifnull -> 3907
    //   3852: goto -> 3859
    //   3855: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3858: athrow
    //   3859: aload #8
    //   3861: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3864: invokevirtual getName : ()Ljava/lang/String;
    //   3867: ifnull -> 3907
    //   3870: goto -> 3877
    //   3873: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3876: athrow
    //   3877: aload #8
    //   3879: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3882: invokevirtual getName : ()Ljava/lang/String;
    //   3885: sipush #-30855
    //   3888: sipush #-18731
    //   3891: invokestatic a : (II)Ljava/lang/String;
    //   3894: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3897: ifne -> 3907
    //   3900: goto -> 3907
    //   3903: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3906: athrow
    //   3907: aload #7
    //   3909: iconst_1
    //   3910: invokevirtual setAccessible : (Z)V
    //   3913: aload #7
    //   3915: aconst_null
    //   3916: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3919: pop
    //   3920: iinc #6, 1
    //   3923: iload_2
    //   3924: ifne -> 3785
    //   3927: sipush #-30850
    //   3930: sipush #20853
    //   3933: invokestatic a : (II)Ljava/lang/String;
    //   3936: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3939: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3942: astore #4
    //   3944: aload #4
    //   3946: arraylength
    //   3947: istore #5
    //   3949: iconst_0
    //   3950: istore #6
    //   3952: iload #6
    //   3954: iload #5
    //   3956: if_icmpge -> 4092
    //   3959: aload #4
    //   3961: iload #6
    //   3963: aaload
    //   3964: astore #7
    //   3966: aload #7
    //   3968: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3971: pop
    //   3972: aload #7
    //   3974: invokevirtual getModifiers : ()I
    //   3977: invokestatic isStatic : (I)Z
    //   3980: ifeq -> 4078
    //   3983: aload #7
    //   3985: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3988: arraylength
    //   3989: iconst_2
    //   3990: if_icmpne -> 4078
    //   3993: goto -> 4000
    //   3996: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3999: athrow
    //   4000: aload #7
    //   4002: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4005: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4008: if_acmpne -> 4078
    //   4011: goto -> 4018
    //   4014: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4017: athrow
    //   4018: aload #7
    //   4020: iconst_1
    //   4021: invokevirtual setAccessible : (Z)V
    //   4024: aload #7
    //   4026: aconst_null
    //   4027: iconst_2
    //   4028: anewarray java/lang/Object
    //   4031: dup
    //   4032: iconst_0
    //   4033: aload_0
    //   4034: aastore
    //   4035: dup
    //   4036: iconst_1
    //   4037: aload_1
    //   4038: ifnonnull -> 4056
    //   4041: goto -> 4048
    //   4044: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4047: athrow
    //   4048: aload_1
    //   4049: goto -> 4063
    //   4052: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4055: athrow
    //   4056: aload_1
    //   4057: checkcast [B
    //   4060: invokevirtual clone : ()Ljava/lang/Object;
    //   4063: aastore
    //   4064: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4067: checkcast java/lang/Boolean
    //   4070: invokevirtual booleanValue : ()Z
    //   4073: istore_3
    //   4074: iload_2
    //   4075: ifne -> 4092
    //   4078: iinc #6, 1
    //   4081: iload_2
    //   4082: ifne -> 3952
    //   4085: goto -> 4092
    //   4088: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4091: athrow
    //   4092: iload_2
    //   4093: ifne -> 4434
    //   4096: sipush #-30851
    //   4099: sipush #23696
    //   4102: invokestatic a : (II)Ljava/lang/String;
    //   4105: iconst_1
    //   4106: ldc burp/Zejj
    //   4108: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4111: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4114: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4117: astore #4
    //   4119: aload #4
    //   4121: arraylength
    //   4122: istore #5
    //   4124: iconst_0
    //   4125: istore #6
    //   4127: iload #6
    //   4129: iload #5
    //   4131: if_icmpge -> 4269
    //   4134: aload #4
    //   4136: iload #6
    //   4138: aaload
    //   4139: astore #7
    //   4141: aload #7
    //   4143: invokevirtual getModifiers : ()I
    //   4146: invokestatic isStatic : (I)Z
    //   4149: ifne -> 4159
    //   4152: goto -> 4262
    //   4155: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4158: athrow
    //   4159: aload #7
    //   4161: invokevirtual getType : ()Ljava/lang/Class;
    //   4164: astore #8
    //   4166: aload #8
    //   4168: ifnull -> 4249
    //   4171: aload #8
    //   4173: invokevirtual isPrimitive : ()Z
    //   4176: ifne -> 4249
    //   4179: goto -> 4186
    //   4182: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4185: athrow
    //   4186: aload #8
    //   4188: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4191: ifnull -> 4249
    //   4194: goto -> 4201
    //   4197: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4200: athrow
    //   4201: aload #8
    //   4203: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4206: invokevirtual getName : ()Ljava/lang/String;
    //   4209: ifnull -> 4249
    //   4212: goto -> 4219
    //   4215: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4218: athrow
    //   4219: aload #8
    //   4221: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4224: invokevirtual getName : ()Ljava/lang/String;
    //   4227: sipush #-30855
    //   4230: sipush #-18731
    //   4233: invokestatic a : (II)Ljava/lang/String;
    //   4236: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4239: ifne -> 4249
    //   4242: goto -> 4249
    //   4245: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4248: athrow
    //   4249: aload #7
    //   4251: iconst_1
    //   4252: invokevirtual setAccessible : (Z)V
    //   4255: aload #7
    //   4257: aconst_null
    //   4258: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4261: pop
    //   4262: iinc #6, 1
    //   4265: iload_2
    //   4266: ifne -> 4127
    //   4269: sipush #-30854
    //   4272: sipush #606
    //   4275: invokestatic a : (II)Ljava/lang/String;
    //   4278: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4281: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4284: astore #4
    //   4286: aload #4
    //   4288: arraylength
    //   4289: istore #5
    //   4291: iconst_0
    //   4292: istore #6
    //   4294: iload #6
    //   4296: iload #5
    //   4298: if_icmpge -> 4434
    //   4301: aload #4
    //   4303: iload #6
    //   4305: aaload
    //   4306: astore #7
    //   4308: aload #7
    //   4310: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4313: pop
    //   4314: aload #7
    //   4316: invokevirtual getModifiers : ()I
    //   4319: invokestatic isStatic : (I)Z
    //   4322: ifeq -> 4420
    //   4325: aload #7
    //   4327: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4330: arraylength
    //   4331: iconst_2
    //   4332: if_icmpne -> 4420
    //   4335: goto -> 4342
    //   4338: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4341: athrow
    //   4342: aload #7
    //   4344: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4347: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4350: if_acmpne -> 4420
    //   4353: goto -> 4360
    //   4356: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4359: athrow
    //   4360: aload #7
    //   4362: iconst_1
    //   4363: invokevirtual setAccessible : (Z)V
    //   4366: aload #7
    //   4368: aconst_null
    //   4369: iconst_2
    //   4370: anewarray java/lang/Object
    //   4373: dup
    //   4374: iconst_0
    //   4375: aload_0
    //   4376: aastore
    //   4377: dup
    //   4378: iconst_1
    //   4379: aload_1
    //   4380: ifnonnull -> 4398
    //   4383: goto -> 4390
    //   4386: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4389: athrow
    //   4390: aload_1
    //   4391: goto -> 4405
    //   4394: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4397: athrow
    //   4398: aload_1
    //   4399: checkcast [B
    //   4402: invokevirtual clone : ()Ljava/lang/Object;
    //   4405: aastore
    //   4406: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4409: checkcast java/lang/Boolean
    //   4412: invokevirtual booleanValue : ()Z
    //   4415: istore_3
    //   4416: iload_2
    //   4417: ifne -> 4434
    //   4420: iinc #6, 1
    //   4423: iload_2
    //   4424: ifne -> 4294
    //   4427: goto -> 4434
    //   4430: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4433: athrow
    //   4434: iload_3
    //   4435: ireturn
    //   4436: astore_3
    //   4437: new java/lang/Exception
    //   4440: dup
    //   4441: aload_3
    //   4442: invokevirtual getMessage : ()Ljava/lang/String;
    //   4445: invokespecial <init> : (Ljava/lang/String;)V
    //   4448: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1515	4436	java/lang/Throwable
    //   209	237	240	java/lang/Throwable
    //   219	254	257	java/lang/Throwable
    //   244	282	285	java/lang/Throwable
    //   261	299	302	java/lang/Throwable
    //   289	327	330	java/lang/Throwable
    //   306	344	347	java/lang/Throwable
    //   334	362	365	java/lang/Throwable
    //   351	376	379	java/lang/Throwable
    //   497	511	511	java/lang/Throwable
    //   522	535	538	java/lang/Throwable
    //   527	550	553	java/lang/Throwable
    //   542	568	571	java/lang/Throwable
    //   557	598	601	java/lang/Throwable
    //   661	688	691	java/lang/Throwable
    //   678	709	712	java/lang/Throwable
    //   695	739	742	java/lang/Throwable
    //   716	750	750	java/lang/Throwable
    //   761	777	780	java/lang/Throwable
    //   876	890	890	java/lang/Throwable
    //   901	914	917	java/lang/Throwable
    //   906	929	932	java/lang/Throwable
    //   921	947	950	java/lang/Throwable
    //   936	977	980	java/lang/Throwable
    //   1043	1070	1073	java/lang/Throwable
    //   1060	1088	1091	java/lang/Throwable
    //   1077	1118	1121	java/lang/Throwable
    //   1095	1129	1129	java/lang/Throwable
    //   1151	1162	1165	java/lang/Throwable
    //   1217	1231	1231	java/lang/Throwable
    //   1242	1255	1258	java/lang/Throwable
    //   1247	1270	1273	java/lang/Throwable
    //   1262	1288	1291	java/lang/Throwable
    //   1277	1318	1321	java/lang/Throwable
    //   1384	1411	1414	java/lang/Throwable
    //   1401	1429	1432	java/lang/Throwable
    //   1418	1459	1462	java/lang/Throwable
    //   1436	1470	1470	java/lang/Throwable
    //   1492	1503	1506	java/lang/Throwable
    //   1516	2246	4436	java/lang/Throwable
    //   1606	1620	1620	java/lang/Throwable
    //   1631	1644	1647	java/lang/Throwable
    //   1636	1659	1662	java/lang/Throwable
    //   1651	1677	1680	java/lang/Throwable
    //   1666	1707	1710	java/lang/Throwable
    //   1773	1800	1803	java/lang/Throwable
    //   1790	1818	1821	java/lang/Throwable
    //   1807	1848	1851	java/lang/Throwable
    //   1825	1859	1859	java/lang/Throwable
    //   1881	1892	1895	java/lang/Throwable
    //   1948	1962	1962	java/lang/Throwable
    //   1973	1986	1989	java/lang/Throwable
    //   1978	2001	2004	java/lang/Throwable
    //   1993	2019	2022	java/lang/Throwable
    //   2008	2049	2052	java/lang/Throwable
    //   2115	2142	2145	java/lang/Throwable
    //   2132	2160	2163	java/lang/Throwable
    //   2149	2190	2193	java/lang/Throwable
    //   2167	2201	2201	java/lang/Throwable
    //   2223	2234	2237	java/lang/Throwable
    //   2247	2977	4436	java/lang/Throwable
    //   2337	2351	2351	java/lang/Throwable
    //   2362	2375	2378	java/lang/Throwable
    //   2367	2390	2393	java/lang/Throwable
    //   2382	2408	2411	java/lang/Throwable
    //   2397	2438	2441	java/lang/Throwable
    //   2504	2531	2534	java/lang/Throwable
    //   2521	2549	2552	java/lang/Throwable
    //   2538	2579	2582	java/lang/Throwable
    //   2556	2590	2590	java/lang/Throwable
    //   2612	2623	2626	java/lang/Throwable
    //   2679	2693	2693	java/lang/Throwable
    //   2704	2717	2720	java/lang/Throwable
    //   2709	2732	2735	java/lang/Throwable
    //   2724	2750	2753	java/lang/Throwable
    //   2739	2780	2783	java/lang/Throwable
    //   2846	2873	2876	java/lang/Throwable
    //   2863	2891	2894	java/lang/Throwable
    //   2880	2921	2924	java/lang/Throwable
    //   2898	2932	2932	java/lang/Throwable
    //   2954	2965	2968	java/lang/Throwable
    //   2978	3708	4436	java/lang/Throwable
    //   3068	3082	3082	java/lang/Throwable
    //   3093	3106	3109	java/lang/Throwable
    //   3098	3121	3124	java/lang/Throwable
    //   3113	3139	3142	java/lang/Throwable
    //   3128	3169	3172	java/lang/Throwable
    //   3235	3262	3265	java/lang/Throwable
    //   3252	3280	3283	java/lang/Throwable
    //   3269	3310	3313	java/lang/Throwable
    //   3287	3321	3321	java/lang/Throwable
    //   3343	3354	3357	java/lang/Throwable
    //   3410	3424	3424	java/lang/Throwable
    //   3435	3448	3451	java/lang/Throwable
    //   3440	3463	3466	java/lang/Throwable
    //   3455	3481	3484	java/lang/Throwable
    //   3470	3511	3514	java/lang/Throwable
    //   3577	3604	3607	java/lang/Throwable
    //   3594	3622	3625	java/lang/Throwable
    //   3611	3652	3655	java/lang/Throwable
    //   3629	3663	3663	java/lang/Throwable
    //   3685	3696	3699	java/lang/Throwable
    //   3709	4435	4436	java/lang/Throwable
    //   3799	3813	3813	java/lang/Throwable
    //   3824	3837	3840	java/lang/Throwable
    //   3829	3852	3855	java/lang/Throwable
    //   3844	3870	3873	java/lang/Throwable
    //   3859	3900	3903	java/lang/Throwable
    //   3966	3993	3996	java/lang/Throwable
    //   3983	4011	4014	java/lang/Throwable
    //   4000	4041	4044	java/lang/Throwable
    //   4018	4052	4052	java/lang/Throwable
    //   4074	4085	4088	java/lang/Throwable
    //   4141	4155	4155	java/lang/Throwable
    //   4166	4179	4182	java/lang/Throwable
    //   4171	4194	4197	java/lang/Throwable
    //   4186	4212	4215	java/lang/Throwable
    //   4201	4242	4245	java/lang/Throwable
    //   4308	4335	4338	java/lang/Throwable
    //   4325	4353	4356	java/lang/Throwable
    //   4342	4383	4386	java/lang/Throwable
    //   4360	4394	4394	java/lang/Throwable
    //   4416	4427	4430	java/lang/Throwable
  }
  
  static void ZO(Object paramObject) {
    ZW = a(-30875, -2458);
    Za = new BigInteger(a(-30849, -15296));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Ztdd.ZA.charAt(Math.abs(((BigInteger)Zr1z.Zi).intValue() % 32)) > Zl06.ZL.charAt(Math.abs(((BigInteger)Zk7f.Za).intValue() % 32))) {
          try {
            Zttq.Zu(Class.forName(a(-30867, 7827)));
            if (!bool)
              Zkll.ZK(Class.forName(a(-30878, -13917))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zkll.ZK(Class.forName(a(-30878, -13917)));
    } catch (Throwable throwable) {}
  }
  
  static void ZL(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ck{väãÖ²ÕA¡\\t>Ð\º Z\\t¾KÀrcý\\t^ÜÊt0\\tkDzÄ_ \\r\\t2¬Q¡ü½uË\\tur¹U¼A¯M´J¡[JÄcßzsGJfÕôðÒ77o8CFk \\b3éHsbØ3MI¥ºò÷;d}(«\\tÈÝV³FÞJIÿÑ¹vÚ=hI*\\tpoö¨óþð\\tºÅ@£YçX\\t®éÂ&Óéí@ ;G*oñ¨PÅ ôq'\\tXÇwüP¹ú`¼©XØa8\\tñ&)ß®ÖS5¹K÷r\\t-ø²Ý­8v\\bK~D|\\t"\\t+rªÅx(¹ [×íð=°>%M¯ õÿ0:sÅÚRg¾C\\rYÑ-o\\tç[ëpö#_\\ti6ëê!\\t·^áÐ·7`IÓ\\t,Ù|¬hu\\tÓçawmËÃ\\tæ-Ë¾òúÉ¸Ù\\tôpºÀq¸\\b¤x"eñ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #71
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
    //   68: ldc 'Øbªñxµ!®\\t6Dw5Ã-Qí6'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #8
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
    //   129: putstatic burp/Zsxo.a : [Ljava/lang/String;
    //   132: bipush #29
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zsxo.b : [Ljava/lang/String;
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
    //   212: bipush #109
    //   214: goto -> 244
    //   217: bipush #73
    //   219: goto -> 244
    //   222: bipush #73
    //   224: goto -> 244
    //   227: bipush #54
    //   229: goto -> 244
    //   232: bipush #31
    //   234: goto -> 244
    //   237: bipush #96
    //   239: goto -> 244
    //   242: bipush #67
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
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #85
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #71
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #112
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-57
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #69
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-110
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-99
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #-92
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #-24
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #-113
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #126
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #124
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #-18
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #-104
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #119
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #13
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #-11
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #-112
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #-67
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #-2
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #-45
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #68
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #-111
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #-106
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #-117
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #48
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #-37
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #38
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #-102
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #-57
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #-43
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #-50
    //   493: bastore
    //   494: invokespecial <init> : ([B)V
    //   497: putstatic burp/Zsxo.Za : Ljava/lang/Object;
    //   500: sipush #-30853
    //   503: sipush #-6507
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zsxo.ZW : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8777) & 0xFFFF;
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
      byte b1 = 52;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsxo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */