package burp;

import java.math.BigInteger;

class Zb14 extends ClassLoader {
  static String Ze;
  
  static Object ZT;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZT(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: sipush #28650
    //   7: sipush #13337
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokestatic Zf : (Ljava/lang/Object;)V
    //   19: getstatic burp/Ztc2.ZM : Ljava/lang/Object;
    //   22: checkcast java/math/BigInteger
    //   25: getstatic burp/Zl_k.ZH : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   34: putstatic burp/Zk9s.ZY : Ljava/lang/Object;
    //   37: getstatic burp/Zrpy.ZG : Ljava/lang/Object;
    //   40: checkcast java/math/BigInteger
    //   43: invokevirtual toByteArray : ()[B
    //   46: astore_3
    //   47: new java/lang/StringBuilder
    //   50: dup
    //   51: invokespecial <init> : ()V
    //   54: astore #5
    //   56: aload #5
    //   58: sipush #28658
    //   61: sipush #-25553
    //   64: invokestatic a : (II)Ljava/lang/String;
    //   67: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: pop
    //   71: aload_3
    //   72: astore #6
    //   74: aload #6
    //   76: arraylength
    //   77: istore #7
    //   79: iconst_0
    //   80: istore #8
    //   82: iload #8
    //   84: iload #7
    //   86: if_icmpge -> 112
    //   89: aload #6
    //   91: iload #8
    //   93: baload
    //   94: istore #9
    //   96: aload #5
    //   98: iload #9
    //   100: i2c
    //   101: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   104: pop
    //   105: iinc #8, 1
    //   108: iload_2
    //   109: ifeq -> 82
    //   112: aload #5
    //   114: sipush #28657
    //   117: sipush #-2955
    //   120: invokestatic a : (II)Ljava/lang/String;
    //   123: ldc ''
    //   125: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   128: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   131: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: pop
    //   135: aload #5
    //   137: sipush #28656
    //   140: sipush #22373
    //   143: invokestatic a : (II)Ljava/lang/String;
    //   146: ldc ''
    //   148: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   151: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   154: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: pop
    //   158: aload #5
    //   160: invokevirtual toString : ()Ljava/lang/String;
    //   163: invokevirtual getBytes : ()[B
    //   166: astore #4
    //   168: aload #4
    //   170: astore_3
    //   171: aload_3
    //   172: arraylength
    //   173: bipush #8
    //   175: iadd
    //   176: bipush #6
    //   178: ishr
    //   179: iconst_1
    //   180: iadd
    //   181: bipush #16
    //   183: imul
    //   184: newarray int
    //   186: astore #5
    //   188: iconst_0
    //   189: istore #6
    //   191: iload #6
    //   193: aload_3
    //   194: arraylength
    //   195: if_icmpge -> 238
    //   198: aload_3
    //   199: iload #6
    //   201: baload
    //   202: sipush #255
    //   205: iand
    //   206: istore #7
    //   208: aload #5
    //   210: iload #6
    //   212: iconst_2
    //   213: ishr
    //   214: dup2
    //   215: iaload
    //   216: iload #7
    //   218: bipush #24
    //   220: iload #6
    //   222: iconst_4
    //   223: irem
    //   224: bipush #8
    //   226: imul
    //   227: isub
    //   228: ishl
    //   229: ior
    //   230: iastore
    //   231: iinc #6, 1
    //   234: iload_2
    //   235: ifeq -> 191
    //   238: aload #5
    //   240: iload #6
    //   242: iconst_2
    //   243: ishr
    //   244: dup2
    //   245: iaload
    //   246: sipush #128
    //   249: bipush #24
    //   251: iload #6
    //   253: iconst_4
    //   254: irem
    //   255: bipush #8
    //   257: imul
    //   258: isub
    //   259: ishl
    //   260: ior
    //   261: iastore
    //   262: aload #5
    //   264: aload #5
    //   266: arraylength
    //   267: iconst_1
    //   268: isub
    //   269: aload_3
    //   270: arraylength
    //   271: bipush #8
    //   273: imul
    //   274: iastore
    //   275: bipush #80
    //   277: newarray int
    //   279: astore #7
    //   281: ldc 1732584193
    //   283: istore #8
    //   285: ldc -271733879
    //   287: istore #9
    //   289: ldc -1732584194
    //   291: istore #10
    //   293: ldc 271733878
    //   295: istore #11
    //   297: ldc -1009589776
    //   299: istore #12
    //   301: iconst_0
    //   302: istore #6
    //   304: iload #6
    //   306: aload #5
    //   308: arraylength
    //   309: if_icmpge -> 631
    //   312: iload #8
    //   314: istore #13
    //   316: iload #9
    //   318: istore #14
    //   320: iload #10
    //   322: istore #15
    //   324: iload #11
    //   326: istore #16
    //   328: iload #12
    //   330: istore #17
    //   332: iconst_0
    //   333: istore #18
    //   335: iload #18
    //   337: bipush #80
    //   339: if_icmpge -> 589
    //   342: iload #18
    //   344: bipush #16
    //   346: if_icmpge -> 373
    //   349: aload #7
    //   351: iload #18
    //   353: aload #5
    //   355: iload #6
    //   357: iload #18
    //   359: iadd
    //   360: iaload
    //   361: iastore
    //   362: iload_2
    //   363: ifeq -> 428
    //   366: goto -> 373
    //   369: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   372: athrow
    //   373: aload #7
    //   375: iload #18
    //   377: iconst_3
    //   378: isub
    //   379: iaload
    //   380: aload #7
    //   382: iload #18
    //   384: bipush #8
    //   386: isub
    //   387: iaload
    //   388: ixor
    //   389: aload #7
    //   391: iload #18
    //   393: bipush #14
    //   395: isub
    //   396: iaload
    //   397: ixor
    //   398: aload #7
    //   400: iload #18
    //   402: bipush #16
    //   404: isub
    //   405: iaload
    //   406: ixor
    //   407: istore #19
    //   409: iload #19
    //   411: iconst_1
    //   412: ishl
    //   413: iload #19
    //   415: bipush #31
    //   417: iushr
    //   418: ior
    //   419: istore #20
    //   421: aload #7
    //   423: iload #18
    //   425: iload #20
    //   427: iastore
    //   428: iload #8
    //   430: iconst_5
    //   431: ishl
    //   432: iload #8
    //   434: bipush #27
    //   436: iushr
    //   437: ior
    //   438: istore #19
    //   440: iload #19
    //   442: iload #12
    //   444: iadd
    //   445: aload #7
    //   447: iload #18
    //   449: iaload
    //   450: iadd
    //   451: iload #18
    //   453: bipush #20
    //   455: if_icmpge -> 481
    //   458: ldc 1518500249
    //   460: iload #9
    //   462: iload #10
    //   464: iand
    //   465: iload #9
    //   467: iconst_m1
    //   468: ixor
    //   469: iload #11
    //   471: iand
    //   472: ior
    //   473: iadd
    //   474: goto -> 551
    //   477: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   480: athrow
    //   481: iload #18
    //   483: bipush #40
    //   485: if_icmpge -> 506
    //   488: ldc 1859775393
    //   490: iload #9
    //   492: iload #10
    //   494: ixor
    //   495: iload #11
    //   497: ixor
    //   498: iadd
    //   499: goto -> 551
    //   502: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   505: athrow
    //   506: iload #18
    //   508: bipush #60
    //   510: if_icmpge -> 540
    //   513: ldc -1894007588
    //   515: iload #9
    //   517: iload #10
    //   519: iand
    //   520: iload #9
    //   522: iload #11
    //   524: iand
    //   525: ior
    //   526: iload #10
    //   528: iload #11
    //   530: iand
    //   531: ior
    //   532: iadd
    //   533: goto -> 551
    //   536: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   539: athrow
    //   540: ldc -899497514
    //   542: iload #9
    //   544: iload #10
    //   546: ixor
    //   547: iload #11
    //   549: ixor
    //   550: iadd
    //   551: iadd
    //   552: istore #20
    //   554: iload #11
    //   556: istore #12
    //   558: iload #10
    //   560: istore #11
    //   562: iload #9
    //   564: bipush #30
    //   566: ishl
    //   567: iload #9
    //   569: iconst_2
    //   570: iushr
    //   571: ior
    //   572: istore #10
    //   574: iload #8
    //   576: istore #9
    //   578: iload #20
    //   580: istore #8
    //   582: iinc #18, 1
    //   585: iload_2
    //   586: ifeq -> 335
    //   589: iload #8
    //   591: iload #13
    //   593: iadd
    //   594: istore #8
    //   596: iload #9
    //   598: iload #14
    //   600: iadd
    //   601: istore #9
    //   603: iload #10
    //   605: iload #15
    //   607: iadd
    //   608: istore #10
    //   610: iload #11
    //   612: iload #16
    //   614: iadd
    //   615: istore #11
    //   617: iload #12
    //   619: iload #17
    //   621: iadd
    //   622: istore #12
    //   624: iinc #6, 16
    //   627: iload_2
    //   628: ifeq -> 304
    //   631: iconst_5
    //   632: newarray int
    //   634: dup
    //   635: iconst_0
    //   636: iload #8
    //   638: iastore
    //   639: dup
    //   640: iconst_1
    //   641: iload #9
    //   643: iastore
    //   644: dup
    //   645: iconst_2
    //   646: iload #10
    //   648: iastore
    //   649: dup
    //   650: iconst_3
    //   651: iload #11
    //   653: iastore
    //   654: dup
    //   655: iconst_4
    //   656: iload #12
    //   658: iastore
    //   659: astore #13
    //   661: bipush #20
    //   663: newarray byte
    //   665: astore #14
    //   667: iconst_0
    //   668: istore #15
    //   670: iload #15
    //   672: bipush #20
    //   674: if_icmpge -> 715
    //   677: aload #13
    //   679: iload #15
    //   681: iconst_4
    //   682: idiv
    //   683: iaload
    //   684: istore #16
    //   686: iconst_3
    //   687: iload #15
    //   689: iconst_4
    //   690: irem
    //   691: isub
    //   692: bipush #8
    //   694: imul
    //   695: istore #17
    //   697: aload #14
    //   699: iload #15
    //   701: iload #16
    //   703: iload #17
    //   705: iushr
    //   706: i2b
    //   707: bastore
    //   708: iinc #15, 1
    //   711: iload_2
    //   712: ifeq -> 670
    //   715: aload #14
    //   717: astore #4
    //   719: sipush #28647
    //   722: sipush #23916
    //   725: invokestatic a : (II)Ljava/lang/String;
    //   728: iconst_1
    //   729: ldc burp/Zzrb
    //   731: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   734: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   737: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   740: astore_3
    //   741: aload_3
    //   742: arraylength
    //   743: istore #4
    //   745: iconst_0
    //   746: istore #5
    //   748: iload #5
    //   750: iload #4
    //   752: if_icmpge -> 889
    //   755: aload_3
    //   756: iload #5
    //   758: aaload
    //   759: astore #6
    //   761: aload #6
    //   763: invokevirtual getModifiers : ()I
    //   766: invokestatic isStatic : (I)Z
    //   769: ifne -> 779
    //   772: goto -> 882
    //   775: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   778: athrow
    //   779: aload #6
    //   781: invokevirtual getType : ()Ljava/lang/Class;
    //   784: astore #7
    //   786: aload #7
    //   788: ifnull -> 869
    //   791: aload #7
    //   793: invokevirtual isPrimitive : ()Z
    //   796: ifne -> 869
    //   799: goto -> 806
    //   802: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   805: athrow
    //   806: aload #7
    //   808: invokevirtual getPackage : ()Ljava/lang/Package;
    //   811: ifnull -> 869
    //   814: goto -> 821
    //   817: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   820: athrow
    //   821: aload #7
    //   823: invokevirtual getPackage : ()Ljava/lang/Package;
    //   826: invokevirtual getName : ()Ljava/lang/String;
    //   829: ifnull -> 869
    //   832: goto -> 839
    //   835: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   838: athrow
    //   839: aload #7
    //   841: invokevirtual getPackage : ()Ljava/lang/Package;
    //   844: invokevirtual getName : ()Ljava/lang/String;
    //   847: sipush #28666
    //   850: sipush #-11896
    //   853: invokestatic a : (II)Ljava/lang/String;
    //   856: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   859: ifne -> 869
    //   862: goto -> 869
    //   865: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   868: athrow
    //   869: aload #6
    //   871: iconst_1
    //   872: invokevirtual setAccessible : (Z)V
    //   875: aload #6
    //   877: aconst_null
    //   878: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   881: pop
    //   882: iinc #5, 1
    //   885: iload_2
    //   886: ifeq -> 748
    //   889: sipush #28640
    //   892: sipush #-20167
    //   895: invokestatic a : (II)Ljava/lang/String;
    //   898: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   901: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   904: astore_3
    //   905: aload_3
    //   906: arraylength
    //   907: istore #4
    //   909: iconst_0
    //   910: istore #5
    //   912: iload #5
    //   914: iload #4
    //   916: if_icmpge -> 1048
    //   919: aload_3
    //   920: iload #5
    //   922: aaload
    //   923: astore #6
    //   925: aload #6
    //   927: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   930: pop
    //   931: aload #6
    //   933: invokevirtual getModifiers : ()I
    //   936: invokestatic isStatic : (I)Z
    //   939: ifeq -> 1034
    //   942: aload #6
    //   944: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   947: arraylength
    //   948: iconst_2
    //   949: if_icmpne -> 1034
    //   952: goto -> 959
    //   955: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   958: athrow
    //   959: aload #6
    //   961: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   964: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   967: invokevirtual equals : (Ljava/lang/Object;)Z
    //   970: ifeq -> 1034
    //   973: goto -> 980
    //   976: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   979: athrow
    //   980: aload #6
    //   982: iconst_1
    //   983: invokevirtual setAccessible : (Z)V
    //   986: aload #6
    //   988: aconst_null
    //   989: iconst_2
    //   990: anewarray java/lang/Object
    //   993: dup
    //   994: iconst_0
    //   995: aload_0
    //   996: aastore
    //   997: dup
    //   998: iconst_1
    //   999: aload_1
    //   1000: ifnonnull -> 1018
    //   1003: goto -> 1010
    //   1006: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1009: athrow
    //   1010: aload_1
    //   1011: goto -> 1025
    //   1014: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1017: athrow
    //   1018: aload_1
    //   1019: checkcast [B
    //   1022: invokevirtual clone : ()Ljava/lang/Object;
    //   1025: aastore
    //   1026: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1029: pop
    //   1030: iload_2
    //   1031: ifeq -> 1048
    //   1034: iinc #5, 1
    //   1037: iload_2
    //   1038: ifeq -> 912
    //   1041: goto -> 1048
    //   1044: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1047: athrow
    //   1048: iconst_0
    //   1049: istore_3
    //   1050: getstatic burp/Zzh0.ZK : Ljava/lang/String;
    //   1053: getstatic burp/Zl8y.ZD : Ljava/lang/Object;
    //   1056: checkcast java/math/BigInteger
    //   1059: invokevirtual intValue : ()I
    //   1062: bipush #32
    //   1064: irem
    //   1065: invokestatic abs : (I)I
    //   1068: invokevirtual charAt : (I)C
    //   1071: getstatic burp/Zx8t.Zi : Ljava/lang/String;
    //   1074: getstatic burp/Zb9h.Zm : Ljava/lang/Object;
    //   1077: checkcast java/math/BigInteger
    //   1080: invokevirtual intValue : ()I
    //   1083: bipush #32
    //   1085: irem
    //   1086: invokestatic abs : (I)I
    //   1089: invokevirtual charAt : (I)C
    //   1092: if_icmple -> 1436
    //   1095: sipush #28644
    //   1098: sipush #25324
    //   1101: invokestatic a : (II)Ljava/lang/String;
    //   1104: iconst_1
    //   1105: ldc burp/Zgw7
    //   1107: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1110: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1113: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1116: astore #4
    //   1118: aload #4
    //   1120: arraylength
    //   1121: istore #5
    //   1123: iconst_0
    //   1124: istore #6
    //   1126: iload #6
    //   1128: iload #5
    //   1130: if_icmpge -> 1268
    //   1133: aload #4
    //   1135: iload #6
    //   1137: aaload
    //   1138: astore #7
    //   1140: aload #7
    //   1142: invokevirtual getModifiers : ()I
    //   1145: invokestatic isStatic : (I)Z
    //   1148: ifne -> 1158
    //   1151: goto -> 1261
    //   1154: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1157: athrow
    //   1158: aload #7
    //   1160: invokevirtual getType : ()Ljava/lang/Class;
    //   1163: astore #8
    //   1165: aload #8
    //   1167: ifnull -> 1248
    //   1170: aload #8
    //   1172: invokevirtual isPrimitive : ()Z
    //   1175: ifne -> 1248
    //   1178: goto -> 1185
    //   1181: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1184: athrow
    //   1185: aload #8
    //   1187: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1190: ifnull -> 1248
    //   1193: goto -> 1200
    //   1196: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1199: athrow
    //   1200: aload #8
    //   1202: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1205: invokevirtual getName : ()Ljava/lang/String;
    //   1208: ifnull -> 1248
    //   1211: goto -> 1218
    //   1214: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1217: athrow
    //   1218: aload #8
    //   1220: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1223: invokevirtual getName : ()Ljava/lang/String;
    //   1226: sipush #28646
    //   1229: sipush #-3522
    //   1232: invokestatic a : (II)Ljava/lang/String;
    //   1235: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1238: ifne -> 1248
    //   1241: goto -> 1248
    //   1244: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1247: athrow
    //   1248: aload #7
    //   1250: iconst_1
    //   1251: invokevirtual setAccessible : (Z)V
    //   1254: aload #7
    //   1256: aconst_null
    //   1257: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1260: pop
    //   1261: iinc #6, 1
    //   1264: iload_2
    //   1265: ifeq -> 1126
    //   1268: sipush #28667
    //   1271: sipush #-32198
    //   1274: invokestatic a : (II)Ljava/lang/String;
    //   1277: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1280: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1283: astore #4
    //   1285: aload #4
    //   1287: arraylength
    //   1288: istore #5
    //   1290: iconst_0
    //   1291: istore #6
    //   1293: iload #6
    //   1295: iload #5
    //   1297: if_icmpge -> 1433
    //   1300: aload #4
    //   1302: iload #6
    //   1304: aaload
    //   1305: astore #7
    //   1307: aload #7
    //   1309: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1312: pop
    //   1313: aload #7
    //   1315: invokevirtual getModifiers : ()I
    //   1318: invokestatic isStatic : (I)Z
    //   1321: ifeq -> 1419
    //   1324: aload #7
    //   1326: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1329: arraylength
    //   1330: iconst_2
    //   1331: if_icmpne -> 1419
    //   1334: goto -> 1341
    //   1337: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1340: athrow
    //   1341: aload #7
    //   1343: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1346: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1349: if_acmpne -> 1419
    //   1352: goto -> 1359
    //   1355: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1358: athrow
    //   1359: aload #7
    //   1361: iconst_1
    //   1362: invokevirtual setAccessible : (Z)V
    //   1365: aload #7
    //   1367: aconst_null
    //   1368: iconst_2
    //   1369: anewarray java/lang/Object
    //   1372: dup
    //   1373: iconst_0
    //   1374: aload_0
    //   1375: aastore
    //   1376: dup
    //   1377: iconst_1
    //   1378: aload_1
    //   1379: ifnonnull -> 1397
    //   1382: goto -> 1389
    //   1385: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1388: athrow
    //   1389: aload_1
    //   1390: goto -> 1404
    //   1393: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1396: athrow
    //   1397: aload_1
    //   1398: checkcast [B
    //   1401: invokevirtual clone : ()Ljava/lang/Object;
    //   1404: aastore
    //   1405: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1408: checkcast java/lang/Boolean
    //   1411: invokevirtual booleanValue : ()Z
    //   1414: istore_3
    //   1415: iload_2
    //   1416: ifeq -> 1433
    //   1419: iinc #6, 1
    //   1422: iload_2
    //   1423: ifeq -> 1293
    //   1426: goto -> 1433
    //   1429: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1432: athrow
    //   1433: goto -> 1774
    //   1436: sipush #28648
    //   1439: sipush #30167
    //   1442: invokestatic a : (II)Ljava/lang/String;
    //   1445: iconst_1
    //   1446: ldc burp/Zlc5
    //   1448: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1451: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1454: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1457: astore #4
    //   1459: aload #4
    //   1461: arraylength
    //   1462: istore #5
    //   1464: iconst_0
    //   1465: istore #6
    //   1467: iload #6
    //   1469: iload #5
    //   1471: if_icmpge -> 1609
    //   1474: aload #4
    //   1476: iload #6
    //   1478: aaload
    //   1479: astore #7
    //   1481: aload #7
    //   1483: invokevirtual getModifiers : ()I
    //   1486: invokestatic isStatic : (I)Z
    //   1489: ifne -> 1499
    //   1492: goto -> 1602
    //   1495: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1498: athrow
    //   1499: aload #7
    //   1501: invokevirtual getType : ()Ljava/lang/Class;
    //   1504: astore #8
    //   1506: aload #8
    //   1508: ifnull -> 1589
    //   1511: aload #8
    //   1513: invokevirtual isPrimitive : ()Z
    //   1516: ifne -> 1589
    //   1519: goto -> 1526
    //   1522: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1525: athrow
    //   1526: aload #8
    //   1528: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1531: ifnull -> 1589
    //   1534: goto -> 1541
    //   1537: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1540: athrow
    //   1541: aload #8
    //   1543: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1546: invokevirtual getName : ()Ljava/lang/String;
    //   1549: ifnull -> 1589
    //   1552: goto -> 1559
    //   1555: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1558: athrow
    //   1559: aload #8
    //   1561: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1564: invokevirtual getName : ()Ljava/lang/String;
    //   1567: sipush #28646
    //   1570: sipush #-3522
    //   1573: invokestatic a : (II)Ljava/lang/String;
    //   1576: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1579: ifne -> 1589
    //   1582: goto -> 1589
    //   1585: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1588: athrow
    //   1589: aload #7
    //   1591: iconst_1
    //   1592: invokevirtual setAccessible : (Z)V
    //   1595: aload #7
    //   1597: aconst_null
    //   1598: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1601: pop
    //   1602: iinc #6, 1
    //   1605: iload_2
    //   1606: ifeq -> 1467
    //   1609: sipush #28670
    //   1612: sipush #2422
    //   1615: invokestatic a : (II)Ljava/lang/String;
    //   1618: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1621: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1624: astore #4
    //   1626: aload #4
    //   1628: arraylength
    //   1629: istore #5
    //   1631: iconst_0
    //   1632: istore #6
    //   1634: iload #6
    //   1636: iload #5
    //   1638: if_icmpge -> 1774
    //   1641: aload #4
    //   1643: iload #6
    //   1645: aaload
    //   1646: astore #7
    //   1648: aload #7
    //   1650: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1653: pop
    //   1654: aload #7
    //   1656: invokevirtual getModifiers : ()I
    //   1659: invokestatic isStatic : (I)Z
    //   1662: ifeq -> 1760
    //   1665: aload #7
    //   1667: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1670: arraylength
    //   1671: iconst_2
    //   1672: if_icmpne -> 1760
    //   1675: goto -> 1682
    //   1678: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1681: athrow
    //   1682: aload #7
    //   1684: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1687: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1690: if_acmpne -> 1760
    //   1693: goto -> 1700
    //   1696: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1699: athrow
    //   1700: aload #7
    //   1702: iconst_1
    //   1703: invokevirtual setAccessible : (Z)V
    //   1706: aload #7
    //   1708: aconst_null
    //   1709: iconst_2
    //   1710: anewarray java/lang/Object
    //   1713: dup
    //   1714: iconst_0
    //   1715: aload_0
    //   1716: aastore
    //   1717: dup
    //   1718: iconst_1
    //   1719: aload_1
    //   1720: ifnonnull -> 1738
    //   1723: goto -> 1730
    //   1726: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1729: athrow
    //   1730: aload_1
    //   1731: goto -> 1745
    //   1734: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1737: athrow
    //   1738: aload_1
    //   1739: checkcast [B
    //   1742: invokevirtual clone : ()Ljava/lang/Object;
    //   1745: aastore
    //   1746: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1749: checkcast java/lang/Boolean
    //   1752: invokevirtual booleanValue : ()Z
    //   1755: istore_3
    //   1756: iload_2
    //   1757: ifeq -> 1774
    //   1760: iinc #6, 1
    //   1763: iload_2
    //   1764: ifeq -> 1634
    //   1767: goto -> 1774
    //   1770: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1773: athrow
    //   1774: iload_3
    //   1775: ifeq -> 1780
    //   1778: iload_3
    //   1779: ireturn
    //   1780: getstatic burp/Zeor.Zj : Ljava/lang/String;
    //   1783: getstatic burp/Zlb6.Zz : Ljava/lang/Object;
    //   1786: checkcast java/math/BigInteger
    //   1789: invokevirtual intValue : ()I
    //   1792: bipush #32
    //   1794: irem
    //   1795: invokestatic abs : (I)I
    //   1798: invokevirtual charAt : (I)C
    //   1801: getstatic burp/Zrod.ZQ : Ljava/lang/String;
    //   1804: getstatic burp/Zeb3.Zb : Ljava/lang/Object;
    //   1807: checkcast java/math/BigInteger
    //   1810: invokevirtual intValue : ()I
    //   1813: bipush #32
    //   1815: irem
    //   1816: invokestatic abs : (I)I
    //   1819: invokevirtual charAt : (I)C
    //   1822: if_icmple -> 2167
    //   1825: sipush #28660
    //   1828: sipush #5252
    //   1831: invokestatic a : (II)Ljava/lang/String;
    //   1834: iconst_1
    //   1835: ldc burp/Zrjw
    //   1837: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1840: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1843: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1846: astore #4
    //   1848: aload #4
    //   1850: arraylength
    //   1851: istore #5
    //   1853: iconst_0
    //   1854: istore #6
    //   1856: iload #6
    //   1858: iload #5
    //   1860: if_icmpge -> 1998
    //   1863: aload #4
    //   1865: iload #6
    //   1867: aaload
    //   1868: astore #7
    //   1870: aload #7
    //   1872: invokevirtual getModifiers : ()I
    //   1875: invokestatic isStatic : (I)Z
    //   1878: ifne -> 1888
    //   1881: goto -> 1991
    //   1884: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1887: athrow
    //   1888: aload #7
    //   1890: invokevirtual getType : ()Ljava/lang/Class;
    //   1893: astore #8
    //   1895: aload #8
    //   1897: ifnull -> 1978
    //   1900: aload #8
    //   1902: invokevirtual isPrimitive : ()Z
    //   1905: ifne -> 1978
    //   1908: goto -> 1915
    //   1911: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1914: athrow
    //   1915: aload #8
    //   1917: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1920: ifnull -> 1978
    //   1923: goto -> 1930
    //   1926: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1929: athrow
    //   1930: aload #8
    //   1932: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1935: invokevirtual getName : ()Ljava/lang/String;
    //   1938: ifnull -> 1978
    //   1941: goto -> 1948
    //   1944: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1947: athrow
    //   1948: aload #8
    //   1950: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1953: invokevirtual getName : ()Ljava/lang/String;
    //   1956: sipush #28646
    //   1959: sipush #-3522
    //   1962: invokestatic a : (II)Ljava/lang/String;
    //   1965: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1968: ifne -> 1978
    //   1971: goto -> 1978
    //   1974: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1977: athrow
    //   1978: aload #7
    //   1980: iconst_1
    //   1981: invokevirtual setAccessible : (Z)V
    //   1984: aload #7
    //   1986: aconst_null
    //   1987: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1990: pop
    //   1991: iinc #6, 1
    //   1994: iload_2
    //   1995: ifeq -> 1856
    //   1998: sipush #28671
    //   2001: sipush #-31126
    //   2004: invokestatic a : (II)Ljava/lang/String;
    //   2007: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2010: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2013: astore #4
    //   2015: aload #4
    //   2017: arraylength
    //   2018: istore #5
    //   2020: iconst_0
    //   2021: istore #6
    //   2023: iload #6
    //   2025: iload #5
    //   2027: if_icmpge -> 2163
    //   2030: aload #4
    //   2032: iload #6
    //   2034: aaload
    //   2035: astore #7
    //   2037: aload #7
    //   2039: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2042: pop
    //   2043: aload #7
    //   2045: invokevirtual getModifiers : ()I
    //   2048: invokestatic isStatic : (I)Z
    //   2051: ifeq -> 2149
    //   2054: aload #7
    //   2056: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2059: arraylength
    //   2060: iconst_2
    //   2061: if_icmpne -> 2149
    //   2064: goto -> 2071
    //   2067: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2070: athrow
    //   2071: aload #7
    //   2073: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2076: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2079: if_acmpne -> 2149
    //   2082: goto -> 2089
    //   2085: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2088: athrow
    //   2089: aload #7
    //   2091: iconst_1
    //   2092: invokevirtual setAccessible : (Z)V
    //   2095: aload #7
    //   2097: aconst_null
    //   2098: iconst_2
    //   2099: anewarray java/lang/Object
    //   2102: dup
    //   2103: iconst_0
    //   2104: aload_0
    //   2105: aastore
    //   2106: dup
    //   2107: iconst_1
    //   2108: aload_1
    //   2109: ifnonnull -> 2127
    //   2112: goto -> 2119
    //   2115: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2118: athrow
    //   2119: aload_1
    //   2120: goto -> 2134
    //   2123: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2126: athrow
    //   2127: aload_1
    //   2128: checkcast [B
    //   2131: invokevirtual clone : ()Ljava/lang/Object;
    //   2134: aastore
    //   2135: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2138: checkcast java/lang/Boolean
    //   2141: invokevirtual booleanValue : ()Z
    //   2144: istore_3
    //   2145: iload_2
    //   2146: ifeq -> 2163
    //   2149: iinc #6, 1
    //   2152: iload_2
    //   2153: ifeq -> 2023
    //   2156: goto -> 2163
    //   2159: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2162: athrow
    //   2163: iload_2
    //   2164: ifeq -> 2505
    //   2167: sipush #28665
    //   2170: sipush #24196
    //   2173: invokestatic a : (II)Ljava/lang/String;
    //   2176: iconst_1
    //   2177: ldc burp/Zsxm
    //   2179: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2182: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2185: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2188: astore #4
    //   2190: aload #4
    //   2192: arraylength
    //   2193: istore #5
    //   2195: iconst_0
    //   2196: istore #6
    //   2198: iload #6
    //   2200: iload #5
    //   2202: if_icmpge -> 2340
    //   2205: aload #4
    //   2207: iload #6
    //   2209: aaload
    //   2210: astore #7
    //   2212: aload #7
    //   2214: invokevirtual getModifiers : ()I
    //   2217: invokestatic isStatic : (I)Z
    //   2220: ifne -> 2230
    //   2223: goto -> 2333
    //   2226: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2229: athrow
    //   2230: aload #7
    //   2232: invokevirtual getType : ()Ljava/lang/Class;
    //   2235: astore #8
    //   2237: aload #8
    //   2239: ifnull -> 2320
    //   2242: aload #8
    //   2244: invokevirtual isPrimitive : ()Z
    //   2247: ifne -> 2320
    //   2250: goto -> 2257
    //   2253: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2256: athrow
    //   2257: aload #8
    //   2259: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2262: ifnull -> 2320
    //   2265: goto -> 2272
    //   2268: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2271: athrow
    //   2272: aload #8
    //   2274: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2277: invokevirtual getName : ()Ljava/lang/String;
    //   2280: ifnull -> 2320
    //   2283: goto -> 2290
    //   2286: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2289: athrow
    //   2290: aload #8
    //   2292: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2295: invokevirtual getName : ()Ljava/lang/String;
    //   2298: sipush #28646
    //   2301: sipush #-3522
    //   2304: invokestatic a : (II)Ljava/lang/String;
    //   2307: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2310: ifne -> 2320
    //   2313: goto -> 2320
    //   2316: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2319: athrow
    //   2320: aload #7
    //   2322: iconst_1
    //   2323: invokevirtual setAccessible : (Z)V
    //   2326: aload #7
    //   2328: aconst_null
    //   2329: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2332: pop
    //   2333: iinc #6, 1
    //   2336: iload_2
    //   2337: ifeq -> 2198
    //   2340: sipush #28664
    //   2343: sipush #1962
    //   2346: invokestatic a : (II)Ljava/lang/String;
    //   2349: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2352: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2355: astore #4
    //   2357: aload #4
    //   2359: arraylength
    //   2360: istore #5
    //   2362: iconst_0
    //   2363: istore #6
    //   2365: iload #6
    //   2367: iload #5
    //   2369: if_icmpge -> 2505
    //   2372: aload #4
    //   2374: iload #6
    //   2376: aaload
    //   2377: astore #7
    //   2379: aload #7
    //   2381: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2384: pop
    //   2385: aload #7
    //   2387: invokevirtual getModifiers : ()I
    //   2390: invokestatic isStatic : (I)Z
    //   2393: ifeq -> 2491
    //   2396: aload #7
    //   2398: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2401: arraylength
    //   2402: iconst_2
    //   2403: if_icmpne -> 2491
    //   2406: goto -> 2413
    //   2409: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2412: athrow
    //   2413: aload #7
    //   2415: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2418: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2421: if_acmpne -> 2491
    //   2424: goto -> 2431
    //   2427: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2430: athrow
    //   2431: aload #7
    //   2433: iconst_1
    //   2434: invokevirtual setAccessible : (Z)V
    //   2437: aload #7
    //   2439: aconst_null
    //   2440: iconst_2
    //   2441: anewarray java/lang/Object
    //   2444: dup
    //   2445: iconst_0
    //   2446: aload_0
    //   2447: aastore
    //   2448: dup
    //   2449: iconst_1
    //   2450: aload_1
    //   2451: ifnonnull -> 2469
    //   2454: goto -> 2461
    //   2457: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2460: athrow
    //   2461: aload_1
    //   2462: goto -> 2476
    //   2465: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2468: athrow
    //   2469: aload_1
    //   2470: checkcast [B
    //   2473: invokevirtual clone : ()Ljava/lang/Object;
    //   2476: aastore
    //   2477: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2480: checkcast java/lang/Boolean
    //   2483: invokevirtual booleanValue : ()Z
    //   2486: istore_3
    //   2487: iload_2
    //   2488: ifeq -> 2505
    //   2491: iinc #6, 1
    //   2494: iload_2
    //   2495: ifeq -> 2365
    //   2498: goto -> 2505
    //   2501: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2504: athrow
    //   2505: iload_3
    //   2506: ifeq -> 2511
    //   2509: iload_3
    //   2510: ireturn
    //   2511: getstatic burp/Zgt7.ZO : Ljava/lang/String;
    //   2514: getstatic burp/Znp.ZJ : Ljava/lang/Object;
    //   2517: checkcast java/math/BigInteger
    //   2520: invokevirtual intValue : ()I
    //   2523: bipush #32
    //   2525: irem
    //   2526: invokestatic abs : (I)I
    //   2529: invokevirtual charAt : (I)C
    //   2532: getstatic burp/Zkfa.Zy : Ljava/lang/String;
    //   2535: getstatic burp/Zxpb.Zo : Ljava/lang/Object;
    //   2538: checkcast java/math/BigInteger
    //   2541: invokevirtual intValue : ()I
    //   2544: bipush #32
    //   2546: irem
    //   2547: invokestatic abs : (I)I
    //   2550: invokevirtual charAt : (I)C
    //   2553: if_icmple -> 2898
    //   2556: sipush #28649
    //   2559: sipush #-12075
    //   2562: invokestatic a : (II)Ljava/lang/String;
    //   2565: iconst_1
    //   2566: ldc burp/Zb1
    //   2568: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2571: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2574: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2577: astore #4
    //   2579: aload #4
    //   2581: arraylength
    //   2582: istore #5
    //   2584: iconst_0
    //   2585: istore #6
    //   2587: iload #6
    //   2589: iload #5
    //   2591: if_icmpge -> 2729
    //   2594: aload #4
    //   2596: iload #6
    //   2598: aaload
    //   2599: astore #7
    //   2601: aload #7
    //   2603: invokevirtual getModifiers : ()I
    //   2606: invokestatic isStatic : (I)Z
    //   2609: ifne -> 2619
    //   2612: goto -> 2722
    //   2615: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2618: athrow
    //   2619: aload #7
    //   2621: invokevirtual getType : ()Ljava/lang/Class;
    //   2624: astore #8
    //   2626: aload #8
    //   2628: ifnull -> 2709
    //   2631: aload #8
    //   2633: invokevirtual isPrimitive : ()Z
    //   2636: ifne -> 2709
    //   2639: goto -> 2646
    //   2642: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2645: athrow
    //   2646: aload #8
    //   2648: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2651: ifnull -> 2709
    //   2654: goto -> 2661
    //   2657: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2660: athrow
    //   2661: aload #8
    //   2663: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2666: invokevirtual getName : ()Ljava/lang/String;
    //   2669: ifnull -> 2709
    //   2672: goto -> 2679
    //   2675: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2678: athrow
    //   2679: aload #8
    //   2681: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2684: invokevirtual getName : ()Ljava/lang/String;
    //   2687: sipush #28646
    //   2690: sipush #-3522
    //   2693: invokestatic a : (II)Ljava/lang/String;
    //   2696: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2699: ifne -> 2709
    //   2702: goto -> 2709
    //   2705: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2708: athrow
    //   2709: aload #7
    //   2711: iconst_1
    //   2712: invokevirtual setAccessible : (Z)V
    //   2715: aload #7
    //   2717: aconst_null
    //   2718: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2721: pop
    //   2722: iinc #6, 1
    //   2725: iload_2
    //   2726: ifeq -> 2587
    //   2729: sipush #28651
    //   2732: sipush #28547
    //   2735: invokestatic a : (II)Ljava/lang/String;
    //   2738: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2741: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2744: astore #4
    //   2746: aload #4
    //   2748: arraylength
    //   2749: istore #5
    //   2751: iconst_0
    //   2752: istore #6
    //   2754: iload #6
    //   2756: iload #5
    //   2758: if_icmpge -> 2894
    //   2761: aload #4
    //   2763: iload #6
    //   2765: aaload
    //   2766: astore #7
    //   2768: aload #7
    //   2770: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2773: pop
    //   2774: aload #7
    //   2776: invokevirtual getModifiers : ()I
    //   2779: invokestatic isStatic : (I)Z
    //   2782: ifeq -> 2880
    //   2785: aload #7
    //   2787: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2790: arraylength
    //   2791: iconst_2
    //   2792: if_icmpne -> 2880
    //   2795: goto -> 2802
    //   2798: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2801: athrow
    //   2802: aload #7
    //   2804: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2807: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2810: if_acmpne -> 2880
    //   2813: goto -> 2820
    //   2816: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2819: athrow
    //   2820: aload #7
    //   2822: iconst_1
    //   2823: invokevirtual setAccessible : (Z)V
    //   2826: aload #7
    //   2828: aconst_null
    //   2829: iconst_2
    //   2830: anewarray java/lang/Object
    //   2833: dup
    //   2834: iconst_0
    //   2835: aload_0
    //   2836: aastore
    //   2837: dup
    //   2838: iconst_1
    //   2839: aload_1
    //   2840: ifnonnull -> 2858
    //   2843: goto -> 2850
    //   2846: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2849: athrow
    //   2850: aload_1
    //   2851: goto -> 2865
    //   2854: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2857: athrow
    //   2858: aload_1
    //   2859: checkcast [B
    //   2862: invokevirtual clone : ()Ljava/lang/Object;
    //   2865: aastore
    //   2866: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2869: checkcast java/lang/Boolean
    //   2872: invokevirtual booleanValue : ()Z
    //   2875: istore_3
    //   2876: iload_2
    //   2877: ifeq -> 2894
    //   2880: iinc #6, 1
    //   2883: iload_2
    //   2884: ifeq -> 2754
    //   2887: goto -> 2894
    //   2890: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2893: athrow
    //   2894: iload_2
    //   2895: ifeq -> 3236
    //   2898: sipush #28655
    //   2901: sipush #-26297
    //   2904: invokestatic a : (II)Ljava/lang/String;
    //   2907: iconst_1
    //   2908: ldc burp/Zzef
    //   2910: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2913: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2916: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2919: astore #4
    //   2921: aload #4
    //   2923: arraylength
    //   2924: istore #5
    //   2926: iconst_0
    //   2927: istore #6
    //   2929: iload #6
    //   2931: iload #5
    //   2933: if_icmpge -> 3071
    //   2936: aload #4
    //   2938: iload #6
    //   2940: aaload
    //   2941: astore #7
    //   2943: aload #7
    //   2945: invokevirtual getModifiers : ()I
    //   2948: invokestatic isStatic : (I)Z
    //   2951: ifne -> 2961
    //   2954: goto -> 3064
    //   2957: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2960: athrow
    //   2961: aload #7
    //   2963: invokevirtual getType : ()Ljava/lang/Class;
    //   2966: astore #8
    //   2968: aload #8
    //   2970: ifnull -> 3051
    //   2973: aload #8
    //   2975: invokevirtual isPrimitive : ()Z
    //   2978: ifne -> 3051
    //   2981: goto -> 2988
    //   2984: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2987: athrow
    //   2988: aload #8
    //   2990: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2993: ifnull -> 3051
    //   2996: goto -> 3003
    //   2999: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3002: athrow
    //   3003: aload #8
    //   3005: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3008: invokevirtual getName : ()Ljava/lang/String;
    //   3011: ifnull -> 3051
    //   3014: goto -> 3021
    //   3017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3020: athrow
    //   3021: aload #8
    //   3023: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3026: invokevirtual getName : ()Ljava/lang/String;
    //   3029: sipush #28646
    //   3032: sipush #-3522
    //   3035: invokestatic a : (II)Ljava/lang/String;
    //   3038: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3041: ifne -> 3051
    //   3044: goto -> 3051
    //   3047: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3050: athrow
    //   3051: aload #7
    //   3053: iconst_1
    //   3054: invokevirtual setAccessible : (Z)V
    //   3057: aload #7
    //   3059: aconst_null
    //   3060: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3063: pop
    //   3064: iinc #6, 1
    //   3067: iload_2
    //   3068: ifeq -> 2929
    //   3071: sipush #28652
    //   3074: sipush #-20285
    //   3077: invokestatic a : (II)Ljava/lang/String;
    //   3080: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3083: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3086: astore #4
    //   3088: aload #4
    //   3090: arraylength
    //   3091: istore #5
    //   3093: iconst_0
    //   3094: istore #6
    //   3096: iload #6
    //   3098: iload #5
    //   3100: if_icmpge -> 3236
    //   3103: aload #4
    //   3105: iload #6
    //   3107: aaload
    //   3108: astore #7
    //   3110: aload #7
    //   3112: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3115: pop
    //   3116: aload #7
    //   3118: invokevirtual getModifiers : ()I
    //   3121: invokestatic isStatic : (I)Z
    //   3124: ifeq -> 3222
    //   3127: aload #7
    //   3129: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3132: arraylength
    //   3133: iconst_2
    //   3134: if_icmpne -> 3222
    //   3137: goto -> 3144
    //   3140: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3143: athrow
    //   3144: aload #7
    //   3146: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3149: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3152: if_acmpne -> 3222
    //   3155: goto -> 3162
    //   3158: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3161: athrow
    //   3162: aload #7
    //   3164: iconst_1
    //   3165: invokevirtual setAccessible : (Z)V
    //   3168: aload #7
    //   3170: aconst_null
    //   3171: iconst_2
    //   3172: anewarray java/lang/Object
    //   3175: dup
    //   3176: iconst_0
    //   3177: aload_0
    //   3178: aastore
    //   3179: dup
    //   3180: iconst_1
    //   3181: aload_1
    //   3182: ifnonnull -> 3200
    //   3185: goto -> 3192
    //   3188: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3191: athrow
    //   3192: aload_1
    //   3193: goto -> 3207
    //   3196: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3199: athrow
    //   3200: aload_1
    //   3201: checkcast [B
    //   3204: invokevirtual clone : ()Ljava/lang/Object;
    //   3207: aastore
    //   3208: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3211: checkcast java/lang/Boolean
    //   3214: invokevirtual booleanValue : ()Z
    //   3217: istore_3
    //   3218: iload_2
    //   3219: ifeq -> 3236
    //   3222: iinc #6, 1
    //   3225: iload_2
    //   3226: ifeq -> 3096
    //   3229: goto -> 3236
    //   3232: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3235: athrow
    //   3236: iload_3
    //   3237: ifeq -> 3242
    //   3240: iload_3
    //   3241: ireturn
    //   3242: getstatic burp/Zrf9.ZV : Ljava/lang/String;
    //   3245: getstatic burp/Zlps.ZU : Ljava/lang/Object;
    //   3248: checkcast java/math/BigInteger
    //   3251: invokevirtual intValue : ()I
    //   3254: bipush #32
    //   3256: irem
    //   3257: invokestatic abs : (I)I
    //   3260: invokevirtual charAt : (I)C
    //   3263: getstatic burp/Zelc.ZI : Ljava/lang/String;
    //   3266: getstatic burp/Zelc.ZR : Ljava/lang/Object;
    //   3269: checkcast java/math/BigInteger
    //   3272: invokevirtual intValue : ()I
    //   3275: bipush #32
    //   3277: irem
    //   3278: invokestatic abs : (I)I
    //   3281: invokevirtual charAt : (I)C
    //   3284: if_icmple -> 3629
    //   3287: sipush #28653
    //   3290: sipush #18245
    //   3293: invokestatic a : (II)Ljava/lang/String;
    //   3296: iconst_1
    //   3297: ldc burp/Zz5l
    //   3299: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3302: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3305: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3308: astore #4
    //   3310: aload #4
    //   3312: arraylength
    //   3313: istore #5
    //   3315: iconst_0
    //   3316: istore #6
    //   3318: iload #6
    //   3320: iload #5
    //   3322: if_icmpge -> 3460
    //   3325: aload #4
    //   3327: iload #6
    //   3329: aaload
    //   3330: astore #7
    //   3332: aload #7
    //   3334: invokevirtual getModifiers : ()I
    //   3337: invokestatic isStatic : (I)Z
    //   3340: ifne -> 3350
    //   3343: goto -> 3453
    //   3346: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3349: athrow
    //   3350: aload #7
    //   3352: invokevirtual getType : ()Ljava/lang/Class;
    //   3355: astore #8
    //   3357: aload #8
    //   3359: ifnull -> 3440
    //   3362: aload #8
    //   3364: invokevirtual isPrimitive : ()Z
    //   3367: ifne -> 3440
    //   3370: goto -> 3377
    //   3373: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3376: athrow
    //   3377: aload #8
    //   3379: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3382: ifnull -> 3440
    //   3385: goto -> 3392
    //   3388: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3391: athrow
    //   3392: aload #8
    //   3394: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3397: invokevirtual getName : ()Ljava/lang/String;
    //   3400: ifnull -> 3440
    //   3403: goto -> 3410
    //   3406: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3409: athrow
    //   3410: aload #8
    //   3412: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3415: invokevirtual getName : ()Ljava/lang/String;
    //   3418: sipush #28646
    //   3421: sipush #-3522
    //   3424: invokestatic a : (II)Ljava/lang/String;
    //   3427: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3430: ifne -> 3440
    //   3433: goto -> 3440
    //   3436: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3439: athrow
    //   3440: aload #7
    //   3442: iconst_1
    //   3443: invokevirtual setAccessible : (Z)V
    //   3446: aload #7
    //   3448: aconst_null
    //   3449: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3452: pop
    //   3453: iinc #6, 1
    //   3456: iload_2
    //   3457: ifeq -> 3318
    //   3460: sipush #28662
    //   3463: sipush #14627
    //   3466: invokestatic a : (II)Ljava/lang/String;
    //   3469: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3472: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3475: astore #4
    //   3477: aload #4
    //   3479: arraylength
    //   3480: istore #5
    //   3482: iconst_0
    //   3483: istore #6
    //   3485: iload #6
    //   3487: iload #5
    //   3489: if_icmpge -> 3625
    //   3492: aload #4
    //   3494: iload #6
    //   3496: aaload
    //   3497: astore #7
    //   3499: aload #7
    //   3501: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3504: pop
    //   3505: aload #7
    //   3507: invokevirtual getModifiers : ()I
    //   3510: invokestatic isStatic : (I)Z
    //   3513: ifeq -> 3611
    //   3516: aload #7
    //   3518: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3521: arraylength
    //   3522: iconst_2
    //   3523: if_icmpne -> 3611
    //   3526: goto -> 3533
    //   3529: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3532: athrow
    //   3533: aload #7
    //   3535: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3538: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3541: if_acmpne -> 3611
    //   3544: goto -> 3551
    //   3547: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3550: athrow
    //   3551: aload #7
    //   3553: iconst_1
    //   3554: invokevirtual setAccessible : (Z)V
    //   3557: aload #7
    //   3559: aconst_null
    //   3560: iconst_2
    //   3561: anewarray java/lang/Object
    //   3564: dup
    //   3565: iconst_0
    //   3566: aload_0
    //   3567: aastore
    //   3568: dup
    //   3569: iconst_1
    //   3570: aload_1
    //   3571: ifnonnull -> 3589
    //   3574: goto -> 3581
    //   3577: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3580: athrow
    //   3581: aload_1
    //   3582: goto -> 3596
    //   3585: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3588: athrow
    //   3589: aload_1
    //   3590: checkcast [B
    //   3593: invokevirtual clone : ()Ljava/lang/Object;
    //   3596: aastore
    //   3597: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3600: checkcast java/lang/Boolean
    //   3603: invokevirtual booleanValue : ()Z
    //   3606: istore_3
    //   3607: iload_2
    //   3608: ifeq -> 3625
    //   3611: iinc #6, 1
    //   3614: iload_2
    //   3615: ifeq -> 3485
    //   3618: goto -> 3625
    //   3621: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3624: athrow
    //   3625: iload_2
    //   3626: ifeq -> 3967
    //   3629: sipush #28654
    //   3632: sipush #-10874
    //   3635: invokestatic a : (II)Ljava/lang/String;
    //   3638: iconst_1
    //   3639: ldc burp/Zsin
    //   3641: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3644: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3647: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3650: astore #4
    //   3652: aload #4
    //   3654: arraylength
    //   3655: istore #5
    //   3657: iconst_0
    //   3658: istore #6
    //   3660: iload #6
    //   3662: iload #5
    //   3664: if_icmpge -> 3802
    //   3667: aload #4
    //   3669: iload #6
    //   3671: aaload
    //   3672: astore #7
    //   3674: aload #7
    //   3676: invokevirtual getModifiers : ()I
    //   3679: invokestatic isStatic : (I)Z
    //   3682: ifne -> 3692
    //   3685: goto -> 3795
    //   3688: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3691: athrow
    //   3692: aload #7
    //   3694: invokevirtual getType : ()Ljava/lang/Class;
    //   3697: astore #8
    //   3699: aload #8
    //   3701: ifnull -> 3782
    //   3704: aload #8
    //   3706: invokevirtual isPrimitive : ()Z
    //   3709: ifne -> 3782
    //   3712: goto -> 3719
    //   3715: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3718: athrow
    //   3719: aload #8
    //   3721: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3724: ifnull -> 3782
    //   3727: goto -> 3734
    //   3730: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3733: athrow
    //   3734: aload #8
    //   3736: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3739: invokevirtual getName : ()Ljava/lang/String;
    //   3742: ifnull -> 3782
    //   3745: goto -> 3752
    //   3748: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3751: athrow
    //   3752: aload #8
    //   3754: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3757: invokevirtual getName : ()Ljava/lang/String;
    //   3760: sipush #28646
    //   3763: sipush #-3522
    //   3766: invokestatic a : (II)Ljava/lang/String;
    //   3769: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3772: ifne -> 3782
    //   3775: goto -> 3782
    //   3778: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3781: athrow
    //   3782: aload #7
    //   3784: iconst_1
    //   3785: invokevirtual setAccessible : (Z)V
    //   3788: aload #7
    //   3790: aconst_null
    //   3791: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3794: pop
    //   3795: iinc #6, 1
    //   3798: iload_2
    //   3799: ifeq -> 3660
    //   3802: sipush #28663
    //   3805: sipush #-13781
    //   3808: invokestatic a : (II)Ljava/lang/String;
    //   3811: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3814: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3817: astore #4
    //   3819: aload #4
    //   3821: arraylength
    //   3822: istore #5
    //   3824: iconst_0
    //   3825: istore #6
    //   3827: iload #6
    //   3829: iload #5
    //   3831: if_icmpge -> 3967
    //   3834: aload #4
    //   3836: iload #6
    //   3838: aaload
    //   3839: astore #7
    //   3841: aload #7
    //   3843: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3846: pop
    //   3847: aload #7
    //   3849: invokevirtual getModifiers : ()I
    //   3852: invokestatic isStatic : (I)Z
    //   3855: ifeq -> 3953
    //   3858: aload #7
    //   3860: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3863: arraylength
    //   3864: iconst_2
    //   3865: if_icmpne -> 3953
    //   3868: goto -> 3875
    //   3871: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3874: athrow
    //   3875: aload #7
    //   3877: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3880: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3883: if_acmpne -> 3953
    //   3886: goto -> 3893
    //   3889: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3892: athrow
    //   3893: aload #7
    //   3895: iconst_1
    //   3896: invokevirtual setAccessible : (Z)V
    //   3899: aload #7
    //   3901: aconst_null
    //   3902: iconst_2
    //   3903: anewarray java/lang/Object
    //   3906: dup
    //   3907: iconst_0
    //   3908: aload_0
    //   3909: aastore
    //   3910: dup
    //   3911: iconst_1
    //   3912: aload_1
    //   3913: ifnonnull -> 3931
    //   3916: goto -> 3923
    //   3919: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3922: athrow
    //   3923: aload_1
    //   3924: goto -> 3938
    //   3927: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3930: athrow
    //   3931: aload_1
    //   3932: checkcast [B
    //   3935: invokevirtual clone : ()Ljava/lang/Object;
    //   3938: aastore
    //   3939: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3942: checkcast java/lang/Boolean
    //   3945: invokevirtual booleanValue : ()Z
    //   3948: istore_3
    //   3949: iload_2
    //   3950: ifeq -> 3967
    //   3953: iinc #6, 1
    //   3956: iload_2
    //   3957: ifeq -> 3827
    //   3960: goto -> 3967
    //   3963: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3966: athrow
    //   3967: iload_3
    //   3968: ireturn
    //   3969: astore_3
    //   3970: new java/lang/Exception
    //   3973: dup
    //   3974: aload_3
    //   3975: invokevirtual getMessage : ()Ljava/lang/String;
    //   3978: invokespecial <init> : (Ljava/lang/String;)V
    //   3981: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1779	3969	java/lang/Throwable
    //   342	366	369	java/lang/Throwable
    //   440	477	477	java/lang/Throwable
    //   481	502	502	java/lang/Throwable
    //   506	536	536	java/lang/Throwable
    //   761	775	775	java/lang/Throwable
    //   786	799	802	java/lang/Throwable
    //   791	814	817	java/lang/Throwable
    //   806	832	835	java/lang/Throwable
    //   821	862	865	java/lang/Throwable
    //   925	952	955	java/lang/Throwable
    //   942	973	976	java/lang/Throwable
    //   959	1003	1006	java/lang/Throwable
    //   980	1014	1014	java/lang/Throwable
    //   1025	1041	1044	java/lang/Throwable
    //   1140	1154	1154	java/lang/Throwable
    //   1165	1178	1181	java/lang/Throwable
    //   1170	1193	1196	java/lang/Throwable
    //   1185	1211	1214	java/lang/Throwable
    //   1200	1241	1244	java/lang/Throwable
    //   1307	1334	1337	java/lang/Throwable
    //   1324	1352	1355	java/lang/Throwable
    //   1341	1382	1385	java/lang/Throwable
    //   1359	1393	1393	java/lang/Throwable
    //   1415	1426	1429	java/lang/Throwable
    //   1481	1495	1495	java/lang/Throwable
    //   1506	1519	1522	java/lang/Throwable
    //   1511	1534	1537	java/lang/Throwable
    //   1526	1552	1555	java/lang/Throwable
    //   1541	1582	1585	java/lang/Throwable
    //   1648	1675	1678	java/lang/Throwable
    //   1665	1693	1696	java/lang/Throwable
    //   1682	1723	1726	java/lang/Throwable
    //   1700	1734	1734	java/lang/Throwable
    //   1756	1767	1770	java/lang/Throwable
    //   1780	2510	3969	java/lang/Throwable
    //   1870	1884	1884	java/lang/Throwable
    //   1895	1908	1911	java/lang/Throwable
    //   1900	1923	1926	java/lang/Throwable
    //   1915	1941	1944	java/lang/Throwable
    //   1930	1971	1974	java/lang/Throwable
    //   2037	2064	2067	java/lang/Throwable
    //   2054	2082	2085	java/lang/Throwable
    //   2071	2112	2115	java/lang/Throwable
    //   2089	2123	2123	java/lang/Throwable
    //   2145	2156	2159	java/lang/Throwable
    //   2212	2226	2226	java/lang/Throwable
    //   2237	2250	2253	java/lang/Throwable
    //   2242	2265	2268	java/lang/Throwable
    //   2257	2283	2286	java/lang/Throwable
    //   2272	2313	2316	java/lang/Throwable
    //   2379	2406	2409	java/lang/Throwable
    //   2396	2424	2427	java/lang/Throwable
    //   2413	2454	2457	java/lang/Throwable
    //   2431	2465	2465	java/lang/Throwable
    //   2487	2498	2501	java/lang/Throwable
    //   2511	3241	3969	java/lang/Throwable
    //   2601	2615	2615	java/lang/Throwable
    //   2626	2639	2642	java/lang/Throwable
    //   2631	2654	2657	java/lang/Throwable
    //   2646	2672	2675	java/lang/Throwable
    //   2661	2702	2705	java/lang/Throwable
    //   2768	2795	2798	java/lang/Throwable
    //   2785	2813	2816	java/lang/Throwable
    //   2802	2843	2846	java/lang/Throwable
    //   2820	2854	2854	java/lang/Throwable
    //   2876	2887	2890	java/lang/Throwable
    //   2943	2957	2957	java/lang/Throwable
    //   2968	2981	2984	java/lang/Throwable
    //   2973	2996	2999	java/lang/Throwable
    //   2988	3014	3017	java/lang/Throwable
    //   3003	3044	3047	java/lang/Throwable
    //   3110	3137	3140	java/lang/Throwable
    //   3127	3155	3158	java/lang/Throwable
    //   3144	3185	3188	java/lang/Throwable
    //   3162	3196	3196	java/lang/Throwable
    //   3218	3229	3232	java/lang/Throwable
    //   3242	3968	3969	java/lang/Throwable
    //   3332	3346	3346	java/lang/Throwable
    //   3357	3370	3373	java/lang/Throwable
    //   3362	3385	3388	java/lang/Throwable
    //   3377	3403	3406	java/lang/Throwable
    //   3392	3433	3436	java/lang/Throwable
    //   3499	3526	3529	java/lang/Throwable
    //   3516	3544	3547	java/lang/Throwable
    //   3533	3574	3577	java/lang/Throwable
    //   3551	3585	3585	java/lang/Throwable
    //   3607	3618	3621	java/lang/Throwable
    //   3674	3688	3688	java/lang/Throwable
    //   3699	3712	3715	java/lang/Throwable
    //   3704	3727	3730	java/lang/Throwable
    //   3719	3745	3748	java/lang/Throwable
    //   3734	3775	3778	java/lang/Throwable
    //   3841	3868	3871	java/lang/Throwable
    //   3858	3886	3889	java/lang/Throwable
    //   3875	3916	3919	java/lang/Throwable
    //   3893	3927	3927	java/lang/Throwable
    //   3949	3960	3963	java/lang/Throwable
  }
  
  static void ZA(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZW(Object paramObject) {
    Zlb6.ZP = a(28659, -17133);
    Zlb6.Zz = new BigInteger(a(28668, 27066));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zzbr.Zp.charAt(Math.abs(((BigInteger)Zbp_.Zi).intValue() % 32)) > Zzs9.Zg.charAt(Math.abs(((BigInteger)Zb20.Zq).intValue() % 32))) {
          try {
            Zztz.ZJ(Class.forName(a(28645, 14922)));
            if (!bool)
              Zkfz.ZP(Class.forName(a(28661, -7831))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zkfz.ZP(Class.forName(a(28661, -7831)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¬â-kçÔÂÍIb×N14+RæE\\ríb~F3ç¶m.buÂo0ÑDæ9ig[Ó6JJS»-°E{èÅ´\\n ybdlí¹oØÀ¶ãô/ÒÝ*sYLóù¹/qÚ\\tuÍk¦üoày\\tù0úÎ\³\\t3½£¨å®?ÑE\\tíêxBóPz¨Õ3y\\tÒ7ùbØÆL\\tí°x\\t@ú\\tjÏægâ\\t\\t>|´\\t¢l£éâ)J\\t«¥Ro. U»(àG)/,´· fíµûÏ7ÑNûz%\\b=A\\tWß+ÓÎ~ÒfsÜ +`ºÂ£Z,&ÅKþñßÀ«´Ï!Ìøïz&âçi¹>\\tÇù= 6¿PÈB\\t=¸q¬¸Â\\\têtÆ%Î\\t=BbWÝQ(9â\\tUý;äf\\tÜú^@Z³Îoú\\tÊÀ[Ë<\\tO~,Ð¡-Ã\\toÈ({\\bzÁ\\b´ôfZtt'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #77
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #127
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
    //   68: ldc 'Jzû(2oàG\\t¹\\fhç@û{'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #34
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
    //   129: putstatic burp/Zb14.a : [Ljava/lang/String;
    //   132: bipush #29
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zb14.b : [Ljava/lang/String;
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
    //   212: bipush #9
    //   214: goto -> 244
    //   217: bipush #51
    //   219: goto -> 244
    //   222: bipush #40
    //   224: goto -> 244
    //   227: bipush #66
    //   229: goto -> 244
    //   232: bipush #22
    //   234: goto -> 244
    //   237: bipush #71
    //   239: goto -> 244
    //   242: bipush #72
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
    //   300: sipush #28669
    //   303: sipush #7150
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zb14.Ze : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #75
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #101
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #-37
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #-119
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-93
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #-60
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #20
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #107
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #-15
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #48
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #108
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #-85
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #76
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #-41
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #-27
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #-109
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #-118
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #-125
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #66
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #-4
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #7
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #-58
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #-117
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #-12
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: bipush #-39
    //   464: bastore
    //   465: dup
    //   466: bipush #25
    //   468: bipush #81
    //   470: bastore
    //   471: dup
    //   472: bipush #26
    //   474: bipush #85
    //   476: bastore
    //   477: dup
    //   478: bipush #27
    //   480: bipush #-16
    //   482: bastore
    //   483: dup
    //   484: bipush #28
    //   486: bipush #25
    //   488: bastore
    //   489: dup
    //   490: bipush #29
    //   492: bipush #-102
    //   494: bastore
    //   495: dup
    //   496: bipush #30
    //   498: bipush #-99
    //   500: bastore
    //   501: dup
    //   502: bipush #31
    //   504: bipush #-41
    //   506: bastore
    //   507: invokespecial <init> : (I[B)V
    //   510: putstatic burp/Zb14.ZT : Ljava/lang/Object;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6FFC) & 0xFFFF;
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
      char c = '­';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb14.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */