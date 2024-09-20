package burp;

import java.math.BigInteger;

class Zs8q extends ClassLoader {
  static Object ZI;
  
  static String Zs;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zm(Object paramObject) {
    Zltz.Za = a(-9628, 18481);
    Zltz.Zg = new BigInteger(a(-9630, 25501));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zt9_.Zf.charAt(Math.abs(((BigInteger)Zl8f.ZA).intValue() % 32)) > Zrof.ZE.charAt(Math.abs(((BigInteger)Zv8c.Zx).intValue() % 32))) {
          try {
            Ztid.ZV(Class.forName(a(-9626, 19294)));
            if (!bool)
              Ztye.ZZ(Class.forName(a(-9627, 23417))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Ztye.ZZ(Class.forName(a(-9627, 23417)));
    } catch (Throwable throwable) {}
  }
  
  static void ZM(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZO(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Ze6d.Zw : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: aload_3
    //   15: arraylength
    //   16: bipush #8
    //   18: iadd
    //   19: bipush #6
    //   21: ishr
    //   22: iconst_1
    //   23: iadd
    //   24: bipush #16
    //   26: imul
    //   27: newarray int
    //   29: astore #5
    //   31: iconst_0
    //   32: istore #6
    //   34: iload #6
    //   36: aload_3
    //   37: arraylength
    //   38: if_icmpge -> 81
    //   41: aload_3
    //   42: iload #6
    //   44: baload
    //   45: sipush #255
    //   48: iand
    //   49: istore #7
    //   51: aload #5
    //   53: iload #6
    //   55: iconst_2
    //   56: ishr
    //   57: dup2
    //   58: iaload
    //   59: iload #7
    //   61: bipush #24
    //   63: iload #6
    //   65: iconst_4
    //   66: irem
    //   67: bipush #8
    //   69: imul
    //   70: isub
    //   71: ishl
    //   72: ior
    //   73: iastore
    //   74: iinc #6, 1
    //   77: iload_2
    //   78: ifeq -> 34
    //   81: aload #5
    //   83: iload #6
    //   85: iconst_2
    //   86: ishr
    //   87: dup2
    //   88: iaload
    //   89: sipush #128
    //   92: bipush #24
    //   94: iload #6
    //   96: iconst_4
    //   97: irem
    //   98: bipush #8
    //   100: imul
    //   101: isub
    //   102: ishl
    //   103: ior
    //   104: iastore
    //   105: aload #5
    //   107: aload #5
    //   109: arraylength
    //   110: iconst_1
    //   111: isub
    //   112: aload_3
    //   113: arraylength
    //   114: bipush #8
    //   116: imul
    //   117: iastore
    //   118: bipush #80
    //   120: newarray int
    //   122: astore #7
    //   124: ldc 1732584193
    //   126: istore #8
    //   128: ldc -271733879
    //   130: istore #9
    //   132: ldc -1732584194
    //   134: istore #10
    //   136: ldc 271733878
    //   138: istore #11
    //   140: ldc -1009589776
    //   142: istore #12
    //   144: iconst_0
    //   145: istore #6
    //   147: iload #6
    //   149: aload #5
    //   151: arraylength
    //   152: if_icmpge -> 474
    //   155: iload #8
    //   157: istore #13
    //   159: iload #9
    //   161: istore #14
    //   163: iload #10
    //   165: istore #15
    //   167: iload #11
    //   169: istore #16
    //   171: iload #12
    //   173: istore #17
    //   175: iconst_0
    //   176: istore #18
    //   178: iload #18
    //   180: bipush #80
    //   182: if_icmpge -> 432
    //   185: iload #18
    //   187: bipush #16
    //   189: if_icmpge -> 216
    //   192: aload #7
    //   194: iload #18
    //   196: aload #5
    //   198: iload #6
    //   200: iload #18
    //   202: iadd
    //   203: iaload
    //   204: iastore
    //   205: iload_2
    //   206: ifeq -> 271
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   215: athrow
    //   216: aload #7
    //   218: iload #18
    //   220: iconst_3
    //   221: isub
    //   222: iaload
    //   223: aload #7
    //   225: iload #18
    //   227: bipush #8
    //   229: isub
    //   230: iaload
    //   231: ixor
    //   232: aload #7
    //   234: iload #18
    //   236: bipush #14
    //   238: isub
    //   239: iaload
    //   240: ixor
    //   241: aload #7
    //   243: iload #18
    //   245: bipush #16
    //   247: isub
    //   248: iaload
    //   249: ixor
    //   250: istore #19
    //   252: iload #19
    //   254: iconst_1
    //   255: ishl
    //   256: iload #19
    //   258: bipush #31
    //   260: iushr
    //   261: ior
    //   262: istore #20
    //   264: aload #7
    //   266: iload #18
    //   268: iload #20
    //   270: iastore
    //   271: iload #8
    //   273: iconst_5
    //   274: ishl
    //   275: iload #8
    //   277: bipush #27
    //   279: iushr
    //   280: ior
    //   281: istore #19
    //   283: iload #19
    //   285: iload #12
    //   287: iadd
    //   288: aload #7
    //   290: iload #18
    //   292: iaload
    //   293: iadd
    //   294: iload #18
    //   296: bipush #20
    //   298: if_icmpge -> 324
    //   301: ldc 1518500249
    //   303: iload #9
    //   305: iload #10
    //   307: iand
    //   308: iload #9
    //   310: iconst_m1
    //   311: ixor
    //   312: iload #11
    //   314: iand
    //   315: ior
    //   316: iadd
    //   317: goto -> 394
    //   320: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   323: athrow
    //   324: iload #18
    //   326: bipush #40
    //   328: if_icmpge -> 349
    //   331: ldc 1859775393
    //   333: iload #9
    //   335: iload #10
    //   337: ixor
    //   338: iload #11
    //   340: ixor
    //   341: iadd
    //   342: goto -> 394
    //   345: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   348: athrow
    //   349: iload #18
    //   351: bipush #60
    //   353: if_icmpge -> 383
    //   356: ldc -1894007588
    //   358: iload #9
    //   360: iload #10
    //   362: iand
    //   363: iload #9
    //   365: iload #11
    //   367: iand
    //   368: ior
    //   369: iload #10
    //   371: iload #11
    //   373: iand
    //   374: ior
    //   375: iadd
    //   376: goto -> 394
    //   379: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   382: athrow
    //   383: ldc -899497514
    //   385: iload #9
    //   387: iload #10
    //   389: ixor
    //   390: iload #11
    //   392: ixor
    //   393: iadd
    //   394: iadd
    //   395: istore #20
    //   397: iload #11
    //   399: istore #12
    //   401: iload #10
    //   403: istore #11
    //   405: iload #9
    //   407: bipush #30
    //   409: ishl
    //   410: iload #9
    //   412: iconst_2
    //   413: iushr
    //   414: ior
    //   415: istore #10
    //   417: iload #8
    //   419: istore #9
    //   421: iload #20
    //   423: istore #8
    //   425: iinc #18, 1
    //   428: iload_2
    //   429: ifeq -> 178
    //   432: iload #8
    //   434: iload #13
    //   436: iadd
    //   437: istore #8
    //   439: iload #9
    //   441: iload #14
    //   443: iadd
    //   444: istore #9
    //   446: iload #10
    //   448: iload #15
    //   450: iadd
    //   451: istore #10
    //   453: iload #11
    //   455: iload #16
    //   457: iadd
    //   458: istore #11
    //   460: iload #12
    //   462: iload #17
    //   464: iadd
    //   465: istore #12
    //   467: iinc #6, 16
    //   470: iload_2
    //   471: ifeq -> 147
    //   474: iconst_5
    //   475: newarray int
    //   477: dup
    //   478: iconst_0
    //   479: iload #8
    //   481: iastore
    //   482: dup
    //   483: iconst_1
    //   484: iload #9
    //   486: iastore
    //   487: dup
    //   488: iconst_2
    //   489: iload #10
    //   491: iastore
    //   492: dup
    //   493: iconst_3
    //   494: iload #11
    //   496: iastore
    //   497: dup
    //   498: iconst_4
    //   499: iload #12
    //   501: iastore
    //   502: astore #13
    //   504: bipush #20
    //   506: newarray byte
    //   508: astore #14
    //   510: iconst_0
    //   511: istore #15
    //   513: iload #15
    //   515: bipush #20
    //   517: if_icmpge -> 558
    //   520: aload #13
    //   522: iload #15
    //   524: iconst_4
    //   525: idiv
    //   526: iaload
    //   527: istore #16
    //   529: iconst_3
    //   530: iload #15
    //   532: iconst_4
    //   533: irem
    //   534: isub
    //   535: bipush #8
    //   537: imul
    //   538: istore #17
    //   540: aload #14
    //   542: iload #15
    //   544: iload #16
    //   546: iload #17
    //   548: iushr
    //   549: i2b
    //   550: bastore
    //   551: iinc #15, 1
    //   554: iload_2
    //   555: ifeq -> 513
    //   558: aload #14
    //   560: astore #4
    //   562: new java/math/BigInteger
    //   565: dup
    //   566: aload #4
    //   568: invokespecial <init> : ([B)V
    //   571: invokevirtual abs : ()Ljava/math/BigInteger;
    //   574: putstatic burp/Zxn5.Zd : Ljava/lang/Object;
    //   577: ldc2_w 8682522807148012
    //   580: invokestatic currentTimeMillis : ()J
    //   583: lxor
    //   584: lstore #4
    //   586: lload #4
    //   588: ldc2_w 25214903917
    //   591: lmul
    //   592: ldc2_w 11
    //   595: ladd
    //   596: ldc2_w 281474976710655
    //   599: land
    //   600: lstore #4
    //   602: lload #4
    //   604: bipush #32
    //   606: lshl
    //   607: lstore #6
    //   609: lload #4
    //   611: ldc2_w 25214903917
    //   614: lmul
    //   615: ldc2_w 11
    //   618: ladd
    //   619: ldc2_w 281474976710655
    //   622: land
    //   623: lstore #4
    //   625: lload #6
    //   627: lload #4
    //   629: ladd
    //   630: lstore #6
    //   632: bipush #16
    //   634: newarray byte
    //   636: dup
    //   637: iconst_0
    //   638: bipush #48
    //   640: bastore
    //   641: dup
    //   642: iconst_1
    //   643: bipush #49
    //   645: bastore
    //   646: dup
    //   647: iconst_2
    //   648: bipush #50
    //   650: bastore
    //   651: dup
    //   652: iconst_3
    //   653: bipush #51
    //   655: bastore
    //   656: dup
    //   657: iconst_4
    //   658: bipush #52
    //   660: bastore
    //   661: dup
    //   662: iconst_5
    //   663: bipush #53
    //   665: bastore
    //   666: dup
    //   667: bipush #6
    //   669: bipush #54
    //   671: bastore
    //   672: dup
    //   673: bipush #7
    //   675: bipush #55
    //   677: bastore
    //   678: dup
    //   679: bipush #8
    //   681: bipush #56
    //   683: bastore
    //   684: dup
    //   685: bipush #9
    //   687: bipush #57
    //   689: bastore
    //   690: dup
    //   691: bipush #10
    //   693: bipush #97
    //   695: bastore
    //   696: dup
    //   697: bipush #11
    //   699: bipush #98
    //   701: bastore
    //   702: dup
    //   703: bipush #12
    //   705: bipush #99
    //   707: bastore
    //   708: dup
    //   709: bipush #13
    //   711: bipush #100
    //   713: bastore
    //   714: dup
    //   715: bipush #14
    //   717: bipush #101
    //   719: bastore
    //   720: dup
    //   721: bipush #15
    //   723: bipush #102
    //   725: bastore
    //   726: astore #8
    //   728: bipush #64
    //   730: newarray byte
    //   732: astore #9
    //   734: bipush #64
    //   736: istore #10
    //   738: bipush #16
    //   740: istore #11
    //   742: iload #11
    //   744: iconst_1
    //   745: isub
    //   746: i2l
    //   747: lstore #12
    //   749: aload #9
    //   751: iinc #10, -1
    //   754: iload #10
    //   756: aload #8
    //   758: lload #6
    //   760: lload #12
    //   762: land
    //   763: l2i
    //   764: baload
    //   765: bastore
    //   766: lload #6
    //   768: iconst_4
    //   769: lushr
    //   770: lstore #6
    //   772: lload #6
    //   774: lconst_0
    //   775: lcmp
    //   776: ifne -> 749
    //   779: bipush #64
    //   781: iload #10
    //   783: isub
    //   784: newarray byte
    //   786: astore_3
    //   787: iconst_0
    //   788: istore #14
    //   790: iload #14
    //   792: aload_3
    //   793: arraylength
    //   794: if_icmpge -> 816
    //   797: aload_3
    //   798: iload #14
    //   800: aload #9
    //   802: iload #10
    //   804: iload #14
    //   806: iadd
    //   807: baload
    //   808: bastore
    //   809: iinc #14, 1
    //   812: iload_2
    //   813: ifeq -> 790
    //   816: aload_3
    //   817: arraylength
    //   818: bipush #10
    //   820: if_icmplt -> 586
    //   823: sipush #-9629
    //   826: sipush #1716
    //   829: invokestatic a : (II)Ljava/lang/String;
    //   832: iconst_1
    //   833: ldc burp/Zg97
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
    //   951: sipush #-9631
    //   954: sipush #-23501
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
    //   993: sipush #-9632
    //   996: sipush #22312
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
    //   1152: getstatic burp/Zmyg.ZE : Ljava/lang/String;
    //   1155: getstatic burp/Zza8.Zh : Ljava/lang/Object;
    //   1158: checkcast java/math/BigInteger
    //   1161: invokevirtual intValue : ()I
    //   1164: bipush #32
    //   1166: irem
    //   1167: invokestatic abs : (I)I
    //   1170: invokevirtual charAt : (I)C
    //   1173: getstatic burp/Zs00.Zv : Ljava/lang/String;
    //   1176: getstatic burp/Zx6d.ZU : Ljava/lang/Object;
    //   1179: checkcast java/math/BigInteger
    //   1182: invokevirtual intValue : ()I
    //   1185: bipush #32
    //   1187: irem
    //   1188: invokestatic abs : (I)I
    //   1191: invokevirtual charAt : (I)C
    //   1194: if_icmpgt -> 1309
    //   1197: getstatic burp/Zs8y.Zr : Ljava/lang/String;
    //   1200: getstatic burp/Zzym.ZK : Ljava/lang/Object;
    //   1203: checkcast java/math/BigInteger
    //   1206: invokevirtual intValue : ()I
    //   1209: bipush #32
    //   1211: irem
    //   1212: invokestatic abs : (I)I
    //   1215: invokevirtual charAt : (I)C
    //   1218: getstatic burp/Zzgh.Zn : Ljava/lang/String;
    //   1221: getstatic burp/Zram.ZF : Ljava/lang/Object;
    //   1224: checkcast java/math/BigInteger
    //   1227: invokevirtual intValue : ()I
    //   1230: bipush #32
    //   1232: irem
    //   1233: invokestatic abs : (I)I
    //   1236: invokevirtual charAt : (I)C
    //   1239: if_icmpgt -> 1309
    //   1242: goto -> 1249
    //   1245: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1248: athrow
    //   1249: getstatic burp/Zera.Zn : Ljava/lang/String;
    //   1252: getstatic burp/Ztj5.Zj : Ljava/lang/Object;
    //   1255: checkcast java/math/BigInteger
    //   1258: invokevirtual intValue : ()I
    //   1261: bipush #32
    //   1263: irem
    //   1264: invokestatic abs : (I)I
    //   1267: invokevirtual charAt : (I)C
    //   1270: getstatic burp/Zxjv.ZF : Ljava/lang/String;
    //   1273: getstatic burp/Zzmw.ZS : Ljava/lang/Object;
    //   1276: checkcast java/math/BigInteger
    //   1279: invokevirtual intValue : ()I
    //   1282: bipush #32
    //   1284: irem
    //   1285: invokestatic abs : (I)I
    //   1288: invokevirtual charAt : (I)C
    //   1291: if_icmple -> 1309
    //   1294: goto -> 1301
    //   1297: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1300: athrow
    //   1301: iconst_1
    //   1302: goto -> 1310
    //   1305: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1308: athrow
    //   1309: iconst_0
    //   1310: ireturn
    //   1311: astore_3
    //   1312: new java/lang/Exception
    //   1315: dup
    //   1316: aload_3
    //   1317: invokevirtual getMessage : ()Ljava/lang/String;
    //   1320: invokespecial <init> : (Ljava/lang/String;)V
    //   1323: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1310	1311	java/lang/Throwable
    //   185	209	212	java/lang/Throwable
    //   283	320	320	java/lang/Throwable
    //   324	345	345	java/lang/Throwable
    //   349	379	379	java/lang/Throwable
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
    //   1152	1242	1245	java/lang/Throwable
    //   1197	1294	1297	java/lang/Throwable
    //   1249	1305	1305	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'äØÔ\\rt0éL,þF>ÚÛþT3G$\\bþ¥\\t±I3áÂ¤Ú\\tùÆ@ÛÀß¤S\\f õ8¨±:Ü\\nÑáY´àM,\Eºð¡°0f-Î6Ø\\t^´ ^°b¿~UÖÕÙ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #57
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
    //   68: ldc 'm£tÉó©{`|j÷l®öÌD_"ÝËmª é]FvC*§>­Pvpè \\bX¶xÆ¼uN·T>ød\\r¯#¥@Jq"\\tÙôht`'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #77
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #72
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
    //   129: putstatic burp/Zs8q.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zs8q.b : [Ljava/lang/String;
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
    //   212: bipush #18
    //   214: goto -> 244
    //   217: bipush #23
    //   219: goto -> 244
    //   222: bipush #127
    //   224: goto -> 244
    //   227: bipush #84
    //   229: goto -> 244
    //   232: bipush #43
    //   234: goto -> 244
    //   237: bipush #20
    //   239: goto -> 244
    //   242: bipush #65
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
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #116
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-6
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #-86
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #57
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #-75
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #-65
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #-26
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #112
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #-79
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #98
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #99
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #26
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #-68
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #35
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #-107
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #-3
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #46
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #-67
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #-38
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #36
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #83
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #45
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #-16
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #-2
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #89
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #-82
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #-40
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #-73
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: iconst_2
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #-3
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #-89
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #-81
    //   493: bastore
    //   494: invokespecial <init> : (I[B)V
    //   497: putstatic burp/Zs8q.ZI : Ljava/lang/Object;
    //   500: sipush #-9625
    //   503: sipush #-11118
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zs8q.Zs : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFDA64) & 0xFFFF;
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
      char c = 'Þ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs8q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */