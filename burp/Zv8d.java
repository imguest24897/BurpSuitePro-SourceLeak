package burp;

import java.math.BigInteger;

class Zv8d extends ClassLoader {
  static String Zi;
  
  static Object ZN;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZO(Object paramObject) {
    Ze4w.Zc = a(3244, 32179);
    Ze4w.Zd = new BigInteger(a(3241, -5223));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zkkl.Zh.charAt(Math.abs(((BigInteger)Zzc9.ZZ).intValue() % 32)) > Zsfj.Zg.charAt(Math.abs(((BigInteger)Ze4w.Zd).intValue() % 32))) {
          try {
            Zxwl.Zk(Class.forName(a(3235, 7875)));
            if (!bool)
              Ztq8.Zu(Class.forName(a(3234, 18353))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Ztq8.Zu(Class.forName(a(3234, 18353)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZR(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: ldc2_w 8682522807148012
    //   7: invokestatic currentTimeMillis : ()J
    //   10: lxor
    //   11: lstore #4
    //   13: lload #4
    //   15: ldc2_w 25214903917
    //   18: lmul
    //   19: ldc2_w 11
    //   22: ladd
    //   23: ldc2_w 281474976710655
    //   26: land
    //   27: lstore #4
    //   29: lload #4
    //   31: bipush #32
    //   33: lshl
    //   34: lstore #6
    //   36: lload #4
    //   38: ldc2_w 25214903917
    //   41: lmul
    //   42: ldc2_w 11
    //   45: ladd
    //   46: ldc2_w 281474976710655
    //   49: land
    //   50: lstore #4
    //   52: lload #6
    //   54: lload #4
    //   56: ladd
    //   57: lstore #6
    //   59: bipush #16
    //   61: newarray byte
    //   63: dup
    //   64: iconst_0
    //   65: bipush #48
    //   67: bastore
    //   68: dup
    //   69: iconst_1
    //   70: bipush #49
    //   72: bastore
    //   73: dup
    //   74: iconst_2
    //   75: bipush #50
    //   77: bastore
    //   78: dup
    //   79: iconst_3
    //   80: bipush #51
    //   82: bastore
    //   83: dup
    //   84: iconst_4
    //   85: bipush #52
    //   87: bastore
    //   88: dup
    //   89: iconst_5
    //   90: bipush #53
    //   92: bastore
    //   93: dup
    //   94: bipush #6
    //   96: bipush #54
    //   98: bastore
    //   99: dup
    //   100: bipush #7
    //   102: bipush #55
    //   104: bastore
    //   105: dup
    //   106: bipush #8
    //   108: bipush #56
    //   110: bastore
    //   111: dup
    //   112: bipush #9
    //   114: bipush #57
    //   116: bastore
    //   117: dup
    //   118: bipush #10
    //   120: bipush #97
    //   122: bastore
    //   123: dup
    //   124: bipush #11
    //   126: bipush #98
    //   128: bastore
    //   129: dup
    //   130: bipush #12
    //   132: bipush #99
    //   134: bastore
    //   135: dup
    //   136: bipush #13
    //   138: bipush #100
    //   140: bastore
    //   141: dup
    //   142: bipush #14
    //   144: bipush #101
    //   146: bastore
    //   147: dup
    //   148: bipush #15
    //   150: bipush #102
    //   152: bastore
    //   153: astore #8
    //   155: bipush #64
    //   157: newarray byte
    //   159: astore #9
    //   161: bipush #64
    //   163: istore #10
    //   165: bipush #16
    //   167: istore #11
    //   169: iload #11
    //   171: iconst_1
    //   172: isub
    //   173: i2l
    //   174: lstore #12
    //   176: aload #9
    //   178: iinc #10, -1
    //   181: iload #10
    //   183: aload #8
    //   185: lload #6
    //   187: lload #12
    //   189: land
    //   190: l2i
    //   191: baload
    //   192: bastore
    //   193: lload #6
    //   195: iconst_4
    //   196: lushr
    //   197: lstore #6
    //   199: lload #6
    //   201: lconst_0
    //   202: lcmp
    //   203: ifne -> 176
    //   206: bipush #64
    //   208: iload #10
    //   210: isub
    //   211: newarray byte
    //   213: astore_3
    //   214: iconst_0
    //   215: istore #14
    //   217: iload #14
    //   219: aload_3
    //   220: arraylength
    //   221: if_icmpge -> 243
    //   224: aload_3
    //   225: iload #14
    //   227: aload #9
    //   229: iload #10
    //   231: iload #14
    //   233: iadd
    //   234: baload
    //   235: bastore
    //   236: iinc #14, 1
    //   239: iload_2
    //   240: ifne -> 217
    //   243: aload_3
    //   244: arraylength
    //   245: bipush #10
    //   247: if_icmplt -> 13
    //   250: getstatic burp/Zlgh.Zd : Ljava/lang/Object;
    //   253: checkcast java/math/BigInteger
    //   256: getstatic burp/Zg2u.ZI : Ljava/lang/Object;
    //   259: checkcast java/math/BigInteger
    //   262: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   265: putstatic burp/Zsfg.Zm : Ljava/lang/Object;
    //   268: getstatic burp/Zkeb.ZH : Ljava/lang/Object;
    //   271: checkcast java/math/BigInteger
    //   274: invokevirtual toByteArray : ()[B
    //   277: astore_3
    //   278: new java/lang/StringBuilder
    //   281: dup
    //   282: invokespecial <init> : ()V
    //   285: astore #5
    //   287: aload #5
    //   289: sipush #3246
    //   292: sipush #22852
    //   295: invokestatic a : (II)Ljava/lang/String;
    //   298: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   301: pop
    //   302: aload_3
    //   303: astore #6
    //   305: aload #6
    //   307: arraylength
    //   308: istore #7
    //   310: iconst_0
    //   311: istore #8
    //   313: iload #8
    //   315: iload #7
    //   317: if_icmpge -> 343
    //   320: aload #6
    //   322: iload #8
    //   324: baload
    //   325: istore #9
    //   327: aload #5
    //   329: iload #9
    //   331: i2c
    //   332: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   335: pop
    //   336: iinc #8, 1
    //   339: iload_2
    //   340: ifne -> 313
    //   343: aload #5
    //   345: sipush #3240
    //   348: sipush #-14604
    //   351: invokestatic a : (II)Ljava/lang/String;
    //   354: ldc ''
    //   356: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   359: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   362: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   365: pop
    //   366: aload #5
    //   368: sipush #3242
    //   371: sipush #-13602
    //   374: invokestatic a : (II)Ljava/lang/String;
    //   377: ldc ''
    //   379: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   382: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   385: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   388: pop
    //   389: aload #5
    //   391: invokevirtual toString : ()Ljava/lang/String;
    //   394: invokevirtual getBytes : ()[B
    //   397: astore #4
    //   399: aload #4
    //   401: astore_3
    //   402: aload_3
    //   403: arraylength
    //   404: bipush #8
    //   406: iadd
    //   407: bipush #6
    //   409: ishr
    //   410: iconst_1
    //   411: iadd
    //   412: bipush #16
    //   414: imul
    //   415: newarray int
    //   417: astore #5
    //   419: iconst_0
    //   420: istore #6
    //   422: iload #6
    //   424: aload_3
    //   425: arraylength
    //   426: if_icmpge -> 469
    //   429: aload_3
    //   430: iload #6
    //   432: baload
    //   433: sipush #255
    //   436: iand
    //   437: istore #7
    //   439: aload #5
    //   441: iload #6
    //   443: iconst_2
    //   444: ishr
    //   445: dup2
    //   446: iaload
    //   447: iload #7
    //   449: bipush #24
    //   451: iload #6
    //   453: iconst_4
    //   454: irem
    //   455: bipush #8
    //   457: imul
    //   458: isub
    //   459: ishl
    //   460: ior
    //   461: iastore
    //   462: iinc #6, 1
    //   465: iload_2
    //   466: ifne -> 422
    //   469: aload #5
    //   471: iload #6
    //   473: iconst_2
    //   474: ishr
    //   475: dup2
    //   476: iaload
    //   477: sipush #128
    //   480: bipush #24
    //   482: iload #6
    //   484: iconst_4
    //   485: irem
    //   486: bipush #8
    //   488: imul
    //   489: isub
    //   490: ishl
    //   491: ior
    //   492: iastore
    //   493: aload #5
    //   495: aload #5
    //   497: arraylength
    //   498: iconst_1
    //   499: isub
    //   500: aload_3
    //   501: arraylength
    //   502: bipush #8
    //   504: imul
    //   505: iastore
    //   506: bipush #80
    //   508: newarray int
    //   510: astore #7
    //   512: ldc 1732584193
    //   514: istore #8
    //   516: ldc -271733879
    //   518: istore #9
    //   520: ldc -1732584194
    //   522: istore #10
    //   524: ldc 271733878
    //   526: istore #11
    //   528: ldc -1009589776
    //   530: istore #12
    //   532: iconst_0
    //   533: istore #6
    //   535: iload #6
    //   537: aload #5
    //   539: arraylength
    //   540: if_icmpge -> 862
    //   543: iload #8
    //   545: istore #13
    //   547: iload #9
    //   549: istore #14
    //   551: iload #10
    //   553: istore #15
    //   555: iload #11
    //   557: istore #16
    //   559: iload #12
    //   561: istore #17
    //   563: iconst_0
    //   564: istore #18
    //   566: iload #18
    //   568: bipush #80
    //   570: if_icmpge -> 820
    //   573: iload #18
    //   575: bipush #16
    //   577: if_icmpge -> 604
    //   580: aload #7
    //   582: iload #18
    //   584: aload #5
    //   586: iload #6
    //   588: iload #18
    //   590: iadd
    //   591: iaload
    //   592: iastore
    //   593: iload_2
    //   594: ifne -> 659
    //   597: goto -> 604
    //   600: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   603: athrow
    //   604: aload #7
    //   606: iload #18
    //   608: iconst_3
    //   609: isub
    //   610: iaload
    //   611: aload #7
    //   613: iload #18
    //   615: bipush #8
    //   617: isub
    //   618: iaload
    //   619: ixor
    //   620: aload #7
    //   622: iload #18
    //   624: bipush #14
    //   626: isub
    //   627: iaload
    //   628: ixor
    //   629: aload #7
    //   631: iload #18
    //   633: bipush #16
    //   635: isub
    //   636: iaload
    //   637: ixor
    //   638: istore #19
    //   640: iload #19
    //   642: iconst_1
    //   643: ishl
    //   644: iload #19
    //   646: bipush #31
    //   648: iushr
    //   649: ior
    //   650: istore #20
    //   652: aload #7
    //   654: iload #18
    //   656: iload #20
    //   658: iastore
    //   659: iload #8
    //   661: iconst_5
    //   662: ishl
    //   663: iload #8
    //   665: bipush #27
    //   667: iushr
    //   668: ior
    //   669: istore #19
    //   671: iload #19
    //   673: iload #12
    //   675: iadd
    //   676: aload #7
    //   678: iload #18
    //   680: iaload
    //   681: iadd
    //   682: iload #18
    //   684: bipush #20
    //   686: if_icmpge -> 712
    //   689: ldc 1518500249
    //   691: iload #9
    //   693: iload #10
    //   695: iand
    //   696: iload #9
    //   698: iconst_m1
    //   699: ixor
    //   700: iload #11
    //   702: iand
    //   703: ior
    //   704: iadd
    //   705: goto -> 782
    //   708: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   711: athrow
    //   712: iload #18
    //   714: bipush #40
    //   716: if_icmpge -> 737
    //   719: ldc 1859775393
    //   721: iload #9
    //   723: iload #10
    //   725: ixor
    //   726: iload #11
    //   728: ixor
    //   729: iadd
    //   730: goto -> 782
    //   733: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   736: athrow
    //   737: iload #18
    //   739: bipush #60
    //   741: if_icmpge -> 771
    //   744: ldc -1894007588
    //   746: iload #9
    //   748: iload #10
    //   750: iand
    //   751: iload #9
    //   753: iload #11
    //   755: iand
    //   756: ior
    //   757: iload #10
    //   759: iload #11
    //   761: iand
    //   762: ior
    //   763: iadd
    //   764: goto -> 782
    //   767: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   770: athrow
    //   771: ldc -899497514
    //   773: iload #9
    //   775: iload #10
    //   777: ixor
    //   778: iload #11
    //   780: ixor
    //   781: iadd
    //   782: iadd
    //   783: istore #20
    //   785: iload #11
    //   787: istore #12
    //   789: iload #10
    //   791: istore #11
    //   793: iload #9
    //   795: bipush #30
    //   797: ishl
    //   798: iload #9
    //   800: iconst_2
    //   801: iushr
    //   802: ior
    //   803: istore #10
    //   805: iload #8
    //   807: istore #9
    //   809: iload #20
    //   811: istore #8
    //   813: iinc #18, 1
    //   816: iload_2
    //   817: ifne -> 566
    //   820: iload #8
    //   822: iload #13
    //   824: iadd
    //   825: istore #8
    //   827: iload #9
    //   829: iload #14
    //   831: iadd
    //   832: istore #9
    //   834: iload #10
    //   836: iload #15
    //   838: iadd
    //   839: istore #10
    //   841: iload #11
    //   843: iload #16
    //   845: iadd
    //   846: istore #11
    //   848: iload #12
    //   850: iload #17
    //   852: iadd
    //   853: istore #12
    //   855: iinc #6, 16
    //   858: iload_2
    //   859: ifne -> 535
    //   862: iconst_5
    //   863: newarray int
    //   865: dup
    //   866: iconst_0
    //   867: iload #8
    //   869: iastore
    //   870: dup
    //   871: iconst_1
    //   872: iload #9
    //   874: iastore
    //   875: dup
    //   876: iconst_2
    //   877: iload #10
    //   879: iastore
    //   880: dup
    //   881: iconst_3
    //   882: iload #11
    //   884: iastore
    //   885: dup
    //   886: iconst_4
    //   887: iload #12
    //   889: iastore
    //   890: astore #13
    //   892: bipush #20
    //   894: newarray byte
    //   896: astore #14
    //   898: iconst_0
    //   899: istore #15
    //   901: iload #15
    //   903: bipush #20
    //   905: if_icmpge -> 946
    //   908: aload #13
    //   910: iload #15
    //   912: iconst_4
    //   913: idiv
    //   914: iaload
    //   915: istore #16
    //   917: iconst_3
    //   918: iload #15
    //   920: iconst_4
    //   921: irem
    //   922: isub
    //   923: bipush #8
    //   925: imul
    //   926: istore #17
    //   928: aload #14
    //   930: iload #15
    //   932: iload #16
    //   934: iload #17
    //   936: iushr
    //   937: i2b
    //   938: bastore
    //   939: iinc #15, 1
    //   942: iload_2
    //   943: ifne -> 901
    //   946: aload #14
    //   948: astore #4
    //   950: sipush #3233
    //   953: sipush #-6974
    //   956: invokestatic a : (II)Ljava/lang/String;
    //   959: iconst_1
    //   960: ldc burp/Ztpa
    //   962: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   965: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   968: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   971: astore_3
    //   972: aload_3
    //   973: arraylength
    //   974: istore #4
    //   976: iconst_0
    //   977: istore #5
    //   979: iload #5
    //   981: iload #4
    //   983: if_icmpge -> 1120
    //   986: aload_3
    //   987: iload #5
    //   989: aaload
    //   990: astore #6
    //   992: aload #6
    //   994: invokevirtual getModifiers : ()I
    //   997: invokestatic isStatic : (I)Z
    //   1000: ifne -> 1010
    //   1003: goto -> 1113
    //   1006: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1009: athrow
    //   1010: aload #6
    //   1012: invokevirtual getType : ()Ljava/lang/Class;
    //   1015: astore #7
    //   1017: aload #7
    //   1019: ifnull -> 1100
    //   1022: aload #7
    //   1024: invokevirtual isPrimitive : ()Z
    //   1027: ifne -> 1100
    //   1030: goto -> 1037
    //   1033: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1036: athrow
    //   1037: aload #7
    //   1039: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1042: ifnull -> 1100
    //   1045: goto -> 1052
    //   1048: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1051: athrow
    //   1052: aload #7
    //   1054: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1057: invokevirtual getName : ()Ljava/lang/String;
    //   1060: ifnull -> 1100
    //   1063: goto -> 1070
    //   1066: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1069: athrow
    //   1070: aload #7
    //   1072: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1075: invokevirtual getName : ()Ljava/lang/String;
    //   1078: sipush #3247
    //   1081: sipush #3761
    //   1084: invokestatic a : (II)Ljava/lang/String;
    //   1087: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1090: ifne -> 1100
    //   1093: goto -> 1100
    //   1096: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1099: athrow
    //   1100: aload #6
    //   1102: iconst_1
    //   1103: invokevirtual setAccessible : (Z)V
    //   1106: aload #6
    //   1108: aconst_null
    //   1109: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1112: pop
    //   1113: iinc #5, 1
    //   1116: iload_2
    //   1117: ifne -> 979
    //   1120: sipush #3243
    //   1123: sipush #-2826
    //   1126: invokestatic a : (II)Ljava/lang/String;
    //   1129: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1132: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1135: astore_3
    //   1136: aload_3
    //   1137: arraylength
    //   1138: istore #4
    //   1140: iconst_0
    //   1141: istore #5
    //   1143: iload #5
    //   1145: iload #4
    //   1147: if_icmpge -> 1279
    //   1150: aload_3
    //   1151: iload #5
    //   1153: aaload
    //   1154: astore #6
    //   1156: aload #6
    //   1158: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1161: pop
    //   1162: aload #6
    //   1164: invokevirtual getModifiers : ()I
    //   1167: invokestatic isStatic : (I)Z
    //   1170: ifeq -> 1265
    //   1173: aload #6
    //   1175: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1178: arraylength
    //   1179: iconst_2
    //   1180: if_icmpne -> 1265
    //   1183: goto -> 1190
    //   1186: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1189: athrow
    //   1190: aload #6
    //   1192: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1195: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1198: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1201: ifeq -> 1265
    //   1204: goto -> 1211
    //   1207: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1210: athrow
    //   1211: aload #6
    //   1213: iconst_1
    //   1214: invokevirtual setAccessible : (Z)V
    //   1217: aload #6
    //   1219: aconst_null
    //   1220: iconst_2
    //   1221: anewarray java/lang/Object
    //   1224: dup
    //   1225: iconst_0
    //   1226: aload_0
    //   1227: aastore
    //   1228: dup
    //   1229: iconst_1
    //   1230: aload_1
    //   1231: ifnonnull -> 1249
    //   1234: goto -> 1241
    //   1237: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1240: athrow
    //   1241: aload_1
    //   1242: goto -> 1256
    //   1245: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1248: athrow
    //   1249: aload_1
    //   1250: checkcast [B
    //   1253: invokevirtual clone : ()Ljava/lang/Object;
    //   1256: aastore
    //   1257: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1260: pop
    //   1261: iload_2
    //   1262: ifne -> 1279
    //   1265: iinc #5, 1
    //   1268: iload_2
    //   1269: ifne -> 1143
    //   1272: goto -> 1279
    //   1275: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1278: athrow
    //   1279: getstatic burp/Ztdl.ZK : Ljava/lang/String;
    //   1282: getstatic burp/Zkeb.ZH : Ljava/lang/Object;
    //   1285: checkcast java/math/BigInteger
    //   1288: invokevirtual intValue : ()I
    //   1291: bipush #32
    //   1293: irem
    //   1294: invokestatic abs : (I)I
    //   1297: invokevirtual charAt : (I)C
    //   1300: getstatic burp/Zepy.Zg : Ljava/lang/String;
    //   1303: getstatic burp/Zs_m.Z_ : Ljava/lang/Object;
    //   1306: checkcast java/math/BigInteger
    //   1309: invokevirtual intValue : ()I
    //   1312: bipush #32
    //   1314: irem
    //   1315: invokestatic abs : (I)I
    //   1318: invokevirtual charAt : (I)C
    //   1321: if_icmple -> 1436
    //   1324: getstatic burp/Zrtp.Zq : Ljava/lang/String;
    //   1327: getstatic burp/Zgei.ZN : Ljava/lang/Object;
    //   1330: checkcast java/math/BigInteger
    //   1333: invokevirtual intValue : ()I
    //   1336: bipush #32
    //   1338: irem
    //   1339: invokestatic abs : (I)I
    //   1342: invokevirtual charAt : (I)C
    //   1345: getstatic burp/Zs0h.ZX : Ljava/lang/String;
    //   1348: getstatic burp/Ze2k.ZK : Ljava/lang/Object;
    //   1351: checkcast java/math/BigInteger
    //   1354: invokevirtual intValue : ()I
    //   1357: bipush #32
    //   1359: irem
    //   1360: invokestatic abs : (I)I
    //   1363: invokevirtual charAt : (I)C
    //   1366: if_icmpgt -> 1436
    //   1369: goto -> 1376
    //   1372: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1375: athrow
    //   1376: getstatic burp/Zs8w.ZR : Ljava/lang/String;
    //   1379: getstatic burp/Zz0y.Zp : Ljava/lang/Object;
    //   1382: checkcast java/math/BigInteger
    //   1385: invokevirtual intValue : ()I
    //   1388: bipush #32
    //   1390: irem
    //   1391: invokestatic abs : (I)I
    //   1394: invokevirtual charAt : (I)C
    //   1397: getstatic burp/Zlg2.ZL : Ljava/lang/String;
    //   1400: getstatic burp/Ztq2.Zj : Ljava/lang/Object;
    //   1403: checkcast java/math/BigInteger
    //   1406: invokevirtual intValue : ()I
    //   1409: bipush #32
    //   1411: irem
    //   1412: invokestatic abs : (I)I
    //   1415: invokevirtual charAt : (I)C
    //   1418: if_icmple -> 1436
    //   1421: goto -> 1428
    //   1424: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1427: athrow
    //   1428: iconst_1
    //   1429: goto -> 1437
    //   1432: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1435: athrow
    //   1436: iconst_0
    //   1437: ireturn
    //   1438: astore_3
    //   1439: new java/lang/Exception
    //   1442: dup
    //   1443: aload_3
    //   1444: invokevirtual getMessage : ()Ljava/lang/String;
    //   1447: invokespecial <init> : (Ljava/lang/String;)V
    //   1450: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1437	1438	java/lang/Throwable
    //   573	597	600	java/lang/Throwable
    //   671	708	708	java/lang/Throwable
    //   712	733	733	java/lang/Throwable
    //   737	767	767	java/lang/Throwable
    //   992	1006	1006	java/lang/Throwable
    //   1017	1030	1033	java/lang/Throwable
    //   1022	1045	1048	java/lang/Throwable
    //   1037	1063	1066	java/lang/Throwable
    //   1052	1093	1096	java/lang/Throwable
    //   1156	1183	1186	java/lang/Throwable
    //   1173	1204	1207	java/lang/Throwable
    //   1190	1234	1237	java/lang/Throwable
    //   1211	1245	1245	java/lang/Throwable
    //   1256	1272	1275	java/lang/Throwable
    //   1279	1369	1372	java/lang/Throwable
    //   1324	1421	1424	java/lang/Throwable
    //   1376	1432	1432	java/lang/Throwable
  }
  
  static void ZN(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'TèÒU+7:rD~®ÎÕ«Qlú7BÁ)m$föÃ¬A/Àà«ç\\nXÀ\[<z!5GÓJ¬X2XÙä\äíÊAfj:®b¸4+\\t,vC¤z{O\\tBû®6´À|Ç^ fI°è7iV;~¯¯²Ö¯Q<|R]ôöñ ÌNZC¸ÅoùÜôµ2R¬t1ËMÏeð¯­\\tòG¼ªÕì¾ U+±ëMG¥ìÚ8³}>ÄÎÒ?Õ*ÊÙt[ð äè\\tO=í*)5ËÞyMIù+'ÍþJÈ#ÏiêÓSt:JS&Q.7ßCÛ°zâô<\ìë@ÆO8'ðP¢wO\6ýÅ¯¬û0ÉN!ò»:Óo'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #77
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #125
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
    //   68: ldc 'ªSÕcª1ý/\\tÝã²l¢ð¿m'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #121
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
    //   129: putstatic burp/Zv8d.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zv8d.b : [Ljava/lang/String;
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
    //   212: bipush #70
    //   214: goto -> 244
    //   217: bipush #13
    //   219: goto -> 244
    //   222: bipush #66
    //   224: goto -> 244
    //   227: bipush #85
    //   229: goto -> 244
    //   232: bipush #28
    //   234: goto -> 244
    //   237: bipush #44
    //   239: goto -> 244
    //   242: bipush #49
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
    //   300: sipush #3245
    //   303: sipush #-4719
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zv8d.Zi : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #3232
    //   319: sipush #21778
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zv8d.ZN : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xCA9) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv8d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */