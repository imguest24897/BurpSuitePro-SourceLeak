package burp;

import java.math.BigInteger;

class Ztl6 extends ClassLoader {
  static String Zb;
  
  static Object ZQ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZJ(Object paramObject) {
    Zt4p.ZL = a(9588, 22510);
    Zt4p.Zh = new BigInteger(a(9573, -19488));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zz4a.ZC.charAt(Math.abs(((BigInteger)Zsfg.Zm).intValue() % 32)) > Zsbv.Zr.charAt(Math.abs(((BigInteger)Zmf2.Zx).intValue() % 32))) {
          try {
            Zxjm.Zj(Class.forName(a(9584, -29463)));
            if (bool)
              Zrfs.ZU(Class.forName(a(9576, -9154))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zrfs.ZU(Class.forName(a(9576, -9154)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zm(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zk8i.ZN : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: new java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #5
    //   23: aload #5
    //   25: sipush #9582
    //   28: sipush #-28030
    //   31: invokestatic a : (II)Ljava/lang/String;
    //   34: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: pop
    //   38: aload_3
    //   39: astore #6
    //   41: aload #6
    //   43: arraylength
    //   44: istore #7
    //   46: iconst_0
    //   47: istore #8
    //   49: iload #8
    //   51: iload #7
    //   53: if_icmpge -> 79
    //   56: aload #6
    //   58: iload #8
    //   60: baload
    //   61: istore #9
    //   63: aload #5
    //   65: iload #9
    //   67: i2c
    //   68: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: iinc #8, 1
    //   75: iload_2
    //   76: ifeq -> 49
    //   79: aload #5
    //   81: sipush #9595
    //   84: sipush #-16371
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: ldc ''
    //   92: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   95: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload #5
    //   104: sipush #9572
    //   107: sipush #21672
    //   110: invokestatic a : (II)Ljava/lang/String;
    //   113: ldc ''
    //   115: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   118: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   121: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: pop
    //   125: aload #5
    //   127: invokevirtual toString : ()Ljava/lang/String;
    //   130: invokevirtual getBytes : ()[B
    //   133: astore #4
    //   135: aload #4
    //   137: astore_3
    //   138: aload_3
    //   139: arraylength
    //   140: bipush #8
    //   142: iadd
    //   143: bipush #6
    //   145: ishr
    //   146: iconst_1
    //   147: iadd
    //   148: bipush #16
    //   150: imul
    //   151: newarray int
    //   153: astore #5
    //   155: iconst_0
    //   156: istore #6
    //   158: iload #6
    //   160: aload_3
    //   161: arraylength
    //   162: if_icmpge -> 205
    //   165: aload_3
    //   166: iload #6
    //   168: baload
    //   169: sipush #255
    //   172: iand
    //   173: istore #7
    //   175: aload #5
    //   177: iload #6
    //   179: iconst_2
    //   180: ishr
    //   181: dup2
    //   182: iaload
    //   183: iload #7
    //   185: bipush #24
    //   187: iload #6
    //   189: iconst_4
    //   190: irem
    //   191: bipush #8
    //   193: imul
    //   194: isub
    //   195: ishl
    //   196: ior
    //   197: iastore
    //   198: iinc #6, 1
    //   201: iload_2
    //   202: ifeq -> 158
    //   205: aload #5
    //   207: iload #6
    //   209: iconst_2
    //   210: ishr
    //   211: dup2
    //   212: iaload
    //   213: sipush #128
    //   216: bipush #24
    //   218: iload #6
    //   220: iconst_4
    //   221: irem
    //   222: bipush #8
    //   224: imul
    //   225: isub
    //   226: ishl
    //   227: ior
    //   228: iastore
    //   229: aload #5
    //   231: aload #5
    //   233: arraylength
    //   234: iconst_1
    //   235: isub
    //   236: aload_3
    //   237: arraylength
    //   238: bipush #8
    //   240: imul
    //   241: iastore
    //   242: bipush #80
    //   244: newarray int
    //   246: astore #7
    //   248: ldc 1732584193
    //   250: istore #8
    //   252: ldc -271733879
    //   254: istore #9
    //   256: ldc -1732584194
    //   258: istore #10
    //   260: ldc 271733878
    //   262: istore #11
    //   264: ldc -1009589776
    //   266: istore #12
    //   268: iconst_0
    //   269: istore #6
    //   271: iload #6
    //   273: aload #5
    //   275: arraylength
    //   276: if_icmpge -> 598
    //   279: iload #8
    //   281: istore #13
    //   283: iload #9
    //   285: istore #14
    //   287: iload #10
    //   289: istore #15
    //   291: iload #11
    //   293: istore #16
    //   295: iload #12
    //   297: istore #17
    //   299: iconst_0
    //   300: istore #18
    //   302: iload #18
    //   304: bipush #80
    //   306: if_icmpge -> 556
    //   309: iload #18
    //   311: bipush #16
    //   313: if_icmpge -> 340
    //   316: aload #7
    //   318: iload #18
    //   320: aload #5
    //   322: iload #6
    //   324: iload #18
    //   326: iadd
    //   327: iaload
    //   328: iastore
    //   329: iload_2
    //   330: ifeq -> 395
    //   333: goto -> 340
    //   336: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   339: athrow
    //   340: aload #7
    //   342: iload #18
    //   344: iconst_3
    //   345: isub
    //   346: iaload
    //   347: aload #7
    //   349: iload #18
    //   351: bipush #8
    //   353: isub
    //   354: iaload
    //   355: ixor
    //   356: aload #7
    //   358: iload #18
    //   360: bipush #14
    //   362: isub
    //   363: iaload
    //   364: ixor
    //   365: aload #7
    //   367: iload #18
    //   369: bipush #16
    //   371: isub
    //   372: iaload
    //   373: ixor
    //   374: istore #19
    //   376: iload #19
    //   378: iconst_1
    //   379: ishl
    //   380: iload #19
    //   382: bipush #31
    //   384: iushr
    //   385: ior
    //   386: istore #20
    //   388: aload #7
    //   390: iload #18
    //   392: iload #20
    //   394: iastore
    //   395: iload #8
    //   397: iconst_5
    //   398: ishl
    //   399: iload #8
    //   401: bipush #27
    //   403: iushr
    //   404: ior
    //   405: istore #19
    //   407: iload #19
    //   409: iload #12
    //   411: iadd
    //   412: aload #7
    //   414: iload #18
    //   416: iaload
    //   417: iadd
    //   418: iload #18
    //   420: bipush #20
    //   422: if_icmpge -> 448
    //   425: ldc 1518500249
    //   427: iload #9
    //   429: iload #10
    //   431: iand
    //   432: iload #9
    //   434: iconst_m1
    //   435: ixor
    //   436: iload #11
    //   438: iand
    //   439: ior
    //   440: iadd
    //   441: goto -> 518
    //   444: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   447: athrow
    //   448: iload #18
    //   450: bipush #40
    //   452: if_icmpge -> 473
    //   455: ldc 1859775393
    //   457: iload #9
    //   459: iload #10
    //   461: ixor
    //   462: iload #11
    //   464: ixor
    //   465: iadd
    //   466: goto -> 518
    //   469: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   472: athrow
    //   473: iload #18
    //   475: bipush #60
    //   477: if_icmpge -> 507
    //   480: ldc -1894007588
    //   482: iload #9
    //   484: iload #10
    //   486: iand
    //   487: iload #9
    //   489: iload #11
    //   491: iand
    //   492: ior
    //   493: iload #10
    //   495: iload #11
    //   497: iand
    //   498: ior
    //   499: iadd
    //   500: goto -> 518
    //   503: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   506: athrow
    //   507: ldc -899497514
    //   509: iload #9
    //   511: iload #10
    //   513: ixor
    //   514: iload #11
    //   516: ixor
    //   517: iadd
    //   518: iadd
    //   519: istore #20
    //   521: iload #11
    //   523: istore #12
    //   525: iload #10
    //   527: istore #11
    //   529: iload #9
    //   531: bipush #30
    //   533: ishl
    //   534: iload #9
    //   536: iconst_2
    //   537: iushr
    //   538: ior
    //   539: istore #10
    //   541: iload #8
    //   543: istore #9
    //   545: iload #20
    //   547: istore #8
    //   549: iinc #18, 1
    //   552: iload_2
    //   553: ifeq -> 302
    //   556: iload #8
    //   558: iload #13
    //   560: iadd
    //   561: istore #8
    //   563: iload #9
    //   565: iload #14
    //   567: iadd
    //   568: istore #9
    //   570: iload #10
    //   572: iload #15
    //   574: iadd
    //   575: istore #10
    //   577: iload #11
    //   579: iload #16
    //   581: iadd
    //   582: istore #11
    //   584: iload #12
    //   586: iload #17
    //   588: iadd
    //   589: istore #12
    //   591: iinc #6, 16
    //   594: iload_2
    //   595: ifeq -> 271
    //   598: iconst_5
    //   599: newarray int
    //   601: dup
    //   602: iconst_0
    //   603: iload #8
    //   605: iastore
    //   606: dup
    //   607: iconst_1
    //   608: iload #9
    //   610: iastore
    //   611: dup
    //   612: iconst_2
    //   613: iload #10
    //   615: iastore
    //   616: dup
    //   617: iconst_3
    //   618: iload #11
    //   620: iastore
    //   621: dup
    //   622: iconst_4
    //   623: iload #12
    //   625: iastore
    //   626: astore #13
    //   628: bipush #20
    //   630: newarray byte
    //   632: astore #14
    //   634: iconst_0
    //   635: istore #15
    //   637: iload #15
    //   639: bipush #20
    //   641: if_icmpge -> 682
    //   644: aload #13
    //   646: iload #15
    //   648: iconst_4
    //   649: idiv
    //   650: iaload
    //   651: istore #16
    //   653: iconst_3
    //   654: iload #15
    //   656: iconst_4
    //   657: irem
    //   658: isub
    //   659: bipush #8
    //   661: imul
    //   662: istore #17
    //   664: aload #14
    //   666: iload #15
    //   668: iload #16
    //   670: iload #17
    //   672: iushr
    //   673: i2b
    //   674: bastore
    //   675: iinc #15, 1
    //   678: iload_2
    //   679: ifeq -> 637
    //   682: aload #14
    //   684: astore #4
    //   686: sipush #9594
    //   689: sipush #7046
    //   692: invokestatic a : (II)Ljava/lang/String;
    //   695: iconst_1
    //   696: ldc burp/Zth8
    //   698: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   701: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   704: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   707: astore_3
    //   708: aload_3
    //   709: arraylength
    //   710: istore #4
    //   712: iconst_0
    //   713: istore #5
    //   715: iload #5
    //   717: iload #4
    //   719: if_icmpge -> 856
    //   722: aload_3
    //   723: iload #5
    //   725: aaload
    //   726: astore #6
    //   728: aload #6
    //   730: invokevirtual getModifiers : ()I
    //   733: invokestatic isStatic : (I)Z
    //   736: ifne -> 746
    //   739: goto -> 849
    //   742: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   745: athrow
    //   746: aload #6
    //   748: invokevirtual getType : ()Ljava/lang/Class;
    //   751: astore #7
    //   753: aload #7
    //   755: ifnull -> 836
    //   758: aload #7
    //   760: invokevirtual isPrimitive : ()Z
    //   763: ifne -> 836
    //   766: goto -> 773
    //   769: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   772: athrow
    //   773: aload #7
    //   775: invokevirtual getPackage : ()Ljava/lang/Package;
    //   778: ifnull -> 836
    //   781: goto -> 788
    //   784: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   787: athrow
    //   788: aload #7
    //   790: invokevirtual getPackage : ()Ljava/lang/Package;
    //   793: invokevirtual getName : ()Ljava/lang/String;
    //   796: ifnull -> 836
    //   799: goto -> 806
    //   802: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   805: athrow
    //   806: aload #7
    //   808: invokevirtual getPackage : ()Ljava/lang/Package;
    //   811: invokevirtual getName : ()Ljava/lang/String;
    //   814: sipush #9593
    //   817: sipush #5966
    //   820: invokestatic a : (II)Ljava/lang/String;
    //   823: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   826: ifne -> 836
    //   829: goto -> 836
    //   832: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   835: athrow
    //   836: aload #6
    //   838: iconst_1
    //   839: invokevirtual setAccessible : (Z)V
    //   842: aload #6
    //   844: aconst_null
    //   845: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   848: pop
    //   849: iinc #5, 1
    //   852: iload_2
    //   853: ifeq -> 715
    //   856: sipush #9569
    //   859: sipush #7949
    //   862: invokestatic a : (II)Ljava/lang/String;
    //   865: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   868: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   871: astore_3
    //   872: aload_3
    //   873: arraylength
    //   874: istore #4
    //   876: iconst_0
    //   877: istore #5
    //   879: iload #5
    //   881: iload #4
    //   883: if_icmpge -> 1015
    //   886: aload_3
    //   887: iload #5
    //   889: aaload
    //   890: astore #6
    //   892: aload #6
    //   894: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   897: pop
    //   898: aload #6
    //   900: invokevirtual getModifiers : ()I
    //   903: invokestatic isStatic : (I)Z
    //   906: ifeq -> 1001
    //   909: aload #6
    //   911: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   914: arraylength
    //   915: iconst_2
    //   916: if_icmpne -> 1001
    //   919: goto -> 926
    //   922: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   925: athrow
    //   926: aload #6
    //   928: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   931: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   934: invokevirtual equals : (Ljava/lang/Object;)Z
    //   937: ifeq -> 1001
    //   940: goto -> 947
    //   943: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   946: athrow
    //   947: aload #6
    //   949: iconst_1
    //   950: invokevirtual setAccessible : (Z)V
    //   953: aload #6
    //   955: aconst_null
    //   956: iconst_2
    //   957: anewarray java/lang/Object
    //   960: dup
    //   961: iconst_0
    //   962: aload_0
    //   963: aastore
    //   964: dup
    //   965: iconst_1
    //   966: aload_1
    //   967: ifnonnull -> 985
    //   970: goto -> 977
    //   973: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   976: athrow
    //   977: aload_1
    //   978: goto -> 992
    //   981: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   984: athrow
    //   985: aload_1
    //   986: checkcast [B
    //   989: invokevirtual clone : ()Ljava/lang/Object;
    //   992: aastore
    //   993: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   996: pop
    //   997: iload_2
    //   998: ifeq -> 1015
    //   1001: iinc #5, 1
    //   1004: iload_2
    //   1005: ifeq -> 879
    //   1008: goto -> 1015
    //   1011: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1014: athrow
    //   1015: getstatic burp/Zemp.Zr : Ljava/lang/Object;
    //   1018: checkcast java/math/BigInteger
    //   1021: invokevirtual toByteArray : ()[B
    //   1024: astore_3
    //   1025: aload_3
    //   1026: arraylength
    //   1027: iconst_2
    //   1028: iadd
    //   1029: newarray byte
    //   1031: astore #5
    //   1033: iconst_0
    //   1034: istore #6
    //   1036: iload #6
    //   1038: aload_3
    //   1039: arraylength
    //   1040: if_icmpge -> 1059
    //   1043: aload #5
    //   1045: iload #6
    //   1047: aload_3
    //   1048: iload #6
    //   1050: baload
    //   1051: bastore
    //   1052: iinc #6, 1
    //   1055: iload_2
    //   1056: ifeq -> 1036
    //   1059: aload #5
    //   1061: arraylength
    //   1062: iconst_3
    //   1063: idiv
    //   1064: iconst_4
    //   1065: imul
    //   1066: newarray byte
    //   1068: astore #4
    //   1070: iconst_0
    //   1071: istore #6
    //   1073: iconst_0
    //   1074: istore #7
    //   1076: iload #6
    //   1078: aload_3
    //   1079: arraylength
    //   1080: if_icmpge -> 1191
    //   1083: aload #4
    //   1085: iload #7
    //   1087: aload #5
    //   1089: iload #6
    //   1091: baload
    //   1092: iconst_2
    //   1093: iushr
    //   1094: bipush #63
    //   1096: iand
    //   1097: i2b
    //   1098: bastore
    //   1099: aload #4
    //   1101: iload #7
    //   1103: iconst_1
    //   1104: iadd
    //   1105: aload #5
    //   1107: iload #6
    //   1109: iconst_1
    //   1110: iadd
    //   1111: baload
    //   1112: iconst_4
    //   1113: iushr
    //   1114: bipush #15
    //   1116: iand
    //   1117: aload #5
    //   1119: iload #6
    //   1121: baload
    //   1122: iconst_4
    //   1123: ishl
    //   1124: bipush #63
    //   1126: iand
    //   1127: ior
    //   1128: i2b
    //   1129: bastore
    //   1130: aload #4
    //   1132: iload #7
    //   1134: iconst_2
    //   1135: iadd
    //   1136: aload #5
    //   1138: iload #6
    //   1140: iconst_2
    //   1141: iadd
    //   1142: baload
    //   1143: bipush #6
    //   1145: iushr
    //   1146: iconst_3
    //   1147: iand
    //   1148: aload #5
    //   1150: iload #6
    //   1152: iconst_1
    //   1153: iadd
    //   1154: baload
    //   1155: iconst_2
    //   1156: ishl
    //   1157: bipush #63
    //   1159: iand
    //   1160: ior
    //   1161: i2b
    //   1162: bastore
    //   1163: aload #4
    //   1165: iload #7
    //   1167: iconst_3
    //   1168: iadd
    //   1169: aload #5
    //   1171: iload #6
    //   1173: iconst_2
    //   1174: iadd
    //   1175: baload
    //   1176: bipush #63
    //   1178: iand
    //   1179: i2b
    //   1180: bastore
    //   1181: iinc #6, 3
    //   1184: iinc #7, 4
    //   1187: iload_2
    //   1188: ifeq -> 1076
    //   1191: iconst_0
    //   1192: istore #6
    //   1194: iload #6
    //   1196: aload #4
    //   1198: arraylength
    //   1199: if_icmpge -> 1383
    //   1202: aload #4
    //   1204: iload #6
    //   1206: baload
    //   1207: bipush #26
    //   1209: if_icmpge -> 1237
    //   1212: aload #4
    //   1214: iload #6
    //   1216: aload #4
    //   1218: iload #6
    //   1220: baload
    //   1221: bipush #65
    //   1223: iadd
    //   1224: i2b
    //   1225: bastore
    //   1226: iload_2
    //   1227: ifeq -> 1376
    //   1230: goto -> 1237
    //   1233: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1236: athrow
    //   1237: aload #4
    //   1239: iload #6
    //   1241: baload
    //   1242: bipush #52
    //   1244: if_icmpge -> 1282
    //   1247: goto -> 1254
    //   1250: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1253: athrow
    //   1254: aload #4
    //   1256: iload #6
    //   1258: aload #4
    //   1260: iload #6
    //   1262: baload
    //   1263: bipush #97
    //   1265: iadd
    //   1266: bipush #26
    //   1268: isub
    //   1269: i2b
    //   1270: bastore
    //   1271: iload_2
    //   1272: ifeq -> 1376
    //   1275: goto -> 1282
    //   1278: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1281: athrow
    //   1282: aload #4
    //   1284: iload #6
    //   1286: baload
    //   1287: bipush #62
    //   1289: if_icmpge -> 1327
    //   1292: goto -> 1299
    //   1295: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1298: athrow
    //   1299: aload #4
    //   1301: iload #6
    //   1303: aload #4
    //   1305: iload #6
    //   1307: baload
    //   1308: bipush #48
    //   1310: iadd
    //   1311: bipush #52
    //   1313: isub
    //   1314: i2b
    //   1315: bastore
    //   1316: iload_2
    //   1317: ifeq -> 1376
    //   1320: goto -> 1327
    //   1323: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1326: athrow
    //   1327: aload #4
    //   1329: iload #6
    //   1331: baload
    //   1332: bipush #63
    //   1334: if_icmpge -> 1362
    //   1337: goto -> 1344
    //   1340: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1343: athrow
    //   1344: aload #4
    //   1346: iload #6
    //   1348: bipush #43
    //   1350: bastore
    //   1351: iload_2
    //   1352: ifeq -> 1376
    //   1355: goto -> 1362
    //   1358: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1361: athrow
    //   1362: aload #4
    //   1364: iload #6
    //   1366: bipush #47
    //   1368: bastore
    //   1369: goto -> 1376
    //   1372: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1375: athrow
    //   1376: iinc #6, 1
    //   1379: iload_2
    //   1380: ifeq -> 1194
    //   1383: aload #4
    //   1385: arraylength
    //   1386: iconst_1
    //   1387: isub
    //   1388: istore #6
    //   1390: iload #6
    //   1392: aload_3
    //   1393: arraylength
    //   1394: iconst_4
    //   1395: imul
    //   1396: iconst_3
    //   1397: idiv
    //   1398: if_icmple -> 1415
    //   1401: aload #4
    //   1403: iload #6
    //   1405: bipush #61
    //   1407: bastore
    //   1408: iinc #6, -1
    //   1411: iload_2
    //   1412: ifeq -> 1390
    //   1415: new java/io/ByteArrayOutputStream
    //   1418: dup
    //   1419: invokespecial <init> : ()V
    //   1422: astore_3
    //   1423: sipush #9598
    //   1426: aload_3
    //   1427: sipush #202
    //   1430: invokevirtual write : (I)V
    //   1433: sipush #21485
    //   1436: aload_3
    //   1437: sipush #254
    //   1440: invokevirtual write : (I)V
    //   1443: aload_3
    //   1444: sipush #186
    //   1447: invokevirtual write : (I)V
    //   1450: aload_3
    //   1451: sipush #190
    //   1454: invokevirtual write : (I)V
    //   1457: aload_3
    //   1458: iconst_0
    //   1459: invokevirtual write : (I)V
    //   1462: aload_3
    //   1463: iconst_1
    //   1464: invokevirtual write : (I)V
    //   1467: aload_3
    //   1468: iconst_0
    //   1469: invokevirtual write : (I)V
    //   1472: aload_3
    //   1473: bipush #50
    //   1475: invokevirtual write : (I)V
    //   1478: aload_3
    //   1479: getstatic burp/Zk8b.ZK : Ljava/lang/Object;
    //   1482: checkcast java/math/BigInteger
    //   1485: invokevirtual toByteArray : ()[B
    //   1488: invokevirtual write : ([B)V
    //   1491: aload_3
    //   1492: getstatic burp/Zgvl.ZK : Ljava/lang/Object;
    //   1495: checkcast java/math/BigInteger
    //   1498: invokevirtual toByteArray : ()[B
    //   1501: invokevirtual write : ([B)V
    //   1504: aload_3
    //   1505: getstatic burp/Zva.Zu : Ljava/lang/Object;
    //   1508: checkcast java/math/BigInteger
    //   1511: invokevirtual toByteArray : ()[B
    //   1514: invokevirtual write : ([B)V
    //   1517: aload_3
    //   1518: invokevirtual toByteArray : ()[B
    //   1521: astore #4
    //   1523: aconst_null
    //   1524: astore #5
    //   1526: invokestatic a : (II)Ljava/lang/String;
    //   1529: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1532: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1535: astore #6
    //   1537: aload #6
    //   1539: arraylength
    //   1540: istore #7
    //   1542: iconst_0
    //   1543: istore #8
    //   1545: iload #8
    //   1547: iload #7
    //   1549: if_icmpge -> 1677
    //   1552: aload #6
    //   1554: iload #8
    //   1556: aaload
    //   1557: astore #9
    //   1559: aload #9
    //   1561: invokevirtual getName : ()Ljava/lang/String;
    //   1564: sipush #9568
    //   1567: sipush #12942
    //   1570: invokestatic a : (II)Ljava/lang/String;
    //   1573: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1576: ifeq -> 1670
    //   1579: aload #9
    //   1581: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1584: astore #10
    //   1586: aload #10
    //   1588: arraylength
    //   1589: iconst_4
    //   1590: if_icmpeq -> 1600
    //   1593: goto -> 1670
    //   1596: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1599: athrow
    //   1600: aload #10
    //   1602: iconst_0
    //   1603: aaload
    //   1604: ldc java/lang/String
    //   1606: if_acmpeq -> 1616
    //   1609: goto -> 1670
    //   1612: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1615: athrow
    //   1616: aload #10
    //   1618: iconst_1
    //   1619: aaload
    //   1620: ldc [B
    //   1622: if_acmpeq -> 1632
    //   1625: goto -> 1670
    //   1628: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1631: athrow
    //   1632: aload #10
    //   1634: iconst_2
    //   1635: aaload
    //   1636: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1639: if_acmpeq -> 1649
    //   1642: goto -> 1670
    //   1645: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1648: athrow
    //   1649: aload #10
    //   1651: iconst_3
    //   1652: aaload
    //   1653: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1656: if_acmpeq -> 1666
    //   1659: goto -> 1670
    //   1662: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1665: athrow
    //   1666: aload #9
    //   1668: astore #5
    //   1670: iinc #8, 1
    //   1673: iload_2
    //   1674: ifeq -> 1545
    //   1677: aload #5
    //   1679: iconst_1
    //   1680: invokevirtual setAccessible : (Z)V
    //   1683: ldc burp/Zmt7
    //   1685: iconst_0
    //   1686: anewarray java/lang/Class
    //   1689: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   1692: astore #6
    //   1694: aload #6
    //   1696: iconst_1
    //   1697: invokevirtual setAccessible : (Z)V
    //   1700: aload #5
    //   1702: aload #6
    //   1704: iconst_0
    //   1705: anewarray java/lang/Object
    //   1708: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   1711: iconst_4
    //   1712: anewarray java/lang/Object
    //   1715: dup
    //   1716: iconst_0
    //   1717: sipush #9599
    //   1720: sipush #-23398
    //   1723: invokestatic a : (II)Ljava/lang/String;
    //   1726: aastore
    //   1727: dup
    //   1728: iconst_1
    //   1729: aload #4
    //   1731: aastore
    //   1732: dup
    //   1733: iconst_2
    //   1734: iconst_0
    //   1735: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1738: aastore
    //   1739: dup
    //   1740: iconst_3
    //   1741: aload #4
    //   1743: arraylength
    //   1744: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1747: aastore
    //   1748: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1751: pop
    //   1752: goto -> 1756
    //   1755: astore_3
    //   1756: iconst_0
    //   1757: istore_3
    //   1758: getstatic burp/Zm7v.ZX : Ljava/lang/String;
    //   1761: getstatic burp/Zb3l.Zl : Ljava/lang/Object;
    //   1764: checkcast java/math/BigInteger
    //   1767: invokevirtual intValue : ()I
    //   1770: bipush #32
    //   1772: irem
    //   1773: invokestatic abs : (I)I
    //   1776: invokevirtual charAt : (I)C
    //   1779: getstatic burp/Zrip.Zy : Ljava/lang/String;
    //   1782: getstatic burp/Zeva.Zf : Ljava/lang/Object;
    //   1785: checkcast java/math/BigInteger
    //   1788: invokevirtual intValue : ()I
    //   1791: bipush #32
    //   1793: irem
    //   1794: invokestatic abs : (I)I
    //   1797: invokevirtual charAt : (I)C
    //   1800: if_icmpgt -> 2144
    //   1803: sipush #9583
    //   1806: sipush #-7259
    //   1809: invokestatic a : (II)Ljava/lang/String;
    //   1812: iconst_1
    //   1813: ldc burp/Zm54
    //   1815: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1818: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1821: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1824: astore #4
    //   1826: aload #4
    //   1828: arraylength
    //   1829: istore #5
    //   1831: iconst_0
    //   1832: istore #6
    //   1834: iload #6
    //   1836: iload #5
    //   1838: if_icmpge -> 1976
    //   1841: aload #4
    //   1843: iload #6
    //   1845: aaload
    //   1846: astore #7
    //   1848: aload #7
    //   1850: invokevirtual getModifiers : ()I
    //   1853: invokestatic isStatic : (I)Z
    //   1856: ifne -> 1866
    //   1859: goto -> 1969
    //   1862: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1865: athrow
    //   1866: aload #7
    //   1868: invokevirtual getType : ()Ljava/lang/Class;
    //   1871: astore #8
    //   1873: aload #8
    //   1875: ifnull -> 1956
    //   1878: aload #8
    //   1880: invokevirtual isPrimitive : ()Z
    //   1883: ifne -> 1956
    //   1886: goto -> 1893
    //   1889: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1892: athrow
    //   1893: aload #8
    //   1895: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1898: ifnull -> 1956
    //   1901: goto -> 1908
    //   1904: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1907: athrow
    //   1908: aload #8
    //   1910: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1913: invokevirtual getName : ()Ljava/lang/String;
    //   1916: ifnull -> 1956
    //   1919: goto -> 1926
    //   1922: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1925: athrow
    //   1926: aload #8
    //   1928: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1931: invokevirtual getName : ()Ljava/lang/String;
    //   1934: sipush #9581
    //   1937: sipush #1439
    //   1940: invokestatic a : (II)Ljava/lang/String;
    //   1943: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1946: ifne -> 1956
    //   1949: goto -> 1956
    //   1952: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1955: athrow
    //   1956: aload #7
    //   1958: iconst_1
    //   1959: invokevirtual setAccessible : (Z)V
    //   1962: aload #7
    //   1964: aconst_null
    //   1965: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1968: pop
    //   1969: iinc #6, 1
    //   1972: iload_2
    //   1973: ifeq -> 1834
    //   1976: sipush #9586
    //   1979: sipush #-27441
    //   1982: invokestatic a : (II)Ljava/lang/String;
    //   1985: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1988: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1991: astore #4
    //   1993: aload #4
    //   1995: arraylength
    //   1996: istore #5
    //   1998: iconst_0
    //   1999: istore #6
    //   2001: iload #6
    //   2003: iload #5
    //   2005: if_icmpge -> 2141
    //   2008: aload #4
    //   2010: iload #6
    //   2012: aaload
    //   2013: astore #7
    //   2015: aload #7
    //   2017: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2020: pop
    //   2021: aload #7
    //   2023: invokevirtual getModifiers : ()I
    //   2026: invokestatic isStatic : (I)Z
    //   2029: ifeq -> 2127
    //   2032: aload #7
    //   2034: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2037: arraylength
    //   2038: iconst_2
    //   2039: if_icmpne -> 2127
    //   2042: goto -> 2049
    //   2045: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2048: athrow
    //   2049: aload #7
    //   2051: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2054: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2057: if_acmpne -> 2127
    //   2060: goto -> 2067
    //   2063: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2066: athrow
    //   2067: aload #7
    //   2069: iconst_1
    //   2070: invokevirtual setAccessible : (Z)V
    //   2073: aload #7
    //   2075: aconst_null
    //   2076: iconst_2
    //   2077: anewarray java/lang/Object
    //   2080: dup
    //   2081: iconst_0
    //   2082: aload_0
    //   2083: aastore
    //   2084: dup
    //   2085: iconst_1
    //   2086: aload_1
    //   2087: ifnonnull -> 2105
    //   2090: goto -> 2097
    //   2093: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2096: athrow
    //   2097: aload_1
    //   2098: goto -> 2112
    //   2101: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2104: athrow
    //   2105: aload_1
    //   2106: checkcast [B
    //   2109: invokevirtual clone : ()Ljava/lang/Object;
    //   2112: aastore
    //   2113: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2116: checkcast java/lang/Boolean
    //   2119: invokevirtual booleanValue : ()Z
    //   2122: istore_3
    //   2123: iload_2
    //   2124: ifeq -> 2141
    //   2127: iinc #6, 1
    //   2130: iload_2
    //   2131: ifeq -> 2001
    //   2134: goto -> 2141
    //   2137: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2140: athrow
    //   2141: goto -> 2482
    //   2144: sipush #9577
    //   2147: sipush #5046
    //   2150: invokestatic a : (II)Ljava/lang/String;
    //   2153: iconst_1
    //   2154: ldc burp/Zzco
    //   2156: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2159: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2162: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2165: astore #4
    //   2167: aload #4
    //   2169: arraylength
    //   2170: istore #5
    //   2172: iconst_0
    //   2173: istore #6
    //   2175: iload #6
    //   2177: iload #5
    //   2179: if_icmpge -> 2317
    //   2182: aload #4
    //   2184: iload #6
    //   2186: aaload
    //   2187: astore #7
    //   2189: aload #7
    //   2191: invokevirtual getModifiers : ()I
    //   2194: invokestatic isStatic : (I)Z
    //   2197: ifne -> 2207
    //   2200: goto -> 2310
    //   2203: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2206: athrow
    //   2207: aload #7
    //   2209: invokevirtual getType : ()Ljava/lang/Class;
    //   2212: astore #8
    //   2214: aload #8
    //   2216: ifnull -> 2297
    //   2219: aload #8
    //   2221: invokevirtual isPrimitive : ()Z
    //   2224: ifne -> 2297
    //   2227: goto -> 2234
    //   2230: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2233: athrow
    //   2234: aload #8
    //   2236: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2239: ifnull -> 2297
    //   2242: goto -> 2249
    //   2245: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2248: athrow
    //   2249: aload #8
    //   2251: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2254: invokevirtual getName : ()Ljava/lang/String;
    //   2257: ifnull -> 2297
    //   2260: goto -> 2267
    //   2263: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2266: athrow
    //   2267: aload #8
    //   2269: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2272: invokevirtual getName : ()Ljava/lang/String;
    //   2275: sipush #9581
    //   2278: sipush #1439
    //   2281: invokestatic a : (II)Ljava/lang/String;
    //   2284: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2287: ifne -> 2297
    //   2290: goto -> 2297
    //   2293: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2296: athrow
    //   2297: aload #7
    //   2299: iconst_1
    //   2300: invokevirtual setAccessible : (Z)V
    //   2303: aload #7
    //   2305: aconst_null
    //   2306: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2309: pop
    //   2310: iinc #6, 1
    //   2313: iload_2
    //   2314: ifeq -> 2175
    //   2317: sipush #9590
    //   2320: sipush #-7781
    //   2323: invokestatic a : (II)Ljava/lang/String;
    //   2326: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2329: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2332: astore #4
    //   2334: aload #4
    //   2336: arraylength
    //   2337: istore #5
    //   2339: iconst_0
    //   2340: istore #6
    //   2342: iload #6
    //   2344: iload #5
    //   2346: if_icmpge -> 2482
    //   2349: aload #4
    //   2351: iload #6
    //   2353: aaload
    //   2354: astore #7
    //   2356: aload #7
    //   2358: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2361: pop
    //   2362: aload #7
    //   2364: invokevirtual getModifiers : ()I
    //   2367: invokestatic isStatic : (I)Z
    //   2370: ifeq -> 2468
    //   2373: aload #7
    //   2375: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2378: arraylength
    //   2379: iconst_2
    //   2380: if_icmpne -> 2468
    //   2383: goto -> 2390
    //   2386: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2389: athrow
    //   2390: aload #7
    //   2392: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2395: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2398: if_acmpne -> 2468
    //   2401: goto -> 2408
    //   2404: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2407: athrow
    //   2408: aload #7
    //   2410: iconst_1
    //   2411: invokevirtual setAccessible : (Z)V
    //   2414: aload #7
    //   2416: aconst_null
    //   2417: iconst_2
    //   2418: anewarray java/lang/Object
    //   2421: dup
    //   2422: iconst_0
    //   2423: aload_0
    //   2424: aastore
    //   2425: dup
    //   2426: iconst_1
    //   2427: aload_1
    //   2428: ifnonnull -> 2446
    //   2431: goto -> 2438
    //   2434: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2437: athrow
    //   2438: aload_1
    //   2439: goto -> 2453
    //   2442: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2445: athrow
    //   2446: aload_1
    //   2447: checkcast [B
    //   2450: invokevirtual clone : ()Ljava/lang/Object;
    //   2453: aastore
    //   2454: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2457: checkcast java/lang/Boolean
    //   2460: invokevirtual booleanValue : ()Z
    //   2463: istore_3
    //   2464: iload_2
    //   2465: ifeq -> 2482
    //   2468: iinc #6, 1
    //   2471: iload_2
    //   2472: ifeq -> 2342
    //   2475: goto -> 2482
    //   2478: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2481: athrow
    //   2482: iload_3
    //   2483: ifeq -> 2488
    //   2486: iload_3
    //   2487: ireturn
    //   2488: getstatic burp/Zk9q.Zk : Ljava/lang/String;
    //   2491: getstatic burp/Zt0m.Zt : Ljava/lang/Object;
    //   2494: checkcast java/math/BigInteger
    //   2497: invokevirtual intValue : ()I
    //   2500: bipush #32
    //   2502: irem
    //   2503: invokestatic abs : (I)I
    //   2506: invokevirtual charAt : (I)C
    //   2509: getstatic burp/Zg7u.ZA : Ljava/lang/String;
    //   2512: getstatic burp/Zbx4.Zw : Ljava/lang/Object;
    //   2515: checkcast java/math/BigInteger
    //   2518: invokevirtual intValue : ()I
    //   2521: bipush #32
    //   2523: irem
    //   2524: invokestatic abs : (I)I
    //   2527: invokevirtual charAt : (I)C
    //   2530: if_icmple -> 2875
    //   2533: sipush #9592
    //   2536: sipush #-11315
    //   2539: invokestatic a : (II)Ljava/lang/String;
    //   2542: iconst_1
    //   2543: ldc burp/Zsn6
    //   2545: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2548: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2551: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2554: astore #4
    //   2556: aload #4
    //   2558: arraylength
    //   2559: istore #5
    //   2561: iconst_0
    //   2562: istore #6
    //   2564: iload #6
    //   2566: iload #5
    //   2568: if_icmpge -> 2706
    //   2571: aload #4
    //   2573: iload #6
    //   2575: aaload
    //   2576: astore #7
    //   2578: aload #7
    //   2580: invokevirtual getModifiers : ()I
    //   2583: invokestatic isStatic : (I)Z
    //   2586: ifne -> 2596
    //   2589: goto -> 2699
    //   2592: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2595: athrow
    //   2596: aload #7
    //   2598: invokevirtual getType : ()Ljava/lang/Class;
    //   2601: astore #8
    //   2603: aload #8
    //   2605: ifnull -> 2686
    //   2608: aload #8
    //   2610: invokevirtual isPrimitive : ()Z
    //   2613: ifne -> 2686
    //   2616: goto -> 2623
    //   2619: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2622: athrow
    //   2623: aload #8
    //   2625: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2628: ifnull -> 2686
    //   2631: goto -> 2638
    //   2634: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2637: athrow
    //   2638: aload #8
    //   2640: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2643: invokevirtual getName : ()Ljava/lang/String;
    //   2646: ifnull -> 2686
    //   2649: goto -> 2656
    //   2652: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2655: athrow
    //   2656: aload #8
    //   2658: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2661: invokevirtual getName : ()Ljava/lang/String;
    //   2664: sipush #9581
    //   2667: sipush #1439
    //   2670: invokestatic a : (II)Ljava/lang/String;
    //   2673: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2676: ifne -> 2686
    //   2679: goto -> 2686
    //   2682: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2685: athrow
    //   2686: aload #7
    //   2688: iconst_1
    //   2689: invokevirtual setAccessible : (Z)V
    //   2692: aload #7
    //   2694: aconst_null
    //   2695: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2698: pop
    //   2699: iinc #6, 1
    //   2702: iload_2
    //   2703: ifeq -> 2564
    //   2706: sipush #9596
    //   2709: sipush #-30354
    //   2712: invokestatic a : (II)Ljava/lang/String;
    //   2715: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2718: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2721: astore #4
    //   2723: aload #4
    //   2725: arraylength
    //   2726: istore #5
    //   2728: iconst_0
    //   2729: istore #6
    //   2731: iload #6
    //   2733: iload #5
    //   2735: if_icmpge -> 2871
    //   2738: aload #4
    //   2740: iload #6
    //   2742: aaload
    //   2743: astore #7
    //   2745: aload #7
    //   2747: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2750: pop
    //   2751: aload #7
    //   2753: invokevirtual getModifiers : ()I
    //   2756: invokestatic isStatic : (I)Z
    //   2759: ifeq -> 2857
    //   2762: aload #7
    //   2764: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2767: arraylength
    //   2768: iconst_2
    //   2769: if_icmpne -> 2857
    //   2772: goto -> 2779
    //   2775: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2778: athrow
    //   2779: aload #7
    //   2781: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2784: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2787: if_acmpne -> 2857
    //   2790: goto -> 2797
    //   2793: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2796: athrow
    //   2797: aload #7
    //   2799: iconst_1
    //   2800: invokevirtual setAccessible : (Z)V
    //   2803: aload #7
    //   2805: aconst_null
    //   2806: iconst_2
    //   2807: anewarray java/lang/Object
    //   2810: dup
    //   2811: iconst_0
    //   2812: aload_0
    //   2813: aastore
    //   2814: dup
    //   2815: iconst_1
    //   2816: aload_1
    //   2817: ifnonnull -> 2835
    //   2820: goto -> 2827
    //   2823: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2826: athrow
    //   2827: aload_1
    //   2828: goto -> 2842
    //   2831: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2834: athrow
    //   2835: aload_1
    //   2836: checkcast [B
    //   2839: invokevirtual clone : ()Ljava/lang/Object;
    //   2842: aastore
    //   2843: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2846: checkcast java/lang/Boolean
    //   2849: invokevirtual booleanValue : ()Z
    //   2852: istore_3
    //   2853: iload_2
    //   2854: ifeq -> 2871
    //   2857: iinc #6, 1
    //   2860: iload_2
    //   2861: ifeq -> 2731
    //   2864: goto -> 2871
    //   2867: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2870: athrow
    //   2871: iload_2
    //   2872: ifeq -> 3213
    //   2875: sipush #9585
    //   2878: sipush #-30282
    //   2881: invokestatic a : (II)Ljava/lang/String;
    //   2884: iconst_1
    //   2885: ldc burp/Zz9p
    //   2887: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2890: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2893: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2896: astore #4
    //   2898: aload #4
    //   2900: arraylength
    //   2901: istore #5
    //   2903: iconst_0
    //   2904: istore #6
    //   2906: iload #6
    //   2908: iload #5
    //   2910: if_icmpge -> 3048
    //   2913: aload #4
    //   2915: iload #6
    //   2917: aaload
    //   2918: astore #7
    //   2920: aload #7
    //   2922: invokevirtual getModifiers : ()I
    //   2925: invokestatic isStatic : (I)Z
    //   2928: ifne -> 2938
    //   2931: goto -> 3041
    //   2934: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2937: athrow
    //   2938: aload #7
    //   2940: invokevirtual getType : ()Ljava/lang/Class;
    //   2943: astore #8
    //   2945: aload #8
    //   2947: ifnull -> 3028
    //   2950: aload #8
    //   2952: invokevirtual isPrimitive : ()Z
    //   2955: ifne -> 3028
    //   2958: goto -> 2965
    //   2961: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2964: athrow
    //   2965: aload #8
    //   2967: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2970: ifnull -> 3028
    //   2973: goto -> 2980
    //   2976: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2979: athrow
    //   2980: aload #8
    //   2982: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2985: invokevirtual getName : ()Ljava/lang/String;
    //   2988: ifnull -> 3028
    //   2991: goto -> 2998
    //   2994: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2997: athrow
    //   2998: aload #8
    //   3000: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3003: invokevirtual getName : ()Ljava/lang/String;
    //   3006: sipush #9581
    //   3009: sipush #1439
    //   3012: invokestatic a : (II)Ljava/lang/String;
    //   3015: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3018: ifne -> 3028
    //   3021: goto -> 3028
    //   3024: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3027: athrow
    //   3028: aload #7
    //   3030: iconst_1
    //   3031: invokevirtual setAccessible : (Z)V
    //   3034: aload #7
    //   3036: aconst_null
    //   3037: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3040: pop
    //   3041: iinc #6, 1
    //   3044: iload_2
    //   3045: ifeq -> 2906
    //   3048: sipush #9578
    //   3051: sipush #25987
    //   3054: invokestatic a : (II)Ljava/lang/String;
    //   3057: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3060: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3063: astore #4
    //   3065: aload #4
    //   3067: arraylength
    //   3068: istore #5
    //   3070: iconst_0
    //   3071: istore #6
    //   3073: iload #6
    //   3075: iload #5
    //   3077: if_icmpge -> 3213
    //   3080: aload #4
    //   3082: iload #6
    //   3084: aaload
    //   3085: astore #7
    //   3087: aload #7
    //   3089: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3092: pop
    //   3093: aload #7
    //   3095: invokevirtual getModifiers : ()I
    //   3098: invokestatic isStatic : (I)Z
    //   3101: ifeq -> 3199
    //   3104: aload #7
    //   3106: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3109: arraylength
    //   3110: iconst_2
    //   3111: if_icmpne -> 3199
    //   3114: goto -> 3121
    //   3117: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3120: athrow
    //   3121: aload #7
    //   3123: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3126: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3129: if_acmpne -> 3199
    //   3132: goto -> 3139
    //   3135: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3138: athrow
    //   3139: aload #7
    //   3141: iconst_1
    //   3142: invokevirtual setAccessible : (Z)V
    //   3145: aload #7
    //   3147: aconst_null
    //   3148: iconst_2
    //   3149: anewarray java/lang/Object
    //   3152: dup
    //   3153: iconst_0
    //   3154: aload_0
    //   3155: aastore
    //   3156: dup
    //   3157: iconst_1
    //   3158: aload_1
    //   3159: ifnonnull -> 3177
    //   3162: goto -> 3169
    //   3165: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3168: athrow
    //   3169: aload_1
    //   3170: goto -> 3184
    //   3173: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3176: athrow
    //   3177: aload_1
    //   3178: checkcast [B
    //   3181: invokevirtual clone : ()Ljava/lang/Object;
    //   3184: aastore
    //   3185: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3188: checkcast java/lang/Boolean
    //   3191: invokevirtual booleanValue : ()Z
    //   3194: istore_3
    //   3195: iload_2
    //   3196: ifeq -> 3213
    //   3199: iinc #6, 1
    //   3202: iload_2
    //   3203: ifeq -> 3073
    //   3206: goto -> 3213
    //   3209: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3212: athrow
    //   3213: iload_3
    //   3214: ifeq -> 3219
    //   3217: iload_3
    //   3218: ireturn
    //   3219: getstatic burp/Zeqx.Zu : Ljava/lang/String;
    //   3222: getstatic burp/Zsbo.ZG : Ljava/lang/Object;
    //   3225: checkcast java/math/BigInteger
    //   3228: invokevirtual intValue : ()I
    //   3231: bipush #32
    //   3233: irem
    //   3234: invokestatic abs : (I)I
    //   3237: invokevirtual charAt : (I)C
    //   3240: getstatic burp/Zxzv.ZI : Ljava/lang/String;
    //   3243: getstatic burp/Zrqe.ZX : Ljava/lang/Object;
    //   3246: checkcast java/math/BigInteger
    //   3249: invokevirtual intValue : ()I
    //   3252: bipush #32
    //   3254: irem
    //   3255: invokestatic abs : (I)I
    //   3258: invokevirtual charAt : (I)C
    //   3261: if_icmple -> 3606
    //   3264: sipush #9597
    //   3267: sipush #-14176
    //   3270: invokestatic a : (II)Ljava/lang/String;
    //   3273: iconst_1
    //   3274: ldc burp/Zrx5
    //   3276: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3279: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3282: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3285: astore #4
    //   3287: aload #4
    //   3289: arraylength
    //   3290: istore #5
    //   3292: iconst_0
    //   3293: istore #6
    //   3295: iload #6
    //   3297: iload #5
    //   3299: if_icmpge -> 3437
    //   3302: aload #4
    //   3304: iload #6
    //   3306: aaload
    //   3307: astore #7
    //   3309: aload #7
    //   3311: invokevirtual getModifiers : ()I
    //   3314: invokestatic isStatic : (I)Z
    //   3317: ifne -> 3327
    //   3320: goto -> 3430
    //   3323: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3326: athrow
    //   3327: aload #7
    //   3329: invokevirtual getType : ()Ljava/lang/Class;
    //   3332: astore #8
    //   3334: aload #8
    //   3336: ifnull -> 3417
    //   3339: aload #8
    //   3341: invokevirtual isPrimitive : ()Z
    //   3344: ifne -> 3417
    //   3347: goto -> 3354
    //   3350: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3353: athrow
    //   3354: aload #8
    //   3356: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3359: ifnull -> 3417
    //   3362: goto -> 3369
    //   3365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3368: athrow
    //   3369: aload #8
    //   3371: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3374: invokevirtual getName : ()Ljava/lang/String;
    //   3377: ifnull -> 3417
    //   3380: goto -> 3387
    //   3383: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3386: athrow
    //   3387: aload #8
    //   3389: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3392: invokevirtual getName : ()Ljava/lang/String;
    //   3395: sipush #9581
    //   3398: sipush #1439
    //   3401: invokestatic a : (II)Ljava/lang/String;
    //   3404: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3407: ifne -> 3417
    //   3410: goto -> 3417
    //   3413: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3416: athrow
    //   3417: aload #7
    //   3419: iconst_1
    //   3420: invokevirtual setAccessible : (Z)V
    //   3423: aload #7
    //   3425: aconst_null
    //   3426: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3429: pop
    //   3430: iinc #6, 1
    //   3433: iload_2
    //   3434: ifeq -> 3295
    //   3437: sipush #9571
    //   3440: sipush #-21250
    //   3443: invokestatic a : (II)Ljava/lang/String;
    //   3446: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3449: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3452: astore #4
    //   3454: aload #4
    //   3456: arraylength
    //   3457: istore #5
    //   3459: iconst_0
    //   3460: istore #6
    //   3462: iload #6
    //   3464: iload #5
    //   3466: if_icmpge -> 3602
    //   3469: aload #4
    //   3471: iload #6
    //   3473: aaload
    //   3474: astore #7
    //   3476: aload #7
    //   3478: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3481: pop
    //   3482: aload #7
    //   3484: invokevirtual getModifiers : ()I
    //   3487: invokestatic isStatic : (I)Z
    //   3490: ifeq -> 3588
    //   3493: aload #7
    //   3495: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3498: arraylength
    //   3499: iconst_2
    //   3500: if_icmpne -> 3588
    //   3503: goto -> 3510
    //   3506: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3509: athrow
    //   3510: aload #7
    //   3512: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3515: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3518: if_acmpne -> 3588
    //   3521: goto -> 3528
    //   3524: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3527: athrow
    //   3528: aload #7
    //   3530: iconst_1
    //   3531: invokevirtual setAccessible : (Z)V
    //   3534: aload #7
    //   3536: aconst_null
    //   3537: iconst_2
    //   3538: anewarray java/lang/Object
    //   3541: dup
    //   3542: iconst_0
    //   3543: aload_0
    //   3544: aastore
    //   3545: dup
    //   3546: iconst_1
    //   3547: aload_1
    //   3548: ifnonnull -> 3566
    //   3551: goto -> 3558
    //   3554: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3557: athrow
    //   3558: aload_1
    //   3559: goto -> 3573
    //   3562: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3565: athrow
    //   3566: aload_1
    //   3567: checkcast [B
    //   3570: invokevirtual clone : ()Ljava/lang/Object;
    //   3573: aastore
    //   3574: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3577: checkcast java/lang/Boolean
    //   3580: invokevirtual booleanValue : ()Z
    //   3583: istore_3
    //   3584: iload_2
    //   3585: ifeq -> 3602
    //   3588: iinc #6, 1
    //   3591: iload_2
    //   3592: ifeq -> 3462
    //   3595: goto -> 3602
    //   3598: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3601: athrow
    //   3602: iload_2
    //   3603: ifeq -> 3944
    //   3606: sipush #9587
    //   3609: sipush #-19553
    //   3612: invokestatic a : (II)Ljava/lang/String;
    //   3615: iconst_1
    //   3616: ldc burp/Zzh0
    //   3618: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3621: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3624: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3627: astore #4
    //   3629: aload #4
    //   3631: arraylength
    //   3632: istore #5
    //   3634: iconst_0
    //   3635: istore #6
    //   3637: iload #6
    //   3639: iload #5
    //   3641: if_icmpge -> 3779
    //   3644: aload #4
    //   3646: iload #6
    //   3648: aaload
    //   3649: astore #7
    //   3651: aload #7
    //   3653: invokevirtual getModifiers : ()I
    //   3656: invokestatic isStatic : (I)Z
    //   3659: ifne -> 3669
    //   3662: goto -> 3772
    //   3665: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3668: athrow
    //   3669: aload #7
    //   3671: invokevirtual getType : ()Ljava/lang/Class;
    //   3674: astore #8
    //   3676: aload #8
    //   3678: ifnull -> 3759
    //   3681: aload #8
    //   3683: invokevirtual isPrimitive : ()Z
    //   3686: ifne -> 3759
    //   3689: goto -> 3696
    //   3692: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3695: athrow
    //   3696: aload #8
    //   3698: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3701: ifnull -> 3759
    //   3704: goto -> 3711
    //   3707: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3710: athrow
    //   3711: aload #8
    //   3713: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3716: invokevirtual getName : ()Ljava/lang/String;
    //   3719: ifnull -> 3759
    //   3722: goto -> 3729
    //   3725: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3728: athrow
    //   3729: aload #8
    //   3731: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3734: invokevirtual getName : ()Ljava/lang/String;
    //   3737: sipush #9581
    //   3740: sipush #1439
    //   3743: invokestatic a : (II)Ljava/lang/String;
    //   3746: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3749: ifne -> 3759
    //   3752: goto -> 3759
    //   3755: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3758: athrow
    //   3759: aload #7
    //   3761: iconst_1
    //   3762: invokevirtual setAccessible : (Z)V
    //   3765: aload #7
    //   3767: aconst_null
    //   3768: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3771: pop
    //   3772: iinc #6, 1
    //   3775: iload_2
    //   3776: ifeq -> 3637
    //   3779: sipush #9591
    //   3782: sipush #-12386
    //   3785: invokestatic a : (II)Ljava/lang/String;
    //   3788: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3791: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3794: astore #4
    //   3796: aload #4
    //   3798: arraylength
    //   3799: istore #5
    //   3801: iconst_0
    //   3802: istore #6
    //   3804: iload #6
    //   3806: iload #5
    //   3808: if_icmpge -> 3944
    //   3811: aload #4
    //   3813: iload #6
    //   3815: aaload
    //   3816: astore #7
    //   3818: aload #7
    //   3820: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3823: pop
    //   3824: aload #7
    //   3826: invokevirtual getModifiers : ()I
    //   3829: invokestatic isStatic : (I)Z
    //   3832: ifeq -> 3930
    //   3835: aload #7
    //   3837: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3840: arraylength
    //   3841: iconst_2
    //   3842: if_icmpne -> 3930
    //   3845: goto -> 3852
    //   3848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3851: athrow
    //   3852: aload #7
    //   3854: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3857: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3860: if_acmpne -> 3930
    //   3863: goto -> 3870
    //   3866: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3869: athrow
    //   3870: aload #7
    //   3872: iconst_1
    //   3873: invokevirtual setAccessible : (Z)V
    //   3876: aload #7
    //   3878: aconst_null
    //   3879: iconst_2
    //   3880: anewarray java/lang/Object
    //   3883: dup
    //   3884: iconst_0
    //   3885: aload_0
    //   3886: aastore
    //   3887: dup
    //   3888: iconst_1
    //   3889: aload_1
    //   3890: ifnonnull -> 3908
    //   3893: goto -> 3900
    //   3896: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3899: athrow
    //   3900: aload_1
    //   3901: goto -> 3915
    //   3904: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3907: athrow
    //   3908: aload_1
    //   3909: checkcast [B
    //   3912: invokevirtual clone : ()Ljava/lang/Object;
    //   3915: aastore
    //   3916: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3919: checkcast java/lang/Boolean
    //   3922: invokevirtual booleanValue : ()Z
    //   3925: istore_3
    //   3926: iload_2
    //   3927: ifeq -> 3944
    //   3930: iinc #6, 1
    //   3933: iload_2
    //   3934: ifeq -> 3804
    //   3937: goto -> 3944
    //   3940: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3943: athrow
    //   3944: iload_3
    //   3945: ifeq -> 3950
    //   3948: iload_3
    //   3949: ireturn
    //   3950: getstatic burp/Zz7m.Zq : Ljava/lang/String;
    //   3953: getstatic burp/Zx4u.Zn : Ljava/lang/Object;
    //   3956: checkcast java/math/BigInteger
    //   3959: invokevirtual intValue : ()I
    //   3962: bipush #32
    //   3964: irem
    //   3965: invokestatic abs : (I)I
    //   3968: invokevirtual charAt : (I)C
    //   3971: getstatic burp/Zs5y.ZO : Ljava/lang/String;
    //   3974: getstatic burp/Zexl.ZG : Ljava/lang/Object;
    //   3977: checkcast java/math/BigInteger
    //   3980: invokevirtual intValue : ()I
    //   3983: bipush #32
    //   3985: irem
    //   3986: invokestatic abs : (I)I
    //   3989: invokevirtual charAt : (I)C
    //   3992: if_icmple -> 4337
    //   3995: sipush #9575
    //   3998: sipush #-15754
    //   4001: invokestatic a : (II)Ljava/lang/String;
    //   4004: iconst_1
    //   4005: ldc burp/Zzwl
    //   4007: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4010: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4013: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4016: astore #4
    //   4018: aload #4
    //   4020: arraylength
    //   4021: istore #5
    //   4023: iconst_0
    //   4024: istore #6
    //   4026: iload #6
    //   4028: iload #5
    //   4030: if_icmpge -> 4168
    //   4033: aload #4
    //   4035: iload #6
    //   4037: aaload
    //   4038: astore #7
    //   4040: aload #7
    //   4042: invokevirtual getModifiers : ()I
    //   4045: invokestatic isStatic : (I)Z
    //   4048: ifne -> 4058
    //   4051: goto -> 4161
    //   4054: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4057: athrow
    //   4058: aload #7
    //   4060: invokevirtual getType : ()Ljava/lang/Class;
    //   4063: astore #8
    //   4065: aload #8
    //   4067: ifnull -> 4148
    //   4070: aload #8
    //   4072: invokevirtual isPrimitive : ()Z
    //   4075: ifne -> 4148
    //   4078: goto -> 4085
    //   4081: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4084: athrow
    //   4085: aload #8
    //   4087: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4090: ifnull -> 4148
    //   4093: goto -> 4100
    //   4096: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4099: athrow
    //   4100: aload #8
    //   4102: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4105: invokevirtual getName : ()Ljava/lang/String;
    //   4108: ifnull -> 4148
    //   4111: goto -> 4118
    //   4114: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4117: athrow
    //   4118: aload #8
    //   4120: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4123: invokevirtual getName : ()Ljava/lang/String;
    //   4126: sipush #9581
    //   4129: sipush #1439
    //   4132: invokestatic a : (II)Ljava/lang/String;
    //   4135: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4138: ifne -> 4148
    //   4141: goto -> 4148
    //   4144: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4147: athrow
    //   4148: aload #7
    //   4150: iconst_1
    //   4151: invokevirtual setAccessible : (Z)V
    //   4154: aload #7
    //   4156: aconst_null
    //   4157: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4160: pop
    //   4161: iinc #6, 1
    //   4164: iload_2
    //   4165: ifeq -> 4026
    //   4168: sipush #9574
    //   4171: sipush #-31569
    //   4174: invokestatic a : (II)Ljava/lang/String;
    //   4177: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4180: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4183: astore #4
    //   4185: aload #4
    //   4187: arraylength
    //   4188: istore #5
    //   4190: iconst_0
    //   4191: istore #6
    //   4193: iload #6
    //   4195: iload #5
    //   4197: if_icmpge -> 4333
    //   4200: aload #4
    //   4202: iload #6
    //   4204: aaload
    //   4205: astore #7
    //   4207: aload #7
    //   4209: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4212: pop
    //   4213: aload #7
    //   4215: invokevirtual getModifiers : ()I
    //   4218: invokestatic isStatic : (I)Z
    //   4221: ifeq -> 4319
    //   4224: aload #7
    //   4226: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4229: arraylength
    //   4230: iconst_2
    //   4231: if_icmpne -> 4319
    //   4234: goto -> 4241
    //   4237: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4240: athrow
    //   4241: aload #7
    //   4243: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4246: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4249: if_acmpne -> 4319
    //   4252: goto -> 4259
    //   4255: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4258: athrow
    //   4259: aload #7
    //   4261: iconst_1
    //   4262: invokevirtual setAccessible : (Z)V
    //   4265: aload #7
    //   4267: aconst_null
    //   4268: iconst_2
    //   4269: anewarray java/lang/Object
    //   4272: dup
    //   4273: iconst_0
    //   4274: aload_0
    //   4275: aastore
    //   4276: dup
    //   4277: iconst_1
    //   4278: aload_1
    //   4279: ifnonnull -> 4297
    //   4282: goto -> 4289
    //   4285: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4288: athrow
    //   4289: aload_1
    //   4290: goto -> 4304
    //   4293: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4296: athrow
    //   4297: aload_1
    //   4298: checkcast [B
    //   4301: invokevirtual clone : ()Ljava/lang/Object;
    //   4304: aastore
    //   4305: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4308: checkcast java/lang/Boolean
    //   4311: invokevirtual booleanValue : ()Z
    //   4314: istore_3
    //   4315: iload_2
    //   4316: ifeq -> 4333
    //   4319: iinc #6, 1
    //   4322: iload_2
    //   4323: ifeq -> 4193
    //   4326: goto -> 4333
    //   4329: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4332: athrow
    //   4333: iload_2
    //   4334: ifeq -> 4675
    //   4337: sipush #9580
    //   4340: sipush #-8539
    //   4343: invokestatic a : (II)Ljava/lang/String;
    //   4346: iconst_1
    //   4347: ldc burp/Zgfq
    //   4349: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4352: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4355: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4358: astore #4
    //   4360: aload #4
    //   4362: arraylength
    //   4363: istore #5
    //   4365: iconst_0
    //   4366: istore #6
    //   4368: iload #6
    //   4370: iload #5
    //   4372: if_icmpge -> 4510
    //   4375: aload #4
    //   4377: iload #6
    //   4379: aaload
    //   4380: astore #7
    //   4382: aload #7
    //   4384: invokevirtual getModifiers : ()I
    //   4387: invokestatic isStatic : (I)Z
    //   4390: ifne -> 4400
    //   4393: goto -> 4503
    //   4396: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4399: athrow
    //   4400: aload #7
    //   4402: invokevirtual getType : ()Ljava/lang/Class;
    //   4405: astore #8
    //   4407: aload #8
    //   4409: ifnull -> 4490
    //   4412: aload #8
    //   4414: invokevirtual isPrimitive : ()Z
    //   4417: ifne -> 4490
    //   4420: goto -> 4427
    //   4423: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4426: athrow
    //   4427: aload #8
    //   4429: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4432: ifnull -> 4490
    //   4435: goto -> 4442
    //   4438: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4441: athrow
    //   4442: aload #8
    //   4444: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4447: invokevirtual getName : ()Ljava/lang/String;
    //   4450: ifnull -> 4490
    //   4453: goto -> 4460
    //   4456: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4459: athrow
    //   4460: aload #8
    //   4462: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4465: invokevirtual getName : ()Ljava/lang/String;
    //   4468: sipush #9581
    //   4471: sipush #1439
    //   4474: invokestatic a : (II)Ljava/lang/String;
    //   4477: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4480: ifne -> 4490
    //   4483: goto -> 4490
    //   4486: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4489: athrow
    //   4490: aload #7
    //   4492: iconst_1
    //   4493: invokevirtual setAccessible : (Z)V
    //   4496: aload #7
    //   4498: aconst_null
    //   4499: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4502: pop
    //   4503: iinc #6, 1
    //   4506: iload_2
    //   4507: ifeq -> 4368
    //   4510: sipush #9589
    //   4513: sipush #17509
    //   4516: invokestatic a : (II)Ljava/lang/String;
    //   4519: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4522: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4525: astore #4
    //   4527: aload #4
    //   4529: arraylength
    //   4530: istore #5
    //   4532: iconst_0
    //   4533: istore #6
    //   4535: iload #6
    //   4537: iload #5
    //   4539: if_icmpge -> 4675
    //   4542: aload #4
    //   4544: iload #6
    //   4546: aaload
    //   4547: astore #7
    //   4549: aload #7
    //   4551: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4554: pop
    //   4555: aload #7
    //   4557: invokevirtual getModifiers : ()I
    //   4560: invokestatic isStatic : (I)Z
    //   4563: ifeq -> 4661
    //   4566: aload #7
    //   4568: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4571: arraylength
    //   4572: iconst_2
    //   4573: if_icmpne -> 4661
    //   4576: goto -> 4583
    //   4579: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4582: athrow
    //   4583: aload #7
    //   4585: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4588: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4591: if_acmpne -> 4661
    //   4594: goto -> 4601
    //   4597: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4600: athrow
    //   4601: aload #7
    //   4603: iconst_1
    //   4604: invokevirtual setAccessible : (Z)V
    //   4607: aload #7
    //   4609: aconst_null
    //   4610: iconst_2
    //   4611: anewarray java/lang/Object
    //   4614: dup
    //   4615: iconst_0
    //   4616: aload_0
    //   4617: aastore
    //   4618: dup
    //   4619: iconst_1
    //   4620: aload_1
    //   4621: ifnonnull -> 4639
    //   4624: goto -> 4631
    //   4627: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4630: athrow
    //   4631: aload_1
    //   4632: goto -> 4646
    //   4635: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4638: athrow
    //   4639: aload_1
    //   4640: checkcast [B
    //   4643: invokevirtual clone : ()Ljava/lang/Object;
    //   4646: aastore
    //   4647: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4650: checkcast java/lang/Boolean
    //   4653: invokevirtual booleanValue : ()Z
    //   4656: istore_3
    //   4657: iload_2
    //   4658: ifeq -> 4675
    //   4661: iinc #6, 1
    //   4664: iload_2
    //   4665: ifeq -> 4535
    //   4668: goto -> 4675
    //   4671: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4674: athrow
    //   4675: iload_3
    //   4676: ireturn
    //   4677: astore_3
    //   4678: new java/lang/Exception
    //   4681: dup
    //   4682: aload_3
    //   4683: invokevirtual getMessage : ()Ljava/lang/String;
    //   4686: invokespecial <init> : (Ljava/lang/String;)V
    //   4689: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2487	4677	java/lang/Throwable
    //   309	333	336	java/lang/Throwable
    //   407	444	444	java/lang/Throwable
    //   448	469	469	java/lang/Throwable
    //   473	503	503	java/lang/Throwable
    //   728	742	742	java/lang/Throwable
    //   753	766	769	java/lang/Throwable
    //   758	781	784	java/lang/Throwable
    //   773	799	802	java/lang/Throwable
    //   788	829	832	java/lang/Throwable
    //   892	919	922	java/lang/Throwable
    //   909	940	943	java/lang/Throwable
    //   926	970	973	java/lang/Throwable
    //   947	981	981	java/lang/Throwable
    //   992	1008	1011	java/lang/Throwable
    //   1202	1230	1233	java/lang/Throwable
    //   1212	1247	1250	java/lang/Throwable
    //   1237	1275	1278	java/lang/Throwable
    //   1254	1292	1295	java/lang/Throwable
    //   1282	1320	1323	java/lang/Throwable
    //   1299	1337	1340	java/lang/Throwable
    //   1327	1355	1358	java/lang/Throwable
    //   1344	1369	1372	java/lang/Throwable
    //   1415	1752	1755	java/lang/Throwable
    //   1586	1596	1596	java/lang/Throwable
    //   1600	1612	1612	java/lang/Throwable
    //   1616	1628	1628	java/lang/Throwable
    //   1632	1645	1645	java/lang/Throwable
    //   1649	1662	1662	java/lang/Throwable
    //   1848	1862	1862	java/lang/Throwable
    //   1873	1886	1889	java/lang/Throwable
    //   1878	1901	1904	java/lang/Throwable
    //   1893	1919	1922	java/lang/Throwable
    //   1908	1949	1952	java/lang/Throwable
    //   2015	2042	2045	java/lang/Throwable
    //   2032	2060	2063	java/lang/Throwable
    //   2049	2090	2093	java/lang/Throwable
    //   2067	2101	2101	java/lang/Throwable
    //   2123	2134	2137	java/lang/Throwable
    //   2189	2203	2203	java/lang/Throwable
    //   2214	2227	2230	java/lang/Throwable
    //   2219	2242	2245	java/lang/Throwable
    //   2234	2260	2263	java/lang/Throwable
    //   2249	2290	2293	java/lang/Throwable
    //   2356	2383	2386	java/lang/Throwable
    //   2373	2401	2404	java/lang/Throwable
    //   2390	2431	2434	java/lang/Throwable
    //   2408	2442	2442	java/lang/Throwable
    //   2464	2475	2478	java/lang/Throwable
    //   2488	3218	4677	java/lang/Throwable
    //   2578	2592	2592	java/lang/Throwable
    //   2603	2616	2619	java/lang/Throwable
    //   2608	2631	2634	java/lang/Throwable
    //   2623	2649	2652	java/lang/Throwable
    //   2638	2679	2682	java/lang/Throwable
    //   2745	2772	2775	java/lang/Throwable
    //   2762	2790	2793	java/lang/Throwable
    //   2779	2820	2823	java/lang/Throwable
    //   2797	2831	2831	java/lang/Throwable
    //   2853	2864	2867	java/lang/Throwable
    //   2920	2934	2934	java/lang/Throwable
    //   2945	2958	2961	java/lang/Throwable
    //   2950	2973	2976	java/lang/Throwable
    //   2965	2991	2994	java/lang/Throwable
    //   2980	3021	3024	java/lang/Throwable
    //   3087	3114	3117	java/lang/Throwable
    //   3104	3132	3135	java/lang/Throwable
    //   3121	3162	3165	java/lang/Throwable
    //   3139	3173	3173	java/lang/Throwable
    //   3195	3206	3209	java/lang/Throwable
    //   3219	3949	4677	java/lang/Throwable
    //   3309	3323	3323	java/lang/Throwable
    //   3334	3347	3350	java/lang/Throwable
    //   3339	3362	3365	java/lang/Throwable
    //   3354	3380	3383	java/lang/Throwable
    //   3369	3410	3413	java/lang/Throwable
    //   3476	3503	3506	java/lang/Throwable
    //   3493	3521	3524	java/lang/Throwable
    //   3510	3551	3554	java/lang/Throwable
    //   3528	3562	3562	java/lang/Throwable
    //   3584	3595	3598	java/lang/Throwable
    //   3651	3665	3665	java/lang/Throwable
    //   3676	3689	3692	java/lang/Throwable
    //   3681	3704	3707	java/lang/Throwable
    //   3696	3722	3725	java/lang/Throwable
    //   3711	3752	3755	java/lang/Throwable
    //   3818	3845	3848	java/lang/Throwable
    //   3835	3863	3866	java/lang/Throwable
    //   3852	3893	3896	java/lang/Throwable
    //   3870	3904	3904	java/lang/Throwable
    //   3926	3937	3940	java/lang/Throwable
    //   3950	4676	4677	java/lang/Throwable
    //   4040	4054	4054	java/lang/Throwable
    //   4065	4078	4081	java/lang/Throwable
    //   4070	4093	4096	java/lang/Throwable
    //   4085	4111	4114	java/lang/Throwable
    //   4100	4141	4144	java/lang/Throwable
    //   4207	4234	4237	java/lang/Throwable
    //   4224	4252	4255	java/lang/Throwable
    //   4241	4282	4285	java/lang/Throwable
    //   4259	4293	4293	java/lang/Throwable
    //   4315	4326	4329	java/lang/Throwable
    //   4382	4396	4396	java/lang/Throwable
    //   4407	4420	4423	java/lang/Throwable
    //   4412	4435	4438	java/lang/Throwable
    //   4427	4453	4456	java/lang/Throwable
    //   4442	4483	4486	java/lang/Throwable
    //   4549	4576	4579	java/lang/Throwable
    //   4566	4594	4597	java/lang/Throwable
    //   4583	4624	4627	java/lang/Throwable
    //   4601	4635	4635	java/lang/Throwable
    //   4657	4668	4671	java/lang/Throwable
  }
  
  static void Z_(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #32
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '>}ãaaQ\\rÈ\\t^7ûÝ@w ÍÒ?Æ\ÖnôØËÛÞ§AÇÿ_-újbDìpï\\t¶pòÀCeHÜ.6\\tuÝLÆ¨6è\\tu¼Lê©êå  Á¯3§ºt6ùWÃW0&nÛÔ©>X`»Ö¿\\tN¤ N?Æ, Ü{\\bZ\\tëaYâ6!çÇOMÎ¡uØÇ#¤,\\bï\é(:T{ÚG'5Ú!×lÇ\\\nû¾ ¹ ­}ÛDºÑid2tnöÒö­úNÀ¬ÒHLØ°º¤ïM\\r¼gb¹\\r¤|g·~?ÝmÎÁ\\nÐH:~Úåaâºif=t¨°Í»×'Èéê§½\\bf#S4NM2¬Z\\t@!Î.1ÎÝS\\t¯ßÑ5'ÛÛÉ\\t\\nùeñ±C\\tÚ_×ÊÞ\\t?)XºõTE-4\\th×)48û8Ôf\\tùõp~sîn\\tÏðÝÐ¦gõ]\\bÊä}R²i{î(ôLñÓ{ÛPä;CD\\t|UA·U×D\\t\\bÉ%÷¹m\\tÅ\\roî¿ý\\tzW÷MÞ\\tÇMåÔ& WÔæ=åîyËêÐ()ð\\fïdfSÿ{x'CFè¬£î2'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #6
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
    //   68: ldc '\\f;sF/Õz(\\tØº¥Aõ!o,'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #116
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
    //   129: putstatic burp/Ztl6.a : [Ljava/lang/String;
    //   132: bipush #32
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztl6.b : [Ljava/lang/String;
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
    //   212: bipush #79
    //   214: goto -> 244
    //   217: bipush #124
    //   219: goto -> 244
    //   222: bipush #87
    //   224: goto -> 244
    //   227: bipush #44
    //   229: goto -> 244
    //   232: bipush #35
    //   234: goto -> 244
    //   237: bipush #26
    //   239: goto -> 244
    //   242: bipush #27
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
    //   300: sipush #9579
    //   303: sipush #-20541
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Ztl6.Zb : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #9570
    //   319: sipush #-22412
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Ztl6.ZQ : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2569) & 0xFFFF;
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
      char c = 'æ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztl6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */