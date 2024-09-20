package burp;

import java.math.BigInteger;

class Zlh8 extends ClassLoader {
  static String ZY;
  
  static Object Zm;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZM(Object paramObject) {
    Zzoi.ZR = a(13115, -20164);
    Zzoi.ZI = new BigInteger(a(13117, -6921));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zrcy.Zq.charAt(Math.abs(((BigInteger)Zlo5.Zf).intValue() % 32)) <= Zzo5.ZX.charAt(Math.abs(((BigInteger)Ztkh.Zh).intValue() % 32))) {
          try {
            Zewo.ZT(Class.forName(a(13101, -2711)));
            if (!bool)
              Zxe.Zf(Class.forName(a(13092, -5318))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zxe.Zf(Class.forName(a(13092, -5318)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZW(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zt5j.Zn : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Ztkh.Zh : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zxo7.Zi : Ljava/lang/Object;
    //   22: sipush #13088
    //   25: sipush #-20739
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zg3v
    //   34: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   37: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   40: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   43: astore_3
    //   44: aload_3
    //   45: arraylength
    //   46: istore #4
    //   48: iconst_0
    //   49: istore #5
    //   51: iload #5
    //   53: iload #4
    //   55: if_icmpge -> 192
    //   58: aload_3
    //   59: iload #5
    //   61: aaload
    //   62: astore #6
    //   64: aload #6
    //   66: invokevirtual getModifiers : ()I
    //   69: invokestatic isStatic : (I)Z
    //   72: ifne -> 82
    //   75: goto -> 185
    //   78: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   81: athrow
    //   82: aload #6
    //   84: invokevirtual getType : ()Ljava/lang/Class;
    //   87: astore #7
    //   89: aload #7
    //   91: ifnull -> 172
    //   94: aload #7
    //   96: invokevirtual isPrimitive : ()Z
    //   99: ifne -> 172
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   108: athrow
    //   109: aload #7
    //   111: invokevirtual getPackage : ()Ljava/lang/Package;
    //   114: ifnull -> 172
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   123: athrow
    //   124: aload #7
    //   126: invokevirtual getPackage : ()Ljava/lang/Package;
    //   129: invokevirtual getName : ()Ljava/lang/String;
    //   132: ifnull -> 172
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   141: athrow
    //   142: aload #7
    //   144: invokevirtual getPackage : ()Ljava/lang/Package;
    //   147: invokevirtual getName : ()Ljava/lang/String;
    //   150: sipush #13106
    //   153: sipush #1671
    //   156: invokestatic a : (II)Ljava/lang/String;
    //   159: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   162: ifne -> 172
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   171: athrow
    //   172: aload #6
    //   174: iconst_1
    //   175: invokevirtual setAccessible : (Z)V
    //   178: aload #6
    //   180: aconst_null
    //   181: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   184: pop
    //   185: iinc #5, 1
    //   188: iload_2
    //   189: ifeq -> 51
    //   192: sipush #13103
    //   195: sipush #-5155
    //   198: invokestatic a : (II)Ljava/lang/String;
    //   201: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   204: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   207: astore_3
    //   208: aload_3
    //   209: arraylength
    //   210: istore #4
    //   212: iconst_0
    //   213: istore #5
    //   215: iload #5
    //   217: iload #4
    //   219: if_icmpge -> 351
    //   222: aload_3
    //   223: iload #5
    //   225: aaload
    //   226: astore #6
    //   228: aload #6
    //   230: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   233: pop
    //   234: aload #6
    //   236: invokevirtual getModifiers : ()I
    //   239: invokestatic isStatic : (I)Z
    //   242: ifeq -> 337
    //   245: aload #6
    //   247: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   250: arraylength
    //   251: iconst_2
    //   252: if_icmpne -> 337
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   261: athrow
    //   262: aload #6
    //   264: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   267: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   270: invokevirtual equals : (Ljava/lang/Object;)Z
    //   273: ifeq -> 337
    //   276: goto -> 283
    //   279: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   282: athrow
    //   283: aload #6
    //   285: iconst_1
    //   286: invokevirtual setAccessible : (Z)V
    //   289: aload #6
    //   291: aconst_null
    //   292: iconst_2
    //   293: anewarray java/lang/Object
    //   296: dup
    //   297: iconst_0
    //   298: aload_0
    //   299: aastore
    //   300: dup
    //   301: iconst_1
    //   302: aload_1
    //   303: ifnonnull -> 321
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   312: athrow
    //   313: aload_1
    //   314: goto -> 328
    //   317: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   320: athrow
    //   321: aload_1
    //   322: checkcast [B
    //   325: invokevirtual clone : ()Ljava/lang/Object;
    //   328: aastore
    //   329: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   332: pop
    //   333: iload_2
    //   334: ifeq -> 351
    //   337: iinc #5, 1
    //   340: iload_2
    //   341: ifeq -> 215
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   350: athrow
    //   351: ldc2_w 8682522807148012
    //   354: invokestatic currentTimeMillis : ()J
    //   357: lxor
    //   358: lstore #4
    //   360: lload #4
    //   362: ldc2_w 25214903917
    //   365: lmul
    //   366: ldc2_w 11
    //   369: ladd
    //   370: ldc2_w 281474976710655
    //   373: land
    //   374: lstore #4
    //   376: lload #4
    //   378: bipush #32
    //   380: lshl
    //   381: lstore #6
    //   383: lload #4
    //   385: ldc2_w 25214903917
    //   388: lmul
    //   389: ldc2_w 11
    //   392: ladd
    //   393: ldc2_w 281474976710655
    //   396: land
    //   397: lstore #4
    //   399: lload #6
    //   401: lload #4
    //   403: ladd
    //   404: lstore #6
    //   406: bipush #16
    //   408: newarray byte
    //   410: dup
    //   411: iconst_0
    //   412: bipush #48
    //   414: bastore
    //   415: dup
    //   416: iconst_1
    //   417: bipush #49
    //   419: bastore
    //   420: dup
    //   421: iconst_2
    //   422: bipush #50
    //   424: bastore
    //   425: dup
    //   426: iconst_3
    //   427: bipush #51
    //   429: bastore
    //   430: dup
    //   431: iconst_4
    //   432: bipush #52
    //   434: bastore
    //   435: dup
    //   436: iconst_5
    //   437: bipush #53
    //   439: bastore
    //   440: dup
    //   441: bipush #6
    //   443: bipush #54
    //   445: bastore
    //   446: dup
    //   447: bipush #7
    //   449: bipush #55
    //   451: bastore
    //   452: dup
    //   453: bipush #8
    //   455: bipush #56
    //   457: bastore
    //   458: dup
    //   459: bipush #9
    //   461: bipush #57
    //   463: bastore
    //   464: dup
    //   465: bipush #10
    //   467: bipush #97
    //   469: bastore
    //   470: dup
    //   471: bipush #11
    //   473: bipush #98
    //   475: bastore
    //   476: dup
    //   477: bipush #12
    //   479: bipush #99
    //   481: bastore
    //   482: dup
    //   483: bipush #13
    //   485: bipush #100
    //   487: bastore
    //   488: dup
    //   489: bipush #14
    //   491: bipush #101
    //   493: bastore
    //   494: dup
    //   495: bipush #15
    //   497: bipush #102
    //   499: bastore
    //   500: astore #8
    //   502: bipush #64
    //   504: newarray byte
    //   506: astore #9
    //   508: bipush #64
    //   510: istore #10
    //   512: bipush #16
    //   514: istore #11
    //   516: iload #11
    //   518: iconst_1
    //   519: isub
    //   520: i2l
    //   521: lstore #12
    //   523: aload #9
    //   525: iinc #10, -1
    //   528: iload #10
    //   530: aload #8
    //   532: lload #6
    //   534: lload #12
    //   536: land
    //   537: l2i
    //   538: baload
    //   539: bastore
    //   540: lload #6
    //   542: iconst_4
    //   543: lushr
    //   544: lstore #6
    //   546: lload #6
    //   548: lconst_0
    //   549: lcmp
    //   550: ifne -> 523
    //   553: bipush #64
    //   555: iload #10
    //   557: isub
    //   558: newarray byte
    //   560: astore_3
    //   561: iconst_0
    //   562: istore #14
    //   564: iload #14
    //   566: aload_3
    //   567: arraylength
    //   568: if_icmpge -> 590
    //   571: aload_3
    //   572: iload #14
    //   574: aload #9
    //   576: iload #10
    //   578: iload #14
    //   580: iadd
    //   581: baload
    //   582: bastore
    //   583: iinc #14, 1
    //   586: iload_2
    //   587: ifeq -> 564
    //   590: aload_3
    //   591: arraylength
    //   592: bipush #10
    //   594: if_icmplt -> 360
    //   597: iconst_0
    //   598: istore_3
    //   599: getstatic burp/Zxe.ZD : Ljava/lang/String;
    //   602: getstatic burp/Zxzz.ZM : Ljava/lang/Object;
    //   605: checkcast java/math/BigInteger
    //   608: invokevirtual intValue : ()I
    //   611: bipush #32
    //   613: irem
    //   614: invokestatic abs : (I)I
    //   617: invokevirtual charAt : (I)C
    //   620: getstatic burp/Zm4i.Zl : Ljava/lang/String;
    //   623: getstatic burp/Ze6d.Zw : Ljava/lang/Object;
    //   626: checkcast java/math/BigInteger
    //   629: invokevirtual intValue : ()I
    //   632: bipush #32
    //   634: irem
    //   635: invokestatic abs : (I)I
    //   638: invokevirtual charAt : (I)C
    //   641: if_icmpgt -> 985
    //   644: sipush #13107
    //   647: sipush #-16496
    //   650: invokestatic a : (II)Ljava/lang/String;
    //   653: iconst_1
    //   654: ldc burp/Zltp
    //   656: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   659: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   662: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   665: astore #4
    //   667: aload #4
    //   669: arraylength
    //   670: istore #5
    //   672: iconst_0
    //   673: istore #6
    //   675: iload #6
    //   677: iload #5
    //   679: if_icmpge -> 817
    //   682: aload #4
    //   684: iload #6
    //   686: aaload
    //   687: astore #7
    //   689: aload #7
    //   691: invokevirtual getModifiers : ()I
    //   694: invokestatic isStatic : (I)Z
    //   697: ifne -> 707
    //   700: goto -> 810
    //   703: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   706: athrow
    //   707: aload #7
    //   709: invokevirtual getType : ()Ljava/lang/Class;
    //   712: astore #8
    //   714: aload #8
    //   716: ifnull -> 797
    //   719: aload #8
    //   721: invokevirtual isPrimitive : ()Z
    //   724: ifne -> 797
    //   727: goto -> 734
    //   730: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   733: athrow
    //   734: aload #8
    //   736: invokevirtual getPackage : ()Ljava/lang/Package;
    //   739: ifnull -> 797
    //   742: goto -> 749
    //   745: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   748: athrow
    //   749: aload #8
    //   751: invokevirtual getPackage : ()Ljava/lang/Package;
    //   754: invokevirtual getName : ()Ljava/lang/String;
    //   757: ifnull -> 797
    //   760: goto -> 767
    //   763: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   766: athrow
    //   767: aload #8
    //   769: invokevirtual getPackage : ()Ljava/lang/Package;
    //   772: invokevirtual getName : ()Ljava/lang/String;
    //   775: sipush #13104
    //   778: sipush #10473
    //   781: invokestatic a : (II)Ljava/lang/String;
    //   784: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   787: ifne -> 797
    //   790: goto -> 797
    //   793: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   796: athrow
    //   797: aload #7
    //   799: iconst_1
    //   800: invokevirtual setAccessible : (Z)V
    //   803: aload #7
    //   805: aconst_null
    //   806: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   809: pop
    //   810: iinc #6, 1
    //   813: iload_2
    //   814: ifeq -> 675
    //   817: sipush #13099
    //   820: sipush #11614
    //   823: invokestatic a : (II)Ljava/lang/String;
    //   826: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   829: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   832: astore #4
    //   834: aload #4
    //   836: arraylength
    //   837: istore #5
    //   839: iconst_0
    //   840: istore #6
    //   842: iload #6
    //   844: iload #5
    //   846: if_icmpge -> 982
    //   849: aload #4
    //   851: iload #6
    //   853: aaload
    //   854: astore #7
    //   856: aload #7
    //   858: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   861: pop
    //   862: aload #7
    //   864: invokevirtual getModifiers : ()I
    //   867: invokestatic isStatic : (I)Z
    //   870: ifeq -> 968
    //   873: aload #7
    //   875: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   878: arraylength
    //   879: iconst_2
    //   880: if_icmpne -> 968
    //   883: goto -> 890
    //   886: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   889: athrow
    //   890: aload #7
    //   892: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   895: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   898: if_acmpne -> 968
    //   901: goto -> 908
    //   904: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   907: athrow
    //   908: aload #7
    //   910: iconst_1
    //   911: invokevirtual setAccessible : (Z)V
    //   914: aload #7
    //   916: aconst_null
    //   917: iconst_2
    //   918: anewarray java/lang/Object
    //   921: dup
    //   922: iconst_0
    //   923: aload_0
    //   924: aastore
    //   925: dup
    //   926: iconst_1
    //   927: aload_1
    //   928: ifnonnull -> 946
    //   931: goto -> 938
    //   934: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   937: athrow
    //   938: aload_1
    //   939: goto -> 953
    //   942: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   945: athrow
    //   946: aload_1
    //   947: checkcast [B
    //   950: invokevirtual clone : ()Ljava/lang/Object;
    //   953: aastore
    //   954: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   957: checkcast java/lang/Boolean
    //   960: invokevirtual booleanValue : ()Z
    //   963: istore_3
    //   964: iload_2
    //   965: ifeq -> 982
    //   968: iinc #6, 1
    //   971: iload_2
    //   972: ifeq -> 842
    //   975: goto -> 982
    //   978: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   981: athrow
    //   982: goto -> 1323
    //   985: sipush #13096
    //   988: sipush #959
    //   991: invokestatic a : (II)Ljava/lang/String;
    //   994: iconst_1
    //   995: ldc burp/Zgwu
    //   997: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1000: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1003: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1006: astore #4
    //   1008: aload #4
    //   1010: arraylength
    //   1011: istore #5
    //   1013: iconst_0
    //   1014: istore #6
    //   1016: iload #6
    //   1018: iload #5
    //   1020: if_icmpge -> 1158
    //   1023: aload #4
    //   1025: iload #6
    //   1027: aaload
    //   1028: astore #7
    //   1030: aload #7
    //   1032: invokevirtual getModifiers : ()I
    //   1035: invokestatic isStatic : (I)Z
    //   1038: ifne -> 1048
    //   1041: goto -> 1151
    //   1044: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1047: athrow
    //   1048: aload #7
    //   1050: invokevirtual getType : ()Ljava/lang/Class;
    //   1053: astore #8
    //   1055: aload #8
    //   1057: ifnull -> 1138
    //   1060: aload #8
    //   1062: invokevirtual isPrimitive : ()Z
    //   1065: ifne -> 1138
    //   1068: goto -> 1075
    //   1071: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1074: athrow
    //   1075: aload #8
    //   1077: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1080: ifnull -> 1138
    //   1083: goto -> 1090
    //   1086: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1089: athrow
    //   1090: aload #8
    //   1092: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1095: invokevirtual getName : ()Ljava/lang/String;
    //   1098: ifnull -> 1138
    //   1101: goto -> 1108
    //   1104: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1107: athrow
    //   1108: aload #8
    //   1110: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1113: invokevirtual getName : ()Ljava/lang/String;
    //   1116: sipush #13104
    //   1119: sipush #10473
    //   1122: invokestatic a : (II)Ljava/lang/String;
    //   1125: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1128: ifne -> 1138
    //   1131: goto -> 1138
    //   1134: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1137: athrow
    //   1138: aload #7
    //   1140: iconst_1
    //   1141: invokevirtual setAccessible : (Z)V
    //   1144: aload #7
    //   1146: aconst_null
    //   1147: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1150: pop
    //   1151: iinc #6, 1
    //   1154: iload_2
    //   1155: ifeq -> 1016
    //   1158: sipush #13098
    //   1161: sipush #7511
    //   1164: invokestatic a : (II)Ljava/lang/String;
    //   1167: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1170: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1173: astore #4
    //   1175: aload #4
    //   1177: arraylength
    //   1178: istore #5
    //   1180: iconst_0
    //   1181: istore #6
    //   1183: iload #6
    //   1185: iload #5
    //   1187: if_icmpge -> 1323
    //   1190: aload #4
    //   1192: iload #6
    //   1194: aaload
    //   1195: astore #7
    //   1197: aload #7
    //   1199: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1202: pop
    //   1203: aload #7
    //   1205: invokevirtual getModifiers : ()I
    //   1208: invokestatic isStatic : (I)Z
    //   1211: ifeq -> 1309
    //   1214: aload #7
    //   1216: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1219: arraylength
    //   1220: iconst_2
    //   1221: if_icmpne -> 1309
    //   1224: goto -> 1231
    //   1227: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1230: athrow
    //   1231: aload #7
    //   1233: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1236: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1239: if_acmpne -> 1309
    //   1242: goto -> 1249
    //   1245: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1248: athrow
    //   1249: aload #7
    //   1251: iconst_1
    //   1252: invokevirtual setAccessible : (Z)V
    //   1255: aload #7
    //   1257: aconst_null
    //   1258: iconst_2
    //   1259: anewarray java/lang/Object
    //   1262: dup
    //   1263: iconst_0
    //   1264: aload_0
    //   1265: aastore
    //   1266: dup
    //   1267: iconst_1
    //   1268: aload_1
    //   1269: ifnonnull -> 1287
    //   1272: goto -> 1279
    //   1275: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1278: athrow
    //   1279: aload_1
    //   1280: goto -> 1294
    //   1283: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1286: athrow
    //   1287: aload_1
    //   1288: checkcast [B
    //   1291: invokevirtual clone : ()Ljava/lang/Object;
    //   1294: aastore
    //   1295: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1298: checkcast java/lang/Boolean
    //   1301: invokevirtual booleanValue : ()Z
    //   1304: istore_3
    //   1305: iload_2
    //   1306: ifeq -> 1323
    //   1309: iinc #6, 1
    //   1312: iload_2
    //   1313: ifeq -> 1183
    //   1316: goto -> 1323
    //   1319: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1322: athrow
    //   1323: iload_3
    //   1324: ifeq -> 1329
    //   1327: iload_3
    //   1328: ireturn
    //   1329: getstatic burp/Zs_3.ZC : Ljava/lang/String;
    //   1332: getstatic burp/Zera.Zy : Ljava/lang/Object;
    //   1335: checkcast java/math/BigInteger
    //   1338: invokevirtual intValue : ()I
    //   1341: bipush #32
    //   1343: irem
    //   1344: invokestatic abs : (I)I
    //   1347: invokevirtual charAt : (I)C
    //   1350: getstatic burp/Zza8.Zm : Ljava/lang/String;
    //   1353: getstatic burp/Zsf7.Zg : Ljava/lang/Object;
    //   1356: checkcast java/math/BigInteger
    //   1359: invokevirtual intValue : ()I
    //   1362: bipush #32
    //   1364: irem
    //   1365: invokestatic abs : (I)I
    //   1368: invokevirtual charAt : (I)C
    //   1371: if_icmple -> 1716
    //   1374: sipush #13113
    //   1377: sipush #-25444
    //   1380: invokestatic a : (II)Ljava/lang/String;
    //   1383: iconst_1
    //   1384: ldc burp/Zlh2
    //   1386: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1389: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1392: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1395: astore #4
    //   1397: aload #4
    //   1399: arraylength
    //   1400: istore #5
    //   1402: iconst_0
    //   1403: istore #6
    //   1405: iload #6
    //   1407: iload #5
    //   1409: if_icmpge -> 1547
    //   1412: aload #4
    //   1414: iload #6
    //   1416: aaload
    //   1417: astore #7
    //   1419: aload #7
    //   1421: invokevirtual getModifiers : ()I
    //   1424: invokestatic isStatic : (I)Z
    //   1427: ifne -> 1437
    //   1430: goto -> 1540
    //   1433: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1436: athrow
    //   1437: aload #7
    //   1439: invokevirtual getType : ()Ljava/lang/Class;
    //   1442: astore #8
    //   1444: aload #8
    //   1446: ifnull -> 1527
    //   1449: aload #8
    //   1451: invokevirtual isPrimitive : ()Z
    //   1454: ifne -> 1527
    //   1457: goto -> 1464
    //   1460: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1463: athrow
    //   1464: aload #8
    //   1466: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1469: ifnull -> 1527
    //   1472: goto -> 1479
    //   1475: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1478: athrow
    //   1479: aload #8
    //   1481: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1484: invokevirtual getName : ()Ljava/lang/String;
    //   1487: ifnull -> 1527
    //   1490: goto -> 1497
    //   1493: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1496: athrow
    //   1497: aload #8
    //   1499: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1502: invokevirtual getName : ()Ljava/lang/String;
    //   1505: sipush #13104
    //   1508: sipush #10473
    //   1511: invokestatic a : (II)Ljava/lang/String;
    //   1514: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1517: ifne -> 1527
    //   1520: goto -> 1527
    //   1523: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1526: athrow
    //   1527: aload #7
    //   1529: iconst_1
    //   1530: invokevirtual setAccessible : (Z)V
    //   1533: aload #7
    //   1535: aconst_null
    //   1536: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1539: pop
    //   1540: iinc #6, 1
    //   1543: iload_2
    //   1544: ifeq -> 1405
    //   1547: sipush #13089
    //   1550: sipush #-9563
    //   1553: invokestatic a : (II)Ljava/lang/String;
    //   1556: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1559: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1562: astore #4
    //   1564: aload #4
    //   1566: arraylength
    //   1567: istore #5
    //   1569: iconst_0
    //   1570: istore #6
    //   1572: iload #6
    //   1574: iload #5
    //   1576: if_icmpge -> 1712
    //   1579: aload #4
    //   1581: iload #6
    //   1583: aaload
    //   1584: astore #7
    //   1586: aload #7
    //   1588: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1591: pop
    //   1592: aload #7
    //   1594: invokevirtual getModifiers : ()I
    //   1597: invokestatic isStatic : (I)Z
    //   1600: ifeq -> 1698
    //   1603: aload #7
    //   1605: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1608: arraylength
    //   1609: iconst_2
    //   1610: if_icmpne -> 1698
    //   1613: goto -> 1620
    //   1616: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1619: athrow
    //   1620: aload #7
    //   1622: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1625: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1628: if_acmpne -> 1698
    //   1631: goto -> 1638
    //   1634: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1637: athrow
    //   1638: aload #7
    //   1640: iconst_1
    //   1641: invokevirtual setAccessible : (Z)V
    //   1644: aload #7
    //   1646: aconst_null
    //   1647: iconst_2
    //   1648: anewarray java/lang/Object
    //   1651: dup
    //   1652: iconst_0
    //   1653: aload_0
    //   1654: aastore
    //   1655: dup
    //   1656: iconst_1
    //   1657: aload_1
    //   1658: ifnonnull -> 1676
    //   1661: goto -> 1668
    //   1664: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1667: athrow
    //   1668: aload_1
    //   1669: goto -> 1683
    //   1672: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1675: athrow
    //   1676: aload_1
    //   1677: checkcast [B
    //   1680: invokevirtual clone : ()Ljava/lang/Object;
    //   1683: aastore
    //   1684: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1687: checkcast java/lang/Boolean
    //   1690: invokevirtual booleanValue : ()Z
    //   1693: istore_3
    //   1694: iload_2
    //   1695: ifeq -> 1712
    //   1698: iinc #6, 1
    //   1701: iload_2
    //   1702: ifeq -> 1572
    //   1705: goto -> 1712
    //   1708: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1711: athrow
    //   1712: iload_2
    //   1713: ifeq -> 2054
    //   1716: sipush #13093
    //   1719: sipush #20004
    //   1722: invokestatic a : (II)Ljava/lang/String;
    //   1725: iconst_1
    //   1726: ldc burp/Zter
    //   1728: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1731: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1734: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1737: astore #4
    //   1739: aload #4
    //   1741: arraylength
    //   1742: istore #5
    //   1744: iconst_0
    //   1745: istore #6
    //   1747: iload #6
    //   1749: iload #5
    //   1751: if_icmpge -> 1889
    //   1754: aload #4
    //   1756: iload #6
    //   1758: aaload
    //   1759: astore #7
    //   1761: aload #7
    //   1763: invokevirtual getModifiers : ()I
    //   1766: invokestatic isStatic : (I)Z
    //   1769: ifne -> 1779
    //   1772: goto -> 1882
    //   1775: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1778: athrow
    //   1779: aload #7
    //   1781: invokevirtual getType : ()Ljava/lang/Class;
    //   1784: astore #8
    //   1786: aload #8
    //   1788: ifnull -> 1869
    //   1791: aload #8
    //   1793: invokevirtual isPrimitive : ()Z
    //   1796: ifne -> 1869
    //   1799: goto -> 1806
    //   1802: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1805: athrow
    //   1806: aload #8
    //   1808: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1811: ifnull -> 1869
    //   1814: goto -> 1821
    //   1817: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1820: athrow
    //   1821: aload #8
    //   1823: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1826: invokevirtual getName : ()Ljava/lang/String;
    //   1829: ifnull -> 1869
    //   1832: goto -> 1839
    //   1835: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1838: athrow
    //   1839: aload #8
    //   1841: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1844: invokevirtual getName : ()Ljava/lang/String;
    //   1847: sipush #13104
    //   1850: sipush #10473
    //   1853: invokestatic a : (II)Ljava/lang/String;
    //   1856: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1859: ifne -> 1869
    //   1862: goto -> 1869
    //   1865: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1868: athrow
    //   1869: aload #7
    //   1871: iconst_1
    //   1872: invokevirtual setAccessible : (Z)V
    //   1875: aload #7
    //   1877: aconst_null
    //   1878: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1881: pop
    //   1882: iinc #6, 1
    //   1885: iload_2
    //   1886: ifeq -> 1747
    //   1889: sipush #13110
    //   1892: sipush #30775
    //   1895: invokestatic a : (II)Ljava/lang/String;
    //   1898: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1901: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1904: astore #4
    //   1906: aload #4
    //   1908: arraylength
    //   1909: istore #5
    //   1911: iconst_0
    //   1912: istore #6
    //   1914: iload #6
    //   1916: iload #5
    //   1918: if_icmpge -> 2054
    //   1921: aload #4
    //   1923: iload #6
    //   1925: aaload
    //   1926: astore #7
    //   1928: aload #7
    //   1930: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1933: pop
    //   1934: aload #7
    //   1936: invokevirtual getModifiers : ()I
    //   1939: invokestatic isStatic : (I)Z
    //   1942: ifeq -> 2040
    //   1945: aload #7
    //   1947: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1950: arraylength
    //   1951: iconst_2
    //   1952: if_icmpne -> 2040
    //   1955: goto -> 1962
    //   1958: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1961: athrow
    //   1962: aload #7
    //   1964: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1967: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1970: if_acmpne -> 2040
    //   1973: goto -> 1980
    //   1976: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1979: athrow
    //   1980: aload #7
    //   1982: iconst_1
    //   1983: invokevirtual setAccessible : (Z)V
    //   1986: aload #7
    //   1988: aconst_null
    //   1989: iconst_2
    //   1990: anewarray java/lang/Object
    //   1993: dup
    //   1994: iconst_0
    //   1995: aload_0
    //   1996: aastore
    //   1997: dup
    //   1998: iconst_1
    //   1999: aload_1
    //   2000: ifnonnull -> 2018
    //   2003: goto -> 2010
    //   2006: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2009: athrow
    //   2010: aload_1
    //   2011: goto -> 2025
    //   2014: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2017: athrow
    //   2018: aload_1
    //   2019: checkcast [B
    //   2022: invokevirtual clone : ()Ljava/lang/Object;
    //   2025: aastore
    //   2026: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2029: checkcast java/lang/Boolean
    //   2032: invokevirtual booleanValue : ()Z
    //   2035: istore_3
    //   2036: iload_2
    //   2037: ifeq -> 2054
    //   2040: iinc #6, 1
    //   2043: iload_2
    //   2044: ifeq -> 1914
    //   2047: goto -> 2054
    //   2050: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2053: athrow
    //   2054: iload_3
    //   2055: ifeq -> 2060
    //   2058: iload_3
    //   2059: ireturn
    //   2060: getstatic burp/Ze5t.ZX : Ljava/lang/String;
    //   2063: getstatic burp/Zzyr.Za : Ljava/lang/Object;
    //   2066: checkcast java/math/BigInteger
    //   2069: invokevirtual intValue : ()I
    //   2072: bipush #32
    //   2074: irem
    //   2075: invokestatic abs : (I)I
    //   2078: invokevirtual charAt : (I)C
    //   2081: getstatic burp/Zqp.ZX : Ljava/lang/String;
    //   2084: getstatic burp/Ze8m.Zm : Ljava/lang/Object;
    //   2087: checkcast java/math/BigInteger
    //   2090: invokevirtual intValue : ()I
    //   2093: bipush #32
    //   2095: irem
    //   2096: invokestatic abs : (I)I
    //   2099: invokevirtual charAt : (I)C
    //   2102: if_icmpgt -> 2447
    //   2105: sipush #13116
    //   2108: sipush #1456
    //   2111: invokestatic a : (II)Ljava/lang/String;
    //   2114: iconst_1
    //   2115: ldc burp/Zel
    //   2117: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2120: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2123: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2126: astore #4
    //   2128: aload #4
    //   2130: arraylength
    //   2131: istore #5
    //   2133: iconst_0
    //   2134: istore #6
    //   2136: iload #6
    //   2138: iload #5
    //   2140: if_icmpge -> 2278
    //   2143: aload #4
    //   2145: iload #6
    //   2147: aaload
    //   2148: astore #7
    //   2150: aload #7
    //   2152: invokevirtual getModifiers : ()I
    //   2155: invokestatic isStatic : (I)Z
    //   2158: ifne -> 2168
    //   2161: goto -> 2271
    //   2164: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2167: athrow
    //   2168: aload #7
    //   2170: invokevirtual getType : ()Ljava/lang/Class;
    //   2173: astore #8
    //   2175: aload #8
    //   2177: ifnull -> 2258
    //   2180: aload #8
    //   2182: invokevirtual isPrimitive : ()Z
    //   2185: ifne -> 2258
    //   2188: goto -> 2195
    //   2191: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2194: athrow
    //   2195: aload #8
    //   2197: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2200: ifnull -> 2258
    //   2203: goto -> 2210
    //   2206: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2209: athrow
    //   2210: aload #8
    //   2212: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2215: invokevirtual getName : ()Ljava/lang/String;
    //   2218: ifnull -> 2258
    //   2221: goto -> 2228
    //   2224: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2227: athrow
    //   2228: aload #8
    //   2230: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2233: invokevirtual getName : ()Ljava/lang/String;
    //   2236: sipush #13104
    //   2239: sipush #10473
    //   2242: invokestatic a : (II)Ljava/lang/String;
    //   2245: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2248: ifne -> 2258
    //   2251: goto -> 2258
    //   2254: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2257: athrow
    //   2258: aload #7
    //   2260: iconst_1
    //   2261: invokevirtual setAccessible : (Z)V
    //   2264: aload #7
    //   2266: aconst_null
    //   2267: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2270: pop
    //   2271: iinc #6, 1
    //   2274: iload_2
    //   2275: ifeq -> 2136
    //   2278: sipush #13119
    //   2281: sipush #15346
    //   2284: invokestatic a : (II)Ljava/lang/String;
    //   2287: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2290: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2293: astore #4
    //   2295: aload #4
    //   2297: arraylength
    //   2298: istore #5
    //   2300: iconst_0
    //   2301: istore #6
    //   2303: iload #6
    //   2305: iload #5
    //   2307: if_icmpge -> 2443
    //   2310: aload #4
    //   2312: iload #6
    //   2314: aaload
    //   2315: astore #7
    //   2317: aload #7
    //   2319: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2322: pop
    //   2323: aload #7
    //   2325: invokevirtual getModifiers : ()I
    //   2328: invokestatic isStatic : (I)Z
    //   2331: ifeq -> 2429
    //   2334: aload #7
    //   2336: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2339: arraylength
    //   2340: iconst_2
    //   2341: if_icmpne -> 2429
    //   2344: goto -> 2351
    //   2347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2350: athrow
    //   2351: aload #7
    //   2353: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2356: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2359: if_acmpne -> 2429
    //   2362: goto -> 2369
    //   2365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2368: athrow
    //   2369: aload #7
    //   2371: iconst_1
    //   2372: invokevirtual setAccessible : (Z)V
    //   2375: aload #7
    //   2377: aconst_null
    //   2378: iconst_2
    //   2379: anewarray java/lang/Object
    //   2382: dup
    //   2383: iconst_0
    //   2384: aload_0
    //   2385: aastore
    //   2386: dup
    //   2387: iconst_1
    //   2388: aload_1
    //   2389: ifnonnull -> 2407
    //   2392: goto -> 2399
    //   2395: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2398: athrow
    //   2399: aload_1
    //   2400: goto -> 2414
    //   2403: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2406: athrow
    //   2407: aload_1
    //   2408: checkcast [B
    //   2411: invokevirtual clone : ()Ljava/lang/Object;
    //   2414: aastore
    //   2415: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2418: checkcast java/lang/Boolean
    //   2421: invokevirtual booleanValue : ()Z
    //   2424: istore_3
    //   2425: iload_2
    //   2426: ifeq -> 2443
    //   2429: iinc #6, 1
    //   2432: iload_2
    //   2433: ifeq -> 2303
    //   2436: goto -> 2443
    //   2439: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2442: athrow
    //   2443: iload_2
    //   2444: ifeq -> 2785
    //   2447: sipush #13100
    //   2450: sipush #-10748
    //   2453: invokestatic a : (II)Ljava/lang/String;
    //   2456: iconst_1
    //   2457: ldc burp/Zg_p
    //   2459: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2462: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2465: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2468: astore #4
    //   2470: aload #4
    //   2472: arraylength
    //   2473: istore #5
    //   2475: iconst_0
    //   2476: istore #6
    //   2478: iload #6
    //   2480: iload #5
    //   2482: if_icmpge -> 2620
    //   2485: aload #4
    //   2487: iload #6
    //   2489: aaload
    //   2490: astore #7
    //   2492: aload #7
    //   2494: invokevirtual getModifiers : ()I
    //   2497: invokestatic isStatic : (I)Z
    //   2500: ifne -> 2510
    //   2503: goto -> 2613
    //   2506: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2509: athrow
    //   2510: aload #7
    //   2512: invokevirtual getType : ()Ljava/lang/Class;
    //   2515: astore #8
    //   2517: aload #8
    //   2519: ifnull -> 2600
    //   2522: aload #8
    //   2524: invokevirtual isPrimitive : ()Z
    //   2527: ifne -> 2600
    //   2530: goto -> 2537
    //   2533: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2536: athrow
    //   2537: aload #8
    //   2539: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2542: ifnull -> 2600
    //   2545: goto -> 2552
    //   2548: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2551: athrow
    //   2552: aload #8
    //   2554: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2557: invokevirtual getName : ()Ljava/lang/String;
    //   2560: ifnull -> 2600
    //   2563: goto -> 2570
    //   2566: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2569: athrow
    //   2570: aload #8
    //   2572: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2575: invokevirtual getName : ()Ljava/lang/String;
    //   2578: sipush #13104
    //   2581: sipush #10473
    //   2584: invokestatic a : (II)Ljava/lang/String;
    //   2587: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2590: ifne -> 2600
    //   2593: goto -> 2600
    //   2596: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2599: athrow
    //   2600: aload #7
    //   2602: iconst_1
    //   2603: invokevirtual setAccessible : (Z)V
    //   2606: aload #7
    //   2608: aconst_null
    //   2609: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2612: pop
    //   2613: iinc #6, 1
    //   2616: iload_2
    //   2617: ifeq -> 2478
    //   2620: sipush #13111
    //   2623: sipush #17372
    //   2626: invokestatic a : (II)Ljava/lang/String;
    //   2629: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2632: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2635: astore #4
    //   2637: aload #4
    //   2639: arraylength
    //   2640: istore #5
    //   2642: iconst_0
    //   2643: istore #6
    //   2645: iload #6
    //   2647: iload #5
    //   2649: if_icmpge -> 2785
    //   2652: aload #4
    //   2654: iload #6
    //   2656: aaload
    //   2657: astore #7
    //   2659: aload #7
    //   2661: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2664: pop
    //   2665: aload #7
    //   2667: invokevirtual getModifiers : ()I
    //   2670: invokestatic isStatic : (I)Z
    //   2673: ifeq -> 2771
    //   2676: aload #7
    //   2678: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2681: arraylength
    //   2682: iconst_2
    //   2683: if_icmpne -> 2771
    //   2686: goto -> 2693
    //   2689: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2692: athrow
    //   2693: aload #7
    //   2695: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2698: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2701: if_acmpne -> 2771
    //   2704: goto -> 2711
    //   2707: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2710: athrow
    //   2711: aload #7
    //   2713: iconst_1
    //   2714: invokevirtual setAccessible : (Z)V
    //   2717: aload #7
    //   2719: aconst_null
    //   2720: iconst_2
    //   2721: anewarray java/lang/Object
    //   2724: dup
    //   2725: iconst_0
    //   2726: aload_0
    //   2727: aastore
    //   2728: dup
    //   2729: iconst_1
    //   2730: aload_1
    //   2731: ifnonnull -> 2749
    //   2734: goto -> 2741
    //   2737: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2740: athrow
    //   2741: aload_1
    //   2742: goto -> 2756
    //   2745: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2748: athrow
    //   2749: aload_1
    //   2750: checkcast [B
    //   2753: invokevirtual clone : ()Ljava/lang/Object;
    //   2756: aastore
    //   2757: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2760: checkcast java/lang/Boolean
    //   2763: invokevirtual booleanValue : ()Z
    //   2766: istore_3
    //   2767: iload_2
    //   2768: ifeq -> 2785
    //   2771: iinc #6, 1
    //   2774: iload_2
    //   2775: ifeq -> 2645
    //   2778: goto -> 2785
    //   2781: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2784: athrow
    //   2785: iload_3
    //   2786: ifeq -> 2791
    //   2789: iload_3
    //   2790: ireturn
    //   2791: getstatic burp/Zeqg.Zh : Ljava/lang/String;
    //   2794: getstatic burp/Zt0t.ZL : Ljava/lang/Object;
    //   2797: checkcast java/math/BigInteger
    //   2800: invokevirtual intValue : ()I
    //   2803: bipush #32
    //   2805: irem
    //   2806: invokestatic abs : (I)I
    //   2809: invokevirtual charAt : (I)C
    //   2812: getstatic burp/Zeoy.ZS : Ljava/lang/String;
    //   2815: getstatic burp/Zke7.Zj : Ljava/lang/Object;
    //   2818: checkcast java/math/BigInteger
    //   2821: invokevirtual intValue : ()I
    //   2824: bipush #32
    //   2826: irem
    //   2827: invokestatic abs : (I)I
    //   2830: invokevirtual charAt : (I)C
    //   2833: if_icmpgt -> 3178
    //   2836: sipush #13108
    //   2839: sipush #-3690
    //   2842: invokestatic a : (II)Ljava/lang/String;
    //   2845: iconst_1
    //   2846: ldc burp/Zsxo
    //   2848: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2851: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2854: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2857: astore #4
    //   2859: aload #4
    //   2861: arraylength
    //   2862: istore #5
    //   2864: iconst_0
    //   2865: istore #6
    //   2867: iload #6
    //   2869: iload #5
    //   2871: if_icmpge -> 3009
    //   2874: aload #4
    //   2876: iload #6
    //   2878: aaload
    //   2879: astore #7
    //   2881: aload #7
    //   2883: invokevirtual getModifiers : ()I
    //   2886: invokestatic isStatic : (I)Z
    //   2889: ifne -> 2899
    //   2892: goto -> 3002
    //   2895: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2898: athrow
    //   2899: aload #7
    //   2901: invokevirtual getType : ()Ljava/lang/Class;
    //   2904: astore #8
    //   2906: aload #8
    //   2908: ifnull -> 2989
    //   2911: aload #8
    //   2913: invokevirtual isPrimitive : ()Z
    //   2916: ifne -> 2989
    //   2919: goto -> 2926
    //   2922: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2925: athrow
    //   2926: aload #8
    //   2928: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2931: ifnull -> 2989
    //   2934: goto -> 2941
    //   2937: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2940: athrow
    //   2941: aload #8
    //   2943: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2946: invokevirtual getName : ()Ljava/lang/String;
    //   2949: ifnull -> 2989
    //   2952: goto -> 2959
    //   2955: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2958: athrow
    //   2959: aload #8
    //   2961: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2964: invokevirtual getName : ()Ljava/lang/String;
    //   2967: sipush #13104
    //   2970: sipush #10473
    //   2973: invokestatic a : (II)Ljava/lang/String;
    //   2976: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2979: ifne -> 2989
    //   2982: goto -> 2989
    //   2985: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2988: athrow
    //   2989: aload #7
    //   2991: iconst_1
    //   2992: invokevirtual setAccessible : (Z)V
    //   2995: aload #7
    //   2997: aconst_null
    //   2998: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3001: pop
    //   3002: iinc #6, 1
    //   3005: iload_2
    //   3006: ifeq -> 2867
    //   3009: sipush #13114
    //   3012: sipush #26273
    //   3015: invokestatic a : (II)Ljava/lang/String;
    //   3018: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3021: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3024: astore #4
    //   3026: aload #4
    //   3028: arraylength
    //   3029: istore #5
    //   3031: iconst_0
    //   3032: istore #6
    //   3034: iload #6
    //   3036: iload #5
    //   3038: if_icmpge -> 3174
    //   3041: aload #4
    //   3043: iload #6
    //   3045: aaload
    //   3046: astore #7
    //   3048: aload #7
    //   3050: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3053: pop
    //   3054: aload #7
    //   3056: invokevirtual getModifiers : ()I
    //   3059: invokestatic isStatic : (I)Z
    //   3062: ifeq -> 3160
    //   3065: aload #7
    //   3067: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3070: arraylength
    //   3071: iconst_2
    //   3072: if_icmpne -> 3160
    //   3075: goto -> 3082
    //   3078: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3081: athrow
    //   3082: aload #7
    //   3084: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3087: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3090: if_acmpne -> 3160
    //   3093: goto -> 3100
    //   3096: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3099: athrow
    //   3100: aload #7
    //   3102: iconst_1
    //   3103: invokevirtual setAccessible : (Z)V
    //   3106: aload #7
    //   3108: aconst_null
    //   3109: iconst_2
    //   3110: anewarray java/lang/Object
    //   3113: dup
    //   3114: iconst_0
    //   3115: aload_0
    //   3116: aastore
    //   3117: dup
    //   3118: iconst_1
    //   3119: aload_1
    //   3120: ifnonnull -> 3138
    //   3123: goto -> 3130
    //   3126: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3129: athrow
    //   3130: aload_1
    //   3131: goto -> 3145
    //   3134: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3137: athrow
    //   3138: aload_1
    //   3139: checkcast [B
    //   3142: invokevirtual clone : ()Ljava/lang/Object;
    //   3145: aastore
    //   3146: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3149: checkcast java/lang/Boolean
    //   3152: invokevirtual booleanValue : ()Z
    //   3155: istore_3
    //   3156: iload_2
    //   3157: ifeq -> 3174
    //   3160: iinc #6, 1
    //   3163: iload_2
    //   3164: ifeq -> 3034
    //   3167: goto -> 3174
    //   3170: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3173: athrow
    //   3174: iload_2
    //   3175: ifeq -> 3516
    //   3178: sipush #13109
    //   3181: sipush #25404
    //   3184: invokestatic a : (II)Ljava/lang/String;
    //   3187: iconst_1
    //   3188: ldc burp/Zsuw
    //   3190: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3193: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3196: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3199: astore #4
    //   3201: aload #4
    //   3203: arraylength
    //   3204: istore #5
    //   3206: iconst_0
    //   3207: istore #6
    //   3209: iload #6
    //   3211: iload #5
    //   3213: if_icmpge -> 3351
    //   3216: aload #4
    //   3218: iload #6
    //   3220: aaload
    //   3221: astore #7
    //   3223: aload #7
    //   3225: invokevirtual getModifiers : ()I
    //   3228: invokestatic isStatic : (I)Z
    //   3231: ifne -> 3241
    //   3234: goto -> 3344
    //   3237: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3240: athrow
    //   3241: aload #7
    //   3243: invokevirtual getType : ()Ljava/lang/Class;
    //   3246: astore #8
    //   3248: aload #8
    //   3250: ifnull -> 3331
    //   3253: aload #8
    //   3255: invokevirtual isPrimitive : ()Z
    //   3258: ifne -> 3331
    //   3261: goto -> 3268
    //   3264: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3267: athrow
    //   3268: aload #8
    //   3270: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3273: ifnull -> 3331
    //   3276: goto -> 3283
    //   3279: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3282: athrow
    //   3283: aload #8
    //   3285: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3288: invokevirtual getName : ()Ljava/lang/String;
    //   3291: ifnull -> 3331
    //   3294: goto -> 3301
    //   3297: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3300: athrow
    //   3301: aload #8
    //   3303: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3306: invokevirtual getName : ()Ljava/lang/String;
    //   3309: sipush #13104
    //   3312: sipush #10473
    //   3315: invokestatic a : (II)Ljava/lang/String;
    //   3318: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3321: ifne -> 3331
    //   3324: goto -> 3331
    //   3327: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3330: athrow
    //   3331: aload #7
    //   3333: iconst_1
    //   3334: invokevirtual setAccessible : (Z)V
    //   3337: aload #7
    //   3339: aconst_null
    //   3340: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3343: pop
    //   3344: iinc #6, 1
    //   3347: iload_2
    //   3348: ifeq -> 3209
    //   3351: sipush #13118
    //   3354: sipush #28686
    //   3357: invokestatic a : (II)Ljava/lang/String;
    //   3360: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3363: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3366: astore #4
    //   3368: aload #4
    //   3370: arraylength
    //   3371: istore #5
    //   3373: iconst_0
    //   3374: istore #6
    //   3376: iload #6
    //   3378: iload #5
    //   3380: if_icmpge -> 3516
    //   3383: aload #4
    //   3385: iload #6
    //   3387: aaload
    //   3388: astore #7
    //   3390: aload #7
    //   3392: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3395: pop
    //   3396: aload #7
    //   3398: invokevirtual getModifiers : ()I
    //   3401: invokestatic isStatic : (I)Z
    //   3404: ifeq -> 3502
    //   3407: aload #7
    //   3409: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3412: arraylength
    //   3413: iconst_2
    //   3414: if_icmpne -> 3502
    //   3417: goto -> 3424
    //   3420: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3423: athrow
    //   3424: aload #7
    //   3426: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3429: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3432: if_acmpne -> 3502
    //   3435: goto -> 3442
    //   3438: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3441: athrow
    //   3442: aload #7
    //   3444: iconst_1
    //   3445: invokevirtual setAccessible : (Z)V
    //   3448: aload #7
    //   3450: aconst_null
    //   3451: iconst_2
    //   3452: anewarray java/lang/Object
    //   3455: dup
    //   3456: iconst_0
    //   3457: aload_0
    //   3458: aastore
    //   3459: dup
    //   3460: iconst_1
    //   3461: aload_1
    //   3462: ifnonnull -> 3480
    //   3465: goto -> 3472
    //   3468: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3471: athrow
    //   3472: aload_1
    //   3473: goto -> 3487
    //   3476: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3479: athrow
    //   3480: aload_1
    //   3481: checkcast [B
    //   3484: invokevirtual clone : ()Ljava/lang/Object;
    //   3487: aastore
    //   3488: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3491: checkcast java/lang/Boolean
    //   3494: invokevirtual booleanValue : ()Z
    //   3497: istore_3
    //   3498: iload_2
    //   3499: ifeq -> 3516
    //   3502: iinc #6, 1
    //   3505: iload_2
    //   3506: ifeq -> 3376
    //   3509: goto -> 3516
    //   3512: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3515: athrow
    //   3516: iload_3
    //   3517: ifeq -> 3522
    //   3520: iload_3
    //   3521: ireturn
    //   3522: getstatic burp/Zs8y.Zr : Ljava/lang/String;
    //   3525: getstatic burp/Zrof.ZB : Ljava/lang/Object;
    //   3528: checkcast java/math/BigInteger
    //   3531: invokevirtual intValue : ()I
    //   3534: bipush #32
    //   3536: irem
    //   3537: invokestatic abs : (I)I
    //   3540: invokevirtual charAt : (I)C
    //   3543: getstatic burp/Zmhi.ZQ : Ljava/lang/String;
    //   3546: getstatic burp/Zgpp.Zt : Ljava/lang/Object;
    //   3549: checkcast java/math/BigInteger
    //   3552: invokevirtual intValue : ()I
    //   3555: bipush #32
    //   3557: irem
    //   3558: invokestatic abs : (I)I
    //   3561: invokevirtual charAt : (I)C
    //   3564: if_icmpgt -> 3909
    //   3567: sipush #13102
    //   3570: sipush #9827
    //   3573: invokestatic a : (II)Ljava/lang/String;
    //   3576: iconst_1
    //   3577: ldc burp/Zxpb
    //   3579: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3582: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3585: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3588: astore #4
    //   3590: aload #4
    //   3592: arraylength
    //   3593: istore #5
    //   3595: iconst_0
    //   3596: istore #6
    //   3598: iload #6
    //   3600: iload #5
    //   3602: if_icmpge -> 3740
    //   3605: aload #4
    //   3607: iload #6
    //   3609: aaload
    //   3610: astore #7
    //   3612: aload #7
    //   3614: invokevirtual getModifiers : ()I
    //   3617: invokestatic isStatic : (I)Z
    //   3620: ifne -> 3630
    //   3623: goto -> 3733
    //   3626: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3629: athrow
    //   3630: aload #7
    //   3632: invokevirtual getType : ()Ljava/lang/Class;
    //   3635: astore #8
    //   3637: aload #8
    //   3639: ifnull -> 3720
    //   3642: aload #8
    //   3644: invokevirtual isPrimitive : ()Z
    //   3647: ifne -> 3720
    //   3650: goto -> 3657
    //   3653: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3656: athrow
    //   3657: aload #8
    //   3659: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3662: ifnull -> 3720
    //   3665: goto -> 3672
    //   3668: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3671: athrow
    //   3672: aload #8
    //   3674: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3677: invokevirtual getName : ()Ljava/lang/String;
    //   3680: ifnull -> 3720
    //   3683: goto -> 3690
    //   3686: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3689: athrow
    //   3690: aload #8
    //   3692: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3695: invokevirtual getName : ()Ljava/lang/String;
    //   3698: sipush #13104
    //   3701: sipush #10473
    //   3704: invokestatic a : (II)Ljava/lang/String;
    //   3707: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3710: ifne -> 3720
    //   3713: goto -> 3720
    //   3716: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3719: athrow
    //   3720: aload #7
    //   3722: iconst_1
    //   3723: invokevirtual setAccessible : (Z)V
    //   3726: aload #7
    //   3728: aconst_null
    //   3729: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3732: pop
    //   3733: iinc #6, 1
    //   3736: iload_2
    //   3737: ifeq -> 3598
    //   3740: sipush #13090
    //   3743: sipush #2099
    //   3746: invokestatic a : (II)Ljava/lang/String;
    //   3749: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3752: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3755: astore #4
    //   3757: aload #4
    //   3759: arraylength
    //   3760: istore #5
    //   3762: iconst_0
    //   3763: istore #6
    //   3765: iload #6
    //   3767: iload #5
    //   3769: if_icmpge -> 3905
    //   3772: aload #4
    //   3774: iload #6
    //   3776: aaload
    //   3777: astore #7
    //   3779: aload #7
    //   3781: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3784: pop
    //   3785: aload #7
    //   3787: invokevirtual getModifiers : ()I
    //   3790: invokestatic isStatic : (I)Z
    //   3793: ifeq -> 3891
    //   3796: aload #7
    //   3798: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3801: arraylength
    //   3802: iconst_2
    //   3803: if_icmpne -> 3891
    //   3806: goto -> 3813
    //   3809: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3812: athrow
    //   3813: aload #7
    //   3815: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3818: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3821: if_acmpne -> 3891
    //   3824: goto -> 3831
    //   3827: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3830: athrow
    //   3831: aload #7
    //   3833: iconst_1
    //   3834: invokevirtual setAccessible : (Z)V
    //   3837: aload #7
    //   3839: aconst_null
    //   3840: iconst_2
    //   3841: anewarray java/lang/Object
    //   3844: dup
    //   3845: iconst_0
    //   3846: aload_0
    //   3847: aastore
    //   3848: dup
    //   3849: iconst_1
    //   3850: aload_1
    //   3851: ifnonnull -> 3869
    //   3854: goto -> 3861
    //   3857: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3860: athrow
    //   3861: aload_1
    //   3862: goto -> 3876
    //   3865: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3868: athrow
    //   3869: aload_1
    //   3870: checkcast [B
    //   3873: invokevirtual clone : ()Ljava/lang/Object;
    //   3876: aastore
    //   3877: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3880: checkcast java/lang/Boolean
    //   3883: invokevirtual booleanValue : ()Z
    //   3886: istore_3
    //   3887: iload_2
    //   3888: ifeq -> 3905
    //   3891: iinc #6, 1
    //   3894: iload_2
    //   3895: ifeq -> 3765
    //   3898: goto -> 3905
    //   3901: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3904: athrow
    //   3905: iload_2
    //   3906: ifeq -> 4247
    //   3909: sipush #13097
    //   3912: sipush #-13666
    //   3915: invokestatic a : (II)Ljava/lang/String;
    //   3918: iconst_1
    //   3919: ldc burp/Zter
    //   3921: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3924: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3927: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3930: astore #4
    //   3932: aload #4
    //   3934: arraylength
    //   3935: istore #5
    //   3937: iconst_0
    //   3938: istore #6
    //   3940: iload #6
    //   3942: iload #5
    //   3944: if_icmpge -> 4082
    //   3947: aload #4
    //   3949: iload #6
    //   3951: aaload
    //   3952: astore #7
    //   3954: aload #7
    //   3956: invokevirtual getModifiers : ()I
    //   3959: invokestatic isStatic : (I)Z
    //   3962: ifne -> 3972
    //   3965: goto -> 4075
    //   3968: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3971: athrow
    //   3972: aload #7
    //   3974: invokevirtual getType : ()Ljava/lang/Class;
    //   3977: astore #8
    //   3979: aload #8
    //   3981: ifnull -> 4062
    //   3984: aload #8
    //   3986: invokevirtual isPrimitive : ()Z
    //   3989: ifne -> 4062
    //   3992: goto -> 3999
    //   3995: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3998: athrow
    //   3999: aload #8
    //   4001: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4004: ifnull -> 4062
    //   4007: goto -> 4014
    //   4010: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4013: athrow
    //   4014: aload #8
    //   4016: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4019: invokevirtual getName : ()Ljava/lang/String;
    //   4022: ifnull -> 4062
    //   4025: goto -> 4032
    //   4028: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4031: athrow
    //   4032: aload #8
    //   4034: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4037: invokevirtual getName : ()Ljava/lang/String;
    //   4040: sipush #13104
    //   4043: sipush #10473
    //   4046: invokestatic a : (II)Ljava/lang/String;
    //   4049: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4052: ifne -> 4062
    //   4055: goto -> 4062
    //   4058: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4061: athrow
    //   4062: aload #7
    //   4064: iconst_1
    //   4065: invokevirtual setAccessible : (Z)V
    //   4068: aload #7
    //   4070: aconst_null
    //   4071: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4074: pop
    //   4075: iinc #6, 1
    //   4078: iload_2
    //   4079: ifeq -> 3940
    //   4082: sipush #13112
    //   4085: sipush #15880
    //   4088: invokestatic a : (II)Ljava/lang/String;
    //   4091: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4094: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4097: astore #4
    //   4099: aload #4
    //   4101: arraylength
    //   4102: istore #5
    //   4104: iconst_0
    //   4105: istore #6
    //   4107: iload #6
    //   4109: iload #5
    //   4111: if_icmpge -> 4247
    //   4114: aload #4
    //   4116: iload #6
    //   4118: aaload
    //   4119: astore #7
    //   4121: aload #7
    //   4123: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4126: pop
    //   4127: aload #7
    //   4129: invokevirtual getModifiers : ()I
    //   4132: invokestatic isStatic : (I)Z
    //   4135: ifeq -> 4233
    //   4138: aload #7
    //   4140: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4143: arraylength
    //   4144: iconst_2
    //   4145: if_icmpne -> 4233
    //   4148: goto -> 4155
    //   4151: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4154: athrow
    //   4155: aload #7
    //   4157: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4160: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4163: if_acmpne -> 4233
    //   4166: goto -> 4173
    //   4169: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4172: athrow
    //   4173: aload #7
    //   4175: iconst_1
    //   4176: invokevirtual setAccessible : (Z)V
    //   4179: aload #7
    //   4181: aconst_null
    //   4182: iconst_2
    //   4183: anewarray java/lang/Object
    //   4186: dup
    //   4187: iconst_0
    //   4188: aload_0
    //   4189: aastore
    //   4190: dup
    //   4191: iconst_1
    //   4192: aload_1
    //   4193: ifnonnull -> 4211
    //   4196: goto -> 4203
    //   4199: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4202: athrow
    //   4203: aload_1
    //   4204: goto -> 4218
    //   4207: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4210: athrow
    //   4211: aload_1
    //   4212: checkcast [B
    //   4215: invokevirtual clone : ()Ljava/lang/Object;
    //   4218: aastore
    //   4219: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4222: checkcast java/lang/Boolean
    //   4225: invokevirtual booleanValue : ()Z
    //   4228: istore_3
    //   4229: iload_2
    //   4230: ifeq -> 4247
    //   4233: iinc #6, 1
    //   4236: iload_2
    //   4237: ifeq -> 4107
    //   4240: goto -> 4247
    //   4243: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4246: athrow
    //   4247: iload_3
    //   4248: ireturn
    //   4249: astore_3
    //   4250: new java/lang/Exception
    //   4253: dup
    //   4254: aload_3
    //   4255: invokevirtual getMessage : ()Ljava/lang/String;
    //   4258: invokespecial <init> : (Ljava/lang/String;)V
    //   4261: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1328	4249	java/lang/Throwable
    //   64	78	78	java/lang/Throwable
    //   89	102	105	java/lang/Throwable
    //   94	117	120	java/lang/Throwable
    //   109	135	138	java/lang/Throwable
    //   124	165	168	java/lang/Throwable
    //   228	255	258	java/lang/Throwable
    //   245	276	279	java/lang/Throwable
    //   262	306	309	java/lang/Throwable
    //   283	317	317	java/lang/Throwable
    //   328	344	347	java/lang/Throwable
    //   689	703	703	java/lang/Throwable
    //   714	727	730	java/lang/Throwable
    //   719	742	745	java/lang/Throwable
    //   734	760	763	java/lang/Throwable
    //   749	790	793	java/lang/Throwable
    //   856	883	886	java/lang/Throwable
    //   873	901	904	java/lang/Throwable
    //   890	931	934	java/lang/Throwable
    //   908	942	942	java/lang/Throwable
    //   964	975	978	java/lang/Throwable
    //   1030	1044	1044	java/lang/Throwable
    //   1055	1068	1071	java/lang/Throwable
    //   1060	1083	1086	java/lang/Throwable
    //   1075	1101	1104	java/lang/Throwable
    //   1090	1131	1134	java/lang/Throwable
    //   1197	1224	1227	java/lang/Throwable
    //   1214	1242	1245	java/lang/Throwable
    //   1231	1272	1275	java/lang/Throwable
    //   1249	1283	1283	java/lang/Throwable
    //   1305	1316	1319	java/lang/Throwable
    //   1329	2059	4249	java/lang/Throwable
    //   1419	1433	1433	java/lang/Throwable
    //   1444	1457	1460	java/lang/Throwable
    //   1449	1472	1475	java/lang/Throwable
    //   1464	1490	1493	java/lang/Throwable
    //   1479	1520	1523	java/lang/Throwable
    //   1586	1613	1616	java/lang/Throwable
    //   1603	1631	1634	java/lang/Throwable
    //   1620	1661	1664	java/lang/Throwable
    //   1638	1672	1672	java/lang/Throwable
    //   1694	1705	1708	java/lang/Throwable
    //   1761	1775	1775	java/lang/Throwable
    //   1786	1799	1802	java/lang/Throwable
    //   1791	1814	1817	java/lang/Throwable
    //   1806	1832	1835	java/lang/Throwable
    //   1821	1862	1865	java/lang/Throwable
    //   1928	1955	1958	java/lang/Throwable
    //   1945	1973	1976	java/lang/Throwable
    //   1962	2003	2006	java/lang/Throwable
    //   1980	2014	2014	java/lang/Throwable
    //   2036	2047	2050	java/lang/Throwable
    //   2060	2790	4249	java/lang/Throwable
    //   2150	2164	2164	java/lang/Throwable
    //   2175	2188	2191	java/lang/Throwable
    //   2180	2203	2206	java/lang/Throwable
    //   2195	2221	2224	java/lang/Throwable
    //   2210	2251	2254	java/lang/Throwable
    //   2317	2344	2347	java/lang/Throwable
    //   2334	2362	2365	java/lang/Throwable
    //   2351	2392	2395	java/lang/Throwable
    //   2369	2403	2403	java/lang/Throwable
    //   2425	2436	2439	java/lang/Throwable
    //   2492	2506	2506	java/lang/Throwable
    //   2517	2530	2533	java/lang/Throwable
    //   2522	2545	2548	java/lang/Throwable
    //   2537	2563	2566	java/lang/Throwable
    //   2552	2593	2596	java/lang/Throwable
    //   2659	2686	2689	java/lang/Throwable
    //   2676	2704	2707	java/lang/Throwable
    //   2693	2734	2737	java/lang/Throwable
    //   2711	2745	2745	java/lang/Throwable
    //   2767	2778	2781	java/lang/Throwable
    //   2791	3521	4249	java/lang/Throwable
    //   2881	2895	2895	java/lang/Throwable
    //   2906	2919	2922	java/lang/Throwable
    //   2911	2934	2937	java/lang/Throwable
    //   2926	2952	2955	java/lang/Throwable
    //   2941	2982	2985	java/lang/Throwable
    //   3048	3075	3078	java/lang/Throwable
    //   3065	3093	3096	java/lang/Throwable
    //   3082	3123	3126	java/lang/Throwable
    //   3100	3134	3134	java/lang/Throwable
    //   3156	3167	3170	java/lang/Throwable
    //   3223	3237	3237	java/lang/Throwable
    //   3248	3261	3264	java/lang/Throwable
    //   3253	3276	3279	java/lang/Throwable
    //   3268	3294	3297	java/lang/Throwable
    //   3283	3324	3327	java/lang/Throwable
    //   3390	3417	3420	java/lang/Throwable
    //   3407	3435	3438	java/lang/Throwable
    //   3424	3465	3468	java/lang/Throwable
    //   3442	3476	3476	java/lang/Throwable
    //   3498	3509	3512	java/lang/Throwable
    //   3522	4248	4249	java/lang/Throwable
    //   3612	3626	3626	java/lang/Throwable
    //   3637	3650	3653	java/lang/Throwable
    //   3642	3665	3668	java/lang/Throwable
    //   3657	3683	3686	java/lang/Throwable
    //   3672	3713	3716	java/lang/Throwable
    //   3779	3806	3809	java/lang/Throwable
    //   3796	3824	3827	java/lang/Throwable
    //   3813	3854	3857	java/lang/Throwable
    //   3831	3865	3865	java/lang/Throwable
    //   3887	3898	3901	java/lang/Throwable
    //   3954	3968	3968	java/lang/Throwable
    //   3979	3992	3995	java/lang/Throwable
    //   3984	4007	4010	java/lang/Throwable
    //   3999	4025	4028	java/lang/Throwable
    //   4014	4055	4058	java/lang/Throwable
    //   4121	4148	4151	java/lang/Throwable
    //   4138	4166	4169	java/lang/Throwable
    //   4155	4196	4199	java/lang/Throwable
    //   4173	4207	4207	java/lang/Throwable
    //   4229	4240	4243	java/lang/Throwable
  }
  
  static void ZL(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #30
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '+ørKa"n\\të+j1 \\\t6~Ç({ã: ª*rn5>Oníß¼[¬58\\f!ÓØ°xÂ\\nº(w\\t¹c{¥¿¤ÖMçc&YÂ]áÞìlWÛ<ÝÌhCú_Ö1Ð×ÅÚ¬\\nébîíàD$°Î,:÷¯íc}Å¾ä5àN\\t"ó®\\f\\tï!E3ü¶&´ÛkÃz 8lÕaÐÁëy&¤(Iêé|Ú½~µVtS8.¬ù\\r¶\\t hY°2û-\\t©DaX;îÊ\\t©§å$­nÇ\\tÊ~áØhËÎà\\t1íªà\\t;ß¯rå¼ó\\t"ü7Ë6`|\\t)*255L\\tûÛÇl¬]Fú\\tb'ôóÊ®Ig%\\t²Qî=w(/\\tüÎ'Î°\\tÚ\\ty;83×vÌ\\t'óE®¸?\\tyÃo¦=ÒHÁ\\tâªäBÈ\\bè}M>jÒV/Ø#UbÙKÒ§ ÊëcZO×!!%V XÁð\\t]:Fó< &[¦Ý/àô¿½§&2£ÍácÙõ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #97
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
    //   68: ldc '\\tÌóû]ÙÇ\\t4ÎÄØPDÙ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #82
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
    //   129: putstatic burp/Zlh8.a : [Ljava/lang/String;
    //   132: bipush #30
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zlh8.b : [Ljava/lang/String;
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
    //   212: bipush #20
    //   214: goto -> 244
    //   217: bipush #116
    //   219: goto -> 244
    //   222: bipush #43
    //   224: goto -> 244
    //   227: bipush #127
    //   229: goto -> 244
    //   232: bipush #110
    //   234: goto -> 244
    //   237: bipush #86
    //   239: goto -> 244
    //   242: bipush #23
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
    //   300: sipush #13105
    //   303: sipush #11795
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zlh8.ZY : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #13091
    //   319: sipush #-14345
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zlh8.Zm : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3338) & 0xFFFF;
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
      char c = '³';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlh8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */