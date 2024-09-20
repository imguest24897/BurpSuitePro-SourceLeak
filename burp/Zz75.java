package burp;

import java.math.BigInteger;

class Zz75 extends ClassLoader {
  static String ZT;
  
  static Object ZX;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZI(Object paramObject) {
    Zsf7.ZS = a(13919, 1525);
    Zsf7.Zg = new BigInteger(a(13902, -7615));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zza8.Zm.charAt(Math.abs(((BigInteger)Zlhy.ZN).intValue() % 32)) <= Zza8.Zm.charAt(Math.abs(((BigInteger)Zlhy.ZN).intValue() % 32))) {
          try {
            Zrcy.Zs(Class.forName(a(13891, -28009)));
            if (bool)
              Zk5y.ZO(Class.forName(a(13917, -12155))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zk5y.ZO(Class.forName(a(13917, -12155)));
    } catch (Throwable throwable) {}
  }
  
  static void ZS(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZR(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Ze5t.Zc : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zsj5.Zv : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zxn5.Zd : Ljava/lang/Object;
    //   22: sipush #13890
    //   25: sipush #-12672
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zz5d
    //   34: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   37: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   40: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   43: astore_3
    //   44: aload_3
    //   45: arraylength
    //   46: istore #4
    //   48: iconst_0
    //   49: istore #5
    //   51: iload #5
    //   53: iload #4
    //   55: if_icmpge -> 192
    //   58: aload_3
    //   59: iload #5
    //   61: aaload
    //   62: astore #6
    //   64: aload #6
    //   66: invokevirtual getModifiers : ()I
    //   69: invokestatic isStatic : (I)Z
    //   72: ifne -> 82
    //   75: goto -> 185
    //   78: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   81: athrow
    //   82: aload #6
    //   84: invokevirtual getType : ()Ljava/lang/Class;
    //   87: astore #7
    //   89: aload #7
    //   91: ifnull -> 172
    //   94: aload #7
    //   96: invokevirtual isPrimitive : ()Z
    //   99: ifne -> 172
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   108: athrow
    //   109: aload #7
    //   111: invokevirtual getPackage : ()Ljava/lang/Package;
    //   114: ifnull -> 172
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   123: athrow
    //   124: aload #7
    //   126: invokevirtual getPackage : ()Ljava/lang/Package;
    //   129: invokevirtual getName : ()Ljava/lang/String;
    //   132: ifnull -> 172
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   141: athrow
    //   142: aload #7
    //   144: invokevirtual getPackage : ()Ljava/lang/Package;
    //   147: invokevirtual getName : ()Ljava/lang/String;
    //   150: sipush #13900
    //   153: sipush #-17316
    //   156: invokestatic a : (II)Ljava/lang/String;
    //   159: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   162: ifne -> 172
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   171: athrow
    //   172: aload #6
    //   174: iconst_1
    //   175: invokevirtual setAccessible : (Z)V
    //   178: aload #6
    //   180: aconst_null
    //   181: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   184: pop
    //   185: iinc #5, 1
    //   188: iload_2
    //   189: ifne -> 51
    //   192: sipush #13913
    //   195: sipush #21053
    //   198: invokestatic a : (II)Ljava/lang/String;
    //   201: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   204: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   207: astore_3
    //   208: aload_3
    //   209: arraylength
    //   210: istore #4
    //   212: iconst_0
    //   213: istore #5
    //   215: iload #5
    //   217: iload #4
    //   219: if_icmpge -> 351
    //   222: aload_3
    //   223: iload #5
    //   225: aaload
    //   226: astore #6
    //   228: aload #6
    //   230: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   233: pop
    //   234: aload #6
    //   236: invokevirtual getModifiers : ()I
    //   239: invokestatic isStatic : (I)Z
    //   242: ifeq -> 337
    //   245: aload #6
    //   247: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   250: arraylength
    //   251: iconst_2
    //   252: if_icmpne -> 337
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   261: athrow
    //   262: aload #6
    //   264: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   267: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   270: invokevirtual equals : (Ljava/lang/Object;)Z
    //   273: ifeq -> 337
    //   276: goto -> 283
    //   279: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   282: athrow
    //   283: aload #6
    //   285: iconst_1
    //   286: invokevirtual setAccessible : (Z)V
    //   289: aload #6
    //   291: aconst_null
    //   292: iconst_2
    //   293: anewarray java/lang/Object
    //   296: dup
    //   297: iconst_0
    //   298: aload_0
    //   299: aastore
    //   300: dup
    //   301: iconst_1
    //   302: aload_1
    //   303: ifnonnull -> 321
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   312: athrow
    //   313: aload_1
    //   314: goto -> 328
    //   317: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   320: athrow
    //   321: aload_1
    //   322: checkcast [B
    //   325: invokevirtual clone : ()Ljava/lang/Object;
    //   328: aastore
    //   329: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   332: pop
    //   333: iload_2
    //   334: ifne -> 351
    //   337: iinc #5, 1
    //   340: iload_2
    //   341: ifne -> 215
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   350: athrow
    //   351: getstatic burp/Zzym.ZK : Ljava/lang/Object;
    //   354: checkcast java/math/BigInteger
    //   357: invokevirtual intValue : ()I
    //   360: i2l
    //   361: invokestatic currentTimeMillis : ()J
    //   364: ladd
    //   365: getstatic burp/Zgzv.Zb : Ljava/lang/Object;
    //   368: checkcast java/math/BigInteger
    //   371: invokevirtual intValue : ()I
    //   374: i2l
    //   375: lcmp
    //   376: ifge -> 708
    //   379: sipush #13914
    //   382: sipush #957
    //   385: invokestatic a : (II)Ljava/lang/String;
    //   388: iconst_1
    //   389: ldc burp/Zsej
    //   391: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   394: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   397: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   400: astore_3
    //   401: aload_3
    //   402: arraylength
    //   403: istore #4
    //   405: iconst_0
    //   406: istore #5
    //   408: iload #5
    //   410: iload #4
    //   412: if_icmpge -> 549
    //   415: aload_3
    //   416: iload #5
    //   418: aaload
    //   419: astore #6
    //   421: aload #6
    //   423: invokevirtual getModifiers : ()I
    //   426: invokestatic isStatic : (I)Z
    //   429: ifne -> 439
    //   432: goto -> 542
    //   435: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   438: athrow
    //   439: aload #6
    //   441: invokevirtual getType : ()Ljava/lang/Class;
    //   444: astore #7
    //   446: aload #7
    //   448: ifnull -> 529
    //   451: aload #7
    //   453: invokevirtual isPrimitive : ()Z
    //   456: ifne -> 529
    //   459: goto -> 466
    //   462: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   465: athrow
    //   466: aload #7
    //   468: invokevirtual getPackage : ()Ljava/lang/Package;
    //   471: ifnull -> 529
    //   474: goto -> 481
    //   477: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   480: athrow
    //   481: aload #7
    //   483: invokevirtual getPackage : ()Ljava/lang/Package;
    //   486: invokevirtual getName : ()Ljava/lang/String;
    //   489: ifnull -> 529
    //   492: goto -> 499
    //   495: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   498: athrow
    //   499: aload #7
    //   501: invokevirtual getPackage : ()Ljava/lang/Package;
    //   504: invokevirtual getName : ()Ljava/lang/String;
    //   507: sipush #13918
    //   510: sipush #-23566
    //   513: invokestatic a : (II)Ljava/lang/String;
    //   516: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   519: ifne -> 529
    //   522: goto -> 529
    //   525: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   528: athrow
    //   529: aload #6
    //   531: iconst_1
    //   532: invokevirtual setAccessible : (Z)V
    //   535: aload #6
    //   537: aconst_null
    //   538: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   541: pop
    //   542: iinc #5, 1
    //   545: iload_2
    //   546: ifne -> 408
    //   549: sipush #13904
    //   552: sipush #-11986
    //   555: invokestatic a : (II)Ljava/lang/String;
    //   558: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   561: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   564: astore_3
    //   565: aload_3
    //   566: arraylength
    //   567: istore #4
    //   569: iconst_0
    //   570: istore #5
    //   572: iload #5
    //   574: iload #4
    //   576: if_icmpge -> 708
    //   579: aload_3
    //   580: iload #5
    //   582: aaload
    //   583: astore #6
    //   585: aload #6
    //   587: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   590: pop
    //   591: aload #6
    //   593: invokevirtual getModifiers : ()I
    //   596: invokestatic isStatic : (I)Z
    //   599: ifeq -> 694
    //   602: aload #6
    //   604: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   607: arraylength
    //   608: iconst_2
    //   609: if_icmpne -> 694
    //   612: goto -> 619
    //   615: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   618: athrow
    //   619: aload #6
    //   621: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   624: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   627: invokevirtual equals : (Ljava/lang/Object;)Z
    //   630: ifeq -> 694
    //   633: goto -> 640
    //   636: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   639: athrow
    //   640: aload #6
    //   642: iconst_1
    //   643: invokevirtual setAccessible : (Z)V
    //   646: aload #6
    //   648: aconst_null
    //   649: iconst_2
    //   650: anewarray java/lang/Object
    //   653: dup
    //   654: iconst_0
    //   655: aload_0
    //   656: aastore
    //   657: dup
    //   658: iconst_1
    //   659: aload_1
    //   660: ifnonnull -> 678
    //   663: goto -> 670
    //   666: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   669: athrow
    //   670: aload_1
    //   671: goto -> 685
    //   674: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   677: athrow
    //   678: aload_1
    //   679: checkcast [B
    //   682: invokevirtual clone : ()Ljava/lang/Object;
    //   685: aastore
    //   686: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   689: pop
    //   690: iload_2
    //   691: ifne -> 708
    //   694: iinc #5, 1
    //   697: iload_2
    //   698: ifne -> 572
    //   701: goto -> 708
    //   704: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   707: athrow
    //   708: iconst_0
    //   709: istore_3
    //   710: getstatic burp/Zr1z.ZB : Ljava/lang/String;
    //   713: getstatic burp/Zr1z.Zi : Ljava/lang/Object;
    //   716: checkcast java/math/BigInteger
    //   719: invokevirtual intValue : ()I
    //   722: bipush #32
    //   724: irem
    //   725: invokestatic abs : (I)I
    //   728: invokevirtual charAt : (I)C
    //   731: getstatic burp/Zmsn.ZD : Ljava/lang/String;
    //   734: getstatic burp/Zrhp.Zw : Ljava/lang/Object;
    //   737: checkcast java/math/BigInteger
    //   740: invokevirtual intValue : ()I
    //   743: bipush #32
    //   745: irem
    //   746: invokestatic abs : (I)I
    //   749: invokevirtual charAt : (I)C
    //   752: if_icmpgt -> 1096
    //   755: sipush #13910
    //   758: sipush #25672
    //   761: invokestatic a : (II)Ljava/lang/String;
    //   764: iconst_1
    //   765: ldc burp/Zrpu
    //   767: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   770: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   773: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   776: astore #4
    //   778: aload #4
    //   780: arraylength
    //   781: istore #5
    //   783: iconst_0
    //   784: istore #6
    //   786: iload #6
    //   788: iload #5
    //   790: if_icmpge -> 928
    //   793: aload #4
    //   795: iload #6
    //   797: aaload
    //   798: astore #7
    //   800: aload #7
    //   802: invokevirtual getModifiers : ()I
    //   805: invokestatic isStatic : (I)Z
    //   808: ifne -> 818
    //   811: goto -> 921
    //   814: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   817: athrow
    //   818: aload #7
    //   820: invokevirtual getType : ()Ljava/lang/Class;
    //   823: astore #8
    //   825: aload #8
    //   827: ifnull -> 908
    //   830: aload #8
    //   832: invokevirtual isPrimitive : ()Z
    //   835: ifne -> 908
    //   838: goto -> 845
    //   841: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   844: athrow
    //   845: aload #8
    //   847: invokevirtual getPackage : ()Ljava/lang/Package;
    //   850: ifnull -> 908
    //   853: goto -> 860
    //   856: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   859: athrow
    //   860: aload #8
    //   862: invokevirtual getPackage : ()Ljava/lang/Package;
    //   865: invokevirtual getName : ()Ljava/lang/String;
    //   868: ifnull -> 908
    //   871: goto -> 878
    //   874: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   877: athrow
    //   878: aload #8
    //   880: invokevirtual getPackage : ()Ljava/lang/Package;
    //   883: invokevirtual getName : ()Ljava/lang/String;
    //   886: sipush #13918
    //   889: sipush #-23566
    //   892: invokestatic a : (II)Ljava/lang/String;
    //   895: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   898: ifne -> 908
    //   901: goto -> 908
    //   904: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   907: athrow
    //   908: aload #7
    //   910: iconst_1
    //   911: invokevirtual setAccessible : (Z)V
    //   914: aload #7
    //   916: aconst_null
    //   917: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   920: pop
    //   921: iinc #6, 1
    //   924: iload_2
    //   925: ifne -> 786
    //   928: sipush #13896
    //   931: sipush #-31045
    //   934: invokestatic a : (II)Ljava/lang/String;
    //   937: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   940: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   943: astore #4
    //   945: aload #4
    //   947: arraylength
    //   948: istore #5
    //   950: iconst_0
    //   951: istore #6
    //   953: iload #6
    //   955: iload #5
    //   957: if_icmpge -> 1093
    //   960: aload #4
    //   962: iload #6
    //   964: aaload
    //   965: astore #7
    //   967: aload #7
    //   969: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   972: pop
    //   973: aload #7
    //   975: invokevirtual getModifiers : ()I
    //   978: invokestatic isStatic : (I)Z
    //   981: ifeq -> 1079
    //   984: aload #7
    //   986: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   989: arraylength
    //   990: iconst_2
    //   991: if_icmpne -> 1079
    //   994: goto -> 1001
    //   997: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1000: athrow
    //   1001: aload #7
    //   1003: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1006: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1009: if_acmpne -> 1079
    //   1012: goto -> 1019
    //   1015: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1018: athrow
    //   1019: aload #7
    //   1021: iconst_1
    //   1022: invokevirtual setAccessible : (Z)V
    //   1025: aload #7
    //   1027: aconst_null
    //   1028: iconst_2
    //   1029: anewarray java/lang/Object
    //   1032: dup
    //   1033: iconst_0
    //   1034: aload_0
    //   1035: aastore
    //   1036: dup
    //   1037: iconst_1
    //   1038: aload_1
    //   1039: ifnonnull -> 1057
    //   1042: goto -> 1049
    //   1045: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1048: athrow
    //   1049: aload_1
    //   1050: goto -> 1064
    //   1053: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1056: athrow
    //   1057: aload_1
    //   1058: checkcast [B
    //   1061: invokevirtual clone : ()Ljava/lang/Object;
    //   1064: aastore
    //   1065: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1068: checkcast java/lang/Boolean
    //   1071: invokevirtual booleanValue : ()Z
    //   1074: istore_3
    //   1075: iload_2
    //   1076: ifne -> 1093
    //   1079: iinc #6, 1
    //   1082: iload_2
    //   1083: ifne -> 953
    //   1086: goto -> 1093
    //   1089: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1092: athrow
    //   1093: goto -> 1434
    //   1096: sipush #13888
    //   1099: sipush #11358
    //   1102: invokestatic a : (II)Ljava/lang/String;
    //   1105: iconst_1
    //   1106: ldc burp/Ztp
    //   1108: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1111: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1114: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1117: astore #4
    //   1119: aload #4
    //   1121: arraylength
    //   1122: istore #5
    //   1124: iconst_0
    //   1125: istore #6
    //   1127: iload #6
    //   1129: iload #5
    //   1131: if_icmpge -> 1269
    //   1134: aload #4
    //   1136: iload #6
    //   1138: aaload
    //   1139: astore #7
    //   1141: aload #7
    //   1143: invokevirtual getModifiers : ()I
    //   1146: invokestatic isStatic : (I)Z
    //   1149: ifne -> 1159
    //   1152: goto -> 1262
    //   1155: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1158: athrow
    //   1159: aload #7
    //   1161: invokevirtual getType : ()Ljava/lang/Class;
    //   1164: astore #8
    //   1166: aload #8
    //   1168: ifnull -> 1249
    //   1171: aload #8
    //   1173: invokevirtual isPrimitive : ()Z
    //   1176: ifne -> 1249
    //   1179: goto -> 1186
    //   1182: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1185: athrow
    //   1186: aload #8
    //   1188: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1191: ifnull -> 1249
    //   1194: goto -> 1201
    //   1197: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1200: athrow
    //   1201: aload #8
    //   1203: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1206: invokevirtual getName : ()Ljava/lang/String;
    //   1209: ifnull -> 1249
    //   1212: goto -> 1219
    //   1215: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1218: athrow
    //   1219: aload #8
    //   1221: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1224: invokevirtual getName : ()Ljava/lang/String;
    //   1227: sipush #13918
    //   1230: sipush #-23566
    //   1233: invokestatic a : (II)Ljava/lang/String;
    //   1236: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1239: ifne -> 1249
    //   1242: goto -> 1249
    //   1245: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1248: athrow
    //   1249: aload #7
    //   1251: iconst_1
    //   1252: invokevirtual setAccessible : (Z)V
    //   1255: aload #7
    //   1257: aconst_null
    //   1258: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1261: pop
    //   1262: iinc #6, 1
    //   1265: iload_2
    //   1266: ifne -> 1127
    //   1269: sipush #13895
    //   1272: sipush #30254
    //   1275: invokestatic a : (II)Ljava/lang/String;
    //   1278: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1281: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1284: astore #4
    //   1286: aload #4
    //   1288: arraylength
    //   1289: istore #5
    //   1291: iconst_0
    //   1292: istore #6
    //   1294: iload #6
    //   1296: iload #5
    //   1298: if_icmpge -> 1434
    //   1301: aload #4
    //   1303: iload #6
    //   1305: aaload
    //   1306: astore #7
    //   1308: aload #7
    //   1310: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1313: pop
    //   1314: aload #7
    //   1316: invokevirtual getModifiers : ()I
    //   1319: invokestatic isStatic : (I)Z
    //   1322: ifeq -> 1420
    //   1325: aload #7
    //   1327: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1330: arraylength
    //   1331: iconst_2
    //   1332: if_icmpne -> 1420
    //   1335: goto -> 1342
    //   1338: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1341: athrow
    //   1342: aload #7
    //   1344: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1347: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1350: if_acmpne -> 1420
    //   1353: goto -> 1360
    //   1356: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1359: athrow
    //   1360: aload #7
    //   1362: iconst_1
    //   1363: invokevirtual setAccessible : (Z)V
    //   1366: aload #7
    //   1368: aconst_null
    //   1369: iconst_2
    //   1370: anewarray java/lang/Object
    //   1373: dup
    //   1374: iconst_0
    //   1375: aload_0
    //   1376: aastore
    //   1377: dup
    //   1378: iconst_1
    //   1379: aload_1
    //   1380: ifnonnull -> 1398
    //   1383: goto -> 1390
    //   1386: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1389: athrow
    //   1390: aload_1
    //   1391: goto -> 1405
    //   1394: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1397: athrow
    //   1398: aload_1
    //   1399: checkcast [B
    //   1402: invokevirtual clone : ()Ljava/lang/Object;
    //   1405: aastore
    //   1406: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1409: checkcast java/lang/Boolean
    //   1412: invokevirtual booleanValue : ()Z
    //   1415: istore_3
    //   1416: iload_2
    //   1417: ifne -> 1434
    //   1420: iinc #6, 1
    //   1423: iload_2
    //   1424: ifne -> 1294
    //   1427: goto -> 1434
    //   1430: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1433: athrow
    //   1434: iload_3
    //   1435: ifeq -> 1440
    //   1438: iload_3
    //   1439: ireturn
    //   1440: getstatic burp/Zmj8.ZL : Ljava/lang/String;
    //   1443: getstatic burp/Zs_v.Zs : Ljava/lang/Object;
    //   1446: checkcast java/math/BigInteger
    //   1449: invokevirtual intValue : ()I
    //   1452: bipush #32
    //   1454: irem
    //   1455: invokestatic abs : (I)I
    //   1458: invokevirtual charAt : (I)C
    //   1461: getstatic burp/Zk7e.ZP : Ljava/lang/String;
    //   1464: getstatic burp/Zs34.ZE : Ljava/lang/Object;
    //   1467: checkcast java/math/BigInteger
    //   1470: invokevirtual intValue : ()I
    //   1473: bipush #32
    //   1475: irem
    //   1476: invokestatic abs : (I)I
    //   1479: invokevirtual charAt : (I)C
    //   1482: if_icmple -> 1827
    //   1485: sipush #13899
    //   1488: sipush #-9294
    //   1491: invokestatic a : (II)Ljava/lang/String;
    //   1494: iconst_1
    //   1495: ldc burp/Zmzj
    //   1497: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1500: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1503: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1506: astore #4
    //   1508: aload #4
    //   1510: arraylength
    //   1511: istore #5
    //   1513: iconst_0
    //   1514: istore #6
    //   1516: iload #6
    //   1518: iload #5
    //   1520: if_icmpge -> 1658
    //   1523: aload #4
    //   1525: iload #6
    //   1527: aaload
    //   1528: astore #7
    //   1530: aload #7
    //   1532: invokevirtual getModifiers : ()I
    //   1535: invokestatic isStatic : (I)Z
    //   1538: ifne -> 1548
    //   1541: goto -> 1651
    //   1544: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1547: athrow
    //   1548: aload #7
    //   1550: invokevirtual getType : ()Ljava/lang/Class;
    //   1553: astore #8
    //   1555: aload #8
    //   1557: ifnull -> 1638
    //   1560: aload #8
    //   1562: invokevirtual isPrimitive : ()Z
    //   1565: ifne -> 1638
    //   1568: goto -> 1575
    //   1571: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1574: athrow
    //   1575: aload #8
    //   1577: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1580: ifnull -> 1638
    //   1583: goto -> 1590
    //   1586: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1589: athrow
    //   1590: aload #8
    //   1592: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1595: invokevirtual getName : ()Ljava/lang/String;
    //   1598: ifnull -> 1638
    //   1601: goto -> 1608
    //   1604: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1607: athrow
    //   1608: aload #8
    //   1610: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1613: invokevirtual getName : ()Ljava/lang/String;
    //   1616: sipush #13918
    //   1619: sipush #-23566
    //   1622: invokestatic a : (II)Ljava/lang/String;
    //   1625: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1628: ifne -> 1638
    //   1631: goto -> 1638
    //   1634: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1637: athrow
    //   1638: aload #7
    //   1640: iconst_1
    //   1641: invokevirtual setAccessible : (Z)V
    //   1644: aload #7
    //   1646: aconst_null
    //   1647: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1650: pop
    //   1651: iinc #6, 1
    //   1654: iload_2
    //   1655: ifne -> 1516
    //   1658: sipush #13901
    //   1661: sipush #9397
    //   1664: invokestatic a : (II)Ljava/lang/String;
    //   1667: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1670: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1673: astore #4
    //   1675: aload #4
    //   1677: arraylength
    //   1678: istore #5
    //   1680: iconst_0
    //   1681: istore #6
    //   1683: iload #6
    //   1685: iload #5
    //   1687: if_icmpge -> 1823
    //   1690: aload #4
    //   1692: iload #6
    //   1694: aaload
    //   1695: astore #7
    //   1697: aload #7
    //   1699: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1702: pop
    //   1703: aload #7
    //   1705: invokevirtual getModifiers : ()I
    //   1708: invokestatic isStatic : (I)Z
    //   1711: ifeq -> 1809
    //   1714: aload #7
    //   1716: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1719: arraylength
    //   1720: iconst_2
    //   1721: if_icmpne -> 1809
    //   1724: goto -> 1731
    //   1727: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1730: athrow
    //   1731: aload #7
    //   1733: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1736: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1739: if_acmpne -> 1809
    //   1742: goto -> 1749
    //   1745: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1748: athrow
    //   1749: aload #7
    //   1751: iconst_1
    //   1752: invokevirtual setAccessible : (Z)V
    //   1755: aload #7
    //   1757: aconst_null
    //   1758: iconst_2
    //   1759: anewarray java/lang/Object
    //   1762: dup
    //   1763: iconst_0
    //   1764: aload_0
    //   1765: aastore
    //   1766: dup
    //   1767: iconst_1
    //   1768: aload_1
    //   1769: ifnonnull -> 1787
    //   1772: goto -> 1779
    //   1775: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1778: athrow
    //   1779: aload_1
    //   1780: goto -> 1794
    //   1783: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1786: athrow
    //   1787: aload_1
    //   1788: checkcast [B
    //   1791: invokevirtual clone : ()Ljava/lang/Object;
    //   1794: aastore
    //   1795: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1798: checkcast java/lang/Boolean
    //   1801: invokevirtual booleanValue : ()Z
    //   1804: istore_3
    //   1805: iload_2
    //   1806: ifne -> 1823
    //   1809: iinc #6, 1
    //   1812: iload_2
    //   1813: ifne -> 1683
    //   1816: goto -> 1823
    //   1819: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1822: athrow
    //   1823: iload_2
    //   1824: ifne -> 2165
    //   1827: sipush #13894
    //   1830: sipush #25124
    //   1833: invokestatic a : (II)Ljava/lang/String;
    //   1836: iconst_1
    //   1837: ldc burp/Zsk4
    //   1839: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1842: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1845: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1848: astore #4
    //   1850: aload #4
    //   1852: arraylength
    //   1853: istore #5
    //   1855: iconst_0
    //   1856: istore #6
    //   1858: iload #6
    //   1860: iload #5
    //   1862: if_icmpge -> 2000
    //   1865: aload #4
    //   1867: iload #6
    //   1869: aaload
    //   1870: astore #7
    //   1872: aload #7
    //   1874: invokevirtual getModifiers : ()I
    //   1877: invokestatic isStatic : (I)Z
    //   1880: ifne -> 1890
    //   1883: goto -> 1993
    //   1886: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1889: athrow
    //   1890: aload #7
    //   1892: invokevirtual getType : ()Ljava/lang/Class;
    //   1895: astore #8
    //   1897: aload #8
    //   1899: ifnull -> 1980
    //   1902: aload #8
    //   1904: invokevirtual isPrimitive : ()Z
    //   1907: ifne -> 1980
    //   1910: goto -> 1917
    //   1913: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1916: athrow
    //   1917: aload #8
    //   1919: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1922: ifnull -> 1980
    //   1925: goto -> 1932
    //   1928: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1931: athrow
    //   1932: aload #8
    //   1934: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1937: invokevirtual getName : ()Ljava/lang/String;
    //   1940: ifnull -> 1980
    //   1943: goto -> 1950
    //   1946: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1949: athrow
    //   1950: aload #8
    //   1952: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1955: invokevirtual getName : ()Ljava/lang/String;
    //   1958: sipush #13918
    //   1961: sipush #-23566
    //   1964: invokestatic a : (II)Ljava/lang/String;
    //   1967: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1970: ifne -> 1980
    //   1973: goto -> 1980
    //   1976: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1979: athrow
    //   1980: aload #7
    //   1982: iconst_1
    //   1983: invokevirtual setAccessible : (Z)V
    //   1986: aload #7
    //   1988: aconst_null
    //   1989: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1992: pop
    //   1993: iinc #6, 1
    //   1996: iload_2
    //   1997: ifne -> 1858
    //   2000: sipush #13893
    //   2003: sipush #-2659
    //   2006: invokestatic a : (II)Ljava/lang/String;
    //   2009: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2012: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2015: astore #4
    //   2017: aload #4
    //   2019: arraylength
    //   2020: istore #5
    //   2022: iconst_0
    //   2023: istore #6
    //   2025: iload #6
    //   2027: iload #5
    //   2029: if_icmpge -> 2165
    //   2032: aload #4
    //   2034: iload #6
    //   2036: aaload
    //   2037: astore #7
    //   2039: aload #7
    //   2041: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2044: pop
    //   2045: aload #7
    //   2047: invokevirtual getModifiers : ()I
    //   2050: invokestatic isStatic : (I)Z
    //   2053: ifeq -> 2151
    //   2056: aload #7
    //   2058: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2061: arraylength
    //   2062: iconst_2
    //   2063: if_icmpne -> 2151
    //   2066: goto -> 2073
    //   2069: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2072: athrow
    //   2073: aload #7
    //   2075: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2078: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2081: if_acmpne -> 2151
    //   2084: goto -> 2091
    //   2087: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2090: athrow
    //   2091: aload #7
    //   2093: iconst_1
    //   2094: invokevirtual setAccessible : (Z)V
    //   2097: aload #7
    //   2099: aconst_null
    //   2100: iconst_2
    //   2101: anewarray java/lang/Object
    //   2104: dup
    //   2105: iconst_0
    //   2106: aload_0
    //   2107: aastore
    //   2108: dup
    //   2109: iconst_1
    //   2110: aload_1
    //   2111: ifnonnull -> 2129
    //   2114: goto -> 2121
    //   2117: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2120: athrow
    //   2121: aload_1
    //   2122: goto -> 2136
    //   2125: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2128: athrow
    //   2129: aload_1
    //   2130: checkcast [B
    //   2133: invokevirtual clone : ()Ljava/lang/Object;
    //   2136: aastore
    //   2137: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2140: checkcast java/lang/Boolean
    //   2143: invokevirtual booleanValue : ()Z
    //   2146: istore_3
    //   2147: iload_2
    //   2148: ifne -> 2165
    //   2151: iinc #6, 1
    //   2154: iload_2
    //   2155: ifne -> 2025
    //   2158: goto -> 2165
    //   2161: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2164: athrow
    //   2165: iload_3
    //   2166: ifeq -> 2171
    //   2169: iload_3
    //   2170: ireturn
    //   2171: getstatic burp/Ztkh.ZP : Ljava/lang/String;
    //   2174: getstatic burp/Zk7e.ZW : Ljava/lang/Object;
    //   2177: checkcast java/math/BigInteger
    //   2180: invokevirtual intValue : ()I
    //   2183: bipush #32
    //   2185: irem
    //   2186: invokestatic abs : (I)I
    //   2189: invokevirtual charAt : (I)C
    //   2192: getstatic burp/Zgva.ZV : Ljava/lang/String;
    //   2195: getstatic burp/Zt3f.Zp : Ljava/lang/Object;
    //   2198: checkcast java/math/BigInteger
    //   2201: invokevirtual intValue : ()I
    //   2204: bipush #32
    //   2206: irem
    //   2207: invokestatic abs : (I)I
    //   2210: invokevirtual charAt : (I)C
    //   2213: if_icmple -> 2558
    //   2216: sipush #13892
    //   2219: sipush #-6432
    //   2222: invokestatic a : (II)Ljava/lang/String;
    //   2225: iconst_1
    //   2226: ldc burp/Zxl5
    //   2228: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2231: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2234: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2237: astore #4
    //   2239: aload #4
    //   2241: arraylength
    //   2242: istore #5
    //   2244: iconst_0
    //   2245: istore #6
    //   2247: iload #6
    //   2249: iload #5
    //   2251: if_icmpge -> 2389
    //   2254: aload #4
    //   2256: iload #6
    //   2258: aaload
    //   2259: astore #7
    //   2261: aload #7
    //   2263: invokevirtual getModifiers : ()I
    //   2266: invokestatic isStatic : (I)Z
    //   2269: ifne -> 2279
    //   2272: goto -> 2382
    //   2275: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2278: athrow
    //   2279: aload #7
    //   2281: invokevirtual getType : ()Ljava/lang/Class;
    //   2284: astore #8
    //   2286: aload #8
    //   2288: ifnull -> 2369
    //   2291: aload #8
    //   2293: invokevirtual isPrimitive : ()Z
    //   2296: ifne -> 2369
    //   2299: goto -> 2306
    //   2302: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2305: athrow
    //   2306: aload #8
    //   2308: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2311: ifnull -> 2369
    //   2314: goto -> 2321
    //   2317: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2320: athrow
    //   2321: aload #8
    //   2323: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2326: invokevirtual getName : ()Ljava/lang/String;
    //   2329: ifnull -> 2369
    //   2332: goto -> 2339
    //   2335: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2338: athrow
    //   2339: aload #8
    //   2341: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2344: invokevirtual getName : ()Ljava/lang/String;
    //   2347: sipush #13918
    //   2350: sipush #-23566
    //   2353: invokestatic a : (II)Ljava/lang/String;
    //   2356: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2359: ifne -> 2369
    //   2362: goto -> 2369
    //   2365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2368: athrow
    //   2369: aload #7
    //   2371: iconst_1
    //   2372: invokevirtual setAccessible : (Z)V
    //   2375: aload #7
    //   2377: aconst_null
    //   2378: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2381: pop
    //   2382: iinc #6, 1
    //   2385: iload_2
    //   2386: ifne -> 2247
    //   2389: sipush #13907
    //   2392: sipush #-5500
    //   2395: invokestatic a : (II)Ljava/lang/String;
    //   2398: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2401: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2404: astore #4
    //   2406: aload #4
    //   2408: arraylength
    //   2409: istore #5
    //   2411: iconst_0
    //   2412: istore #6
    //   2414: iload #6
    //   2416: iload #5
    //   2418: if_icmpge -> 2554
    //   2421: aload #4
    //   2423: iload #6
    //   2425: aaload
    //   2426: astore #7
    //   2428: aload #7
    //   2430: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2433: pop
    //   2434: aload #7
    //   2436: invokevirtual getModifiers : ()I
    //   2439: invokestatic isStatic : (I)Z
    //   2442: ifeq -> 2540
    //   2445: aload #7
    //   2447: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2450: arraylength
    //   2451: iconst_2
    //   2452: if_icmpne -> 2540
    //   2455: goto -> 2462
    //   2458: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2461: athrow
    //   2462: aload #7
    //   2464: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2467: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2470: if_acmpne -> 2540
    //   2473: goto -> 2480
    //   2476: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2479: athrow
    //   2480: aload #7
    //   2482: iconst_1
    //   2483: invokevirtual setAccessible : (Z)V
    //   2486: aload #7
    //   2488: aconst_null
    //   2489: iconst_2
    //   2490: anewarray java/lang/Object
    //   2493: dup
    //   2494: iconst_0
    //   2495: aload_0
    //   2496: aastore
    //   2497: dup
    //   2498: iconst_1
    //   2499: aload_1
    //   2500: ifnonnull -> 2518
    //   2503: goto -> 2510
    //   2506: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2509: athrow
    //   2510: aload_1
    //   2511: goto -> 2525
    //   2514: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2517: athrow
    //   2518: aload_1
    //   2519: checkcast [B
    //   2522: invokevirtual clone : ()Ljava/lang/Object;
    //   2525: aastore
    //   2526: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2529: checkcast java/lang/Boolean
    //   2532: invokevirtual booleanValue : ()Z
    //   2535: istore_3
    //   2536: iload_2
    //   2537: ifne -> 2554
    //   2540: iinc #6, 1
    //   2543: iload_2
    //   2544: ifne -> 2414
    //   2547: goto -> 2554
    //   2550: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2553: athrow
    //   2554: iload_2
    //   2555: ifne -> 2896
    //   2558: sipush #13889
    //   2561: sipush #-7318
    //   2564: invokestatic a : (II)Ljava/lang/String;
    //   2567: iconst_1
    //   2568: ldc burp/Zbzc
    //   2570: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2573: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2576: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2579: astore #4
    //   2581: aload #4
    //   2583: arraylength
    //   2584: istore #5
    //   2586: iconst_0
    //   2587: istore #6
    //   2589: iload #6
    //   2591: iload #5
    //   2593: if_icmpge -> 2731
    //   2596: aload #4
    //   2598: iload #6
    //   2600: aaload
    //   2601: astore #7
    //   2603: aload #7
    //   2605: invokevirtual getModifiers : ()I
    //   2608: invokestatic isStatic : (I)Z
    //   2611: ifne -> 2621
    //   2614: goto -> 2724
    //   2617: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2620: athrow
    //   2621: aload #7
    //   2623: invokevirtual getType : ()Ljava/lang/Class;
    //   2626: astore #8
    //   2628: aload #8
    //   2630: ifnull -> 2711
    //   2633: aload #8
    //   2635: invokevirtual isPrimitive : ()Z
    //   2638: ifne -> 2711
    //   2641: goto -> 2648
    //   2644: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2647: athrow
    //   2648: aload #8
    //   2650: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2653: ifnull -> 2711
    //   2656: goto -> 2663
    //   2659: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2662: athrow
    //   2663: aload #8
    //   2665: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2668: invokevirtual getName : ()Ljava/lang/String;
    //   2671: ifnull -> 2711
    //   2674: goto -> 2681
    //   2677: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2680: athrow
    //   2681: aload #8
    //   2683: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2686: invokevirtual getName : ()Ljava/lang/String;
    //   2689: sipush #13918
    //   2692: sipush #-23566
    //   2695: invokestatic a : (II)Ljava/lang/String;
    //   2698: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2701: ifne -> 2711
    //   2704: goto -> 2711
    //   2707: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2710: athrow
    //   2711: aload #7
    //   2713: iconst_1
    //   2714: invokevirtual setAccessible : (Z)V
    //   2717: aload #7
    //   2719: aconst_null
    //   2720: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2723: pop
    //   2724: iinc #6, 1
    //   2727: iload_2
    //   2728: ifne -> 2589
    //   2731: sipush #13897
    //   2734: sipush #28119
    //   2737: invokestatic a : (II)Ljava/lang/String;
    //   2740: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2743: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2746: astore #4
    //   2748: aload #4
    //   2750: arraylength
    //   2751: istore #5
    //   2753: iconst_0
    //   2754: istore #6
    //   2756: iload #6
    //   2758: iload #5
    //   2760: if_icmpge -> 2896
    //   2763: aload #4
    //   2765: iload #6
    //   2767: aaload
    //   2768: astore #7
    //   2770: aload #7
    //   2772: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2775: pop
    //   2776: aload #7
    //   2778: invokevirtual getModifiers : ()I
    //   2781: invokestatic isStatic : (I)Z
    //   2784: ifeq -> 2882
    //   2787: aload #7
    //   2789: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2792: arraylength
    //   2793: iconst_2
    //   2794: if_icmpne -> 2882
    //   2797: goto -> 2804
    //   2800: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2803: athrow
    //   2804: aload #7
    //   2806: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2809: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2812: if_acmpne -> 2882
    //   2815: goto -> 2822
    //   2818: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2821: athrow
    //   2822: aload #7
    //   2824: iconst_1
    //   2825: invokevirtual setAccessible : (Z)V
    //   2828: aload #7
    //   2830: aconst_null
    //   2831: iconst_2
    //   2832: anewarray java/lang/Object
    //   2835: dup
    //   2836: iconst_0
    //   2837: aload_0
    //   2838: aastore
    //   2839: dup
    //   2840: iconst_1
    //   2841: aload_1
    //   2842: ifnonnull -> 2860
    //   2845: goto -> 2852
    //   2848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2851: athrow
    //   2852: aload_1
    //   2853: goto -> 2867
    //   2856: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2859: athrow
    //   2860: aload_1
    //   2861: checkcast [B
    //   2864: invokevirtual clone : ()Ljava/lang/Object;
    //   2867: aastore
    //   2868: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2871: checkcast java/lang/Boolean
    //   2874: invokevirtual booleanValue : ()Z
    //   2877: istore_3
    //   2878: iload_2
    //   2879: ifne -> 2896
    //   2882: iinc #6, 1
    //   2885: iload_2
    //   2886: ifne -> 2756
    //   2889: goto -> 2896
    //   2892: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2895: athrow
    //   2896: iload_3
    //   2897: ifeq -> 2902
    //   2900: iload_3
    //   2901: ireturn
    //   2902: getstatic burp/Zxg7.Zi : Ljava/lang/String;
    //   2905: getstatic burp/Zsxo.Za : Ljava/lang/Object;
    //   2908: checkcast java/math/BigInteger
    //   2911: invokevirtual intValue : ()I
    //   2914: bipush #32
    //   2916: irem
    //   2917: invokestatic abs : (I)I
    //   2920: invokevirtual charAt : (I)C
    //   2923: getstatic burp/Zzmw.Zd : Ljava/lang/String;
    //   2926: getstatic burp/Zmhi.ZZ : Ljava/lang/Object;
    //   2929: checkcast java/math/BigInteger
    //   2932: invokevirtual intValue : ()I
    //   2935: bipush #32
    //   2937: irem
    //   2938: invokestatic abs : (I)I
    //   2941: invokevirtual charAt : (I)C
    //   2944: if_icmple -> 3289
    //   2947: sipush #13912
    //   2950: sipush #18098
    //   2953: invokestatic a : (II)Ljava/lang/String;
    //   2956: iconst_1
    //   2957: ldc burp/Zxxo
    //   2959: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2962: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2965: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2968: astore #4
    //   2970: aload #4
    //   2972: arraylength
    //   2973: istore #5
    //   2975: iconst_0
    //   2976: istore #6
    //   2978: iload #6
    //   2980: iload #5
    //   2982: if_icmpge -> 3120
    //   2985: aload #4
    //   2987: iload #6
    //   2989: aaload
    //   2990: astore #7
    //   2992: aload #7
    //   2994: invokevirtual getModifiers : ()I
    //   2997: invokestatic isStatic : (I)Z
    //   3000: ifne -> 3010
    //   3003: goto -> 3113
    //   3006: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3009: athrow
    //   3010: aload #7
    //   3012: invokevirtual getType : ()Ljava/lang/Class;
    //   3015: astore #8
    //   3017: aload #8
    //   3019: ifnull -> 3100
    //   3022: aload #8
    //   3024: invokevirtual isPrimitive : ()Z
    //   3027: ifne -> 3100
    //   3030: goto -> 3037
    //   3033: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3036: athrow
    //   3037: aload #8
    //   3039: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3042: ifnull -> 3100
    //   3045: goto -> 3052
    //   3048: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3051: athrow
    //   3052: aload #8
    //   3054: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3057: invokevirtual getName : ()Ljava/lang/String;
    //   3060: ifnull -> 3100
    //   3063: goto -> 3070
    //   3066: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3069: athrow
    //   3070: aload #8
    //   3072: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3075: invokevirtual getName : ()Ljava/lang/String;
    //   3078: sipush #13918
    //   3081: sipush #-23566
    //   3084: invokestatic a : (II)Ljava/lang/String;
    //   3087: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3090: ifne -> 3100
    //   3093: goto -> 3100
    //   3096: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3099: athrow
    //   3100: aload #7
    //   3102: iconst_1
    //   3103: invokevirtual setAccessible : (Z)V
    //   3106: aload #7
    //   3108: aconst_null
    //   3109: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3112: pop
    //   3113: iinc #6, 1
    //   3116: iload_2
    //   3117: ifne -> 2978
    //   3120: sipush #13915
    //   3123: sipush #-20727
    //   3126: invokestatic a : (II)Ljava/lang/String;
    //   3129: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3132: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3135: astore #4
    //   3137: aload #4
    //   3139: arraylength
    //   3140: istore #5
    //   3142: iconst_0
    //   3143: istore #6
    //   3145: iload #6
    //   3147: iload #5
    //   3149: if_icmpge -> 3285
    //   3152: aload #4
    //   3154: iload #6
    //   3156: aaload
    //   3157: astore #7
    //   3159: aload #7
    //   3161: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3164: pop
    //   3165: aload #7
    //   3167: invokevirtual getModifiers : ()I
    //   3170: invokestatic isStatic : (I)Z
    //   3173: ifeq -> 3271
    //   3176: aload #7
    //   3178: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3181: arraylength
    //   3182: iconst_2
    //   3183: if_icmpne -> 3271
    //   3186: goto -> 3193
    //   3189: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3192: athrow
    //   3193: aload #7
    //   3195: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3198: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3201: if_acmpne -> 3271
    //   3204: goto -> 3211
    //   3207: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3210: athrow
    //   3211: aload #7
    //   3213: iconst_1
    //   3214: invokevirtual setAccessible : (Z)V
    //   3217: aload #7
    //   3219: aconst_null
    //   3220: iconst_2
    //   3221: anewarray java/lang/Object
    //   3224: dup
    //   3225: iconst_0
    //   3226: aload_0
    //   3227: aastore
    //   3228: dup
    //   3229: iconst_1
    //   3230: aload_1
    //   3231: ifnonnull -> 3249
    //   3234: goto -> 3241
    //   3237: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3240: athrow
    //   3241: aload_1
    //   3242: goto -> 3256
    //   3245: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3248: athrow
    //   3249: aload_1
    //   3250: checkcast [B
    //   3253: invokevirtual clone : ()Ljava/lang/Object;
    //   3256: aastore
    //   3257: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3260: checkcast java/lang/Boolean
    //   3263: invokevirtual booleanValue : ()Z
    //   3266: istore_3
    //   3267: iload_2
    //   3268: ifne -> 3285
    //   3271: iinc #6, 1
    //   3274: iload_2
    //   3275: ifne -> 3145
    //   3278: goto -> 3285
    //   3281: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3284: athrow
    //   3285: iload_2
    //   3286: ifne -> 3627
    //   3289: sipush #13898
    //   3292: sipush #10939
    //   3295: invokestatic a : (II)Ljava/lang/String;
    //   3298: iconst_1
    //   3299: ldc burp/Zxzv
    //   3301: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3304: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3307: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3310: astore #4
    //   3312: aload #4
    //   3314: arraylength
    //   3315: istore #5
    //   3317: iconst_0
    //   3318: istore #6
    //   3320: iload #6
    //   3322: iload #5
    //   3324: if_icmpge -> 3462
    //   3327: aload #4
    //   3329: iload #6
    //   3331: aaload
    //   3332: astore #7
    //   3334: aload #7
    //   3336: invokevirtual getModifiers : ()I
    //   3339: invokestatic isStatic : (I)Z
    //   3342: ifne -> 3352
    //   3345: goto -> 3455
    //   3348: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3351: athrow
    //   3352: aload #7
    //   3354: invokevirtual getType : ()Ljava/lang/Class;
    //   3357: astore #8
    //   3359: aload #8
    //   3361: ifnull -> 3442
    //   3364: aload #8
    //   3366: invokevirtual isPrimitive : ()Z
    //   3369: ifne -> 3442
    //   3372: goto -> 3379
    //   3375: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3378: athrow
    //   3379: aload #8
    //   3381: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3384: ifnull -> 3442
    //   3387: goto -> 3394
    //   3390: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3393: athrow
    //   3394: aload #8
    //   3396: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3399: invokevirtual getName : ()Ljava/lang/String;
    //   3402: ifnull -> 3442
    //   3405: goto -> 3412
    //   3408: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3411: athrow
    //   3412: aload #8
    //   3414: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3417: invokevirtual getName : ()Ljava/lang/String;
    //   3420: sipush #13918
    //   3423: sipush #-23566
    //   3426: invokestatic a : (II)Ljava/lang/String;
    //   3429: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3432: ifne -> 3442
    //   3435: goto -> 3442
    //   3438: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3441: athrow
    //   3442: aload #7
    //   3444: iconst_1
    //   3445: invokevirtual setAccessible : (Z)V
    //   3448: aload #7
    //   3450: aconst_null
    //   3451: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3454: pop
    //   3455: iinc #6, 1
    //   3458: iload_2
    //   3459: ifne -> 3320
    //   3462: sipush #13916
    //   3465: sipush #3925
    //   3468: invokestatic a : (II)Ljava/lang/String;
    //   3471: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3474: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3477: astore #4
    //   3479: aload #4
    //   3481: arraylength
    //   3482: istore #5
    //   3484: iconst_0
    //   3485: istore #6
    //   3487: iload #6
    //   3489: iload #5
    //   3491: if_icmpge -> 3627
    //   3494: aload #4
    //   3496: iload #6
    //   3498: aaload
    //   3499: astore #7
    //   3501: aload #7
    //   3503: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3506: pop
    //   3507: aload #7
    //   3509: invokevirtual getModifiers : ()I
    //   3512: invokestatic isStatic : (I)Z
    //   3515: ifeq -> 3613
    //   3518: aload #7
    //   3520: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3523: arraylength
    //   3524: iconst_2
    //   3525: if_icmpne -> 3613
    //   3528: goto -> 3535
    //   3531: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3534: athrow
    //   3535: aload #7
    //   3537: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3540: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3543: if_acmpne -> 3613
    //   3546: goto -> 3553
    //   3549: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3552: athrow
    //   3553: aload #7
    //   3555: iconst_1
    //   3556: invokevirtual setAccessible : (Z)V
    //   3559: aload #7
    //   3561: aconst_null
    //   3562: iconst_2
    //   3563: anewarray java/lang/Object
    //   3566: dup
    //   3567: iconst_0
    //   3568: aload_0
    //   3569: aastore
    //   3570: dup
    //   3571: iconst_1
    //   3572: aload_1
    //   3573: ifnonnull -> 3591
    //   3576: goto -> 3583
    //   3579: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3582: athrow
    //   3583: aload_1
    //   3584: goto -> 3598
    //   3587: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3590: athrow
    //   3591: aload_1
    //   3592: checkcast [B
    //   3595: invokevirtual clone : ()Ljava/lang/Object;
    //   3598: aastore
    //   3599: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3602: checkcast java/lang/Boolean
    //   3605: invokevirtual booleanValue : ()Z
    //   3608: istore_3
    //   3609: iload_2
    //   3610: ifne -> 3627
    //   3613: iinc #6, 1
    //   3616: iload_2
    //   3617: ifne -> 3487
    //   3620: goto -> 3627
    //   3623: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3626: athrow
    //   3627: iload_3
    //   3628: ifeq -> 3633
    //   3631: iload_3
    //   3632: ireturn
    //   3633: getstatic burp/Ze82.Zx : Ljava/lang/String;
    //   3636: getstatic burp/Zzym.ZK : Ljava/lang/Object;
    //   3639: checkcast java/math/BigInteger
    //   3642: invokevirtual intValue : ()I
    //   3645: bipush #32
    //   3647: irem
    //   3648: invokestatic abs : (I)I
    //   3651: invokevirtual charAt : (I)C
    //   3654: getstatic burp/Ze64.ZM : Ljava/lang/String;
    //   3657: getstatic burp/Zre5.Zo : Ljava/lang/Object;
    //   3660: checkcast java/math/BigInteger
    //   3663: invokevirtual intValue : ()I
    //   3666: bipush #32
    //   3668: irem
    //   3669: invokestatic abs : (I)I
    //   3672: invokevirtual charAt : (I)C
    //   3675: if_icmple -> 4020
    //   3678: sipush #13911
    //   3681: sipush #282
    //   3684: invokestatic a : (II)Ljava/lang/String;
    //   3687: iconst_1
    //   3688: ldc burp/Zl1z
    //   3690: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3693: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3696: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3699: astore #4
    //   3701: aload #4
    //   3703: arraylength
    //   3704: istore #5
    //   3706: iconst_0
    //   3707: istore #6
    //   3709: iload #6
    //   3711: iload #5
    //   3713: if_icmpge -> 3851
    //   3716: aload #4
    //   3718: iload #6
    //   3720: aaload
    //   3721: astore #7
    //   3723: aload #7
    //   3725: invokevirtual getModifiers : ()I
    //   3728: invokestatic isStatic : (I)Z
    //   3731: ifne -> 3741
    //   3734: goto -> 3844
    //   3737: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3740: athrow
    //   3741: aload #7
    //   3743: invokevirtual getType : ()Ljava/lang/Class;
    //   3746: astore #8
    //   3748: aload #8
    //   3750: ifnull -> 3831
    //   3753: aload #8
    //   3755: invokevirtual isPrimitive : ()Z
    //   3758: ifne -> 3831
    //   3761: goto -> 3768
    //   3764: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3767: athrow
    //   3768: aload #8
    //   3770: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3773: ifnull -> 3831
    //   3776: goto -> 3783
    //   3779: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3782: athrow
    //   3783: aload #8
    //   3785: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3788: invokevirtual getName : ()Ljava/lang/String;
    //   3791: ifnull -> 3831
    //   3794: goto -> 3801
    //   3797: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3800: athrow
    //   3801: aload #8
    //   3803: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3806: invokevirtual getName : ()Ljava/lang/String;
    //   3809: sipush #13918
    //   3812: sipush #-23566
    //   3815: invokestatic a : (II)Ljava/lang/String;
    //   3818: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3821: ifne -> 3831
    //   3824: goto -> 3831
    //   3827: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3830: athrow
    //   3831: aload #7
    //   3833: iconst_1
    //   3834: invokevirtual setAccessible : (Z)V
    //   3837: aload #7
    //   3839: aconst_null
    //   3840: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3843: pop
    //   3844: iinc #6, 1
    //   3847: iload_2
    //   3848: ifne -> 3709
    //   3851: sipush #13906
    //   3854: sipush #13613
    //   3857: invokestatic a : (II)Ljava/lang/String;
    //   3860: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3863: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3866: astore #4
    //   3868: aload #4
    //   3870: arraylength
    //   3871: istore #5
    //   3873: iconst_0
    //   3874: istore #6
    //   3876: iload #6
    //   3878: iload #5
    //   3880: if_icmpge -> 4016
    //   3883: aload #4
    //   3885: iload #6
    //   3887: aaload
    //   3888: astore #7
    //   3890: aload #7
    //   3892: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3895: pop
    //   3896: aload #7
    //   3898: invokevirtual getModifiers : ()I
    //   3901: invokestatic isStatic : (I)Z
    //   3904: ifeq -> 4002
    //   3907: aload #7
    //   3909: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3912: arraylength
    //   3913: iconst_2
    //   3914: if_icmpne -> 4002
    //   3917: goto -> 3924
    //   3920: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3923: athrow
    //   3924: aload #7
    //   3926: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3929: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3932: if_acmpne -> 4002
    //   3935: goto -> 3942
    //   3938: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3941: athrow
    //   3942: aload #7
    //   3944: iconst_1
    //   3945: invokevirtual setAccessible : (Z)V
    //   3948: aload #7
    //   3950: aconst_null
    //   3951: iconst_2
    //   3952: anewarray java/lang/Object
    //   3955: dup
    //   3956: iconst_0
    //   3957: aload_0
    //   3958: aastore
    //   3959: dup
    //   3960: iconst_1
    //   3961: aload_1
    //   3962: ifnonnull -> 3980
    //   3965: goto -> 3972
    //   3968: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3971: athrow
    //   3972: aload_1
    //   3973: goto -> 3987
    //   3976: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3979: athrow
    //   3980: aload_1
    //   3981: checkcast [B
    //   3984: invokevirtual clone : ()Ljava/lang/Object;
    //   3987: aastore
    //   3988: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3991: checkcast java/lang/Boolean
    //   3994: invokevirtual booleanValue : ()Z
    //   3997: istore_3
    //   3998: iload_2
    //   3999: ifne -> 4016
    //   4002: iinc #6, 1
    //   4005: iload_2
    //   4006: ifne -> 3876
    //   4009: goto -> 4016
    //   4012: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4015: athrow
    //   4016: iload_2
    //   4017: ifne -> 4358
    //   4020: sipush #13908
    //   4023: sipush #-1023
    //   4026: invokestatic a : (II)Ljava/lang/String;
    //   4029: iconst_1
    //   4030: ldc burp/Zlhm
    //   4032: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4035: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4038: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4041: astore #4
    //   4043: aload #4
    //   4045: arraylength
    //   4046: istore #5
    //   4048: iconst_0
    //   4049: istore #6
    //   4051: iload #6
    //   4053: iload #5
    //   4055: if_icmpge -> 4193
    //   4058: aload #4
    //   4060: iload #6
    //   4062: aaload
    //   4063: astore #7
    //   4065: aload #7
    //   4067: invokevirtual getModifiers : ()I
    //   4070: invokestatic isStatic : (I)Z
    //   4073: ifne -> 4083
    //   4076: goto -> 4186
    //   4079: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4082: athrow
    //   4083: aload #7
    //   4085: invokevirtual getType : ()Ljava/lang/Class;
    //   4088: astore #8
    //   4090: aload #8
    //   4092: ifnull -> 4173
    //   4095: aload #8
    //   4097: invokevirtual isPrimitive : ()Z
    //   4100: ifne -> 4173
    //   4103: goto -> 4110
    //   4106: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4109: athrow
    //   4110: aload #8
    //   4112: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4115: ifnull -> 4173
    //   4118: goto -> 4125
    //   4121: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4124: athrow
    //   4125: aload #8
    //   4127: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4130: invokevirtual getName : ()Ljava/lang/String;
    //   4133: ifnull -> 4173
    //   4136: goto -> 4143
    //   4139: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4142: athrow
    //   4143: aload #8
    //   4145: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4148: invokevirtual getName : ()Ljava/lang/String;
    //   4151: sipush #13918
    //   4154: sipush #-23566
    //   4157: invokestatic a : (II)Ljava/lang/String;
    //   4160: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4163: ifne -> 4173
    //   4166: goto -> 4173
    //   4169: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4172: athrow
    //   4173: aload #7
    //   4175: iconst_1
    //   4176: invokevirtual setAccessible : (Z)V
    //   4179: aload #7
    //   4181: aconst_null
    //   4182: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4185: pop
    //   4186: iinc #6, 1
    //   4189: iload_2
    //   4190: ifne -> 4051
    //   4193: sipush #13903
    //   4196: sipush #-361
    //   4199: invokestatic a : (II)Ljava/lang/String;
    //   4202: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4205: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4208: astore #4
    //   4210: aload #4
    //   4212: arraylength
    //   4213: istore #5
    //   4215: iconst_0
    //   4216: istore #6
    //   4218: iload #6
    //   4220: iload #5
    //   4222: if_icmpge -> 4358
    //   4225: aload #4
    //   4227: iload #6
    //   4229: aaload
    //   4230: astore #7
    //   4232: aload #7
    //   4234: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4237: pop
    //   4238: aload #7
    //   4240: invokevirtual getModifiers : ()I
    //   4243: invokestatic isStatic : (I)Z
    //   4246: ifeq -> 4344
    //   4249: aload #7
    //   4251: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4254: arraylength
    //   4255: iconst_2
    //   4256: if_icmpne -> 4344
    //   4259: goto -> 4266
    //   4262: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4265: athrow
    //   4266: aload #7
    //   4268: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4271: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4274: if_acmpne -> 4344
    //   4277: goto -> 4284
    //   4280: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4283: athrow
    //   4284: aload #7
    //   4286: iconst_1
    //   4287: invokevirtual setAccessible : (Z)V
    //   4290: aload #7
    //   4292: aconst_null
    //   4293: iconst_2
    //   4294: anewarray java/lang/Object
    //   4297: dup
    //   4298: iconst_0
    //   4299: aload_0
    //   4300: aastore
    //   4301: dup
    //   4302: iconst_1
    //   4303: aload_1
    //   4304: ifnonnull -> 4322
    //   4307: goto -> 4314
    //   4310: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4313: athrow
    //   4314: aload_1
    //   4315: goto -> 4329
    //   4318: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4321: athrow
    //   4322: aload_1
    //   4323: checkcast [B
    //   4326: invokevirtual clone : ()Ljava/lang/Object;
    //   4329: aastore
    //   4330: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4333: checkcast java/lang/Boolean
    //   4336: invokevirtual booleanValue : ()Z
    //   4339: istore_3
    //   4340: iload_2
    //   4341: ifne -> 4358
    //   4344: iinc #6, 1
    //   4347: iload_2
    //   4348: ifne -> 4218
    //   4351: goto -> 4358
    //   4354: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4357: athrow
    //   4358: iload_3
    //   4359: ireturn
    //   4360: astore_3
    //   4361: new java/lang/Exception
    //   4364: dup
    //   4365: aload_3
    //   4366: invokevirtual getMessage : ()Ljava/lang/String;
    //   4369: invokespecial <init> : (Ljava/lang/String;)V
    //   4372: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1439	4360	java/lang/Throwable
    //   64	78	78	java/lang/Throwable
    //   89	102	105	java/lang/Throwable
    //   94	117	120	java/lang/Throwable
    //   109	135	138	java/lang/Throwable
    //   124	165	168	java/lang/Throwable
    //   228	255	258	java/lang/Throwable
    //   245	276	279	java/lang/Throwable
    //   262	306	309	java/lang/Throwable
    //   283	317	317	java/lang/Throwable
    //   328	344	347	java/lang/Throwable
    //   421	435	435	java/lang/Throwable
    //   446	459	462	java/lang/Throwable
    //   451	474	477	java/lang/Throwable
    //   466	492	495	java/lang/Throwable
    //   481	522	525	java/lang/Throwable
    //   585	612	615	java/lang/Throwable
    //   602	633	636	java/lang/Throwable
    //   619	663	666	java/lang/Throwable
    //   640	674	674	java/lang/Throwable
    //   685	701	704	java/lang/Throwable
    //   800	814	814	java/lang/Throwable
    //   825	838	841	java/lang/Throwable
    //   830	853	856	java/lang/Throwable
    //   845	871	874	java/lang/Throwable
    //   860	901	904	java/lang/Throwable
    //   967	994	997	java/lang/Throwable
    //   984	1012	1015	java/lang/Throwable
    //   1001	1042	1045	java/lang/Throwable
    //   1019	1053	1053	java/lang/Throwable
    //   1075	1086	1089	java/lang/Throwable
    //   1141	1155	1155	java/lang/Throwable
    //   1166	1179	1182	java/lang/Throwable
    //   1171	1194	1197	java/lang/Throwable
    //   1186	1212	1215	java/lang/Throwable
    //   1201	1242	1245	java/lang/Throwable
    //   1308	1335	1338	java/lang/Throwable
    //   1325	1353	1356	java/lang/Throwable
    //   1342	1383	1386	java/lang/Throwable
    //   1360	1394	1394	java/lang/Throwable
    //   1416	1427	1430	java/lang/Throwable
    //   1440	2170	4360	java/lang/Throwable
    //   1530	1544	1544	java/lang/Throwable
    //   1555	1568	1571	java/lang/Throwable
    //   1560	1583	1586	java/lang/Throwable
    //   1575	1601	1604	java/lang/Throwable
    //   1590	1631	1634	java/lang/Throwable
    //   1697	1724	1727	java/lang/Throwable
    //   1714	1742	1745	java/lang/Throwable
    //   1731	1772	1775	java/lang/Throwable
    //   1749	1783	1783	java/lang/Throwable
    //   1805	1816	1819	java/lang/Throwable
    //   1872	1886	1886	java/lang/Throwable
    //   1897	1910	1913	java/lang/Throwable
    //   1902	1925	1928	java/lang/Throwable
    //   1917	1943	1946	java/lang/Throwable
    //   1932	1973	1976	java/lang/Throwable
    //   2039	2066	2069	java/lang/Throwable
    //   2056	2084	2087	java/lang/Throwable
    //   2073	2114	2117	java/lang/Throwable
    //   2091	2125	2125	java/lang/Throwable
    //   2147	2158	2161	java/lang/Throwable
    //   2171	2901	4360	java/lang/Throwable
    //   2261	2275	2275	java/lang/Throwable
    //   2286	2299	2302	java/lang/Throwable
    //   2291	2314	2317	java/lang/Throwable
    //   2306	2332	2335	java/lang/Throwable
    //   2321	2362	2365	java/lang/Throwable
    //   2428	2455	2458	java/lang/Throwable
    //   2445	2473	2476	java/lang/Throwable
    //   2462	2503	2506	java/lang/Throwable
    //   2480	2514	2514	java/lang/Throwable
    //   2536	2547	2550	java/lang/Throwable
    //   2603	2617	2617	java/lang/Throwable
    //   2628	2641	2644	java/lang/Throwable
    //   2633	2656	2659	java/lang/Throwable
    //   2648	2674	2677	java/lang/Throwable
    //   2663	2704	2707	java/lang/Throwable
    //   2770	2797	2800	java/lang/Throwable
    //   2787	2815	2818	java/lang/Throwable
    //   2804	2845	2848	java/lang/Throwable
    //   2822	2856	2856	java/lang/Throwable
    //   2878	2889	2892	java/lang/Throwable
    //   2902	3632	4360	java/lang/Throwable
    //   2992	3006	3006	java/lang/Throwable
    //   3017	3030	3033	java/lang/Throwable
    //   3022	3045	3048	java/lang/Throwable
    //   3037	3063	3066	java/lang/Throwable
    //   3052	3093	3096	java/lang/Throwable
    //   3159	3186	3189	java/lang/Throwable
    //   3176	3204	3207	java/lang/Throwable
    //   3193	3234	3237	java/lang/Throwable
    //   3211	3245	3245	java/lang/Throwable
    //   3267	3278	3281	java/lang/Throwable
    //   3334	3348	3348	java/lang/Throwable
    //   3359	3372	3375	java/lang/Throwable
    //   3364	3387	3390	java/lang/Throwable
    //   3379	3405	3408	java/lang/Throwable
    //   3394	3435	3438	java/lang/Throwable
    //   3501	3528	3531	java/lang/Throwable
    //   3518	3546	3549	java/lang/Throwable
    //   3535	3576	3579	java/lang/Throwable
    //   3553	3587	3587	java/lang/Throwable
    //   3609	3620	3623	java/lang/Throwable
    //   3633	4359	4360	java/lang/Throwable
    //   3723	3737	3737	java/lang/Throwable
    //   3748	3761	3764	java/lang/Throwable
    //   3753	3776	3779	java/lang/Throwable
    //   3768	3794	3797	java/lang/Throwable
    //   3783	3824	3827	java/lang/Throwable
    //   3890	3917	3920	java/lang/Throwable
    //   3907	3935	3938	java/lang/Throwable
    //   3924	3965	3968	java/lang/Throwable
    //   3942	3976	3976	java/lang/Throwable
    //   3998	4009	4012	java/lang/Throwable
    //   4065	4079	4079	java/lang/Throwable
    //   4090	4103	4106	java/lang/Throwable
    //   4095	4118	4121	java/lang/Throwable
    //   4110	4136	4139	java/lang/Throwable
    //   4125	4166	4169	java/lang/Throwable
    //   4232	4259	4262	java/lang/Throwable
    //   4249	4277	4280	java/lang/Throwable
    //   4266	4307	4310	java/lang/Throwable
    //   4284	4318	4318	java/lang/Throwable
    //   4340	4351	4354	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #31
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'öq±&ø4·IÉÚmò@í÷úßÑãû¦w2M.ð©3ºtþø¸µ½3Æª÷qáúäº°T\\nÊÇÿ¥uGcÞèØ\\n\\tÉB.A¥Çÿâæ6ËÏ\\tqÒ9SG»Th\\tV÷Ý÷Û0È\\tàÿö1sÂq\\tàv®M \\t¯1â/<\\nÝ¹\\tM¿¾þ·0¬ÿ\\t­Å¢±4ÙÞ£\\t<6Ïr1¡\\tNÖÞÓ»2R\\tÞXÌù¯mV\\t4)RÊ£,\\t¿yà&|+×Á\\ttÃqSÁ8ÜtÏîØ ­íÌÉg|_DÑ±F«(ÑPÇToð>\\tÔ¢]ÑDgo,\\tA¾?Þ4»qc\\t¤ëôÛ»§\\tÀÖºÍX\\tyý8¶g9´Æð\\tcF{Á×³YB\\txdc_ N¤\\ts$yO^³n]\\tîÛÊr9¡tÞ ¦¹cêºRk3póðX}wKV%=NE=À^þ\\tnFÚÁ;×=_'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #77
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #10
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
    //   68: ldc 'È¹|;\\fFe\\t2g=«²\Ó;'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #106
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
    //   129: putstatic burp/Zz75.a : [Ljava/lang/String;
    //   132: bipush #31
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zz75.b : [Ljava/lang/String;
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
    //   212: bipush #75
    //   214: goto -> 244
    //   217: bipush #108
    //   219: goto -> 244
    //   222: bipush #105
    //   224: goto -> 244
    //   227: bipush #100
    //   229: goto -> 244
    //   232: bipush #20
    //   234: goto -> 244
    //   237: bipush #12
    //   239: goto -> 244
    //   242: bipush #29
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
    //   300: sipush #13909
    //   303: sipush #-17130
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zz75.ZT : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #99
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #53
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #58
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #23
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-46
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #-105
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #-104
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #-55
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #87
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #-94
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #-35
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: iconst_0
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #-96
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #62
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #119
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-25
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #-100
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #-117
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #84
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #-126
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #-60
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #-56
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #-54
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #-37
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #35
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #26
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #114
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #8
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #35
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #-61
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #-5
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #6
    //   505: bastore
    //   506: invokespecial <init> : (I[B)V
    //   509: putstatic burp/Zz75.ZX : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x364E) & 0xFFFF;
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
      byte b1 = 24;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz75.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */