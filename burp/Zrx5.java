package burp;

import java.math.BigInteger;

class Zrx5 extends ClassLoader {
  static Object ZE;
  
  static String ZD;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZI(Object paramObject) {
    Zenq.ZG = a(-8194, -13921);
    Zenq.Zd = new BigInteger(a(-8212, 30484));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Ztsc.ZL.charAt(Math.abs(((BigInteger)Zbzj.Zz).intValue() % 32)) > Zewq.ZV.charAt(Math.abs(((BigInteger)Zbzj.Zz).intValue() % 32))) {
          try {
            Zms1.ZN(Class.forName(a(-8218, 3118)));
            if (!bool)
              Zrs0.ZS(Class.forName(a(-8219, 10841))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zrs0.ZS(Class.forName(a(-8219, 10841)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zt(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: sipush #-8210
    //   7: sipush #30890
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokestatic ZH : (Ljava/lang/Object;)V
    //   19: getstatic burp/Zrnw.ZN : Ljava/lang/Object;
    //   22: checkcast java/math/BigInteger
    //   25: invokevirtual toByteArray : ()[B
    //   28: astore_3
    //   29: new java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial <init> : ()V
    //   36: astore #5
    //   38: aload #5
    //   40: sipush #-8221
    //   43: sipush #-29456
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: aload_3
    //   54: astore #6
    //   56: aload #6
    //   58: arraylength
    //   59: istore #7
    //   61: iconst_0
    //   62: istore #8
    //   64: iload #8
    //   66: iload #7
    //   68: if_icmpge -> 94
    //   71: aload #6
    //   73: iload #8
    //   75: baload
    //   76: istore #9
    //   78: aload #5
    //   80: iload #9
    //   82: i2c
    //   83: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: iinc #8, 1
    //   90: iload_2
    //   91: ifeq -> 64
    //   94: aload #5
    //   96: sipush #-8207
    //   99: sipush #9538
    //   102: invokestatic a : (II)Ljava/lang/String;
    //   105: ldc ''
    //   107: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   110: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   113: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: pop
    //   117: aload #5
    //   119: sipush #-8200
    //   122: sipush #5460
    //   125: invokestatic a : (II)Ljava/lang/String;
    //   128: ldc ''
    //   130: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   133: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   136: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: pop
    //   140: aload #5
    //   142: invokevirtual toString : ()Ljava/lang/String;
    //   145: invokevirtual getBytes : ()[B
    //   148: astore #4
    //   150: aload #4
    //   152: astore_3
    //   153: aload_3
    //   154: arraylength
    //   155: bipush #8
    //   157: iadd
    //   158: bipush #6
    //   160: ishr
    //   161: iconst_1
    //   162: iadd
    //   163: bipush #16
    //   165: imul
    //   166: newarray int
    //   168: astore #5
    //   170: iconst_0
    //   171: istore #6
    //   173: iload #6
    //   175: aload_3
    //   176: arraylength
    //   177: if_icmpge -> 220
    //   180: aload_3
    //   181: iload #6
    //   183: baload
    //   184: sipush #255
    //   187: iand
    //   188: istore #7
    //   190: aload #5
    //   192: iload #6
    //   194: iconst_2
    //   195: ishr
    //   196: dup2
    //   197: iaload
    //   198: iload #7
    //   200: bipush #24
    //   202: iload #6
    //   204: iconst_4
    //   205: irem
    //   206: bipush #8
    //   208: imul
    //   209: isub
    //   210: ishl
    //   211: ior
    //   212: iastore
    //   213: iinc #6, 1
    //   216: iload_2
    //   217: ifeq -> 173
    //   220: aload #5
    //   222: iload #6
    //   224: iconst_2
    //   225: ishr
    //   226: dup2
    //   227: iaload
    //   228: sipush #128
    //   231: bipush #24
    //   233: iload #6
    //   235: iconst_4
    //   236: irem
    //   237: bipush #8
    //   239: imul
    //   240: isub
    //   241: ishl
    //   242: ior
    //   243: iastore
    //   244: aload #5
    //   246: aload #5
    //   248: arraylength
    //   249: iconst_1
    //   250: isub
    //   251: aload_3
    //   252: arraylength
    //   253: bipush #8
    //   255: imul
    //   256: iastore
    //   257: bipush #80
    //   259: newarray int
    //   261: astore #7
    //   263: ldc 1732584193
    //   265: istore #8
    //   267: ldc -271733879
    //   269: istore #9
    //   271: ldc -1732584194
    //   273: istore #10
    //   275: ldc 271733878
    //   277: istore #11
    //   279: ldc -1009589776
    //   281: istore #12
    //   283: iconst_0
    //   284: istore #6
    //   286: iload #6
    //   288: aload #5
    //   290: arraylength
    //   291: if_icmpge -> 613
    //   294: iload #8
    //   296: istore #13
    //   298: iload #9
    //   300: istore #14
    //   302: iload #10
    //   304: istore #15
    //   306: iload #11
    //   308: istore #16
    //   310: iload #12
    //   312: istore #17
    //   314: iconst_0
    //   315: istore #18
    //   317: iload #18
    //   319: bipush #80
    //   321: if_icmpge -> 571
    //   324: iload #18
    //   326: bipush #16
    //   328: if_icmpge -> 355
    //   331: aload #7
    //   333: iload #18
    //   335: aload #5
    //   337: iload #6
    //   339: iload #18
    //   341: iadd
    //   342: iaload
    //   343: iastore
    //   344: iload_2
    //   345: ifeq -> 410
    //   348: goto -> 355
    //   351: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   354: athrow
    //   355: aload #7
    //   357: iload #18
    //   359: iconst_3
    //   360: isub
    //   361: iaload
    //   362: aload #7
    //   364: iload #18
    //   366: bipush #8
    //   368: isub
    //   369: iaload
    //   370: ixor
    //   371: aload #7
    //   373: iload #18
    //   375: bipush #14
    //   377: isub
    //   378: iaload
    //   379: ixor
    //   380: aload #7
    //   382: iload #18
    //   384: bipush #16
    //   386: isub
    //   387: iaload
    //   388: ixor
    //   389: istore #19
    //   391: iload #19
    //   393: iconst_1
    //   394: ishl
    //   395: iload #19
    //   397: bipush #31
    //   399: iushr
    //   400: ior
    //   401: istore #20
    //   403: aload #7
    //   405: iload #18
    //   407: iload #20
    //   409: iastore
    //   410: iload #8
    //   412: iconst_5
    //   413: ishl
    //   414: iload #8
    //   416: bipush #27
    //   418: iushr
    //   419: ior
    //   420: istore #19
    //   422: iload #19
    //   424: iload #12
    //   426: iadd
    //   427: aload #7
    //   429: iload #18
    //   431: iaload
    //   432: iadd
    //   433: iload #18
    //   435: bipush #20
    //   437: if_icmpge -> 463
    //   440: ldc 1518500249
    //   442: iload #9
    //   444: iload #10
    //   446: iand
    //   447: iload #9
    //   449: iconst_m1
    //   450: ixor
    //   451: iload #11
    //   453: iand
    //   454: ior
    //   455: iadd
    //   456: goto -> 533
    //   459: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   462: athrow
    //   463: iload #18
    //   465: bipush #40
    //   467: if_icmpge -> 488
    //   470: ldc 1859775393
    //   472: iload #9
    //   474: iload #10
    //   476: ixor
    //   477: iload #11
    //   479: ixor
    //   480: iadd
    //   481: goto -> 533
    //   484: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   487: athrow
    //   488: iload #18
    //   490: bipush #60
    //   492: if_icmpge -> 522
    //   495: ldc -1894007588
    //   497: iload #9
    //   499: iload #10
    //   501: iand
    //   502: iload #9
    //   504: iload #11
    //   506: iand
    //   507: ior
    //   508: iload #10
    //   510: iload #11
    //   512: iand
    //   513: ior
    //   514: iadd
    //   515: goto -> 533
    //   518: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   521: athrow
    //   522: ldc -899497514
    //   524: iload #9
    //   526: iload #10
    //   528: ixor
    //   529: iload #11
    //   531: ixor
    //   532: iadd
    //   533: iadd
    //   534: istore #20
    //   536: iload #11
    //   538: istore #12
    //   540: iload #10
    //   542: istore #11
    //   544: iload #9
    //   546: bipush #30
    //   548: ishl
    //   549: iload #9
    //   551: iconst_2
    //   552: iushr
    //   553: ior
    //   554: istore #10
    //   556: iload #8
    //   558: istore #9
    //   560: iload #20
    //   562: istore #8
    //   564: iinc #18, 1
    //   567: iload_2
    //   568: ifeq -> 317
    //   571: iload #8
    //   573: iload #13
    //   575: iadd
    //   576: istore #8
    //   578: iload #9
    //   580: iload #14
    //   582: iadd
    //   583: istore #9
    //   585: iload #10
    //   587: iload #15
    //   589: iadd
    //   590: istore #10
    //   592: iload #11
    //   594: iload #16
    //   596: iadd
    //   597: istore #11
    //   599: iload #12
    //   601: iload #17
    //   603: iadd
    //   604: istore #12
    //   606: iinc #6, 16
    //   609: iload_2
    //   610: ifeq -> 286
    //   613: iconst_5
    //   614: newarray int
    //   616: dup
    //   617: iconst_0
    //   618: iload #8
    //   620: iastore
    //   621: dup
    //   622: iconst_1
    //   623: iload #9
    //   625: iastore
    //   626: dup
    //   627: iconst_2
    //   628: iload #10
    //   630: iastore
    //   631: dup
    //   632: iconst_3
    //   633: iload #11
    //   635: iastore
    //   636: dup
    //   637: iconst_4
    //   638: iload #12
    //   640: iastore
    //   641: astore #13
    //   643: bipush #20
    //   645: newarray byte
    //   647: astore #14
    //   649: iconst_0
    //   650: istore #15
    //   652: iload #15
    //   654: bipush #20
    //   656: if_icmpge -> 697
    //   659: aload #13
    //   661: iload #15
    //   663: iconst_4
    //   664: idiv
    //   665: iaload
    //   666: istore #16
    //   668: iconst_3
    //   669: iload #15
    //   671: iconst_4
    //   672: irem
    //   673: isub
    //   674: bipush #8
    //   676: imul
    //   677: istore #17
    //   679: aload #14
    //   681: iload #15
    //   683: iload #16
    //   685: iload #17
    //   687: iushr
    //   688: i2b
    //   689: bastore
    //   690: iinc #15, 1
    //   693: iload_2
    //   694: ifeq -> 652
    //   697: aload #14
    //   699: astore #4
    //   701: sipush #-8211
    //   704: getstatic burp/Zs33.ZT : Ljava/lang/Object;
    //   707: checkcast java/math/BigInteger
    //   710: getstatic burp/Ztc2.ZM : Ljava/lang/Object;
    //   713: checkcast java/math/BigInteger
    //   716: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   719: putstatic burp/Zl2t.ZS : Ljava/lang/Object;
    //   722: sipush #-19430
    //   725: invokestatic a : (II)Ljava/lang/String;
    //   728: iconst_1
    //   729: ldc burp/Zxf8
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
    //   847: sipush #-8206
    //   850: sipush #18946
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
    //   889: sipush #-8204
    //   892: sipush #-11941
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
    //   916: if_icmpge -> 1027
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
    //   939: ifeq -> 1013
    //   942: aload #6
    //   944: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   947: arraylength
    //   948: iconst_2
    //   949: if_icmpne -> 1013
    //   952: goto -> 959
    //   955: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   958: athrow
    //   959: aload #6
    //   961: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   964: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   967: if_acmpne -> 1013
    //   970: goto -> 977
    //   973: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   976: athrow
    //   977: aload #6
    //   979: iconst_1
    //   980: invokevirtual setAccessible : (Z)V
    //   983: aload #6
    //   985: aconst_null
    //   986: iconst_2
    //   987: anewarray java/lang/Object
    //   990: dup
    //   991: iconst_0
    //   992: aload_0
    //   993: aastore
    //   994: dup
    //   995: iconst_1
    //   996: aload_1
    //   997: aastore
    //   998: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1001: pop
    //   1002: iload_2
    //   1003: ifeq -> 1027
    //   1006: goto -> 1013
    //   1009: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1012: athrow
    //   1013: iinc #5, 1
    //   1016: iload_2
    //   1017: ifeq -> 912
    //   1020: goto -> 1027
    //   1023: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1026: athrow
    //   1027: sipush #-8197
    //   1030: sipush #9402
    //   1033: invokestatic a : (II)Ljava/lang/String;
    //   1036: iconst_1
    //   1037: ldc burp/Zxn5
    //   1039: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1042: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1045: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1048: astore_3
    //   1049: aload_3
    //   1050: arraylength
    //   1051: istore #4
    //   1053: iconst_0
    //   1054: istore #5
    //   1056: iload #5
    //   1058: iload #4
    //   1060: if_icmpge -> 1197
    //   1063: aload_3
    //   1064: iload #5
    //   1066: aaload
    //   1067: astore #6
    //   1069: aload #6
    //   1071: invokevirtual getModifiers : ()I
    //   1074: invokestatic isStatic : (I)Z
    //   1077: ifne -> 1087
    //   1080: goto -> 1190
    //   1083: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1086: athrow
    //   1087: aload #6
    //   1089: invokevirtual getType : ()Ljava/lang/Class;
    //   1092: astore #7
    //   1094: aload #7
    //   1096: ifnull -> 1177
    //   1099: aload #7
    //   1101: invokevirtual isPrimitive : ()Z
    //   1104: ifne -> 1177
    //   1107: goto -> 1114
    //   1110: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1113: athrow
    //   1114: aload #7
    //   1116: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1119: ifnull -> 1177
    //   1122: goto -> 1129
    //   1125: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1128: athrow
    //   1129: aload #7
    //   1131: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1134: invokevirtual getName : ()Ljava/lang/String;
    //   1137: ifnull -> 1177
    //   1140: goto -> 1147
    //   1143: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1146: athrow
    //   1147: aload #7
    //   1149: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1152: invokevirtual getName : ()Ljava/lang/String;
    //   1155: sipush #-8195
    //   1158: sipush #-10670
    //   1161: invokestatic a : (II)Ljava/lang/String;
    //   1164: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1167: ifne -> 1177
    //   1170: goto -> 1177
    //   1173: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1176: athrow
    //   1177: aload #6
    //   1179: iconst_1
    //   1180: invokevirtual setAccessible : (Z)V
    //   1183: aload #6
    //   1185: aconst_null
    //   1186: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1189: pop
    //   1190: iinc #5, 1
    //   1193: iload_2
    //   1194: ifeq -> 1056
    //   1197: sipush #-8213
    //   1200: sipush #12314
    //   1203: invokestatic a : (II)Ljava/lang/String;
    //   1206: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1209: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1212: astore_3
    //   1213: aload_3
    //   1214: arraylength
    //   1215: istore #4
    //   1217: iconst_0
    //   1218: istore #5
    //   1220: iload #5
    //   1222: iload #4
    //   1224: if_icmpge -> 1353
    //   1227: aload_3
    //   1228: iload #5
    //   1230: aaload
    //   1231: astore #6
    //   1233: aload #6
    //   1235: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1238: pop
    //   1239: aload #6
    //   1241: invokevirtual getModifiers : ()I
    //   1244: invokestatic isStatic : (I)Z
    //   1247: ifeq -> 1339
    //   1250: aload #6
    //   1252: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1255: arraylength
    //   1256: iconst_2
    //   1257: if_icmpne -> 1339
    //   1260: goto -> 1267
    //   1263: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1266: athrow
    //   1267: aload #6
    //   1269: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1272: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1275: if_acmpne -> 1339
    //   1278: goto -> 1285
    //   1281: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1284: athrow
    //   1285: aload #6
    //   1287: iconst_1
    //   1288: invokevirtual setAccessible : (Z)V
    //   1291: aload #6
    //   1293: aconst_null
    //   1294: iconst_2
    //   1295: anewarray java/lang/Object
    //   1298: dup
    //   1299: iconst_0
    //   1300: aload_0
    //   1301: aastore
    //   1302: dup
    //   1303: iconst_1
    //   1304: aload_1
    //   1305: ifnonnull -> 1323
    //   1308: goto -> 1315
    //   1311: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1314: athrow
    //   1315: aload_1
    //   1316: goto -> 1330
    //   1319: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1322: athrow
    //   1323: aload_1
    //   1324: checkcast [B
    //   1327: invokevirtual clone : ()Ljava/lang/Object;
    //   1330: aastore
    //   1331: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1334: pop
    //   1335: iload_2
    //   1336: ifeq -> 1353
    //   1339: iinc #5, 1
    //   1342: iload_2
    //   1343: ifeq -> 1220
    //   1346: goto -> 1353
    //   1349: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1352: athrow
    //   1353: sipush #-8223
    //   1356: sipush #13864
    //   1359: invokestatic a : (II)Ljava/lang/String;
    //   1362: iconst_1
    //   1363: ldc burp/Zlhk
    //   1365: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1368: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1371: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1374: astore_3
    //   1375: aload_3
    //   1376: arraylength
    //   1377: istore #4
    //   1379: iconst_0
    //   1380: istore #5
    //   1382: iload #5
    //   1384: iload #4
    //   1386: if_icmpge -> 1523
    //   1389: aload_3
    //   1390: iload #5
    //   1392: aaload
    //   1393: astore #6
    //   1395: aload #6
    //   1397: invokevirtual getModifiers : ()I
    //   1400: invokestatic isStatic : (I)Z
    //   1403: ifne -> 1413
    //   1406: goto -> 1516
    //   1409: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1412: athrow
    //   1413: aload #6
    //   1415: invokevirtual getType : ()Ljava/lang/Class;
    //   1418: astore #7
    //   1420: aload #7
    //   1422: ifnull -> 1503
    //   1425: aload #7
    //   1427: invokevirtual isPrimitive : ()Z
    //   1430: ifne -> 1503
    //   1433: goto -> 1440
    //   1436: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1439: athrow
    //   1440: aload #7
    //   1442: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1445: ifnull -> 1503
    //   1448: goto -> 1455
    //   1451: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1454: athrow
    //   1455: aload #7
    //   1457: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1460: invokevirtual getName : ()Ljava/lang/String;
    //   1463: ifnull -> 1503
    //   1466: goto -> 1473
    //   1469: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1472: athrow
    //   1473: aload #7
    //   1475: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1478: invokevirtual getName : ()Ljava/lang/String;
    //   1481: sipush #-8195
    //   1484: sipush #-10670
    //   1487: invokestatic a : (II)Ljava/lang/String;
    //   1490: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1493: ifne -> 1503
    //   1496: goto -> 1503
    //   1499: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1502: athrow
    //   1503: aload #6
    //   1505: iconst_1
    //   1506: invokevirtual setAccessible : (Z)V
    //   1509: aload #6
    //   1511: aconst_null
    //   1512: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1515: pop
    //   1516: iinc #5, 1
    //   1519: iload_2
    //   1520: ifeq -> 1382
    //   1523: sipush #-8209
    //   1526: sipush #-28834
    //   1529: invokestatic a : (II)Ljava/lang/String;
    //   1532: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1535: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1538: astore_3
    //   1539: aload_3
    //   1540: arraylength
    //   1541: istore #4
    //   1543: iconst_0
    //   1544: istore #5
    //   1546: iload #5
    //   1548: iload #4
    //   1550: if_icmpge -> 1682
    //   1553: aload_3
    //   1554: iload #5
    //   1556: aaload
    //   1557: astore #6
    //   1559: aload #6
    //   1561: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1564: pop
    //   1565: aload #6
    //   1567: invokevirtual getModifiers : ()I
    //   1570: invokestatic isStatic : (I)Z
    //   1573: ifeq -> 1668
    //   1576: aload #6
    //   1578: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1581: arraylength
    //   1582: iconst_2
    //   1583: if_icmpne -> 1668
    //   1586: goto -> 1593
    //   1589: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1592: athrow
    //   1593: aload #6
    //   1595: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1598: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1601: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1604: ifeq -> 1668
    //   1607: goto -> 1614
    //   1610: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1613: athrow
    //   1614: aload #6
    //   1616: iconst_1
    //   1617: invokevirtual setAccessible : (Z)V
    //   1620: aload #6
    //   1622: aconst_null
    //   1623: iconst_2
    //   1624: anewarray java/lang/Object
    //   1627: dup
    //   1628: iconst_0
    //   1629: aload_0
    //   1630: aastore
    //   1631: dup
    //   1632: iconst_1
    //   1633: aload_1
    //   1634: ifnonnull -> 1652
    //   1637: goto -> 1644
    //   1640: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1643: athrow
    //   1644: aload_1
    //   1645: goto -> 1659
    //   1648: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1651: athrow
    //   1652: aload_1
    //   1653: checkcast [B
    //   1656: invokevirtual clone : ()Ljava/lang/Object;
    //   1659: aastore
    //   1660: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1663: pop
    //   1664: iload_2
    //   1665: ifeq -> 1682
    //   1668: iinc #5, 1
    //   1671: iload_2
    //   1672: ifeq -> 1546
    //   1675: goto -> 1682
    //   1678: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1681: athrow
    //   1682: getstatic burp/Zt5a.Zs : Ljava/lang/Object;
    //   1685: checkcast java/math/BigInteger
    //   1688: invokevirtual toByteArray : ()[B
    //   1691: astore_3
    //   1692: aload_3
    //   1693: arraylength
    //   1694: bipush #8
    //   1696: iadd
    //   1697: bipush #6
    //   1699: ishr
    //   1700: iconst_1
    //   1701: iadd
    //   1702: bipush #16
    //   1704: imul
    //   1705: newarray int
    //   1707: astore #5
    //   1709: iconst_0
    //   1710: istore #6
    //   1712: iload #6
    //   1714: aload_3
    //   1715: arraylength
    //   1716: if_icmpge -> 1759
    //   1719: aload_3
    //   1720: iload #6
    //   1722: baload
    //   1723: sipush #255
    //   1726: iand
    //   1727: istore #7
    //   1729: aload #5
    //   1731: iload #6
    //   1733: iconst_2
    //   1734: ishr
    //   1735: dup2
    //   1736: iaload
    //   1737: iload #7
    //   1739: bipush #24
    //   1741: iload #6
    //   1743: iconst_4
    //   1744: irem
    //   1745: bipush #8
    //   1747: imul
    //   1748: isub
    //   1749: ishl
    //   1750: ior
    //   1751: iastore
    //   1752: iinc #6, 1
    //   1755: iload_2
    //   1756: ifeq -> 1712
    //   1759: aload #5
    //   1761: iload #6
    //   1763: iconst_2
    //   1764: ishr
    //   1765: dup2
    //   1766: iaload
    //   1767: sipush #128
    //   1770: bipush #24
    //   1772: iload #6
    //   1774: iconst_4
    //   1775: irem
    //   1776: bipush #8
    //   1778: imul
    //   1779: isub
    //   1780: ishl
    //   1781: ior
    //   1782: iastore
    //   1783: aload #5
    //   1785: aload #5
    //   1787: arraylength
    //   1788: iconst_1
    //   1789: isub
    //   1790: aload_3
    //   1791: arraylength
    //   1792: bipush #8
    //   1794: imul
    //   1795: iastore
    //   1796: bipush #80
    //   1798: newarray int
    //   1800: astore #7
    //   1802: ldc 1732584193
    //   1804: istore #8
    //   1806: ldc -271733879
    //   1808: istore #9
    //   1810: ldc -1732584194
    //   1812: istore #10
    //   1814: ldc 271733878
    //   1816: istore #11
    //   1818: ldc -1009589776
    //   1820: istore #12
    //   1822: iconst_0
    //   1823: istore #6
    //   1825: iload #6
    //   1827: aload #5
    //   1829: arraylength
    //   1830: if_icmpge -> 2152
    //   1833: iload #8
    //   1835: istore #13
    //   1837: iload #9
    //   1839: istore #14
    //   1841: iload #10
    //   1843: istore #15
    //   1845: iload #11
    //   1847: istore #16
    //   1849: iload #12
    //   1851: istore #17
    //   1853: iconst_0
    //   1854: istore #18
    //   1856: iload #18
    //   1858: bipush #80
    //   1860: if_icmpge -> 2110
    //   1863: iload #18
    //   1865: bipush #16
    //   1867: if_icmpge -> 1894
    //   1870: aload #7
    //   1872: iload #18
    //   1874: aload #5
    //   1876: iload #6
    //   1878: iload #18
    //   1880: iadd
    //   1881: iaload
    //   1882: iastore
    //   1883: iload_2
    //   1884: ifeq -> 1949
    //   1887: goto -> 1894
    //   1890: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1893: athrow
    //   1894: aload #7
    //   1896: iload #18
    //   1898: iconst_3
    //   1899: isub
    //   1900: iaload
    //   1901: aload #7
    //   1903: iload #18
    //   1905: bipush #8
    //   1907: isub
    //   1908: iaload
    //   1909: ixor
    //   1910: aload #7
    //   1912: iload #18
    //   1914: bipush #14
    //   1916: isub
    //   1917: iaload
    //   1918: ixor
    //   1919: aload #7
    //   1921: iload #18
    //   1923: bipush #16
    //   1925: isub
    //   1926: iaload
    //   1927: ixor
    //   1928: istore #19
    //   1930: iload #19
    //   1932: iconst_1
    //   1933: ishl
    //   1934: iload #19
    //   1936: bipush #31
    //   1938: iushr
    //   1939: ior
    //   1940: istore #20
    //   1942: aload #7
    //   1944: iload #18
    //   1946: iload #20
    //   1948: iastore
    //   1949: iload #8
    //   1951: iconst_5
    //   1952: ishl
    //   1953: iload #8
    //   1955: bipush #27
    //   1957: iushr
    //   1958: ior
    //   1959: istore #19
    //   1961: iload #19
    //   1963: iload #12
    //   1965: iadd
    //   1966: aload #7
    //   1968: iload #18
    //   1970: iaload
    //   1971: iadd
    //   1972: iload #18
    //   1974: bipush #20
    //   1976: if_icmpge -> 2002
    //   1979: ldc 1518500249
    //   1981: iload #9
    //   1983: iload #10
    //   1985: iand
    //   1986: iload #9
    //   1988: iconst_m1
    //   1989: ixor
    //   1990: iload #11
    //   1992: iand
    //   1993: ior
    //   1994: iadd
    //   1995: goto -> 2072
    //   1998: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2001: athrow
    //   2002: iload #18
    //   2004: bipush #40
    //   2006: if_icmpge -> 2027
    //   2009: ldc 1859775393
    //   2011: iload #9
    //   2013: iload #10
    //   2015: ixor
    //   2016: iload #11
    //   2018: ixor
    //   2019: iadd
    //   2020: goto -> 2072
    //   2023: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2026: athrow
    //   2027: iload #18
    //   2029: bipush #60
    //   2031: if_icmpge -> 2061
    //   2034: ldc -1894007588
    //   2036: iload #9
    //   2038: iload #10
    //   2040: iand
    //   2041: iload #9
    //   2043: iload #11
    //   2045: iand
    //   2046: ior
    //   2047: iload #10
    //   2049: iload #11
    //   2051: iand
    //   2052: ior
    //   2053: iadd
    //   2054: goto -> 2072
    //   2057: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2060: athrow
    //   2061: ldc -899497514
    //   2063: iload #9
    //   2065: iload #10
    //   2067: ixor
    //   2068: iload #11
    //   2070: ixor
    //   2071: iadd
    //   2072: iadd
    //   2073: istore #20
    //   2075: iload #11
    //   2077: istore #12
    //   2079: iload #10
    //   2081: istore #11
    //   2083: iload #9
    //   2085: bipush #30
    //   2087: ishl
    //   2088: iload #9
    //   2090: iconst_2
    //   2091: iushr
    //   2092: ior
    //   2093: istore #10
    //   2095: iload #8
    //   2097: istore #9
    //   2099: iload #20
    //   2101: istore #8
    //   2103: iinc #18, 1
    //   2106: iload_2
    //   2107: ifeq -> 1856
    //   2110: iload #8
    //   2112: iload #13
    //   2114: iadd
    //   2115: istore #8
    //   2117: iload #9
    //   2119: iload #14
    //   2121: iadd
    //   2122: istore #9
    //   2124: iload #10
    //   2126: iload #15
    //   2128: iadd
    //   2129: istore #10
    //   2131: iload #11
    //   2133: iload #16
    //   2135: iadd
    //   2136: istore #11
    //   2138: iload #12
    //   2140: iload #17
    //   2142: iadd
    //   2143: istore #12
    //   2145: iinc #6, 16
    //   2148: iload_2
    //   2149: ifeq -> 1825
    //   2152: iconst_5
    //   2153: newarray int
    //   2155: dup
    //   2156: iconst_0
    //   2157: iload #8
    //   2159: iastore
    //   2160: dup
    //   2161: iconst_1
    //   2162: iload #9
    //   2164: iastore
    //   2165: dup
    //   2166: iconst_2
    //   2167: iload #10
    //   2169: iastore
    //   2170: dup
    //   2171: iconst_3
    //   2172: iload #11
    //   2174: iastore
    //   2175: dup
    //   2176: iconst_4
    //   2177: iload #12
    //   2179: iastore
    //   2180: astore #13
    //   2182: bipush #20
    //   2184: newarray byte
    //   2186: astore #14
    //   2188: iconst_0
    //   2189: istore #15
    //   2191: iload #15
    //   2193: bipush #20
    //   2195: if_icmpge -> 2236
    //   2198: aload #13
    //   2200: iload #15
    //   2202: iconst_4
    //   2203: idiv
    //   2204: iaload
    //   2205: istore #16
    //   2207: iconst_3
    //   2208: iload #15
    //   2210: iconst_4
    //   2211: irem
    //   2212: isub
    //   2213: bipush #8
    //   2215: imul
    //   2216: istore #17
    //   2218: aload #14
    //   2220: iload #15
    //   2222: iload #16
    //   2224: iload #17
    //   2226: iushr
    //   2227: i2b
    //   2228: bastore
    //   2229: iinc #15, 1
    //   2232: iload_2
    //   2233: ifeq -> 2191
    //   2236: aload #14
    //   2238: astore #4
    //   2240: iconst_0
    //   2241: istore_3
    //   2242: getstatic burp/Zbsc.Zp : Ljava/lang/String;
    //   2245: getstatic burp/Zt5a.Zs : Ljava/lang/Object;
    //   2248: checkcast java/math/BigInteger
    //   2251: invokevirtual intValue : ()I
    //   2254: bipush #32
    //   2256: irem
    //   2257: invokestatic abs : (I)I
    //   2260: invokevirtual charAt : (I)C
    //   2263: getstatic burp/Zg3m.Za : Ljava/lang/String;
    //   2266: getstatic burp/Zzxa.ZI : Ljava/lang/Object;
    //   2269: checkcast java/math/BigInteger
    //   2272: invokevirtual intValue : ()I
    //   2275: bipush #32
    //   2277: irem
    //   2278: invokestatic abs : (I)I
    //   2281: invokevirtual charAt : (I)C
    //   2284: if_icmple -> 2628
    //   2287: sipush #-8199
    //   2290: sipush #27799
    //   2293: invokestatic a : (II)Ljava/lang/String;
    //   2296: iconst_1
    //   2297: ldc burp/Zgcg
    //   2299: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2302: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2305: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2308: astore #4
    //   2310: aload #4
    //   2312: arraylength
    //   2313: istore #5
    //   2315: iconst_0
    //   2316: istore #6
    //   2318: iload #6
    //   2320: iload #5
    //   2322: if_icmpge -> 2460
    //   2325: aload #4
    //   2327: iload #6
    //   2329: aaload
    //   2330: astore #7
    //   2332: aload #7
    //   2334: invokevirtual getModifiers : ()I
    //   2337: invokestatic isStatic : (I)Z
    //   2340: ifne -> 2350
    //   2343: goto -> 2453
    //   2346: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2349: athrow
    //   2350: aload #7
    //   2352: invokevirtual getType : ()Ljava/lang/Class;
    //   2355: astore #8
    //   2357: aload #8
    //   2359: ifnull -> 2440
    //   2362: aload #8
    //   2364: invokevirtual isPrimitive : ()Z
    //   2367: ifne -> 2440
    //   2370: goto -> 2377
    //   2373: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2376: athrow
    //   2377: aload #8
    //   2379: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2382: ifnull -> 2440
    //   2385: goto -> 2392
    //   2388: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2391: athrow
    //   2392: aload #8
    //   2394: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2397: invokevirtual getName : ()Ljava/lang/String;
    //   2400: ifnull -> 2440
    //   2403: goto -> 2410
    //   2406: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2409: athrow
    //   2410: aload #8
    //   2412: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2415: invokevirtual getName : ()Ljava/lang/String;
    //   2418: sipush #-8195
    //   2421: sipush #-10670
    //   2424: invokestatic a : (II)Ljava/lang/String;
    //   2427: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2430: ifne -> 2440
    //   2433: goto -> 2440
    //   2436: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2439: athrow
    //   2440: aload #7
    //   2442: iconst_1
    //   2443: invokevirtual setAccessible : (Z)V
    //   2446: aload #7
    //   2448: aconst_null
    //   2449: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2452: pop
    //   2453: iinc #6, 1
    //   2456: iload_2
    //   2457: ifeq -> 2318
    //   2460: sipush #-8208
    //   2463: sipush #-20054
    //   2466: invokestatic a : (II)Ljava/lang/String;
    //   2469: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2472: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2475: astore #4
    //   2477: aload #4
    //   2479: arraylength
    //   2480: istore #5
    //   2482: iconst_0
    //   2483: istore #6
    //   2485: iload #6
    //   2487: iload #5
    //   2489: if_icmpge -> 2625
    //   2492: aload #4
    //   2494: iload #6
    //   2496: aaload
    //   2497: astore #7
    //   2499: aload #7
    //   2501: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2504: pop
    //   2505: aload #7
    //   2507: invokevirtual getModifiers : ()I
    //   2510: invokestatic isStatic : (I)Z
    //   2513: ifeq -> 2611
    //   2516: aload #7
    //   2518: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2521: arraylength
    //   2522: iconst_2
    //   2523: if_icmpne -> 2611
    //   2526: goto -> 2533
    //   2529: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2532: athrow
    //   2533: aload #7
    //   2535: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2538: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2541: if_acmpne -> 2611
    //   2544: goto -> 2551
    //   2547: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2550: athrow
    //   2551: aload #7
    //   2553: iconst_1
    //   2554: invokevirtual setAccessible : (Z)V
    //   2557: aload #7
    //   2559: aconst_null
    //   2560: iconst_2
    //   2561: anewarray java/lang/Object
    //   2564: dup
    //   2565: iconst_0
    //   2566: aload_0
    //   2567: aastore
    //   2568: dup
    //   2569: iconst_1
    //   2570: aload_1
    //   2571: ifnonnull -> 2589
    //   2574: goto -> 2581
    //   2577: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2580: athrow
    //   2581: aload_1
    //   2582: goto -> 2596
    //   2585: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2588: athrow
    //   2589: aload_1
    //   2590: checkcast [B
    //   2593: invokevirtual clone : ()Ljava/lang/Object;
    //   2596: aastore
    //   2597: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2600: checkcast java/lang/Boolean
    //   2603: invokevirtual booleanValue : ()Z
    //   2606: istore_3
    //   2607: iload_2
    //   2608: ifeq -> 2625
    //   2611: iinc #6, 1
    //   2614: iload_2
    //   2615: ifeq -> 2485
    //   2618: goto -> 2625
    //   2621: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2624: athrow
    //   2625: goto -> 2966
    //   2628: sipush #-8222
    //   2631: sipush #20193
    //   2634: invokestatic a : (II)Ljava/lang/String;
    //   2637: iconst_1
    //   2638: ldc burp/Zmfw
    //   2640: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2643: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2646: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2649: astore #4
    //   2651: aload #4
    //   2653: arraylength
    //   2654: istore #5
    //   2656: iconst_0
    //   2657: istore #6
    //   2659: iload #6
    //   2661: iload #5
    //   2663: if_icmpge -> 2801
    //   2666: aload #4
    //   2668: iload #6
    //   2670: aaload
    //   2671: astore #7
    //   2673: aload #7
    //   2675: invokevirtual getModifiers : ()I
    //   2678: invokestatic isStatic : (I)Z
    //   2681: ifne -> 2691
    //   2684: goto -> 2794
    //   2687: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2690: athrow
    //   2691: aload #7
    //   2693: invokevirtual getType : ()Ljava/lang/Class;
    //   2696: astore #8
    //   2698: aload #8
    //   2700: ifnull -> 2781
    //   2703: aload #8
    //   2705: invokevirtual isPrimitive : ()Z
    //   2708: ifne -> 2781
    //   2711: goto -> 2718
    //   2714: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2717: athrow
    //   2718: aload #8
    //   2720: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2723: ifnull -> 2781
    //   2726: goto -> 2733
    //   2729: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2732: athrow
    //   2733: aload #8
    //   2735: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2738: invokevirtual getName : ()Ljava/lang/String;
    //   2741: ifnull -> 2781
    //   2744: goto -> 2751
    //   2747: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2750: athrow
    //   2751: aload #8
    //   2753: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2756: invokevirtual getName : ()Ljava/lang/String;
    //   2759: sipush #-8195
    //   2762: sipush #-10670
    //   2765: invokestatic a : (II)Ljava/lang/String;
    //   2768: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2771: ifne -> 2781
    //   2774: goto -> 2781
    //   2777: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2780: athrow
    //   2781: aload #7
    //   2783: iconst_1
    //   2784: invokevirtual setAccessible : (Z)V
    //   2787: aload #7
    //   2789: aconst_null
    //   2790: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2793: pop
    //   2794: iinc #6, 1
    //   2797: iload_2
    //   2798: ifeq -> 2659
    //   2801: sipush #-8217
    //   2804: sipush #2629
    //   2807: invokestatic a : (II)Ljava/lang/String;
    //   2810: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2813: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2816: astore #4
    //   2818: aload #4
    //   2820: arraylength
    //   2821: istore #5
    //   2823: iconst_0
    //   2824: istore #6
    //   2826: iload #6
    //   2828: iload #5
    //   2830: if_icmpge -> 2966
    //   2833: aload #4
    //   2835: iload #6
    //   2837: aaload
    //   2838: astore #7
    //   2840: aload #7
    //   2842: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2845: pop
    //   2846: aload #7
    //   2848: invokevirtual getModifiers : ()I
    //   2851: invokestatic isStatic : (I)Z
    //   2854: ifeq -> 2952
    //   2857: aload #7
    //   2859: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2862: arraylength
    //   2863: iconst_2
    //   2864: if_icmpne -> 2952
    //   2867: goto -> 2874
    //   2870: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2873: athrow
    //   2874: aload #7
    //   2876: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2879: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2882: if_acmpne -> 2952
    //   2885: goto -> 2892
    //   2888: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2891: athrow
    //   2892: aload #7
    //   2894: iconst_1
    //   2895: invokevirtual setAccessible : (Z)V
    //   2898: aload #7
    //   2900: aconst_null
    //   2901: iconst_2
    //   2902: anewarray java/lang/Object
    //   2905: dup
    //   2906: iconst_0
    //   2907: aload_0
    //   2908: aastore
    //   2909: dup
    //   2910: iconst_1
    //   2911: aload_1
    //   2912: ifnonnull -> 2930
    //   2915: goto -> 2922
    //   2918: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2921: athrow
    //   2922: aload_1
    //   2923: goto -> 2937
    //   2926: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2929: athrow
    //   2930: aload_1
    //   2931: checkcast [B
    //   2934: invokevirtual clone : ()Ljava/lang/Object;
    //   2937: aastore
    //   2938: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2941: checkcast java/lang/Boolean
    //   2944: invokevirtual booleanValue : ()Z
    //   2947: istore_3
    //   2948: iload_2
    //   2949: ifeq -> 2966
    //   2952: iinc #6, 1
    //   2955: iload_2
    //   2956: ifeq -> 2826
    //   2959: goto -> 2966
    //   2962: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2965: athrow
    //   2966: iload_3
    //   2967: ifeq -> 2972
    //   2970: iload_3
    //   2971: ireturn
    //   2972: getstatic burp/Zz8o.Zo : Ljava/lang/String;
    //   2975: getstatic burp/Zg3m.ZK : Ljava/lang/Object;
    //   2978: checkcast java/math/BigInteger
    //   2981: invokevirtual intValue : ()I
    //   2984: bipush #32
    //   2986: irem
    //   2987: invokestatic abs : (I)I
    //   2990: invokevirtual charAt : (I)C
    //   2993: getstatic burp/Zth8.ZN : Ljava/lang/String;
    //   2996: getstatic burp/Zgr1.Zf : Ljava/lang/Object;
    //   2999: checkcast java/math/BigInteger
    //   3002: invokevirtual intValue : ()I
    //   3005: bipush #32
    //   3007: irem
    //   3008: invokestatic abs : (I)I
    //   3011: invokevirtual charAt : (I)C
    //   3014: if_icmpgt -> 3359
    //   3017: sipush #-8205
    //   3020: sipush #16804
    //   3023: invokestatic a : (II)Ljava/lang/String;
    //   3026: iconst_1
    //   3027: ldc burp/Zeju
    //   3029: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3032: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3035: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3038: astore #4
    //   3040: aload #4
    //   3042: arraylength
    //   3043: istore #5
    //   3045: iconst_0
    //   3046: istore #6
    //   3048: iload #6
    //   3050: iload #5
    //   3052: if_icmpge -> 3190
    //   3055: aload #4
    //   3057: iload #6
    //   3059: aaload
    //   3060: astore #7
    //   3062: aload #7
    //   3064: invokevirtual getModifiers : ()I
    //   3067: invokestatic isStatic : (I)Z
    //   3070: ifne -> 3080
    //   3073: goto -> 3183
    //   3076: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3079: athrow
    //   3080: aload #7
    //   3082: invokevirtual getType : ()Ljava/lang/Class;
    //   3085: astore #8
    //   3087: aload #8
    //   3089: ifnull -> 3170
    //   3092: aload #8
    //   3094: invokevirtual isPrimitive : ()Z
    //   3097: ifne -> 3170
    //   3100: goto -> 3107
    //   3103: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3106: athrow
    //   3107: aload #8
    //   3109: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3112: ifnull -> 3170
    //   3115: goto -> 3122
    //   3118: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3121: athrow
    //   3122: aload #8
    //   3124: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3127: invokevirtual getName : ()Ljava/lang/String;
    //   3130: ifnull -> 3170
    //   3133: goto -> 3140
    //   3136: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3139: athrow
    //   3140: aload #8
    //   3142: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3145: invokevirtual getName : ()Ljava/lang/String;
    //   3148: sipush #-8195
    //   3151: sipush #-10670
    //   3154: invokestatic a : (II)Ljava/lang/String;
    //   3157: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3160: ifne -> 3170
    //   3163: goto -> 3170
    //   3166: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3169: athrow
    //   3170: aload #7
    //   3172: iconst_1
    //   3173: invokevirtual setAccessible : (Z)V
    //   3176: aload #7
    //   3178: aconst_null
    //   3179: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3182: pop
    //   3183: iinc #6, 1
    //   3186: iload_2
    //   3187: ifeq -> 3048
    //   3190: sipush #-8234
    //   3193: sipush #-21964
    //   3196: invokestatic a : (II)Ljava/lang/String;
    //   3199: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3202: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3205: astore #4
    //   3207: aload #4
    //   3209: arraylength
    //   3210: istore #5
    //   3212: iconst_0
    //   3213: istore #6
    //   3215: iload #6
    //   3217: iload #5
    //   3219: if_icmpge -> 3355
    //   3222: aload #4
    //   3224: iload #6
    //   3226: aaload
    //   3227: astore #7
    //   3229: aload #7
    //   3231: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3234: pop
    //   3235: aload #7
    //   3237: invokevirtual getModifiers : ()I
    //   3240: invokestatic isStatic : (I)Z
    //   3243: ifeq -> 3341
    //   3246: aload #7
    //   3248: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3251: arraylength
    //   3252: iconst_2
    //   3253: if_icmpne -> 3341
    //   3256: goto -> 3263
    //   3259: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3262: athrow
    //   3263: aload #7
    //   3265: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3268: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3271: if_acmpne -> 3341
    //   3274: goto -> 3281
    //   3277: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3280: athrow
    //   3281: aload #7
    //   3283: iconst_1
    //   3284: invokevirtual setAccessible : (Z)V
    //   3287: aload #7
    //   3289: aconst_null
    //   3290: iconst_2
    //   3291: anewarray java/lang/Object
    //   3294: dup
    //   3295: iconst_0
    //   3296: aload_0
    //   3297: aastore
    //   3298: dup
    //   3299: iconst_1
    //   3300: aload_1
    //   3301: ifnonnull -> 3319
    //   3304: goto -> 3311
    //   3307: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3310: athrow
    //   3311: aload_1
    //   3312: goto -> 3326
    //   3315: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3318: athrow
    //   3319: aload_1
    //   3320: checkcast [B
    //   3323: invokevirtual clone : ()Ljava/lang/Object;
    //   3326: aastore
    //   3327: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3330: checkcast java/lang/Boolean
    //   3333: invokevirtual booleanValue : ()Z
    //   3336: istore_3
    //   3337: iload_2
    //   3338: ifeq -> 3355
    //   3341: iinc #6, 1
    //   3344: iload_2
    //   3345: ifeq -> 3215
    //   3348: goto -> 3355
    //   3351: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3354: athrow
    //   3355: iload_2
    //   3356: ifeq -> 3697
    //   3359: sipush #-8203
    //   3362: sipush #4551
    //   3365: invokestatic a : (II)Ljava/lang/String;
    //   3368: iconst_1
    //   3369: ldc burp/Zrj3
    //   3371: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3374: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3377: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3380: astore #4
    //   3382: aload #4
    //   3384: arraylength
    //   3385: istore #5
    //   3387: iconst_0
    //   3388: istore #6
    //   3390: iload #6
    //   3392: iload #5
    //   3394: if_icmpge -> 3532
    //   3397: aload #4
    //   3399: iload #6
    //   3401: aaload
    //   3402: astore #7
    //   3404: aload #7
    //   3406: invokevirtual getModifiers : ()I
    //   3409: invokestatic isStatic : (I)Z
    //   3412: ifne -> 3422
    //   3415: goto -> 3525
    //   3418: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3421: athrow
    //   3422: aload #7
    //   3424: invokevirtual getType : ()Ljava/lang/Class;
    //   3427: astore #8
    //   3429: aload #8
    //   3431: ifnull -> 3512
    //   3434: aload #8
    //   3436: invokevirtual isPrimitive : ()Z
    //   3439: ifne -> 3512
    //   3442: goto -> 3449
    //   3445: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3448: athrow
    //   3449: aload #8
    //   3451: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3454: ifnull -> 3512
    //   3457: goto -> 3464
    //   3460: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3463: athrow
    //   3464: aload #8
    //   3466: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3469: invokevirtual getName : ()Ljava/lang/String;
    //   3472: ifnull -> 3512
    //   3475: goto -> 3482
    //   3478: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3481: athrow
    //   3482: aload #8
    //   3484: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3487: invokevirtual getName : ()Ljava/lang/String;
    //   3490: sipush #-8195
    //   3493: sipush #-10670
    //   3496: invokestatic a : (II)Ljava/lang/String;
    //   3499: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3502: ifne -> 3512
    //   3505: goto -> 3512
    //   3508: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3511: athrow
    //   3512: aload #7
    //   3514: iconst_1
    //   3515: invokevirtual setAccessible : (Z)V
    //   3518: aload #7
    //   3520: aconst_null
    //   3521: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3524: pop
    //   3525: iinc #6, 1
    //   3528: iload_2
    //   3529: ifeq -> 3390
    //   3532: sipush #-8220
    //   3535: sipush #-25293
    //   3538: invokestatic a : (II)Ljava/lang/String;
    //   3541: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3544: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3547: astore #4
    //   3549: aload #4
    //   3551: arraylength
    //   3552: istore #5
    //   3554: iconst_0
    //   3555: istore #6
    //   3557: iload #6
    //   3559: iload #5
    //   3561: if_icmpge -> 3697
    //   3564: aload #4
    //   3566: iload #6
    //   3568: aaload
    //   3569: astore #7
    //   3571: aload #7
    //   3573: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3576: pop
    //   3577: aload #7
    //   3579: invokevirtual getModifiers : ()I
    //   3582: invokestatic isStatic : (I)Z
    //   3585: ifeq -> 3683
    //   3588: aload #7
    //   3590: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3593: arraylength
    //   3594: iconst_2
    //   3595: if_icmpne -> 3683
    //   3598: goto -> 3605
    //   3601: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3604: athrow
    //   3605: aload #7
    //   3607: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3610: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3613: if_acmpne -> 3683
    //   3616: goto -> 3623
    //   3619: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3622: athrow
    //   3623: aload #7
    //   3625: iconst_1
    //   3626: invokevirtual setAccessible : (Z)V
    //   3629: aload #7
    //   3631: aconst_null
    //   3632: iconst_2
    //   3633: anewarray java/lang/Object
    //   3636: dup
    //   3637: iconst_0
    //   3638: aload_0
    //   3639: aastore
    //   3640: dup
    //   3641: iconst_1
    //   3642: aload_1
    //   3643: ifnonnull -> 3661
    //   3646: goto -> 3653
    //   3649: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3652: athrow
    //   3653: aload_1
    //   3654: goto -> 3668
    //   3657: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3660: athrow
    //   3661: aload_1
    //   3662: checkcast [B
    //   3665: invokevirtual clone : ()Ljava/lang/Object;
    //   3668: aastore
    //   3669: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3672: checkcast java/lang/Boolean
    //   3675: invokevirtual booleanValue : ()Z
    //   3678: istore_3
    //   3679: iload_2
    //   3680: ifeq -> 3697
    //   3683: iinc #6, 1
    //   3686: iload_2
    //   3687: ifeq -> 3557
    //   3690: goto -> 3697
    //   3693: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3696: athrow
    //   3697: iload_3
    //   3698: ifeq -> 3703
    //   3701: iload_3
    //   3702: ireturn
    //   3703: getstatic burp/Zkfb.ZV : Ljava/lang/String;
    //   3706: getstatic burp/Zrp3.Zd : Ljava/lang/Object;
    //   3709: checkcast java/math/BigInteger
    //   3712: invokevirtual intValue : ()I
    //   3715: bipush #32
    //   3717: irem
    //   3718: invokestatic abs : (I)I
    //   3721: invokevirtual charAt : (I)C
    //   3724: getstatic burp/Zgr1.Za : Ljava/lang/String;
    //   3727: getstatic burp/Zs5k.Zg : Ljava/lang/Object;
    //   3730: checkcast java/math/BigInteger
    //   3733: invokevirtual intValue : ()I
    //   3736: bipush #32
    //   3738: irem
    //   3739: invokestatic abs : (I)I
    //   3742: invokevirtual charAt : (I)C
    //   3745: if_icmple -> 4090
    //   3748: sipush #-8216
    //   3751: sipush #26025
    //   3754: invokestatic a : (II)Ljava/lang/String;
    //   3757: iconst_1
    //   3758: ldc burp/Zrfh
    //   3760: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3763: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3766: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3769: astore #4
    //   3771: aload #4
    //   3773: arraylength
    //   3774: istore #5
    //   3776: iconst_0
    //   3777: istore #6
    //   3779: iload #6
    //   3781: iload #5
    //   3783: if_icmpge -> 3921
    //   3786: aload #4
    //   3788: iload #6
    //   3790: aaload
    //   3791: astore #7
    //   3793: aload #7
    //   3795: invokevirtual getModifiers : ()I
    //   3798: invokestatic isStatic : (I)Z
    //   3801: ifne -> 3811
    //   3804: goto -> 3914
    //   3807: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3810: athrow
    //   3811: aload #7
    //   3813: invokevirtual getType : ()Ljava/lang/Class;
    //   3816: astore #8
    //   3818: aload #8
    //   3820: ifnull -> 3901
    //   3823: aload #8
    //   3825: invokevirtual isPrimitive : ()Z
    //   3828: ifne -> 3901
    //   3831: goto -> 3838
    //   3834: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3837: athrow
    //   3838: aload #8
    //   3840: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3843: ifnull -> 3901
    //   3846: goto -> 3853
    //   3849: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3852: athrow
    //   3853: aload #8
    //   3855: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3858: invokevirtual getName : ()Ljava/lang/String;
    //   3861: ifnull -> 3901
    //   3864: goto -> 3871
    //   3867: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3870: athrow
    //   3871: aload #8
    //   3873: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3876: invokevirtual getName : ()Ljava/lang/String;
    //   3879: sipush #-8195
    //   3882: sipush #-10670
    //   3885: invokestatic a : (II)Ljava/lang/String;
    //   3888: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3891: ifne -> 3901
    //   3894: goto -> 3901
    //   3897: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3900: athrow
    //   3901: aload #7
    //   3903: iconst_1
    //   3904: invokevirtual setAccessible : (Z)V
    //   3907: aload #7
    //   3909: aconst_null
    //   3910: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3913: pop
    //   3914: iinc #6, 1
    //   3917: iload_2
    //   3918: ifeq -> 3779
    //   3921: sipush #-8233
    //   3924: sipush #-25136
    //   3927: invokestatic a : (II)Ljava/lang/String;
    //   3930: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3933: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3936: astore #4
    //   3938: aload #4
    //   3940: arraylength
    //   3941: istore #5
    //   3943: iconst_0
    //   3944: istore #6
    //   3946: iload #6
    //   3948: iload #5
    //   3950: if_icmpge -> 4086
    //   3953: aload #4
    //   3955: iload #6
    //   3957: aaload
    //   3958: astore #7
    //   3960: aload #7
    //   3962: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3965: pop
    //   3966: aload #7
    //   3968: invokevirtual getModifiers : ()I
    //   3971: invokestatic isStatic : (I)Z
    //   3974: ifeq -> 4072
    //   3977: aload #7
    //   3979: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3982: arraylength
    //   3983: iconst_2
    //   3984: if_icmpne -> 4072
    //   3987: goto -> 3994
    //   3990: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3993: athrow
    //   3994: aload #7
    //   3996: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3999: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4002: if_acmpne -> 4072
    //   4005: goto -> 4012
    //   4008: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4011: athrow
    //   4012: aload #7
    //   4014: iconst_1
    //   4015: invokevirtual setAccessible : (Z)V
    //   4018: aload #7
    //   4020: aconst_null
    //   4021: iconst_2
    //   4022: anewarray java/lang/Object
    //   4025: dup
    //   4026: iconst_0
    //   4027: aload_0
    //   4028: aastore
    //   4029: dup
    //   4030: iconst_1
    //   4031: aload_1
    //   4032: ifnonnull -> 4050
    //   4035: goto -> 4042
    //   4038: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4041: athrow
    //   4042: aload_1
    //   4043: goto -> 4057
    //   4046: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4049: athrow
    //   4050: aload_1
    //   4051: checkcast [B
    //   4054: invokevirtual clone : ()Ljava/lang/Object;
    //   4057: aastore
    //   4058: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4061: checkcast java/lang/Boolean
    //   4064: invokevirtual booleanValue : ()Z
    //   4067: istore_3
    //   4068: iload_2
    //   4069: ifeq -> 4086
    //   4072: iinc #6, 1
    //   4075: iload_2
    //   4076: ifeq -> 3946
    //   4079: goto -> 4086
    //   4082: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4085: athrow
    //   4086: iload_2
    //   4087: ifeq -> 4428
    //   4090: sipush #-8214
    //   4093: sipush #-1046
    //   4096: invokestatic a : (II)Ljava/lang/String;
    //   4099: iconst_1
    //   4100: ldc burp/Ztgv
    //   4102: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4105: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4108: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4111: astore #4
    //   4113: aload #4
    //   4115: arraylength
    //   4116: istore #5
    //   4118: iconst_0
    //   4119: istore #6
    //   4121: iload #6
    //   4123: iload #5
    //   4125: if_icmpge -> 4263
    //   4128: aload #4
    //   4130: iload #6
    //   4132: aaload
    //   4133: astore #7
    //   4135: aload #7
    //   4137: invokevirtual getModifiers : ()I
    //   4140: invokestatic isStatic : (I)Z
    //   4143: ifne -> 4153
    //   4146: goto -> 4256
    //   4149: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4152: athrow
    //   4153: aload #7
    //   4155: invokevirtual getType : ()Ljava/lang/Class;
    //   4158: astore #8
    //   4160: aload #8
    //   4162: ifnull -> 4243
    //   4165: aload #8
    //   4167: invokevirtual isPrimitive : ()Z
    //   4170: ifne -> 4243
    //   4173: goto -> 4180
    //   4176: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4179: athrow
    //   4180: aload #8
    //   4182: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4185: ifnull -> 4243
    //   4188: goto -> 4195
    //   4191: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4194: athrow
    //   4195: aload #8
    //   4197: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4200: invokevirtual getName : ()Ljava/lang/String;
    //   4203: ifnull -> 4243
    //   4206: goto -> 4213
    //   4209: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4212: athrow
    //   4213: aload #8
    //   4215: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4218: invokevirtual getName : ()Ljava/lang/String;
    //   4221: sipush #-8195
    //   4224: sipush #-10670
    //   4227: invokestatic a : (II)Ljava/lang/String;
    //   4230: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4233: ifne -> 4243
    //   4236: goto -> 4243
    //   4239: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4242: athrow
    //   4243: aload #7
    //   4245: iconst_1
    //   4246: invokevirtual setAccessible : (Z)V
    //   4249: aload #7
    //   4251: aconst_null
    //   4252: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4255: pop
    //   4256: iinc #6, 1
    //   4259: iload_2
    //   4260: ifeq -> 4121
    //   4263: sipush #-8193
    //   4266: sipush #23914
    //   4269: invokestatic a : (II)Ljava/lang/String;
    //   4272: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4275: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4278: astore #4
    //   4280: aload #4
    //   4282: arraylength
    //   4283: istore #5
    //   4285: iconst_0
    //   4286: istore #6
    //   4288: iload #6
    //   4290: iload #5
    //   4292: if_icmpge -> 4428
    //   4295: aload #4
    //   4297: iload #6
    //   4299: aaload
    //   4300: astore #7
    //   4302: aload #7
    //   4304: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4307: pop
    //   4308: aload #7
    //   4310: invokevirtual getModifiers : ()I
    //   4313: invokestatic isStatic : (I)Z
    //   4316: ifeq -> 4414
    //   4319: aload #7
    //   4321: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4324: arraylength
    //   4325: iconst_2
    //   4326: if_icmpne -> 4414
    //   4329: goto -> 4336
    //   4332: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4335: athrow
    //   4336: aload #7
    //   4338: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4341: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4344: if_acmpne -> 4414
    //   4347: goto -> 4354
    //   4350: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4353: athrow
    //   4354: aload #7
    //   4356: iconst_1
    //   4357: invokevirtual setAccessible : (Z)V
    //   4360: aload #7
    //   4362: aconst_null
    //   4363: iconst_2
    //   4364: anewarray java/lang/Object
    //   4367: dup
    //   4368: iconst_0
    //   4369: aload_0
    //   4370: aastore
    //   4371: dup
    //   4372: iconst_1
    //   4373: aload_1
    //   4374: ifnonnull -> 4392
    //   4377: goto -> 4384
    //   4380: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4383: athrow
    //   4384: aload_1
    //   4385: goto -> 4399
    //   4388: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4391: athrow
    //   4392: aload_1
    //   4393: checkcast [B
    //   4396: invokevirtual clone : ()Ljava/lang/Object;
    //   4399: aastore
    //   4400: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4403: checkcast java/lang/Boolean
    //   4406: invokevirtual booleanValue : ()Z
    //   4409: istore_3
    //   4410: iload_2
    //   4411: ifeq -> 4428
    //   4414: iinc #6, 1
    //   4417: iload_2
    //   4418: ifeq -> 4288
    //   4421: goto -> 4428
    //   4424: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4427: athrow
    //   4428: iload_3
    //   4429: ifeq -> 4434
    //   4432: iload_3
    //   4433: ireturn
    //   4434: getstatic burp/Zmfw.ZV : Ljava/lang/String;
    //   4437: getstatic burp/Zl5.ZY : Ljava/lang/Object;
    //   4440: checkcast java/math/BigInteger
    //   4443: invokevirtual intValue : ()I
    //   4446: bipush #32
    //   4448: irem
    //   4449: invokestatic abs : (I)I
    //   4452: invokevirtual charAt : (I)C
    //   4455: getstatic burp/Zg3m.Za : Ljava/lang/String;
    //   4458: getstatic burp/Zzxa.ZI : Ljava/lang/Object;
    //   4461: checkcast java/math/BigInteger
    //   4464: invokevirtual intValue : ()I
    //   4467: bipush #32
    //   4469: irem
    //   4470: invokestatic abs : (I)I
    //   4473: invokevirtual charAt : (I)C
    //   4476: if_icmpgt -> 4821
    //   4479: sipush #-8224
    //   4482: sipush #12330
    //   4485: invokestatic a : (II)Ljava/lang/String;
    //   4488: iconst_1
    //   4489: ldc burp/Zsvh
    //   4491: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4494: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4497: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4500: astore #4
    //   4502: aload #4
    //   4504: arraylength
    //   4505: istore #5
    //   4507: iconst_0
    //   4508: istore #6
    //   4510: iload #6
    //   4512: iload #5
    //   4514: if_icmpge -> 4652
    //   4517: aload #4
    //   4519: iload #6
    //   4521: aaload
    //   4522: astore #7
    //   4524: aload #7
    //   4526: invokevirtual getModifiers : ()I
    //   4529: invokestatic isStatic : (I)Z
    //   4532: ifne -> 4542
    //   4535: goto -> 4645
    //   4538: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4541: athrow
    //   4542: aload #7
    //   4544: invokevirtual getType : ()Ljava/lang/Class;
    //   4547: astore #8
    //   4549: aload #8
    //   4551: ifnull -> 4632
    //   4554: aload #8
    //   4556: invokevirtual isPrimitive : ()Z
    //   4559: ifne -> 4632
    //   4562: goto -> 4569
    //   4565: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4568: athrow
    //   4569: aload #8
    //   4571: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4574: ifnull -> 4632
    //   4577: goto -> 4584
    //   4580: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4583: athrow
    //   4584: aload #8
    //   4586: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4589: invokevirtual getName : ()Ljava/lang/String;
    //   4592: ifnull -> 4632
    //   4595: goto -> 4602
    //   4598: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4601: athrow
    //   4602: aload #8
    //   4604: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4607: invokevirtual getName : ()Ljava/lang/String;
    //   4610: sipush #-8195
    //   4613: sipush #-10670
    //   4616: invokestatic a : (II)Ljava/lang/String;
    //   4619: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4622: ifne -> 4632
    //   4625: goto -> 4632
    //   4628: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4631: athrow
    //   4632: aload #7
    //   4634: iconst_1
    //   4635: invokevirtual setAccessible : (Z)V
    //   4638: aload #7
    //   4640: aconst_null
    //   4641: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4644: pop
    //   4645: iinc #6, 1
    //   4648: iload_2
    //   4649: ifeq -> 4510
    //   4652: sipush #-8201
    //   4655: sipush #-5462
    //   4658: invokestatic a : (II)Ljava/lang/String;
    //   4661: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4664: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4667: astore #4
    //   4669: aload #4
    //   4671: arraylength
    //   4672: istore #5
    //   4674: iconst_0
    //   4675: istore #6
    //   4677: iload #6
    //   4679: iload #5
    //   4681: if_icmpge -> 4817
    //   4684: aload #4
    //   4686: iload #6
    //   4688: aaload
    //   4689: astore #7
    //   4691: aload #7
    //   4693: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4696: pop
    //   4697: aload #7
    //   4699: invokevirtual getModifiers : ()I
    //   4702: invokestatic isStatic : (I)Z
    //   4705: ifeq -> 4803
    //   4708: aload #7
    //   4710: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4713: arraylength
    //   4714: iconst_2
    //   4715: if_icmpne -> 4803
    //   4718: goto -> 4725
    //   4721: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4724: athrow
    //   4725: aload #7
    //   4727: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4730: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4733: if_acmpne -> 4803
    //   4736: goto -> 4743
    //   4739: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4742: athrow
    //   4743: aload #7
    //   4745: iconst_1
    //   4746: invokevirtual setAccessible : (Z)V
    //   4749: aload #7
    //   4751: aconst_null
    //   4752: iconst_2
    //   4753: anewarray java/lang/Object
    //   4756: dup
    //   4757: iconst_0
    //   4758: aload_0
    //   4759: aastore
    //   4760: dup
    //   4761: iconst_1
    //   4762: aload_1
    //   4763: ifnonnull -> 4781
    //   4766: goto -> 4773
    //   4769: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4772: athrow
    //   4773: aload_1
    //   4774: goto -> 4788
    //   4777: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4780: athrow
    //   4781: aload_1
    //   4782: checkcast [B
    //   4785: invokevirtual clone : ()Ljava/lang/Object;
    //   4788: aastore
    //   4789: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4792: checkcast java/lang/Boolean
    //   4795: invokevirtual booleanValue : ()Z
    //   4798: istore_3
    //   4799: iload_2
    //   4800: ifeq -> 4817
    //   4803: iinc #6, 1
    //   4806: iload_2
    //   4807: ifeq -> 4677
    //   4810: goto -> 4817
    //   4813: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4816: athrow
    //   4817: iload_2
    //   4818: ifeq -> 5159
    //   4821: sipush #-8196
    //   4824: sipush #-10660
    //   4827: invokestatic a : (II)Ljava/lang/String;
    //   4830: iconst_1
    //   4831: ldc burp/Zrnu
    //   4833: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4836: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4839: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4842: astore #4
    //   4844: aload #4
    //   4846: arraylength
    //   4847: istore #5
    //   4849: iconst_0
    //   4850: istore #6
    //   4852: iload #6
    //   4854: iload #5
    //   4856: if_icmpge -> 4994
    //   4859: aload #4
    //   4861: iload #6
    //   4863: aaload
    //   4864: astore #7
    //   4866: aload #7
    //   4868: invokevirtual getModifiers : ()I
    //   4871: invokestatic isStatic : (I)Z
    //   4874: ifne -> 4884
    //   4877: goto -> 4987
    //   4880: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4883: athrow
    //   4884: aload #7
    //   4886: invokevirtual getType : ()Ljava/lang/Class;
    //   4889: astore #8
    //   4891: aload #8
    //   4893: ifnull -> 4974
    //   4896: aload #8
    //   4898: invokevirtual isPrimitive : ()Z
    //   4901: ifne -> 4974
    //   4904: goto -> 4911
    //   4907: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4910: athrow
    //   4911: aload #8
    //   4913: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4916: ifnull -> 4974
    //   4919: goto -> 4926
    //   4922: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4925: athrow
    //   4926: aload #8
    //   4928: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4931: invokevirtual getName : ()Ljava/lang/String;
    //   4934: ifnull -> 4974
    //   4937: goto -> 4944
    //   4940: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4943: athrow
    //   4944: aload #8
    //   4946: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4949: invokevirtual getName : ()Ljava/lang/String;
    //   4952: sipush #-8195
    //   4955: sipush #-10670
    //   4958: invokestatic a : (II)Ljava/lang/String;
    //   4961: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4964: ifne -> 4974
    //   4967: goto -> 4974
    //   4970: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4973: athrow
    //   4974: aload #7
    //   4976: iconst_1
    //   4977: invokevirtual setAccessible : (Z)V
    //   4980: aload #7
    //   4982: aconst_null
    //   4983: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4986: pop
    //   4987: iinc #6, 1
    //   4990: iload_2
    //   4991: ifeq -> 4852
    //   4994: sipush #-8198
    //   4997: sipush #24019
    //   5000: invokestatic a : (II)Ljava/lang/String;
    //   5003: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5006: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5009: astore #4
    //   5011: aload #4
    //   5013: arraylength
    //   5014: istore #5
    //   5016: iconst_0
    //   5017: istore #6
    //   5019: iload #6
    //   5021: iload #5
    //   5023: if_icmpge -> 5159
    //   5026: aload #4
    //   5028: iload #6
    //   5030: aaload
    //   5031: astore #7
    //   5033: aload #7
    //   5035: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5038: pop
    //   5039: aload #7
    //   5041: invokevirtual getModifiers : ()I
    //   5044: invokestatic isStatic : (I)Z
    //   5047: ifeq -> 5145
    //   5050: aload #7
    //   5052: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5055: arraylength
    //   5056: iconst_2
    //   5057: if_icmpne -> 5145
    //   5060: goto -> 5067
    //   5063: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5066: athrow
    //   5067: aload #7
    //   5069: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5072: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5075: if_acmpne -> 5145
    //   5078: goto -> 5085
    //   5081: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5084: athrow
    //   5085: aload #7
    //   5087: iconst_1
    //   5088: invokevirtual setAccessible : (Z)V
    //   5091: aload #7
    //   5093: aconst_null
    //   5094: iconst_2
    //   5095: anewarray java/lang/Object
    //   5098: dup
    //   5099: iconst_0
    //   5100: aload_0
    //   5101: aastore
    //   5102: dup
    //   5103: iconst_1
    //   5104: aload_1
    //   5105: ifnonnull -> 5123
    //   5108: goto -> 5115
    //   5111: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5114: athrow
    //   5115: aload_1
    //   5116: goto -> 5130
    //   5119: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5122: athrow
    //   5123: aload_1
    //   5124: checkcast [B
    //   5127: invokevirtual clone : ()Ljava/lang/Object;
    //   5130: aastore
    //   5131: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5134: checkcast java/lang/Boolean
    //   5137: invokevirtual booleanValue : ()Z
    //   5140: istore_3
    //   5141: iload_2
    //   5142: ifeq -> 5159
    //   5145: iinc #6, 1
    //   5148: iload_2
    //   5149: ifeq -> 5019
    //   5152: goto -> 5159
    //   5155: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5158: athrow
    //   5159: iload_3
    //   5160: ireturn
    //   5161: astore_3
    //   5162: new java/lang/Exception
    //   5165: dup
    //   5166: aload_3
    //   5167: invokevirtual getMessage : ()Ljava/lang/String;
    //   5170: invokespecial <init> : (Ljava/lang/String;)V
    //   5173: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2971	5161	java/lang/Throwable
    //   324	348	351	java/lang/Throwable
    //   422	459	459	java/lang/Throwable
    //   463	484	484	java/lang/Throwable
    //   488	518	518	java/lang/Throwable
    //   761	775	775	java/lang/Throwable
    //   786	799	802	java/lang/Throwable
    //   791	814	817	java/lang/Throwable
    //   806	832	835	java/lang/Throwable
    //   821	862	865	java/lang/Throwable
    //   925	952	955	java/lang/Throwable
    //   942	970	973	java/lang/Throwable
    //   959	1006	1009	java/lang/Throwable
    //   977	1020	1023	java/lang/Throwable
    //   1069	1083	1083	java/lang/Throwable
    //   1094	1107	1110	java/lang/Throwable
    //   1099	1122	1125	java/lang/Throwable
    //   1114	1140	1143	java/lang/Throwable
    //   1129	1170	1173	java/lang/Throwable
    //   1233	1260	1263	java/lang/Throwable
    //   1250	1278	1281	java/lang/Throwable
    //   1267	1308	1311	java/lang/Throwable
    //   1285	1319	1319	java/lang/Throwable
    //   1330	1346	1349	java/lang/Throwable
    //   1395	1409	1409	java/lang/Throwable
    //   1420	1433	1436	java/lang/Throwable
    //   1425	1448	1451	java/lang/Throwable
    //   1440	1466	1469	java/lang/Throwable
    //   1455	1496	1499	java/lang/Throwable
    //   1559	1586	1589	java/lang/Throwable
    //   1576	1607	1610	java/lang/Throwable
    //   1593	1637	1640	java/lang/Throwable
    //   1614	1648	1648	java/lang/Throwable
    //   1659	1675	1678	java/lang/Throwable
    //   1863	1887	1890	java/lang/Throwable
    //   1961	1998	1998	java/lang/Throwable
    //   2002	2023	2023	java/lang/Throwable
    //   2027	2057	2057	java/lang/Throwable
    //   2332	2346	2346	java/lang/Throwable
    //   2357	2370	2373	java/lang/Throwable
    //   2362	2385	2388	java/lang/Throwable
    //   2377	2403	2406	java/lang/Throwable
    //   2392	2433	2436	java/lang/Throwable
    //   2499	2526	2529	java/lang/Throwable
    //   2516	2544	2547	java/lang/Throwable
    //   2533	2574	2577	java/lang/Throwable
    //   2551	2585	2585	java/lang/Throwable
    //   2607	2618	2621	java/lang/Throwable
    //   2673	2687	2687	java/lang/Throwable
    //   2698	2711	2714	java/lang/Throwable
    //   2703	2726	2729	java/lang/Throwable
    //   2718	2744	2747	java/lang/Throwable
    //   2733	2774	2777	java/lang/Throwable
    //   2840	2867	2870	java/lang/Throwable
    //   2857	2885	2888	java/lang/Throwable
    //   2874	2915	2918	java/lang/Throwable
    //   2892	2926	2926	java/lang/Throwable
    //   2948	2959	2962	java/lang/Throwable
    //   2972	3702	5161	java/lang/Throwable
    //   3062	3076	3076	java/lang/Throwable
    //   3087	3100	3103	java/lang/Throwable
    //   3092	3115	3118	java/lang/Throwable
    //   3107	3133	3136	java/lang/Throwable
    //   3122	3163	3166	java/lang/Throwable
    //   3229	3256	3259	java/lang/Throwable
    //   3246	3274	3277	java/lang/Throwable
    //   3263	3304	3307	java/lang/Throwable
    //   3281	3315	3315	java/lang/Throwable
    //   3337	3348	3351	java/lang/Throwable
    //   3404	3418	3418	java/lang/Throwable
    //   3429	3442	3445	java/lang/Throwable
    //   3434	3457	3460	java/lang/Throwable
    //   3449	3475	3478	java/lang/Throwable
    //   3464	3505	3508	java/lang/Throwable
    //   3571	3598	3601	java/lang/Throwable
    //   3588	3616	3619	java/lang/Throwable
    //   3605	3646	3649	java/lang/Throwable
    //   3623	3657	3657	java/lang/Throwable
    //   3679	3690	3693	java/lang/Throwable
    //   3703	4433	5161	java/lang/Throwable
    //   3793	3807	3807	java/lang/Throwable
    //   3818	3831	3834	java/lang/Throwable
    //   3823	3846	3849	java/lang/Throwable
    //   3838	3864	3867	java/lang/Throwable
    //   3853	3894	3897	java/lang/Throwable
    //   3960	3987	3990	java/lang/Throwable
    //   3977	4005	4008	java/lang/Throwable
    //   3994	4035	4038	java/lang/Throwable
    //   4012	4046	4046	java/lang/Throwable
    //   4068	4079	4082	java/lang/Throwable
    //   4135	4149	4149	java/lang/Throwable
    //   4160	4173	4176	java/lang/Throwable
    //   4165	4188	4191	java/lang/Throwable
    //   4180	4206	4209	java/lang/Throwable
    //   4195	4236	4239	java/lang/Throwable
    //   4302	4329	4332	java/lang/Throwable
    //   4319	4347	4350	java/lang/Throwable
    //   4336	4377	4380	java/lang/Throwable
    //   4354	4388	4388	java/lang/Throwable
    //   4410	4421	4424	java/lang/Throwable
    //   4434	5160	5161	java/lang/Throwable
    //   4524	4538	4538	java/lang/Throwable
    //   4549	4562	4565	java/lang/Throwable
    //   4554	4577	4580	java/lang/Throwable
    //   4569	4595	4598	java/lang/Throwable
    //   4584	4625	4628	java/lang/Throwable
    //   4691	4718	4721	java/lang/Throwable
    //   4708	4736	4739	java/lang/Throwable
    //   4725	4766	4769	java/lang/Throwable
    //   4743	4777	4777	java/lang/Throwable
    //   4799	4810	4813	java/lang/Throwable
    //   4866	4880	4880	java/lang/Throwable
    //   4891	4904	4907	java/lang/Throwable
    //   4896	4919	4922	java/lang/Throwable
    //   4911	4937	4940	java/lang/Throwable
    //   4926	4967	4970	java/lang/Throwable
    //   5033	5060	5063	java/lang/Throwable
    //   5050	5078	5081	java/lang/Throwable
    //   5067	5108	5111	java/lang/Throwable
    //   5085	5119	5119	java/lang/Throwable
    //   5141	5152	5155	java/lang/Throwable
  }
  
  static void ZN(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #34
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'A\\t¤,\\fR]¬Foðj¨xD(~½óHªèUÎ°a`gE>¹?aàu0´±wÓrF;`HoQ¾6ª>u²ÕåVÒ oÑ?\\tGg\\r"¶[\\tJÜß~5ØãN\\t8æ9ü0Ëls#ø\\t1ÃNoy\\tg4"á¸qîx ý oÏçÙuu\\fÑßè Ïüã$®ËrÞd@HaØe×M4\\tµfù\\t`î8ñÓ¸\\bä\\t0ÆãkëÝ\\tö×í^$Ã\\t¡ù@3¢6hC\\tÂ'Î7§nÀ\\t\\ff),2ÌÑv\\tÓìeS»/ü\\tìJ¬¯¡Ä!\\tuª8°Édºð\\tgðzûhuÁ ÛzQóÙb»£')£8åÒ£XË%¹C@oÌe7Ö\\f\\tåVrÝ6V\\tÕet»Ú¤\\tRÜtUé¤\\tÄVÝ¼!½MP©G_»*LKj%wÐZ!ÏmlÚq£Õ\\ncatÔJG$cÜøj#8^µñ!±àÜÈO'Ùî·l¸Î4rUûpd-&øP \\tÕs,Kf,I·\\t+Ðóÿ°èLW\\tSuüKQ~oJÒ\\t\\tE·M8¾Z2 ^®6X^|\\t\\rAåö* ÃÌºMùXÍ}/[$»:'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #77
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #88
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
    //   68: ldc 'ùG«ÄÒ¸Ó\\tIbj$üë0'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #23
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
    //   129: putstatic burp/Zrx5.a : [Ljava/lang/String;
    //   132: bipush #34
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrx5.b : [Ljava/lang/String;
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
    //   212: bipush #100
    //   214: goto -> 244
    //   217: bipush #123
    //   219: goto -> 244
    //   222: bipush #21
    //   224: goto -> 244
    //   227: bipush #114
    //   229: goto -> 244
    //   232: bipush #45
    //   234: goto -> 244
    //   237: bipush #46
    //   239: goto -> 244
    //   242: bipush #44
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
    //   304: sipush #-8202
    //   307: sipush #7508
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zrx5.ZE : Ljava/lang/Object;
    //   319: sipush #-8215
    //   322: sipush #-31799
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zrx5.ZD : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFDFF6) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrx5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */