package burp;

import java.math.BigInteger;

class Zzip extends ClassLoader {
  static Object ZW;
  
  static String Za;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZQ(Object paramObject) {
    Zl88.Zd = a(-14310, -27894);
    Zl88.ZK = new BigInteger(a(-14309, -18849));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zlv6.Zt.charAt(Math.abs(((BigInteger)Zl2g.ZG).intValue() % 32)) > Ze3j.ZI.charAt(Math.abs(((BigInteger)Zkfz.Zr).intValue() % 32))) {
          try {
            Zbp.ZI(Class.forName(a(-14311, 32674)));
            if (bool)
              Zz75.ZI(Class.forName(a(-14305, -21230))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zz75.ZI(Class.forName(a(-14305, -21230)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zz(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zzk9.ZK : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: aload_3
    //   15: arraylength
    //   16: iconst_2
    //   17: iadd
    //   18: newarray byte
    //   20: astore #5
    //   22: iconst_0
    //   23: istore #6
    //   25: iload #6
    //   27: aload_3
    //   28: arraylength
    //   29: if_icmpge -> 48
    //   32: aload #5
    //   34: iload #6
    //   36: aload_3
    //   37: iload #6
    //   39: baload
    //   40: bastore
    //   41: iinc #6, 1
    //   44: iload_2
    //   45: ifne -> 25
    //   48: aload #5
    //   50: arraylength
    //   51: iconst_3
    //   52: idiv
    //   53: iconst_4
    //   54: imul
    //   55: newarray byte
    //   57: astore #4
    //   59: iconst_0
    //   60: istore #6
    //   62: iconst_0
    //   63: istore #7
    //   65: iload #6
    //   67: aload_3
    //   68: arraylength
    //   69: if_icmpge -> 180
    //   72: aload #4
    //   74: iload #7
    //   76: aload #5
    //   78: iload #6
    //   80: baload
    //   81: iconst_2
    //   82: iushr
    //   83: bipush #63
    //   85: iand
    //   86: i2b
    //   87: bastore
    //   88: aload #4
    //   90: iload #7
    //   92: iconst_1
    //   93: iadd
    //   94: aload #5
    //   96: iload #6
    //   98: iconst_1
    //   99: iadd
    //   100: baload
    //   101: iconst_4
    //   102: iushr
    //   103: bipush #15
    //   105: iand
    //   106: aload #5
    //   108: iload #6
    //   110: baload
    //   111: iconst_4
    //   112: ishl
    //   113: bipush #63
    //   115: iand
    //   116: ior
    //   117: i2b
    //   118: bastore
    //   119: aload #4
    //   121: iload #7
    //   123: iconst_2
    //   124: iadd
    //   125: aload #5
    //   127: iload #6
    //   129: iconst_2
    //   130: iadd
    //   131: baload
    //   132: bipush #6
    //   134: iushr
    //   135: iconst_3
    //   136: iand
    //   137: aload #5
    //   139: iload #6
    //   141: iconst_1
    //   142: iadd
    //   143: baload
    //   144: iconst_2
    //   145: ishl
    //   146: bipush #63
    //   148: iand
    //   149: ior
    //   150: i2b
    //   151: bastore
    //   152: aload #4
    //   154: iload #7
    //   156: iconst_3
    //   157: iadd
    //   158: aload #5
    //   160: iload #6
    //   162: iconst_2
    //   163: iadd
    //   164: baload
    //   165: bipush #63
    //   167: iand
    //   168: i2b
    //   169: bastore
    //   170: iinc #6, 3
    //   173: iinc #7, 4
    //   176: iload_2
    //   177: ifne -> 65
    //   180: iconst_0
    //   181: istore #6
    //   183: iload #6
    //   185: aload #4
    //   187: arraylength
    //   188: if_icmpge -> 372
    //   191: aload #4
    //   193: iload #6
    //   195: baload
    //   196: bipush #26
    //   198: if_icmpge -> 226
    //   201: aload #4
    //   203: iload #6
    //   205: aload #4
    //   207: iload #6
    //   209: baload
    //   210: bipush #65
    //   212: iadd
    //   213: i2b
    //   214: bastore
    //   215: iload_2
    //   216: ifne -> 365
    //   219: goto -> 226
    //   222: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   225: athrow
    //   226: aload #4
    //   228: iload #6
    //   230: baload
    //   231: bipush #52
    //   233: if_icmpge -> 271
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   242: athrow
    //   243: aload #4
    //   245: iload #6
    //   247: aload #4
    //   249: iload #6
    //   251: baload
    //   252: bipush #97
    //   254: iadd
    //   255: bipush #26
    //   257: isub
    //   258: i2b
    //   259: bastore
    //   260: iload_2
    //   261: ifne -> 365
    //   264: goto -> 271
    //   267: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   270: athrow
    //   271: aload #4
    //   273: iload #6
    //   275: baload
    //   276: bipush #62
    //   278: if_icmpge -> 316
    //   281: goto -> 288
    //   284: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   287: athrow
    //   288: aload #4
    //   290: iload #6
    //   292: aload #4
    //   294: iload #6
    //   296: baload
    //   297: bipush #48
    //   299: iadd
    //   300: bipush #52
    //   302: isub
    //   303: i2b
    //   304: bastore
    //   305: iload_2
    //   306: ifne -> 365
    //   309: goto -> 316
    //   312: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   315: athrow
    //   316: aload #4
    //   318: iload #6
    //   320: baload
    //   321: bipush #63
    //   323: if_icmpge -> 351
    //   326: goto -> 333
    //   329: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   332: athrow
    //   333: aload #4
    //   335: iload #6
    //   337: bipush #43
    //   339: bastore
    //   340: iload_2
    //   341: ifne -> 365
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   350: athrow
    //   351: aload #4
    //   353: iload #6
    //   355: bipush #47
    //   357: bastore
    //   358: goto -> 365
    //   361: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   364: athrow
    //   365: iinc #6, 1
    //   368: iload_2
    //   369: ifne -> 183
    //   372: aload #4
    //   374: arraylength
    //   375: iconst_1
    //   376: isub
    //   377: istore #6
    //   379: iload #6
    //   381: aload_3
    //   382: arraylength
    //   383: iconst_4
    //   384: imul
    //   385: iconst_3
    //   386: idiv
    //   387: if_icmple -> 404
    //   390: aload #4
    //   392: iload #6
    //   394: bipush #61
    //   396: bastore
    //   397: iinc #6, -1
    //   400: iload_2
    //   401: ifne -> 379
    //   404: new java/math/BigInteger
    //   407: dup
    //   408: aload #4
    //   410: invokespecial <init> : ([B)V
    //   413: invokevirtual abs : ()Ljava/math/BigInteger;
    //   416: putstatic burp/Zxzj.ZO : Ljava/lang/Object;
    //   419: ldc2_w 8682522807148012
    //   422: invokestatic currentTimeMillis : ()J
    //   425: lxor
    //   426: lstore #4
    //   428: lload #4
    //   430: ldc2_w 25214903917
    //   433: lmul
    //   434: ldc2_w 11
    //   437: ladd
    //   438: ldc2_w 281474976710655
    //   441: land
    //   442: lstore #4
    //   444: lload #4
    //   446: bipush #32
    //   448: lshl
    //   449: lstore #6
    //   451: lload #4
    //   453: ldc2_w 25214903917
    //   456: lmul
    //   457: ldc2_w 11
    //   460: ladd
    //   461: ldc2_w 281474976710655
    //   464: land
    //   465: lstore #4
    //   467: lload #6
    //   469: lload #4
    //   471: ladd
    //   472: lstore #6
    //   474: bipush #16
    //   476: newarray byte
    //   478: dup
    //   479: iconst_0
    //   480: bipush #48
    //   482: bastore
    //   483: dup
    //   484: iconst_1
    //   485: bipush #49
    //   487: bastore
    //   488: dup
    //   489: iconst_2
    //   490: bipush #50
    //   492: bastore
    //   493: dup
    //   494: iconst_3
    //   495: bipush #51
    //   497: bastore
    //   498: dup
    //   499: iconst_4
    //   500: bipush #52
    //   502: bastore
    //   503: dup
    //   504: iconst_5
    //   505: bipush #53
    //   507: bastore
    //   508: dup
    //   509: bipush #6
    //   511: bipush #54
    //   513: bastore
    //   514: dup
    //   515: bipush #7
    //   517: bipush #55
    //   519: bastore
    //   520: dup
    //   521: bipush #8
    //   523: bipush #56
    //   525: bastore
    //   526: dup
    //   527: bipush #9
    //   529: bipush #57
    //   531: bastore
    //   532: dup
    //   533: bipush #10
    //   535: bipush #97
    //   537: bastore
    //   538: dup
    //   539: bipush #11
    //   541: bipush #98
    //   543: bastore
    //   544: dup
    //   545: bipush #12
    //   547: bipush #99
    //   549: bastore
    //   550: dup
    //   551: bipush #13
    //   553: bipush #100
    //   555: bastore
    //   556: dup
    //   557: bipush #14
    //   559: bipush #101
    //   561: bastore
    //   562: dup
    //   563: bipush #15
    //   565: bipush #102
    //   567: bastore
    //   568: astore #8
    //   570: bipush #64
    //   572: newarray byte
    //   574: astore #9
    //   576: bipush #64
    //   578: istore #10
    //   580: bipush #16
    //   582: istore #11
    //   584: iload #11
    //   586: iconst_1
    //   587: isub
    //   588: i2l
    //   589: lstore #12
    //   591: aload #9
    //   593: iinc #10, -1
    //   596: iload #10
    //   598: aload #8
    //   600: lload #6
    //   602: lload #12
    //   604: land
    //   605: l2i
    //   606: baload
    //   607: bastore
    //   608: lload #6
    //   610: iconst_4
    //   611: lushr
    //   612: lstore #6
    //   614: lload #6
    //   616: lconst_0
    //   617: lcmp
    //   618: ifne -> 591
    //   621: bipush #64
    //   623: iload #10
    //   625: isub
    //   626: newarray byte
    //   628: astore_3
    //   629: iconst_0
    //   630: istore #14
    //   632: iload #14
    //   634: aload_3
    //   635: arraylength
    //   636: if_icmpge -> 658
    //   639: aload_3
    //   640: iload #14
    //   642: aload #9
    //   644: iload #10
    //   646: iload #14
    //   648: iadd
    //   649: baload
    //   650: bastore
    //   651: iinc #14, 1
    //   654: iload_2
    //   655: ifne -> 632
    //   658: aload_3
    //   659: arraylength
    //   660: bipush #10
    //   662: if_icmplt -> 428
    //   665: sipush #-14318
    //   668: sipush #-3779
    //   671: invokestatic a : (II)Ljava/lang/String;
    //   674: iconst_1
    //   675: ldc burp/Zrct
    //   677: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   680: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   683: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   686: astore_3
    //   687: aload_3
    //   688: arraylength
    //   689: istore #4
    //   691: iconst_0
    //   692: istore #5
    //   694: iload #5
    //   696: iload #4
    //   698: if_icmpge -> 835
    //   701: aload_3
    //   702: iload #5
    //   704: aaload
    //   705: astore #6
    //   707: aload #6
    //   709: invokevirtual getModifiers : ()I
    //   712: invokestatic isStatic : (I)Z
    //   715: ifne -> 725
    //   718: goto -> 828
    //   721: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   724: athrow
    //   725: aload #6
    //   727: invokevirtual getType : ()Ljava/lang/Class;
    //   730: astore #7
    //   732: aload #7
    //   734: ifnull -> 815
    //   737: aload #7
    //   739: invokevirtual isPrimitive : ()Z
    //   742: ifne -> 815
    //   745: goto -> 752
    //   748: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   751: athrow
    //   752: aload #7
    //   754: invokevirtual getPackage : ()Ljava/lang/Package;
    //   757: ifnull -> 815
    //   760: goto -> 767
    //   763: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   766: athrow
    //   767: aload #7
    //   769: invokevirtual getPackage : ()Ljava/lang/Package;
    //   772: invokevirtual getName : ()Ljava/lang/String;
    //   775: ifnull -> 815
    //   778: goto -> 785
    //   781: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   784: athrow
    //   785: aload #7
    //   787: invokevirtual getPackage : ()Ljava/lang/Package;
    //   790: invokevirtual getName : ()Ljava/lang/String;
    //   793: sipush #-14307
    //   796: sipush #-9290
    //   799: invokestatic a : (II)Ljava/lang/String;
    //   802: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   805: ifne -> 815
    //   808: goto -> 815
    //   811: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   814: athrow
    //   815: aload #6
    //   817: iconst_1
    //   818: invokevirtual setAccessible : (Z)V
    //   821: aload #6
    //   823: aconst_null
    //   824: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   827: pop
    //   828: iinc #5, 1
    //   831: iload_2
    //   832: ifne -> 694
    //   835: sipush #-14306
    //   838: sipush #-8782
    //   841: invokestatic a : (II)Ljava/lang/String;
    //   844: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   847: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   850: astore_3
    //   851: aload_3
    //   852: arraylength
    //   853: istore #4
    //   855: iconst_0
    //   856: istore #5
    //   858: iload #5
    //   860: iload #4
    //   862: if_icmpge -> 994
    //   865: aload_3
    //   866: iload #5
    //   868: aaload
    //   869: astore #6
    //   871: aload #6
    //   873: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   876: pop
    //   877: aload #6
    //   879: invokevirtual getModifiers : ()I
    //   882: invokestatic isStatic : (I)Z
    //   885: ifeq -> 980
    //   888: aload #6
    //   890: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   893: arraylength
    //   894: iconst_2
    //   895: if_icmpne -> 980
    //   898: goto -> 905
    //   901: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   904: athrow
    //   905: aload #6
    //   907: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   910: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   913: invokevirtual equals : (Ljava/lang/Object;)Z
    //   916: ifeq -> 980
    //   919: goto -> 926
    //   922: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   925: athrow
    //   926: aload #6
    //   928: iconst_1
    //   929: invokevirtual setAccessible : (Z)V
    //   932: aload #6
    //   934: aconst_null
    //   935: iconst_2
    //   936: anewarray java/lang/Object
    //   939: dup
    //   940: iconst_0
    //   941: aload_0
    //   942: aastore
    //   943: dup
    //   944: iconst_1
    //   945: aload_1
    //   946: ifnonnull -> 964
    //   949: goto -> 956
    //   952: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   955: athrow
    //   956: aload_1
    //   957: goto -> 971
    //   960: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   963: athrow
    //   964: aload_1
    //   965: checkcast [B
    //   968: invokevirtual clone : ()Ljava/lang/Object;
    //   971: aastore
    //   972: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   975: pop
    //   976: iload_2
    //   977: ifne -> 994
    //   980: iinc #5, 1
    //   983: iload_2
    //   984: ifne -> 858
    //   987: goto -> 994
    //   990: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   993: athrow
    //   994: new java/io/ByteArrayOutputStream
    //   997: dup
    //   998: invokespecial <init> : ()V
    //   1001: astore_3
    //   1002: sipush #-14320
    //   1005: aload_3
    //   1006: sipush #202
    //   1009: invokevirtual write : (I)V
    //   1012: sipush #-3978
    //   1015: aload_3
    //   1016: sipush #254
    //   1019: invokevirtual write : (I)V
    //   1022: aload_3
    //   1023: sipush #186
    //   1026: invokevirtual write : (I)V
    //   1029: aload_3
    //   1030: sipush #190
    //   1033: invokevirtual write : (I)V
    //   1036: aload_3
    //   1037: iconst_0
    //   1038: invokevirtual write : (I)V
    //   1041: aload_3
    //   1042: iconst_1
    //   1043: invokevirtual write : (I)V
    //   1046: aload_3
    //   1047: iconst_0
    //   1048: invokevirtual write : (I)V
    //   1051: aload_3
    //   1052: bipush #50
    //   1054: invokevirtual write : (I)V
    //   1057: aload_3
    //   1058: getstatic burp/Zrh1.ZF : Ljava/lang/Object;
    //   1061: checkcast java/math/BigInteger
    //   1064: invokevirtual toByteArray : ()[B
    //   1067: invokevirtual write : ([B)V
    //   1070: aload_3
    //   1071: getstatic burp/Zmpc.Zc : Ljava/lang/Object;
    //   1074: checkcast java/math/BigInteger
    //   1077: invokevirtual toByteArray : ()[B
    //   1080: invokevirtual write : ([B)V
    //   1083: aload_3
    //   1084: getstatic burp/Zgdt.Zb : Ljava/lang/Object;
    //   1087: checkcast java/math/BigInteger
    //   1090: invokevirtual toByteArray : ()[B
    //   1093: invokevirtual write : ([B)V
    //   1096: aload_3
    //   1097: invokevirtual toByteArray : ()[B
    //   1100: astore #4
    //   1102: aconst_null
    //   1103: astore #5
    //   1105: invokestatic a : (II)Ljava/lang/String;
    //   1108: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1111: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1114: astore #6
    //   1116: aload #6
    //   1118: arraylength
    //   1119: istore #7
    //   1121: iconst_0
    //   1122: istore #8
    //   1124: iload #8
    //   1126: iload #7
    //   1128: if_icmpge -> 1256
    //   1131: aload #6
    //   1133: iload #8
    //   1135: aaload
    //   1136: astore #9
    //   1138: aload #9
    //   1140: invokevirtual getName : ()Ljava/lang/String;
    //   1143: sipush #-14312
    //   1146: sipush #-355
    //   1149: invokestatic a : (II)Ljava/lang/String;
    //   1152: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1155: ifeq -> 1249
    //   1158: aload #9
    //   1160: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1163: astore #10
    //   1165: aload #10
    //   1167: arraylength
    //   1168: iconst_4
    //   1169: if_icmpeq -> 1179
    //   1172: goto -> 1249
    //   1175: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1178: athrow
    //   1179: aload #10
    //   1181: iconst_0
    //   1182: aaload
    //   1183: ldc java/lang/String
    //   1185: if_acmpeq -> 1195
    //   1188: goto -> 1249
    //   1191: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1194: athrow
    //   1195: aload #10
    //   1197: iconst_1
    //   1198: aaload
    //   1199: ldc [B
    //   1201: if_acmpeq -> 1211
    //   1204: goto -> 1249
    //   1207: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1210: athrow
    //   1211: aload #10
    //   1213: iconst_2
    //   1214: aaload
    //   1215: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1218: if_acmpeq -> 1228
    //   1221: goto -> 1249
    //   1224: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1227: athrow
    //   1228: aload #10
    //   1230: iconst_3
    //   1231: aaload
    //   1232: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1235: if_acmpeq -> 1245
    //   1238: goto -> 1249
    //   1241: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1244: athrow
    //   1245: aload #9
    //   1247: astore #5
    //   1249: iinc #8, 1
    //   1252: iload_2
    //   1253: ifne -> 1124
    //   1256: aload #5
    //   1258: iconst_1
    //   1259: invokevirtual setAccessible : (Z)V
    //   1262: ldc burp/Zs75
    //   1264: iconst_0
    //   1265: anewarray java/lang/Class
    //   1268: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   1271: astore #6
    //   1273: aload #6
    //   1275: iconst_1
    //   1276: invokevirtual setAccessible : (Z)V
    //   1279: aload #5
    //   1281: aload #6
    //   1283: iconst_0
    //   1284: anewarray java/lang/Object
    //   1287: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   1290: iconst_4
    //   1291: anewarray java/lang/Object
    //   1294: dup
    //   1295: iconst_0
    //   1296: sipush #-14308
    //   1299: sipush #24715
    //   1302: invokestatic a : (II)Ljava/lang/String;
    //   1305: aastore
    //   1306: dup
    //   1307: iconst_1
    //   1308: aload #4
    //   1310: aastore
    //   1311: dup
    //   1312: iconst_2
    //   1313: iconst_0
    //   1314: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1317: aastore
    //   1318: dup
    //   1319: iconst_3
    //   1320: aload #4
    //   1322: arraylength
    //   1323: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1326: aastore
    //   1327: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1330: pop
    //   1331: goto -> 1335
    //   1334: astore_3
    //   1335: getstatic burp/Zx4l.Zy : Ljava/lang/String;
    //   1338: getstatic burp/Zrdy.Zt : Ljava/lang/Object;
    //   1341: checkcast java/math/BigInteger
    //   1344: invokevirtual intValue : ()I
    //   1347: bipush #32
    //   1349: irem
    //   1350: invokestatic abs : (I)I
    //   1353: invokevirtual charAt : (I)C
    //   1356: getstatic burp/Zzip.Za : Ljava/lang/String;
    //   1359: getstatic burp/Zx4l.Zt : Ljava/lang/Object;
    //   1362: checkcast java/math/BigInteger
    //   1365: invokevirtual intValue : ()I
    //   1368: bipush #32
    //   1370: irem
    //   1371: invokestatic abs : (I)I
    //   1374: invokevirtual charAt : (I)C
    //   1377: if_icmple -> 1484
    //   1380: getstatic burp/Zter.ZE : Ljava/lang/String;
    //   1383: getstatic burp/Zm0s.Zl : Ljava/lang/Object;
    //   1386: checkcast java/math/BigInteger
    //   1389: invokevirtual intValue : ()I
    //   1392: bipush #32
    //   1394: irem
    //   1395: invokestatic abs : (I)I
    //   1398: invokevirtual charAt : (I)C
    //   1401: getstatic burp/Zxzj.ZZ : Ljava/lang/String;
    //   1404: getstatic burp/Zxo6.Zw : Ljava/lang/Object;
    //   1407: checkcast java/math/BigInteger
    //   1410: invokevirtual intValue : ()I
    //   1413: bipush #32
    //   1415: irem
    //   1416: invokestatic abs : (I)I
    //   1419: invokevirtual charAt : (I)C
    //   1422: if_icmple -> 1484
    //   1425: goto -> 1432
    //   1428: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1431: athrow
    //   1432: getstatic burp/Ztnw.Zr : Ljava/lang/String;
    //   1435: getstatic burp/Zxzd.ZD : Ljava/lang/Object;
    //   1438: checkcast java/math/BigInteger
    //   1441: invokevirtual intValue : ()I
    //   1444: bipush #32
    //   1446: irem
    //   1447: invokestatic abs : (I)I
    //   1450: invokevirtual charAt : (I)C
    //   1453: getstatic burp/Zr0g.Zf : Ljava/lang/String;
    //   1456: getstatic burp/Zlhm.ZT : Ljava/lang/Object;
    //   1459: checkcast java/math/BigInteger
    //   1462: invokevirtual intValue : ()I
    //   1465: bipush #32
    //   1467: irem
    //   1468: invokestatic abs : (I)I
    //   1471: invokevirtual charAt : (I)C
    //   1474: if_icmpgt -> 1492
    //   1477: goto -> 1484
    //   1480: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1483: athrow
    //   1484: iconst_1
    //   1485: goto -> 1493
    //   1488: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1491: athrow
    //   1492: iconst_0
    //   1493: ireturn
    //   1494: astore_3
    //   1495: new java/lang/Exception
    //   1498: dup
    //   1499: aload_3
    //   1500: invokevirtual getMessage : ()Ljava/lang/String;
    //   1503: invokespecial <init> : (Ljava/lang/String;)V
    //   1506: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1493	1494	java/lang/Throwable
    //   191	219	222	java/lang/Throwable
    //   201	236	239	java/lang/Throwable
    //   226	264	267	java/lang/Throwable
    //   243	281	284	java/lang/Throwable
    //   271	309	312	java/lang/Throwable
    //   288	326	329	java/lang/Throwable
    //   316	344	347	java/lang/Throwable
    //   333	358	361	java/lang/Throwable
    //   707	721	721	java/lang/Throwable
    //   732	745	748	java/lang/Throwable
    //   737	760	763	java/lang/Throwable
    //   752	778	781	java/lang/Throwable
    //   767	808	811	java/lang/Throwable
    //   871	898	901	java/lang/Throwable
    //   888	919	922	java/lang/Throwable
    //   905	949	952	java/lang/Throwable
    //   926	960	960	java/lang/Throwable
    //   971	987	990	java/lang/Throwable
    //   994	1331	1334	java/lang/Throwable
    //   1165	1175	1175	java/lang/Throwable
    //   1179	1191	1191	java/lang/Throwable
    //   1195	1207	1207	java/lang/Throwable
    //   1211	1224	1224	java/lang/Throwable
    //   1228	1241	1241	java/lang/Throwable
    //   1335	1425	1428	java/lang/Throwable
    //   1380	1477	1480	java/lang/Throwable
    //   1432	1488	1488	java/lang/Throwable
  }
  
  static void ZW(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÕAiÏb*¢½ýxjcª\\tõr°këkM¸(>°fnâQ§pÖS</lÎÿhåÎ`¤&bhµÓ¸ö%FyEãDð4°×ÕÐcÅÌÂÔÞ])cb- ¯UK·c°±JÐe×\\thSV[^Uà\\b16}÷;è\\t¥Y¿ÎhÈ\\bÀ³CGü¢\\nù¢«e\\bÏë¢LÀ÷ô'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #113
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
    //   68: ldc 'ºÐ/¯¢õ¾×ç=Á=`1¥\lØr0ôh6ËB*¤f7¬ÐT³&±Ûz&Ü£ÓYEú'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #16
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
    //   129: putstatic burp/Zzip.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zzip.b : [Ljava/lang/String;
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
    //   212: bipush #56
    //   214: goto -> 244
    //   217: bipush #119
    //   219: goto -> 244
    //   222: bipush #95
    //   224: goto -> 244
    //   227: bipush #43
    //   229: goto -> 244
    //   232: bipush #50
    //   234: goto -> 244
    //   237: bipush #96
    //   239: goto -> 244
    //   242: bipush #31
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
    //   311: bipush #91
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-72
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #87
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #18
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: iconst_3
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-54
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #26
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #91
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #122
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #73
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #-39
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #91
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #-121
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #35
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #29
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #-4
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #-63
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: iconst_5
    //   408: bastore
    //   409: dup
    //   410: bipush #18
    //   412: bipush #-124
    //   414: bastore
    //   415: dup
    //   416: bipush #19
    //   418: bipush #98
    //   420: bastore
    //   421: dup
    //   422: bipush #20
    //   424: bipush #19
    //   426: bastore
    //   427: dup
    //   428: bipush #21
    //   430: bipush #100
    //   432: bastore
    //   433: dup
    //   434: bipush #22
    //   436: bipush #106
    //   438: bastore
    //   439: dup
    //   440: bipush #23
    //   442: bipush #48
    //   444: bastore
    //   445: dup
    //   446: bipush #24
    //   448: bipush #78
    //   450: bastore
    //   451: dup
    //   452: bipush #25
    //   454: bipush #-117
    //   456: bastore
    //   457: dup
    //   458: bipush #26
    //   460: bipush #101
    //   462: bastore
    //   463: dup
    //   464: bipush #27
    //   466: bipush #56
    //   468: bastore
    //   469: dup
    //   470: bipush #28
    //   472: bipush #26
    //   474: bastore
    //   475: dup
    //   476: bipush #29
    //   478: bipush #22
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #20
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: bipush #-81
    //   492: bastore
    //   493: invokespecial <init> : (I[B)V
    //   496: putstatic burp/Zzip.ZW : Ljava/lang/Object;
    //   499: sipush #-14317
    //   502: sipush #-4254
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Zzip.Za : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC81A) & 0xFFFF;
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
      byte b1 = 121;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzip.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */