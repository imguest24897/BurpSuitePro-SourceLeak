package burp;

import java.math.BigInteger;

class Zrw7 extends ClassLoader {
  static Object ZV;
  
  static String Zo;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZT(Object paramObject) {
    Zz16.ZA = a(-32365, 29842);
    Zz16.ZK = new BigInteger(a(-32370, -30685));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zsx6.ZJ.charAt(Math.abs(((BigInteger)Zxjm.Zn).intValue() % 32)) <= Zboa.Zq.charAt(Math.abs(((BigInteger)Zem6.Zm).intValue() % 32))) {
          try {
            Zv8c.Zm(Class.forName(a(-32373, 11659)));
            if (!bool)
              Zgco.ZZ(Class.forName(a(-32380, 17544))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgco.ZZ(Class.forName(a(-32380, 17544)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zd(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Ztzw.Zk : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Ztfr.Zr : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Ze3z.Zf : Ljava/lang/Object;
    //   22: sipush #-32364
    //   25: sipush #-24629
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zscf
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
    //   150: sipush #-32382
    //   153: sipush #-31248
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
    //   189: ifne -> 51
    //   192: sipush #-32378
    //   195: sipush #-26784
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
    //   334: ifne -> 351
    //   337: iinc #5, 1
    //   340: iload_2
    //   341: ifne -> 215
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   350: athrow
    //   351: iconst_0
    //   352: istore_3
    //   353: getstatic burp/Zl1n.ZZ : Ljava/lang/String;
    //   356: getstatic burp/Zboa.Zh : Ljava/lang/Object;
    //   359: checkcast java/math/BigInteger
    //   362: invokevirtual intValue : ()I
    //   365: bipush #32
    //   367: irem
    //   368: invokestatic abs : (I)I
    //   371: invokevirtual charAt : (I)C
    //   374: getstatic burp/Zmy3.ZP : Ljava/lang/String;
    //   377: getstatic burp/Zlpu.ZE : Ljava/lang/Object;
    //   380: checkcast java/math/BigInteger
    //   383: invokevirtual intValue : ()I
    //   386: bipush #32
    //   388: irem
    //   389: invokestatic abs : (I)I
    //   392: invokevirtual charAt : (I)C
    //   395: if_icmpgt -> 739
    //   398: sipush #-32381
    //   401: sipush #-9794
    //   404: invokestatic a : (II)Ljava/lang/String;
    //   407: iconst_1
    //   408: ldc burp/Zzah
    //   410: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   413: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   416: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   419: astore #4
    //   421: aload #4
    //   423: arraylength
    //   424: istore #5
    //   426: iconst_0
    //   427: istore #6
    //   429: iload #6
    //   431: iload #5
    //   433: if_icmpge -> 571
    //   436: aload #4
    //   438: iload #6
    //   440: aaload
    //   441: astore #7
    //   443: aload #7
    //   445: invokevirtual getModifiers : ()I
    //   448: invokestatic isStatic : (I)Z
    //   451: ifne -> 461
    //   454: goto -> 564
    //   457: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   460: athrow
    //   461: aload #7
    //   463: invokevirtual getType : ()Ljava/lang/Class;
    //   466: astore #8
    //   468: aload #8
    //   470: ifnull -> 551
    //   473: aload #8
    //   475: invokevirtual isPrimitive : ()Z
    //   478: ifne -> 551
    //   481: goto -> 488
    //   484: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   487: athrow
    //   488: aload #8
    //   490: invokevirtual getPackage : ()Ljava/lang/Package;
    //   493: ifnull -> 551
    //   496: goto -> 503
    //   499: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   502: athrow
    //   503: aload #8
    //   505: invokevirtual getPackage : ()Ljava/lang/Package;
    //   508: invokevirtual getName : ()Ljava/lang/String;
    //   511: ifnull -> 551
    //   514: goto -> 521
    //   517: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   520: athrow
    //   521: aload #8
    //   523: invokevirtual getPackage : ()Ljava/lang/Package;
    //   526: invokevirtual getName : ()Ljava/lang/String;
    //   529: sipush #-32371
    //   532: sipush #-16979
    //   535: invokestatic a : (II)Ljava/lang/String;
    //   538: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   541: ifne -> 551
    //   544: goto -> 551
    //   547: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   550: athrow
    //   551: aload #7
    //   553: iconst_1
    //   554: invokevirtual setAccessible : (Z)V
    //   557: aload #7
    //   559: aconst_null
    //   560: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   563: pop
    //   564: iinc #6, 1
    //   567: iload_2
    //   568: ifne -> 429
    //   571: sipush #-32376
    //   574: sipush #18431
    //   577: invokestatic a : (II)Ljava/lang/String;
    //   580: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   583: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   586: astore #4
    //   588: aload #4
    //   590: arraylength
    //   591: istore #5
    //   593: iconst_0
    //   594: istore #6
    //   596: iload #6
    //   598: iload #5
    //   600: if_icmpge -> 736
    //   603: aload #4
    //   605: iload #6
    //   607: aaload
    //   608: astore #7
    //   610: aload #7
    //   612: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   615: pop
    //   616: aload #7
    //   618: invokevirtual getModifiers : ()I
    //   621: invokestatic isStatic : (I)Z
    //   624: ifeq -> 722
    //   627: aload #7
    //   629: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   632: arraylength
    //   633: iconst_2
    //   634: if_icmpne -> 722
    //   637: goto -> 644
    //   640: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   643: athrow
    //   644: aload #7
    //   646: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   649: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   652: if_acmpne -> 722
    //   655: goto -> 662
    //   658: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   661: athrow
    //   662: aload #7
    //   664: iconst_1
    //   665: invokevirtual setAccessible : (Z)V
    //   668: aload #7
    //   670: aconst_null
    //   671: iconst_2
    //   672: anewarray java/lang/Object
    //   675: dup
    //   676: iconst_0
    //   677: aload_0
    //   678: aastore
    //   679: dup
    //   680: iconst_1
    //   681: aload_1
    //   682: ifnonnull -> 700
    //   685: goto -> 692
    //   688: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   691: athrow
    //   692: aload_1
    //   693: goto -> 707
    //   696: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   699: athrow
    //   700: aload_1
    //   701: checkcast [B
    //   704: invokevirtual clone : ()Ljava/lang/Object;
    //   707: aastore
    //   708: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   711: checkcast java/lang/Boolean
    //   714: invokevirtual booleanValue : ()Z
    //   717: istore_3
    //   718: iload_2
    //   719: ifne -> 736
    //   722: iinc #6, 1
    //   725: iload_2
    //   726: ifne -> 596
    //   729: goto -> 736
    //   732: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   735: athrow
    //   736: goto -> 1077
    //   739: sipush #-32369
    //   742: sipush #-30269
    //   745: invokestatic a : (II)Ljava/lang/String;
    //   748: iconst_1
    //   749: ldc burp/Zlp8
    //   751: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   754: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   757: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   760: astore #4
    //   762: aload #4
    //   764: arraylength
    //   765: istore #5
    //   767: iconst_0
    //   768: istore #6
    //   770: iload #6
    //   772: iload #5
    //   774: if_icmpge -> 912
    //   777: aload #4
    //   779: iload #6
    //   781: aaload
    //   782: astore #7
    //   784: aload #7
    //   786: invokevirtual getModifiers : ()I
    //   789: invokestatic isStatic : (I)Z
    //   792: ifne -> 802
    //   795: goto -> 905
    //   798: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   801: athrow
    //   802: aload #7
    //   804: invokevirtual getType : ()Ljava/lang/Class;
    //   807: astore #8
    //   809: aload #8
    //   811: ifnull -> 892
    //   814: aload #8
    //   816: invokevirtual isPrimitive : ()Z
    //   819: ifne -> 892
    //   822: goto -> 829
    //   825: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   828: athrow
    //   829: aload #8
    //   831: invokevirtual getPackage : ()Ljava/lang/Package;
    //   834: ifnull -> 892
    //   837: goto -> 844
    //   840: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   843: athrow
    //   844: aload #8
    //   846: invokevirtual getPackage : ()Ljava/lang/Package;
    //   849: invokevirtual getName : ()Ljava/lang/String;
    //   852: ifnull -> 892
    //   855: goto -> 862
    //   858: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   861: athrow
    //   862: aload #8
    //   864: invokevirtual getPackage : ()Ljava/lang/Package;
    //   867: invokevirtual getName : ()Ljava/lang/String;
    //   870: sipush #-32371
    //   873: sipush #-16979
    //   876: invokestatic a : (II)Ljava/lang/String;
    //   879: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   882: ifne -> 892
    //   885: goto -> 892
    //   888: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   891: athrow
    //   892: aload #7
    //   894: iconst_1
    //   895: invokevirtual setAccessible : (Z)V
    //   898: aload #7
    //   900: aconst_null
    //   901: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   904: pop
    //   905: iinc #6, 1
    //   908: iload_2
    //   909: ifne -> 770
    //   912: sipush #-32383
    //   915: sipush #27830
    //   918: invokestatic a : (II)Ljava/lang/String;
    //   921: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   924: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   927: astore #4
    //   929: aload #4
    //   931: arraylength
    //   932: istore #5
    //   934: iconst_0
    //   935: istore #6
    //   937: iload #6
    //   939: iload #5
    //   941: if_icmpge -> 1077
    //   944: aload #4
    //   946: iload #6
    //   948: aaload
    //   949: astore #7
    //   951: aload #7
    //   953: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   956: pop
    //   957: aload #7
    //   959: invokevirtual getModifiers : ()I
    //   962: invokestatic isStatic : (I)Z
    //   965: ifeq -> 1063
    //   968: aload #7
    //   970: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   973: arraylength
    //   974: iconst_2
    //   975: if_icmpne -> 1063
    //   978: goto -> 985
    //   981: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   984: athrow
    //   985: aload #7
    //   987: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   990: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   993: if_acmpne -> 1063
    //   996: goto -> 1003
    //   999: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1002: athrow
    //   1003: aload #7
    //   1005: iconst_1
    //   1006: invokevirtual setAccessible : (Z)V
    //   1009: aload #7
    //   1011: aconst_null
    //   1012: iconst_2
    //   1013: anewarray java/lang/Object
    //   1016: dup
    //   1017: iconst_0
    //   1018: aload_0
    //   1019: aastore
    //   1020: dup
    //   1021: iconst_1
    //   1022: aload_1
    //   1023: ifnonnull -> 1041
    //   1026: goto -> 1033
    //   1029: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1032: athrow
    //   1033: aload_1
    //   1034: goto -> 1048
    //   1037: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1040: athrow
    //   1041: aload_1
    //   1042: checkcast [B
    //   1045: invokevirtual clone : ()Ljava/lang/Object;
    //   1048: aastore
    //   1049: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1052: checkcast java/lang/Boolean
    //   1055: invokevirtual booleanValue : ()Z
    //   1058: istore_3
    //   1059: iload_2
    //   1060: ifne -> 1077
    //   1063: iinc #6, 1
    //   1066: iload_2
    //   1067: ifne -> 937
    //   1070: goto -> 1077
    //   1073: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1076: athrow
    //   1077: iload_3
    //   1078: ifeq -> 1083
    //   1081: iload_3
    //   1082: ireturn
    //   1083: getstatic burp/Zb9m.Zc : Ljava/lang/String;
    //   1086: getstatic burp/Zg7j.Zr : Ljava/lang/Object;
    //   1089: checkcast java/math/BigInteger
    //   1092: invokevirtual intValue : ()I
    //   1095: bipush #32
    //   1097: irem
    //   1098: invokestatic abs : (I)I
    //   1101: invokevirtual charAt : (I)C
    //   1104: getstatic burp/Zboa.Zq : Ljava/lang/String;
    //   1107: getstatic burp/Zg27.ZQ : Ljava/lang/Object;
    //   1110: checkcast java/math/BigInteger
    //   1113: invokevirtual intValue : ()I
    //   1116: bipush #32
    //   1118: irem
    //   1119: invokestatic abs : (I)I
    //   1122: invokevirtual charAt : (I)C
    //   1125: if_icmpgt -> 1470
    //   1128: sipush #-32362
    //   1131: sipush #-32617
    //   1134: invokestatic a : (II)Ljava/lang/String;
    //   1137: iconst_1
    //   1138: ldc burp/Zzpj
    //   1140: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1143: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1146: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1149: astore #4
    //   1151: aload #4
    //   1153: arraylength
    //   1154: istore #5
    //   1156: iconst_0
    //   1157: istore #6
    //   1159: iload #6
    //   1161: iload #5
    //   1163: if_icmpge -> 1301
    //   1166: aload #4
    //   1168: iload #6
    //   1170: aaload
    //   1171: astore #7
    //   1173: aload #7
    //   1175: invokevirtual getModifiers : ()I
    //   1178: invokestatic isStatic : (I)Z
    //   1181: ifne -> 1191
    //   1184: goto -> 1294
    //   1187: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1190: athrow
    //   1191: aload #7
    //   1193: invokevirtual getType : ()Ljava/lang/Class;
    //   1196: astore #8
    //   1198: aload #8
    //   1200: ifnull -> 1281
    //   1203: aload #8
    //   1205: invokevirtual isPrimitive : ()Z
    //   1208: ifne -> 1281
    //   1211: goto -> 1218
    //   1214: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1217: athrow
    //   1218: aload #8
    //   1220: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1223: ifnull -> 1281
    //   1226: goto -> 1233
    //   1229: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1232: athrow
    //   1233: aload #8
    //   1235: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1238: invokevirtual getName : ()Ljava/lang/String;
    //   1241: ifnull -> 1281
    //   1244: goto -> 1251
    //   1247: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1250: athrow
    //   1251: aload #8
    //   1253: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1256: invokevirtual getName : ()Ljava/lang/String;
    //   1259: sipush #-32371
    //   1262: sipush #-16979
    //   1265: invokestatic a : (II)Ljava/lang/String;
    //   1268: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1271: ifne -> 1281
    //   1274: goto -> 1281
    //   1277: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1280: athrow
    //   1281: aload #7
    //   1283: iconst_1
    //   1284: invokevirtual setAccessible : (Z)V
    //   1287: aload #7
    //   1289: aconst_null
    //   1290: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1293: pop
    //   1294: iinc #6, 1
    //   1297: iload_2
    //   1298: ifne -> 1159
    //   1301: sipush #-32363
    //   1304: sipush #9384
    //   1307: invokestatic a : (II)Ljava/lang/String;
    //   1310: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1313: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1316: astore #4
    //   1318: aload #4
    //   1320: arraylength
    //   1321: istore #5
    //   1323: iconst_0
    //   1324: istore #6
    //   1326: iload #6
    //   1328: iload #5
    //   1330: if_icmpge -> 1466
    //   1333: aload #4
    //   1335: iload #6
    //   1337: aaload
    //   1338: astore #7
    //   1340: aload #7
    //   1342: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1345: pop
    //   1346: aload #7
    //   1348: invokevirtual getModifiers : ()I
    //   1351: invokestatic isStatic : (I)Z
    //   1354: ifeq -> 1452
    //   1357: aload #7
    //   1359: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1362: arraylength
    //   1363: iconst_2
    //   1364: if_icmpne -> 1452
    //   1367: goto -> 1374
    //   1370: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1373: athrow
    //   1374: aload #7
    //   1376: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1379: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1382: if_acmpne -> 1452
    //   1385: goto -> 1392
    //   1388: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1391: athrow
    //   1392: aload #7
    //   1394: iconst_1
    //   1395: invokevirtual setAccessible : (Z)V
    //   1398: aload #7
    //   1400: aconst_null
    //   1401: iconst_2
    //   1402: anewarray java/lang/Object
    //   1405: dup
    //   1406: iconst_0
    //   1407: aload_0
    //   1408: aastore
    //   1409: dup
    //   1410: iconst_1
    //   1411: aload_1
    //   1412: ifnonnull -> 1430
    //   1415: goto -> 1422
    //   1418: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1421: athrow
    //   1422: aload_1
    //   1423: goto -> 1437
    //   1426: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1429: athrow
    //   1430: aload_1
    //   1431: checkcast [B
    //   1434: invokevirtual clone : ()Ljava/lang/Object;
    //   1437: aastore
    //   1438: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1441: checkcast java/lang/Boolean
    //   1444: invokevirtual booleanValue : ()Z
    //   1447: istore_3
    //   1448: iload_2
    //   1449: ifne -> 1466
    //   1452: iinc #6, 1
    //   1455: iload_2
    //   1456: ifne -> 1326
    //   1459: goto -> 1466
    //   1462: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1465: athrow
    //   1466: iload_2
    //   1467: ifne -> 1808
    //   1470: sipush #-32366
    //   1473: sipush #32557
    //   1476: invokestatic a : (II)Ljava/lang/String;
    //   1479: iconst_1
    //   1480: ldc burp/Zevc
    //   1482: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1485: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1488: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1491: astore #4
    //   1493: aload #4
    //   1495: arraylength
    //   1496: istore #5
    //   1498: iconst_0
    //   1499: istore #6
    //   1501: iload #6
    //   1503: iload #5
    //   1505: if_icmpge -> 1643
    //   1508: aload #4
    //   1510: iload #6
    //   1512: aaload
    //   1513: astore #7
    //   1515: aload #7
    //   1517: invokevirtual getModifiers : ()I
    //   1520: invokestatic isStatic : (I)Z
    //   1523: ifne -> 1533
    //   1526: goto -> 1636
    //   1529: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1532: athrow
    //   1533: aload #7
    //   1535: invokevirtual getType : ()Ljava/lang/Class;
    //   1538: astore #8
    //   1540: aload #8
    //   1542: ifnull -> 1623
    //   1545: aload #8
    //   1547: invokevirtual isPrimitive : ()Z
    //   1550: ifne -> 1623
    //   1553: goto -> 1560
    //   1556: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1559: athrow
    //   1560: aload #8
    //   1562: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1565: ifnull -> 1623
    //   1568: goto -> 1575
    //   1571: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1574: athrow
    //   1575: aload #8
    //   1577: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1580: invokevirtual getName : ()Ljava/lang/String;
    //   1583: ifnull -> 1623
    //   1586: goto -> 1593
    //   1589: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1592: athrow
    //   1593: aload #8
    //   1595: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1598: invokevirtual getName : ()Ljava/lang/String;
    //   1601: sipush #-32371
    //   1604: sipush #-16979
    //   1607: invokestatic a : (II)Ljava/lang/String;
    //   1610: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1613: ifne -> 1623
    //   1616: goto -> 1623
    //   1619: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1622: athrow
    //   1623: aload #7
    //   1625: iconst_1
    //   1626: invokevirtual setAccessible : (Z)V
    //   1629: aload #7
    //   1631: aconst_null
    //   1632: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1635: pop
    //   1636: iinc #6, 1
    //   1639: iload_2
    //   1640: ifne -> 1501
    //   1643: sipush #-32377
    //   1646: sipush #-29916
    //   1649: invokestatic a : (II)Ljava/lang/String;
    //   1652: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1655: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1658: astore #4
    //   1660: aload #4
    //   1662: arraylength
    //   1663: istore #5
    //   1665: iconst_0
    //   1666: istore #6
    //   1668: iload #6
    //   1670: iload #5
    //   1672: if_icmpge -> 1808
    //   1675: aload #4
    //   1677: iload #6
    //   1679: aaload
    //   1680: astore #7
    //   1682: aload #7
    //   1684: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1687: pop
    //   1688: aload #7
    //   1690: invokevirtual getModifiers : ()I
    //   1693: invokestatic isStatic : (I)Z
    //   1696: ifeq -> 1794
    //   1699: aload #7
    //   1701: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1704: arraylength
    //   1705: iconst_2
    //   1706: if_icmpne -> 1794
    //   1709: goto -> 1716
    //   1712: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1715: athrow
    //   1716: aload #7
    //   1718: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1721: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1724: if_acmpne -> 1794
    //   1727: goto -> 1734
    //   1730: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1733: athrow
    //   1734: aload #7
    //   1736: iconst_1
    //   1737: invokevirtual setAccessible : (Z)V
    //   1740: aload #7
    //   1742: aconst_null
    //   1743: iconst_2
    //   1744: anewarray java/lang/Object
    //   1747: dup
    //   1748: iconst_0
    //   1749: aload_0
    //   1750: aastore
    //   1751: dup
    //   1752: iconst_1
    //   1753: aload_1
    //   1754: ifnonnull -> 1772
    //   1757: goto -> 1764
    //   1760: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1763: athrow
    //   1764: aload_1
    //   1765: goto -> 1779
    //   1768: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1771: athrow
    //   1772: aload_1
    //   1773: checkcast [B
    //   1776: invokevirtual clone : ()Ljava/lang/Object;
    //   1779: aastore
    //   1780: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1783: checkcast java/lang/Boolean
    //   1786: invokevirtual booleanValue : ()Z
    //   1789: istore_3
    //   1790: iload_2
    //   1791: ifne -> 1808
    //   1794: iinc #6, 1
    //   1797: iload_2
    //   1798: ifne -> 1668
    //   1801: goto -> 1808
    //   1804: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1807: athrow
    //   1808: iload_3
    //   1809: ifeq -> 1814
    //   1812: iload_3
    //   1813: ireturn
    //   1814: getstatic burp/Zec0.Zk : Ljava/lang/String;
    //   1817: getstatic burp/Zszz.ZG : Ljava/lang/Object;
    //   1820: checkcast java/math/BigInteger
    //   1823: invokevirtual intValue : ()I
    //   1826: bipush #32
    //   1828: irem
    //   1829: invokestatic abs : (I)I
    //   1832: invokevirtual charAt : (I)C
    //   1835: getstatic burp/Zmsl.ZP : Ljava/lang/String;
    //   1838: getstatic burp/Zx_u.Zy : Ljava/lang/Object;
    //   1841: checkcast java/math/BigInteger
    //   1844: invokevirtual intValue : ()I
    //   1847: bipush #32
    //   1849: irem
    //   1850: invokestatic abs : (I)I
    //   1853: invokevirtual charAt : (I)C
    //   1856: if_icmple -> 2201
    //   1859: sipush #-32367
    //   1862: sipush #-1602
    //   1865: invokestatic a : (II)Ljava/lang/String;
    //   1868: iconst_1
    //   1869: ldc burp/Zttj
    //   1871: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1874: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1877: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1880: astore #4
    //   1882: aload #4
    //   1884: arraylength
    //   1885: istore #5
    //   1887: iconst_0
    //   1888: istore #6
    //   1890: iload #6
    //   1892: iload #5
    //   1894: if_icmpge -> 2032
    //   1897: aload #4
    //   1899: iload #6
    //   1901: aaload
    //   1902: astore #7
    //   1904: aload #7
    //   1906: invokevirtual getModifiers : ()I
    //   1909: invokestatic isStatic : (I)Z
    //   1912: ifne -> 1922
    //   1915: goto -> 2025
    //   1918: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1921: athrow
    //   1922: aload #7
    //   1924: invokevirtual getType : ()Ljava/lang/Class;
    //   1927: astore #8
    //   1929: aload #8
    //   1931: ifnull -> 2012
    //   1934: aload #8
    //   1936: invokevirtual isPrimitive : ()Z
    //   1939: ifne -> 2012
    //   1942: goto -> 1949
    //   1945: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1948: athrow
    //   1949: aload #8
    //   1951: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1954: ifnull -> 2012
    //   1957: goto -> 1964
    //   1960: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1963: athrow
    //   1964: aload #8
    //   1966: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1969: invokevirtual getName : ()Ljava/lang/String;
    //   1972: ifnull -> 2012
    //   1975: goto -> 1982
    //   1978: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1981: athrow
    //   1982: aload #8
    //   1984: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1987: invokevirtual getName : ()Ljava/lang/String;
    //   1990: sipush #-32371
    //   1993: sipush #-16979
    //   1996: invokestatic a : (II)Ljava/lang/String;
    //   1999: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2002: ifne -> 2012
    //   2005: goto -> 2012
    //   2008: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2011: athrow
    //   2012: aload #7
    //   2014: iconst_1
    //   2015: invokevirtual setAccessible : (Z)V
    //   2018: aload #7
    //   2020: aconst_null
    //   2021: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2024: pop
    //   2025: iinc #6, 1
    //   2028: iload_2
    //   2029: ifne -> 1890
    //   2032: sipush #-32384
    //   2035: sipush #10061
    //   2038: invokestatic a : (II)Ljava/lang/String;
    //   2041: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2044: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2047: astore #4
    //   2049: aload #4
    //   2051: arraylength
    //   2052: istore #5
    //   2054: iconst_0
    //   2055: istore #6
    //   2057: iload #6
    //   2059: iload #5
    //   2061: if_icmpge -> 2197
    //   2064: aload #4
    //   2066: iload #6
    //   2068: aaload
    //   2069: astore #7
    //   2071: aload #7
    //   2073: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2076: pop
    //   2077: aload #7
    //   2079: invokevirtual getModifiers : ()I
    //   2082: invokestatic isStatic : (I)Z
    //   2085: ifeq -> 2183
    //   2088: aload #7
    //   2090: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2093: arraylength
    //   2094: iconst_2
    //   2095: if_icmpne -> 2183
    //   2098: goto -> 2105
    //   2101: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2104: athrow
    //   2105: aload #7
    //   2107: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2110: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2113: if_acmpne -> 2183
    //   2116: goto -> 2123
    //   2119: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2122: athrow
    //   2123: aload #7
    //   2125: iconst_1
    //   2126: invokevirtual setAccessible : (Z)V
    //   2129: aload #7
    //   2131: aconst_null
    //   2132: iconst_2
    //   2133: anewarray java/lang/Object
    //   2136: dup
    //   2137: iconst_0
    //   2138: aload_0
    //   2139: aastore
    //   2140: dup
    //   2141: iconst_1
    //   2142: aload_1
    //   2143: ifnonnull -> 2161
    //   2146: goto -> 2153
    //   2149: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2152: athrow
    //   2153: aload_1
    //   2154: goto -> 2168
    //   2157: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2160: athrow
    //   2161: aload_1
    //   2162: checkcast [B
    //   2165: invokevirtual clone : ()Ljava/lang/Object;
    //   2168: aastore
    //   2169: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2172: checkcast java/lang/Boolean
    //   2175: invokevirtual booleanValue : ()Z
    //   2178: istore_3
    //   2179: iload_2
    //   2180: ifne -> 2197
    //   2183: iinc #6, 1
    //   2186: iload_2
    //   2187: ifne -> 2057
    //   2190: goto -> 2197
    //   2193: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2196: athrow
    //   2197: iload_2
    //   2198: ifne -> 2539
    //   2201: sipush #-32368
    //   2204: sipush #3421
    //   2207: invokestatic a : (II)Ljava/lang/String;
    //   2210: iconst_1
    //   2211: ldc burp/Zxnm
    //   2213: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2216: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2219: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2222: astore #4
    //   2224: aload #4
    //   2226: arraylength
    //   2227: istore #5
    //   2229: iconst_0
    //   2230: istore #6
    //   2232: iload #6
    //   2234: iload #5
    //   2236: if_icmpge -> 2374
    //   2239: aload #4
    //   2241: iload #6
    //   2243: aaload
    //   2244: astore #7
    //   2246: aload #7
    //   2248: invokevirtual getModifiers : ()I
    //   2251: invokestatic isStatic : (I)Z
    //   2254: ifne -> 2264
    //   2257: goto -> 2367
    //   2260: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2263: athrow
    //   2264: aload #7
    //   2266: invokevirtual getType : ()Ljava/lang/Class;
    //   2269: astore #8
    //   2271: aload #8
    //   2273: ifnull -> 2354
    //   2276: aload #8
    //   2278: invokevirtual isPrimitive : ()Z
    //   2281: ifne -> 2354
    //   2284: goto -> 2291
    //   2287: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2290: athrow
    //   2291: aload #8
    //   2293: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2296: ifnull -> 2354
    //   2299: goto -> 2306
    //   2302: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2305: athrow
    //   2306: aload #8
    //   2308: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2311: invokevirtual getName : ()Ljava/lang/String;
    //   2314: ifnull -> 2354
    //   2317: goto -> 2324
    //   2320: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2323: athrow
    //   2324: aload #8
    //   2326: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2329: invokevirtual getName : ()Ljava/lang/String;
    //   2332: sipush #-32371
    //   2335: sipush #-16979
    //   2338: invokestatic a : (II)Ljava/lang/String;
    //   2341: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2344: ifne -> 2354
    //   2347: goto -> 2354
    //   2350: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2353: athrow
    //   2354: aload #7
    //   2356: iconst_1
    //   2357: invokevirtual setAccessible : (Z)V
    //   2360: aload #7
    //   2362: aconst_null
    //   2363: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2366: pop
    //   2367: iinc #6, 1
    //   2370: iload_2
    //   2371: ifne -> 2232
    //   2374: sipush #-32372
    //   2377: sipush #-26785
    //   2380: invokestatic a : (II)Ljava/lang/String;
    //   2383: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2386: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2389: astore #4
    //   2391: aload #4
    //   2393: arraylength
    //   2394: istore #5
    //   2396: iconst_0
    //   2397: istore #6
    //   2399: iload #6
    //   2401: iload #5
    //   2403: if_icmpge -> 2539
    //   2406: aload #4
    //   2408: iload #6
    //   2410: aaload
    //   2411: astore #7
    //   2413: aload #7
    //   2415: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2418: pop
    //   2419: aload #7
    //   2421: invokevirtual getModifiers : ()I
    //   2424: invokestatic isStatic : (I)Z
    //   2427: ifeq -> 2525
    //   2430: aload #7
    //   2432: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2435: arraylength
    //   2436: iconst_2
    //   2437: if_icmpne -> 2525
    //   2440: goto -> 2447
    //   2443: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2446: athrow
    //   2447: aload #7
    //   2449: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2452: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2455: if_acmpne -> 2525
    //   2458: goto -> 2465
    //   2461: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2464: athrow
    //   2465: aload #7
    //   2467: iconst_1
    //   2468: invokevirtual setAccessible : (Z)V
    //   2471: aload #7
    //   2473: aconst_null
    //   2474: iconst_2
    //   2475: anewarray java/lang/Object
    //   2478: dup
    //   2479: iconst_0
    //   2480: aload_0
    //   2481: aastore
    //   2482: dup
    //   2483: iconst_1
    //   2484: aload_1
    //   2485: ifnonnull -> 2503
    //   2488: goto -> 2495
    //   2491: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2494: athrow
    //   2495: aload_1
    //   2496: goto -> 2510
    //   2499: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2502: athrow
    //   2503: aload_1
    //   2504: checkcast [B
    //   2507: invokevirtual clone : ()Ljava/lang/Object;
    //   2510: aastore
    //   2511: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2514: checkcast java/lang/Boolean
    //   2517: invokevirtual booleanValue : ()Z
    //   2520: istore_3
    //   2521: iload_2
    //   2522: ifne -> 2539
    //   2525: iinc #6, 1
    //   2528: iload_2
    //   2529: ifne -> 2399
    //   2532: goto -> 2539
    //   2535: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2538: athrow
    //   2539: iload_3
    //   2540: ifeq -> 2545
    //   2543: iload_3
    //   2544: ireturn
    //   2545: getstatic burp/Zm4k.ZW : Ljava/lang/String;
    //   2548: getstatic burp/Zm81.Zy : Ljava/lang/Object;
    //   2551: checkcast java/math/BigInteger
    //   2554: invokevirtual intValue : ()I
    //   2557: bipush #32
    //   2559: irem
    //   2560: invokestatic abs : (I)I
    //   2563: invokevirtual charAt : (I)C
    //   2566: getstatic burp/Zem6.Zp : Ljava/lang/String;
    //   2569: getstatic burp/Ze08.ZJ : Ljava/lang/Object;
    //   2572: checkcast java/math/BigInteger
    //   2575: invokevirtual intValue : ()I
    //   2578: bipush #32
    //   2580: irem
    //   2581: invokestatic abs : (I)I
    //   2584: invokevirtual charAt : (I)C
    //   2587: if_icmple -> 2932
    //   2590: sipush #-32354
    //   2593: sipush #-27768
    //   2596: invokestatic a : (II)Ljava/lang/String;
    //   2599: iconst_1
    //   2600: ldc burp/Zb6e
    //   2602: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2605: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2608: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2611: astore #4
    //   2613: aload #4
    //   2615: arraylength
    //   2616: istore #5
    //   2618: iconst_0
    //   2619: istore #6
    //   2621: iload #6
    //   2623: iload #5
    //   2625: if_icmpge -> 2763
    //   2628: aload #4
    //   2630: iload #6
    //   2632: aaload
    //   2633: astore #7
    //   2635: aload #7
    //   2637: invokevirtual getModifiers : ()I
    //   2640: invokestatic isStatic : (I)Z
    //   2643: ifne -> 2653
    //   2646: goto -> 2756
    //   2649: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2652: athrow
    //   2653: aload #7
    //   2655: invokevirtual getType : ()Ljava/lang/Class;
    //   2658: astore #8
    //   2660: aload #8
    //   2662: ifnull -> 2743
    //   2665: aload #8
    //   2667: invokevirtual isPrimitive : ()Z
    //   2670: ifne -> 2743
    //   2673: goto -> 2680
    //   2676: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2679: athrow
    //   2680: aload #8
    //   2682: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2685: ifnull -> 2743
    //   2688: goto -> 2695
    //   2691: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2694: athrow
    //   2695: aload #8
    //   2697: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2700: invokevirtual getName : ()Ljava/lang/String;
    //   2703: ifnull -> 2743
    //   2706: goto -> 2713
    //   2709: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2712: athrow
    //   2713: aload #8
    //   2715: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2718: invokevirtual getName : ()Ljava/lang/String;
    //   2721: sipush #-32371
    //   2724: sipush #-16979
    //   2727: invokestatic a : (II)Ljava/lang/String;
    //   2730: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2733: ifne -> 2743
    //   2736: goto -> 2743
    //   2739: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2742: athrow
    //   2743: aload #7
    //   2745: iconst_1
    //   2746: invokevirtual setAccessible : (Z)V
    //   2749: aload #7
    //   2751: aconst_null
    //   2752: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2755: pop
    //   2756: iinc #6, 1
    //   2759: iload_2
    //   2760: ifne -> 2621
    //   2763: sipush #-32375
    //   2766: sipush #-30244
    //   2769: invokestatic a : (II)Ljava/lang/String;
    //   2772: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2775: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2778: astore #4
    //   2780: aload #4
    //   2782: arraylength
    //   2783: istore #5
    //   2785: iconst_0
    //   2786: istore #6
    //   2788: iload #6
    //   2790: iload #5
    //   2792: if_icmpge -> 2928
    //   2795: aload #4
    //   2797: iload #6
    //   2799: aaload
    //   2800: astore #7
    //   2802: aload #7
    //   2804: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2807: pop
    //   2808: aload #7
    //   2810: invokevirtual getModifiers : ()I
    //   2813: invokestatic isStatic : (I)Z
    //   2816: ifeq -> 2914
    //   2819: aload #7
    //   2821: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2824: arraylength
    //   2825: iconst_2
    //   2826: if_icmpne -> 2914
    //   2829: goto -> 2836
    //   2832: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2835: athrow
    //   2836: aload #7
    //   2838: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2841: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2844: if_acmpne -> 2914
    //   2847: goto -> 2854
    //   2850: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2853: athrow
    //   2854: aload #7
    //   2856: iconst_1
    //   2857: invokevirtual setAccessible : (Z)V
    //   2860: aload #7
    //   2862: aconst_null
    //   2863: iconst_2
    //   2864: anewarray java/lang/Object
    //   2867: dup
    //   2868: iconst_0
    //   2869: aload_0
    //   2870: aastore
    //   2871: dup
    //   2872: iconst_1
    //   2873: aload_1
    //   2874: ifnonnull -> 2892
    //   2877: goto -> 2884
    //   2880: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2883: athrow
    //   2884: aload_1
    //   2885: goto -> 2899
    //   2888: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2891: athrow
    //   2892: aload_1
    //   2893: checkcast [B
    //   2896: invokevirtual clone : ()Ljava/lang/Object;
    //   2899: aastore
    //   2900: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2903: checkcast java/lang/Boolean
    //   2906: invokevirtual booleanValue : ()Z
    //   2909: istore_3
    //   2910: iload_2
    //   2911: ifne -> 2928
    //   2914: iinc #6, 1
    //   2917: iload_2
    //   2918: ifne -> 2788
    //   2921: goto -> 2928
    //   2924: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2927: athrow
    //   2928: iload_2
    //   2929: ifne -> 3270
    //   2932: sipush #-32374
    //   2935: sipush #-7477
    //   2938: invokestatic a : (II)Ljava/lang/String;
    //   2941: iconst_1
    //   2942: ldc burp/Zeb7
    //   2944: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2947: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2950: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2953: astore #4
    //   2955: aload #4
    //   2957: arraylength
    //   2958: istore #5
    //   2960: iconst_0
    //   2961: istore #6
    //   2963: iload #6
    //   2965: iload #5
    //   2967: if_icmpge -> 3105
    //   2970: aload #4
    //   2972: iload #6
    //   2974: aaload
    //   2975: astore #7
    //   2977: aload #7
    //   2979: invokevirtual getModifiers : ()I
    //   2982: invokestatic isStatic : (I)Z
    //   2985: ifne -> 2995
    //   2988: goto -> 3098
    //   2991: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2994: athrow
    //   2995: aload #7
    //   2997: invokevirtual getType : ()Ljava/lang/Class;
    //   3000: astore #8
    //   3002: aload #8
    //   3004: ifnull -> 3085
    //   3007: aload #8
    //   3009: invokevirtual isPrimitive : ()Z
    //   3012: ifne -> 3085
    //   3015: goto -> 3022
    //   3018: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3021: athrow
    //   3022: aload #8
    //   3024: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3027: ifnull -> 3085
    //   3030: goto -> 3037
    //   3033: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3036: athrow
    //   3037: aload #8
    //   3039: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3042: invokevirtual getName : ()Ljava/lang/String;
    //   3045: ifnull -> 3085
    //   3048: goto -> 3055
    //   3051: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3054: athrow
    //   3055: aload #8
    //   3057: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3060: invokevirtual getName : ()Ljava/lang/String;
    //   3063: sipush #-32371
    //   3066: sipush #-16979
    //   3069: invokestatic a : (II)Ljava/lang/String;
    //   3072: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3075: ifne -> 3085
    //   3078: goto -> 3085
    //   3081: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3084: athrow
    //   3085: aload #7
    //   3087: iconst_1
    //   3088: invokevirtual setAccessible : (Z)V
    //   3091: aload #7
    //   3093: aconst_null
    //   3094: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3097: pop
    //   3098: iinc #6, 1
    //   3101: iload_2
    //   3102: ifne -> 2963
    //   3105: sipush #-32379
    //   3108: sipush #-6453
    //   3111: invokestatic a : (II)Ljava/lang/String;
    //   3114: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3117: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3120: astore #4
    //   3122: aload #4
    //   3124: arraylength
    //   3125: istore #5
    //   3127: iconst_0
    //   3128: istore #6
    //   3130: iload #6
    //   3132: iload #5
    //   3134: if_icmpge -> 3270
    //   3137: aload #4
    //   3139: iload #6
    //   3141: aaload
    //   3142: astore #7
    //   3144: aload #7
    //   3146: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3149: pop
    //   3150: aload #7
    //   3152: invokevirtual getModifiers : ()I
    //   3155: invokestatic isStatic : (I)Z
    //   3158: ifeq -> 3256
    //   3161: aload #7
    //   3163: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3166: arraylength
    //   3167: iconst_2
    //   3168: if_icmpne -> 3256
    //   3171: goto -> 3178
    //   3174: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3177: athrow
    //   3178: aload #7
    //   3180: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3183: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3186: if_acmpne -> 3256
    //   3189: goto -> 3196
    //   3192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3195: athrow
    //   3196: aload #7
    //   3198: iconst_1
    //   3199: invokevirtual setAccessible : (Z)V
    //   3202: aload #7
    //   3204: aconst_null
    //   3205: iconst_2
    //   3206: anewarray java/lang/Object
    //   3209: dup
    //   3210: iconst_0
    //   3211: aload_0
    //   3212: aastore
    //   3213: dup
    //   3214: iconst_1
    //   3215: aload_1
    //   3216: ifnonnull -> 3234
    //   3219: goto -> 3226
    //   3222: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3225: athrow
    //   3226: aload_1
    //   3227: goto -> 3241
    //   3230: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3233: athrow
    //   3234: aload_1
    //   3235: checkcast [B
    //   3238: invokevirtual clone : ()Ljava/lang/Object;
    //   3241: aastore
    //   3242: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3245: checkcast java/lang/Boolean
    //   3248: invokevirtual booleanValue : ()Z
    //   3251: istore_3
    //   3252: iload_2
    //   3253: ifne -> 3270
    //   3256: iinc #6, 1
    //   3259: iload_2
    //   3260: ifne -> 3130
    //   3263: goto -> 3270
    //   3266: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3269: athrow
    //   3270: iload_3
    //   3271: ireturn
    //   3272: astore_3
    //   3273: new java/lang/Exception
    //   3276: dup
    //   3277: aload_3
    //   3278: invokevirtual getMessage : ()Ljava/lang/String;
    //   3281: invokespecial <init> : (Ljava/lang/String;)V
    //   3284: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1082	3272	java/lang/Throwable
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
    //   443	457	457	java/lang/Throwable
    //   468	481	484	java/lang/Throwable
    //   473	496	499	java/lang/Throwable
    //   488	514	517	java/lang/Throwable
    //   503	544	547	java/lang/Throwable
    //   610	637	640	java/lang/Throwable
    //   627	655	658	java/lang/Throwable
    //   644	685	688	java/lang/Throwable
    //   662	696	696	java/lang/Throwable
    //   718	729	732	java/lang/Throwable
    //   784	798	798	java/lang/Throwable
    //   809	822	825	java/lang/Throwable
    //   814	837	840	java/lang/Throwable
    //   829	855	858	java/lang/Throwable
    //   844	885	888	java/lang/Throwable
    //   951	978	981	java/lang/Throwable
    //   968	996	999	java/lang/Throwable
    //   985	1026	1029	java/lang/Throwable
    //   1003	1037	1037	java/lang/Throwable
    //   1059	1070	1073	java/lang/Throwable
    //   1083	1813	3272	java/lang/Throwable
    //   1173	1187	1187	java/lang/Throwable
    //   1198	1211	1214	java/lang/Throwable
    //   1203	1226	1229	java/lang/Throwable
    //   1218	1244	1247	java/lang/Throwable
    //   1233	1274	1277	java/lang/Throwable
    //   1340	1367	1370	java/lang/Throwable
    //   1357	1385	1388	java/lang/Throwable
    //   1374	1415	1418	java/lang/Throwable
    //   1392	1426	1426	java/lang/Throwable
    //   1448	1459	1462	java/lang/Throwable
    //   1515	1529	1529	java/lang/Throwable
    //   1540	1553	1556	java/lang/Throwable
    //   1545	1568	1571	java/lang/Throwable
    //   1560	1586	1589	java/lang/Throwable
    //   1575	1616	1619	java/lang/Throwable
    //   1682	1709	1712	java/lang/Throwable
    //   1699	1727	1730	java/lang/Throwable
    //   1716	1757	1760	java/lang/Throwable
    //   1734	1768	1768	java/lang/Throwable
    //   1790	1801	1804	java/lang/Throwable
    //   1814	2544	3272	java/lang/Throwable
    //   1904	1918	1918	java/lang/Throwable
    //   1929	1942	1945	java/lang/Throwable
    //   1934	1957	1960	java/lang/Throwable
    //   1949	1975	1978	java/lang/Throwable
    //   1964	2005	2008	java/lang/Throwable
    //   2071	2098	2101	java/lang/Throwable
    //   2088	2116	2119	java/lang/Throwable
    //   2105	2146	2149	java/lang/Throwable
    //   2123	2157	2157	java/lang/Throwable
    //   2179	2190	2193	java/lang/Throwable
    //   2246	2260	2260	java/lang/Throwable
    //   2271	2284	2287	java/lang/Throwable
    //   2276	2299	2302	java/lang/Throwable
    //   2291	2317	2320	java/lang/Throwable
    //   2306	2347	2350	java/lang/Throwable
    //   2413	2440	2443	java/lang/Throwable
    //   2430	2458	2461	java/lang/Throwable
    //   2447	2488	2491	java/lang/Throwable
    //   2465	2499	2499	java/lang/Throwable
    //   2521	2532	2535	java/lang/Throwable
    //   2545	3271	3272	java/lang/Throwable
    //   2635	2649	2649	java/lang/Throwable
    //   2660	2673	2676	java/lang/Throwable
    //   2665	2688	2691	java/lang/Throwable
    //   2680	2706	2709	java/lang/Throwable
    //   2695	2736	2739	java/lang/Throwable
    //   2802	2829	2832	java/lang/Throwable
    //   2819	2847	2850	java/lang/Throwable
    //   2836	2877	2880	java/lang/Throwable
    //   2854	2888	2888	java/lang/Throwable
    //   2910	2921	2924	java/lang/Throwable
    //   2977	2991	2991	java/lang/Throwable
    //   3002	3015	3018	java/lang/Throwable
    //   3007	3030	3033	java/lang/Throwable
    //   3022	3048	3051	java/lang/Throwable
    //   3037	3078	3081	java/lang/Throwable
    //   3144	3171	3174	java/lang/Throwable
    //   3161	3189	3192	java/lang/Throwable
    //   3178	3219	3222	java/lang/Throwable
    //   3196	3230	3230	java/lang/Throwable
    //   3252	3263	3266	java/lang/Throwable
  }
  
  static void Ze(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '·®¦Îùô\\t2ù!LØCÖQ¬\\tRN-ºYéá\\tÊ*íp×<½Ð1\\t<ààøÆ#\\\t+¥Ç¼2D~e\\t(b¢°ÓöMÖöK§­]uL¥[r&Ìu$¶e<Éû\\n¡\\fÝÎßYãý_HNí4>-À²%IO#Á9ZÓ`SêF=+LÀ\\báù4GºöË}Ã\\tOUÙ-ñ`g\\bvî©®ÉþñQYY\\tÖ©íÿnÆ{\\tyKHõf\\t\\fçò Íù\\tÜÙüHcÃ©S\\r\\tÕÝ GÞ$¹Ð l+ËMxLZßÖ:fÏl.lË~Þ]ò¢¢ðÊ\\tl`ê¡%ùI\\tÃL«Eü\\t}ÈåÚwnJ ÔwUÖLÐ~¾ØÎ]JÂñ¢Ý;·Tgd!Zäìsp\\táÁ[K£0'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #38
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
    //   68: ldc '\\nÝ¨ÝEò\\n)\\tW¿0m·'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #27
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
    //   129: putstatic burp/Zrw7.a : [Ljava/lang/String;
    //   132: bipush #25
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrw7.b : [Ljava/lang/String;
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
    //   217: bipush #11
    //   219: goto -> 244
    //   222: bipush #80
    //   224: goto -> 244
    //   227: bipush #91
    //   229: goto -> 244
    //   232: bipush #6
    //   234: goto -> 244
    //   237: bipush #103
    //   239: goto -> 244
    //   242: bipush #105
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
    //   311: bipush #17
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-116
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #-93
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #41
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #58
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #-105
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #-71
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #-12
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #73
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #-63
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #65
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #-79
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #122
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #-109
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #-57
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #11
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #-127
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #-69
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #-122
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #29
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #89
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #-83
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #34
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #66
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #99
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #109
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #42
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #6
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #-40
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #96
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #-126
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #-65
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Zrw7.ZV : Ljava/lang/Object;
    //   501: sipush #-32361
    //   504: sipush #-25906
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Zrw7.Zo : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8186) & 0xFFFF;
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
      byte b1 = 90;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrw7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */