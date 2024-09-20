package burp;

import java.math.BigInteger;

class Ztfh extends ClassLoader {
  static String ZU;
  
  static Object Zo;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zs(Object paramObject) {
    Zlo5.ZJ = a(17679, 15252);
    Zlo5.Zf = new BigInteger(a(17677, -3584));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zlhy.ZS.charAt(Math.abs(((BigInteger)Ze69.ZH).intValue() % 32)) > Zs83.ZG.charAt(Math.abs(((BigInteger)Zs83.ZT).intValue() % 32))) {
          try {
            Zkm0.ZQ(Class.forName(a(17678, 18573)));
            if (bool)
              Zbxp.Zo(Class.forName(a(17672, -21482))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zbxp.Zo(Class.forName(a(17672, -21482)));
    } catch (Throwable throwable) {}
  }
  
  static void ZI(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zl(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zkc8.ZW : Ljava/lang/Object;
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
    //   166: ifeq -> 20
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
    //   334: ifeq -> 181
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
    //   363: ifeq -> 348
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
    //   402: ifeq -> 639
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
    //   435: ifeq -> 639
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
    //   468: ifeq -> 639
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
    //   523: ifeq -> 639
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
    //   578: ifeq -> 639
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
    //   643: ifeq -> 380
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
    //   759: ifeq -> 652
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
    //   856: sipush #17664
    //   859: new java/math/BigInteger
    //   862: dup
    //   863: aload #4
    //   865: invokespecial <init> : ([B)V
    //   868: invokevirtual abs : ()Ljava/math/BigInteger;
    //   871: putstatic burp/Zm52.ZR : Ljava/lang/Object;
    //   874: sipush #-11367
    //   877: getstatic burp/Zre5.Zo : Ljava/lang/Object;
    //   880: checkcast java/math/BigInteger
    //   883: getstatic burp/Ztcv.ZY : Ljava/lang/Object;
    //   886: checkcast java/math/BigInteger
    //   889: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   892: putstatic burp/Zeoy.Zt : Ljava/lang/Object;
    //   895: invokestatic a : (II)Ljava/lang/String;
    //   898: iconst_1
    //   899: ldc burp/Ztod
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
    //   1017: sipush #17675
    //   1020: sipush #-22544
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
    //   1056: ifeq -> 918
    //   1059: sipush #17667
    //   1062: sipush #5418
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
    //   1086: if_icmpge -> 1218
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
    //   1109: ifeq -> 1204
    //   1112: aload #6
    //   1114: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1117: arraylength
    //   1118: iconst_2
    //   1119: if_icmpne -> 1204
    //   1122: goto -> 1129
    //   1125: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1128: athrow
    //   1129: aload #6
    //   1131: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1134: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1137: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1140: ifeq -> 1204
    //   1143: goto -> 1150
    //   1146: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1149: athrow
    //   1150: aload #6
    //   1152: iconst_1
    //   1153: invokevirtual setAccessible : (Z)V
    //   1156: aload #6
    //   1158: aconst_null
    //   1159: iconst_2
    //   1160: anewarray java/lang/Object
    //   1163: dup
    //   1164: iconst_0
    //   1165: aload_0
    //   1166: aastore
    //   1167: dup
    //   1168: iconst_1
    //   1169: aload_1
    //   1170: ifnonnull -> 1188
    //   1173: goto -> 1180
    //   1176: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1179: athrow
    //   1180: aload_1
    //   1181: goto -> 1195
    //   1184: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1187: athrow
    //   1188: aload_1
    //   1189: checkcast [B
    //   1192: invokevirtual clone : ()Ljava/lang/Object;
    //   1195: aastore
    //   1196: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1199: pop
    //   1200: iload_2
    //   1201: ifeq -> 1218
    //   1204: iinc #5, 1
    //   1207: iload_2
    //   1208: ifeq -> 1082
    //   1211: goto -> 1218
    //   1214: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1217: athrow
    //   1218: new java/io/ByteArrayOutputStream
    //   1221: dup
    //   1222: invokespecial <init> : ()V
    //   1225: astore_3
    //   1226: sipush #17674
    //   1229: aload_3
    //   1230: sipush #202
    //   1233: invokevirtual write : (I)V
    //   1236: sipush #-14579
    //   1239: aload_3
    //   1240: sipush #254
    //   1243: invokevirtual write : (I)V
    //   1246: aload_3
    //   1247: sipush #186
    //   1250: invokevirtual write : (I)V
    //   1253: aload_3
    //   1254: sipush #190
    //   1257: invokevirtual write : (I)V
    //   1260: aload_3
    //   1261: iconst_0
    //   1262: invokevirtual write : (I)V
    //   1265: aload_3
    //   1266: iconst_1
    //   1267: invokevirtual write : (I)V
    //   1270: aload_3
    //   1271: iconst_0
    //   1272: invokevirtual write : (I)V
    //   1275: aload_3
    //   1276: bipush #50
    //   1278: invokevirtual write : (I)V
    //   1281: aload_3
    //   1282: getstatic burp/Zzqj.Zq : Ljava/lang/Object;
    //   1285: checkcast java/math/BigInteger
    //   1288: invokevirtual toByteArray : ()[B
    //   1291: invokevirtual write : ([B)V
    //   1294: aload_3
    //   1295: getstatic burp/Zmhx.ZQ : Ljava/lang/Object;
    //   1298: checkcast java/math/BigInteger
    //   1301: invokevirtual toByteArray : ()[B
    //   1304: invokevirtual write : ([B)V
    //   1307: aload_3
    //   1308: getstatic burp/Zs56.ZC : Ljava/lang/Object;
    //   1311: checkcast java/math/BigInteger
    //   1314: invokevirtual toByteArray : ()[B
    //   1317: invokevirtual write : ([B)V
    //   1320: aload_3
    //   1321: invokevirtual toByteArray : ()[B
    //   1324: astore #4
    //   1326: aconst_null
    //   1327: astore #5
    //   1329: invokestatic a : (II)Ljava/lang/String;
    //   1332: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1335: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1338: astore #6
    //   1340: aload #6
    //   1342: arraylength
    //   1343: istore #7
    //   1345: iconst_0
    //   1346: istore #8
    //   1348: iload #8
    //   1350: iload #7
    //   1352: if_icmpge -> 1480
    //   1355: aload #6
    //   1357: iload #8
    //   1359: aaload
    //   1360: astore #9
    //   1362: aload #9
    //   1364: invokevirtual getName : ()Ljava/lang/String;
    //   1367: sipush #17673
    //   1370: sipush #8551
    //   1373: invokestatic a : (II)Ljava/lang/String;
    //   1376: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1379: ifeq -> 1473
    //   1382: aload #9
    //   1384: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1387: astore #10
    //   1389: aload #10
    //   1391: arraylength
    //   1392: iconst_4
    //   1393: if_icmpeq -> 1403
    //   1396: goto -> 1473
    //   1399: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1402: athrow
    //   1403: aload #10
    //   1405: iconst_0
    //   1406: aaload
    //   1407: ldc java/lang/String
    //   1409: if_acmpeq -> 1419
    //   1412: goto -> 1473
    //   1415: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1418: athrow
    //   1419: aload #10
    //   1421: iconst_1
    //   1422: aaload
    //   1423: ldc [B
    //   1425: if_acmpeq -> 1435
    //   1428: goto -> 1473
    //   1431: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1434: athrow
    //   1435: aload #10
    //   1437: iconst_2
    //   1438: aaload
    //   1439: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1442: if_acmpeq -> 1452
    //   1445: goto -> 1473
    //   1448: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1451: athrow
    //   1452: aload #10
    //   1454: iconst_3
    //   1455: aaload
    //   1456: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1459: if_acmpeq -> 1469
    //   1462: goto -> 1473
    //   1465: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1468: athrow
    //   1469: aload #9
    //   1471: astore #5
    //   1473: iinc #8, 1
    //   1476: iload_2
    //   1477: ifeq -> 1348
    //   1480: aload #5
    //   1482: iconst_1
    //   1483: invokevirtual setAccessible : (Z)V
    //   1486: ldc burp/Zebj
    //   1488: iconst_0
    //   1489: anewarray java/lang/Class
    //   1492: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   1495: astore #6
    //   1497: aload #6
    //   1499: iconst_1
    //   1500: invokevirtual setAccessible : (Z)V
    //   1503: aload #5
    //   1505: aload #6
    //   1507: iconst_0
    //   1508: anewarray java/lang/Object
    //   1511: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   1514: iconst_4
    //   1515: anewarray java/lang/Object
    //   1518: dup
    //   1519: iconst_0
    //   1520: sipush #17665
    //   1523: sipush #-2466
    //   1526: invokestatic a : (II)Ljava/lang/String;
    //   1529: aastore
    //   1530: dup
    //   1531: iconst_1
    //   1532: aload #4
    //   1534: aastore
    //   1535: dup
    //   1536: iconst_2
    //   1537: iconst_0
    //   1538: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1541: aastore
    //   1542: dup
    //   1543: iconst_3
    //   1544: aload #4
    //   1546: arraylength
    //   1547: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1550: aastore
    //   1551: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1554: pop
    //   1555: goto -> 1559
    //   1558: astore_3
    //   1559: getstatic burp/Zmr7.Zo : Ljava/lang/String;
    //   1562: getstatic burp/Ze8i.Zq : Ljava/lang/Object;
    //   1565: checkcast java/math/BigInteger
    //   1568: invokevirtual intValue : ()I
    //   1571: bipush #32
    //   1573: irem
    //   1574: invokestatic abs : (I)I
    //   1577: invokevirtual charAt : (I)C
    //   1580: getstatic burp/Zs75.Zn : Ljava/lang/String;
    //   1583: getstatic burp/Zxn5.Zd : Ljava/lang/Object;
    //   1586: checkcast java/math/BigInteger
    //   1589: invokevirtual intValue : ()I
    //   1592: bipush #32
    //   1594: irem
    //   1595: invokestatic abs : (I)I
    //   1598: invokevirtual charAt : (I)C
    //   1601: if_icmpgt -> 1708
    //   1604: getstatic burp/Ztj5.Zt : Ljava/lang/String;
    //   1607: getstatic burp/Zlem.ZI : Ljava/lang/Object;
    //   1610: checkcast java/math/BigInteger
    //   1613: invokevirtual intValue : ()I
    //   1616: bipush #32
    //   1618: irem
    //   1619: invokestatic abs : (I)I
    //   1622: invokevirtual charAt : (I)C
    //   1625: getstatic burp/Zm7x.ZP : Ljava/lang/String;
    //   1628: getstatic burp/Zkc8.ZW : Ljava/lang/Object;
    //   1631: checkcast java/math/BigInteger
    //   1634: invokevirtual intValue : ()I
    //   1637: bipush #32
    //   1639: irem
    //   1640: invokestatic abs : (I)I
    //   1643: invokevirtual charAt : (I)C
    //   1646: if_icmpgt -> 1708
    //   1649: goto -> 1656
    //   1652: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1655: athrow
    //   1656: getstatic burp/Zg_5.ZG : Ljava/lang/String;
    //   1659: getstatic burp/Zs2n.ZK : Ljava/lang/Object;
    //   1662: checkcast java/math/BigInteger
    //   1665: invokevirtual intValue : ()I
    //   1668: bipush #32
    //   1670: irem
    //   1671: invokestatic abs : (I)I
    //   1674: invokevirtual charAt : (I)C
    //   1677: getstatic burp/Ze5t.ZX : Ljava/lang/String;
    //   1680: getstatic burp/Zsj5.Zv : Ljava/lang/Object;
    //   1683: checkcast java/math/BigInteger
    //   1686: invokevirtual intValue : ()I
    //   1689: bipush #32
    //   1691: irem
    //   1692: invokestatic abs : (I)I
    //   1695: invokevirtual charAt : (I)C
    //   1698: if_icmple -> 1716
    //   1701: goto -> 1708
    //   1704: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1707: athrow
    //   1708: iconst_1
    //   1709: goto -> 1717
    //   1712: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1715: athrow
    //   1716: iconst_0
    //   1717: ireturn
    //   1718: astore_3
    //   1719: new java/lang/Exception
    //   1722: dup
    //   1723: aload_3
    //   1724: invokevirtual getMessage : ()Ljava/lang/String;
    //   1727: invokespecial <init> : (Ljava/lang/String;)V
    //   1730: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1717	1718	java/lang/Throwable
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
    //   1112	1143	1146	java/lang/Throwable
    //   1129	1173	1176	java/lang/Throwable
    //   1150	1184	1184	java/lang/Throwable
    //   1195	1211	1214	java/lang/Throwable
    //   1218	1555	1558	java/lang/Throwable
    //   1389	1399	1399	java/lang/Throwable
    //   1403	1415	1415	java/lang/Throwable
    //   1419	1431	1431	java/lang/Throwable
    //   1435	1448	1448	java/lang/Throwable
    //   1452	1465	1465	java/lang/Throwable
    //   1559	1649	1652	java/lang/Throwable
    //   1604	1701	1704	java/lang/Throwable
    //   1656	1712	1712	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\\bXÔG2QøcÈÄ J²ÜQmîum $W\!\\t¦_\IÛ\\tqáÔN¾ÕÁä\\t5`~ÇãDÐe /~z¼FScËû«¶×&Íáq¾-¨Õwï@; §^Åqáæ9¹Úª²ãjSIg*¯Ã¯¤óM*1ñ9yý<ÒÑÿÊHup`ºÓPØo|¨ÿr2»s\\rZ"À³GEÒÞÓEXÆ`çA\\nKMÀI¬I±¡M1\\ræÁæe®¥ÆÜf+&öç@49ÉéC_jhªuáÛÖø²Hj#à%%Jñâôk.¬gV\\b\ ö·d©~\ol¿¿ë\\t-}È¥È~´'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #21
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #35
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
    //   68: ldc 'ÒhÛ15\\bYûw0Fç­'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #39
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
    //   129: putstatic burp/Ztfh.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztfh.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #6
    //   214: goto -> 243
    //   217: bipush #27
    //   219: goto -> 243
    //   222: iconst_3
    //   223: goto -> 243
    //   226: bipush #68
    //   228: goto -> 243
    //   231: bipush #25
    //   233: goto -> 243
    //   236: bipush #87
    //   238: goto -> 243
    //   241: bipush #80
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
    //   300: sipush #17676
    //   303: sipush #550
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Ztfh.ZU : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #17666
    //   319: sipush #6458
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Ztfh.Zo : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x450A) & 0xFFFF;
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
      char c = '£';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztfh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */