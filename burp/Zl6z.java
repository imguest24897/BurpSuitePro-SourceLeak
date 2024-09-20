package burp;

import java.math.BigInteger;

class Zl6z extends ClassLoader {
  static Object Zt;
  
  static String ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zl(Object paramObject) {
    Zza3.ZU = a(25822, -5);
    Zza3.Zb = new BigInteger(a(25794, 15417));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zbzj.Zw.charAt(Math.abs(((BigInteger)Zza3.Zb).intValue() % 32)) <= Zbzj.Zw.charAt(Math.abs(((BigInteger)Ztsc.Zr).intValue() % 32))) {
          try {
            Zbxa.ZI(Class.forName(a(25814, 12904)));
            if (bool)
              Zb9q.ZY(Class.forName(a(25817, -10841))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zb9q.ZY(Class.forName(a(25817, -10841)));
    } catch (Throwable throwable) {}
  }
  
  static void ZL(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zq(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: sipush #25810
    //   7: sipush #-15882
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokestatic Zm : (Ljava/lang/Object;)V
    //   19: sipush #25815
    //   22: getstatic burp/Zmh0.Zt : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: getstatic burp/Zso7.ZB : Ljava/lang/Object;
    //   31: checkcast java/math/BigInteger
    //   34: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   37: putstatic burp/Zg_6.ZU : Ljava/lang/Object;
    //   40: sipush #-29563
    //   43: getstatic burp/Ztc2.ZM : Ljava/lang/Object;
    //   46: checkcast java/math/BigInteger
    //   49: getstatic burp/Zspk.ZF : Ljava/lang/Object;
    //   52: checkcast java/math/BigInteger
    //   55: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   58: putstatic burp/Zrxf.ZS : Ljava/lang/Object;
    //   61: getstatic burp/Zza3.Zb : Ljava/lang/Object;
    //   64: checkcast java/math/BigInteger
    //   67: getstatic burp/Zs5k.Zg : Ljava/lang/Object;
    //   70: checkcast java/math/BigInteger
    //   73: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   76: putstatic burp/Zmdm.ZZ : Ljava/lang/Object;
    //   79: invokestatic a : (II)Ljava/lang/String;
    //   82: iconst_1
    //   83: ldc burp/Zxti
    //   85: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   88: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   91: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   94: astore_3
    //   95: aload_3
    //   96: arraylength
    //   97: istore #4
    //   99: iconst_0
    //   100: istore #5
    //   102: iload #5
    //   104: iload #4
    //   106: if_icmpge -> 243
    //   109: aload_3
    //   110: iload #5
    //   112: aaload
    //   113: astore #6
    //   115: aload #6
    //   117: invokevirtual getModifiers : ()I
    //   120: invokestatic isStatic : (I)Z
    //   123: ifne -> 133
    //   126: goto -> 236
    //   129: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   132: athrow
    //   133: aload #6
    //   135: invokevirtual getType : ()Ljava/lang/Class;
    //   138: astore #7
    //   140: aload #7
    //   142: ifnull -> 223
    //   145: aload #7
    //   147: invokevirtual isPrimitive : ()Z
    //   150: ifne -> 223
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   159: athrow
    //   160: aload #7
    //   162: invokevirtual getPackage : ()Ljava/lang/Package;
    //   165: ifnull -> 223
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   174: athrow
    //   175: aload #7
    //   177: invokevirtual getPackage : ()Ljava/lang/Package;
    //   180: invokevirtual getName : ()Ljava/lang/String;
    //   183: ifnull -> 223
    //   186: goto -> 193
    //   189: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   192: athrow
    //   193: aload #7
    //   195: invokevirtual getPackage : ()Ljava/lang/Package;
    //   198: invokevirtual getName : ()Ljava/lang/String;
    //   201: sipush #25813
    //   204: sipush #19769
    //   207: invokestatic a : (II)Ljava/lang/String;
    //   210: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   213: ifne -> 223
    //   216: goto -> 223
    //   219: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   222: athrow
    //   223: aload #6
    //   225: iconst_1
    //   226: invokevirtual setAccessible : (Z)V
    //   229: aload #6
    //   231: aconst_null
    //   232: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   235: pop
    //   236: iinc #5, 1
    //   239: iload_2
    //   240: ifne -> 102
    //   243: sipush #25819
    //   246: sipush #-11699
    //   249: invokestatic a : (II)Ljava/lang/String;
    //   252: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   255: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   258: astore_3
    //   259: aload_3
    //   260: arraylength
    //   261: istore #4
    //   263: iconst_0
    //   264: istore #5
    //   266: iload #5
    //   268: iload #4
    //   270: if_icmpge -> 402
    //   273: aload_3
    //   274: iload #5
    //   276: aaload
    //   277: astore #6
    //   279: aload #6
    //   281: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   284: pop
    //   285: aload #6
    //   287: invokevirtual getModifiers : ()I
    //   290: invokestatic isStatic : (I)Z
    //   293: ifeq -> 388
    //   296: aload #6
    //   298: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   301: arraylength
    //   302: iconst_2
    //   303: if_icmpne -> 388
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   312: athrow
    //   313: aload #6
    //   315: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   318: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   321: invokevirtual equals : (Ljava/lang/Object;)Z
    //   324: ifeq -> 388
    //   327: goto -> 334
    //   330: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   333: athrow
    //   334: aload #6
    //   336: iconst_1
    //   337: invokevirtual setAccessible : (Z)V
    //   340: aload #6
    //   342: aconst_null
    //   343: iconst_2
    //   344: anewarray java/lang/Object
    //   347: dup
    //   348: iconst_0
    //   349: aload_0
    //   350: aastore
    //   351: dup
    //   352: iconst_1
    //   353: aload_1
    //   354: ifnonnull -> 372
    //   357: goto -> 364
    //   360: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   363: athrow
    //   364: aload_1
    //   365: goto -> 379
    //   368: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   371: athrow
    //   372: aload_1
    //   373: checkcast [B
    //   376: invokevirtual clone : ()Ljava/lang/Object;
    //   379: aastore
    //   380: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   383: pop
    //   384: iload_2
    //   385: ifne -> 402
    //   388: iinc #5, 1
    //   391: iload_2
    //   392: ifne -> 266
    //   395: goto -> 402
    //   398: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   401: athrow
    //   402: getstatic burp/Zl8s.ZY : Ljava/lang/Object;
    //   405: checkcast java/math/BigInteger
    //   408: invokevirtual toByteArray : ()[B
    //   411: astore_3
    //   412: aload_3
    //   413: arraylength
    //   414: iconst_2
    //   415: iadd
    //   416: newarray byte
    //   418: astore #5
    //   420: iconst_0
    //   421: istore #6
    //   423: iload #6
    //   425: aload_3
    //   426: arraylength
    //   427: if_icmpge -> 446
    //   430: aload #5
    //   432: iload #6
    //   434: aload_3
    //   435: iload #6
    //   437: baload
    //   438: bastore
    //   439: iinc #6, 1
    //   442: iload_2
    //   443: ifne -> 423
    //   446: aload #5
    //   448: arraylength
    //   449: iconst_3
    //   450: idiv
    //   451: iconst_4
    //   452: imul
    //   453: newarray byte
    //   455: astore #4
    //   457: iconst_0
    //   458: istore #6
    //   460: iconst_0
    //   461: istore #7
    //   463: iload #6
    //   465: aload_3
    //   466: arraylength
    //   467: if_icmpge -> 578
    //   470: aload #4
    //   472: iload #7
    //   474: aload #5
    //   476: iload #6
    //   478: baload
    //   479: iconst_2
    //   480: iushr
    //   481: bipush #63
    //   483: iand
    //   484: i2b
    //   485: bastore
    //   486: aload #4
    //   488: iload #7
    //   490: iconst_1
    //   491: iadd
    //   492: aload #5
    //   494: iload #6
    //   496: iconst_1
    //   497: iadd
    //   498: baload
    //   499: iconst_4
    //   500: iushr
    //   501: bipush #15
    //   503: iand
    //   504: aload #5
    //   506: iload #6
    //   508: baload
    //   509: iconst_4
    //   510: ishl
    //   511: bipush #63
    //   513: iand
    //   514: ior
    //   515: i2b
    //   516: bastore
    //   517: aload #4
    //   519: iload #7
    //   521: iconst_2
    //   522: iadd
    //   523: aload #5
    //   525: iload #6
    //   527: iconst_2
    //   528: iadd
    //   529: baload
    //   530: bipush #6
    //   532: iushr
    //   533: iconst_3
    //   534: iand
    //   535: aload #5
    //   537: iload #6
    //   539: iconst_1
    //   540: iadd
    //   541: baload
    //   542: iconst_2
    //   543: ishl
    //   544: bipush #63
    //   546: iand
    //   547: ior
    //   548: i2b
    //   549: bastore
    //   550: aload #4
    //   552: iload #7
    //   554: iconst_3
    //   555: iadd
    //   556: aload #5
    //   558: iload #6
    //   560: iconst_2
    //   561: iadd
    //   562: baload
    //   563: bipush #63
    //   565: iand
    //   566: i2b
    //   567: bastore
    //   568: iinc #6, 3
    //   571: iinc #7, 4
    //   574: iload_2
    //   575: ifne -> 463
    //   578: iconst_0
    //   579: istore #6
    //   581: iload #6
    //   583: aload #4
    //   585: arraylength
    //   586: if_icmpge -> 770
    //   589: aload #4
    //   591: iload #6
    //   593: baload
    //   594: bipush #26
    //   596: if_icmpge -> 624
    //   599: aload #4
    //   601: iload #6
    //   603: aload #4
    //   605: iload #6
    //   607: baload
    //   608: bipush #65
    //   610: iadd
    //   611: i2b
    //   612: bastore
    //   613: iload_2
    //   614: ifne -> 763
    //   617: goto -> 624
    //   620: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   623: athrow
    //   624: aload #4
    //   626: iload #6
    //   628: baload
    //   629: bipush #52
    //   631: if_icmpge -> 669
    //   634: goto -> 641
    //   637: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   640: athrow
    //   641: aload #4
    //   643: iload #6
    //   645: aload #4
    //   647: iload #6
    //   649: baload
    //   650: bipush #97
    //   652: iadd
    //   653: bipush #26
    //   655: isub
    //   656: i2b
    //   657: bastore
    //   658: iload_2
    //   659: ifne -> 763
    //   662: goto -> 669
    //   665: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   668: athrow
    //   669: aload #4
    //   671: iload #6
    //   673: baload
    //   674: bipush #62
    //   676: if_icmpge -> 714
    //   679: goto -> 686
    //   682: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   685: athrow
    //   686: aload #4
    //   688: iload #6
    //   690: aload #4
    //   692: iload #6
    //   694: baload
    //   695: bipush #48
    //   697: iadd
    //   698: bipush #52
    //   700: isub
    //   701: i2b
    //   702: bastore
    //   703: iload_2
    //   704: ifne -> 763
    //   707: goto -> 714
    //   710: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   713: athrow
    //   714: aload #4
    //   716: iload #6
    //   718: baload
    //   719: bipush #63
    //   721: if_icmpge -> 749
    //   724: goto -> 731
    //   727: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   730: athrow
    //   731: aload #4
    //   733: iload #6
    //   735: bipush #43
    //   737: bastore
    //   738: iload_2
    //   739: ifne -> 763
    //   742: goto -> 749
    //   745: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   748: athrow
    //   749: aload #4
    //   751: iload #6
    //   753: bipush #47
    //   755: bastore
    //   756: goto -> 763
    //   759: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   762: athrow
    //   763: iinc #6, 1
    //   766: iload_2
    //   767: ifne -> 581
    //   770: aload #4
    //   772: arraylength
    //   773: iconst_1
    //   774: isub
    //   775: istore #6
    //   777: iload #6
    //   779: aload_3
    //   780: arraylength
    //   781: iconst_4
    //   782: imul
    //   783: iconst_3
    //   784: idiv
    //   785: if_icmple -> 802
    //   788: aload #4
    //   790: iload #6
    //   792: bipush #61
    //   794: bastore
    //   795: iinc #6, -1
    //   798: iload_2
    //   799: ifne -> 777
    //   802: new java/io/ByteArrayOutputStream
    //   805: dup
    //   806: invokespecial <init> : ()V
    //   809: astore_3
    //   810: sipush #25803
    //   813: aload_3
    //   814: sipush #202
    //   817: invokevirtual write : (I)V
    //   820: sipush #-26099
    //   823: aload_3
    //   824: sipush #254
    //   827: invokevirtual write : (I)V
    //   830: aload_3
    //   831: sipush #186
    //   834: invokevirtual write : (I)V
    //   837: aload_3
    //   838: sipush #190
    //   841: invokevirtual write : (I)V
    //   844: aload_3
    //   845: iconst_0
    //   846: invokevirtual write : (I)V
    //   849: aload_3
    //   850: iconst_1
    //   851: invokevirtual write : (I)V
    //   854: aload_3
    //   855: iconst_0
    //   856: invokevirtual write : (I)V
    //   859: aload_3
    //   860: bipush #50
    //   862: invokevirtual write : (I)V
    //   865: aload_3
    //   866: getstatic burp/Zz5s.Zg : Ljava/lang/Object;
    //   869: checkcast java/math/BigInteger
    //   872: invokevirtual toByteArray : ()[B
    //   875: invokevirtual write : ([B)V
    //   878: aload_3
    //   879: getstatic burp/Zstf.ZA : Ljava/lang/Object;
    //   882: checkcast java/math/BigInteger
    //   885: invokevirtual toByteArray : ()[B
    //   888: invokevirtual write : ([B)V
    //   891: aload_3
    //   892: getstatic burp/Zly7.Zt : Ljava/lang/Object;
    //   895: checkcast java/math/BigInteger
    //   898: invokevirtual toByteArray : ()[B
    //   901: invokevirtual write : ([B)V
    //   904: aload_3
    //   905: invokevirtual toByteArray : ()[B
    //   908: astore #4
    //   910: aconst_null
    //   911: astore #5
    //   913: invokestatic a : (II)Ljava/lang/String;
    //   916: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   919: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   922: astore #6
    //   924: aload #6
    //   926: arraylength
    //   927: istore #7
    //   929: iconst_0
    //   930: istore #8
    //   932: iload #8
    //   934: iload #7
    //   936: if_icmpge -> 1064
    //   939: aload #6
    //   941: iload #8
    //   943: aaload
    //   944: astore #9
    //   946: aload #9
    //   948: invokevirtual getName : ()Ljava/lang/String;
    //   951: sipush #25821
    //   954: sipush #26452
    //   957: invokestatic a : (II)Ljava/lang/String;
    //   960: invokevirtual equals : (Ljava/lang/Object;)Z
    //   963: ifeq -> 1057
    //   966: aload #9
    //   968: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   971: astore #10
    //   973: aload #10
    //   975: arraylength
    //   976: iconst_4
    //   977: if_icmpeq -> 987
    //   980: goto -> 1057
    //   983: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   986: athrow
    //   987: aload #10
    //   989: iconst_0
    //   990: aaload
    //   991: ldc java/lang/String
    //   993: if_acmpeq -> 1003
    //   996: goto -> 1057
    //   999: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1002: athrow
    //   1003: aload #10
    //   1005: iconst_1
    //   1006: aaload
    //   1007: ldc [B
    //   1009: if_acmpeq -> 1019
    //   1012: goto -> 1057
    //   1015: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1018: athrow
    //   1019: aload #10
    //   1021: iconst_2
    //   1022: aaload
    //   1023: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1026: if_acmpeq -> 1036
    //   1029: goto -> 1057
    //   1032: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1035: athrow
    //   1036: aload #10
    //   1038: iconst_3
    //   1039: aaload
    //   1040: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1043: if_acmpeq -> 1053
    //   1046: goto -> 1057
    //   1049: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1052: athrow
    //   1053: aload #9
    //   1055: astore #5
    //   1057: iinc #8, 1
    //   1060: iload_2
    //   1061: ifne -> 932
    //   1064: aload #5
    //   1066: iconst_1
    //   1067: invokevirtual setAccessible : (Z)V
    //   1070: ldc burp/Zgw7
    //   1072: iconst_0
    //   1073: anewarray java/lang/Class
    //   1076: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   1079: astore #6
    //   1081: aload #6
    //   1083: iconst_1
    //   1084: invokevirtual setAccessible : (Z)V
    //   1087: aload #5
    //   1089: aload #6
    //   1091: iconst_0
    //   1092: anewarray java/lang/Object
    //   1095: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   1098: iconst_4
    //   1099: anewarray java/lang/Object
    //   1102: dup
    //   1103: iconst_0
    //   1104: sipush #25807
    //   1107: sipush #-6938
    //   1110: invokestatic a : (II)Ljava/lang/String;
    //   1113: aastore
    //   1114: dup
    //   1115: iconst_1
    //   1116: aload #4
    //   1118: aastore
    //   1119: dup
    //   1120: iconst_2
    //   1121: iconst_0
    //   1122: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1125: aastore
    //   1126: dup
    //   1127: iconst_3
    //   1128: aload #4
    //   1130: arraylength
    //   1131: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1134: aastore
    //   1135: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1138: pop
    //   1139: goto -> 1143
    //   1142: astore_3
    //   1143: iconst_0
    //   1144: istore_3
    //   1145: getstatic burp/Zs56.ZW : Ljava/lang/String;
    //   1148: getstatic burp/Ztg3.Zg : Ljava/lang/Object;
    //   1151: checkcast java/math/BigInteger
    //   1154: invokevirtual intValue : ()I
    //   1157: bipush #32
    //   1159: irem
    //   1160: invokestatic abs : (I)I
    //   1163: invokevirtual charAt : (I)C
    //   1166: getstatic burp/Zth8.ZN : Ljava/lang/String;
    //   1169: getstatic burp/Zej5.ZB : Ljava/lang/Object;
    //   1172: checkcast java/math/BigInteger
    //   1175: invokevirtual intValue : ()I
    //   1178: bipush #32
    //   1180: irem
    //   1181: invokestatic abs : (I)I
    //   1184: invokevirtual charAt : (I)C
    //   1187: if_icmpgt -> 1531
    //   1190: sipush #25805
    //   1193: sipush #-10375
    //   1196: invokestatic a : (II)Ljava/lang/String;
    //   1199: iconst_1
    //   1200: ldc burp/Zkbf
    //   1202: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1205: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1208: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1211: astore #4
    //   1213: aload #4
    //   1215: arraylength
    //   1216: istore #5
    //   1218: iconst_0
    //   1219: istore #6
    //   1221: iload #6
    //   1223: iload #5
    //   1225: if_icmpge -> 1363
    //   1228: aload #4
    //   1230: iload #6
    //   1232: aaload
    //   1233: astore #7
    //   1235: aload #7
    //   1237: invokevirtual getModifiers : ()I
    //   1240: invokestatic isStatic : (I)Z
    //   1243: ifne -> 1253
    //   1246: goto -> 1356
    //   1249: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1252: athrow
    //   1253: aload #7
    //   1255: invokevirtual getType : ()Ljava/lang/Class;
    //   1258: astore #8
    //   1260: aload #8
    //   1262: ifnull -> 1343
    //   1265: aload #8
    //   1267: invokevirtual isPrimitive : ()Z
    //   1270: ifne -> 1343
    //   1273: goto -> 1280
    //   1276: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1279: athrow
    //   1280: aload #8
    //   1282: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1285: ifnull -> 1343
    //   1288: goto -> 1295
    //   1291: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1294: athrow
    //   1295: aload #8
    //   1297: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1300: invokevirtual getName : ()Ljava/lang/String;
    //   1303: ifnull -> 1343
    //   1306: goto -> 1313
    //   1309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1312: athrow
    //   1313: aload #8
    //   1315: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1318: invokevirtual getName : ()Ljava/lang/String;
    //   1321: sipush #25796
    //   1324: sipush #23045
    //   1327: invokestatic a : (II)Ljava/lang/String;
    //   1330: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1333: ifne -> 1343
    //   1336: goto -> 1343
    //   1339: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1342: athrow
    //   1343: aload #7
    //   1345: iconst_1
    //   1346: invokevirtual setAccessible : (Z)V
    //   1349: aload #7
    //   1351: aconst_null
    //   1352: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1355: pop
    //   1356: iinc #6, 1
    //   1359: iload_2
    //   1360: ifne -> 1221
    //   1363: sipush #25816
    //   1366: sipush #17358
    //   1369: invokestatic a : (II)Ljava/lang/String;
    //   1372: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1375: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1378: astore #4
    //   1380: aload #4
    //   1382: arraylength
    //   1383: istore #5
    //   1385: iconst_0
    //   1386: istore #6
    //   1388: iload #6
    //   1390: iload #5
    //   1392: if_icmpge -> 1528
    //   1395: aload #4
    //   1397: iload #6
    //   1399: aaload
    //   1400: astore #7
    //   1402: aload #7
    //   1404: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1407: pop
    //   1408: aload #7
    //   1410: invokevirtual getModifiers : ()I
    //   1413: invokestatic isStatic : (I)Z
    //   1416: ifeq -> 1514
    //   1419: aload #7
    //   1421: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1424: arraylength
    //   1425: iconst_2
    //   1426: if_icmpne -> 1514
    //   1429: goto -> 1436
    //   1432: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1435: athrow
    //   1436: aload #7
    //   1438: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1441: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1444: if_acmpne -> 1514
    //   1447: goto -> 1454
    //   1450: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1453: athrow
    //   1454: aload #7
    //   1456: iconst_1
    //   1457: invokevirtual setAccessible : (Z)V
    //   1460: aload #7
    //   1462: aconst_null
    //   1463: iconst_2
    //   1464: anewarray java/lang/Object
    //   1467: dup
    //   1468: iconst_0
    //   1469: aload_0
    //   1470: aastore
    //   1471: dup
    //   1472: iconst_1
    //   1473: aload_1
    //   1474: ifnonnull -> 1492
    //   1477: goto -> 1484
    //   1480: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1483: athrow
    //   1484: aload_1
    //   1485: goto -> 1499
    //   1488: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1491: athrow
    //   1492: aload_1
    //   1493: checkcast [B
    //   1496: invokevirtual clone : ()Ljava/lang/Object;
    //   1499: aastore
    //   1500: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1503: checkcast java/lang/Boolean
    //   1506: invokevirtual booleanValue : ()Z
    //   1509: istore_3
    //   1510: iload_2
    //   1511: ifne -> 1528
    //   1514: iinc #6, 1
    //   1517: iload_2
    //   1518: ifne -> 1388
    //   1521: goto -> 1528
    //   1524: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1527: athrow
    //   1528: goto -> 1869
    //   1531: sipush #25800
    //   1534: sipush #-1202
    //   1537: invokestatic a : (II)Ljava/lang/String;
    //   1540: iconst_1
    //   1541: ldc burp/Zezz
    //   1543: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1546: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1549: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1552: astore #4
    //   1554: aload #4
    //   1556: arraylength
    //   1557: istore #5
    //   1559: iconst_0
    //   1560: istore #6
    //   1562: iload #6
    //   1564: iload #5
    //   1566: if_icmpge -> 1704
    //   1569: aload #4
    //   1571: iload #6
    //   1573: aaload
    //   1574: astore #7
    //   1576: aload #7
    //   1578: invokevirtual getModifiers : ()I
    //   1581: invokestatic isStatic : (I)Z
    //   1584: ifne -> 1594
    //   1587: goto -> 1697
    //   1590: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1593: athrow
    //   1594: aload #7
    //   1596: invokevirtual getType : ()Ljava/lang/Class;
    //   1599: astore #8
    //   1601: aload #8
    //   1603: ifnull -> 1684
    //   1606: aload #8
    //   1608: invokevirtual isPrimitive : ()Z
    //   1611: ifne -> 1684
    //   1614: goto -> 1621
    //   1617: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1620: athrow
    //   1621: aload #8
    //   1623: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1626: ifnull -> 1684
    //   1629: goto -> 1636
    //   1632: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1635: athrow
    //   1636: aload #8
    //   1638: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1641: invokevirtual getName : ()Ljava/lang/String;
    //   1644: ifnull -> 1684
    //   1647: goto -> 1654
    //   1650: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1653: athrow
    //   1654: aload #8
    //   1656: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1659: invokevirtual getName : ()Ljava/lang/String;
    //   1662: sipush #25796
    //   1665: sipush #23045
    //   1668: invokestatic a : (II)Ljava/lang/String;
    //   1671: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1674: ifne -> 1684
    //   1677: goto -> 1684
    //   1680: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1683: athrow
    //   1684: aload #7
    //   1686: iconst_1
    //   1687: invokevirtual setAccessible : (Z)V
    //   1690: aload #7
    //   1692: aconst_null
    //   1693: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1696: pop
    //   1697: iinc #6, 1
    //   1700: iload_2
    //   1701: ifne -> 1562
    //   1704: sipush #25812
    //   1707: sipush #-18753
    //   1710: invokestatic a : (II)Ljava/lang/String;
    //   1713: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1716: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1719: astore #4
    //   1721: aload #4
    //   1723: arraylength
    //   1724: istore #5
    //   1726: iconst_0
    //   1727: istore #6
    //   1729: iload #6
    //   1731: iload #5
    //   1733: if_icmpge -> 1869
    //   1736: aload #4
    //   1738: iload #6
    //   1740: aaload
    //   1741: astore #7
    //   1743: aload #7
    //   1745: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1748: pop
    //   1749: aload #7
    //   1751: invokevirtual getModifiers : ()I
    //   1754: invokestatic isStatic : (I)Z
    //   1757: ifeq -> 1855
    //   1760: aload #7
    //   1762: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1765: arraylength
    //   1766: iconst_2
    //   1767: if_icmpne -> 1855
    //   1770: goto -> 1777
    //   1773: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1776: athrow
    //   1777: aload #7
    //   1779: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1782: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1785: if_acmpne -> 1855
    //   1788: goto -> 1795
    //   1791: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1794: athrow
    //   1795: aload #7
    //   1797: iconst_1
    //   1798: invokevirtual setAccessible : (Z)V
    //   1801: aload #7
    //   1803: aconst_null
    //   1804: iconst_2
    //   1805: anewarray java/lang/Object
    //   1808: dup
    //   1809: iconst_0
    //   1810: aload_0
    //   1811: aastore
    //   1812: dup
    //   1813: iconst_1
    //   1814: aload_1
    //   1815: ifnonnull -> 1833
    //   1818: goto -> 1825
    //   1821: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1824: athrow
    //   1825: aload_1
    //   1826: goto -> 1840
    //   1829: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1832: athrow
    //   1833: aload_1
    //   1834: checkcast [B
    //   1837: invokevirtual clone : ()Ljava/lang/Object;
    //   1840: aastore
    //   1841: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1844: checkcast java/lang/Boolean
    //   1847: invokevirtual booleanValue : ()Z
    //   1850: istore_3
    //   1851: iload_2
    //   1852: ifne -> 1869
    //   1855: iinc #6, 1
    //   1858: iload_2
    //   1859: ifne -> 1729
    //   1862: goto -> 1869
    //   1865: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1868: athrow
    //   1869: iload_3
    //   1870: ifeq -> 1875
    //   1873: iload_3
    //   1874: ireturn
    //   1875: getstatic burp/Zbsc.Zp : Ljava/lang/String;
    //   1878: getstatic burp/Zza3.Zb : Ljava/lang/Object;
    //   1881: checkcast java/math/BigInteger
    //   1884: invokevirtual intValue : ()I
    //   1887: bipush #32
    //   1889: irem
    //   1890: invokestatic abs : (I)I
    //   1893: invokevirtual charAt : (I)C
    //   1896: getstatic burp/Zmly.Zi : Ljava/lang/String;
    //   1899: getstatic burp/Zkfb.ZN : Ljava/lang/Object;
    //   1902: checkcast java/math/BigInteger
    //   1905: invokevirtual intValue : ()I
    //   1908: bipush #32
    //   1910: irem
    //   1911: invokestatic abs : (I)I
    //   1914: invokevirtual charAt : (I)C
    //   1917: if_icmpgt -> 2262
    //   1920: sipush #25792
    //   1923: sipush #7798
    //   1926: invokestatic a : (II)Ljava/lang/String;
    //   1929: iconst_1
    //   1930: ldc burp/Zeyt
    //   1932: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1935: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1938: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1941: astore #4
    //   1943: aload #4
    //   1945: arraylength
    //   1946: istore #5
    //   1948: iconst_0
    //   1949: istore #6
    //   1951: iload #6
    //   1953: iload #5
    //   1955: if_icmpge -> 2093
    //   1958: aload #4
    //   1960: iload #6
    //   1962: aaload
    //   1963: astore #7
    //   1965: aload #7
    //   1967: invokevirtual getModifiers : ()I
    //   1970: invokestatic isStatic : (I)Z
    //   1973: ifne -> 1983
    //   1976: goto -> 2086
    //   1979: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1982: athrow
    //   1983: aload #7
    //   1985: invokevirtual getType : ()Ljava/lang/Class;
    //   1988: astore #8
    //   1990: aload #8
    //   1992: ifnull -> 2073
    //   1995: aload #8
    //   1997: invokevirtual isPrimitive : ()Z
    //   2000: ifne -> 2073
    //   2003: goto -> 2010
    //   2006: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2009: athrow
    //   2010: aload #8
    //   2012: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2015: ifnull -> 2073
    //   2018: goto -> 2025
    //   2021: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2024: athrow
    //   2025: aload #8
    //   2027: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2030: invokevirtual getName : ()Ljava/lang/String;
    //   2033: ifnull -> 2073
    //   2036: goto -> 2043
    //   2039: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2042: athrow
    //   2043: aload #8
    //   2045: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2048: invokevirtual getName : ()Ljava/lang/String;
    //   2051: sipush #25796
    //   2054: sipush #23045
    //   2057: invokestatic a : (II)Ljava/lang/String;
    //   2060: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2063: ifne -> 2073
    //   2066: goto -> 2073
    //   2069: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2072: athrow
    //   2073: aload #7
    //   2075: iconst_1
    //   2076: invokevirtual setAccessible : (Z)V
    //   2079: aload #7
    //   2081: aconst_null
    //   2082: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2085: pop
    //   2086: iinc #6, 1
    //   2089: iload_2
    //   2090: ifne -> 1951
    //   2093: sipush #25804
    //   2096: sipush #6008
    //   2099: invokestatic a : (II)Ljava/lang/String;
    //   2102: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2105: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2108: astore #4
    //   2110: aload #4
    //   2112: arraylength
    //   2113: istore #5
    //   2115: iconst_0
    //   2116: istore #6
    //   2118: iload #6
    //   2120: iload #5
    //   2122: if_icmpge -> 2258
    //   2125: aload #4
    //   2127: iload #6
    //   2129: aaload
    //   2130: astore #7
    //   2132: aload #7
    //   2134: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2137: pop
    //   2138: aload #7
    //   2140: invokevirtual getModifiers : ()I
    //   2143: invokestatic isStatic : (I)Z
    //   2146: ifeq -> 2244
    //   2149: aload #7
    //   2151: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2154: arraylength
    //   2155: iconst_2
    //   2156: if_icmpne -> 2244
    //   2159: goto -> 2166
    //   2162: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2165: athrow
    //   2166: aload #7
    //   2168: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2171: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2174: if_acmpne -> 2244
    //   2177: goto -> 2184
    //   2180: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2183: athrow
    //   2184: aload #7
    //   2186: iconst_1
    //   2187: invokevirtual setAccessible : (Z)V
    //   2190: aload #7
    //   2192: aconst_null
    //   2193: iconst_2
    //   2194: anewarray java/lang/Object
    //   2197: dup
    //   2198: iconst_0
    //   2199: aload_0
    //   2200: aastore
    //   2201: dup
    //   2202: iconst_1
    //   2203: aload_1
    //   2204: ifnonnull -> 2222
    //   2207: goto -> 2214
    //   2210: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2213: athrow
    //   2214: aload_1
    //   2215: goto -> 2229
    //   2218: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2221: athrow
    //   2222: aload_1
    //   2223: checkcast [B
    //   2226: invokevirtual clone : ()Ljava/lang/Object;
    //   2229: aastore
    //   2230: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2233: checkcast java/lang/Boolean
    //   2236: invokevirtual booleanValue : ()Z
    //   2239: istore_3
    //   2240: iload_2
    //   2241: ifne -> 2258
    //   2244: iinc #6, 1
    //   2247: iload_2
    //   2248: ifne -> 2118
    //   2251: goto -> 2258
    //   2254: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2257: athrow
    //   2258: iload_2
    //   2259: ifne -> 2600
    //   2262: sipush #25818
    //   2265: sipush #-26786
    //   2268: invokestatic a : (II)Ljava/lang/String;
    //   2271: iconst_1
    //   2272: ldc burp/Zeoa
    //   2274: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2277: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2280: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2283: astore #4
    //   2285: aload #4
    //   2287: arraylength
    //   2288: istore #5
    //   2290: iconst_0
    //   2291: istore #6
    //   2293: iload #6
    //   2295: iload #5
    //   2297: if_icmpge -> 2435
    //   2300: aload #4
    //   2302: iload #6
    //   2304: aaload
    //   2305: astore #7
    //   2307: aload #7
    //   2309: invokevirtual getModifiers : ()I
    //   2312: invokestatic isStatic : (I)Z
    //   2315: ifne -> 2325
    //   2318: goto -> 2428
    //   2321: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2324: athrow
    //   2325: aload #7
    //   2327: invokevirtual getType : ()Ljava/lang/Class;
    //   2330: astore #8
    //   2332: aload #8
    //   2334: ifnull -> 2415
    //   2337: aload #8
    //   2339: invokevirtual isPrimitive : ()Z
    //   2342: ifne -> 2415
    //   2345: goto -> 2352
    //   2348: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2351: athrow
    //   2352: aload #8
    //   2354: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2357: ifnull -> 2415
    //   2360: goto -> 2367
    //   2363: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2366: athrow
    //   2367: aload #8
    //   2369: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2372: invokevirtual getName : ()Ljava/lang/String;
    //   2375: ifnull -> 2415
    //   2378: goto -> 2385
    //   2381: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2384: athrow
    //   2385: aload #8
    //   2387: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2390: invokevirtual getName : ()Ljava/lang/String;
    //   2393: sipush #25796
    //   2396: sipush #23045
    //   2399: invokestatic a : (II)Ljava/lang/String;
    //   2402: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2405: ifne -> 2415
    //   2408: goto -> 2415
    //   2411: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2414: athrow
    //   2415: aload #7
    //   2417: iconst_1
    //   2418: invokevirtual setAccessible : (Z)V
    //   2421: aload #7
    //   2423: aconst_null
    //   2424: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2427: pop
    //   2428: iinc #6, 1
    //   2431: iload_2
    //   2432: ifne -> 2293
    //   2435: sipush #25797
    //   2438: sipush #15777
    //   2441: invokestatic a : (II)Ljava/lang/String;
    //   2444: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2447: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2450: astore #4
    //   2452: aload #4
    //   2454: arraylength
    //   2455: istore #5
    //   2457: iconst_0
    //   2458: istore #6
    //   2460: iload #6
    //   2462: iload #5
    //   2464: if_icmpge -> 2600
    //   2467: aload #4
    //   2469: iload #6
    //   2471: aaload
    //   2472: astore #7
    //   2474: aload #7
    //   2476: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2479: pop
    //   2480: aload #7
    //   2482: invokevirtual getModifiers : ()I
    //   2485: invokestatic isStatic : (I)Z
    //   2488: ifeq -> 2586
    //   2491: aload #7
    //   2493: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2496: arraylength
    //   2497: iconst_2
    //   2498: if_icmpne -> 2586
    //   2501: goto -> 2508
    //   2504: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2507: athrow
    //   2508: aload #7
    //   2510: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2513: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2516: if_acmpne -> 2586
    //   2519: goto -> 2526
    //   2522: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2525: athrow
    //   2526: aload #7
    //   2528: iconst_1
    //   2529: invokevirtual setAccessible : (Z)V
    //   2532: aload #7
    //   2534: aconst_null
    //   2535: iconst_2
    //   2536: anewarray java/lang/Object
    //   2539: dup
    //   2540: iconst_0
    //   2541: aload_0
    //   2542: aastore
    //   2543: dup
    //   2544: iconst_1
    //   2545: aload_1
    //   2546: ifnonnull -> 2564
    //   2549: goto -> 2556
    //   2552: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2555: athrow
    //   2556: aload_1
    //   2557: goto -> 2571
    //   2560: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2563: athrow
    //   2564: aload_1
    //   2565: checkcast [B
    //   2568: invokevirtual clone : ()Ljava/lang/Object;
    //   2571: aastore
    //   2572: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2575: checkcast java/lang/Boolean
    //   2578: invokevirtual booleanValue : ()Z
    //   2581: istore_3
    //   2582: iload_2
    //   2583: ifne -> 2600
    //   2586: iinc #6, 1
    //   2589: iload_2
    //   2590: ifne -> 2460
    //   2593: goto -> 2600
    //   2596: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2599: athrow
    //   2600: iload_3
    //   2601: ifeq -> 2606
    //   2604: iload_3
    //   2605: ireturn
    //   2606: getstatic burp/Zgs6.ZD : Ljava/lang/String;
    //   2609: getstatic burp/Ztsc.Zr : Ljava/lang/Object;
    //   2612: checkcast java/math/BigInteger
    //   2615: invokevirtual intValue : ()I
    //   2618: bipush #32
    //   2620: irem
    //   2621: invokestatic abs : (I)I
    //   2624: invokevirtual charAt : (I)C
    //   2627: getstatic burp/Zl8s.Zn : Ljava/lang/String;
    //   2630: getstatic burp/Zenq.Zd : Ljava/lang/Object;
    //   2633: checkcast java/math/BigInteger
    //   2636: invokevirtual intValue : ()I
    //   2639: bipush #32
    //   2641: irem
    //   2642: invokestatic abs : (I)I
    //   2645: invokevirtual charAt : (I)C
    //   2648: if_icmple -> 2993
    //   2651: sipush #25823
    //   2654: sipush #-5883
    //   2657: invokestatic a : (II)Ljava/lang/String;
    //   2660: iconst_1
    //   2661: ldc burp/Zt5a
    //   2663: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2666: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2669: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2672: astore #4
    //   2674: aload #4
    //   2676: arraylength
    //   2677: istore #5
    //   2679: iconst_0
    //   2680: istore #6
    //   2682: iload #6
    //   2684: iload #5
    //   2686: if_icmpge -> 2824
    //   2689: aload #4
    //   2691: iload #6
    //   2693: aaload
    //   2694: astore #7
    //   2696: aload #7
    //   2698: invokevirtual getModifiers : ()I
    //   2701: invokestatic isStatic : (I)Z
    //   2704: ifne -> 2714
    //   2707: goto -> 2817
    //   2710: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2713: athrow
    //   2714: aload #7
    //   2716: invokevirtual getType : ()Ljava/lang/Class;
    //   2719: astore #8
    //   2721: aload #8
    //   2723: ifnull -> 2804
    //   2726: aload #8
    //   2728: invokevirtual isPrimitive : ()Z
    //   2731: ifne -> 2804
    //   2734: goto -> 2741
    //   2737: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2740: athrow
    //   2741: aload #8
    //   2743: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2746: ifnull -> 2804
    //   2749: goto -> 2756
    //   2752: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2755: athrow
    //   2756: aload #8
    //   2758: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2761: invokevirtual getName : ()Ljava/lang/String;
    //   2764: ifnull -> 2804
    //   2767: goto -> 2774
    //   2770: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2773: athrow
    //   2774: aload #8
    //   2776: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2779: invokevirtual getName : ()Ljava/lang/String;
    //   2782: sipush #25796
    //   2785: sipush #23045
    //   2788: invokestatic a : (II)Ljava/lang/String;
    //   2791: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2794: ifne -> 2804
    //   2797: goto -> 2804
    //   2800: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2803: athrow
    //   2804: aload #7
    //   2806: iconst_1
    //   2807: invokevirtual setAccessible : (Z)V
    //   2810: aload #7
    //   2812: aconst_null
    //   2813: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2816: pop
    //   2817: iinc #6, 1
    //   2820: iload_2
    //   2821: ifne -> 2682
    //   2824: sipush #25798
    //   2827: sipush #-6233
    //   2830: invokestatic a : (II)Ljava/lang/String;
    //   2833: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2836: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2839: astore #4
    //   2841: aload #4
    //   2843: arraylength
    //   2844: istore #5
    //   2846: iconst_0
    //   2847: istore #6
    //   2849: iload #6
    //   2851: iload #5
    //   2853: if_icmpge -> 2989
    //   2856: aload #4
    //   2858: iload #6
    //   2860: aaload
    //   2861: astore #7
    //   2863: aload #7
    //   2865: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2868: pop
    //   2869: aload #7
    //   2871: invokevirtual getModifiers : ()I
    //   2874: invokestatic isStatic : (I)Z
    //   2877: ifeq -> 2975
    //   2880: aload #7
    //   2882: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2885: arraylength
    //   2886: iconst_2
    //   2887: if_icmpne -> 2975
    //   2890: goto -> 2897
    //   2893: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2896: athrow
    //   2897: aload #7
    //   2899: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2902: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2905: if_acmpne -> 2975
    //   2908: goto -> 2915
    //   2911: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2914: athrow
    //   2915: aload #7
    //   2917: iconst_1
    //   2918: invokevirtual setAccessible : (Z)V
    //   2921: aload #7
    //   2923: aconst_null
    //   2924: iconst_2
    //   2925: anewarray java/lang/Object
    //   2928: dup
    //   2929: iconst_0
    //   2930: aload_0
    //   2931: aastore
    //   2932: dup
    //   2933: iconst_1
    //   2934: aload_1
    //   2935: ifnonnull -> 2953
    //   2938: goto -> 2945
    //   2941: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2944: athrow
    //   2945: aload_1
    //   2946: goto -> 2960
    //   2949: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2952: athrow
    //   2953: aload_1
    //   2954: checkcast [B
    //   2957: invokevirtual clone : ()Ljava/lang/Object;
    //   2960: aastore
    //   2961: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2964: checkcast java/lang/Boolean
    //   2967: invokevirtual booleanValue : ()Z
    //   2970: istore_3
    //   2971: iload_2
    //   2972: ifne -> 2989
    //   2975: iinc #6, 1
    //   2978: iload_2
    //   2979: ifne -> 2849
    //   2982: goto -> 2989
    //   2985: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2988: athrow
    //   2989: iload_2
    //   2990: ifne -> 3331
    //   2993: sipush #25802
    //   2996: sipush #-21819
    //   2999: invokestatic a : (II)Ljava/lang/String;
    //   3002: iconst_1
    //   3003: ldc burp/Zlbd
    //   3005: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3008: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3011: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3014: astore #4
    //   3016: aload #4
    //   3018: arraylength
    //   3019: istore #5
    //   3021: iconst_0
    //   3022: istore #6
    //   3024: iload #6
    //   3026: iload #5
    //   3028: if_icmpge -> 3166
    //   3031: aload #4
    //   3033: iload #6
    //   3035: aaload
    //   3036: astore #7
    //   3038: aload #7
    //   3040: invokevirtual getModifiers : ()I
    //   3043: invokestatic isStatic : (I)Z
    //   3046: ifne -> 3056
    //   3049: goto -> 3159
    //   3052: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3055: athrow
    //   3056: aload #7
    //   3058: invokevirtual getType : ()Ljava/lang/Class;
    //   3061: astore #8
    //   3063: aload #8
    //   3065: ifnull -> 3146
    //   3068: aload #8
    //   3070: invokevirtual isPrimitive : ()Z
    //   3073: ifne -> 3146
    //   3076: goto -> 3083
    //   3079: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3082: athrow
    //   3083: aload #8
    //   3085: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3088: ifnull -> 3146
    //   3091: goto -> 3098
    //   3094: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3097: athrow
    //   3098: aload #8
    //   3100: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3103: invokevirtual getName : ()Ljava/lang/String;
    //   3106: ifnull -> 3146
    //   3109: goto -> 3116
    //   3112: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3115: athrow
    //   3116: aload #8
    //   3118: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3121: invokevirtual getName : ()Ljava/lang/String;
    //   3124: sipush #25796
    //   3127: sipush #23045
    //   3130: invokestatic a : (II)Ljava/lang/String;
    //   3133: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3136: ifne -> 3146
    //   3139: goto -> 3146
    //   3142: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3145: athrow
    //   3146: aload #7
    //   3148: iconst_1
    //   3149: invokevirtual setAccessible : (Z)V
    //   3152: aload #7
    //   3154: aconst_null
    //   3155: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3158: pop
    //   3159: iinc #6, 1
    //   3162: iload_2
    //   3163: ifne -> 3024
    //   3166: sipush #25795
    //   3169: sipush #-31904
    //   3172: invokestatic a : (II)Ljava/lang/String;
    //   3175: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3178: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3181: astore #4
    //   3183: aload #4
    //   3185: arraylength
    //   3186: istore #5
    //   3188: iconst_0
    //   3189: istore #6
    //   3191: iload #6
    //   3193: iload #5
    //   3195: if_icmpge -> 3331
    //   3198: aload #4
    //   3200: iload #6
    //   3202: aaload
    //   3203: astore #7
    //   3205: aload #7
    //   3207: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3210: pop
    //   3211: aload #7
    //   3213: invokevirtual getModifiers : ()I
    //   3216: invokestatic isStatic : (I)Z
    //   3219: ifeq -> 3317
    //   3222: aload #7
    //   3224: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3227: arraylength
    //   3228: iconst_2
    //   3229: if_icmpne -> 3317
    //   3232: goto -> 3239
    //   3235: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3238: athrow
    //   3239: aload #7
    //   3241: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3244: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3247: if_acmpne -> 3317
    //   3250: goto -> 3257
    //   3253: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3256: athrow
    //   3257: aload #7
    //   3259: iconst_1
    //   3260: invokevirtual setAccessible : (Z)V
    //   3263: aload #7
    //   3265: aconst_null
    //   3266: iconst_2
    //   3267: anewarray java/lang/Object
    //   3270: dup
    //   3271: iconst_0
    //   3272: aload_0
    //   3273: aastore
    //   3274: dup
    //   3275: iconst_1
    //   3276: aload_1
    //   3277: ifnonnull -> 3295
    //   3280: goto -> 3287
    //   3283: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3286: athrow
    //   3287: aload_1
    //   3288: goto -> 3302
    //   3291: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3294: athrow
    //   3295: aload_1
    //   3296: checkcast [B
    //   3299: invokevirtual clone : ()Ljava/lang/Object;
    //   3302: aastore
    //   3303: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3306: checkcast java/lang/Boolean
    //   3309: invokevirtual booleanValue : ()Z
    //   3312: istore_3
    //   3313: iload_2
    //   3314: ifne -> 3331
    //   3317: iinc #6, 1
    //   3320: iload_2
    //   3321: ifne -> 3191
    //   3324: goto -> 3331
    //   3327: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3330: athrow
    //   3331: iload_3
    //   3332: ifeq -> 3337
    //   3335: iload_3
    //   3336: ireturn
    //   3337: getstatic burp/Zbzj.Zw : Ljava/lang/String;
    //   3340: getstatic burp/Zza3.Zb : Ljava/lang/Object;
    //   3343: checkcast java/math/BigInteger
    //   3346: invokevirtual intValue : ()I
    //   3349: bipush #32
    //   3351: irem
    //   3352: invokestatic abs : (I)I
    //   3355: invokevirtual charAt : (I)C
    //   3358: getstatic burp/Zrh1.Zg : Ljava/lang/String;
    //   3361: getstatic burp/Zeju.Zk : Ljava/lang/Object;
    //   3364: checkcast java/math/BigInteger
    //   3367: invokevirtual intValue : ()I
    //   3370: bipush #32
    //   3372: irem
    //   3373: invokestatic abs : (I)I
    //   3376: invokevirtual charAt : (I)C
    //   3379: if_icmple -> 3724
    //   3382: sipush #25799
    //   3385: sipush #3208
    //   3388: invokestatic a : (II)Ljava/lang/String;
    //   3391: iconst_1
    //   3392: ldc burp/Zz0
    //   3394: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3397: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3400: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3403: astore #4
    //   3405: aload #4
    //   3407: arraylength
    //   3408: istore #5
    //   3410: iconst_0
    //   3411: istore #6
    //   3413: iload #6
    //   3415: iload #5
    //   3417: if_icmpge -> 3555
    //   3420: aload #4
    //   3422: iload #6
    //   3424: aaload
    //   3425: astore #7
    //   3427: aload #7
    //   3429: invokevirtual getModifiers : ()I
    //   3432: invokestatic isStatic : (I)Z
    //   3435: ifne -> 3445
    //   3438: goto -> 3548
    //   3441: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3444: athrow
    //   3445: aload #7
    //   3447: invokevirtual getType : ()Ljava/lang/Class;
    //   3450: astore #8
    //   3452: aload #8
    //   3454: ifnull -> 3535
    //   3457: aload #8
    //   3459: invokevirtual isPrimitive : ()Z
    //   3462: ifne -> 3535
    //   3465: goto -> 3472
    //   3468: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3471: athrow
    //   3472: aload #8
    //   3474: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3477: ifnull -> 3535
    //   3480: goto -> 3487
    //   3483: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3486: athrow
    //   3487: aload #8
    //   3489: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3492: invokevirtual getName : ()Ljava/lang/String;
    //   3495: ifnull -> 3535
    //   3498: goto -> 3505
    //   3501: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3504: athrow
    //   3505: aload #8
    //   3507: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3510: invokevirtual getName : ()Ljava/lang/String;
    //   3513: sipush #25796
    //   3516: sipush #23045
    //   3519: invokestatic a : (II)Ljava/lang/String;
    //   3522: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3525: ifne -> 3535
    //   3528: goto -> 3535
    //   3531: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3534: athrow
    //   3535: aload #7
    //   3537: iconst_1
    //   3538: invokevirtual setAccessible : (Z)V
    //   3541: aload #7
    //   3543: aconst_null
    //   3544: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3547: pop
    //   3548: iinc #6, 1
    //   3551: iload_2
    //   3552: ifne -> 3413
    //   3555: sipush #25820
    //   3558: sipush #-25250
    //   3561: invokestatic a : (II)Ljava/lang/String;
    //   3564: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3567: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3570: astore #4
    //   3572: aload #4
    //   3574: arraylength
    //   3575: istore #5
    //   3577: iconst_0
    //   3578: istore #6
    //   3580: iload #6
    //   3582: iload #5
    //   3584: if_icmpge -> 3720
    //   3587: aload #4
    //   3589: iload #6
    //   3591: aaload
    //   3592: astore #7
    //   3594: aload #7
    //   3596: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3599: pop
    //   3600: aload #7
    //   3602: invokevirtual getModifiers : ()I
    //   3605: invokestatic isStatic : (I)Z
    //   3608: ifeq -> 3706
    //   3611: aload #7
    //   3613: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3616: arraylength
    //   3617: iconst_2
    //   3618: if_icmpne -> 3706
    //   3621: goto -> 3628
    //   3624: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3627: athrow
    //   3628: aload #7
    //   3630: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3633: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3636: if_acmpne -> 3706
    //   3639: goto -> 3646
    //   3642: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3645: athrow
    //   3646: aload #7
    //   3648: iconst_1
    //   3649: invokevirtual setAccessible : (Z)V
    //   3652: aload #7
    //   3654: aconst_null
    //   3655: iconst_2
    //   3656: anewarray java/lang/Object
    //   3659: dup
    //   3660: iconst_0
    //   3661: aload_0
    //   3662: aastore
    //   3663: dup
    //   3664: iconst_1
    //   3665: aload_1
    //   3666: ifnonnull -> 3684
    //   3669: goto -> 3676
    //   3672: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3675: athrow
    //   3676: aload_1
    //   3677: goto -> 3691
    //   3680: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3683: athrow
    //   3684: aload_1
    //   3685: checkcast [B
    //   3688: invokevirtual clone : ()Ljava/lang/Object;
    //   3691: aastore
    //   3692: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3695: checkcast java/lang/Boolean
    //   3698: invokevirtual booleanValue : ()Z
    //   3701: istore_3
    //   3702: iload_2
    //   3703: ifne -> 3720
    //   3706: iinc #6, 1
    //   3709: iload_2
    //   3710: ifne -> 3580
    //   3713: goto -> 3720
    //   3716: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3719: athrow
    //   3720: iload_2
    //   3721: ifne -> 4062
    //   3724: sipush #25806
    //   3727: sipush #27621
    //   3730: invokestatic a : (II)Ljava/lang/String;
    //   3733: iconst_1
    //   3734: ldc burp/Zx_u
    //   3736: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3739: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3742: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3745: astore #4
    //   3747: aload #4
    //   3749: arraylength
    //   3750: istore #5
    //   3752: iconst_0
    //   3753: istore #6
    //   3755: iload #6
    //   3757: iload #5
    //   3759: if_icmpge -> 3897
    //   3762: aload #4
    //   3764: iload #6
    //   3766: aaload
    //   3767: astore #7
    //   3769: aload #7
    //   3771: invokevirtual getModifiers : ()I
    //   3774: invokestatic isStatic : (I)Z
    //   3777: ifne -> 3787
    //   3780: goto -> 3890
    //   3783: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3786: athrow
    //   3787: aload #7
    //   3789: invokevirtual getType : ()Ljava/lang/Class;
    //   3792: astore #8
    //   3794: aload #8
    //   3796: ifnull -> 3877
    //   3799: aload #8
    //   3801: invokevirtual isPrimitive : ()Z
    //   3804: ifne -> 3877
    //   3807: goto -> 3814
    //   3810: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3813: athrow
    //   3814: aload #8
    //   3816: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3819: ifnull -> 3877
    //   3822: goto -> 3829
    //   3825: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3828: athrow
    //   3829: aload #8
    //   3831: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3834: invokevirtual getName : ()Ljava/lang/String;
    //   3837: ifnull -> 3877
    //   3840: goto -> 3847
    //   3843: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3846: athrow
    //   3847: aload #8
    //   3849: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3852: invokevirtual getName : ()Ljava/lang/String;
    //   3855: sipush #25796
    //   3858: sipush #23045
    //   3861: invokestatic a : (II)Ljava/lang/String;
    //   3864: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3867: ifne -> 3877
    //   3870: goto -> 3877
    //   3873: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3876: athrow
    //   3877: aload #7
    //   3879: iconst_1
    //   3880: invokevirtual setAccessible : (Z)V
    //   3883: aload #7
    //   3885: aconst_null
    //   3886: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3889: pop
    //   3890: iinc #6, 1
    //   3893: iload_2
    //   3894: ifne -> 3755
    //   3897: sipush #25793
    //   3900: sipush #-13151
    //   3903: invokestatic a : (II)Ljava/lang/String;
    //   3906: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3909: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3912: astore #4
    //   3914: aload #4
    //   3916: arraylength
    //   3917: istore #5
    //   3919: iconst_0
    //   3920: istore #6
    //   3922: iload #6
    //   3924: iload #5
    //   3926: if_icmpge -> 4062
    //   3929: aload #4
    //   3931: iload #6
    //   3933: aaload
    //   3934: astore #7
    //   3936: aload #7
    //   3938: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3941: pop
    //   3942: aload #7
    //   3944: invokevirtual getModifiers : ()I
    //   3947: invokestatic isStatic : (I)Z
    //   3950: ifeq -> 4048
    //   3953: aload #7
    //   3955: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3958: arraylength
    //   3959: iconst_2
    //   3960: if_icmpne -> 4048
    //   3963: goto -> 3970
    //   3966: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3969: athrow
    //   3970: aload #7
    //   3972: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3975: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3978: if_acmpne -> 4048
    //   3981: goto -> 3988
    //   3984: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3987: athrow
    //   3988: aload #7
    //   3990: iconst_1
    //   3991: invokevirtual setAccessible : (Z)V
    //   3994: aload #7
    //   3996: aconst_null
    //   3997: iconst_2
    //   3998: anewarray java/lang/Object
    //   4001: dup
    //   4002: iconst_0
    //   4003: aload_0
    //   4004: aastore
    //   4005: dup
    //   4006: iconst_1
    //   4007: aload_1
    //   4008: ifnonnull -> 4026
    //   4011: goto -> 4018
    //   4014: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4017: athrow
    //   4018: aload_1
    //   4019: goto -> 4033
    //   4022: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4025: athrow
    //   4026: aload_1
    //   4027: checkcast [B
    //   4030: invokevirtual clone : ()Ljava/lang/Object;
    //   4033: aastore
    //   4034: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4037: checkcast java/lang/Boolean
    //   4040: invokevirtual booleanValue : ()Z
    //   4043: istore_3
    //   4044: iload_2
    //   4045: ifne -> 4062
    //   4048: iinc #6, 1
    //   4051: iload_2
    //   4052: ifne -> 3922
    //   4055: goto -> 4062
    //   4058: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4061: athrow
    //   4062: iload_3
    //   4063: ireturn
    //   4064: astore_3
    //   4065: new java/lang/Exception
    //   4068: dup
    //   4069: aload_3
    //   4070: invokevirtual getMessage : ()Ljava/lang/String;
    //   4073: invokespecial <init> : (Ljava/lang/String;)V
    //   4076: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1874	4064	java/lang/Throwable
    //   115	129	129	java/lang/Throwable
    //   140	153	156	java/lang/Throwable
    //   145	168	171	java/lang/Throwable
    //   160	186	189	java/lang/Throwable
    //   175	216	219	java/lang/Throwable
    //   279	306	309	java/lang/Throwable
    //   296	327	330	java/lang/Throwable
    //   313	357	360	java/lang/Throwable
    //   334	368	368	java/lang/Throwable
    //   379	395	398	java/lang/Throwable
    //   589	617	620	java/lang/Throwable
    //   599	634	637	java/lang/Throwable
    //   624	662	665	java/lang/Throwable
    //   641	679	682	java/lang/Throwable
    //   669	707	710	java/lang/Throwable
    //   686	724	727	java/lang/Throwable
    //   714	742	745	java/lang/Throwable
    //   731	756	759	java/lang/Throwable
    //   802	1139	1142	java/lang/Throwable
    //   973	983	983	java/lang/Throwable
    //   987	999	999	java/lang/Throwable
    //   1003	1015	1015	java/lang/Throwable
    //   1019	1032	1032	java/lang/Throwable
    //   1036	1049	1049	java/lang/Throwable
    //   1235	1249	1249	java/lang/Throwable
    //   1260	1273	1276	java/lang/Throwable
    //   1265	1288	1291	java/lang/Throwable
    //   1280	1306	1309	java/lang/Throwable
    //   1295	1336	1339	java/lang/Throwable
    //   1402	1429	1432	java/lang/Throwable
    //   1419	1447	1450	java/lang/Throwable
    //   1436	1477	1480	java/lang/Throwable
    //   1454	1488	1488	java/lang/Throwable
    //   1510	1521	1524	java/lang/Throwable
    //   1576	1590	1590	java/lang/Throwable
    //   1601	1614	1617	java/lang/Throwable
    //   1606	1629	1632	java/lang/Throwable
    //   1621	1647	1650	java/lang/Throwable
    //   1636	1677	1680	java/lang/Throwable
    //   1743	1770	1773	java/lang/Throwable
    //   1760	1788	1791	java/lang/Throwable
    //   1777	1818	1821	java/lang/Throwable
    //   1795	1829	1829	java/lang/Throwable
    //   1851	1862	1865	java/lang/Throwable
    //   1875	2605	4064	java/lang/Throwable
    //   1965	1979	1979	java/lang/Throwable
    //   1990	2003	2006	java/lang/Throwable
    //   1995	2018	2021	java/lang/Throwable
    //   2010	2036	2039	java/lang/Throwable
    //   2025	2066	2069	java/lang/Throwable
    //   2132	2159	2162	java/lang/Throwable
    //   2149	2177	2180	java/lang/Throwable
    //   2166	2207	2210	java/lang/Throwable
    //   2184	2218	2218	java/lang/Throwable
    //   2240	2251	2254	java/lang/Throwable
    //   2307	2321	2321	java/lang/Throwable
    //   2332	2345	2348	java/lang/Throwable
    //   2337	2360	2363	java/lang/Throwable
    //   2352	2378	2381	java/lang/Throwable
    //   2367	2408	2411	java/lang/Throwable
    //   2474	2501	2504	java/lang/Throwable
    //   2491	2519	2522	java/lang/Throwable
    //   2508	2549	2552	java/lang/Throwable
    //   2526	2560	2560	java/lang/Throwable
    //   2582	2593	2596	java/lang/Throwable
    //   2606	3336	4064	java/lang/Throwable
    //   2696	2710	2710	java/lang/Throwable
    //   2721	2734	2737	java/lang/Throwable
    //   2726	2749	2752	java/lang/Throwable
    //   2741	2767	2770	java/lang/Throwable
    //   2756	2797	2800	java/lang/Throwable
    //   2863	2890	2893	java/lang/Throwable
    //   2880	2908	2911	java/lang/Throwable
    //   2897	2938	2941	java/lang/Throwable
    //   2915	2949	2949	java/lang/Throwable
    //   2971	2982	2985	java/lang/Throwable
    //   3038	3052	3052	java/lang/Throwable
    //   3063	3076	3079	java/lang/Throwable
    //   3068	3091	3094	java/lang/Throwable
    //   3083	3109	3112	java/lang/Throwable
    //   3098	3139	3142	java/lang/Throwable
    //   3205	3232	3235	java/lang/Throwable
    //   3222	3250	3253	java/lang/Throwable
    //   3239	3280	3283	java/lang/Throwable
    //   3257	3291	3291	java/lang/Throwable
    //   3313	3324	3327	java/lang/Throwable
    //   3337	4063	4064	java/lang/Throwable
    //   3427	3441	3441	java/lang/Throwable
    //   3452	3465	3468	java/lang/Throwable
    //   3457	3480	3483	java/lang/Throwable
    //   3472	3498	3501	java/lang/Throwable
    //   3487	3528	3531	java/lang/Throwable
    //   3594	3621	3624	java/lang/Throwable
    //   3611	3639	3642	java/lang/Throwable
    //   3628	3669	3672	java/lang/Throwable
    //   3646	3680	3680	java/lang/Throwable
    //   3702	3713	3716	java/lang/Throwable
    //   3769	3783	3783	java/lang/Throwable
    //   3794	3807	3810	java/lang/Throwable
    //   3799	3822	3825	java/lang/Throwable
    //   3814	3840	3843	java/lang/Throwable
    //   3829	3870	3873	java/lang/Throwable
    //   3936	3963	3966	java/lang/Throwable
    //   3953	3981	3984	java/lang/Throwable
    //   3970	4011	4014	java/lang/Throwable
    //   3988	4022	4022	java/lang/Throwable
    //   4044	4055	4058	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÓAu ]¿k.k\\b¶¬ÙÈ=Úà\\t¢l\~0Þ²\\tã¼td5\q\\tþ/×AæF¬]$:cyñHXÜÀ£Ås­\\tÐe¤Q/ú=O öb=S³ÑêSiñGBîhBÛ5¿låÐAq`½(\\r\\tmµ¢¾§l-K\\twãátÏ5,ugù60Î\\tÑU5¢UïulMáäË0|²v@üÐ:Óôác/8Iî´a¬ôàôMÑ½NÝ¨®`tÂ\\bÅirË±!´ÐøI½p¿µ¦khîíÀê­¢ ¶\%\\tüèá¦ã\\ttÃª¹\\tÑä5U)z¶D òi1T´BV^ÎMH²F*mç+&³Ð#\¿?\\tùÅ0°õ­gs×\\tsªa]ß.Ñ'Ïô$¡\\rµ¤w\\t\\t@8¼½\\t ½¿LZ\\t{è`ÿ5éã\\tJF;¸°Öä\\t/ê(®¾ü\\tïÊâm\\t7éÊÎâ\\t1'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #15
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
    //   68: ldc '\\b^Ø\\tKÏ1ZÍÂ= '
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #29
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
    //   128: putstatic burp/Zl6z.a : [Ljava/lang/String;
    //   131: bipush #29
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zl6z.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #125
    //   214: goto -> 243
    //   217: bipush #114
    //   219: goto -> 243
    //   222: bipush #18
    //   224: goto -> 243
    //   227: iconst_3
    //   228: goto -> 243
    //   231: bipush #77
    //   233: goto -> 243
    //   236: bipush #17
    //   238: goto -> 243
    //   241: bipush #30
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 98
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #61
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-29
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #-62
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #107
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #105
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #-69
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #-12
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #-98
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #-122
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #33
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #55
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #-109
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #44
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #14
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #20
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #-54
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #-53
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #64
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #34
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #-42
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #60
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #-15
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #-92
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #31
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #20
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #-59
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #-21
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #-9
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #19
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #72
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #26
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #-82
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Zl6z.Zt : Ljava/lang/Object;
    //   501: sipush #25801
    //   504: sipush #28149
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Zl6z.ZL : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x64CE) & 0xFFFF;
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
      char c = 'ú';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl6z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */