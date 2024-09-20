package burp;

import java.math.BigInteger;

class Zb6e extends ClassLoader {
  static Object ZD;
  
  static String ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZI(Object paramObject) {
    Zlum.ZW = a(-1914, 10331);
    Zlum.Zj = new BigInteger(a(-1910, 1156));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zrfl.Zy.charAt(Math.abs(((BigInteger)Zboa.Zh).intValue() % 32)) <= Zl1q.ZY.charAt(Math.abs(((BigInteger)Zx_u.Zy).intValue() % 32))) {
          try {
            Zxxd.Zn(Class.forName(a(-1913, -28667)));
            if (!bool)
              Zewo.ZT(Class.forName(a(-1905, -19503))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zewo.ZT(Class.forName(a(-1905, -19503)));
    } catch (Throwable throwable) {}
  }
  
  static void Zh(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zp(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zg7j.Zr : Ljava/lang/Object;
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
    //   856: sipush #-1915
    //   859: new java/math/BigInteger
    //   862: dup
    //   863: aload #4
    //   865: invokespecial <init> : ([B)V
    //   868: invokevirtual abs : ()Ljava/math/BigInteger;
    //   871: putstatic burp/Zbu.ZW : Ljava/lang/Object;
    //   874: sipush #-1283
    //   877: getstatic burp/Zezn.Zh : Ljava/lang/Object;
    //   880: checkcast java/math/BigInteger
    //   883: getstatic burp/Zlsg.ZD : Ljava/lang/Object;
    //   886: checkcast java/math/BigInteger
    //   889: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   892: putstatic burp/Ze0w.ZU : Ljava/lang/Object;
    //   895: invokestatic a : (II)Ljava/lang/String;
    //   898: iconst_1
    //   899: ldc burp/Zg27
    //   901: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   904: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   907: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   910: astore_3
    //   911: aload_3
    //   912: arraylength
    //   913: istore #4
    //   915: iconst_0
    //   916: istore #5
    //   918: iload #5
    //   920: iload #4
    //   922: if_icmpge -> 1059
    //   925: aload_3
    //   926: iload #5
    //   928: aaload
    //   929: astore #6
    //   931: aload #6
    //   933: invokevirtual getModifiers : ()I
    //   936: invokestatic isStatic : (I)Z
    //   939: ifne -> 949
    //   942: goto -> 1052
    //   945: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   948: athrow
    //   949: aload #6
    //   951: invokevirtual getType : ()Ljava/lang/Class;
    //   954: astore #7
    //   956: aload #7
    //   958: ifnull -> 1039
    //   961: aload #7
    //   963: invokevirtual isPrimitive : ()Z
    //   966: ifne -> 1039
    //   969: goto -> 976
    //   972: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   975: athrow
    //   976: aload #7
    //   978: invokevirtual getPackage : ()Ljava/lang/Package;
    //   981: ifnull -> 1039
    //   984: goto -> 991
    //   987: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   990: athrow
    //   991: aload #7
    //   993: invokevirtual getPackage : ()Ljava/lang/Package;
    //   996: invokevirtual getName : ()Ljava/lang/String;
    //   999: ifnull -> 1039
    //   1002: goto -> 1009
    //   1005: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1008: athrow
    //   1009: aload #7
    //   1011: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1014: invokevirtual getName : ()Ljava/lang/String;
    //   1017: sipush #-1916
    //   1020: sipush #25344
    //   1023: invokestatic a : (II)Ljava/lang/String;
    //   1026: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1029: ifne -> 1039
    //   1032: goto -> 1039
    //   1035: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1038: athrow
    //   1039: aload #6
    //   1041: iconst_1
    //   1042: invokevirtual setAccessible : (Z)V
    //   1045: aload #6
    //   1047: aconst_null
    //   1048: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1051: pop
    //   1052: iinc #5, 1
    //   1055: iload_2
    //   1056: ifne -> 918
    //   1059: sipush #-1907
    //   1062: sipush #24186
    //   1065: invokestatic a : (II)Ljava/lang/String;
    //   1068: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1071: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1074: astore_3
    //   1075: aload_3
    //   1076: arraylength
    //   1077: istore #4
    //   1079: iconst_0
    //   1080: istore #5
    //   1082: iload #5
    //   1084: iload #4
    //   1086: if_icmpge -> 1197
    //   1089: aload_3
    //   1090: iload #5
    //   1092: aaload
    //   1093: astore #6
    //   1095: aload #6
    //   1097: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1100: pop
    //   1101: aload #6
    //   1103: invokevirtual getModifiers : ()I
    //   1106: invokestatic isStatic : (I)Z
    //   1109: ifeq -> 1183
    //   1112: aload #6
    //   1114: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1117: arraylength
    //   1118: iconst_2
    //   1119: if_icmpne -> 1183
    //   1122: goto -> 1129
    //   1125: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1128: athrow
    //   1129: aload #6
    //   1131: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1134: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1137: if_acmpne -> 1183
    //   1140: goto -> 1147
    //   1143: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1146: athrow
    //   1147: aload #6
    //   1149: iconst_1
    //   1150: invokevirtual setAccessible : (Z)V
    //   1153: aload #6
    //   1155: aconst_null
    //   1156: iconst_2
    //   1157: anewarray java/lang/Object
    //   1160: dup
    //   1161: iconst_0
    //   1162: aload_0
    //   1163: aastore
    //   1164: dup
    //   1165: iconst_1
    //   1166: aload_1
    //   1167: aastore
    //   1168: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1171: pop
    //   1172: iload_2
    //   1173: ifne -> 1197
    //   1176: goto -> 1183
    //   1179: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1182: athrow
    //   1183: iinc #5, 1
    //   1186: iload_2
    //   1187: ifne -> 1082
    //   1190: goto -> 1197
    //   1193: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1196: athrow
    //   1197: sipush #-1909
    //   1200: sipush #-13383
    //   1203: invokestatic a : (II)Ljava/lang/String;
    //   1206: iconst_1
    //   1207: ldc burp/Zkvr
    //   1209: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1212: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1215: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1218: astore_3
    //   1219: aload_3
    //   1220: arraylength
    //   1221: istore #4
    //   1223: iconst_0
    //   1224: istore #5
    //   1226: iload #5
    //   1228: iload #4
    //   1230: if_icmpge -> 1367
    //   1233: aload_3
    //   1234: iload #5
    //   1236: aaload
    //   1237: astore #6
    //   1239: aload #6
    //   1241: invokevirtual getModifiers : ()I
    //   1244: invokestatic isStatic : (I)Z
    //   1247: ifne -> 1257
    //   1250: goto -> 1360
    //   1253: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1256: athrow
    //   1257: aload #6
    //   1259: invokevirtual getType : ()Ljava/lang/Class;
    //   1262: astore #7
    //   1264: aload #7
    //   1266: ifnull -> 1347
    //   1269: aload #7
    //   1271: invokevirtual isPrimitive : ()Z
    //   1274: ifne -> 1347
    //   1277: goto -> 1284
    //   1280: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1283: athrow
    //   1284: aload #7
    //   1286: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1289: ifnull -> 1347
    //   1292: goto -> 1299
    //   1295: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1298: athrow
    //   1299: aload #7
    //   1301: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1304: invokevirtual getName : ()Ljava/lang/String;
    //   1307: ifnull -> 1347
    //   1310: goto -> 1317
    //   1313: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1316: athrow
    //   1317: aload #7
    //   1319: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1322: invokevirtual getName : ()Ljava/lang/String;
    //   1325: sipush #-1912
    //   1328: sipush #21538
    //   1331: invokestatic a : (II)Ljava/lang/String;
    //   1334: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1337: ifne -> 1347
    //   1340: goto -> 1347
    //   1343: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1346: athrow
    //   1347: aload #6
    //   1349: iconst_1
    //   1350: invokevirtual setAccessible : (Z)V
    //   1353: aload #6
    //   1355: aconst_null
    //   1356: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1359: pop
    //   1360: iinc #5, 1
    //   1363: iload_2
    //   1364: ifne -> 1226
    //   1367: sipush #-1908
    //   1370: sipush #25771
    //   1373: invokestatic a : (II)Ljava/lang/String;
    //   1376: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1379: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1382: astore_3
    //   1383: aload_3
    //   1384: arraylength
    //   1385: istore #4
    //   1387: iconst_0
    //   1388: istore #5
    //   1390: iload #5
    //   1392: iload #4
    //   1394: if_icmpge -> 1526
    //   1397: aload_3
    //   1398: iload #5
    //   1400: aaload
    //   1401: astore #6
    //   1403: aload #6
    //   1405: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1408: pop
    //   1409: aload #6
    //   1411: invokevirtual getModifiers : ()I
    //   1414: invokestatic isStatic : (I)Z
    //   1417: ifeq -> 1512
    //   1420: aload #6
    //   1422: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1425: arraylength
    //   1426: iconst_2
    //   1427: if_icmpne -> 1512
    //   1430: goto -> 1437
    //   1433: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1436: athrow
    //   1437: aload #6
    //   1439: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1442: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1445: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1448: ifeq -> 1512
    //   1451: goto -> 1458
    //   1454: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1457: athrow
    //   1458: aload #6
    //   1460: iconst_1
    //   1461: invokevirtual setAccessible : (Z)V
    //   1464: aload #6
    //   1466: aconst_null
    //   1467: iconst_2
    //   1468: anewarray java/lang/Object
    //   1471: dup
    //   1472: iconst_0
    //   1473: aload_0
    //   1474: aastore
    //   1475: dup
    //   1476: iconst_1
    //   1477: aload_1
    //   1478: ifnonnull -> 1496
    //   1481: goto -> 1488
    //   1484: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1487: athrow
    //   1488: aload_1
    //   1489: goto -> 1503
    //   1492: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1495: athrow
    //   1496: aload_1
    //   1497: checkcast [B
    //   1500: invokevirtual clone : ()Ljava/lang/Object;
    //   1503: aastore
    //   1504: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1507: pop
    //   1508: iload_2
    //   1509: ifne -> 1526
    //   1512: iinc #5, 1
    //   1515: iload_2
    //   1516: ifne -> 1390
    //   1519: goto -> 1526
    //   1522: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1525: athrow
    //   1526: iconst_0
    //   1527: istore_3
    //   1528: sipush #-1920
    //   1531: sipush #-14268
    //   1534: invokestatic a : (II)Ljava/lang/String;
    //   1537: iconst_1
    //   1538: ldc burp/Zexn
    //   1540: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1543: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1546: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1549: astore #4
    //   1551: aload #4
    //   1553: arraylength
    //   1554: istore #5
    //   1556: iconst_0
    //   1557: istore #6
    //   1559: iload #6
    //   1561: iload #5
    //   1563: if_icmpge -> 1701
    //   1566: aload #4
    //   1568: iload #6
    //   1570: aaload
    //   1571: astore #7
    //   1573: aload #7
    //   1575: invokevirtual getModifiers : ()I
    //   1578: invokestatic isStatic : (I)Z
    //   1581: ifne -> 1591
    //   1584: goto -> 1694
    //   1587: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1590: athrow
    //   1591: aload #7
    //   1593: invokevirtual getType : ()Ljava/lang/Class;
    //   1596: astore #8
    //   1598: aload #8
    //   1600: ifnull -> 1681
    //   1603: aload #8
    //   1605: invokevirtual isPrimitive : ()Z
    //   1608: ifne -> 1681
    //   1611: goto -> 1618
    //   1614: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1617: athrow
    //   1618: aload #8
    //   1620: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1623: ifnull -> 1681
    //   1626: goto -> 1633
    //   1629: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1632: athrow
    //   1633: aload #8
    //   1635: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1638: invokevirtual getName : ()Ljava/lang/String;
    //   1641: ifnull -> 1681
    //   1644: goto -> 1651
    //   1647: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1650: athrow
    //   1651: aload #8
    //   1653: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1656: invokevirtual getName : ()Ljava/lang/String;
    //   1659: sipush #-1912
    //   1662: sipush #21538
    //   1665: invokestatic a : (II)Ljava/lang/String;
    //   1668: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1671: ifne -> 1681
    //   1674: goto -> 1681
    //   1677: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1680: athrow
    //   1681: aload #7
    //   1683: iconst_1
    //   1684: invokevirtual setAccessible : (Z)V
    //   1687: aload #7
    //   1689: aconst_null
    //   1690: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1693: pop
    //   1694: iinc #6, 1
    //   1697: iload_2
    //   1698: ifne -> 1559
    //   1701: sipush #-1911
    //   1704: sipush #-12854
    //   1707: invokestatic a : (II)Ljava/lang/String;
    //   1710: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1713: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1716: astore #4
    //   1718: aload #4
    //   1720: arraylength
    //   1721: istore #5
    //   1723: iconst_0
    //   1724: istore #6
    //   1726: iload #6
    //   1728: iload #5
    //   1730: if_icmpge -> 1866
    //   1733: aload #4
    //   1735: iload #6
    //   1737: aaload
    //   1738: astore #7
    //   1740: aload #7
    //   1742: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1745: pop
    //   1746: aload #7
    //   1748: invokevirtual getModifiers : ()I
    //   1751: invokestatic isStatic : (I)Z
    //   1754: ifeq -> 1852
    //   1757: aload #7
    //   1759: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1762: arraylength
    //   1763: iconst_2
    //   1764: if_icmpne -> 1852
    //   1767: goto -> 1774
    //   1770: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1773: athrow
    //   1774: aload #7
    //   1776: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1779: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1782: if_acmpne -> 1852
    //   1785: goto -> 1792
    //   1788: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1791: athrow
    //   1792: aload #7
    //   1794: iconst_1
    //   1795: invokevirtual setAccessible : (Z)V
    //   1798: aload #7
    //   1800: aconst_null
    //   1801: iconst_2
    //   1802: anewarray java/lang/Object
    //   1805: dup
    //   1806: iconst_0
    //   1807: aload_0
    //   1808: aastore
    //   1809: dup
    //   1810: iconst_1
    //   1811: aload_1
    //   1812: ifnonnull -> 1830
    //   1815: goto -> 1822
    //   1818: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1821: athrow
    //   1822: aload_1
    //   1823: goto -> 1837
    //   1826: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1829: athrow
    //   1830: aload_1
    //   1831: checkcast [B
    //   1834: invokevirtual clone : ()Ljava/lang/Object;
    //   1837: aastore
    //   1838: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1841: checkcast java/lang/Boolean
    //   1844: invokevirtual booleanValue : ()Z
    //   1847: istore_3
    //   1848: iload_2
    //   1849: ifne -> 1866
    //   1852: iinc #6, 1
    //   1855: iload_2
    //   1856: ifne -> 1726
    //   1859: goto -> 1866
    //   1862: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1865: athrow
    //   1866: iload_3
    //   1867: ireturn
    //   1868: astore_3
    //   1869: new java/lang/Exception
    //   1872: dup
    //   1873: aload_3
    //   1874: invokevirtual getMessage : ()Ljava/lang/String;
    //   1877: invokespecial <init> : (Ljava/lang/String;)V
    //   1880: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1867	1868	java/lang/Throwable
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
    //   931	945	945	java/lang/Throwable
    //   956	969	972	java/lang/Throwable
    //   961	984	987	java/lang/Throwable
    //   976	1002	1005	java/lang/Throwable
    //   991	1032	1035	java/lang/Throwable
    //   1095	1122	1125	java/lang/Throwable
    //   1112	1140	1143	java/lang/Throwable
    //   1129	1176	1179	java/lang/Throwable
    //   1147	1190	1193	java/lang/Throwable
    //   1239	1253	1253	java/lang/Throwable
    //   1264	1277	1280	java/lang/Throwable
    //   1269	1292	1295	java/lang/Throwable
    //   1284	1310	1313	java/lang/Throwable
    //   1299	1340	1343	java/lang/Throwable
    //   1403	1430	1433	java/lang/Throwable
    //   1420	1451	1454	java/lang/Throwable
    //   1437	1481	1484	java/lang/Throwable
    //   1458	1492	1492	java/lang/Throwable
    //   1503	1519	1522	java/lang/Throwable
    //   1573	1587	1587	java/lang/Throwable
    //   1598	1611	1614	java/lang/Throwable
    //   1603	1626	1629	java/lang/Throwable
    //   1618	1644	1647	java/lang/Throwable
    //   1633	1674	1677	java/lang/Throwable
    //   1740	1767	1770	java/lang/Throwable
    //   1757	1785	1788	java/lang/Throwable
    //   1774	1815	1818	java/lang/Throwable
    //   1792	1826	1826	java/lang/Throwable
    //   1848	1859	1862	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '%f.#Ô\\tðä¼~ÁÃÌÚ Xñ$.½§è+«aQ^0/%êµ\\të¨@¦¬</k2E\\tQ»Gnffná\\tP±\êp¶¡M>{#Ôcô 3åV@ªßø\L¥\\rI¾XÚ£+çK¶Ü>ØÖ[LV¬öHÄÁÍÿ@ºm©XVÍ°ÝOnÄAdp_Î=s\\túýsé²Ø§|Z=éE\\t·¼TuÜr`à® K~è,|»¸$-0H`»ºÙ ¿«Î5ZËôÍ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #118
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
    //   68: ldc 'sÌÉ~j»lÂ\\tTÃSo'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #87
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
    //   129: putstatic burp/Zb6e.a : [Ljava/lang/String;
    //   132: bipush #13
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zb6e.b : [Ljava/lang/String;
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
    //   212: bipush #88
    //   214: goto -> 244
    //   217: bipush #71
    //   219: goto -> 244
    //   222: bipush #77
    //   224: goto -> 244
    //   227: bipush #25
    //   229: goto -> 244
    //   232: bipush #85
    //   234: goto -> 244
    //   237: bipush #99
    //   239: goto -> 244
    //   242: bipush #112
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
    //   310: bipush #73
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-30
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #113
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-7
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #126
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-66
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-51
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #-22
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #126
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #-92
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #67
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #16
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #-90
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #-108
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #52
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #-54
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #73
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #-60
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #97
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #6
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #-76
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #-98
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #-30
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #-21
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #-29
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #-53
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #-69
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #-83
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #-42
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: iconst_3
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #-105
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: bipush #90
    //   492: bastore
    //   493: invokespecial <init> : ([B)V
    //   496: putstatic burp/Zb6e.ZD : Ljava/lang/Object;
    //   499: sipush #-1906
    //   502: sipush #4652
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Zb6e.ZR : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF88C) & 0xFFFF;
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
      byte b1 = 105;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb6e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */