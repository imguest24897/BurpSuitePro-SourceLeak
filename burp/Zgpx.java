package burp;

import java.math.BigInteger;

class Zgpx extends ClassLoader {
  static String Z_;
  
  static Object ZQ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zv(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZB(Object paramObject) {
    Zrom.ZD = a(10186, 5831);
    Zrom.ZF = new BigInteger(a(10189, 3657));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zxcn.ZF.charAt(Math.abs(((BigInteger)Zlid.Zx).intValue() % 32)) <= Zkkl.Zh.charAt(Math.abs(((BigInteger)Ztzj.Zv).intValue() % 32))) {
          try {
            Zs3m.ZC(Class.forName(a(10185, -30338)));
            if (!bool)
              Zz20.ZZ(Class.forName(a(10179, -6236))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zz20.ZZ(Class.forName(a(10179, -6236)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZG(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
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
    //   240: ifeq -> 217
    //   243: aload_3
    //   244: arraylength
    //   245: bipush #10
    //   247: if_icmplt -> 13
    //   250: getstatic burp/Zvh.Zb : Ljava/lang/Object;
    //   253: checkcast java/math/BigInteger
    //   256: invokevirtual toByteArray : ()[B
    //   259: astore_3
    //   260: aload_3
    //   261: arraylength
    //   262: bipush #8
    //   264: iadd
    //   265: bipush #6
    //   267: ishr
    //   268: iconst_1
    //   269: iadd
    //   270: bipush #16
    //   272: imul
    //   273: newarray int
    //   275: astore #5
    //   277: iconst_0
    //   278: istore #6
    //   280: iload #6
    //   282: aload_3
    //   283: arraylength
    //   284: if_icmpge -> 327
    //   287: aload_3
    //   288: iload #6
    //   290: baload
    //   291: sipush #255
    //   294: iand
    //   295: istore #7
    //   297: aload #5
    //   299: iload #6
    //   301: iconst_2
    //   302: ishr
    //   303: dup2
    //   304: iaload
    //   305: iload #7
    //   307: bipush #24
    //   309: iload #6
    //   311: iconst_4
    //   312: irem
    //   313: bipush #8
    //   315: imul
    //   316: isub
    //   317: ishl
    //   318: ior
    //   319: iastore
    //   320: iinc #6, 1
    //   323: iload_2
    //   324: ifeq -> 280
    //   327: aload #5
    //   329: iload #6
    //   331: iconst_2
    //   332: ishr
    //   333: dup2
    //   334: iaload
    //   335: sipush #128
    //   338: bipush #24
    //   340: iload #6
    //   342: iconst_4
    //   343: irem
    //   344: bipush #8
    //   346: imul
    //   347: isub
    //   348: ishl
    //   349: ior
    //   350: iastore
    //   351: aload #5
    //   353: aload #5
    //   355: arraylength
    //   356: iconst_1
    //   357: isub
    //   358: aload_3
    //   359: arraylength
    //   360: bipush #8
    //   362: imul
    //   363: iastore
    //   364: bipush #80
    //   366: newarray int
    //   368: astore #7
    //   370: ldc 1732584193
    //   372: istore #8
    //   374: ldc -271733879
    //   376: istore #9
    //   378: ldc -1732584194
    //   380: istore #10
    //   382: ldc 271733878
    //   384: istore #11
    //   386: ldc -1009589776
    //   388: istore #12
    //   390: iconst_0
    //   391: istore #6
    //   393: iload #6
    //   395: aload #5
    //   397: arraylength
    //   398: if_icmpge -> 720
    //   401: iload #8
    //   403: istore #13
    //   405: iload #9
    //   407: istore #14
    //   409: iload #10
    //   411: istore #15
    //   413: iload #11
    //   415: istore #16
    //   417: iload #12
    //   419: istore #17
    //   421: iconst_0
    //   422: istore #18
    //   424: iload #18
    //   426: bipush #80
    //   428: if_icmpge -> 678
    //   431: iload #18
    //   433: bipush #16
    //   435: if_icmpge -> 462
    //   438: aload #7
    //   440: iload #18
    //   442: aload #5
    //   444: iload #6
    //   446: iload #18
    //   448: iadd
    //   449: iaload
    //   450: iastore
    //   451: iload_2
    //   452: ifeq -> 517
    //   455: goto -> 462
    //   458: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   461: athrow
    //   462: aload #7
    //   464: iload #18
    //   466: iconst_3
    //   467: isub
    //   468: iaload
    //   469: aload #7
    //   471: iload #18
    //   473: bipush #8
    //   475: isub
    //   476: iaload
    //   477: ixor
    //   478: aload #7
    //   480: iload #18
    //   482: bipush #14
    //   484: isub
    //   485: iaload
    //   486: ixor
    //   487: aload #7
    //   489: iload #18
    //   491: bipush #16
    //   493: isub
    //   494: iaload
    //   495: ixor
    //   496: istore #19
    //   498: iload #19
    //   500: iconst_1
    //   501: ishl
    //   502: iload #19
    //   504: bipush #31
    //   506: iushr
    //   507: ior
    //   508: istore #20
    //   510: aload #7
    //   512: iload #18
    //   514: iload #20
    //   516: iastore
    //   517: iload #8
    //   519: iconst_5
    //   520: ishl
    //   521: iload #8
    //   523: bipush #27
    //   525: iushr
    //   526: ior
    //   527: istore #19
    //   529: iload #19
    //   531: iload #12
    //   533: iadd
    //   534: aload #7
    //   536: iload #18
    //   538: iaload
    //   539: iadd
    //   540: iload #18
    //   542: bipush #20
    //   544: if_icmpge -> 570
    //   547: ldc 1518500249
    //   549: iload #9
    //   551: iload #10
    //   553: iand
    //   554: iload #9
    //   556: iconst_m1
    //   557: ixor
    //   558: iload #11
    //   560: iand
    //   561: ior
    //   562: iadd
    //   563: goto -> 640
    //   566: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   569: athrow
    //   570: iload #18
    //   572: bipush #40
    //   574: if_icmpge -> 595
    //   577: ldc 1859775393
    //   579: iload #9
    //   581: iload #10
    //   583: ixor
    //   584: iload #11
    //   586: ixor
    //   587: iadd
    //   588: goto -> 640
    //   591: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   594: athrow
    //   595: iload #18
    //   597: bipush #60
    //   599: if_icmpge -> 629
    //   602: ldc -1894007588
    //   604: iload #9
    //   606: iload #10
    //   608: iand
    //   609: iload #9
    //   611: iload #11
    //   613: iand
    //   614: ior
    //   615: iload #10
    //   617: iload #11
    //   619: iand
    //   620: ior
    //   621: iadd
    //   622: goto -> 640
    //   625: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   628: athrow
    //   629: ldc -899497514
    //   631: iload #9
    //   633: iload #10
    //   635: ixor
    //   636: iload #11
    //   638: ixor
    //   639: iadd
    //   640: iadd
    //   641: istore #20
    //   643: iload #11
    //   645: istore #12
    //   647: iload #10
    //   649: istore #11
    //   651: iload #9
    //   653: bipush #30
    //   655: ishl
    //   656: iload #9
    //   658: iconst_2
    //   659: iushr
    //   660: ior
    //   661: istore #10
    //   663: iload #8
    //   665: istore #9
    //   667: iload #20
    //   669: istore #8
    //   671: iinc #18, 1
    //   674: iload_2
    //   675: ifeq -> 424
    //   678: iload #8
    //   680: iload #13
    //   682: iadd
    //   683: istore #8
    //   685: iload #9
    //   687: iload #14
    //   689: iadd
    //   690: istore #9
    //   692: iload #10
    //   694: iload #15
    //   696: iadd
    //   697: istore #10
    //   699: iload #11
    //   701: iload #16
    //   703: iadd
    //   704: istore #11
    //   706: iload #12
    //   708: iload #17
    //   710: iadd
    //   711: istore #12
    //   713: iinc #6, 16
    //   716: iload_2
    //   717: ifeq -> 393
    //   720: iconst_5
    //   721: newarray int
    //   723: dup
    //   724: iconst_0
    //   725: iload #8
    //   727: iastore
    //   728: dup
    //   729: iconst_1
    //   730: iload #9
    //   732: iastore
    //   733: dup
    //   734: iconst_2
    //   735: iload #10
    //   737: iastore
    //   738: dup
    //   739: iconst_3
    //   740: iload #11
    //   742: iastore
    //   743: dup
    //   744: iconst_4
    //   745: iload #12
    //   747: iastore
    //   748: astore #13
    //   750: bipush #20
    //   752: newarray byte
    //   754: astore #14
    //   756: iconst_0
    //   757: istore #15
    //   759: iload #15
    //   761: bipush #20
    //   763: if_icmpge -> 804
    //   766: aload #13
    //   768: iload #15
    //   770: iconst_4
    //   771: idiv
    //   772: iaload
    //   773: istore #16
    //   775: iconst_3
    //   776: iload #15
    //   778: iconst_4
    //   779: irem
    //   780: isub
    //   781: bipush #8
    //   783: imul
    //   784: istore #17
    //   786: aload #14
    //   788: iload #15
    //   790: iload #16
    //   792: iload #17
    //   794: iushr
    //   795: i2b
    //   796: bastore
    //   797: iinc #15, 1
    //   800: iload_2
    //   801: ifeq -> 759
    //   804: aload #14
    //   806: astore #4
    //   808: sipush #10176
    //   811: new java/math/BigInteger
    //   814: dup
    //   815: aload #4
    //   817: invokespecial <init> : ([B)V
    //   820: invokevirtual abs : ()Ljava/math/BigInteger;
    //   823: putstatic burp/Zx5w.Zo : Ljava/lang/Object;
    //   826: sipush #-28221
    //   829: invokestatic a : (II)Ljava/lang/String;
    //   832: iconst_1
    //   833: ldc burp/Zgw0
    //   835: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   838: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   841: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   844: astore_3
    //   845: aload_3
    //   846: arraylength
    //   847: istore #4
    //   849: iconst_0
    //   850: istore #5
    //   852: iload #5
    //   854: iload #4
    //   856: if_icmpge -> 993
    //   859: aload_3
    //   860: iload #5
    //   862: aaload
    //   863: astore #6
    //   865: aload #6
    //   867: invokevirtual getModifiers : ()I
    //   870: invokestatic isStatic : (I)Z
    //   873: ifne -> 883
    //   876: goto -> 986
    //   879: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   882: athrow
    //   883: aload #6
    //   885: invokevirtual getType : ()Ljava/lang/Class;
    //   888: astore #7
    //   890: aload #7
    //   892: ifnull -> 973
    //   895: aload #7
    //   897: invokevirtual isPrimitive : ()Z
    //   900: ifne -> 973
    //   903: goto -> 910
    //   906: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   909: athrow
    //   910: aload #7
    //   912: invokevirtual getPackage : ()Ljava/lang/Package;
    //   915: ifnull -> 973
    //   918: goto -> 925
    //   921: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   924: athrow
    //   925: aload #7
    //   927: invokevirtual getPackage : ()Ljava/lang/Package;
    //   930: invokevirtual getName : ()Ljava/lang/String;
    //   933: ifnull -> 973
    //   936: goto -> 943
    //   939: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   942: athrow
    //   943: aload #7
    //   945: invokevirtual getPackage : ()Ljava/lang/Package;
    //   948: invokevirtual getName : ()Ljava/lang/String;
    //   951: sipush #10178
    //   954: sipush #-28666
    //   957: invokestatic a : (II)Ljava/lang/String;
    //   960: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   963: ifne -> 973
    //   966: goto -> 973
    //   969: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   972: athrow
    //   973: aload #6
    //   975: iconst_1
    //   976: invokevirtual setAccessible : (Z)V
    //   979: aload #6
    //   981: aconst_null
    //   982: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   985: pop
    //   986: iinc #5, 1
    //   989: iload_2
    //   990: ifeq -> 852
    //   993: sipush #10184
    //   996: sipush #-30927
    //   999: invokestatic a : (II)Ljava/lang/String;
    //   1002: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1005: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1008: astore_3
    //   1009: aload_3
    //   1010: arraylength
    //   1011: istore #4
    //   1013: iconst_0
    //   1014: istore #5
    //   1016: iload #5
    //   1018: iload #4
    //   1020: if_icmpge -> 1152
    //   1023: aload_3
    //   1024: iload #5
    //   1026: aaload
    //   1027: astore #6
    //   1029: aload #6
    //   1031: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1034: pop
    //   1035: aload #6
    //   1037: invokevirtual getModifiers : ()I
    //   1040: invokestatic isStatic : (I)Z
    //   1043: ifeq -> 1138
    //   1046: aload #6
    //   1048: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1051: arraylength
    //   1052: iconst_2
    //   1053: if_icmpne -> 1138
    //   1056: goto -> 1063
    //   1059: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1062: athrow
    //   1063: aload #6
    //   1065: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1068: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1071: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1074: ifeq -> 1138
    //   1077: goto -> 1084
    //   1080: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1083: athrow
    //   1084: aload #6
    //   1086: iconst_1
    //   1087: invokevirtual setAccessible : (Z)V
    //   1090: aload #6
    //   1092: aconst_null
    //   1093: iconst_2
    //   1094: anewarray java/lang/Object
    //   1097: dup
    //   1098: iconst_0
    //   1099: aload_0
    //   1100: aastore
    //   1101: dup
    //   1102: iconst_1
    //   1103: aload_1
    //   1104: ifnonnull -> 1122
    //   1107: goto -> 1114
    //   1110: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1113: athrow
    //   1114: aload_1
    //   1115: goto -> 1129
    //   1118: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1121: athrow
    //   1122: aload_1
    //   1123: checkcast [B
    //   1126: invokevirtual clone : ()Ljava/lang/Object;
    //   1129: aastore
    //   1130: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1133: pop
    //   1134: iload_2
    //   1135: ifeq -> 1152
    //   1138: iinc #5, 1
    //   1141: iload_2
    //   1142: ifeq -> 1016
    //   1145: goto -> 1152
    //   1148: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1151: athrow
    //   1152: getstatic burp/Ztdl.Zw : Ljava/lang/Object;
    //   1155: checkcast java/math/BigInteger
    //   1158: invokevirtual intValue : ()I
    //   1161: i2l
    //   1162: invokestatic currentTimeMillis : ()J
    //   1165: ladd
    //   1166: getstatic burp/Zb9q.ZI : Ljava/lang/Object;
    //   1169: checkcast java/math/BigInteger
    //   1172: invokevirtual intValue : ()I
    //   1175: i2l
    //   1176: lcmp
    //   1177: ifge -> 1509
    //   1180: sipush #10187
    //   1183: sipush #-11430
    //   1186: invokestatic a : (II)Ljava/lang/String;
    //   1189: iconst_1
    //   1190: ldc burp/Ztdd
    //   1192: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1195: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1198: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1201: astore_3
    //   1202: aload_3
    //   1203: arraylength
    //   1204: istore #4
    //   1206: iconst_0
    //   1207: istore #5
    //   1209: iload #5
    //   1211: iload #4
    //   1213: if_icmpge -> 1350
    //   1216: aload_3
    //   1217: iload #5
    //   1219: aaload
    //   1220: astore #6
    //   1222: aload #6
    //   1224: invokevirtual getModifiers : ()I
    //   1227: invokestatic isStatic : (I)Z
    //   1230: ifne -> 1240
    //   1233: goto -> 1343
    //   1236: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1239: athrow
    //   1240: aload #6
    //   1242: invokevirtual getType : ()Ljava/lang/Class;
    //   1245: astore #7
    //   1247: aload #7
    //   1249: ifnull -> 1330
    //   1252: aload #7
    //   1254: invokevirtual isPrimitive : ()Z
    //   1257: ifne -> 1330
    //   1260: goto -> 1267
    //   1263: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1266: athrow
    //   1267: aload #7
    //   1269: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1272: ifnull -> 1330
    //   1275: goto -> 1282
    //   1278: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1281: athrow
    //   1282: aload #7
    //   1284: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1287: invokevirtual getName : ()Ljava/lang/String;
    //   1290: ifnull -> 1330
    //   1293: goto -> 1300
    //   1296: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1299: athrow
    //   1300: aload #7
    //   1302: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1305: invokevirtual getName : ()Ljava/lang/String;
    //   1308: sipush #10177
    //   1311: sipush #14288
    //   1314: invokestatic a : (II)Ljava/lang/String;
    //   1317: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1320: ifne -> 1330
    //   1323: goto -> 1330
    //   1326: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1329: athrow
    //   1330: aload #6
    //   1332: iconst_1
    //   1333: invokevirtual setAccessible : (Z)V
    //   1336: aload #6
    //   1338: aconst_null
    //   1339: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1342: pop
    //   1343: iinc #5, 1
    //   1346: iload_2
    //   1347: ifeq -> 1209
    //   1350: sipush #10191
    //   1353: sipush #19567
    //   1356: invokestatic a : (II)Ljava/lang/String;
    //   1359: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1362: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1365: astore_3
    //   1366: aload_3
    //   1367: arraylength
    //   1368: istore #4
    //   1370: iconst_0
    //   1371: istore #5
    //   1373: iload #5
    //   1375: iload #4
    //   1377: if_icmpge -> 1509
    //   1380: aload_3
    //   1381: iload #5
    //   1383: aaload
    //   1384: astore #6
    //   1386: aload #6
    //   1388: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1391: pop
    //   1392: aload #6
    //   1394: invokevirtual getModifiers : ()I
    //   1397: invokestatic isStatic : (I)Z
    //   1400: ifeq -> 1495
    //   1403: aload #6
    //   1405: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1408: arraylength
    //   1409: iconst_2
    //   1410: if_icmpne -> 1495
    //   1413: goto -> 1420
    //   1416: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1419: athrow
    //   1420: aload #6
    //   1422: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1425: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1428: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1431: ifeq -> 1495
    //   1434: goto -> 1441
    //   1437: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1440: athrow
    //   1441: aload #6
    //   1443: iconst_1
    //   1444: invokevirtual setAccessible : (Z)V
    //   1447: aload #6
    //   1449: aconst_null
    //   1450: iconst_2
    //   1451: anewarray java/lang/Object
    //   1454: dup
    //   1455: iconst_0
    //   1456: aload_0
    //   1457: aastore
    //   1458: dup
    //   1459: iconst_1
    //   1460: aload_1
    //   1461: ifnonnull -> 1479
    //   1464: goto -> 1471
    //   1467: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1470: athrow
    //   1471: aload_1
    //   1472: goto -> 1486
    //   1475: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1478: athrow
    //   1479: aload_1
    //   1480: checkcast [B
    //   1483: invokevirtual clone : ()Ljava/lang/Object;
    //   1486: aastore
    //   1487: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1490: pop
    //   1491: iload_2
    //   1492: ifeq -> 1509
    //   1495: iinc #5, 1
    //   1498: iload_2
    //   1499: ifeq -> 1373
    //   1502: goto -> 1509
    //   1505: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1508: athrow
    //   1509: getstatic burp/Zs5y.ZO : Ljava/lang/String;
    //   1512: getstatic burp/Zg7u.Zh : Ljava/lang/Object;
    //   1515: checkcast java/math/BigInteger
    //   1518: invokevirtual intValue : ()I
    //   1521: bipush #32
    //   1523: irem
    //   1524: invokestatic abs : (I)I
    //   1527: invokevirtual charAt : (I)C
    //   1530: getstatic burp/Zt5t.ZK : Ljava/lang/String;
    //   1533: getstatic burp/Ztq4.ZA : Ljava/lang/Object;
    //   1536: checkcast java/math/BigInteger
    //   1539: invokevirtual intValue : ()I
    //   1542: bipush #32
    //   1544: irem
    //   1545: invokestatic abs : (I)I
    //   1548: invokevirtual charAt : (I)C
    //   1551: if_icmpgt -> 1666
    //   1554: getstatic burp/Zr02.ZG : Ljava/lang/String;
    //   1557: getstatic burp/Zrym.Zk : Ljava/lang/Object;
    //   1560: checkcast java/math/BigInteger
    //   1563: invokevirtual intValue : ()I
    //   1566: bipush #32
    //   1568: irem
    //   1569: invokestatic abs : (I)I
    //   1572: invokevirtual charAt : (I)C
    //   1575: getstatic burp/Zesw.ZC : Ljava/lang/String;
    //   1578: getstatic burp/Zxn4.Zx : Ljava/lang/Object;
    //   1581: checkcast java/math/BigInteger
    //   1584: invokevirtual intValue : ()I
    //   1587: bipush #32
    //   1589: irem
    //   1590: invokestatic abs : (I)I
    //   1593: invokevirtual charAt : (I)C
    //   1596: if_icmple -> 1666
    //   1599: goto -> 1606
    //   1602: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1605: athrow
    //   1606: getstatic burp/Zt85.ZR : Ljava/lang/String;
    //   1609: getstatic burp/Zz91.Z_ : Ljava/lang/Object;
    //   1612: checkcast java/math/BigInteger
    //   1615: invokevirtual intValue : ()I
    //   1618: bipush #32
    //   1620: irem
    //   1621: invokestatic abs : (I)I
    //   1624: invokevirtual charAt : (I)C
    //   1627: getstatic burp/Zmll.Zu : Ljava/lang/String;
    //   1630: getstatic burp/Zrd2.Zt : Ljava/lang/Object;
    //   1633: checkcast java/math/BigInteger
    //   1636: invokevirtual intValue : ()I
    //   1639: bipush #32
    //   1641: irem
    //   1642: invokestatic abs : (I)I
    //   1645: invokevirtual charAt : (I)C
    //   1648: if_icmpgt -> 1666
    //   1651: goto -> 1658
    //   1654: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1657: athrow
    //   1658: iconst_1
    //   1659: goto -> 1667
    //   1662: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1665: athrow
    //   1666: iconst_0
    //   1667: ireturn
    //   1668: astore_3
    //   1669: new java/lang/Exception
    //   1672: dup
    //   1673: aload_3
    //   1674: invokevirtual getMessage : ()Ljava/lang/String;
    //   1677: invokespecial <init> : (Ljava/lang/String;)V
    //   1680: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1667	1668	java/lang/Throwable
    //   431	455	458	java/lang/Throwable
    //   529	566	566	java/lang/Throwable
    //   570	591	591	java/lang/Throwable
    //   595	625	625	java/lang/Throwable
    //   865	879	879	java/lang/Throwable
    //   890	903	906	java/lang/Throwable
    //   895	918	921	java/lang/Throwable
    //   910	936	939	java/lang/Throwable
    //   925	966	969	java/lang/Throwable
    //   1029	1056	1059	java/lang/Throwable
    //   1046	1077	1080	java/lang/Throwable
    //   1063	1107	1110	java/lang/Throwable
    //   1084	1118	1118	java/lang/Throwable
    //   1129	1145	1148	java/lang/Throwable
    //   1222	1236	1236	java/lang/Throwable
    //   1247	1260	1263	java/lang/Throwable
    //   1252	1275	1278	java/lang/Throwable
    //   1267	1293	1296	java/lang/Throwable
    //   1282	1323	1326	java/lang/Throwable
    //   1386	1413	1416	java/lang/Throwable
    //   1403	1434	1437	java/lang/Throwable
    //   1420	1464	1467	java/lang/Throwable
    //   1441	1475	1475	java/lang/Throwable
    //   1486	1502	1505	java/lang/Throwable
    //   1509	1599	1602	java/lang/Throwable
    //   1554	1651	1654	java/lang/Throwable
    //   1606	1662	1662	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÔÑ-LHìV§:8îµFWç{6¬²eá2¾²|ý:\\tÓ.Ö£¦ûHþb\\ta]Íl6O\\b\\t«ØÙ}G ~«MÞ¦N½¥ù2LÞL>ãîªøWª¥ôâYùaïp£H§#r'è®òGòa~áW]ÃªZ`ÞÌÇÇ\\b¼®yõün6BKK\\t,ù¾£V >îÏs³SGP¤*%²MmÓUîÈzA\\n;£TLMØ·þ¼ÒlQMÎAÛ>Vä&<ÎôËÑú,òúÕq*/¨ë@1×Ì²wvë[ËbNÊ]Òç±]H)ó.²¦s)íËr3M \\týÃîdø'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #94
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
    //   68: ldc '^\p#æíÍú'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #95
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
    //   129: putstatic burp/Zgpx.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zgpx.b : [Ljava/lang/String;
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
    //   212: bipush #74
    //   214: goto -> 244
    //   217: bipush #27
    //   219: goto -> 244
    //   222: bipush #44
    //   224: goto -> 244
    //   227: bipush #59
    //   229: goto -> 244
    //   232: bipush #126
    //   234: goto -> 244
    //   237: bipush #89
    //   239: goto -> 244
    //   242: bipush #95
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
    //   300: sipush #10188
    //   303: sipush #-22176
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zgpx.Z_ : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #10190
    //   319: sipush #22394
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zgpx.ZQ : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x27CA) & 0xFFFF;
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
      byte b1 = 69;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgpx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */