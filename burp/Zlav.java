package burp;

import java.math.BigInteger;

class Zlav extends ClassLoader {
  static Object Zp;
  
  static String ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZW(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zr0g.Zj : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zzpj.ZI : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Ze5t.Zc : Ljava/lang/Object;
    //   22: sipush #-1112
    //   25: sipush #20285
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zle6
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
    //   150: sipush #-1110
    //   153: sipush #-15329
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
    //   192: sipush #-1095
    //   195: sipush #-21700
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
    //   219: if_icmpge -> 330
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
    //   242: ifeq -> 316
    //   245: aload #6
    //   247: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   250: arraylength
    //   251: iconst_2
    //   252: if_icmpne -> 316
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   261: athrow
    //   262: aload #6
    //   264: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   267: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   270: if_acmpne -> 316
    //   273: goto -> 280
    //   276: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   279: athrow
    //   280: aload #6
    //   282: iconst_1
    //   283: invokevirtual setAccessible : (Z)V
    //   286: aload #6
    //   288: aconst_null
    //   289: iconst_2
    //   290: anewarray java/lang/Object
    //   293: dup
    //   294: iconst_0
    //   295: aload_0
    //   296: aastore
    //   297: dup
    //   298: iconst_1
    //   299: aload_1
    //   300: aastore
    //   301: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   304: pop
    //   305: iload_2
    //   306: ifne -> 330
    //   309: goto -> 316
    //   312: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   315: athrow
    //   316: iinc #5, 1
    //   319: iload_2
    //   320: ifne -> 215
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   329: athrow
    //   330: sipush #-1114
    //   333: sipush #7966
    //   336: invokestatic a : (II)Ljava/lang/String;
    //   339: iconst_1
    //   340: ldc burp/Zsxj
    //   342: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   345: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   348: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   351: astore_3
    //   352: aload_3
    //   353: arraylength
    //   354: istore #4
    //   356: iconst_0
    //   357: istore #5
    //   359: iload #5
    //   361: iload #4
    //   363: if_icmpge -> 500
    //   366: aload_3
    //   367: iload #5
    //   369: aaload
    //   370: astore #6
    //   372: aload #6
    //   374: invokevirtual getModifiers : ()I
    //   377: invokestatic isStatic : (I)Z
    //   380: ifne -> 390
    //   383: goto -> 493
    //   386: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   389: athrow
    //   390: aload #6
    //   392: invokevirtual getType : ()Ljava/lang/Class;
    //   395: astore #7
    //   397: aload #7
    //   399: ifnull -> 480
    //   402: aload #7
    //   404: invokevirtual isPrimitive : ()Z
    //   407: ifne -> 480
    //   410: goto -> 417
    //   413: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   416: athrow
    //   417: aload #7
    //   419: invokevirtual getPackage : ()Ljava/lang/Package;
    //   422: ifnull -> 480
    //   425: goto -> 432
    //   428: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   431: athrow
    //   432: aload #7
    //   434: invokevirtual getPackage : ()Ljava/lang/Package;
    //   437: invokevirtual getName : ()Ljava/lang/String;
    //   440: ifnull -> 480
    //   443: goto -> 450
    //   446: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   449: athrow
    //   450: aload #7
    //   452: invokevirtual getPackage : ()Ljava/lang/Package;
    //   455: invokevirtual getName : ()Ljava/lang/String;
    //   458: sipush #-1115
    //   461: sipush #-26483
    //   464: invokestatic a : (II)Ljava/lang/String;
    //   467: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   470: ifne -> 480
    //   473: goto -> 480
    //   476: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   479: athrow
    //   480: aload #6
    //   482: iconst_1
    //   483: invokevirtual setAccessible : (Z)V
    //   486: aload #6
    //   488: aconst_null
    //   489: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   492: pop
    //   493: iinc #5, 1
    //   496: iload_2
    //   497: ifne -> 359
    //   500: sipush #-1089
    //   503: sipush #22542
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   512: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   515: astore_3
    //   516: aload_3
    //   517: arraylength
    //   518: istore #4
    //   520: iconst_0
    //   521: istore #5
    //   523: iload #5
    //   525: iload #4
    //   527: if_icmpge -> 659
    //   530: aload_3
    //   531: iload #5
    //   533: aaload
    //   534: astore #6
    //   536: aload #6
    //   538: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   541: pop
    //   542: aload #6
    //   544: invokevirtual getModifiers : ()I
    //   547: invokestatic isStatic : (I)Z
    //   550: ifeq -> 645
    //   553: aload #6
    //   555: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   558: arraylength
    //   559: iconst_2
    //   560: if_icmpne -> 645
    //   563: goto -> 570
    //   566: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   569: athrow
    //   570: aload #6
    //   572: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   575: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   578: invokevirtual equals : (Ljava/lang/Object;)Z
    //   581: ifeq -> 645
    //   584: goto -> 591
    //   587: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   590: athrow
    //   591: aload #6
    //   593: iconst_1
    //   594: invokevirtual setAccessible : (Z)V
    //   597: aload #6
    //   599: aconst_null
    //   600: iconst_2
    //   601: anewarray java/lang/Object
    //   604: dup
    //   605: iconst_0
    //   606: aload_0
    //   607: aastore
    //   608: dup
    //   609: iconst_1
    //   610: aload_1
    //   611: ifnonnull -> 629
    //   614: goto -> 621
    //   617: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   620: athrow
    //   621: aload_1
    //   622: goto -> 636
    //   625: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   628: athrow
    //   629: aload_1
    //   630: checkcast [B
    //   633: invokevirtual clone : ()Ljava/lang/Object;
    //   636: aastore
    //   637: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   640: pop
    //   641: iload_2
    //   642: ifne -> 659
    //   645: iinc #5, 1
    //   648: iload_2
    //   649: ifne -> 523
    //   652: goto -> 659
    //   655: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   658: athrow
    //   659: iconst_0
    //   660: istore_3
    //   661: getstatic burp/Zkco.Zz : Ljava/lang/String;
    //   664: getstatic burp/Zrml.ZA : Ljava/lang/Object;
    //   667: checkcast java/math/BigInteger
    //   670: invokevirtual intValue : ()I
    //   673: bipush #32
    //   675: irem
    //   676: invokestatic abs : (I)I
    //   679: invokevirtual charAt : (I)C
    //   682: getstatic burp/Zg2.ZN : Ljava/lang/String;
    //   685: getstatic burp/Zzou.Zz : Ljava/lang/Object;
    //   688: checkcast java/math/BigInteger
    //   691: invokevirtual intValue : ()I
    //   694: bipush #32
    //   696: irem
    //   697: invokestatic abs : (I)I
    //   700: invokevirtual charAt : (I)C
    //   703: if_icmpgt -> 1047
    //   706: sipush #-1108
    //   709: sipush #-5782
    //   712: invokestatic a : (II)Ljava/lang/String;
    //   715: iconst_1
    //   716: ldc burp/Zl50
    //   718: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   721: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   724: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   727: astore #4
    //   729: aload #4
    //   731: arraylength
    //   732: istore #5
    //   734: iconst_0
    //   735: istore #6
    //   737: iload #6
    //   739: iload #5
    //   741: if_icmpge -> 879
    //   744: aload #4
    //   746: iload #6
    //   748: aaload
    //   749: astore #7
    //   751: aload #7
    //   753: invokevirtual getModifiers : ()I
    //   756: invokestatic isStatic : (I)Z
    //   759: ifne -> 769
    //   762: goto -> 872
    //   765: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   768: athrow
    //   769: aload #7
    //   771: invokevirtual getType : ()Ljava/lang/Class;
    //   774: astore #8
    //   776: aload #8
    //   778: ifnull -> 859
    //   781: aload #8
    //   783: invokevirtual isPrimitive : ()Z
    //   786: ifne -> 859
    //   789: goto -> 796
    //   792: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   795: athrow
    //   796: aload #8
    //   798: invokevirtual getPackage : ()Ljava/lang/Package;
    //   801: ifnull -> 859
    //   804: goto -> 811
    //   807: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   810: athrow
    //   811: aload #8
    //   813: invokevirtual getPackage : ()Ljava/lang/Package;
    //   816: invokevirtual getName : ()Ljava/lang/String;
    //   819: ifnull -> 859
    //   822: goto -> 829
    //   825: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   828: athrow
    //   829: aload #8
    //   831: invokevirtual getPackage : ()Ljava/lang/Package;
    //   834: invokevirtual getName : ()Ljava/lang/String;
    //   837: sipush #-1115
    //   840: sipush #-26483
    //   843: invokestatic a : (II)Ljava/lang/String;
    //   846: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   849: ifne -> 859
    //   852: goto -> 859
    //   855: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   858: athrow
    //   859: aload #7
    //   861: iconst_1
    //   862: invokevirtual setAccessible : (Z)V
    //   865: aload #7
    //   867: aconst_null
    //   868: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   871: pop
    //   872: iinc #6, 1
    //   875: iload_2
    //   876: ifne -> 737
    //   879: sipush #-1104
    //   882: sipush #9922
    //   885: invokestatic a : (II)Ljava/lang/String;
    //   888: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   891: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   894: astore #4
    //   896: aload #4
    //   898: arraylength
    //   899: istore #5
    //   901: iconst_0
    //   902: istore #6
    //   904: iload #6
    //   906: iload #5
    //   908: if_icmpge -> 1044
    //   911: aload #4
    //   913: iload #6
    //   915: aaload
    //   916: astore #7
    //   918: aload #7
    //   920: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   923: pop
    //   924: aload #7
    //   926: invokevirtual getModifiers : ()I
    //   929: invokestatic isStatic : (I)Z
    //   932: ifeq -> 1030
    //   935: aload #7
    //   937: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   940: arraylength
    //   941: iconst_2
    //   942: if_icmpne -> 1030
    //   945: goto -> 952
    //   948: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   951: athrow
    //   952: aload #7
    //   954: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   957: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   960: if_acmpne -> 1030
    //   963: goto -> 970
    //   966: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   969: athrow
    //   970: aload #7
    //   972: iconst_1
    //   973: invokevirtual setAccessible : (Z)V
    //   976: aload #7
    //   978: aconst_null
    //   979: iconst_2
    //   980: anewarray java/lang/Object
    //   983: dup
    //   984: iconst_0
    //   985: aload_0
    //   986: aastore
    //   987: dup
    //   988: iconst_1
    //   989: aload_1
    //   990: ifnonnull -> 1008
    //   993: goto -> 1000
    //   996: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   999: athrow
    //   1000: aload_1
    //   1001: goto -> 1015
    //   1004: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1007: athrow
    //   1008: aload_1
    //   1009: checkcast [B
    //   1012: invokevirtual clone : ()Ljava/lang/Object;
    //   1015: aastore
    //   1016: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1019: checkcast java/lang/Boolean
    //   1022: invokevirtual booleanValue : ()Z
    //   1025: istore_3
    //   1026: iload_2
    //   1027: ifne -> 1044
    //   1030: iinc #6, 1
    //   1033: iload_2
    //   1034: ifne -> 904
    //   1037: goto -> 1044
    //   1040: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1043: athrow
    //   1044: goto -> 1385
    //   1047: sipush #-1111
    //   1050: sipush #-2328
    //   1053: invokestatic a : (II)Ljava/lang/String;
    //   1056: iconst_1
    //   1057: ldc burp/Zmhx
    //   1059: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1062: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1065: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1068: astore #4
    //   1070: aload #4
    //   1072: arraylength
    //   1073: istore #5
    //   1075: iconst_0
    //   1076: istore #6
    //   1078: iload #6
    //   1080: iload #5
    //   1082: if_icmpge -> 1220
    //   1085: aload #4
    //   1087: iload #6
    //   1089: aaload
    //   1090: astore #7
    //   1092: aload #7
    //   1094: invokevirtual getModifiers : ()I
    //   1097: invokestatic isStatic : (I)Z
    //   1100: ifne -> 1110
    //   1103: goto -> 1213
    //   1106: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1109: athrow
    //   1110: aload #7
    //   1112: invokevirtual getType : ()Ljava/lang/Class;
    //   1115: astore #8
    //   1117: aload #8
    //   1119: ifnull -> 1200
    //   1122: aload #8
    //   1124: invokevirtual isPrimitive : ()Z
    //   1127: ifne -> 1200
    //   1130: goto -> 1137
    //   1133: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1136: athrow
    //   1137: aload #8
    //   1139: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1142: ifnull -> 1200
    //   1145: goto -> 1152
    //   1148: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1151: athrow
    //   1152: aload #8
    //   1154: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1157: invokevirtual getName : ()Ljava/lang/String;
    //   1160: ifnull -> 1200
    //   1163: goto -> 1170
    //   1166: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1169: athrow
    //   1170: aload #8
    //   1172: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1175: invokevirtual getName : ()Ljava/lang/String;
    //   1178: sipush #-1115
    //   1181: sipush #-26483
    //   1184: invokestatic a : (II)Ljava/lang/String;
    //   1187: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1190: ifne -> 1200
    //   1193: goto -> 1200
    //   1196: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1199: athrow
    //   1200: aload #7
    //   1202: iconst_1
    //   1203: invokevirtual setAccessible : (Z)V
    //   1206: aload #7
    //   1208: aconst_null
    //   1209: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1212: pop
    //   1213: iinc #6, 1
    //   1216: iload_2
    //   1217: ifne -> 1078
    //   1220: sipush #-1109
    //   1223: sipush #-28404
    //   1226: invokestatic a : (II)Ljava/lang/String;
    //   1229: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1232: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1235: astore #4
    //   1237: aload #4
    //   1239: arraylength
    //   1240: istore #5
    //   1242: iconst_0
    //   1243: istore #6
    //   1245: iload #6
    //   1247: iload #5
    //   1249: if_icmpge -> 1385
    //   1252: aload #4
    //   1254: iload #6
    //   1256: aaload
    //   1257: astore #7
    //   1259: aload #7
    //   1261: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1264: pop
    //   1265: aload #7
    //   1267: invokevirtual getModifiers : ()I
    //   1270: invokestatic isStatic : (I)Z
    //   1273: ifeq -> 1371
    //   1276: aload #7
    //   1278: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1281: arraylength
    //   1282: iconst_2
    //   1283: if_icmpne -> 1371
    //   1286: goto -> 1293
    //   1289: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1292: athrow
    //   1293: aload #7
    //   1295: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1298: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1301: if_acmpne -> 1371
    //   1304: goto -> 1311
    //   1307: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1310: athrow
    //   1311: aload #7
    //   1313: iconst_1
    //   1314: invokevirtual setAccessible : (Z)V
    //   1317: aload #7
    //   1319: aconst_null
    //   1320: iconst_2
    //   1321: anewarray java/lang/Object
    //   1324: dup
    //   1325: iconst_0
    //   1326: aload_0
    //   1327: aastore
    //   1328: dup
    //   1329: iconst_1
    //   1330: aload_1
    //   1331: ifnonnull -> 1349
    //   1334: goto -> 1341
    //   1337: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1340: athrow
    //   1341: aload_1
    //   1342: goto -> 1356
    //   1345: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1348: athrow
    //   1349: aload_1
    //   1350: checkcast [B
    //   1353: invokevirtual clone : ()Ljava/lang/Object;
    //   1356: aastore
    //   1357: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1360: checkcast java/lang/Boolean
    //   1363: invokevirtual booleanValue : ()Z
    //   1366: istore_3
    //   1367: iload_2
    //   1368: ifne -> 1385
    //   1371: iinc #6, 1
    //   1374: iload_2
    //   1375: ifne -> 1245
    //   1378: goto -> 1385
    //   1381: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1384: athrow
    //   1385: iload_3
    //   1386: ifeq -> 1391
    //   1389: iload_3
    //   1390: ireturn
    //   1391: getstatic burp/Zeqo.Zw : Ljava/lang/String;
    //   1394: getstatic burp/Zlsw.ZJ : Ljava/lang/Object;
    //   1397: checkcast java/math/BigInteger
    //   1400: invokevirtual intValue : ()I
    //   1403: bipush #32
    //   1405: irem
    //   1406: invokestatic abs : (I)I
    //   1409: invokevirtual charAt : (I)C
    //   1412: getstatic burp/Zzrb.ZA : Ljava/lang/String;
    //   1415: getstatic burp/Zkfa.Zw : Ljava/lang/Object;
    //   1418: checkcast java/math/BigInteger
    //   1421: invokevirtual intValue : ()I
    //   1424: bipush #32
    //   1426: irem
    //   1427: invokestatic abs : (I)I
    //   1430: invokevirtual charAt : (I)C
    //   1433: if_icmpgt -> 1778
    //   1436: sipush #-1092
    //   1439: sipush #10855
    //   1442: invokestatic a : (II)Ljava/lang/String;
    //   1445: iconst_1
    //   1446: ldc burp/Zrjg
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
    //   1567: sipush #-1115
    //   1570: sipush #-26483
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
    //   1606: ifne -> 1467
    //   1609: sipush #-1091
    //   1612: sipush #-918
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
    //   1757: ifne -> 1774
    //   1760: iinc #6, 1
    //   1763: iload_2
    //   1764: ifne -> 1634
    //   1767: goto -> 1774
    //   1770: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1773: athrow
    //   1774: iload_2
    //   1775: ifne -> 2116
    //   1778: sipush #-1090
    //   1781: sipush #660
    //   1784: invokestatic a : (II)Ljava/lang/String;
    //   1787: iconst_1
    //   1788: ldc burp/Zk7f
    //   1790: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1793: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1796: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1799: astore #4
    //   1801: aload #4
    //   1803: arraylength
    //   1804: istore #5
    //   1806: iconst_0
    //   1807: istore #6
    //   1809: iload #6
    //   1811: iload #5
    //   1813: if_icmpge -> 1951
    //   1816: aload #4
    //   1818: iload #6
    //   1820: aaload
    //   1821: astore #7
    //   1823: aload #7
    //   1825: invokevirtual getModifiers : ()I
    //   1828: invokestatic isStatic : (I)Z
    //   1831: ifne -> 1841
    //   1834: goto -> 1944
    //   1837: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1840: athrow
    //   1841: aload #7
    //   1843: invokevirtual getType : ()Ljava/lang/Class;
    //   1846: astore #8
    //   1848: aload #8
    //   1850: ifnull -> 1931
    //   1853: aload #8
    //   1855: invokevirtual isPrimitive : ()Z
    //   1858: ifne -> 1931
    //   1861: goto -> 1868
    //   1864: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1867: athrow
    //   1868: aload #8
    //   1870: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1873: ifnull -> 1931
    //   1876: goto -> 1883
    //   1879: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1882: athrow
    //   1883: aload #8
    //   1885: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1888: invokevirtual getName : ()Ljava/lang/String;
    //   1891: ifnull -> 1931
    //   1894: goto -> 1901
    //   1897: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1900: athrow
    //   1901: aload #8
    //   1903: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1906: invokevirtual getName : ()Ljava/lang/String;
    //   1909: sipush #-1115
    //   1912: sipush #-26483
    //   1915: invokestatic a : (II)Ljava/lang/String;
    //   1918: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1921: ifne -> 1931
    //   1924: goto -> 1931
    //   1927: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1930: athrow
    //   1931: aload #7
    //   1933: iconst_1
    //   1934: invokevirtual setAccessible : (Z)V
    //   1937: aload #7
    //   1939: aconst_null
    //   1940: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1943: pop
    //   1944: iinc #6, 1
    //   1947: iload_2
    //   1948: ifne -> 1809
    //   1951: sipush #-1113
    //   1954: sipush #933
    //   1957: invokestatic a : (II)Ljava/lang/String;
    //   1960: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1963: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1966: astore #4
    //   1968: aload #4
    //   1970: arraylength
    //   1971: istore #5
    //   1973: iconst_0
    //   1974: istore #6
    //   1976: iload #6
    //   1978: iload #5
    //   1980: if_icmpge -> 2116
    //   1983: aload #4
    //   1985: iload #6
    //   1987: aaload
    //   1988: astore #7
    //   1990: aload #7
    //   1992: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1995: pop
    //   1996: aload #7
    //   1998: invokevirtual getModifiers : ()I
    //   2001: invokestatic isStatic : (I)Z
    //   2004: ifeq -> 2102
    //   2007: aload #7
    //   2009: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2012: arraylength
    //   2013: iconst_2
    //   2014: if_icmpne -> 2102
    //   2017: goto -> 2024
    //   2020: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2023: athrow
    //   2024: aload #7
    //   2026: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2029: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2032: if_acmpne -> 2102
    //   2035: goto -> 2042
    //   2038: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2041: athrow
    //   2042: aload #7
    //   2044: iconst_1
    //   2045: invokevirtual setAccessible : (Z)V
    //   2048: aload #7
    //   2050: aconst_null
    //   2051: iconst_2
    //   2052: anewarray java/lang/Object
    //   2055: dup
    //   2056: iconst_0
    //   2057: aload_0
    //   2058: aastore
    //   2059: dup
    //   2060: iconst_1
    //   2061: aload_1
    //   2062: ifnonnull -> 2080
    //   2065: goto -> 2072
    //   2068: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2071: athrow
    //   2072: aload_1
    //   2073: goto -> 2087
    //   2076: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2079: athrow
    //   2080: aload_1
    //   2081: checkcast [B
    //   2084: invokevirtual clone : ()Ljava/lang/Object;
    //   2087: aastore
    //   2088: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2091: checkcast java/lang/Boolean
    //   2094: invokevirtual booleanValue : ()Z
    //   2097: istore_3
    //   2098: iload_2
    //   2099: ifne -> 2116
    //   2102: iinc #6, 1
    //   2105: iload_2
    //   2106: ifne -> 1976
    //   2109: goto -> 2116
    //   2112: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2115: athrow
    //   2116: iload_3
    //   2117: ifeq -> 2122
    //   2120: iload_3
    //   2121: ireturn
    //   2122: getstatic burp/Zkco.Zz : Ljava/lang/String;
    //   2125: getstatic burp/Zeb3.Zb : Ljava/lang/Object;
    //   2128: checkcast java/math/BigInteger
    //   2131: invokevirtual intValue : ()I
    //   2134: bipush #32
    //   2136: irem
    //   2137: invokestatic abs : (I)I
    //   2140: invokevirtual charAt : (I)C
    //   2143: getstatic burp/Zlb6.ZP : Ljava/lang/String;
    //   2146: getstatic burp/Zsf3.ZH : Ljava/lang/Object;
    //   2149: checkcast java/math/BigInteger
    //   2152: invokevirtual intValue : ()I
    //   2155: bipush #32
    //   2157: irem
    //   2158: invokestatic abs : (I)I
    //   2161: invokevirtual charAt : (I)C
    //   2164: if_icmpgt -> 2509
    //   2167: sipush #-1119
    //   2170: sipush #-10126
    //   2173: invokestatic a : (II)Ljava/lang/String;
    //   2176: iconst_1
    //   2177: ldc burp/Zg27
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
    //   2298: sipush #-1115
    //   2301: sipush #-26483
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
    //   2337: ifne -> 2198
    //   2340: sipush #-1105
    //   2343: sipush #11541
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
    //   2488: ifne -> 2505
    //   2491: iinc #6, 1
    //   2494: iload_2
    //   2495: ifne -> 2365
    //   2498: goto -> 2505
    //   2501: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2504: athrow
    //   2505: iload_2
    //   2506: ifne -> 2847
    //   2509: sipush #-1107
    //   2512: sipush #29073
    //   2515: invokestatic a : (II)Ljava/lang/String;
    //   2518: iconst_1
    //   2519: ldc burp/Zl3l
    //   2521: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2524: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2527: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2530: astore #4
    //   2532: aload #4
    //   2534: arraylength
    //   2535: istore #5
    //   2537: iconst_0
    //   2538: istore #6
    //   2540: iload #6
    //   2542: iload #5
    //   2544: if_icmpge -> 2682
    //   2547: aload #4
    //   2549: iload #6
    //   2551: aaload
    //   2552: astore #7
    //   2554: aload #7
    //   2556: invokevirtual getModifiers : ()I
    //   2559: invokestatic isStatic : (I)Z
    //   2562: ifne -> 2572
    //   2565: goto -> 2675
    //   2568: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2571: athrow
    //   2572: aload #7
    //   2574: invokevirtual getType : ()Ljava/lang/Class;
    //   2577: astore #8
    //   2579: aload #8
    //   2581: ifnull -> 2662
    //   2584: aload #8
    //   2586: invokevirtual isPrimitive : ()Z
    //   2589: ifne -> 2662
    //   2592: goto -> 2599
    //   2595: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2598: athrow
    //   2599: aload #8
    //   2601: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2604: ifnull -> 2662
    //   2607: goto -> 2614
    //   2610: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2613: athrow
    //   2614: aload #8
    //   2616: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2619: invokevirtual getName : ()Ljava/lang/String;
    //   2622: ifnull -> 2662
    //   2625: goto -> 2632
    //   2628: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2631: athrow
    //   2632: aload #8
    //   2634: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2637: invokevirtual getName : ()Ljava/lang/String;
    //   2640: sipush #-1115
    //   2643: sipush #-26483
    //   2646: invokestatic a : (II)Ljava/lang/String;
    //   2649: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2652: ifne -> 2662
    //   2655: goto -> 2662
    //   2658: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2661: athrow
    //   2662: aload #7
    //   2664: iconst_1
    //   2665: invokevirtual setAccessible : (Z)V
    //   2668: aload #7
    //   2670: aconst_null
    //   2671: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2674: pop
    //   2675: iinc #6, 1
    //   2678: iload_2
    //   2679: ifne -> 2540
    //   2682: sipush #-1096
    //   2685: sipush #13161
    //   2688: invokestatic a : (II)Ljava/lang/String;
    //   2691: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2694: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2697: astore #4
    //   2699: aload #4
    //   2701: arraylength
    //   2702: istore #5
    //   2704: iconst_0
    //   2705: istore #6
    //   2707: iload #6
    //   2709: iload #5
    //   2711: if_icmpge -> 2847
    //   2714: aload #4
    //   2716: iload #6
    //   2718: aaload
    //   2719: astore #7
    //   2721: aload #7
    //   2723: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2726: pop
    //   2727: aload #7
    //   2729: invokevirtual getModifiers : ()I
    //   2732: invokestatic isStatic : (I)Z
    //   2735: ifeq -> 2833
    //   2738: aload #7
    //   2740: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2743: arraylength
    //   2744: iconst_2
    //   2745: if_icmpne -> 2833
    //   2748: goto -> 2755
    //   2751: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2754: athrow
    //   2755: aload #7
    //   2757: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2760: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2763: if_acmpne -> 2833
    //   2766: goto -> 2773
    //   2769: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2772: athrow
    //   2773: aload #7
    //   2775: iconst_1
    //   2776: invokevirtual setAccessible : (Z)V
    //   2779: aload #7
    //   2781: aconst_null
    //   2782: iconst_2
    //   2783: anewarray java/lang/Object
    //   2786: dup
    //   2787: iconst_0
    //   2788: aload_0
    //   2789: aastore
    //   2790: dup
    //   2791: iconst_1
    //   2792: aload_1
    //   2793: ifnonnull -> 2811
    //   2796: goto -> 2803
    //   2799: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2802: athrow
    //   2803: aload_1
    //   2804: goto -> 2818
    //   2807: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2810: athrow
    //   2811: aload_1
    //   2812: checkcast [B
    //   2815: invokevirtual clone : ()Ljava/lang/Object;
    //   2818: aastore
    //   2819: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2822: checkcast java/lang/Boolean
    //   2825: invokevirtual booleanValue : ()Z
    //   2828: istore_3
    //   2829: iload_2
    //   2830: ifne -> 2847
    //   2833: iinc #6, 1
    //   2836: iload_2
    //   2837: ifne -> 2707
    //   2840: goto -> 2847
    //   2843: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2846: athrow
    //   2847: iload_3
    //   2848: ifeq -> 2853
    //   2851: iload_3
    //   2852: ireturn
    //   2853: getstatic burp/Zzbr.Zp : Ljava/lang/String;
    //   2856: getstatic burp/Ztys.Zs : Ljava/lang/Object;
    //   2859: checkcast java/math/BigInteger
    //   2862: invokevirtual intValue : ()I
    //   2865: bipush #32
    //   2867: irem
    //   2868: invokestatic abs : (I)I
    //   2871: invokevirtual charAt : (I)C
    //   2874: getstatic burp/Zmzh.Zm : Ljava/lang/String;
    //   2877: getstatic burp/Zlpn.ZU : Ljava/lang/Object;
    //   2880: checkcast java/math/BigInteger
    //   2883: invokevirtual intValue : ()I
    //   2886: bipush #32
    //   2888: irem
    //   2889: invokestatic abs : (I)I
    //   2892: invokevirtual charAt : (I)C
    //   2895: if_icmple -> 3240
    //   2898: sipush #-1106
    //   2901: sipush #6019
    //   2904: invokestatic a : (II)Ljava/lang/String;
    //   2907: iconst_1
    //   2908: ldc burp/Zlot
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
    //   3029: sipush #-1115
    //   3032: sipush #-26483
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
    //   3068: ifne -> 2929
    //   3071: sipush #-1093
    //   3074: sipush #31953
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
    //   3219: ifne -> 3236
    //   3222: iinc #6, 1
    //   3225: iload_2
    //   3226: ifne -> 3096
    //   3229: goto -> 3236
    //   3232: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3235: athrow
    //   3236: iload_2
    //   3237: ifne -> 3578
    //   3240: sipush #-1118
    //   3243: sipush #28320
    //   3246: invokestatic a : (II)Ljava/lang/String;
    //   3249: iconst_1
    //   3250: ldc burp/Zzap
    //   3252: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3255: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3258: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3261: astore #4
    //   3263: aload #4
    //   3265: arraylength
    //   3266: istore #5
    //   3268: iconst_0
    //   3269: istore #6
    //   3271: iload #6
    //   3273: iload #5
    //   3275: if_icmpge -> 3413
    //   3278: aload #4
    //   3280: iload #6
    //   3282: aaload
    //   3283: astore #7
    //   3285: aload #7
    //   3287: invokevirtual getModifiers : ()I
    //   3290: invokestatic isStatic : (I)Z
    //   3293: ifne -> 3303
    //   3296: goto -> 3406
    //   3299: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3302: athrow
    //   3303: aload #7
    //   3305: invokevirtual getType : ()Ljava/lang/Class;
    //   3308: astore #8
    //   3310: aload #8
    //   3312: ifnull -> 3393
    //   3315: aload #8
    //   3317: invokevirtual isPrimitive : ()Z
    //   3320: ifne -> 3393
    //   3323: goto -> 3330
    //   3326: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3329: athrow
    //   3330: aload #8
    //   3332: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3335: ifnull -> 3393
    //   3338: goto -> 3345
    //   3341: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3344: athrow
    //   3345: aload #8
    //   3347: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3350: invokevirtual getName : ()Ljava/lang/String;
    //   3353: ifnull -> 3393
    //   3356: goto -> 3363
    //   3359: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3362: athrow
    //   3363: aload #8
    //   3365: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3368: invokevirtual getName : ()Ljava/lang/String;
    //   3371: sipush #-1115
    //   3374: sipush #-26483
    //   3377: invokestatic a : (II)Ljava/lang/String;
    //   3380: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3383: ifne -> 3393
    //   3386: goto -> 3393
    //   3389: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3392: athrow
    //   3393: aload #7
    //   3395: iconst_1
    //   3396: invokevirtual setAccessible : (Z)V
    //   3399: aload #7
    //   3401: aconst_null
    //   3402: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3405: pop
    //   3406: iinc #6, 1
    //   3409: iload_2
    //   3410: ifne -> 3271
    //   3413: sipush #-1118
    //   3416: sipush #28320
    //   3419: invokestatic a : (II)Ljava/lang/String;
    //   3422: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3425: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3428: astore #4
    //   3430: aload #4
    //   3432: arraylength
    //   3433: istore #5
    //   3435: iconst_0
    //   3436: istore #6
    //   3438: iload #6
    //   3440: iload #5
    //   3442: if_icmpge -> 3578
    //   3445: aload #4
    //   3447: iload #6
    //   3449: aaload
    //   3450: astore #7
    //   3452: aload #7
    //   3454: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3457: pop
    //   3458: aload #7
    //   3460: invokevirtual getModifiers : ()I
    //   3463: invokestatic isStatic : (I)Z
    //   3466: ifeq -> 3564
    //   3469: aload #7
    //   3471: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3474: arraylength
    //   3475: iconst_2
    //   3476: if_icmpne -> 3564
    //   3479: goto -> 3486
    //   3482: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3485: athrow
    //   3486: aload #7
    //   3488: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3491: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3494: if_acmpne -> 3564
    //   3497: goto -> 3504
    //   3500: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3503: athrow
    //   3504: aload #7
    //   3506: iconst_1
    //   3507: invokevirtual setAccessible : (Z)V
    //   3510: aload #7
    //   3512: aconst_null
    //   3513: iconst_2
    //   3514: anewarray java/lang/Object
    //   3517: dup
    //   3518: iconst_0
    //   3519: aload_0
    //   3520: aastore
    //   3521: dup
    //   3522: iconst_1
    //   3523: aload_1
    //   3524: ifnonnull -> 3542
    //   3527: goto -> 3534
    //   3530: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3533: athrow
    //   3534: aload_1
    //   3535: goto -> 3549
    //   3538: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3541: athrow
    //   3542: aload_1
    //   3543: checkcast [B
    //   3546: invokevirtual clone : ()Ljava/lang/Object;
    //   3549: aastore
    //   3550: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3553: checkcast java/lang/Boolean
    //   3556: invokevirtual booleanValue : ()Z
    //   3559: istore_3
    //   3560: iload_2
    //   3561: ifne -> 3578
    //   3564: iinc #6, 1
    //   3567: iload_2
    //   3568: ifne -> 3438
    //   3571: goto -> 3578
    //   3574: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3577: athrow
    //   3578: iload_3
    //   3579: ireturn
    //   3580: astore_3
    //   3581: new java/lang/Exception
    //   3584: dup
    //   3585: aload_3
    //   3586: invokevirtual getMessage : ()Ljava/lang/String;
    //   3589: invokespecial <init> : (Ljava/lang/String;)V
    //   3592: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1390	3580	java/lang/Throwable
    //   64	78	78	java/lang/Throwable
    //   89	102	105	java/lang/Throwable
    //   94	117	120	java/lang/Throwable
    //   109	135	138	java/lang/Throwable
    //   124	165	168	java/lang/Throwable
    //   228	255	258	java/lang/Throwable
    //   245	273	276	java/lang/Throwable
    //   262	309	312	java/lang/Throwable
    //   280	323	326	java/lang/Throwable
    //   372	386	386	java/lang/Throwable
    //   397	410	413	java/lang/Throwable
    //   402	425	428	java/lang/Throwable
    //   417	443	446	java/lang/Throwable
    //   432	473	476	java/lang/Throwable
    //   536	563	566	java/lang/Throwable
    //   553	584	587	java/lang/Throwable
    //   570	614	617	java/lang/Throwable
    //   591	625	625	java/lang/Throwable
    //   636	652	655	java/lang/Throwable
    //   751	765	765	java/lang/Throwable
    //   776	789	792	java/lang/Throwable
    //   781	804	807	java/lang/Throwable
    //   796	822	825	java/lang/Throwable
    //   811	852	855	java/lang/Throwable
    //   918	945	948	java/lang/Throwable
    //   935	963	966	java/lang/Throwable
    //   952	993	996	java/lang/Throwable
    //   970	1004	1004	java/lang/Throwable
    //   1026	1037	1040	java/lang/Throwable
    //   1092	1106	1106	java/lang/Throwable
    //   1117	1130	1133	java/lang/Throwable
    //   1122	1145	1148	java/lang/Throwable
    //   1137	1163	1166	java/lang/Throwable
    //   1152	1193	1196	java/lang/Throwable
    //   1259	1286	1289	java/lang/Throwable
    //   1276	1304	1307	java/lang/Throwable
    //   1293	1334	1337	java/lang/Throwable
    //   1311	1345	1345	java/lang/Throwable
    //   1367	1378	1381	java/lang/Throwable
    //   1391	2121	3580	java/lang/Throwable
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
    //   1823	1837	1837	java/lang/Throwable
    //   1848	1861	1864	java/lang/Throwable
    //   1853	1876	1879	java/lang/Throwable
    //   1868	1894	1897	java/lang/Throwable
    //   1883	1924	1927	java/lang/Throwable
    //   1990	2017	2020	java/lang/Throwable
    //   2007	2035	2038	java/lang/Throwable
    //   2024	2065	2068	java/lang/Throwable
    //   2042	2076	2076	java/lang/Throwable
    //   2098	2109	2112	java/lang/Throwable
    //   2122	2852	3580	java/lang/Throwable
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
    //   2554	2568	2568	java/lang/Throwable
    //   2579	2592	2595	java/lang/Throwable
    //   2584	2607	2610	java/lang/Throwable
    //   2599	2625	2628	java/lang/Throwable
    //   2614	2655	2658	java/lang/Throwable
    //   2721	2748	2751	java/lang/Throwable
    //   2738	2766	2769	java/lang/Throwable
    //   2755	2796	2799	java/lang/Throwable
    //   2773	2807	2807	java/lang/Throwable
    //   2829	2840	2843	java/lang/Throwable
    //   2853	3579	3580	java/lang/Throwable
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
    //   3285	3299	3299	java/lang/Throwable
    //   3310	3323	3326	java/lang/Throwable
    //   3315	3338	3341	java/lang/Throwable
    //   3330	3356	3359	java/lang/Throwable
    //   3345	3386	3389	java/lang/Throwable
    //   3452	3479	3482	java/lang/Throwable
    //   3469	3497	3500	java/lang/Throwable
    //   3486	3527	3530	java/lang/Throwable
    //   3504	3538	3538	java/lang/Throwable
    //   3560	3571	3574	java/lang/Throwable
  }
  
  static void ZZ(Object paramObject) {
    Zg2.ZN = a(-1116, 680);
    Zg2.ZE = new BigInteger(a(-1120, 23664));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zrod.ZQ.charAt(Math.abs(((BigInteger)Zeqo.ZZ).intValue() % 32)) > Zm5p.ZX.charAt(Math.abs(((BigInteger)Zlnq.ZO).intValue() % 32))) {
          try {
            Zrod.Zg(Class.forName(a(-1094, 3485)));
            if (bool)
              Zbsr.Zy(Class.forName(a(-1103, 27175))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zbsr.Zy(Class.forName(a(-1103, 27175)));
    } catch (Throwable throwable) {}
  }
  
  static void ZY(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #26
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '×I&uW\\tûéº%Âå9\\t\\n©L6Ö9¨KÐq\\bT8O5S\\brÿç­Lù\\t_K.q«o\\t-Õ`¢Ðä¬¬B\\tCÕ­¢iä¨éM7<þ0qÐ°ÊÓç3#¾9¹.þQìûyåÝÑáOE<p±Dÿ<c6é3ê 2uÇ°p;ûuF?H9°¡Cö2fÙ \\f/%ºj_á¸\\n3i!/¨+qþÿ«­oå\\tp^rs!>¸µ NY§ ³e39{`V.Z*TØÆß²&ìè5Vnä÷\\t~Ð\\nð}o\\t\\bep¸Ì\\t\\fD*Tõ9ÙF\\bCwp2¾ÿ²\\tÚct>Y¨{\\t¦:_þ[iã\\tÈvÜÖGjF8\\tO,Y£Ez\\tÿ=:¿GÓg\\te÷iæñlîÞ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #49
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
    //   68: ldc 'ë"ëzFÏ~\\b}ÝÝÐw'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #36
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
    //   129: putstatic burp/Zlav.a : [Ljava/lang/String;
    //   132: bipush #26
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zlav.b : [Ljava/lang/String;
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
    //   212: bipush #78
    //   214: goto -> 244
    //   217: bipush #85
    //   219: goto -> 244
    //   222: bipush #71
    //   224: goto -> 244
    //   227: bipush #14
    //   229: goto -> 244
    //   232: bipush #49
    //   234: goto -> 244
    //   237: bipush #66
    //   239: goto -> 244
    //   242: bipush #14
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
    //   310: bipush #10
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #8
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #71
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-44
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #120
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #58
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #71
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #-29
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #109
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #36
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #102
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #-60
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #53
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #-102
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #126
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #-57
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #-43
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #81
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #103
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #-82
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #-74
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #106
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #-36
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #13
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #78
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #106
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #-81
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #-119
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #-82
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #10
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #93
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #85
    //   493: bastore
    //   494: invokespecial <init> : ([B)V
    //   497: putstatic burp/Zlav.Zp : Ljava/lang/Object;
    //   500: sipush #-1117
    //   503: sipush #-23182
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zlav.ZW : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFFBA9) & 0xFFFF;
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
      char c = 'Ê';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlav.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */