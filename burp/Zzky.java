package burp;

import java.math.BigInteger;

class Zzky extends ClassLoader {
  static Object Zo;
  
  static String Zj;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zv(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Z_(Object paramObject) {
    Zz5d.Zb = a(-30746, -9174);
    Zz5d.Zk = new BigInteger(a(-30745, -886));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zmh5.Zh.charAt(Math.abs(((BigInteger)Ztev.Zr).intValue() % 32)) <= Zero.ZL.charAt(Math.abs(((BigInteger)Zgkp.Zp).intValue() % 32))) {
          try {
            Ze7y.ZL(Class.forName(a(-30748, 2680)));
            if (bool)
              Zgwh.ZP(Class.forName(a(-30741, 11554))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgwh.ZP(Class.forName(a(-30741, 11554)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zm(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zepm.Zp : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: new java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #5
    //   23: aload #5
    //   25: sipush #-30752
    //   28: sipush #-17128
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
    //   81: sipush #-30744
    //   84: sipush #17493
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: ldc ''
    //   92: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   95: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload #5
    //   104: sipush #-30737
    //   107: sipush #17432
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
    //   686: sipush #-30749
    //   689: sipush #-28896
    //   692: invokestatic a : (II)Ljava/lang/String;
    //   695: iconst_1
    //   696: ldc burp/Zmy3
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
    //   814: sipush #-30747
    //   817: sipush #4186
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
    //   856: sipush #-30743
    //   859: sipush #-24931
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
    //   1251: ifne -> 1228
    //   1254: aload_3
    //   1255: arraylength
    //   1256: bipush #10
    //   1258: if_icmplt -> 1024
    //   1261: new java/io/ByteArrayOutputStream
    //   1264: dup
    //   1265: invokespecial <init> : ()V
    //   1268: astore_3
    //   1269: sipush #-30742
    //   1272: aload_3
    //   1273: sipush #202
    //   1276: invokevirtual write : (I)V
    //   1279: sipush #-24195
    //   1282: aload_3
    //   1283: sipush #254
    //   1286: invokevirtual write : (I)V
    //   1289: aload_3
    //   1290: sipush #186
    //   1293: invokevirtual write : (I)V
    //   1296: aload_3
    //   1297: sipush #190
    //   1300: invokevirtual write : (I)V
    //   1303: aload_3
    //   1304: iconst_0
    //   1305: invokevirtual write : (I)V
    //   1308: aload_3
    //   1309: iconst_1
    //   1310: invokevirtual write : (I)V
    //   1313: aload_3
    //   1314: iconst_0
    //   1315: invokevirtual write : (I)V
    //   1318: aload_3
    //   1319: bipush #50
    //   1321: invokevirtual write : (I)V
    //   1324: aload_3
    //   1325: getstatic burp/Zr_y.ZI : Ljava/lang/Object;
    //   1328: checkcast java/math/BigInteger
    //   1331: invokevirtual toByteArray : ()[B
    //   1334: invokevirtual write : ([B)V
    //   1337: aload_3
    //   1338: getstatic burp/Zbu6.ZJ : Ljava/lang/Object;
    //   1341: checkcast java/math/BigInteger
    //   1344: invokevirtual toByteArray : ()[B
    //   1347: invokevirtual write : ([B)V
    //   1350: aload_3
    //   1351: getstatic burp/Zry7.ZZ : Ljava/lang/Object;
    //   1354: checkcast java/math/BigInteger
    //   1357: invokevirtual toByteArray : ()[B
    //   1360: invokevirtual write : ([B)V
    //   1363: aload_3
    //   1364: invokevirtual toByteArray : ()[B
    //   1367: astore #4
    //   1369: aconst_null
    //   1370: astore #5
    //   1372: invokestatic a : (II)Ljava/lang/String;
    //   1375: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1378: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1381: astore #6
    //   1383: aload #6
    //   1385: arraylength
    //   1386: istore #7
    //   1388: iconst_0
    //   1389: istore #8
    //   1391: iload #8
    //   1393: iload #7
    //   1395: if_icmpge -> 1523
    //   1398: aload #6
    //   1400: iload #8
    //   1402: aaload
    //   1403: astore #9
    //   1405: aload #9
    //   1407: invokevirtual getName : ()Ljava/lang/String;
    //   1410: sipush #-30750
    //   1413: sipush #-17657
    //   1416: invokestatic a : (II)Ljava/lang/String;
    //   1419: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1422: ifeq -> 1516
    //   1425: aload #9
    //   1427: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1430: astore #10
    //   1432: aload #10
    //   1434: arraylength
    //   1435: iconst_4
    //   1436: if_icmpeq -> 1446
    //   1439: goto -> 1516
    //   1442: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1445: athrow
    //   1446: aload #10
    //   1448: iconst_0
    //   1449: aaload
    //   1450: ldc java/lang/String
    //   1452: if_acmpeq -> 1462
    //   1455: goto -> 1516
    //   1458: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1461: athrow
    //   1462: aload #10
    //   1464: iconst_1
    //   1465: aaload
    //   1466: ldc [B
    //   1468: if_acmpeq -> 1478
    //   1471: goto -> 1516
    //   1474: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1477: athrow
    //   1478: aload #10
    //   1480: iconst_2
    //   1481: aaload
    //   1482: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1485: if_acmpeq -> 1495
    //   1488: goto -> 1516
    //   1491: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1494: athrow
    //   1495: aload #10
    //   1497: iconst_3
    //   1498: aaload
    //   1499: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1502: if_acmpeq -> 1512
    //   1505: goto -> 1516
    //   1508: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1511: athrow
    //   1512: aload #9
    //   1514: astore #5
    //   1516: iinc #8, 1
    //   1519: iload_2
    //   1520: ifne -> 1391
    //   1523: aload #5
    //   1525: iconst_1
    //   1526: invokevirtual setAccessible : (Z)V
    //   1529: ldc burp/Zm06
    //   1531: iconst_0
    //   1532: anewarray java/lang/Class
    //   1535: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   1538: astore #6
    //   1540: aload #6
    //   1542: iconst_1
    //   1543: invokevirtual setAccessible : (Z)V
    //   1546: aload #5
    //   1548: aload #6
    //   1550: iconst_0
    //   1551: anewarray java/lang/Object
    //   1554: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   1557: iconst_4
    //   1558: anewarray java/lang/Object
    //   1561: dup
    //   1562: iconst_0
    //   1563: sipush #-30751
    //   1566: sipush #31627
    //   1569: invokestatic a : (II)Ljava/lang/String;
    //   1572: aastore
    //   1573: dup
    //   1574: iconst_1
    //   1575: aload #4
    //   1577: aastore
    //   1578: dup
    //   1579: iconst_2
    //   1580: iconst_0
    //   1581: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1584: aastore
    //   1585: dup
    //   1586: iconst_3
    //   1587: aload #4
    //   1589: arraylength
    //   1590: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1593: aastore
    //   1594: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1597: pop
    //   1598: goto -> 1602
    //   1601: astore_3
    //   1602: getstatic burp/Zezq.Zp : Ljava/lang/String;
    //   1605: getstatic burp/Zxdh.ZD : Ljava/lang/Object;
    //   1608: checkcast java/math/BigInteger
    //   1611: invokevirtual intValue : ()I
    //   1614: bipush #32
    //   1616: irem
    //   1617: invokestatic abs : (I)I
    //   1620: invokevirtual charAt : (I)C
    //   1623: getstatic burp/Zrxm.Zp : Ljava/lang/String;
    //   1626: getstatic burp/Zz5d.Zk : Ljava/lang/Object;
    //   1629: checkcast java/math/BigInteger
    //   1632: invokevirtual intValue : ()I
    //   1635: bipush #32
    //   1637: irem
    //   1638: invokestatic abs : (I)I
    //   1641: invokevirtual charAt : (I)C
    //   1644: if_icmple -> 1751
    //   1647: getstatic burp/Zmnb.ZD : Ljava/lang/String;
    //   1650: getstatic burp/Zl5b.ZI : Ljava/lang/Object;
    //   1653: checkcast java/math/BigInteger
    //   1656: invokevirtual intValue : ()I
    //   1659: bipush #32
    //   1661: irem
    //   1662: invokestatic abs : (I)I
    //   1665: invokevirtual charAt : (I)C
    //   1668: getstatic burp/Zgkp.ZS : Ljava/lang/String;
    //   1671: getstatic burp/Zbqo.Zb : Ljava/lang/Object;
    //   1674: checkcast java/math/BigInteger
    //   1677: invokevirtual intValue : ()I
    //   1680: bipush #32
    //   1682: irem
    //   1683: invokestatic abs : (I)I
    //   1686: invokevirtual charAt : (I)C
    //   1689: if_icmple -> 1751
    //   1692: goto -> 1699
    //   1695: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1698: athrow
    //   1699: getstatic burp/Zgkp.ZS : Ljava/lang/String;
    //   1702: getstatic burp/Zetv.ZI : Ljava/lang/Object;
    //   1705: checkcast java/math/BigInteger
    //   1708: invokevirtual intValue : ()I
    //   1711: bipush #32
    //   1713: irem
    //   1714: invokestatic abs : (I)I
    //   1717: invokevirtual charAt : (I)C
    //   1720: getstatic burp/Zkcd.Zj : Ljava/lang/String;
    //   1723: getstatic burp/Ztmy.ZH : Ljava/lang/Object;
    //   1726: checkcast java/math/BigInteger
    //   1729: invokevirtual intValue : ()I
    //   1732: bipush #32
    //   1734: irem
    //   1735: invokestatic abs : (I)I
    //   1738: invokevirtual charAt : (I)C
    //   1741: if_icmple -> 1759
    //   1744: goto -> 1751
    //   1747: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1750: athrow
    //   1751: iconst_1
    //   1752: goto -> 1760
    //   1755: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1758: athrow
    //   1759: iconst_0
    //   1760: ireturn
    //   1761: astore_3
    //   1762: new java/lang/Exception
    //   1765: dup
    //   1766: aload_3
    //   1767: invokevirtual getMessage : ()Ljava/lang/String;
    //   1770: invokespecial <init> : (Ljava/lang/String;)V
    //   1773: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1760	1761	java/lang/Throwable
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
    //   1261	1598	1601	java/lang/Throwable
    //   1432	1442	1442	java/lang/Throwable
    //   1446	1458	1458	java/lang/Throwable
    //   1462	1474	1474	java/lang/Throwable
    //   1478	1491	1491	java/lang/Throwable
    //   1495	1508	1508	java/lang/Throwable
    //   1602	1692	1695	java/lang/Throwable
    //   1647	1744	1747	java/lang/Throwable
    //   1699	1755	1755	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÜU¶[ç:lÏ\\tC6\\r=Mõb "¦uÝH<v¨|SÈ@) êOBS}Æ;ju\\bÄ*º¨÷ s<þIpVt3¨\\n#ÉôÄ±[S`í"1ÁÊ\\nÈGL*Úì®~3³?²°|2è(\\bÃ1×^µÀ¹{[oÕ#Z&^üÉ©ukÆÔ8\\tB7*DÚ-êÏs´snJ?ç\\tkÁ²õ\\tÊ.Ø>©¬ËÓ'g5õzÁoßqÊ¡'Z¯´ØÜkb»\\t6ssèK÷ i²Úø|Ê\\tù¨a\\b×$áÉ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #11
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #62
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
    //   68: ldc 'xÜ@z%rø¨êxFÙ©>ãÀu<¦¯½dÁ¤tu#\\tj]òqS~á'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
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
    //   129: putstatic burp/Zzky.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zzky.b : [Ljava/lang/String;
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
    //   212: bipush #76
    //   214: goto -> 244
    //   217: bipush #9
    //   219: goto -> 244
    //   222: bipush #114
    //   224: goto -> 244
    //   227: bipush #110
    //   229: goto -> 244
    //   232: bipush #94
    //   234: goto -> 244
    //   237: bipush #53
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
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #75
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #66
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #28
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #-91
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #-89
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #-57
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #-97
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #55
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #-3
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #109
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #22
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #53
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #-33
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #84
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #41
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #-13
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #-16
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #62
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #-29
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #83
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #77
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #-115
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #-24
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #-40
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #-127
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #38
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #-113
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #97
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #-56
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #-62
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #-54
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #-98
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Zzky.Zo : Ljava/lang/Object;
    //   501: sipush #-30738
    //   504: sipush #1977
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Zzky.Zj : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF87E2) & 0xFFFF;
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
      char c = '§';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzky.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */