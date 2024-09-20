package burp;

import java.math.BigInteger;

class Zex extends ClassLoader {
  static String Zn;
  
  static Object ZO;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zr(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZZ(Object paramObject) {
    Zvo3.Z_ = a(-792, 28149);
    Zvo3.Ze = new BigInteger(a(-774, 12563));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zm8v.Zl.charAt(Math.abs(((BigInteger)Zt9_.ZN).intValue() % 32)) <= Zx6d.ZP.charAt(Math.abs(((BigInteger)Zlnm.Zn).intValue() % 32))) {
          try {
            Zm4i.ZJ(Class.forName(a(-780, -22546)));
            if (bool)
              Zgkl.ZY(Class.forName(a(-794, 20206))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgkl.ZY(Class.forName(a(-794, 20206)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zt(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zkt7.ZY : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zzgh.ZV : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zmx6.ZJ : Ljava/lang/Object;
    //   22: sipush #-784
    //   25: sipush #681
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Ztq8
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
    //   150: sipush #-797
    //   153: sipush #-30755
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
    //   192: sipush #-773
    //   195: sipush #-29015
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
    //   353: getstatic burp/Zz75.ZT : Ljava/lang/String;
    //   356: getstatic burp/Zstb.ZC : Ljava/lang/Object;
    //   359: checkcast java/math/BigInteger
    //   362: invokevirtual intValue : ()I
    //   365: bipush #32
    //   367: irem
    //   368: invokestatic abs : (I)I
    //   371: invokevirtual charAt : (I)C
    //   374: getstatic burp/Zza8.Zm : Ljava/lang/String;
    //   377: getstatic burp/Zlrm.ZM : Ljava/lang/Object;
    //   380: checkcast java/math/BigInteger
    //   383: invokevirtual intValue : ()I
    //   386: bipush #32
    //   388: irem
    //   389: invokestatic abs : (I)I
    //   392: invokevirtual charAt : (I)C
    //   395: if_icmpgt -> 739
    //   398: sipush #-787
    //   401: sipush #22423
    //   404: invokestatic a : (II)Ljava/lang/String;
    //   407: iconst_1
    //   408: ldc burp/Ztfr
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
    //   529: sipush #-776
    //   532: sipush #5271
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
    //   571: sipush #-781
    //   574: sipush #16796
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
    //   736: goto -> 1076
    //   739: sipush #-791
    //   742: sipush #-1170
    //   745: invokestatic a : (II)Ljava/lang/String;
    //   748: iconst_1
    //   749: ldc burp/Zeyd
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
    //   870: sipush #-776
    //   873: sipush #5271
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
    //   912: sipush #-769
    //   915: bipush #77
    //   917: invokestatic a : (II)Ljava/lang/String;
    //   920: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   923: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   926: astore #4
    //   928: aload #4
    //   930: arraylength
    //   931: istore #5
    //   933: iconst_0
    //   934: istore #6
    //   936: iload #6
    //   938: iload #5
    //   940: if_icmpge -> 1076
    //   943: aload #4
    //   945: iload #6
    //   947: aaload
    //   948: astore #7
    //   950: aload #7
    //   952: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   955: pop
    //   956: aload #7
    //   958: invokevirtual getModifiers : ()I
    //   961: invokestatic isStatic : (I)Z
    //   964: ifeq -> 1062
    //   967: aload #7
    //   969: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   972: arraylength
    //   973: iconst_2
    //   974: if_icmpne -> 1062
    //   977: goto -> 984
    //   980: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   983: athrow
    //   984: aload #7
    //   986: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   989: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   992: if_acmpne -> 1062
    //   995: goto -> 1002
    //   998: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1001: athrow
    //   1002: aload #7
    //   1004: iconst_1
    //   1005: invokevirtual setAccessible : (Z)V
    //   1008: aload #7
    //   1010: aconst_null
    //   1011: iconst_2
    //   1012: anewarray java/lang/Object
    //   1015: dup
    //   1016: iconst_0
    //   1017: aload_0
    //   1018: aastore
    //   1019: dup
    //   1020: iconst_1
    //   1021: aload_1
    //   1022: ifnonnull -> 1040
    //   1025: goto -> 1032
    //   1028: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1031: athrow
    //   1032: aload_1
    //   1033: goto -> 1047
    //   1036: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1039: athrow
    //   1040: aload_1
    //   1041: checkcast [B
    //   1044: invokevirtual clone : ()Ljava/lang/Object;
    //   1047: aastore
    //   1048: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1051: checkcast java/lang/Boolean
    //   1054: invokevirtual booleanValue : ()Z
    //   1057: istore_3
    //   1058: iload_2
    //   1059: ifne -> 1076
    //   1062: iinc #6, 1
    //   1065: iload_2
    //   1066: ifne -> 936
    //   1069: goto -> 1076
    //   1072: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1075: athrow
    //   1076: iload_3
    //   1077: ifeq -> 1082
    //   1080: iload_3
    //   1081: ireturn
    //   1082: getstatic burp/Zlvb.Zs : Ljava/lang/String;
    //   1085: getstatic burp/Zg4d.Zm : Ljava/lang/Object;
    //   1088: checkcast java/math/BigInteger
    //   1091: invokevirtual intValue : ()I
    //   1094: bipush #32
    //   1096: irem
    //   1097: invokestatic abs : (I)I
    //   1100: invokevirtual charAt : (I)C
    //   1103: getstatic burp/Zrtv.ZA : Ljava/lang/String;
    //   1106: getstatic burp/Zx6d.ZU : Ljava/lang/Object;
    //   1109: checkcast java/math/BigInteger
    //   1112: invokevirtual intValue : ()I
    //   1115: bipush #32
    //   1117: irem
    //   1118: invokestatic abs : (I)I
    //   1121: invokevirtual charAt : (I)C
    //   1124: if_icmple -> 1469
    //   1127: sipush #-770
    //   1130: sipush #-21486
    //   1133: invokestatic a : (II)Ljava/lang/String;
    //   1136: iconst_1
    //   1137: ldc burp/Zf
    //   1139: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1142: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1145: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1148: astore #4
    //   1150: aload #4
    //   1152: arraylength
    //   1153: istore #5
    //   1155: iconst_0
    //   1156: istore #6
    //   1158: iload #6
    //   1160: iload #5
    //   1162: if_icmpge -> 1300
    //   1165: aload #4
    //   1167: iload #6
    //   1169: aaload
    //   1170: astore #7
    //   1172: aload #7
    //   1174: invokevirtual getModifiers : ()I
    //   1177: invokestatic isStatic : (I)Z
    //   1180: ifne -> 1190
    //   1183: goto -> 1293
    //   1186: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1189: athrow
    //   1190: aload #7
    //   1192: invokevirtual getType : ()Ljava/lang/Class;
    //   1195: astore #8
    //   1197: aload #8
    //   1199: ifnull -> 1280
    //   1202: aload #8
    //   1204: invokevirtual isPrimitive : ()Z
    //   1207: ifne -> 1280
    //   1210: goto -> 1217
    //   1213: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1216: athrow
    //   1217: aload #8
    //   1219: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1222: ifnull -> 1280
    //   1225: goto -> 1232
    //   1228: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1231: athrow
    //   1232: aload #8
    //   1234: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1237: invokevirtual getName : ()Ljava/lang/String;
    //   1240: ifnull -> 1280
    //   1243: goto -> 1250
    //   1246: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1249: athrow
    //   1250: aload #8
    //   1252: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1255: invokevirtual getName : ()Ljava/lang/String;
    //   1258: sipush #-776
    //   1261: sipush #5271
    //   1264: invokestatic a : (II)Ljava/lang/String;
    //   1267: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1270: ifne -> 1280
    //   1273: goto -> 1280
    //   1276: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1279: athrow
    //   1280: aload #7
    //   1282: iconst_1
    //   1283: invokevirtual setAccessible : (Z)V
    //   1286: aload #7
    //   1288: aconst_null
    //   1289: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1292: pop
    //   1293: iinc #6, 1
    //   1296: iload_2
    //   1297: ifne -> 1158
    //   1300: sipush #-790
    //   1303: sipush #23905
    //   1306: invokestatic a : (II)Ljava/lang/String;
    //   1309: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1312: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1315: astore #4
    //   1317: aload #4
    //   1319: arraylength
    //   1320: istore #5
    //   1322: iconst_0
    //   1323: istore #6
    //   1325: iload #6
    //   1327: iload #5
    //   1329: if_icmpge -> 1465
    //   1332: aload #4
    //   1334: iload #6
    //   1336: aaload
    //   1337: astore #7
    //   1339: aload #7
    //   1341: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1344: pop
    //   1345: aload #7
    //   1347: invokevirtual getModifiers : ()I
    //   1350: invokestatic isStatic : (I)Z
    //   1353: ifeq -> 1451
    //   1356: aload #7
    //   1358: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1361: arraylength
    //   1362: iconst_2
    //   1363: if_icmpne -> 1451
    //   1366: goto -> 1373
    //   1369: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1372: athrow
    //   1373: aload #7
    //   1375: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1378: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1381: if_acmpne -> 1451
    //   1384: goto -> 1391
    //   1387: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1390: athrow
    //   1391: aload #7
    //   1393: iconst_1
    //   1394: invokevirtual setAccessible : (Z)V
    //   1397: aload #7
    //   1399: aconst_null
    //   1400: iconst_2
    //   1401: anewarray java/lang/Object
    //   1404: dup
    //   1405: iconst_0
    //   1406: aload_0
    //   1407: aastore
    //   1408: dup
    //   1409: iconst_1
    //   1410: aload_1
    //   1411: ifnonnull -> 1429
    //   1414: goto -> 1421
    //   1417: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1420: athrow
    //   1421: aload_1
    //   1422: goto -> 1436
    //   1425: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1428: athrow
    //   1429: aload_1
    //   1430: checkcast [B
    //   1433: invokevirtual clone : ()Ljava/lang/Object;
    //   1436: aastore
    //   1437: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1440: checkcast java/lang/Boolean
    //   1443: invokevirtual booleanValue : ()Z
    //   1446: istore_3
    //   1447: iload_2
    //   1448: ifne -> 1465
    //   1451: iinc #6, 1
    //   1454: iload_2
    //   1455: ifne -> 1325
    //   1458: goto -> 1465
    //   1461: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1464: athrow
    //   1465: iload_2
    //   1466: ifne -> 1807
    //   1469: sipush #-775
    //   1472: sipush #17929
    //   1475: invokestatic a : (II)Ljava/lang/String;
    //   1478: iconst_1
    //   1479: ldc burp/Zez0
    //   1481: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1484: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1487: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1490: astore #4
    //   1492: aload #4
    //   1494: arraylength
    //   1495: istore #5
    //   1497: iconst_0
    //   1498: istore #6
    //   1500: iload #6
    //   1502: iload #5
    //   1504: if_icmpge -> 1642
    //   1507: aload #4
    //   1509: iload #6
    //   1511: aaload
    //   1512: astore #7
    //   1514: aload #7
    //   1516: invokevirtual getModifiers : ()I
    //   1519: invokestatic isStatic : (I)Z
    //   1522: ifne -> 1532
    //   1525: goto -> 1635
    //   1528: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1531: athrow
    //   1532: aload #7
    //   1534: invokevirtual getType : ()Ljava/lang/Class;
    //   1537: astore #8
    //   1539: aload #8
    //   1541: ifnull -> 1622
    //   1544: aload #8
    //   1546: invokevirtual isPrimitive : ()Z
    //   1549: ifne -> 1622
    //   1552: goto -> 1559
    //   1555: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1558: athrow
    //   1559: aload #8
    //   1561: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1564: ifnull -> 1622
    //   1567: goto -> 1574
    //   1570: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1573: athrow
    //   1574: aload #8
    //   1576: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1579: invokevirtual getName : ()Ljava/lang/String;
    //   1582: ifnull -> 1622
    //   1585: goto -> 1592
    //   1588: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1591: athrow
    //   1592: aload #8
    //   1594: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1597: invokevirtual getName : ()Ljava/lang/String;
    //   1600: sipush #-776
    //   1603: sipush #5271
    //   1606: invokestatic a : (II)Ljava/lang/String;
    //   1609: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1612: ifne -> 1622
    //   1615: goto -> 1622
    //   1618: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1621: athrow
    //   1622: aload #7
    //   1624: iconst_1
    //   1625: invokevirtual setAccessible : (Z)V
    //   1628: aload #7
    //   1630: aconst_null
    //   1631: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1634: pop
    //   1635: iinc #6, 1
    //   1638: iload_2
    //   1639: ifne -> 1500
    //   1642: sipush #-783
    //   1645: sipush #-3802
    //   1648: invokestatic a : (II)Ljava/lang/String;
    //   1651: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1654: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1657: astore #4
    //   1659: aload #4
    //   1661: arraylength
    //   1662: istore #5
    //   1664: iconst_0
    //   1665: istore #6
    //   1667: iload #6
    //   1669: iload #5
    //   1671: if_icmpge -> 1807
    //   1674: aload #4
    //   1676: iload #6
    //   1678: aaload
    //   1679: astore #7
    //   1681: aload #7
    //   1683: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1686: pop
    //   1687: aload #7
    //   1689: invokevirtual getModifiers : ()I
    //   1692: invokestatic isStatic : (I)Z
    //   1695: ifeq -> 1793
    //   1698: aload #7
    //   1700: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1703: arraylength
    //   1704: iconst_2
    //   1705: if_icmpne -> 1793
    //   1708: goto -> 1715
    //   1711: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1714: athrow
    //   1715: aload #7
    //   1717: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1720: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1723: if_acmpne -> 1793
    //   1726: goto -> 1733
    //   1729: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1732: athrow
    //   1733: aload #7
    //   1735: iconst_1
    //   1736: invokevirtual setAccessible : (Z)V
    //   1739: aload #7
    //   1741: aconst_null
    //   1742: iconst_2
    //   1743: anewarray java/lang/Object
    //   1746: dup
    //   1747: iconst_0
    //   1748: aload_0
    //   1749: aastore
    //   1750: dup
    //   1751: iconst_1
    //   1752: aload_1
    //   1753: ifnonnull -> 1771
    //   1756: goto -> 1763
    //   1759: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1762: athrow
    //   1763: aload_1
    //   1764: goto -> 1778
    //   1767: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1770: athrow
    //   1771: aload_1
    //   1772: checkcast [B
    //   1775: invokevirtual clone : ()Ljava/lang/Object;
    //   1778: aastore
    //   1779: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1782: checkcast java/lang/Boolean
    //   1785: invokevirtual booleanValue : ()Z
    //   1788: istore_3
    //   1789: iload_2
    //   1790: ifne -> 1807
    //   1793: iinc #6, 1
    //   1796: iload_2
    //   1797: ifne -> 1667
    //   1800: goto -> 1807
    //   1803: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1806: athrow
    //   1807: iload_3
    //   1808: ifeq -> 1813
    //   1811: iload_3
    //   1812: ireturn
    //   1813: getstatic burp/Zrcy.Zq : Ljava/lang/String;
    //   1816: getstatic burp/Zrcy.Zr : Ljava/lang/Object;
    //   1819: checkcast java/math/BigInteger
    //   1822: invokevirtual intValue : ()I
    //   1825: bipush #32
    //   1827: irem
    //   1828: invokestatic abs : (I)I
    //   1831: invokevirtual charAt : (I)C
    //   1834: getstatic burp/Zmx6.ZG : Ljava/lang/String;
    //   1837: getstatic burp/Zel.ZB : Ljava/lang/Object;
    //   1840: checkcast java/math/BigInteger
    //   1843: invokevirtual intValue : ()I
    //   1846: bipush #32
    //   1848: irem
    //   1849: invokestatic abs : (I)I
    //   1852: invokevirtual charAt : (I)C
    //   1855: if_icmpgt -> 2200
    //   1858: sipush #-800
    //   1861: sipush #-29333
    //   1864: invokestatic a : (II)Ljava/lang/String;
    //   1867: iconst_1
    //   1868: ldc burp/Zsdn
    //   1870: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1873: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1876: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1879: astore #4
    //   1881: aload #4
    //   1883: arraylength
    //   1884: istore #5
    //   1886: iconst_0
    //   1887: istore #6
    //   1889: iload #6
    //   1891: iload #5
    //   1893: if_icmpge -> 2031
    //   1896: aload #4
    //   1898: iload #6
    //   1900: aaload
    //   1901: astore #7
    //   1903: aload #7
    //   1905: invokevirtual getModifiers : ()I
    //   1908: invokestatic isStatic : (I)Z
    //   1911: ifne -> 1921
    //   1914: goto -> 2024
    //   1917: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1920: athrow
    //   1921: aload #7
    //   1923: invokevirtual getType : ()Ljava/lang/Class;
    //   1926: astore #8
    //   1928: aload #8
    //   1930: ifnull -> 2011
    //   1933: aload #8
    //   1935: invokevirtual isPrimitive : ()Z
    //   1938: ifne -> 2011
    //   1941: goto -> 1948
    //   1944: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1947: athrow
    //   1948: aload #8
    //   1950: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1953: ifnull -> 2011
    //   1956: goto -> 1963
    //   1959: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1962: athrow
    //   1963: aload #8
    //   1965: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1968: invokevirtual getName : ()Ljava/lang/String;
    //   1971: ifnull -> 2011
    //   1974: goto -> 1981
    //   1977: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1980: athrow
    //   1981: aload #8
    //   1983: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1986: invokevirtual getName : ()Ljava/lang/String;
    //   1989: sipush #-776
    //   1992: sipush #5271
    //   1995: invokestatic a : (II)Ljava/lang/String;
    //   1998: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2001: ifne -> 2011
    //   2004: goto -> 2011
    //   2007: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2010: athrow
    //   2011: aload #7
    //   2013: iconst_1
    //   2014: invokevirtual setAccessible : (Z)V
    //   2017: aload #7
    //   2019: aconst_null
    //   2020: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2023: pop
    //   2024: iinc #6, 1
    //   2027: iload_2
    //   2028: ifne -> 1889
    //   2031: sipush #-772
    //   2034: sipush #-17325
    //   2037: invokestatic a : (II)Ljava/lang/String;
    //   2040: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2043: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2046: astore #4
    //   2048: aload #4
    //   2050: arraylength
    //   2051: istore #5
    //   2053: iconst_0
    //   2054: istore #6
    //   2056: iload #6
    //   2058: iload #5
    //   2060: if_icmpge -> 2196
    //   2063: aload #4
    //   2065: iload #6
    //   2067: aaload
    //   2068: astore #7
    //   2070: aload #7
    //   2072: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2075: pop
    //   2076: aload #7
    //   2078: invokevirtual getModifiers : ()I
    //   2081: invokestatic isStatic : (I)Z
    //   2084: ifeq -> 2182
    //   2087: aload #7
    //   2089: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2092: arraylength
    //   2093: iconst_2
    //   2094: if_icmpne -> 2182
    //   2097: goto -> 2104
    //   2100: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2103: athrow
    //   2104: aload #7
    //   2106: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2109: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2112: if_acmpne -> 2182
    //   2115: goto -> 2122
    //   2118: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2121: athrow
    //   2122: aload #7
    //   2124: iconst_1
    //   2125: invokevirtual setAccessible : (Z)V
    //   2128: aload #7
    //   2130: aconst_null
    //   2131: iconst_2
    //   2132: anewarray java/lang/Object
    //   2135: dup
    //   2136: iconst_0
    //   2137: aload_0
    //   2138: aastore
    //   2139: dup
    //   2140: iconst_1
    //   2141: aload_1
    //   2142: ifnonnull -> 2160
    //   2145: goto -> 2152
    //   2148: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2151: athrow
    //   2152: aload_1
    //   2153: goto -> 2167
    //   2156: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2159: athrow
    //   2160: aload_1
    //   2161: checkcast [B
    //   2164: invokevirtual clone : ()Ljava/lang/Object;
    //   2167: aastore
    //   2168: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2171: checkcast java/lang/Boolean
    //   2174: invokevirtual booleanValue : ()Z
    //   2177: istore_3
    //   2178: iload_2
    //   2179: ifne -> 2196
    //   2182: iinc #6, 1
    //   2185: iload_2
    //   2186: ifne -> 2056
    //   2189: goto -> 2196
    //   2192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2195: athrow
    //   2196: iload_2
    //   2197: ifne -> 2538
    //   2200: sipush #-782
    //   2203: sipush #26164
    //   2206: invokestatic a : (II)Ljava/lang/String;
    //   2209: iconst_1
    //   2210: ldc burp/Zk7b
    //   2212: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2215: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2218: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2221: astore #4
    //   2223: aload #4
    //   2225: arraylength
    //   2226: istore #5
    //   2228: iconst_0
    //   2229: istore #6
    //   2231: iload #6
    //   2233: iload #5
    //   2235: if_icmpge -> 2373
    //   2238: aload #4
    //   2240: iload #6
    //   2242: aaload
    //   2243: astore #7
    //   2245: aload #7
    //   2247: invokevirtual getModifiers : ()I
    //   2250: invokestatic isStatic : (I)Z
    //   2253: ifne -> 2263
    //   2256: goto -> 2366
    //   2259: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2262: athrow
    //   2263: aload #7
    //   2265: invokevirtual getType : ()Ljava/lang/Class;
    //   2268: astore #8
    //   2270: aload #8
    //   2272: ifnull -> 2353
    //   2275: aload #8
    //   2277: invokevirtual isPrimitive : ()Z
    //   2280: ifne -> 2353
    //   2283: goto -> 2290
    //   2286: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2289: athrow
    //   2290: aload #8
    //   2292: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2295: ifnull -> 2353
    //   2298: goto -> 2305
    //   2301: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2304: athrow
    //   2305: aload #8
    //   2307: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2310: invokevirtual getName : ()Ljava/lang/String;
    //   2313: ifnull -> 2353
    //   2316: goto -> 2323
    //   2319: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2322: athrow
    //   2323: aload #8
    //   2325: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2328: invokevirtual getName : ()Ljava/lang/String;
    //   2331: sipush #-776
    //   2334: sipush #5271
    //   2337: invokestatic a : (II)Ljava/lang/String;
    //   2340: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2343: ifne -> 2353
    //   2346: goto -> 2353
    //   2349: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2352: athrow
    //   2353: aload #7
    //   2355: iconst_1
    //   2356: invokevirtual setAccessible : (Z)V
    //   2359: aload #7
    //   2361: aconst_null
    //   2362: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2365: pop
    //   2366: iinc #6, 1
    //   2369: iload_2
    //   2370: ifne -> 2231
    //   2373: sipush #-799
    //   2376: sipush #-23030
    //   2379: invokestatic a : (II)Ljava/lang/String;
    //   2382: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2385: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2388: astore #4
    //   2390: aload #4
    //   2392: arraylength
    //   2393: istore #5
    //   2395: iconst_0
    //   2396: istore #6
    //   2398: iload #6
    //   2400: iload #5
    //   2402: if_icmpge -> 2538
    //   2405: aload #4
    //   2407: iload #6
    //   2409: aaload
    //   2410: astore #7
    //   2412: aload #7
    //   2414: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2417: pop
    //   2418: aload #7
    //   2420: invokevirtual getModifiers : ()I
    //   2423: invokestatic isStatic : (I)Z
    //   2426: ifeq -> 2524
    //   2429: aload #7
    //   2431: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2434: arraylength
    //   2435: iconst_2
    //   2436: if_icmpne -> 2524
    //   2439: goto -> 2446
    //   2442: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2445: athrow
    //   2446: aload #7
    //   2448: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2451: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2454: if_acmpne -> 2524
    //   2457: goto -> 2464
    //   2460: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2463: athrow
    //   2464: aload #7
    //   2466: iconst_1
    //   2467: invokevirtual setAccessible : (Z)V
    //   2470: aload #7
    //   2472: aconst_null
    //   2473: iconst_2
    //   2474: anewarray java/lang/Object
    //   2477: dup
    //   2478: iconst_0
    //   2479: aload_0
    //   2480: aastore
    //   2481: dup
    //   2482: iconst_1
    //   2483: aload_1
    //   2484: ifnonnull -> 2502
    //   2487: goto -> 2494
    //   2490: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2493: athrow
    //   2494: aload_1
    //   2495: goto -> 2509
    //   2498: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2501: athrow
    //   2502: aload_1
    //   2503: checkcast [B
    //   2506: invokevirtual clone : ()Ljava/lang/Object;
    //   2509: aastore
    //   2510: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2513: checkcast java/lang/Boolean
    //   2516: invokevirtual booleanValue : ()Z
    //   2519: istore_3
    //   2520: iload_2
    //   2521: ifne -> 2538
    //   2524: iinc #6, 1
    //   2527: iload_2
    //   2528: ifne -> 2398
    //   2531: goto -> 2538
    //   2534: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2537: athrow
    //   2538: iload_3
    //   2539: ifeq -> 2544
    //   2542: iload_3
    //   2543: ireturn
    //   2544: getstatic burp/Zzmw.Zd : Ljava/lang/String;
    //   2547: getstatic burp/Zxjk.Zk : Ljava/lang/Object;
    //   2550: checkcast java/math/BigInteger
    //   2553: invokevirtual intValue : ()I
    //   2556: bipush #32
    //   2558: irem
    //   2559: invokestatic abs : (I)I
    //   2562: invokevirtual charAt : (I)C
    //   2565: getstatic burp/Ze54.ZU : Ljava/lang/String;
    //   2568: getstatic burp/Zmsn.Zk : Ljava/lang/Object;
    //   2571: checkcast java/math/BigInteger
    //   2574: invokevirtual intValue : ()I
    //   2577: bipush #32
    //   2579: irem
    //   2580: invokestatic abs : (I)I
    //   2583: invokevirtual charAt : (I)C
    //   2586: if_icmple -> 2931
    //   2589: sipush #-778
    //   2592: sipush #-1260
    //   2595: invokestatic a : (II)Ljava/lang/String;
    //   2598: iconst_1
    //   2599: ldc burp/Zx54
    //   2601: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2604: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2607: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2610: astore #4
    //   2612: aload #4
    //   2614: arraylength
    //   2615: istore #5
    //   2617: iconst_0
    //   2618: istore #6
    //   2620: iload #6
    //   2622: iload #5
    //   2624: if_icmpge -> 2762
    //   2627: aload #4
    //   2629: iload #6
    //   2631: aaload
    //   2632: astore #7
    //   2634: aload #7
    //   2636: invokevirtual getModifiers : ()I
    //   2639: invokestatic isStatic : (I)Z
    //   2642: ifne -> 2652
    //   2645: goto -> 2755
    //   2648: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2651: athrow
    //   2652: aload #7
    //   2654: invokevirtual getType : ()Ljava/lang/Class;
    //   2657: astore #8
    //   2659: aload #8
    //   2661: ifnull -> 2742
    //   2664: aload #8
    //   2666: invokevirtual isPrimitive : ()Z
    //   2669: ifne -> 2742
    //   2672: goto -> 2679
    //   2675: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2678: athrow
    //   2679: aload #8
    //   2681: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2684: ifnull -> 2742
    //   2687: goto -> 2694
    //   2690: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2693: athrow
    //   2694: aload #8
    //   2696: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2699: invokevirtual getName : ()Ljava/lang/String;
    //   2702: ifnull -> 2742
    //   2705: goto -> 2712
    //   2708: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2711: athrow
    //   2712: aload #8
    //   2714: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2717: invokevirtual getName : ()Ljava/lang/String;
    //   2720: sipush #-776
    //   2723: sipush #5271
    //   2726: invokestatic a : (II)Ljava/lang/String;
    //   2729: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2732: ifne -> 2742
    //   2735: goto -> 2742
    //   2738: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2741: athrow
    //   2742: aload #7
    //   2744: iconst_1
    //   2745: invokevirtual setAccessible : (Z)V
    //   2748: aload #7
    //   2750: aconst_null
    //   2751: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2754: pop
    //   2755: iinc #6, 1
    //   2758: iload_2
    //   2759: ifne -> 2620
    //   2762: sipush #-771
    //   2765: sipush #1477
    //   2768: invokestatic a : (II)Ljava/lang/String;
    //   2771: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2774: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2777: astore #4
    //   2779: aload #4
    //   2781: arraylength
    //   2782: istore #5
    //   2784: iconst_0
    //   2785: istore #6
    //   2787: iload #6
    //   2789: iload #5
    //   2791: if_icmpge -> 2927
    //   2794: aload #4
    //   2796: iload #6
    //   2798: aaload
    //   2799: astore #7
    //   2801: aload #7
    //   2803: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2806: pop
    //   2807: aload #7
    //   2809: invokevirtual getModifiers : ()I
    //   2812: invokestatic isStatic : (I)Z
    //   2815: ifeq -> 2913
    //   2818: aload #7
    //   2820: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2823: arraylength
    //   2824: iconst_2
    //   2825: if_icmpne -> 2913
    //   2828: goto -> 2835
    //   2831: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2834: athrow
    //   2835: aload #7
    //   2837: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2840: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2843: if_acmpne -> 2913
    //   2846: goto -> 2853
    //   2849: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2852: athrow
    //   2853: aload #7
    //   2855: iconst_1
    //   2856: invokevirtual setAccessible : (Z)V
    //   2859: aload #7
    //   2861: aconst_null
    //   2862: iconst_2
    //   2863: anewarray java/lang/Object
    //   2866: dup
    //   2867: iconst_0
    //   2868: aload_0
    //   2869: aastore
    //   2870: dup
    //   2871: iconst_1
    //   2872: aload_1
    //   2873: ifnonnull -> 2891
    //   2876: goto -> 2883
    //   2879: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2882: athrow
    //   2883: aload_1
    //   2884: goto -> 2898
    //   2887: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2890: athrow
    //   2891: aload_1
    //   2892: checkcast [B
    //   2895: invokevirtual clone : ()Ljava/lang/Object;
    //   2898: aastore
    //   2899: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2902: checkcast java/lang/Boolean
    //   2905: invokevirtual booleanValue : ()Z
    //   2908: istore_3
    //   2909: iload_2
    //   2910: ifne -> 2927
    //   2913: iinc #6, 1
    //   2916: iload_2
    //   2917: ifne -> 2787
    //   2920: goto -> 2927
    //   2923: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2926: athrow
    //   2927: iload_2
    //   2928: ifne -> 3269
    //   2931: sipush #-788
    //   2934: sipush #20060
    //   2937: invokestatic a : (II)Ljava/lang/String;
    //   2940: iconst_1
    //   2941: ldc burp/Zkk2
    //   2943: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2946: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2949: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2952: astore #4
    //   2954: aload #4
    //   2956: arraylength
    //   2957: istore #5
    //   2959: iconst_0
    //   2960: istore #6
    //   2962: iload #6
    //   2964: iload #5
    //   2966: if_icmpge -> 3104
    //   2969: aload #4
    //   2971: iload #6
    //   2973: aaload
    //   2974: astore #7
    //   2976: aload #7
    //   2978: invokevirtual getModifiers : ()I
    //   2981: invokestatic isStatic : (I)Z
    //   2984: ifne -> 2994
    //   2987: goto -> 3097
    //   2990: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2993: athrow
    //   2994: aload #7
    //   2996: invokevirtual getType : ()Ljava/lang/Class;
    //   2999: astore #8
    //   3001: aload #8
    //   3003: ifnull -> 3084
    //   3006: aload #8
    //   3008: invokevirtual isPrimitive : ()Z
    //   3011: ifne -> 3084
    //   3014: goto -> 3021
    //   3017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3020: athrow
    //   3021: aload #8
    //   3023: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3026: ifnull -> 3084
    //   3029: goto -> 3036
    //   3032: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3035: athrow
    //   3036: aload #8
    //   3038: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3041: invokevirtual getName : ()Ljava/lang/String;
    //   3044: ifnull -> 3084
    //   3047: goto -> 3054
    //   3050: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3053: athrow
    //   3054: aload #8
    //   3056: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3059: invokevirtual getName : ()Ljava/lang/String;
    //   3062: sipush #-776
    //   3065: sipush #5271
    //   3068: invokestatic a : (II)Ljava/lang/String;
    //   3071: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3074: ifne -> 3084
    //   3077: goto -> 3084
    //   3080: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3083: athrow
    //   3084: aload #7
    //   3086: iconst_1
    //   3087: invokevirtual setAccessible : (Z)V
    //   3090: aload #7
    //   3092: aconst_null
    //   3093: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3096: pop
    //   3097: iinc #6, 1
    //   3100: iload_2
    //   3101: ifne -> 2962
    //   3104: sipush #-777
    //   3107: sipush #-16842
    //   3110: invokestatic a : (II)Ljava/lang/String;
    //   3113: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3116: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3119: astore #4
    //   3121: aload #4
    //   3123: arraylength
    //   3124: istore #5
    //   3126: iconst_0
    //   3127: istore #6
    //   3129: iload #6
    //   3131: iload #5
    //   3133: if_icmpge -> 3269
    //   3136: aload #4
    //   3138: iload #6
    //   3140: aaload
    //   3141: astore #7
    //   3143: aload #7
    //   3145: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3148: pop
    //   3149: aload #7
    //   3151: invokevirtual getModifiers : ()I
    //   3154: invokestatic isStatic : (I)Z
    //   3157: ifeq -> 3255
    //   3160: aload #7
    //   3162: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3165: arraylength
    //   3166: iconst_2
    //   3167: if_icmpne -> 3255
    //   3170: goto -> 3177
    //   3173: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3176: athrow
    //   3177: aload #7
    //   3179: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3182: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3185: if_acmpne -> 3255
    //   3188: goto -> 3195
    //   3191: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3194: athrow
    //   3195: aload #7
    //   3197: iconst_1
    //   3198: invokevirtual setAccessible : (Z)V
    //   3201: aload #7
    //   3203: aconst_null
    //   3204: iconst_2
    //   3205: anewarray java/lang/Object
    //   3208: dup
    //   3209: iconst_0
    //   3210: aload_0
    //   3211: aastore
    //   3212: dup
    //   3213: iconst_1
    //   3214: aload_1
    //   3215: ifnonnull -> 3233
    //   3218: goto -> 3225
    //   3221: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3224: athrow
    //   3225: aload_1
    //   3226: goto -> 3240
    //   3229: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3232: athrow
    //   3233: aload_1
    //   3234: checkcast [B
    //   3237: invokevirtual clone : ()Ljava/lang/Object;
    //   3240: aastore
    //   3241: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3244: checkcast java/lang/Boolean
    //   3247: invokevirtual booleanValue : ()Z
    //   3250: istore_3
    //   3251: iload_2
    //   3252: ifne -> 3269
    //   3255: iinc #6, 1
    //   3258: iload_2
    //   3259: ifne -> 3129
    //   3262: goto -> 3269
    //   3265: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3268: athrow
    //   3269: iload_3
    //   3270: ifeq -> 3275
    //   3273: iload_3
    //   3274: ireturn
    //   3275: getstatic burp/Zl8f.ZK : Ljava/lang/String;
    //   3278: getstatic burp/Zl39.ZA : Ljava/lang/Object;
    //   3281: checkcast java/math/BigInteger
    //   3284: invokevirtual intValue : ()I
    //   3287: bipush #32
    //   3289: irem
    //   3290: invokestatic abs : (I)I
    //   3293: invokevirtual charAt : (I)C
    //   3296: getstatic burp/Zztk.Zf : Ljava/lang/String;
    //   3299: getstatic burp/Zs2n.ZK : Ljava/lang/Object;
    //   3302: checkcast java/math/BigInteger
    //   3305: invokevirtual intValue : ()I
    //   3308: bipush #32
    //   3310: irem
    //   3311: invokestatic abs : (I)I
    //   3314: invokevirtual charAt : (I)C
    //   3317: if_icmple -> 3662
    //   3320: sipush #-796
    //   3323: sipush #-10578
    //   3326: invokestatic a : (II)Ljava/lang/String;
    //   3329: iconst_1
    //   3330: ldc burp/Zrj3
    //   3332: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3335: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3338: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3341: astore #4
    //   3343: aload #4
    //   3345: arraylength
    //   3346: istore #5
    //   3348: iconst_0
    //   3349: istore #6
    //   3351: iload #6
    //   3353: iload #5
    //   3355: if_icmpge -> 3493
    //   3358: aload #4
    //   3360: iload #6
    //   3362: aaload
    //   3363: astore #7
    //   3365: aload #7
    //   3367: invokevirtual getModifiers : ()I
    //   3370: invokestatic isStatic : (I)Z
    //   3373: ifne -> 3383
    //   3376: goto -> 3486
    //   3379: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3382: athrow
    //   3383: aload #7
    //   3385: invokevirtual getType : ()Ljava/lang/Class;
    //   3388: astore #8
    //   3390: aload #8
    //   3392: ifnull -> 3473
    //   3395: aload #8
    //   3397: invokevirtual isPrimitive : ()Z
    //   3400: ifne -> 3473
    //   3403: goto -> 3410
    //   3406: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3409: athrow
    //   3410: aload #8
    //   3412: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3415: ifnull -> 3473
    //   3418: goto -> 3425
    //   3421: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3424: athrow
    //   3425: aload #8
    //   3427: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3430: invokevirtual getName : ()Ljava/lang/String;
    //   3433: ifnull -> 3473
    //   3436: goto -> 3443
    //   3439: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3442: athrow
    //   3443: aload #8
    //   3445: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3448: invokevirtual getName : ()Ljava/lang/String;
    //   3451: sipush #-776
    //   3454: sipush #5271
    //   3457: invokestatic a : (II)Ljava/lang/String;
    //   3460: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3463: ifne -> 3473
    //   3466: goto -> 3473
    //   3469: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3472: athrow
    //   3473: aload #7
    //   3475: iconst_1
    //   3476: invokevirtual setAccessible : (Z)V
    //   3479: aload #7
    //   3481: aconst_null
    //   3482: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3485: pop
    //   3486: iinc #6, 1
    //   3489: iload_2
    //   3490: ifne -> 3351
    //   3493: sipush #-789
    //   3496: sipush #20692
    //   3499: invokestatic a : (II)Ljava/lang/String;
    //   3502: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3505: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3508: astore #4
    //   3510: aload #4
    //   3512: arraylength
    //   3513: istore #5
    //   3515: iconst_0
    //   3516: istore #6
    //   3518: iload #6
    //   3520: iload #5
    //   3522: if_icmpge -> 3658
    //   3525: aload #4
    //   3527: iload #6
    //   3529: aaload
    //   3530: astore #7
    //   3532: aload #7
    //   3534: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3537: pop
    //   3538: aload #7
    //   3540: invokevirtual getModifiers : ()I
    //   3543: invokestatic isStatic : (I)Z
    //   3546: ifeq -> 3644
    //   3549: aload #7
    //   3551: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3554: arraylength
    //   3555: iconst_2
    //   3556: if_icmpne -> 3644
    //   3559: goto -> 3566
    //   3562: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3565: athrow
    //   3566: aload #7
    //   3568: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3571: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3574: if_acmpne -> 3644
    //   3577: goto -> 3584
    //   3580: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3583: athrow
    //   3584: aload #7
    //   3586: iconst_1
    //   3587: invokevirtual setAccessible : (Z)V
    //   3590: aload #7
    //   3592: aconst_null
    //   3593: iconst_2
    //   3594: anewarray java/lang/Object
    //   3597: dup
    //   3598: iconst_0
    //   3599: aload_0
    //   3600: aastore
    //   3601: dup
    //   3602: iconst_1
    //   3603: aload_1
    //   3604: ifnonnull -> 3622
    //   3607: goto -> 3614
    //   3610: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3613: athrow
    //   3614: aload_1
    //   3615: goto -> 3629
    //   3618: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3621: athrow
    //   3622: aload_1
    //   3623: checkcast [B
    //   3626: invokevirtual clone : ()Ljava/lang/Object;
    //   3629: aastore
    //   3630: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3633: checkcast java/lang/Boolean
    //   3636: invokevirtual booleanValue : ()Z
    //   3639: istore_3
    //   3640: iload_2
    //   3641: ifne -> 3658
    //   3644: iinc #6, 1
    //   3647: iload_2
    //   3648: ifne -> 3518
    //   3651: goto -> 3658
    //   3654: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3657: athrow
    //   3658: iload_2
    //   3659: ifne -> 4000
    //   3662: sipush #-798
    //   3665: sipush #-21298
    //   3668: invokestatic a : (II)Ljava/lang/String;
    //   3671: iconst_1
    //   3672: ldc burp/Zl15
    //   3674: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3677: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3680: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3683: astore #4
    //   3685: aload #4
    //   3687: arraylength
    //   3688: istore #5
    //   3690: iconst_0
    //   3691: istore #6
    //   3693: iload #6
    //   3695: iload #5
    //   3697: if_icmpge -> 3835
    //   3700: aload #4
    //   3702: iload #6
    //   3704: aaload
    //   3705: astore #7
    //   3707: aload #7
    //   3709: invokevirtual getModifiers : ()I
    //   3712: invokestatic isStatic : (I)Z
    //   3715: ifne -> 3725
    //   3718: goto -> 3828
    //   3721: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3724: athrow
    //   3725: aload #7
    //   3727: invokevirtual getType : ()Ljava/lang/Class;
    //   3730: astore #8
    //   3732: aload #8
    //   3734: ifnull -> 3815
    //   3737: aload #8
    //   3739: invokevirtual isPrimitive : ()Z
    //   3742: ifne -> 3815
    //   3745: goto -> 3752
    //   3748: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3751: athrow
    //   3752: aload #8
    //   3754: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3757: ifnull -> 3815
    //   3760: goto -> 3767
    //   3763: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3766: athrow
    //   3767: aload #8
    //   3769: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3772: invokevirtual getName : ()Ljava/lang/String;
    //   3775: ifnull -> 3815
    //   3778: goto -> 3785
    //   3781: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3784: athrow
    //   3785: aload #8
    //   3787: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3790: invokevirtual getName : ()Ljava/lang/String;
    //   3793: sipush #-776
    //   3796: sipush #5271
    //   3799: invokestatic a : (II)Ljava/lang/String;
    //   3802: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3805: ifne -> 3815
    //   3808: goto -> 3815
    //   3811: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3814: athrow
    //   3815: aload #7
    //   3817: iconst_1
    //   3818: invokevirtual setAccessible : (Z)V
    //   3821: aload #7
    //   3823: aconst_null
    //   3824: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3827: pop
    //   3828: iinc #6, 1
    //   3831: iload_2
    //   3832: ifne -> 3693
    //   3835: sipush #-779
    //   3838: sipush #23918
    //   3841: invokestatic a : (II)Ljava/lang/String;
    //   3844: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3847: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3850: astore #4
    //   3852: aload #4
    //   3854: arraylength
    //   3855: istore #5
    //   3857: iconst_0
    //   3858: istore #6
    //   3860: iload #6
    //   3862: iload #5
    //   3864: if_icmpge -> 4000
    //   3867: aload #4
    //   3869: iload #6
    //   3871: aaload
    //   3872: astore #7
    //   3874: aload #7
    //   3876: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3879: pop
    //   3880: aload #7
    //   3882: invokevirtual getModifiers : ()I
    //   3885: invokestatic isStatic : (I)Z
    //   3888: ifeq -> 3986
    //   3891: aload #7
    //   3893: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3896: arraylength
    //   3897: iconst_2
    //   3898: if_icmpne -> 3986
    //   3901: goto -> 3908
    //   3904: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3907: athrow
    //   3908: aload #7
    //   3910: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3913: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3916: if_acmpne -> 3986
    //   3919: goto -> 3926
    //   3922: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3925: athrow
    //   3926: aload #7
    //   3928: iconst_1
    //   3929: invokevirtual setAccessible : (Z)V
    //   3932: aload #7
    //   3934: aconst_null
    //   3935: iconst_2
    //   3936: anewarray java/lang/Object
    //   3939: dup
    //   3940: iconst_0
    //   3941: aload_0
    //   3942: aastore
    //   3943: dup
    //   3944: iconst_1
    //   3945: aload_1
    //   3946: ifnonnull -> 3964
    //   3949: goto -> 3956
    //   3952: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3955: athrow
    //   3956: aload_1
    //   3957: goto -> 3971
    //   3960: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3963: athrow
    //   3964: aload_1
    //   3965: checkcast [B
    //   3968: invokevirtual clone : ()Ljava/lang/Object;
    //   3971: aastore
    //   3972: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3975: checkcast java/lang/Boolean
    //   3978: invokevirtual booleanValue : ()Z
    //   3981: istore_3
    //   3982: iload_2
    //   3983: ifne -> 4000
    //   3986: iinc #6, 1
    //   3989: iload_2
    //   3990: ifne -> 3860
    //   3993: goto -> 4000
    //   3996: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3999: athrow
    //   4000: iload_3
    //   4001: ireturn
    //   4002: astore_3
    //   4003: new java/lang/Exception
    //   4006: dup
    //   4007: aload_3
    //   4008: invokevirtual getMessage : ()Ljava/lang/String;
    //   4011: invokespecial <init> : (Ljava/lang/String;)V
    //   4014: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1081	4002	java/lang/Throwable
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
    //   950	977	980	java/lang/Throwable
    //   967	995	998	java/lang/Throwable
    //   984	1025	1028	java/lang/Throwable
    //   1002	1036	1036	java/lang/Throwable
    //   1058	1069	1072	java/lang/Throwable
    //   1082	1812	4002	java/lang/Throwable
    //   1172	1186	1186	java/lang/Throwable
    //   1197	1210	1213	java/lang/Throwable
    //   1202	1225	1228	java/lang/Throwable
    //   1217	1243	1246	java/lang/Throwable
    //   1232	1273	1276	java/lang/Throwable
    //   1339	1366	1369	java/lang/Throwable
    //   1356	1384	1387	java/lang/Throwable
    //   1373	1414	1417	java/lang/Throwable
    //   1391	1425	1425	java/lang/Throwable
    //   1447	1458	1461	java/lang/Throwable
    //   1514	1528	1528	java/lang/Throwable
    //   1539	1552	1555	java/lang/Throwable
    //   1544	1567	1570	java/lang/Throwable
    //   1559	1585	1588	java/lang/Throwable
    //   1574	1615	1618	java/lang/Throwable
    //   1681	1708	1711	java/lang/Throwable
    //   1698	1726	1729	java/lang/Throwable
    //   1715	1756	1759	java/lang/Throwable
    //   1733	1767	1767	java/lang/Throwable
    //   1789	1800	1803	java/lang/Throwable
    //   1813	2543	4002	java/lang/Throwable
    //   1903	1917	1917	java/lang/Throwable
    //   1928	1941	1944	java/lang/Throwable
    //   1933	1956	1959	java/lang/Throwable
    //   1948	1974	1977	java/lang/Throwable
    //   1963	2004	2007	java/lang/Throwable
    //   2070	2097	2100	java/lang/Throwable
    //   2087	2115	2118	java/lang/Throwable
    //   2104	2145	2148	java/lang/Throwable
    //   2122	2156	2156	java/lang/Throwable
    //   2178	2189	2192	java/lang/Throwable
    //   2245	2259	2259	java/lang/Throwable
    //   2270	2283	2286	java/lang/Throwable
    //   2275	2298	2301	java/lang/Throwable
    //   2290	2316	2319	java/lang/Throwable
    //   2305	2346	2349	java/lang/Throwable
    //   2412	2439	2442	java/lang/Throwable
    //   2429	2457	2460	java/lang/Throwable
    //   2446	2487	2490	java/lang/Throwable
    //   2464	2498	2498	java/lang/Throwable
    //   2520	2531	2534	java/lang/Throwable
    //   2544	3274	4002	java/lang/Throwable
    //   2634	2648	2648	java/lang/Throwable
    //   2659	2672	2675	java/lang/Throwable
    //   2664	2687	2690	java/lang/Throwable
    //   2679	2705	2708	java/lang/Throwable
    //   2694	2735	2738	java/lang/Throwable
    //   2801	2828	2831	java/lang/Throwable
    //   2818	2846	2849	java/lang/Throwable
    //   2835	2876	2879	java/lang/Throwable
    //   2853	2887	2887	java/lang/Throwable
    //   2909	2920	2923	java/lang/Throwable
    //   2976	2990	2990	java/lang/Throwable
    //   3001	3014	3017	java/lang/Throwable
    //   3006	3029	3032	java/lang/Throwable
    //   3021	3047	3050	java/lang/Throwable
    //   3036	3077	3080	java/lang/Throwable
    //   3143	3170	3173	java/lang/Throwable
    //   3160	3188	3191	java/lang/Throwable
    //   3177	3218	3221	java/lang/Throwable
    //   3195	3229	3229	java/lang/Throwable
    //   3251	3262	3265	java/lang/Throwable
    //   3275	4001	4002	java/lang/Throwable
    //   3365	3379	3379	java/lang/Throwable
    //   3390	3403	3406	java/lang/Throwable
    //   3395	3418	3421	java/lang/Throwable
    //   3410	3436	3439	java/lang/Throwable
    //   3425	3466	3469	java/lang/Throwable
    //   3532	3559	3562	java/lang/Throwable
    //   3549	3577	3580	java/lang/Throwable
    //   3566	3607	3610	java/lang/Throwable
    //   3584	3618	3618	java/lang/Throwable
    //   3640	3651	3654	java/lang/Throwable
    //   3707	3721	3721	java/lang/Throwable
    //   3732	3745	3748	java/lang/Throwable
    //   3737	3760	3763	java/lang/Throwable
    //   3752	3778	3781	java/lang/Throwable
    //   3767	3808	3811	java/lang/Throwable
    //   3874	3901	3904	java/lang/Throwable
    //   3891	3919	3922	java/lang/Throwable
    //   3908	3949	3952	java/lang/Throwable
    //   3926	3960	3960	java/lang/Throwable
    //   3982	3993	3996	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #30
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '5¦ª½Sù=e\\tÊ}UÆä<À\\t mI1{f\\tMÚ¥2ú¢Ë\\b±\\tÿ\óâ0¸\\t»Î{°!ò²À\\tI%jê©Ñrê\\t¿¹÷²ô£É.5¬\\tgHà`RèÃMô+õHXâH¬ÏºC¢ÁxÊòùÿx7qÜeþ­îùKcéÔ<Êes Ú4X|ï,±´Ç³àäuá v¤e@]a²âr\\t52ª/ùwe\\ty#8*ãÀ+ù\\t#=\\réE±ïæ\\tyýË"tü\\tOÖå³òÜ\Ö\\t.fÉ¥wPk]\\tá0H»t\\tÐs­#Xñ@Äñ\\t³ñzW¢ ?$JØóþþÆ/äßE¦vËL0 þ§þ¾¥[J\\t\\tÃ-ëÆöÐäMí\\fl#µ Ëèc±ÎxÎ»ló©{Mà÷N~ÌãÕ.HæzAo;6"±$Ìæ5Hô'Â1³VvÅÜoòFsuf ¤$üÔsUV@ewf8KæeaÉøN]Ó¬N¹\\tµjº$`¡y\\t3EjÁÜý\\tÃtËÀá'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #98
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
    //   68: ldc '®ò2Üã/R\\t/GgMãÞÆà'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #76
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
    //   129: putstatic burp/Zex.a : [Ljava/lang/String;
    //   132: bipush #30
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zex.b : [Ljava/lang/String;
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
    //   212: bipush #99
    //   214: goto -> 244
    //   217: bipush #30
    //   219: goto -> 244
    //   222: bipush #18
    //   224: goto -> 244
    //   227: bipush #47
    //   229: goto -> 244
    //   232: bipush #48
    //   234: goto -> 244
    //   237: bipush #11
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
    //   300: sipush #-795
    //   303: sipush #-24238
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zex.Zn : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #-793
    //   319: sipush #1177
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zex.ZO : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFFCF0) & 0xFFFF;
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
      byte b1 = 118;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zex.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */