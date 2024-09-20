package burp;

import java.math.BigInteger;

class Zs8s extends ClassLoader {
  static String Za;
  
  static Object ZG;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZO(Object paramObject) {
    Ztsu.ZE = a(-30771, -26965);
    Ztsu.Zr = new BigInteger(a(-30774, 26990));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Ze_t.ZZ.charAt(Math.abs(((BigInteger)Zbzk.ZI).intValue() % 32)) <= Zs34.Zq.charAt(Math.abs(((BigInteger)Ztcv.ZY).intValue() % 32))) {
          try {
            Zmr7.ZW(Class.forName(a(-30769, -32022)));
            if (!bool)
              Zkff.ZL(Class.forName(a(-30775, 23144))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zkff.ZL(Class.forName(a(-30775, 23144)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zr(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zkll.Zl : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zs4z.Ze : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Ze69.ZH : Ljava/lang/Object;
    //   22: getstatic burp/Zxzz.ZM : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: getstatic burp/Zm8v.ZU : Ljava/lang/Object;
    //   31: checkcast java/math/BigInteger
    //   34: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   37: putstatic burp/Zs_3.ZZ : Ljava/lang/Object;
    //   40: getstatic burp/Zsxo.Za : Ljava/lang/Object;
    //   43: checkcast java/math/BigInteger
    //   46: invokevirtual toByteArray : ()[B
    //   49: astore_3
    //   50: iconst_0
    //   51: istore #5
    //   53: iconst_0
    //   54: istore #6
    //   56: iload #6
    //   58: aload_3
    //   59: arraylength
    //   60: if_icmpge -> 205
    //   63: aload_3
    //   64: iload #6
    //   66: baload
    //   67: istore #7
    //   69: iload #7
    //   71: bipush #48
    //   73: if_icmplt -> 90
    //   76: iload #7
    //   78: bipush #57
    //   80: if_icmple -> 188
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   89: athrow
    //   90: iload #7
    //   92: bipush #65
    //   94: if_icmplt -> 118
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   103: athrow
    //   104: iload #7
    //   106: bipush #90
    //   108: if_icmple -> 188
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   117: athrow
    //   118: iload #7
    //   120: bipush #97
    //   122: if_icmplt -> 146
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   131: athrow
    //   132: iload #7
    //   134: bipush #122
    //   136: if_icmple -> 188
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   145: athrow
    //   146: iload #7
    //   148: bipush #43
    //   150: if_icmpeq -> 188
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   159: athrow
    //   160: iload #7
    //   162: bipush #47
    //   164: if_icmpeq -> 188
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   173: athrow
    //   174: iload #7
    //   176: bipush #61
    //   178: if_icmpne -> 198
    //   181: goto -> 188
    //   184: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   187: athrow
    //   188: iinc #5, 1
    //   191: goto -> 198
    //   194: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   197: athrow
    //   198: iinc #6, 1
    //   201: iload_2
    //   202: ifeq -> 56
    //   205: iload #5
    //   207: newarray byte
    //   209: astore #6
    //   211: iconst_0
    //   212: istore #7
    //   214: iconst_0
    //   215: istore #8
    //   217: iload #8
    //   219: aload_3
    //   220: arraylength
    //   221: if_icmpge -> 373
    //   224: aload_3
    //   225: iload #8
    //   227: baload
    //   228: istore #9
    //   230: iload #9
    //   232: bipush #48
    //   234: if_icmplt -> 251
    //   237: iload #9
    //   239: bipush #57
    //   241: if_icmple -> 349
    //   244: goto -> 251
    //   247: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   250: athrow
    //   251: iload #9
    //   253: bipush #65
    //   255: if_icmplt -> 279
    //   258: goto -> 265
    //   261: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   264: athrow
    //   265: iload #9
    //   267: bipush #90
    //   269: if_icmple -> 349
    //   272: goto -> 279
    //   275: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   278: athrow
    //   279: iload #9
    //   281: bipush #97
    //   283: if_icmplt -> 307
    //   286: goto -> 293
    //   289: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   292: athrow
    //   293: iload #9
    //   295: bipush #122
    //   297: if_icmple -> 349
    //   300: goto -> 307
    //   303: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   306: athrow
    //   307: iload #9
    //   309: bipush #43
    //   311: if_icmpeq -> 349
    //   314: goto -> 321
    //   317: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   320: athrow
    //   321: iload #9
    //   323: bipush #47
    //   325: if_icmpeq -> 349
    //   328: goto -> 335
    //   331: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   334: athrow
    //   335: iload #9
    //   337: bipush #61
    //   339: if_icmpne -> 366
    //   342: goto -> 349
    //   345: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   348: athrow
    //   349: aload #6
    //   351: iload #7
    //   353: iload #9
    //   355: bastore
    //   356: iinc #7, 1
    //   359: goto -> 366
    //   362: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   365: athrow
    //   366: iinc #8, 1
    //   369: iload_2
    //   370: ifeq -> 217
    //   373: aload #6
    //   375: astore #4
    //   377: aload #4
    //   379: astore_3
    //   380: aload_3
    //   381: arraylength
    //   382: istore #5
    //   384: aload_3
    //   385: iload #5
    //   387: iconst_1
    //   388: isub
    //   389: baload
    //   390: bipush #61
    //   392: if_icmpne -> 402
    //   395: iinc #5, -1
    //   398: iload_2
    //   399: ifeq -> 384
    //   402: iload #5
    //   404: aload_3
    //   405: arraylength
    //   406: iconst_4
    //   407: idiv
    //   408: isub
    //   409: newarray byte
    //   411: astore #6
    //   413: iconst_0
    //   414: istore #7
    //   416: iload #7
    //   418: aload_3
    //   419: arraylength
    //   420: if_icmpge -> 682
    //   423: aload_3
    //   424: iload #7
    //   426: baload
    //   427: bipush #61
    //   429: if_icmpne -> 448
    //   432: aload_3
    //   433: iload #7
    //   435: iconst_0
    //   436: bastore
    //   437: iload_2
    //   438: ifeq -> 675
    //   441: goto -> 448
    //   444: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   447: athrow
    //   448: aload_3
    //   449: iload #7
    //   451: baload
    //   452: bipush #47
    //   454: if_icmpne -> 481
    //   457: goto -> 464
    //   460: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   463: athrow
    //   464: aload_3
    //   465: iload #7
    //   467: bipush #63
    //   469: bastore
    //   470: iload_2
    //   471: ifeq -> 675
    //   474: goto -> 481
    //   477: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   480: athrow
    //   481: aload_3
    //   482: iload #7
    //   484: baload
    //   485: bipush #43
    //   487: if_icmpne -> 514
    //   490: goto -> 497
    //   493: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   496: athrow
    //   497: aload_3
    //   498: iload #7
    //   500: bipush #62
    //   502: bastore
    //   503: iload_2
    //   504: ifeq -> 675
    //   507: goto -> 514
    //   510: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   513: athrow
    //   514: aload_3
    //   515: iload #7
    //   517: baload
    //   518: bipush #48
    //   520: if_icmplt -> 569
    //   523: goto -> 530
    //   526: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   529: athrow
    //   530: aload_3
    //   531: iload #7
    //   533: baload
    //   534: bipush #57
    //   536: if_icmpgt -> 569
    //   539: goto -> 546
    //   542: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   545: athrow
    //   546: aload_3
    //   547: iload #7
    //   549: aload_3
    //   550: iload #7
    //   552: baload
    //   553: bipush #-4
    //   555: isub
    //   556: i2b
    //   557: bastore
    //   558: iload_2
    //   559: ifeq -> 675
    //   562: goto -> 569
    //   565: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   568: athrow
    //   569: aload_3
    //   570: iload #7
    //   572: baload
    //   573: bipush #97
    //   575: if_icmplt -> 624
    //   578: goto -> 585
    //   581: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   584: athrow
    //   585: aload_3
    //   586: iload #7
    //   588: baload
    //   589: bipush #122
    //   591: if_icmpgt -> 624
    //   594: goto -> 601
    //   597: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   600: athrow
    //   601: aload_3
    //   602: iload #7
    //   604: aload_3
    //   605: iload #7
    //   607: baload
    //   608: bipush #71
    //   610: isub
    //   611: i2b
    //   612: bastore
    //   613: iload_2
    //   614: ifeq -> 675
    //   617: goto -> 624
    //   620: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   623: athrow
    //   624: aload_3
    //   625: iload #7
    //   627: baload
    //   628: bipush #65
    //   630: if_icmplt -> 675
    //   633: goto -> 640
    //   636: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   639: athrow
    //   640: aload_3
    //   641: iload #7
    //   643: baload
    //   644: bipush #90
    //   646: if_icmpgt -> 675
    //   649: goto -> 656
    //   652: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   655: athrow
    //   656: aload_3
    //   657: iload #7
    //   659: aload_3
    //   660: iload #7
    //   662: baload
    //   663: bipush #65
    //   665: isub
    //   666: i2b
    //   667: bastore
    //   668: goto -> 675
    //   671: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   674: athrow
    //   675: iinc #7, 1
    //   678: iload_2
    //   679: ifeq -> 416
    //   682: iconst_0
    //   683: istore #7
    //   685: iconst_0
    //   686: istore #8
    //   688: iload #8
    //   690: aload #6
    //   692: arraylength
    //   693: iconst_2
    //   694: isub
    //   695: if_icmpge -> 798
    //   698: aload #6
    //   700: iload #8
    //   702: aload_3
    //   703: iload #7
    //   705: baload
    //   706: iconst_2
    //   707: ishl
    //   708: sipush #255
    //   711: iand
    //   712: aload_3
    //   713: iload #7
    //   715: iconst_1
    //   716: iadd
    //   717: baload
    //   718: iconst_4
    //   719: iushr
    //   720: iconst_3
    //   721: iand
    //   722: ior
    //   723: i2b
    //   724: bastore
    //   725: aload #6
    //   727: iload #8
    //   729: iconst_1
    //   730: iadd
    //   731: aload_3
    //   732: iload #7
    //   734: iconst_1
    //   735: iadd
    //   736: baload
    //   737: iconst_4
    //   738: ishl
    //   739: sipush #255
    //   742: iand
    //   743: aload_3
    //   744: iload #7
    //   746: iconst_2
    //   747: iadd
    //   748: baload
    //   749: iconst_2
    //   750: iushr
    //   751: bipush #15
    //   753: iand
    //   754: ior
    //   755: i2b
    //   756: bastore
    //   757: aload #6
    //   759: iload #8
    //   761: iconst_2
    //   762: iadd
    //   763: aload_3
    //   764: iload #7
    //   766: iconst_2
    //   767: iadd
    //   768: baload
    //   769: bipush #6
    //   771: ishl
    //   772: sipush #255
    //   775: iand
    //   776: aload_3
    //   777: iload #7
    //   779: iconst_3
    //   780: iadd
    //   781: baload
    //   782: bipush #63
    //   784: iand
    //   785: ior
    //   786: i2b
    //   787: bastore
    //   788: iinc #7, 4
    //   791: iinc #8, 3
    //   794: iload_2
    //   795: ifeq -> 688
    //   798: iload #8
    //   800: aload #6
    //   802: arraylength
    //   803: if_icmpge -> 840
    //   806: aload #6
    //   808: iload #8
    //   810: aload_3
    //   811: iload #7
    //   813: baload
    //   814: iconst_2
    //   815: ishl
    //   816: sipush #255
    //   819: iand
    //   820: aload_3
    //   821: iload #7
    //   823: iconst_1
    //   824: iadd
    //   825: baload
    //   826: iconst_4
    //   827: iushr
    //   828: iconst_3
    //   829: iand
    //   830: ior
    //   831: i2b
    //   832: bastore
    //   833: goto -> 840
    //   836: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   839: athrow
    //   840: iinc #8, 1
    //   843: iload #8
    //   845: aload #6
    //   847: arraylength
    //   848: if_icmpge -> 888
    //   851: aload #6
    //   853: iload #8
    //   855: aload_3
    //   856: iload #7
    //   858: iconst_1
    //   859: iadd
    //   860: baload
    //   861: iconst_4
    //   862: ishl
    //   863: sipush #255
    //   866: iand
    //   867: aload_3
    //   868: iload #7
    //   870: iconst_2
    //   871: iadd
    //   872: baload
    //   873: iconst_2
    //   874: iushr
    //   875: bipush #15
    //   877: iand
    //   878: ior
    //   879: i2b
    //   880: bastore
    //   881: goto -> 888
    //   884: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   887: athrow
    //   888: aload #6
    //   890: astore #4
    //   892: sipush #-30776
    //   895: new java/math/BigInteger
    //   898: dup
    //   899: aload #4
    //   901: invokespecial <init> : ([B)V
    //   904: invokevirtual abs : ()Ljava/math/BigInteger;
    //   907: putstatic burp/Ztcv.ZY : Ljava/lang/Object;
    //   910: sipush #-9341
    //   913: invokestatic a : (II)Ljava/lang/String;
    //   916: iconst_1
    //   917: ldc burp/Zs5k
    //   919: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   922: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   925: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   928: astore_3
    //   929: aload_3
    //   930: arraylength
    //   931: istore #4
    //   933: iconst_0
    //   934: istore #5
    //   936: iload #5
    //   938: iload #4
    //   940: if_icmpge -> 1077
    //   943: aload_3
    //   944: iload #5
    //   946: aaload
    //   947: astore #6
    //   949: aload #6
    //   951: invokevirtual getModifiers : ()I
    //   954: invokestatic isStatic : (I)Z
    //   957: ifne -> 967
    //   960: goto -> 1070
    //   963: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   966: athrow
    //   967: aload #6
    //   969: invokevirtual getType : ()Ljava/lang/Class;
    //   972: astore #7
    //   974: aload #7
    //   976: ifnull -> 1057
    //   979: aload #7
    //   981: invokevirtual isPrimitive : ()Z
    //   984: ifne -> 1057
    //   987: goto -> 994
    //   990: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   993: athrow
    //   994: aload #7
    //   996: invokevirtual getPackage : ()Ljava/lang/Package;
    //   999: ifnull -> 1057
    //   1002: goto -> 1009
    //   1005: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1008: athrow
    //   1009: aload #7
    //   1011: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1014: invokevirtual getName : ()Ljava/lang/String;
    //   1017: ifnull -> 1057
    //   1020: goto -> 1027
    //   1023: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1026: athrow
    //   1027: aload #7
    //   1029: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1032: invokevirtual getName : ()Ljava/lang/String;
    //   1035: sipush #-30772
    //   1038: sipush #-3845
    //   1041: invokestatic a : (II)Ljava/lang/String;
    //   1044: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1047: ifne -> 1057
    //   1050: goto -> 1057
    //   1053: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1056: athrow
    //   1057: aload #6
    //   1059: iconst_1
    //   1060: invokevirtual setAccessible : (Z)V
    //   1063: aload #6
    //   1065: aconst_null
    //   1066: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1069: pop
    //   1070: iinc #5, 1
    //   1073: iload_2
    //   1074: ifeq -> 936
    //   1077: sipush #-30773
    //   1080: sipush #-18948
    //   1083: invokestatic a : (II)Ljava/lang/String;
    //   1086: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1089: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1092: astore_3
    //   1093: aload_3
    //   1094: arraylength
    //   1095: istore #4
    //   1097: iconst_0
    //   1098: istore #5
    //   1100: iload #5
    //   1102: iload #4
    //   1104: if_icmpge -> 1236
    //   1107: aload_3
    //   1108: iload #5
    //   1110: aaload
    //   1111: astore #6
    //   1113: aload #6
    //   1115: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1118: pop
    //   1119: aload #6
    //   1121: invokevirtual getModifiers : ()I
    //   1124: invokestatic isStatic : (I)Z
    //   1127: ifeq -> 1222
    //   1130: aload #6
    //   1132: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1135: arraylength
    //   1136: iconst_2
    //   1137: if_icmpne -> 1222
    //   1140: goto -> 1147
    //   1143: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1146: athrow
    //   1147: aload #6
    //   1149: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1152: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1155: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1158: ifeq -> 1222
    //   1161: goto -> 1168
    //   1164: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1167: athrow
    //   1168: aload #6
    //   1170: iconst_1
    //   1171: invokevirtual setAccessible : (Z)V
    //   1174: aload #6
    //   1176: aconst_null
    //   1177: iconst_2
    //   1178: anewarray java/lang/Object
    //   1181: dup
    //   1182: iconst_0
    //   1183: aload_0
    //   1184: aastore
    //   1185: dup
    //   1186: iconst_1
    //   1187: aload_1
    //   1188: ifnonnull -> 1206
    //   1191: goto -> 1198
    //   1194: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1197: athrow
    //   1198: aload_1
    //   1199: goto -> 1213
    //   1202: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1205: athrow
    //   1206: aload_1
    //   1207: checkcast [B
    //   1210: invokevirtual clone : ()Ljava/lang/Object;
    //   1213: aastore
    //   1214: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1217: pop
    //   1218: iload_2
    //   1219: ifeq -> 1236
    //   1222: iinc #5, 1
    //   1225: iload_2
    //   1226: ifeq -> 1100
    //   1229: goto -> 1236
    //   1232: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1235: athrow
    //   1236: getstatic burp/Zt3p.ZD : Ljava/lang/String;
    //   1239: getstatic burp/Zxn5.Zd : Ljava/lang/Object;
    //   1242: checkcast java/math/BigInteger
    //   1245: invokevirtual intValue : ()I
    //   1248: bipush #32
    //   1250: irem
    //   1251: invokestatic abs : (I)I
    //   1254: invokevirtual charAt : (I)C
    //   1257: getstatic burp/Zzoi.ZR : Ljava/lang/String;
    //   1260: getstatic burp/Zlpj.Zc : Ljava/lang/Object;
    //   1263: checkcast java/math/BigInteger
    //   1266: invokevirtual intValue : ()I
    //   1269: bipush #32
    //   1271: irem
    //   1272: invokestatic abs : (I)I
    //   1275: invokevirtual charAt : (I)C
    //   1278: if_icmple -> 1393
    //   1281: getstatic burp/Zs8y.Zr : Ljava/lang/String;
    //   1284: getstatic burp/Zzmu.Zy : Ljava/lang/Object;
    //   1287: checkcast java/math/BigInteger
    //   1290: invokevirtual intValue : ()I
    //   1293: bipush #32
    //   1295: irem
    //   1296: invokestatic abs : (I)I
    //   1299: invokevirtual charAt : (I)C
    //   1302: getstatic burp/Zmsn.ZD : Ljava/lang/String;
    //   1305: getstatic burp/Zgqi.Zp : Ljava/lang/Object;
    //   1308: checkcast java/math/BigInteger
    //   1311: invokevirtual intValue : ()I
    //   1314: bipush #32
    //   1316: irem
    //   1317: invokestatic abs : (I)I
    //   1320: invokevirtual charAt : (I)C
    //   1323: if_icmple -> 1393
    //   1326: goto -> 1333
    //   1329: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1332: athrow
    //   1333: getstatic burp/Zlh8.ZY : Ljava/lang/String;
    //   1336: getstatic burp/Zsj5.Zv : Ljava/lang/Object;
    //   1339: checkcast java/math/BigInteger
    //   1342: invokevirtual intValue : ()I
    //   1345: bipush #32
    //   1347: irem
    //   1348: invokestatic abs : (I)I
    //   1351: invokevirtual charAt : (I)C
    //   1354: getstatic burp/Zzr5.Zg : Ljava/lang/String;
    //   1357: getstatic burp/Zrpu.Zi : Ljava/lang/Object;
    //   1360: checkcast java/math/BigInteger
    //   1363: invokevirtual intValue : ()I
    //   1366: bipush #32
    //   1368: irem
    //   1369: invokestatic abs : (I)I
    //   1372: invokevirtual charAt : (I)C
    //   1375: if_icmpgt -> 1393
    //   1378: goto -> 1385
    //   1381: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1384: athrow
    //   1385: iconst_1
    //   1386: goto -> 1394
    //   1389: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1392: athrow
    //   1393: iconst_0
    //   1394: ireturn
    //   1395: astore_3
    //   1396: new java/lang/Exception
    //   1399: dup
    //   1400: aload_3
    //   1401: invokevirtual getMessage : ()Ljava/lang/String;
    //   1404: invokespecial <init> : (Ljava/lang/String;)V
    //   1407: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1394	1395	java/lang/Throwable
    //   69	83	86	java/lang/Throwable
    //   76	97	100	java/lang/Throwable
    //   90	111	114	java/lang/Throwable
    //   104	125	128	java/lang/Throwable
    //   118	139	142	java/lang/Throwable
    //   132	153	156	java/lang/Throwable
    //   146	167	170	java/lang/Throwable
    //   160	181	184	java/lang/Throwable
    //   174	191	194	java/lang/Throwable
    //   230	244	247	java/lang/Throwable
    //   237	258	261	java/lang/Throwable
    //   251	272	275	java/lang/Throwable
    //   265	286	289	java/lang/Throwable
    //   279	300	303	java/lang/Throwable
    //   293	314	317	java/lang/Throwable
    //   307	328	331	java/lang/Throwable
    //   321	342	345	java/lang/Throwable
    //   335	359	362	java/lang/Throwable
    //   423	441	444	java/lang/Throwable
    //   432	457	460	java/lang/Throwable
    //   448	474	477	java/lang/Throwable
    //   464	490	493	java/lang/Throwable
    //   481	507	510	java/lang/Throwable
    //   497	523	526	java/lang/Throwable
    //   514	539	542	java/lang/Throwable
    //   530	562	565	java/lang/Throwable
    //   546	578	581	java/lang/Throwable
    //   569	594	597	java/lang/Throwable
    //   585	617	620	java/lang/Throwable
    //   601	633	636	java/lang/Throwable
    //   624	649	652	java/lang/Throwable
    //   640	668	671	java/lang/Throwable
    //   798	833	836	java/lang/Throwable
    //   840	881	884	java/lang/Throwable
    //   949	963	963	java/lang/Throwable
    //   974	987	990	java/lang/Throwable
    //   979	1002	1005	java/lang/Throwable
    //   994	1020	1023	java/lang/Throwable
    //   1009	1050	1053	java/lang/Throwable
    //   1113	1140	1143	java/lang/Throwable
    //   1130	1161	1164	java/lang/Throwable
    //   1147	1191	1194	java/lang/Throwable
    //   1168	1202	1202	java/lang/Throwable
    //   1213	1229	1232	java/lang/Throwable
    //   1236	1326	1329	java/lang/Throwable
    //   1281	1378	1381	java/lang/Throwable
    //   1333	1389	1389	java/lang/Throwable
  }
  
  static void Zx(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'uy¹\\tjYh4ù.6pîMJyÁ·Û­é¿ûI÷[Hcq§POÉfó÷Õ©KÝÄ5ÀéM^í6,i@\Ü¢R¹ì%Úýá¹¸czý%1"©î\\td©_ÁC1Ð»Õh  ó7pàM­-/¡@Ñ}Zq:BaÇÃ¶ÌÑµÆ|¸P'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #19
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
    //   68: ldc '_ÁËM|h ·Fr¼\\t\\n'v#8ñ-AfÜ\\bÁ\\b¾½¼½Ä'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #125
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
    //   129: putstatic burp/Zs8s.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zs8s.b : [Ljava/lang/String;
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
    //   212: bipush #98
    //   214: goto -> 244
    //   217: bipush #84
    //   219: goto -> 244
    //   222: bipush #68
    //   224: goto -> 244
    //   227: bipush #79
    //   229: goto -> 244
    //   232: bipush #31
    //   234: goto -> 244
    //   237: bipush #20
    //   239: goto -> 244
    //   242: bipush #21
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
    //   300: sipush #-30770
    //   303: sipush #14183
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zs8s.Za : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #125
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #-13
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #-18
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #-78
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #-105
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: iconst_3
    //   348: bastore
    //   349: dup
    //   350: bipush #6
    //   352: bipush #99
    //   354: bastore
    //   355: dup
    //   356: bipush #7
    //   358: bipush #125
    //   360: bastore
    //   361: dup
    //   362: bipush #8
    //   364: bipush #57
    //   366: bastore
    //   367: dup
    //   368: bipush #9
    //   370: bipush #59
    //   372: bastore
    //   373: dup
    //   374: bipush #10
    //   376: bipush #14
    //   378: bastore
    //   379: dup
    //   380: bipush #11
    //   382: bipush #76
    //   384: bastore
    //   385: dup
    //   386: bipush #12
    //   388: bipush #-103
    //   390: bastore
    //   391: dup
    //   392: bipush #13
    //   394: bipush #-22
    //   396: bastore
    //   397: dup
    //   398: bipush #14
    //   400: bipush #17
    //   402: bastore
    //   403: dup
    //   404: bipush #15
    //   406: bipush #-48
    //   408: bastore
    //   409: dup
    //   410: bipush #16
    //   412: bipush #-15
    //   414: bastore
    //   415: dup
    //   416: bipush #17
    //   418: bipush #-111
    //   420: bastore
    //   421: dup
    //   422: bipush #18
    //   424: bipush #79
    //   426: bastore
    //   427: dup
    //   428: bipush #19
    //   430: bipush #-34
    //   432: bastore
    //   433: dup
    //   434: bipush #20
    //   436: bipush #15
    //   438: bastore
    //   439: dup
    //   440: bipush #21
    //   442: bipush #-88
    //   444: bastore
    //   445: dup
    //   446: bipush #22
    //   448: bipush #101
    //   450: bastore
    //   451: dup
    //   452: bipush #23
    //   454: bipush #-49
    //   456: bastore
    //   457: dup
    //   458: bipush #24
    //   460: bipush #-88
    //   462: bastore
    //   463: dup
    //   464: bipush #25
    //   466: bipush #-9
    //   468: bastore
    //   469: dup
    //   470: bipush #26
    //   472: bipush #-92
    //   474: bastore
    //   475: dup
    //   476: bipush #27
    //   478: bipush #-28
    //   480: bastore
    //   481: dup
    //   482: bipush #28
    //   484: bipush #18
    //   486: bastore
    //   487: dup
    //   488: bipush #29
    //   490: bipush #-53
    //   492: bastore
    //   493: dup
    //   494: bipush #30
    //   496: bipush #-32
    //   498: bastore
    //   499: dup
    //   500: bipush #31
    //   502: bipush #-37
    //   504: bastore
    //   505: invokespecial <init> : ([B)V
    //   508: putstatic burp/Zs8s.ZG : Ljava/lang/Object;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF87C8) & 0xFFFF;
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
      char c = '²';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs8s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */