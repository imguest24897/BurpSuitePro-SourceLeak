package burp;

import java.math.BigInteger;

class Zsji extends ClassLoader {
  static Object Zg;
  
  static String Zr;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zw(Object paramObject) {
    Zkw.ZU = a(-10390, 4339);
    Zkw.ZY = new BigInteger(a(-10386, -21250));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zgil.ZK.charAt(Math.abs(((BigInteger)Zgh3.ZZ).intValue() % 32)) <= Zzi3.ZS.charAt(Math.abs(((BigInteger)Zz80.ZR).intValue() % 32))) {
          try {
            Zmjw.Za(Class.forName(a(-10381, -29440)));
            if (bool)
              Zz5l.Zy(Class.forName(a(-10396, -28143))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zz5l.Zy(Class.forName(a(-10396, -28143)));
    } catch (Throwable throwable) {}
  }
  
  static void ZG(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zk(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zts_.ZH : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: new java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #5
    //   23: aload #5
    //   25: sipush #-10372
    //   28: sipush #12932
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
    //   81: sipush #-10382
    //   84: sipush #-665
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: ldc ''
    //   92: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   95: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload #5
    //   104: sipush #-10397
    //   107: sipush #-19600
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
    //   686: sipush #-10371
    //   689: sipush #-11248
    //   692: invokestatic a : (II)Ljava/lang/String;
    //   695: iconst_1
    //   696: ldc burp/Zscs
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
    //   814: sipush #-10389
    //   817: sipush #25821
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
    //   856: sipush #-10392
    //   859: sipush #-12676
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
    //   1015: iconst_0
    //   1016: istore_3
    //   1017: getstatic burp/Zgz1.Zs : Ljava/lang/String;
    //   1020: getstatic burp/Zsvh.Zv : Ljava/lang/Object;
    //   1023: checkcast java/math/BigInteger
    //   1026: invokevirtual intValue : ()I
    //   1029: bipush #32
    //   1031: irem
    //   1032: invokestatic abs : (I)I
    //   1035: invokevirtual charAt : (I)C
    //   1038: getstatic burp/Zg_i.ZW : Ljava/lang/String;
    //   1041: getstatic burp/Zk52.Zu : Ljava/lang/Object;
    //   1044: checkcast java/math/BigInteger
    //   1047: invokevirtual intValue : ()I
    //   1050: bipush #32
    //   1052: irem
    //   1053: invokestatic abs : (I)I
    //   1056: invokevirtual charAt : (I)C
    //   1059: if_icmpgt -> 1403
    //   1062: sipush #-10400
    //   1065: sipush #6690
    //   1068: invokestatic a : (II)Ljava/lang/String;
    //   1071: iconst_1
    //   1072: ldc burp/Zz0j
    //   1074: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1077: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1080: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1083: astore #4
    //   1085: aload #4
    //   1087: arraylength
    //   1088: istore #5
    //   1090: iconst_0
    //   1091: istore #6
    //   1093: iload #6
    //   1095: iload #5
    //   1097: if_icmpge -> 1235
    //   1100: aload #4
    //   1102: iload #6
    //   1104: aaload
    //   1105: astore #7
    //   1107: aload #7
    //   1109: invokevirtual getModifiers : ()I
    //   1112: invokestatic isStatic : (I)Z
    //   1115: ifne -> 1125
    //   1118: goto -> 1228
    //   1121: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1124: athrow
    //   1125: aload #7
    //   1127: invokevirtual getType : ()Ljava/lang/Class;
    //   1130: astore #8
    //   1132: aload #8
    //   1134: ifnull -> 1215
    //   1137: aload #8
    //   1139: invokevirtual isPrimitive : ()Z
    //   1142: ifne -> 1215
    //   1145: goto -> 1152
    //   1148: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1151: athrow
    //   1152: aload #8
    //   1154: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1157: ifnull -> 1215
    //   1160: goto -> 1167
    //   1163: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1166: athrow
    //   1167: aload #8
    //   1169: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1172: invokevirtual getName : ()Ljava/lang/String;
    //   1175: ifnull -> 1215
    //   1178: goto -> 1185
    //   1181: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1184: athrow
    //   1185: aload #8
    //   1187: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1190: invokevirtual getName : ()Ljava/lang/String;
    //   1193: sipush #-10377
    //   1196: sipush #-13794
    //   1199: invokestatic a : (II)Ljava/lang/String;
    //   1202: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1205: ifne -> 1215
    //   1208: goto -> 1215
    //   1211: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1214: athrow
    //   1215: aload #7
    //   1217: iconst_1
    //   1218: invokevirtual setAccessible : (Z)V
    //   1221: aload #7
    //   1223: aconst_null
    //   1224: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1227: pop
    //   1228: iinc #6, 1
    //   1231: iload_2
    //   1232: ifeq -> 1093
    //   1235: sipush #-10370
    //   1238: sipush #18489
    //   1241: invokestatic a : (II)Ljava/lang/String;
    //   1244: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1247: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1250: astore #4
    //   1252: aload #4
    //   1254: arraylength
    //   1255: istore #5
    //   1257: iconst_0
    //   1258: istore #6
    //   1260: iload #6
    //   1262: iload #5
    //   1264: if_icmpge -> 1400
    //   1267: aload #4
    //   1269: iload #6
    //   1271: aaload
    //   1272: astore #7
    //   1274: aload #7
    //   1276: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1279: pop
    //   1280: aload #7
    //   1282: invokevirtual getModifiers : ()I
    //   1285: invokestatic isStatic : (I)Z
    //   1288: ifeq -> 1386
    //   1291: aload #7
    //   1293: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1296: arraylength
    //   1297: iconst_2
    //   1298: if_icmpne -> 1386
    //   1301: goto -> 1308
    //   1304: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1307: athrow
    //   1308: aload #7
    //   1310: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1313: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1316: if_acmpne -> 1386
    //   1319: goto -> 1326
    //   1322: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1325: athrow
    //   1326: aload #7
    //   1328: iconst_1
    //   1329: invokevirtual setAccessible : (Z)V
    //   1332: aload #7
    //   1334: aconst_null
    //   1335: iconst_2
    //   1336: anewarray java/lang/Object
    //   1339: dup
    //   1340: iconst_0
    //   1341: aload_0
    //   1342: aastore
    //   1343: dup
    //   1344: iconst_1
    //   1345: aload_1
    //   1346: ifnonnull -> 1364
    //   1349: goto -> 1356
    //   1352: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1355: athrow
    //   1356: aload_1
    //   1357: goto -> 1371
    //   1360: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1363: athrow
    //   1364: aload_1
    //   1365: checkcast [B
    //   1368: invokevirtual clone : ()Ljava/lang/Object;
    //   1371: aastore
    //   1372: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1375: checkcast java/lang/Boolean
    //   1378: invokevirtual booleanValue : ()Z
    //   1381: istore_3
    //   1382: iload_2
    //   1383: ifeq -> 1400
    //   1386: iinc #6, 1
    //   1389: iload_2
    //   1390: ifeq -> 1260
    //   1393: goto -> 1400
    //   1396: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1399: athrow
    //   1400: goto -> 1741
    //   1403: sipush #-10398
    //   1406: sipush #-7220
    //   1409: invokestatic a : (II)Ljava/lang/String;
    //   1412: iconst_1
    //   1413: ldc burp/Znp
    //   1415: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1418: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1421: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1424: astore #4
    //   1426: aload #4
    //   1428: arraylength
    //   1429: istore #5
    //   1431: iconst_0
    //   1432: istore #6
    //   1434: iload #6
    //   1436: iload #5
    //   1438: if_icmpge -> 1576
    //   1441: aload #4
    //   1443: iload #6
    //   1445: aaload
    //   1446: astore #7
    //   1448: aload #7
    //   1450: invokevirtual getModifiers : ()I
    //   1453: invokestatic isStatic : (I)Z
    //   1456: ifne -> 1466
    //   1459: goto -> 1569
    //   1462: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1465: athrow
    //   1466: aload #7
    //   1468: invokevirtual getType : ()Ljava/lang/Class;
    //   1471: astore #8
    //   1473: aload #8
    //   1475: ifnull -> 1556
    //   1478: aload #8
    //   1480: invokevirtual isPrimitive : ()Z
    //   1483: ifne -> 1556
    //   1486: goto -> 1493
    //   1489: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1492: athrow
    //   1493: aload #8
    //   1495: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1498: ifnull -> 1556
    //   1501: goto -> 1508
    //   1504: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1507: athrow
    //   1508: aload #8
    //   1510: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1513: invokevirtual getName : ()Ljava/lang/String;
    //   1516: ifnull -> 1556
    //   1519: goto -> 1526
    //   1522: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1525: athrow
    //   1526: aload #8
    //   1528: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1531: invokevirtual getName : ()Ljava/lang/String;
    //   1534: sipush #-10377
    //   1537: sipush #-13794
    //   1540: invokestatic a : (II)Ljava/lang/String;
    //   1543: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1546: ifne -> 1556
    //   1549: goto -> 1556
    //   1552: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1555: athrow
    //   1556: aload #7
    //   1558: iconst_1
    //   1559: invokevirtual setAccessible : (Z)V
    //   1562: aload #7
    //   1564: aconst_null
    //   1565: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1568: pop
    //   1569: iinc #6, 1
    //   1572: iload_2
    //   1573: ifeq -> 1434
    //   1576: sipush #-10388
    //   1579: sipush #-24416
    //   1582: invokestatic a : (II)Ljava/lang/String;
    //   1585: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1588: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1591: astore #4
    //   1593: aload #4
    //   1595: arraylength
    //   1596: istore #5
    //   1598: iconst_0
    //   1599: istore #6
    //   1601: iload #6
    //   1603: iload #5
    //   1605: if_icmpge -> 1741
    //   1608: aload #4
    //   1610: iload #6
    //   1612: aaload
    //   1613: astore #7
    //   1615: aload #7
    //   1617: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1620: pop
    //   1621: aload #7
    //   1623: invokevirtual getModifiers : ()I
    //   1626: invokestatic isStatic : (I)Z
    //   1629: ifeq -> 1727
    //   1632: aload #7
    //   1634: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1637: arraylength
    //   1638: iconst_2
    //   1639: if_icmpne -> 1727
    //   1642: goto -> 1649
    //   1645: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1648: athrow
    //   1649: aload #7
    //   1651: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1654: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1657: if_acmpne -> 1727
    //   1660: goto -> 1667
    //   1663: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1666: athrow
    //   1667: aload #7
    //   1669: iconst_1
    //   1670: invokevirtual setAccessible : (Z)V
    //   1673: aload #7
    //   1675: aconst_null
    //   1676: iconst_2
    //   1677: anewarray java/lang/Object
    //   1680: dup
    //   1681: iconst_0
    //   1682: aload_0
    //   1683: aastore
    //   1684: dup
    //   1685: iconst_1
    //   1686: aload_1
    //   1687: ifnonnull -> 1705
    //   1690: goto -> 1697
    //   1693: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1696: athrow
    //   1697: aload_1
    //   1698: goto -> 1712
    //   1701: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1704: athrow
    //   1705: aload_1
    //   1706: checkcast [B
    //   1709: invokevirtual clone : ()Ljava/lang/Object;
    //   1712: aastore
    //   1713: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1716: checkcast java/lang/Boolean
    //   1719: invokevirtual booleanValue : ()Z
    //   1722: istore_3
    //   1723: iload_2
    //   1724: ifeq -> 1741
    //   1727: iinc #6, 1
    //   1730: iload_2
    //   1731: ifeq -> 1601
    //   1734: goto -> 1741
    //   1737: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1740: athrow
    //   1741: iload_3
    //   1742: ifeq -> 1747
    //   1745: iload_3
    //   1746: ireturn
    //   1747: getstatic burp/Zgb9.Zk : Ljava/lang/String;
    //   1750: getstatic burp/Zzuh.ZV : Ljava/lang/Object;
    //   1753: checkcast java/math/BigInteger
    //   1756: invokevirtual intValue : ()I
    //   1759: bipush #32
    //   1761: irem
    //   1762: invokestatic abs : (I)I
    //   1765: invokevirtual charAt : (I)C
    //   1768: getstatic burp/Zep1.ZQ : Ljava/lang/String;
    //   1771: getstatic burp/Zg3v.Zk : Ljava/lang/Object;
    //   1774: checkcast java/math/BigInteger
    //   1777: invokevirtual intValue : ()I
    //   1780: bipush #32
    //   1782: irem
    //   1783: invokestatic abs : (I)I
    //   1786: invokevirtual charAt : (I)C
    //   1789: if_icmpgt -> 2134
    //   1792: sipush #-10394
    //   1795: sipush #-10593
    //   1798: invokestatic a : (II)Ljava/lang/String;
    //   1801: iconst_1
    //   1802: ldc burp/Zkw
    //   1804: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1807: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1810: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1813: astore #4
    //   1815: aload #4
    //   1817: arraylength
    //   1818: istore #5
    //   1820: iconst_0
    //   1821: istore #6
    //   1823: iload #6
    //   1825: iload #5
    //   1827: if_icmpge -> 1965
    //   1830: aload #4
    //   1832: iload #6
    //   1834: aaload
    //   1835: astore #7
    //   1837: aload #7
    //   1839: invokevirtual getModifiers : ()I
    //   1842: invokestatic isStatic : (I)Z
    //   1845: ifne -> 1855
    //   1848: goto -> 1958
    //   1851: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1854: athrow
    //   1855: aload #7
    //   1857: invokevirtual getType : ()Ljava/lang/Class;
    //   1860: astore #8
    //   1862: aload #8
    //   1864: ifnull -> 1945
    //   1867: aload #8
    //   1869: invokevirtual isPrimitive : ()Z
    //   1872: ifne -> 1945
    //   1875: goto -> 1882
    //   1878: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1881: athrow
    //   1882: aload #8
    //   1884: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1887: ifnull -> 1945
    //   1890: goto -> 1897
    //   1893: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1896: athrow
    //   1897: aload #8
    //   1899: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1902: invokevirtual getName : ()Ljava/lang/String;
    //   1905: ifnull -> 1945
    //   1908: goto -> 1915
    //   1911: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1914: athrow
    //   1915: aload #8
    //   1917: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1920: invokevirtual getName : ()Ljava/lang/String;
    //   1923: sipush #-10377
    //   1926: sipush #-13794
    //   1929: invokestatic a : (II)Ljava/lang/String;
    //   1932: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1935: ifne -> 1945
    //   1938: goto -> 1945
    //   1941: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1944: athrow
    //   1945: aload #7
    //   1947: iconst_1
    //   1948: invokevirtual setAccessible : (Z)V
    //   1951: aload #7
    //   1953: aconst_null
    //   1954: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1957: pop
    //   1958: iinc #6, 1
    //   1961: iload_2
    //   1962: ifeq -> 1823
    //   1965: sipush #-10380
    //   1968: sipush #-22544
    //   1971: invokestatic a : (II)Ljava/lang/String;
    //   1974: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1977: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1980: astore #4
    //   1982: aload #4
    //   1984: arraylength
    //   1985: istore #5
    //   1987: iconst_0
    //   1988: istore #6
    //   1990: iload #6
    //   1992: iload #5
    //   1994: if_icmpge -> 2130
    //   1997: aload #4
    //   1999: iload #6
    //   2001: aaload
    //   2002: astore #7
    //   2004: aload #7
    //   2006: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2009: pop
    //   2010: aload #7
    //   2012: invokevirtual getModifiers : ()I
    //   2015: invokestatic isStatic : (I)Z
    //   2018: ifeq -> 2116
    //   2021: aload #7
    //   2023: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2026: arraylength
    //   2027: iconst_2
    //   2028: if_icmpne -> 2116
    //   2031: goto -> 2038
    //   2034: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2037: athrow
    //   2038: aload #7
    //   2040: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2043: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2046: if_acmpne -> 2116
    //   2049: goto -> 2056
    //   2052: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2055: athrow
    //   2056: aload #7
    //   2058: iconst_1
    //   2059: invokevirtual setAccessible : (Z)V
    //   2062: aload #7
    //   2064: aconst_null
    //   2065: iconst_2
    //   2066: anewarray java/lang/Object
    //   2069: dup
    //   2070: iconst_0
    //   2071: aload_0
    //   2072: aastore
    //   2073: dup
    //   2074: iconst_1
    //   2075: aload_1
    //   2076: ifnonnull -> 2094
    //   2079: goto -> 2086
    //   2082: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2085: athrow
    //   2086: aload_1
    //   2087: goto -> 2101
    //   2090: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2093: athrow
    //   2094: aload_1
    //   2095: checkcast [B
    //   2098: invokevirtual clone : ()Ljava/lang/Object;
    //   2101: aastore
    //   2102: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2105: checkcast java/lang/Boolean
    //   2108: invokevirtual booleanValue : ()Z
    //   2111: istore_3
    //   2112: iload_2
    //   2113: ifeq -> 2130
    //   2116: iinc #6, 1
    //   2119: iload_2
    //   2120: ifeq -> 1990
    //   2123: goto -> 2130
    //   2126: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2129: athrow
    //   2130: iload_2
    //   2131: ifeq -> 2472
    //   2134: sipush #-10387
    //   2137: sipush #-15271
    //   2140: invokestatic a : (II)Ljava/lang/String;
    //   2143: iconst_1
    //   2144: ldc burp/Zgkp
    //   2146: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2149: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2152: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2155: astore #4
    //   2157: aload #4
    //   2159: arraylength
    //   2160: istore #5
    //   2162: iconst_0
    //   2163: istore #6
    //   2165: iload #6
    //   2167: iload #5
    //   2169: if_icmpge -> 2307
    //   2172: aload #4
    //   2174: iload #6
    //   2176: aaload
    //   2177: astore #7
    //   2179: aload #7
    //   2181: invokevirtual getModifiers : ()I
    //   2184: invokestatic isStatic : (I)Z
    //   2187: ifne -> 2197
    //   2190: goto -> 2300
    //   2193: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2196: athrow
    //   2197: aload #7
    //   2199: invokevirtual getType : ()Ljava/lang/Class;
    //   2202: astore #8
    //   2204: aload #8
    //   2206: ifnull -> 2287
    //   2209: aload #8
    //   2211: invokevirtual isPrimitive : ()Z
    //   2214: ifne -> 2287
    //   2217: goto -> 2224
    //   2220: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2223: athrow
    //   2224: aload #8
    //   2226: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2229: ifnull -> 2287
    //   2232: goto -> 2239
    //   2235: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2238: athrow
    //   2239: aload #8
    //   2241: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2244: invokevirtual getName : ()Ljava/lang/String;
    //   2247: ifnull -> 2287
    //   2250: goto -> 2257
    //   2253: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2256: athrow
    //   2257: aload #8
    //   2259: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2262: invokevirtual getName : ()Ljava/lang/String;
    //   2265: sipush #-10377
    //   2268: sipush #-13794
    //   2271: invokestatic a : (II)Ljava/lang/String;
    //   2274: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2277: ifne -> 2287
    //   2280: goto -> 2287
    //   2283: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2286: athrow
    //   2287: aload #7
    //   2289: iconst_1
    //   2290: invokevirtual setAccessible : (Z)V
    //   2293: aload #7
    //   2295: aconst_null
    //   2296: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2299: pop
    //   2300: iinc #6, 1
    //   2303: iload_2
    //   2304: ifeq -> 2165
    //   2307: sipush #-10383
    //   2310: sipush #15916
    //   2313: invokestatic a : (II)Ljava/lang/String;
    //   2316: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2319: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2322: astore #4
    //   2324: aload #4
    //   2326: arraylength
    //   2327: istore #5
    //   2329: iconst_0
    //   2330: istore #6
    //   2332: iload #6
    //   2334: iload #5
    //   2336: if_icmpge -> 2472
    //   2339: aload #4
    //   2341: iload #6
    //   2343: aaload
    //   2344: astore #7
    //   2346: aload #7
    //   2348: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2351: pop
    //   2352: aload #7
    //   2354: invokevirtual getModifiers : ()I
    //   2357: invokestatic isStatic : (I)Z
    //   2360: ifeq -> 2458
    //   2363: aload #7
    //   2365: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2368: arraylength
    //   2369: iconst_2
    //   2370: if_icmpne -> 2458
    //   2373: goto -> 2380
    //   2376: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2379: athrow
    //   2380: aload #7
    //   2382: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2385: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2388: if_acmpne -> 2458
    //   2391: goto -> 2398
    //   2394: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2397: athrow
    //   2398: aload #7
    //   2400: iconst_1
    //   2401: invokevirtual setAccessible : (Z)V
    //   2404: aload #7
    //   2406: aconst_null
    //   2407: iconst_2
    //   2408: anewarray java/lang/Object
    //   2411: dup
    //   2412: iconst_0
    //   2413: aload_0
    //   2414: aastore
    //   2415: dup
    //   2416: iconst_1
    //   2417: aload_1
    //   2418: ifnonnull -> 2436
    //   2421: goto -> 2428
    //   2424: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2427: athrow
    //   2428: aload_1
    //   2429: goto -> 2443
    //   2432: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2435: athrow
    //   2436: aload_1
    //   2437: checkcast [B
    //   2440: invokevirtual clone : ()Ljava/lang/Object;
    //   2443: aastore
    //   2444: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2447: checkcast java/lang/Boolean
    //   2450: invokevirtual booleanValue : ()Z
    //   2453: istore_3
    //   2454: iload_2
    //   2455: ifeq -> 2472
    //   2458: iinc #6, 1
    //   2461: iload_2
    //   2462: ifeq -> 2332
    //   2465: goto -> 2472
    //   2468: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2471: athrow
    //   2472: iload_3
    //   2473: ifeq -> 2478
    //   2476: iload_3
    //   2477: ireturn
    //   2478: getstatic burp/Zrc0.ZL : Ljava/lang/String;
    //   2481: getstatic burp/Zrqd.Zi : Ljava/lang/Object;
    //   2484: checkcast java/math/BigInteger
    //   2487: invokevirtual intValue : ()I
    //   2490: bipush #32
    //   2492: irem
    //   2493: invokestatic abs : (I)I
    //   2496: invokevirtual charAt : (I)C
    //   2499: getstatic burp/Zr3j.Zj : Ljava/lang/String;
    //   2502: getstatic burp/Zm3s.ZW : Ljava/lang/Object;
    //   2505: checkcast java/math/BigInteger
    //   2508: invokevirtual intValue : ()I
    //   2511: bipush #32
    //   2513: irem
    //   2514: invokestatic abs : (I)I
    //   2517: invokevirtual charAt : (I)C
    //   2520: if_icmpgt -> 2865
    //   2523: sipush #-10399
    //   2526: sipush #-14067
    //   2529: invokestatic a : (II)Ljava/lang/String;
    //   2532: iconst_1
    //   2533: ldc burp/Zls0
    //   2535: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2538: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2541: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2544: astore #4
    //   2546: aload #4
    //   2548: arraylength
    //   2549: istore #5
    //   2551: iconst_0
    //   2552: istore #6
    //   2554: iload #6
    //   2556: iload #5
    //   2558: if_icmpge -> 2696
    //   2561: aload #4
    //   2563: iload #6
    //   2565: aaload
    //   2566: astore #7
    //   2568: aload #7
    //   2570: invokevirtual getModifiers : ()I
    //   2573: invokestatic isStatic : (I)Z
    //   2576: ifne -> 2586
    //   2579: goto -> 2689
    //   2582: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2585: athrow
    //   2586: aload #7
    //   2588: invokevirtual getType : ()Ljava/lang/Class;
    //   2591: astore #8
    //   2593: aload #8
    //   2595: ifnull -> 2676
    //   2598: aload #8
    //   2600: invokevirtual isPrimitive : ()Z
    //   2603: ifne -> 2676
    //   2606: goto -> 2613
    //   2609: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2612: athrow
    //   2613: aload #8
    //   2615: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2618: ifnull -> 2676
    //   2621: goto -> 2628
    //   2624: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2627: athrow
    //   2628: aload #8
    //   2630: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2633: invokevirtual getName : ()Ljava/lang/String;
    //   2636: ifnull -> 2676
    //   2639: goto -> 2646
    //   2642: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2645: athrow
    //   2646: aload #8
    //   2648: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2651: invokevirtual getName : ()Ljava/lang/String;
    //   2654: sipush #-10377
    //   2657: sipush #-13794
    //   2660: invokestatic a : (II)Ljava/lang/String;
    //   2663: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2666: ifne -> 2676
    //   2669: goto -> 2676
    //   2672: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2675: athrow
    //   2676: aload #7
    //   2678: iconst_1
    //   2679: invokevirtual setAccessible : (Z)V
    //   2682: aload #7
    //   2684: aconst_null
    //   2685: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2688: pop
    //   2689: iinc #6, 1
    //   2692: iload_2
    //   2693: ifeq -> 2554
    //   2696: sipush #-10384
    //   2699: sipush #6508
    //   2702: invokestatic a : (II)Ljava/lang/String;
    //   2705: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2708: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2711: astore #4
    //   2713: aload #4
    //   2715: arraylength
    //   2716: istore #5
    //   2718: iconst_0
    //   2719: istore #6
    //   2721: iload #6
    //   2723: iload #5
    //   2725: if_icmpge -> 2861
    //   2728: aload #4
    //   2730: iload #6
    //   2732: aaload
    //   2733: astore #7
    //   2735: aload #7
    //   2737: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2740: pop
    //   2741: aload #7
    //   2743: invokevirtual getModifiers : ()I
    //   2746: invokestatic isStatic : (I)Z
    //   2749: ifeq -> 2847
    //   2752: aload #7
    //   2754: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2757: arraylength
    //   2758: iconst_2
    //   2759: if_icmpne -> 2847
    //   2762: goto -> 2769
    //   2765: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2768: athrow
    //   2769: aload #7
    //   2771: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2774: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2777: if_acmpne -> 2847
    //   2780: goto -> 2787
    //   2783: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2786: athrow
    //   2787: aload #7
    //   2789: iconst_1
    //   2790: invokevirtual setAccessible : (Z)V
    //   2793: aload #7
    //   2795: aconst_null
    //   2796: iconst_2
    //   2797: anewarray java/lang/Object
    //   2800: dup
    //   2801: iconst_0
    //   2802: aload_0
    //   2803: aastore
    //   2804: dup
    //   2805: iconst_1
    //   2806: aload_1
    //   2807: ifnonnull -> 2825
    //   2810: goto -> 2817
    //   2813: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2816: athrow
    //   2817: aload_1
    //   2818: goto -> 2832
    //   2821: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2824: athrow
    //   2825: aload_1
    //   2826: checkcast [B
    //   2829: invokevirtual clone : ()Ljava/lang/Object;
    //   2832: aastore
    //   2833: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2836: checkcast java/lang/Boolean
    //   2839: invokevirtual booleanValue : ()Z
    //   2842: istore_3
    //   2843: iload_2
    //   2844: ifeq -> 2861
    //   2847: iinc #6, 1
    //   2850: iload_2
    //   2851: ifeq -> 2721
    //   2854: goto -> 2861
    //   2857: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2860: athrow
    //   2861: iload_2
    //   2862: ifeq -> 3203
    //   2865: sipush #-10379
    //   2868: sipush #10406
    //   2871: invokestatic a : (II)Ljava/lang/String;
    //   2874: iconst_1
    //   2875: ldc burp/Zl_u
    //   2877: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2880: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2883: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2886: astore #4
    //   2888: aload #4
    //   2890: arraylength
    //   2891: istore #5
    //   2893: iconst_0
    //   2894: istore #6
    //   2896: iload #6
    //   2898: iload #5
    //   2900: if_icmpge -> 3038
    //   2903: aload #4
    //   2905: iload #6
    //   2907: aaload
    //   2908: astore #7
    //   2910: aload #7
    //   2912: invokevirtual getModifiers : ()I
    //   2915: invokestatic isStatic : (I)Z
    //   2918: ifne -> 2928
    //   2921: goto -> 3031
    //   2924: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2927: athrow
    //   2928: aload #7
    //   2930: invokevirtual getType : ()Ljava/lang/Class;
    //   2933: astore #8
    //   2935: aload #8
    //   2937: ifnull -> 3018
    //   2940: aload #8
    //   2942: invokevirtual isPrimitive : ()Z
    //   2945: ifne -> 3018
    //   2948: goto -> 2955
    //   2951: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2954: athrow
    //   2955: aload #8
    //   2957: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2960: ifnull -> 3018
    //   2963: goto -> 2970
    //   2966: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2969: athrow
    //   2970: aload #8
    //   2972: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2975: invokevirtual getName : ()Ljava/lang/String;
    //   2978: ifnull -> 3018
    //   2981: goto -> 2988
    //   2984: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2987: athrow
    //   2988: aload #8
    //   2990: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2993: invokevirtual getName : ()Ljava/lang/String;
    //   2996: sipush #-10377
    //   2999: sipush #-13794
    //   3002: invokestatic a : (II)Ljava/lang/String;
    //   3005: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3008: ifne -> 3018
    //   3011: goto -> 3018
    //   3014: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3017: athrow
    //   3018: aload #7
    //   3020: iconst_1
    //   3021: invokevirtual setAccessible : (Z)V
    //   3024: aload #7
    //   3026: aconst_null
    //   3027: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3030: pop
    //   3031: iinc #6, 1
    //   3034: iload_2
    //   3035: ifeq -> 2896
    //   3038: sipush #-10395
    //   3041: sipush #30786
    //   3044: invokestatic a : (II)Ljava/lang/String;
    //   3047: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3050: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3053: astore #4
    //   3055: aload #4
    //   3057: arraylength
    //   3058: istore #5
    //   3060: iconst_0
    //   3061: istore #6
    //   3063: iload #6
    //   3065: iload #5
    //   3067: if_icmpge -> 3203
    //   3070: aload #4
    //   3072: iload #6
    //   3074: aaload
    //   3075: astore #7
    //   3077: aload #7
    //   3079: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3082: pop
    //   3083: aload #7
    //   3085: invokevirtual getModifiers : ()I
    //   3088: invokestatic isStatic : (I)Z
    //   3091: ifeq -> 3189
    //   3094: aload #7
    //   3096: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3099: arraylength
    //   3100: iconst_2
    //   3101: if_icmpne -> 3189
    //   3104: goto -> 3111
    //   3107: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3110: athrow
    //   3111: aload #7
    //   3113: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3116: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3119: if_acmpne -> 3189
    //   3122: goto -> 3129
    //   3125: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3128: athrow
    //   3129: aload #7
    //   3131: iconst_1
    //   3132: invokevirtual setAccessible : (Z)V
    //   3135: aload #7
    //   3137: aconst_null
    //   3138: iconst_2
    //   3139: anewarray java/lang/Object
    //   3142: dup
    //   3143: iconst_0
    //   3144: aload_0
    //   3145: aastore
    //   3146: dup
    //   3147: iconst_1
    //   3148: aload_1
    //   3149: ifnonnull -> 3167
    //   3152: goto -> 3159
    //   3155: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3158: athrow
    //   3159: aload_1
    //   3160: goto -> 3174
    //   3163: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3166: athrow
    //   3167: aload_1
    //   3168: checkcast [B
    //   3171: invokevirtual clone : ()Ljava/lang/Object;
    //   3174: aastore
    //   3175: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3178: checkcast java/lang/Boolean
    //   3181: invokevirtual booleanValue : ()Z
    //   3184: istore_3
    //   3185: iload_2
    //   3186: ifeq -> 3203
    //   3189: iinc #6, 1
    //   3192: iload_2
    //   3193: ifeq -> 3063
    //   3196: goto -> 3203
    //   3199: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3202: athrow
    //   3203: iload_3
    //   3204: ifeq -> 3209
    //   3207: iload_3
    //   3208: ireturn
    //   3209: getstatic burp/Zmcb.Zl : Ljava/lang/String;
    //   3212: getstatic burp/Zxzt.ZY : Ljava/lang/Object;
    //   3215: checkcast java/math/BigInteger
    //   3218: invokevirtual intValue : ()I
    //   3221: bipush #32
    //   3223: irem
    //   3224: invokestatic abs : (I)I
    //   3227: invokevirtual charAt : (I)C
    //   3230: getstatic burp/Zstq.ZL : Ljava/lang/String;
    //   3233: getstatic burp/Ztvn.Zl : Ljava/lang/Object;
    //   3236: checkcast java/math/BigInteger
    //   3239: invokevirtual intValue : ()I
    //   3242: bipush #32
    //   3244: irem
    //   3245: invokestatic abs : (I)I
    //   3248: invokevirtual charAt : (I)C
    //   3251: if_icmpgt -> 3596
    //   3254: sipush #-10385
    //   3257: sipush #-26836
    //   3260: invokestatic a : (II)Ljava/lang/String;
    //   3263: iconst_1
    //   3264: ldc burp/Zm4k
    //   3266: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3269: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3272: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3275: astore #4
    //   3277: aload #4
    //   3279: arraylength
    //   3280: istore #5
    //   3282: iconst_0
    //   3283: istore #6
    //   3285: iload #6
    //   3287: iload #5
    //   3289: if_icmpge -> 3427
    //   3292: aload #4
    //   3294: iload #6
    //   3296: aaload
    //   3297: astore #7
    //   3299: aload #7
    //   3301: invokevirtual getModifiers : ()I
    //   3304: invokestatic isStatic : (I)Z
    //   3307: ifne -> 3317
    //   3310: goto -> 3420
    //   3313: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3316: athrow
    //   3317: aload #7
    //   3319: invokevirtual getType : ()Ljava/lang/Class;
    //   3322: astore #8
    //   3324: aload #8
    //   3326: ifnull -> 3407
    //   3329: aload #8
    //   3331: invokevirtual isPrimitive : ()Z
    //   3334: ifne -> 3407
    //   3337: goto -> 3344
    //   3340: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3343: athrow
    //   3344: aload #8
    //   3346: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3349: ifnull -> 3407
    //   3352: goto -> 3359
    //   3355: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3358: athrow
    //   3359: aload #8
    //   3361: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3364: invokevirtual getName : ()Ljava/lang/String;
    //   3367: ifnull -> 3407
    //   3370: goto -> 3377
    //   3373: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3376: athrow
    //   3377: aload #8
    //   3379: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3382: invokevirtual getName : ()Ljava/lang/String;
    //   3385: sipush #-10377
    //   3388: sipush #-13794
    //   3391: invokestatic a : (II)Ljava/lang/String;
    //   3394: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3397: ifne -> 3407
    //   3400: goto -> 3407
    //   3403: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3406: athrow
    //   3407: aload #7
    //   3409: iconst_1
    //   3410: invokevirtual setAccessible : (Z)V
    //   3413: aload #7
    //   3415: aconst_null
    //   3416: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3419: pop
    //   3420: iinc #6, 1
    //   3423: iload_2
    //   3424: ifeq -> 3285
    //   3427: sipush #-10391
    //   3430: sipush #22079
    //   3433: invokestatic a : (II)Ljava/lang/String;
    //   3436: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3439: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3442: astore #4
    //   3444: aload #4
    //   3446: arraylength
    //   3447: istore #5
    //   3449: iconst_0
    //   3450: istore #6
    //   3452: iload #6
    //   3454: iload #5
    //   3456: if_icmpge -> 3592
    //   3459: aload #4
    //   3461: iload #6
    //   3463: aaload
    //   3464: astore #7
    //   3466: aload #7
    //   3468: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3471: pop
    //   3472: aload #7
    //   3474: invokevirtual getModifiers : ()I
    //   3477: invokestatic isStatic : (I)Z
    //   3480: ifeq -> 3578
    //   3483: aload #7
    //   3485: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3488: arraylength
    //   3489: iconst_2
    //   3490: if_icmpne -> 3578
    //   3493: goto -> 3500
    //   3496: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3499: athrow
    //   3500: aload #7
    //   3502: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3505: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3508: if_acmpne -> 3578
    //   3511: goto -> 3518
    //   3514: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3517: athrow
    //   3518: aload #7
    //   3520: iconst_1
    //   3521: invokevirtual setAccessible : (Z)V
    //   3524: aload #7
    //   3526: aconst_null
    //   3527: iconst_2
    //   3528: anewarray java/lang/Object
    //   3531: dup
    //   3532: iconst_0
    //   3533: aload_0
    //   3534: aastore
    //   3535: dup
    //   3536: iconst_1
    //   3537: aload_1
    //   3538: ifnonnull -> 3556
    //   3541: goto -> 3548
    //   3544: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3547: athrow
    //   3548: aload_1
    //   3549: goto -> 3563
    //   3552: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3555: athrow
    //   3556: aload_1
    //   3557: checkcast [B
    //   3560: invokevirtual clone : ()Ljava/lang/Object;
    //   3563: aastore
    //   3564: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3567: checkcast java/lang/Boolean
    //   3570: invokevirtual booleanValue : ()Z
    //   3573: istore_3
    //   3574: iload_2
    //   3575: ifeq -> 3592
    //   3578: iinc #6, 1
    //   3581: iload_2
    //   3582: ifeq -> 3452
    //   3585: goto -> 3592
    //   3588: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3591: athrow
    //   3592: iload_2
    //   3593: ifeq -> 3933
    //   3596: sipush #-10393
    //   3599: sipush #-22727
    //   3602: invokestatic a : (II)Ljava/lang/String;
    //   3605: iconst_1
    //   3606: ldc burp/Ztc2
    //   3608: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3611: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3614: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3617: astore #4
    //   3619: aload #4
    //   3621: arraylength
    //   3622: istore #5
    //   3624: iconst_0
    //   3625: istore #6
    //   3627: iload #6
    //   3629: iload #5
    //   3631: if_icmpge -> 3769
    //   3634: aload #4
    //   3636: iload #6
    //   3638: aaload
    //   3639: astore #7
    //   3641: aload #7
    //   3643: invokevirtual getModifiers : ()I
    //   3646: invokestatic isStatic : (I)Z
    //   3649: ifne -> 3659
    //   3652: goto -> 3762
    //   3655: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3658: athrow
    //   3659: aload #7
    //   3661: invokevirtual getType : ()Ljava/lang/Class;
    //   3664: astore #8
    //   3666: aload #8
    //   3668: ifnull -> 3749
    //   3671: aload #8
    //   3673: invokevirtual isPrimitive : ()Z
    //   3676: ifne -> 3749
    //   3679: goto -> 3686
    //   3682: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3685: athrow
    //   3686: aload #8
    //   3688: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3691: ifnull -> 3749
    //   3694: goto -> 3701
    //   3697: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3700: athrow
    //   3701: aload #8
    //   3703: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3706: invokevirtual getName : ()Ljava/lang/String;
    //   3709: ifnull -> 3749
    //   3712: goto -> 3719
    //   3715: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3718: athrow
    //   3719: aload #8
    //   3721: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3724: invokevirtual getName : ()Ljava/lang/String;
    //   3727: sipush #-10377
    //   3730: sipush #-13794
    //   3733: invokestatic a : (II)Ljava/lang/String;
    //   3736: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3739: ifne -> 3749
    //   3742: goto -> 3749
    //   3745: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3748: athrow
    //   3749: aload #7
    //   3751: iconst_1
    //   3752: invokevirtual setAccessible : (Z)V
    //   3755: aload #7
    //   3757: aconst_null
    //   3758: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3761: pop
    //   3762: iinc #6, 1
    //   3765: iload_2
    //   3766: ifeq -> 3627
    //   3769: sipush #-10378
    //   3772: bipush #-73
    //   3774: invokestatic a : (II)Ljava/lang/String;
    //   3777: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3780: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3783: astore #4
    //   3785: aload #4
    //   3787: arraylength
    //   3788: istore #5
    //   3790: iconst_0
    //   3791: istore #6
    //   3793: iload #6
    //   3795: iload #5
    //   3797: if_icmpge -> 3933
    //   3800: aload #4
    //   3802: iload #6
    //   3804: aaload
    //   3805: astore #7
    //   3807: aload #7
    //   3809: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3812: pop
    //   3813: aload #7
    //   3815: invokevirtual getModifiers : ()I
    //   3818: invokestatic isStatic : (I)Z
    //   3821: ifeq -> 3919
    //   3824: aload #7
    //   3826: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3829: arraylength
    //   3830: iconst_2
    //   3831: if_icmpne -> 3919
    //   3834: goto -> 3841
    //   3837: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3840: athrow
    //   3841: aload #7
    //   3843: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3846: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3849: if_acmpne -> 3919
    //   3852: goto -> 3859
    //   3855: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3858: athrow
    //   3859: aload #7
    //   3861: iconst_1
    //   3862: invokevirtual setAccessible : (Z)V
    //   3865: aload #7
    //   3867: aconst_null
    //   3868: iconst_2
    //   3869: anewarray java/lang/Object
    //   3872: dup
    //   3873: iconst_0
    //   3874: aload_0
    //   3875: aastore
    //   3876: dup
    //   3877: iconst_1
    //   3878: aload_1
    //   3879: ifnonnull -> 3897
    //   3882: goto -> 3889
    //   3885: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3888: athrow
    //   3889: aload_1
    //   3890: goto -> 3904
    //   3893: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3896: athrow
    //   3897: aload_1
    //   3898: checkcast [B
    //   3901: invokevirtual clone : ()Ljava/lang/Object;
    //   3904: aastore
    //   3905: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3908: checkcast java/lang/Boolean
    //   3911: invokevirtual booleanValue : ()Z
    //   3914: istore_3
    //   3915: iload_2
    //   3916: ifeq -> 3933
    //   3919: iinc #6, 1
    //   3922: iload_2
    //   3923: ifeq -> 3793
    //   3926: goto -> 3933
    //   3929: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3932: athrow
    //   3933: iload_3
    //   3934: ireturn
    //   3935: astore_3
    //   3936: new java/lang/Exception
    //   3939: dup
    //   3940: aload_3
    //   3941: invokevirtual getMessage : ()Ljava/lang/String;
    //   3944: invokespecial <init> : (Ljava/lang/String;)V
    //   3947: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1746	3935	java/lang/Throwable
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
    //   1107	1121	1121	java/lang/Throwable
    //   1132	1145	1148	java/lang/Throwable
    //   1137	1160	1163	java/lang/Throwable
    //   1152	1178	1181	java/lang/Throwable
    //   1167	1208	1211	java/lang/Throwable
    //   1274	1301	1304	java/lang/Throwable
    //   1291	1319	1322	java/lang/Throwable
    //   1308	1349	1352	java/lang/Throwable
    //   1326	1360	1360	java/lang/Throwable
    //   1382	1393	1396	java/lang/Throwable
    //   1448	1462	1462	java/lang/Throwable
    //   1473	1486	1489	java/lang/Throwable
    //   1478	1501	1504	java/lang/Throwable
    //   1493	1519	1522	java/lang/Throwable
    //   1508	1549	1552	java/lang/Throwable
    //   1615	1642	1645	java/lang/Throwable
    //   1632	1660	1663	java/lang/Throwable
    //   1649	1690	1693	java/lang/Throwable
    //   1667	1701	1701	java/lang/Throwable
    //   1723	1734	1737	java/lang/Throwable
    //   1747	2477	3935	java/lang/Throwable
    //   1837	1851	1851	java/lang/Throwable
    //   1862	1875	1878	java/lang/Throwable
    //   1867	1890	1893	java/lang/Throwable
    //   1882	1908	1911	java/lang/Throwable
    //   1897	1938	1941	java/lang/Throwable
    //   2004	2031	2034	java/lang/Throwable
    //   2021	2049	2052	java/lang/Throwable
    //   2038	2079	2082	java/lang/Throwable
    //   2056	2090	2090	java/lang/Throwable
    //   2112	2123	2126	java/lang/Throwable
    //   2179	2193	2193	java/lang/Throwable
    //   2204	2217	2220	java/lang/Throwable
    //   2209	2232	2235	java/lang/Throwable
    //   2224	2250	2253	java/lang/Throwable
    //   2239	2280	2283	java/lang/Throwable
    //   2346	2373	2376	java/lang/Throwable
    //   2363	2391	2394	java/lang/Throwable
    //   2380	2421	2424	java/lang/Throwable
    //   2398	2432	2432	java/lang/Throwable
    //   2454	2465	2468	java/lang/Throwable
    //   2478	3208	3935	java/lang/Throwable
    //   2568	2582	2582	java/lang/Throwable
    //   2593	2606	2609	java/lang/Throwable
    //   2598	2621	2624	java/lang/Throwable
    //   2613	2639	2642	java/lang/Throwable
    //   2628	2669	2672	java/lang/Throwable
    //   2735	2762	2765	java/lang/Throwable
    //   2752	2780	2783	java/lang/Throwable
    //   2769	2810	2813	java/lang/Throwable
    //   2787	2821	2821	java/lang/Throwable
    //   2843	2854	2857	java/lang/Throwable
    //   2910	2924	2924	java/lang/Throwable
    //   2935	2948	2951	java/lang/Throwable
    //   2940	2963	2966	java/lang/Throwable
    //   2955	2981	2984	java/lang/Throwable
    //   2970	3011	3014	java/lang/Throwable
    //   3077	3104	3107	java/lang/Throwable
    //   3094	3122	3125	java/lang/Throwable
    //   3111	3152	3155	java/lang/Throwable
    //   3129	3163	3163	java/lang/Throwable
    //   3185	3196	3199	java/lang/Throwable
    //   3209	3934	3935	java/lang/Throwable
    //   3299	3313	3313	java/lang/Throwable
    //   3324	3337	3340	java/lang/Throwable
    //   3329	3352	3355	java/lang/Throwable
    //   3344	3370	3373	java/lang/Throwable
    //   3359	3400	3403	java/lang/Throwable
    //   3466	3493	3496	java/lang/Throwable
    //   3483	3511	3514	java/lang/Throwable
    //   3500	3541	3544	java/lang/Throwable
    //   3518	3552	3552	java/lang/Throwable
    //   3574	3585	3588	java/lang/Throwable
    //   3641	3655	3655	java/lang/Throwable
    //   3666	3679	3682	java/lang/Throwable
    //   3671	3694	3697	java/lang/Throwable
    //   3686	3712	3715	java/lang/Throwable
    //   3701	3742	3745	java/lang/Throwable
    //   3807	3834	3837	java/lang/Throwable
    //   3824	3852	3855	java/lang/Throwable
    //   3841	3882	3885	java/lang/Throwable
    //   3859	3893	3893	java/lang/Throwable
    //   3915	3926	3929	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'k¾Mf5º\\t¡ä¹P\\týæÈw±\\t#P 1WOd\\bù£0Ø~C\\tÈV9Åì±É\\td)¬a®8¥U\\tmio­#×*\\tVêÄf¶÷6\\t×ÚF`Ü|×6MFTÔ¥çxðÅ@ç.2êòu¾\\fì¯ÿV{à4MÝé.õæ35â;bGñÿîâ¿?\Kd%¼OÞØÏðvh\\bä¼ç¬èáL\\tÁÁ|8r\\b\\t%n«%üQ 7Gï|Ï~´ÇÁcYÔÔN6äßW3þ;ÊÜX>øhÛU0î\\tBGsü Îh\\t±ahù_#V\\t º$¿v^E£0\\tyôÚÚO4àÒ\\tA l;\\b~OÁuP²\\tó¢:oS*\\b ÀÑ'ûaJ3\\n'_%¹¶XF;:åCK:Z\\tÐF:|÷±'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_2
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
    //   67: ldc 'ñ²".Cí1 geWGëH±¶3áÛuÂ¬!à\\nïhÚ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #8
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #112
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
    //   128: putstatic burp/Zsji.a : [Ljava/lang/String;
    //   131: bipush #28
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zsji.b : [Ljava/lang/String;
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
    //   212: bipush #32
    //   214: goto -> 243
    //   217: bipush #101
    //   219: goto -> 243
    //   222: bipush #58
    //   224: goto -> 243
    //   227: iconst_1
    //   228: goto -> 243
    //   231: bipush #44
    //   233: goto -> 243
    //   236: bipush #82
    //   238: goto -> 243
    //   241: bipush #46
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
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #124
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #59
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #80
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: iconst_m1
    //   326: bastore
    //   327: dup
    //   328: iconst_4
    //   329: bipush #38
    //   331: bastore
    //   332: dup
    //   333: iconst_5
    //   334: bipush #-32
    //   336: bastore
    //   337: dup
    //   338: bipush #6
    //   340: bipush #15
    //   342: bastore
    //   343: dup
    //   344: bipush #7
    //   346: bipush #115
    //   348: bastore
    //   349: dup
    //   350: bipush #8
    //   352: bipush #-34
    //   354: bastore
    //   355: dup
    //   356: bipush #9
    //   358: bipush #-120
    //   360: bastore
    //   361: dup
    //   362: bipush #10
    //   364: bipush #-113
    //   366: bastore
    //   367: dup
    //   368: bipush #11
    //   370: bipush #-105
    //   372: bastore
    //   373: dup
    //   374: bipush #12
    //   376: bipush #-75
    //   378: bastore
    //   379: dup
    //   380: bipush #13
    //   382: bipush #37
    //   384: bastore
    //   385: dup
    //   386: bipush #14
    //   388: bipush #110
    //   390: bastore
    //   391: dup
    //   392: bipush #15
    //   394: bipush #57
    //   396: bastore
    //   397: dup
    //   398: bipush #16
    //   400: bipush #15
    //   402: bastore
    //   403: dup
    //   404: bipush #17
    //   406: bipush #119
    //   408: bastore
    //   409: dup
    //   410: bipush #18
    //   412: bipush #-107
    //   414: bastore
    //   415: dup
    //   416: bipush #19
    //   418: bipush #-113
    //   420: bastore
    //   421: dup
    //   422: bipush #20
    //   424: bipush #97
    //   426: bastore
    //   427: dup
    //   428: bipush #21
    //   430: bipush #64
    //   432: bastore
    //   433: dup
    //   434: bipush #22
    //   436: bipush #79
    //   438: bastore
    //   439: dup
    //   440: bipush #23
    //   442: bipush #89
    //   444: bastore
    //   445: dup
    //   446: bipush #24
    //   448: bipush #-107
    //   450: bastore
    //   451: dup
    //   452: bipush #25
    //   454: iconst_5
    //   455: bastore
    //   456: dup
    //   457: bipush #26
    //   459: bipush #-75
    //   461: bastore
    //   462: dup
    //   463: bipush #27
    //   465: bipush #37
    //   467: bastore
    //   468: dup
    //   469: bipush #28
    //   471: bipush #-102
    //   473: bastore
    //   474: dup
    //   475: bipush #29
    //   477: bipush #17
    //   479: bastore
    //   480: dup
    //   481: bipush #30
    //   483: bipush #106
    //   485: bastore
    //   486: dup
    //   487: bipush #31
    //   489: bipush #-11
    //   491: bastore
    //   492: invokespecial <init> : ([B)V
    //   495: putstatic burp/Zsji.Zg : Ljava/lang/Object;
    //   498: sipush #-10369
    //   501: sipush #-10433
    //   504: invokestatic a : (II)Ljava/lang/String;
    //   507: putstatic burp/Zsji.Zr : Ljava/lang/String;
    //   510: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD764) & 0xFFFF;
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
      byte b1 = 94;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsji.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */