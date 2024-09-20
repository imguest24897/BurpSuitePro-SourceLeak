package burp;

import java.math.BigInteger;

class Zmzj extends ClassLoader {
  static String Zb;
  
  static Object Zm;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZI(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zb(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zge2.Zv : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zmtr.Zv : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zmn0.Zo : Ljava/lang/Object;
    //   22: getstatic burp/Zesw.ZB : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: invokevirtual toByteArray : ()[B
    //   31: astore_3
    //   32: aload_3
    //   33: arraylength
    //   34: bipush #8
    //   36: iadd
    //   37: bipush #6
    //   39: ishr
    //   40: iconst_1
    //   41: iadd
    //   42: bipush #16
    //   44: imul
    //   45: newarray int
    //   47: astore #5
    //   49: iconst_0
    //   50: istore #6
    //   52: iload #6
    //   54: aload_3
    //   55: arraylength
    //   56: if_icmpge -> 99
    //   59: aload_3
    //   60: iload #6
    //   62: baload
    //   63: sipush #255
    //   66: iand
    //   67: istore #7
    //   69: aload #5
    //   71: iload #6
    //   73: iconst_2
    //   74: ishr
    //   75: dup2
    //   76: iaload
    //   77: iload #7
    //   79: bipush #24
    //   81: iload #6
    //   83: iconst_4
    //   84: irem
    //   85: bipush #8
    //   87: imul
    //   88: isub
    //   89: ishl
    //   90: ior
    //   91: iastore
    //   92: iinc #6, 1
    //   95: iload_2
    //   96: ifeq -> 52
    //   99: aload #5
    //   101: iload #6
    //   103: iconst_2
    //   104: ishr
    //   105: dup2
    //   106: iaload
    //   107: sipush #128
    //   110: bipush #24
    //   112: iload #6
    //   114: iconst_4
    //   115: irem
    //   116: bipush #8
    //   118: imul
    //   119: isub
    //   120: ishl
    //   121: ior
    //   122: iastore
    //   123: aload #5
    //   125: aload #5
    //   127: arraylength
    //   128: iconst_1
    //   129: isub
    //   130: aload_3
    //   131: arraylength
    //   132: bipush #8
    //   134: imul
    //   135: iastore
    //   136: bipush #80
    //   138: newarray int
    //   140: astore #7
    //   142: ldc 1732584193
    //   144: istore #8
    //   146: ldc -271733879
    //   148: istore #9
    //   150: ldc -1732584194
    //   152: istore #10
    //   154: ldc 271733878
    //   156: istore #11
    //   158: ldc -1009589776
    //   160: istore #12
    //   162: iconst_0
    //   163: istore #6
    //   165: iload #6
    //   167: aload #5
    //   169: arraylength
    //   170: if_icmpge -> 492
    //   173: iload #8
    //   175: istore #13
    //   177: iload #9
    //   179: istore #14
    //   181: iload #10
    //   183: istore #15
    //   185: iload #11
    //   187: istore #16
    //   189: iload #12
    //   191: istore #17
    //   193: iconst_0
    //   194: istore #18
    //   196: iload #18
    //   198: bipush #80
    //   200: if_icmpge -> 450
    //   203: iload #18
    //   205: bipush #16
    //   207: if_icmpge -> 234
    //   210: aload #7
    //   212: iload #18
    //   214: aload #5
    //   216: iload #6
    //   218: iload #18
    //   220: iadd
    //   221: iaload
    //   222: iastore
    //   223: iload_2
    //   224: ifeq -> 289
    //   227: goto -> 234
    //   230: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   233: athrow
    //   234: aload #7
    //   236: iload #18
    //   238: iconst_3
    //   239: isub
    //   240: iaload
    //   241: aload #7
    //   243: iload #18
    //   245: bipush #8
    //   247: isub
    //   248: iaload
    //   249: ixor
    //   250: aload #7
    //   252: iload #18
    //   254: bipush #14
    //   256: isub
    //   257: iaload
    //   258: ixor
    //   259: aload #7
    //   261: iload #18
    //   263: bipush #16
    //   265: isub
    //   266: iaload
    //   267: ixor
    //   268: istore #19
    //   270: iload #19
    //   272: iconst_1
    //   273: ishl
    //   274: iload #19
    //   276: bipush #31
    //   278: iushr
    //   279: ior
    //   280: istore #20
    //   282: aload #7
    //   284: iload #18
    //   286: iload #20
    //   288: iastore
    //   289: iload #8
    //   291: iconst_5
    //   292: ishl
    //   293: iload #8
    //   295: bipush #27
    //   297: iushr
    //   298: ior
    //   299: istore #19
    //   301: iload #19
    //   303: iload #12
    //   305: iadd
    //   306: aload #7
    //   308: iload #18
    //   310: iaload
    //   311: iadd
    //   312: iload #18
    //   314: bipush #20
    //   316: if_icmpge -> 342
    //   319: ldc 1518500249
    //   321: iload #9
    //   323: iload #10
    //   325: iand
    //   326: iload #9
    //   328: iconst_m1
    //   329: ixor
    //   330: iload #11
    //   332: iand
    //   333: ior
    //   334: iadd
    //   335: goto -> 412
    //   338: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   341: athrow
    //   342: iload #18
    //   344: bipush #40
    //   346: if_icmpge -> 367
    //   349: ldc 1859775393
    //   351: iload #9
    //   353: iload #10
    //   355: ixor
    //   356: iload #11
    //   358: ixor
    //   359: iadd
    //   360: goto -> 412
    //   363: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   366: athrow
    //   367: iload #18
    //   369: bipush #60
    //   371: if_icmpge -> 401
    //   374: ldc -1894007588
    //   376: iload #9
    //   378: iload #10
    //   380: iand
    //   381: iload #9
    //   383: iload #11
    //   385: iand
    //   386: ior
    //   387: iload #10
    //   389: iload #11
    //   391: iand
    //   392: ior
    //   393: iadd
    //   394: goto -> 412
    //   397: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   400: athrow
    //   401: ldc -899497514
    //   403: iload #9
    //   405: iload #10
    //   407: ixor
    //   408: iload #11
    //   410: ixor
    //   411: iadd
    //   412: iadd
    //   413: istore #20
    //   415: iload #11
    //   417: istore #12
    //   419: iload #10
    //   421: istore #11
    //   423: iload #9
    //   425: bipush #30
    //   427: ishl
    //   428: iload #9
    //   430: iconst_2
    //   431: iushr
    //   432: ior
    //   433: istore #10
    //   435: iload #8
    //   437: istore #9
    //   439: iload #20
    //   441: istore #8
    //   443: iinc #18, 1
    //   446: iload_2
    //   447: ifeq -> 196
    //   450: iload #8
    //   452: iload #13
    //   454: iadd
    //   455: istore #8
    //   457: iload #9
    //   459: iload #14
    //   461: iadd
    //   462: istore #9
    //   464: iload #10
    //   466: iload #15
    //   468: iadd
    //   469: istore #10
    //   471: iload #11
    //   473: iload #16
    //   475: iadd
    //   476: istore #11
    //   478: iload #12
    //   480: iload #17
    //   482: iadd
    //   483: istore #12
    //   485: iinc #6, 16
    //   488: iload_2
    //   489: ifeq -> 165
    //   492: iconst_5
    //   493: newarray int
    //   495: dup
    //   496: iconst_0
    //   497: iload #8
    //   499: iastore
    //   500: dup
    //   501: iconst_1
    //   502: iload #9
    //   504: iastore
    //   505: dup
    //   506: iconst_2
    //   507: iload #10
    //   509: iastore
    //   510: dup
    //   511: iconst_3
    //   512: iload #11
    //   514: iastore
    //   515: dup
    //   516: iconst_4
    //   517: iload #12
    //   519: iastore
    //   520: astore #13
    //   522: bipush #20
    //   524: newarray byte
    //   526: astore #14
    //   528: iconst_0
    //   529: istore #15
    //   531: iload #15
    //   533: bipush #20
    //   535: if_icmpge -> 576
    //   538: aload #13
    //   540: iload #15
    //   542: iconst_4
    //   543: idiv
    //   544: iaload
    //   545: istore #16
    //   547: iconst_3
    //   548: iload #15
    //   550: iconst_4
    //   551: irem
    //   552: isub
    //   553: bipush #8
    //   555: imul
    //   556: istore #17
    //   558: aload #14
    //   560: iload #15
    //   562: iload #16
    //   564: iload #17
    //   566: iushr
    //   567: i2b
    //   568: bastore
    //   569: iinc #15, 1
    //   572: iload_2
    //   573: ifeq -> 531
    //   576: aload #14
    //   578: astore #4
    //   580: sipush #-25553
    //   583: new java/math/BigInteger
    //   586: dup
    //   587: aload #4
    //   589: invokespecial <init> : ([B)V
    //   592: invokevirtual abs : ()Ljava/math/BigInteger;
    //   595: putstatic burp/Zegv.ZL : Ljava/lang/Object;
    //   598: sipush #6348
    //   601: invokestatic a : (II)Ljava/lang/String;
    //   604: iconst_1
    //   605: ldc burp/Zgdt
    //   607: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   610: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   613: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   616: astore_3
    //   617: aload_3
    //   618: arraylength
    //   619: istore #4
    //   621: iconst_0
    //   622: istore #5
    //   624: iload #5
    //   626: iload #4
    //   628: if_icmpge -> 765
    //   631: aload_3
    //   632: iload #5
    //   634: aaload
    //   635: astore #6
    //   637: aload #6
    //   639: invokevirtual getModifiers : ()I
    //   642: invokestatic isStatic : (I)Z
    //   645: ifne -> 655
    //   648: goto -> 758
    //   651: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   654: athrow
    //   655: aload #6
    //   657: invokevirtual getType : ()Ljava/lang/Class;
    //   660: astore #7
    //   662: aload #7
    //   664: ifnull -> 745
    //   667: aload #7
    //   669: invokevirtual isPrimitive : ()Z
    //   672: ifne -> 745
    //   675: goto -> 682
    //   678: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   681: athrow
    //   682: aload #7
    //   684: invokevirtual getPackage : ()Ljava/lang/Package;
    //   687: ifnull -> 745
    //   690: goto -> 697
    //   693: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   696: athrow
    //   697: aload #7
    //   699: invokevirtual getPackage : ()Ljava/lang/Package;
    //   702: invokevirtual getName : ()Ljava/lang/String;
    //   705: ifnull -> 745
    //   708: goto -> 715
    //   711: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   714: athrow
    //   715: aload #7
    //   717: invokevirtual getPackage : ()Ljava/lang/Package;
    //   720: invokevirtual getName : ()Ljava/lang/String;
    //   723: sipush #-25544
    //   726: sipush #21677
    //   729: invokestatic a : (II)Ljava/lang/String;
    //   732: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   735: ifne -> 745
    //   738: goto -> 745
    //   741: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   744: athrow
    //   745: aload #6
    //   747: iconst_1
    //   748: invokevirtual setAccessible : (Z)V
    //   751: aload #6
    //   753: aconst_null
    //   754: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   757: pop
    //   758: iinc #5, 1
    //   761: iload_2
    //   762: ifeq -> 624
    //   765: sipush #-25558
    //   768: sipush #-28116
    //   771: invokestatic a : (II)Ljava/lang/String;
    //   774: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   777: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   780: astore_3
    //   781: aload_3
    //   782: arraylength
    //   783: istore #4
    //   785: iconst_0
    //   786: istore #5
    //   788: iload #5
    //   790: iload #4
    //   792: if_icmpge -> 924
    //   795: aload_3
    //   796: iload #5
    //   798: aaload
    //   799: astore #6
    //   801: aload #6
    //   803: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   806: pop
    //   807: aload #6
    //   809: invokevirtual getModifiers : ()I
    //   812: invokestatic isStatic : (I)Z
    //   815: ifeq -> 910
    //   818: aload #6
    //   820: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   823: arraylength
    //   824: iconst_2
    //   825: if_icmpne -> 910
    //   828: goto -> 835
    //   831: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   834: athrow
    //   835: aload #6
    //   837: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   840: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   843: invokevirtual equals : (Ljava/lang/Object;)Z
    //   846: ifeq -> 910
    //   849: goto -> 856
    //   852: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   855: athrow
    //   856: aload #6
    //   858: iconst_1
    //   859: invokevirtual setAccessible : (Z)V
    //   862: aload #6
    //   864: aconst_null
    //   865: iconst_2
    //   866: anewarray java/lang/Object
    //   869: dup
    //   870: iconst_0
    //   871: aload_0
    //   872: aastore
    //   873: dup
    //   874: iconst_1
    //   875: aload_1
    //   876: ifnonnull -> 894
    //   879: goto -> 886
    //   882: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   885: athrow
    //   886: aload_1
    //   887: goto -> 901
    //   890: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   893: athrow
    //   894: aload_1
    //   895: checkcast [B
    //   898: invokevirtual clone : ()Ljava/lang/Object;
    //   901: aastore
    //   902: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   905: pop
    //   906: iload_2
    //   907: ifeq -> 924
    //   910: iinc #5, 1
    //   913: iload_2
    //   914: ifeq -> 788
    //   917: goto -> 924
    //   920: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   923: athrow
    //   924: iconst_0
    //   925: istore_3
    //   926: getstatic burp/Zsjw.ZQ : Ljava/lang/String;
    //   929: getstatic burp/Zgu4.Zs : Ljava/lang/Object;
    //   932: checkcast java/math/BigInteger
    //   935: invokevirtual intValue : ()I
    //   938: bipush #32
    //   940: irem
    //   941: invokestatic abs : (I)I
    //   944: invokevirtual charAt : (I)C
    //   947: getstatic burp/Zzi_.ZG : Ljava/lang/String;
    //   950: getstatic burp/Zrkd.ZO : Ljava/lang/Object;
    //   953: checkcast java/math/BigInteger
    //   956: invokevirtual intValue : ()I
    //   959: bipush #32
    //   961: irem
    //   962: invokestatic abs : (I)I
    //   965: invokevirtual charAt : (I)C
    //   968: if_icmple -> 1312
    //   971: sipush #-25541
    //   974: sipush #-13356
    //   977: invokestatic a : (II)Ljava/lang/String;
    //   980: iconst_1
    //   981: ldc burp/Zgwq
    //   983: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   986: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   989: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   992: astore #4
    //   994: aload #4
    //   996: arraylength
    //   997: istore #5
    //   999: iconst_0
    //   1000: istore #6
    //   1002: iload #6
    //   1004: iload #5
    //   1006: if_icmpge -> 1144
    //   1009: aload #4
    //   1011: iload #6
    //   1013: aaload
    //   1014: astore #7
    //   1016: aload #7
    //   1018: invokevirtual getModifiers : ()I
    //   1021: invokestatic isStatic : (I)Z
    //   1024: ifne -> 1034
    //   1027: goto -> 1137
    //   1030: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1033: athrow
    //   1034: aload #7
    //   1036: invokevirtual getType : ()Ljava/lang/Class;
    //   1039: astore #8
    //   1041: aload #8
    //   1043: ifnull -> 1124
    //   1046: aload #8
    //   1048: invokevirtual isPrimitive : ()Z
    //   1051: ifne -> 1124
    //   1054: goto -> 1061
    //   1057: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1060: athrow
    //   1061: aload #8
    //   1063: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1066: ifnull -> 1124
    //   1069: goto -> 1076
    //   1072: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1075: athrow
    //   1076: aload #8
    //   1078: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1081: invokevirtual getName : ()Ljava/lang/String;
    //   1084: ifnull -> 1124
    //   1087: goto -> 1094
    //   1090: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1093: athrow
    //   1094: aload #8
    //   1096: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1099: invokevirtual getName : ()Ljava/lang/String;
    //   1102: sipush #-25555
    //   1105: sipush #-8969
    //   1108: invokestatic a : (II)Ljava/lang/String;
    //   1111: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1114: ifne -> 1124
    //   1117: goto -> 1124
    //   1120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1123: athrow
    //   1124: aload #7
    //   1126: iconst_1
    //   1127: invokevirtual setAccessible : (Z)V
    //   1130: aload #7
    //   1132: aconst_null
    //   1133: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1136: pop
    //   1137: iinc #6, 1
    //   1140: iload_2
    //   1141: ifeq -> 1002
    //   1144: sipush #-25548
    //   1147: sipush #18184
    //   1150: invokestatic a : (II)Ljava/lang/String;
    //   1153: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1156: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1159: astore #4
    //   1161: aload #4
    //   1163: arraylength
    //   1164: istore #5
    //   1166: iconst_0
    //   1167: istore #6
    //   1169: iload #6
    //   1171: iload #5
    //   1173: if_icmpge -> 1309
    //   1176: aload #4
    //   1178: iload #6
    //   1180: aaload
    //   1181: astore #7
    //   1183: aload #7
    //   1185: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1188: pop
    //   1189: aload #7
    //   1191: invokevirtual getModifiers : ()I
    //   1194: invokestatic isStatic : (I)Z
    //   1197: ifeq -> 1295
    //   1200: aload #7
    //   1202: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1205: arraylength
    //   1206: iconst_2
    //   1207: if_icmpne -> 1295
    //   1210: goto -> 1217
    //   1213: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1216: athrow
    //   1217: aload #7
    //   1219: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1222: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1225: if_acmpne -> 1295
    //   1228: goto -> 1235
    //   1231: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1234: athrow
    //   1235: aload #7
    //   1237: iconst_1
    //   1238: invokevirtual setAccessible : (Z)V
    //   1241: aload #7
    //   1243: aconst_null
    //   1244: iconst_2
    //   1245: anewarray java/lang/Object
    //   1248: dup
    //   1249: iconst_0
    //   1250: aload_0
    //   1251: aastore
    //   1252: dup
    //   1253: iconst_1
    //   1254: aload_1
    //   1255: ifnonnull -> 1273
    //   1258: goto -> 1265
    //   1261: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1264: athrow
    //   1265: aload_1
    //   1266: goto -> 1280
    //   1269: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1272: athrow
    //   1273: aload_1
    //   1274: checkcast [B
    //   1277: invokevirtual clone : ()Ljava/lang/Object;
    //   1280: aastore
    //   1281: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1284: checkcast java/lang/Boolean
    //   1287: invokevirtual booleanValue : ()Z
    //   1290: istore_3
    //   1291: iload_2
    //   1292: ifeq -> 1309
    //   1295: iinc #6, 1
    //   1298: iload_2
    //   1299: ifeq -> 1169
    //   1302: goto -> 1309
    //   1305: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1308: athrow
    //   1309: goto -> 1650
    //   1312: sipush #-25549
    //   1315: sipush #5055
    //   1318: invokestatic a : (II)Ljava/lang/String;
    //   1321: iconst_1
    //   1322: ldc burp/Zbsr
    //   1324: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1327: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1330: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1333: astore #4
    //   1335: aload #4
    //   1337: arraylength
    //   1338: istore #5
    //   1340: iconst_0
    //   1341: istore #6
    //   1343: iload #6
    //   1345: iload #5
    //   1347: if_icmpge -> 1485
    //   1350: aload #4
    //   1352: iload #6
    //   1354: aaload
    //   1355: astore #7
    //   1357: aload #7
    //   1359: invokevirtual getModifiers : ()I
    //   1362: invokestatic isStatic : (I)Z
    //   1365: ifne -> 1375
    //   1368: goto -> 1478
    //   1371: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1374: athrow
    //   1375: aload #7
    //   1377: invokevirtual getType : ()Ljava/lang/Class;
    //   1380: astore #8
    //   1382: aload #8
    //   1384: ifnull -> 1465
    //   1387: aload #8
    //   1389: invokevirtual isPrimitive : ()Z
    //   1392: ifne -> 1465
    //   1395: goto -> 1402
    //   1398: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1401: athrow
    //   1402: aload #8
    //   1404: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1407: ifnull -> 1465
    //   1410: goto -> 1417
    //   1413: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1416: athrow
    //   1417: aload #8
    //   1419: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1422: invokevirtual getName : ()Ljava/lang/String;
    //   1425: ifnull -> 1465
    //   1428: goto -> 1435
    //   1431: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1434: athrow
    //   1435: aload #8
    //   1437: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1440: invokevirtual getName : ()Ljava/lang/String;
    //   1443: sipush #-25555
    //   1446: sipush #-8969
    //   1449: invokestatic a : (II)Ljava/lang/String;
    //   1452: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1455: ifne -> 1465
    //   1458: goto -> 1465
    //   1461: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1464: athrow
    //   1465: aload #7
    //   1467: iconst_1
    //   1468: invokevirtual setAccessible : (Z)V
    //   1471: aload #7
    //   1473: aconst_null
    //   1474: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1477: pop
    //   1478: iinc #6, 1
    //   1481: iload_2
    //   1482: ifeq -> 1343
    //   1485: sipush #-25557
    //   1488: sipush #-13168
    //   1491: invokestatic a : (II)Ljava/lang/String;
    //   1494: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1497: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1500: astore #4
    //   1502: aload #4
    //   1504: arraylength
    //   1505: istore #5
    //   1507: iconst_0
    //   1508: istore #6
    //   1510: iload #6
    //   1512: iload #5
    //   1514: if_icmpge -> 1650
    //   1517: aload #4
    //   1519: iload #6
    //   1521: aaload
    //   1522: astore #7
    //   1524: aload #7
    //   1526: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1529: pop
    //   1530: aload #7
    //   1532: invokevirtual getModifiers : ()I
    //   1535: invokestatic isStatic : (I)Z
    //   1538: ifeq -> 1636
    //   1541: aload #7
    //   1543: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1546: arraylength
    //   1547: iconst_2
    //   1548: if_icmpne -> 1636
    //   1551: goto -> 1558
    //   1554: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1557: athrow
    //   1558: aload #7
    //   1560: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1563: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1566: if_acmpne -> 1636
    //   1569: goto -> 1576
    //   1572: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1575: athrow
    //   1576: aload #7
    //   1578: iconst_1
    //   1579: invokevirtual setAccessible : (Z)V
    //   1582: aload #7
    //   1584: aconst_null
    //   1585: iconst_2
    //   1586: anewarray java/lang/Object
    //   1589: dup
    //   1590: iconst_0
    //   1591: aload_0
    //   1592: aastore
    //   1593: dup
    //   1594: iconst_1
    //   1595: aload_1
    //   1596: ifnonnull -> 1614
    //   1599: goto -> 1606
    //   1602: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1605: athrow
    //   1606: aload_1
    //   1607: goto -> 1621
    //   1610: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1613: athrow
    //   1614: aload_1
    //   1615: checkcast [B
    //   1618: invokevirtual clone : ()Ljava/lang/Object;
    //   1621: aastore
    //   1622: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1625: checkcast java/lang/Boolean
    //   1628: invokevirtual booleanValue : ()Z
    //   1631: istore_3
    //   1632: iload_2
    //   1633: ifeq -> 1650
    //   1636: iinc #6, 1
    //   1639: iload_2
    //   1640: ifeq -> 1510
    //   1643: goto -> 1650
    //   1646: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1649: athrow
    //   1650: iload_3
    //   1651: ifeq -> 1656
    //   1654: iload_3
    //   1655: ireturn
    //   1656: getstatic burp/Zrm6.ZV : Ljava/lang/String;
    //   1659: getstatic burp/Zt4p.Zh : Ljava/lang/Object;
    //   1662: checkcast java/math/BigInteger
    //   1665: invokevirtual intValue : ()I
    //   1668: bipush #32
    //   1670: irem
    //   1671: invokestatic abs : (I)I
    //   1674: invokevirtual charAt : (I)C
    //   1677: getstatic burp/Zr9u.Zc : Ljava/lang/String;
    //   1680: getstatic burp/Ze1k.ZD : Ljava/lang/Object;
    //   1683: checkcast java/math/BigInteger
    //   1686: invokevirtual intValue : ()I
    //   1689: bipush #32
    //   1691: irem
    //   1692: invokestatic abs : (I)I
    //   1695: invokevirtual charAt : (I)C
    //   1698: if_icmpgt -> 2043
    //   1701: sipush #-25550
    //   1704: sipush #9808
    //   1707: invokestatic a : (II)Ljava/lang/String;
    //   1710: iconst_1
    //   1711: ldc burp/Ze0w
    //   1713: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1716: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1719: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1722: astore #4
    //   1724: aload #4
    //   1726: arraylength
    //   1727: istore #5
    //   1729: iconst_0
    //   1730: istore #6
    //   1732: iload #6
    //   1734: iload #5
    //   1736: if_icmpge -> 1874
    //   1739: aload #4
    //   1741: iload #6
    //   1743: aaload
    //   1744: astore #7
    //   1746: aload #7
    //   1748: invokevirtual getModifiers : ()I
    //   1751: invokestatic isStatic : (I)Z
    //   1754: ifne -> 1764
    //   1757: goto -> 1867
    //   1760: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1763: athrow
    //   1764: aload #7
    //   1766: invokevirtual getType : ()Ljava/lang/Class;
    //   1769: astore #8
    //   1771: aload #8
    //   1773: ifnull -> 1854
    //   1776: aload #8
    //   1778: invokevirtual isPrimitive : ()Z
    //   1781: ifne -> 1854
    //   1784: goto -> 1791
    //   1787: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1790: athrow
    //   1791: aload #8
    //   1793: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1796: ifnull -> 1854
    //   1799: goto -> 1806
    //   1802: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1805: athrow
    //   1806: aload #8
    //   1808: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1811: invokevirtual getName : ()Ljava/lang/String;
    //   1814: ifnull -> 1854
    //   1817: goto -> 1824
    //   1820: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1823: athrow
    //   1824: aload #8
    //   1826: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1829: invokevirtual getName : ()Ljava/lang/String;
    //   1832: sipush #-25555
    //   1835: sipush #-8969
    //   1838: invokestatic a : (II)Ljava/lang/String;
    //   1841: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1844: ifne -> 1854
    //   1847: goto -> 1854
    //   1850: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1853: athrow
    //   1854: aload #7
    //   1856: iconst_1
    //   1857: invokevirtual setAccessible : (Z)V
    //   1860: aload #7
    //   1862: aconst_null
    //   1863: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1866: pop
    //   1867: iinc #6, 1
    //   1870: iload_2
    //   1871: ifeq -> 1732
    //   1874: sipush #-25543
    //   1877: sipush #20435
    //   1880: invokestatic a : (II)Ljava/lang/String;
    //   1883: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1886: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1889: astore #4
    //   1891: aload #4
    //   1893: arraylength
    //   1894: istore #5
    //   1896: iconst_0
    //   1897: istore #6
    //   1899: iload #6
    //   1901: iload #5
    //   1903: if_icmpge -> 2039
    //   1906: aload #4
    //   1908: iload #6
    //   1910: aaload
    //   1911: astore #7
    //   1913: aload #7
    //   1915: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1918: pop
    //   1919: aload #7
    //   1921: invokevirtual getModifiers : ()I
    //   1924: invokestatic isStatic : (I)Z
    //   1927: ifeq -> 2025
    //   1930: aload #7
    //   1932: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1935: arraylength
    //   1936: iconst_2
    //   1937: if_icmpne -> 2025
    //   1940: goto -> 1947
    //   1943: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1946: athrow
    //   1947: aload #7
    //   1949: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1952: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1955: if_acmpne -> 2025
    //   1958: goto -> 1965
    //   1961: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1964: athrow
    //   1965: aload #7
    //   1967: iconst_1
    //   1968: invokevirtual setAccessible : (Z)V
    //   1971: aload #7
    //   1973: aconst_null
    //   1974: iconst_2
    //   1975: anewarray java/lang/Object
    //   1978: dup
    //   1979: iconst_0
    //   1980: aload_0
    //   1981: aastore
    //   1982: dup
    //   1983: iconst_1
    //   1984: aload_1
    //   1985: ifnonnull -> 2003
    //   1988: goto -> 1995
    //   1991: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1994: athrow
    //   1995: aload_1
    //   1996: goto -> 2010
    //   1999: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2002: athrow
    //   2003: aload_1
    //   2004: checkcast [B
    //   2007: invokevirtual clone : ()Ljava/lang/Object;
    //   2010: aastore
    //   2011: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2014: checkcast java/lang/Boolean
    //   2017: invokevirtual booleanValue : ()Z
    //   2020: istore_3
    //   2021: iload_2
    //   2022: ifeq -> 2039
    //   2025: iinc #6, 1
    //   2028: iload_2
    //   2029: ifeq -> 1899
    //   2032: goto -> 2039
    //   2035: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2038: athrow
    //   2039: iload_2
    //   2040: ifeq -> 2381
    //   2043: sipush #-25545
    //   2046: sipush #30711
    //   2049: invokestatic a : (II)Ljava/lang/String;
    //   2052: iconst_1
    //   2053: ldc burp/Zz9p
    //   2055: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2058: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2061: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2064: astore #4
    //   2066: aload #4
    //   2068: arraylength
    //   2069: istore #5
    //   2071: iconst_0
    //   2072: istore #6
    //   2074: iload #6
    //   2076: iload #5
    //   2078: if_icmpge -> 2216
    //   2081: aload #4
    //   2083: iload #6
    //   2085: aaload
    //   2086: astore #7
    //   2088: aload #7
    //   2090: invokevirtual getModifiers : ()I
    //   2093: invokestatic isStatic : (I)Z
    //   2096: ifne -> 2106
    //   2099: goto -> 2209
    //   2102: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2105: athrow
    //   2106: aload #7
    //   2108: invokevirtual getType : ()Ljava/lang/Class;
    //   2111: astore #8
    //   2113: aload #8
    //   2115: ifnull -> 2196
    //   2118: aload #8
    //   2120: invokevirtual isPrimitive : ()Z
    //   2123: ifne -> 2196
    //   2126: goto -> 2133
    //   2129: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2132: athrow
    //   2133: aload #8
    //   2135: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2138: ifnull -> 2196
    //   2141: goto -> 2148
    //   2144: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2147: athrow
    //   2148: aload #8
    //   2150: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2153: invokevirtual getName : ()Ljava/lang/String;
    //   2156: ifnull -> 2196
    //   2159: goto -> 2166
    //   2162: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2165: athrow
    //   2166: aload #8
    //   2168: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2171: invokevirtual getName : ()Ljava/lang/String;
    //   2174: sipush #-25555
    //   2177: sipush #-8969
    //   2180: invokestatic a : (II)Ljava/lang/String;
    //   2183: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2186: ifne -> 2196
    //   2189: goto -> 2196
    //   2192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2195: athrow
    //   2196: aload #7
    //   2198: iconst_1
    //   2199: invokevirtual setAccessible : (Z)V
    //   2202: aload #7
    //   2204: aconst_null
    //   2205: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2208: pop
    //   2209: iinc #6, 1
    //   2212: iload_2
    //   2213: ifeq -> 2074
    //   2216: sipush #-25560
    //   2219: sipush #26291
    //   2222: invokestatic a : (II)Ljava/lang/String;
    //   2225: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2228: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2231: astore #4
    //   2233: aload #4
    //   2235: arraylength
    //   2236: istore #5
    //   2238: iconst_0
    //   2239: istore #6
    //   2241: iload #6
    //   2243: iload #5
    //   2245: if_icmpge -> 2381
    //   2248: aload #4
    //   2250: iload #6
    //   2252: aaload
    //   2253: astore #7
    //   2255: aload #7
    //   2257: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2260: pop
    //   2261: aload #7
    //   2263: invokevirtual getModifiers : ()I
    //   2266: invokestatic isStatic : (I)Z
    //   2269: ifeq -> 2367
    //   2272: aload #7
    //   2274: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2277: arraylength
    //   2278: iconst_2
    //   2279: if_icmpne -> 2367
    //   2282: goto -> 2289
    //   2285: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2288: athrow
    //   2289: aload #7
    //   2291: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2294: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2297: if_acmpne -> 2367
    //   2300: goto -> 2307
    //   2303: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2306: athrow
    //   2307: aload #7
    //   2309: iconst_1
    //   2310: invokevirtual setAccessible : (Z)V
    //   2313: aload #7
    //   2315: aconst_null
    //   2316: iconst_2
    //   2317: anewarray java/lang/Object
    //   2320: dup
    //   2321: iconst_0
    //   2322: aload_0
    //   2323: aastore
    //   2324: dup
    //   2325: iconst_1
    //   2326: aload_1
    //   2327: ifnonnull -> 2345
    //   2330: goto -> 2337
    //   2333: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2336: athrow
    //   2337: aload_1
    //   2338: goto -> 2352
    //   2341: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2344: athrow
    //   2345: aload_1
    //   2346: checkcast [B
    //   2349: invokevirtual clone : ()Ljava/lang/Object;
    //   2352: aastore
    //   2353: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2356: checkcast java/lang/Boolean
    //   2359: invokevirtual booleanValue : ()Z
    //   2362: istore_3
    //   2363: iload_2
    //   2364: ifeq -> 2381
    //   2367: iinc #6, 1
    //   2370: iload_2
    //   2371: ifeq -> 2241
    //   2374: goto -> 2381
    //   2377: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2380: athrow
    //   2381: iload_3
    //   2382: ifeq -> 2387
    //   2385: iload_3
    //   2386: ireturn
    //   2387: getstatic burp/Zreu.ZI : Ljava/lang/String;
    //   2390: getstatic burp/Zsn9.Zg : Ljava/lang/Object;
    //   2393: checkcast java/math/BigInteger
    //   2396: invokevirtual intValue : ()I
    //   2399: bipush #32
    //   2401: irem
    //   2402: invokestatic abs : (I)I
    //   2405: invokevirtual charAt : (I)C
    //   2408: getstatic burp/Zk92.Zc : Ljava/lang/String;
    //   2411: getstatic burp/Zzht.Zb : Ljava/lang/Object;
    //   2414: checkcast java/math/BigInteger
    //   2417: invokevirtual intValue : ()I
    //   2420: bipush #32
    //   2422: irem
    //   2423: invokestatic abs : (I)I
    //   2426: invokevirtual charAt : (I)C
    //   2429: if_icmple -> 2774
    //   2432: sipush #-25539
    //   2435: sipush #6503
    //   2438: invokestatic a : (II)Ljava/lang/String;
    //   2441: iconst_1
    //   2442: ldc burp/Zr8s
    //   2444: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2447: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2450: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2453: astore #4
    //   2455: aload #4
    //   2457: arraylength
    //   2458: istore #5
    //   2460: iconst_0
    //   2461: istore #6
    //   2463: iload #6
    //   2465: iload #5
    //   2467: if_icmpge -> 2605
    //   2470: aload #4
    //   2472: iload #6
    //   2474: aaload
    //   2475: astore #7
    //   2477: aload #7
    //   2479: invokevirtual getModifiers : ()I
    //   2482: invokestatic isStatic : (I)Z
    //   2485: ifne -> 2495
    //   2488: goto -> 2598
    //   2491: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2494: athrow
    //   2495: aload #7
    //   2497: invokevirtual getType : ()Ljava/lang/Class;
    //   2500: astore #8
    //   2502: aload #8
    //   2504: ifnull -> 2585
    //   2507: aload #8
    //   2509: invokevirtual isPrimitive : ()Z
    //   2512: ifne -> 2585
    //   2515: goto -> 2522
    //   2518: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2521: athrow
    //   2522: aload #8
    //   2524: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2527: ifnull -> 2585
    //   2530: goto -> 2537
    //   2533: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2536: athrow
    //   2537: aload #8
    //   2539: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2542: invokevirtual getName : ()Ljava/lang/String;
    //   2545: ifnull -> 2585
    //   2548: goto -> 2555
    //   2551: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2554: athrow
    //   2555: aload #8
    //   2557: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2560: invokevirtual getName : ()Ljava/lang/String;
    //   2563: sipush #-25555
    //   2566: sipush #-8969
    //   2569: invokestatic a : (II)Ljava/lang/String;
    //   2572: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2575: ifne -> 2585
    //   2578: goto -> 2585
    //   2581: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2584: athrow
    //   2585: aload #7
    //   2587: iconst_1
    //   2588: invokevirtual setAccessible : (Z)V
    //   2591: aload #7
    //   2593: aconst_null
    //   2594: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2597: pop
    //   2598: iinc #6, 1
    //   2601: iload_2
    //   2602: ifeq -> 2463
    //   2605: sipush #-25552
    //   2608: sipush #11226
    //   2611: invokestatic a : (II)Ljava/lang/String;
    //   2614: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2617: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2620: astore #4
    //   2622: aload #4
    //   2624: arraylength
    //   2625: istore #5
    //   2627: iconst_0
    //   2628: istore #6
    //   2630: iload #6
    //   2632: iload #5
    //   2634: if_icmpge -> 2770
    //   2637: aload #4
    //   2639: iload #6
    //   2641: aaload
    //   2642: astore #7
    //   2644: aload #7
    //   2646: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2649: pop
    //   2650: aload #7
    //   2652: invokevirtual getModifiers : ()I
    //   2655: invokestatic isStatic : (I)Z
    //   2658: ifeq -> 2756
    //   2661: aload #7
    //   2663: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2666: arraylength
    //   2667: iconst_2
    //   2668: if_icmpne -> 2756
    //   2671: goto -> 2678
    //   2674: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2677: athrow
    //   2678: aload #7
    //   2680: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2683: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2686: if_acmpne -> 2756
    //   2689: goto -> 2696
    //   2692: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2695: athrow
    //   2696: aload #7
    //   2698: iconst_1
    //   2699: invokevirtual setAccessible : (Z)V
    //   2702: aload #7
    //   2704: aconst_null
    //   2705: iconst_2
    //   2706: anewarray java/lang/Object
    //   2709: dup
    //   2710: iconst_0
    //   2711: aload_0
    //   2712: aastore
    //   2713: dup
    //   2714: iconst_1
    //   2715: aload_1
    //   2716: ifnonnull -> 2734
    //   2719: goto -> 2726
    //   2722: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2725: athrow
    //   2726: aload_1
    //   2727: goto -> 2741
    //   2730: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2733: athrow
    //   2734: aload_1
    //   2735: checkcast [B
    //   2738: invokevirtual clone : ()Ljava/lang/Object;
    //   2741: aastore
    //   2742: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2745: checkcast java/lang/Boolean
    //   2748: invokevirtual booleanValue : ()Z
    //   2751: istore_3
    //   2752: iload_2
    //   2753: ifeq -> 2770
    //   2756: iinc #6, 1
    //   2759: iload_2
    //   2760: ifeq -> 2630
    //   2763: goto -> 2770
    //   2766: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2769: athrow
    //   2770: iload_2
    //   2771: ifeq -> 3112
    //   2774: sipush #-25554
    //   2777: sipush #16288
    //   2780: invokestatic a : (II)Ljava/lang/String;
    //   2783: iconst_1
    //   2784: ldc burp/Zt0t
    //   2786: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2789: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2792: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2795: astore #4
    //   2797: aload #4
    //   2799: arraylength
    //   2800: istore #5
    //   2802: iconst_0
    //   2803: istore #6
    //   2805: iload #6
    //   2807: iload #5
    //   2809: if_icmpge -> 2947
    //   2812: aload #4
    //   2814: iload #6
    //   2816: aaload
    //   2817: astore #7
    //   2819: aload #7
    //   2821: invokevirtual getModifiers : ()I
    //   2824: invokestatic isStatic : (I)Z
    //   2827: ifne -> 2837
    //   2830: goto -> 2940
    //   2833: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2836: athrow
    //   2837: aload #7
    //   2839: invokevirtual getType : ()Ljava/lang/Class;
    //   2842: astore #8
    //   2844: aload #8
    //   2846: ifnull -> 2927
    //   2849: aload #8
    //   2851: invokevirtual isPrimitive : ()Z
    //   2854: ifne -> 2927
    //   2857: goto -> 2864
    //   2860: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2863: athrow
    //   2864: aload #8
    //   2866: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2869: ifnull -> 2927
    //   2872: goto -> 2879
    //   2875: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2878: athrow
    //   2879: aload #8
    //   2881: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2884: invokevirtual getName : ()Ljava/lang/String;
    //   2887: ifnull -> 2927
    //   2890: goto -> 2897
    //   2893: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2896: athrow
    //   2897: aload #8
    //   2899: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2902: invokevirtual getName : ()Ljava/lang/String;
    //   2905: sipush #-25555
    //   2908: sipush #-8969
    //   2911: invokestatic a : (II)Ljava/lang/String;
    //   2914: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2917: ifne -> 2927
    //   2920: goto -> 2927
    //   2923: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2926: athrow
    //   2927: aload #7
    //   2929: iconst_1
    //   2930: invokevirtual setAccessible : (Z)V
    //   2933: aload #7
    //   2935: aconst_null
    //   2936: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2939: pop
    //   2940: iinc #6, 1
    //   2943: iload_2
    //   2944: ifeq -> 2805
    //   2947: sipush #-25561
    //   2950: sipush #-9916
    //   2953: invokestatic a : (II)Ljava/lang/String;
    //   2956: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2959: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2962: astore #4
    //   2964: aload #4
    //   2966: arraylength
    //   2967: istore #5
    //   2969: iconst_0
    //   2970: istore #6
    //   2972: iload #6
    //   2974: iload #5
    //   2976: if_icmpge -> 3112
    //   2979: aload #4
    //   2981: iload #6
    //   2983: aaload
    //   2984: astore #7
    //   2986: aload #7
    //   2988: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2991: pop
    //   2992: aload #7
    //   2994: invokevirtual getModifiers : ()I
    //   2997: invokestatic isStatic : (I)Z
    //   3000: ifeq -> 3098
    //   3003: aload #7
    //   3005: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3008: arraylength
    //   3009: iconst_2
    //   3010: if_icmpne -> 3098
    //   3013: goto -> 3020
    //   3016: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3019: athrow
    //   3020: aload #7
    //   3022: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3025: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3028: if_acmpne -> 3098
    //   3031: goto -> 3038
    //   3034: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3037: athrow
    //   3038: aload #7
    //   3040: iconst_1
    //   3041: invokevirtual setAccessible : (Z)V
    //   3044: aload #7
    //   3046: aconst_null
    //   3047: iconst_2
    //   3048: anewarray java/lang/Object
    //   3051: dup
    //   3052: iconst_0
    //   3053: aload_0
    //   3054: aastore
    //   3055: dup
    //   3056: iconst_1
    //   3057: aload_1
    //   3058: ifnonnull -> 3076
    //   3061: goto -> 3068
    //   3064: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3067: athrow
    //   3068: aload_1
    //   3069: goto -> 3083
    //   3072: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3075: athrow
    //   3076: aload_1
    //   3077: checkcast [B
    //   3080: invokevirtual clone : ()Ljava/lang/Object;
    //   3083: aastore
    //   3084: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3087: checkcast java/lang/Boolean
    //   3090: invokevirtual booleanValue : ()Z
    //   3093: istore_3
    //   3094: iload_2
    //   3095: ifeq -> 3112
    //   3098: iinc #6, 1
    //   3101: iload_2
    //   3102: ifeq -> 2972
    //   3105: goto -> 3112
    //   3108: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3111: athrow
    //   3112: iload_3
    //   3113: ifeq -> 3118
    //   3116: iload_3
    //   3117: ireturn
    //   3118: getstatic burp/Zrp2.ZJ : Ljava/lang/String;
    //   3121: getstatic burp/Zgpx.ZQ : Ljava/lang/Object;
    //   3124: checkcast java/math/BigInteger
    //   3127: invokevirtual intValue : ()I
    //   3130: bipush #32
    //   3132: irem
    //   3133: invokestatic abs : (I)I
    //   3136: invokevirtual charAt : (I)C
    //   3139: getstatic burp/Zlc2.Zz : Ljava/lang/String;
    //   3142: getstatic burp/Zg1l.Zg : Ljava/lang/Object;
    //   3145: checkcast java/math/BigInteger
    //   3148: invokevirtual intValue : ()I
    //   3151: bipush #32
    //   3153: irem
    //   3154: invokestatic abs : (I)I
    //   3157: invokevirtual charAt : (I)C
    //   3160: if_icmpgt -> 3505
    //   3163: sipush #-25556
    //   3166: sipush #32586
    //   3169: invokestatic a : (II)Ljava/lang/String;
    //   3172: iconst_1
    //   3173: ldc burp/Zrml
    //   3175: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3178: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3181: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3184: astore #4
    //   3186: aload #4
    //   3188: arraylength
    //   3189: istore #5
    //   3191: iconst_0
    //   3192: istore #6
    //   3194: iload #6
    //   3196: iload #5
    //   3198: if_icmpge -> 3336
    //   3201: aload #4
    //   3203: iload #6
    //   3205: aaload
    //   3206: astore #7
    //   3208: aload #7
    //   3210: invokevirtual getModifiers : ()I
    //   3213: invokestatic isStatic : (I)Z
    //   3216: ifne -> 3226
    //   3219: goto -> 3329
    //   3222: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3225: athrow
    //   3226: aload #7
    //   3228: invokevirtual getType : ()Ljava/lang/Class;
    //   3231: astore #8
    //   3233: aload #8
    //   3235: ifnull -> 3316
    //   3238: aload #8
    //   3240: invokevirtual isPrimitive : ()Z
    //   3243: ifne -> 3316
    //   3246: goto -> 3253
    //   3249: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3252: athrow
    //   3253: aload #8
    //   3255: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3258: ifnull -> 3316
    //   3261: goto -> 3268
    //   3264: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3267: athrow
    //   3268: aload #8
    //   3270: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3273: invokevirtual getName : ()Ljava/lang/String;
    //   3276: ifnull -> 3316
    //   3279: goto -> 3286
    //   3282: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3285: athrow
    //   3286: aload #8
    //   3288: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3291: invokevirtual getName : ()Ljava/lang/String;
    //   3294: sipush #-25555
    //   3297: sipush #-8969
    //   3300: invokestatic a : (II)Ljava/lang/String;
    //   3303: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3306: ifne -> 3316
    //   3309: goto -> 3316
    //   3312: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3315: athrow
    //   3316: aload #7
    //   3318: iconst_1
    //   3319: invokevirtual setAccessible : (Z)V
    //   3322: aload #7
    //   3324: aconst_null
    //   3325: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3328: pop
    //   3329: iinc #6, 1
    //   3332: iload_2
    //   3333: ifeq -> 3194
    //   3336: sipush #-25559
    //   3339: sipush #-12674
    //   3342: invokestatic a : (II)Ljava/lang/String;
    //   3345: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3348: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3351: astore #4
    //   3353: aload #4
    //   3355: arraylength
    //   3356: istore #5
    //   3358: iconst_0
    //   3359: istore #6
    //   3361: iload #6
    //   3363: iload #5
    //   3365: if_icmpge -> 3501
    //   3368: aload #4
    //   3370: iload #6
    //   3372: aaload
    //   3373: astore #7
    //   3375: aload #7
    //   3377: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3380: pop
    //   3381: aload #7
    //   3383: invokevirtual getModifiers : ()I
    //   3386: invokestatic isStatic : (I)Z
    //   3389: ifeq -> 3487
    //   3392: aload #7
    //   3394: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3397: arraylength
    //   3398: iconst_2
    //   3399: if_icmpne -> 3487
    //   3402: goto -> 3409
    //   3405: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3408: athrow
    //   3409: aload #7
    //   3411: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3414: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3417: if_acmpne -> 3487
    //   3420: goto -> 3427
    //   3423: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3426: athrow
    //   3427: aload #7
    //   3429: iconst_1
    //   3430: invokevirtual setAccessible : (Z)V
    //   3433: aload #7
    //   3435: aconst_null
    //   3436: iconst_2
    //   3437: anewarray java/lang/Object
    //   3440: dup
    //   3441: iconst_0
    //   3442: aload_0
    //   3443: aastore
    //   3444: dup
    //   3445: iconst_1
    //   3446: aload_1
    //   3447: ifnonnull -> 3465
    //   3450: goto -> 3457
    //   3453: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3456: athrow
    //   3457: aload_1
    //   3458: goto -> 3472
    //   3461: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3464: athrow
    //   3465: aload_1
    //   3466: checkcast [B
    //   3469: invokevirtual clone : ()Ljava/lang/Object;
    //   3472: aastore
    //   3473: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3476: checkcast java/lang/Boolean
    //   3479: invokevirtual booleanValue : ()Z
    //   3482: istore_3
    //   3483: iload_2
    //   3484: ifeq -> 3501
    //   3487: iinc #6, 1
    //   3490: iload_2
    //   3491: ifeq -> 3361
    //   3494: goto -> 3501
    //   3497: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3500: athrow
    //   3501: iload_2
    //   3502: ifeq -> 3843
    //   3505: sipush #-25546
    //   3508: sipush #6162
    //   3511: invokestatic a : (II)Ljava/lang/String;
    //   3514: iconst_1
    //   3515: ldc burp/Ztq8
    //   3517: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3520: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3523: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3526: astore #4
    //   3528: aload #4
    //   3530: arraylength
    //   3531: istore #5
    //   3533: iconst_0
    //   3534: istore #6
    //   3536: iload #6
    //   3538: iload #5
    //   3540: if_icmpge -> 3678
    //   3543: aload #4
    //   3545: iload #6
    //   3547: aaload
    //   3548: astore #7
    //   3550: aload #7
    //   3552: invokevirtual getModifiers : ()I
    //   3555: invokestatic isStatic : (I)Z
    //   3558: ifne -> 3568
    //   3561: goto -> 3671
    //   3564: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3567: athrow
    //   3568: aload #7
    //   3570: invokevirtual getType : ()Ljava/lang/Class;
    //   3573: astore #8
    //   3575: aload #8
    //   3577: ifnull -> 3658
    //   3580: aload #8
    //   3582: invokevirtual isPrimitive : ()Z
    //   3585: ifne -> 3658
    //   3588: goto -> 3595
    //   3591: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3594: athrow
    //   3595: aload #8
    //   3597: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3600: ifnull -> 3658
    //   3603: goto -> 3610
    //   3606: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3609: athrow
    //   3610: aload #8
    //   3612: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3615: invokevirtual getName : ()Ljava/lang/String;
    //   3618: ifnull -> 3658
    //   3621: goto -> 3628
    //   3624: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3627: athrow
    //   3628: aload #8
    //   3630: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3633: invokevirtual getName : ()Ljava/lang/String;
    //   3636: sipush #-25555
    //   3639: sipush #-8969
    //   3642: invokestatic a : (II)Ljava/lang/String;
    //   3645: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3648: ifne -> 3658
    //   3651: goto -> 3658
    //   3654: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3657: athrow
    //   3658: aload #7
    //   3660: iconst_1
    //   3661: invokevirtual setAccessible : (Z)V
    //   3664: aload #7
    //   3666: aconst_null
    //   3667: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3670: pop
    //   3671: iinc #6, 1
    //   3674: iload_2
    //   3675: ifeq -> 3536
    //   3678: sipush #-25540
    //   3681: sipush #17643
    //   3684: invokestatic a : (II)Ljava/lang/String;
    //   3687: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3690: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3693: astore #4
    //   3695: aload #4
    //   3697: arraylength
    //   3698: istore #5
    //   3700: iconst_0
    //   3701: istore #6
    //   3703: iload #6
    //   3705: iload #5
    //   3707: if_icmpge -> 3843
    //   3710: aload #4
    //   3712: iload #6
    //   3714: aaload
    //   3715: astore #7
    //   3717: aload #7
    //   3719: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3722: pop
    //   3723: aload #7
    //   3725: invokevirtual getModifiers : ()I
    //   3728: invokestatic isStatic : (I)Z
    //   3731: ifeq -> 3829
    //   3734: aload #7
    //   3736: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3739: arraylength
    //   3740: iconst_2
    //   3741: if_icmpne -> 3829
    //   3744: goto -> 3751
    //   3747: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3750: athrow
    //   3751: aload #7
    //   3753: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3756: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3759: if_acmpne -> 3829
    //   3762: goto -> 3769
    //   3765: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3768: athrow
    //   3769: aload #7
    //   3771: iconst_1
    //   3772: invokevirtual setAccessible : (Z)V
    //   3775: aload #7
    //   3777: aconst_null
    //   3778: iconst_2
    //   3779: anewarray java/lang/Object
    //   3782: dup
    //   3783: iconst_0
    //   3784: aload_0
    //   3785: aastore
    //   3786: dup
    //   3787: iconst_1
    //   3788: aload_1
    //   3789: ifnonnull -> 3807
    //   3792: goto -> 3799
    //   3795: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3798: athrow
    //   3799: aload_1
    //   3800: goto -> 3814
    //   3803: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3806: athrow
    //   3807: aload_1
    //   3808: checkcast [B
    //   3811: invokevirtual clone : ()Ljava/lang/Object;
    //   3814: aastore
    //   3815: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3818: checkcast java/lang/Boolean
    //   3821: invokevirtual booleanValue : ()Z
    //   3824: istore_3
    //   3825: iload_2
    //   3826: ifeq -> 3843
    //   3829: iinc #6, 1
    //   3832: iload_2
    //   3833: ifeq -> 3703
    //   3836: goto -> 3843
    //   3839: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3842: athrow
    //   3843: iload_3
    //   3844: ireturn
    //   3845: astore_3
    //   3846: new java/lang/Exception
    //   3849: dup
    //   3850: aload_3
    //   3851: invokevirtual getMessage : ()Ljava/lang/String;
    //   3854: invokespecial <init> : (Ljava/lang/String;)V
    //   3857: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1655	3845	java/lang/Throwable
    //   203	227	230	java/lang/Throwable
    //   301	338	338	java/lang/Throwable
    //   342	363	363	java/lang/Throwable
    //   367	397	397	java/lang/Throwable
    //   637	651	651	java/lang/Throwable
    //   662	675	678	java/lang/Throwable
    //   667	690	693	java/lang/Throwable
    //   682	708	711	java/lang/Throwable
    //   697	738	741	java/lang/Throwable
    //   801	828	831	java/lang/Throwable
    //   818	849	852	java/lang/Throwable
    //   835	879	882	java/lang/Throwable
    //   856	890	890	java/lang/Throwable
    //   901	917	920	java/lang/Throwable
    //   1016	1030	1030	java/lang/Throwable
    //   1041	1054	1057	java/lang/Throwable
    //   1046	1069	1072	java/lang/Throwable
    //   1061	1087	1090	java/lang/Throwable
    //   1076	1117	1120	java/lang/Throwable
    //   1183	1210	1213	java/lang/Throwable
    //   1200	1228	1231	java/lang/Throwable
    //   1217	1258	1261	java/lang/Throwable
    //   1235	1269	1269	java/lang/Throwable
    //   1291	1302	1305	java/lang/Throwable
    //   1357	1371	1371	java/lang/Throwable
    //   1382	1395	1398	java/lang/Throwable
    //   1387	1410	1413	java/lang/Throwable
    //   1402	1428	1431	java/lang/Throwable
    //   1417	1458	1461	java/lang/Throwable
    //   1524	1551	1554	java/lang/Throwable
    //   1541	1569	1572	java/lang/Throwable
    //   1558	1599	1602	java/lang/Throwable
    //   1576	1610	1610	java/lang/Throwable
    //   1632	1643	1646	java/lang/Throwable
    //   1656	2386	3845	java/lang/Throwable
    //   1746	1760	1760	java/lang/Throwable
    //   1771	1784	1787	java/lang/Throwable
    //   1776	1799	1802	java/lang/Throwable
    //   1791	1817	1820	java/lang/Throwable
    //   1806	1847	1850	java/lang/Throwable
    //   1913	1940	1943	java/lang/Throwable
    //   1930	1958	1961	java/lang/Throwable
    //   1947	1988	1991	java/lang/Throwable
    //   1965	1999	1999	java/lang/Throwable
    //   2021	2032	2035	java/lang/Throwable
    //   2088	2102	2102	java/lang/Throwable
    //   2113	2126	2129	java/lang/Throwable
    //   2118	2141	2144	java/lang/Throwable
    //   2133	2159	2162	java/lang/Throwable
    //   2148	2189	2192	java/lang/Throwable
    //   2255	2282	2285	java/lang/Throwable
    //   2272	2300	2303	java/lang/Throwable
    //   2289	2330	2333	java/lang/Throwable
    //   2307	2341	2341	java/lang/Throwable
    //   2363	2374	2377	java/lang/Throwable
    //   2387	3117	3845	java/lang/Throwable
    //   2477	2491	2491	java/lang/Throwable
    //   2502	2515	2518	java/lang/Throwable
    //   2507	2530	2533	java/lang/Throwable
    //   2522	2548	2551	java/lang/Throwable
    //   2537	2578	2581	java/lang/Throwable
    //   2644	2671	2674	java/lang/Throwable
    //   2661	2689	2692	java/lang/Throwable
    //   2678	2719	2722	java/lang/Throwable
    //   2696	2730	2730	java/lang/Throwable
    //   2752	2763	2766	java/lang/Throwable
    //   2819	2833	2833	java/lang/Throwable
    //   2844	2857	2860	java/lang/Throwable
    //   2849	2872	2875	java/lang/Throwable
    //   2864	2890	2893	java/lang/Throwable
    //   2879	2920	2923	java/lang/Throwable
    //   2986	3013	3016	java/lang/Throwable
    //   3003	3031	3034	java/lang/Throwable
    //   3020	3061	3064	java/lang/Throwable
    //   3038	3072	3072	java/lang/Throwable
    //   3094	3105	3108	java/lang/Throwable
    //   3118	3844	3845	java/lang/Throwable
    //   3208	3222	3222	java/lang/Throwable
    //   3233	3246	3249	java/lang/Throwable
    //   3238	3261	3264	java/lang/Throwable
    //   3253	3279	3282	java/lang/Throwable
    //   3268	3309	3312	java/lang/Throwable
    //   3375	3402	3405	java/lang/Throwable
    //   3392	3420	3423	java/lang/Throwable
    //   3409	3450	3453	java/lang/Throwable
    //   3427	3461	3461	java/lang/Throwable
    //   3483	3494	3497	java/lang/Throwable
    //   3550	3564	3564	java/lang/Throwable
    //   3575	3588	3591	java/lang/Throwable
    //   3580	3603	3606	java/lang/Throwable
    //   3595	3621	3624	java/lang/Throwable
    //   3610	3651	3654	java/lang/Throwable
    //   3717	3744	3747	java/lang/Throwable
    //   3734	3762	3765	java/lang/Throwable
    //   3751	3792	3795	java/lang/Throwable
    //   3769	3803	3803	java/lang/Throwable
    //   3825	3836	3839	java/lang/Throwable
  }
  
  static void Zu(Object paramObject) {
    Ze4g.Zk = a(-25547, -17513);
    Ze4g.Zz = new BigInteger(a(-25551, 7463));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zzc9.Zv.charAt(Math.abs(((BigInteger)Znu.Zf).intValue() % 32)) > Zgei.Zl.charAt(Math.abs(((BigInteger)Zsvd.Zk).intValue() % 32))) {
          try {
            Zgr4.Zw(Class.forName(a(-25537, -22402)));
            if (bool)
              Zgis.ZS(Class.forName(a(-25538, -1785))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgis.ZS(Class.forName(a(-25538, -1785)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'gí\\n'P!\\tç×f0®|UÃ\\t7Õ|pím9å\\tÒK¼ó]ÉBu\\t_6\\r\ké´¬ ·¯®_\\b£ÃUÂÃ½mõGø¾ùsÕþÞB \\tôäVâ·ÚT+²Ì\\t:Ú¡ÁþZ¶Èó\\t¤ÎrC\\nùË E§ÞmKä7SËÛlç¾áÐÈ\\f¡¤¤sUÀ\\t¯K¨iè£\\t <æÁ¾ðT\\tÄëR7+]M:D¾ï9¥3C67¥Kgè354év1n´Ó@W(Í9y\\fMàÞâ²°w!S3PÔXo)ÂóçG@IÊ¹&Â¶\\t8:Ñ$¾Ì\\tjÞ«A¿JÚÚ\\t)¨Ã²*àÞBO®s\\tRï¬g_k\\t¶´L\ëîëm\\t)XGh{E\\tg×\\n`n\\b8'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #56
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
    //   68: ldc '¿TÑ\\tæ}\\fÚ èR'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #107
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
    //   129: putstatic burp/Zmzj.a : [Ljava/lang/String;
    //   132: bipush #25
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmzj.b : [Ljava/lang/String;
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
    //   212: bipush #92
    //   214: goto -> 244
    //   217: bipush #43
    //   219: goto -> 244
    //   222: bipush #14
    //   224: goto -> 244
    //   227: bipush #107
    //   229: goto -> 244
    //   232: bipush #38
    //   234: goto -> 244
    //   237: bipush #20
    //   239: goto -> 244
    //   242: bipush #30
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
    //   300: sipush #-25542
    //   303: sipush #-3586
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zmzj.Zb : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #24
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #106
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #-71
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #75
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #-84
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-97
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #-61
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #64
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #39
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #-18
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #28
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #-122
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #-108
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #-126
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #32
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #11
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #100
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #-114
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #-24
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #48
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #-25
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #111
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #-66
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #71
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #88
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #118
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #-116
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #-122
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #106
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #71
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #91
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #58
    //   505: bastore
    //   506: invokespecial <init> : ([B)V
    //   509: putstatic burp/Zmzj.Zm : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9C3F) & 0xFFFF;
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
      byte b1 = 37;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmzj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */