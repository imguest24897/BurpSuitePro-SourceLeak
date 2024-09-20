package burp;

import java.math.BigInteger;

class Zelc extends ClassLoader {
  static Object ZR;
  
  static String ZI;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zj(Object paramObject) {
    Zr9b.ZC = a(13534, -26994);
    Zr9b.ZF = new BigInteger(a(13528, 5299));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Ztdx.Zl.charAt(Math.abs(((BigInteger)Zldt.ZS).intValue() % 32)) <= Zzbr.Zp.charAt(Math.abs(((BigInteger)Zzs9.ZO).intValue() % 32))) {
          try {
            Zbli.ZK(Class.forName(a(13533, 4577)));
            if (bool)
              Zrpy.Zn(Class.forName(a(13530, 17159))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zrpy.Zn(Class.forName(a(13530, 17159)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zk(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zry0.Zr : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: new java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #5
    //   23: aload #5
    //   25: sipush #13520
    //   28: sipush #-27587
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
    //   81: sipush #13521
    //   84: sipush #29330
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: ldc ''
    //   92: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   95: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload #5
    //   104: sipush #13531
    //   107: sipush #17271
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
    //   686: sipush #13525
    //   689: sipush #-2036
    //   692: invokestatic a : (II)Ljava/lang/String;
    //   695: iconst_1
    //   696: ldc burp/Zb2k
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
    //   814: sipush #13532
    //   817: sipush #11811
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
    //   856: sipush #13524
    //   859: sipush #-25610
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
    //   1015: getstatic burp/Zb9h.Zm : Ljava/lang/Object;
    //   1018: checkcast java/math/BigInteger
    //   1021: invokevirtual intValue : ()I
    //   1024: i2l
    //   1025: invokestatic currentTimeMillis : ()J
    //   1028: ladd
    //   1029: getstatic burp/Zb9h.Zm : Ljava/lang/Object;
    //   1032: checkcast java/math/BigInteger
    //   1035: invokevirtual intValue : ()I
    //   1038: i2l
    //   1039: lcmp
    //   1040: ifge -> 1372
    //   1043: sipush #13535
    //   1046: sipush #1429
    //   1049: invokestatic a : (II)Ljava/lang/String;
    //   1052: iconst_1
    //   1053: ldc burp/Zr8r
    //   1055: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1058: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1061: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1064: astore_3
    //   1065: aload_3
    //   1066: arraylength
    //   1067: istore #4
    //   1069: iconst_0
    //   1070: istore #5
    //   1072: iload #5
    //   1074: iload #4
    //   1076: if_icmpge -> 1213
    //   1079: aload_3
    //   1080: iload #5
    //   1082: aaload
    //   1083: astore #6
    //   1085: aload #6
    //   1087: invokevirtual getModifiers : ()I
    //   1090: invokestatic isStatic : (I)Z
    //   1093: ifne -> 1103
    //   1096: goto -> 1206
    //   1099: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1102: athrow
    //   1103: aload #6
    //   1105: invokevirtual getType : ()Ljava/lang/Class;
    //   1108: astore #7
    //   1110: aload #7
    //   1112: ifnull -> 1193
    //   1115: aload #7
    //   1117: invokevirtual isPrimitive : ()Z
    //   1120: ifne -> 1193
    //   1123: goto -> 1130
    //   1126: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1129: athrow
    //   1130: aload #7
    //   1132: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1135: ifnull -> 1193
    //   1138: goto -> 1145
    //   1141: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1144: athrow
    //   1145: aload #7
    //   1147: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1150: invokevirtual getName : ()Ljava/lang/String;
    //   1153: ifnull -> 1193
    //   1156: goto -> 1163
    //   1159: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1162: athrow
    //   1163: aload #7
    //   1165: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1168: invokevirtual getName : ()Ljava/lang/String;
    //   1171: sipush #13523
    //   1174: sipush #-3316
    //   1177: invokestatic a : (II)Ljava/lang/String;
    //   1180: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1183: ifne -> 1193
    //   1186: goto -> 1193
    //   1189: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1192: athrow
    //   1193: aload #6
    //   1195: iconst_1
    //   1196: invokevirtual setAccessible : (Z)V
    //   1199: aload #6
    //   1201: aconst_null
    //   1202: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1205: pop
    //   1206: iinc #5, 1
    //   1209: iload_2
    //   1210: ifne -> 1072
    //   1213: sipush #13522
    //   1216: sipush #-3602
    //   1219: invokestatic a : (II)Ljava/lang/String;
    //   1222: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1225: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1228: astore_3
    //   1229: aload_3
    //   1230: arraylength
    //   1231: istore #4
    //   1233: iconst_0
    //   1234: istore #5
    //   1236: iload #5
    //   1238: iload #4
    //   1240: if_icmpge -> 1372
    //   1243: aload_3
    //   1244: iload #5
    //   1246: aaload
    //   1247: astore #6
    //   1249: aload #6
    //   1251: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1254: pop
    //   1255: aload #6
    //   1257: invokevirtual getModifiers : ()I
    //   1260: invokestatic isStatic : (I)Z
    //   1263: ifeq -> 1358
    //   1266: aload #6
    //   1268: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1271: arraylength
    //   1272: iconst_2
    //   1273: if_icmpne -> 1358
    //   1276: goto -> 1283
    //   1279: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1282: athrow
    //   1283: aload #6
    //   1285: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1288: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1291: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1294: ifeq -> 1358
    //   1297: goto -> 1304
    //   1300: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1303: athrow
    //   1304: aload #6
    //   1306: iconst_1
    //   1307: invokevirtual setAccessible : (Z)V
    //   1310: aload #6
    //   1312: aconst_null
    //   1313: iconst_2
    //   1314: anewarray java/lang/Object
    //   1317: dup
    //   1318: iconst_0
    //   1319: aload_0
    //   1320: aastore
    //   1321: dup
    //   1322: iconst_1
    //   1323: aload_1
    //   1324: ifnonnull -> 1342
    //   1327: goto -> 1334
    //   1330: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1333: athrow
    //   1334: aload_1
    //   1335: goto -> 1349
    //   1338: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1341: athrow
    //   1342: aload_1
    //   1343: checkcast [B
    //   1346: invokevirtual clone : ()Ljava/lang/Object;
    //   1349: aastore
    //   1350: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1353: pop
    //   1354: iload_2
    //   1355: ifne -> 1372
    //   1358: iinc #5, 1
    //   1361: iload_2
    //   1362: ifne -> 1236
    //   1365: goto -> 1372
    //   1368: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1371: athrow
    //   1372: getstatic burp/Zlo2.ZJ : Ljava/lang/String;
    //   1375: getstatic burp/Zzs9.ZO : Ljava/lang/Object;
    //   1378: checkcast java/math/BigInteger
    //   1381: invokevirtual intValue : ()I
    //   1384: bipush #32
    //   1386: irem
    //   1387: invokestatic abs : (I)I
    //   1390: invokevirtual charAt : (I)C
    //   1393: getstatic burp/Zx4y.Zh : Ljava/lang/String;
    //   1396: getstatic burp/Zgw_.Zf : Ljava/lang/Object;
    //   1399: checkcast java/math/BigInteger
    //   1402: invokevirtual intValue : ()I
    //   1405: bipush #32
    //   1407: irem
    //   1408: invokestatic abs : (I)I
    //   1411: invokevirtual charAt : (I)C
    //   1414: if_icmple -> 1521
    //   1417: getstatic burp/Zlnq.ZQ : Ljava/lang/String;
    //   1420: getstatic burp/Zb0z.ZQ : Ljava/lang/Object;
    //   1423: checkcast java/math/BigInteger
    //   1426: invokevirtual intValue : ()I
    //   1429: bipush #32
    //   1431: irem
    //   1432: invokestatic abs : (I)I
    //   1435: invokevirtual charAt : (I)C
    //   1438: getstatic burp/Zmlu.ZF : Ljava/lang/String;
    //   1441: getstatic burp/Zb20.Zq : Ljava/lang/Object;
    //   1444: checkcast java/math/BigInteger
    //   1447: invokevirtual intValue : ()I
    //   1450: bipush #32
    //   1452: irem
    //   1453: invokestatic abs : (I)I
    //   1456: invokevirtual charAt : (I)C
    //   1459: if_icmple -> 1521
    //   1462: goto -> 1469
    //   1465: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1468: athrow
    //   1469: getstatic burp/Zrml.Zt : Ljava/lang/String;
    //   1472: getstatic burp/Zecw.ZE : Ljava/lang/Object;
    //   1475: checkcast java/math/BigInteger
    //   1478: invokevirtual intValue : ()I
    //   1481: bipush #32
    //   1483: irem
    //   1484: invokestatic abs : (I)I
    //   1487: invokevirtual charAt : (I)C
    //   1490: getstatic burp/Zrhu.ZJ : Ljava/lang/String;
    //   1493: getstatic burp/Zgt7.Zn : Ljava/lang/Object;
    //   1496: checkcast java/math/BigInteger
    //   1499: invokevirtual intValue : ()I
    //   1502: bipush #32
    //   1504: irem
    //   1505: invokestatic abs : (I)I
    //   1508: invokevirtual charAt : (I)C
    //   1511: if_icmpgt -> 1529
    //   1514: goto -> 1521
    //   1517: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1520: athrow
    //   1521: iconst_1
    //   1522: goto -> 1530
    //   1525: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1528: athrow
    //   1529: iconst_0
    //   1530: ireturn
    //   1531: astore_3
    //   1532: new java/lang/Exception
    //   1535: dup
    //   1536: aload_3
    //   1537: invokevirtual getMessage : ()Ljava/lang/String;
    //   1540: invokespecial <init> : (Ljava/lang/String;)V
    //   1543: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1530	1531	java/lang/Throwable
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
    //   1085	1099	1099	java/lang/Throwable
    //   1110	1123	1126	java/lang/Throwable
    //   1115	1138	1141	java/lang/Throwable
    //   1130	1156	1159	java/lang/Throwable
    //   1145	1186	1189	java/lang/Throwable
    //   1249	1276	1279	java/lang/Throwable
    //   1266	1297	1300	java/lang/Throwable
    //   1283	1327	1330	java/lang/Throwable
    //   1304	1338	1338	java/lang/Throwable
    //   1349	1365	1368	java/lang/Throwable
    //   1372	1462	1465	java/lang/Throwable
    //   1417	1514	1517	java/lang/Throwable
    //   1469	1525	1525	java/lang/Throwable
  }
  
  static void ZU(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'a!ÌSN7-ZàÀxîñÍÙz Æª~MZlÃ6jM0ô¡ïÆ`j\\f`-²¿{}¨ñâ±âÀ×\\rEzÐcWe:*¨¤çàÂµr¥¿|(S\\nÇ9kë\\nyñ÷«\\b|èIêñ\\tÖõ®`ã¹È)>\\täEkßÑN\\tÀVÐÙüä°á&\\tö HÊà³Ä M tªO2\ÞF³µVHr¤lúêFGe´ü¿eö¸±L 6¹Éx]ÂY¤+ês÷ê®O²l\\r\\rhr-ä©æ |8\\t^5Ñeùz'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #22
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
    //   68: ldc 'Cia¨pI0\\tÄ/`nPó?w'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
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
    //   129: putstatic burp/Zelc.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zelc.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #106
    //   214: goto -> 243
    //   217: bipush #59
    //   219: goto -> 243
    //   222: bipush #83
    //   224: goto -> 243
    //   227: iconst_2
    //   228: goto -> 243
    //   231: bipush #111
    //   233: goto -> 243
    //   236: bipush #115
    //   238: goto -> 243
    //   241: bipush #7
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
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #120
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-119
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #85
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #49
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #117
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #76
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #48
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #20
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #90
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #-121
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #-127
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #79
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #-123
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #12
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #-125
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #115
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #-56
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #-24
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #-108
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #36
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #6
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #-90
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #22
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #16
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #56
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #28
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #89
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #80
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #123
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #-49
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #21
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: iconst_2
    //   492: bastore
    //   493: invokespecial <init> : ([B)V
    //   496: putstatic burp/Zelc.ZR : Ljava/lang/Object;
    //   499: sipush #13529
    //   502: sipush #5631
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Zelc.ZI : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x34D9) & 0xFFFF;
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
      byte b1 = 66;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zelc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */