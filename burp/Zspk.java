package burp;

import java.math.BigInteger;

class Zspk extends ClassLoader {
  static String ZA;
  
  static Object ZF;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zs(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZQ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Ztpg.Z_ : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: new java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #5
    //   23: aload #5
    //   25: sipush #-8111
    //   28: sipush #27565
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
    //   76: ifne -> 49
    //   79: aload #5
    //   81: sipush #-8097
    //   84: sipush #-19903
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: ldc ''
    //   92: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   95: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload #5
    //   104: sipush #-8110
    //   107: sipush #-24443
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
    //   202: ifne -> 158
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
    //   330: ifne -> 395
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
    //   553: ifne -> 302
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
    //   595: ifne -> 271
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
    //   679: ifne -> 637
    //   682: aload #14
    //   684: astore #4
    //   686: sipush #-8099
    //   689: sipush #-11374
    //   692: invokestatic a : (II)Ljava/lang/String;
    //   695: iconst_1
    //   696: ldc burp/Zltb
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
    //   814: sipush #-8103
    //   817: sipush #26475
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
    //   853: ifne -> 715
    //   856: sipush #-8108
    //   859: sipush #26739
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
    //   998: ifne -> 1015
    //   1001: iinc #5, 1
    //   1004: iload_2
    //   1005: ifne -> 879
    //   1008: goto -> 1015
    //   1011: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1014: athrow
    //   1015: new java/io/ByteArrayOutputStream
    //   1018: dup
    //   1019: invokespecial <init> : ()V
    //   1022: astore_3
    //   1023: sipush #-8098
    //   1026: aload_3
    //   1027: sipush #202
    //   1030: invokevirtual write : (I)V
    //   1033: sipush #21875
    //   1036: aload_3
    //   1037: sipush #254
    //   1040: invokevirtual write : (I)V
    //   1043: aload_3
    //   1044: sipush #186
    //   1047: invokevirtual write : (I)V
    //   1050: aload_3
    //   1051: sipush #190
    //   1054: invokevirtual write : (I)V
    //   1057: aload_3
    //   1058: iconst_0
    //   1059: invokevirtual write : (I)V
    //   1062: aload_3
    //   1063: iconst_1
    //   1064: invokevirtual write : (I)V
    //   1067: aload_3
    //   1068: iconst_0
    //   1069: invokevirtual write : (I)V
    //   1072: aload_3
    //   1073: bipush #50
    //   1075: invokevirtual write : (I)V
    //   1078: aload_3
    //   1079: getstatic burp/Zlhu.ZJ : Ljava/lang/Object;
    //   1082: checkcast java/math/BigInteger
    //   1085: invokevirtual toByteArray : ()[B
    //   1088: invokevirtual write : ([B)V
    //   1091: aload_3
    //   1092: getstatic burp/Zr4z.ZH : Ljava/lang/Object;
    //   1095: checkcast java/math/BigInteger
    //   1098: invokevirtual toByteArray : ()[B
    //   1101: invokevirtual write : ([B)V
    //   1104: aload_3
    //   1105: getstatic burp/Zeqo.ZZ : Ljava/lang/Object;
    //   1108: checkcast java/math/BigInteger
    //   1111: invokevirtual toByteArray : ()[B
    //   1114: invokevirtual write : ([B)V
    //   1117: aload_3
    //   1118: invokevirtual toByteArray : ()[B
    //   1121: astore #4
    //   1123: aconst_null
    //   1124: astore #5
    //   1126: invokestatic a : (II)Ljava/lang/String;
    //   1129: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1132: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1135: astore #6
    //   1137: aload #6
    //   1139: arraylength
    //   1140: istore #7
    //   1142: iconst_0
    //   1143: istore #8
    //   1145: iload #8
    //   1147: iload #7
    //   1149: if_icmpge -> 1277
    //   1152: aload #6
    //   1154: iload #8
    //   1156: aaload
    //   1157: astore #9
    //   1159: aload #9
    //   1161: invokevirtual getName : ()Ljava/lang/String;
    //   1164: sipush #-8100
    //   1167: sipush #3922
    //   1170: invokestatic a : (II)Ljava/lang/String;
    //   1173: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1176: ifeq -> 1270
    //   1179: aload #9
    //   1181: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1184: astore #10
    //   1186: aload #10
    //   1188: arraylength
    //   1189: iconst_4
    //   1190: if_icmpeq -> 1200
    //   1193: goto -> 1270
    //   1196: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1199: athrow
    //   1200: aload #10
    //   1202: iconst_0
    //   1203: aaload
    //   1204: ldc java/lang/String
    //   1206: if_acmpeq -> 1216
    //   1209: goto -> 1270
    //   1212: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1215: athrow
    //   1216: aload #10
    //   1218: iconst_1
    //   1219: aaload
    //   1220: ldc [B
    //   1222: if_acmpeq -> 1232
    //   1225: goto -> 1270
    //   1228: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1231: athrow
    //   1232: aload #10
    //   1234: iconst_2
    //   1235: aaload
    //   1236: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1239: if_acmpeq -> 1249
    //   1242: goto -> 1270
    //   1245: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1248: athrow
    //   1249: aload #10
    //   1251: iconst_3
    //   1252: aaload
    //   1253: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1256: if_acmpeq -> 1266
    //   1259: goto -> 1270
    //   1262: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1265: athrow
    //   1266: aload #9
    //   1268: astore #5
    //   1270: iinc #8, 1
    //   1273: iload_2
    //   1274: ifne -> 1145
    //   1277: aload #5
    //   1279: iconst_1
    //   1280: invokevirtual setAccessible : (Z)V
    //   1283: ldc burp/Zgz2
    //   1285: iconst_0
    //   1286: anewarray java/lang/Class
    //   1289: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   1292: astore #6
    //   1294: aload #6
    //   1296: iconst_1
    //   1297: invokevirtual setAccessible : (Z)V
    //   1300: aload #5
    //   1302: aload #6
    //   1304: iconst_0
    //   1305: anewarray java/lang/Object
    //   1308: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   1311: iconst_4
    //   1312: anewarray java/lang/Object
    //   1315: dup
    //   1316: iconst_0
    //   1317: sipush #-8104
    //   1320: sipush #26346
    //   1323: invokestatic a : (II)Ljava/lang/String;
    //   1326: aastore
    //   1327: dup
    //   1328: iconst_1
    //   1329: aload #4
    //   1331: aastore
    //   1332: dup
    //   1333: iconst_2
    //   1334: iconst_0
    //   1335: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1338: aastore
    //   1339: dup
    //   1340: iconst_3
    //   1341: aload #4
    //   1343: arraylength
    //   1344: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1347: aastore
    //   1348: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1351: pop
    //   1352: goto -> 1356
    //   1355: astore_3
    //   1356: iconst_0
    //   1357: istore_3
    //   1358: sipush #-8106
    //   1361: sipush #-11259
    //   1364: invokestatic a : (II)Ljava/lang/String;
    //   1367: iconst_1
    //   1368: ldc burp/Zry9
    //   1370: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1373: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1376: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1379: astore #4
    //   1381: aload #4
    //   1383: arraylength
    //   1384: istore #5
    //   1386: iconst_0
    //   1387: istore #6
    //   1389: iload #6
    //   1391: iload #5
    //   1393: if_icmpge -> 1531
    //   1396: aload #4
    //   1398: iload #6
    //   1400: aaload
    //   1401: astore #7
    //   1403: aload #7
    //   1405: invokevirtual getModifiers : ()I
    //   1408: invokestatic isStatic : (I)Z
    //   1411: ifne -> 1421
    //   1414: goto -> 1524
    //   1417: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1420: athrow
    //   1421: aload #7
    //   1423: invokevirtual getType : ()Ljava/lang/Class;
    //   1426: astore #8
    //   1428: aload #8
    //   1430: ifnull -> 1511
    //   1433: aload #8
    //   1435: invokevirtual isPrimitive : ()Z
    //   1438: ifne -> 1511
    //   1441: goto -> 1448
    //   1444: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1447: athrow
    //   1448: aload #8
    //   1450: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1453: ifnull -> 1511
    //   1456: goto -> 1463
    //   1459: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1462: athrow
    //   1463: aload #8
    //   1465: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1468: invokevirtual getName : ()Ljava/lang/String;
    //   1471: ifnull -> 1511
    //   1474: goto -> 1481
    //   1477: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1480: athrow
    //   1481: aload #8
    //   1483: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1486: invokevirtual getName : ()Ljava/lang/String;
    //   1489: sipush #-8101
    //   1492: sipush #22316
    //   1495: invokestatic a : (II)Ljava/lang/String;
    //   1498: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1501: ifne -> 1511
    //   1504: goto -> 1511
    //   1507: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1510: athrow
    //   1511: aload #7
    //   1513: iconst_1
    //   1514: invokevirtual setAccessible : (Z)V
    //   1517: aload #7
    //   1519: aconst_null
    //   1520: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1523: pop
    //   1524: iinc #6, 1
    //   1527: iload_2
    //   1528: ifne -> 1389
    //   1531: sipush #-8109
    //   1534: sipush #-22948
    //   1537: invokestatic a : (II)Ljava/lang/String;
    //   1540: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1543: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1546: astore #4
    //   1548: aload #4
    //   1550: arraylength
    //   1551: istore #5
    //   1553: iconst_0
    //   1554: istore #6
    //   1556: iload #6
    //   1558: iload #5
    //   1560: if_icmpge -> 1696
    //   1563: aload #4
    //   1565: iload #6
    //   1567: aaload
    //   1568: astore #7
    //   1570: aload #7
    //   1572: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1575: pop
    //   1576: aload #7
    //   1578: invokevirtual getModifiers : ()I
    //   1581: invokestatic isStatic : (I)Z
    //   1584: ifeq -> 1682
    //   1587: aload #7
    //   1589: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1592: arraylength
    //   1593: iconst_2
    //   1594: if_icmpne -> 1682
    //   1597: goto -> 1604
    //   1600: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1603: athrow
    //   1604: aload #7
    //   1606: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1609: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1612: if_acmpne -> 1682
    //   1615: goto -> 1622
    //   1618: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1621: athrow
    //   1622: aload #7
    //   1624: iconst_1
    //   1625: invokevirtual setAccessible : (Z)V
    //   1628: aload #7
    //   1630: aconst_null
    //   1631: iconst_2
    //   1632: anewarray java/lang/Object
    //   1635: dup
    //   1636: iconst_0
    //   1637: aload_0
    //   1638: aastore
    //   1639: dup
    //   1640: iconst_1
    //   1641: aload_1
    //   1642: ifnonnull -> 1660
    //   1645: goto -> 1652
    //   1648: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1651: athrow
    //   1652: aload_1
    //   1653: goto -> 1667
    //   1656: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1659: athrow
    //   1660: aload_1
    //   1661: checkcast [B
    //   1664: invokevirtual clone : ()Ljava/lang/Object;
    //   1667: aastore
    //   1668: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1671: checkcast java/lang/Boolean
    //   1674: invokevirtual booleanValue : ()Z
    //   1677: istore_3
    //   1678: iload_2
    //   1679: ifne -> 1696
    //   1682: iinc #6, 1
    //   1685: iload_2
    //   1686: ifne -> 1556
    //   1689: goto -> 1696
    //   1692: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1695: athrow
    //   1696: iload_3
    //   1697: ireturn
    //   1698: astore_3
    //   1699: new java/lang/Exception
    //   1702: dup
    //   1703: aload_3
    //   1704: invokevirtual getMessage : ()Ljava/lang/String;
    //   1707: invokespecial <init> : (Ljava/lang/String;)V
    //   1710: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1697	1698	java/lang/Throwable
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
    //   1015	1352	1355	java/lang/Throwable
    //   1186	1196	1196	java/lang/Throwable
    //   1200	1212	1212	java/lang/Throwable
    //   1216	1228	1228	java/lang/Throwable
    //   1232	1245	1245	java/lang/Throwable
    //   1249	1262	1262	java/lang/Throwable
    //   1403	1417	1417	java/lang/Throwable
    //   1428	1441	1444	java/lang/Throwable
    //   1433	1456	1459	java/lang/Throwable
    //   1448	1474	1477	java/lang/Throwable
    //   1463	1504	1507	java/lang/Throwable
    //   1570	1597	1600	java/lang/Throwable
    //   1587	1615	1618	java/lang/Throwable
    //   1604	1645	1648	java/lang/Throwable
    //   1622	1656	1656	java/lang/Throwable
    //   1678	1689	1692	java/lang/Throwable
  }
  
  static void Zn(Object paramObject) {
    Zxee.Zd = a(-8112, -6587);
    Zxee.Zj = new BigInteger(a(-8102, -4722));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zefn.Ze.charAt(Math.abs(((BigInteger)Ztc2.ZM).intValue() % 32)) > Zmfw.ZV.charAt(Math.abs(((BigInteger)Zza3.Zb).intValue() % 32))) {
          try {
            Zl3n.Zz(Class.forName(a(-8121, 23839)));
            if (!bool)
              Ze_e.Zi(Class.forName(a(-8107, -15528))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Ze_e.Zi(Class.forName(a(-8107, -15528)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '[ xìÆ]¶~¢mÎ¦ãíX'vÕ$+\\rÛ\\tìÂUÜ dÛ³\\tù³®äaî\\t¼ÔXUÖ²\\t´¼iÙËèv\\tÿtG94Ëã? ÃkH9Êef?*ÂÇø¶ÎH×Õï¹\\rVùÉîT½ Ý\\rÁúà:)£\\fÒµ\\tTó3=´cÄµzàþà%`qjnòH$¦hðICG,­ ·P?\\tÿAs%íBÚüÖñB\\rI-$M=ôVåb»èÃßsî!§­7®'2íôÕu\\bê\\t±å{ò_ «mXì\Í÷àTK© Y ã>jb`cIÀ¥!àìIXè@;j'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #88
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
    //   68: ldc 'zÛ%=O=\\tÖNç/N{'
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
    //   129: putstatic burp/Zspk.a : [Ljava/lang/String;
    //   132: bipush #17
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zspk.b : [Ljava/lang/String;
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
    //   212: bipush #63
    //   214: goto -> 244
    //   217: bipush #87
    //   219: goto -> 244
    //   222: bipush #100
    //   224: goto -> 244
    //   227: bipush #31
    //   229: goto -> 244
    //   232: bipush #51
    //   234: goto -> 244
    //   237: bipush #62
    //   239: goto -> 244
    //   242: bipush #83
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
    //   300: sipush #-8105
    //   303: sipush #-11517
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zspk.ZA : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #54
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #-99
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #80
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #-104
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-114
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #-111
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #-3
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #-6
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #-48
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #56
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #124
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #-93
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #13
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #25
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #-27
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #-10
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #96
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #29
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #34
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #-122
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #30
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #123
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #14
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #-60
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: bipush #-7
    //   464: bastore
    //   465: dup
    //   466: bipush #25
    //   468: bipush #46
    //   470: bastore
    //   471: dup
    //   472: bipush #26
    //   474: bipush #6
    //   476: bastore
    //   477: dup
    //   478: bipush #27
    //   480: bipush #31
    //   482: bastore
    //   483: dup
    //   484: bipush #28
    //   486: bipush #30
    //   488: bastore
    //   489: dup
    //   490: bipush #29
    //   492: bipush #99
    //   494: bastore
    //   495: dup
    //   496: bipush #30
    //   498: bipush #74
    //   500: bastore
    //   501: dup
    //   502: bipush #31
    //   504: bipush #33
    //   506: bastore
    //   507: invokespecial <init> : (I[B)V
    //   510: putstatic burp/Zspk.ZF : Ljava/lang/Object;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE057) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zspk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */