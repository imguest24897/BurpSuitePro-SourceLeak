package burp;

import java.math.BigInteger;

class Ztc2 extends ClassLoader {
  static String Zr;
  
  static Object ZM;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZV(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZQ(Object paramObject) {
    Ztw4.Zb = a(-2371, -10772);
    Ztw4.ZF = new BigInteger(a(-2394, -32012));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zkfb.ZV.charAt(Math.abs(((BigInteger)Zsot.ZJ).intValue() % 32)) <= Zbzj.Zw.charAt(Math.abs(((BigInteger)Zrxf.ZS).intValue() % 32))) {
          try {
            Zewq.ZD(Class.forName(a(-2388, -16283)));
            if (!bool)
              Zb_c.ZH(Class.forName(a(-2384, 11727))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zb_c.ZH(Class.forName(a(-2384, 11727)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zt(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zmha.ZM : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zztx.ZM : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zmh0.Zt : Ljava/lang/Object;
    //   22: sipush #-2387
    //   25: getstatic burp/Ztpg.Z_ : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: getstatic burp/Zxrd.ZL : Ljava/lang/Object;
    //   34: checkcast java/math/BigInteger
    //   37: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   40: putstatic burp/Zlhk.ZD : Ljava/lang/Object;
    //   43: sipush #2769
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: iconst_1
    //   50: ldc burp/Zzri
    //   52: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   55: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   58: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   61: astore_3
    //   62: aload_3
    //   63: arraylength
    //   64: istore #4
    //   66: iconst_0
    //   67: istore #5
    //   69: iload #5
    //   71: iload #4
    //   73: if_icmpge -> 210
    //   76: aload_3
    //   77: iload #5
    //   79: aaload
    //   80: astore #6
    //   82: aload #6
    //   84: invokevirtual getModifiers : ()I
    //   87: invokestatic isStatic : (I)Z
    //   90: ifne -> 100
    //   93: goto -> 203
    //   96: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   99: athrow
    //   100: aload #6
    //   102: invokevirtual getType : ()Ljava/lang/Class;
    //   105: astore #7
    //   107: aload #7
    //   109: ifnull -> 190
    //   112: aload #7
    //   114: invokevirtual isPrimitive : ()Z
    //   117: ifne -> 190
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   126: athrow
    //   127: aload #7
    //   129: invokevirtual getPackage : ()Ljava/lang/Package;
    //   132: ifnull -> 190
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   141: athrow
    //   142: aload #7
    //   144: invokevirtual getPackage : ()Ljava/lang/Package;
    //   147: invokevirtual getName : ()Ljava/lang/String;
    //   150: ifnull -> 190
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   159: athrow
    //   160: aload #7
    //   162: invokevirtual getPackage : ()Ljava/lang/Package;
    //   165: invokevirtual getName : ()Ljava/lang/String;
    //   168: sipush #-2381
    //   171: sipush #-27191
    //   174: invokestatic a : (II)Ljava/lang/String;
    //   177: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   180: ifne -> 190
    //   183: goto -> 190
    //   186: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   189: athrow
    //   190: aload #6
    //   192: iconst_1
    //   193: invokevirtual setAccessible : (Z)V
    //   196: aload #6
    //   198: aconst_null
    //   199: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   202: pop
    //   203: iinc #5, 1
    //   206: iload_2
    //   207: ifeq -> 69
    //   210: sipush #-2399
    //   213: sipush #-29909
    //   216: invokestatic a : (II)Ljava/lang/String;
    //   219: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   222: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   225: astore_3
    //   226: aload_3
    //   227: arraylength
    //   228: istore #4
    //   230: iconst_0
    //   231: istore #5
    //   233: iload #5
    //   235: iload #4
    //   237: if_icmpge -> 348
    //   240: aload_3
    //   241: iload #5
    //   243: aaload
    //   244: astore #6
    //   246: aload #6
    //   248: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   251: pop
    //   252: aload #6
    //   254: invokevirtual getModifiers : ()I
    //   257: invokestatic isStatic : (I)Z
    //   260: ifeq -> 334
    //   263: aload #6
    //   265: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   268: arraylength
    //   269: iconst_2
    //   270: if_icmpne -> 334
    //   273: goto -> 280
    //   276: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   279: athrow
    //   280: aload #6
    //   282: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   285: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   288: if_acmpne -> 334
    //   291: goto -> 298
    //   294: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   297: athrow
    //   298: aload #6
    //   300: iconst_1
    //   301: invokevirtual setAccessible : (Z)V
    //   304: aload #6
    //   306: aconst_null
    //   307: iconst_2
    //   308: anewarray java/lang/Object
    //   311: dup
    //   312: iconst_0
    //   313: aload_0
    //   314: aastore
    //   315: dup
    //   316: iconst_1
    //   317: aload_1
    //   318: aastore
    //   319: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   322: pop
    //   323: iload_2
    //   324: ifeq -> 348
    //   327: goto -> 334
    //   330: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   333: athrow
    //   334: iinc #5, 1
    //   337: iload_2
    //   338: ifeq -> 233
    //   341: goto -> 348
    //   344: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   347: athrow
    //   348: sipush #-2398
    //   351: sipush #-14377
    //   354: invokestatic a : (II)Ljava/lang/String;
    //   357: iconst_1
    //   358: ldc burp/Zl1n
    //   360: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   363: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   366: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   369: astore_3
    //   370: aload_3
    //   371: arraylength
    //   372: istore #4
    //   374: iconst_0
    //   375: istore #5
    //   377: iload #5
    //   379: iload #4
    //   381: if_icmpge -> 518
    //   384: aload_3
    //   385: iload #5
    //   387: aaload
    //   388: astore #6
    //   390: aload #6
    //   392: invokevirtual getModifiers : ()I
    //   395: invokestatic isStatic : (I)Z
    //   398: ifne -> 408
    //   401: goto -> 511
    //   404: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   407: athrow
    //   408: aload #6
    //   410: invokevirtual getType : ()Ljava/lang/Class;
    //   413: astore #7
    //   415: aload #7
    //   417: ifnull -> 498
    //   420: aload #7
    //   422: invokevirtual isPrimitive : ()Z
    //   425: ifne -> 498
    //   428: goto -> 435
    //   431: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   434: athrow
    //   435: aload #7
    //   437: invokevirtual getPackage : ()Ljava/lang/Package;
    //   440: ifnull -> 498
    //   443: goto -> 450
    //   446: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   449: athrow
    //   450: aload #7
    //   452: invokevirtual getPackage : ()Ljava/lang/Package;
    //   455: invokevirtual getName : ()Ljava/lang/String;
    //   458: ifnull -> 498
    //   461: goto -> 468
    //   464: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   467: athrow
    //   468: aload #7
    //   470: invokevirtual getPackage : ()Ljava/lang/Package;
    //   473: invokevirtual getName : ()Ljava/lang/String;
    //   476: sipush #-2393
    //   479: sipush #18894
    //   482: invokestatic a : (II)Ljava/lang/String;
    //   485: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   488: ifne -> 498
    //   491: goto -> 498
    //   494: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   497: athrow
    //   498: aload #6
    //   500: iconst_1
    //   501: invokevirtual setAccessible : (Z)V
    //   504: aload #6
    //   506: aconst_null
    //   507: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   510: pop
    //   511: iinc #5, 1
    //   514: iload_2
    //   515: ifeq -> 377
    //   518: sipush #-2374
    //   521: sipush #16486
    //   524: invokestatic a : (II)Ljava/lang/String;
    //   527: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   530: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   533: astore_3
    //   534: aload_3
    //   535: arraylength
    //   536: istore #4
    //   538: iconst_0
    //   539: istore #5
    //   541: iload #5
    //   543: iload #4
    //   545: if_icmpge -> 677
    //   548: aload_3
    //   549: iload #5
    //   551: aaload
    //   552: astore #6
    //   554: aload #6
    //   556: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   559: pop
    //   560: aload #6
    //   562: invokevirtual getModifiers : ()I
    //   565: invokestatic isStatic : (I)Z
    //   568: ifeq -> 663
    //   571: aload #6
    //   573: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   576: arraylength
    //   577: iconst_2
    //   578: if_icmpne -> 663
    //   581: goto -> 588
    //   584: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   587: athrow
    //   588: aload #6
    //   590: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   593: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   596: invokevirtual equals : (Ljava/lang/Object;)Z
    //   599: ifeq -> 663
    //   602: goto -> 609
    //   605: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   608: athrow
    //   609: aload #6
    //   611: iconst_1
    //   612: invokevirtual setAccessible : (Z)V
    //   615: aload #6
    //   617: aconst_null
    //   618: iconst_2
    //   619: anewarray java/lang/Object
    //   622: dup
    //   623: iconst_0
    //   624: aload_0
    //   625: aastore
    //   626: dup
    //   627: iconst_1
    //   628: aload_1
    //   629: ifnonnull -> 647
    //   632: goto -> 639
    //   635: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   638: athrow
    //   639: aload_1
    //   640: goto -> 654
    //   643: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   646: athrow
    //   647: aload_1
    //   648: checkcast [B
    //   651: invokevirtual clone : ()Ljava/lang/Object;
    //   654: aastore
    //   655: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   658: pop
    //   659: iload_2
    //   660: ifeq -> 677
    //   663: iinc #5, 1
    //   666: iload_2
    //   667: ifeq -> 541
    //   670: goto -> 677
    //   673: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   676: athrow
    //   677: new java/io/ByteArrayOutputStream
    //   680: dup
    //   681: invokespecial <init> : ()V
    //   684: astore_3
    //   685: sipush #-2382
    //   688: aload_3
    //   689: sipush #202
    //   692: invokevirtual write : (I)V
    //   695: sipush #15952
    //   698: aload_3
    //   699: sipush #254
    //   702: invokevirtual write : (I)V
    //   705: aload_3
    //   706: sipush #186
    //   709: invokevirtual write : (I)V
    //   712: aload_3
    //   713: sipush #190
    //   716: invokevirtual write : (I)V
    //   719: aload_3
    //   720: iconst_0
    //   721: invokevirtual write : (I)V
    //   724: aload_3
    //   725: iconst_1
    //   726: invokevirtual write : (I)V
    //   729: aload_3
    //   730: iconst_0
    //   731: invokevirtual write : (I)V
    //   734: aload_3
    //   735: bipush #50
    //   737: invokevirtual write : (I)V
    //   740: aload_3
    //   741: getstatic burp/Zb8y.ZI : Ljava/lang/Object;
    //   744: checkcast java/math/BigInteger
    //   747: invokevirtual toByteArray : ()[B
    //   750: invokevirtual write : ([B)V
    //   753: aload_3
    //   754: getstatic burp/Ze6k.Zs : Ljava/lang/Object;
    //   757: checkcast java/math/BigInteger
    //   760: invokevirtual toByteArray : ()[B
    //   763: invokevirtual write : ([B)V
    //   766: aload_3
    //   767: getstatic burp/Zbz_.ZU : Ljava/lang/Object;
    //   770: checkcast java/math/BigInteger
    //   773: invokevirtual toByteArray : ()[B
    //   776: invokevirtual write : ([B)V
    //   779: aload_3
    //   780: invokevirtual toByteArray : ()[B
    //   783: astore #4
    //   785: aconst_null
    //   786: astore #5
    //   788: invokestatic a : (II)Ljava/lang/String;
    //   791: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   794: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   797: astore #6
    //   799: aload #6
    //   801: arraylength
    //   802: istore #7
    //   804: iconst_0
    //   805: istore #8
    //   807: iload #8
    //   809: iload #7
    //   811: if_icmpge -> 939
    //   814: aload #6
    //   816: iload #8
    //   818: aaload
    //   819: astore #9
    //   821: aload #9
    //   823: invokevirtual getName : ()Ljava/lang/String;
    //   826: sipush #-2378
    //   829: sipush #-20880
    //   832: invokestatic a : (II)Ljava/lang/String;
    //   835: invokevirtual equals : (Ljava/lang/Object;)Z
    //   838: ifeq -> 932
    //   841: aload #9
    //   843: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   846: astore #10
    //   848: aload #10
    //   850: arraylength
    //   851: iconst_4
    //   852: if_icmpeq -> 862
    //   855: goto -> 932
    //   858: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   861: athrow
    //   862: aload #10
    //   864: iconst_0
    //   865: aaload
    //   866: ldc java/lang/String
    //   868: if_acmpeq -> 878
    //   871: goto -> 932
    //   874: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   877: athrow
    //   878: aload #10
    //   880: iconst_1
    //   881: aaload
    //   882: ldc [B
    //   884: if_acmpeq -> 894
    //   887: goto -> 932
    //   890: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   893: athrow
    //   894: aload #10
    //   896: iconst_2
    //   897: aaload
    //   898: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   901: if_acmpeq -> 911
    //   904: goto -> 932
    //   907: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   910: athrow
    //   911: aload #10
    //   913: iconst_3
    //   914: aaload
    //   915: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   918: if_acmpeq -> 928
    //   921: goto -> 932
    //   924: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   927: athrow
    //   928: aload #9
    //   930: astore #5
    //   932: iinc #8, 1
    //   935: iload_2
    //   936: ifeq -> 807
    //   939: aload #5
    //   941: iconst_1
    //   942: invokevirtual setAccessible : (Z)V
    //   945: ldc burp/Zod
    //   947: iconst_0
    //   948: anewarray java/lang/Class
    //   951: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   954: astore #6
    //   956: aload #6
    //   958: iconst_1
    //   959: invokevirtual setAccessible : (Z)V
    //   962: aload #5
    //   964: aload #6
    //   966: iconst_0
    //   967: anewarray java/lang/Object
    //   970: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   973: iconst_4
    //   974: anewarray java/lang/Object
    //   977: dup
    //   978: iconst_0
    //   979: sipush #-2397
    //   982: sipush #6079
    //   985: invokestatic a : (II)Ljava/lang/String;
    //   988: aastore
    //   989: dup
    //   990: iconst_1
    //   991: aload #4
    //   993: aastore
    //   994: dup
    //   995: iconst_2
    //   996: iconst_0
    //   997: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1000: aastore
    //   1001: dup
    //   1002: iconst_3
    //   1003: aload #4
    //   1005: arraylength
    //   1006: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1009: aastore
    //   1010: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1013: pop
    //   1014: goto -> 1018
    //   1017: astore_3
    //   1018: iconst_0
    //   1019: istore_3
    //   1020: getstatic burp/Zeju.ZR : Ljava/lang/String;
    //   1023: getstatic burp/Zgs6.Za : Ljava/lang/Object;
    //   1026: checkcast java/math/BigInteger
    //   1029: invokevirtual intValue : ()I
    //   1032: bipush #32
    //   1034: irem
    //   1035: invokestatic abs : (I)I
    //   1038: invokevirtual charAt : (I)C
    //   1041: getstatic burp/Ztdg.ZS : Ljava/lang/String;
    //   1044: getstatic burp/Zlvx.ZM : Ljava/lang/Object;
    //   1047: checkcast java/math/BigInteger
    //   1050: invokevirtual intValue : ()I
    //   1053: bipush #32
    //   1055: irem
    //   1056: invokestatic abs : (I)I
    //   1059: invokevirtual charAt : (I)C
    //   1062: if_icmple -> 1407
    //   1065: sipush #-2379
    //   1068: sipush #19771
    //   1071: invokestatic a : (II)Ljava/lang/String;
    //   1074: iconst_1
    //   1075: ldc burp/Zehi
    //   1077: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1080: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1083: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1086: astore #4
    //   1088: aload #4
    //   1090: arraylength
    //   1091: istore #5
    //   1093: iconst_0
    //   1094: istore #6
    //   1096: iload #6
    //   1098: iload #5
    //   1100: if_icmpge -> 1238
    //   1103: aload #4
    //   1105: iload #6
    //   1107: aaload
    //   1108: astore #7
    //   1110: aload #7
    //   1112: invokevirtual getModifiers : ()I
    //   1115: invokestatic isStatic : (I)Z
    //   1118: ifne -> 1128
    //   1121: goto -> 1231
    //   1124: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1127: athrow
    //   1128: aload #7
    //   1130: invokevirtual getType : ()Ljava/lang/Class;
    //   1133: astore #8
    //   1135: aload #8
    //   1137: ifnull -> 1218
    //   1140: aload #8
    //   1142: invokevirtual isPrimitive : ()Z
    //   1145: ifne -> 1218
    //   1148: goto -> 1155
    //   1151: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1154: athrow
    //   1155: aload #8
    //   1157: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1160: ifnull -> 1218
    //   1163: goto -> 1170
    //   1166: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1169: athrow
    //   1170: aload #8
    //   1172: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1175: invokevirtual getName : ()Ljava/lang/String;
    //   1178: ifnull -> 1218
    //   1181: goto -> 1188
    //   1184: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1187: athrow
    //   1188: aload #8
    //   1190: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1193: invokevirtual getName : ()Ljava/lang/String;
    //   1196: sipush #-2393
    //   1199: sipush #18894
    //   1202: invokestatic a : (II)Ljava/lang/String;
    //   1205: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1208: ifne -> 1218
    //   1211: goto -> 1218
    //   1214: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1217: athrow
    //   1218: aload #7
    //   1220: iconst_1
    //   1221: invokevirtual setAccessible : (Z)V
    //   1224: aload #7
    //   1226: aconst_null
    //   1227: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1230: pop
    //   1231: iinc #6, 1
    //   1234: iload_2
    //   1235: ifeq -> 1096
    //   1238: sipush #-2377
    //   1241: sipush #3323
    //   1244: invokestatic a : (II)Ljava/lang/String;
    //   1247: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1250: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1253: astore #4
    //   1255: aload #4
    //   1257: arraylength
    //   1258: istore #5
    //   1260: iconst_0
    //   1261: istore #6
    //   1263: iload #6
    //   1265: iload #5
    //   1267: if_icmpge -> 1403
    //   1270: aload #4
    //   1272: iload #6
    //   1274: aaload
    //   1275: astore #7
    //   1277: aload #7
    //   1279: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1282: pop
    //   1283: aload #7
    //   1285: invokevirtual getModifiers : ()I
    //   1288: invokestatic isStatic : (I)Z
    //   1291: ifeq -> 1389
    //   1294: aload #7
    //   1296: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1299: arraylength
    //   1300: iconst_2
    //   1301: if_icmpne -> 1389
    //   1304: goto -> 1311
    //   1307: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1310: athrow
    //   1311: aload #7
    //   1313: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1316: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1319: if_acmpne -> 1389
    //   1322: goto -> 1329
    //   1325: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1328: athrow
    //   1329: aload #7
    //   1331: iconst_1
    //   1332: invokevirtual setAccessible : (Z)V
    //   1335: aload #7
    //   1337: aconst_null
    //   1338: iconst_2
    //   1339: anewarray java/lang/Object
    //   1342: dup
    //   1343: iconst_0
    //   1344: aload_0
    //   1345: aastore
    //   1346: dup
    //   1347: iconst_1
    //   1348: aload_1
    //   1349: ifnonnull -> 1367
    //   1352: goto -> 1359
    //   1355: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1358: athrow
    //   1359: aload_1
    //   1360: goto -> 1374
    //   1363: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1366: athrow
    //   1367: aload_1
    //   1368: checkcast [B
    //   1371: invokevirtual clone : ()Ljava/lang/Object;
    //   1374: aastore
    //   1375: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1378: checkcast java/lang/Boolean
    //   1381: invokevirtual booleanValue : ()Z
    //   1384: istore_3
    //   1385: iload_2
    //   1386: ifeq -> 1403
    //   1389: iinc #6, 1
    //   1392: iload_2
    //   1393: ifeq -> 1263
    //   1396: goto -> 1403
    //   1399: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1402: athrow
    //   1403: iload_2
    //   1404: ifeq -> 1745
    //   1407: sipush #-2395
    //   1410: sipush #3270
    //   1413: invokestatic a : (II)Ljava/lang/String;
    //   1416: iconst_1
    //   1417: ldc burp/Zx4l
    //   1419: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1422: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1425: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1428: astore #4
    //   1430: aload #4
    //   1432: arraylength
    //   1433: istore #5
    //   1435: iconst_0
    //   1436: istore #6
    //   1438: iload #6
    //   1440: iload #5
    //   1442: if_icmpge -> 1580
    //   1445: aload #4
    //   1447: iload #6
    //   1449: aaload
    //   1450: astore #7
    //   1452: aload #7
    //   1454: invokevirtual getModifiers : ()I
    //   1457: invokestatic isStatic : (I)Z
    //   1460: ifne -> 1470
    //   1463: goto -> 1573
    //   1466: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1469: athrow
    //   1470: aload #7
    //   1472: invokevirtual getType : ()Ljava/lang/Class;
    //   1475: astore #8
    //   1477: aload #8
    //   1479: ifnull -> 1560
    //   1482: aload #8
    //   1484: invokevirtual isPrimitive : ()Z
    //   1487: ifne -> 1560
    //   1490: goto -> 1497
    //   1493: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1496: athrow
    //   1497: aload #8
    //   1499: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1502: ifnull -> 1560
    //   1505: goto -> 1512
    //   1508: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1511: athrow
    //   1512: aload #8
    //   1514: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1517: invokevirtual getName : ()Ljava/lang/String;
    //   1520: ifnull -> 1560
    //   1523: goto -> 1530
    //   1526: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1529: athrow
    //   1530: aload #8
    //   1532: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1535: invokevirtual getName : ()Ljava/lang/String;
    //   1538: sipush #-2393
    //   1541: sipush #18894
    //   1544: invokestatic a : (II)Ljava/lang/String;
    //   1547: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1550: ifne -> 1560
    //   1553: goto -> 1560
    //   1556: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1559: athrow
    //   1560: aload #7
    //   1562: iconst_1
    //   1563: invokevirtual setAccessible : (Z)V
    //   1566: aload #7
    //   1568: aconst_null
    //   1569: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1572: pop
    //   1573: iinc #6, 1
    //   1576: iload_2
    //   1577: ifeq -> 1438
    //   1580: sipush #-2391
    //   1583: sipush #-8042
    //   1586: invokestatic a : (II)Ljava/lang/String;
    //   1589: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1592: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1595: astore #4
    //   1597: aload #4
    //   1599: arraylength
    //   1600: istore #5
    //   1602: iconst_0
    //   1603: istore #6
    //   1605: iload #6
    //   1607: iload #5
    //   1609: if_icmpge -> 1745
    //   1612: aload #4
    //   1614: iload #6
    //   1616: aaload
    //   1617: astore #7
    //   1619: aload #7
    //   1621: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1624: pop
    //   1625: aload #7
    //   1627: invokevirtual getModifiers : ()I
    //   1630: invokestatic isStatic : (I)Z
    //   1633: ifeq -> 1731
    //   1636: aload #7
    //   1638: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1641: arraylength
    //   1642: iconst_2
    //   1643: if_icmpne -> 1731
    //   1646: goto -> 1653
    //   1649: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1652: athrow
    //   1653: aload #7
    //   1655: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1658: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1661: if_acmpne -> 1731
    //   1664: goto -> 1671
    //   1667: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1670: athrow
    //   1671: aload #7
    //   1673: iconst_1
    //   1674: invokevirtual setAccessible : (Z)V
    //   1677: aload #7
    //   1679: aconst_null
    //   1680: iconst_2
    //   1681: anewarray java/lang/Object
    //   1684: dup
    //   1685: iconst_0
    //   1686: aload_0
    //   1687: aastore
    //   1688: dup
    //   1689: iconst_1
    //   1690: aload_1
    //   1691: ifnonnull -> 1709
    //   1694: goto -> 1701
    //   1697: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1700: athrow
    //   1701: aload_1
    //   1702: goto -> 1716
    //   1705: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1708: athrow
    //   1709: aload_1
    //   1710: checkcast [B
    //   1713: invokevirtual clone : ()Ljava/lang/Object;
    //   1716: aastore
    //   1717: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1720: checkcast java/lang/Boolean
    //   1723: invokevirtual booleanValue : ()Z
    //   1726: istore_3
    //   1727: iload_2
    //   1728: ifeq -> 1745
    //   1731: iinc #6, 1
    //   1734: iload_2
    //   1735: ifeq -> 1605
    //   1738: goto -> 1745
    //   1741: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1744: athrow
    //   1745: iload_3
    //   1746: ifeq -> 1751
    //   1749: iload_3
    //   1750: ireturn
    //   1751: getstatic burp/Zzh9.ZF : Ljava/lang/String;
    //   1754: getstatic burp/Zre4.Zx : Ljava/lang/Object;
    //   1757: checkcast java/math/BigInteger
    //   1760: invokevirtual intValue : ()I
    //   1763: bipush #32
    //   1765: irem
    //   1766: invokestatic abs : (I)I
    //   1769: invokevirtual charAt : (I)C
    //   1772: getstatic burp/Zth8.ZN : Ljava/lang/String;
    //   1775: getstatic burp/Zrnw.ZN : Ljava/lang/Object;
    //   1778: checkcast java/math/BigInteger
    //   1781: invokevirtual intValue : ()I
    //   1784: bipush #32
    //   1786: irem
    //   1787: invokestatic abs : (I)I
    //   1790: invokevirtual charAt : (I)C
    //   1793: if_icmple -> 2138
    //   1796: sipush #-2383
    //   1799: sipush #-18892
    //   1802: invokestatic a : (II)Ljava/lang/String;
    //   1805: iconst_1
    //   1806: ldc burp/Zkvr
    //   1808: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1811: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1814: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1817: astore #4
    //   1819: aload #4
    //   1821: arraylength
    //   1822: istore #5
    //   1824: iconst_0
    //   1825: istore #6
    //   1827: iload #6
    //   1829: iload #5
    //   1831: if_icmpge -> 1969
    //   1834: aload #4
    //   1836: iload #6
    //   1838: aaload
    //   1839: astore #7
    //   1841: aload #7
    //   1843: invokevirtual getModifiers : ()I
    //   1846: invokestatic isStatic : (I)Z
    //   1849: ifne -> 1859
    //   1852: goto -> 1962
    //   1855: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1858: athrow
    //   1859: aload #7
    //   1861: invokevirtual getType : ()Ljava/lang/Class;
    //   1864: astore #8
    //   1866: aload #8
    //   1868: ifnull -> 1949
    //   1871: aload #8
    //   1873: invokevirtual isPrimitive : ()Z
    //   1876: ifne -> 1949
    //   1879: goto -> 1886
    //   1882: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1885: athrow
    //   1886: aload #8
    //   1888: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1891: ifnull -> 1949
    //   1894: goto -> 1901
    //   1897: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1900: athrow
    //   1901: aload #8
    //   1903: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1906: invokevirtual getName : ()Ljava/lang/String;
    //   1909: ifnull -> 1949
    //   1912: goto -> 1919
    //   1915: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1918: athrow
    //   1919: aload #8
    //   1921: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1924: invokevirtual getName : ()Ljava/lang/String;
    //   1927: sipush #-2393
    //   1930: sipush #18894
    //   1933: invokestatic a : (II)Ljava/lang/String;
    //   1936: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1939: ifne -> 1949
    //   1942: goto -> 1949
    //   1945: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1948: athrow
    //   1949: aload #7
    //   1951: iconst_1
    //   1952: invokevirtual setAccessible : (Z)V
    //   1955: aload #7
    //   1957: aconst_null
    //   1958: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1961: pop
    //   1962: iinc #6, 1
    //   1965: iload_2
    //   1966: ifeq -> 1827
    //   1969: sipush #-2385
    //   1972: sipush #29629
    //   1975: invokestatic a : (II)Ljava/lang/String;
    //   1978: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1981: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1984: astore #4
    //   1986: aload #4
    //   1988: arraylength
    //   1989: istore #5
    //   1991: iconst_0
    //   1992: istore #6
    //   1994: iload #6
    //   1996: iload #5
    //   1998: if_icmpge -> 2134
    //   2001: aload #4
    //   2003: iload #6
    //   2005: aaload
    //   2006: astore #7
    //   2008: aload #7
    //   2010: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2013: pop
    //   2014: aload #7
    //   2016: invokevirtual getModifiers : ()I
    //   2019: invokestatic isStatic : (I)Z
    //   2022: ifeq -> 2120
    //   2025: aload #7
    //   2027: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2030: arraylength
    //   2031: iconst_2
    //   2032: if_icmpne -> 2120
    //   2035: goto -> 2042
    //   2038: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2041: athrow
    //   2042: aload #7
    //   2044: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2047: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2050: if_acmpne -> 2120
    //   2053: goto -> 2060
    //   2056: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2059: athrow
    //   2060: aload #7
    //   2062: iconst_1
    //   2063: invokevirtual setAccessible : (Z)V
    //   2066: aload #7
    //   2068: aconst_null
    //   2069: iconst_2
    //   2070: anewarray java/lang/Object
    //   2073: dup
    //   2074: iconst_0
    //   2075: aload_0
    //   2076: aastore
    //   2077: dup
    //   2078: iconst_1
    //   2079: aload_1
    //   2080: ifnonnull -> 2098
    //   2083: goto -> 2090
    //   2086: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2089: athrow
    //   2090: aload_1
    //   2091: goto -> 2105
    //   2094: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2097: athrow
    //   2098: aload_1
    //   2099: checkcast [B
    //   2102: invokevirtual clone : ()Ljava/lang/Object;
    //   2105: aastore
    //   2106: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2109: checkcast java/lang/Boolean
    //   2112: invokevirtual booleanValue : ()Z
    //   2115: istore_3
    //   2116: iload_2
    //   2117: ifeq -> 2134
    //   2120: iinc #6, 1
    //   2123: iload_2
    //   2124: ifeq -> 1994
    //   2127: goto -> 2134
    //   2130: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2133: athrow
    //   2134: iload_2
    //   2135: ifeq -> 2476
    //   2138: sipush #-2373
    //   2141: sipush #-30768
    //   2144: invokestatic a : (II)Ljava/lang/String;
    //   2147: iconst_1
    //   2148: ldc burp/Zd1
    //   2150: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2153: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2156: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2159: astore #4
    //   2161: aload #4
    //   2163: arraylength
    //   2164: istore #5
    //   2166: iconst_0
    //   2167: istore #6
    //   2169: iload #6
    //   2171: iload #5
    //   2173: if_icmpge -> 2311
    //   2176: aload #4
    //   2178: iload #6
    //   2180: aaload
    //   2181: astore #7
    //   2183: aload #7
    //   2185: invokevirtual getModifiers : ()I
    //   2188: invokestatic isStatic : (I)Z
    //   2191: ifne -> 2201
    //   2194: goto -> 2304
    //   2197: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2200: athrow
    //   2201: aload #7
    //   2203: invokevirtual getType : ()Ljava/lang/Class;
    //   2206: astore #8
    //   2208: aload #8
    //   2210: ifnull -> 2291
    //   2213: aload #8
    //   2215: invokevirtual isPrimitive : ()Z
    //   2218: ifne -> 2291
    //   2221: goto -> 2228
    //   2224: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2227: athrow
    //   2228: aload #8
    //   2230: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2233: ifnull -> 2291
    //   2236: goto -> 2243
    //   2239: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2242: athrow
    //   2243: aload #8
    //   2245: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2248: invokevirtual getName : ()Ljava/lang/String;
    //   2251: ifnull -> 2291
    //   2254: goto -> 2261
    //   2257: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2260: athrow
    //   2261: aload #8
    //   2263: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2266: invokevirtual getName : ()Ljava/lang/String;
    //   2269: sipush #-2393
    //   2272: sipush #18894
    //   2275: invokestatic a : (II)Ljava/lang/String;
    //   2278: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2281: ifne -> 2291
    //   2284: goto -> 2291
    //   2287: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2290: athrow
    //   2291: aload #7
    //   2293: iconst_1
    //   2294: invokevirtual setAccessible : (Z)V
    //   2297: aload #7
    //   2299: aconst_null
    //   2300: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2303: pop
    //   2304: iinc #6, 1
    //   2307: iload_2
    //   2308: ifeq -> 2169
    //   2311: sipush #-2386
    //   2314: sipush #-787
    //   2317: invokestatic a : (II)Ljava/lang/String;
    //   2320: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2323: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2326: astore #4
    //   2328: aload #4
    //   2330: arraylength
    //   2331: istore #5
    //   2333: iconst_0
    //   2334: istore #6
    //   2336: iload #6
    //   2338: iload #5
    //   2340: if_icmpge -> 2476
    //   2343: aload #4
    //   2345: iload #6
    //   2347: aaload
    //   2348: astore #7
    //   2350: aload #7
    //   2352: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2355: pop
    //   2356: aload #7
    //   2358: invokevirtual getModifiers : ()I
    //   2361: invokestatic isStatic : (I)Z
    //   2364: ifeq -> 2462
    //   2367: aload #7
    //   2369: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2372: arraylength
    //   2373: iconst_2
    //   2374: if_icmpne -> 2462
    //   2377: goto -> 2384
    //   2380: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2383: athrow
    //   2384: aload #7
    //   2386: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2389: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2392: if_acmpne -> 2462
    //   2395: goto -> 2402
    //   2398: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2401: athrow
    //   2402: aload #7
    //   2404: iconst_1
    //   2405: invokevirtual setAccessible : (Z)V
    //   2408: aload #7
    //   2410: aconst_null
    //   2411: iconst_2
    //   2412: anewarray java/lang/Object
    //   2415: dup
    //   2416: iconst_0
    //   2417: aload_0
    //   2418: aastore
    //   2419: dup
    //   2420: iconst_1
    //   2421: aload_1
    //   2422: ifnonnull -> 2440
    //   2425: goto -> 2432
    //   2428: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2431: athrow
    //   2432: aload_1
    //   2433: goto -> 2447
    //   2436: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2439: athrow
    //   2440: aload_1
    //   2441: checkcast [B
    //   2444: invokevirtual clone : ()Ljava/lang/Object;
    //   2447: aastore
    //   2448: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2451: checkcast java/lang/Boolean
    //   2454: invokevirtual booleanValue : ()Z
    //   2457: istore_3
    //   2458: iload_2
    //   2459: ifeq -> 2476
    //   2462: iinc #6, 1
    //   2465: iload_2
    //   2466: ifeq -> 2336
    //   2469: goto -> 2476
    //   2472: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2475: athrow
    //   2476: iload_3
    //   2477: ifeq -> 2482
    //   2480: iload_3
    //   2481: ireturn
    //   2482: getstatic burp/Zz8o.Zo : Ljava/lang/String;
    //   2485: getstatic burp/Zzoc.Zx : Ljava/lang/Object;
    //   2488: checkcast java/math/BigInteger
    //   2491: invokevirtual intValue : ()I
    //   2494: bipush #32
    //   2496: irem
    //   2497: invokestatic abs : (I)I
    //   2500: invokevirtual charAt : (I)C
    //   2503: getstatic burp/Zrp3.Zf : Ljava/lang/String;
    //   2506: getstatic burp/Ztc2.ZM : Ljava/lang/Object;
    //   2509: checkcast java/math/BigInteger
    //   2512: invokevirtual intValue : ()I
    //   2515: bipush #32
    //   2517: irem
    //   2518: invokestatic abs : (I)I
    //   2521: invokevirtual charAt : (I)C
    //   2524: if_icmpgt -> 2869
    //   2527: sipush #-2375
    //   2530: sipush #25027
    //   2533: invokestatic a : (II)Ljava/lang/String;
    //   2536: iconst_1
    //   2537: ldc burp/Zxrd
    //   2539: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2542: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2545: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2548: astore #4
    //   2550: aload #4
    //   2552: arraylength
    //   2553: istore #5
    //   2555: iconst_0
    //   2556: istore #6
    //   2558: iload #6
    //   2560: iload #5
    //   2562: if_icmpge -> 2700
    //   2565: aload #4
    //   2567: iload #6
    //   2569: aaload
    //   2570: astore #7
    //   2572: aload #7
    //   2574: invokevirtual getModifiers : ()I
    //   2577: invokestatic isStatic : (I)Z
    //   2580: ifne -> 2590
    //   2583: goto -> 2693
    //   2586: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2589: athrow
    //   2590: aload #7
    //   2592: invokevirtual getType : ()Ljava/lang/Class;
    //   2595: astore #8
    //   2597: aload #8
    //   2599: ifnull -> 2680
    //   2602: aload #8
    //   2604: invokevirtual isPrimitive : ()Z
    //   2607: ifne -> 2680
    //   2610: goto -> 2617
    //   2613: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2616: athrow
    //   2617: aload #8
    //   2619: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2622: ifnull -> 2680
    //   2625: goto -> 2632
    //   2628: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2631: athrow
    //   2632: aload #8
    //   2634: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2637: invokevirtual getName : ()Ljava/lang/String;
    //   2640: ifnull -> 2680
    //   2643: goto -> 2650
    //   2646: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2649: athrow
    //   2650: aload #8
    //   2652: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2655: invokevirtual getName : ()Ljava/lang/String;
    //   2658: sipush #-2393
    //   2661: sipush #18894
    //   2664: invokestatic a : (II)Ljava/lang/String;
    //   2667: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2670: ifne -> 2680
    //   2673: goto -> 2680
    //   2676: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2679: athrow
    //   2680: aload #7
    //   2682: iconst_1
    //   2683: invokevirtual setAccessible : (Z)V
    //   2686: aload #7
    //   2688: aconst_null
    //   2689: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2692: pop
    //   2693: iinc #6, 1
    //   2696: iload_2
    //   2697: ifeq -> 2558
    //   2700: sipush #-2372
    //   2703: sipush #-1958
    //   2706: invokestatic a : (II)Ljava/lang/String;
    //   2709: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2712: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2715: astore #4
    //   2717: aload #4
    //   2719: arraylength
    //   2720: istore #5
    //   2722: iconst_0
    //   2723: istore #6
    //   2725: iload #6
    //   2727: iload #5
    //   2729: if_icmpge -> 2865
    //   2732: aload #4
    //   2734: iload #6
    //   2736: aaload
    //   2737: astore #7
    //   2739: aload #7
    //   2741: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2744: pop
    //   2745: aload #7
    //   2747: invokevirtual getModifiers : ()I
    //   2750: invokestatic isStatic : (I)Z
    //   2753: ifeq -> 2851
    //   2756: aload #7
    //   2758: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2761: arraylength
    //   2762: iconst_2
    //   2763: if_icmpne -> 2851
    //   2766: goto -> 2773
    //   2769: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2772: athrow
    //   2773: aload #7
    //   2775: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2778: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2781: if_acmpne -> 2851
    //   2784: goto -> 2791
    //   2787: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2790: athrow
    //   2791: aload #7
    //   2793: iconst_1
    //   2794: invokevirtual setAccessible : (Z)V
    //   2797: aload #7
    //   2799: aconst_null
    //   2800: iconst_2
    //   2801: anewarray java/lang/Object
    //   2804: dup
    //   2805: iconst_0
    //   2806: aload_0
    //   2807: aastore
    //   2808: dup
    //   2809: iconst_1
    //   2810: aload_1
    //   2811: ifnonnull -> 2829
    //   2814: goto -> 2821
    //   2817: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2820: athrow
    //   2821: aload_1
    //   2822: goto -> 2836
    //   2825: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2828: athrow
    //   2829: aload_1
    //   2830: checkcast [B
    //   2833: invokevirtual clone : ()Ljava/lang/Object;
    //   2836: aastore
    //   2837: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2840: checkcast java/lang/Boolean
    //   2843: invokevirtual booleanValue : ()Z
    //   2846: istore_3
    //   2847: iload_2
    //   2848: ifeq -> 2865
    //   2851: iinc #6, 1
    //   2854: iload_2
    //   2855: ifeq -> 2725
    //   2858: goto -> 2865
    //   2861: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2864: athrow
    //   2865: iload_2
    //   2866: ifeq -> 3207
    //   2869: sipush #-2370
    //   2872: sipush #8025
    //   2875: invokestatic a : (II)Ljava/lang/String;
    //   2878: iconst_1
    //   2879: ldc burp/Zlpj
    //   2881: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2884: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2887: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2890: astore #4
    //   2892: aload #4
    //   2894: arraylength
    //   2895: istore #5
    //   2897: iconst_0
    //   2898: istore #6
    //   2900: iload #6
    //   2902: iload #5
    //   2904: if_icmpge -> 3042
    //   2907: aload #4
    //   2909: iload #6
    //   2911: aaload
    //   2912: astore #7
    //   2914: aload #7
    //   2916: invokevirtual getModifiers : ()I
    //   2919: invokestatic isStatic : (I)Z
    //   2922: ifne -> 2932
    //   2925: goto -> 3035
    //   2928: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2931: athrow
    //   2932: aload #7
    //   2934: invokevirtual getType : ()Ljava/lang/Class;
    //   2937: astore #8
    //   2939: aload #8
    //   2941: ifnull -> 3022
    //   2944: aload #8
    //   2946: invokevirtual isPrimitive : ()Z
    //   2949: ifne -> 3022
    //   2952: goto -> 2959
    //   2955: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2958: athrow
    //   2959: aload #8
    //   2961: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2964: ifnull -> 3022
    //   2967: goto -> 2974
    //   2970: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2973: athrow
    //   2974: aload #8
    //   2976: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2979: invokevirtual getName : ()Ljava/lang/String;
    //   2982: ifnull -> 3022
    //   2985: goto -> 2992
    //   2988: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2991: athrow
    //   2992: aload #8
    //   2994: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2997: invokevirtual getName : ()Ljava/lang/String;
    //   3000: sipush #-2393
    //   3003: sipush #18894
    //   3006: invokestatic a : (II)Ljava/lang/String;
    //   3009: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3012: ifne -> 3022
    //   3015: goto -> 3022
    //   3018: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3021: athrow
    //   3022: aload #7
    //   3024: iconst_1
    //   3025: invokevirtual setAccessible : (Z)V
    //   3028: aload #7
    //   3030: aconst_null
    //   3031: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3034: pop
    //   3035: iinc #6, 1
    //   3038: iload_2
    //   3039: ifeq -> 2900
    //   3042: sipush #-2376
    //   3045: sipush #2228
    //   3048: invokestatic a : (II)Ljava/lang/String;
    //   3051: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3054: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3057: astore #4
    //   3059: aload #4
    //   3061: arraylength
    //   3062: istore #5
    //   3064: iconst_0
    //   3065: istore #6
    //   3067: iload #6
    //   3069: iload #5
    //   3071: if_icmpge -> 3207
    //   3074: aload #4
    //   3076: iload #6
    //   3078: aaload
    //   3079: astore #7
    //   3081: aload #7
    //   3083: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3086: pop
    //   3087: aload #7
    //   3089: invokevirtual getModifiers : ()I
    //   3092: invokestatic isStatic : (I)Z
    //   3095: ifeq -> 3193
    //   3098: aload #7
    //   3100: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3103: arraylength
    //   3104: iconst_2
    //   3105: if_icmpne -> 3193
    //   3108: goto -> 3115
    //   3111: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3114: athrow
    //   3115: aload #7
    //   3117: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3120: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3123: if_acmpne -> 3193
    //   3126: goto -> 3133
    //   3129: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3132: athrow
    //   3133: aload #7
    //   3135: iconst_1
    //   3136: invokevirtual setAccessible : (Z)V
    //   3139: aload #7
    //   3141: aconst_null
    //   3142: iconst_2
    //   3143: anewarray java/lang/Object
    //   3146: dup
    //   3147: iconst_0
    //   3148: aload_0
    //   3149: aastore
    //   3150: dup
    //   3151: iconst_1
    //   3152: aload_1
    //   3153: ifnonnull -> 3171
    //   3156: goto -> 3163
    //   3159: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3162: athrow
    //   3163: aload_1
    //   3164: goto -> 3178
    //   3167: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3170: athrow
    //   3171: aload_1
    //   3172: checkcast [B
    //   3175: invokevirtual clone : ()Ljava/lang/Object;
    //   3178: aastore
    //   3179: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3182: checkcast java/lang/Boolean
    //   3185: invokevirtual booleanValue : ()Z
    //   3188: istore_3
    //   3189: iload_2
    //   3190: ifeq -> 3207
    //   3193: iinc #6, 1
    //   3196: iload_2
    //   3197: ifeq -> 3067
    //   3200: goto -> 3207
    //   3203: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3206: athrow
    //   3207: iload_3
    //   3208: ifeq -> 3213
    //   3211: iload_3
    //   3212: ireturn
    //   3213: getstatic burp/Zkfb.ZV : Ljava/lang/String;
    //   3216: getstatic burp/Zs56.ZC : Ljava/lang/Object;
    //   3219: checkcast java/math/BigInteger
    //   3222: invokevirtual intValue : ()I
    //   3225: bipush #32
    //   3227: irem
    //   3228: invokestatic abs : (I)I
    //   3231: invokevirtual charAt : (I)C
    //   3234: getstatic burp/Zlvx.Zr : Ljava/lang/String;
    //   3237: getstatic burp/Zsot.ZJ : Ljava/lang/Object;
    //   3240: checkcast java/math/BigInteger
    //   3243: invokevirtual intValue : ()I
    //   3246: bipush #32
    //   3248: irem
    //   3249: invokestatic abs : (I)I
    //   3252: invokevirtual charAt : (I)C
    //   3255: if_icmpgt -> 3600
    //   3258: sipush #-2392
    //   3261: sipush #19755
    //   3264: invokestatic a : (II)Ljava/lang/String;
    //   3267: iconst_1
    //   3268: ldc burp/Zetv
    //   3270: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3273: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3276: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3279: astore #4
    //   3281: aload #4
    //   3283: arraylength
    //   3284: istore #5
    //   3286: iconst_0
    //   3287: istore #6
    //   3289: iload #6
    //   3291: iload #5
    //   3293: if_icmpge -> 3431
    //   3296: aload #4
    //   3298: iload #6
    //   3300: aaload
    //   3301: astore #7
    //   3303: aload #7
    //   3305: invokevirtual getModifiers : ()I
    //   3308: invokestatic isStatic : (I)Z
    //   3311: ifne -> 3321
    //   3314: goto -> 3424
    //   3317: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3320: athrow
    //   3321: aload #7
    //   3323: invokevirtual getType : ()Ljava/lang/Class;
    //   3326: astore #8
    //   3328: aload #8
    //   3330: ifnull -> 3411
    //   3333: aload #8
    //   3335: invokevirtual isPrimitive : ()Z
    //   3338: ifne -> 3411
    //   3341: goto -> 3348
    //   3344: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3347: athrow
    //   3348: aload #8
    //   3350: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3353: ifnull -> 3411
    //   3356: goto -> 3363
    //   3359: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3362: athrow
    //   3363: aload #8
    //   3365: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3368: invokevirtual getName : ()Ljava/lang/String;
    //   3371: ifnull -> 3411
    //   3374: goto -> 3381
    //   3377: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3380: athrow
    //   3381: aload #8
    //   3383: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3386: invokevirtual getName : ()Ljava/lang/String;
    //   3389: sipush #-2393
    //   3392: sipush #18894
    //   3395: invokestatic a : (II)Ljava/lang/String;
    //   3398: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3401: ifne -> 3411
    //   3404: goto -> 3411
    //   3407: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3410: athrow
    //   3411: aload #7
    //   3413: iconst_1
    //   3414: invokevirtual setAccessible : (Z)V
    //   3417: aload #7
    //   3419: aconst_null
    //   3420: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3423: pop
    //   3424: iinc #6, 1
    //   3427: iload_2
    //   3428: ifeq -> 3289
    //   3431: sipush #-2400
    //   3434: sipush #12425
    //   3437: invokestatic a : (II)Ljava/lang/String;
    //   3440: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3443: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3446: astore #4
    //   3448: aload #4
    //   3450: arraylength
    //   3451: istore #5
    //   3453: iconst_0
    //   3454: istore #6
    //   3456: iload #6
    //   3458: iload #5
    //   3460: if_icmpge -> 3596
    //   3463: aload #4
    //   3465: iload #6
    //   3467: aaload
    //   3468: astore #7
    //   3470: aload #7
    //   3472: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3475: pop
    //   3476: aload #7
    //   3478: invokevirtual getModifiers : ()I
    //   3481: invokestatic isStatic : (I)Z
    //   3484: ifeq -> 3582
    //   3487: aload #7
    //   3489: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3492: arraylength
    //   3493: iconst_2
    //   3494: if_icmpne -> 3582
    //   3497: goto -> 3504
    //   3500: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3503: athrow
    //   3504: aload #7
    //   3506: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3509: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3512: if_acmpne -> 3582
    //   3515: goto -> 3522
    //   3518: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3521: athrow
    //   3522: aload #7
    //   3524: iconst_1
    //   3525: invokevirtual setAccessible : (Z)V
    //   3528: aload #7
    //   3530: aconst_null
    //   3531: iconst_2
    //   3532: anewarray java/lang/Object
    //   3535: dup
    //   3536: iconst_0
    //   3537: aload_0
    //   3538: aastore
    //   3539: dup
    //   3540: iconst_1
    //   3541: aload_1
    //   3542: ifnonnull -> 3560
    //   3545: goto -> 3552
    //   3548: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3551: athrow
    //   3552: aload_1
    //   3553: goto -> 3567
    //   3556: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3559: athrow
    //   3560: aload_1
    //   3561: checkcast [B
    //   3564: invokevirtual clone : ()Ljava/lang/Object;
    //   3567: aastore
    //   3568: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3571: checkcast java/lang/Boolean
    //   3574: invokevirtual booleanValue : ()Z
    //   3577: istore_3
    //   3578: iload_2
    //   3579: ifeq -> 3596
    //   3582: iinc #6, 1
    //   3585: iload_2
    //   3586: ifeq -> 3456
    //   3589: goto -> 3596
    //   3592: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3595: athrow
    //   3596: iload_2
    //   3597: ifeq -> 3938
    //   3600: sipush #-2369
    //   3603: sipush #15641
    //   3606: invokestatic a : (II)Ljava/lang/String;
    //   3609: iconst_1
    //   3610: ldc burp/Ztuj
    //   3612: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3615: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3618: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3621: astore #4
    //   3623: aload #4
    //   3625: arraylength
    //   3626: istore #5
    //   3628: iconst_0
    //   3629: istore #6
    //   3631: iload #6
    //   3633: iload #5
    //   3635: if_icmpge -> 3773
    //   3638: aload #4
    //   3640: iload #6
    //   3642: aaload
    //   3643: astore #7
    //   3645: aload #7
    //   3647: invokevirtual getModifiers : ()I
    //   3650: invokestatic isStatic : (I)Z
    //   3653: ifne -> 3663
    //   3656: goto -> 3766
    //   3659: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3662: athrow
    //   3663: aload #7
    //   3665: invokevirtual getType : ()Ljava/lang/Class;
    //   3668: astore #8
    //   3670: aload #8
    //   3672: ifnull -> 3753
    //   3675: aload #8
    //   3677: invokevirtual isPrimitive : ()Z
    //   3680: ifne -> 3753
    //   3683: goto -> 3690
    //   3686: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3689: athrow
    //   3690: aload #8
    //   3692: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3695: ifnull -> 3753
    //   3698: goto -> 3705
    //   3701: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3704: athrow
    //   3705: aload #8
    //   3707: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3710: invokevirtual getName : ()Ljava/lang/String;
    //   3713: ifnull -> 3753
    //   3716: goto -> 3723
    //   3719: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3722: athrow
    //   3723: aload #8
    //   3725: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3728: invokevirtual getName : ()Ljava/lang/String;
    //   3731: sipush #-2393
    //   3734: sipush #18894
    //   3737: invokestatic a : (II)Ljava/lang/String;
    //   3740: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3743: ifne -> 3753
    //   3746: goto -> 3753
    //   3749: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3752: athrow
    //   3753: aload #7
    //   3755: iconst_1
    //   3756: invokevirtual setAccessible : (Z)V
    //   3759: aload #7
    //   3761: aconst_null
    //   3762: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3765: pop
    //   3766: iinc #6, 1
    //   3769: iload_2
    //   3770: ifeq -> 3631
    //   3773: sipush #-2380
    //   3776: sipush #6616
    //   3779: invokestatic a : (II)Ljava/lang/String;
    //   3782: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3785: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3788: astore #4
    //   3790: aload #4
    //   3792: arraylength
    //   3793: istore #5
    //   3795: iconst_0
    //   3796: istore #6
    //   3798: iload #6
    //   3800: iload #5
    //   3802: if_icmpge -> 3938
    //   3805: aload #4
    //   3807: iload #6
    //   3809: aaload
    //   3810: astore #7
    //   3812: aload #7
    //   3814: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3817: pop
    //   3818: aload #7
    //   3820: invokevirtual getModifiers : ()I
    //   3823: invokestatic isStatic : (I)Z
    //   3826: ifeq -> 3924
    //   3829: aload #7
    //   3831: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3834: arraylength
    //   3835: iconst_2
    //   3836: if_icmpne -> 3924
    //   3839: goto -> 3846
    //   3842: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3845: athrow
    //   3846: aload #7
    //   3848: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3851: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3854: if_acmpne -> 3924
    //   3857: goto -> 3864
    //   3860: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3863: athrow
    //   3864: aload #7
    //   3866: iconst_1
    //   3867: invokevirtual setAccessible : (Z)V
    //   3870: aload #7
    //   3872: aconst_null
    //   3873: iconst_2
    //   3874: anewarray java/lang/Object
    //   3877: dup
    //   3878: iconst_0
    //   3879: aload_0
    //   3880: aastore
    //   3881: dup
    //   3882: iconst_1
    //   3883: aload_1
    //   3884: ifnonnull -> 3902
    //   3887: goto -> 3894
    //   3890: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3893: athrow
    //   3894: aload_1
    //   3895: goto -> 3909
    //   3898: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3901: athrow
    //   3902: aload_1
    //   3903: checkcast [B
    //   3906: invokevirtual clone : ()Ljava/lang/Object;
    //   3909: aastore
    //   3910: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3913: checkcast java/lang/Boolean
    //   3916: invokevirtual booleanValue : ()Z
    //   3919: istore_3
    //   3920: iload_2
    //   3921: ifeq -> 3938
    //   3924: iinc #6, 1
    //   3927: iload_2
    //   3928: ifeq -> 3798
    //   3931: goto -> 3938
    //   3934: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3937: athrow
    //   3938: iload_3
    //   3939: ireturn
    //   3940: astore_3
    //   3941: new java/lang/Exception
    //   3944: dup
    //   3945: aload_3
    //   3946: invokevirtual getMessage : ()Ljava/lang/String;
    //   3949: invokespecial <init> : (Ljava/lang/String;)V
    //   3952: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1750	3940	java/lang/Throwable
    //   82	96	96	java/lang/Throwable
    //   107	120	123	java/lang/Throwable
    //   112	135	138	java/lang/Throwable
    //   127	153	156	java/lang/Throwable
    //   142	183	186	java/lang/Throwable
    //   246	273	276	java/lang/Throwable
    //   263	291	294	java/lang/Throwable
    //   280	327	330	java/lang/Throwable
    //   298	341	344	java/lang/Throwable
    //   390	404	404	java/lang/Throwable
    //   415	428	431	java/lang/Throwable
    //   420	443	446	java/lang/Throwable
    //   435	461	464	java/lang/Throwable
    //   450	491	494	java/lang/Throwable
    //   554	581	584	java/lang/Throwable
    //   571	602	605	java/lang/Throwable
    //   588	632	635	java/lang/Throwable
    //   609	643	643	java/lang/Throwable
    //   654	670	673	java/lang/Throwable
    //   677	1014	1017	java/lang/Throwable
    //   848	858	858	java/lang/Throwable
    //   862	874	874	java/lang/Throwable
    //   878	890	890	java/lang/Throwable
    //   894	907	907	java/lang/Throwable
    //   911	924	924	java/lang/Throwable
    //   1110	1124	1124	java/lang/Throwable
    //   1135	1148	1151	java/lang/Throwable
    //   1140	1163	1166	java/lang/Throwable
    //   1155	1181	1184	java/lang/Throwable
    //   1170	1211	1214	java/lang/Throwable
    //   1277	1304	1307	java/lang/Throwable
    //   1294	1322	1325	java/lang/Throwable
    //   1311	1352	1355	java/lang/Throwable
    //   1329	1363	1363	java/lang/Throwable
    //   1385	1396	1399	java/lang/Throwable
    //   1452	1466	1466	java/lang/Throwable
    //   1477	1490	1493	java/lang/Throwable
    //   1482	1505	1508	java/lang/Throwable
    //   1497	1523	1526	java/lang/Throwable
    //   1512	1553	1556	java/lang/Throwable
    //   1619	1646	1649	java/lang/Throwable
    //   1636	1664	1667	java/lang/Throwable
    //   1653	1694	1697	java/lang/Throwable
    //   1671	1705	1705	java/lang/Throwable
    //   1727	1738	1741	java/lang/Throwable
    //   1751	2481	3940	java/lang/Throwable
    //   1841	1855	1855	java/lang/Throwable
    //   1866	1879	1882	java/lang/Throwable
    //   1871	1894	1897	java/lang/Throwable
    //   1886	1912	1915	java/lang/Throwable
    //   1901	1942	1945	java/lang/Throwable
    //   2008	2035	2038	java/lang/Throwable
    //   2025	2053	2056	java/lang/Throwable
    //   2042	2083	2086	java/lang/Throwable
    //   2060	2094	2094	java/lang/Throwable
    //   2116	2127	2130	java/lang/Throwable
    //   2183	2197	2197	java/lang/Throwable
    //   2208	2221	2224	java/lang/Throwable
    //   2213	2236	2239	java/lang/Throwable
    //   2228	2254	2257	java/lang/Throwable
    //   2243	2284	2287	java/lang/Throwable
    //   2350	2377	2380	java/lang/Throwable
    //   2367	2395	2398	java/lang/Throwable
    //   2384	2425	2428	java/lang/Throwable
    //   2402	2436	2436	java/lang/Throwable
    //   2458	2469	2472	java/lang/Throwable
    //   2482	3212	3940	java/lang/Throwable
    //   2572	2586	2586	java/lang/Throwable
    //   2597	2610	2613	java/lang/Throwable
    //   2602	2625	2628	java/lang/Throwable
    //   2617	2643	2646	java/lang/Throwable
    //   2632	2673	2676	java/lang/Throwable
    //   2739	2766	2769	java/lang/Throwable
    //   2756	2784	2787	java/lang/Throwable
    //   2773	2814	2817	java/lang/Throwable
    //   2791	2825	2825	java/lang/Throwable
    //   2847	2858	2861	java/lang/Throwable
    //   2914	2928	2928	java/lang/Throwable
    //   2939	2952	2955	java/lang/Throwable
    //   2944	2967	2970	java/lang/Throwable
    //   2959	2985	2988	java/lang/Throwable
    //   2974	3015	3018	java/lang/Throwable
    //   3081	3108	3111	java/lang/Throwable
    //   3098	3126	3129	java/lang/Throwable
    //   3115	3156	3159	java/lang/Throwable
    //   3133	3167	3167	java/lang/Throwable
    //   3189	3200	3203	java/lang/Throwable
    //   3213	3939	3940	java/lang/Throwable
    //   3303	3317	3317	java/lang/Throwable
    //   3328	3341	3344	java/lang/Throwable
    //   3333	3356	3359	java/lang/Throwable
    //   3348	3374	3377	java/lang/Throwable
    //   3363	3404	3407	java/lang/Throwable
    //   3470	3497	3500	java/lang/Throwable
    //   3487	3515	3518	java/lang/Throwable
    //   3504	3545	3548	java/lang/Throwable
    //   3522	3556	3556	java/lang/Throwable
    //   3578	3589	3592	java/lang/Throwable
    //   3645	3659	3659	java/lang/Throwable
    //   3670	3683	3686	java/lang/Throwable
    //   3675	3698	3701	java/lang/Throwable
    //   3690	3716	3719	java/lang/Throwable
    //   3705	3746	3749	java/lang/Throwable
    //   3812	3839	3842	java/lang/Throwable
    //   3829	3857	3860	java/lang/Throwable
    //   3846	3887	3890	java/lang/Throwable
    //   3864	3898	3898	java/lang/Throwable
    //   3920	3931	3934	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #30
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ç5¼®6É\\tüóßví²ÚxVXqËà?N\\tÒLB©\\tÕ²t¦G\\t]ÂëPkÁzzpÜý\\tq#¸#|ç*æO{hÊPÆ#Ð\\t.óÍhr\\ts Ô7ªòC-s¾drÂäþ|1xä'Ból åÂÎ\\tÍùÚ)5$\\t ã\\fjJ]^v\\tó6>ÎÑ+Ê\\t¿H·àë:Q\\trI!×ïáÅ\\tÐZY]à»W¨ Ë¿3Í*ß·9BäñwLïa±U\\nÌ{[<ñ\\n´\\tJ\\t»7¼ñYM ¿?år7uµÜY½yÃQÕÊ^wz¼±ÝU^a^8ÄÐm«ø²²\\fáîå6·±$ÉF{¥ªÊSmízM\\níf3öºâ»*½à:\\bA\\th)îeÁ\\tsÂ.PÓÁaeÙ\\tÕ´úI2I¡\\bkeVJß\\tÜ*ÛMmb¥v\\tÙ÷{öy4ÿs\\t´¶ÖÞÌK¢\\tj-\\r­·~á'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #100
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
    //   68: ldc ')Æèmu\\b\\t ¯÷J'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #8
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #10
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
    //   129: putstatic burp/Ztc2.a : [Ljava/lang/String;
    //   132: bipush #30
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztc2.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 236
    //   212: bipush #28
    //   214: goto -> 243
    //   217: bipush #26
    //   219: goto -> 243
    //   222: bipush #119
    //   224: goto -> 243
    //   227: bipush #8
    //   229: goto -> 243
    //   232: iconst_2
    //   233: goto -> 243
    //   236: bipush #6
    //   238: goto -> 243
    //   241: bipush #32
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: sipush #-2396
    //   303: sipush #7934
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Ztc2.Zr : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #36
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #80
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #-30
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #-71
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #80
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #52
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #52
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #68
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #25
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #113
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #94
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #-18
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #123
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #-115
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #100
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-37
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #101
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #78
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: iconst_0
    //   426: bastore
    //   427: dup
    //   428: bipush #19
    //   430: bipush #74
    //   432: bastore
    //   433: dup
    //   434: bipush #20
    //   436: bipush #85
    //   438: bastore
    //   439: dup
    //   440: bipush #21
    //   442: bipush #-43
    //   444: bastore
    //   445: dup
    //   446: bipush #22
    //   448: bipush #54
    //   450: bastore
    //   451: dup
    //   452: bipush #23
    //   454: bipush #95
    //   456: bastore
    //   457: dup
    //   458: bipush #24
    //   460: bipush #-90
    //   462: bastore
    //   463: dup
    //   464: bipush #25
    //   466: bipush #37
    //   468: bastore
    //   469: dup
    //   470: bipush #26
    //   472: bipush #85
    //   474: bastore
    //   475: dup
    //   476: bipush #27
    //   478: bipush #46
    //   480: bastore
    //   481: dup
    //   482: bipush #28
    //   484: bipush #-18
    //   486: bastore
    //   487: dup
    //   488: bipush #29
    //   490: bipush #-34
    //   492: bastore
    //   493: dup
    //   494: bipush #30
    //   496: bipush #112
    //   498: bastore
    //   499: dup
    //   500: bipush #31
    //   502: bipush #93
    //   504: bastore
    //   505: invokespecial <init> : ([B)V
    //   508: putstatic burp/Ztc2.ZM : Ljava/lang/Object;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF6B4) & 0xFFFF;
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
      char c = 'ð';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztc2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */