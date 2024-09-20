package burp;

import java.math.BigInteger;

class Zg0f extends ClassLoader {
  static Object Zm;
  
  static String Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zo(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zi(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zti7.Zw : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zr1h.Z_ : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zxwf.Zi : Ljava/lang/Object;
    //   22: sipush #15835
    //   25: getstatic burp/Zge9.ZT : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: getstatic burp/Ze7e.Z_ : Ljava/lang/Object;
    //   34: checkcast java/math/BigInteger
    //   37: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   40: putstatic burp/Zxn4.Zx : Ljava/lang/Object;
    //   43: sipush #-19949
    //   46: getstatic burp/Zt6z.Zl : Ljava/lang/Object;
    //   49: checkcast java/math/BigInteger
    //   52: getstatic burp/Ztvg.ZO : Ljava/lang/Object;
    //   55: checkcast java/math/BigInteger
    //   58: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   61: putstatic burp/Ztl6.ZQ : Ljava/lang/Object;
    //   64: invokestatic a : (II)Ljava/lang/String;
    //   67: iconst_1
    //   68: ldc burp/Zd0
    //   70: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   73: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   76: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   79: astore_3
    //   80: aload_3
    //   81: arraylength
    //   82: istore #4
    //   84: iconst_0
    //   85: istore #5
    //   87: iload #5
    //   89: iload #4
    //   91: if_icmpge -> 228
    //   94: aload_3
    //   95: iload #5
    //   97: aaload
    //   98: astore #6
    //   100: aload #6
    //   102: invokevirtual getModifiers : ()I
    //   105: invokestatic isStatic : (I)Z
    //   108: ifne -> 118
    //   111: goto -> 221
    //   114: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   117: athrow
    //   118: aload #6
    //   120: invokevirtual getType : ()Ljava/lang/Class;
    //   123: astore #7
    //   125: aload #7
    //   127: ifnull -> 208
    //   130: aload #7
    //   132: invokevirtual isPrimitive : ()Z
    //   135: ifne -> 208
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   144: athrow
    //   145: aload #7
    //   147: invokevirtual getPackage : ()Ljava/lang/Package;
    //   150: ifnull -> 208
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   159: athrow
    //   160: aload #7
    //   162: invokevirtual getPackage : ()Ljava/lang/Package;
    //   165: invokevirtual getName : ()Ljava/lang/String;
    //   168: ifnull -> 208
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   177: athrow
    //   178: aload #7
    //   180: invokevirtual getPackage : ()Ljava/lang/Package;
    //   183: invokevirtual getName : ()Ljava/lang/String;
    //   186: sipush #15839
    //   189: sipush #-14623
    //   192: invokestatic a : (II)Ljava/lang/String;
    //   195: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   198: ifne -> 208
    //   201: goto -> 208
    //   204: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   207: athrow
    //   208: aload #6
    //   210: iconst_1
    //   211: invokevirtual setAccessible : (Z)V
    //   214: aload #6
    //   216: aconst_null
    //   217: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   220: pop
    //   221: iinc #5, 1
    //   224: iload_2
    //   225: ifne -> 87
    //   228: sipush #15824
    //   231: sipush #24564
    //   234: invokestatic a : (II)Ljava/lang/String;
    //   237: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   240: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   243: astore_3
    //   244: aload_3
    //   245: arraylength
    //   246: istore #4
    //   248: iconst_0
    //   249: istore #5
    //   251: iload #5
    //   253: iload #4
    //   255: if_icmpge -> 387
    //   258: aload_3
    //   259: iload #5
    //   261: aaload
    //   262: astore #6
    //   264: aload #6
    //   266: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   269: pop
    //   270: aload #6
    //   272: invokevirtual getModifiers : ()I
    //   275: invokestatic isStatic : (I)Z
    //   278: ifeq -> 373
    //   281: aload #6
    //   283: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   286: arraylength
    //   287: iconst_2
    //   288: if_icmpne -> 373
    //   291: goto -> 298
    //   294: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   297: athrow
    //   298: aload #6
    //   300: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   303: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   306: invokevirtual equals : (Ljava/lang/Object;)Z
    //   309: ifeq -> 373
    //   312: goto -> 319
    //   315: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   318: athrow
    //   319: aload #6
    //   321: iconst_1
    //   322: invokevirtual setAccessible : (Z)V
    //   325: aload #6
    //   327: aconst_null
    //   328: iconst_2
    //   329: anewarray java/lang/Object
    //   332: dup
    //   333: iconst_0
    //   334: aload_0
    //   335: aastore
    //   336: dup
    //   337: iconst_1
    //   338: aload_1
    //   339: ifnonnull -> 357
    //   342: goto -> 349
    //   345: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   348: athrow
    //   349: aload_1
    //   350: goto -> 364
    //   353: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   356: athrow
    //   357: aload_1
    //   358: checkcast [B
    //   361: invokevirtual clone : ()Ljava/lang/Object;
    //   364: aastore
    //   365: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   368: pop
    //   369: iload_2
    //   370: ifne -> 387
    //   373: iinc #5, 1
    //   376: iload_2
    //   377: ifne -> 251
    //   380: goto -> 387
    //   383: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   386: athrow
    //   387: sipush #15837
    //   390: sipush #25229
    //   393: invokestatic a : (II)Ljava/lang/String;
    //   396: iconst_1
    //   397: ldc burp/Zsk4
    //   399: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   402: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   405: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   408: astore_3
    //   409: aload_3
    //   410: arraylength
    //   411: istore #4
    //   413: iconst_0
    //   414: istore #5
    //   416: iload #5
    //   418: iload #4
    //   420: if_icmpge -> 557
    //   423: aload_3
    //   424: iload #5
    //   426: aaload
    //   427: astore #6
    //   429: aload #6
    //   431: invokevirtual getModifiers : ()I
    //   434: invokestatic isStatic : (I)Z
    //   437: ifne -> 447
    //   440: goto -> 550
    //   443: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   446: athrow
    //   447: aload #6
    //   449: invokevirtual getType : ()Ljava/lang/Class;
    //   452: astore #7
    //   454: aload #7
    //   456: ifnull -> 537
    //   459: aload #7
    //   461: invokevirtual isPrimitive : ()Z
    //   464: ifne -> 537
    //   467: goto -> 474
    //   470: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   473: athrow
    //   474: aload #7
    //   476: invokevirtual getPackage : ()Ljava/lang/Package;
    //   479: ifnull -> 537
    //   482: goto -> 489
    //   485: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   488: athrow
    //   489: aload #7
    //   491: invokevirtual getPackage : ()Ljava/lang/Package;
    //   494: invokevirtual getName : ()Ljava/lang/String;
    //   497: ifnull -> 537
    //   500: goto -> 507
    //   503: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   506: athrow
    //   507: aload #7
    //   509: invokevirtual getPackage : ()Ljava/lang/Package;
    //   512: invokevirtual getName : ()Ljava/lang/String;
    //   515: sipush #15825
    //   518: sipush #1371
    //   521: invokestatic a : (II)Ljava/lang/String;
    //   524: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   527: ifne -> 537
    //   530: goto -> 537
    //   533: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   536: athrow
    //   537: aload #6
    //   539: iconst_1
    //   540: invokevirtual setAccessible : (Z)V
    //   543: aload #6
    //   545: aconst_null
    //   546: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   549: pop
    //   550: iinc #5, 1
    //   553: iload_2
    //   554: ifne -> 416
    //   557: sipush #15834
    //   560: sipush #25417
    //   563: invokestatic a : (II)Ljava/lang/String;
    //   566: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   569: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   572: astore_3
    //   573: aload_3
    //   574: arraylength
    //   575: istore #4
    //   577: iconst_0
    //   578: istore #5
    //   580: iload #5
    //   582: iload #4
    //   584: if_icmpge -> 695
    //   587: aload_3
    //   588: iload #5
    //   590: aaload
    //   591: astore #6
    //   593: aload #6
    //   595: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   598: pop
    //   599: aload #6
    //   601: invokevirtual getModifiers : ()I
    //   604: invokestatic isStatic : (I)Z
    //   607: ifeq -> 681
    //   610: aload #6
    //   612: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   615: arraylength
    //   616: iconst_2
    //   617: if_icmpne -> 681
    //   620: goto -> 627
    //   623: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   626: athrow
    //   627: aload #6
    //   629: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   632: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   635: if_acmpne -> 681
    //   638: goto -> 645
    //   641: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   644: athrow
    //   645: aload #6
    //   647: iconst_1
    //   648: invokevirtual setAccessible : (Z)V
    //   651: aload #6
    //   653: aconst_null
    //   654: iconst_2
    //   655: anewarray java/lang/Object
    //   658: dup
    //   659: iconst_0
    //   660: aload_0
    //   661: aastore
    //   662: dup
    //   663: iconst_1
    //   664: aload_1
    //   665: aastore
    //   666: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   669: pop
    //   670: iload_2
    //   671: ifne -> 695
    //   674: goto -> 681
    //   677: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   680: athrow
    //   681: iinc #5, 1
    //   684: iload_2
    //   685: ifne -> 580
    //   688: goto -> 695
    //   691: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   694: athrow
    //   695: getstatic burp/Ztl6.Zb : Ljava/lang/String;
    //   698: getstatic burp/Zreu.Zi : Ljava/lang/Object;
    //   701: checkcast java/math/BigInteger
    //   704: invokevirtual intValue : ()I
    //   707: bipush #32
    //   709: irem
    //   710: invokestatic abs : (I)I
    //   713: invokevirtual charAt : (I)C
    //   716: getstatic burp/Zbx5.Zz : Ljava/lang/String;
    //   719: getstatic burp/Zrjw.Zu : Ljava/lang/Object;
    //   722: checkcast java/math/BigInteger
    //   725: invokevirtual intValue : ()I
    //   728: bipush #32
    //   730: irem
    //   731: invokestatic abs : (I)I
    //   734: invokevirtual charAt : (I)C
    //   737: if_icmpgt -> 852
    //   740: getstatic burp/Zgtd.Zj : Ljava/lang/String;
    //   743: getstatic burp/Ztvy.ZH : Ljava/lang/Object;
    //   746: checkcast java/math/BigInteger
    //   749: invokevirtual intValue : ()I
    //   752: bipush #32
    //   754: irem
    //   755: invokestatic abs : (I)I
    //   758: invokevirtual charAt : (I)C
    //   761: getstatic burp/Zv8l.Zo : Ljava/lang/String;
    //   764: getstatic burp/Ze4w.Zd : Ljava/lang/Object;
    //   767: checkcast java/math/BigInteger
    //   770: invokevirtual intValue : ()I
    //   773: bipush #32
    //   775: irem
    //   776: invokestatic abs : (I)I
    //   779: invokevirtual charAt : (I)C
    //   782: if_icmpgt -> 852
    //   785: goto -> 792
    //   788: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   791: athrow
    //   792: getstatic burp/Ztlo.Zs : Ljava/lang/String;
    //   795: getstatic burp/Ze8j.ZQ : Ljava/lang/Object;
    //   798: checkcast java/math/BigInteger
    //   801: invokevirtual intValue : ()I
    //   804: bipush #32
    //   806: irem
    //   807: invokestatic abs : (I)I
    //   810: invokevirtual charAt : (I)C
    //   813: getstatic burp/Zr_x.ZF : Ljava/lang/String;
    //   816: getstatic burp/Zbun.ZH : Ljava/lang/Object;
    //   819: checkcast java/math/BigInteger
    //   822: invokevirtual intValue : ()I
    //   825: bipush #32
    //   827: irem
    //   828: invokestatic abs : (I)I
    //   831: invokevirtual charAt : (I)C
    //   834: if_icmpgt -> 852
    //   837: goto -> 844
    //   840: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   843: athrow
    //   844: iconst_1
    //   845: goto -> 853
    //   848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   851: athrow
    //   852: iconst_0
    //   853: ireturn
    //   854: astore_3
    //   855: new java/lang/Exception
    //   858: dup
    //   859: aload_3
    //   860: invokevirtual getMessage : ()Ljava/lang/String;
    //   863: invokespecial <init> : (Ljava/lang/String;)V
    //   866: athrow
    // Exception table:
    //   from	to	target	type
    //   4	853	854	java/lang/Throwable
    //   100	114	114	java/lang/Throwable
    //   125	138	141	java/lang/Throwable
    //   130	153	156	java/lang/Throwable
    //   145	171	174	java/lang/Throwable
    //   160	201	204	java/lang/Throwable
    //   264	291	294	java/lang/Throwable
    //   281	312	315	java/lang/Throwable
    //   298	342	345	java/lang/Throwable
    //   319	353	353	java/lang/Throwable
    //   364	380	383	java/lang/Throwable
    //   429	443	443	java/lang/Throwable
    //   454	467	470	java/lang/Throwable
    //   459	482	485	java/lang/Throwable
    //   474	500	503	java/lang/Throwable
    //   489	530	533	java/lang/Throwable
    //   593	620	623	java/lang/Throwable
    //   610	638	641	java/lang/Throwable
    //   627	674	677	java/lang/Throwable
    //   645	688	691	java/lang/Throwable
    //   695	785	788	java/lang/Throwable
    //   740	837	840	java/lang/Throwable
    //   792	848	848	java/lang/Throwable
  }
  
  static void ZI(Object paramObject) {
    Zl2t.Zg = a(15827, -7785);
    Zl2t.ZS = new BigInteger(a(15838, 7356));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Ze4g.Zk.charAt(Math.abs(((BigInteger)Zgu4.Zs).intValue() % 32)) <= Zz4a.ZC.charAt(Math.abs(((BigInteger)Zsn4.ZQ).intValue() % 32))) {
          try {
            Zsvh.ZT(Class.forName(a(15832, -594)));
            if (bool)
              Zmkq.ZP(Class.forName(a(15836, 9918))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zmkq.ZP(Class.forName(a(15836, 9918)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ' »¿¯LüÝInuËHÜaÂ§g@rÂ¹%©î«\\toÔ&`OzÄt\\tßô0dú&\\t¸ÚÜ¡B>6â\\t\\boÊÒfìé\\t{Ë¤ÂúÃsV¥0Ms»ÈáWáÈÍ$BþGçþ'ÂÛ)4BÙ%D6ÐBCÏÅÍçà\\n´ÀÃ N2Ùá§ûg\\f4pQvù[\\r.X_aE&[>'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #92
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
    //   68: ldc '"ÅÑßÜ9 ltÓCcË²W1L\\rx×ðêá­å¿wô¾ha¢ª\\f'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #105
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
    //   129: putstatic burp/Zg0f.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zg0f.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #11
    //   214: goto -> 243
    //   217: bipush #84
    //   219: goto -> 243
    //   222: bipush #33
    //   224: goto -> 243
    //   227: bipush #12
    //   229: goto -> 243
    //   232: bipush #106
    //   234: goto -> 243
    //   237: iconst_4
    //   238: goto -> 243
    //   241: bipush #55
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
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #83
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #37
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #-37
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #-113
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #-99
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #54
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #43
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #56
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #-72
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #-62
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #-116
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #-36
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #70
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #72
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #109
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #63
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #15
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #-80
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #43
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #-99
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #44
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #14
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #41
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #83
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #-48
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #-123
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #-23
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #19
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #77
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #36
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #19
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #-38
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Zg0f.Zm : Ljava/lang/Object;
    //   501: sipush #15833
    //   504: sipush #15557
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Zg0f.Zd : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3DD9) & 0xFFFF;
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
      byte b1 = 15;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg0f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */