package burp;

import java.math.BigInteger;

class Zzh1 extends ClassLoader {
  static String Zn;
  
  static Object Zf;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zd(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zy(Object paramObject) {
    Zl8i.Zb = a(-5035, -20558);
    Zl8i.ZY = new BigInteger(a(-5030, -19128));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zkgp.ZM.charAt(Math.abs(((BigInteger)Zkgp.Zw).intValue() % 32)) > Zl8i.Zb.charAt(Math.abs(((BigInteger)Zgjj.ZW).intValue() % 32))) {
          try {
            Zb0s.Zy(Class.forName(a(-5037, 8249)));
            if (bool)
              Zg6f.Ze(Class.forName(a(-5031, -23481))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zg6f.Ze(Class.forName(a(-5031, -23481)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zo(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: sipush #-5029
    //   7: sipush #-23096
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokestatic ZE : (Ljava/lang/Object;)V
    //   19: sipush #-5032
    //   22: getstatic burp/Zlnq.ZO : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: getstatic burp/Zlfg.Zv : Ljava/lang/Object;
    //   31: checkcast java/math/BigInteger
    //   34: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   37: putstatic burp/Zxxf.ZZ : Ljava/lang/Object;
    //   40: sipush #-12440
    //   43: getstatic burp/Ztg3.Zg : Ljava/lang/Object;
    //   46: checkcast java/math/BigInteger
    //   49: getstatic burp/Zz8o.Zg : Ljava/lang/Object;
    //   52: checkcast java/math/BigInteger
    //   55: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   58: putstatic burp/Zl6z.Zt : Ljava/lang/Object;
    //   61: invokestatic a : (II)Ljava/lang/String;
    //   64: iconst_1
    //   65: ldc burp/Zbqk
    //   67: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   70: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   73: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   76: astore_3
    //   77: aload_3
    //   78: arraylength
    //   79: istore #4
    //   81: iconst_0
    //   82: istore #5
    //   84: iload #5
    //   86: iload #4
    //   88: if_icmpge -> 225
    //   91: aload_3
    //   92: iload #5
    //   94: aaload
    //   95: astore #6
    //   97: aload #6
    //   99: invokevirtual getModifiers : ()I
    //   102: invokestatic isStatic : (I)Z
    //   105: ifne -> 115
    //   108: goto -> 218
    //   111: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   114: athrow
    //   115: aload #6
    //   117: invokevirtual getType : ()Ljava/lang/Class;
    //   120: astore #7
    //   122: aload #7
    //   124: ifnull -> 205
    //   127: aload #7
    //   129: invokevirtual isPrimitive : ()Z
    //   132: ifne -> 205
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   141: athrow
    //   142: aload #7
    //   144: invokevirtual getPackage : ()Ljava/lang/Package;
    //   147: ifnull -> 205
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   156: athrow
    //   157: aload #7
    //   159: invokevirtual getPackage : ()Ljava/lang/Package;
    //   162: invokevirtual getName : ()Ljava/lang/String;
    //   165: ifnull -> 205
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   174: athrow
    //   175: aload #7
    //   177: invokevirtual getPackage : ()Ljava/lang/Package;
    //   180: invokevirtual getName : ()Ljava/lang/String;
    //   183: sipush #-5038
    //   186: sipush #3022
    //   189: invokestatic a : (II)Ljava/lang/String;
    //   192: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   195: ifne -> 205
    //   198: goto -> 205
    //   201: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   204: athrow
    //   205: aload #6
    //   207: iconst_1
    //   208: invokevirtual setAccessible : (Z)V
    //   211: aload #6
    //   213: aconst_null
    //   214: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   217: pop
    //   218: iinc #5, 1
    //   221: iload_2
    //   222: ifeq -> 84
    //   225: sipush #-5034
    //   228: sipush #28721
    //   231: invokestatic a : (II)Ljava/lang/String;
    //   234: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   237: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   240: astore_3
    //   241: aload_3
    //   242: arraylength
    //   243: istore #4
    //   245: iconst_0
    //   246: istore #5
    //   248: iload #5
    //   250: iload #4
    //   252: if_icmpge -> 363
    //   255: aload_3
    //   256: iload #5
    //   258: aaload
    //   259: astore #6
    //   261: aload #6
    //   263: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   266: pop
    //   267: aload #6
    //   269: invokevirtual getModifiers : ()I
    //   272: invokestatic isStatic : (I)Z
    //   275: ifeq -> 349
    //   278: aload #6
    //   280: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   283: arraylength
    //   284: iconst_2
    //   285: if_icmpne -> 349
    //   288: goto -> 295
    //   291: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   294: athrow
    //   295: aload #6
    //   297: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   300: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   303: if_acmpne -> 349
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   312: athrow
    //   313: aload #6
    //   315: iconst_1
    //   316: invokevirtual setAccessible : (Z)V
    //   319: aload #6
    //   321: aconst_null
    //   322: iconst_2
    //   323: anewarray java/lang/Object
    //   326: dup
    //   327: iconst_0
    //   328: aload_0
    //   329: aastore
    //   330: dup
    //   331: iconst_1
    //   332: aload_1
    //   333: aastore
    //   334: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   337: pop
    //   338: iload_2
    //   339: ifeq -> 363
    //   342: goto -> 349
    //   345: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   348: athrow
    //   349: iinc #5, 1
    //   352: iload_2
    //   353: ifeq -> 248
    //   356: goto -> 363
    //   359: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   362: athrow
    //   363: sipush #-5036
    //   366: sipush #-15474
    //   369: invokestatic a : (II)Ljava/lang/String;
    //   372: iconst_1
    //   373: ldc burp/Zkff
    //   375: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   378: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   381: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   384: astore_3
    //   385: aload_3
    //   386: arraylength
    //   387: istore #4
    //   389: iconst_0
    //   390: istore #5
    //   392: iload #5
    //   394: iload #4
    //   396: if_icmpge -> 533
    //   399: aload_3
    //   400: iload #5
    //   402: aaload
    //   403: astore #6
    //   405: aload #6
    //   407: invokevirtual getModifiers : ()I
    //   410: invokestatic isStatic : (I)Z
    //   413: ifne -> 423
    //   416: goto -> 526
    //   419: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   422: athrow
    //   423: aload #6
    //   425: invokevirtual getType : ()Ljava/lang/Class;
    //   428: astore #7
    //   430: aload #7
    //   432: ifnull -> 513
    //   435: aload #7
    //   437: invokevirtual isPrimitive : ()Z
    //   440: ifne -> 513
    //   443: goto -> 450
    //   446: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   449: athrow
    //   450: aload #7
    //   452: invokevirtual getPackage : ()Ljava/lang/Package;
    //   455: ifnull -> 513
    //   458: goto -> 465
    //   461: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   464: athrow
    //   465: aload #7
    //   467: invokevirtual getPackage : ()Ljava/lang/Package;
    //   470: invokevirtual getName : ()Ljava/lang/String;
    //   473: ifnull -> 513
    //   476: goto -> 483
    //   479: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   482: athrow
    //   483: aload #7
    //   485: invokevirtual getPackage : ()Ljava/lang/Package;
    //   488: invokevirtual getName : ()Ljava/lang/String;
    //   491: sipush #-5040
    //   494: sipush #-11730
    //   497: invokestatic a : (II)Ljava/lang/String;
    //   500: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   503: ifne -> 513
    //   506: goto -> 513
    //   509: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   512: athrow
    //   513: aload #6
    //   515: iconst_1
    //   516: invokevirtual setAccessible : (Z)V
    //   519: aload #6
    //   521: aconst_null
    //   522: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   525: pop
    //   526: iinc #5, 1
    //   529: iload_2
    //   530: ifeq -> 392
    //   533: sipush #-5033
    //   536: sipush #-29454
    //   539: invokestatic a : (II)Ljava/lang/String;
    //   542: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   545: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   548: astore_3
    //   549: aload_3
    //   550: arraylength
    //   551: istore #4
    //   553: iconst_0
    //   554: istore #5
    //   556: iload #5
    //   558: iload #4
    //   560: if_icmpge -> 692
    //   563: aload_3
    //   564: iload #5
    //   566: aaload
    //   567: astore #6
    //   569: aload #6
    //   571: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   574: pop
    //   575: aload #6
    //   577: invokevirtual getModifiers : ()I
    //   580: invokestatic isStatic : (I)Z
    //   583: ifeq -> 678
    //   586: aload #6
    //   588: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   591: arraylength
    //   592: iconst_2
    //   593: if_icmpne -> 678
    //   596: goto -> 603
    //   599: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   602: athrow
    //   603: aload #6
    //   605: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   608: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   611: invokevirtual equals : (Ljava/lang/Object;)Z
    //   614: ifeq -> 678
    //   617: goto -> 624
    //   620: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   623: athrow
    //   624: aload #6
    //   626: iconst_1
    //   627: invokevirtual setAccessible : (Z)V
    //   630: aload #6
    //   632: aconst_null
    //   633: iconst_2
    //   634: anewarray java/lang/Object
    //   637: dup
    //   638: iconst_0
    //   639: aload_0
    //   640: aastore
    //   641: dup
    //   642: iconst_1
    //   643: aload_1
    //   644: ifnonnull -> 662
    //   647: goto -> 654
    //   650: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   653: athrow
    //   654: aload_1
    //   655: goto -> 669
    //   658: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   661: athrow
    //   662: aload_1
    //   663: checkcast [B
    //   666: invokevirtual clone : ()Ljava/lang/Object;
    //   669: aastore
    //   670: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   673: pop
    //   674: iload_2
    //   675: ifeq -> 692
    //   678: iinc #5, 1
    //   681: iload_2
    //   682: ifeq -> 556
    //   685: goto -> 692
    //   688: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   691: athrow
    //   692: getstatic burp/Zdk.Ze : Ljava/lang/String;
    //   695: getstatic burp/Ztmy.ZH : Ljava/lang/Object;
    //   698: checkcast java/math/BigInteger
    //   701: invokevirtual intValue : ()I
    //   704: bipush #32
    //   706: irem
    //   707: invokestatic abs : (I)I
    //   710: invokevirtual charAt : (I)C
    //   713: getstatic burp/Ztdg.ZS : Ljava/lang/String;
    //   716: getstatic burp/Zlgh.Zd : Ljava/lang/Object;
    //   719: checkcast java/math/BigInteger
    //   722: invokevirtual intValue : ()I
    //   725: bipush #32
    //   727: irem
    //   728: invokestatic abs : (I)I
    //   731: invokevirtual charAt : (I)C
    //   734: if_icmple -> 849
    //   737: getstatic burp/Zlbt.ZE : Ljava/lang/String;
    //   740: getstatic burp/Zsf7.Zg : Ljava/lang/Object;
    //   743: checkcast java/math/BigInteger
    //   746: invokevirtual intValue : ()I
    //   749: bipush #32
    //   751: irem
    //   752: invokestatic abs : (I)I
    //   755: invokevirtual charAt : (I)C
    //   758: getstatic burp/Zzmc.Zr : Ljava/lang/String;
    //   761: getstatic burp/Zsm3.ZC : Ljava/lang/Object;
    //   764: checkcast java/math/BigInteger
    //   767: invokevirtual intValue : ()I
    //   770: bipush #32
    //   772: irem
    //   773: invokestatic abs : (I)I
    //   776: invokevirtual charAt : (I)C
    //   779: if_icmpgt -> 849
    //   782: goto -> 789
    //   785: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   788: athrow
    //   789: getstatic burp/Zza3.ZU : Ljava/lang/String;
    //   792: getstatic burp/Ztkc.ZV : Ljava/lang/Object;
    //   795: checkcast java/math/BigInteger
    //   798: invokevirtual intValue : ()I
    //   801: bipush #32
    //   803: irem
    //   804: invokestatic abs : (I)I
    //   807: invokevirtual charAt : (I)C
    //   810: getstatic burp/Zghe.Zi : Ljava/lang/String;
    //   813: getstatic burp/Zm7y.Zr : Ljava/lang/Object;
    //   816: checkcast java/math/BigInteger
    //   819: invokevirtual intValue : ()I
    //   822: bipush #32
    //   824: irem
    //   825: invokestatic abs : (I)I
    //   828: invokevirtual charAt : (I)C
    //   831: if_icmple -> 849
    //   834: goto -> 841
    //   837: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   840: athrow
    //   841: iconst_1
    //   842: goto -> 850
    //   845: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   848: athrow
    //   849: iconst_0
    //   850: ireturn
    //   851: astore_3
    //   852: new java/lang/Exception
    //   855: dup
    //   856: aload_3
    //   857: invokevirtual getMessage : ()Ljava/lang/String;
    //   860: invokespecial <init> : (Ljava/lang/String;)V
    //   863: athrow
    // Exception table:
    //   from	to	target	type
    //   4	850	851	java/lang/Throwable
    //   97	111	111	java/lang/Throwable
    //   122	135	138	java/lang/Throwable
    //   127	150	153	java/lang/Throwable
    //   142	168	171	java/lang/Throwable
    //   157	198	201	java/lang/Throwable
    //   261	288	291	java/lang/Throwable
    //   278	306	309	java/lang/Throwable
    //   295	342	345	java/lang/Throwable
    //   313	356	359	java/lang/Throwable
    //   405	419	419	java/lang/Throwable
    //   430	443	446	java/lang/Throwable
    //   435	458	461	java/lang/Throwable
    //   450	476	479	java/lang/Throwable
    //   465	506	509	java/lang/Throwable
    //   569	596	599	java/lang/Throwable
    //   586	617	620	java/lang/Throwable
    //   603	647	650	java/lang/Throwable
    //   624	658	658	java/lang/Throwable
    //   669	685	688	java/lang/Throwable
    //   692	782	785	java/lang/Throwable
    //   737	834	837	java/lang/Throwable
    //   789	845	845	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Æ"c;¸kA|çe3öÚv©;õg®(»ð>¹ÿr0Ë\\tìÂá%ÀsY¡® hæõ¸»cCÜ|À}: ÅÑÕt+ÙlJ$r\\fññ\\tØüÔÔ"µ\\t(+ÊàØÝ½ª\\tðÞÑ^»\\nÖ=5\\tú6C©Ì\\t`¦ÃQùë<'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #78
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
    //   68: ldc '(b~}úÚUOMußÖ5í¶¸ÛÖ\\tD_ NàC´ÿÖÆº¡DÛ¯BÖ]QIð©È-f!vfzXpÆÌ:Vdæ:zW¾úÙSÌìÁLF¥n(Ph'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #17
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
    //   129: putstatic burp/Zzh1.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zzh1.b : [Ljava/lang/String;
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
    //   212: bipush #104
    //   214: goto -> 244
    //   217: bipush #22
    //   219: goto -> 244
    //   222: bipush #25
    //   224: goto -> 244
    //   227: bipush #107
    //   229: goto -> 244
    //   232: bipush #55
    //   234: goto -> 244
    //   237: bipush #15
    //   239: goto -> 244
    //   242: bipush #71
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
    //   300: sipush #-5039
    //   303: sipush #-16613
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zzh1.Zn : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #83
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #65
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #-111
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #-67
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: iconst_4
    //   343: bastore
    //   344: dup
    //   345: iconst_5
    //   346: bipush #-33
    //   348: bastore
    //   349: dup
    //   350: bipush #6
    //   352: bipush #-117
    //   354: bastore
    //   355: dup
    //   356: bipush #7
    //   358: bipush #25
    //   360: bastore
    //   361: dup
    //   362: bipush #8
    //   364: bipush #45
    //   366: bastore
    //   367: dup
    //   368: bipush #9
    //   370: bipush #75
    //   372: bastore
    //   373: dup
    //   374: bipush #10
    //   376: bipush #120
    //   378: bastore
    //   379: dup
    //   380: bipush #11
    //   382: bipush #106
    //   384: bastore
    //   385: dup
    //   386: bipush #12
    //   388: bipush #107
    //   390: bastore
    //   391: dup
    //   392: bipush #13
    //   394: bipush #-73
    //   396: bastore
    //   397: dup
    //   398: bipush #14
    //   400: iconst_m1
    //   401: bastore
    //   402: dup
    //   403: bipush #15
    //   405: bipush #-2
    //   407: bastore
    //   408: dup
    //   409: bipush #16
    //   411: iconst_4
    //   412: bastore
    //   413: dup
    //   414: bipush #17
    //   416: bipush #-106
    //   418: bastore
    //   419: dup
    //   420: bipush #18
    //   422: bipush #125
    //   424: bastore
    //   425: dup
    //   426: bipush #19
    //   428: bipush #53
    //   430: bastore
    //   431: dup
    //   432: bipush #20
    //   434: bipush #-52
    //   436: bastore
    //   437: dup
    //   438: bipush #21
    //   440: bipush #110
    //   442: bastore
    //   443: dup
    //   444: bipush #22
    //   446: bipush #-70
    //   448: bastore
    //   449: dup
    //   450: bipush #23
    //   452: bipush #112
    //   454: bastore
    //   455: dup
    //   456: bipush #24
    //   458: bipush #62
    //   460: bastore
    //   461: dup
    //   462: bipush #25
    //   464: iconst_m1
    //   465: bastore
    //   466: dup
    //   467: bipush #26
    //   469: bipush #-66
    //   471: bastore
    //   472: dup
    //   473: bipush #27
    //   475: bipush #-71
    //   477: bastore
    //   478: dup
    //   479: bipush #28
    //   481: bipush #-71
    //   483: bastore
    //   484: dup
    //   485: bipush #29
    //   487: bipush #113
    //   489: bastore
    //   490: dup
    //   491: bipush #30
    //   493: bipush #-69
    //   495: bastore
    //   496: dup
    //   497: bipush #31
    //   499: bipush #-122
    //   501: bastore
    //   502: invokespecial <init> : ([B)V
    //   505: putstatic burp/Zzh1.Zf : Ljava/lang/Object;
    //   508: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFEC51) & 0xFFFF;
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
      byte b1 = 0;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzh1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */