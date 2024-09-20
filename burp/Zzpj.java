package burp;

import java.math.BigInteger;

class Zzpj extends ClassLoader {
  static String ZR;
  
  static Object ZI;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZR(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZO(Object paramObject) {
    Zl15.ZI = a(8252, 28304);
    Zl15.Zn = new BigInteger(a(8249, 27631));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zlwi.ZN.charAt(Math.abs(((BigInteger)Zl15.Zn).intValue() % 32)) > Zbzj.Zw.charAt(Math.abs(((BigInteger)Zth8.Zk).intValue() % 32))) {
          try {
            Zs5i.Zu(Class.forName(a(8239, 5545)));
            if (!bool)
              Zlbt.Zy(Class.forName(a(8232, 7809))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zlbt.Zy(Class.forName(a(8232, 7809)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zh(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zmdm.ZZ : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zsf4.Zr : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zrp3.Zd : Ljava/lang/Object;
    //   22: sipush #8225
    //   25: getstatic burp/Zgr1.Zf : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: getstatic burp/Zro_.ZP : Ljava/lang/Object;
    //   34: checkcast java/math/BigInteger
    //   37: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   40: putstatic burp/Zr9j.Zw : Ljava/lang/Object;
    //   43: sipush #-3599
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: iconst_1
    //   50: ldc burp/Zre4
    //   52: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   55: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   58: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   61: astore_3
    //   62: aload_3
    //   63: arraylength
    //   64: istore #4
    //   66: iconst_0
    //   67: istore #5
    //   69: iload #5
    //   71: iload #4
    //   73: if_icmpge -> 210
    //   76: aload_3
    //   77: iload #5
    //   79: aaload
    //   80: astore #6
    //   82: aload #6
    //   84: invokevirtual getModifiers : ()I
    //   87: invokestatic isStatic : (I)Z
    //   90: ifne -> 100
    //   93: goto -> 203
    //   96: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   99: athrow
    //   100: aload #6
    //   102: invokevirtual getType : ()Ljava/lang/Class;
    //   105: astore #7
    //   107: aload #7
    //   109: ifnull -> 190
    //   112: aload #7
    //   114: invokevirtual isPrimitive : ()Z
    //   117: ifne -> 190
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   126: athrow
    //   127: aload #7
    //   129: invokevirtual getPackage : ()Ljava/lang/Package;
    //   132: ifnull -> 190
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   141: athrow
    //   142: aload #7
    //   144: invokevirtual getPackage : ()Ljava/lang/Package;
    //   147: invokevirtual getName : ()Ljava/lang/String;
    //   150: ifnull -> 190
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   159: athrow
    //   160: aload #7
    //   162: invokevirtual getPackage : ()Ljava/lang/Package;
    //   165: invokevirtual getName : ()Ljava/lang/String;
    //   168: sipush #8251
    //   171: sipush #-23190
    //   174: invokestatic a : (II)Ljava/lang/String;
    //   177: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   180: ifne -> 190
    //   183: goto -> 190
    //   186: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   189: athrow
    //   190: aload #6
    //   192: iconst_1
    //   193: invokevirtual setAccessible : (Z)V
    //   196: aload #6
    //   198: aconst_null
    //   199: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   202: pop
    //   203: iinc #5, 1
    //   206: iload_2
    //   207: ifne -> 69
    //   210: sipush #8237
    //   213: sipush #-23332
    //   216: invokestatic a : (II)Ljava/lang/String;
    //   219: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   222: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   225: astore_3
    //   226: aload_3
    //   227: arraylength
    //   228: istore #4
    //   230: iconst_0
    //   231: istore #5
    //   233: iload #5
    //   235: iload #4
    //   237: if_icmpge -> 369
    //   240: aload_3
    //   241: iload #5
    //   243: aaload
    //   244: astore #6
    //   246: aload #6
    //   248: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   251: pop
    //   252: aload #6
    //   254: invokevirtual getModifiers : ()I
    //   257: invokestatic isStatic : (I)Z
    //   260: ifeq -> 355
    //   263: aload #6
    //   265: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   268: arraylength
    //   269: iconst_2
    //   270: if_icmpne -> 355
    //   273: goto -> 280
    //   276: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   279: athrow
    //   280: aload #6
    //   282: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   285: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   288: invokevirtual equals : (Ljava/lang/Object;)Z
    //   291: ifeq -> 355
    //   294: goto -> 301
    //   297: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   300: athrow
    //   301: aload #6
    //   303: iconst_1
    //   304: invokevirtual setAccessible : (Z)V
    //   307: aload #6
    //   309: aconst_null
    //   310: iconst_2
    //   311: anewarray java/lang/Object
    //   314: dup
    //   315: iconst_0
    //   316: aload_0
    //   317: aastore
    //   318: dup
    //   319: iconst_1
    //   320: aload_1
    //   321: ifnonnull -> 339
    //   324: goto -> 331
    //   327: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   330: athrow
    //   331: aload_1
    //   332: goto -> 346
    //   335: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   338: athrow
    //   339: aload_1
    //   340: checkcast [B
    //   343: invokevirtual clone : ()Ljava/lang/Object;
    //   346: aastore
    //   347: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   350: pop
    //   351: iload_2
    //   352: ifne -> 369
    //   355: iinc #5, 1
    //   358: iload_2
    //   359: ifne -> 233
    //   362: goto -> 369
    //   365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   368: athrow
    //   369: iconst_0
    //   370: istore_3
    //   371: getstatic burp/Ztg3.ZM : Ljava/lang/String;
    //   374: getstatic burp/Zso7.ZB : Ljava/lang/Object;
    //   377: checkcast java/math/BigInteger
    //   380: invokevirtual intValue : ()I
    //   383: bipush #32
    //   385: irem
    //   386: invokestatic abs : (I)I
    //   389: invokevirtual charAt : (I)C
    //   392: getstatic burp/Zro_.Zz : Ljava/lang/String;
    //   395: getstatic burp/Zkc5.ZZ : Ljava/lang/Object;
    //   398: checkcast java/math/BigInteger
    //   401: invokevirtual intValue : ()I
    //   404: bipush #32
    //   406: irem
    //   407: invokestatic abs : (I)I
    //   410: invokevirtual charAt : (I)C
    //   413: if_icmple -> 757
    //   416: sipush #8244
    //   419: sipush #-16320
    //   422: invokestatic a : (II)Ljava/lang/String;
    //   425: iconst_1
    //   426: ldc burp/Zest
    //   428: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   431: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   434: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   437: astore #4
    //   439: aload #4
    //   441: arraylength
    //   442: istore #5
    //   444: iconst_0
    //   445: istore #6
    //   447: iload #6
    //   449: iload #5
    //   451: if_icmpge -> 589
    //   454: aload #4
    //   456: iload #6
    //   458: aaload
    //   459: astore #7
    //   461: aload #7
    //   463: invokevirtual getModifiers : ()I
    //   466: invokestatic isStatic : (I)Z
    //   469: ifne -> 479
    //   472: goto -> 582
    //   475: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   478: athrow
    //   479: aload #7
    //   481: invokevirtual getType : ()Ljava/lang/Class;
    //   484: astore #8
    //   486: aload #8
    //   488: ifnull -> 569
    //   491: aload #8
    //   493: invokevirtual isPrimitive : ()Z
    //   496: ifne -> 569
    //   499: goto -> 506
    //   502: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   505: athrow
    //   506: aload #8
    //   508: invokevirtual getPackage : ()Ljava/lang/Package;
    //   511: ifnull -> 569
    //   514: goto -> 521
    //   517: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   520: athrow
    //   521: aload #8
    //   523: invokevirtual getPackage : ()Ljava/lang/Package;
    //   526: invokevirtual getName : ()Ljava/lang/String;
    //   529: ifnull -> 569
    //   532: goto -> 539
    //   535: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   538: athrow
    //   539: aload #8
    //   541: invokevirtual getPackage : ()Ljava/lang/Package;
    //   544: invokevirtual getName : ()Ljava/lang/String;
    //   547: sipush #8224
    //   550: sipush #12846
    //   553: invokestatic a : (II)Ljava/lang/String;
    //   556: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   559: ifne -> 569
    //   562: goto -> 569
    //   565: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   568: athrow
    //   569: aload #7
    //   571: iconst_1
    //   572: invokevirtual setAccessible : (Z)V
    //   575: aload #7
    //   577: aconst_null
    //   578: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   581: pop
    //   582: iinc #6, 1
    //   585: iload_2
    //   586: ifne -> 447
    //   589: sipush #8231
    //   592: sipush #-18554
    //   595: invokestatic a : (II)Ljava/lang/String;
    //   598: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   601: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   604: astore #4
    //   606: aload #4
    //   608: arraylength
    //   609: istore #5
    //   611: iconst_0
    //   612: istore #6
    //   614: iload #6
    //   616: iload #5
    //   618: if_icmpge -> 754
    //   621: aload #4
    //   623: iload #6
    //   625: aaload
    //   626: astore #7
    //   628: aload #7
    //   630: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   633: pop
    //   634: aload #7
    //   636: invokevirtual getModifiers : ()I
    //   639: invokestatic isStatic : (I)Z
    //   642: ifeq -> 740
    //   645: aload #7
    //   647: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   650: arraylength
    //   651: iconst_2
    //   652: if_icmpne -> 740
    //   655: goto -> 662
    //   658: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   661: athrow
    //   662: aload #7
    //   664: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   667: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   670: if_acmpne -> 740
    //   673: goto -> 680
    //   676: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   679: athrow
    //   680: aload #7
    //   682: iconst_1
    //   683: invokevirtual setAccessible : (Z)V
    //   686: aload #7
    //   688: aconst_null
    //   689: iconst_2
    //   690: anewarray java/lang/Object
    //   693: dup
    //   694: iconst_0
    //   695: aload_0
    //   696: aastore
    //   697: dup
    //   698: iconst_1
    //   699: aload_1
    //   700: ifnonnull -> 718
    //   703: goto -> 710
    //   706: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   709: athrow
    //   710: aload_1
    //   711: goto -> 725
    //   714: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   717: athrow
    //   718: aload_1
    //   719: checkcast [B
    //   722: invokevirtual clone : ()Ljava/lang/Object;
    //   725: aastore
    //   726: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   729: checkcast java/lang/Boolean
    //   732: invokevirtual booleanValue : ()Z
    //   735: istore_3
    //   736: iload_2
    //   737: ifne -> 754
    //   740: iinc #6, 1
    //   743: iload_2
    //   744: ifne -> 614
    //   747: goto -> 754
    //   750: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   753: athrow
    //   754: goto -> 1095
    //   757: sipush #8228
    //   760: sipush #2721
    //   763: invokestatic a : (II)Ljava/lang/String;
    //   766: iconst_1
    //   767: ldc burp/Zv8c
    //   769: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   772: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   775: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   778: astore #4
    //   780: aload #4
    //   782: arraylength
    //   783: istore #5
    //   785: iconst_0
    //   786: istore #6
    //   788: iload #6
    //   790: iload #5
    //   792: if_icmpge -> 930
    //   795: aload #4
    //   797: iload #6
    //   799: aaload
    //   800: astore #7
    //   802: aload #7
    //   804: invokevirtual getModifiers : ()I
    //   807: invokestatic isStatic : (I)Z
    //   810: ifne -> 820
    //   813: goto -> 923
    //   816: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   819: athrow
    //   820: aload #7
    //   822: invokevirtual getType : ()Ljava/lang/Class;
    //   825: astore #8
    //   827: aload #8
    //   829: ifnull -> 910
    //   832: aload #8
    //   834: invokevirtual isPrimitive : ()Z
    //   837: ifne -> 910
    //   840: goto -> 847
    //   843: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   846: athrow
    //   847: aload #8
    //   849: invokevirtual getPackage : ()Ljava/lang/Package;
    //   852: ifnull -> 910
    //   855: goto -> 862
    //   858: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   861: athrow
    //   862: aload #8
    //   864: invokevirtual getPackage : ()Ljava/lang/Package;
    //   867: invokevirtual getName : ()Ljava/lang/String;
    //   870: ifnull -> 910
    //   873: goto -> 880
    //   876: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   879: athrow
    //   880: aload #8
    //   882: invokevirtual getPackage : ()Ljava/lang/Package;
    //   885: invokevirtual getName : ()Ljava/lang/String;
    //   888: sipush #8224
    //   891: sipush #12846
    //   894: invokestatic a : (II)Ljava/lang/String;
    //   897: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   900: ifne -> 910
    //   903: goto -> 910
    //   906: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   909: athrow
    //   910: aload #7
    //   912: iconst_1
    //   913: invokevirtual setAccessible : (Z)V
    //   916: aload #7
    //   918: aconst_null
    //   919: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   922: pop
    //   923: iinc #6, 1
    //   926: iload_2
    //   927: ifne -> 788
    //   930: sipush #8236
    //   933: sipush #25580
    //   936: invokestatic a : (II)Ljava/lang/String;
    //   939: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   942: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   945: astore #4
    //   947: aload #4
    //   949: arraylength
    //   950: istore #5
    //   952: iconst_0
    //   953: istore #6
    //   955: iload #6
    //   957: iload #5
    //   959: if_icmpge -> 1095
    //   962: aload #4
    //   964: iload #6
    //   966: aaload
    //   967: astore #7
    //   969: aload #7
    //   971: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   974: pop
    //   975: aload #7
    //   977: invokevirtual getModifiers : ()I
    //   980: invokestatic isStatic : (I)Z
    //   983: ifeq -> 1081
    //   986: aload #7
    //   988: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   991: arraylength
    //   992: iconst_2
    //   993: if_icmpne -> 1081
    //   996: goto -> 1003
    //   999: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1002: athrow
    //   1003: aload #7
    //   1005: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1008: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1011: if_acmpne -> 1081
    //   1014: goto -> 1021
    //   1017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1020: athrow
    //   1021: aload #7
    //   1023: iconst_1
    //   1024: invokevirtual setAccessible : (Z)V
    //   1027: aload #7
    //   1029: aconst_null
    //   1030: iconst_2
    //   1031: anewarray java/lang/Object
    //   1034: dup
    //   1035: iconst_0
    //   1036: aload_0
    //   1037: aastore
    //   1038: dup
    //   1039: iconst_1
    //   1040: aload_1
    //   1041: ifnonnull -> 1059
    //   1044: goto -> 1051
    //   1047: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1050: athrow
    //   1051: aload_1
    //   1052: goto -> 1066
    //   1055: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1058: athrow
    //   1059: aload_1
    //   1060: checkcast [B
    //   1063: invokevirtual clone : ()Ljava/lang/Object;
    //   1066: aastore
    //   1067: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1070: checkcast java/lang/Boolean
    //   1073: invokevirtual booleanValue : ()Z
    //   1076: istore_3
    //   1077: iload_2
    //   1078: ifne -> 1095
    //   1081: iinc #6, 1
    //   1084: iload_2
    //   1085: ifne -> 955
    //   1088: goto -> 1095
    //   1091: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1094: athrow
    //   1095: iload_3
    //   1096: ifeq -> 1101
    //   1099: iload_3
    //   1100: ireturn
    //   1101: getstatic burp/Zrx5.ZD : Ljava/lang/String;
    //   1104: getstatic burp/Zrt9.Zy : Ljava/lang/Object;
    //   1107: checkcast java/math/BigInteger
    //   1110: invokevirtual intValue : ()I
    //   1113: bipush #32
    //   1115: irem
    //   1116: invokestatic abs : (I)I
    //   1119: invokevirtual charAt : (I)C
    //   1122: getstatic burp/Zeai.ZA : Ljava/lang/String;
    //   1125: getstatic burp/Ze_e.Za : Ljava/lang/Object;
    //   1128: checkcast java/math/BigInteger
    //   1131: invokevirtual intValue : ()I
    //   1134: bipush #32
    //   1136: irem
    //   1137: invokestatic abs : (I)I
    //   1140: invokevirtual charAt : (I)C
    //   1143: if_icmpgt -> 1488
    //   1146: sipush #8248
    //   1149: sipush #4274
    //   1152: invokestatic a : (II)Ljava/lang/String;
    //   1155: iconst_1
    //   1156: ldc burp/Ze7y
    //   1158: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1161: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1164: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1167: astore #4
    //   1169: aload #4
    //   1171: arraylength
    //   1172: istore #5
    //   1174: iconst_0
    //   1175: istore #6
    //   1177: iload #6
    //   1179: iload #5
    //   1181: if_icmpge -> 1319
    //   1184: aload #4
    //   1186: iload #6
    //   1188: aaload
    //   1189: astore #7
    //   1191: aload #7
    //   1193: invokevirtual getModifiers : ()I
    //   1196: invokestatic isStatic : (I)Z
    //   1199: ifne -> 1209
    //   1202: goto -> 1312
    //   1205: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1208: athrow
    //   1209: aload #7
    //   1211: invokevirtual getType : ()Ljava/lang/Class;
    //   1214: astore #8
    //   1216: aload #8
    //   1218: ifnull -> 1299
    //   1221: aload #8
    //   1223: invokevirtual isPrimitive : ()Z
    //   1226: ifne -> 1299
    //   1229: goto -> 1236
    //   1232: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1235: athrow
    //   1236: aload #8
    //   1238: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1241: ifnull -> 1299
    //   1244: goto -> 1251
    //   1247: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1250: athrow
    //   1251: aload #8
    //   1253: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1256: invokevirtual getName : ()Ljava/lang/String;
    //   1259: ifnull -> 1299
    //   1262: goto -> 1269
    //   1265: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1268: athrow
    //   1269: aload #8
    //   1271: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1274: invokevirtual getName : ()Ljava/lang/String;
    //   1277: sipush #8224
    //   1280: sipush #12846
    //   1283: invokestatic a : (II)Ljava/lang/String;
    //   1286: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1289: ifne -> 1299
    //   1292: goto -> 1299
    //   1295: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1298: athrow
    //   1299: aload #7
    //   1301: iconst_1
    //   1302: invokevirtual setAccessible : (Z)V
    //   1305: aload #7
    //   1307: aconst_null
    //   1308: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1311: pop
    //   1312: iinc #6, 1
    //   1315: iload_2
    //   1316: ifne -> 1177
    //   1319: sipush #8254
    //   1322: sipush #-18194
    //   1325: invokestatic a : (II)Ljava/lang/String;
    //   1328: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1331: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1334: astore #4
    //   1336: aload #4
    //   1338: arraylength
    //   1339: istore #5
    //   1341: iconst_0
    //   1342: istore #6
    //   1344: iload #6
    //   1346: iload #5
    //   1348: if_icmpge -> 1484
    //   1351: aload #4
    //   1353: iload #6
    //   1355: aaload
    //   1356: astore #7
    //   1358: aload #7
    //   1360: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1363: pop
    //   1364: aload #7
    //   1366: invokevirtual getModifiers : ()I
    //   1369: invokestatic isStatic : (I)Z
    //   1372: ifeq -> 1470
    //   1375: aload #7
    //   1377: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1380: arraylength
    //   1381: iconst_2
    //   1382: if_icmpne -> 1470
    //   1385: goto -> 1392
    //   1388: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1391: athrow
    //   1392: aload #7
    //   1394: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1397: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1400: if_acmpne -> 1470
    //   1403: goto -> 1410
    //   1406: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1409: athrow
    //   1410: aload #7
    //   1412: iconst_1
    //   1413: invokevirtual setAccessible : (Z)V
    //   1416: aload #7
    //   1418: aconst_null
    //   1419: iconst_2
    //   1420: anewarray java/lang/Object
    //   1423: dup
    //   1424: iconst_0
    //   1425: aload_0
    //   1426: aastore
    //   1427: dup
    //   1428: iconst_1
    //   1429: aload_1
    //   1430: ifnonnull -> 1448
    //   1433: goto -> 1440
    //   1436: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1439: athrow
    //   1440: aload_1
    //   1441: goto -> 1455
    //   1444: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1447: athrow
    //   1448: aload_1
    //   1449: checkcast [B
    //   1452: invokevirtual clone : ()Ljava/lang/Object;
    //   1455: aastore
    //   1456: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1459: checkcast java/lang/Boolean
    //   1462: invokevirtual booleanValue : ()Z
    //   1465: istore_3
    //   1466: iload_2
    //   1467: ifne -> 1484
    //   1470: iinc #6, 1
    //   1473: iload_2
    //   1474: ifne -> 1344
    //   1477: goto -> 1484
    //   1480: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1483: athrow
    //   1484: iload_2
    //   1485: ifne -> 1826
    //   1488: sipush #8253
    //   1491: sipush #-6028
    //   1494: invokestatic a : (II)Ljava/lang/String;
    //   1497: iconst_1
    //   1498: ldc burp/Ze54
    //   1500: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1503: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1506: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1509: astore #4
    //   1511: aload #4
    //   1513: arraylength
    //   1514: istore #5
    //   1516: iconst_0
    //   1517: istore #6
    //   1519: iload #6
    //   1521: iload #5
    //   1523: if_icmpge -> 1661
    //   1526: aload #4
    //   1528: iload #6
    //   1530: aaload
    //   1531: astore #7
    //   1533: aload #7
    //   1535: invokevirtual getModifiers : ()I
    //   1538: invokestatic isStatic : (I)Z
    //   1541: ifne -> 1551
    //   1544: goto -> 1654
    //   1547: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1550: athrow
    //   1551: aload #7
    //   1553: invokevirtual getType : ()Ljava/lang/Class;
    //   1556: astore #8
    //   1558: aload #8
    //   1560: ifnull -> 1641
    //   1563: aload #8
    //   1565: invokevirtual isPrimitive : ()Z
    //   1568: ifne -> 1641
    //   1571: goto -> 1578
    //   1574: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1577: athrow
    //   1578: aload #8
    //   1580: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1583: ifnull -> 1641
    //   1586: goto -> 1593
    //   1589: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1592: athrow
    //   1593: aload #8
    //   1595: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1598: invokevirtual getName : ()Ljava/lang/String;
    //   1601: ifnull -> 1641
    //   1604: goto -> 1611
    //   1607: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1610: athrow
    //   1611: aload #8
    //   1613: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1616: invokevirtual getName : ()Ljava/lang/String;
    //   1619: sipush #8224
    //   1622: sipush #12846
    //   1625: invokestatic a : (II)Ljava/lang/String;
    //   1628: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1631: ifne -> 1641
    //   1634: goto -> 1641
    //   1637: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1640: athrow
    //   1641: aload #7
    //   1643: iconst_1
    //   1644: invokevirtual setAccessible : (Z)V
    //   1647: aload #7
    //   1649: aconst_null
    //   1650: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1653: pop
    //   1654: iinc #6, 1
    //   1657: iload_2
    //   1658: ifne -> 1519
    //   1661: sipush #8250
    //   1664: sipush #-28158
    //   1667: invokestatic a : (II)Ljava/lang/String;
    //   1670: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1673: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1676: astore #4
    //   1678: aload #4
    //   1680: arraylength
    //   1681: istore #5
    //   1683: iconst_0
    //   1684: istore #6
    //   1686: iload #6
    //   1688: iload #5
    //   1690: if_icmpge -> 1826
    //   1693: aload #4
    //   1695: iload #6
    //   1697: aaload
    //   1698: astore #7
    //   1700: aload #7
    //   1702: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1705: pop
    //   1706: aload #7
    //   1708: invokevirtual getModifiers : ()I
    //   1711: invokestatic isStatic : (I)Z
    //   1714: ifeq -> 1812
    //   1717: aload #7
    //   1719: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1722: arraylength
    //   1723: iconst_2
    //   1724: if_icmpne -> 1812
    //   1727: goto -> 1734
    //   1730: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1733: athrow
    //   1734: aload #7
    //   1736: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1739: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1742: if_acmpne -> 1812
    //   1745: goto -> 1752
    //   1748: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1751: athrow
    //   1752: aload #7
    //   1754: iconst_1
    //   1755: invokevirtual setAccessible : (Z)V
    //   1758: aload #7
    //   1760: aconst_null
    //   1761: iconst_2
    //   1762: anewarray java/lang/Object
    //   1765: dup
    //   1766: iconst_0
    //   1767: aload_0
    //   1768: aastore
    //   1769: dup
    //   1770: iconst_1
    //   1771: aload_1
    //   1772: ifnonnull -> 1790
    //   1775: goto -> 1782
    //   1778: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1781: athrow
    //   1782: aload_1
    //   1783: goto -> 1797
    //   1786: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1789: athrow
    //   1790: aload_1
    //   1791: checkcast [B
    //   1794: invokevirtual clone : ()Ljava/lang/Object;
    //   1797: aastore
    //   1798: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1801: checkcast java/lang/Boolean
    //   1804: invokevirtual booleanValue : ()Z
    //   1807: istore_3
    //   1808: iload_2
    //   1809: ifne -> 1826
    //   1812: iinc #6, 1
    //   1815: iload_2
    //   1816: ifne -> 1686
    //   1819: goto -> 1826
    //   1822: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1825: athrow
    //   1826: iload_3
    //   1827: ifeq -> 1832
    //   1830: iload_3
    //   1831: ireturn
    //   1832: getstatic burp/Zl1z.Zh : Ljava/lang/String;
    //   1835: getstatic burp/Zz0.ZJ : Ljava/lang/Object;
    //   1838: checkcast java/math/BigInteger
    //   1841: invokevirtual intValue : ()I
    //   1844: bipush #32
    //   1846: irem
    //   1847: invokestatic abs : (I)I
    //   1850: invokevirtual charAt : (I)C
    //   1853: getstatic burp/Zzb2.ZJ : Ljava/lang/String;
    //   1856: getstatic burp/Zlhu.ZJ : Ljava/lang/Object;
    //   1859: checkcast java/math/BigInteger
    //   1862: invokevirtual intValue : ()I
    //   1865: bipush #32
    //   1867: irem
    //   1868: invokestatic abs : (I)I
    //   1871: invokevirtual charAt : (I)C
    //   1874: if_icmpgt -> 2219
    //   1877: sipush #8229
    //   1880: sipush #-6717
    //   1883: invokestatic a : (II)Ljava/lang/String;
    //   1886: iconst_1
    //   1887: ldc burp/Zs1d
    //   1889: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1892: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1895: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1898: astore #4
    //   1900: aload #4
    //   1902: arraylength
    //   1903: istore #5
    //   1905: iconst_0
    //   1906: istore #6
    //   1908: iload #6
    //   1910: iload #5
    //   1912: if_icmpge -> 2050
    //   1915: aload #4
    //   1917: iload #6
    //   1919: aaload
    //   1920: astore #7
    //   1922: aload #7
    //   1924: invokevirtual getModifiers : ()I
    //   1927: invokestatic isStatic : (I)Z
    //   1930: ifne -> 1940
    //   1933: goto -> 2043
    //   1936: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1939: athrow
    //   1940: aload #7
    //   1942: invokevirtual getType : ()Ljava/lang/Class;
    //   1945: astore #8
    //   1947: aload #8
    //   1949: ifnull -> 2030
    //   1952: aload #8
    //   1954: invokevirtual isPrimitive : ()Z
    //   1957: ifne -> 2030
    //   1960: goto -> 1967
    //   1963: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1966: athrow
    //   1967: aload #8
    //   1969: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1972: ifnull -> 2030
    //   1975: goto -> 1982
    //   1978: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1981: athrow
    //   1982: aload #8
    //   1984: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1987: invokevirtual getName : ()Ljava/lang/String;
    //   1990: ifnull -> 2030
    //   1993: goto -> 2000
    //   1996: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1999: athrow
    //   2000: aload #8
    //   2002: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2005: invokevirtual getName : ()Ljava/lang/String;
    //   2008: sipush #8224
    //   2011: sipush #12846
    //   2014: invokestatic a : (II)Ljava/lang/String;
    //   2017: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2020: ifne -> 2030
    //   2023: goto -> 2030
    //   2026: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2029: athrow
    //   2030: aload #7
    //   2032: iconst_1
    //   2033: invokevirtual setAccessible : (Z)V
    //   2036: aload #7
    //   2038: aconst_null
    //   2039: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2042: pop
    //   2043: iinc #6, 1
    //   2046: iload_2
    //   2047: ifne -> 1908
    //   2050: sipush #8227
    //   2053: sipush #17923
    //   2056: invokestatic a : (II)Ljava/lang/String;
    //   2059: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2062: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2065: astore #4
    //   2067: aload #4
    //   2069: arraylength
    //   2070: istore #5
    //   2072: iconst_0
    //   2073: istore #6
    //   2075: iload #6
    //   2077: iload #5
    //   2079: if_icmpge -> 2215
    //   2082: aload #4
    //   2084: iload #6
    //   2086: aaload
    //   2087: astore #7
    //   2089: aload #7
    //   2091: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2094: pop
    //   2095: aload #7
    //   2097: invokevirtual getModifiers : ()I
    //   2100: invokestatic isStatic : (I)Z
    //   2103: ifeq -> 2201
    //   2106: aload #7
    //   2108: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2111: arraylength
    //   2112: iconst_2
    //   2113: if_icmpne -> 2201
    //   2116: goto -> 2123
    //   2119: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2122: athrow
    //   2123: aload #7
    //   2125: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2128: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2131: if_acmpne -> 2201
    //   2134: goto -> 2141
    //   2137: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2140: athrow
    //   2141: aload #7
    //   2143: iconst_1
    //   2144: invokevirtual setAccessible : (Z)V
    //   2147: aload #7
    //   2149: aconst_null
    //   2150: iconst_2
    //   2151: anewarray java/lang/Object
    //   2154: dup
    //   2155: iconst_0
    //   2156: aload_0
    //   2157: aastore
    //   2158: dup
    //   2159: iconst_1
    //   2160: aload_1
    //   2161: ifnonnull -> 2179
    //   2164: goto -> 2171
    //   2167: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2170: athrow
    //   2171: aload_1
    //   2172: goto -> 2186
    //   2175: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2178: athrow
    //   2179: aload_1
    //   2180: checkcast [B
    //   2183: invokevirtual clone : ()Ljava/lang/Object;
    //   2186: aastore
    //   2187: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2190: checkcast java/lang/Boolean
    //   2193: invokevirtual booleanValue : ()Z
    //   2196: istore_3
    //   2197: iload_2
    //   2198: ifne -> 2215
    //   2201: iinc #6, 1
    //   2204: iload_2
    //   2205: ifne -> 2075
    //   2208: goto -> 2215
    //   2211: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2214: athrow
    //   2215: iload_2
    //   2216: ifne -> 2557
    //   2219: sipush #8238
    //   2222: sipush #26881
    //   2225: invokestatic a : (II)Ljava/lang/String;
    //   2228: iconst_1
    //   2229: ldc burp/Zrqd
    //   2231: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2234: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2237: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2240: astore #4
    //   2242: aload #4
    //   2244: arraylength
    //   2245: istore #5
    //   2247: iconst_0
    //   2248: istore #6
    //   2250: iload #6
    //   2252: iload #5
    //   2254: if_icmpge -> 2392
    //   2257: aload #4
    //   2259: iload #6
    //   2261: aaload
    //   2262: astore #7
    //   2264: aload #7
    //   2266: invokevirtual getModifiers : ()I
    //   2269: invokestatic isStatic : (I)Z
    //   2272: ifne -> 2282
    //   2275: goto -> 2385
    //   2278: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2281: athrow
    //   2282: aload #7
    //   2284: invokevirtual getType : ()Ljava/lang/Class;
    //   2287: astore #8
    //   2289: aload #8
    //   2291: ifnull -> 2372
    //   2294: aload #8
    //   2296: invokevirtual isPrimitive : ()Z
    //   2299: ifne -> 2372
    //   2302: goto -> 2309
    //   2305: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2308: athrow
    //   2309: aload #8
    //   2311: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2314: ifnull -> 2372
    //   2317: goto -> 2324
    //   2320: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2323: athrow
    //   2324: aload #8
    //   2326: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2329: invokevirtual getName : ()Ljava/lang/String;
    //   2332: ifnull -> 2372
    //   2335: goto -> 2342
    //   2338: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2341: athrow
    //   2342: aload #8
    //   2344: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2347: invokevirtual getName : ()Ljava/lang/String;
    //   2350: sipush #8224
    //   2353: sipush #12846
    //   2356: invokestatic a : (II)Ljava/lang/String;
    //   2359: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2362: ifne -> 2372
    //   2365: goto -> 2372
    //   2368: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2371: athrow
    //   2372: aload #7
    //   2374: iconst_1
    //   2375: invokevirtual setAccessible : (Z)V
    //   2378: aload #7
    //   2380: aconst_null
    //   2381: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2384: pop
    //   2385: iinc #6, 1
    //   2388: iload_2
    //   2389: ifne -> 2250
    //   2392: sipush #8234
    //   2395: sipush #24524
    //   2398: invokestatic a : (II)Ljava/lang/String;
    //   2401: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2404: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2407: astore #4
    //   2409: aload #4
    //   2411: arraylength
    //   2412: istore #5
    //   2414: iconst_0
    //   2415: istore #6
    //   2417: iload #6
    //   2419: iload #5
    //   2421: if_icmpge -> 2557
    //   2424: aload #4
    //   2426: iload #6
    //   2428: aaload
    //   2429: astore #7
    //   2431: aload #7
    //   2433: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2436: pop
    //   2437: aload #7
    //   2439: invokevirtual getModifiers : ()I
    //   2442: invokestatic isStatic : (I)Z
    //   2445: ifeq -> 2543
    //   2448: aload #7
    //   2450: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2453: arraylength
    //   2454: iconst_2
    //   2455: if_icmpne -> 2543
    //   2458: goto -> 2465
    //   2461: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2464: athrow
    //   2465: aload #7
    //   2467: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2470: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2473: if_acmpne -> 2543
    //   2476: goto -> 2483
    //   2479: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2482: athrow
    //   2483: aload #7
    //   2485: iconst_1
    //   2486: invokevirtual setAccessible : (Z)V
    //   2489: aload #7
    //   2491: aconst_null
    //   2492: iconst_2
    //   2493: anewarray java/lang/Object
    //   2496: dup
    //   2497: iconst_0
    //   2498: aload_0
    //   2499: aastore
    //   2500: dup
    //   2501: iconst_1
    //   2502: aload_1
    //   2503: ifnonnull -> 2521
    //   2506: goto -> 2513
    //   2509: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2512: athrow
    //   2513: aload_1
    //   2514: goto -> 2528
    //   2517: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2520: athrow
    //   2521: aload_1
    //   2522: checkcast [B
    //   2525: invokevirtual clone : ()Ljava/lang/Object;
    //   2528: aastore
    //   2529: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2532: checkcast java/lang/Boolean
    //   2535: invokevirtual booleanValue : ()Z
    //   2538: istore_3
    //   2539: iload_2
    //   2540: ifne -> 2557
    //   2543: iinc #6, 1
    //   2546: iload_2
    //   2547: ifne -> 2417
    //   2550: goto -> 2557
    //   2553: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2556: athrow
    //   2557: iload_3
    //   2558: ifeq -> 2563
    //   2561: iload_3
    //   2562: ireturn
    //   2563: getstatic burp/Zs5i.ZJ : Ljava/lang/String;
    //   2566: getstatic burp/Zzxa.ZI : Ljava/lang/Object;
    //   2569: checkcast java/math/BigInteger
    //   2572: invokevirtual intValue : ()I
    //   2575: bipush #32
    //   2577: irem
    //   2578: invokestatic abs : (I)I
    //   2581: invokevirtual charAt : (I)C
    //   2584: getstatic burp/Zrx5.ZD : Ljava/lang/String;
    //   2587: getstatic burp/Zth8.Zk : Ljava/lang/Object;
    //   2590: checkcast java/math/BigInteger
    //   2593: invokevirtual intValue : ()I
    //   2596: bipush #32
    //   2598: irem
    //   2599: invokestatic abs : (I)I
    //   2602: invokevirtual charAt : (I)C
    //   2605: if_icmpgt -> 2950
    //   2608: sipush #8226
    //   2611: sipush #-20341
    //   2614: invokestatic a : (II)Ljava/lang/String;
    //   2617: iconst_1
    //   2618: ldc burp/Zly0
    //   2620: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2623: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2626: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2629: astore #4
    //   2631: aload #4
    //   2633: arraylength
    //   2634: istore #5
    //   2636: iconst_0
    //   2637: istore #6
    //   2639: iload #6
    //   2641: iload #5
    //   2643: if_icmpge -> 2781
    //   2646: aload #4
    //   2648: iload #6
    //   2650: aaload
    //   2651: astore #7
    //   2653: aload #7
    //   2655: invokevirtual getModifiers : ()I
    //   2658: invokestatic isStatic : (I)Z
    //   2661: ifne -> 2671
    //   2664: goto -> 2774
    //   2667: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2670: athrow
    //   2671: aload #7
    //   2673: invokevirtual getType : ()Ljava/lang/Class;
    //   2676: astore #8
    //   2678: aload #8
    //   2680: ifnull -> 2761
    //   2683: aload #8
    //   2685: invokevirtual isPrimitive : ()Z
    //   2688: ifne -> 2761
    //   2691: goto -> 2698
    //   2694: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2697: athrow
    //   2698: aload #8
    //   2700: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2703: ifnull -> 2761
    //   2706: goto -> 2713
    //   2709: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2712: athrow
    //   2713: aload #8
    //   2715: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2718: invokevirtual getName : ()Ljava/lang/String;
    //   2721: ifnull -> 2761
    //   2724: goto -> 2731
    //   2727: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2730: athrow
    //   2731: aload #8
    //   2733: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2736: invokevirtual getName : ()Ljava/lang/String;
    //   2739: sipush #8224
    //   2742: sipush #12846
    //   2745: invokestatic a : (II)Ljava/lang/String;
    //   2748: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2751: ifne -> 2761
    //   2754: goto -> 2761
    //   2757: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2760: athrow
    //   2761: aload #7
    //   2763: iconst_1
    //   2764: invokevirtual setAccessible : (Z)V
    //   2767: aload #7
    //   2769: aconst_null
    //   2770: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2773: pop
    //   2774: iinc #6, 1
    //   2777: iload_2
    //   2778: ifne -> 2639
    //   2781: sipush #8230
    //   2784: sipush #-17709
    //   2787: invokestatic a : (II)Ljava/lang/String;
    //   2790: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2793: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2796: astore #4
    //   2798: aload #4
    //   2800: arraylength
    //   2801: istore #5
    //   2803: iconst_0
    //   2804: istore #6
    //   2806: iload #6
    //   2808: iload #5
    //   2810: if_icmpge -> 2946
    //   2813: aload #4
    //   2815: iload #6
    //   2817: aaload
    //   2818: astore #7
    //   2820: aload #7
    //   2822: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2825: pop
    //   2826: aload #7
    //   2828: invokevirtual getModifiers : ()I
    //   2831: invokestatic isStatic : (I)Z
    //   2834: ifeq -> 2932
    //   2837: aload #7
    //   2839: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2842: arraylength
    //   2843: iconst_2
    //   2844: if_icmpne -> 2932
    //   2847: goto -> 2854
    //   2850: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2853: athrow
    //   2854: aload #7
    //   2856: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2859: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2862: if_acmpne -> 2932
    //   2865: goto -> 2872
    //   2868: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2871: athrow
    //   2872: aload #7
    //   2874: iconst_1
    //   2875: invokevirtual setAccessible : (Z)V
    //   2878: aload #7
    //   2880: aconst_null
    //   2881: iconst_2
    //   2882: anewarray java/lang/Object
    //   2885: dup
    //   2886: iconst_0
    //   2887: aload_0
    //   2888: aastore
    //   2889: dup
    //   2890: iconst_1
    //   2891: aload_1
    //   2892: ifnonnull -> 2910
    //   2895: goto -> 2902
    //   2898: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2901: athrow
    //   2902: aload_1
    //   2903: goto -> 2917
    //   2906: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2909: athrow
    //   2910: aload_1
    //   2911: checkcast [B
    //   2914: invokevirtual clone : ()Ljava/lang/Object;
    //   2917: aastore
    //   2918: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2921: checkcast java/lang/Boolean
    //   2924: invokevirtual booleanValue : ()Z
    //   2927: istore_3
    //   2928: iload_2
    //   2929: ifne -> 2946
    //   2932: iinc #6, 1
    //   2935: iload_2
    //   2936: ifne -> 2806
    //   2939: goto -> 2946
    //   2942: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2945: athrow
    //   2946: iload_2
    //   2947: ifne -> 3288
    //   2950: sipush #8235
    //   2953: sipush #-20766
    //   2956: invokestatic a : (II)Ljava/lang/String;
    //   2959: iconst_1
    //   2960: ldc burp/Zstq
    //   2962: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2965: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2968: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2971: astore #4
    //   2973: aload #4
    //   2975: arraylength
    //   2976: istore #5
    //   2978: iconst_0
    //   2979: istore #6
    //   2981: iload #6
    //   2983: iload #5
    //   2985: if_icmpge -> 3123
    //   2988: aload #4
    //   2990: iload #6
    //   2992: aaload
    //   2993: astore #7
    //   2995: aload #7
    //   2997: invokevirtual getModifiers : ()I
    //   3000: invokestatic isStatic : (I)Z
    //   3003: ifne -> 3013
    //   3006: goto -> 3116
    //   3009: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3012: athrow
    //   3013: aload #7
    //   3015: invokevirtual getType : ()Ljava/lang/Class;
    //   3018: astore #8
    //   3020: aload #8
    //   3022: ifnull -> 3103
    //   3025: aload #8
    //   3027: invokevirtual isPrimitive : ()Z
    //   3030: ifne -> 3103
    //   3033: goto -> 3040
    //   3036: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3039: athrow
    //   3040: aload #8
    //   3042: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3045: ifnull -> 3103
    //   3048: goto -> 3055
    //   3051: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3054: athrow
    //   3055: aload #8
    //   3057: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3060: invokevirtual getName : ()Ljava/lang/String;
    //   3063: ifnull -> 3103
    //   3066: goto -> 3073
    //   3069: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3072: athrow
    //   3073: aload #8
    //   3075: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3078: invokevirtual getName : ()Ljava/lang/String;
    //   3081: sipush #8224
    //   3084: sipush #12846
    //   3087: invokestatic a : (II)Ljava/lang/String;
    //   3090: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3093: ifne -> 3103
    //   3096: goto -> 3103
    //   3099: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3102: athrow
    //   3103: aload #7
    //   3105: iconst_1
    //   3106: invokevirtual setAccessible : (Z)V
    //   3109: aload #7
    //   3111: aconst_null
    //   3112: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3115: pop
    //   3116: iinc #6, 1
    //   3119: iload_2
    //   3120: ifne -> 2981
    //   3123: sipush #8233
    //   3126: sipush #-2861
    //   3129: invokestatic a : (II)Ljava/lang/String;
    //   3132: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3135: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3138: astore #4
    //   3140: aload #4
    //   3142: arraylength
    //   3143: istore #5
    //   3145: iconst_0
    //   3146: istore #6
    //   3148: iload #6
    //   3150: iload #5
    //   3152: if_icmpge -> 3288
    //   3155: aload #4
    //   3157: iload #6
    //   3159: aaload
    //   3160: astore #7
    //   3162: aload #7
    //   3164: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3167: pop
    //   3168: aload #7
    //   3170: invokevirtual getModifiers : ()I
    //   3173: invokestatic isStatic : (I)Z
    //   3176: ifeq -> 3274
    //   3179: aload #7
    //   3181: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3184: arraylength
    //   3185: iconst_2
    //   3186: if_icmpne -> 3274
    //   3189: goto -> 3196
    //   3192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3195: athrow
    //   3196: aload #7
    //   3198: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3201: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3204: if_acmpne -> 3274
    //   3207: goto -> 3214
    //   3210: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3213: athrow
    //   3214: aload #7
    //   3216: iconst_1
    //   3217: invokevirtual setAccessible : (Z)V
    //   3220: aload #7
    //   3222: aconst_null
    //   3223: iconst_2
    //   3224: anewarray java/lang/Object
    //   3227: dup
    //   3228: iconst_0
    //   3229: aload_0
    //   3230: aastore
    //   3231: dup
    //   3232: iconst_1
    //   3233: aload_1
    //   3234: ifnonnull -> 3252
    //   3237: goto -> 3244
    //   3240: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3243: athrow
    //   3244: aload_1
    //   3245: goto -> 3259
    //   3248: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3251: athrow
    //   3252: aload_1
    //   3253: checkcast [B
    //   3256: invokevirtual clone : ()Ljava/lang/Object;
    //   3259: aastore
    //   3260: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3263: checkcast java/lang/Boolean
    //   3266: invokevirtual booleanValue : ()Z
    //   3269: istore_3
    //   3270: iload_2
    //   3271: ifne -> 3288
    //   3274: iinc #6, 1
    //   3277: iload_2
    //   3278: ifne -> 3148
    //   3281: goto -> 3288
    //   3284: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3287: athrow
    //   3288: iload_3
    //   3289: ireturn
    //   3290: astore_3
    //   3291: new java/lang/Exception
    //   3294: dup
    //   3295: aload_3
    //   3296: invokevirtual getMessage : ()Ljava/lang/String;
    //   3299: invokespecial <init> : (Ljava/lang/String;)V
    //   3302: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1100	3290	java/lang/Throwable
    //   82	96	96	java/lang/Throwable
    //   107	120	123	java/lang/Throwable
    //   112	135	138	java/lang/Throwable
    //   127	153	156	java/lang/Throwable
    //   142	183	186	java/lang/Throwable
    //   246	273	276	java/lang/Throwable
    //   263	294	297	java/lang/Throwable
    //   280	324	327	java/lang/Throwable
    //   301	335	335	java/lang/Throwable
    //   346	362	365	java/lang/Throwable
    //   461	475	475	java/lang/Throwable
    //   486	499	502	java/lang/Throwable
    //   491	514	517	java/lang/Throwable
    //   506	532	535	java/lang/Throwable
    //   521	562	565	java/lang/Throwable
    //   628	655	658	java/lang/Throwable
    //   645	673	676	java/lang/Throwable
    //   662	703	706	java/lang/Throwable
    //   680	714	714	java/lang/Throwable
    //   736	747	750	java/lang/Throwable
    //   802	816	816	java/lang/Throwable
    //   827	840	843	java/lang/Throwable
    //   832	855	858	java/lang/Throwable
    //   847	873	876	java/lang/Throwable
    //   862	903	906	java/lang/Throwable
    //   969	996	999	java/lang/Throwable
    //   986	1014	1017	java/lang/Throwable
    //   1003	1044	1047	java/lang/Throwable
    //   1021	1055	1055	java/lang/Throwable
    //   1077	1088	1091	java/lang/Throwable
    //   1101	1831	3290	java/lang/Throwable
    //   1191	1205	1205	java/lang/Throwable
    //   1216	1229	1232	java/lang/Throwable
    //   1221	1244	1247	java/lang/Throwable
    //   1236	1262	1265	java/lang/Throwable
    //   1251	1292	1295	java/lang/Throwable
    //   1358	1385	1388	java/lang/Throwable
    //   1375	1403	1406	java/lang/Throwable
    //   1392	1433	1436	java/lang/Throwable
    //   1410	1444	1444	java/lang/Throwable
    //   1466	1477	1480	java/lang/Throwable
    //   1533	1547	1547	java/lang/Throwable
    //   1558	1571	1574	java/lang/Throwable
    //   1563	1586	1589	java/lang/Throwable
    //   1578	1604	1607	java/lang/Throwable
    //   1593	1634	1637	java/lang/Throwable
    //   1700	1727	1730	java/lang/Throwable
    //   1717	1745	1748	java/lang/Throwable
    //   1734	1775	1778	java/lang/Throwable
    //   1752	1786	1786	java/lang/Throwable
    //   1808	1819	1822	java/lang/Throwable
    //   1832	2562	3290	java/lang/Throwable
    //   1922	1936	1936	java/lang/Throwable
    //   1947	1960	1963	java/lang/Throwable
    //   1952	1975	1978	java/lang/Throwable
    //   1967	1993	1996	java/lang/Throwable
    //   1982	2023	2026	java/lang/Throwable
    //   2089	2116	2119	java/lang/Throwable
    //   2106	2134	2137	java/lang/Throwable
    //   2123	2164	2167	java/lang/Throwable
    //   2141	2175	2175	java/lang/Throwable
    //   2197	2208	2211	java/lang/Throwable
    //   2264	2278	2278	java/lang/Throwable
    //   2289	2302	2305	java/lang/Throwable
    //   2294	2317	2320	java/lang/Throwable
    //   2309	2335	2338	java/lang/Throwable
    //   2324	2365	2368	java/lang/Throwable
    //   2431	2458	2461	java/lang/Throwable
    //   2448	2476	2479	java/lang/Throwable
    //   2465	2506	2509	java/lang/Throwable
    //   2483	2517	2517	java/lang/Throwable
    //   2539	2550	2553	java/lang/Throwable
    //   2563	3289	3290	java/lang/Throwable
    //   2653	2667	2667	java/lang/Throwable
    //   2678	2691	2694	java/lang/Throwable
    //   2683	2706	2709	java/lang/Throwable
    //   2698	2724	2727	java/lang/Throwable
    //   2713	2754	2757	java/lang/Throwable
    //   2820	2847	2850	java/lang/Throwable
    //   2837	2865	2868	java/lang/Throwable
    //   2854	2895	2898	java/lang/Throwable
    //   2872	2906	2906	java/lang/Throwable
    //   2928	2939	2942	java/lang/Throwable
    //   2995	3009	3009	java/lang/Throwable
    //   3020	3033	3036	java/lang/Throwable
    //   3025	3048	3051	java/lang/Throwable
    //   3040	3066	3069	java/lang/Throwable
    //   3055	3096	3099	java/lang/Throwable
    //   3162	3189	3192	java/lang/Throwable
    //   3179	3207	3210	java/lang/Throwable
    //   3196	3237	3240	java/lang/Throwable
    //   3214	3248	3248	java/lang/Throwable
    //   3270	3281	3284	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'äR!ìlæ¸wM\\to¶PpBu}^³\\tý×÷ßc\\tßv³µ]Fk\\tIWÚoÏ\\tÑÔ¸á+L\\t&/b­7\G\\t§ÊIÿa>+\\t!ëÛ{ B¯H\\tR÷¶ÛâÛ"\\bÑÙ¸È!°\\t-ß]KÐ\ã¢Mò\\tÌí$Ì¬ó\\tVwä¦çÿL+\\táë(I¥W g7éÛÔ|?$W³YG¤Óø¬Þæû·*®¡\\tº\ñÃEFü\\t¥Î\\ti8 ;a²Gvu9z­í>x\\bÖäªH&r©ñ½\\bÝcùT\\tHÏ´_Þñ¯ÚM¢ãWAßPDº0,'¬;äc½{¶²ØõR,0¿rø3 ÕY×²+\\t¤\\nü:í[1,­xk>Óf×Ì¯C§¾^â\\t;Ú÷\\\n¿'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
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
    //   68: ldc '¥OÕ\\tÿ^Ø÷É]'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #53
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
    //   128: putstatic burp/Zzpj.a : [Ljava/lang/String;
    //   131: bipush #25
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zzpj.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #30
    //   214: goto -> 243
    //   217: bipush #40
    //   219: goto -> 243
    //   222: bipush #43
    //   224: goto -> 243
    //   227: iconst_1
    //   228: goto -> 243
    //   231: bipush #54
    //   233: goto -> 243
    //   236: bipush #118
    //   238: goto -> 243
    //   241: bipush #125
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 98
    //   300: sipush #8255
    //   303: sipush #-9726
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zzpj.ZR : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #100
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #-12
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #71
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #90
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #89
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #10
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #-75
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #55
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #65
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #-92
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #-124
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #18
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #-94
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #56
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #-124
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-83
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #116
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #-44
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #126
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #75
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #-46
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #-9
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #-10
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #18
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #24
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #85
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #123
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #100
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #26
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #-15
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #-18
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #-83
    //   505: bastore
    //   506: invokespecial <init> : ([B)V
    //   509: putstatic burp/Zzpj.ZI : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x202C) & 0xFFFF;
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
      byte b1 = 42;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzpj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */