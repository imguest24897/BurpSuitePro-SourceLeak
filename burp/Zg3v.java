package burp;

import java.math.BigInteger;

class Zg3v extends ClassLoader {
  static Object Zk;
  
  static String Zt;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZC(Object paramObject) {
    Zt = a(19360, 26387);
    Zk = new BigInteger(a(19372, 18767));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zgk1.Zv.charAt(Math.abs(((BigInteger)Zzuh.ZV).intValue() % 32)) > Zmcb.Zl.charAt(Math.abs(((BigInteger)Zr_w.ZK).intValue() % 32))) {
          try {
            Zxzt.ZZ(Class.forName(a(19369, 9909)));
            if (bool)
              Ztzj.Zy(Class.forName(a(19370, -17975))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Ztzj.Zy(Class.forName(a(19370, -17975)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zt(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zkby.Zv : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: new java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #5
    //   23: aload #5
    //   25: sipush #19375
    //   28: sipush #3802
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
    //   81: sipush #19373
    //   84: sipush #-31818
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: ldc ''
    //   92: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   95: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload #5
    //   104: sipush #19371
    //   107: sipush #-3133
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
    //   686: sipush #19362
    //   689: sipush #24640
    //   692: invokestatic a : (II)Ljava/lang/String;
    //   695: iconst_1
    //   696: ldc burp/Zb2s
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
    //   814: sipush #19363
    //   817: sipush #23641
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
    //   856: sipush #19368
    //   859: sipush #-15530
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
    //   1015: ldc2_w 8682522807148012
    //   1018: invokestatic currentTimeMillis : ()J
    //   1021: lxor
    //   1022: lstore #4
    //   1024: lload #4
    //   1026: ldc2_w 25214903917
    //   1029: lmul
    //   1030: ldc2_w 11
    //   1033: ladd
    //   1034: ldc2_w 281474976710655
    //   1037: land
    //   1038: lstore #4
    //   1040: lload #4
    //   1042: bipush #32
    //   1044: lshl
    //   1045: lstore #6
    //   1047: lload #4
    //   1049: ldc2_w 25214903917
    //   1052: lmul
    //   1053: ldc2_w 11
    //   1056: ladd
    //   1057: ldc2_w 281474976710655
    //   1060: land
    //   1061: lstore #4
    //   1063: lload #6
    //   1065: lload #4
    //   1067: ladd
    //   1068: lstore #6
    //   1070: bipush #16
    //   1072: newarray byte
    //   1074: dup
    //   1075: iconst_0
    //   1076: bipush #48
    //   1078: bastore
    //   1079: dup
    //   1080: iconst_1
    //   1081: bipush #49
    //   1083: bastore
    //   1084: dup
    //   1085: iconst_2
    //   1086: bipush #50
    //   1088: bastore
    //   1089: dup
    //   1090: iconst_3
    //   1091: bipush #51
    //   1093: bastore
    //   1094: dup
    //   1095: iconst_4
    //   1096: bipush #52
    //   1098: bastore
    //   1099: dup
    //   1100: iconst_5
    //   1101: bipush #53
    //   1103: bastore
    //   1104: dup
    //   1105: bipush #6
    //   1107: bipush #54
    //   1109: bastore
    //   1110: dup
    //   1111: bipush #7
    //   1113: bipush #55
    //   1115: bastore
    //   1116: dup
    //   1117: bipush #8
    //   1119: bipush #56
    //   1121: bastore
    //   1122: dup
    //   1123: bipush #9
    //   1125: bipush #57
    //   1127: bastore
    //   1128: dup
    //   1129: bipush #10
    //   1131: bipush #97
    //   1133: bastore
    //   1134: dup
    //   1135: bipush #11
    //   1137: bipush #98
    //   1139: bastore
    //   1140: dup
    //   1141: bipush #12
    //   1143: bipush #99
    //   1145: bastore
    //   1146: dup
    //   1147: bipush #13
    //   1149: bipush #100
    //   1151: bastore
    //   1152: dup
    //   1153: bipush #14
    //   1155: bipush #101
    //   1157: bastore
    //   1158: dup
    //   1159: bipush #15
    //   1161: bipush #102
    //   1163: bastore
    //   1164: astore #8
    //   1166: bipush #64
    //   1168: newarray byte
    //   1170: astore #9
    //   1172: bipush #64
    //   1174: istore #10
    //   1176: bipush #16
    //   1178: istore #11
    //   1180: iload #11
    //   1182: iconst_1
    //   1183: isub
    //   1184: i2l
    //   1185: lstore #12
    //   1187: aload #9
    //   1189: iinc #10, -1
    //   1192: iload #10
    //   1194: aload #8
    //   1196: lload #6
    //   1198: lload #12
    //   1200: land
    //   1201: l2i
    //   1202: baload
    //   1203: bastore
    //   1204: lload #6
    //   1206: iconst_4
    //   1207: lushr
    //   1208: lstore #6
    //   1210: lload #6
    //   1212: lconst_0
    //   1213: lcmp
    //   1214: ifne -> 1187
    //   1217: bipush #64
    //   1219: iload #10
    //   1221: isub
    //   1222: newarray byte
    //   1224: astore_3
    //   1225: iconst_0
    //   1226: istore #14
    //   1228: iload #14
    //   1230: aload_3
    //   1231: arraylength
    //   1232: if_icmpge -> 1254
    //   1235: aload_3
    //   1236: iload #14
    //   1238: aload #9
    //   1240: iload #10
    //   1242: iload #14
    //   1244: iadd
    //   1245: baload
    //   1246: bastore
    //   1247: iinc #14, 1
    //   1250: iload_2
    //   1251: ifeq -> 1228
    //   1254: aload_3
    //   1255: arraylength
    //   1256: bipush #10
    //   1258: if_icmplt -> 1024
    //   1261: getstatic burp/Zgfq.Zn : Ljava/lang/String;
    //   1264: getstatic burp/Zzuh.ZV : Ljava/lang/Object;
    //   1267: checkcast java/math/BigInteger
    //   1270: invokevirtual intValue : ()I
    //   1273: bipush #32
    //   1275: irem
    //   1276: invokestatic abs : (I)I
    //   1279: invokevirtual charAt : (I)C
    //   1282: getstatic burp/Ztgt.ZQ : Ljava/lang/String;
    //   1285: getstatic burp/Zgb9.Zb : Ljava/lang/Object;
    //   1288: checkcast java/math/BigInteger
    //   1291: invokevirtual intValue : ()I
    //   1294: bipush #32
    //   1296: irem
    //   1297: invokestatic abs : (I)I
    //   1300: invokevirtual charAt : (I)C
    //   1303: if_icmple -> 1410
    //   1306: getstatic burp/Zg3v.Zt : Ljava/lang/String;
    //   1309: getstatic burp/Zssb.ZW : Ljava/lang/Object;
    //   1312: checkcast java/math/BigInteger
    //   1315: invokevirtual intValue : ()I
    //   1318: bipush #32
    //   1320: irem
    //   1321: invokestatic abs : (I)I
    //   1324: invokevirtual charAt : (I)C
    //   1327: getstatic burp/Zge1.Zx : Ljava/lang/String;
    //   1330: getstatic burp/Zgil.ZG : Ljava/lang/Object;
    //   1333: checkcast java/math/BigInteger
    //   1336: invokevirtual intValue : ()I
    //   1339: bipush #32
    //   1341: irem
    //   1342: invokestatic abs : (I)I
    //   1345: invokevirtual charAt : (I)C
    //   1348: if_icmpgt -> 1410
    //   1351: goto -> 1358
    //   1354: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1357: athrow
    //   1358: getstatic burp/Zts_.Zx : Ljava/lang/String;
    //   1361: getstatic burp/Zltp.ZT : Ljava/lang/Object;
    //   1364: checkcast java/math/BigInteger
    //   1367: invokevirtual intValue : ()I
    //   1370: bipush #32
    //   1372: irem
    //   1373: invokestatic abs : (I)I
    //   1376: invokevirtual charAt : (I)C
    //   1379: getstatic burp/Zgb9.Zk : Ljava/lang/String;
    //   1382: getstatic burp/Ztvn.Zl : Ljava/lang/Object;
    //   1385: checkcast java/math/BigInteger
    //   1388: invokevirtual intValue : ()I
    //   1391: bipush #32
    //   1393: irem
    //   1394: invokestatic abs : (I)I
    //   1397: invokevirtual charAt : (I)C
    //   1400: if_icmpgt -> 1418
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
    //   1261	1351	1354	java/lang/Throwable
    //   1306	1403	1406	java/lang/Throwable
    //   1358	1414	1414	java/lang/Throwable
  }
  
  static void Zj(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ü$é.ëS\\tÚ%Ø¸Ç\\tøù()\\tê5ÁÒ±ð&j ÚWûzäÞ7Íýr­}uÖãÄv½øªûoµv ~yïIáZiNÛÐp°Z©¡L#KTÓ½HLyòMfD45«ë?ÃZuoÂRýó'lþ8ÿß\Û¦JºÚ7ú=ÚüäÖÓpä¨$ìOPSõ<´o29xl+Jä´¨/1©%\\t±M¸\\tLÜýâ¼'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #10
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc 'lS *?ìaÖ°n2ë`ý×Ðÿ1ËÞYNª]\\nÙZ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #8
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
    //   128: putstatic burp/Zg3v.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zg3v.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #102
    //   214: goto -> 244
    //   217: bipush #31
    //   219: goto -> 244
    //   222: bipush #71
    //   224: goto -> 244
    //   227: bipush #119
    //   229: goto -> 244
    //   232: bipush #56
    //   234: goto -> 244
    //   237: bipush #43
    //   239: goto -> 244
    //   242: bipush #101
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #97
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-119
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #38
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-50
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #-108
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #39
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #65
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #94
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #119
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: iconst_m1
    //   360: bastore
    //   361: dup
    //   362: bipush #10
    //   364: bipush #-45
    //   366: bastore
    //   367: dup
    //   368: bipush #11
    //   370: bipush #22
    //   372: bastore
    //   373: dup
    //   374: bipush #12
    //   376: bipush #-85
    //   378: bastore
    //   379: dup
    //   380: bipush #13
    //   382: bipush #-55
    //   384: bastore
    //   385: dup
    //   386: bipush #14
    //   388: bipush #-51
    //   390: bastore
    //   391: dup
    //   392: bipush #15
    //   394: bipush #-51
    //   396: bastore
    //   397: dup
    //   398: bipush #16
    //   400: bipush #-9
    //   402: bastore
    //   403: dup
    //   404: bipush #17
    //   406: bipush #-109
    //   408: bastore
    //   409: dup
    //   410: bipush #18
    //   412: bipush #101
    //   414: bastore
    //   415: dup
    //   416: bipush #19
    //   418: bipush #116
    //   420: bastore
    //   421: dup
    //   422: bipush #20
    //   424: bipush #-22
    //   426: bastore
    //   427: dup
    //   428: bipush #21
    //   430: bipush #-12
    //   432: bastore
    //   433: dup
    //   434: bipush #22
    //   436: bipush #-89
    //   438: bastore
    //   439: dup
    //   440: bipush #23
    //   442: bipush #10
    //   444: bastore
    //   445: dup
    //   446: bipush #24
    //   448: bipush #123
    //   450: bastore
    //   451: dup
    //   452: bipush #25
    //   454: bipush #-2
    //   456: bastore
    //   457: dup
    //   458: bipush #26
    //   460: bipush #-14
    //   462: bastore
    //   463: dup
    //   464: bipush #27
    //   466: bipush #127
    //   468: bastore
    //   469: dup
    //   470: bipush #28
    //   472: bipush #-79
    //   474: bastore
    //   475: dup
    //   476: bipush #29
    //   478: bipush #-91
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #36
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: bipush #-54
    //   492: bastore
    //   493: invokespecial <init> : ([B)V
    //   496: putstatic burp/Zg3v.Zk : Ljava/lang/Object;
    //   499: sipush #19374
    //   502: sipush #32418
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Zg3v.Zt : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x4BAA) & 0xFFFF;
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
      byte b1 = 47;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg3v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */