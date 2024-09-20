package burp;

import java.math.BigInteger;

class Zrd4 extends ClassLoader {
  static String Zg;
  
  static Object Ze;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zp(Object paramObject) {
    Zmzh.Zm = a(-30779, -24897);
    Zmzh.Zk = new BigInteger(a(-30776, -120));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zmtf.Zx.charAt(Math.abs(((BigInteger)Zeor.Zb).intValue() % 32)) > Zmzh.Zm.charAt(Math.abs(((BigInteger)Zr04.ZB).intValue() % 32))) {
          try {
            Zefm.ZP(Class.forName(a(-30774, -29015)));
            if (!bool)
              Zgfq.Zs(Class.forName(a(-30769, 25065))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgfq.Zs(Class.forName(a(-30769, 25065)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zw(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zlo5.Zf : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zkm0.ZI : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Ze5f.Zh : Ljava/lang/Object;
    //   22: sipush #-30778
    //   25: sipush #-8959
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zlhk
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
    //   150: sipush #-30773
    //   153: sipush #25229
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
    //   192: sipush #-30772
    //   195: sipush #-4278
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
    //   219: if_icmpge -> 348
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
    //   242: ifeq -> 334
    //   245: aload #6
    //   247: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   250: arraylength
    //   251: iconst_2
    //   252: if_icmpne -> 334
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   261: athrow
    //   262: aload #6
    //   264: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   267: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   270: if_acmpne -> 334
    //   273: goto -> 280
    //   276: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   279: athrow
    //   280: aload #6
    //   282: iconst_1
    //   283: invokevirtual setAccessible : (Z)V
    //   286: aload #6
    //   288: aconst_null
    //   289: iconst_2
    //   290: anewarray java/lang/Object
    //   293: dup
    //   294: iconst_0
    //   295: aload_0
    //   296: aastore
    //   297: dup
    //   298: iconst_1
    //   299: aload_1
    //   300: ifnonnull -> 318
    //   303: goto -> 310
    //   306: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   309: athrow
    //   310: aload_1
    //   311: goto -> 325
    //   314: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   317: athrow
    //   318: aload_1
    //   319: checkcast [B
    //   322: invokevirtual clone : ()Ljava/lang/Object;
    //   325: aastore
    //   326: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   329: pop
    //   330: iload_2
    //   331: ifne -> 348
    //   334: iinc #5, 1
    //   337: iload_2
    //   338: ifne -> 215
    //   341: goto -> 348
    //   344: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   347: athrow
    //   348: sipush #-30777
    //   351: sipush #-17195
    //   354: invokestatic a : (II)Ljava/lang/String;
    //   357: iconst_1
    //   358: ldc burp/Zzc7
    //   360: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   363: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   366: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   369: astore_3
    //   370: aload_3
    //   371: arraylength
    //   372: istore #4
    //   374: iconst_0
    //   375: istore #5
    //   377: iload #5
    //   379: iload #4
    //   381: if_icmpge -> 518
    //   384: aload_3
    //   385: iload #5
    //   387: aaload
    //   388: astore #6
    //   390: aload #6
    //   392: invokevirtual getModifiers : ()I
    //   395: invokestatic isStatic : (I)Z
    //   398: ifne -> 408
    //   401: goto -> 511
    //   404: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   407: athrow
    //   408: aload #6
    //   410: invokevirtual getType : ()Ljava/lang/Class;
    //   413: astore #7
    //   415: aload #7
    //   417: ifnull -> 498
    //   420: aload #7
    //   422: invokevirtual isPrimitive : ()Z
    //   425: ifne -> 498
    //   428: goto -> 435
    //   431: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   434: athrow
    //   435: aload #7
    //   437: invokevirtual getPackage : ()Ljava/lang/Package;
    //   440: ifnull -> 498
    //   443: goto -> 450
    //   446: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   449: athrow
    //   450: aload #7
    //   452: invokevirtual getPackage : ()Ljava/lang/Package;
    //   455: invokevirtual getName : ()Ljava/lang/String;
    //   458: ifnull -> 498
    //   461: goto -> 468
    //   464: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   467: athrow
    //   468: aload #7
    //   470: invokevirtual getPackage : ()Ljava/lang/Package;
    //   473: invokevirtual getName : ()Ljava/lang/String;
    //   476: sipush #-30770
    //   479: sipush #19929
    //   482: invokestatic a : (II)Ljava/lang/String;
    //   485: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   488: ifne -> 498
    //   491: goto -> 498
    //   494: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   497: athrow
    //   498: aload #6
    //   500: iconst_1
    //   501: invokevirtual setAccessible : (Z)V
    //   504: aload #6
    //   506: aconst_null
    //   507: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   510: pop
    //   511: iinc #5, 1
    //   514: iload_2
    //   515: ifne -> 377
    //   518: sipush #-30775
    //   521: sipush #21890
    //   524: invokestatic a : (II)Ljava/lang/String;
    //   527: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   530: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   533: astore_3
    //   534: aload_3
    //   535: arraylength
    //   536: istore #4
    //   538: iconst_0
    //   539: istore #5
    //   541: iload #5
    //   543: iload #4
    //   545: if_icmpge -> 677
    //   548: aload_3
    //   549: iload #5
    //   551: aaload
    //   552: astore #6
    //   554: aload #6
    //   556: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   559: pop
    //   560: aload #6
    //   562: invokevirtual getModifiers : ()I
    //   565: invokestatic isStatic : (I)Z
    //   568: ifeq -> 663
    //   571: aload #6
    //   573: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   576: arraylength
    //   577: iconst_2
    //   578: if_icmpne -> 663
    //   581: goto -> 588
    //   584: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   587: athrow
    //   588: aload #6
    //   590: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   593: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   596: invokevirtual equals : (Ljava/lang/Object;)Z
    //   599: ifeq -> 663
    //   602: goto -> 609
    //   605: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   608: athrow
    //   609: aload #6
    //   611: iconst_1
    //   612: invokevirtual setAccessible : (Z)V
    //   615: aload #6
    //   617: aconst_null
    //   618: iconst_2
    //   619: anewarray java/lang/Object
    //   622: dup
    //   623: iconst_0
    //   624: aload_0
    //   625: aastore
    //   626: dup
    //   627: iconst_1
    //   628: aload_1
    //   629: ifnonnull -> 647
    //   632: goto -> 639
    //   635: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   638: athrow
    //   639: aload_1
    //   640: goto -> 654
    //   643: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   646: athrow
    //   647: aload_1
    //   648: checkcast [B
    //   651: invokevirtual clone : ()Ljava/lang/Object;
    //   654: aastore
    //   655: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   658: pop
    //   659: iload_2
    //   660: ifne -> 677
    //   663: iinc #5, 1
    //   666: iload_2
    //   667: ifne -> 541
    //   670: goto -> 677
    //   673: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   676: athrow
    //   677: ldc2_w 8682522807148012
    //   680: invokestatic currentTimeMillis : ()J
    //   683: lxor
    //   684: lstore #4
    //   686: lload #4
    //   688: ldc2_w 25214903917
    //   691: lmul
    //   692: ldc2_w 11
    //   695: ladd
    //   696: ldc2_w 281474976710655
    //   699: land
    //   700: lstore #4
    //   702: lload #4
    //   704: bipush #32
    //   706: lshl
    //   707: lstore #6
    //   709: lload #4
    //   711: ldc2_w 25214903917
    //   714: lmul
    //   715: ldc2_w 11
    //   718: ladd
    //   719: ldc2_w 281474976710655
    //   722: land
    //   723: lstore #4
    //   725: lload #6
    //   727: lload #4
    //   729: ladd
    //   730: lstore #6
    //   732: bipush #16
    //   734: newarray byte
    //   736: dup
    //   737: iconst_0
    //   738: bipush #48
    //   740: bastore
    //   741: dup
    //   742: iconst_1
    //   743: bipush #49
    //   745: bastore
    //   746: dup
    //   747: iconst_2
    //   748: bipush #50
    //   750: bastore
    //   751: dup
    //   752: iconst_3
    //   753: bipush #51
    //   755: bastore
    //   756: dup
    //   757: iconst_4
    //   758: bipush #52
    //   760: bastore
    //   761: dup
    //   762: iconst_5
    //   763: bipush #53
    //   765: bastore
    //   766: dup
    //   767: bipush #6
    //   769: bipush #54
    //   771: bastore
    //   772: dup
    //   773: bipush #7
    //   775: bipush #55
    //   777: bastore
    //   778: dup
    //   779: bipush #8
    //   781: bipush #56
    //   783: bastore
    //   784: dup
    //   785: bipush #9
    //   787: bipush #57
    //   789: bastore
    //   790: dup
    //   791: bipush #10
    //   793: bipush #97
    //   795: bastore
    //   796: dup
    //   797: bipush #11
    //   799: bipush #98
    //   801: bastore
    //   802: dup
    //   803: bipush #12
    //   805: bipush #99
    //   807: bastore
    //   808: dup
    //   809: bipush #13
    //   811: bipush #100
    //   813: bastore
    //   814: dup
    //   815: bipush #14
    //   817: bipush #101
    //   819: bastore
    //   820: dup
    //   821: bipush #15
    //   823: bipush #102
    //   825: bastore
    //   826: astore #8
    //   828: bipush #64
    //   830: newarray byte
    //   832: astore #9
    //   834: bipush #64
    //   836: istore #10
    //   838: bipush #16
    //   840: istore #11
    //   842: iload #11
    //   844: iconst_1
    //   845: isub
    //   846: i2l
    //   847: lstore #12
    //   849: aload #9
    //   851: iinc #10, -1
    //   854: iload #10
    //   856: aload #8
    //   858: lload #6
    //   860: lload #12
    //   862: land
    //   863: l2i
    //   864: baload
    //   865: bastore
    //   866: lload #6
    //   868: iconst_4
    //   869: lushr
    //   870: lstore #6
    //   872: lload #6
    //   874: lconst_0
    //   875: lcmp
    //   876: ifne -> 849
    //   879: bipush #64
    //   881: iload #10
    //   883: isub
    //   884: newarray byte
    //   886: astore_3
    //   887: iconst_0
    //   888: istore #14
    //   890: iload #14
    //   892: aload_3
    //   893: arraylength
    //   894: if_icmpge -> 916
    //   897: aload_3
    //   898: iload #14
    //   900: aload #9
    //   902: iload #10
    //   904: iload #14
    //   906: iadd
    //   907: baload
    //   908: bastore
    //   909: iinc #14, 1
    //   912: iload_2
    //   913: ifne -> 890
    //   916: aload_3
    //   917: arraylength
    //   918: bipush #10
    //   920: if_icmplt -> 686
    //   923: getstatic burp/Zsej.Zd : Ljava/lang/String;
    //   926: getstatic burp/Zx4w.Zp : Ljava/lang/Object;
    //   929: checkcast java/math/BigInteger
    //   932: invokevirtual intValue : ()I
    //   935: bipush #32
    //   937: irem
    //   938: invokestatic abs : (I)I
    //   941: invokevirtual charAt : (I)C
    //   944: getstatic burp/Zsk2.ZE : Ljava/lang/String;
    //   947: getstatic burp/Zrxf.ZS : Ljava/lang/Object;
    //   950: checkcast java/math/BigInteger
    //   953: invokevirtual intValue : ()I
    //   956: bipush #32
    //   958: irem
    //   959: invokestatic abs : (I)I
    //   962: invokevirtual charAt : (I)C
    //   965: if_icmple -> 1080
    //   968: getstatic burp/Zty4.Zu : Ljava/lang/String;
    //   971: getstatic burp/Zgw0.ZM : Ljava/lang/Object;
    //   974: checkcast java/math/BigInteger
    //   977: invokevirtual intValue : ()I
    //   980: bipush #32
    //   982: irem
    //   983: invokestatic abs : (I)I
    //   986: invokevirtual charAt : (I)C
    //   989: getstatic burp/Zxjm.ZG : Ljava/lang/String;
    //   992: getstatic burp/Zsxj.Zi : Ljava/lang/Object;
    //   995: checkcast java/math/BigInteger
    //   998: invokevirtual intValue : ()I
    //   1001: bipush #32
    //   1003: irem
    //   1004: invokestatic abs : (I)I
    //   1007: invokevirtual charAt : (I)C
    //   1010: if_icmple -> 1080
    //   1013: goto -> 1020
    //   1016: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1019: athrow
    //   1020: getstatic burp/Zgs6.ZD : Ljava/lang/String;
    //   1023: getstatic burp/Zg8.ZX : Ljava/lang/Object;
    //   1026: checkcast java/math/BigInteger
    //   1029: invokevirtual intValue : ()I
    //   1032: bipush #32
    //   1034: irem
    //   1035: invokestatic abs : (I)I
    //   1038: invokevirtual charAt : (I)C
    //   1041: getstatic burp/Zkc8.Za : Ljava/lang/String;
    //   1044: getstatic burp/Zeb3.Zb : Ljava/lang/Object;
    //   1047: checkcast java/math/BigInteger
    //   1050: invokevirtual intValue : ()I
    //   1053: bipush #32
    //   1055: irem
    //   1056: invokestatic abs : (I)I
    //   1059: invokevirtual charAt : (I)C
    //   1062: if_icmple -> 1080
    //   1065: goto -> 1072
    //   1068: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1071: athrow
    //   1072: iconst_1
    //   1073: goto -> 1081
    //   1076: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1079: athrow
    //   1080: iconst_0
    //   1081: ireturn
    //   1082: astore_3
    //   1083: new java/lang/Exception
    //   1086: dup
    //   1087: aload_3
    //   1088: invokevirtual getMessage : ()Ljava/lang/String;
    //   1091: invokespecial <init> : (Ljava/lang/String;)V
    //   1094: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1081	1082	java/lang/Throwable
    //   64	78	78	java/lang/Throwable
    //   89	102	105	java/lang/Throwable
    //   94	117	120	java/lang/Throwable
    //   109	135	138	java/lang/Throwable
    //   124	165	168	java/lang/Throwable
    //   228	255	258	java/lang/Throwable
    //   245	273	276	java/lang/Throwable
    //   262	303	306	java/lang/Throwable
    //   280	314	314	java/lang/Throwable
    //   325	341	344	java/lang/Throwable
    //   390	404	404	java/lang/Throwable
    //   415	428	431	java/lang/Throwable
    //   420	443	446	java/lang/Throwable
    //   435	461	464	java/lang/Throwable
    //   450	491	494	java/lang/Throwable
    //   554	581	584	java/lang/Throwable
    //   571	602	605	java/lang/Throwable
    //   588	632	635	java/lang/Throwable
    //   609	643	643	java/lang/Throwable
    //   654	670	673	java/lang/Throwable
    //   923	1013	1016	java/lang/Throwable
    //   968	1065	1068	java/lang/Throwable
    //   1020	1076	1076	java/lang/Throwable
  }
  
  static void Zd(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ôiþïCÈscCQÀJÚ f}ÖïYþò)iZGÓKú©[2ÄÑPKßôÿaÅ\\tÞ»Bë}uÔó¦q\\t³Ó¸^"Ûb#\\të=e?éB¹MmóõÑëp¹S¼ny¾/²QtÀ·!Gè3A*\\f>Ö{9¦?% 4ìh={õTu'ùãTÖ¬O×á.2¨õ,´kB\\\t?%flùHà'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #17
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
    //   68: ldc '÷ÖêlµÌÕh àÕÕµ,JUª¦ã!êÌÍët#²5³kºL9Ú!«þ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #35
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
    //   129: putstatic burp/Zrd4.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrd4.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #16
    //   214: goto -> 243
    //   217: iconst_2
    //   218: goto -> 243
    //   221: bipush #13
    //   223: goto -> 243
    //   226: bipush #26
    //   228: goto -> 243
    //   231: bipush #28
    //   233: goto -> 243
    //   236: bipush #97
    //   238: goto -> 243
    //   241: bipush #39
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
    //   300: sipush #-30771
    //   303: sipush #6946
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zrd4.Zg : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #124
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #-92
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #47
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #82
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-110
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #-52
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #83
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #-75
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #-9
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #-112
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #-59
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #6
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #-40
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #125
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #-95
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #26
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #-8
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #-3
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #86
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #-86
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #-51
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #99
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #-24
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #40
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: bipush #-67
    //   464: bastore
    //   465: dup
    //   466: bipush #25
    //   468: bipush #122
    //   470: bastore
    //   471: dup
    //   472: bipush #26
    //   474: bipush #44
    //   476: bastore
    //   477: dup
    //   478: bipush #27
    //   480: bipush #27
    //   482: bastore
    //   483: dup
    //   484: bipush #28
    //   486: bipush #-100
    //   488: bastore
    //   489: dup
    //   490: bipush #29
    //   492: bipush #30
    //   494: bastore
    //   495: dup
    //   496: bipush #30
    //   498: bipush #-36
    //   500: bastore
    //   501: dup
    //   502: bipush #31
    //   504: bipush #-78
    //   506: bastore
    //   507: invokespecial <init> : (I[B)V
    //   510: putstatic burp/Zrd4.Ze : Ljava/lang/Object;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF87CF) & 0xFFFF;
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
      char c = 'ó';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrd4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */