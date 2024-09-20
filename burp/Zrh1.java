package burp;

import java.math.BigInteger;

class Zrh1 extends ClassLoader {
  static Object ZF;
  
  static String Zg;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zp(Object paramObject) {
    Zmvk.Z_ = a(4834, -21699);
    Zmvk.ZK = new BigInteger(a(4844, -11879));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Ztsc.ZL.charAt(Math.abs(((BigInteger)Zevc.Zm).intValue() % 32)) <= Zbzj.Zw.charAt(Math.abs(((BigInteger)Zecm.ZJ).intValue() % 32))) {
          try {
            Zth8.Zp(Class.forName(a(4839, 4802)));
            if (bool)
              Zk12.ZP(Class.forName(a(4835, -10237))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zk12.ZP(Class.forName(a(4835, -10237)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZX(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zg_6.ZU : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zxz_.Zv : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zxzt.ZY : Ljava/lang/Object;
    //   22: sipush #4847
    //   25: sipush #17335
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zlo2
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
    //   150: sipush #4843
    //   153: sipush #-27215
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
    //   192: sipush #4837
    //   195: sipush #-4517
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
    //   330: sipush #4845
    //   333: sipush #9886
    //   336: invokestatic a : (II)Ljava/lang/String;
    //   339: iconst_1
    //   340: ldc burp/Zry0
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
    //   458: sipush #4832
    //   461: sipush #8234
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
    //   500: sipush #4846
    //   503: sipush #19362
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
    //   667: sipush #4840
    //   670: aload_3
    //   671: sipush #202
    //   674: invokevirtual write : (I)V
    //   677: sipush #32763
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
    //   723: getstatic burp/Zbxa.ZS : Ljava/lang/Object;
    //   726: checkcast java/math/BigInteger
    //   729: invokevirtual toByteArray : ()[B
    //   732: invokevirtual write : ([B)V
    //   735: aload_3
    //   736: getstatic burp/Zsyu.Zj : Ljava/lang/Object;
    //   739: checkcast java/math/BigInteger
    //   742: invokevirtual toByteArray : ()[B
    //   745: invokevirtual write : ([B)V
    //   748: aload_3
    //   749: getstatic burp/Zgmt.ZX : Ljava/lang/Object;
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
    //   808: sipush #4836
    //   811: sipush #3673
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
    //   927: ldc burp/Zb3p
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
    //   961: sipush #4838
    //   964: sipush #-25690
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
    //   1000: getstatic burp/Zth8.ZN : Ljava/lang/String;
    //   1003: getstatic burp/Zmhx.ZQ : Ljava/lang/Object;
    //   1006: checkcast java/math/BigInteger
    //   1009: invokevirtual intValue : ()I
    //   1012: bipush #32
    //   1014: irem
    //   1015: invokestatic abs : (I)I
    //   1018: invokevirtual charAt : (I)C
    //   1021: getstatic burp/Zgnp.ZL : Ljava/lang/String;
    //   1024: getstatic burp/Ztkh.Zh : Ljava/lang/Object;
    //   1027: checkcast java/math/BigInteger
    //   1030: invokevirtual intValue : ()I
    //   1033: bipush #32
    //   1035: irem
    //   1036: invokestatic abs : (I)I
    //   1039: invokevirtual charAt : (I)C
    //   1042: if_icmpgt -> 1157
    //   1045: getstatic burp/Ztpg.Zr : Ljava/lang/String;
    //   1048: getstatic burp/Ztq8.Zm : Ljava/lang/Object;
    //   1051: checkcast java/math/BigInteger
    //   1054: invokevirtual intValue : ()I
    //   1057: bipush #32
    //   1059: irem
    //   1060: invokestatic abs : (I)I
    //   1063: invokevirtual charAt : (I)C
    //   1066: getstatic burp/Zg2z.ZE : Ljava/lang/String;
    //   1069: getstatic burp/Zzap.ZL : Ljava/lang/Object;
    //   1072: checkcast java/math/BigInteger
    //   1075: invokevirtual intValue : ()I
    //   1078: bipush #32
    //   1080: irem
    //   1081: invokestatic abs : (I)I
    //   1084: invokevirtual charAt : (I)C
    //   1087: if_icmpgt -> 1157
    //   1090: goto -> 1097
    //   1093: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1096: athrow
    //   1097: getstatic burp/Zzxv.Z_ : Ljava/lang/String;
    //   1100: getstatic burp/Zz9p.Zw : Ljava/lang/Object;
    //   1103: checkcast java/math/BigInteger
    //   1106: invokevirtual intValue : ()I
    //   1109: bipush #32
    //   1111: irem
    //   1112: invokestatic abs : (I)I
    //   1115: invokevirtual charAt : (I)C
    //   1118: getstatic burp/Zmpp.Zk : Ljava/lang/String;
    //   1121: getstatic burp/Zevc.Zm : Ljava/lang/Object;
    //   1124: checkcast java/math/BigInteger
    //   1127: invokevirtual intValue : ()I
    //   1130: bipush #32
    //   1132: irem
    //   1133: invokestatic abs : (I)I
    //   1136: invokevirtual charAt : (I)C
    //   1139: if_icmple -> 1157
    //   1142: goto -> 1149
    //   1145: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1148: athrow
    //   1149: iconst_1
    //   1150: goto -> 1158
    //   1153: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1156: athrow
    //   1157: iconst_0
    //   1158: ireturn
    //   1159: astore_3
    //   1160: new java/lang/Exception
    //   1163: dup
    //   1164: aload_3
    //   1165: invokevirtual getMessage : ()Ljava/lang/String;
    //   1168: invokespecial <init> : (Ljava/lang/String;)V
    //   1171: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1158	1159	java/lang/Throwable
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
    //   1000	1090	1093	java/lang/Throwable
    //   1045	1142	1145	java/lang/Throwable
    //   1097	1153	1153	java/lang/Throwable
  }
  
  static void ZP(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '#FÛ¦2\\t¬íûÒ\\tíÇãmNÀ¬¡æíéL9\\t1ò0\p>èÄ µþyïÛ¿Hçé5± ÷¸[W©ó\\nÊï¿«í\\tJP'e¹:¢Æë¶ ®ºùì»¨»Øïôè\\bõ¸$£À LàóîQ&\\tÔÃ%Ë´Æ!\\tý oÇX\\bKBtìá@Ñ6:´«CÓ­ØçÃ?±*26þ÷QàZ4×&¥Xs«&°1éúºHS¿Àª¯íç9æQÌÊEß\\t4Â96H°©úMvCK?ÜßÌú½\\nëãG°"e?¶½<uóôí(<XZ³\\fVåÐ¢`Â\\rFÅ8¯¸þ\\bL  ñR\\tá5;ôx­·÷Ñ?Âù'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #8
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #77
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc 'èñ¡'òºÀeþïÿ*ÊÃÚåçðJIÇ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #101
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
    //   128: putstatic burp/Zrh1.a : [Ljava/lang/String;
    //   131: bipush #15
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zrh1.b : [Ljava/lang/String;
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
    //   212: bipush #19
    //   214: goto -> 244
    //   217: bipush #106
    //   219: goto -> 244
    //   222: bipush #101
    //   224: goto -> 244
    //   227: bipush #108
    //   229: goto -> 244
    //   232: bipush #53
    //   234: goto -> 244
    //   237: bipush #59
    //   239: goto -> 244
    //   242: bipush #123
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
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: sipush #4842
    //   307: sipush #-9825
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zrh1.ZF : Ljava/lang/Object;
    //   319: sipush #4833
    //   322: sipush #-12953
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zrh1.Zg : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x12E6) & 0xFFFF;
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
      char c = 'ç';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrh1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */