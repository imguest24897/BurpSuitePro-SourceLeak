package burp;

import java.math.BigInteger;

class Zg2 extends ClassLoader {
  static String ZN;
  
  static Object ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Z_(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zlpn.ZU : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: new java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #5
    //   23: aload #5
    //   25: sipush #16974
    //   28: sipush #-622
    //   31: invokestatic a : (II)Ljava/lang/String;
    //   34: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: pop
    //   38: aload_3
    //   39: astore #6
    //   41: aload #6
    //   43: arraylength
    //   44: istore #7
    //   46: iconst_0
    //   47: istore #8
    //   49: iload #8
    //   51: iload #7
    //   53: if_icmpge -> 79
    //   56: aload #6
    //   58: iload #8
    //   60: baload
    //   61: istore #9
    //   63: aload #5
    //   65: iload #9
    //   67: i2c
    //   68: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: iinc #8, 1
    //   75: iload_2
    //   76: ifeq -> 49
    //   79: aload #5
    //   81: sipush #16967
    //   84: sipush #-12396
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: ldc ''
    //   92: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   95: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload #5
    //   104: sipush #16971
    //   107: sipush #-10515
    //   110: invokestatic a : (II)Ljava/lang/String;
    //   113: ldc ''
    //   115: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   118: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   121: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: pop
    //   125: aload #5
    //   127: invokevirtual toString : ()Ljava/lang/String;
    //   130: invokevirtual getBytes : ()[B
    //   133: astore #4
    //   135: aload #4
    //   137: astore_3
    //   138: aload_3
    //   139: arraylength
    //   140: bipush #8
    //   142: iadd
    //   143: bipush #6
    //   145: ishr
    //   146: iconst_1
    //   147: iadd
    //   148: bipush #16
    //   150: imul
    //   151: newarray int
    //   153: astore #5
    //   155: iconst_0
    //   156: istore #6
    //   158: iload #6
    //   160: aload_3
    //   161: arraylength
    //   162: if_icmpge -> 205
    //   165: aload_3
    //   166: iload #6
    //   168: baload
    //   169: sipush #255
    //   172: iand
    //   173: istore #7
    //   175: aload #5
    //   177: iload #6
    //   179: iconst_2
    //   180: ishr
    //   181: dup2
    //   182: iaload
    //   183: iload #7
    //   185: bipush #24
    //   187: iload #6
    //   189: iconst_4
    //   190: irem
    //   191: bipush #8
    //   193: imul
    //   194: isub
    //   195: ishl
    //   196: ior
    //   197: iastore
    //   198: iinc #6, 1
    //   201: iload_2
    //   202: ifeq -> 158
    //   205: aload #5
    //   207: iload #6
    //   209: iconst_2
    //   210: ishr
    //   211: dup2
    //   212: iaload
    //   213: sipush #128
    //   216: bipush #24
    //   218: iload #6
    //   220: iconst_4
    //   221: irem
    //   222: bipush #8
    //   224: imul
    //   225: isub
    //   226: ishl
    //   227: ior
    //   228: iastore
    //   229: aload #5
    //   231: aload #5
    //   233: arraylength
    //   234: iconst_1
    //   235: isub
    //   236: aload_3
    //   237: arraylength
    //   238: bipush #8
    //   240: imul
    //   241: iastore
    //   242: bipush #80
    //   244: newarray int
    //   246: astore #7
    //   248: ldc 1732584193
    //   250: istore #8
    //   252: ldc -271733879
    //   254: istore #9
    //   256: ldc -1732584194
    //   258: istore #10
    //   260: ldc 271733878
    //   262: istore #11
    //   264: ldc -1009589776
    //   266: istore #12
    //   268: iconst_0
    //   269: istore #6
    //   271: iload #6
    //   273: aload #5
    //   275: arraylength
    //   276: if_icmpge -> 598
    //   279: iload #8
    //   281: istore #13
    //   283: iload #9
    //   285: istore #14
    //   287: iload #10
    //   289: istore #15
    //   291: iload #11
    //   293: istore #16
    //   295: iload #12
    //   297: istore #17
    //   299: iconst_0
    //   300: istore #18
    //   302: iload #18
    //   304: bipush #80
    //   306: if_icmpge -> 556
    //   309: iload #18
    //   311: bipush #16
    //   313: if_icmpge -> 340
    //   316: aload #7
    //   318: iload #18
    //   320: aload #5
    //   322: iload #6
    //   324: iload #18
    //   326: iadd
    //   327: iaload
    //   328: iastore
    //   329: iload_2
    //   330: ifeq -> 395
    //   333: goto -> 340
    //   336: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   339: athrow
    //   340: aload #7
    //   342: iload #18
    //   344: iconst_3
    //   345: isub
    //   346: iaload
    //   347: aload #7
    //   349: iload #18
    //   351: bipush #8
    //   353: isub
    //   354: iaload
    //   355: ixor
    //   356: aload #7
    //   358: iload #18
    //   360: bipush #14
    //   362: isub
    //   363: iaload
    //   364: ixor
    //   365: aload #7
    //   367: iload #18
    //   369: bipush #16
    //   371: isub
    //   372: iaload
    //   373: ixor
    //   374: istore #19
    //   376: iload #19
    //   378: iconst_1
    //   379: ishl
    //   380: iload #19
    //   382: bipush #31
    //   384: iushr
    //   385: ior
    //   386: istore #20
    //   388: aload #7
    //   390: iload #18
    //   392: iload #20
    //   394: iastore
    //   395: iload #8
    //   397: iconst_5
    //   398: ishl
    //   399: iload #8
    //   401: bipush #27
    //   403: iushr
    //   404: ior
    //   405: istore #19
    //   407: iload #19
    //   409: iload #12
    //   411: iadd
    //   412: aload #7
    //   414: iload #18
    //   416: iaload
    //   417: iadd
    //   418: iload #18
    //   420: bipush #20
    //   422: if_icmpge -> 448
    //   425: ldc 1518500249
    //   427: iload #9
    //   429: iload #10
    //   431: iand
    //   432: iload #9
    //   434: iconst_m1
    //   435: ixor
    //   436: iload #11
    //   438: iand
    //   439: ior
    //   440: iadd
    //   441: goto -> 518
    //   444: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   447: athrow
    //   448: iload #18
    //   450: bipush #40
    //   452: if_icmpge -> 473
    //   455: ldc 1859775393
    //   457: iload #9
    //   459: iload #10
    //   461: ixor
    //   462: iload #11
    //   464: ixor
    //   465: iadd
    //   466: goto -> 518
    //   469: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   472: athrow
    //   473: iload #18
    //   475: bipush #60
    //   477: if_icmpge -> 507
    //   480: ldc -1894007588
    //   482: iload #9
    //   484: iload #10
    //   486: iand
    //   487: iload #9
    //   489: iload #11
    //   491: iand
    //   492: ior
    //   493: iload #10
    //   495: iload #11
    //   497: iand
    //   498: ior
    //   499: iadd
    //   500: goto -> 518
    //   503: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   506: athrow
    //   507: ldc -899497514
    //   509: iload #9
    //   511: iload #10
    //   513: ixor
    //   514: iload #11
    //   516: ixor
    //   517: iadd
    //   518: iadd
    //   519: istore #20
    //   521: iload #11
    //   523: istore #12
    //   525: iload #10
    //   527: istore #11
    //   529: iload #9
    //   531: bipush #30
    //   533: ishl
    //   534: iload #9
    //   536: iconst_2
    //   537: iushr
    //   538: ior
    //   539: istore #10
    //   541: iload #8
    //   543: istore #9
    //   545: iload #20
    //   547: istore #8
    //   549: iinc #18, 1
    //   552: iload_2
    //   553: ifeq -> 302
    //   556: iload #8
    //   558: iload #13
    //   560: iadd
    //   561: istore #8
    //   563: iload #9
    //   565: iload #14
    //   567: iadd
    //   568: istore #9
    //   570: iload #10
    //   572: iload #15
    //   574: iadd
    //   575: istore #10
    //   577: iload #11
    //   579: iload #16
    //   581: iadd
    //   582: istore #11
    //   584: iload #12
    //   586: iload #17
    //   588: iadd
    //   589: istore #12
    //   591: iinc #6, 16
    //   594: iload_2
    //   595: ifeq -> 271
    //   598: iconst_5
    //   599: newarray int
    //   601: dup
    //   602: iconst_0
    //   603: iload #8
    //   605: iastore
    //   606: dup
    //   607: iconst_1
    //   608: iload #9
    //   610: iastore
    //   611: dup
    //   612: iconst_2
    //   613: iload #10
    //   615: iastore
    //   616: dup
    //   617: iconst_3
    //   618: iload #11
    //   620: iastore
    //   621: dup
    //   622: iconst_4
    //   623: iload #12
    //   625: iastore
    //   626: astore #13
    //   628: bipush #20
    //   630: newarray byte
    //   632: astore #14
    //   634: iconst_0
    //   635: istore #15
    //   637: iload #15
    //   639: bipush #20
    //   641: if_icmpge -> 682
    //   644: aload #13
    //   646: iload #15
    //   648: iconst_4
    //   649: idiv
    //   650: iaload
    //   651: istore #16
    //   653: iconst_3
    //   654: iload #15
    //   656: iconst_4
    //   657: irem
    //   658: isub
    //   659: bipush #8
    //   661: imul
    //   662: istore #17
    //   664: aload #14
    //   666: iload #15
    //   668: iload #16
    //   670: iload #17
    //   672: iushr
    //   673: i2b
    //   674: bastore
    //   675: iinc #15, 1
    //   678: iload_2
    //   679: ifeq -> 637
    //   682: aload #14
    //   684: astore #4
    //   686: sipush #16963
    //   689: getstatic burp/Zgt7.Zn : Ljava/lang/Object;
    //   692: checkcast java/math/BigInteger
    //   695: getstatic burp/Zmpp.Z_ : Ljava/lang/Object;
    //   698: checkcast java/math/BigInteger
    //   701: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   704: putstatic burp/Zb9h.Zm : Ljava/lang/Object;
    //   707: sipush #-30148
    //   710: getstatic burp/Zmlu.Zi : Ljava/lang/Object;
    //   713: checkcast java/math/BigInteger
    //   716: getstatic burp/Zme.Zd : Ljava/lang/Object;
    //   719: checkcast java/math/BigInteger
    //   722: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   725: putstatic burp/Zzbr.ZC : Ljava/lang/Object;
    //   728: invokestatic a : (II)Ljava/lang/String;
    //   731: iconst_1
    //   732: ldc burp/Zkqx
    //   734: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   737: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   740: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   743: astore_3
    //   744: aload_3
    //   745: arraylength
    //   746: istore #4
    //   748: iconst_0
    //   749: istore #5
    //   751: iload #5
    //   753: iload #4
    //   755: if_icmpge -> 892
    //   758: aload_3
    //   759: iload #5
    //   761: aaload
    //   762: astore #6
    //   764: aload #6
    //   766: invokevirtual getModifiers : ()I
    //   769: invokestatic isStatic : (I)Z
    //   772: ifne -> 782
    //   775: goto -> 885
    //   778: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   781: athrow
    //   782: aload #6
    //   784: invokevirtual getType : ()Ljava/lang/Class;
    //   787: astore #7
    //   789: aload #7
    //   791: ifnull -> 872
    //   794: aload #7
    //   796: invokevirtual isPrimitive : ()Z
    //   799: ifne -> 872
    //   802: goto -> 809
    //   805: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   808: athrow
    //   809: aload #7
    //   811: invokevirtual getPackage : ()Ljava/lang/Package;
    //   814: ifnull -> 872
    //   817: goto -> 824
    //   820: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   823: athrow
    //   824: aload #7
    //   826: invokevirtual getPackage : ()Ljava/lang/Package;
    //   829: invokevirtual getName : ()Ljava/lang/String;
    //   832: ifnull -> 872
    //   835: goto -> 842
    //   838: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   841: athrow
    //   842: aload #7
    //   844: invokevirtual getPackage : ()Ljava/lang/Package;
    //   847: invokevirtual getName : ()Ljava/lang/String;
    //   850: sipush #16961
    //   853: sipush #-26610
    //   856: invokestatic a : (II)Ljava/lang/String;
    //   859: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   862: ifne -> 872
    //   865: goto -> 872
    //   868: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   871: athrow
    //   872: aload #6
    //   874: iconst_1
    //   875: invokevirtual setAccessible : (Z)V
    //   878: aload #6
    //   880: aconst_null
    //   881: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   884: pop
    //   885: iinc #5, 1
    //   888: iload_2
    //   889: ifeq -> 751
    //   892: sipush #16960
    //   895: sipush #4903
    //   898: invokestatic a : (II)Ljava/lang/String;
    //   901: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   904: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   907: astore_3
    //   908: aload_3
    //   909: arraylength
    //   910: istore #4
    //   912: iconst_0
    //   913: istore #5
    //   915: iload #5
    //   917: iload #4
    //   919: if_icmpge -> 1051
    //   922: aload_3
    //   923: iload #5
    //   925: aaload
    //   926: astore #6
    //   928: aload #6
    //   930: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   933: pop
    //   934: aload #6
    //   936: invokevirtual getModifiers : ()I
    //   939: invokestatic isStatic : (I)Z
    //   942: ifeq -> 1037
    //   945: aload #6
    //   947: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   950: arraylength
    //   951: iconst_2
    //   952: if_icmpne -> 1037
    //   955: goto -> 962
    //   958: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   961: athrow
    //   962: aload #6
    //   964: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   967: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   970: invokevirtual equals : (Ljava/lang/Object;)Z
    //   973: ifeq -> 1037
    //   976: goto -> 983
    //   979: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   982: athrow
    //   983: aload #6
    //   985: iconst_1
    //   986: invokevirtual setAccessible : (Z)V
    //   989: aload #6
    //   991: aconst_null
    //   992: iconst_2
    //   993: anewarray java/lang/Object
    //   996: dup
    //   997: iconst_0
    //   998: aload_0
    //   999: aastore
    //   1000: dup
    //   1001: iconst_1
    //   1002: aload_1
    //   1003: ifnonnull -> 1021
    //   1006: goto -> 1013
    //   1009: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1012: athrow
    //   1013: aload_1
    //   1014: goto -> 1028
    //   1017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1020: athrow
    //   1021: aload_1
    //   1022: checkcast [B
    //   1025: invokevirtual clone : ()Ljava/lang/Object;
    //   1028: aastore
    //   1029: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1032: pop
    //   1033: iload_2
    //   1034: ifeq -> 1051
    //   1037: iinc #5, 1
    //   1040: iload_2
    //   1041: ifeq -> 915
    //   1044: goto -> 1051
    //   1047: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1050: athrow
    //   1051: getstatic burp/Zxtc.ZF : Ljava/lang/Object;
    //   1054: checkcast java/math/BigInteger
    //   1057: invokevirtual intValue : ()I
    //   1060: i2l
    //   1061: invokestatic currentTimeMillis : ()J
    //   1064: ladd
    //   1065: getstatic burp/Zgwu.ZD : Ljava/lang/Object;
    //   1068: checkcast java/math/BigInteger
    //   1071: invokevirtual intValue : ()I
    //   1074: i2l
    //   1075: lcmp
    //   1076: ifge -> 1408
    //   1079: sipush #16962
    //   1082: sipush #-1881
    //   1085: invokestatic a : (II)Ljava/lang/String;
    //   1088: iconst_1
    //   1089: ldc burp/Zr5k
    //   1091: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1094: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1097: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1100: astore_3
    //   1101: aload_3
    //   1102: arraylength
    //   1103: istore #4
    //   1105: iconst_0
    //   1106: istore #5
    //   1108: iload #5
    //   1110: iload #4
    //   1112: if_icmpge -> 1249
    //   1115: aload_3
    //   1116: iload #5
    //   1118: aaload
    //   1119: astore #6
    //   1121: aload #6
    //   1123: invokevirtual getModifiers : ()I
    //   1126: invokestatic isStatic : (I)Z
    //   1129: ifne -> 1139
    //   1132: goto -> 1242
    //   1135: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1138: athrow
    //   1139: aload #6
    //   1141: invokevirtual getType : ()Ljava/lang/Class;
    //   1144: astore #7
    //   1146: aload #7
    //   1148: ifnull -> 1229
    //   1151: aload #7
    //   1153: invokevirtual isPrimitive : ()Z
    //   1156: ifne -> 1229
    //   1159: goto -> 1166
    //   1162: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1165: athrow
    //   1166: aload #7
    //   1168: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1171: ifnull -> 1229
    //   1174: goto -> 1181
    //   1177: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1180: athrow
    //   1181: aload #7
    //   1183: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1186: invokevirtual getName : ()Ljava/lang/String;
    //   1189: ifnull -> 1229
    //   1192: goto -> 1199
    //   1195: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1198: athrow
    //   1199: aload #7
    //   1201: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1204: invokevirtual getName : ()Ljava/lang/String;
    //   1207: sipush #16972
    //   1210: sipush #-600
    //   1213: invokestatic a : (II)Ljava/lang/String;
    //   1216: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1219: ifne -> 1229
    //   1222: goto -> 1229
    //   1225: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1228: athrow
    //   1229: aload #6
    //   1231: iconst_1
    //   1232: invokevirtual setAccessible : (Z)V
    //   1235: aload #6
    //   1237: aconst_null
    //   1238: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1241: pop
    //   1242: iinc #5, 1
    //   1245: iload_2
    //   1246: ifeq -> 1108
    //   1249: sipush #16975
    //   1252: sipush #-31808
    //   1255: invokestatic a : (II)Ljava/lang/String;
    //   1258: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1261: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1264: astore_3
    //   1265: aload_3
    //   1266: arraylength
    //   1267: istore #4
    //   1269: iconst_0
    //   1270: istore #5
    //   1272: iload #5
    //   1274: iload #4
    //   1276: if_icmpge -> 1408
    //   1279: aload_3
    //   1280: iload #5
    //   1282: aaload
    //   1283: astore #6
    //   1285: aload #6
    //   1287: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1290: pop
    //   1291: aload #6
    //   1293: invokevirtual getModifiers : ()I
    //   1296: invokestatic isStatic : (I)Z
    //   1299: ifeq -> 1394
    //   1302: aload #6
    //   1304: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1307: arraylength
    //   1308: iconst_2
    //   1309: if_icmpne -> 1394
    //   1312: goto -> 1319
    //   1315: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1318: athrow
    //   1319: aload #6
    //   1321: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1324: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1327: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1330: ifeq -> 1394
    //   1333: goto -> 1340
    //   1336: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1339: athrow
    //   1340: aload #6
    //   1342: iconst_1
    //   1343: invokevirtual setAccessible : (Z)V
    //   1346: aload #6
    //   1348: aconst_null
    //   1349: iconst_2
    //   1350: anewarray java/lang/Object
    //   1353: dup
    //   1354: iconst_0
    //   1355: aload_0
    //   1356: aastore
    //   1357: dup
    //   1358: iconst_1
    //   1359: aload_1
    //   1360: ifnonnull -> 1378
    //   1363: goto -> 1370
    //   1366: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1369: athrow
    //   1370: aload_1
    //   1371: goto -> 1385
    //   1374: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1377: athrow
    //   1378: aload_1
    //   1379: checkcast [B
    //   1382: invokevirtual clone : ()Ljava/lang/Object;
    //   1385: aastore
    //   1386: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1389: pop
    //   1390: iload_2
    //   1391: ifeq -> 1408
    //   1394: iinc #5, 1
    //   1397: iload_2
    //   1398: ifeq -> 1272
    //   1401: goto -> 1408
    //   1404: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1407: athrow
    //   1408: getstatic burp/Zkfa.Zw : Ljava/lang/Object;
    //   1411: checkcast java/math/BigInteger
    //   1414: invokevirtual toByteArray : ()[B
    //   1417: astore_3
    //   1418: iconst_0
    //   1419: istore #5
    //   1421: iconst_0
    //   1422: istore #6
    //   1424: iload #6
    //   1426: aload_3
    //   1427: arraylength
    //   1428: if_icmpge -> 1573
    //   1431: aload_3
    //   1432: iload #6
    //   1434: baload
    //   1435: istore #7
    //   1437: iload #7
    //   1439: bipush #48
    //   1441: if_icmplt -> 1458
    //   1444: iload #7
    //   1446: bipush #57
    //   1448: if_icmple -> 1556
    //   1451: goto -> 1458
    //   1454: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1457: athrow
    //   1458: iload #7
    //   1460: bipush #65
    //   1462: if_icmplt -> 1486
    //   1465: goto -> 1472
    //   1468: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1471: athrow
    //   1472: iload #7
    //   1474: bipush #90
    //   1476: if_icmple -> 1556
    //   1479: goto -> 1486
    //   1482: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1485: athrow
    //   1486: iload #7
    //   1488: bipush #97
    //   1490: if_icmplt -> 1514
    //   1493: goto -> 1500
    //   1496: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1499: athrow
    //   1500: iload #7
    //   1502: bipush #122
    //   1504: if_icmple -> 1556
    //   1507: goto -> 1514
    //   1510: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1513: athrow
    //   1514: iload #7
    //   1516: bipush #43
    //   1518: if_icmpeq -> 1556
    //   1521: goto -> 1528
    //   1524: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1527: athrow
    //   1528: iload #7
    //   1530: bipush #47
    //   1532: if_icmpeq -> 1556
    //   1535: goto -> 1542
    //   1538: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1541: athrow
    //   1542: iload #7
    //   1544: bipush #61
    //   1546: if_icmpne -> 1566
    //   1549: goto -> 1556
    //   1552: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1555: athrow
    //   1556: iinc #5, 1
    //   1559: goto -> 1566
    //   1562: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1565: athrow
    //   1566: iinc #6, 1
    //   1569: iload_2
    //   1570: ifeq -> 1424
    //   1573: iload #5
    //   1575: newarray byte
    //   1577: astore #6
    //   1579: iconst_0
    //   1580: istore #7
    //   1582: iconst_0
    //   1583: istore #8
    //   1585: iload #8
    //   1587: aload_3
    //   1588: arraylength
    //   1589: if_icmpge -> 1741
    //   1592: aload_3
    //   1593: iload #8
    //   1595: baload
    //   1596: istore #9
    //   1598: iload #9
    //   1600: bipush #48
    //   1602: if_icmplt -> 1619
    //   1605: iload #9
    //   1607: bipush #57
    //   1609: if_icmple -> 1717
    //   1612: goto -> 1619
    //   1615: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1618: athrow
    //   1619: iload #9
    //   1621: bipush #65
    //   1623: if_icmplt -> 1647
    //   1626: goto -> 1633
    //   1629: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1632: athrow
    //   1633: iload #9
    //   1635: bipush #90
    //   1637: if_icmple -> 1717
    //   1640: goto -> 1647
    //   1643: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1646: athrow
    //   1647: iload #9
    //   1649: bipush #97
    //   1651: if_icmplt -> 1675
    //   1654: goto -> 1661
    //   1657: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1660: athrow
    //   1661: iload #9
    //   1663: bipush #122
    //   1665: if_icmple -> 1717
    //   1668: goto -> 1675
    //   1671: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1674: athrow
    //   1675: iload #9
    //   1677: bipush #43
    //   1679: if_icmpeq -> 1717
    //   1682: goto -> 1689
    //   1685: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1688: athrow
    //   1689: iload #9
    //   1691: bipush #47
    //   1693: if_icmpeq -> 1717
    //   1696: goto -> 1703
    //   1699: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1702: athrow
    //   1703: iload #9
    //   1705: bipush #61
    //   1707: if_icmpne -> 1734
    //   1710: goto -> 1717
    //   1713: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1716: athrow
    //   1717: aload #6
    //   1719: iload #7
    //   1721: iload #9
    //   1723: bastore
    //   1724: iinc #7, 1
    //   1727: goto -> 1734
    //   1730: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1733: athrow
    //   1734: iinc #8, 1
    //   1737: iload_2
    //   1738: ifeq -> 1585
    //   1741: aload #6
    //   1743: astore #4
    //   1745: aload #4
    //   1747: astore_3
    //   1748: aload_3
    //   1749: arraylength
    //   1750: istore #5
    //   1752: aload_3
    //   1753: iload #5
    //   1755: iconst_1
    //   1756: isub
    //   1757: baload
    //   1758: bipush #61
    //   1760: if_icmpne -> 1770
    //   1763: iinc #5, -1
    //   1766: iload_2
    //   1767: ifeq -> 1752
    //   1770: iload #5
    //   1772: aload_3
    //   1773: arraylength
    //   1774: iconst_4
    //   1775: idiv
    //   1776: isub
    //   1777: newarray byte
    //   1779: astore #6
    //   1781: iconst_0
    //   1782: istore #7
    //   1784: iload #7
    //   1786: aload_3
    //   1787: arraylength
    //   1788: if_icmpge -> 2050
    //   1791: aload_3
    //   1792: iload #7
    //   1794: baload
    //   1795: bipush #61
    //   1797: if_icmpne -> 1816
    //   1800: aload_3
    //   1801: iload #7
    //   1803: iconst_0
    //   1804: bastore
    //   1805: iload_2
    //   1806: ifeq -> 2043
    //   1809: goto -> 1816
    //   1812: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1815: athrow
    //   1816: aload_3
    //   1817: iload #7
    //   1819: baload
    //   1820: bipush #47
    //   1822: if_icmpne -> 1849
    //   1825: goto -> 1832
    //   1828: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1831: athrow
    //   1832: aload_3
    //   1833: iload #7
    //   1835: bipush #63
    //   1837: bastore
    //   1838: iload_2
    //   1839: ifeq -> 2043
    //   1842: goto -> 1849
    //   1845: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1848: athrow
    //   1849: aload_3
    //   1850: iload #7
    //   1852: baload
    //   1853: bipush #43
    //   1855: if_icmpne -> 1882
    //   1858: goto -> 1865
    //   1861: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1864: athrow
    //   1865: aload_3
    //   1866: iload #7
    //   1868: bipush #62
    //   1870: bastore
    //   1871: iload_2
    //   1872: ifeq -> 2043
    //   1875: goto -> 1882
    //   1878: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1881: athrow
    //   1882: aload_3
    //   1883: iload #7
    //   1885: baload
    //   1886: bipush #48
    //   1888: if_icmplt -> 1937
    //   1891: goto -> 1898
    //   1894: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1897: athrow
    //   1898: aload_3
    //   1899: iload #7
    //   1901: baload
    //   1902: bipush #57
    //   1904: if_icmpgt -> 1937
    //   1907: goto -> 1914
    //   1910: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1913: athrow
    //   1914: aload_3
    //   1915: iload #7
    //   1917: aload_3
    //   1918: iload #7
    //   1920: baload
    //   1921: bipush #-4
    //   1923: isub
    //   1924: i2b
    //   1925: bastore
    //   1926: iload_2
    //   1927: ifeq -> 2043
    //   1930: goto -> 1937
    //   1933: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1936: athrow
    //   1937: aload_3
    //   1938: iload #7
    //   1940: baload
    //   1941: bipush #97
    //   1943: if_icmplt -> 1992
    //   1946: goto -> 1953
    //   1949: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1952: athrow
    //   1953: aload_3
    //   1954: iload #7
    //   1956: baload
    //   1957: bipush #122
    //   1959: if_icmpgt -> 1992
    //   1962: goto -> 1969
    //   1965: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1968: athrow
    //   1969: aload_3
    //   1970: iload #7
    //   1972: aload_3
    //   1973: iload #7
    //   1975: baload
    //   1976: bipush #71
    //   1978: isub
    //   1979: i2b
    //   1980: bastore
    //   1981: iload_2
    //   1982: ifeq -> 2043
    //   1985: goto -> 1992
    //   1988: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1991: athrow
    //   1992: aload_3
    //   1993: iload #7
    //   1995: baload
    //   1996: bipush #65
    //   1998: if_icmplt -> 2043
    //   2001: goto -> 2008
    //   2004: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2007: athrow
    //   2008: aload_3
    //   2009: iload #7
    //   2011: baload
    //   2012: bipush #90
    //   2014: if_icmpgt -> 2043
    //   2017: goto -> 2024
    //   2020: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2023: athrow
    //   2024: aload_3
    //   2025: iload #7
    //   2027: aload_3
    //   2028: iload #7
    //   2030: baload
    //   2031: bipush #65
    //   2033: isub
    //   2034: i2b
    //   2035: bastore
    //   2036: goto -> 2043
    //   2039: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2042: athrow
    //   2043: iinc #7, 1
    //   2046: iload_2
    //   2047: ifeq -> 1784
    //   2050: iconst_0
    //   2051: istore #7
    //   2053: iconst_0
    //   2054: istore #8
    //   2056: iload #8
    //   2058: aload #6
    //   2060: arraylength
    //   2061: iconst_2
    //   2062: isub
    //   2063: if_icmpge -> 2166
    //   2066: aload #6
    //   2068: iload #8
    //   2070: aload_3
    //   2071: iload #7
    //   2073: baload
    //   2074: iconst_2
    //   2075: ishl
    //   2076: sipush #255
    //   2079: iand
    //   2080: aload_3
    //   2081: iload #7
    //   2083: iconst_1
    //   2084: iadd
    //   2085: baload
    //   2086: iconst_4
    //   2087: iushr
    //   2088: iconst_3
    //   2089: iand
    //   2090: ior
    //   2091: i2b
    //   2092: bastore
    //   2093: aload #6
    //   2095: iload #8
    //   2097: iconst_1
    //   2098: iadd
    //   2099: aload_3
    //   2100: iload #7
    //   2102: iconst_1
    //   2103: iadd
    //   2104: baload
    //   2105: iconst_4
    //   2106: ishl
    //   2107: sipush #255
    //   2110: iand
    //   2111: aload_3
    //   2112: iload #7
    //   2114: iconst_2
    //   2115: iadd
    //   2116: baload
    //   2117: iconst_2
    //   2118: iushr
    //   2119: bipush #15
    //   2121: iand
    //   2122: ior
    //   2123: i2b
    //   2124: bastore
    //   2125: aload #6
    //   2127: iload #8
    //   2129: iconst_2
    //   2130: iadd
    //   2131: aload_3
    //   2132: iload #7
    //   2134: iconst_2
    //   2135: iadd
    //   2136: baload
    //   2137: bipush #6
    //   2139: ishl
    //   2140: sipush #255
    //   2143: iand
    //   2144: aload_3
    //   2145: iload #7
    //   2147: iconst_3
    //   2148: iadd
    //   2149: baload
    //   2150: bipush #63
    //   2152: iand
    //   2153: ior
    //   2154: i2b
    //   2155: bastore
    //   2156: iinc #7, 4
    //   2159: iinc #8, 3
    //   2162: iload_2
    //   2163: ifeq -> 2056
    //   2166: iload #8
    //   2168: aload #6
    //   2170: arraylength
    //   2171: if_icmpge -> 2208
    //   2174: aload #6
    //   2176: iload #8
    //   2178: aload_3
    //   2179: iload #7
    //   2181: baload
    //   2182: iconst_2
    //   2183: ishl
    //   2184: sipush #255
    //   2187: iand
    //   2188: aload_3
    //   2189: iload #7
    //   2191: iconst_1
    //   2192: iadd
    //   2193: baload
    //   2194: iconst_4
    //   2195: iushr
    //   2196: iconst_3
    //   2197: iand
    //   2198: ior
    //   2199: i2b
    //   2200: bastore
    //   2201: goto -> 2208
    //   2204: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2207: athrow
    //   2208: iinc #8, 1
    //   2211: iload #8
    //   2213: aload #6
    //   2215: arraylength
    //   2216: if_icmpge -> 2256
    //   2219: aload #6
    //   2221: iload #8
    //   2223: aload_3
    //   2224: iload #7
    //   2226: iconst_1
    //   2227: iadd
    //   2228: baload
    //   2229: iconst_4
    //   2230: ishl
    //   2231: sipush #255
    //   2234: iand
    //   2235: aload_3
    //   2236: iload #7
    //   2238: iconst_2
    //   2239: iadd
    //   2240: baload
    //   2241: iconst_2
    //   2242: iushr
    //   2243: bipush #15
    //   2245: iand
    //   2246: ior
    //   2247: i2b
    //   2248: bastore
    //   2249: goto -> 2256
    //   2252: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2255: athrow
    //   2256: aload #6
    //   2258: astore #4
    //   2260: getstatic burp/Zmlu.ZF : Ljava/lang/String;
    //   2263: getstatic burp/Zgta.ZF : Ljava/lang/Object;
    //   2266: checkcast java/math/BigInteger
    //   2269: invokevirtual intValue : ()I
    //   2272: bipush #32
    //   2274: irem
    //   2275: invokestatic abs : (I)I
    //   2278: invokevirtual charAt : (I)C
    //   2281: getstatic burp/Zkf9.ZS : Ljava/lang/String;
    //   2284: getstatic burp/Zkfa.Zw : Ljava/lang/Object;
    //   2287: checkcast java/math/BigInteger
    //   2290: invokevirtual intValue : ()I
    //   2293: bipush #32
    //   2295: irem
    //   2296: invokestatic abs : (I)I
    //   2299: invokevirtual charAt : (I)C
    //   2302: if_icmpgt -> 2417
    //   2305: getstatic burp/Zz35.ZH : Ljava/lang/String;
    //   2308: getstatic burp/Zejj.Zy : Ljava/lang/Object;
    //   2311: checkcast java/math/BigInteger
    //   2314: invokevirtual intValue : ()I
    //   2317: bipush #32
    //   2319: irem
    //   2320: invokestatic abs : (I)I
    //   2323: invokevirtual charAt : (I)C
    //   2326: getstatic burp/Zgt6.Zu : Ljava/lang/String;
    //   2329: getstatic burp/Zm5p.Ze : Ljava/lang/Object;
    //   2332: checkcast java/math/BigInteger
    //   2335: invokevirtual intValue : ()I
    //   2338: bipush #32
    //   2340: irem
    //   2341: invokestatic abs : (I)I
    //   2344: invokevirtual charAt : (I)C
    //   2347: if_icmpgt -> 2417
    //   2350: goto -> 2357
    //   2353: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2356: athrow
    //   2357: getstatic burp/Zzpu.Zq : Ljava/lang/String;
    //   2360: getstatic burp/Zejj.Zy : Ljava/lang/Object;
    //   2363: checkcast java/math/BigInteger
    //   2366: invokevirtual intValue : ()I
    //   2369: bipush #32
    //   2371: irem
    //   2372: invokestatic abs : (I)I
    //   2375: invokevirtual charAt : (I)C
    //   2378: getstatic burp/Zgwu.Zd : Ljava/lang/String;
    //   2381: getstatic burp/Zgta.ZF : Ljava/lang/Object;
    //   2384: checkcast java/math/BigInteger
    //   2387: invokevirtual intValue : ()I
    //   2390: bipush #32
    //   2392: irem
    //   2393: invokestatic abs : (I)I
    //   2396: invokevirtual charAt : (I)C
    //   2399: if_icmpgt -> 2417
    //   2402: goto -> 2409
    //   2405: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2408: athrow
    //   2409: iconst_1
    //   2410: goto -> 2418
    //   2413: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2416: athrow
    //   2417: iconst_0
    //   2418: ireturn
    //   2419: astore_3
    //   2420: new java/lang/Exception
    //   2423: dup
    //   2424: aload_3
    //   2425: invokevirtual getMessage : ()Ljava/lang/String;
    //   2428: invokespecial <init> : (Ljava/lang/String;)V
    //   2431: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2418	2419	java/lang/Throwable
    //   309	333	336	java/lang/Throwable
    //   407	444	444	java/lang/Throwable
    //   448	469	469	java/lang/Throwable
    //   473	503	503	java/lang/Throwable
    //   764	778	778	java/lang/Throwable
    //   789	802	805	java/lang/Throwable
    //   794	817	820	java/lang/Throwable
    //   809	835	838	java/lang/Throwable
    //   824	865	868	java/lang/Throwable
    //   928	955	958	java/lang/Throwable
    //   945	976	979	java/lang/Throwable
    //   962	1006	1009	java/lang/Throwable
    //   983	1017	1017	java/lang/Throwable
    //   1028	1044	1047	java/lang/Throwable
    //   1121	1135	1135	java/lang/Throwable
    //   1146	1159	1162	java/lang/Throwable
    //   1151	1174	1177	java/lang/Throwable
    //   1166	1192	1195	java/lang/Throwable
    //   1181	1222	1225	java/lang/Throwable
    //   1285	1312	1315	java/lang/Throwable
    //   1302	1333	1336	java/lang/Throwable
    //   1319	1363	1366	java/lang/Throwable
    //   1340	1374	1374	java/lang/Throwable
    //   1385	1401	1404	java/lang/Throwable
    //   1437	1451	1454	java/lang/Throwable
    //   1444	1465	1468	java/lang/Throwable
    //   1458	1479	1482	java/lang/Throwable
    //   1472	1493	1496	java/lang/Throwable
    //   1486	1507	1510	java/lang/Throwable
    //   1500	1521	1524	java/lang/Throwable
    //   1514	1535	1538	java/lang/Throwable
    //   1528	1549	1552	java/lang/Throwable
    //   1542	1559	1562	java/lang/Throwable
    //   1598	1612	1615	java/lang/Throwable
    //   1605	1626	1629	java/lang/Throwable
    //   1619	1640	1643	java/lang/Throwable
    //   1633	1654	1657	java/lang/Throwable
    //   1647	1668	1671	java/lang/Throwable
    //   1661	1682	1685	java/lang/Throwable
    //   1675	1696	1699	java/lang/Throwable
    //   1689	1710	1713	java/lang/Throwable
    //   1703	1727	1730	java/lang/Throwable
    //   1791	1809	1812	java/lang/Throwable
    //   1800	1825	1828	java/lang/Throwable
    //   1816	1842	1845	java/lang/Throwable
    //   1832	1858	1861	java/lang/Throwable
    //   1849	1875	1878	java/lang/Throwable
    //   1865	1891	1894	java/lang/Throwable
    //   1882	1907	1910	java/lang/Throwable
    //   1898	1930	1933	java/lang/Throwable
    //   1914	1946	1949	java/lang/Throwable
    //   1937	1962	1965	java/lang/Throwable
    //   1953	1985	1988	java/lang/Throwable
    //   1969	2001	2004	java/lang/Throwable
    //   1992	2017	2020	java/lang/Throwable
    //   2008	2036	2039	java/lang/Throwable
    //   2166	2201	2204	java/lang/Throwable
    //   2208	2249	2252	java/lang/Throwable
    //   2260	2350	2353	java/lang/Throwable
    //   2305	2402	2405	java/lang/Throwable
    //   2357	2413	2413	java/lang/Throwable
  }
  
  static void ZJ(Object paramObject) {
    Zxtc.Zo = a(16966, -28197);
    Zxtc.ZF = new BigInteger(a(16965, 16748));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zkco.Zz.charAt(Math.abs(((BigInteger)Zdk.Zy).intValue() % 32)) <= Zkf9.ZS.charAt(Math.abs(((BigInteger)Zlr2.Zq).intValue() % 32))) {
          try {
            Zrjg.ZV(Class.forName(a(16964, -1251)));
            if (!bool)
              Zmpp.Zm(Class.forName(a(16969, 32310))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zmpp.Zm(Class.forName(a(16969, 32310)));
    } catch (Throwable throwable) {}
  }
  
  static void ZL(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÌeP]W£?\\t \\tõ¼BÚ\\t¡-ýT"v\\tý]«b Ùó{Xü5<HT@{BLYÁGD_öês0UØ(ÏÇOÁÀ=Q\\t@ùüÃÐ¨M´GÏ`Àý±|­R48y$I¼ç§pý=!w©kvy»Ãa° úü×ì+HÞàËú2!/f·2çNIOÚ¢ñaÁi PãvKHúD\\ry¶ä]84Ü¾g°­áðèVKãÌÂ>\\tÖñ$V 3MLµ¯³¸Ë©3Ho©RÌFD1@áÞA°Ýnw¤¾ý£ZýÑ@« Ú¬A{p4â©!©.h\\f sÝ£El%ìÔÎJX£a\\tÕkKðL:ò wÄF8?UE\\tqÀØîÎåËxan5éJýt¶p'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #8
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_3
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
    //   64: goto -> 23
    //   67: ldc '/ã}:)û]ó3'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #8
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #66
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
    //   128: putstatic burp/Zg2.a : [Ljava/lang/String;
    //   131: bipush #15
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zg2.b : [Ljava/lang/String;
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
    //   212: bipush #79
    //   214: goto -> 244
    //   217: bipush #32
    //   219: goto -> 244
    //   222: bipush #31
    //   224: goto -> 244
    //   227: bipush #61
    //   229: goto -> 244
    //   232: bipush #15
    //   234: goto -> 244
    //   237: bipush #28
    //   239: goto -> 244
    //   242: bipush #92
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
    //   300: sipush #16970
    //   303: sipush #20696
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zg2.ZN : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #16968
    //   319: sipush #-22387
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zg2.ZE : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x4242) & 0xFFFF;
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
      byte b1 = 8;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */