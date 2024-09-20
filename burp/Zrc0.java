package burp;

import java.math.BigInteger;

class Zrc0 extends ClassLoader {
  static String ZL;
  
  static Object Zz;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zg(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZH(Object paramObject) {
    Zg_y.ZF = a(21737, 24111);
    Zg_y.ZR = new BigInteger(a(21744, 15144));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zmcb.Zl.charAt(Math.abs(((BigInteger)Zep8.Zs).intValue() % 32)) > Zxzt.ZG.charAt(Math.abs(((BigInteger)Zrdo.ZK).intValue() % 32))) {
          try {
            Zszz.ZG(Class.forName(a(21732, -19691)));
            if (!bool)
              Zz4r.ZE(Class.forName(a(21758, -17643))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zz4r.ZE(Class.forName(a(21758, -17643)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zi(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   250: sipush #21741
    //   253: sipush #24413
    //   256: invokestatic a : (II)Ljava/lang/String;
    //   259: iconst_1
    //   260: ldc burp/Zgrf
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
    //   378: sipush #21755
    //   381: sipush #27141
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
    //   417: ifne -> 279
    //   420: sipush #21745
    //   423: sipush #-23575
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
    //   562: ifne -> 579
    //   565: iinc #5, 1
    //   568: iload_2
    //   569: ifne -> 443
    //   572: goto -> 579
    //   575: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   578: athrow
    //   579: iconst_0
    //   580: istore_3
    //   581: getstatic burp/Zstq.ZL : Ljava/lang/String;
    //   584: getstatic burp/Zm3s.ZW : Ljava/lang/Object;
    //   587: checkcast java/math/BigInteger
    //   590: invokevirtual intValue : ()I
    //   593: bipush #32
    //   595: irem
    //   596: invokestatic abs : (I)I
    //   599: invokevirtual charAt : (I)C
    //   602: getstatic burp/Zlfg.Zb : Ljava/lang/String;
    //   605: getstatic burp/Zm54.ZS : Ljava/lang/Object;
    //   608: checkcast java/math/BigInteger
    //   611: invokevirtual intValue : ()I
    //   614: bipush #32
    //   616: irem
    //   617: invokestatic abs : (I)I
    //   620: invokevirtual charAt : (I)C
    //   623: if_icmple -> 967
    //   626: sipush #21734
    //   629: sipush #11029
    //   632: invokestatic a : (II)Ljava/lang/String;
    //   635: iconst_1
    //   636: ldc burp/Zth8
    //   638: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   641: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   644: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   647: astore #4
    //   649: aload #4
    //   651: arraylength
    //   652: istore #5
    //   654: iconst_0
    //   655: istore #6
    //   657: iload #6
    //   659: iload #5
    //   661: if_icmpge -> 799
    //   664: aload #4
    //   666: iload #6
    //   668: aaload
    //   669: astore #7
    //   671: aload #7
    //   673: invokevirtual getModifiers : ()I
    //   676: invokestatic isStatic : (I)Z
    //   679: ifne -> 689
    //   682: goto -> 792
    //   685: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   688: athrow
    //   689: aload #7
    //   691: invokevirtual getType : ()Ljava/lang/Class;
    //   694: astore #8
    //   696: aload #8
    //   698: ifnull -> 779
    //   701: aload #8
    //   703: invokevirtual isPrimitive : ()Z
    //   706: ifne -> 779
    //   709: goto -> 716
    //   712: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   715: athrow
    //   716: aload #8
    //   718: invokevirtual getPackage : ()Ljava/lang/Package;
    //   721: ifnull -> 779
    //   724: goto -> 731
    //   727: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   730: athrow
    //   731: aload #8
    //   733: invokevirtual getPackage : ()Ljava/lang/Package;
    //   736: invokevirtual getName : ()Ljava/lang/String;
    //   739: ifnull -> 779
    //   742: goto -> 749
    //   745: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   748: athrow
    //   749: aload #8
    //   751: invokevirtual getPackage : ()Ljava/lang/Package;
    //   754: invokevirtual getName : ()Ljava/lang/String;
    //   757: sipush #21743
    //   760: sipush #-25367
    //   763: invokestatic a : (II)Ljava/lang/String;
    //   766: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   769: ifne -> 779
    //   772: goto -> 779
    //   775: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   778: athrow
    //   779: aload #7
    //   781: iconst_1
    //   782: invokevirtual setAccessible : (Z)V
    //   785: aload #7
    //   787: aconst_null
    //   788: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   791: pop
    //   792: iinc #6, 1
    //   795: iload_2
    //   796: ifne -> 657
    //   799: sipush #21729
    //   802: sipush #-12393
    //   805: invokestatic a : (II)Ljava/lang/String;
    //   808: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   811: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   814: astore #4
    //   816: aload #4
    //   818: arraylength
    //   819: istore #5
    //   821: iconst_0
    //   822: istore #6
    //   824: iload #6
    //   826: iload #5
    //   828: if_icmpge -> 964
    //   831: aload #4
    //   833: iload #6
    //   835: aaload
    //   836: astore #7
    //   838: aload #7
    //   840: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   843: pop
    //   844: aload #7
    //   846: invokevirtual getModifiers : ()I
    //   849: invokestatic isStatic : (I)Z
    //   852: ifeq -> 950
    //   855: aload #7
    //   857: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   860: arraylength
    //   861: iconst_2
    //   862: if_icmpne -> 950
    //   865: goto -> 872
    //   868: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   871: athrow
    //   872: aload #7
    //   874: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   877: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   880: if_acmpne -> 950
    //   883: goto -> 890
    //   886: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   889: athrow
    //   890: aload #7
    //   892: iconst_1
    //   893: invokevirtual setAccessible : (Z)V
    //   896: aload #7
    //   898: aconst_null
    //   899: iconst_2
    //   900: anewarray java/lang/Object
    //   903: dup
    //   904: iconst_0
    //   905: aload_0
    //   906: aastore
    //   907: dup
    //   908: iconst_1
    //   909: aload_1
    //   910: ifnonnull -> 928
    //   913: goto -> 920
    //   916: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   919: athrow
    //   920: aload_1
    //   921: goto -> 935
    //   924: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   927: athrow
    //   928: aload_1
    //   929: checkcast [B
    //   932: invokevirtual clone : ()Ljava/lang/Object;
    //   935: aastore
    //   936: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   939: checkcast java/lang/Boolean
    //   942: invokevirtual booleanValue : ()Z
    //   945: istore_3
    //   946: iload_2
    //   947: ifne -> 964
    //   950: iinc #6, 1
    //   953: iload_2
    //   954: ifne -> 824
    //   957: goto -> 964
    //   960: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   963: athrow
    //   964: goto -> 1305
    //   967: sipush #21739
    //   970: sipush #2505
    //   973: invokestatic a : (II)Ljava/lang/String;
    //   976: iconst_1
    //   977: ldc burp/Zg5
    //   979: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   982: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   985: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   988: astore #4
    //   990: aload #4
    //   992: arraylength
    //   993: istore #5
    //   995: iconst_0
    //   996: istore #6
    //   998: iload #6
    //   1000: iload #5
    //   1002: if_icmpge -> 1140
    //   1005: aload #4
    //   1007: iload #6
    //   1009: aaload
    //   1010: astore #7
    //   1012: aload #7
    //   1014: invokevirtual getModifiers : ()I
    //   1017: invokestatic isStatic : (I)Z
    //   1020: ifne -> 1030
    //   1023: goto -> 1133
    //   1026: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1029: athrow
    //   1030: aload #7
    //   1032: invokevirtual getType : ()Ljava/lang/Class;
    //   1035: astore #8
    //   1037: aload #8
    //   1039: ifnull -> 1120
    //   1042: aload #8
    //   1044: invokevirtual isPrimitive : ()Z
    //   1047: ifne -> 1120
    //   1050: goto -> 1057
    //   1053: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1056: athrow
    //   1057: aload #8
    //   1059: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1062: ifnull -> 1120
    //   1065: goto -> 1072
    //   1068: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1071: athrow
    //   1072: aload #8
    //   1074: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1077: invokevirtual getName : ()Ljava/lang/String;
    //   1080: ifnull -> 1120
    //   1083: goto -> 1090
    //   1086: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1089: athrow
    //   1090: aload #8
    //   1092: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1095: invokevirtual getName : ()Ljava/lang/String;
    //   1098: sipush #21743
    //   1101: sipush #-25367
    //   1104: invokestatic a : (II)Ljava/lang/String;
    //   1107: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1110: ifne -> 1120
    //   1113: goto -> 1120
    //   1116: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1119: athrow
    //   1120: aload #7
    //   1122: iconst_1
    //   1123: invokevirtual setAccessible : (Z)V
    //   1126: aload #7
    //   1128: aconst_null
    //   1129: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1132: pop
    //   1133: iinc #6, 1
    //   1136: iload_2
    //   1137: ifne -> 998
    //   1140: sipush #21730
    //   1143: sipush #11947
    //   1146: invokestatic a : (II)Ljava/lang/String;
    //   1149: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1152: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1155: astore #4
    //   1157: aload #4
    //   1159: arraylength
    //   1160: istore #5
    //   1162: iconst_0
    //   1163: istore #6
    //   1165: iload #6
    //   1167: iload #5
    //   1169: if_icmpge -> 1305
    //   1172: aload #4
    //   1174: iload #6
    //   1176: aaload
    //   1177: astore #7
    //   1179: aload #7
    //   1181: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1184: pop
    //   1185: aload #7
    //   1187: invokevirtual getModifiers : ()I
    //   1190: invokestatic isStatic : (I)Z
    //   1193: ifeq -> 1291
    //   1196: aload #7
    //   1198: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1201: arraylength
    //   1202: iconst_2
    //   1203: if_icmpne -> 1291
    //   1206: goto -> 1213
    //   1209: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1212: athrow
    //   1213: aload #7
    //   1215: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1218: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1221: if_acmpne -> 1291
    //   1224: goto -> 1231
    //   1227: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1230: athrow
    //   1231: aload #7
    //   1233: iconst_1
    //   1234: invokevirtual setAccessible : (Z)V
    //   1237: aload #7
    //   1239: aconst_null
    //   1240: iconst_2
    //   1241: anewarray java/lang/Object
    //   1244: dup
    //   1245: iconst_0
    //   1246: aload_0
    //   1247: aastore
    //   1248: dup
    //   1249: iconst_1
    //   1250: aload_1
    //   1251: ifnonnull -> 1269
    //   1254: goto -> 1261
    //   1257: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1260: athrow
    //   1261: aload_1
    //   1262: goto -> 1276
    //   1265: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1268: athrow
    //   1269: aload_1
    //   1270: checkcast [B
    //   1273: invokevirtual clone : ()Ljava/lang/Object;
    //   1276: aastore
    //   1277: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1280: checkcast java/lang/Boolean
    //   1283: invokevirtual booleanValue : ()Z
    //   1286: istore_3
    //   1287: iload_2
    //   1288: ifne -> 1305
    //   1291: iinc #6, 1
    //   1294: iload_2
    //   1295: ifne -> 1165
    //   1298: goto -> 1305
    //   1301: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1304: athrow
    //   1305: iload_3
    //   1306: ifeq -> 1311
    //   1309: iload_3
    //   1310: ireturn
    //   1311: getstatic burp/Zzx8.Z_ : Ljava/lang/String;
    //   1314: getstatic burp/Zstq.Zf : Ljava/lang/Object;
    //   1317: checkcast java/math/BigInteger
    //   1320: invokevirtual intValue : ()I
    //   1323: bipush #32
    //   1325: irem
    //   1326: invokestatic abs : (I)I
    //   1329: invokevirtual charAt : (I)C
    //   1332: getstatic burp/Zm54.Zg : Ljava/lang/String;
    //   1335: getstatic burp/Zr3j.ZT : Ljava/lang/Object;
    //   1338: checkcast java/math/BigInteger
    //   1341: invokevirtual intValue : ()I
    //   1344: bipush #32
    //   1346: irem
    //   1347: invokestatic abs : (I)I
    //   1350: invokevirtual charAt : (I)C
    //   1353: if_icmple -> 1698
    //   1356: sipush #21754
    //   1359: sipush #-25431
    //   1362: invokestatic a : (II)Ljava/lang/String;
    //   1365: iconst_1
    //   1366: ldc burp/Zsji
    //   1368: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1371: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1374: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1377: astore #4
    //   1379: aload #4
    //   1381: arraylength
    //   1382: istore #5
    //   1384: iconst_0
    //   1385: istore #6
    //   1387: iload #6
    //   1389: iload #5
    //   1391: if_icmpge -> 1529
    //   1394: aload #4
    //   1396: iload #6
    //   1398: aaload
    //   1399: astore #7
    //   1401: aload #7
    //   1403: invokevirtual getModifiers : ()I
    //   1406: invokestatic isStatic : (I)Z
    //   1409: ifne -> 1419
    //   1412: goto -> 1522
    //   1415: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1418: athrow
    //   1419: aload #7
    //   1421: invokevirtual getType : ()Ljava/lang/Class;
    //   1424: astore #8
    //   1426: aload #8
    //   1428: ifnull -> 1509
    //   1431: aload #8
    //   1433: invokevirtual isPrimitive : ()Z
    //   1436: ifne -> 1509
    //   1439: goto -> 1446
    //   1442: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1445: athrow
    //   1446: aload #8
    //   1448: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1451: ifnull -> 1509
    //   1454: goto -> 1461
    //   1457: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1460: athrow
    //   1461: aload #8
    //   1463: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1466: invokevirtual getName : ()Ljava/lang/String;
    //   1469: ifnull -> 1509
    //   1472: goto -> 1479
    //   1475: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1478: athrow
    //   1479: aload #8
    //   1481: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1484: invokevirtual getName : ()Ljava/lang/String;
    //   1487: sipush #21743
    //   1490: sipush #-25367
    //   1493: invokestatic a : (II)Ljava/lang/String;
    //   1496: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1499: ifne -> 1509
    //   1502: goto -> 1509
    //   1505: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1508: athrow
    //   1509: aload #7
    //   1511: iconst_1
    //   1512: invokevirtual setAccessible : (Z)V
    //   1515: aload #7
    //   1517: aconst_null
    //   1518: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1521: pop
    //   1522: iinc #6, 1
    //   1525: iload_2
    //   1526: ifne -> 1387
    //   1529: sipush #21738
    //   1532: sipush #-26940
    //   1535: invokestatic a : (II)Ljava/lang/String;
    //   1538: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1541: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1544: astore #4
    //   1546: aload #4
    //   1548: arraylength
    //   1549: istore #5
    //   1551: iconst_0
    //   1552: istore #6
    //   1554: iload #6
    //   1556: iload #5
    //   1558: if_icmpge -> 1694
    //   1561: aload #4
    //   1563: iload #6
    //   1565: aaload
    //   1566: astore #7
    //   1568: aload #7
    //   1570: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1573: pop
    //   1574: aload #7
    //   1576: invokevirtual getModifiers : ()I
    //   1579: invokestatic isStatic : (I)Z
    //   1582: ifeq -> 1680
    //   1585: aload #7
    //   1587: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1590: arraylength
    //   1591: iconst_2
    //   1592: if_icmpne -> 1680
    //   1595: goto -> 1602
    //   1598: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1601: athrow
    //   1602: aload #7
    //   1604: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1607: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1610: if_acmpne -> 1680
    //   1613: goto -> 1620
    //   1616: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1619: athrow
    //   1620: aload #7
    //   1622: iconst_1
    //   1623: invokevirtual setAccessible : (Z)V
    //   1626: aload #7
    //   1628: aconst_null
    //   1629: iconst_2
    //   1630: anewarray java/lang/Object
    //   1633: dup
    //   1634: iconst_0
    //   1635: aload_0
    //   1636: aastore
    //   1637: dup
    //   1638: iconst_1
    //   1639: aload_1
    //   1640: ifnonnull -> 1658
    //   1643: goto -> 1650
    //   1646: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1649: athrow
    //   1650: aload_1
    //   1651: goto -> 1665
    //   1654: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1657: athrow
    //   1658: aload_1
    //   1659: checkcast [B
    //   1662: invokevirtual clone : ()Ljava/lang/Object;
    //   1665: aastore
    //   1666: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1669: checkcast java/lang/Boolean
    //   1672: invokevirtual booleanValue : ()Z
    //   1675: istore_3
    //   1676: iload_2
    //   1677: ifne -> 1694
    //   1680: iinc #6, 1
    //   1683: iload_2
    //   1684: ifne -> 1554
    //   1687: goto -> 1694
    //   1690: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1693: athrow
    //   1694: iload_2
    //   1695: ifne -> 2036
    //   1698: sipush #21735
    //   1701: sipush #28780
    //   1704: invokestatic a : (II)Ljava/lang/String;
    //   1707: iconst_1
    //   1708: ldc burp/Zljx
    //   1710: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1713: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1716: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1719: astore #4
    //   1721: aload #4
    //   1723: arraylength
    //   1724: istore #5
    //   1726: iconst_0
    //   1727: istore #6
    //   1729: iload #6
    //   1731: iload #5
    //   1733: if_icmpge -> 1871
    //   1736: aload #4
    //   1738: iload #6
    //   1740: aaload
    //   1741: astore #7
    //   1743: aload #7
    //   1745: invokevirtual getModifiers : ()I
    //   1748: invokestatic isStatic : (I)Z
    //   1751: ifne -> 1761
    //   1754: goto -> 1864
    //   1757: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1760: athrow
    //   1761: aload #7
    //   1763: invokevirtual getType : ()Ljava/lang/Class;
    //   1766: astore #8
    //   1768: aload #8
    //   1770: ifnull -> 1851
    //   1773: aload #8
    //   1775: invokevirtual isPrimitive : ()Z
    //   1778: ifne -> 1851
    //   1781: goto -> 1788
    //   1784: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1787: athrow
    //   1788: aload #8
    //   1790: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1793: ifnull -> 1851
    //   1796: goto -> 1803
    //   1799: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1802: athrow
    //   1803: aload #8
    //   1805: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1808: invokevirtual getName : ()Ljava/lang/String;
    //   1811: ifnull -> 1851
    //   1814: goto -> 1821
    //   1817: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1820: athrow
    //   1821: aload #8
    //   1823: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1826: invokevirtual getName : ()Ljava/lang/String;
    //   1829: sipush #21743
    //   1832: sipush #-25367
    //   1835: invokestatic a : (II)Ljava/lang/String;
    //   1838: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1841: ifne -> 1851
    //   1844: goto -> 1851
    //   1847: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1850: athrow
    //   1851: aload #7
    //   1853: iconst_1
    //   1854: invokevirtual setAccessible : (Z)V
    //   1857: aload #7
    //   1859: aconst_null
    //   1860: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1863: pop
    //   1864: iinc #6, 1
    //   1867: iload_2
    //   1868: ifne -> 1729
    //   1871: sipush #21740
    //   1874: sipush #17299
    //   1877: invokestatic a : (II)Ljava/lang/String;
    //   1880: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1883: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1886: astore #4
    //   1888: aload #4
    //   1890: arraylength
    //   1891: istore #5
    //   1893: iconst_0
    //   1894: istore #6
    //   1896: iload #6
    //   1898: iload #5
    //   1900: if_icmpge -> 2036
    //   1903: aload #4
    //   1905: iload #6
    //   1907: aaload
    //   1908: astore #7
    //   1910: aload #7
    //   1912: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1915: pop
    //   1916: aload #7
    //   1918: invokevirtual getModifiers : ()I
    //   1921: invokestatic isStatic : (I)Z
    //   1924: ifeq -> 2022
    //   1927: aload #7
    //   1929: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1932: arraylength
    //   1933: iconst_2
    //   1934: if_icmpne -> 2022
    //   1937: goto -> 1944
    //   1940: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1943: athrow
    //   1944: aload #7
    //   1946: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1949: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1952: if_acmpne -> 2022
    //   1955: goto -> 1962
    //   1958: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1961: athrow
    //   1962: aload #7
    //   1964: iconst_1
    //   1965: invokevirtual setAccessible : (Z)V
    //   1968: aload #7
    //   1970: aconst_null
    //   1971: iconst_2
    //   1972: anewarray java/lang/Object
    //   1975: dup
    //   1976: iconst_0
    //   1977: aload_0
    //   1978: aastore
    //   1979: dup
    //   1980: iconst_1
    //   1981: aload_1
    //   1982: ifnonnull -> 2000
    //   1985: goto -> 1992
    //   1988: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1991: athrow
    //   1992: aload_1
    //   1993: goto -> 2007
    //   1996: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1999: athrow
    //   2000: aload_1
    //   2001: checkcast [B
    //   2004: invokevirtual clone : ()Ljava/lang/Object;
    //   2007: aastore
    //   2008: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2011: checkcast java/lang/Boolean
    //   2014: invokevirtual booleanValue : ()Z
    //   2017: istore_3
    //   2018: iload_2
    //   2019: ifne -> 2036
    //   2022: iinc #6, 1
    //   2025: iload_2
    //   2026: ifne -> 1896
    //   2029: goto -> 2036
    //   2032: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2035: athrow
    //   2036: iload_3
    //   2037: ifeq -> 2042
    //   2040: iload_3
    //   2041: ireturn
    //   2042: getstatic burp/Zk7b.ZE : Ljava/lang/String;
    //   2045: getstatic burp/Zgk1.ZD : Ljava/lang/Object;
    //   2048: checkcast java/math/BigInteger
    //   2051: invokevirtual intValue : ()I
    //   2054: bipush #32
    //   2056: irem
    //   2057: invokestatic abs : (I)I
    //   2060: invokevirtual charAt : (I)C
    //   2063: getstatic burp/Zltp.ZY : Ljava/lang/String;
    //   2066: getstatic burp/Zgmo.Zo : Ljava/lang/Object;
    //   2069: checkcast java/math/BigInteger
    //   2072: invokevirtual intValue : ()I
    //   2075: bipush #32
    //   2077: irem
    //   2078: invokestatic abs : (I)I
    //   2081: invokevirtual charAt : (I)C
    //   2084: if_icmple -> 2429
    //   2087: sipush #21757
    //   2090: sipush #-24394
    //   2093: invokestatic a : (II)Ljava/lang/String;
    //   2096: iconst_1
    //   2097: ldc burp/Zrj3
    //   2099: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2102: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2105: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2108: astore #4
    //   2110: aload #4
    //   2112: arraylength
    //   2113: istore #5
    //   2115: iconst_0
    //   2116: istore #6
    //   2118: iload #6
    //   2120: iload #5
    //   2122: if_icmpge -> 2260
    //   2125: aload #4
    //   2127: iload #6
    //   2129: aaload
    //   2130: astore #7
    //   2132: aload #7
    //   2134: invokevirtual getModifiers : ()I
    //   2137: invokestatic isStatic : (I)Z
    //   2140: ifne -> 2150
    //   2143: goto -> 2253
    //   2146: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2149: athrow
    //   2150: aload #7
    //   2152: invokevirtual getType : ()Ljava/lang/Class;
    //   2155: astore #8
    //   2157: aload #8
    //   2159: ifnull -> 2240
    //   2162: aload #8
    //   2164: invokevirtual isPrimitive : ()Z
    //   2167: ifne -> 2240
    //   2170: goto -> 2177
    //   2173: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2176: athrow
    //   2177: aload #8
    //   2179: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2182: ifnull -> 2240
    //   2185: goto -> 2192
    //   2188: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2191: athrow
    //   2192: aload #8
    //   2194: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2197: invokevirtual getName : ()Ljava/lang/String;
    //   2200: ifnull -> 2240
    //   2203: goto -> 2210
    //   2206: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2209: athrow
    //   2210: aload #8
    //   2212: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2215: invokevirtual getName : ()Ljava/lang/String;
    //   2218: sipush #21743
    //   2221: sipush #-25367
    //   2224: invokestatic a : (II)Ljava/lang/String;
    //   2227: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2230: ifne -> 2240
    //   2233: goto -> 2240
    //   2236: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2239: athrow
    //   2240: aload #7
    //   2242: iconst_1
    //   2243: invokevirtual setAccessible : (Z)V
    //   2246: aload #7
    //   2248: aconst_null
    //   2249: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2252: pop
    //   2253: iinc #6, 1
    //   2256: iload_2
    //   2257: ifne -> 2118
    //   2260: sipush #21752
    //   2263: sipush #30044
    //   2266: invokestatic a : (II)Ljava/lang/String;
    //   2269: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2272: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2275: astore #4
    //   2277: aload #4
    //   2279: arraylength
    //   2280: istore #5
    //   2282: iconst_0
    //   2283: istore #6
    //   2285: iload #6
    //   2287: iload #5
    //   2289: if_icmpge -> 2425
    //   2292: aload #4
    //   2294: iload #6
    //   2296: aaload
    //   2297: astore #7
    //   2299: aload #7
    //   2301: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2304: pop
    //   2305: aload #7
    //   2307: invokevirtual getModifiers : ()I
    //   2310: invokestatic isStatic : (I)Z
    //   2313: ifeq -> 2411
    //   2316: aload #7
    //   2318: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2321: arraylength
    //   2322: iconst_2
    //   2323: if_icmpne -> 2411
    //   2326: goto -> 2333
    //   2329: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2332: athrow
    //   2333: aload #7
    //   2335: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2338: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2341: if_acmpne -> 2411
    //   2344: goto -> 2351
    //   2347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2350: athrow
    //   2351: aload #7
    //   2353: iconst_1
    //   2354: invokevirtual setAccessible : (Z)V
    //   2357: aload #7
    //   2359: aconst_null
    //   2360: iconst_2
    //   2361: anewarray java/lang/Object
    //   2364: dup
    //   2365: iconst_0
    //   2366: aload_0
    //   2367: aastore
    //   2368: dup
    //   2369: iconst_1
    //   2370: aload_1
    //   2371: ifnonnull -> 2389
    //   2374: goto -> 2381
    //   2377: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2380: athrow
    //   2381: aload_1
    //   2382: goto -> 2396
    //   2385: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2388: athrow
    //   2389: aload_1
    //   2390: checkcast [B
    //   2393: invokevirtual clone : ()Ljava/lang/Object;
    //   2396: aastore
    //   2397: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2400: checkcast java/lang/Boolean
    //   2403: invokevirtual booleanValue : ()Z
    //   2406: istore_3
    //   2407: iload_2
    //   2408: ifne -> 2425
    //   2411: iinc #6, 1
    //   2414: iload_2
    //   2415: ifne -> 2285
    //   2418: goto -> 2425
    //   2421: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2424: athrow
    //   2425: iload_2
    //   2426: ifne -> 2767
    //   2429: sipush #21759
    //   2432: sipush #-20870
    //   2435: invokestatic a : (II)Ljava/lang/String;
    //   2438: iconst_1
    //   2439: ldc burp/Zr_z
    //   2441: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2444: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2447: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2450: astore #4
    //   2452: aload #4
    //   2454: arraylength
    //   2455: istore #5
    //   2457: iconst_0
    //   2458: istore #6
    //   2460: iload #6
    //   2462: iload #5
    //   2464: if_icmpge -> 2602
    //   2467: aload #4
    //   2469: iload #6
    //   2471: aaload
    //   2472: astore #7
    //   2474: aload #7
    //   2476: invokevirtual getModifiers : ()I
    //   2479: invokestatic isStatic : (I)Z
    //   2482: ifne -> 2492
    //   2485: goto -> 2595
    //   2488: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2491: athrow
    //   2492: aload #7
    //   2494: invokevirtual getType : ()Ljava/lang/Class;
    //   2497: astore #8
    //   2499: aload #8
    //   2501: ifnull -> 2582
    //   2504: aload #8
    //   2506: invokevirtual isPrimitive : ()Z
    //   2509: ifne -> 2582
    //   2512: goto -> 2519
    //   2515: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2518: athrow
    //   2519: aload #8
    //   2521: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2524: ifnull -> 2582
    //   2527: goto -> 2534
    //   2530: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2533: athrow
    //   2534: aload #8
    //   2536: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2539: invokevirtual getName : ()Ljava/lang/String;
    //   2542: ifnull -> 2582
    //   2545: goto -> 2552
    //   2548: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2551: athrow
    //   2552: aload #8
    //   2554: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2557: invokevirtual getName : ()Ljava/lang/String;
    //   2560: sipush #21743
    //   2563: sipush #-25367
    //   2566: invokestatic a : (II)Ljava/lang/String;
    //   2569: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2572: ifne -> 2582
    //   2575: goto -> 2582
    //   2578: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2581: athrow
    //   2582: aload #7
    //   2584: iconst_1
    //   2585: invokevirtual setAccessible : (Z)V
    //   2588: aload #7
    //   2590: aconst_null
    //   2591: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2594: pop
    //   2595: iinc #6, 1
    //   2598: iload_2
    //   2599: ifne -> 2460
    //   2602: sipush #21753
    //   2605: sipush #15559
    //   2608: invokestatic a : (II)Ljava/lang/String;
    //   2611: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2614: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2617: astore #4
    //   2619: aload #4
    //   2621: arraylength
    //   2622: istore #5
    //   2624: iconst_0
    //   2625: istore #6
    //   2627: iload #6
    //   2629: iload #5
    //   2631: if_icmpge -> 2767
    //   2634: aload #4
    //   2636: iload #6
    //   2638: aaload
    //   2639: astore #7
    //   2641: aload #7
    //   2643: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2646: pop
    //   2647: aload #7
    //   2649: invokevirtual getModifiers : ()I
    //   2652: invokestatic isStatic : (I)Z
    //   2655: ifeq -> 2753
    //   2658: aload #7
    //   2660: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2663: arraylength
    //   2664: iconst_2
    //   2665: if_icmpne -> 2753
    //   2668: goto -> 2675
    //   2671: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2674: athrow
    //   2675: aload #7
    //   2677: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2680: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2683: if_acmpne -> 2753
    //   2686: goto -> 2693
    //   2689: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2692: athrow
    //   2693: aload #7
    //   2695: iconst_1
    //   2696: invokevirtual setAccessible : (Z)V
    //   2699: aload #7
    //   2701: aconst_null
    //   2702: iconst_2
    //   2703: anewarray java/lang/Object
    //   2706: dup
    //   2707: iconst_0
    //   2708: aload_0
    //   2709: aastore
    //   2710: dup
    //   2711: iconst_1
    //   2712: aload_1
    //   2713: ifnonnull -> 2731
    //   2716: goto -> 2723
    //   2719: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2722: athrow
    //   2723: aload_1
    //   2724: goto -> 2738
    //   2727: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2730: athrow
    //   2731: aload_1
    //   2732: checkcast [B
    //   2735: invokevirtual clone : ()Ljava/lang/Object;
    //   2738: aastore
    //   2739: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2742: checkcast java/lang/Boolean
    //   2745: invokevirtual booleanValue : ()Z
    //   2748: istore_3
    //   2749: iload_2
    //   2750: ifne -> 2767
    //   2753: iinc #6, 1
    //   2756: iload_2
    //   2757: ifne -> 2627
    //   2760: goto -> 2767
    //   2763: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2766: athrow
    //   2767: iload_3
    //   2768: ifeq -> 2773
    //   2771: iload_3
    //   2772: ireturn
    //   2773: getstatic burp/Zgk1.Zv : Ljava/lang/String;
    //   2776: getstatic burp/Zlqy.ZP : Ljava/lang/Object;
    //   2779: checkcast java/math/BigInteger
    //   2782: invokevirtual intValue : ()I
    //   2785: bipush #32
    //   2787: irem
    //   2788: invokestatic abs : (I)I
    //   2791: invokevirtual charAt : (I)C
    //   2794: getstatic burp/Zxti.ZD : Ljava/lang/String;
    //   2797: getstatic burp/Zx0t.Zt : Ljava/lang/Object;
    //   2800: checkcast java/math/BigInteger
    //   2803: invokevirtual intValue : ()I
    //   2806: bipush #32
    //   2808: irem
    //   2809: invokestatic abs : (I)I
    //   2812: invokevirtual charAt : (I)C
    //   2815: if_icmpgt -> 3160
    //   2818: sipush #21733
    //   2821: sipush #-22495
    //   2824: invokestatic a : (II)Ljava/lang/String;
    //   2827: iconst_1
    //   2828: ldc burp/Zgvl
    //   2830: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2833: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2836: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2839: astore #4
    //   2841: aload #4
    //   2843: arraylength
    //   2844: istore #5
    //   2846: iconst_0
    //   2847: istore #6
    //   2849: iload #6
    //   2851: iload #5
    //   2853: if_icmpge -> 2991
    //   2856: aload #4
    //   2858: iload #6
    //   2860: aaload
    //   2861: astore #7
    //   2863: aload #7
    //   2865: invokevirtual getModifiers : ()I
    //   2868: invokestatic isStatic : (I)Z
    //   2871: ifne -> 2881
    //   2874: goto -> 2984
    //   2877: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2880: athrow
    //   2881: aload #7
    //   2883: invokevirtual getType : ()Ljava/lang/Class;
    //   2886: astore #8
    //   2888: aload #8
    //   2890: ifnull -> 2971
    //   2893: aload #8
    //   2895: invokevirtual isPrimitive : ()Z
    //   2898: ifne -> 2971
    //   2901: goto -> 2908
    //   2904: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2907: athrow
    //   2908: aload #8
    //   2910: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2913: ifnull -> 2971
    //   2916: goto -> 2923
    //   2919: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2922: athrow
    //   2923: aload #8
    //   2925: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2928: invokevirtual getName : ()Ljava/lang/String;
    //   2931: ifnull -> 2971
    //   2934: goto -> 2941
    //   2937: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2940: athrow
    //   2941: aload #8
    //   2943: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2946: invokevirtual getName : ()Ljava/lang/String;
    //   2949: sipush #21743
    //   2952: sipush #-25367
    //   2955: invokestatic a : (II)Ljava/lang/String;
    //   2958: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2961: ifne -> 2971
    //   2964: goto -> 2971
    //   2967: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2970: athrow
    //   2971: aload #7
    //   2973: iconst_1
    //   2974: invokevirtual setAccessible : (Z)V
    //   2977: aload #7
    //   2979: aconst_null
    //   2980: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2983: pop
    //   2984: iinc #6, 1
    //   2987: iload_2
    //   2988: ifne -> 2849
    //   2991: sipush #21736
    //   2994: sipush #25168
    //   2997: invokestatic a : (II)Ljava/lang/String;
    //   3000: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3003: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3006: astore #4
    //   3008: aload #4
    //   3010: arraylength
    //   3011: istore #5
    //   3013: iconst_0
    //   3014: istore #6
    //   3016: iload #6
    //   3018: iload #5
    //   3020: if_icmpge -> 3156
    //   3023: aload #4
    //   3025: iload #6
    //   3027: aaload
    //   3028: astore #7
    //   3030: aload #7
    //   3032: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3035: pop
    //   3036: aload #7
    //   3038: invokevirtual getModifiers : ()I
    //   3041: invokestatic isStatic : (I)Z
    //   3044: ifeq -> 3142
    //   3047: aload #7
    //   3049: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3052: arraylength
    //   3053: iconst_2
    //   3054: if_icmpne -> 3142
    //   3057: goto -> 3064
    //   3060: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3063: athrow
    //   3064: aload #7
    //   3066: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3069: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3072: if_acmpne -> 3142
    //   3075: goto -> 3082
    //   3078: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3081: athrow
    //   3082: aload #7
    //   3084: iconst_1
    //   3085: invokevirtual setAccessible : (Z)V
    //   3088: aload #7
    //   3090: aconst_null
    //   3091: iconst_2
    //   3092: anewarray java/lang/Object
    //   3095: dup
    //   3096: iconst_0
    //   3097: aload_0
    //   3098: aastore
    //   3099: dup
    //   3100: iconst_1
    //   3101: aload_1
    //   3102: ifnonnull -> 3120
    //   3105: goto -> 3112
    //   3108: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3111: athrow
    //   3112: aload_1
    //   3113: goto -> 3127
    //   3116: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3119: athrow
    //   3120: aload_1
    //   3121: checkcast [B
    //   3124: invokevirtual clone : ()Ljava/lang/Object;
    //   3127: aastore
    //   3128: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3131: checkcast java/lang/Boolean
    //   3134: invokevirtual booleanValue : ()Z
    //   3137: istore_3
    //   3138: iload_2
    //   3139: ifne -> 3156
    //   3142: iinc #6, 1
    //   3145: iload_2
    //   3146: ifne -> 3016
    //   3149: goto -> 3156
    //   3152: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3155: athrow
    //   3156: iload_2
    //   3157: ifne -> 3498
    //   3160: sipush #21756
    //   3163: sipush #-1504
    //   3166: invokestatic a : (II)Ljava/lang/String;
    //   3169: iconst_1
    //   3170: ldc burp/Zbow
    //   3172: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3175: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3178: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3181: astore #4
    //   3183: aload #4
    //   3185: arraylength
    //   3186: istore #5
    //   3188: iconst_0
    //   3189: istore #6
    //   3191: iload #6
    //   3193: iload #5
    //   3195: if_icmpge -> 3333
    //   3198: aload #4
    //   3200: iload #6
    //   3202: aaload
    //   3203: astore #7
    //   3205: aload #7
    //   3207: invokevirtual getModifiers : ()I
    //   3210: invokestatic isStatic : (I)Z
    //   3213: ifne -> 3223
    //   3216: goto -> 3326
    //   3219: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3222: athrow
    //   3223: aload #7
    //   3225: invokevirtual getType : ()Ljava/lang/Class;
    //   3228: astore #8
    //   3230: aload #8
    //   3232: ifnull -> 3313
    //   3235: aload #8
    //   3237: invokevirtual isPrimitive : ()Z
    //   3240: ifne -> 3313
    //   3243: goto -> 3250
    //   3246: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3249: athrow
    //   3250: aload #8
    //   3252: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3255: ifnull -> 3313
    //   3258: goto -> 3265
    //   3261: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3264: athrow
    //   3265: aload #8
    //   3267: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3270: invokevirtual getName : ()Ljava/lang/String;
    //   3273: ifnull -> 3313
    //   3276: goto -> 3283
    //   3279: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3282: athrow
    //   3283: aload #8
    //   3285: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3288: invokevirtual getName : ()Ljava/lang/String;
    //   3291: sipush #21743
    //   3294: sipush #-25367
    //   3297: invokestatic a : (II)Ljava/lang/String;
    //   3300: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3303: ifne -> 3313
    //   3306: goto -> 3313
    //   3309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3312: athrow
    //   3313: aload #7
    //   3315: iconst_1
    //   3316: invokevirtual setAccessible : (Z)V
    //   3319: aload #7
    //   3321: aconst_null
    //   3322: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3325: pop
    //   3326: iinc #6, 1
    //   3329: iload_2
    //   3330: ifne -> 3191
    //   3333: sipush #21728
    //   3336: sipush #463
    //   3339: invokestatic a : (II)Ljava/lang/String;
    //   3342: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3345: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3348: astore #4
    //   3350: aload #4
    //   3352: arraylength
    //   3353: istore #5
    //   3355: iconst_0
    //   3356: istore #6
    //   3358: iload #6
    //   3360: iload #5
    //   3362: if_icmpge -> 3498
    //   3365: aload #4
    //   3367: iload #6
    //   3369: aaload
    //   3370: astore #7
    //   3372: aload #7
    //   3374: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3377: pop
    //   3378: aload #7
    //   3380: invokevirtual getModifiers : ()I
    //   3383: invokestatic isStatic : (I)Z
    //   3386: ifeq -> 3484
    //   3389: aload #7
    //   3391: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3394: arraylength
    //   3395: iconst_2
    //   3396: if_icmpne -> 3484
    //   3399: goto -> 3406
    //   3402: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3405: athrow
    //   3406: aload #7
    //   3408: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3411: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3414: if_acmpne -> 3484
    //   3417: goto -> 3424
    //   3420: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3423: athrow
    //   3424: aload #7
    //   3426: iconst_1
    //   3427: invokevirtual setAccessible : (Z)V
    //   3430: aload #7
    //   3432: aconst_null
    //   3433: iconst_2
    //   3434: anewarray java/lang/Object
    //   3437: dup
    //   3438: iconst_0
    //   3439: aload_0
    //   3440: aastore
    //   3441: dup
    //   3442: iconst_1
    //   3443: aload_1
    //   3444: ifnonnull -> 3462
    //   3447: goto -> 3454
    //   3450: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3453: athrow
    //   3454: aload_1
    //   3455: goto -> 3469
    //   3458: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3461: athrow
    //   3462: aload_1
    //   3463: checkcast [B
    //   3466: invokevirtual clone : ()Ljava/lang/Object;
    //   3469: aastore
    //   3470: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3473: checkcast java/lang/Boolean
    //   3476: invokevirtual booleanValue : ()Z
    //   3479: istore_3
    //   3480: iload_2
    //   3481: ifne -> 3498
    //   3484: iinc #6, 1
    //   3487: iload_2
    //   3488: ifne -> 3358
    //   3491: goto -> 3498
    //   3494: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3497: athrow
    //   3498: iload_3
    //   3499: ireturn
    //   3500: astore_3
    //   3501: new java/lang/Exception
    //   3504: dup
    //   3505: aload_3
    //   3506: invokevirtual getMessage : ()Ljava/lang/String;
    //   3509: invokespecial <init> : (Ljava/lang/String;)V
    //   3512: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1310	3500	java/lang/Throwable
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
    //   671	685	685	java/lang/Throwable
    //   696	709	712	java/lang/Throwable
    //   701	724	727	java/lang/Throwable
    //   716	742	745	java/lang/Throwable
    //   731	772	775	java/lang/Throwable
    //   838	865	868	java/lang/Throwable
    //   855	883	886	java/lang/Throwable
    //   872	913	916	java/lang/Throwable
    //   890	924	924	java/lang/Throwable
    //   946	957	960	java/lang/Throwable
    //   1012	1026	1026	java/lang/Throwable
    //   1037	1050	1053	java/lang/Throwable
    //   1042	1065	1068	java/lang/Throwable
    //   1057	1083	1086	java/lang/Throwable
    //   1072	1113	1116	java/lang/Throwable
    //   1179	1206	1209	java/lang/Throwable
    //   1196	1224	1227	java/lang/Throwable
    //   1213	1254	1257	java/lang/Throwable
    //   1231	1265	1265	java/lang/Throwable
    //   1287	1298	1301	java/lang/Throwable
    //   1311	2041	3500	java/lang/Throwable
    //   1401	1415	1415	java/lang/Throwable
    //   1426	1439	1442	java/lang/Throwable
    //   1431	1454	1457	java/lang/Throwable
    //   1446	1472	1475	java/lang/Throwable
    //   1461	1502	1505	java/lang/Throwable
    //   1568	1595	1598	java/lang/Throwable
    //   1585	1613	1616	java/lang/Throwable
    //   1602	1643	1646	java/lang/Throwable
    //   1620	1654	1654	java/lang/Throwable
    //   1676	1687	1690	java/lang/Throwable
    //   1743	1757	1757	java/lang/Throwable
    //   1768	1781	1784	java/lang/Throwable
    //   1773	1796	1799	java/lang/Throwable
    //   1788	1814	1817	java/lang/Throwable
    //   1803	1844	1847	java/lang/Throwable
    //   1910	1937	1940	java/lang/Throwable
    //   1927	1955	1958	java/lang/Throwable
    //   1944	1985	1988	java/lang/Throwable
    //   1962	1996	1996	java/lang/Throwable
    //   2018	2029	2032	java/lang/Throwable
    //   2042	2772	3500	java/lang/Throwable
    //   2132	2146	2146	java/lang/Throwable
    //   2157	2170	2173	java/lang/Throwable
    //   2162	2185	2188	java/lang/Throwable
    //   2177	2203	2206	java/lang/Throwable
    //   2192	2233	2236	java/lang/Throwable
    //   2299	2326	2329	java/lang/Throwable
    //   2316	2344	2347	java/lang/Throwable
    //   2333	2374	2377	java/lang/Throwable
    //   2351	2385	2385	java/lang/Throwable
    //   2407	2418	2421	java/lang/Throwable
    //   2474	2488	2488	java/lang/Throwable
    //   2499	2512	2515	java/lang/Throwable
    //   2504	2527	2530	java/lang/Throwable
    //   2519	2545	2548	java/lang/Throwable
    //   2534	2575	2578	java/lang/Throwable
    //   2641	2668	2671	java/lang/Throwable
    //   2658	2686	2689	java/lang/Throwable
    //   2675	2716	2719	java/lang/Throwable
    //   2693	2727	2727	java/lang/Throwable
    //   2749	2760	2763	java/lang/Throwable
    //   2773	3499	3500	java/lang/Throwable
    //   2863	2877	2877	java/lang/Throwable
    //   2888	2901	2904	java/lang/Throwable
    //   2893	2916	2919	java/lang/Throwable
    //   2908	2934	2937	java/lang/Throwable
    //   2923	2964	2967	java/lang/Throwable
    //   3030	3057	3060	java/lang/Throwable
    //   3047	3075	3078	java/lang/Throwable
    //   3064	3105	3108	java/lang/Throwable
    //   3082	3116	3116	java/lang/Throwable
    //   3138	3149	3152	java/lang/Throwable
    //   3205	3219	3219	java/lang/Throwable
    //   3230	3243	3246	java/lang/Throwable
    //   3235	3258	3261	java/lang/Throwable
    //   3250	3276	3279	java/lang/Throwable
    //   3265	3306	3309	java/lang/Throwable
    //   3372	3399	3402	java/lang/Throwable
    //   3389	3417	3420	java/lang/Throwable
    //   3406	3447	3450	java/lang/Throwable
    //   3424	3458	3458	java/lang/Throwable
    //   3480	3491	3494	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #26
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ð¸¶u_C\\rîÌo¾QX±Ü¹3ÊVÙ[ïëò±A­\\bä»9¿Jz\\t\\b¤ø)¢ù\\tÆ]}cÑ||H\\tñ¶Î~æ6\\twt&3y^o¶ªsLØ$&îyÞd ~ÒçýAvàÙFÈFÆ*:j>íî\\rÂæT1"\\tÜ2:ÆbiIlfÓYjéïç3^«¿F\\t>¿b?ñZ\\n\\t0§£<É:\\r  ¥pJ·Çø#ï!Æ¢sj?ªÇ·Ê>õR\\tFm=\\tsµË~Är±HS\\tÓ<ßOFTöÄJ\\t{NÊä¼ôÑ\\t½ÿÜÑø\\t¸z²ëM\ñ¡\\t°³ËÜG:\\f¾$\\tÈ¼Y*{¨\\t>\\r\?\\t§´Q^vÆY\\tñ4ö;cF4â\\tÓ4ßNFt÷O'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #8
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
    //   68: ldc 'ÖÅ³R%g"M7p4)0É\\bä@²Lª3^¢s\\fçÒõ_làéà®9WÈFa¹P_'\\nðÛÓ¼Ì7þÕÒÚ/â ào6=¬»¤Q¶7ÅþÑ Ü'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #104
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
    //   129: putstatic burp/Zrc0.a : [Ljava/lang/String;
    //   132: bipush #26
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrc0.b : [Ljava/lang/String;
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
    //   212: bipush #45
    //   214: goto -> 243
    //   217: bipush #115
    //   219: goto -> 243
    //   222: bipush #85
    //   224: goto -> 243
    //   227: iconst_4
    //   228: goto -> 243
    //   231: bipush #12
    //   233: goto -> 243
    //   236: bipush #16
    //   238: goto -> 243
    //   241: bipush #47
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
    //   300: sipush #21731
    //   303: sipush #-6208
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zrc0.ZL : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #21742
    //   319: sipush #5262
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zrc0.Zz : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x54E9) & 0xFFFF;
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
      byte b1 = 75;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrc0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */