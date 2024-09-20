package burp;

import java.math.BigInteger;

class Zzh9 extends ClassLoader {
  static String ZF;
  
  static Object Zv;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZI(Object paramObject) {
    Zeju.ZR = a(5387, -12793);
    Zeju.Zk = new BigInteger(a(5386, -7628));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zsf4.ZA.charAt(Math.abs(((BigInteger)Zr4z.ZH).intValue() % 32)) > Zzb2.ZJ.charAt(Math.abs(((BigInteger)Zrh1.ZF).intValue() % 32))) {
          try {
            Zzhu.ZK(Class.forName(a(5378, -22342)));
            if (bool)
              Zme.Zf(Class.forName(a(5379, -4906))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zme.Zf(Class.forName(a(5379, -4906)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZV(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   250: sipush #5385
    //   253: sipush #-29046
    //   256: invokestatic a : (II)Ljava/lang/String;
    //   259: iconst_1
    //   260: ldc burp/Zlum
    //   262: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   265: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   268: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   271: astore_3
    //   272: aload_3
    //   273: arraylength
    //   274: istore #4
    //   276: iconst_0
    //   277: istore #5
    //   279: iload #5
    //   281: iload #4
    //   283: if_icmpge -> 420
    //   286: aload_3
    //   287: iload #5
    //   289: aaload
    //   290: astore #6
    //   292: aload #6
    //   294: invokevirtual getModifiers : ()I
    //   297: invokestatic isStatic : (I)Z
    //   300: ifne -> 310
    //   303: goto -> 413
    //   306: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   309: athrow
    //   310: aload #6
    //   312: invokevirtual getType : ()Ljava/lang/Class;
    //   315: astore #7
    //   317: aload #7
    //   319: ifnull -> 400
    //   322: aload #7
    //   324: invokevirtual isPrimitive : ()Z
    //   327: ifne -> 400
    //   330: goto -> 337
    //   333: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   336: athrow
    //   337: aload #7
    //   339: invokevirtual getPackage : ()Ljava/lang/Package;
    //   342: ifnull -> 400
    //   345: goto -> 352
    //   348: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   351: athrow
    //   352: aload #7
    //   354: invokevirtual getPackage : ()Ljava/lang/Package;
    //   357: invokevirtual getName : ()Ljava/lang/String;
    //   360: ifnull -> 400
    //   363: goto -> 370
    //   366: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   369: athrow
    //   370: aload #7
    //   372: invokevirtual getPackage : ()Ljava/lang/Package;
    //   375: invokevirtual getName : ()Ljava/lang/String;
    //   378: sipush #5381
    //   381: sipush #7541
    //   384: invokestatic a : (II)Ljava/lang/String;
    //   387: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   390: ifne -> 400
    //   393: goto -> 400
    //   396: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   399: athrow
    //   400: aload #6
    //   402: iconst_1
    //   403: invokevirtual setAccessible : (Z)V
    //   406: aload #6
    //   408: aconst_null
    //   409: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   412: pop
    //   413: iinc #5, 1
    //   416: iload_2
    //   417: ifeq -> 279
    //   420: sipush #5377
    //   423: sipush #13124
    //   426: invokestatic a : (II)Ljava/lang/String;
    //   429: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   432: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   435: astore_3
    //   436: aload_3
    //   437: arraylength
    //   438: istore #4
    //   440: iconst_0
    //   441: istore #5
    //   443: iload #5
    //   445: iload #4
    //   447: if_icmpge -> 579
    //   450: aload_3
    //   451: iload #5
    //   453: aaload
    //   454: astore #6
    //   456: aload #6
    //   458: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   461: pop
    //   462: aload #6
    //   464: invokevirtual getModifiers : ()I
    //   467: invokestatic isStatic : (I)Z
    //   470: ifeq -> 565
    //   473: aload #6
    //   475: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   478: arraylength
    //   479: iconst_2
    //   480: if_icmpne -> 565
    //   483: goto -> 490
    //   486: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   489: athrow
    //   490: aload #6
    //   492: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   495: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   498: invokevirtual equals : (Ljava/lang/Object;)Z
    //   501: ifeq -> 565
    //   504: goto -> 511
    //   507: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   510: athrow
    //   511: aload #6
    //   513: iconst_1
    //   514: invokevirtual setAccessible : (Z)V
    //   517: aload #6
    //   519: aconst_null
    //   520: iconst_2
    //   521: anewarray java/lang/Object
    //   524: dup
    //   525: iconst_0
    //   526: aload_0
    //   527: aastore
    //   528: dup
    //   529: iconst_1
    //   530: aload_1
    //   531: ifnonnull -> 549
    //   534: goto -> 541
    //   537: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   540: athrow
    //   541: aload_1
    //   542: goto -> 556
    //   545: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   548: athrow
    //   549: aload_1
    //   550: checkcast [B
    //   553: invokevirtual clone : ()Ljava/lang/Object;
    //   556: aastore
    //   557: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   560: pop
    //   561: iload_2
    //   562: ifeq -> 579
    //   565: iinc #5, 1
    //   568: iload_2
    //   569: ifeq -> 443
    //   572: goto -> 579
    //   575: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   578: athrow
    //   579: getstatic burp/Zro_.ZP : Ljava/lang/Object;
    //   582: checkcast java/math/BigInteger
    //   585: invokevirtual toByteArray : ()[B
    //   588: astore_3
    //   589: new java/lang/StringBuilder
    //   592: dup
    //   593: invokespecial <init> : ()V
    //   596: astore #5
    //   598: aload #5
    //   600: sipush #5382
    //   603: sipush #-30580
    //   606: invokestatic a : (II)Ljava/lang/String;
    //   609: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   612: pop
    //   613: aload_3
    //   614: astore #6
    //   616: aload #6
    //   618: arraylength
    //   619: istore #7
    //   621: iconst_0
    //   622: istore #8
    //   624: iload #8
    //   626: iload #7
    //   628: if_icmpge -> 654
    //   631: aload #6
    //   633: iload #8
    //   635: baload
    //   636: istore #9
    //   638: aload #5
    //   640: iload #9
    //   642: i2c
    //   643: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   646: pop
    //   647: iinc #8, 1
    //   650: iload_2
    //   651: ifeq -> 624
    //   654: aload #5
    //   656: sipush #5376
    //   659: sipush #-768
    //   662: invokestatic a : (II)Ljava/lang/String;
    //   665: ldc ''
    //   667: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   670: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   673: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   676: pop
    //   677: aload #5
    //   679: sipush #5383
    //   682: sipush #16245
    //   685: invokestatic a : (II)Ljava/lang/String;
    //   688: ldc ''
    //   690: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   693: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   696: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   699: pop
    //   700: aload #5
    //   702: invokevirtual toString : ()Ljava/lang/String;
    //   705: invokevirtual getBytes : ()[B
    //   708: astore #4
    //   710: aload #4
    //   712: astore_3
    //   713: aload_3
    //   714: arraylength
    //   715: bipush #8
    //   717: iadd
    //   718: bipush #6
    //   720: ishr
    //   721: iconst_1
    //   722: iadd
    //   723: bipush #16
    //   725: imul
    //   726: newarray int
    //   728: astore #5
    //   730: iconst_0
    //   731: istore #6
    //   733: iload #6
    //   735: aload_3
    //   736: arraylength
    //   737: if_icmpge -> 780
    //   740: aload_3
    //   741: iload #6
    //   743: baload
    //   744: sipush #255
    //   747: iand
    //   748: istore #7
    //   750: aload #5
    //   752: iload #6
    //   754: iconst_2
    //   755: ishr
    //   756: dup2
    //   757: iaload
    //   758: iload #7
    //   760: bipush #24
    //   762: iload #6
    //   764: iconst_4
    //   765: irem
    //   766: bipush #8
    //   768: imul
    //   769: isub
    //   770: ishl
    //   771: ior
    //   772: iastore
    //   773: iinc #6, 1
    //   776: iload_2
    //   777: ifeq -> 733
    //   780: aload #5
    //   782: iload #6
    //   784: iconst_2
    //   785: ishr
    //   786: dup2
    //   787: iaload
    //   788: sipush #128
    //   791: bipush #24
    //   793: iload #6
    //   795: iconst_4
    //   796: irem
    //   797: bipush #8
    //   799: imul
    //   800: isub
    //   801: ishl
    //   802: ior
    //   803: iastore
    //   804: aload #5
    //   806: aload #5
    //   808: arraylength
    //   809: iconst_1
    //   810: isub
    //   811: aload_3
    //   812: arraylength
    //   813: bipush #8
    //   815: imul
    //   816: iastore
    //   817: bipush #80
    //   819: newarray int
    //   821: astore #7
    //   823: ldc 1732584193
    //   825: istore #8
    //   827: ldc -271733879
    //   829: istore #9
    //   831: ldc -1732584194
    //   833: istore #10
    //   835: ldc 271733878
    //   837: istore #11
    //   839: ldc -1009589776
    //   841: istore #12
    //   843: iconst_0
    //   844: istore #6
    //   846: iload #6
    //   848: aload #5
    //   850: arraylength
    //   851: if_icmpge -> 1173
    //   854: iload #8
    //   856: istore #13
    //   858: iload #9
    //   860: istore #14
    //   862: iload #10
    //   864: istore #15
    //   866: iload #11
    //   868: istore #16
    //   870: iload #12
    //   872: istore #17
    //   874: iconst_0
    //   875: istore #18
    //   877: iload #18
    //   879: bipush #80
    //   881: if_icmpge -> 1131
    //   884: iload #18
    //   886: bipush #16
    //   888: if_icmpge -> 915
    //   891: aload #7
    //   893: iload #18
    //   895: aload #5
    //   897: iload #6
    //   899: iload #18
    //   901: iadd
    //   902: iaload
    //   903: iastore
    //   904: iload_2
    //   905: ifeq -> 970
    //   908: goto -> 915
    //   911: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   914: athrow
    //   915: aload #7
    //   917: iload #18
    //   919: iconst_3
    //   920: isub
    //   921: iaload
    //   922: aload #7
    //   924: iload #18
    //   926: bipush #8
    //   928: isub
    //   929: iaload
    //   930: ixor
    //   931: aload #7
    //   933: iload #18
    //   935: bipush #14
    //   937: isub
    //   938: iaload
    //   939: ixor
    //   940: aload #7
    //   942: iload #18
    //   944: bipush #16
    //   946: isub
    //   947: iaload
    //   948: ixor
    //   949: istore #19
    //   951: iload #19
    //   953: iconst_1
    //   954: ishl
    //   955: iload #19
    //   957: bipush #31
    //   959: iushr
    //   960: ior
    //   961: istore #20
    //   963: aload #7
    //   965: iload #18
    //   967: iload #20
    //   969: iastore
    //   970: iload #8
    //   972: iconst_5
    //   973: ishl
    //   974: iload #8
    //   976: bipush #27
    //   978: iushr
    //   979: ior
    //   980: istore #19
    //   982: iload #19
    //   984: iload #12
    //   986: iadd
    //   987: aload #7
    //   989: iload #18
    //   991: iaload
    //   992: iadd
    //   993: iload #18
    //   995: bipush #20
    //   997: if_icmpge -> 1023
    //   1000: ldc 1518500249
    //   1002: iload #9
    //   1004: iload #10
    //   1006: iand
    //   1007: iload #9
    //   1009: iconst_m1
    //   1010: ixor
    //   1011: iload #11
    //   1013: iand
    //   1014: ior
    //   1015: iadd
    //   1016: goto -> 1093
    //   1019: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1022: athrow
    //   1023: iload #18
    //   1025: bipush #40
    //   1027: if_icmpge -> 1048
    //   1030: ldc 1859775393
    //   1032: iload #9
    //   1034: iload #10
    //   1036: ixor
    //   1037: iload #11
    //   1039: ixor
    //   1040: iadd
    //   1041: goto -> 1093
    //   1044: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1047: athrow
    //   1048: iload #18
    //   1050: bipush #60
    //   1052: if_icmpge -> 1082
    //   1055: ldc -1894007588
    //   1057: iload #9
    //   1059: iload #10
    //   1061: iand
    //   1062: iload #9
    //   1064: iload #11
    //   1066: iand
    //   1067: ior
    //   1068: iload #10
    //   1070: iload #11
    //   1072: iand
    //   1073: ior
    //   1074: iadd
    //   1075: goto -> 1093
    //   1078: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1081: athrow
    //   1082: ldc -899497514
    //   1084: iload #9
    //   1086: iload #10
    //   1088: ixor
    //   1089: iload #11
    //   1091: ixor
    //   1092: iadd
    //   1093: iadd
    //   1094: istore #20
    //   1096: iload #11
    //   1098: istore #12
    //   1100: iload #10
    //   1102: istore #11
    //   1104: iload #9
    //   1106: bipush #30
    //   1108: ishl
    //   1109: iload #9
    //   1111: iconst_2
    //   1112: iushr
    //   1113: ior
    //   1114: istore #10
    //   1116: iload #8
    //   1118: istore #9
    //   1120: iload #20
    //   1122: istore #8
    //   1124: iinc #18, 1
    //   1127: iload_2
    //   1128: ifeq -> 877
    //   1131: iload #8
    //   1133: iload #13
    //   1135: iadd
    //   1136: istore #8
    //   1138: iload #9
    //   1140: iload #14
    //   1142: iadd
    //   1143: istore #9
    //   1145: iload #10
    //   1147: iload #15
    //   1149: iadd
    //   1150: istore #10
    //   1152: iload #11
    //   1154: iload #16
    //   1156: iadd
    //   1157: istore #11
    //   1159: iload #12
    //   1161: iload #17
    //   1163: iadd
    //   1164: istore #12
    //   1166: iinc #6, 16
    //   1169: iload_2
    //   1170: ifeq -> 846
    //   1173: iconst_5
    //   1174: newarray int
    //   1176: dup
    //   1177: iconst_0
    //   1178: iload #8
    //   1180: iastore
    //   1181: dup
    //   1182: iconst_1
    //   1183: iload #9
    //   1185: iastore
    //   1186: dup
    //   1187: iconst_2
    //   1188: iload #10
    //   1190: iastore
    //   1191: dup
    //   1192: iconst_3
    //   1193: iload #11
    //   1195: iastore
    //   1196: dup
    //   1197: iconst_4
    //   1198: iload #12
    //   1200: iastore
    //   1201: astore #13
    //   1203: bipush #20
    //   1205: newarray byte
    //   1207: astore #14
    //   1209: iconst_0
    //   1210: istore #15
    //   1212: iload #15
    //   1214: bipush #20
    //   1216: if_icmpge -> 1257
    //   1219: aload #13
    //   1221: iload #15
    //   1223: iconst_4
    //   1224: idiv
    //   1225: iaload
    //   1226: istore #16
    //   1228: iconst_3
    //   1229: iload #15
    //   1231: iconst_4
    //   1232: irem
    //   1233: isub
    //   1234: bipush #8
    //   1236: imul
    //   1237: istore #17
    //   1239: aload #14
    //   1241: iload #15
    //   1243: iload #16
    //   1245: iload #17
    //   1247: iushr
    //   1248: i2b
    //   1249: bastore
    //   1250: iinc #15, 1
    //   1253: iload_2
    //   1254: ifeq -> 1212
    //   1257: aload #14
    //   1259: astore #4
    //   1261: getstatic burp/Zg5.ZF : Ljava/lang/String;
    //   1264: getstatic burp/Zml2.Zo : Ljava/lang/Object;
    //   1267: checkcast java/math/BigInteger
    //   1270: invokevirtual intValue : ()I
    //   1273: bipush #32
    //   1275: irem
    //   1276: invokestatic abs : (I)I
    //   1279: invokevirtual charAt : (I)C
    //   1282: getstatic burp/Zzh9.ZF : Ljava/lang/String;
    //   1285: getstatic burp/Zr8r.ZR : Ljava/lang/Object;
    //   1288: checkcast java/math/BigInteger
    //   1291: invokevirtual intValue : ()I
    //   1294: bipush #32
    //   1296: irem
    //   1297: invokestatic abs : (I)I
    //   1300: invokevirtual charAt : (I)C
    //   1303: if_icmpgt -> 1418
    //   1306: getstatic burp/Zmfw.ZV : Ljava/lang/String;
    //   1309: getstatic burp/Zms1.ZE : Ljava/lang/Object;
    //   1312: checkcast java/math/BigInteger
    //   1315: invokevirtual intValue : ()I
    //   1318: bipush #32
    //   1320: irem
    //   1321: invokestatic abs : (I)I
    //   1324: invokevirtual charAt : (I)C
    //   1327: getstatic burp/Zxee.Zd : Ljava/lang/String;
    //   1330: getstatic burp/Zro_.ZP : Ljava/lang/Object;
    //   1333: checkcast java/math/BigInteger
    //   1336: invokevirtual intValue : ()I
    //   1339: bipush #32
    //   1341: irem
    //   1342: invokestatic abs : (I)I
    //   1345: invokevirtual charAt : (I)C
    //   1348: if_icmple -> 1418
    //   1351: goto -> 1358
    //   1354: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1357: athrow
    //   1358: getstatic burp/Zl5.ZE : Ljava/lang/String;
    //   1361: getstatic burp/Ztsc.Zr : Ljava/lang/Object;
    //   1364: checkcast java/math/BigInteger
    //   1367: invokevirtual intValue : ()I
    //   1370: bipush #32
    //   1372: irem
    //   1373: invokestatic abs : (I)I
    //   1376: invokevirtual charAt : (I)C
    //   1379: getstatic burp/Zewq.ZV : Ljava/lang/String;
    //   1382: getstatic burp/Zms1.ZE : Ljava/lang/Object;
    //   1385: checkcast java/math/BigInteger
    //   1388: invokevirtual intValue : ()I
    //   1391: bipush #32
    //   1393: irem
    //   1394: invokestatic abs : (I)I
    //   1397: invokevirtual charAt : (I)C
    //   1400: if_icmple -> 1418
    //   1403: goto -> 1410
    //   1406: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1409: athrow
    //   1410: iconst_1
    //   1411: goto -> 1419
    //   1414: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1417: athrow
    //   1418: iconst_0
    //   1419: ireturn
    //   1420: astore_3
    //   1421: new java/lang/Exception
    //   1424: dup
    //   1425: aload_3
    //   1426: invokevirtual getMessage : ()Ljava/lang/String;
    //   1429: invokespecial <init> : (Ljava/lang/String;)V
    //   1432: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1419	1420	java/lang/Throwable
    //   292	306	306	java/lang/Throwable
    //   317	330	333	java/lang/Throwable
    //   322	345	348	java/lang/Throwable
    //   337	363	366	java/lang/Throwable
    //   352	393	396	java/lang/Throwable
    //   456	483	486	java/lang/Throwable
    //   473	504	507	java/lang/Throwable
    //   490	534	537	java/lang/Throwable
    //   511	545	545	java/lang/Throwable
    //   556	572	575	java/lang/Throwable
    //   884	908	911	java/lang/Throwable
    //   982	1019	1019	java/lang/Throwable
    //   1023	1044	1044	java/lang/Throwable
    //   1048	1078	1078	java/lang/Throwable
    //   1261	1351	1354	java/lang/Throwable
    //   1306	1403	1406	java/lang/Throwable
    //   1358	1414	1414	java/lang/Throwable
  }
  
  static void Zq(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'úõýd¥ÚÑ4\\tcdÎ(ã¾\\tÉÉ¨U\ÝDÁÌ{\\t×áº\yj¸[ ææÂ!¾ÉB1îýzS¨ÛYØéÒWsø\\féPR7M¶tG z{w4`NT®CAªÅLñ9®»eÍ³2Pl B9ã äj³.Ñ<C{¨Y¨}ç4êÝÍ¿ä&û¹»ÝÀóê°-'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #124
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
    //   68: ldc 'b´/F1ulÆÉB\\f1X *VçLu;ò¸¾QÕÓL4¢Fëó%k\\n§5¢|~í¸/C\\nB)¿È+[Í!Àñl`Ç»Æ¡á\\t(=½Fï?4'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #77
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #97
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
    //   129: putstatic burp/Zzh9.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zzh9.b : [Ljava/lang/String;
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
    //   212: bipush #32
    //   214: goto -> 244
    //   217: bipush #38
    //   219: goto -> 244
    //   222: bipush #9
    //   224: goto -> 244
    //   227: bipush #56
    //   229: goto -> 244
    //   232: bipush #27
    //   234: goto -> 244
    //   237: bipush #54
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
    //   300: sipush #5380
    //   303: sipush #-9045
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zzh9.ZF : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #38
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #-121
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #105
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #107
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #126
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #-62
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #30
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #13
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #90
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #104
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #79
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #122
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #16
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #-39
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #-116
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #91
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #118
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #54
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #93
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #66
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #114
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #-14
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #48
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #-126
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: bipush #56
    //   464: bastore
    //   465: dup
    //   466: bipush #25
    //   468: bipush #112
    //   470: bastore
    //   471: dup
    //   472: bipush #26
    //   474: bipush #106
    //   476: bastore
    //   477: dup
    //   478: bipush #27
    //   480: bipush #-109
    //   482: bastore
    //   483: dup
    //   484: bipush #28
    //   486: iconst_2
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #-72
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #94
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #106
    //   505: bastore
    //   506: invokespecial <init> : (I[B)V
    //   509: putstatic burp/Zzh9.Zv : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1503) & 0xFFFF;
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
      byte b1 = 12;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzh9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */