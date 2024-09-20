package burp;

import java.math.BigInteger;

class Zl6e extends ClassLoader {
  static String ZC;
  
  static Object Zo;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZA(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZB(Object paramObject) {
    Zxxd.Za = a(23753, 24692);
    Zxxd.Zn = new BigInteger(a(23750, -31756));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zxof.Zs.charAt(Math.abs(((BigInteger)Zboa.Zh).intValue() % 32)) <= Zsmn.Zo.charAt(Math.abs(((BigInteger)Zm1l.Za).intValue() % 32))) {
          try {
            Zlh2.ZV(Class.forName(a(23752, -5497)));
            if (bool)
              Zgdj.Zw(Class.forName(a(23745, 8856))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgdj.Zw(Class.forName(a(23745, 8856)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZS(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zty2.Zl : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: iconst_0
    //   15: istore #5
    //   17: iconst_0
    //   18: istore #6
    //   20: iload #6
    //   22: aload_3
    //   23: arraylength
    //   24: if_icmpge -> 169
    //   27: aload_3
    //   28: iload #6
    //   30: baload
    //   31: istore #7
    //   33: iload #7
    //   35: bipush #48
    //   37: if_icmplt -> 54
    //   40: iload #7
    //   42: bipush #57
    //   44: if_icmple -> 152
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   53: athrow
    //   54: iload #7
    //   56: bipush #65
    //   58: if_icmplt -> 82
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   67: athrow
    //   68: iload #7
    //   70: bipush #90
    //   72: if_icmple -> 152
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   81: athrow
    //   82: iload #7
    //   84: bipush #97
    //   86: if_icmplt -> 110
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   95: athrow
    //   96: iload #7
    //   98: bipush #122
    //   100: if_icmple -> 152
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   109: athrow
    //   110: iload #7
    //   112: bipush #43
    //   114: if_icmpeq -> 152
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   123: athrow
    //   124: iload #7
    //   126: bipush #47
    //   128: if_icmpeq -> 152
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   137: athrow
    //   138: iload #7
    //   140: bipush #61
    //   142: if_icmpne -> 162
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   151: athrow
    //   152: iinc #5, 1
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   161: athrow
    //   162: iinc #6, 1
    //   165: iload_2
    //   166: ifne -> 20
    //   169: iload #5
    //   171: newarray byte
    //   173: astore #6
    //   175: iconst_0
    //   176: istore #7
    //   178: iconst_0
    //   179: istore #8
    //   181: iload #8
    //   183: aload_3
    //   184: arraylength
    //   185: if_icmpge -> 337
    //   188: aload_3
    //   189: iload #8
    //   191: baload
    //   192: istore #9
    //   194: iload #9
    //   196: bipush #48
    //   198: if_icmplt -> 215
    //   201: iload #9
    //   203: bipush #57
    //   205: if_icmple -> 313
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   214: athrow
    //   215: iload #9
    //   217: bipush #65
    //   219: if_icmplt -> 243
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   228: athrow
    //   229: iload #9
    //   231: bipush #90
    //   233: if_icmple -> 313
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   242: athrow
    //   243: iload #9
    //   245: bipush #97
    //   247: if_icmplt -> 271
    //   250: goto -> 257
    //   253: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   256: athrow
    //   257: iload #9
    //   259: bipush #122
    //   261: if_icmple -> 313
    //   264: goto -> 271
    //   267: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   270: athrow
    //   271: iload #9
    //   273: bipush #43
    //   275: if_icmpeq -> 313
    //   278: goto -> 285
    //   281: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   284: athrow
    //   285: iload #9
    //   287: bipush #47
    //   289: if_icmpeq -> 313
    //   292: goto -> 299
    //   295: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   298: athrow
    //   299: iload #9
    //   301: bipush #61
    //   303: if_icmpne -> 330
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   312: athrow
    //   313: aload #6
    //   315: iload #7
    //   317: iload #9
    //   319: bastore
    //   320: iinc #7, 1
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   329: athrow
    //   330: iinc #8, 1
    //   333: iload_2
    //   334: ifne -> 181
    //   337: aload #6
    //   339: astore #4
    //   341: aload #4
    //   343: astore_3
    //   344: aload_3
    //   345: arraylength
    //   346: istore #5
    //   348: aload_3
    //   349: iload #5
    //   351: iconst_1
    //   352: isub
    //   353: baload
    //   354: bipush #61
    //   356: if_icmpne -> 366
    //   359: iinc #5, -1
    //   362: iload_2
    //   363: ifne -> 348
    //   366: iload #5
    //   368: aload_3
    //   369: arraylength
    //   370: iconst_4
    //   371: idiv
    //   372: isub
    //   373: newarray byte
    //   375: astore #6
    //   377: iconst_0
    //   378: istore #7
    //   380: iload #7
    //   382: aload_3
    //   383: arraylength
    //   384: if_icmpge -> 646
    //   387: aload_3
    //   388: iload #7
    //   390: baload
    //   391: bipush #61
    //   393: if_icmpne -> 412
    //   396: aload_3
    //   397: iload #7
    //   399: iconst_0
    //   400: bastore
    //   401: iload_2
    //   402: ifne -> 639
    //   405: goto -> 412
    //   408: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   411: athrow
    //   412: aload_3
    //   413: iload #7
    //   415: baload
    //   416: bipush #47
    //   418: if_icmpne -> 445
    //   421: goto -> 428
    //   424: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   427: athrow
    //   428: aload_3
    //   429: iload #7
    //   431: bipush #63
    //   433: bastore
    //   434: iload_2
    //   435: ifne -> 639
    //   438: goto -> 445
    //   441: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   444: athrow
    //   445: aload_3
    //   446: iload #7
    //   448: baload
    //   449: bipush #43
    //   451: if_icmpne -> 478
    //   454: goto -> 461
    //   457: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   460: athrow
    //   461: aload_3
    //   462: iload #7
    //   464: bipush #62
    //   466: bastore
    //   467: iload_2
    //   468: ifne -> 639
    //   471: goto -> 478
    //   474: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   477: athrow
    //   478: aload_3
    //   479: iload #7
    //   481: baload
    //   482: bipush #48
    //   484: if_icmplt -> 533
    //   487: goto -> 494
    //   490: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   493: athrow
    //   494: aload_3
    //   495: iload #7
    //   497: baload
    //   498: bipush #57
    //   500: if_icmpgt -> 533
    //   503: goto -> 510
    //   506: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   509: athrow
    //   510: aload_3
    //   511: iload #7
    //   513: aload_3
    //   514: iload #7
    //   516: baload
    //   517: bipush #-4
    //   519: isub
    //   520: i2b
    //   521: bastore
    //   522: iload_2
    //   523: ifne -> 639
    //   526: goto -> 533
    //   529: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   532: athrow
    //   533: aload_3
    //   534: iload #7
    //   536: baload
    //   537: bipush #97
    //   539: if_icmplt -> 588
    //   542: goto -> 549
    //   545: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   548: athrow
    //   549: aload_3
    //   550: iload #7
    //   552: baload
    //   553: bipush #122
    //   555: if_icmpgt -> 588
    //   558: goto -> 565
    //   561: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   564: athrow
    //   565: aload_3
    //   566: iload #7
    //   568: aload_3
    //   569: iload #7
    //   571: baload
    //   572: bipush #71
    //   574: isub
    //   575: i2b
    //   576: bastore
    //   577: iload_2
    //   578: ifne -> 639
    //   581: goto -> 588
    //   584: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   587: athrow
    //   588: aload_3
    //   589: iload #7
    //   591: baload
    //   592: bipush #65
    //   594: if_icmplt -> 639
    //   597: goto -> 604
    //   600: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   603: athrow
    //   604: aload_3
    //   605: iload #7
    //   607: baload
    //   608: bipush #90
    //   610: if_icmpgt -> 639
    //   613: goto -> 620
    //   616: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   619: athrow
    //   620: aload_3
    //   621: iload #7
    //   623: aload_3
    //   624: iload #7
    //   626: baload
    //   627: bipush #65
    //   629: isub
    //   630: i2b
    //   631: bastore
    //   632: goto -> 639
    //   635: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   638: athrow
    //   639: iinc #7, 1
    //   642: iload_2
    //   643: ifne -> 380
    //   646: iconst_0
    //   647: istore #7
    //   649: iconst_0
    //   650: istore #8
    //   652: iload #8
    //   654: aload #6
    //   656: arraylength
    //   657: iconst_2
    //   658: isub
    //   659: if_icmpge -> 762
    //   662: aload #6
    //   664: iload #8
    //   666: aload_3
    //   667: iload #7
    //   669: baload
    //   670: iconst_2
    //   671: ishl
    //   672: sipush #255
    //   675: iand
    //   676: aload_3
    //   677: iload #7
    //   679: iconst_1
    //   680: iadd
    //   681: baload
    //   682: iconst_4
    //   683: iushr
    //   684: iconst_3
    //   685: iand
    //   686: ior
    //   687: i2b
    //   688: bastore
    //   689: aload #6
    //   691: iload #8
    //   693: iconst_1
    //   694: iadd
    //   695: aload_3
    //   696: iload #7
    //   698: iconst_1
    //   699: iadd
    //   700: baload
    //   701: iconst_4
    //   702: ishl
    //   703: sipush #255
    //   706: iand
    //   707: aload_3
    //   708: iload #7
    //   710: iconst_2
    //   711: iadd
    //   712: baload
    //   713: iconst_2
    //   714: iushr
    //   715: bipush #15
    //   717: iand
    //   718: ior
    //   719: i2b
    //   720: bastore
    //   721: aload #6
    //   723: iload #8
    //   725: iconst_2
    //   726: iadd
    //   727: aload_3
    //   728: iload #7
    //   730: iconst_2
    //   731: iadd
    //   732: baload
    //   733: bipush #6
    //   735: ishl
    //   736: sipush #255
    //   739: iand
    //   740: aload_3
    //   741: iload #7
    //   743: iconst_3
    //   744: iadd
    //   745: baload
    //   746: bipush #63
    //   748: iand
    //   749: ior
    //   750: i2b
    //   751: bastore
    //   752: iinc #7, 4
    //   755: iinc #8, 3
    //   758: iload_2
    //   759: ifne -> 652
    //   762: iload #8
    //   764: aload #6
    //   766: arraylength
    //   767: if_icmpge -> 804
    //   770: aload #6
    //   772: iload #8
    //   774: aload_3
    //   775: iload #7
    //   777: baload
    //   778: iconst_2
    //   779: ishl
    //   780: sipush #255
    //   783: iand
    //   784: aload_3
    //   785: iload #7
    //   787: iconst_1
    //   788: iadd
    //   789: baload
    //   790: iconst_4
    //   791: iushr
    //   792: iconst_3
    //   793: iand
    //   794: ior
    //   795: i2b
    //   796: bastore
    //   797: goto -> 804
    //   800: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   803: athrow
    //   804: iinc #8, 1
    //   807: iload #8
    //   809: aload #6
    //   811: arraylength
    //   812: if_icmpge -> 852
    //   815: aload #6
    //   817: iload #8
    //   819: aload_3
    //   820: iload #7
    //   822: iconst_1
    //   823: iadd
    //   824: baload
    //   825: iconst_4
    //   826: ishl
    //   827: sipush #255
    //   830: iand
    //   831: aload_3
    //   832: iload #7
    //   834: iconst_2
    //   835: iadd
    //   836: baload
    //   837: iconst_2
    //   838: iushr
    //   839: bipush #15
    //   841: iand
    //   842: ior
    //   843: i2b
    //   844: bastore
    //   845: goto -> 852
    //   848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   851: athrow
    //   852: aload #6
    //   854: astore #4
    //   856: sipush #23759
    //   859: new java/math/BigInteger
    //   862: dup
    //   863: aload #4
    //   865: invokespecial <init> : ([B)V
    //   868: invokevirtual abs : ()Ljava/math/BigInteger;
    //   871: putstatic burp/Zsbd.Zh : Ljava/lang/Object;
    //   874: sipush #-9021
    //   877: invokestatic a : (II)Ljava/lang/String;
    //   880: iconst_1
    //   881: ldc burp/Zenq
    //   883: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   886: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   889: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   892: astore_3
    //   893: aload_3
    //   894: arraylength
    //   895: istore #4
    //   897: iconst_0
    //   898: istore #5
    //   900: iload #5
    //   902: iload #4
    //   904: if_icmpge -> 1041
    //   907: aload_3
    //   908: iload #5
    //   910: aaload
    //   911: astore #6
    //   913: aload #6
    //   915: invokevirtual getModifiers : ()I
    //   918: invokestatic isStatic : (I)Z
    //   921: ifne -> 931
    //   924: goto -> 1034
    //   927: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   930: athrow
    //   931: aload #6
    //   933: invokevirtual getType : ()Ljava/lang/Class;
    //   936: astore #7
    //   938: aload #7
    //   940: ifnull -> 1021
    //   943: aload #7
    //   945: invokevirtual isPrimitive : ()Z
    //   948: ifne -> 1021
    //   951: goto -> 958
    //   954: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   957: athrow
    //   958: aload #7
    //   960: invokevirtual getPackage : ()Ljava/lang/Package;
    //   963: ifnull -> 1021
    //   966: goto -> 973
    //   969: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   972: athrow
    //   973: aload #7
    //   975: invokevirtual getPackage : ()Ljava/lang/Package;
    //   978: invokevirtual getName : ()Ljava/lang/String;
    //   981: ifnull -> 1021
    //   984: goto -> 991
    //   987: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   990: athrow
    //   991: aload #7
    //   993: invokevirtual getPackage : ()Ljava/lang/Package;
    //   996: invokevirtual getName : ()Ljava/lang/String;
    //   999: sipush #23755
    //   1002: sipush #24960
    //   1005: invokestatic a : (II)Ljava/lang/String;
    //   1008: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1011: ifne -> 1021
    //   1014: goto -> 1021
    //   1017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1020: athrow
    //   1021: aload #6
    //   1023: iconst_1
    //   1024: invokevirtual setAccessible : (Z)V
    //   1027: aload #6
    //   1029: aconst_null
    //   1030: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1033: pop
    //   1034: iinc #5, 1
    //   1037: iload_2
    //   1038: ifne -> 900
    //   1041: sipush #23754
    //   1044: sipush #9653
    //   1047: invokestatic a : (II)Ljava/lang/String;
    //   1050: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1053: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1056: astore_3
    //   1057: aload_3
    //   1058: arraylength
    //   1059: istore #4
    //   1061: iconst_0
    //   1062: istore #5
    //   1064: iload #5
    //   1066: iload #4
    //   1068: if_icmpge -> 1179
    //   1071: aload_3
    //   1072: iload #5
    //   1074: aaload
    //   1075: astore #6
    //   1077: aload #6
    //   1079: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1082: pop
    //   1083: aload #6
    //   1085: invokevirtual getModifiers : ()I
    //   1088: invokestatic isStatic : (I)Z
    //   1091: ifeq -> 1165
    //   1094: aload #6
    //   1096: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1099: arraylength
    //   1100: iconst_2
    //   1101: if_icmpne -> 1165
    //   1104: goto -> 1111
    //   1107: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1110: athrow
    //   1111: aload #6
    //   1113: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1116: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1119: if_acmpne -> 1165
    //   1122: goto -> 1129
    //   1125: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1128: athrow
    //   1129: aload #6
    //   1131: iconst_1
    //   1132: invokevirtual setAccessible : (Z)V
    //   1135: aload #6
    //   1137: aconst_null
    //   1138: iconst_2
    //   1139: anewarray java/lang/Object
    //   1142: dup
    //   1143: iconst_0
    //   1144: aload_0
    //   1145: aastore
    //   1146: dup
    //   1147: iconst_1
    //   1148: aload_1
    //   1149: aastore
    //   1150: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1153: pop
    //   1154: iload_2
    //   1155: ifne -> 1179
    //   1158: goto -> 1165
    //   1161: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1164: athrow
    //   1165: iinc #5, 1
    //   1168: iload_2
    //   1169: ifne -> 1064
    //   1172: goto -> 1179
    //   1175: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1178: athrow
    //   1179: sipush #23758
    //   1182: sipush #3341
    //   1185: invokestatic a : (II)Ljava/lang/String;
    //   1188: iconst_1
    //   1189: ldc burp/Zezi
    //   1191: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1194: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1197: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1200: astore_3
    //   1201: aload_3
    //   1202: arraylength
    //   1203: istore #4
    //   1205: iconst_0
    //   1206: istore #5
    //   1208: iload #5
    //   1210: iload #4
    //   1212: if_icmpge -> 1349
    //   1215: aload_3
    //   1216: iload #5
    //   1218: aaload
    //   1219: astore #6
    //   1221: aload #6
    //   1223: invokevirtual getModifiers : ()I
    //   1226: invokestatic isStatic : (I)Z
    //   1229: ifne -> 1239
    //   1232: goto -> 1342
    //   1235: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1238: athrow
    //   1239: aload #6
    //   1241: invokevirtual getType : ()Ljava/lang/Class;
    //   1244: astore #7
    //   1246: aload #7
    //   1248: ifnull -> 1329
    //   1251: aload #7
    //   1253: invokevirtual isPrimitive : ()Z
    //   1256: ifne -> 1329
    //   1259: goto -> 1266
    //   1262: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1265: athrow
    //   1266: aload #7
    //   1268: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1271: ifnull -> 1329
    //   1274: goto -> 1281
    //   1277: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1280: athrow
    //   1281: aload #7
    //   1283: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1286: invokevirtual getName : ()Ljava/lang/String;
    //   1289: ifnull -> 1329
    //   1292: goto -> 1299
    //   1295: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1298: athrow
    //   1299: aload #7
    //   1301: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1304: invokevirtual getName : ()Ljava/lang/String;
    //   1307: sipush #23751
    //   1310: sipush #-2001
    //   1313: invokestatic a : (II)Ljava/lang/String;
    //   1316: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1319: ifne -> 1329
    //   1322: goto -> 1329
    //   1325: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1328: athrow
    //   1329: aload #6
    //   1331: iconst_1
    //   1332: invokevirtual setAccessible : (Z)V
    //   1335: aload #6
    //   1337: aconst_null
    //   1338: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1341: pop
    //   1342: iinc #5, 1
    //   1345: iload_2
    //   1346: ifne -> 1208
    //   1349: sipush #23748
    //   1352: sipush #13571
    //   1355: invokestatic a : (II)Ljava/lang/String;
    //   1358: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1361: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1364: astore_3
    //   1365: aload_3
    //   1366: arraylength
    //   1367: istore #4
    //   1369: iconst_0
    //   1370: istore #5
    //   1372: iload #5
    //   1374: iload #4
    //   1376: if_icmpge -> 1505
    //   1379: aload_3
    //   1380: iload #5
    //   1382: aaload
    //   1383: astore #6
    //   1385: aload #6
    //   1387: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1390: pop
    //   1391: aload #6
    //   1393: invokevirtual getModifiers : ()I
    //   1396: invokestatic isStatic : (I)Z
    //   1399: ifeq -> 1491
    //   1402: aload #6
    //   1404: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1407: arraylength
    //   1408: iconst_2
    //   1409: if_icmpne -> 1491
    //   1412: goto -> 1419
    //   1415: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1418: athrow
    //   1419: aload #6
    //   1421: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1424: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1427: if_acmpne -> 1491
    //   1430: goto -> 1437
    //   1433: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1436: athrow
    //   1437: aload #6
    //   1439: iconst_1
    //   1440: invokevirtual setAccessible : (Z)V
    //   1443: aload #6
    //   1445: aconst_null
    //   1446: iconst_2
    //   1447: anewarray java/lang/Object
    //   1450: dup
    //   1451: iconst_0
    //   1452: aload_0
    //   1453: aastore
    //   1454: dup
    //   1455: iconst_1
    //   1456: aload_1
    //   1457: ifnonnull -> 1475
    //   1460: goto -> 1467
    //   1463: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1466: athrow
    //   1467: aload_1
    //   1468: goto -> 1482
    //   1471: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1474: athrow
    //   1475: aload_1
    //   1476: checkcast [B
    //   1479: invokevirtual clone : ()Ljava/lang/Object;
    //   1482: aastore
    //   1483: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1486: pop
    //   1487: iload_2
    //   1488: ifne -> 1505
    //   1491: iinc #5, 1
    //   1494: iload_2
    //   1495: ifne -> 1372
    //   1498: goto -> 1505
    //   1501: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1504: athrow
    //   1505: sipush #23757
    //   1508: sipush #-12065
    //   1511: invokestatic a : (II)Ljava/lang/String;
    //   1514: iconst_1
    //   1515: ldc burp/Zzoi
    //   1517: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1520: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1523: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1526: astore_3
    //   1527: aload_3
    //   1528: arraylength
    //   1529: istore #4
    //   1531: iconst_0
    //   1532: istore #5
    //   1534: iload #5
    //   1536: iload #4
    //   1538: if_icmpge -> 1675
    //   1541: aload_3
    //   1542: iload #5
    //   1544: aaload
    //   1545: astore #6
    //   1547: aload #6
    //   1549: invokevirtual getModifiers : ()I
    //   1552: invokestatic isStatic : (I)Z
    //   1555: ifne -> 1565
    //   1558: goto -> 1668
    //   1561: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1564: athrow
    //   1565: aload #6
    //   1567: invokevirtual getType : ()Ljava/lang/Class;
    //   1570: astore #7
    //   1572: aload #7
    //   1574: ifnull -> 1655
    //   1577: aload #7
    //   1579: invokevirtual isPrimitive : ()Z
    //   1582: ifne -> 1655
    //   1585: goto -> 1592
    //   1588: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1591: athrow
    //   1592: aload #7
    //   1594: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1597: ifnull -> 1655
    //   1600: goto -> 1607
    //   1603: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1606: athrow
    //   1607: aload #7
    //   1609: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1612: invokevirtual getName : ()Ljava/lang/String;
    //   1615: ifnull -> 1655
    //   1618: goto -> 1625
    //   1621: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1624: athrow
    //   1625: aload #7
    //   1627: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1630: invokevirtual getName : ()Ljava/lang/String;
    //   1633: sipush #23751
    //   1636: sipush #-2001
    //   1639: invokestatic a : (II)Ljava/lang/String;
    //   1642: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1645: ifne -> 1655
    //   1648: goto -> 1655
    //   1651: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1654: athrow
    //   1655: aload #6
    //   1657: iconst_1
    //   1658: invokevirtual setAccessible : (Z)V
    //   1661: aload #6
    //   1663: aconst_null
    //   1664: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1667: pop
    //   1668: iinc #5, 1
    //   1671: iload_2
    //   1672: ifne -> 1534
    //   1675: sipush #23749
    //   1678: sipush #4605
    //   1681: invokestatic a : (II)Ljava/lang/String;
    //   1684: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1687: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1690: astore_3
    //   1691: aload_3
    //   1692: arraylength
    //   1693: istore #4
    //   1695: iconst_0
    //   1696: istore #5
    //   1698: iload #5
    //   1700: iload #4
    //   1702: if_icmpge -> 1834
    //   1705: aload_3
    //   1706: iload #5
    //   1708: aaload
    //   1709: astore #6
    //   1711: aload #6
    //   1713: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1716: pop
    //   1717: aload #6
    //   1719: invokevirtual getModifiers : ()I
    //   1722: invokestatic isStatic : (I)Z
    //   1725: ifeq -> 1820
    //   1728: aload #6
    //   1730: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1733: arraylength
    //   1734: iconst_2
    //   1735: if_icmpne -> 1820
    //   1738: goto -> 1745
    //   1741: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1744: athrow
    //   1745: aload #6
    //   1747: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1750: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1753: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1756: ifeq -> 1820
    //   1759: goto -> 1766
    //   1762: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1765: athrow
    //   1766: aload #6
    //   1768: iconst_1
    //   1769: invokevirtual setAccessible : (Z)V
    //   1772: aload #6
    //   1774: aconst_null
    //   1775: iconst_2
    //   1776: anewarray java/lang/Object
    //   1779: dup
    //   1780: iconst_0
    //   1781: aload_0
    //   1782: aastore
    //   1783: dup
    //   1784: iconst_1
    //   1785: aload_1
    //   1786: ifnonnull -> 1804
    //   1789: goto -> 1796
    //   1792: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1795: athrow
    //   1796: aload_1
    //   1797: goto -> 1811
    //   1800: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1803: athrow
    //   1804: aload_1
    //   1805: checkcast [B
    //   1808: invokevirtual clone : ()Ljava/lang/Object;
    //   1811: aastore
    //   1812: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1815: pop
    //   1816: iload_2
    //   1817: ifne -> 1834
    //   1820: iinc #5, 1
    //   1823: iload_2
    //   1824: ifne -> 1698
    //   1827: goto -> 1834
    //   1830: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1833: athrow
    //   1834: getstatic burp/Zzh0.ZK : Ljava/lang/String;
    //   1837: getstatic burp/Zbz_.ZU : Ljava/lang/Object;
    //   1840: checkcast java/math/BigInteger
    //   1843: invokevirtual intValue : ()I
    //   1846: bipush #32
    //   1848: irem
    //   1849: invokestatic abs : (I)I
    //   1852: invokevirtual charAt : (I)C
    //   1855: getstatic burp/Zex0.Zk : Ljava/lang/String;
    //   1858: getstatic burp/Zsn4.ZQ : Ljava/lang/Object;
    //   1861: checkcast java/math/BigInteger
    //   1864: invokevirtual intValue : ()I
    //   1867: bipush #32
    //   1869: irem
    //   1870: invokestatic abs : (I)I
    //   1873: invokevirtual charAt : (I)C
    //   1876: if_icmple -> 1983
    //   1879: getstatic burp/Zvos.Zk : Ljava/lang/String;
    //   1882: getstatic burp/Zl2t.ZS : Ljava/lang/Object;
    //   1885: checkcast java/math/BigInteger
    //   1888: invokevirtual intValue : ()I
    //   1891: bipush #32
    //   1893: irem
    //   1894: invokestatic abs : (I)I
    //   1897: invokevirtual charAt : (I)C
    //   1900: getstatic burp/Zeno.ZL : Ljava/lang/String;
    //   1903: getstatic burp/Zeb7.ZJ : Ljava/lang/Object;
    //   1906: checkcast java/math/BigInteger
    //   1909: invokevirtual intValue : ()I
    //   1912: bipush #32
    //   1914: irem
    //   1915: invokestatic abs : (I)I
    //   1918: invokevirtual charAt : (I)C
    //   1921: if_icmple -> 1983
    //   1924: goto -> 1931
    //   1927: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1930: athrow
    //   1931: getstatic burp/Zeju.ZR : Ljava/lang/String;
    //   1934: getstatic burp/Zes_.ZJ : Ljava/lang/Object;
    //   1937: checkcast java/math/BigInteger
    //   1940: invokevirtual intValue : ()I
    //   1943: bipush #32
    //   1945: irem
    //   1946: invokestatic abs : (I)I
    //   1949: invokevirtual charAt : (I)C
    //   1952: getstatic burp/Zboa.Zq : Ljava/lang/String;
    //   1955: getstatic burp/Zkbm.Zp : Ljava/lang/Object;
    //   1958: checkcast java/math/BigInteger
    //   1961: invokevirtual intValue : ()I
    //   1964: bipush #32
    //   1966: irem
    //   1967: invokestatic abs : (I)I
    //   1970: invokevirtual charAt : (I)C
    //   1973: if_icmpgt -> 1991
    //   1976: goto -> 1983
    //   1979: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1982: athrow
    //   1983: iconst_1
    //   1984: goto -> 1992
    //   1987: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1990: athrow
    //   1991: iconst_0
    //   1992: ireturn
    //   1993: astore_3
    //   1994: new java/lang/Exception
    //   1997: dup
    //   1998: aload_3
    //   1999: invokevirtual getMessage : ()Ljava/lang/String;
    //   2002: invokespecial <init> : (Ljava/lang/String;)V
    //   2005: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1992	1993	java/lang/Throwable
    //   33	47	50	java/lang/Throwable
    //   40	61	64	java/lang/Throwable
    //   54	75	78	java/lang/Throwable
    //   68	89	92	java/lang/Throwable
    //   82	103	106	java/lang/Throwable
    //   96	117	120	java/lang/Throwable
    //   110	131	134	java/lang/Throwable
    //   124	145	148	java/lang/Throwable
    //   138	155	158	java/lang/Throwable
    //   194	208	211	java/lang/Throwable
    //   201	222	225	java/lang/Throwable
    //   215	236	239	java/lang/Throwable
    //   229	250	253	java/lang/Throwable
    //   243	264	267	java/lang/Throwable
    //   257	278	281	java/lang/Throwable
    //   271	292	295	java/lang/Throwable
    //   285	306	309	java/lang/Throwable
    //   299	323	326	java/lang/Throwable
    //   387	405	408	java/lang/Throwable
    //   396	421	424	java/lang/Throwable
    //   412	438	441	java/lang/Throwable
    //   428	454	457	java/lang/Throwable
    //   445	471	474	java/lang/Throwable
    //   461	487	490	java/lang/Throwable
    //   478	503	506	java/lang/Throwable
    //   494	526	529	java/lang/Throwable
    //   510	542	545	java/lang/Throwable
    //   533	558	561	java/lang/Throwable
    //   549	581	584	java/lang/Throwable
    //   565	597	600	java/lang/Throwable
    //   588	613	616	java/lang/Throwable
    //   604	632	635	java/lang/Throwable
    //   762	797	800	java/lang/Throwable
    //   804	845	848	java/lang/Throwable
    //   913	927	927	java/lang/Throwable
    //   938	951	954	java/lang/Throwable
    //   943	966	969	java/lang/Throwable
    //   958	984	987	java/lang/Throwable
    //   973	1014	1017	java/lang/Throwable
    //   1077	1104	1107	java/lang/Throwable
    //   1094	1122	1125	java/lang/Throwable
    //   1111	1158	1161	java/lang/Throwable
    //   1129	1172	1175	java/lang/Throwable
    //   1221	1235	1235	java/lang/Throwable
    //   1246	1259	1262	java/lang/Throwable
    //   1251	1274	1277	java/lang/Throwable
    //   1266	1292	1295	java/lang/Throwable
    //   1281	1322	1325	java/lang/Throwable
    //   1385	1412	1415	java/lang/Throwable
    //   1402	1430	1433	java/lang/Throwable
    //   1419	1460	1463	java/lang/Throwable
    //   1437	1471	1471	java/lang/Throwable
    //   1482	1498	1501	java/lang/Throwable
    //   1547	1561	1561	java/lang/Throwable
    //   1572	1585	1588	java/lang/Throwable
    //   1577	1600	1603	java/lang/Throwable
    //   1592	1618	1621	java/lang/Throwable
    //   1607	1648	1651	java/lang/Throwable
    //   1711	1738	1741	java/lang/Throwable
    //   1728	1759	1762	java/lang/Throwable
    //   1745	1789	1792	java/lang/Throwable
    //   1766	1800	1800	java/lang/Throwable
    //   1811	1827	1830	java/lang/Throwable
    //   1834	1924	1927	java/lang/Throwable
    //   1879	1976	1979	java/lang/Throwable
    //   1931	1987	1987	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ùàµBS§k oJÊ%5Zq7g9?­RDL%;gÚ3\··~2JÅ\\t7"lh­Å\\töì|ÑÃüð ¶­¿å±Æ÷õKúÁÇ³MRî­&~jÓ÷Ký\\t(§¸ªò¹ *ç¨\\tPº¨ÝK^Ä\\tê\\fÿ¡Ì7\\tm¥>¿"Ar1ì¬'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #8
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_4
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 23
    //   67: ldc '~6#êÑi\\f²¡¾2tûef³=ÇýÄcõ©zqðÐp¶´\\bã»y©Â­1Y+_*b§¾ f¢îû.ã¾P^$\\tû\\f´2r­'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #77
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #76
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
    //   128: putstatic burp/Zl6e.a : [Ljava/lang/String;
    //   131: bipush #13
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zl6e.b : [Ljava/lang/String;
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
    //   212: bipush #122
    //   214: goto -> 244
    //   217: bipush #119
    //   219: goto -> 244
    //   222: bipush #53
    //   224: goto -> 244
    //   227: bipush #75
    //   229: goto -> 244
    //   232: bipush #110
    //   234: goto -> 244
    //   237: bipush #44
    //   239: goto -> 244
    //   242: bipush #41
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: sipush #23756
    //   303: sipush #-9484
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zl6e.ZC : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #51
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #66
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #-98
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #-18
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #-56
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #36
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #-34
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #89
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #43
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #-56
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: iconst_5
    //   378: bastore
    //   379: dup
    //   380: bipush #11
    //   382: bipush #-88
    //   384: bastore
    //   385: dup
    //   386: bipush #12
    //   388: bipush #-92
    //   390: bastore
    //   391: dup
    //   392: bipush #13
    //   394: bipush #75
    //   396: bastore
    //   397: dup
    //   398: bipush #14
    //   400: bipush #-15
    //   402: bastore
    //   403: dup
    //   404: bipush #15
    //   406: bipush #-92
    //   408: bastore
    //   409: dup
    //   410: bipush #16
    //   412: bipush #-99
    //   414: bastore
    //   415: dup
    //   416: bipush #17
    //   418: bipush #27
    //   420: bastore
    //   421: dup
    //   422: bipush #18
    //   424: bipush #-118
    //   426: bastore
    //   427: dup
    //   428: bipush #19
    //   430: bipush #-50
    //   432: bastore
    //   433: dup
    //   434: bipush #20
    //   436: bipush #41
    //   438: bastore
    //   439: dup
    //   440: bipush #21
    //   442: bipush #100
    //   444: bastore
    //   445: dup
    //   446: bipush #22
    //   448: bipush #48
    //   450: bastore
    //   451: dup
    //   452: bipush #23
    //   454: bipush #-19
    //   456: bastore
    //   457: dup
    //   458: bipush #24
    //   460: bipush #-84
    //   462: bastore
    //   463: dup
    //   464: bipush #25
    //   466: bipush #-68
    //   468: bastore
    //   469: dup
    //   470: bipush #26
    //   472: bipush #-10
    //   474: bastore
    //   475: dup
    //   476: bipush #27
    //   478: bipush #-50
    //   480: bastore
    //   481: dup
    //   482: bipush #28
    //   484: bipush #-15
    //   486: bastore
    //   487: dup
    //   488: bipush #29
    //   490: bipush #100
    //   492: bastore
    //   493: dup
    //   494: bipush #30
    //   496: bipush #41
    //   498: bastore
    //   499: dup
    //   500: bipush #31
    //   502: bipush #-74
    //   504: bastore
    //   505: invokespecial <init> : ([B)V
    //   508: putstatic burp/Zl6e.Zo : Ljava/lang/Object;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5CCD) & 0xFFFF;
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
      char c = '¿';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl6e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */