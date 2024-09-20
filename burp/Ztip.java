package burp;

import java.math.BigInteger;

class Ztip extends ClassLoader {
  static Object Zc;
  
  static String Z_;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zu(Object paramObject) {
    Ztgj.Zw = a(8577, 4217);
    Ztgj.ZY = new BigInteger(a(8601, -30665));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zxd4.Zf.charAt(Math.abs(((BigInteger)Zb2p.ZQ).intValue() % 32)) > Zrka.Zy.charAt(Math.abs(((BigInteger)Zrpm.ZR).intValue() % 32))) {
          try {
            Zbqk.Zm(Class.forName(a(8600, 22323)));
            if (!bool)
              Zzc7.Zu(Class.forName(a(8587, 23862))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zzc7.Zu(Class.forName(a(8587, 23862)));
    } catch (Throwable throwable) {}
  }
  
  static void Zm(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zl(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zejj.Zy : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zrcu.Zs : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zre4.Zx : Ljava/lang/Object;
    //   22: sipush #8585
    //   25: getstatic burp/Zz3w.ZX : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: getstatic burp/Zmh0.Zt : Ljava/lang/Object;
    //   34: checkcast java/math/BigInteger
    //   37: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   40: putstatic burp/Zgta.ZF : Ljava/lang/Object;
    //   43: sipush #14681
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: iconst_1
    //   50: ldc burp/Zlxm
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
    //   168: sipush #8589
    //   171: sipush #26318
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
    //   207: ifne -> 69
    //   210: sipush #8578
    //   213: sipush #-7742
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
    //   324: ifne -> 348
    //   327: goto -> 334
    //   330: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   333: athrow
    //   334: iinc #5, 1
    //   337: iload_2
    //   338: ifne -> 233
    //   341: goto -> 348
    //   344: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   347: athrow
    //   348: sipush #8604
    //   351: sipush #-19262
    //   354: invokestatic a : (II)Ljava/lang/String;
    //   357: iconst_1
    //   358: ldc burp/Ztid
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
    //   476: sipush #8588
    //   479: sipush #23347
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
    //   515: ifne -> 377
    //   518: sipush #8599
    //   521: sipush #11186
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
    //   660: ifne -> 677
    //   663: iinc #5, 1
    //   666: iload_2
    //   667: ifne -> 541
    //   670: goto -> 677
    //   673: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   676: athrow
    //   677: iconst_0
    //   678: istore_3
    //   679: getstatic burp/Zrn0.Zd : Ljava/lang/String;
    //   682: getstatic burp/Zb2p.ZQ : Ljava/lang/Object;
    //   685: checkcast java/math/BigInteger
    //   688: invokevirtual intValue : ()I
    //   691: bipush #32
    //   693: irem
    //   694: invokestatic abs : (I)I
    //   697: invokevirtual charAt : (I)C
    //   700: getstatic burp/Zt7j.Zx : Ljava/lang/String;
    //   703: getstatic burp/Zbz_.ZU : Ljava/lang/Object;
    //   706: checkcast java/math/BigInteger
    //   709: invokevirtual intValue : ()I
    //   712: bipush #32
    //   714: irem
    //   715: invokestatic abs : (I)I
    //   718: invokevirtual charAt : (I)C
    //   721: if_icmpgt -> 1065
    //   724: sipush #8594
    //   727: sipush #-7339
    //   730: invokestatic a : (II)Ljava/lang/String;
    //   733: iconst_1
    //   734: ldc burp/Zb2p
    //   736: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   739: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   742: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   745: astore #4
    //   747: aload #4
    //   749: arraylength
    //   750: istore #5
    //   752: iconst_0
    //   753: istore #6
    //   755: iload #6
    //   757: iload #5
    //   759: if_icmpge -> 897
    //   762: aload #4
    //   764: iload #6
    //   766: aaload
    //   767: astore #7
    //   769: aload #7
    //   771: invokevirtual getModifiers : ()I
    //   774: invokestatic isStatic : (I)Z
    //   777: ifne -> 787
    //   780: goto -> 890
    //   783: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   786: athrow
    //   787: aload #7
    //   789: invokevirtual getType : ()Ljava/lang/Class;
    //   792: astore #8
    //   794: aload #8
    //   796: ifnull -> 877
    //   799: aload #8
    //   801: invokevirtual isPrimitive : ()Z
    //   804: ifne -> 877
    //   807: goto -> 814
    //   810: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   813: athrow
    //   814: aload #8
    //   816: invokevirtual getPackage : ()Ljava/lang/Package;
    //   819: ifnull -> 877
    //   822: goto -> 829
    //   825: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   828: athrow
    //   829: aload #8
    //   831: invokevirtual getPackage : ()Ljava/lang/Package;
    //   834: invokevirtual getName : ()Ljava/lang/String;
    //   837: ifnull -> 877
    //   840: goto -> 847
    //   843: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   846: athrow
    //   847: aload #8
    //   849: invokevirtual getPackage : ()Ljava/lang/Package;
    //   852: invokevirtual getName : ()Ljava/lang/String;
    //   855: sipush #8588
    //   858: sipush #23347
    //   861: invokestatic a : (II)Ljava/lang/String;
    //   864: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   867: ifne -> 877
    //   870: goto -> 877
    //   873: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   876: athrow
    //   877: aload #7
    //   879: iconst_1
    //   880: invokevirtual setAccessible : (Z)V
    //   883: aload #7
    //   885: aconst_null
    //   886: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   889: pop
    //   890: iinc #6, 1
    //   893: iload_2
    //   894: ifne -> 755
    //   897: sipush #8591
    //   900: sipush #5049
    //   903: invokestatic a : (II)Ljava/lang/String;
    //   906: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   909: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   912: astore #4
    //   914: aload #4
    //   916: arraylength
    //   917: istore #5
    //   919: iconst_0
    //   920: istore #6
    //   922: iload #6
    //   924: iload #5
    //   926: if_icmpge -> 1062
    //   929: aload #4
    //   931: iload #6
    //   933: aaload
    //   934: astore #7
    //   936: aload #7
    //   938: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   941: pop
    //   942: aload #7
    //   944: invokevirtual getModifiers : ()I
    //   947: invokestatic isStatic : (I)Z
    //   950: ifeq -> 1048
    //   953: aload #7
    //   955: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   958: arraylength
    //   959: iconst_2
    //   960: if_icmpne -> 1048
    //   963: goto -> 970
    //   966: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   969: athrow
    //   970: aload #7
    //   972: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   975: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   978: if_acmpne -> 1048
    //   981: goto -> 988
    //   984: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   987: athrow
    //   988: aload #7
    //   990: iconst_1
    //   991: invokevirtual setAccessible : (Z)V
    //   994: aload #7
    //   996: aconst_null
    //   997: iconst_2
    //   998: anewarray java/lang/Object
    //   1001: dup
    //   1002: iconst_0
    //   1003: aload_0
    //   1004: aastore
    //   1005: dup
    //   1006: iconst_1
    //   1007: aload_1
    //   1008: ifnonnull -> 1026
    //   1011: goto -> 1018
    //   1014: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1017: athrow
    //   1018: aload_1
    //   1019: goto -> 1033
    //   1022: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1025: athrow
    //   1026: aload_1
    //   1027: checkcast [B
    //   1030: invokevirtual clone : ()Ljava/lang/Object;
    //   1033: aastore
    //   1034: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1037: checkcast java/lang/Boolean
    //   1040: invokevirtual booleanValue : ()Z
    //   1043: istore_3
    //   1044: iload_2
    //   1045: ifne -> 1062
    //   1048: iinc #6, 1
    //   1051: iload_2
    //   1052: ifne -> 922
    //   1055: goto -> 1062
    //   1058: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1061: athrow
    //   1062: goto -> 1403
    //   1065: sipush #8602
    //   1068: sipush #5601
    //   1071: invokestatic a : (II)Ljava/lang/String;
    //   1074: iconst_1
    //   1075: ldc burp/Zenr
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
    //   1196: sipush #8588
    //   1199: sipush #23347
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
    //   1235: ifne -> 1096
    //   1238: sipush #8596
    //   1241: sipush #644
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
    //   1386: ifne -> 1403
    //   1389: iinc #6, 1
    //   1392: iload_2
    //   1393: ifne -> 1263
    //   1396: goto -> 1403
    //   1399: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1402: athrow
    //   1403: iload_3
    //   1404: ifeq -> 1409
    //   1407: iload_3
    //   1408: ireturn
    //   1409: getstatic burp/Zll8.ZZ : Ljava/lang/String;
    //   1412: getstatic burp/Zgrf.ZN : Ljava/lang/Object;
    //   1415: checkcast java/math/BigInteger
    //   1418: invokevirtual intValue : ()I
    //   1421: bipush #32
    //   1423: irem
    //   1424: invokestatic abs : (I)I
    //   1427: invokevirtual charAt : (I)C
    //   1430: getstatic burp/Zk88.ZZ : Ljava/lang/String;
    //   1433: getstatic burp/Zxzp.Zh : Ljava/lang/Object;
    //   1436: checkcast java/math/BigInteger
    //   1439: invokevirtual intValue : ()I
    //   1442: bipush #32
    //   1444: irem
    //   1445: invokestatic abs : (I)I
    //   1448: invokevirtual charAt : (I)C
    //   1451: if_icmpgt -> 1796
    //   1454: sipush #8592
    //   1457: sipush #-1311
    //   1460: invokestatic a : (II)Ljava/lang/String;
    //   1463: iconst_1
    //   1464: ldc burp/Ze3z
    //   1466: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1469: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1472: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1475: astore #4
    //   1477: aload #4
    //   1479: arraylength
    //   1480: istore #5
    //   1482: iconst_0
    //   1483: istore #6
    //   1485: iload #6
    //   1487: iload #5
    //   1489: if_icmpge -> 1627
    //   1492: aload #4
    //   1494: iload #6
    //   1496: aaload
    //   1497: astore #7
    //   1499: aload #7
    //   1501: invokevirtual getModifiers : ()I
    //   1504: invokestatic isStatic : (I)Z
    //   1507: ifne -> 1517
    //   1510: goto -> 1620
    //   1513: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1516: athrow
    //   1517: aload #7
    //   1519: invokevirtual getType : ()Ljava/lang/Class;
    //   1522: astore #8
    //   1524: aload #8
    //   1526: ifnull -> 1607
    //   1529: aload #8
    //   1531: invokevirtual isPrimitive : ()Z
    //   1534: ifne -> 1607
    //   1537: goto -> 1544
    //   1540: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1543: athrow
    //   1544: aload #8
    //   1546: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1549: ifnull -> 1607
    //   1552: goto -> 1559
    //   1555: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1558: athrow
    //   1559: aload #8
    //   1561: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1564: invokevirtual getName : ()Ljava/lang/String;
    //   1567: ifnull -> 1607
    //   1570: goto -> 1577
    //   1573: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1576: athrow
    //   1577: aload #8
    //   1579: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1582: invokevirtual getName : ()Ljava/lang/String;
    //   1585: sipush #8588
    //   1588: sipush #23347
    //   1591: invokestatic a : (II)Ljava/lang/String;
    //   1594: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1597: ifne -> 1607
    //   1600: goto -> 1607
    //   1603: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1606: athrow
    //   1607: aload #7
    //   1609: iconst_1
    //   1610: invokevirtual setAccessible : (Z)V
    //   1613: aload #7
    //   1615: aconst_null
    //   1616: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1619: pop
    //   1620: iinc #6, 1
    //   1623: iload_2
    //   1624: ifne -> 1485
    //   1627: sipush #8590
    //   1630: sipush #-25317
    //   1633: invokestatic a : (II)Ljava/lang/String;
    //   1636: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1639: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1642: astore #4
    //   1644: aload #4
    //   1646: arraylength
    //   1647: istore #5
    //   1649: iconst_0
    //   1650: istore #6
    //   1652: iload #6
    //   1654: iload #5
    //   1656: if_icmpge -> 1792
    //   1659: aload #4
    //   1661: iload #6
    //   1663: aaload
    //   1664: astore #7
    //   1666: aload #7
    //   1668: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1671: pop
    //   1672: aload #7
    //   1674: invokevirtual getModifiers : ()I
    //   1677: invokestatic isStatic : (I)Z
    //   1680: ifeq -> 1778
    //   1683: aload #7
    //   1685: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1688: arraylength
    //   1689: iconst_2
    //   1690: if_icmpne -> 1778
    //   1693: goto -> 1700
    //   1696: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1699: athrow
    //   1700: aload #7
    //   1702: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1705: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1708: if_acmpne -> 1778
    //   1711: goto -> 1718
    //   1714: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1717: athrow
    //   1718: aload #7
    //   1720: iconst_1
    //   1721: invokevirtual setAccessible : (Z)V
    //   1724: aload #7
    //   1726: aconst_null
    //   1727: iconst_2
    //   1728: anewarray java/lang/Object
    //   1731: dup
    //   1732: iconst_0
    //   1733: aload_0
    //   1734: aastore
    //   1735: dup
    //   1736: iconst_1
    //   1737: aload_1
    //   1738: ifnonnull -> 1756
    //   1741: goto -> 1748
    //   1744: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1747: athrow
    //   1748: aload_1
    //   1749: goto -> 1763
    //   1752: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1755: athrow
    //   1756: aload_1
    //   1757: checkcast [B
    //   1760: invokevirtual clone : ()Ljava/lang/Object;
    //   1763: aastore
    //   1764: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1767: checkcast java/lang/Boolean
    //   1770: invokevirtual booleanValue : ()Z
    //   1773: istore_3
    //   1774: iload_2
    //   1775: ifne -> 1792
    //   1778: iinc #6, 1
    //   1781: iload_2
    //   1782: ifne -> 1652
    //   1785: goto -> 1792
    //   1788: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1791: athrow
    //   1792: iload_2
    //   1793: ifne -> 2134
    //   1796: sipush #8593
    //   1799: sipush #8894
    //   1802: invokestatic a : (II)Ljava/lang/String;
    //   1805: iconst_1
    //   1806: ldc burp/Zb29
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
    //   1927: sipush #8588
    //   1930: sipush #23347
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
    //   1966: ifne -> 1827
    //   1969: sipush #8605
    //   1972: sipush #-24849
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
    //   2117: ifne -> 2134
    //   2120: iinc #6, 1
    //   2123: iload_2
    //   2124: ifne -> 1994
    //   2127: goto -> 2134
    //   2130: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2133: athrow
    //   2134: iload_3
    //   2135: ifeq -> 2140
    //   2138: iload_3
    //   2139: ireturn
    //   2140: getstatic burp/Zxx4.Zq : Ljava/lang/String;
    //   2143: getstatic burp/Zez0.ZT : Ljava/lang/Object;
    //   2146: checkcast java/math/BigInteger
    //   2149: invokevirtual intValue : ()I
    //   2152: bipush #32
    //   2154: irem
    //   2155: invokestatic abs : (I)I
    //   2158: invokevirtual charAt : (I)C
    //   2161: getstatic burp/Zlxs.ZM : Ljava/lang/String;
    //   2164: getstatic burp/Ze4x.Zp : Ljava/lang/Object;
    //   2167: checkcast java/math/BigInteger
    //   2170: invokevirtual intValue : ()I
    //   2173: bipush #32
    //   2175: irem
    //   2176: invokestatic abs : (I)I
    //   2179: invokevirtual charAt : (I)C
    //   2182: if_icmpgt -> 2527
    //   2185: sipush #8584
    //   2188: sipush #28687
    //   2191: invokestatic a : (II)Ljava/lang/String;
    //   2194: iconst_1
    //   2195: ldc burp/Zlo0
    //   2197: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2200: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2203: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2206: astore #4
    //   2208: aload #4
    //   2210: arraylength
    //   2211: istore #5
    //   2213: iconst_0
    //   2214: istore #6
    //   2216: iload #6
    //   2218: iload #5
    //   2220: if_icmpge -> 2358
    //   2223: aload #4
    //   2225: iload #6
    //   2227: aaload
    //   2228: astore #7
    //   2230: aload #7
    //   2232: invokevirtual getModifiers : ()I
    //   2235: invokestatic isStatic : (I)Z
    //   2238: ifne -> 2248
    //   2241: goto -> 2351
    //   2244: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2247: athrow
    //   2248: aload #7
    //   2250: invokevirtual getType : ()Ljava/lang/Class;
    //   2253: astore #8
    //   2255: aload #8
    //   2257: ifnull -> 2338
    //   2260: aload #8
    //   2262: invokevirtual isPrimitive : ()Z
    //   2265: ifne -> 2338
    //   2268: goto -> 2275
    //   2271: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2274: athrow
    //   2275: aload #8
    //   2277: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2280: ifnull -> 2338
    //   2283: goto -> 2290
    //   2286: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2289: athrow
    //   2290: aload #8
    //   2292: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2295: invokevirtual getName : ()Ljava/lang/String;
    //   2298: ifnull -> 2338
    //   2301: goto -> 2308
    //   2304: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2307: athrow
    //   2308: aload #8
    //   2310: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2313: invokevirtual getName : ()Ljava/lang/String;
    //   2316: sipush #8588
    //   2319: sipush #23347
    //   2322: invokestatic a : (II)Ljava/lang/String;
    //   2325: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2328: ifne -> 2338
    //   2331: goto -> 2338
    //   2334: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2337: athrow
    //   2338: aload #7
    //   2340: iconst_1
    //   2341: invokevirtual setAccessible : (Z)V
    //   2344: aload #7
    //   2346: aconst_null
    //   2347: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2350: pop
    //   2351: iinc #6, 1
    //   2354: iload_2
    //   2355: ifne -> 2216
    //   2358: sipush #8597
    //   2361: sipush #4656
    //   2364: invokestatic a : (II)Ljava/lang/String;
    //   2367: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2370: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2373: astore #4
    //   2375: aload #4
    //   2377: arraylength
    //   2378: istore #5
    //   2380: iconst_0
    //   2381: istore #6
    //   2383: iload #6
    //   2385: iload #5
    //   2387: if_icmpge -> 2523
    //   2390: aload #4
    //   2392: iload #6
    //   2394: aaload
    //   2395: astore #7
    //   2397: aload #7
    //   2399: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2402: pop
    //   2403: aload #7
    //   2405: invokevirtual getModifiers : ()I
    //   2408: invokestatic isStatic : (I)Z
    //   2411: ifeq -> 2509
    //   2414: aload #7
    //   2416: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2419: arraylength
    //   2420: iconst_2
    //   2421: if_icmpne -> 2509
    //   2424: goto -> 2431
    //   2427: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2430: athrow
    //   2431: aload #7
    //   2433: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2436: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2439: if_acmpne -> 2509
    //   2442: goto -> 2449
    //   2445: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2448: athrow
    //   2449: aload #7
    //   2451: iconst_1
    //   2452: invokevirtual setAccessible : (Z)V
    //   2455: aload #7
    //   2457: aconst_null
    //   2458: iconst_2
    //   2459: anewarray java/lang/Object
    //   2462: dup
    //   2463: iconst_0
    //   2464: aload_0
    //   2465: aastore
    //   2466: dup
    //   2467: iconst_1
    //   2468: aload_1
    //   2469: ifnonnull -> 2487
    //   2472: goto -> 2479
    //   2475: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2478: athrow
    //   2479: aload_1
    //   2480: goto -> 2494
    //   2483: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2486: athrow
    //   2487: aload_1
    //   2488: checkcast [B
    //   2491: invokevirtual clone : ()Ljava/lang/Object;
    //   2494: aastore
    //   2495: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2498: checkcast java/lang/Boolean
    //   2501: invokevirtual booleanValue : ()Z
    //   2504: istore_3
    //   2505: iload_2
    //   2506: ifne -> 2523
    //   2509: iinc #6, 1
    //   2512: iload_2
    //   2513: ifne -> 2383
    //   2516: goto -> 2523
    //   2519: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2522: athrow
    //   2523: iload_2
    //   2524: ifne -> 2865
    //   2527: sipush #8579
    //   2530: sipush #23130
    //   2533: invokestatic a : (II)Ljava/lang/String;
    //   2536: iconst_1
    //   2537: ldc burp/Ztt0
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
    //   2658: sipush #8588
    //   2661: sipush #23347
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
    //   2697: ifne -> 2558
    //   2700: sipush #8586
    //   2703: sipush #7676
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
    //   2848: ifne -> 2865
    //   2851: iinc #6, 1
    //   2854: iload_2
    //   2855: ifne -> 2725
    //   2858: goto -> 2865
    //   2861: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2864: athrow
    //   2865: iload_3
    //   2866: ifeq -> 2871
    //   2869: iload_3
    //   2870: ireturn
    //   2871: getstatic burp/Zkqx.Ze : Ljava/lang/String;
    //   2874: getstatic burp/Ze57.ZR : Ljava/lang/Object;
    //   2877: checkcast java/math/BigInteger
    //   2880: invokevirtual intValue : ()I
    //   2883: bipush #32
    //   2885: irem
    //   2886: invokestatic abs : (I)I
    //   2889: invokevirtual charAt : (I)C
    //   2892: getstatic burp/Zb2p.ZV : Ljava/lang/String;
    //   2895: getstatic burp/Zlo4.ZC : Ljava/lang/Object;
    //   2898: checkcast java/math/BigInteger
    //   2901: invokevirtual intValue : ()I
    //   2904: bipush #32
    //   2906: irem
    //   2907: invokestatic abs : (I)I
    //   2910: invokevirtual charAt : (I)C
    //   2913: if_icmpgt -> 3258
    //   2916: sipush #8576
    //   2919: sipush #-1820
    //   2922: invokestatic a : (II)Ljava/lang/String;
    //   2925: iconst_1
    //   2926: ldc burp/Zmfw
    //   2928: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2931: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2934: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2937: astore #4
    //   2939: aload #4
    //   2941: arraylength
    //   2942: istore #5
    //   2944: iconst_0
    //   2945: istore #6
    //   2947: iload #6
    //   2949: iload #5
    //   2951: if_icmpge -> 3089
    //   2954: aload #4
    //   2956: iload #6
    //   2958: aaload
    //   2959: astore #7
    //   2961: aload #7
    //   2963: invokevirtual getModifiers : ()I
    //   2966: invokestatic isStatic : (I)Z
    //   2969: ifne -> 2979
    //   2972: goto -> 3082
    //   2975: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2978: athrow
    //   2979: aload #7
    //   2981: invokevirtual getType : ()Ljava/lang/Class;
    //   2984: astore #8
    //   2986: aload #8
    //   2988: ifnull -> 3069
    //   2991: aload #8
    //   2993: invokevirtual isPrimitive : ()Z
    //   2996: ifne -> 3069
    //   2999: goto -> 3006
    //   3002: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3005: athrow
    //   3006: aload #8
    //   3008: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3011: ifnull -> 3069
    //   3014: goto -> 3021
    //   3017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3020: athrow
    //   3021: aload #8
    //   3023: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3026: invokevirtual getName : ()Ljava/lang/String;
    //   3029: ifnull -> 3069
    //   3032: goto -> 3039
    //   3035: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3038: athrow
    //   3039: aload #8
    //   3041: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3044: invokevirtual getName : ()Ljava/lang/String;
    //   3047: sipush #8588
    //   3050: sipush #23347
    //   3053: invokestatic a : (II)Ljava/lang/String;
    //   3056: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3059: ifne -> 3069
    //   3062: goto -> 3069
    //   3065: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3068: athrow
    //   3069: aload #7
    //   3071: iconst_1
    //   3072: invokevirtual setAccessible : (Z)V
    //   3075: aload #7
    //   3077: aconst_null
    //   3078: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3081: pop
    //   3082: iinc #6, 1
    //   3085: iload_2
    //   3086: ifne -> 2947
    //   3089: sipush #8603
    //   3092: sipush #11498
    //   3095: invokestatic a : (II)Ljava/lang/String;
    //   3098: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3101: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3104: astore #4
    //   3106: aload #4
    //   3108: arraylength
    //   3109: istore #5
    //   3111: iconst_0
    //   3112: istore #6
    //   3114: iload #6
    //   3116: iload #5
    //   3118: if_icmpge -> 3254
    //   3121: aload #4
    //   3123: iload #6
    //   3125: aaload
    //   3126: astore #7
    //   3128: aload #7
    //   3130: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3133: pop
    //   3134: aload #7
    //   3136: invokevirtual getModifiers : ()I
    //   3139: invokestatic isStatic : (I)Z
    //   3142: ifeq -> 3240
    //   3145: aload #7
    //   3147: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3150: arraylength
    //   3151: iconst_2
    //   3152: if_icmpne -> 3240
    //   3155: goto -> 3162
    //   3158: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3161: athrow
    //   3162: aload #7
    //   3164: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3167: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3170: if_acmpne -> 3240
    //   3173: goto -> 3180
    //   3176: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3179: athrow
    //   3180: aload #7
    //   3182: iconst_1
    //   3183: invokevirtual setAccessible : (Z)V
    //   3186: aload #7
    //   3188: aconst_null
    //   3189: iconst_2
    //   3190: anewarray java/lang/Object
    //   3193: dup
    //   3194: iconst_0
    //   3195: aload_0
    //   3196: aastore
    //   3197: dup
    //   3198: iconst_1
    //   3199: aload_1
    //   3200: ifnonnull -> 3218
    //   3203: goto -> 3210
    //   3206: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3209: athrow
    //   3210: aload_1
    //   3211: goto -> 3225
    //   3214: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3217: athrow
    //   3218: aload_1
    //   3219: checkcast [B
    //   3222: invokevirtual clone : ()Ljava/lang/Object;
    //   3225: aastore
    //   3226: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3229: checkcast java/lang/Boolean
    //   3232: invokevirtual booleanValue : ()Z
    //   3235: istore_3
    //   3236: iload_2
    //   3237: ifne -> 3254
    //   3240: iinc #6, 1
    //   3243: iload_2
    //   3244: ifne -> 3114
    //   3247: goto -> 3254
    //   3250: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3253: athrow
    //   3254: iload_2
    //   3255: ifne -> 3596
    //   3258: sipush #8598
    //   3261: sipush #25840
    //   3264: invokestatic a : (II)Ljava/lang/String;
    //   3267: iconst_1
    //   3268: ldc burp/Zzc7
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
    //   3389: sipush #8588
    //   3392: sipush #23347
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
    //   3428: ifne -> 3289
    //   3431: sipush #8595
    //   3434: sipush #-14816
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
    //   3579: ifne -> 3596
    //   3582: iinc #6, 1
    //   3585: iload_2
    //   3586: ifne -> 3456
    //   3589: goto -> 3596
    //   3592: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3595: athrow
    //   3596: iload_3
    //   3597: ireturn
    //   3598: astore_3
    //   3599: new java/lang/Exception
    //   3602: dup
    //   3603: aload_3
    //   3604: invokevirtual getMessage : ()Ljava/lang/String;
    //   3607: invokespecial <init> : (Ljava/lang/String;)V
    //   3610: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1408	3598	java/lang/Throwable
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
    //   769	783	783	java/lang/Throwable
    //   794	807	810	java/lang/Throwable
    //   799	822	825	java/lang/Throwable
    //   814	840	843	java/lang/Throwable
    //   829	870	873	java/lang/Throwable
    //   936	963	966	java/lang/Throwable
    //   953	981	984	java/lang/Throwable
    //   970	1011	1014	java/lang/Throwable
    //   988	1022	1022	java/lang/Throwable
    //   1044	1055	1058	java/lang/Throwable
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
    //   1409	2139	3598	java/lang/Throwable
    //   1499	1513	1513	java/lang/Throwable
    //   1524	1537	1540	java/lang/Throwable
    //   1529	1552	1555	java/lang/Throwable
    //   1544	1570	1573	java/lang/Throwable
    //   1559	1600	1603	java/lang/Throwable
    //   1666	1693	1696	java/lang/Throwable
    //   1683	1711	1714	java/lang/Throwable
    //   1700	1741	1744	java/lang/Throwable
    //   1718	1752	1752	java/lang/Throwable
    //   1774	1785	1788	java/lang/Throwable
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
    //   2140	2870	3598	java/lang/Throwable
    //   2230	2244	2244	java/lang/Throwable
    //   2255	2268	2271	java/lang/Throwable
    //   2260	2283	2286	java/lang/Throwable
    //   2275	2301	2304	java/lang/Throwable
    //   2290	2331	2334	java/lang/Throwable
    //   2397	2424	2427	java/lang/Throwable
    //   2414	2442	2445	java/lang/Throwable
    //   2431	2472	2475	java/lang/Throwable
    //   2449	2483	2483	java/lang/Throwable
    //   2505	2516	2519	java/lang/Throwable
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
    //   2871	3597	3598	java/lang/Throwable
    //   2961	2975	2975	java/lang/Throwable
    //   2986	2999	3002	java/lang/Throwable
    //   2991	3014	3017	java/lang/Throwable
    //   3006	3032	3035	java/lang/Throwable
    //   3021	3062	3065	java/lang/Throwable
    //   3128	3155	3158	java/lang/Throwable
    //   3145	3173	3176	java/lang/Throwable
    //   3162	3203	3206	java/lang/Throwable
    //   3180	3214	3214	java/lang/Throwable
    //   3236	3247	3250	java/lang/Throwable
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
  }
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'H´l6NyO\\fÆå\ÚM»Æ²Z2Óy»c¾</N V¦¬Y70@Dª7ä¶¸5¿ bdÇú¬;»è½×`¹K?Êè§ÿ\\tÖmF¢Ý+-è\\t-492ìÉÙ\\b\\t²¡Ê;LºAã\\te0>þ\\t÷ºbXYÖ¦öàM?$ÉûÙ³:ôHccM®¬@ANH-jÚn¼æ³ÑÃYßBTî¨UAì5;nl"êaÁ_YKëÎ§¶1O\\b¬õ_\\f×®±: d\\b<\\tÝYn;C}Hq°¾±=\(£ZUÄÀ<\\t)¹L"TØÎF\\t©ï©ò t\\t.nÊØð\\t^Wþÿ{C{\\täÝ ´K!qÝ\\tß_ôþCRy$\\t¶bJC\µ¢²\\t°ccD±vÙ\\t\\fsa¶ñ[>\\n\\tg¯ãà¡,\\n\\t(^Ä&E_°\\tDüÏxðÿc\\fÖQF%\\t} ôÉ:W\\tâ?Àè\\rÀ%¿ ²ûìbë+ÍÈIDÏpºÔRëàöÏM>öV\\fV\\ts òK<æÃí'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #77
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #12
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
    //   68: ldc '~!üRl«\\tc'¸&te'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #80
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
    //   129: putstatic burp/Ztip.a : [Ljava/lang/String;
    //   132: bipush #28
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztip.b : [Ljava/lang/String;
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
    //   212: bipush #65
    //   214: goto -> 244
    //   217: bipush #9
    //   219: goto -> 244
    //   222: bipush #101
    //   224: goto -> 244
    //   227: bipush #8
    //   229: goto -> 244
    //   232: bipush #38
    //   234: goto -> 244
    //   237: bipush #117
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
    //   304: sipush #8607
    //   307: sipush #14312
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Ztip.Zc : Ljava/lang/Object;
    //   319: sipush #8606
    //   322: sipush #-21934
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Ztip.Z_ : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2199) & 0xFFFF;
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
      byte b1 = 68;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztip.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */