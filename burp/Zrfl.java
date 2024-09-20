package burp;

import java.math.BigInteger;

class Zrfl extends ClassLoader {
  static String Zy;
  
  static Object Z_;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zo(Object paramObject) {
    Zgr4.Zi = a(443, -8506);
    Zgr4.ZL = new BigInteger(a(437, 500));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zgr4.Zi.charAt(Math.abs(((BigInteger)Zgr4.ZL).intValue() % 32)) <= Zgr4.Zi.charAt(Math.abs(((BigInteger)Zgr4.ZL).intValue() % 32))) {
          try {
            Zm_w.Zr(Class.forName(a(439, 7080)));
            if (!bool)
              Zs5i.Zu(Class.forName(a(428, 12094))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zs5i.Zu(Class.forName(a(428, 12094)));
    } catch (Throwable throwable) {}
  }
  
  static void ZJ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zg(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zmt_.Zl : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Ztes.ZX : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Ze13.ZD : Ljava/lang/Object;
    //   22: sipush #434
    //   25: sipush #-13332
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zg6f
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
    //   150: sipush #418
    //   153: sipush #-27280
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
    //   192: sipush #426
    //   195: sipush #-25095
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
    //   219: if_icmpge -> 348
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
    //   242: ifeq -> 334
    //   245: aload #6
    //   247: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   250: arraylength
    //   251: iconst_2
    //   252: if_icmpne -> 334
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   261: athrow
    //   262: aload #6
    //   264: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   267: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   270: if_acmpne -> 334
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
    //   300: ifnonnull -> 318
    //   303: goto -> 310
    //   306: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   309: athrow
    //   310: aload_1
    //   311: goto -> 325
    //   314: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   317: athrow
    //   318: aload_1
    //   319: checkcast [B
    //   322: invokevirtual clone : ()Ljava/lang/Object;
    //   325: aastore
    //   326: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   329: pop
    //   330: iload_2
    //   331: ifne -> 348
    //   334: iinc #5, 1
    //   337: iload_2
    //   338: ifne -> 215
    //   341: goto -> 348
    //   344: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   347: athrow
    //   348: sipush #445
    //   351: sipush #11932
    //   354: invokestatic a : (II)Ljava/lang/String;
    //   357: iconst_1
    //   358: ldc burp/Zrt3
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
    //   476: sipush #427
    //   479: sipush #1704
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
    //   518: sipush #430
    //   521: sipush #-4615
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
    //   679: getstatic burp/Zem6.Zp : Ljava/lang/String;
    //   682: getstatic burp/Zec0.Zg : Ljava/lang/Object;
    //   685: checkcast java/math/BigInteger
    //   688: invokevirtual intValue : ()I
    //   691: bipush #32
    //   693: irem
    //   694: invokestatic abs : (I)I
    //   697: invokevirtual charAt : (I)C
    //   700: getstatic burp/Zb9m.Zc : Ljava/lang/String;
    //   703: getstatic burp/Zztx.ZM : Ljava/lang/Object;
    //   706: checkcast java/math/BigInteger
    //   709: invokevirtual intValue : ()I
    //   712: bipush #32
    //   714: irem
    //   715: invokestatic abs : (I)I
    //   718: invokevirtual charAt : (I)C
    //   721: if_icmpgt -> 1064
    //   724: sipush #425
    //   727: sipush #5078
    //   730: invokestatic a : (II)Ljava/lang/String;
    //   733: iconst_1
    //   734: ldc burp/Zztn
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
    //   855: sipush #427
    //   858: sipush #1704
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
    //   897: sipush #432
    //   900: bipush #-26
    //   902: invokestatic a : (II)Ljava/lang/String;
    //   905: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   908: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   911: astore #4
    //   913: aload #4
    //   915: arraylength
    //   916: istore #5
    //   918: iconst_0
    //   919: istore #6
    //   921: iload #6
    //   923: iload #5
    //   925: if_icmpge -> 1061
    //   928: aload #4
    //   930: iload #6
    //   932: aaload
    //   933: astore #7
    //   935: aload #7
    //   937: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   940: pop
    //   941: aload #7
    //   943: invokevirtual getModifiers : ()I
    //   946: invokestatic isStatic : (I)Z
    //   949: ifeq -> 1047
    //   952: aload #7
    //   954: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   957: arraylength
    //   958: iconst_2
    //   959: if_icmpne -> 1047
    //   962: goto -> 969
    //   965: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   968: athrow
    //   969: aload #7
    //   971: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   974: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   977: if_acmpne -> 1047
    //   980: goto -> 987
    //   983: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   986: athrow
    //   987: aload #7
    //   989: iconst_1
    //   990: invokevirtual setAccessible : (Z)V
    //   993: aload #7
    //   995: aconst_null
    //   996: iconst_2
    //   997: anewarray java/lang/Object
    //   1000: dup
    //   1001: iconst_0
    //   1002: aload_0
    //   1003: aastore
    //   1004: dup
    //   1005: iconst_1
    //   1006: aload_1
    //   1007: ifnonnull -> 1025
    //   1010: goto -> 1017
    //   1013: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1016: athrow
    //   1017: aload_1
    //   1018: goto -> 1032
    //   1021: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1024: athrow
    //   1025: aload_1
    //   1026: checkcast [B
    //   1029: invokevirtual clone : ()Ljava/lang/Object;
    //   1032: aastore
    //   1033: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1036: checkcast java/lang/Boolean
    //   1039: invokevirtual booleanValue : ()Z
    //   1042: istore_3
    //   1043: iload_2
    //   1044: ifne -> 1061
    //   1047: iinc #6, 1
    //   1050: iload_2
    //   1051: ifne -> 921
    //   1054: goto -> 1061
    //   1057: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1060: athrow
    //   1061: goto -> 1402
    //   1064: sipush #419
    //   1067: sipush #-7581
    //   1070: invokestatic a : (II)Ljava/lang/String;
    //   1073: iconst_1
    //   1074: ldc burp/Zm0v
    //   1076: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1079: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1082: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1085: astore #4
    //   1087: aload #4
    //   1089: arraylength
    //   1090: istore #5
    //   1092: iconst_0
    //   1093: istore #6
    //   1095: iload #6
    //   1097: iload #5
    //   1099: if_icmpge -> 1237
    //   1102: aload #4
    //   1104: iload #6
    //   1106: aaload
    //   1107: astore #7
    //   1109: aload #7
    //   1111: invokevirtual getModifiers : ()I
    //   1114: invokestatic isStatic : (I)Z
    //   1117: ifne -> 1127
    //   1120: goto -> 1230
    //   1123: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1126: athrow
    //   1127: aload #7
    //   1129: invokevirtual getType : ()Ljava/lang/Class;
    //   1132: astore #8
    //   1134: aload #8
    //   1136: ifnull -> 1217
    //   1139: aload #8
    //   1141: invokevirtual isPrimitive : ()Z
    //   1144: ifne -> 1217
    //   1147: goto -> 1154
    //   1150: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1153: athrow
    //   1154: aload #8
    //   1156: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1159: ifnull -> 1217
    //   1162: goto -> 1169
    //   1165: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1168: athrow
    //   1169: aload #8
    //   1171: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1174: invokevirtual getName : ()Ljava/lang/String;
    //   1177: ifnull -> 1217
    //   1180: goto -> 1187
    //   1183: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1186: athrow
    //   1187: aload #8
    //   1189: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1192: invokevirtual getName : ()Ljava/lang/String;
    //   1195: sipush #427
    //   1198: sipush #1704
    //   1201: invokestatic a : (II)Ljava/lang/String;
    //   1204: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1207: ifne -> 1217
    //   1210: goto -> 1217
    //   1213: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1216: athrow
    //   1217: aload #7
    //   1219: iconst_1
    //   1220: invokevirtual setAccessible : (Z)V
    //   1223: aload #7
    //   1225: aconst_null
    //   1226: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1229: pop
    //   1230: iinc #6, 1
    //   1233: iload_2
    //   1234: ifne -> 1095
    //   1237: sipush #431
    //   1240: sipush #-9796
    //   1243: invokestatic a : (II)Ljava/lang/String;
    //   1246: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1249: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1252: astore #4
    //   1254: aload #4
    //   1256: arraylength
    //   1257: istore #5
    //   1259: iconst_0
    //   1260: istore #6
    //   1262: iload #6
    //   1264: iload #5
    //   1266: if_icmpge -> 1402
    //   1269: aload #4
    //   1271: iload #6
    //   1273: aaload
    //   1274: astore #7
    //   1276: aload #7
    //   1278: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1281: pop
    //   1282: aload #7
    //   1284: invokevirtual getModifiers : ()I
    //   1287: invokestatic isStatic : (I)Z
    //   1290: ifeq -> 1388
    //   1293: aload #7
    //   1295: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1298: arraylength
    //   1299: iconst_2
    //   1300: if_icmpne -> 1388
    //   1303: goto -> 1310
    //   1306: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1309: athrow
    //   1310: aload #7
    //   1312: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1315: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1318: if_acmpne -> 1388
    //   1321: goto -> 1328
    //   1324: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1327: athrow
    //   1328: aload #7
    //   1330: iconst_1
    //   1331: invokevirtual setAccessible : (Z)V
    //   1334: aload #7
    //   1336: aconst_null
    //   1337: iconst_2
    //   1338: anewarray java/lang/Object
    //   1341: dup
    //   1342: iconst_0
    //   1343: aload_0
    //   1344: aastore
    //   1345: dup
    //   1346: iconst_1
    //   1347: aload_1
    //   1348: ifnonnull -> 1366
    //   1351: goto -> 1358
    //   1354: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1357: athrow
    //   1358: aload_1
    //   1359: goto -> 1373
    //   1362: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1365: athrow
    //   1366: aload_1
    //   1367: checkcast [B
    //   1370: invokevirtual clone : ()Ljava/lang/Object;
    //   1373: aastore
    //   1374: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1377: checkcast java/lang/Boolean
    //   1380: invokevirtual booleanValue : ()Z
    //   1383: istore_3
    //   1384: iload_2
    //   1385: ifne -> 1402
    //   1388: iinc #6, 1
    //   1391: iload_2
    //   1392: ifne -> 1262
    //   1395: goto -> 1402
    //   1398: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1401: athrow
    //   1402: iload_3
    //   1403: ifeq -> 1408
    //   1406: iload_3
    //   1407: ireturn
    //   1408: getstatic burp/Zx58.Zs : Ljava/lang/String;
    //   1411: getstatic burp/Zem6.Zm : Ljava/lang/Object;
    //   1414: checkcast java/math/BigInteger
    //   1417: invokevirtual intValue : ()I
    //   1420: bipush #32
    //   1422: irem
    //   1423: invokestatic abs : (I)I
    //   1426: invokevirtual charAt : (I)C
    //   1429: getstatic burp/Zsk4.ZH : Ljava/lang/String;
    //   1432: getstatic burp/Ztzw.Zk : Ljava/lang/Object;
    //   1435: checkcast java/math/BigInteger
    //   1438: invokevirtual intValue : ()I
    //   1441: bipush #32
    //   1443: irem
    //   1444: invokestatic abs : (I)I
    //   1447: invokevirtual charAt : (I)C
    //   1450: if_icmple -> 1795
    //   1453: sipush #436
    //   1456: sipush #29220
    //   1459: invokestatic a : (II)Ljava/lang/String;
    //   1462: iconst_1
    //   1463: ldc burp/Zvof
    //   1465: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1468: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1471: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1474: astore #4
    //   1476: aload #4
    //   1478: arraylength
    //   1479: istore #5
    //   1481: iconst_0
    //   1482: istore #6
    //   1484: iload #6
    //   1486: iload #5
    //   1488: if_icmpge -> 1626
    //   1491: aload #4
    //   1493: iload #6
    //   1495: aaload
    //   1496: astore #7
    //   1498: aload #7
    //   1500: invokevirtual getModifiers : ()I
    //   1503: invokestatic isStatic : (I)Z
    //   1506: ifne -> 1516
    //   1509: goto -> 1619
    //   1512: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1515: athrow
    //   1516: aload #7
    //   1518: invokevirtual getType : ()Ljava/lang/Class;
    //   1521: astore #8
    //   1523: aload #8
    //   1525: ifnull -> 1606
    //   1528: aload #8
    //   1530: invokevirtual isPrimitive : ()Z
    //   1533: ifne -> 1606
    //   1536: goto -> 1543
    //   1539: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1542: athrow
    //   1543: aload #8
    //   1545: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1548: ifnull -> 1606
    //   1551: goto -> 1558
    //   1554: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1557: athrow
    //   1558: aload #8
    //   1560: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1563: invokevirtual getName : ()Ljava/lang/String;
    //   1566: ifnull -> 1606
    //   1569: goto -> 1576
    //   1572: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1575: athrow
    //   1576: aload #8
    //   1578: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1581: invokevirtual getName : ()Ljava/lang/String;
    //   1584: sipush #427
    //   1587: sipush #1704
    //   1590: invokestatic a : (II)Ljava/lang/String;
    //   1593: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1596: ifne -> 1606
    //   1599: goto -> 1606
    //   1602: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1605: athrow
    //   1606: aload #7
    //   1608: iconst_1
    //   1609: invokevirtual setAccessible : (Z)V
    //   1612: aload #7
    //   1614: aconst_null
    //   1615: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1618: pop
    //   1619: iinc #6, 1
    //   1622: iload_2
    //   1623: ifne -> 1484
    //   1626: sipush #440
    //   1629: sipush #-19754
    //   1632: invokestatic a : (II)Ljava/lang/String;
    //   1635: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1638: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1641: astore #4
    //   1643: aload #4
    //   1645: arraylength
    //   1646: istore #5
    //   1648: iconst_0
    //   1649: istore #6
    //   1651: iload #6
    //   1653: iload #5
    //   1655: if_icmpge -> 1791
    //   1658: aload #4
    //   1660: iload #6
    //   1662: aaload
    //   1663: astore #7
    //   1665: aload #7
    //   1667: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1670: pop
    //   1671: aload #7
    //   1673: invokevirtual getModifiers : ()I
    //   1676: invokestatic isStatic : (I)Z
    //   1679: ifeq -> 1777
    //   1682: aload #7
    //   1684: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1687: arraylength
    //   1688: iconst_2
    //   1689: if_icmpne -> 1777
    //   1692: goto -> 1699
    //   1695: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1698: athrow
    //   1699: aload #7
    //   1701: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1704: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1707: if_acmpne -> 1777
    //   1710: goto -> 1717
    //   1713: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1716: athrow
    //   1717: aload #7
    //   1719: iconst_1
    //   1720: invokevirtual setAccessible : (Z)V
    //   1723: aload #7
    //   1725: aconst_null
    //   1726: iconst_2
    //   1727: anewarray java/lang/Object
    //   1730: dup
    //   1731: iconst_0
    //   1732: aload_0
    //   1733: aastore
    //   1734: dup
    //   1735: iconst_1
    //   1736: aload_1
    //   1737: ifnonnull -> 1755
    //   1740: goto -> 1747
    //   1743: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1746: athrow
    //   1747: aload_1
    //   1748: goto -> 1762
    //   1751: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1754: athrow
    //   1755: aload_1
    //   1756: checkcast [B
    //   1759: invokevirtual clone : ()Ljava/lang/Object;
    //   1762: aastore
    //   1763: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1766: checkcast java/lang/Boolean
    //   1769: invokevirtual booleanValue : ()Z
    //   1772: istore_3
    //   1773: iload_2
    //   1774: ifne -> 1791
    //   1777: iinc #6, 1
    //   1780: iload_2
    //   1781: ifne -> 1651
    //   1784: goto -> 1791
    //   1787: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1790: athrow
    //   1791: iload_2
    //   1792: ifne -> 2133
    //   1795: sipush #424
    //   1798: sipush #-22856
    //   1801: invokestatic a : (II)Ljava/lang/String;
    //   1804: iconst_1
    //   1805: ldc burp/Zz5s
    //   1807: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1810: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1813: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1816: astore #4
    //   1818: aload #4
    //   1820: arraylength
    //   1821: istore #5
    //   1823: iconst_0
    //   1824: istore #6
    //   1826: iload #6
    //   1828: iload #5
    //   1830: if_icmpge -> 1968
    //   1833: aload #4
    //   1835: iload #6
    //   1837: aaload
    //   1838: astore #7
    //   1840: aload #7
    //   1842: invokevirtual getModifiers : ()I
    //   1845: invokestatic isStatic : (I)Z
    //   1848: ifne -> 1858
    //   1851: goto -> 1961
    //   1854: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1857: athrow
    //   1858: aload #7
    //   1860: invokevirtual getType : ()Ljava/lang/Class;
    //   1863: astore #8
    //   1865: aload #8
    //   1867: ifnull -> 1948
    //   1870: aload #8
    //   1872: invokevirtual isPrimitive : ()Z
    //   1875: ifne -> 1948
    //   1878: goto -> 1885
    //   1881: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1884: athrow
    //   1885: aload #8
    //   1887: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1890: ifnull -> 1948
    //   1893: goto -> 1900
    //   1896: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1899: athrow
    //   1900: aload #8
    //   1902: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1905: invokevirtual getName : ()Ljava/lang/String;
    //   1908: ifnull -> 1948
    //   1911: goto -> 1918
    //   1914: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1917: athrow
    //   1918: aload #8
    //   1920: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1923: invokevirtual getName : ()Ljava/lang/String;
    //   1926: sipush #427
    //   1929: sipush #1704
    //   1932: invokestatic a : (II)Ljava/lang/String;
    //   1935: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1938: ifne -> 1948
    //   1941: goto -> 1948
    //   1944: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1947: athrow
    //   1948: aload #7
    //   1950: iconst_1
    //   1951: invokevirtual setAccessible : (Z)V
    //   1954: aload #7
    //   1956: aconst_null
    //   1957: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1960: pop
    //   1961: iinc #6, 1
    //   1964: iload_2
    //   1965: ifne -> 1826
    //   1968: sipush #442
    //   1971: sipush #9670
    //   1974: invokestatic a : (II)Ljava/lang/String;
    //   1977: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1980: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1983: astore #4
    //   1985: aload #4
    //   1987: arraylength
    //   1988: istore #5
    //   1990: iconst_0
    //   1991: istore #6
    //   1993: iload #6
    //   1995: iload #5
    //   1997: if_icmpge -> 2133
    //   2000: aload #4
    //   2002: iload #6
    //   2004: aaload
    //   2005: astore #7
    //   2007: aload #7
    //   2009: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2012: pop
    //   2013: aload #7
    //   2015: invokevirtual getModifiers : ()I
    //   2018: invokestatic isStatic : (I)Z
    //   2021: ifeq -> 2119
    //   2024: aload #7
    //   2026: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2029: arraylength
    //   2030: iconst_2
    //   2031: if_icmpne -> 2119
    //   2034: goto -> 2041
    //   2037: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2040: athrow
    //   2041: aload #7
    //   2043: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2046: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2049: if_acmpne -> 2119
    //   2052: goto -> 2059
    //   2055: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2058: athrow
    //   2059: aload #7
    //   2061: iconst_1
    //   2062: invokevirtual setAccessible : (Z)V
    //   2065: aload #7
    //   2067: aconst_null
    //   2068: iconst_2
    //   2069: anewarray java/lang/Object
    //   2072: dup
    //   2073: iconst_0
    //   2074: aload_0
    //   2075: aastore
    //   2076: dup
    //   2077: iconst_1
    //   2078: aload_1
    //   2079: ifnonnull -> 2097
    //   2082: goto -> 2089
    //   2085: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2088: athrow
    //   2089: aload_1
    //   2090: goto -> 2104
    //   2093: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2096: athrow
    //   2097: aload_1
    //   2098: checkcast [B
    //   2101: invokevirtual clone : ()Ljava/lang/Object;
    //   2104: aastore
    //   2105: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2108: checkcast java/lang/Boolean
    //   2111: invokevirtual booleanValue : ()Z
    //   2114: istore_3
    //   2115: iload_2
    //   2116: ifne -> 2133
    //   2119: iinc #6, 1
    //   2122: iload_2
    //   2123: ifne -> 1993
    //   2126: goto -> 2133
    //   2129: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2132: athrow
    //   2133: iload_3
    //   2134: ifeq -> 2139
    //   2137: iload_3
    //   2138: ireturn
    //   2139: getstatic burp/Zl5d.Zh : Ljava/lang/String;
    //   2142: getstatic burp/Zl6e.Zo : Ljava/lang/Object;
    //   2145: checkcast java/math/BigInteger
    //   2148: invokevirtual intValue : ()I
    //   2151: bipush #32
    //   2153: irem
    //   2154: invokestatic abs : (I)I
    //   2157: invokevirtual charAt : (I)C
    //   2160: getstatic burp/Zsdn.Zf : Ljava/lang/String;
    //   2163: getstatic burp/Zsdn.ZE : Ljava/lang/Object;
    //   2166: checkcast java/math/BigInteger
    //   2169: invokevirtual intValue : ()I
    //   2172: bipush #32
    //   2174: irem
    //   2175: invokestatic abs : (I)I
    //   2178: invokevirtual charAt : (I)C
    //   2181: if_icmpgt -> 2526
    //   2184: sipush #447
    //   2187: sipush #15545
    //   2190: invokestatic a : (II)Ljava/lang/String;
    //   2193: iconst_1
    //   2194: ldc burp/Ztip
    //   2196: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2199: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2202: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2205: astore #4
    //   2207: aload #4
    //   2209: arraylength
    //   2210: istore #5
    //   2212: iconst_0
    //   2213: istore #6
    //   2215: iload #6
    //   2217: iload #5
    //   2219: if_icmpge -> 2357
    //   2222: aload #4
    //   2224: iload #6
    //   2226: aaload
    //   2227: astore #7
    //   2229: aload #7
    //   2231: invokevirtual getModifiers : ()I
    //   2234: invokestatic isStatic : (I)Z
    //   2237: ifne -> 2247
    //   2240: goto -> 2350
    //   2243: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2246: athrow
    //   2247: aload #7
    //   2249: invokevirtual getType : ()Ljava/lang/Class;
    //   2252: astore #8
    //   2254: aload #8
    //   2256: ifnull -> 2337
    //   2259: aload #8
    //   2261: invokevirtual isPrimitive : ()Z
    //   2264: ifne -> 2337
    //   2267: goto -> 2274
    //   2270: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2273: athrow
    //   2274: aload #8
    //   2276: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2279: ifnull -> 2337
    //   2282: goto -> 2289
    //   2285: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2288: athrow
    //   2289: aload #8
    //   2291: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2294: invokevirtual getName : ()Ljava/lang/String;
    //   2297: ifnull -> 2337
    //   2300: goto -> 2307
    //   2303: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2306: athrow
    //   2307: aload #8
    //   2309: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2312: invokevirtual getName : ()Ljava/lang/String;
    //   2315: sipush #427
    //   2318: sipush #1704
    //   2321: invokestatic a : (II)Ljava/lang/String;
    //   2324: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2327: ifne -> 2337
    //   2330: goto -> 2337
    //   2333: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2336: athrow
    //   2337: aload #7
    //   2339: iconst_1
    //   2340: invokevirtual setAccessible : (Z)V
    //   2343: aload #7
    //   2345: aconst_null
    //   2346: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2349: pop
    //   2350: iinc #6, 1
    //   2353: iload_2
    //   2354: ifne -> 2215
    //   2357: sipush #444
    //   2360: sipush #-16016
    //   2363: invokestatic a : (II)Ljava/lang/String;
    //   2366: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2369: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2372: astore #4
    //   2374: aload #4
    //   2376: arraylength
    //   2377: istore #5
    //   2379: iconst_0
    //   2380: istore #6
    //   2382: iload #6
    //   2384: iload #5
    //   2386: if_icmpge -> 2522
    //   2389: aload #4
    //   2391: iload #6
    //   2393: aaload
    //   2394: astore #7
    //   2396: aload #7
    //   2398: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2401: pop
    //   2402: aload #7
    //   2404: invokevirtual getModifiers : ()I
    //   2407: invokestatic isStatic : (I)Z
    //   2410: ifeq -> 2508
    //   2413: aload #7
    //   2415: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2418: arraylength
    //   2419: iconst_2
    //   2420: if_icmpne -> 2508
    //   2423: goto -> 2430
    //   2426: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2429: athrow
    //   2430: aload #7
    //   2432: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2435: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2438: if_acmpne -> 2508
    //   2441: goto -> 2448
    //   2444: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2447: athrow
    //   2448: aload #7
    //   2450: iconst_1
    //   2451: invokevirtual setAccessible : (Z)V
    //   2454: aload #7
    //   2456: aconst_null
    //   2457: iconst_2
    //   2458: anewarray java/lang/Object
    //   2461: dup
    //   2462: iconst_0
    //   2463: aload_0
    //   2464: aastore
    //   2465: dup
    //   2466: iconst_1
    //   2467: aload_1
    //   2468: ifnonnull -> 2486
    //   2471: goto -> 2478
    //   2474: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2477: athrow
    //   2478: aload_1
    //   2479: goto -> 2493
    //   2482: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2485: athrow
    //   2486: aload_1
    //   2487: checkcast [B
    //   2490: invokevirtual clone : ()Ljava/lang/Object;
    //   2493: aastore
    //   2494: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2497: checkcast java/lang/Boolean
    //   2500: invokevirtual booleanValue : ()Z
    //   2503: istore_3
    //   2504: iload_2
    //   2505: ifne -> 2522
    //   2508: iinc #6, 1
    //   2511: iload_2
    //   2512: ifne -> 2382
    //   2515: goto -> 2522
    //   2518: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2521: athrow
    //   2522: iload_2
    //   2523: ifne -> 2864
    //   2526: sipush #429
    //   2529: sipush #5582
    //   2532: invokestatic a : (II)Ljava/lang/String;
    //   2535: iconst_1
    //   2536: ldc burp/Zmdi
    //   2538: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2541: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2544: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2547: astore #4
    //   2549: aload #4
    //   2551: arraylength
    //   2552: istore #5
    //   2554: iconst_0
    //   2555: istore #6
    //   2557: iload #6
    //   2559: iload #5
    //   2561: if_icmpge -> 2699
    //   2564: aload #4
    //   2566: iload #6
    //   2568: aaload
    //   2569: astore #7
    //   2571: aload #7
    //   2573: invokevirtual getModifiers : ()I
    //   2576: invokestatic isStatic : (I)Z
    //   2579: ifne -> 2589
    //   2582: goto -> 2692
    //   2585: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2588: athrow
    //   2589: aload #7
    //   2591: invokevirtual getType : ()Ljava/lang/Class;
    //   2594: astore #8
    //   2596: aload #8
    //   2598: ifnull -> 2679
    //   2601: aload #8
    //   2603: invokevirtual isPrimitive : ()Z
    //   2606: ifne -> 2679
    //   2609: goto -> 2616
    //   2612: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2615: athrow
    //   2616: aload #8
    //   2618: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2621: ifnull -> 2679
    //   2624: goto -> 2631
    //   2627: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2630: athrow
    //   2631: aload #8
    //   2633: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2636: invokevirtual getName : ()Ljava/lang/String;
    //   2639: ifnull -> 2679
    //   2642: goto -> 2649
    //   2645: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2648: athrow
    //   2649: aload #8
    //   2651: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2654: invokevirtual getName : ()Ljava/lang/String;
    //   2657: sipush #427
    //   2660: sipush #1704
    //   2663: invokestatic a : (II)Ljava/lang/String;
    //   2666: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2669: ifne -> 2679
    //   2672: goto -> 2679
    //   2675: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2678: athrow
    //   2679: aload #7
    //   2681: iconst_1
    //   2682: invokevirtual setAccessible : (Z)V
    //   2685: aload #7
    //   2687: aconst_null
    //   2688: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2691: pop
    //   2692: iinc #6, 1
    //   2695: iload_2
    //   2696: ifne -> 2557
    //   2699: sipush #435
    //   2702: sipush #-29849
    //   2705: invokestatic a : (II)Ljava/lang/String;
    //   2708: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2711: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2714: astore #4
    //   2716: aload #4
    //   2718: arraylength
    //   2719: istore #5
    //   2721: iconst_0
    //   2722: istore #6
    //   2724: iload #6
    //   2726: iload #5
    //   2728: if_icmpge -> 2864
    //   2731: aload #4
    //   2733: iload #6
    //   2735: aaload
    //   2736: astore #7
    //   2738: aload #7
    //   2740: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2743: pop
    //   2744: aload #7
    //   2746: invokevirtual getModifiers : ()I
    //   2749: invokestatic isStatic : (I)Z
    //   2752: ifeq -> 2850
    //   2755: aload #7
    //   2757: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2760: arraylength
    //   2761: iconst_2
    //   2762: if_icmpne -> 2850
    //   2765: goto -> 2772
    //   2768: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2771: athrow
    //   2772: aload #7
    //   2774: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2777: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2780: if_acmpne -> 2850
    //   2783: goto -> 2790
    //   2786: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2789: athrow
    //   2790: aload #7
    //   2792: iconst_1
    //   2793: invokevirtual setAccessible : (Z)V
    //   2796: aload #7
    //   2798: aconst_null
    //   2799: iconst_2
    //   2800: anewarray java/lang/Object
    //   2803: dup
    //   2804: iconst_0
    //   2805: aload_0
    //   2806: aastore
    //   2807: dup
    //   2808: iconst_1
    //   2809: aload_1
    //   2810: ifnonnull -> 2828
    //   2813: goto -> 2820
    //   2816: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2819: athrow
    //   2820: aload_1
    //   2821: goto -> 2835
    //   2824: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2827: athrow
    //   2828: aload_1
    //   2829: checkcast [B
    //   2832: invokevirtual clone : ()Ljava/lang/Object;
    //   2835: aastore
    //   2836: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2839: checkcast java/lang/Boolean
    //   2842: invokevirtual booleanValue : ()Z
    //   2845: istore_3
    //   2846: iload_2
    //   2847: ifne -> 2864
    //   2850: iinc #6, 1
    //   2853: iload_2
    //   2854: ifne -> 2724
    //   2857: goto -> 2864
    //   2860: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2863: athrow
    //   2864: iload_3
    //   2865: ifeq -> 2870
    //   2868: iload_3
    //   2869: ireturn
    //   2870: getstatic burp/Ze40.Zr : Ljava/lang/String;
    //   2873: getstatic burp/Zxjm.Zn : Ljava/lang/Object;
    //   2876: checkcast java/math/BigInteger
    //   2879: invokevirtual intValue : ()I
    //   2882: bipush #32
    //   2884: irem
    //   2885: invokestatic abs : (I)I
    //   2888: invokevirtual charAt : (I)C
    //   2891: getstatic burp/Zg7j.ZR : Ljava/lang/String;
    //   2894: getstatic burp/Zg7j.Zr : Ljava/lang/Object;
    //   2897: checkcast java/math/BigInteger
    //   2900: invokevirtual intValue : ()I
    //   2903: bipush #32
    //   2905: irem
    //   2906: invokestatic abs : (I)I
    //   2909: invokevirtual charAt : (I)C
    //   2912: if_icmpgt -> 3257
    //   2915: sipush #433
    //   2918: sipush #-2558
    //   2921: invokestatic a : (II)Ljava/lang/String;
    //   2924: iconst_1
    //   2925: ldc burp/Zein
    //   2927: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2930: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2933: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2936: astore #4
    //   2938: aload #4
    //   2940: arraylength
    //   2941: istore #5
    //   2943: iconst_0
    //   2944: istore #6
    //   2946: iload #6
    //   2948: iload #5
    //   2950: if_icmpge -> 3088
    //   2953: aload #4
    //   2955: iload #6
    //   2957: aaload
    //   2958: astore #7
    //   2960: aload #7
    //   2962: invokevirtual getModifiers : ()I
    //   2965: invokestatic isStatic : (I)Z
    //   2968: ifne -> 2978
    //   2971: goto -> 3081
    //   2974: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2977: athrow
    //   2978: aload #7
    //   2980: invokevirtual getType : ()Ljava/lang/Class;
    //   2983: astore #8
    //   2985: aload #8
    //   2987: ifnull -> 3068
    //   2990: aload #8
    //   2992: invokevirtual isPrimitive : ()Z
    //   2995: ifne -> 3068
    //   2998: goto -> 3005
    //   3001: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3004: athrow
    //   3005: aload #8
    //   3007: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3010: ifnull -> 3068
    //   3013: goto -> 3020
    //   3016: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3019: athrow
    //   3020: aload #8
    //   3022: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3025: invokevirtual getName : ()Ljava/lang/String;
    //   3028: ifnull -> 3068
    //   3031: goto -> 3038
    //   3034: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3037: athrow
    //   3038: aload #8
    //   3040: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3043: invokevirtual getName : ()Ljava/lang/String;
    //   3046: sipush #427
    //   3049: sipush #1704
    //   3052: invokestatic a : (II)Ljava/lang/String;
    //   3055: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3058: ifne -> 3068
    //   3061: goto -> 3068
    //   3064: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3067: athrow
    //   3068: aload #7
    //   3070: iconst_1
    //   3071: invokevirtual setAccessible : (Z)V
    //   3074: aload #7
    //   3076: aconst_null
    //   3077: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3080: pop
    //   3081: iinc #6, 1
    //   3084: iload_2
    //   3085: ifne -> 2946
    //   3088: sipush #417
    //   3091: sipush #28129
    //   3094: invokestatic a : (II)Ljava/lang/String;
    //   3097: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3100: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3103: astore #4
    //   3105: aload #4
    //   3107: arraylength
    //   3108: istore #5
    //   3110: iconst_0
    //   3111: istore #6
    //   3113: iload #6
    //   3115: iload #5
    //   3117: if_icmpge -> 3253
    //   3120: aload #4
    //   3122: iload #6
    //   3124: aaload
    //   3125: astore #7
    //   3127: aload #7
    //   3129: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3132: pop
    //   3133: aload #7
    //   3135: invokevirtual getModifiers : ()I
    //   3138: invokestatic isStatic : (I)Z
    //   3141: ifeq -> 3239
    //   3144: aload #7
    //   3146: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3149: arraylength
    //   3150: iconst_2
    //   3151: if_icmpne -> 3239
    //   3154: goto -> 3161
    //   3157: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3160: athrow
    //   3161: aload #7
    //   3163: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3166: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3169: if_acmpne -> 3239
    //   3172: goto -> 3179
    //   3175: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3178: athrow
    //   3179: aload #7
    //   3181: iconst_1
    //   3182: invokevirtual setAccessible : (Z)V
    //   3185: aload #7
    //   3187: aconst_null
    //   3188: iconst_2
    //   3189: anewarray java/lang/Object
    //   3192: dup
    //   3193: iconst_0
    //   3194: aload_0
    //   3195: aastore
    //   3196: dup
    //   3197: iconst_1
    //   3198: aload_1
    //   3199: ifnonnull -> 3217
    //   3202: goto -> 3209
    //   3205: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3208: athrow
    //   3209: aload_1
    //   3210: goto -> 3224
    //   3213: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3216: athrow
    //   3217: aload_1
    //   3218: checkcast [B
    //   3221: invokevirtual clone : ()Ljava/lang/Object;
    //   3224: aastore
    //   3225: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3228: checkcast java/lang/Boolean
    //   3231: invokevirtual booleanValue : ()Z
    //   3234: istore_3
    //   3235: iload_2
    //   3236: ifne -> 3253
    //   3239: iinc #6, 1
    //   3242: iload_2
    //   3243: ifne -> 3113
    //   3246: goto -> 3253
    //   3249: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3252: athrow
    //   3253: iload_2
    //   3254: ifne -> 3595
    //   3257: sipush #446
    //   3260: sipush #615
    //   3263: invokestatic a : (II)Ljava/lang/String;
    //   3266: iconst_1
    //   3267: ldc burp/Zle6
    //   3269: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3272: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3275: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3278: astore #4
    //   3280: aload #4
    //   3282: arraylength
    //   3283: istore #5
    //   3285: iconst_0
    //   3286: istore #6
    //   3288: iload #6
    //   3290: iload #5
    //   3292: if_icmpge -> 3430
    //   3295: aload #4
    //   3297: iload #6
    //   3299: aaload
    //   3300: astore #7
    //   3302: aload #7
    //   3304: invokevirtual getModifiers : ()I
    //   3307: invokestatic isStatic : (I)Z
    //   3310: ifne -> 3320
    //   3313: goto -> 3423
    //   3316: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3319: athrow
    //   3320: aload #7
    //   3322: invokevirtual getType : ()Ljava/lang/Class;
    //   3325: astore #8
    //   3327: aload #8
    //   3329: ifnull -> 3410
    //   3332: aload #8
    //   3334: invokevirtual isPrimitive : ()Z
    //   3337: ifne -> 3410
    //   3340: goto -> 3347
    //   3343: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3346: athrow
    //   3347: aload #8
    //   3349: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3352: ifnull -> 3410
    //   3355: goto -> 3362
    //   3358: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3361: athrow
    //   3362: aload #8
    //   3364: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3367: invokevirtual getName : ()Ljava/lang/String;
    //   3370: ifnull -> 3410
    //   3373: goto -> 3380
    //   3376: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3379: athrow
    //   3380: aload #8
    //   3382: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3385: invokevirtual getName : ()Ljava/lang/String;
    //   3388: sipush #427
    //   3391: sipush #1704
    //   3394: invokestatic a : (II)Ljava/lang/String;
    //   3397: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3400: ifne -> 3410
    //   3403: goto -> 3410
    //   3406: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3409: athrow
    //   3410: aload #7
    //   3412: iconst_1
    //   3413: invokevirtual setAccessible : (Z)V
    //   3416: aload #7
    //   3418: aconst_null
    //   3419: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3422: pop
    //   3423: iinc #6, 1
    //   3426: iload_2
    //   3427: ifne -> 3288
    //   3430: sipush #441
    //   3433: sipush #-30784
    //   3436: invokestatic a : (II)Ljava/lang/String;
    //   3439: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3442: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3445: astore #4
    //   3447: aload #4
    //   3449: arraylength
    //   3450: istore #5
    //   3452: iconst_0
    //   3453: istore #6
    //   3455: iload #6
    //   3457: iload #5
    //   3459: if_icmpge -> 3595
    //   3462: aload #4
    //   3464: iload #6
    //   3466: aaload
    //   3467: astore #7
    //   3469: aload #7
    //   3471: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3474: pop
    //   3475: aload #7
    //   3477: invokevirtual getModifiers : ()I
    //   3480: invokestatic isStatic : (I)Z
    //   3483: ifeq -> 3581
    //   3486: aload #7
    //   3488: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3491: arraylength
    //   3492: iconst_2
    //   3493: if_icmpne -> 3581
    //   3496: goto -> 3503
    //   3499: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3502: athrow
    //   3503: aload #7
    //   3505: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3508: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3511: if_acmpne -> 3581
    //   3514: goto -> 3521
    //   3517: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3520: athrow
    //   3521: aload #7
    //   3523: iconst_1
    //   3524: invokevirtual setAccessible : (Z)V
    //   3527: aload #7
    //   3529: aconst_null
    //   3530: iconst_2
    //   3531: anewarray java/lang/Object
    //   3534: dup
    //   3535: iconst_0
    //   3536: aload_0
    //   3537: aastore
    //   3538: dup
    //   3539: iconst_1
    //   3540: aload_1
    //   3541: ifnonnull -> 3559
    //   3544: goto -> 3551
    //   3547: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3550: athrow
    //   3551: aload_1
    //   3552: goto -> 3566
    //   3555: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3558: athrow
    //   3559: aload_1
    //   3560: checkcast [B
    //   3563: invokevirtual clone : ()Ljava/lang/Object;
    //   3566: aastore
    //   3567: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3570: checkcast java/lang/Boolean
    //   3573: invokevirtual booleanValue : ()Z
    //   3576: istore_3
    //   3577: iload_2
    //   3578: ifne -> 3595
    //   3581: iinc #6, 1
    //   3584: iload_2
    //   3585: ifne -> 3455
    //   3588: goto -> 3595
    //   3591: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3594: athrow
    //   3595: iload_3
    //   3596: ireturn
    //   3597: astore_3
    //   3598: new java/lang/Exception
    //   3601: dup
    //   3602: aload_3
    //   3603: invokevirtual getMessage : ()Ljava/lang/String;
    //   3606: invokespecial <init> : (Ljava/lang/String;)V
    //   3609: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1407	3597	java/lang/Throwable
    //   64	78	78	java/lang/Throwable
    //   89	102	105	java/lang/Throwable
    //   94	117	120	java/lang/Throwable
    //   109	135	138	java/lang/Throwable
    //   124	165	168	java/lang/Throwable
    //   228	255	258	java/lang/Throwable
    //   245	273	276	java/lang/Throwable
    //   262	303	306	java/lang/Throwable
    //   280	314	314	java/lang/Throwable
    //   325	341	344	java/lang/Throwable
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
    //   935	962	965	java/lang/Throwable
    //   952	980	983	java/lang/Throwable
    //   969	1010	1013	java/lang/Throwable
    //   987	1021	1021	java/lang/Throwable
    //   1043	1054	1057	java/lang/Throwable
    //   1109	1123	1123	java/lang/Throwable
    //   1134	1147	1150	java/lang/Throwable
    //   1139	1162	1165	java/lang/Throwable
    //   1154	1180	1183	java/lang/Throwable
    //   1169	1210	1213	java/lang/Throwable
    //   1276	1303	1306	java/lang/Throwable
    //   1293	1321	1324	java/lang/Throwable
    //   1310	1351	1354	java/lang/Throwable
    //   1328	1362	1362	java/lang/Throwable
    //   1384	1395	1398	java/lang/Throwable
    //   1408	2138	3597	java/lang/Throwable
    //   1498	1512	1512	java/lang/Throwable
    //   1523	1536	1539	java/lang/Throwable
    //   1528	1551	1554	java/lang/Throwable
    //   1543	1569	1572	java/lang/Throwable
    //   1558	1599	1602	java/lang/Throwable
    //   1665	1692	1695	java/lang/Throwable
    //   1682	1710	1713	java/lang/Throwable
    //   1699	1740	1743	java/lang/Throwable
    //   1717	1751	1751	java/lang/Throwable
    //   1773	1784	1787	java/lang/Throwable
    //   1840	1854	1854	java/lang/Throwable
    //   1865	1878	1881	java/lang/Throwable
    //   1870	1893	1896	java/lang/Throwable
    //   1885	1911	1914	java/lang/Throwable
    //   1900	1941	1944	java/lang/Throwable
    //   2007	2034	2037	java/lang/Throwable
    //   2024	2052	2055	java/lang/Throwable
    //   2041	2082	2085	java/lang/Throwable
    //   2059	2093	2093	java/lang/Throwable
    //   2115	2126	2129	java/lang/Throwable
    //   2139	2869	3597	java/lang/Throwable
    //   2229	2243	2243	java/lang/Throwable
    //   2254	2267	2270	java/lang/Throwable
    //   2259	2282	2285	java/lang/Throwable
    //   2274	2300	2303	java/lang/Throwable
    //   2289	2330	2333	java/lang/Throwable
    //   2396	2423	2426	java/lang/Throwable
    //   2413	2441	2444	java/lang/Throwable
    //   2430	2471	2474	java/lang/Throwable
    //   2448	2482	2482	java/lang/Throwable
    //   2504	2515	2518	java/lang/Throwable
    //   2571	2585	2585	java/lang/Throwable
    //   2596	2609	2612	java/lang/Throwable
    //   2601	2624	2627	java/lang/Throwable
    //   2616	2642	2645	java/lang/Throwable
    //   2631	2672	2675	java/lang/Throwable
    //   2738	2765	2768	java/lang/Throwable
    //   2755	2783	2786	java/lang/Throwable
    //   2772	2813	2816	java/lang/Throwable
    //   2790	2824	2824	java/lang/Throwable
    //   2846	2857	2860	java/lang/Throwable
    //   2870	3596	3597	java/lang/Throwable
    //   2960	2974	2974	java/lang/Throwable
    //   2985	2998	3001	java/lang/Throwable
    //   2990	3013	3016	java/lang/Throwable
    //   3005	3031	3034	java/lang/Throwable
    //   3020	3061	3064	java/lang/Throwable
    //   3127	3154	3157	java/lang/Throwable
    //   3144	3172	3175	java/lang/Throwable
    //   3161	3202	3205	java/lang/Throwable
    //   3179	3213	3213	java/lang/Throwable
    //   3235	3246	3249	java/lang/Throwable
    //   3302	3316	3316	java/lang/Throwable
    //   3327	3340	3343	java/lang/Throwable
    //   3332	3355	3358	java/lang/Throwable
    //   3347	3373	3376	java/lang/Throwable
    //   3362	3403	3406	java/lang/Throwable
    //   3469	3496	3499	java/lang/Throwable
    //   3486	3514	3517	java/lang/Throwable
    //   3503	3544	3547	java/lang/Throwable
    //   3521	3555	3555	java/lang/Throwable
    //   3577	3588	3591	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #27
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ô+%»@\\bôî¸%E].Y\\n"¦Ð %©°h!\\tÂ*Ë½doÚß\\tWyÛ2£ÖÃ\\bS>ù?"?Û\\tOÅz@RÐÂoX\\t¼o/5kË¬\\té®+È½#\\tû#ìK\\t%\/Suò\\t èåodcÜ§\\t ¥LíQ&Wö\\tùé¬Å`59\\t}Ã<ÈÃ n '?QÓ©øÔÙJùªKì\\n lªT,5ª3IsM\\bj *d_MfôEv·Þ'Û\\tÓÈ0ûn¼ôr§W#¸A­´ì<3ýâ `H Ê¬y[ùÂ#èXbåÛ\\t­w £§\\tEÐPÒo-}Ö<"\\tÒgÉ$Z)\\t0z·¯.eü¥\\tLW^Zd7\\t8RÿW'dÓZ\\ts»s¯æÎÌ\\tñ#­¨K\\b³\\tksþÂ\\nÉ"\\t\\nÃ¹eï5Ô'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #111
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
    //   68: ldc 'Ð4Ç0\\tj×LAýÐÃ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #68
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
    //   128: putstatic burp/Zrfl.a : [Ljava/lang/String;
    //   131: bipush #27
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zrfl.b : [Ljava/lang/String;
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
    //   212: bipush #18
    //   214: goto -> 244
    //   217: bipush #12
    //   219: goto -> 244
    //   222: bipush #15
    //   224: goto -> 244
    //   227: bipush #80
    //   229: goto -> 244
    //   232: bipush #108
    //   234: goto -> 244
    //   237: bipush #116
    //   239: goto -> 244
    //   242: bipush #24
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
    //   300: sipush #438
    //   303: sipush #-15947
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zrfl.Zy : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #29
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #89
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #102
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #7
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #26
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-25
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #-60
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #-72
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #-54
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #-93
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #-14
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #25
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #-60
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #-36
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #15
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-19
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #-92
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #-59
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #31
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #63
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #-60
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #13
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #-100
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #67
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #-113
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #-70
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #-53
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #-98
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #-92
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #-75
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #-120
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #14
    //   505: bastore
    //   506: invokespecial <init> : ([B)V
    //   509: putstatic burp/Zrfl.Z_ : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1BB) & 0xFFFF;
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
      char c = 'Æ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrfl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */