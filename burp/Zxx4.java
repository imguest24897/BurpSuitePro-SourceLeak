package burp;

import java.math.BigInteger;

class Zxx4 extends ClassLoader {
  static String Zq;
  
  static Object Zo;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zr(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZS(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zgyc.ZT : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zsow.ZV : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zll8.ZE : Ljava/lang/Object;
    //   22: getstatic burp/Zt7j.ZH : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: getstatic burp/Zs26.Z_ : Ljava/lang/Object;
    //   31: checkcast java/math/BigInteger
    //   34: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   37: putstatic burp/Zgia.Zx : Ljava/lang/Object;
    //   40: ldc2_w 8682522807148012
    //   43: invokestatic currentTimeMillis : ()J
    //   46: lxor
    //   47: lstore #4
    //   49: lload #4
    //   51: ldc2_w 25214903917
    //   54: lmul
    //   55: ldc2_w 11
    //   58: ladd
    //   59: ldc2_w 281474976710655
    //   62: land
    //   63: lstore #4
    //   65: lload #4
    //   67: bipush #32
    //   69: lshl
    //   70: lstore #6
    //   72: lload #4
    //   74: ldc2_w 25214903917
    //   77: lmul
    //   78: ldc2_w 11
    //   81: ladd
    //   82: ldc2_w 281474976710655
    //   85: land
    //   86: lstore #4
    //   88: lload #6
    //   90: lload #4
    //   92: ladd
    //   93: lstore #6
    //   95: bipush #16
    //   97: newarray byte
    //   99: dup
    //   100: iconst_0
    //   101: bipush #48
    //   103: bastore
    //   104: dup
    //   105: iconst_1
    //   106: bipush #49
    //   108: bastore
    //   109: dup
    //   110: iconst_2
    //   111: bipush #50
    //   113: bastore
    //   114: dup
    //   115: iconst_3
    //   116: bipush #51
    //   118: bastore
    //   119: dup
    //   120: iconst_4
    //   121: bipush #52
    //   123: bastore
    //   124: dup
    //   125: iconst_5
    //   126: bipush #53
    //   128: bastore
    //   129: dup
    //   130: bipush #6
    //   132: bipush #54
    //   134: bastore
    //   135: dup
    //   136: bipush #7
    //   138: bipush #55
    //   140: bastore
    //   141: dup
    //   142: bipush #8
    //   144: bipush #56
    //   146: bastore
    //   147: dup
    //   148: bipush #9
    //   150: bipush #57
    //   152: bastore
    //   153: dup
    //   154: bipush #10
    //   156: bipush #97
    //   158: bastore
    //   159: dup
    //   160: bipush #11
    //   162: bipush #98
    //   164: bastore
    //   165: dup
    //   166: bipush #12
    //   168: bipush #99
    //   170: bastore
    //   171: dup
    //   172: bipush #13
    //   174: bipush #100
    //   176: bastore
    //   177: dup
    //   178: bipush #14
    //   180: bipush #101
    //   182: bastore
    //   183: dup
    //   184: bipush #15
    //   186: bipush #102
    //   188: bastore
    //   189: astore #8
    //   191: bipush #64
    //   193: newarray byte
    //   195: astore #9
    //   197: bipush #64
    //   199: istore #10
    //   201: bipush #16
    //   203: istore #11
    //   205: iload #11
    //   207: iconst_1
    //   208: isub
    //   209: i2l
    //   210: lstore #12
    //   212: aload #9
    //   214: iinc #10, -1
    //   217: iload #10
    //   219: aload #8
    //   221: lload #6
    //   223: lload #12
    //   225: land
    //   226: l2i
    //   227: baload
    //   228: bastore
    //   229: lload #6
    //   231: iconst_4
    //   232: lushr
    //   233: lstore #6
    //   235: lload #6
    //   237: lconst_0
    //   238: lcmp
    //   239: ifne -> 212
    //   242: bipush #64
    //   244: iload #10
    //   246: isub
    //   247: newarray byte
    //   249: astore_3
    //   250: iconst_0
    //   251: istore #14
    //   253: iload #14
    //   255: aload_3
    //   256: arraylength
    //   257: if_icmpge -> 279
    //   260: aload_3
    //   261: iload #14
    //   263: aload #9
    //   265: iload #10
    //   267: iload #14
    //   269: iadd
    //   270: baload
    //   271: bastore
    //   272: iinc #14, 1
    //   275: iload_2
    //   276: ifne -> 253
    //   279: aload_3
    //   280: arraylength
    //   281: bipush #10
    //   283: if_icmplt -> 49
    //   286: sipush #-5344
    //   289: sipush #9671
    //   292: invokestatic a : (II)Ljava/lang/String;
    //   295: iconst_1
    //   296: ldc burp/Zgsy
    //   298: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   301: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   304: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   307: astore_3
    //   308: aload_3
    //   309: arraylength
    //   310: istore #4
    //   312: iconst_0
    //   313: istore #5
    //   315: iload #5
    //   317: iload #4
    //   319: if_icmpge -> 456
    //   322: aload_3
    //   323: iload #5
    //   325: aaload
    //   326: astore #6
    //   328: aload #6
    //   330: invokevirtual getModifiers : ()I
    //   333: invokestatic isStatic : (I)Z
    //   336: ifne -> 346
    //   339: goto -> 449
    //   342: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   345: athrow
    //   346: aload #6
    //   348: invokevirtual getType : ()Ljava/lang/Class;
    //   351: astore #7
    //   353: aload #7
    //   355: ifnull -> 436
    //   358: aload #7
    //   360: invokevirtual isPrimitive : ()Z
    //   363: ifne -> 436
    //   366: goto -> 373
    //   369: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   372: athrow
    //   373: aload #7
    //   375: invokevirtual getPackage : ()Ljava/lang/Package;
    //   378: ifnull -> 436
    //   381: goto -> 388
    //   384: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   387: athrow
    //   388: aload #7
    //   390: invokevirtual getPackage : ()Ljava/lang/Package;
    //   393: invokevirtual getName : ()Ljava/lang/String;
    //   396: ifnull -> 436
    //   399: goto -> 406
    //   402: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   405: athrow
    //   406: aload #7
    //   408: invokevirtual getPackage : ()Ljava/lang/Package;
    //   411: invokevirtual getName : ()Ljava/lang/String;
    //   414: sipush #-5329
    //   417: sipush #26644
    //   420: invokestatic a : (II)Ljava/lang/String;
    //   423: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   426: ifne -> 436
    //   429: goto -> 436
    //   432: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   435: athrow
    //   436: aload #6
    //   438: iconst_1
    //   439: invokevirtual setAccessible : (Z)V
    //   442: aload #6
    //   444: aconst_null
    //   445: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   448: pop
    //   449: iinc #5, 1
    //   452: iload_2
    //   453: ifne -> 315
    //   456: sipush #-5342
    //   459: sipush #-16364
    //   462: invokestatic a : (II)Ljava/lang/String;
    //   465: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   468: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   471: astore_3
    //   472: aload_3
    //   473: arraylength
    //   474: istore #4
    //   476: iconst_0
    //   477: istore #5
    //   479: iload #5
    //   481: iload #4
    //   483: if_icmpge -> 615
    //   486: aload_3
    //   487: iload #5
    //   489: aaload
    //   490: astore #6
    //   492: aload #6
    //   494: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   497: pop
    //   498: aload #6
    //   500: invokevirtual getModifiers : ()I
    //   503: invokestatic isStatic : (I)Z
    //   506: ifeq -> 601
    //   509: aload #6
    //   511: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   514: arraylength
    //   515: iconst_2
    //   516: if_icmpne -> 601
    //   519: goto -> 526
    //   522: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   525: athrow
    //   526: aload #6
    //   528: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   531: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   534: invokevirtual equals : (Ljava/lang/Object;)Z
    //   537: ifeq -> 601
    //   540: goto -> 547
    //   543: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   546: athrow
    //   547: aload #6
    //   549: iconst_1
    //   550: invokevirtual setAccessible : (Z)V
    //   553: aload #6
    //   555: aconst_null
    //   556: iconst_2
    //   557: anewarray java/lang/Object
    //   560: dup
    //   561: iconst_0
    //   562: aload_0
    //   563: aastore
    //   564: dup
    //   565: iconst_1
    //   566: aload_1
    //   567: ifnonnull -> 585
    //   570: goto -> 577
    //   573: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   576: athrow
    //   577: aload_1
    //   578: goto -> 592
    //   581: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   584: athrow
    //   585: aload_1
    //   586: checkcast [B
    //   589: invokevirtual clone : ()Ljava/lang/Object;
    //   592: aastore
    //   593: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   596: pop
    //   597: iload_2
    //   598: ifne -> 615
    //   601: iinc #5, 1
    //   604: iload_2
    //   605: ifne -> 479
    //   608: goto -> 615
    //   611: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   614: athrow
    //   615: getstatic burp/Zmuj.ZH : Ljava/lang/Object;
    //   618: checkcast java/math/BigInteger
    //   621: invokevirtual toByteArray : ()[B
    //   624: astore_3
    //   625: aload_3
    //   626: arraylength
    //   627: iconst_2
    //   628: iadd
    //   629: newarray byte
    //   631: astore #5
    //   633: iconst_0
    //   634: istore #6
    //   636: iload #6
    //   638: aload_3
    //   639: arraylength
    //   640: if_icmpge -> 659
    //   643: aload #5
    //   645: iload #6
    //   647: aload_3
    //   648: iload #6
    //   650: baload
    //   651: bastore
    //   652: iinc #6, 1
    //   655: iload_2
    //   656: ifne -> 636
    //   659: aload #5
    //   661: arraylength
    //   662: iconst_3
    //   663: idiv
    //   664: iconst_4
    //   665: imul
    //   666: newarray byte
    //   668: astore #4
    //   670: iconst_0
    //   671: istore #6
    //   673: iconst_0
    //   674: istore #7
    //   676: iload #6
    //   678: aload_3
    //   679: arraylength
    //   680: if_icmpge -> 791
    //   683: aload #4
    //   685: iload #7
    //   687: aload #5
    //   689: iload #6
    //   691: baload
    //   692: iconst_2
    //   693: iushr
    //   694: bipush #63
    //   696: iand
    //   697: i2b
    //   698: bastore
    //   699: aload #4
    //   701: iload #7
    //   703: iconst_1
    //   704: iadd
    //   705: aload #5
    //   707: iload #6
    //   709: iconst_1
    //   710: iadd
    //   711: baload
    //   712: iconst_4
    //   713: iushr
    //   714: bipush #15
    //   716: iand
    //   717: aload #5
    //   719: iload #6
    //   721: baload
    //   722: iconst_4
    //   723: ishl
    //   724: bipush #63
    //   726: iand
    //   727: ior
    //   728: i2b
    //   729: bastore
    //   730: aload #4
    //   732: iload #7
    //   734: iconst_2
    //   735: iadd
    //   736: aload #5
    //   738: iload #6
    //   740: iconst_2
    //   741: iadd
    //   742: baload
    //   743: bipush #6
    //   745: iushr
    //   746: iconst_3
    //   747: iand
    //   748: aload #5
    //   750: iload #6
    //   752: iconst_1
    //   753: iadd
    //   754: baload
    //   755: iconst_2
    //   756: ishl
    //   757: bipush #63
    //   759: iand
    //   760: ior
    //   761: i2b
    //   762: bastore
    //   763: aload #4
    //   765: iload #7
    //   767: iconst_3
    //   768: iadd
    //   769: aload #5
    //   771: iload #6
    //   773: iconst_2
    //   774: iadd
    //   775: baload
    //   776: bipush #63
    //   778: iand
    //   779: i2b
    //   780: bastore
    //   781: iinc #6, 3
    //   784: iinc #7, 4
    //   787: iload_2
    //   788: ifne -> 676
    //   791: iconst_0
    //   792: istore #6
    //   794: iload #6
    //   796: aload #4
    //   798: arraylength
    //   799: if_icmpge -> 983
    //   802: aload #4
    //   804: iload #6
    //   806: baload
    //   807: bipush #26
    //   809: if_icmpge -> 837
    //   812: aload #4
    //   814: iload #6
    //   816: aload #4
    //   818: iload #6
    //   820: baload
    //   821: bipush #65
    //   823: iadd
    //   824: i2b
    //   825: bastore
    //   826: iload_2
    //   827: ifne -> 976
    //   830: goto -> 837
    //   833: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   836: athrow
    //   837: aload #4
    //   839: iload #6
    //   841: baload
    //   842: bipush #52
    //   844: if_icmpge -> 882
    //   847: goto -> 854
    //   850: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   853: athrow
    //   854: aload #4
    //   856: iload #6
    //   858: aload #4
    //   860: iload #6
    //   862: baload
    //   863: bipush #97
    //   865: iadd
    //   866: bipush #26
    //   868: isub
    //   869: i2b
    //   870: bastore
    //   871: iload_2
    //   872: ifne -> 976
    //   875: goto -> 882
    //   878: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   881: athrow
    //   882: aload #4
    //   884: iload #6
    //   886: baload
    //   887: bipush #62
    //   889: if_icmpge -> 927
    //   892: goto -> 899
    //   895: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   898: athrow
    //   899: aload #4
    //   901: iload #6
    //   903: aload #4
    //   905: iload #6
    //   907: baload
    //   908: bipush #48
    //   910: iadd
    //   911: bipush #52
    //   913: isub
    //   914: i2b
    //   915: bastore
    //   916: iload_2
    //   917: ifne -> 976
    //   920: goto -> 927
    //   923: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   926: athrow
    //   927: aload #4
    //   929: iload #6
    //   931: baload
    //   932: bipush #63
    //   934: if_icmpge -> 962
    //   937: goto -> 944
    //   940: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   943: athrow
    //   944: aload #4
    //   946: iload #6
    //   948: bipush #43
    //   950: bastore
    //   951: iload_2
    //   952: ifne -> 976
    //   955: goto -> 962
    //   958: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   961: athrow
    //   962: aload #4
    //   964: iload #6
    //   966: bipush #47
    //   968: bastore
    //   969: goto -> 976
    //   972: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   975: athrow
    //   976: iinc #6, 1
    //   979: iload_2
    //   980: ifne -> 794
    //   983: aload #4
    //   985: arraylength
    //   986: iconst_1
    //   987: isub
    //   988: istore #6
    //   990: iload #6
    //   992: aload_3
    //   993: arraylength
    //   994: iconst_4
    //   995: imul
    //   996: iconst_3
    //   997: idiv
    //   998: if_icmple -> 1015
    //   1001: aload #4
    //   1003: iload #6
    //   1005: bipush #61
    //   1007: bastore
    //   1008: iinc #6, -1
    //   1011: iload_2
    //   1012: ifne -> 990
    //   1015: iconst_0
    //   1016: istore_3
    //   1017: getstatic burp/Ze4x.Zk : Ljava/lang/String;
    //   1020: getstatic burp/Zxc.ZR : Ljava/lang/Object;
    //   1023: checkcast java/math/BigInteger
    //   1026: invokevirtual intValue : ()I
    //   1029: bipush #32
    //   1031: irem
    //   1032: invokestatic abs : (I)I
    //   1035: invokevirtual charAt : (I)C
    //   1038: getstatic burp/Zbqk.ZZ : Ljava/lang/String;
    //   1041: getstatic burp/Zrpm.ZR : Ljava/lang/Object;
    //   1044: checkcast java/math/BigInteger
    //   1047: invokevirtual intValue : ()I
    //   1050: bipush #32
    //   1052: irem
    //   1053: invokestatic abs : (I)I
    //   1056: invokevirtual charAt : (I)C
    //   1059: if_icmple -> 1403
    //   1062: sipush #-5341
    //   1065: sipush #-28590
    //   1068: invokestatic a : (II)Ljava/lang/String;
    //   1071: iconst_1
    //   1072: ldc burp/Zz1k
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
    //   1193: sipush #-5334
    //   1196: sipush #7365
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
    //   1232: ifne -> 1093
    //   1235: sipush #-5332
    //   1238: sipush #18679
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
    //   1383: ifne -> 1400
    //   1386: iinc #6, 1
    //   1389: iload_2
    //   1390: ifne -> 1260
    //   1393: goto -> 1400
    //   1396: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1399: athrow
    //   1400: goto -> 1741
    //   1403: sipush #-5327
    //   1406: sipush #27328
    //   1409: invokestatic a : (II)Ljava/lang/String;
    //   1412: iconst_1
    //   1413: ldc burp/Zei_
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
    //   1534: sipush #-5334
    //   1537: sipush #7365
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
    //   1573: ifne -> 1434
    //   1576: sipush #-5335
    //   1579: sipush #4726
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
    //   1724: ifne -> 1741
    //   1727: iinc #6, 1
    //   1730: iload_2
    //   1731: ifne -> 1601
    //   1734: goto -> 1741
    //   1737: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1740: athrow
    //   1741: iload_3
    //   1742: ifeq -> 1747
    //   1745: iload_3
    //   1746: ireturn
    //   1747: getstatic burp/Zle6.Zh : Ljava/lang/String;
    //   1750: getstatic burp/Zsts.Zu : Ljava/lang/Object;
    //   1753: checkcast java/math/BigInteger
    //   1756: invokevirtual intValue : ()I
    //   1759: bipush #32
    //   1761: irem
    //   1762: invokestatic abs : (I)I
    //   1765: invokevirtual charAt : (I)C
    //   1768: getstatic burp/Zkgp.ZM : Ljava/lang/String;
    //   1771: getstatic burp/Zgia.Zx : Ljava/lang/Object;
    //   1774: checkcast java/math/BigInteger
    //   1777: invokevirtual intValue : ()I
    //   1780: bipush #32
    //   1782: irem
    //   1783: invokestatic abs : (I)I
    //   1786: invokevirtual charAt : (I)C
    //   1789: if_icmpgt -> 2134
    //   1792: sipush #-5320
    //   1795: sipush #28698
    //   1798: invokestatic a : (II)Ljava/lang/String;
    //   1801: iconst_1
    //   1802: ldc burp/Zvk
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
    //   1923: sipush #-5334
    //   1926: sipush #7365
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
    //   1962: ifne -> 1823
    //   1965: sipush #-5336
    //   1968: sipush #23224
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
    //   2113: ifne -> 2130
    //   2116: iinc #6, 1
    //   2119: iload_2
    //   2120: ifne -> 1990
    //   2123: goto -> 2130
    //   2126: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2129: athrow
    //   2130: iload_2
    //   2131: ifne -> 2472
    //   2134: sipush #-5330
    //   2137: sipush #10025
    //   2140: invokestatic a : (II)Ljava/lang/String;
    //   2143: iconst_1
    //   2144: ldc burp/Zl88
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
    //   2265: sipush #-5334
    //   2268: sipush #7365
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
    //   2304: ifne -> 2165
    //   2307: sipush #-5326
    //   2310: sipush #-15316
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
    //   2455: ifne -> 2472
    //   2458: iinc #6, 1
    //   2461: iload_2
    //   2462: ifne -> 2332
    //   2465: goto -> 2472
    //   2468: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2471: athrow
    //   2472: iload_3
    //   2473: ifeq -> 2478
    //   2476: iload_3
    //   2477: ireturn
    //   2478: getstatic burp/Zrka.Zy : Ljava/lang/String;
    //   2481: getstatic burp/Zll8.ZE : Ljava/lang/Object;
    //   2484: checkcast java/math/BigInteger
    //   2487: invokevirtual intValue : ()I
    //   2490: bipush #32
    //   2492: irem
    //   2493: invokestatic abs : (I)I
    //   2496: invokevirtual charAt : (I)C
    //   2499: getstatic burp/Ztsj.ZU : Ljava/lang/String;
    //   2502: getstatic burp/Zgre.ZD : Ljava/lang/Object;
    //   2505: checkcast java/math/BigInteger
    //   2508: invokevirtual intValue : ()I
    //   2511: bipush #32
    //   2513: irem
    //   2514: invokestatic abs : (I)I
    //   2517: invokevirtual charAt : (I)C
    //   2520: if_icmple -> 2865
    //   2523: sipush #-5319
    //   2526: sipush #-17978
    //   2529: invokestatic a : (II)Ljava/lang/String;
    //   2532: iconst_1
    //   2533: ldc burp/Zm81
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
    //   2654: sipush #-5334
    //   2657: sipush #7365
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
    //   2693: ifne -> 2554
    //   2696: sipush #-5322
    //   2699: sipush #18332
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
    //   2844: ifne -> 2861
    //   2847: iinc #6, 1
    //   2850: iload_2
    //   2851: ifne -> 2721
    //   2854: goto -> 2861
    //   2857: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2860: athrow
    //   2861: iload_2
    //   2862: ifne -> 3203
    //   2865: sipush #-5331
    //   2868: sipush #11433
    //   2871: invokestatic a : (II)Ljava/lang/String;
    //   2874: iconst_1
    //   2875: ldc burp/Zxd4
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
    //   2996: sipush #-5334
    //   2999: sipush #7365
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
    //   3035: ifne -> 2896
    //   3038: sipush #-5324
    //   3041: sipush #29258
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
    //   3186: ifne -> 3203
    //   3189: iinc #6, 1
    //   3192: iload_2
    //   3193: ifne -> 3063
    //   3196: goto -> 3203
    //   3199: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3202: athrow
    //   3203: iload_3
    //   3204: ifeq -> 3209
    //   3207: iload_3
    //   3208: ireturn
    //   3209: getstatic burp/Zgjj.Zi : Ljava/lang/String;
    //   3212: getstatic burp/Zkgp.Zw : Ljava/lang/Object;
    //   3215: checkcast java/math/BigInteger
    //   3218: invokevirtual intValue : ()I
    //   3221: bipush #32
    //   3223: irem
    //   3224: invokestatic abs : (I)I
    //   3227: invokevirtual charAt : (I)C
    //   3230: getstatic burp/Zg7w.ZI : Ljava/lang/String;
    //   3233: getstatic burp/Zgds.Z_ : Ljava/lang/Object;
    //   3236: checkcast java/math/BigInteger
    //   3239: invokevirtual intValue : ()I
    //   3242: bipush #32
    //   3244: irem
    //   3245: invokestatic abs : (I)I
    //   3248: invokevirtual charAt : (I)C
    //   3251: if_icmpgt -> 3596
    //   3254: sipush #-5339
    //   3257: sipush #7545
    //   3260: invokestatic a : (II)Ljava/lang/String;
    //   3263: iconst_1
    //   3264: ldc burp/Zre4
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
    //   3385: sipush #-5334
    //   3388: sipush #7365
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
    //   3424: ifne -> 3285
    //   3427: sipush #-5321
    //   3430: sipush #-3640
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
    //   3575: ifne -> 3592
    //   3578: iinc #6, 1
    //   3581: iload_2
    //   3582: ifne -> 3452
    //   3585: goto -> 3592
    //   3588: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3591: athrow
    //   3592: iload_2
    //   3593: ifne -> 3934
    //   3596: sipush #-5323
    //   3599: sipush #28123
    //   3602: invokestatic a : (II)Ljava/lang/String;
    //   3605: iconst_1
    //   3606: ldc burp/Zs8y
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
    //   3727: sipush #-5334
    //   3730: sipush #7365
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
    //   3766: ifne -> 3627
    //   3769: sipush #-5338
    //   3772: sipush #4873
    //   3775: invokestatic a : (II)Ljava/lang/String;
    //   3778: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3781: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3784: astore #4
    //   3786: aload #4
    //   3788: arraylength
    //   3789: istore #5
    //   3791: iconst_0
    //   3792: istore #6
    //   3794: iload #6
    //   3796: iload #5
    //   3798: if_icmpge -> 3934
    //   3801: aload #4
    //   3803: iload #6
    //   3805: aaload
    //   3806: astore #7
    //   3808: aload #7
    //   3810: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3813: pop
    //   3814: aload #7
    //   3816: invokevirtual getModifiers : ()I
    //   3819: invokestatic isStatic : (I)Z
    //   3822: ifeq -> 3920
    //   3825: aload #7
    //   3827: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3830: arraylength
    //   3831: iconst_2
    //   3832: if_icmpne -> 3920
    //   3835: goto -> 3842
    //   3838: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3841: athrow
    //   3842: aload #7
    //   3844: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3847: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3850: if_acmpne -> 3920
    //   3853: goto -> 3860
    //   3856: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3859: athrow
    //   3860: aload #7
    //   3862: iconst_1
    //   3863: invokevirtual setAccessible : (Z)V
    //   3866: aload #7
    //   3868: aconst_null
    //   3869: iconst_2
    //   3870: anewarray java/lang/Object
    //   3873: dup
    //   3874: iconst_0
    //   3875: aload_0
    //   3876: aastore
    //   3877: dup
    //   3878: iconst_1
    //   3879: aload_1
    //   3880: ifnonnull -> 3898
    //   3883: goto -> 3890
    //   3886: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3889: athrow
    //   3890: aload_1
    //   3891: goto -> 3905
    //   3894: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3897: athrow
    //   3898: aload_1
    //   3899: checkcast [B
    //   3902: invokevirtual clone : ()Ljava/lang/Object;
    //   3905: aastore
    //   3906: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3909: checkcast java/lang/Boolean
    //   3912: invokevirtual booleanValue : ()Z
    //   3915: istore_3
    //   3916: iload_2
    //   3917: ifne -> 3934
    //   3920: iinc #6, 1
    //   3923: iload_2
    //   3924: ifne -> 3794
    //   3927: goto -> 3934
    //   3930: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3933: athrow
    //   3934: iload_3
    //   3935: ireturn
    //   3936: astore_3
    //   3937: new java/lang/Exception
    //   3940: dup
    //   3941: aload_3
    //   3942: invokevirtual getMessage : ()Ljava/lang/String;
    //   3945: invokespecial <init> : (Ljava/lang/String;)V
    //   3948: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1746	3936	java/lang/Throwable
    //   328	342	342	java/lang/Throwable
    //   353	366	369	java/lang/Throwable
    //   358	381	384	java/lang/Throwable
    //   373	399	402	java/lang/Throwable
    //   388	429	432	java/lang/Throwable
    //   492	519	522	java/lang/Throwable
    //   509	540	543	java/lang/Throwable
    //   526	570	573	java/lang/Throwable
    //   547	581	581	java/lang/Throwable
    //   592	608	611	java/lang/Throwable
    //   802	830	833	java/lang/Throwable
    //   812	847	850	java/lang/Throwable
    //   837	875	878	java/lang/Throwable
    //   854	892	895	java/lang/Throwable
    //   882	920	923	java/lang/Throwable
    //   899	937	940	java/lang/Throwable
    //   927	955	958	java/lang/Throwable
    //   944	969	972	java/lang/Throwable
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
    //   1747	2477	3936	java/lang/Throwable
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
    //   2478	3208	3936	java/lang/Throwable
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
    //   3209	3935	3936	java/lang/Throwable
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
    //   3808	3835	3838	java/lang/Throwable
    //   3825	3853	3856	java/lang/Throwable
    //   3842	3883	3886	java/lang/Throwable
    //   3860	3894	3894	java/lang/Throwable
    //   3916	3927	3930	java/lang/Throwable
  }
  
  static void ZU(Object paramObject) {
    Zb0s.Zi = a(-5340, -30614);
    Zb0s.Zv = new BigInteger(a(-5337, -31629));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zgia.Zh.charAt(Math.abs(((BigInteger)Zgia.Zx).intValue() % 32)) > Zvos.Zk.charAt(Math.abs(((BigInteger)Zxf8.Zz).intValue() % 32))) {
          try {
            Zls0.Zn(Class.forName(a(-5343, -19823)));
            if (!bool)
              Ze08.ZT(Class.forName(a(-5325, 3001))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Ze08.ZT(Class.forName(a(-5325, 3001)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #26
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Æ¨ý¢Ìö¡\\tI;Yë._\\tãPð½m"\\tÞ W£É­ã\\t>¾·[AÀj ÏâçÆ¨J\\rï~FGÖ5æýDrîGõu¤@ÞMãä%å?ÖUÖ36âß æü ÒµzfÉ[4íU ýÿx§×1TEUÒ^þJÓ-ë±QK\\nêã\\f1Øà>E½\\tM%ç×Hiø\\t8aÅ]\\t×%(ævoæMnìCâo®r<D³\\tºqºÕ¼øu>ÁSpmª½WtóÊ«u£úëè-Y ¹Ýt­" R­è:>æÔ§{  aPãm\\btÛþ÷h·3\\t1îVQ}Y\\r­Ò L\\t*sÉÙJ\\tÿ,Fö~* /Jó  ÊWÑ¯al%öºåÀÛî%Í\\tú /R`é8\\t^»ÝÀÈ¬i\\tèVmF»àäO\\t½¹Ç»OLM\\t\\nÏ1uÝx)\\tÁH¾¢rÒ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
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
    //   68: ldc '\\r\\rÒéÖg£Õ\\tDÞ¨¨Y\\tß'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #67
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
    //   129: putstatic burp/Zxx4.a : [Ljava/lang/String;
    //   132: bipush #26
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zxx4.b : [Ljava/lang/String;
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
    //   212: bipush #28
    //   214: goto -> 244
    //   217: bipush #39
    //   219: goto -> 244
    //   222: bipush #123
    //   224: goto -> 244
    //   227: bipush #23
    //   229: goto -> 244
    //   232: bipush #30
    //   234: goto -> 244
    //   237: bipush #97
    //   239: goto -> 244
    //   242: bipush #45
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
    //   300: sipush #-5328
    //   303: sipush #-19529
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zxx4.Zq : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #-5333
    //   319: sipush #28889
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zxx4.Zo : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFEB21) & 0xFFFF;
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
      byte b1 = 56;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxx4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */