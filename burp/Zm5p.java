package burp;

import java.math.BigInteger;

class Zm5p extends ClassLoader {
  static String ZX;
  
  static Object Ze;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zr(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zh(Object paramObject) {
    Zmpp.Zk = a(4501, -8115);
    Zmpp.Z_ = new BigInteger(a(4509, -10403));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zlnq.ZQ.charAt(Math.abs(((BigInteger)Zro5.ZT).intValue() % 32)) > Zro5.ZY.charAt(Math.abs(((BigInteger)Zzxs.Zg).intValue() % 32))) {
          try {
            Zb20.Zy(Class.forName(a(4498, 31526)));
            if (!bool)
              Zmh0.ZU(Class.forName(a(4503, -4041))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zmh0.ZU(Class.forName(a(4503, -4041)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZC(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zrs0.Zz : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: new java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #5
    //   23: aload #5
    //   25: sipush #4508
    //   28: sipush #-12964
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
    //   81: sipush #4510
    //   84: sipush #4140
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: ldc ''
    //   92: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   95: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload #5
    //   104: sipush #4505
    //   107: sipush #1771
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
    //   686: sipush #4504
    //   689: sipush #-22516
    //   692: invokestatic a : (II)Ljava/lang/String;
    //   695: iconst_1
    //   696: ldc burp/Zgp_
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
    //   814: sipush #4500
    //   817: sipush #403
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
    //   856: sipush #4496
    //   859: sipush #-9707
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
    //   883: if_icmpge -> 994
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
    //   906: ifeq -> 980
    //   909: aload #6
    //   911: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   914: arraylength
    //   915: iconst_2
    //   916: if_icmpne -> 980
    //   919: goto -> 926
    //   922: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   925: athrow
    //   926: aload #6
    //   928: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   931: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   934: if_acmpne -> 980
    //   937: goto -> 944
    //   940: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   943: athrow
    //   944: aload #6
    //   946: iconst_1
    //   947: invokevirtual setAccessible : (Z)V
    //   950: aload #6
    //   952: aconst_null
    //   953: iconst_2
    //   954: anewarray java/lang/Object
    //   957: dup
    //   958: iconst_0
    //   959: aload_0
    //   960: aastore
    //   961: dup
    //   962: iconst_1
    //   963: aload_1
    //   964: aastore
    //   965: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   968: pop
    //   969: iload_2
    //   970: ifeq -> 994
    //   973: goto -> 980
    //   976: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   979: athrow
    //   980: iinc #5, 1
    //   983: iload_2
    //   984: ifeq -> 879
    //   987: goto -> 994
    //   990: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   993: athrow
    //   994: sipush #4502
    //   997: sipush #16526
    //   1000: invokestatic a : (II)Ljava/lang/String;
    //   1003: iconst_1
    //   1004: ldc burp/Zgs6
    //   1006: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1009: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1012: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1015: astore_3
    //   1016: aload_3
    //   1017: arraylength
    //   1018: istore #4
    //   1020: iconst_0
    //   1021: istore #5
    //   1023: iload #5
    //   1025: iload #4
    //   1027: if_icmpge -> 1164
    //   1030: aload_3
    //   1031: iload #5
    //   1033: aaload
    //   1034: astore #6
    //   1036: aload #6
    //   1038: invokevirtual getModifiers : ()I
    //   1041: invokestatic isStatic : (I)Z
    //   1044: ifne -> 1054
    //   1047: goto -> 1157
    //   1050: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1053: athrow
    //   1054: aload #6
    //   1056: invokevirtual getType : ()Ljava/lang/Class;
    //   1059: astore #7
    //   1061: aload #7
    //   1063: ifnull -> 1144
    //   1066: aload #7
    //   1068: invokevirtual isPrimitive : ()Z
    //   1071: ifne -> 1144
    //   1074: goto -> 1081
    //   1077: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1080: athrow
    //   1081: aload #7
    //   1083: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1086: ifnull -> 1144
    //   1089: goto -> 1096
    //   1092: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1095: athrow
    //   1096: aload #7
    //   1098: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1101: invokevirtual getName : ()Ljava/lang/String;
    //   1104: ifnull -> 1144
    //   1107: goto -> 1114
    //   1110: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1113: athrow
    //   1114: aload #7
    //   1116: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1119: invokevirtual getName : ()Ljava/lang/String;
    //   1122: sipush #4497
    //   1125: sipush #15112
    //   1128: invokestatic a : (II)Ljava/lang/String;
    //   1131: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1134: ifne -> 1144
    //   1137: goto -> 1144
    //   1140: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1143: athrow
    //   1144: aload #6
    //   1146: iconst_1
    //   1147: invokevirtual setAccessible : (Z)V
    //   1150: aload #6
    //   1152: aconst_null
    //   1153: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1156: pop
    //   1157: iinc #5, 1
    //   1160: iload_2
    //   1161: ifeq -> 1023
    //   1164: sipush #4511
    //   1167: sipush #-30158
    //   1170: invokestatic a : (II)Ljava/lang/String;
    //   1173: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1176: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1179: astore_3
    //   1180: aload_3
    //   1181: arraylength
    //   1182: istore #4
    //   1184: iconst_0
    //   1185: istore #5
    //   1187: iload #5
    //   1189: iload #4
    //   1191: if_icmpge -> 1323
    //   1194: aload_3
    //   1195: iload #5
    //   1197: aaload
    //   1198: astore #6
    //   1200: aload #6
    //   1202: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1205: pop
    //   1206: aload #6
    //   1208: invokevirtual getModifiers : ()I
    //   1211: invokestatic isStatic : (I)Z
    //   1214: ifeq -> 1309
    //   1217: aload #6
    //   1219: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1222: arraylength
    //   1223: iconst_2
    //   1224: if_icmpne -> 1309
    //   1227: goto -> 1234
    //   1230: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1233: athrow
    //   1234: aload #6
    //   1236: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1239: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1242: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1245: ifeq -> 1309
    //   1248: goto -> 1255
    //   1251: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1254: athrow
    //   1255: aload #6
    //   1257: iconst_1
    //   1258: invokevirtual setAccessible : (Z)V
    //   1261: aload #6
    //   1263: aconst_null
    //   1264: iconst_2
    //   1265: anewarray java/lang/Object
    //   1268: dup
    //   1269: iconst_0
    //   1270: aload_0
    //   1271: aastore
    //   1272: dup
    //   1273: iconst_1
    //   1274: aload_1
    //   1275: ifnonnull -> 1293
    //   1278: goto -> 1285
    //   1281: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1284: athrow
    //   1285: aload_1
    //   1286: goto -> 1300
    //   1289: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1292: athrow
    //   1293: aload_1
    //   1294: checkcast [B
    //   1297: invokevirtual clone : ()Ljava/lang/Object;
    //   1300: aastore
    //   1301: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1304: pop
    //   1305: iload_2
    //   1306: ifeq -> 1323
    //   1309: iinc #5, 1
    //   1312: iload_2
    //   1313: ifeq -> 1187
    //   1316: goto -> 1323
    //   1319: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1322: athrow
    //   1323: getstatic burp/Zzai.Zy : Ljava/lang/String;
    //   1326: getstatic burp/Ztp.Zp : Ljava/lang/Object;
    //   1329: checkcast java/math/BigInteger
    //   1332: invokevirtual intValue : ()I
    //   1335: bipush #32
    //   1337: irem
    //   1338: invokestatic abs : (I)I
    //   1341: invokevirtual charAt : (I)C
    //   1344: getstatic burp/Zsxo.ZW : Ljava/lang/String;
    //   1347: getstatic burp/Zx4w.Zp : Ljava/lang/Object;
    //   1350: checkcast java/math/BigInteger
    //   1353: invokevirtual intValue : ()I
    //   1356: bipush #32
    //   1358: irem
    //   1359: invokestatic abs : (I)I
    //   1362: invokevirtual charAt : (I)C
    //   1365: if_icmple -> 1472
    //   1368: getstatic burp/Ztex.Zx : Ljava/lang/String;
    //   1371: getstatic burp/Zx4w.Zp : Ljava/lang/Object;
    //   1374: checkcast java/math/BigInteger
    //   1377: invokevirtual intValue : ()I
    //   1380: bipush #32
    //   1382: irem
    //   1383: invokestatic abs : (I)I
    //   1386: invokevirtual charAt : (I)C
    //   1389: getstatic burp/Zg68.Zg : Ljava/lang/String;
    //   1392: getstatic burp/Zluk.Zz : Ljava/lang/Object;
    //   1395: checkcast java/math/BigInteger
    //   1398: invokevirtual intValue : ()I
    //   1401: bipush #32
    //   1403: irem
    //   1404: invokestatic abs : (I)I
    //   1407: invokevirtual charAt : (I)C
    //   1410: if_icmpgt -> 1472
    //   1413: goto -> 1420
    //   1416: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1419: athrow
    //   1420: getstatic burp/Zm0s.Zm : Ljava/lang/String;
    //   1423: getstatic burp/Zecm.ZJ : Ljava/lang/Object;
    //   1426: checkcast java/math/BigInteger
    //   1429: invokevirtual intValue : ()I
    //   1432: bipush #32
    //   1434: irem
    //   1435: invokestatic abs : (I)I
    //   1438: invokevirtual charAt : (I)C
    //   1441: getstatic burp/Zmcb.Zl : Ljava/lang/String;
    //   1444: getstatic burp/Zzr5.Za : Ljava/lang/Object;
    //   1447: checkcast java/math/BigInteger
    //   1450: invokevirtual intValue : ()I
    //   1453: bipush #32
    //   1455: irem
    //   1456: invokestatic abs : (I)I
    //   1459: invokevirtual charAt : (I)C
    //   1462: if_icmple -> 1480
    //   1465: goto -> 1472
    //   1468: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1471: athrow
    //   1472: iconst_1
    //   1473: goto -> 1481
    //   1476: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1479: athrow
    //   1480: iconst_0
    //   1481: ireturn
    //   1482: astore_3
    //   1483: new java/lang/Exception
    //   1486: dup
    //   1487: aload_3
    //   1488: invokevirtual getMessage : ()Ljava/lang/String;
    //   1491: invokespecial <init> : (Ljava/lang/String;)V
    //   1494: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1481	1482	java/lang/Throwable
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
    //   909	937	940	java/lang/Throwable
    //   926	973	976	java/lang/Throwable
    //   944	987	990	java/lang/Throwable
    //   1036	1050	1050	java/lang/Throwable
    //   1061	1074	1077	java/lang/Throwable
    //   1066	1089	1092	java/lang/Throwable
    //   1081	1107	1110	java/lang/Throwable
    //   1096	1137	1140	java/lang/Throwable
    //   1200	1227	1230	java/lang/Throwable
    //   1217	1248	1251	java/lang/Throwable
    //   1234	1278	1281	java/lang/Throwable
    //   1255	1289	1289	java/lang/Throwable
    //   1300	1316	1319	java/lang/Throwable
    //   1323	1413	1416	java/lang/Throwable
    //   1368	1465	1468	java/lang/Throwable
    //   1420	1476	1476	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'IõyÇ6¤·ë² ÉvûªPWËnj6$uÙj#éâ\\t=M*Z.ðÚI\\tX»wIºNÚ:\\tî,Pvau$Õ½ äýØÔ-OÔ¤3/î/»)çP0JãÜ±&ÒÂøz\\tÍãÒÇRwM}Ò\\t=Qáq£^öû\\rÕâ\\rzÜßA$¸£&­ÝêÄÊ1§ìÌÂÑ¨b'Û@>¥Í¦úhasùýÜË ®VsÐ 9zÿNû¡ïL.ê Raðý~´Dú<æn\\t0ÑÉB>[a·QÝÙê'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #32
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
    //   68: ldc 'á¬¸Ib«Ý#\\tSÆ\\fÀHÃª'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #14
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
    //   129: putstatic burp/Zm5p.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zm5p.b : [Ljava/lang/String;
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
    //   212: bipush #55
    //   214: goto -> 244
    //   217: bipush #25
    //   219: goto -> 244
    //   222: bipush #19
    //   224: goto -> 244
    //   227: bipush #95
    //   229: goto -> 244
    //   232: bipush #63
    //   234: goto -> 244
    //   237: bipush #80
    //   239: goto -> 244
    //   242: bipush #69
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
    //   300: sipush #4499
    //   303: sipush #-8195
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zm5p.ZX : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #56
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #9
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #-105
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #-46
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-49
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #123
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #-7
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #40
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #20
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #-125
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #-12
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #124
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #25
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #124
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #40
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #-20
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #44
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #-66
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #-92
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #-122
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #-120
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #116
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #56
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #-22
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: bipush #-92
    //   464: bastore
    //   465: dup
    //   466: bipush #25
    //   468: bipush #16
    //   470: bastore
    //   471: dup
    //   472: bipush #26
    //   474: bipush #43
    //   476: bastore
    //   477: dup
    //   478: bipush #27
    //   480: bipush #-115
    //   482: bastore
    //   483: dup
    //   484: bipush #28
    //   486: bipush #50
    //   488: bastore
    //   489: dup
    //   490: bipush #29
    //   492: bipush #10
    //   494: bastore
    //   495: dup
    //   496: bipush #30
    //   498: bipush #106
    //   500: bastore
    //   501: dup
    //   502: bipush #31
    //   504: bipush #-19
    //   506: bastore
    //   507: invokespecial <init> : (I[B)V
    //   510: putstatic burp/Zm5p.Ze : Ljava/lang/Object;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1195) & 0xFFFF;
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
      char c = 'ì';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm5p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */