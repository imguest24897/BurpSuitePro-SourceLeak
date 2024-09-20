package burp;

import java.math.BigInteger;

class Zs2n extends ClassLoader {
  static Object ZK;
  
  static String ZI;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZA(Object paramObject) {
    Zxo7.Zl = a(-11914, 29008);
    Zxo7.Zi = new BigInteger(a(-11919, -20933));
  }
  
  static boolean Zn(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zeuc.Zd : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zxjk.Zk : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zzgh.ZV : Ljava/lang/Object;
    //   22: sipush #-11932
    //   25: getstatic burp/Zrjg.ZG : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: getstatic burp/Zrpu.Zi : Ljava/lang/Object;
    //   34: checkcast java/math/BigInteger
    //   37: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   40: putstatic burp/Zt0t.ZL : Ljava/lang/Object;
    //   43: sipush #-4965
    //   46: getstatic burp/Zt98.Zz : Ljava/lang/Object;
    //   49: checkcast java/math/BigInteger
    //   52: getstatic burp/Zxn5.Zd : Ljava/lang/Object;
    //   55: checkcast java/math/BigInteger
    //   58: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   61: putstatic burp/Zmhi.ZZ : Ljava/lang/Object;
    //   64: invokestatic a : (II)Ljava/lang/String;
    //   67: iconst_1
    //   68: ldc burp/Zrc0
    //   70: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   73: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   76: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   79: astore_3
    //   80: aload_3
    //   81: arraylength
    //   82: istore #4
    //   84: iconst_0
    //   85: istore #5
    //   87: iload #5
    //   89: iload #4
    //   91: if_icmpge -> 228
    //   94: aload_3
    //   95: iload #5
    //   97: aaload
    //   98: astore #6
    //   100: aload #6
    //   102: invokevirtual getModifiers : ()I
    //   105: invokestatic isStatic : (I)Z
    //   108: ifne -> 118
    //   111: goto -> 221
    //   114: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   117: athrow
    //   118: aload #6
    //   120: invokevirtual getType : ()Ljava/lang/Class;
    //   123: astore #7
    //   125: aload #7
    //   127: ifnull -> 208
    //   130: aload #7
    //   132: invokevirtual isPrimitive : ()Z
    //   135: ifne -> 208
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   144: athrow
    //   145: aload #7
    //   147: invokevirtual getPackage : ()Ljava/lang/Package;
    //   150: ifnull -> 208
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   159: athrow
    //   160: aload #7
    //   162: invokevirtual getPackage : ()Ljava/lang/Package;
    //   165: invokevirtual getName : ()Ljava/lang/String;
    //   168: ifnull -> 208
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   177: athrow
    //   178: aload #7
    //   180: invokevirtual getPackage : ()Ljava/lang/Package;
    //   183: invokevirtual getName : ()Ljava/lang/String;
    //   186: sipush #-11924
    //   189: sipush #-15511
    //   192: invokestatic a : (II)Ljava/lang/String;
    //   195: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   198: ifne -> 208
    //   201: goto -> 208
    //   204: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   207: athrow
    //   208: aload #6
    //   210: iconst_1
    //   211: invokevirtual setAccessible : (Z)V
    //   214: aload #6
    //   216: aconst_null
    //   217: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   220: pop
    //   221: iinc #5, 1
    //   224: iload_2
    //   225: ifeq -> 87
    //   228: sipush #-11923
    //   231: sipush #-23340
    //   234: invokestatic a : (II)Ljava/lang/String;
    //   237: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   240: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   243: astore_3
    //   244: aload_3
    //   245: arraylength
    //   246: istore #4
    //   248: iconst_0
    //   249: istore #5
    //   251: iload #5
    //   253: iload #4
    //   255: if_icmpge -> 387
    //   258: aload_3
    //   259: iload #5
    //   261: aaload
    //   262: astore #6
    //   264: aload #6
    //   266: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   269: pop
    //   270: aload #6
    //   272: invokevirtual getModifiers : ()I
    //   275: invokestatic isStatic : (I)Z
    //   278: ifeq -> 373
    //   281: aload #6
    //   283: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   286: arraylength
    //   287: iconst_2
    //   288: if_icmpne -> 373
    //   291: goto -> 298
    //   294: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   297: athrow
    //   298: aload #6
    //   300: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   303: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   306: invokevirtual equals : (Ljava/lang/Object;)Z
    //   309: ifeq -> 373
    //   312: goto -> 319
    //   315: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   318: athrow
    //   319: aload #6
    //   321: iconst_1
    //   322: invokevirtual setAccessible : (Z)V
    //   325: aload #6
    //   327: aconst_null
    //   328: iconst_2
    //   329: anewarray java/lang/Object
    //   332: dup
    //   333: iconst_0
    //   334: aload_0
    //   335: aastore
    //   336: dup
    //   337: iconst_1
    //   338: aload_1
    //   339: ifnonnull -> 357
    //   342: goto -> 349
    //   345: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   348: athrow
    //   349: aload_1
    //   350: goto -> 364
    //   353: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   356: athrow
    //   357: aload_1
    //   358: checkcast [B
    //   361: invokevirtual clone : ()Ljava/lang/Object;
    //   364: aastore
    //   365: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   368: pop
    //   369: iload_2
    //   370: ifeq -> 387
    //   373: iinc #5, 1
    //   376: iload_2
    //   377: ifeq -> 251
    //   380: goto -> 387
    //   383: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   386: athrow
    //   387: getstatic burp/Zstb.ZC : Ljava/lang/Object;
    //   390: checkcast java/math/BigInteger
    //   393: invokevirtual toByteArray : ()[B
    //   396: astore_3
    //   397: aload_3
    //   398: arraylength
    //   399: iconst_2
    //   400: iadd
    //   401: newarray byte
    //   403: astore #5
    //   405: iconst_0
    //   406: istore #6
    //   408: iload #6
    //   410: aload_3
    //   411: arraylength
    //   412: if_icmpge -> 431
    //   415: aload #5
    //   417: iload #6
    //   419: aload_3
    //   420: iload #6
    //   422: baload
    //   423: bastore
    //   424: iinc #6, 1
    //   427: iload_2
    //   428: ifeq -> 408
    //   431: aload #5
    //   433: arraylength
    //   434: iconst_3
    //   435: idiv
    //   436: iconst_4
    //   437: imul
    //   438: newarray byte
    //   440: astore #4
    //   442: iconst_0
    //   443: istore #6
    //   445: iconst_0
    //   446: istore #7
    //   448: iload #6
    //   450: aload_3
    //   451: arraylength
    //   452: if_icmpge -> 563
    //   455: aload #4
    //   457: iload #7
    //   459: aload #5
    //   461: iload #6
    //   463: baload
    //   464: iconst_2
    //   465: iushr
    //   466: bipush #63
    //   468: iand
    //   469: i2b
    //   470: bastore
    //   471: aload #4
    //   473: iload #7
    //   475: iconst_1
    //   476: iadd
    //   477: aload #5
    //   479: iload #6
    //   481: iconst_1
    //   482: iadd
    //   483: baload
    //   484: iconst_4
    //   485: iushr
    //   486: bipush #15
    //   488: iand
    //   489: aload #5
    //   491: iload #6
    //   493: baload
    //   494: iconst_4
    //   495: ishl
    //   496: bipush #63
    //   498: iand
    //   499: ior
    //   500: i2b
    //   501: bastore
    //   502: aload #4
    //   504: iload #7
    //   506: iconst_2
    //   507: iadd
    //   508: aload #5
    //   510: iload #6
    //   512: iconst_2
    //   513: iadd
    //   514: baload
    //   515: bipush #6
    //   517: iushr
    //   518: iconst_3
    //   519: iand
    //   520: aload #5
    //   522: iload #6
    //   524: iconst_1
    //   525: iadd
    //   526: baload
    //   527: iconst_2
    //   528: ishl
    //   529: bipush #63
    //   531: iand
    //   532: ior
    //   533: i2b
    //   534: bastore
    //   535: aload #4
    //   537: iload #7
    //   539: iconst_3
    //   540: iadd
    //   541: aload #5
    //   543: iload #6
    //   545: iconst_2
    //   546: iadd
    //   547: baload
    //   548: bipush #63
    //   550: iand
    //   551: i2b
    //   552: bastore
    //   553: iinc #6, 3
    //   556: iinc #7, 4
    //   559: iload_2
    //   560: ifeq -> 448
    //   563: iconst_0
    //   564: istore #6
    //   566: iload #6
    //   568: aload #4
    //   570: arraylength
    //   571: if_icmpge -> 755
    //   574: aload #4
    //   576: iload #6
    //   578: baload
    //   579: bipush #26
    //   581: if_icmpge -> 609
    //   584: aload #4
    //   586: iload #6
    //   588: aload #4
    //   590: iload #6
    //   592: baload
    //   593: bipush #65
    //   595: iadd
    //   596: i2b
    //   597: bastore
    //   598: iload_2
    //   599: ifeq -> 748
    //   602: goto -> 609
    //   605: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   608: athrow
    //   609: aload #4
    //   611: iload #6
    //   613: baload
    //   614: bipush #52
    //   616: if_icmpge -> 654
    //   619: goto -> 626
    //   622: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   625: athrow
    //   626: aload #4
    //   628: iload #6
    //   630: aload #4
    //   632: iload #6
    //   634: baload
    //   635: bipush #97
    //   637: iadd
    //   638: bipush #26
    //   640: isub
    //   641: i2b
    //   642: bastore
    //   643: iload_2
    //   644: ifeq -> 748
    //   647: goto -> 654
    //   650: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   653: athrow
    //   654: aload #4
    //   656: iload #6
    //   658: baload
    //   659: bipush #62
    //   661: if_icmpge -> 699
    //   664: goto -> 671
    //   667: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   670: athrow
    //   671: aload #4
    //   673: iload #6
    //   675: aload #4
    //   677: iload #6
    //   679: baload
    //   680: bipush #48
    //   682: iadd
    //   683: bipush #52
    //   685: isub
    //   686: i2b
    //   687: bastore
    //   688: iload_2
    //   689: ifeq -> 748
    //   692: goto -> 699
    //   695: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   698: athrow
    //   699: aload #4
    //   701: iload #6
    //   703: baload
    //   704: bipush #63
    //   706: if_icmpge -> 734
    //   709: goto -> 716
    //   712: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   715: athrow
    //   716: aload #4
    //   718: iload #6
    //   720: bipush #43
    //   722: bastore
    //   723: iload_2
    //   724: ifeq -> 748
    //   727: goto -> 734
    //   730: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   733: athrow
    //   734: aload #4
    //   736: iload #6
    //   738: bipush #47
    //   740: bastore
    //   741: goto -> 748
    //   744: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   747: athrow
    //   748: iinc #6, 1
    //   751: iload_2
    //   752: ifeq -> 566
    //   755: aload #4
    //   757: arraylength
    //   758: iconst_1
    //   759: isub
    //   760: istore #6
    //   762: iload #6
    //   764: aload_3
    //   765: arraylength
    //   766: iconst_4
    //   767: imul
    //   768: iconst_3
    //   769: idiv
    //   770: if_icmple -> 787
    //   773: aload #4
    //   775: iload #6
    //   777: bipush #61
    //   779: bastore
    //   780: iinc #6, -1
    //   783: iload_2
    //   784: ifeq -> 762
    //   787: iconst_0
    //   788: istore_3
    //   789: getstatic burp/Zke7.Zl : Ljava/lang/String;
    //   792: getstatic burp/Ze8i.Zq : Ljava/lang/Object;
    //   795: checkcast java/math/BigInteger
    //   798: invokevirtual intValue : ()I
    //   801: bipush #32
    //   803: irem
    //   804: invokestatic abs : (I)I
    //   807: invokevirtual charAt : (I)C
    //   810: getstatic burp/Ztex.Zx : Ljava/lang/String;
    //   813: getstatic burp/Zlhy.ZN : Ljava/lang/Object;
    //   816: checkcast java/math/BigInteger
    //   819: invokevirtual intValue : ()I
    //   822: bipush #32
    //   824: irem
    //   825: invokestatic abs : (I)I
    //   828: invokevirtual charAt : (I)C
    //   831: if_icmple -> 1175
    //   834: sipush #-11934
    //   837: sipush #-27493
    //   840: invokestatic a : (II)Ljava/lang/String;
    //   843: iconst_1
    //   844: ldc burp/Zm8i
    //   846: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   849: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   852: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   855: astore #4
    //   857: aload #4
    //   859: arraylength
    //   860: istore #5
    //   862: iconst_0
    //   863: istore #6
    //   865: iload #6
    //   867: iload #5
    //   869: if_icmpge -> 1007
    //   872: aload #4
    //   874: iload #6
    //   876: aaload
    //   877: astore #7
    //   879: aload #7
    //   881: invokevirtual getModifiers : ()I
    //   884: invokestatic isStatic : (I)Z
    //   887: ifne -> 897
    //   890: goto -> 1000
    //   893: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   896: athrow
    //   897: aload #7
    //   899: invokevirtual getType : ()Ljava/lang/Class;
    //   902: astore #8
    //   904: aload #8
    //   906: ifnull -> 987
    //   909: aload #8
    //   911: invokevirtual isPrimitive : ()Z
    //   914: ifne -> 987
    //   917: goto -> 924
    //   920: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   923: athrow
    //   924: aload #8
    //   926: invokevirtual getPackage : ()Ljava/lang/Package;
    //   929: ifnull -> 987
    //   932: goto -> 939
    //   935: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   938: athrow
    //   939: aload #8
    //   941: invokevirtual getPackage : ()Ljava/lang/Package;
    //   944: invokevirtual getName : ()Ljava/lang/String;
    //   947: ifnull -> 987
    //   950: goto -> 957
    //   953: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   956: athrow
    //   957: aload #8
    //   959: invokevirtual getPackage : ()Ljava/lang/Package;
    //   962: invokevirtual getName : ()Ljava/lang/String;
    //   965: sipush #-11936
    //   968: sipush #-12197
    //   971: invokestatic a : (II)Ljava/lang/String;
    //   974: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   977: ifne -> 987
    //   980: goto -> 987
    //   983: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   986: athrow
    //   987: aload #7
    //   989: iconst_1
    //   990: invokevirtual setAccessible : (Z)V
    //   993: aload #7
    //   995: aconst_null
    //   996: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   999: pop
    //   1000: iinc #6, 1
    //   1003: iload_2
    //   1004: ifeq -> 865
    //   1007: sipush #-11929
    //   1010: sipush #2771
    //   1013: invokestatic a : (II)Ljava/lang/String;
    //   1016: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1019: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1022: astore #4
    //   1024: aload #4
    //   1026: arraylength
    //   1027: istore #5
    //   1029: iconst_0
    //   1030: istore #6
    //   1032: iload #6
    //   1034: iload #5
    //   1036: if_icmpge -> 1172
    //   1039: aload #4
    //   1041: iload #6
    //   1043: aaload
    //   1044: astore #7
    //   1046: aload #7
    //   1048: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1051: pop
    //   1052: aload #7
    //   1054: invokevirtual getModifiers : ()I
    //   1057: invokestatic isStatic : (I)Z
    //   1060: ifeq -> 1158
    //   1063: aload #7
    //   1065: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1068: arraylength
    //   1069: iconst_2
    //   1070: if_icmpne -> 1158
    //   1073: goto -> 1080
    //   1076: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1079: athrow
    //   1080: aload #7
    //   1082: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1085: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1088: if_acmpne -> 1158
    //   1091: goto -> 1098
    //   1094: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1097: athrow
    //   1098: aload #7
    //   1100: iconst_1
    //   1101: invokevirtual setAccessible : (Z)V
    //   1104: aload #7
    //   1106: aconst_null
    //   1107: iconst_2
    //   1108: anewarray java/lang/Object
    //   1111: dup
    //   1112: iconst_0
    //   1113: aload_0
    //   1114: aastore
    //   1115: dup
    //   1116: iconst_1
    //   1117: aload_1
    //   1118: ifnonnull -> 1136
    //   1121: goto -> 1128
    //   1124: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1127: athrow
    //   1128: aload_1
    //   1129: goto -> 1143
    //   1132: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1135: athrow
    //   1136: aload_1
    //   1137: checkcast [B
    //   1140: invokevirtual clone : ()Ljava/lang/Object;
    //   1143: aastore
    //   1144: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1147: checkcast java/lang/Boolean
    //   1150: invokevirtual booleanValue : ()Z
    //   1153: istore_3
    //   1154: iload_2
    //   1155: ifeq -> 1172
    //   1158: iinc #6, 1
    //   1161: iload_2
    //   1162: ifeq -> 1032
    //   1165: goto -> 1172
    //   1168: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1171: athrow
    //   1172: goto -> 1513
    //   1175: sipush #-11915
    //   1178: sipush #15644
    //   1181: invokestatic a : (II)Ljava/lang/String;
    //   1184: iconst_1
    //   1185: ldc burp/Zzc_
    //   1187: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1190: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1193: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1196: astore #4
    //   1198: aload #4
    //   1200: arraylength
    //   1201: istore #5
    //   1203: iconst_0
    //   1204: istore #6
    //   1206: iload #6
    //   1208: iload #5
    //   1210: if_icmpge -> 1348
    //   1213: aload #4
    //   1215: iload #6
    //   1217: aaload
    //   1218: astore #7
    //   1220: aload #7
    //   1222: invokevirtual getModifiers : ()I
    //   1225: invokestatic isStatic : (I)Z
    //   1228: ifne -> 1238
    //   1231: goto -> 1341
    //   1234: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1237: athrow
    //   1238: aload #7
    //   1240: invokevirtual getType : ()Ljava/lang/Class;
    //   1243: astore #8
    //   1245: aload #8
    //   1247: ifnull -> 1328
    //   1250: aload #8
    //   1252: invokevirtual isPrimitive : ()Z
    //   1255: ifne -> 1328
    //   1258: goto -> 1265
    //   1261: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1264: athrow
    //   1265: aload #8
    //   1267: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1270: ifnull -> 1328
    //   1273: goto -> 1280
    //   1276: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1279: athrow
    //   1280: aload #8
    //   1282: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1285: invokevirtual getName : ()Ljava/lang/String;
    //   1288: ifnull -> 1328
    //   1291: goto -> 1298
    //   1294: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1297: athrow
    //   1298: aload #8
    //   1300: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1303: invokevirtual getName : ()Ljava/lang/String;
    //   1306: sipush #-11936
    //   1309: sipush #-12197
    //   1312: invokestatic a : (II)Ljava/lang/String;
    //   1315: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1318: ifne -> 1328
    //   1321: goto -> 1328
    //   1324: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1327: athrow
    //   1328: aload #7
    //   1330: iconst_1
    //   1331: invokevirtual setAccessible : (Z)V
    //   1334: aload #7
    //   1336: aconst_null
    //   1337: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1340: pop
    //   1341: iinc #6, 1
    //   1344: iload_2
    //   1345: ifeq -> 1206
    //   1348: sipush #-11927
    //   1351: sipush #3576
    //   1354: invokestatic a : (II)Ljava/lang/String;
    //   1357: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1360: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1363: astore #4
    //   1365: aload #4
    //   1367: arraylength
    //   1368: istore #5
    //   1370: iconst_0
    //   1371: istore #6
    //   1373: iload #6
    //   1375: iload #5
    //   1377: if_icmpge -> 1513
    //   1380: aload #4
    //   1382: iload #6
    //   1384: aaload
    //   1385: astore #7
    //   1387: aload #7
    //   1389: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1392: pop
    //   1393: aload #7
    //   1395: invokevirtual getModifiers : ()I
    //   1398: invokestatic isStatic : (I)Z
    //   1401: ifeq -> 1499
    //   1404: aload #7
    //   1406: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1409: arraylength
    //   1410: iconst_2
    //   1411: if_icmpne -> 1499
    //   1414: goto -> 1421
    //   1417: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1420: athrow
    //   1421: aload #7
    //   1423: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1426: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1429: if_acmpne -> 1499
    //   1432: goto -> 1439
    //   1435: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1438: athrow
    //   1439: aload #7
    //   1441: iconst_1
    //   1442: invokevirtual setAccessible : (Z)V
    //   1445: aload #7
    //   1447: aconst_null
    //   1448: iconst_2
    //   1449: anewarray java/lang/Object
    //   1452: dup
    //   1453: iconst_0
    //   1454: aload_0
    //   1455: aastore
    //   1456: dup
    //   1457: iconst_1
    //   1458: aload_1
    //   1459: ifnonnull -> 1477
    //   1462: goto -> 1469
    //   1465: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1468: athrow
    //   1469: aload_1
    //   1470: goto -> 1484
    //   1473: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1476: athrow
    //   1477: aload_1
    //   1478: checkcast [B
    //   1481: invokevirtual clone : ()Ljava/lang/Object;
    //   1484: aastore
    //   1485: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1488: checkcast java/lang/Boolean
    //   1491: invokevirtual booleanValue : ()Z
    //   1494: istore_3
    //   1495: iload_2
    //   1496: ifeq -> 1513
    //   1499: iinc #6, 1
    //   1502: iload_2
    //   1503: ifeq -> 1373
    //   1506: goto -> 1513
    //   1509: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1512: athrow
    //   1513: iload_3
    //   1514: ifeq -> 1519
    //   1517: iload_3
    //   1518: ireturn
    //   1519: getstatic burp/Zs8s.Za : Ljava/lang/String;
    //   1522: getstatic burp/Zxg7.Zy : Ljava/lang/Object;
    //   1525: checkcast java/math/BigInteger
    //   1528: invokevirtual intValue : ()I
    //   1531: bipush #32
    //   1533: irem
    //   1534: invokestatic abs : (I)I
    //   1537: invokevirtual charAt : (I)C
    //   1540: getstatic burp/Zb8y.Zn : Ljava/lang/String;
    //   1543: getstatic burp/Ze64.ZW : Ljava/lang/Object;
    //   1546: checkcast java/math/BigInteger
    //   1549: invokevirtual intValue : ()I
    //   1552: bipush #32
    //   1554: irem
    //   1555: invokestatic abs : (I)I
    //   1558: invokevirtual charAt : (I)C
    //   1561: if_icmpgt -> 1906
    //   1564: sipush #-11926
    //   1567: sipush #-32397
    //   1570: invokestatic a : (II)Ljava/lang/String;
    //   1573: iconst_1
    //   1574: ldc burp/Zmy4
    //   1576: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1579: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1582: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1585: astore #4
    //   1587: aload #4
    //   1589: arraylength
    //   1590: istore #5
    //   1592: iconst_0
    //   1593: istore #6
    //   1595: iload #6
    //   1597: iload #5
    //   1599: if_icmpge -> 1737
    //   1602: aload #4
    //   1604: iload #6
    //   1606: aaload
    //   1607: astore #7
    //   1609: aload #7
    //   1611: invokevirtual getModifiers : ()I
    //   1614: invokestatic isStatic : (I)Z
    //   1617: ifne -> 1627
    //   1620: goto -> 1730
    //   1623: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1626: athrow
    //   1627: aload #7
    //   1629: invokevirtual getType : ()Ljava/lang/Class;
    //   1632: astore #8
    //   1634: aload #8
    //   1636: ifnull -> 1717
    //   1639: aload #8
    //   1641: invokevirtual isPrimitive : ()Z
    //   1644: ifne -> 1717
    //   1647: goto -> 1654
    //   1650: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1653: athrow
    //   1654: aload #8
    //   1656: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1659: ifnull -> 1717
    //   1662: goto -> 1669
    //   1665: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1668: athrow
    //   1669: aload #8
    //   1671: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1674: invokevirtual getName : ()Ljava/lang/String;
    //   1677: ifnull -> 1717
    //   1680: goto -> 1687
    //   1683: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1686: athrow
    //   1687: aload #8
    //   1689: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1692: invokevirtual getName : ()Ljava/lang/String;
    //   1695: sipush #-11936
    //   1698: sipush #-12197
    //   1701: invokestatic a : (II)Ljava/lang/String;
    //   1704: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1707: ifne -> 1717
    //   1710: goto -> 1717
    //   1713: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1716: athrow
    //   1717: aload #7
    //   1719: iconst_1
    //   1720: invokevirtual setAccessible : (Z)V
    //   1723: aload #7
    //   1725: aconst_null
    //   1726: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1729: pop
    //   1730: iinc #6, 1
    //   1733: iload_2
    //   1734: ifeq -> 1595
    //   1737: sipush #-11920
    //   1740: sipush #18281
    //   1743: invokestatic a : (II)Ljava/lang/String;
    //   1746: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1749: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1752: astore #4
    //   1754: aload #4
    //   1756: arraylength
    //   1757: istore #5
    //   1759: iconst_0
    //   1760: istore #6
    //   1762: iload #6
    //   1764: iload #5
    //   1766: if_icmpge -> 1902
    //   1769: aload #4
    //   1771: iload #6
    //   1773: aaload
    //   1774: astore #7
    //   1776: aload #7
    //   1778: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1781: pop
    //   1782: aload #7
    //   1784: invokevirtual getModifiers : ()I
    //   1787: invokestatic isStatic : (I)Z
    //   1790: ifeq -> 1888
    //   1793: aload #7
    //   1795: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1798: arraylength
    //   1799: iconst_2
    //   1800: if_icmpne -> 1888
    //   1803: goto -> 1810
    //   1806: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1809: athrow
    //   1810: aload #7
    //   1812: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1815: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1818: if_acmpne -> 1888
    //   1821: goto -> 1828
    //   1824: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1827: athrow
    //   1828: aload #7
    //   1830: iconst_1
    //   1831: invokevirtual setAccessible : (Z)V
    //   1834: aload #7
    //   1836: aconst_null
    //   1837: iconst_2
    //   1838: anewarray java/lang/Object
    //   1841: dup
    //   1842: iconst_0
    //   1843: aload_0
    //   1844: aastore
    //   1845: dup
    //   1846: iconst_1
    //   1847: aload_1
    //   1848: ifnonnull -> 1866
    //   1851: goto -> 1858
    //   1854: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1857: athrow
    //   1858: aload_1
    //   1859: goto -> 1873
    //   1862: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1865: athrow
    //   1866: aload_1
    //   1867: checkcast [B
    //   1870: invokevirtual clone : ()Ljava/lang/Object;
    //   1873: aastore
    //   1874: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1877: checkcast java/lang/Boolean
    //   1880: invokevirtual booleanValue : ()Z
    //   1883: istore_3
    //   1884: iload_2
    //   1885: ifeq -> 1902
    //   1888: iinc #6, 1
    //   1891: iload_2
    //   1892: ifeq -> 1762
    //   1895: goto -> 1902
    //   1898: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1901: athrow
    //   1902: iload_2
    //   1903: ifeq -> 2244
    //   1906: sipush #-11916
    //   1909: sipush #6228
    //   1912: invokestatic a : (II)Ljava/lang/String;
    //   1915: iconst_1
    //   1916: ldc burp/Zlgh
    //   1918: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1921: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1924: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1927: astore #4
    //   1929: aload #4
    //   1931: arraylength
    //   1932: istore #5
    //   1934: iconst_0
    //   1935: istore #6
    //   1937: iload #6
    //   1939: iload #5
    //   1941: if_icmpge -> 2079
    //   1944: aload #4
    //   1946: iload #6
    //   1948: aaload
    //   1949: astore #7
    //   1951: aload #7
    //   1953: invokevirtual getModifiers : ()I
    //   1956: invokestatic isStatic : (I)Z
    //   1959: ifne -> 1969
    //   1962: goto -> 2072
    //   1965: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1968: athrow
    //   1969: aload #7
    //   1971: invokevirtual getType : ()Ljava/lang/Class;
    //   1974: astore #8
    //   1976: aload #8
    //   1978: ifnull -> 2059
    //   1981: aload #8
    //   1983: invokevirtual isPrimitive : ()Z
    //   1986: ifne -> 2059
    //   1989: goto -> 1996
    //   1992: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1995: athrow
    //   1996: aload #8
    //   1998: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2001: ifnull -> 2059
    //   2004: goto -> 2011
    //   2007: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2010: athrow
    //   2011: aload #8
    //   2013: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2016: invokevirtual getName : ()Ljava/lang/String;
    //   2019: ifnull -> 2059
    //   2022: goto -> 2029
    //   2025: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2028: athrow
    //   2029: aload #8
    //   2031: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2034: invokevirtual getName : ()Ljava/lang/String;
    //   2037: sipush #-11936
    //   2040: sipush #-12197
    //   2043: invokestatic a : (II)Ljava/lang/String;
    //   2046: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2049: ifne -> 2059
    //   2052: goto -> 2059
    //   2055: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2058: athrow
    //   2059: aload #7
    //   2061: iconst_1
    //   2062: invokevirtual setAccessible : (Z)V
    //   2065: aload #7
    //   2067: aconst_null
    //   2068: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2071: pop
    //   2072: iinc #6, 1
    //   2075: iload_2
    //   2076: ifeq -> 1937
    //   2079: sipush #-11910
    //   2082: sipush #-24169
    //   2085: invokestatic a : (II)Ljava/lang/String;
    //   2088: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2091: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2094: astore #4
    //   2096: aload #4
    //   2098: arraylength
    //   2099: istore #5
    //   2101: iconst_0
    //   2102: istore #6
    //   2104: iload #6
    //   2106: iload #5
    //   2108: if_icmpge -> 2244
    //   2111: aload #4
    //   2113: iload #6
    //   2115: aaload
    //   2116: astore #7
    //   2118: aload #7
    //   2120: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2123: pop
    //   2124: aload #7
    //   2126: invokevirtual getModifiers : ()I
    //   2129: invokestatic isStatic : (I)Z
    //   2132: ifeq -> 2230
    //   2135: aload #7
    //   2137: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2140: arraylength
    //   2141: iconst_2
    //   2142: if_icmpne -> 2230
    //   2145: goto -> 2152
    //   2148: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2151: athrow
    //   2152: aload #7
    //   2154: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2157: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2160: if_acmpne -> 2230
    //   2163: goto -> 2170
    //   2166: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2169: athrow
    //   2170: aload #7
    //   2172: iconst_1
    //   2173: invokevirtual setAccessible : (Z)V
    //   2176: aload #7
    //   2178: aconst_null
    //   2179: iconst_2
    //   2180: anewarray java/lang/Object
    //   2183: dup
    //   2184: iconst_0
    //   2185: aload_0
    //   2186: aastore
    //   2187: dup
    //   2188: iconst_1
    //   2189: aload_1
    //   2190: ifnonnull -> 2208
    //   2193: goto -> 2200
    //   2196: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2199: athrow
    //   2200: aload_1
    //   2201: goto -> 2215
    //   2204: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2207: athrow
    //   2208: aload_1
    //   2209: checkcast [B
    //   2212: invokevirtual clone : ()Ljava/lang/Object;
    //   2215: aastore
    //   2216: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2219: checkcast java/lang/Boolean
    //   2222: invokevirtual booleanValue : ()Z
    //   2225: istore_3
    //   2226: iload_2
    //   2227: ifeq -> 2244
    //   2230: iinc #6, 1
    //   2233: iload_2
    //   2234: ifeq -> 2104
    //   2237: goto -> 2244
    //   2240: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2243: athrow
    //   2244: iload_3
    //   2245: ifeq -> 2250
    //   2248: iload_3
    //   2249: ireturn
    //   2250: getstatic burp/Zm8v.Zl : Ljava/lang/String;
    //   2253: getstatic burp/Zkm0.ZI : Ljava/lang/Object;
    //   2256: checkcast java/math/BigInteger
    //   2259: invokevirtual intValue : ()I
    //   2262: bipush #32
    //   2264: irem
    //   2265: invokestatic abs : (I)I
    //   2268: invokevirtual charAt : (I)C
    //   2271: getstatic burp/Zmsn.ZD : Ljava/lang/String;
    //   2274: getstatic burp/Zrcy.Zr : Ljava/lang/Object;
    //   2277: checkcast java/math/BigInteger
    //   2280: invokevirtual intValue : ()I
    //   2283: bipush #32
    //   2285: irem
    //   2286: invokestatic abs : (I)I
    //   2289: invokevirtual charAt : (I)C
    //   2292: if_icmpgt -> 2637
    //   2295: sipush #-11928
    //   2298: sipush #14799
    //   2301: invokestatic a : (II)Ljava/lang/String;
    //   2304: iconst_1
    //   2305: ldc burp/Ztsc
    //   2307: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2310: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2313: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2316: astore #4
    //   2318: aload #4
    //   2320: arraylength
    //   2321: istore #5
    //   2323: iconst_0
    //   2324: istore #6
    //   2326: iload #6
    //   2328: iload #5
    //   2330: if_icmpge -> 2468
    //   2333: aload #4
    //   2335: iload #6
    //   2337: aaload
    //   2338: astore #7
    //   2340: aload #7
    //   2342: invokevirtual getModifiers : ()I
    //   2345: invokestatic isStatic : (I)Z
    //   2348: ifne -> 2358
    //   2351: goto -> 2461
    //   2354: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2357: athrow
    //   2358: aload #7
    //   2360: invokevirtual getType : ()Ljava/lang/Class;
    //   2363: astore #8
    //   2365: aload #8
    //   2367: ifnull -> 2448
    //   2370: aload #8
    //   2372: invokevirtual isPrimitive : ()Z
    //   2375: ifne -> 2448
    //   2378: goto -> 2385
    //   2381: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2384: athrow
    //   2385: aload #8
    //   2387: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2390: ifnull -> 2448
    //   2393: goto -> 2400
    //   2396: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2399: athrow
    //   2400: aload #8
    //   2402: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2405: invokevirtual getName : ()Ljava/lang/String;
    //   2408: ifnull -> 2448
    //   2411: goto -> 2418
    //   2414: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2417: athrow
    //   2418: aload #8
    //   2420: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2423: invokevirtual getName : ()Ljava/lang/String;
    //   2426: sipush #-11936
    //   2429: sipush #-12197
    //   2432: invokestatic a : (II)Ljava/lang/String;
    //   2435: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2438: ifne -> 2448
    //   2441: goto -> 2448
    //   2444: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2447: athrow
    //   2448: aload #7
    //   2450: iconst_1
    //   2451: invokevirtual setAccessible : (Z)V
    //   2454: aload #7
    //   2456: aconst_null
    //   2457: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2460: pop
    //   2461: iinc #6, 1
    //   2464: iload_2
    //   2465: ifeq -> 2326
    //   2468: sipush #-11925
    //   2471: sipush #21320
    //   2474: invokestatic a : (II)Ljava/lang/String;
    //   2477: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2480: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2483: astore #4
    //   2485: aload #4
    //   2487: arraylength
    //   2488: istore #5
    //   2490: iconst_0
    //   2491: istore #6
    //   2493: iload #6
    //   2495: iload #5
    //   2497: if_icmpge -> 2633
    //   2500: aload #4
    //   2502: iload #6
    //   2504: aaload
    //   2505: astore #7
    //   2507: aload #7
    //   2509: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2512: pop
    //   2513: aload #7
    //   2515: invokevirtual getModifiers : ()I
    //   2518: invokestatic isStatic : (I)Z
    //   2521: ifeq -> 2619
    //   2524: aload #7
    //   2526: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2529: arraylength
    //   2530: iconst_2
    //   2531: if_icmpne -> 2619
    //   2534: goto -> 2541
    //   2537: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2540: athrow
    //   2541: aload #7
    //   2543: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2546: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2549: if_acmpne -> 2619
    //   2552: goto -> 2559
    //   2555: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2558: athrow
    //   2559: aload #7
    //   2561: iconst_1
    //   2562: invokevirtual setAccessible : (Z)V
    //   2565: aload #7
    //   2567: aconst_null
    //   2568: iconst_2
    //   2569: anewarray java/lang/Object
    //   2572: dup
    //   2573: iconst_0
    //   2574: aload_0
    //   2575: aastore
    //   2576: dup
    //   2577: iconst_1
    //   2578: aload_1
    //   2579: ifnonnull -> 2597
    //   2582: goto -> 2589
    //   2585: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2588: athrow
    //   2589: aload_1
    //   2590: goto -> 2604
    //   2593: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2596: athrow
    //   2597: aload_1
    //   2598: checkcast [B
    //   2601: invokevirtual clone : ()Ljava/lang/Object;
    //   2604: aastore
    //   2605: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2608: checkcast java/lang/Boolean
    //   2611: invokevirtual booleanValue : ()Z
    //   2614: istore_3
    //   2615: iload_2
    //   2616: ifeq -> 2633
    //   2619: iinc #6, 1
    //   2622: iload_2
    //   2623: ifeq -> 2493
    //   2626: goto -> 2633
    //   2629: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2632: athrow
    //   2633: iload_2
    //   2634: ifeq -> 2975
    //   2637: sipush #-11933
    //   2640: sipush #-17625
    //   2643: invokestatic a : (II)Ljava/lang/String;
    //   2646: iconst_1
    //   2647: ldc burp/Zzri
    //   2649: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2652: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2655: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2658: astore #4
    //   2660: aload #4
    //   2662: arraylength
    //   2663: istore #5
    //   2665: iconst_0
    //   2666: istore #6
    //   2668: iload #6
    //   2670: iload #5
    //   2672: if_icmpge -> 2810
    //   2675: aload #4
    //   2677: iload #6
    //   2679: aaload
    //   2680: astore #7
    //   2682: aload #7
    //   2684: invokevirtual getModifiers : ()I
    //   2687: invokestatic isStatic : (I)Z
    //   2690: ifne -> 2700
    //   2693: goto -> 2803
    //   2696: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2699: athrow
    //   2700: aload #7
    //   2702: invokevirtual getType : ()Ljava/lang/Class;
    //   2705: astore #8
    //   2707: aload #8
    //   2709: ifnull -> 2790
    //   2712: aload #8
    //   2714: invokevirtual isPrimitive : ()Z
    //   2717: ifne -> 2790
    //   2720: goto -> 2727
    //   2723: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2726: athrow
    //   2727: aload #8
    //   2729: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2732: ifnull -> 2790
    //   2735: goto -> 2742
    //   2738: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2741: athrow
    //   2742: aload #8
    //   2744: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2747: invokevirtual getName : ()Ljava/lang/String;
    //   2750: ifnull -> 2790
    //   2753: goto -> 2760
    //   2756: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2759: athrow
    //   2760: aload #8
    //   2762: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2765: invokevirtual getName : ()Ljava/lang/String;
    //   2768: sipush #-11936
    //   2771: sipush #-12197
    //   2774: invokestatic a : (II)Ljava/lang/String;
    //   2777: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2780: ifne -> 2790
    //   2783: goto -> 2790
    //   2786: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2789: athrow
    //   2790: aload #7
    //   2792: iconst_1
    //   2793: invokevirtual setAccessible : (Z)V
    //   2796: aload #7
    //   2798: aconst_null
    //   2799: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2802: pop
    //   2803: iinc #6, 1
    //   2806: iload_2
    //   2807: ifeq -> 2668
    //   2810: sipush #-11921
    //   2813: sipush #10078
    //   2816: invokestatic a : (II)Ljava/lang/String;
    //   2819: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2822: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2825: astore #4
    //   2827: aload #4
    //   2829: arraylength
    //   2830: istore #5
    //   2832: iconst_0
    //   2833: istore #6
    //   2835: iload #6
    //   2837: iload #5
    //   2839: if_icmpge -> 2975
    //   2842: aload #4
    //   2844: iload #6
    //   2846: aaload
    //   2847: astore #7
    //   2849: aload #7
    //   2851: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2854: pop
    //   2855: aload #7
    //   2857: invokevirtual getModifiers : ()I
    //   2860: invokestatic isStatic : (I)Z
    //   2863: ifeq -> 2961
    //   2866: aload #7
    //   2868: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2871: arraylength
    //   2872: iconst_2
    //   2873: if_icmpne -> 2961
    //   2876: goto -> 2883
    //   2879: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2882: athrow
    //   2883: aload #7
    //   2885: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2888: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2891: if_acmpne -> 2961
    //   2894: goto -> 2901
    //   2897: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2900: athrow
    //   2901: aload #7
    //   2903: iconst_1
    //   2904: invokevirtual setAccessible : (Z)V
    //   2907: aload #7
    //   2909: aconst_null
    //   2910: iconst_2
    //   2911: anewarray java/lang/Object
    //   2914: dup
    //   2915: iconst_0
    //   2916: aload_0
    //   2917: aastore
    //   2918: dup
    //   2919: iconst_1
    //   2920: aload_1
    //   2921: ifnonnull -> 2939
    //   2924: goto -> 2931
    //   2927: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2930: athrow
    //   2931: aload_1
    //   2932: goto -> 2946
    //   2935: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2938: athrow
    //   2939: aload_1
    //   2940: checkcast [B
    //   2943: invokevirtual clone : ()Ljava/lang/Object;
    //   2946: aastore
    //   2947: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2950: checkcast java/lang/Boolean
    //   2953: invokevirtual booleanValue : ()Z
    //   2956: istore_3
    //   2957: iload_2
    //   2958: ifeq -> 2975
    //   2961: iinc #6, 1
    //   2964: iload_2
    //   2965: ifeq -> 2835
    //   2968: goto -> 2975
    //   2971: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2974: athrow
    //   2975: iload_3
    //   2976: ifeq -> 2981
    //   2979: iload_3
    //   2980: ireturn
    //   2981: getstatic burp/Zgq_.ZQ : Ljava/lang/String;
    //   2984: getstatic burp/Zvo3.Ze : Ljava/lang/Object;
    //   2987: checkcast java/math/BigInteger
    //   2990: invokevirtual intValue : ()I
    //   2993: bipush #32
    //   2995: irem
    //   2996: invokestatic abs : (I)I
    //   2999: invokevirtual charAt : (I)C
    //   3002: getstatic burp/Zlem.Zl : Ljava/lang/String;
    //   3005: getstatic burp/Zsbt.Zl : Ljava/lang/Object;
    //   3008: checkcast java/math/BigInteger
    //   3011: invokevirtual intValue : ()I
    //   3014: bipush #32
    //   3016: irem
    //   3017: invokestatic abs : (I)I
    //   3020: invokevirtual charAt : (I)C
    //   3023: if_icmpgt -> 3368
    //   3026: sipush #-11930
    //   3029: sipush #-26312
    //   3032: invokestatic a : (II)Ljava/lang/String;
    //   3035: iconst_1
    //   3036: ldc burp/Zkfb
    //   3038: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3041: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3044: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3047: astore #4
    //   3049: aload #4
    //   3051: arraylength
    //   3052: istore #5
    //   3054: iconst_0
    //   3055: istore #6
    //   3057: iload #6
    //   3059: iload #5
    //   3061: if_icmpge -> 3199
    //   3064: aload #4
    //   3066: iload #6
    //   3068: aaload
    //   3069: astore #7
    //   3071: aload #7
    //   3073: invokevirtual getModifiers : ()I
    //   3076: invokestatic isStatic : (I)Z
    //   3079: ifne -> 3089
    //   3082: goto -> 3192
    //   3085: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3088: athrow
    //   3089: aload #7
    //   3091: invokevirtual getType : ()Ljava/lang/Class;
    //   3094: astore #8
    //   3096: aload #8
    //   3098: ifnull -> 3179
    //   3101: aload #8
    //   3103: invokevirtual isPrimitive : ()Z
    //   3106: ifne -> 3179
    //   3109: goto -> 3116
    //   3112: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3115: athrow
    //   3116: aload #8
    //   3118: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3121: ifnull -> 3179
    //   3124: goto -> 3131
    //   3127: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3130: athrow
    //   3131: aload #8
    //   3133: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3136: invokevirtual getName : ()Ljava/lang/String;
    //   3139: ifnull -> 3179
    //   3142: goto -> 3149
    //   3145: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3148: athrow
    //   3149: aload #8
    //   3151: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3154: invokevirtual getName : ()Ljava/lang/String;
    //   3157: sipush #-11936
    //   3160: sipush #-12197
    //   3163: invokestatic a : (II)Ljava/lang/String;
    //   3166: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3169: ifne -> 3179
    //   3172: goto -> 3179
    //   3175: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3178: athrow
    //   3179: aload #7
    //   3181: iconst_1
    //   3182: invokevirtual setAccessible : (Z)V
    //   3185: aload #7
    //   3187: aconst_null
    //   3188: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3191: pop
    //   3192: iinc #6, 1
    //   3195: iload_2
    //   3196: ifeq -> 3057
    //   3199: sipush #-11922
    //   3202: sipush #-27219
    //   3205: invokestatic a : (II)Ljava/lang/String;
    //   3208: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3211: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3214: astore #4
    //   3216: aload #4
    //   3218: arraylength
    //   3219: istore #5
    //   3221: iconst_0
    //   3222: istore #6
    //   3224: iload #6
    //   3226: iload #5
    //   3228: if_icmpge -> 3364
    //   3231: aload #4
    //   3233: iload #6
    //   3235: aaload
    //   3236: astore #7
    //   3238: aload #7
    //   3240: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3243: pop
    //   3244: aload #7
    //   3246: invokevirtual getModifiers : ()I
    //   3249: invokestatic isStatic : (I)Z
    //   3252: ifeq -> 3350
    //   3255: aload #7
    //   3257: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3260: arraylength
    //   3261: iconst_2
    //   3262: if_icmpne -> 3350
    //   3265: goto -> 3272
    //   3268: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3271: athrow
    //   3272: aload #7
    //   3274: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3277: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3280: if_acmpne -> 3350
    //   3283: goto -> 3290
    //   3286: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3289: athrow
    //   3290: aload #7
    //   3292: iconst_1
    //   3293: invokevirtual setAccessible : (Z)V
    //   3296: aload #7
    //   3298: aconst_null
    //   3299: iconst_2
    //   3300: anewarray java/lang/Object
    //   3303: dup
    //   3304: iconst_0
    //   3305: aload_0
    //   3306: aastore
    //   3307: dup
    //   3308: iconst_1
    //   3309: aload_1
    //   3310: ifnonnull -> 3328
    //   3313: goto -> 3320
    //   3316: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3319: athrow
    //   3320: aload_1
    //   3321: goto -> 3335
    //   3324: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3327: athrow
    //   3328: aload_1
    //   3329: checkcast [B
    //   3332: invokevirtual clone : ()Ljava/lang/Object;
    //   3335: aastore
    //   3336: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3339: checkcast java/lang/Boolean
    //   3342: invokevirtual booleanValue : ()Z
    //   3345: istore_3
    //   3346: iload_2
    //   3347: ifeq -> 3364
    //   3350: iinc #6, 1
    //   3353: iload_2
    //   3354: ifeq -> 3224
    //   3357: goto -> 3364
    //   3360: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3363: athrow
    //   3364: iload_2
    //   3365: ifeq -> 3706
    //   3368: sipush #-11913
    //   3371: sipush #27397
    //   3374: invokestatic a : (II)Ljava/lang/String;
    //   3377: iconst_1
    //   3378: ldc burp/Zz4r
    //   3380: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3383: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3386: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3389: astore #4
    //   3391: aload #4
    //   3393: arraylength
    //   3394: istore #5
    //   3396: iconst_0
    //   3397: istore #6
    //   3399: iload #6
    //   3401: iload #5
    //   3403: if_icmpge -> 3541
    //   3406: aload #4
    //   3408: iload #6
    //   3410: aaload
    //   3411: astore #7
    //   3413: aload #7
    //   3415: invokevirtual getModifiers : ()I
    //   3418: invokestatic isStatic : (I)Z
    //   3421: ifne -> 3431
    //   3424: goto -> 3534
    //   3427: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3430: athrow
    //   3431: aload #7
    //   3433: invokevirtual getType : ()Ljava/lang/Class;
    //   3436: astore #8
    //   3438: aload #8
    //   3440: ifnull -> 3521
    //   3443: aload #8
    //   3445: invokevirtual isPrimitive : ()Z
    //   3448: ifne -> 3521
    //   3451: goto -> 3458
    //   3454: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3457: athrow
    //   3458: aload #8
    //   3460: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3463: ifnull -> 3521
    //   3466: goto -> 3473
    //   3469: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3472: athrow
    //   3473: aload #8
    //   3475: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3478: invokevirtual getName : ()Ljava/lang/String;
    //   3481: ifnull -> 3521
    //   3484: goto -> 3491
    //   3487: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3490: athrow
    //   3491: aload #8
    //   3493: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3496: invokevirtual getName : ()Ljava/lang/String;
    //   3499: sipush #-11936
    //   3502: sipush #-12197
    //   3505: invokestatic a : (II)Ljava/lang/String;
    //   3508: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3511: ifne -> 3521
    //   3514: goto -> 3521
    //   3517: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3520: athrow
    //   3521: aload #7
    //   3523: iconst_1
    //   3524: invokevirtual setAccessible : (Z)V
    //   3527: aload #7
    //   3529: aconst_null
    //   3530: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3533: pop
    //   3534: iinc #6, 1
    //   3537: iload_2
    //   3538: ifeq -> 3399
    //   3541: sipush #-11931
    //   3544: sipush #4982
    //   3547: invokestatic a : (II)Ljava/lang/String;
    //   3550: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3553: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3556: astore #4
    //   3558: aload #4
    //   3560: arraylength
    //   3561: istore #5
    //   3563: iconst_0
    //   3564: istore #6
    //   3566: iload #6
    //   3568: iload #5
    //   3570: if_icmpge -> 3706
    //   3573: aload #4
    //   3575: iload #6
    //   3577: aaload
    //   3578: astore #7
    //   3580: aload #7
    //   3582: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3585: pop
    //   3586: aload #7
    //   3588: invokevirtual getModifiers : ()I
    //   3591: invokestatic isStatic : (I)Z
    //   3594: ifeq -> 3692
    //   3597: aload #7
    //   3599: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3602: arraylength
    //   3603: iconst_2
    //   3604: if_icmpne -> 3692
    //   3607: goto -> 3614
    //   3610: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3613: athrow
    //   3614: aload #7
    //   3616: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3619: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3622: if_acmpne -> 3692
    //   3625: goto -> 3632
    //   3628: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3631: athrow
    //   3632: aload #7
    //   3634: iconst_1
    //   3635: invokevirtual setAccessible : (Z)V
    //   3638: aload #7
    //   3640: aconst_null
    //   3641: iconst_2
    //   3642: anewarray java/lang/Object
    //   3645: dup
    //   3646: iconst_0
    //   3647: aload_0
    //   3648: aastore
    //   3649: dup
    //   3650: iconst_1
    //   3651: aload_1
    //   3652: ifnonnull -> 3670
    //   3655: goto -> 3662
    //   3658: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3661: athrow
    //   3662: aload_1
    //   3663: goto -> 3677
    //   3666: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3669: athrow
    //   3670: aload_1
    //   3671: checkcast [B
    //   3674: invokevirtual clone : ()Ljava/lang/Object;
    //   3677: aastore
    //   3678: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3681: checkcast java/lang/Boolean
    //   3684: invokevirtual booleanValue : ()Z
    //   3687: istore_3
    //   3688: iload_2
    //   3689: ifeq -> 3706
    //   3692: iinc #6, 1
    //   3695: iload_2
    //   3696: ifeq -> 3566
    //   3699: goto -> 3706
    //   3702: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3705: athrow
    //   3706: iload_3
    //   3707: ifeq -> 3712
    //   3710: iload_3
    //   3711: ireturn
    //   3712: getstatic burp/Zrtv.ZA : Ljava/lang/String;
    //   3715: getstatic burp/Zzmu.Zy : Ljava/lang/Object;
    //   3718: checkcast java/math/BigInteger
    //   3721: invokevirtual intValue : ()I
    //   3724: bipush #32
    //   3726: irem
    //   3727: invokestatic abs : (I)I
    //   3730: invokevirtual charAt : (I)C
    //   3733: getstatic burp/Zs_3.ZC : Ljava/lang/String;
    //   3736: getstatic burp/Zex.ZO : Ljava/lang/Object;
    //   3739: checkcast java/math/BigInteger
    //   3742: invokevirtual intValue : ()I
    //   3745: bipush #32
    //   3747: irem
    //   3748: invokestatic abs : (I)I
    //   3751: invokevirtual charAt : (I)C
    //   3754: if_icmple -> 4099
    //   3757: sipush #-11912
    //   3760: sipush #-2391
    //   3763: invokestatic a : (II)Ljava/lang/String;
    //   3766: iconst_1
    //   3767: ldc burp/Zxo6
    //   3769: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3772: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3775: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3778: astore #4
    //   3780: aload #4
    //   3782: arraylength
    //   3783: istore #5
    //   3785: iconst_0
    //   3786: istore #6
    //   3788: iload #6
    //   3790: iload #5
    //   3792: if_icmpge -> 3930
    //   3795: aload #4
    //   3797: iload #6
    //   3799: aaload
    //   3800: astore #7
    //   3802: aload #7
    //   3804: invokevirtual getModifiers : ()I
    //   3807: invokestatic isStatic : (I)Z
    //   3810: ifne -> 3820
    //   3813: goto -> 3923
    //   3816: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3819: athrow
    //   3820: aload #7
    //   3822: invokevirtual getType : ()Ljava/lang/Class;
    //   3825: astore #8
    //   3827: aload #8
    //   3829: ifnull -> 3910
    //   3832: aload #8
    //   3834: invokevirtual isPrimitive : ()Z
    //   3837: ifne -> 3910
    //   3840: goto -> 3847
    //   3843: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3846: athrow
    //   3847: aload #8
    //   3849: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3852: ifnull -> 3910
    //   3855: goto -> 3862
    //   3858: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3861: athrow
    //   3862: aload #8
    //   3864: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3867: invokevirtual getName : ()Ljava/lang/String;
    //   3870: ifnull -> 3910
    //   3873: goto -> 3880
    //   3876: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3879: athrow
    //   3880: aload #8
    //   3882: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3885: invokevirtual getName : ()Ljava/lang/String;
    //   3888: sipush #-11936
    //   3891: sipush #-12197
    //   3894: invokestatic a : (II)Ljava/lang/String;
    //   3897: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3900: ifne -> 3910
    //   3903: goto -> 3910
    //   3906: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3909: athrow
    //   3910: aload #7
    //   3912: iconst_1
    //   3913: invokevirtual setAccessible : (Z)V
    //   3916: aload #7
    //   3918: aconst_null
    //   3919: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3922: pop
    //   3923: iinc #6, 1
    //   3926: iload_2
    //   3927: ifeq -> 3788
    //   3930: sipush #-11935
    //   3933: sipush #5133
    //   3936: invokestatic a : (II)Ljava/lang/String;
    //   3939: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3942: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3945: astore #4
    //   3947: aload #4
    //   3949: arraylength
    //   3950: istore #5
    //   3952: iconst_0
    //   3953: istore #6
    //   3955: iload #6
    //   3957: iload #5
    //   3959: if_icmpge -> 4095
    //   3962: aload #4
    //   3964: iload #6
    //   3966: aaload
    //   3967: astore #7
    //   3969: aload #7
    //   3971: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3974: pop
    //   3975: aload #7
    //   3977: invokevirtual getModifiers : ()I
    //   3980: invokestatic isStatic : (I)Z
    //   3983: ifeq -> 4081
    //   3986: aload #7
    //   3988: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3991: arraylength
    //   3992: iconst_2
    //   3993: if_icmpne -> 4081
    //   3996: goto -> 4003
    //   3999: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4002: athrow
    //   4003: aload #7
    //   4005: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4008: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4011: if_acmpne -> 4081
    //   4014: goto -> 4021
    //   4017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4020: athrow
    //   4021: aload #7
    //   4023: iconst_1
    //   4024: invokevirtual setAccessible : (Z)V
    //   4027: aload #7
    //   4029: aconst_null
    //   4030: iconst_2
    //   4031: anewarray java/lang/Object
    //   4034: dup
    //   4035: iconst_0
    //   4036: aload_0
    //   4037: aastore
    //   4038: dup
    //   4039: iconst_1
    //   4040: aload_1
    //   4041: ifnonnull -> 4059
    //   4044: goto -> 4051
    //   4047: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4050: athrow
    //   4051: aload_1
    //   4052: goto -> 4066
    //   4055: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4058: athrow
    //   4059: aload_1
    //   4060: checkcast [B
    //   4063: invokevirtual clone : ()Ljava/lang/Object;
    //   4066: aastore
    //   4067: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4070: checkcast java/lang/Boolean
    //   4073: invokevirtual booleanValue : ()Z
    //   4076: istore_3
    //   4077: iload_2
    //   4078: ifeq -> 4095
    //   4081: iinc #6, 1
    //   4084: iload_2
    //   4085: ifeq -> 3955
    //   4088: goto -> 4095
    //   4091: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4094: athrow
    //   4095: iload_2
    //   4096: ifeq -> 4437
    //   4099: sipush #-11918
    //   4102: sipush #-24046
    //   4105: invokestatic a : (II)Ljava/lang/String;
    //   4108: iconst_1
    //   4109: ldc burp/Zle4
    //   4111: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4114: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4117: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4120: astore #4
    //   4122: aload #4
    //   4124: arraylength
    //   4125: istore #5
    //   4127: iconst_0
    //   4128: istore #6
    //   4130: iload #6
    //   4132: iload #5
    //   4134: if_icmpge -> 4272
    //   4137: aload #4
    //   4139: iload #6
    //   4141: aaload
    //   4142: astore #7
    //   4144: aload #7
    //   4146: invokevirtual getModifiers : ()I
    //   4149: invokestatic isStatic : (I)Z
    //   4152: ifne -> 4162
    //   4155: goto -> 4265
    //   4158: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4161: athrow
    //   4162: aload #7
    //   4164: invokevirtual getType : ()Ljava/lang/Class;
    //   4167: astore #8
    //   4169: aload #8
    //   4171: ifnull -> 4252
    //   4174: aload #8
    //   4176: invokevirtual isPrimitive : ()Z
    //   4179: ifne -> 4252
    //   4182: goto -> 4189
    //   4185: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4188: athrow
    //   4189: aload #8
    //   4191: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4194: ifnull -> 4252
    //   4197: goto -> 4204
    //   4200: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4203: athrow
    //   4204: aload #8
    //   4206: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4209: invokevirtual getName : ()Ljava/lang/String;
    //   4212: ifnull -> 4252
    //   4215: goto -> 4222
    //   4218: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4221: athrow
    //   4222: aload #8
    //   4224: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4227: invokevirtual getName : ()Ljava/lang/String;
    //   4230: sipush #-11936
    //   4233: sipush #-12197
    //   4236: invokestatic a : (II)Ljava/lang/String;
    //   4239: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4242: ifne -> 4252
    //   4245: goto -> 4252
    //   4248: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4251: athrow
    //   4252: aload #7
    //   4254: iconst_1
    //   4255: invokevirtual setAccessible : (Z)V
    //   4258: aload #7
    //   4260: aconst_null
    //   4261: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4264: pop
    //   4265: iinc #6, 1
    //   4268: iload_2
    //   4269: ifeq -> 4130
    //   4272: sipush #-11911
    //   4275: sipush #-7184
    //   4278: invokestatic a : (II)Ljava/lang/String;
    //   4281: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4284: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4287: astore #4
    //   4289: aload #4
    //   4291: arraylength
    //   4292: istore #5
    //   4294: iconst_0
    //   4295: istore #6
    //   4297: iload #6
    //   4299: iload #5
    //   4301: if_icmpge -> 4437
    //   4304: aload #4
    //   4306: iload #6
    //   4308: aaload
    //   4309: astore #7
    //   4311: aload #7
    //   4313: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4316: pop
    //   4317: aload #7
    //   4319: invokevirtual getModifiers : ()I
    //   4322: invokestatic isStatic : (I)Z
    //   4325: ifeq -> 4423
    //   4328: aload #7
    //   4330: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4333: arraylength
    //   4334: iconst_2
    //   4335: if_icmpne -> 4423
    //   4338: goto -> 4345
    //   4341: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4344: athrow
    //   4345: aload #7
    //   4347: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4350: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4353: if_acmpne -> 4423
    //   4356: goto -> 4363
    //   4359: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4362: athrow
    //   4363: aload #7
    //   4365: iconst_1
    //   4366: invokevirtual setAccessible : (Z)V
    //   4369: aload #7
    //   4371: aconst_null
    //   4372: iconst_2
    //   4373: anewarray java/lang/Object
    //   4376: dup
    //   4377: iconst_0
    //   4378: aload_0
    //   4379: aastore
    //   4380: dup
    //   4381: iconst_1
    //   4382: aload_1
    //   4383: ifnonnull -> 4401
    //   4386: goto -> 4393
    //   4389: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4392: athrow
    //   4393: aload_1
    //   4394: goto -> 4408
    //   4397: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4400: athrow
    //   4401: aload_1
    //   4402: checkcast [B
    //   4405: invokevirtual clone : ()Ljava/lang/Object;
    //   4408: aastore
    //   4409: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4412: checkcast java/lang/Boolean
    //   4415: invokevirtual booleanValue : ()Z
    //   4418: istore_3
    //   4419: iload_2
    //   4420: ifeq -> 4437
    //   4423: iinc #6, 1
    //   4426: iload_2
    //   4427: ifeq -> 4297
    //   4430: goto -> 4437
    //   4433: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4436: athrow
    //   4437: iload_3
    //   4438: ireturn
    //   4439: astore_3
    //   4440: new java/lang/Exception
    //   4443: dup
    //   4444: aload_3
    //   4445: invokevirtual getMessage : ()Ljava/lang/String;
    //   4448: invokespecial <init> : (Ljava/lang/String;)V
    //   4451: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1518	4439	java/lang/Throwable
    //   100	114	114	java/lang/Throwable
    //   125	138	141	java/lang/Throwable
    //   130	153	156	java/lang/Throwable
    //   145	171	174	java/lang/Throwable
    //   160	201	204	java/lang/Throwable
    //   264	291	294	java/lang/Throwable
    //   281	312	315	java/lang/Throwable
    //   298	342	345	java/lang/Throwable
    //   319	353	353	java/lang/Throwable
    //   364	380	383	java/lang/Throwable
    //   574	602	605	java/lang/Throwable
    //   584	619	622	java/lang/Throwable
    //   609	647	650	java/lang/Throwable
    //   626	664	667	java/lang/Throwable
    //   654	692	695	java/lang/Throwable
    //   671	709	712	java/lang/Throwable
    //   699	727	730	java/lang/Throwable
    //   716	741	744	java/lang/Throwable
    //   879	893	893	java/lang/Throwable
    //   904	917	920	java/lang/Throwable
    //   909	932	935	java/lang/Throwable
    //   924	950	953	java/lang/Throwable
    //   939	980	983	java/lang/Throwable
    //   1046	1073	1076	java/lang/Throwable
    //   1063	1091	1094	java/lang/Throwable
    //   1080	1121	1124	java/lang/Throwable
    //   1098	1132	1132	java/lang/Throwable
    //   1154	1165	1168	java/lang/Throwable
    //   1220	1234	1234	java/lang/Throwable
    //   1245	1258	1261	java/lang/Throwable
    //   1250	1273	1276	java/lang/Throwable
    //   1265	1291	1294	java/lang/Throwable
    //   1280	1321	1324	java/lang/Throwable
    //   1387	1414	1417	java/lang/Throwable
    //   1404	1432	1435	java/lang/Throwable
    //   1421	1462	1465	java/lang/Throwable
    //   1439	1473	1473	java/lang/Throwable
    //   1495	1506	1509	java/lang/Throwable
    //   1519	2249	4439	java/lang/Throwable
    //   1609	1623	1623	java/lang/Throwable
    //   1634	1647	1650	java/lang/Throwable
    //   1639	1662	1665	java/lang/Throwable
    //   1654	1680	1683	java/lang/Throwable
    //   1669	1710	1713	java/lang/Throwable
    //   1776	1803	1806	java/lang/Throwable
    //   1793	1821	1824	java/lang/Throwable
    //   1810	1851	1854	java/lang/Throwable
    //   1828	1862	1862	java/lang/Throwable
    //   1884	1895	1898	java/lang/Throwable
    //   1951	1965	1965	java/lang/Throwable
    //   1976	1989	1992	java/lang/Throwable
    //   1981	2004	2007	java/lang/Throwable
    //   1996	2022	2025	java/lang/Throwable
    //   2011	2052	2055	java/lang/Throwable
    //   2118	2145	2148	java/lang/Throwable
    //   2135	2163	2166	java/lang/Throwable
    //   2152	2193	2196	java/lang/Throwable
    //   2170	2204	2204	java/lang/Throwable
    //   2226	2237	2240	java/lang/Throwable
    //   2250	2980	4439	java/lang/Throwable
    //   2340	2354	2354	java/lang/Throwable
    //   2365	2378	2381	java/lang/Throwable
    //   2370	2393	2396	java/lang/Throwable
    //   2385	2411	2414	java/lang/Throwable
    //   2400	2441	2444	java/lang/Throwable
    //   2507	2534	2537	java/lang/Throwable
    //   2524	2552	2555	java/lang/Throwable
    //   2541	2582	2585	java/lang/Throwable
    //   2559	2593	2593	java/lang/Throwable
    //   2615	2626	2629	java/lang/Throwable
    //   2682	2696	2696	java/lang/Throwable
    //   2707	2720	2723	java/lang/Throwable
    //   2712	2735	2738	java/lang/Throwable
    //   2727	2753	2756	java/lang/Throwable
    //   2742	2783	2786	java/lang/Throwable
    //   2849	2876	2879	java/lang/Throwable
    //   2866	2894	2897	java/lang/Throwable
    //   2883	2924	2927	java/lang/Throwable
    //   2901	2935	2935	java/lang/Throwable
    //   2957	2968	2971	java/lang/Throwable
    //   2981	3711	4439	java/lang/Throwable
    //   3071	3085	3085	java/lang/Throwable
    //   3096	3109	3112	java/lang/Throwable
    //   3101	3124	3127	java/lang/Throwable
    //   3116	3142	3145	java/lang/Throwable
    //   3131	3172	3175	java/lang/Throwable
    //   3238	3265	3268	java/lang/Throwable
    //   3255	3283	3286	java/lang/Throwable
    //   3272	3313	3316	java/lang/Throwable
    //   3290	3324	3324	java/lang/Throwable
    //   3346	3357	3360	java/lang/Throwable
    //   3413	3427	3427	java/lang/Throwable
    //   3438	3451	3454	java/lang/Throwable
    //   3443	3466	3469	java/lang/Throwable
    //   3458	3484	3487	java/lang/Throwable
    //   3473	3514	3517	java/lang/Throwable
    //   3580	3607	3610	java/lang/Throwable
    //   3597	3625	3628	java/lang/Throwable
    //   3614	3655	3658	java/lang/Throwable
    //   3632	3666	3666	java/lang/Throwable
    //   3688	3699	3702	java/lang/Throwable
    //   3712	4438	4439	java/lang/Throwable
    //   3802	3816	3816	java/lang/Throwable
    //   3827	3840	3843	java/lang/Throwable
    //   3832	3855	3858	java/lang/Throwable
    //   3847	3873	3876	java/lang/Throwable
    //   3862	3903	3906	java/lang/Throwable
    //   3969	3996	3999	java/lang/Throwable
    //   3986	4014	4017	java/lang/Throwable
    //   4003	4044	4047	java/lang/Throwable
    //   4021	4055	4055	java/lang/Throwable
    //   4077	4088	4091	java/lang/Throwable
    //   4144	4158	4158	java/lang/Throwable
    //   4169	4182	4185	java/lang/Throwable
    //   4174	4197	4200	java/lang/Throwable
    //   4189	4215	4218	java/lang/Throwable
    //   4204	4245	4248	java/lang/Throwable
    //   4311	4338	4341	java/lang/Throwable
    //   4328	4356	4359	java/lang/Throwable
    //   4345	4386	4389	java/lang/Throwable
    //   4363	4397	4397	java/lang/Throwable
    //   4419	4430	4433	java/lang/Throwable
  }
  
  static void Zu(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #27
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ZsÀ\\tð¤}pÚþÒ\\tÛ¯~Üös³ \\tü/ün@ôçþS\\t0ÙXÂre\\t BwÃ1AÑN×\\tZ´(Ú½jn\\th|n¹ª\\r\\\tûÞP\3{?\\bé^8>o½\\tp-m.rü¨úÌ\\tq#MïvÄ5ÍÓÀ!{¯\\t6)¥®kìä¯\\t£ô=I¢\\tú|<X¹äW3\\t\\r`ÂÉ JVM¯ïtúµ{"O< M\\t[ß¨¥2úzm© nÃÐo1°%x^i­wÈ:* Ê¡ôfÙæbkXå²Eb¼¯¦öG½\\tÏpwZd yÙçÞ)o&\\thÂÿ!Ú8¦ìÉãiôdÓcûªB\\tXÓhñÒ²Q\\b{\\fi^&ø <Uo3êZÀ6¦Ò/o«]4Ü5É×¾Ö;ïÂ½'âm\\t`µo=2±µÛ\\tÊÈ:kýq'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #15
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
    //   67: ldc '(j:pÇô\\tü F#\\rp;õ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #16
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
    //   128: putstatic burp/Zs2n.a : [Ljava/lang/String;
    //   131: bipush #27
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zs2n.b : [Ljava/lang/String;
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
    //   212: bipush #23
    //   214: goto -> 244
    //   217: bipush #79
    //   219: goto -> 244
    //   222: bipush #51
    //   224: goto -> 244
    //   227: bipush #39
    //   229: goto -> 244
    //   232: bipush #69
    //   234: goto -> 244
    //   237: bipush #23
    //   239: goto -> 244
    //   242: bipush #49
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
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #39
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-39
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #-58
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-44
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #-110
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #118
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #54
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #31
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #89
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #41
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #27
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #65
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #-61
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #42
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #-128
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #-8
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #-17
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #77
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #-78
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #-35
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #93
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #-36
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #-127
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #-7
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #-123
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #-30
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #57
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #-14
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #-21
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #108
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #-3
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #-125
    //   493: bastore
    //   494: invokespecial <init> : ([B)V
    //   497: putstatic burp/Zs2n.ZK : Ljava/lang/Object;
    //   500: sipush #-11917
    //   503: sipush #-10695
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zs2n.ZI : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD160) & 0xFFFF;
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
      byte b1 = 44;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs2n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */