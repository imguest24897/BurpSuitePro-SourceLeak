package burp;

import java.math.BigInteger;

class Zzou extends ClassLoader {
  static Object Zz;
  
  static String ZN;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZZ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zxwl.Ze : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zg3v.Zk : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zexu.ZI : Ljava/lang/Object;
    //   22: sipush #9904
    //   25: sipush #-15281
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zboa
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
    //   150: sipush #9909
    //   153: sipush #8523
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
    //   192: sipush #9905
    //   195: sipush #2806
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
    //   330: sipush #9888
    //   333: sipush #21282
    //   336: invokestatic a : (II)Ljava/lang/String;
    //   339: iconst_1
    //   340: ldc burp/Zkig
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
    //   458: sipush #9919
    //   461: sipush #-2858
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
    //   500: sipush #9894
    //   503: sipush #-6970
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
    //   659: new java/io/ByteArrayOutputStream
    //   662: dup
    //   663: invokespecial <init> : ()V
    //   666: astore_3
    //   667: sipush #9902
    //   670: aload_3
    //   671: sipush #202
    //   674: invokevirtual write : (I)V
    //   677: sipush #-19908
    //   680: aload_3
    //   681: sipush #254
    //   684: invokevirtual write : (I)V
    //   687: aload_3
    //   688: sipush #186
    //   691: invokevirtual write : (I)V
    //   694: aload_3
    //   695: sipush #190
    //   698: invokevirtual write : (I)V
    //   701: aload_3
    //   702: iconst_0
    //   703: invokevirtual write : (I)V
    //   706: aload_3
    //   707: iconst_1
    //   708: invokevirtual write : (I)V
    //   711: aload_3
    //   712: iconst_0
    //   713: invokevirtual write : (I)V
    //   716: aload_3
    //   717: bipush #50
    //   719: invokevirtual write : (I)V
    //   722: aload_3
    //   723: getstatic burp/Zt5b.Zc : Ljava/lang/Object;
    //   726: checkcast java/math/BigInteger
    //   729: invokevirtual toByteArray : ()[B
    //   732: invokevirtual write : ([B)V
    //   735: aload_3
    //   736: getstatic burp/Zzi_.Zf : Ljava/lang/Object;
    //   739: checkcast java/math/BigInteger
    //   742: invokevirtual toByteArray : ()[B
    //   745: invokevirtual write : ([B)V
    //   748: aload_3
    //   749: getstatic burp/Ztvn.Zl : Ljava/lang/Object;
    //   752: checkcast java/math/BigInteger
    //   755: invokevirtual toByteArray : ()[B
    //   758: invokevirtual write : ([B)V
    //   761: aload_3
    //   762: invokevirtual toByteArray : ()[B
    //   765: astore #4
    //   767: aconst_null
    //   768: astore #5
    //   770: invokestatic a : (II)Ljava/lang/String;
    //   773: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   776: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   779: astore #6
    //   781: aload #6
    //   783: arraylength
    //   784: istore #7
    //   786: iconst_0
    //   787: istore #8
    //   789: iload #8
    //   791: iload #7
    //   793: if_icmpge -> 921
    //   796: aload #6
    //   798: iload #8
    //   800: aaload
    //   801: astore #9
    //   803: aload #9
    //   805: invokevirtual getName : ()Ljava/lang/String;
    //   808: sipush #9903
    //   811: sipush #11875
    //   814: invokestatic a : (II)Ljava/lang/String;
    //   817: invokevirtual equals : (Ljava/lang/Object;)Z
    //   820: ifeq -> 914
    //   823: aload #9
    //   825: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   828: astore #10
    //   830: aload #10
    //   832: arraylength
    //   833: iconst_4
    //   834: if_icmpeq -> 844
    //   837: goto -> 914
    //   840: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   843: athrow
    //   844: aload #10
    //   846: iconst_0
    //   847: aaload
    //   848: ldc java/lang/String
    //   850: if_acmpeq -> 860
    //   853: goto -> 914
    //   856: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   859: athrow
    //   860: aload #10
    //   862: iconst_1
    //   863: aaload
    //   864: ldc [B
    //   866: if_acmpeq -> 876
    //   869: goto -> 914
    //   872: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   875: athrow
    //   876: aload #10
    //   878: iconst_2
    //   879: aaload
    //   880: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   883: if_acmpeq -> 893
    //   886: goto -> 914
    //   889: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   892: athrow
    //   893: aload #10
    //   895: iconst_3
    //   896: aaload
    //   897: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   900: if_acmpeq -> 910
    //   903: goto -> 914
    //   906: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   909: athrow
    //   910: aload #9
    //   912: astore #5
    //   914: iinc #8, 1
    //   917: iload_2
    //   918: ifne -> 789
    //   921: aload #5
    //   923: iconst_1
    //   924: invokevirtual setAccessible : (Z)V
    //   927: ldc burp/Zxee
    //   929: iconst_0
    //   930: anewarray java/lang/Class
    //   933: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   936: astore #6
    //   938: aload #6
    //   940: iconst_1
    //   941: invokevirtual setAccessible : (Z)V
    //   944: aload #5
    //   946: aload #6
    //   948: iconst_0
    //   949: anewarray java/lang/Object
    //   952: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   955: iconst_4
    //   956: anewarray java/lang/Object
    //   959: dup
    //   960: iconst_0
    //   961: sipush #9896
    //   964: sipush #-31895
    //   967: invokestatic a : (II)Ljava/lang/String;
    //   970: aastore
    //   971: dup
    //   972: iconst_1
    //   973: aload #4
    //   975: aastore
    //   976: dup
    //   977: iconst_2
    //   978: iconst_0
    //   979: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   982: aastore
    //   983: dup
    //   984: iconst_3
    //   985: aload #4
    //   987: arraylength
    //   988: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   991: aastore
    //   992: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   995: pop
    //   996: goto -> 1000
    //   999: astore_3
    //   1000: iconst_0
    //   1001: istore_3
    //   1002: getstatic burp/Zb9h.Zf : Ljava/lang/String;
    //   1005: getstatic burp/Zx_s.ZX : Ljava/lang/Object;
    //   1008: checkcast java/math/BigInteger
    //   1011: invokevirtual intValue : ()I
    //   1014: bipush #32
    //   1016: irem
    //   1017: invokestatic abs : (I)I
    //   1020: invokevirtual charAt : (I)C
    //   1023: getstatic burp/Zb2k.Zu : Ljava/lang/String;
    //   1026: getstatic burp/Zgkn.Zm : Ljava/lang/Object;
    //   1029: checkcast java/math/BigInteger
    //   1032: invokevirtual intValue : ()I
    //   1035: bipush #32
    //   1037: irem
    //   1038: invokestatic abs : (I)I
    //   1041: invokevirtual charAt : (I)C
    //   1044: if_icmpgt -> 1389
    //   1047: sipush #9918
    //   1050: sipush #-9853
    //   1053: invokestatic a : (II)Ljava/lang/String;
    //   1056: iconst_1
    //   1057: ldc burp/Zspk
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
    //   1178: sipush #9919
    //   1181: sipush #-2858
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
    //   1220: sipush #9913
    //   1223: sipush #-28227
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
    //   1385: iload_2
    //   1386: ifne -> 1727
    //   1389: sipush #9916
    //   1392: sipush #3469
    //   1395: invokestatic a : (II)Ljava/lang/String;
    //   1398: iconst_1
    //   1399: ldc burp/Zmrc
    //   1401: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1404: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1407: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1410: astore #4
    //   1412: aload #4
    //   1414: arraylength
    //   1415: istore #5
    //   1417: iconst_0
    //   1418: istore #6
    //   1420: iload #6
    //   1422: iload #5
    //   1424: if_icmpge -> 1562
    //   1427: aload #4
    //   1429: iload #6
    //   1431: aaload
    //   1432: astore #7
    //   1434: aload #7
    //   1436: invokevirtual getModifiers : ()I
    //   1439: invokestatic isStatic : (I)Z
    //   1442: ifne -> 1452
    //   1445: goto -> 1555
    //   1448: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1451: athrow
    //   1452: aload #7
    //   1454: invokevirtual getType : ()Ljava/lang/Class;
    //   1457: astore #8
    //   1459: aload #8
    //   1461: ifnull -> 1542
    //   1464: aload #8
    //   1466: invokevirtual isPrimitive : ()Z
    //   1469: ifne -> 1542
    //   1472: goto -> 1479
    //   1475: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1478: athrow
    //   1479: aload #8
    //   1481: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1484: ifnull -> 1542
    //   1487: goto -> 1494
    //   1490: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1493: athrow
    //   1494: aload #8
    //   1496: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1499: invokevirtual getName : ()Ljava/lang/String;
    //   1502: ifnull -> 1542
    //   1505: goto -> 1512
    //   1508: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1511: athrow
    //   1512: aload #8
    //   1514: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1517: invokevirtual getName : ()Ljava/lang/String;
    //   1520: sipush #9919
    //   1523: sipush #-2858
    //   1526: invokestatic a : (II)Ljava/lang/String;
    //   1529: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1532: ifne -> 1542
    //   1535: goto -> 1542
    //   1538: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1541: athrow
    //   1542: aload #7
    //   1544: iconst_1
    //   1545: invokevirtual setAccessible : (Z)V
    //   1548: aload #7
    //   1550: aconst_null
    //   1551: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1554: pop
    //   1555: iinc #6, 1
    //   1558: iload_2
    //   1559: ifne -> 1420
    //   1562: sipush #9915
    //   1565: sipush #-30377
    //   1568: invokestatic a : (II)Ljava/lang/String;
    //   1571: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1574: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1577: astore #4
    //   1579: aload #4
    //   1581: arraylength
    //   1582: istore #5
    //   1584: iconst_0
    //   1585: istore #6
    //   1587: iload #6
    //   1589: iload #5
    //   1591: if_icmpge -> 1727
    //   1594: aload #4
    //   1596: iload #6
    //   1598: aaload
    //   1599: astore #7
    //   1601: aload #7
    //   1603: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1606: pop
    //   1607: aload #7
    //   1609: invokevirtual getModifiers : ()I
    //   1612: invokestatic isStatic : (I)Z
    //   1615: ifeq -> 1713
    //   1618: aload #7
    //   1620: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1623: arraylength
    //   1624: iconst_2
    //   1625: if_icmpne -> 1713
    //   1628: goto -> 1635
    //   1631: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1634: athrow
    //   1635: aload #7
    //   1637: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1640: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1643: if_acmpne -> 1713
    //   1646: goto -> 1653
    //   1649: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1652: athrow
    //   1653: aload #7
    //   1655: iconst_1
    //   1656: invokevirtual setAccessible : (Z)V
    //   1659: aload #7
    //   1661: aconst_null
    //   1662: iconst_2
    //   1663: anewarray java/lang/Object
    //   1666: dup
    //   1667: iconst_0
    //   1668: aload_0
    //   1669: aastore
    //   1670: dup
    //   1671: iconst_1
    //   1672: aload_1
    //   1673: ifnonnull -> 1691
    //   1676: goto -> 1683
    //   1679: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1682: athrow
    //   1683: aload_1
    //   1684: goto -> 1698
    //   1687: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1690: athrow
    //   1691: aload_1
    //   1692: checkcast [B
    //   1695: invokevirtual clone : ()Ljava/lang/Object;
    //   1698: aastore
    //   1699: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1702: checkcast java/lang/Boolean
    //   1705: invokevirtual booleanValue : ()Z
    //   1708: istore_3
    //   1709: iload_2
    //   1710: ifne -> 1727
    //   1713: iinc #6, 1
    //   1716: iload_2
    //   1717: ifne -> 1587
    //   1720: goto -> 1727
    //   1723: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1726: athrow
    //   1727: iload_3
    //   1728: ifeq -> 1733
    //   1731: iload_3
    //   1732: ireturn
    //   1733: getstatic burp/Zlb6.ZP : Ljava/lang/String;
    //   1736: getstatic burp/Ztys.Zs : Ljava/lang/Object;
    //   1739: checkcast java/math/BigInteger
    //   1742: invokevirtual intValue : ()I
    //   1745: bipush #32
    //   1747: irem
    //   1748: invokestatic abs : (I)I
    //   1751: invokevirtual charAt : (I)C
    //   1754: getstatic burp/Zz3w.ZB : Ljava/lang/String;
    //   1757: getstatic burp/Zgkn.Zm : Ljava/lang/Object;
    //   1760: checkcast java/math/BigInteger
    //   1763: invokevirtual intValue : ()I
    //   1766: bipush #32
    //   1768: irem
    //   1769: invokestatic abs : (I)I
    //   1772: invokevirtual charAt : (I)C
    //   1775: if_icmple -> 2120
    //   1778: sipush #9911
    //   1781: sipush #7504
    //   1784: invokestatic a : (II)Ljava/lang/String;
    //   1787: iconst_1
    //   1788: ldc burp/Zrvb
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
    //   1909: sipush #9919
    //   1912: sipush #-2858
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
    //   1951: sipush #9895
    //   1954: sipush #-27928
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
    //   2116: iload_2
    //   2117: ifne -> 2458
    //   2120: sipush #9899
    //   2123: sipush #-2241
    //   2126: invokestatic a : (II)Ljava/lang/String;
    //   2129: iconst_1
    //   2130: ldc burp/Zbxa
    //   2132: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2135: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2138: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2141: astore #4
    //   2143: aload #4
    //   2145: arraylength
    //   2146: istore #5
    //   2148: iconst_0
    //   2149: istore #6
    //   2151: iload #6
    //   2153: iload #5
    //   2155: if_icmpge -> 2293
    //   2158: aload #4
    //   2160: iload #6
    //   2162: aaload
    //   2163: astore #7
    //   2165: aload #7
    //   2167: invokevirtual getModifiers : ()I
    //   2170: invokestatic isStatic : (I)Z
    //   2173: ifne -> 2183
    //   2176: goto -> 2286
    //   2179: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2182: athrow
    //   2183: aload #7
    //   2185: invokevirtual getType : ()Ljava/lang/Class;
    //   2188: astore #8
    //   2190: aload #8
    //   2192: ifnull -> 2273
    //   2195: aload #8
    //   2197: invokevirtual isPrimitive : ()Z
    //   2200: ifne -> 2273
    //   2203: goto -> 2210
    //   2206: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2209: athrow
    //   2210: aload #8
    //   2212: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2215: ifnull -> 2273
    //   2218: goto -> 2225
    //   2221: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2224: athrow
    //   2225: aload #8
    //   2227: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2230: invokevirtual getName : ()Ljava/lang/String;
    //   2233: ifnull -> 2273
    //   2236: goto -> 2243
    //   2239: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2242: athrow
    //   2243: aload #8
    //   2245: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2248: invokevirtual getName : ()Ljava/lang/String;
    //   2251: sipush #9919
    //   2254: sipush #-2858
    //   2257: invokestatic a : (II)Ljava/lang/String;
    //   2260: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2263: ifne -> 2273
    //   2266: goto -> 2273
    //   2269: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2272: athrow
    //   2273: aload #7
    //   2275: iconst_1
    //   2276: invokevirtual setAccessible : (Z)V
    //   2279: aload #7
    //   2281: aconst_null
    //   2282: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2285: pop
    //   2286: iinc #6, 1
    //   2289: iload_2
    //   2290: ifne -> 2151
    //   2293: sipush #9917
    //   2296: sipush #10802
    //   2299: invokestatic a : (II)Ljava/lang/String;
    //   2302: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2305: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2308: astore #4
    //   2310: aload #4
    //   2312: arraylength
    //   2313: istore #5
    //   2315: iconst_0
    //   2316: istore #6
    //   2318: iload #6
    //   2320: iload #5
    //   2322: if_icmpge -> 2458
    //   2325: aload #4
    //   2327: iload #6
    //   2329: aaload
    //   2330: astore #7
    //   2332: aload #7
    //   2334: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2337: pop
    //   2338: aload #7
    //   2340: invokevirtual getModifiers : ()I
    //   2343: invokestatic isStatic : (I)Z
    //   2346: ifeq -> 2444
    //   2349: aload #7
    //   2351: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2354: arraylength
    //   2355: iconst_2
    //   2356: if_icmpne -> 2444
    //   2359: goto -> 2366
    //   2362: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2365: athrow
    //   2366: aload #7
    //   2368: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2371: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2374: if_acmpne -> 2444
    //   2377: goto -> 2384
    //   2380: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2383: athrow
    //   2384: aload #7
    //   2386: iconst_1
    //   2387: invokevirtual setAccessible : (Z)V
    //   2390: aload #7
    //   2392: aconst_null
    //   2393: iconst_2
    //   2394: anewarray java/lang/Object
    //   2397: dup
    //   2398: iconst_0
    //   2399: aload_0
    //   2400: aastore
    //   2401: dup
    //   2402: iconst_1
    //   2403: aload_1
    //   2404: ifnonnull -> 2422
    //   2407: goto -> 2414
    //   2410: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2413: athrow
    //   2414: aload_1
    //   2415: goto -> 2429
    //   2418: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2421: athrow
    //   2422: aload_1
    //   2423: checkcast [B
    //   2426: invokevirtual clone : ()Ljava/lang/Object;
    //   2429: aastore
    //   2430: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2433: checkcast java/lang/Boolean
    //   2436: invokevirtual booleanValue : ()Z
    //   2439: istore_3
    //   2440: iload_2
    //   2441: ifne -> 2458
    //   2444: iinc #6, 1
    //   2447: iload_2
    //   2448: ifne -> 2318
    //   2451: goto -> 2458
    //   2454: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2457: athrow
    //   2458: iload_3
    //   2459: ifeq -> 2464
    //   2462: iload_3
    //   2463: ireturn
    //   2464: getstatic burp/Zzou.ZN : Ljava/lang/String;
    //   2467: getstatic burp/Zrpy.ZG : Ljava/lang/Object;
    //   2470: checkcast java/math/BigInteger
    //   2473: invokevirtual intValue : ()I
    //   2476: bipush #32
    //   2478: irem
    //   2479: invokestatic abs : (I)I
    //   2482: invokevirtual charAt : (I)C
    //   2485: getstatic burp/Zzxs.Zd : Ljava/lang/String;
    //   2488: getstatic burp/Zztz.Zq : Ljava/lang/Object;
    //   2491: checkcast java/math/BigInteger
    //   2494: invokevirtual intValue : ()I
    //   2497: bipush #32
    //   2499: irem
    //   2500: invokestatic abs : (I)I
    //   2503: invokevirtual charAt : (I)C
    //   2506: if_icmpgt -> 2851
    //   2509: sipush #9891
    //   2512: sipush #29243
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
    //   2640: sipush #9919
    //   2643: sipush #-2858
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
    //   2682: sipush #9910
    //   2685: sipush #8889
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
    //   2847: iload_2
    //   2848: ifne -> 3189
    //   2851: sipush #9912
    //   2854: sipush #-29022
    //   2857: invokestatic a : (II)Ljava/lang/String;
    //   2860: iconst_1
    //   2861: ldc burp/Zly0
    //   2863: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2866: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2869: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2872: astore #4
    //   2874: aload #4
    //   2876: arraylength
    //   2877: istore #5
    //   2879: iconst_0
    //   2880: istore #6
    //   2882: iload #6
    //   2884: iload #5
    //   2886: if_icmpge -> 3024
    //   2889: aload #4
    //   2891: iload #6
    //   2893: aaload
    //   2894: astore #7
    //   2896: aload #7
    //   2898: invokevirtual getModifiers : ()I
    //   2901: invokestatic isStatic : (I)Z
    //   2904: ifne -> 2914
    //   2907: goto -> 3017
    //   2910: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2913: athrow
    //   2914: aload #7
    //   2916: invokevirtual getType : ()Ljava/lang/Class;
    //   2919: astore #8
    //   2921: aload #8
    //   2923: ifnull -> 3004
    //   2926: aload #8
    //   2928: invokevirtual isPrimitive : ()Z
    //   2931: ifne -> 3004
    //   2934: goto -> 2941
    //   2937: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2940: athrow
    //   2941: aload #8
    //   2943: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2946: ifnull -> 3004
    //   2949: goto -> 2956
    //   2952: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2955: athrow
    //   2956: aload #8
    //   2958: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2961: invokevirtual getName : ()Ljava/lang/String;
    //   2964: ifnull -> 3004
    //   2967: goto -> 2974
    //   2970: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2973: athrow
    //   2974: aload #8
    //   2976: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2979: invokevirtual getName : ()Ljava/lang/String;
    //   2982: sipush #9919
    //   2985: sipush #-2858
    //   2988: invokestatic a : (II)Ljava/lang/String;
    //   2991: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2994: ifne -> 3004
    //   2997: goto -> 3004
    //   3000: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3003: athrow
    //   3004: aload #7
    //   3006: iconst_1
    //   3007: invokevirtual setAccessible : (Z)V
    //   3010: aload #7
    //   3012: aconst_null
    //   3013: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3016: pop
    //   3017: iinc #6, 1
    //   3020: iload_2
    //   3021: ifne -> 2882
    //   3024: sipush #9898
    //   3027: sipush #7006
    //   3030: invokestatic a : (II)Ljava/lang/String;
    //   3033: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3036: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3039: astore #4
    //   3041: aload #4
    //   3043: arraylength
    //   3044: istore #5
    //   3046: iconst_0
    //   3047: istore #6
    //   3049: iload #6
    //   3051: iload #5
    //   3053: if_icmpge -> 3189
    //   3056: aload #4
    //   3058: iload #6
    //   3060: aaload
    //   3061: astore #7
    //   3063: aload #7
    //   3065: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3068: pop
    //   3069: aload #7
    //   3071: invokevirtual getModifiers : ()I
    //   3074: invokestatic isStatic : (I)Z
    //   3077: ifeq -> 3175
    //   3080: aload #7
    //   3082: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3085: arraylength
    //   3086: iconst_2
    //   3087: if_icmpne -> 3175
    //   3090: goto -> 3097
    //   3093: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3096: athrow
    //   3097: aload #7
    //   3099: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3102: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3105: if_acmpne -> 3175
    //   3108: goto -> 3115
    //   3111: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3114: athrow
    //   3115: aload #7
    //   3117: iconst_1
    //   3118: invokevirtual setAccessible : (Z)V
    //   3121: aload #7
    //   3123: aconst_null
    //   3124: iconst_2
    //   3125: anewarray java/lang/Object
    //   3128: dup
    //   3129: iconst_0
    //   3130: aload_0
    //   3131: aastore
    //   3132: dup
    //   3133: iconst_1
    //   3134: aload_1
    //   3135: ifnonnull -> 3153
    //   3138: goto -> 3145
    //   3141: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3144: athrow
    //   3145: aload_1
    //   3146: goto -> 3160
    //   3149: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3152: athrow
    //   3153: aload_1
    //   3154: checkcast [B
    //   3157: invokevirtual clone : ()Ljava/lang/Object;
    //   3160: aastore
    //   3161: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3164: checkcast java/lang/Boolean
    //   3167: invokevirtual booleanValue : ()Z
    //   3170: istore_3
    //   3171: iload_2
    //   3172: ifne -> 3189
    //   3175: iinc #6, 1
    //   3178: iload_2
    //   3179: ifne -> 3049
    //   3182: goto -> 3189
    //   3185: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3188: athrow
    //   3189: iload_3
    //   3190: ifeq -> 3195
    //   3193: iload_3
    //   3194: ireturn
    //   3195: getstatic burp/Ztys.Zn : Ljava/lang/String;
    //   3198: getstatic burp/Zejj.Zy : Ljava/lang/Object;
    //   3201: checkcast java/math/BigInteger
    //   3204: invokevirtual intValue : ()I
    //   3207: bipush #32
    //   3209: irem
    //   3210: invokestatic abs : (I)I
    //   3213: invokevirtual charAt : (I)C
    //   3216: getstatic burp/Zr9b.ZC : Ljava/lang/String;
    //   3219: getstatic burp/Zlps.ZU : Ljava/lang/Object;
    //   3222: checkcast java/math/BigInteger
    //   3225: invokevirtual intValue : ()I
    //   3228: bipush #32
    //   3230: irem
    //   3231: invokestatic abs : (I)I
    //   3234: invokevirtual charAt : (I)C
    //   3237: if_icmpgt -> 3582
    //   3240: sipush #9907
    //   3243: sipush #31366
    //   3246: invokestatic a : (II)Ljava/lang/String;
    //   3249: iconst_1
    //   3250: ldc burp/Zlno
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
    //   3371: sipush #9919
    //   3374: sipush #-2858
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
    //   3413: sipush #9900
    //   3416: sipush #26910
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
    //   3578: iload_2
    //   3579: ifne -> 3920
    //   3582: sipush #9890
    //   3585: sipush #-31612
    //   3588: invokestatic a : (II)Ljava/lang/String;
    //   3591: iconst_1
    //   3592: ldc burp/Zttq
    //   3594: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3597: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3600: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3603: astore #4
    //   3605: aload #4
    //   3607: arraylength
    //   3608: istore #5
    //   3610: iconst_0
    //   3611: istore #6
    //   3613: iload #6
    //   3615: iload #5
    //   3617: if_icmpge -> 3755
    //   3620: aload #4
    //   3622: iload #6
    //   3624: aaload
    //   3625: astore #7
    //   3627: aload #7
    //   3629: invokevirtual getModifiers : ()I
    //   3632: invokestatic isStatic : (I)Z
    //   3635: ifne -> 3645
    //   3638: goto -> 3748
    //   3641: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3644: athrow
    //   3645: aload #7
    //   3647: invokevirtual getType : ()Ljava/lang/Class;
    //   3650: astore #8
    //   3652: aload #8
    //   3654: ifnull -> 3735
    //   3657: aload #8
    //   3659: invokevirtual isPrimitive : ()Z
    //   3662: ifne -> 3735
    //   3665: goto -> 3672
    //   3668: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3671: athrow
    //   3672: aload #8
    //   3674: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3677: ifnull -> 3735
    //   3680: goto -> 3687
    //   3683: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3686: athrow
    //   3687: aload #8
    //   3689: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3692: invokevirtual getName : ()Ljava/lang/String;
    //   3695: ifnull -> 3735
    //   3698: goto -> 3705
    //   3701: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3704: athrow
    //   3705: aload #8
    //   3707: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3710: invokevirtual getName : ()Ljava/lang/String;
    //   3713: sipush #9919
    //   3716: sipush #-2858
    //   3719: invokestatic a : (II)Ljava/lang/String;
    //   3722: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3725: ifne -> 3735
    //   3728: goto -> 3735
    //   3731: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3734: athrow
    //   3735: aload #7
    //   3737: iconst_1
    //   3738: invokevirtual setAccessible : (Z)V
    //   3741: aload #7
    //   3743: aconst_null
    //   3744: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3747: pop
    //   3748: iinc #6, 1
    //   3751: iload_2
    //   3752: ifne -> 3613
    //   3755: sipush #9897
    //   3758: sipush #16549
    //   3761: invokestatic a : (II)Ljava/lang/String;
    //   3764: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3767: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3770: astore #4
    //   3772: aload #4
    //   3774: arraylength
    //   3775: istore #5
    //   3777: iconst_0
    //   3778: istore #6
    //   3780: iload #6
    //   3782: iload #5
    //   3784: if_icmpge -> 3920
    //   3787: aload #4
    //   3789: iload #6
    //   3791: aaload
    //   3792: astore #7
    //   3794: aload #7
    //   3796: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3799: pop
    //   3800: aload #7
    //   3802: invokevirtual getModifiers : ()I
    //   3805: invokestatic isStatic : (I)Z
    //   3808: ifeq -> 3906
    //   3811: aload #7
    //   3813: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3816: arraylength
    //   3817: iconst_2
    //   3818: if_icmpne -> 3906
    //   3821: goto -> 3828
    //   3824: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3827: athrow
    //   3828: aload #7
    //   3830: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3833: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3836: if_acmpne -> 3906
    //   3839: goto -> 3846
    //   3842: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3845: athrow
    //   3846: aload #7
    //   3848: iconst_1
    //   3849: invokevirtual setAccessible : (Z)V
    //   3852: aload #7
    //   3854: aconst_null
    //   3855: iconst_2
    //   3856: anewarray java/lang/Object
    //   3859: dup
    //   3860: iconst_0
    //   3861: aload_0
    //   3862: aastore
    //   3863: dup
    //   3864: iconst_1
    //   3865: aload_1
    //   3866: ifnonnull -> 3884
    //   3869: goto -> 3876
    //   3872: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3875: athrow
    //   3876: aload_1
    //   3877: goto -> 3891
    //   3880: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3883: athrow
    //   3884: aload_1
    //   3885: checkcast [B
    //   3888: invokevirtual clone : ()Ljava/lang/Object;
    //   3891: aastore
    //   3892: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3895: checkcast java/lang/Boolean
    //   3898: invokevirtual booleanValue : ()Z
    //   3901: istore_3
    //   3902: iload_2
    //   3903: ifne -> 3920
    //   3906: iinc #6, 1
    //   3909: iload_2
    //   3910: ifne -> 3780
    //   3913: goto -> 3920
    //   3916: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3919: athrow
    //   3920: iload_3
    //   3921: ireturn
    //   3922: astore_3
    //   3923: new java/lang/Exception
    //   3926: dup
    //   3927: aload_3
    //   3928: invokevirtual getMessage : ()Ljava/lang/String;
    //   3931: invokespecial <init> : (Ljava/lang/String;)V
    //   3934: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1732	3922	java/lang/Throwable
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
    //   659	996	999	java/lang/Throwable
    //   830	840	840	java/lang/Throwable
    //   844	856	856	java/lang/Throwable
    //   860	872	872	java/lang/Throwable
    //   876	889	889	java/lang/Throwable
    //   893	906	906	java/lang/Throwable
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
    //   1434	1448	1448	java/lang/Throwable
    //   1459	1472	1475	java/lang/Throwable
    //   1464	1487	1490	java/lang/Throwable
    //   1479	1505	1508	java/lang/Throwable
    //   1494	1535	1538	java/lang/Throwable
    //   1601	1628	1631	java/lang/Throwable
    //   1618	1646	1649	java/lang/Throwable
    //   1635	1676	1679	java/lang/Throwable
    //   1653	1687	1687	java/lang/Throwable
    //   1709	1720	1723	java/lang/Throwable
    //   1733	2463	3922	java/lang/Throwable
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
    //   2165	2179	2179	java/lang/Throwable
    //   2190	2203	2206	java/lang/Throwable
    //   2195	2218	2221	java/lang/Throwable
    //   2210	2236	2239	java/lang/Throwable
    //   2225	2266	2269	java/lang/Throwable
    //   2332	2359	2362	java/lang/Throwable
    //   2349	2377	2380	java/lang/Throwable
    //   2366	2407	2410	java/lang/Throwable
    //   2384	2418	2418	java/lang/Throwable
    //   2440	2451	2454	java/lang/Throwable
    //   2464	3194	3922	java/lang/Throwable
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
    //   2896	2910	2910	java/lang/Throwable
    //   2921	2934	2937	java/lang/Throwable
    //   2926	2949	2952	java/lang/Throwable
    //   2941	2967	2970	java/lang/Throwable
    //   2956	2997	3000	java/lang/Throwable
    //   3063	3090	3093	java/lang/Throwable
    //   3080	3108	3111	java/lang/Throwable
    //   3097	3138	3141	java/lang/Throwable
    //   3115	3149	3149	java/lang/Throwable
    //   3171	3182	3185	java/lang/Throwable
    //   3195	3921	3922	java/lang/Throwable
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
    //   3627	3641	3641	java/lang/Throwable
    //   3652	3665	3668	java/lang/Throwable
    //   3657	3680	3683	java/lang/Throwable
    //   3672	3698	3701	java/lang/Throwable
    //   3687	3728	3731	java/lang/Throwable
    //   3794	3821	3824	java/lang/Throwable
    //   3811	3839	3842	java/lang/Throwable
    //   3828	3869	3872	java/lang/Throwable
    //   3846	3880	3880	java/lang/Throwable
    //   3902	3913	3916	java/lang/Throwable
  }
  
  static void ZP(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZG(Object paramObject) {
    Zeb3.ZG = a(9914, -20709);
    Zeb3.Zb = new BigInteger(a(9908, 6573));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zgkn.ZV.charAt(Math.abs(((BigInteger)Zrd4.Ze).intValue() % 32)) <= Zsf3.Zb.charAt(Math.abs(((BigInteger)Zm5p.Ze).intValue() % 32))) {
          try {
            Zb14.ZW(Class.forName(a(9889, 28686)));
            if (!bool)
              Zl8f.Zn(Class.forName(a(9906, 17735))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zl8f.Zn(Class.forName(a(9906, 17735)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #30
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'I×Ømx=vH½/å]æÜ<·µ'm¢Ï\\fÄ»®\\tejµ¿m\\taFê\¥¶KÂ\\tx%\N>\\t?\\t¾vÚóî¾%zõ\\t¶%0ú;àû¶\\tîÅ,¸ßz\\t«º³ÃEb>f\\tÖg"ÑûþÐ\\tN(,?\\t­ªsÁgm\\bÄ®^A3Ó2\\t.pn¹]wM88.\\t-3±Ë kÆáèß*\\nAEY\\nýÅvÔUò óz/hMõ²´)¡öBl³n6\çHÄæ\\rfd<h\°DHØÁV¬\\tÀÞV#÷ÎcØ\\t¥þrK¶TzÎ\\b¦[ÿº÷äñ\\t{©%Í©ub×é(Ëgn 0µÜ¯snbüåqI:¶iîþÝº\\t÷Y8¿ÿÊ@Þ± \\nï§C6eüT_0\\fôµ«æôóÁ\\fu²fªÊL\\t\\tç×Ç"bR\\tÊâÈ$Þ.a\\täZD³µÖ1\\bX)Í±A¦'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #89
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
    //   68: ldc 'rGÆ2n5((u\\t¢Ü¹-DIJh'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #114
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
    //   129: putstatic burp/Zzou.a : [Ljava/lang/String;
    //   132: bipush #30
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zzou.b : [Ljava/lang/String;
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
    //   212: bipush #119
    //   214: goto -> 244
    //   217: bipush #115
    //   219: goto -> 244
    //   222: bipush #6
    //   224: goto -> 244
    //   227: bipush #35
    //   229: goto -> 244
    //   232: bipush #88
    //   234: goto -> 244
    //   237: bipush #15
    //   239: goto -> 244
    //   242: bipush #74
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
    //   310: bipush #121
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-116
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #64
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-99
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #119
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-20
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #70
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #106
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #80
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #-79
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #70
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #32
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #-21
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #27
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: iconst_1
    //   390: bastore
    //   391: dup
    //   392: bipush #15
    //   394: bipush #-96
    //   396: bastore
    //   397: dup
    //   398: bipush #16
    //   400: bipush #-46
    //   402: bastore
    //   403: dup
    //   404: bipush #17
    //   406: bipush #48
    //   408: bastore
    //   409: dup
    //   410: bipush #18
    //   412: bipush #-110
    //   414: bastore
    //   415: dup
    //   416: bipush #19
    //   418: bipush #119
    //   420: bastore
    //   421: dup
    //   422: bipush #20
    //   424: bipush #9
    //   426: bastore
    //   427: dup
    //   428: bipush #21
    //   430: bipush #7
    //   432: bastore
    //   433: dup
    //   434: bipush #22
    //   436: bipush #23
    //   438: bastore
    //   439: dup
    //   440: bipush #23
    //   442: bipush #96
    //   444: bastore
    //   445: dup
    //   446: bipush #24
    //   448: bipush #16
    //   450: bastore
    //   451: dup
    //   452: bipush #25
    //   454: bipush #-57
    //   456: bastore
    //   457: dup
    //   458: bipush #26
    //   460: bipush #-18
    //   462: bastore
    //   463: dup
    //   464: bipush #27
    //   466: bipush #-7
    //   468: bastore
    //   469: dup
    //   470: bipush #28
    //   472: bipush #62
    //   474: bastore
    //   475: dup
    //   476: bipush #29
    //   478: bipush #88
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #-127
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: bipush #23
    //   492: bastore
    //   493: invokespecial <init> : ([B)V
    //   496: putstatic burp/Zzou.Zz : Ljava/lang/Object;
    //   499: sipush #9901
    //   502: sipush #558
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Zzou.ZN : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x26BA) & 0xFFFF;
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
      char c = 'ª';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzou.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */