package burp;

import java.math.BigInteger;

class Zzht extends ClassLoader {
  static String Zv;
  
  static Object Zb;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZK(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zg0f.Zm : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zl1e.Zp : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Ztq4.ZA : Ljava/lang/Object;
    //   22: sipush #23217
    //   25: getstatic burp/Ztdl.Zw : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: getstatic burp/Zk9q.ZH : Ljava/lang/Object;
    //   34: checkcast java/math/BigInteger
    //   37: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   40: putstatic burp/Zz0f.ZL : Ljava/lang/Object;
    //   43: bipush #30
    //   45: invokestatic a : (II)Ljava/lang/String;
    //   48: iconst_1
    //   49: ldc burp/Zr1t
    //   51: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   54: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   57: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   60: astore_3
    //   61: aload_3
    //   62: arraylength
    //   63: istore #4
    //   65: iconst_0
    //   66: istore #5
    //   68: iload #5
    //   70: iload #4
    //   72: if_icmpge -> 209
    //   75: aload_3
    //   76: iload #5
    //   78: aaload
    //   79: astore #6
    //   81: aload #6
    //   83: invokevirtual getModifiers : ()I
    //   86: invokestatic isStatic : (I)Z
    //   89: ifne -> 99
    //   92: goto -> 202
    //   95: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   98: athrow
    //   99: aload #6
    //   101: invokevirtual getType : ()Ljava/lang/Class;
    //   104: astore #7
    //   106: aload #7
    //   108: ifnull -> 189
    //   111: aload #7
    //   113: invokevirtual isPrimitive : ()Z
    //   116: ifne -> 189
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   125: athrow
    //   126: aload #7
    //   128: invokevirtual getPackage : ()Ljava/lang/Package;
    //   131: ifnull -> 189
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   140: athrow
    //   141: aload #7
    //   143: invokevirtual getPackage : ()Ljava/lang/Package;
    //   146: invokevirtual getName : ()Ljava/lang/String;
    //   149: ifnull -> 189
    //   152: goto -> 159
    //   155: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   158: athrow
    //   159: aload #7
    //   161: invokevirtual getPackage : ()Ljava/lang/Package;
    //   164: invokevirtual getName : ()Ljava/lang/String;
    //   167: sipush #23223
    //   170: sipush #-28427
    //   173: invokestatic a : (II)Ljava/lang/String;
    //   176: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   179: ifne -> 189
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   188: athrow
    //   189: aload #6
    //   191: iconst_1
    //   192: invokevirtual setAccessible : (Z)V
    //   195: aload #6
    //   197: aconst_null
    //   198: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   201: pop
    //   202: iinc #5, 1
    //   205: iload_2
    //   206: ifne -> 68
    //   209: sipush #23221
    //   212: sipush #-13029
    //   215: invokestatic a : (II)Ljava/lang/String;
    //   218: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   221: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   224: astore_3
    //   225: aload_3
    //   226: arraylength
    //   227: istore #4
    //   229: iconst_0
    //   230: istore #5
    //   232: iload #5
    //   234: iload #4
    //   236: if_icmpge -> 368
    //   239: aload_3
    //   240: iload #5
    //   242: aaload
    //   243: astore #6
    //   245: aload #6
    //   247: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   250: pop
    //   251: aload #6
    //   253: invokevirtual getModifiers : ()I
    //   256: invokestatic isStatic : (I)Z
    //   259: ifeq -> 354
    //   262: aload #6
    //   264: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   267: arraylength
    //   268: iconst_2
    //   269: if_icmpne -> 354
    //   272: goto -> 279
    //   275: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   278: athrow
    //   279: aload #6
    //   281: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   284: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   287: invokevirtual equals : (Ljava/lang/Object;)Z
    //   290: ifeq -> 354
    //   293: goto -> 300
    //   296: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   299: athrow
    //   300: aload #6
    //   302: iconst_1
    //   303: invokevirtual setAccessible : (Z)V
    //   306: aload #6
    //   308: aconst_null
    //   309: iconst_2
    //   310: anewarray java/lang/Object
    //   313: dup
    //   314: iconst_0
    //   315: aload_0
    //   316: aastore
    //   317: dup
    //   318: iconst_1
    //   319: aload_1
    //   320: ifnonnull -> 338
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   329: athrow
    //   330: aload_1
    //   331: goto -> 345
    //   334: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   337: athrow
    //   338: aload_1
    //   339: checkcast [B
    //   342: invokevirtual clone : ()Ljava/lang/Object;
    //   345: aastore
    //   346: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   349: pop
    //   350: iload_2
    //   351: ifne -> 368
    //   354: iinc #5, 1
    //   357: iload_2
    //   358: ifne -> 232
    //   361: goto -> 368
    //   364: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   367: athrow
    //   368: getstatic burp/Zz0b.ZT : Ljava/lang/Object;
    //   371: checkcast java/math/BigInteger
    //   374: invokevirtual intValue : ()I
    //   377: i2l
    //   378: invokestatic currentTimeMillis : ()J
    //   381: ladd
    //   382: getstatic burp/Zb3d.Zw : Ljava/lang/Object;
    //   385: checkcast java/math/BigInteger
    //   388: invokevirtual intValue : ()I
    //   391: i2l
    //   392: lcmp
    //   393: ifge -> 725
    //   396: sipush #23218
    //   399: sipush #-703
    //   402: invokestatic a : (II)Ljava/lang/String;
    //   405: iconst_1
    //   406: ldc burp/Zry0
    //   408: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   411: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   414: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   417: astore_3
    //   418: aload_3
    //   419: arraylength
    //   420: istore #4
    //   422: iconst_0
    //   423: istore #5
    //   425: iload #5
    //   427: iload #4
    //   429: if_icmpge -> 566
    //   432: aload_3
    //   433: iload #5
    //   435: aaload
    //   436: astore #6
    //   438: aload #6
    //   440: invokevirtual getModifiers : ()I
    //   443: invokestatic isStatic : (I)Z
    //   446: ifne -> 456
    //   449: goto -> 559
    //   452: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   455: athrow
    //   456: aload #6
    //   458: invokevirtual getType : ()Ljava/lang/Class;
    //   461: astore #7
    //   463: aload #7
    //   465: ifnull -> 546
    //   468: aload #7
    //   470: invokevirtual isPrimitive : ()Z
    //   473: ifne -> 546
    //   476: goto -> 483
    //   479: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   482: athrow
    //   483: aload #7
    //   485: invokevirtual getPackage : ()Ljava/lang/Package;
    //   488: ifnull -> 546
    //   491: goto -> 498
    //   494: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   497: athrow
    //   498: aload #7
    //   500: invokevirtual getPackage : ()Ljava/lang/Package;
    //   503: invokevirtual getName : ()Ljava/lang/String;
    //   506: ifnull -> 546
    //   509: goto -> 516
    //   512: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   515: athrow
    //   516: aload #7
    //   518: invokevirtual getPackage : ()Ljava/lang/Package;
    //   521: invokevirtual getName : ()Ljava/lang/String;
    //   524: sipush #23216
    //   527: sipush #20002
    //   530: invokestatic a : (II)Ljava/lang/String;
    //   533: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   536: ifne -> 546
    //   539: goto -> 546
    //   542: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   545: athrow
    //   546: aload #6
    //   548: iconst_1
    //   549: invokevirtual setAccessible : (Z)V
    //   552: aload #6
    //   554: aconst_null
    //   555: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   558: pop
    //   559: iinc #5, 1
    //   562: iload_2
    //   563: ifne -> 425
    //   566: sipush #23228
    //   569: sipush #16014
    //   572: invokestatic a : (II)Ljava/lang/String;
    //   575: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   578: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   581: astore_3
    //   582: aload_3
    //   583: arraylength
    //   584: istore #4
    //   586: iconst_0
    //   587: istore #5
    //   589: iload #5
    //   591: iload #4
    //   593: if_icmpge -> 725
    //   596: aload_3
    //   597: iload #5
    //   599: aaload
    //   600: astore #6
    //   602: aload #6
    //   604: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   607: pop
    //   608: aload #6
    //   610: invokevirtual getModifiers : ()I
    //   613: invokestatic isStatic : (I)Z
    //   616: ifeq -> 711
    //   619: aload #6
    //   621: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   624: arraylength
    //   625: iconst_2
    //   626: if_icmpne -> 711
    //   629: goto -> 636
    //   632: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   635: athrow
    //   636: aload #6
    //   638: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   641: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   644: invokevirtual equals : (Ljava/lang/Object;)Z
    //   647: ifeq -> 711
    //   650: goto -> 657
    //   653: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   656: athrow
    //   657: aload #6
    //   659: iconst_1
    //   660: invokevirtual setAccessible : (Z)V
    //   663: aload #6
    //   665: aconst_null
    //   666: iconst_2
    //   667: anewarray java/lang/Object
    //   670: dup
    //   671: iconst_0
    //   672: aload_0
    //   673: aastore
    //   674: dup
    //   675: iconst_1
    //   676: aload_1
    //   677: ifnonnull -> 695
    //   680: goto -> 687
    //   683: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   686: athrow
    //   687: aload_1
    //   688: goto -> 702
    //   691: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   694: athrow
    //   695: aload_1
    //   696: checkcast [B
    //   699: invokevirtual clone : ()Ljava/lang/Object;
    //   702: aastore
    //   703: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   706: pop
    //   707: iload_2
    //   708: ifne -> 725
    //   711: iinc #5, 1
    //   714: iload_2
    //   715: ifne -> 589
    //   718: goto -> 725
    //   721: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   724: athrow
    //   725: getstatic burp/Zetf.Zo : Ljava/lang/String;
    //   728: getstatic burp/Ze4w.Zd : Ljava/lang/Object;
    //   731: checkcast java/math/BigInteger
    //   734: invokevirtual intValue : ()I
    //   737: bipush #32
    //   739: irem
    //   740: invokestatic abs : (I)I
    //   743: invokevirtual charAt : (I)C
    //   746: getstatic burp/Zrle.ZG : Ljava/lang/String;
    //   749: getstatic burp/Zkeb.ZH : Ljava/lang/Object;
    //   752: checkcast java/math/BigInteger
    //   755: invokevirtual intValue : ()I
    //   758: bipush #32
    //   760: irem
    //   761: invokestatic abs : (I)I
    //   764: invokevirtual charAt : (I)C
    //   767: if_icmpgt -> 882
    //   770: getstatic burp/Zld9.Zx : Ljava/lang/String;
    //   773: getstatic burp/Zr1h.Z_ : Ljava/lang/Object;
    //   776: checkcast java/math/BigInteger
    //   779: invokevirtual intValue : ()I
    //   782: bipush #32
    //   784: irem
    //   785: invokestatic abs : (I)I
    //   788: invokevirtual charAt : (I)C
    //   791: getstatic burp/Ztq4.Zb : Ljava/lang/String;
    //   794: getstatic burp/Ztq4.ZA : Ljava/lang/Object;
    //   797: checkcast java/math/BigInteger
    //   800: invokevirtual intValue : ()I
    //   803: bipush #32
    //   805: irem
    //   806: invokestatic abs : (I)I
    //   809: invokevirtual charAt : (I)C
    //   812: if_icmple -> 882
    //   815: goto -> 822
    //   818: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   821: athrow
    //   822: getstatic burp/Zsbo.Zg : Ljava/lang/String;
    //   825: getstatic burp/Zlwj.ZE : Ljava/lang/Object;
    //   828: checkcast java/math/BigInteger
    //   831: invokevirtual intValue : ()I
    //   834: bipush #32
    //   836: irem
    //   837: invokestatic abs : (I)I
    //   840: invokevirtual charAt : (I)C
    //   843: getstatic burp/Zxln.Zz : Ljava/lang/String;
    //   846: getstatic burp/Zos.ZB : Ljava/lang/Object;
    //   849: checkcast java/math/BigInteger
    //   852: invokevirtual intValue : ()I
    //   855: bipush #32
    //   857: irem
    //   858: invokestatic abs : (I)I
    //   861: invokevirtual charAt : (I)C
    //   864: if_icmple -> 882
    //   867: goto -> 874
    //   870: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   873: athrow
    //   874: iconst_1
    //   875: goto -> 883
    //   878: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   881: athrow
    //   882: iconst_0
    //   883: ireturn
    //   884: astore_3
    //   885: new java/lang/Exception
    //   888: dup
    //   889: aload_3
    //   890: invokevirtual getMessage : ()Ljava/lang/String;
    //   893: invokespecial <init> : (Ljava/lang/String;)V
    //   896: athrow
    // Exception table:
    //   from	to	target	type
    //   4	883	884	java/lang/Throwable
    //   81	95	95	java/lang/Throwable
    //   106	119	122	java/lang/Throwable
    //   111	134	137	java/lang/Throwable
    //   126	152	155	java/lang/Throwable
    //   141	182	185	java/lang/Throwable
    //   245	272	275	java/lang/Throwable
    //   262	293	296	java/lang/Throwable
    //   279	323	326	java/lang/Throwable
    //   300	334	334	java/lang/Throwable
    //   345	361	364	java/lang/Throwable
    //   438	452	452	java/lang/Throwable
    //   463	476	479	java/lang/Throwable
    //   468	491	494	java/lang/Throwable
    //   483	509	512	java/lang/Throwable
    //   498	539	542	java/lang/Throwable
    //   602	629	632	java/lang/Throwable
    //   619	650	653	java/lang/Throwable
    //   636	680	683	java/lang/Throwable
    //   657	691	691	java/lang/Throwable
    //   702	718	721	java/lang/Throwable
    //   725	815	818	java/lang/Throwable
    //   770	867	870	java/lang/Throwable
    //   822	878	878	java/lang/Throwable
  }
  
  static void Zr(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zr(Object paramObject) {
    Zgis.Zh = a(23229, -11138);
    Zgis.ZV = new BigInteger(a(23219, -17037));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zkjj.ZT.charAt(Math.abs(((BigInteger)Zgis.ZV).intValue() % 32)) <= Zkjj.ZT.charAt(Math.abs(((BigInteger)Zgei.ZN).intValue() % 32))) {
          try {
            Zzmc.ZQ(Class.forName(a(23220, -1606)));
            if (bool)
              Zshq.Zf(Class.forName(a(23230, 9744))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zshq.Zf(Class.forName(a(23230, 9744)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '4U[Àf\\fø\\tÀvË§ùa(í Q-¥±ÂE8pò\\t*ö=9eÝöo{\\nh®ánï¤aQÿC\\t¬êF4¢Wf+\\bÂb%©y"L=N'Ð\\fºpía¢¡ÕÅY/\j®¬:.µÎ5- } pWs¥%ÿ\\tïÒ<SÁÖ\\tÜ\\b5Ù¦Â[ÉÅØäË1º*\\bEáÁV5Ð±'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #39
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
    //   68: ldc '"¢±!ä ô¦òRûOeAæÈ:d.{q\\b¹óè{bw'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #14
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
    //   129: putstatic burp/Zzht.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zzht.b : [Ljava/lang/String;
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
    //   212: bipush #24
    //   214: goto -> 244
    //   217: bipush #107
    //   219: goto -> 244
    //   222: bipush #79
    //   224: goto -> 244
    //   227: bipush #108
    //   229: goto -> 244
    //   232: bipush #82
    //   234: goto -> 244
    //   237: bipush #103
    //   239: goto -> 244
    //   242: bipush #19
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
    //   300: sipush #23222
    //   303: sipush #-6015
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zzht.Zv : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #99
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #-60
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #84
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #51
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #97
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #-116
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #47
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #125
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #-14
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #-97
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #-97
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #-100
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #-45
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #-54
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #118
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #85
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #67
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #-100
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #7
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #-2
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #41
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #12
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #115
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #45
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: bipush #-3
    //   464: bastore
    //   465: dup
    //   466: bipush #25
    //   468: bipush #103
    //   470: bastore
    //   471: dup
    //   472: bipush #26
    //   474: bipush #-99
    //   476: bastore
    //   477: dup
    //   478: bipush #27
    //   480: bipush #116
    //   482: bastore
    //   483: dup
    //   484: bipush #28
    //   486: bipush #110
    //   488: bastore
    //   489: dup
    //   490: bipush #29
    //   492: bipush #25
    //   494: bastore
    //   495: dup
    //   496: bipush #30
    //   498: iconst_5
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #-113
    //   505: bastore
    //   506: invokespecial <init> : (I[B)V
    //   509: putstatic burp/Zzht.Zb : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5AB4) & 0xFFFF;
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
      byte b1 = 126;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzht.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */