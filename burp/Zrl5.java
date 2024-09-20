package burp;

import java.math.BigInteger;

class Zrl5 extends ClassLoader {
  static String ZG;
  
  static Object ZI;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zv(Object paramObject) {
    Zer1.ZV = a(22435, -6648);
    Zer1.ZL = new BigInteger(a(22432, -19731));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zz7m.Zq.charAt(Math.abs(((BigInteger)Zeub.ZD).intValue() % 32)) > Zrjq.Zx.charAt(Math.abs(((BigInteger)Zscz.ZN).intValue() % 32))) {
          try {
            Zgp_.ZG(Class.forName(a(22433, 2146)));
            if (!bool)
              Zrd2.Zw(Class.forName(a(22438, -30218))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zrd2.Zw(Class.forName(a(22438, -30218)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zh(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zxn4.Zx : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zrwp.Zk : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zmf6.ZD : Ljava/lang/Object;
    //   22: getstatic burp/Zzmc.Zg : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: getstatic burp/Znu.Zf : Ljava/lang/Object;
    //   31: checkcast java/math/BigInteger
    //   34: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   37: putstatic burp/Zek4.ZR : Ljava/lang/Object;
    //   40: getstatic burp/Zz0b.ZT : Ljava/lang/Object;
    //   43: checkcast java/math/BigInteger
    //   46: invokevirtual toByteArray : ()[B
    //   49: astore_3
    //   50: aload_3
    //   51: arraylength
    //   52: iconst_2
    //   53: iadd
    //   54: newarray byte
    //   56: astore #5
    //   58: iconst_0
    //   59: istore #6
    //   61: iload #6
    //   63: aload_3
    //   64: arraylength
    //   65: if_icmpge -> 84
    //   68: aload #5
    //   70: iload #6
    //   72: aload_3
    //   73: iload #6
    //   75: baload
    //   76: bastore
    //   77: iinc #6, 1
    //   80: iload_2
    //   81: ifeq -> 61
    //   84: aload #5
    //   86: arraylength
    //   87: iconst_3
    //   88: idiv
    //   89: iconst_4
    //   90: imul
    //   91: newarray byte
    //   93: astore #4
    //   95: iconst_0
    //   96: istore #6
    //   98: iconst_0
    //   99: istore #7
    //   101: iload #6
    //   103: aload_3
    //   104: arraylength
    //   105: if_icmpge -> 216
    //   108: aload #4
    //   110: iload #7
    //   112: aload #5
    //   114: iload #6
    //   116: baload
    //   117: iconst_2
    //   118: iushr
    //   119: bipush #63
    //   121: iand
    //   122: i2b
    //   123: bastore
    //   124: aload #4
    //   126: iload #7
    //   128: iconst_1
    //   129: iadd
    //   130: aload #5
    //   132: iload #6
    //   134: iconst_1
    //   135: iadd
    //   136: baload
    //   137: iconst_4
    //   138: iushr
    //   139: bipush #15
    //   141: iand
    //   142: aload #5
    //   144: iload #6
    //   146: baload
    //   147: iconst_4
    //   148: ishl
    //   149: bipush #63
    //   151: iand
    //   152: ior
    //   153: i2b
    //   154: bastore
    //   155: aload #4
    //   157: iload #7
    //   159: iconst_2
    //   160: iadd
    //   161: aload #5
    //   163: iload #6
    //   165: iconst_2
    //   166: iadd
    //   167: baload
    //   168: bipush #6
    //   170: iushr
    //   171: iconst_3
    //   172: iand
    //   173: aload #5
    //   175: iload #6
    //   177: iconst_1
    //   178: iadd
    //   179: baload
    //   180: iconst_2
    //   181: ishl
    //   182: bipush #63
    //   184: iand
    //   185: ior
    //   186: i2b
    //   187: bastore
    //   188: aload #4
    //   190: iload #7
    //   192: iconst_3
    //   193: iadd
    //   194: aload #5
    //   196: iload #6
    //   198: iconst_2
    //   199: iadd
    //   200: baload
    //   201: bipush #63
    //   203: iand
    //   204: i2b
    //   205: bastore
    //   206: iinc #6, 3
    //   209: iinc #7, 4
    //   212: iload_2
    //   213: ifeq -> 101
    //   216: iconst_0
    //   217: istore #6
    //   219: iload #6
    //   221: aload #4
    //   223: arraylength
    //   224: if_icmpge -> 408
    //   227: aload #4
    //   229: iload #6
    //   231: baload
    //   232: bipush #26
    //   234: if_icmpge -> 262
    //   237: aload #4
    //   239: iload #6
    //   241: aload #4
    //   243: iload #6
    //   245: baload
    //   246: bipush #65
    //   248: iadd
    //   249: i2b
    //   250: bastore
    //   251: iload_2
    //   252: ifeq -> 401
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   261: athrow
    //   262: aload #4
    //   264: iload #6
    //   266: baload
    //   267: bipush #52
    //   269: if_icmpge -> 307
    //   272: goto -> 279
    //   275: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   278: athrow
    //   279: aload #4
    //   281: iload #6
    //   283: aload #4
    //   285: iload #6
    //   287: baload
    //   288: bipush #97
    //   290: iadd
    //   291: bipush #26
    //   293: isub
    //   294: i2b
    //   295: bastore
    //   296: iload_2
    //   297: ifeq -> 401
    //   300: goto -> 307
    //   303: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   306: athrow
    //   307: aload #4
    //   309: iload #6
    //   311: baload
    //   312: bipush #62
    //   314: if_icmpge -> 352
    //   317: goto -> 324
    //   320: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   323: athrow
    //   324: aload #4
    //   326: iload #6
    //   328: aload #4
    //   330: iload #6
    //   332: baload
    //   333: bipush #48
    //   335: iadd
    //   336: bipush #52
    //   338: isub
    //   339: i2b
    //   340: bastore
    //   341: iload_2
    //   342: ifeq -> 401
    //   345: goto -> 352
    //   348: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   351: athrow
    //   352: aload #4
    //   354: iload #6
    //   356: baload
    //   357: bipush #63
    //   359: if_icmpge -> 387
    //   362: goto -> 369
    //   365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   368: athrow
    //   369: aload #4
    //   371: iload #6
    //   373: bipush #43
    //   375: bastore
    //   376: iload_2
    //   377: ifeq -> 401
    //   380: goto -> 387
    //   383: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   386: athrow
    //   387: aload #4
    //   389: iload #6
    //   391: bipush #47
    //   393: bastore
    //   394: goto -> 401
    //   397: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   400: athrow
    //   401: iinc #6, 1
    //   404: iload_2
    //   405: ifeq -> 219
    //   408: aload #4
    //   410: arraylength
    //   411: iconst_1
    //   412: isub
    //   413: istore #6
    //   415: iload #6
    //   417: aload_3
    //   418: arraylength
    //   419: iconst_4
    //   420: imul
    //   421: iconst_3
    //   422: idiv
    //   423: if_icmple -> 440
    //   426: aload #4
    //   428: iload #6
    //   430: bipush #61
    //   432: bastore
    //   433: iinc #6, -1
    //   436: iload_2
    //   437: ifeq -> 415
    //   440: new java/math/BigInteger
    //   443: dup
    //   444: aload #4
    //   446: invokespecial <init> : ([B)V
    //   449: invokevirtual abs : ()Ljava/math/BigInteger;
    //   452: putstatic burp/Zxju.ZN : Ljava/lang/Object;
    //   455: sipush #22437
    //   458: sipush #-16499
    //   461: invokestatic a : (II)Ljava/lang/String;
    //   464: iconst_1
    //   465: ldc burp/Zeqr
    //   467: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   470: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   473: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   476: astore_3
    //   477: aload_3
    //   478: arraylength
    //   479: istore #4
    //   481: iconst_0
    //   482: istore #5
    //   484: iload #5
    //   486: iload #4
    //   488: if_icmpge -> 625
    //   491: aload_3
    //   492: iload #5
    //   494: aaload
    //   495: astore #6
    //   497: aload #6
    //   499: invokevirtual getModifiers : ()I
    //   502: invokestatic isStatic : (I)Z
    //   505: ifne -> 515
    //   508: goto -> 618
    //   511: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   514: athrow
    //   515: aload #6
    //   517: invokevirtual getType : ()Ljava/lang/Class;
    //   520: astore #7
    //   522: aload #7
    //   524: ifnull -> 605
    //   527: aload #7
    //   529: invokevirtual isPrimitive : ()Z
    //   532: ifne -> 605
    //   535: goto -> 542
    //   538: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   541: athrow
    //   542: aload #7
    //   544: invokevirtual getPackage : ()Ljava/lang/Package;
    //   547: ifnull -> 605
    //   550: goto -> 557
    //   553: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   556: athrow
    //   557: aload #7
    //   559: invokevirtual getPackage : ()Ljava/lang/Package;
    //   562: invokevirtual getName : ()Ljava/lang/String;
    //   565: ifnull -> 605
    //   568: goto -> 575
    //   571: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   574: athrow
    //   575: aload #7
    //   577: invokevirtual getPackage : ()Ljava/lang/Package;
    //   580: invokevirtual getName : ()Ljava/lang/String;
    //   583: sipush #22436
    //   586: sipush #15148
    //   589: invokestatic a : (II)Ljava/lang/String;
    //   592: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   595: ifne -> 605
    //   598: goto -> 605
    //   601: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   604: athrow
    //   605: aload #6
    //   607: iconst_1
    //   608: invokevirtual setAccessible : (Z)V
    //   611: aload #6
    //   613: aconst_null
    //   614: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   617: pop
    //   618: iinc #5, 1
    //   621: iload_2
    //   622: ifeq -> 484
    //   625: sipush #22434
    //   628: sipush #-6670
    //   631: invokestatic a : (II)Ljava/lang/String;
    //   634: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   637: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   640: astore_3
    //   641: aload_3
    //   642: arraylength
    //   643: istore #4
    //   645: iconst_0
    //   646: istore #5
    //   648: iload #5
    //   650: iload #4
    //   652: if_icmpge -> 784
    //   655: aload_3
    //   656: iload #5
    //   658: aaload
    //   659: astore #6
    //   661: aload #6
    //   663: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   666: pop
    //   667: aload #6
    //   669: invokevirtual getModifiers : ()I
    //   672: invokestatic isStatic : (I)Z
    //   675: ifeq -> 770
    //   678: aload #6
    //   680: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   683: arraylength
    //   684: iconst_2
    //   685: if_icmpne -> 770
    //   688: goto -> 695
    //   691: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   694: athrow
    //   695: aload #6
    //   697: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   700: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   703: invokevirtual equals : (Ljava/lang/Object;)Z
    //   706: ifeq -> 770
    //   709: goto -> 716
    //   712: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   715: athrow
    //   716: aload #6
    //   718: iconst_1
    //   719: invokevirtual setAccessible : (Z)V
    //   722: aload #6
    //   724: aconst_null
    //   725: iconst_2
    //   726: anewarray java/lang/Object
    //   729: dup
    //   730: iconst_0
    //   731: aload_0
    //   732: aastore
    //   733: dup
    //   734: iconst_1
    //   735: aload_1
    //   736: ifnonnull -> 754
    //   739: goto -> 746
    //   742: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   745: athrow
    //   746: aload_1
    //   747: goto -> 761
    //   750: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   753: athrow
    //   754: aload_1
    //   755: checkcast [B
    //   758: invokevirtual clone : ()Ljava/lang/Object;
    //   761: aastore
    //   762: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   765: pop
    //   766: iload_2
    //   767: ifeq -> 784
    //   770: iinc #5, 1
    //   773: iload_2
    //   774: ifeq -> 648
    //   777: goto -> 784
    //   780: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   783: athrow
    //   784: getstatic burp/Zgrz.Zu : Ljava/lang/String;
    //   787: getstatic burp/Zmui.Zz : Ljava/lang/Object;
    //   790: checkcast java/math/BigInteger
    //   793: invokevirtual intValue : ()I
    //   796: bipush #32
    //   798: irem
    //   799: invokestatic abs : (I)I
    //   802: invokevirtual charAt : (I)C
    //   805: getstatic burp/Zegj.ZS : Ljava/lang/String;
    //   808: getstatic burp/Zb0q.ZK : Ljava/lang/Object;
    //   811: checkcast java/math/BigInteger
    //   814: invokevirtual intValue : ()I
    //   817: bipush #32
    //   819: irem
    //   820: invokestatic abs : (I)I
    //   823: invokevirtual charAt : (I)C
    //   826: if_icmpgt -> 933
    //   829: getstatic burp/Ze2w.Za : Ljava/lang/String;
    //   832: getstatic burp/Zlf7.ZE : Ljava/lang/Object;
    //   835: checkcast java/math/BigInteger
    //   838: invokevirtual intValue : ()I
    //   841: bipush #32
    //   843: irem
    //   844: invokestatic abs : (I)I
    //   847: invokevirtual charAt : (I)C
    //   850: getstatic burp/Zgio.ZS : Ljava/lang/String;
    //   853: getstatic burp/Zmyk.Za : Ljava/lang/Object;
    //   856: checkcast java/math/BigInteger
    //   859: invokevirtual intValue : ()I
    //   862: bipush #32
    //   864: irem
    //   865: invokestatic abs : (I)I
    //   868: invokevirtual charAt : (I)C
    //   871: if_icmple -> 933
    //   874: goto -> 881
    //   877: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   880: athrow
    //   881: getstatic burp/Zgi9.Zv : Ljava/lang/String;
    //   884: getstatic burp/Zsko.ZD : Ljava/lang/Object;
    //   887: checkcast java/math/BigInteger
    //   890: invokevirtual intValue : ()I
    //   893: bipush #32
    //   895: irem
    //   896: invokestatic abs : (I)I
    //   899: invokevirtual charAt : (I)C
    //   902: getstatic burp/Zbss.ZV : Ljava/lang/String;
    //   905: getstatic burp/Zkjj.Zh : Ljava/lang/Object;
    //   908: checkcast java/math/BigInteger
    //   911: invokevirtual intValue : ()I
    //   914: bipush #32
    //   916: irem
    //   917: invokestatic abs : (I)I
    //   920: invokevirtual charAt : (I)C
    //   923: if_icmple -> 941
    //   926: goto -> 933
    //   929: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   932: athrow
    //   933: iconst_1
    //   934: goto -> 942
    //   937: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   940: athrow
    //   941: iconst_0
    //   942: ireturn
    //   943: astore_3
    //   944: new java/lang/Exception
    //   947: dup
    //   948: aload_3
    //   949: invokevirtual getMessage : ()Ljava/lang/String;
    //   952: invokespecial <init> : (Ljava/lang/String;)V
    //   955: athrow
    // Exception table:
    //   from	to	target	type
    //   4	942	943	java/lang/Throwable
    //   227	255	258	java/lang/Throwable
    //   237	272	275	java/lang/Throwable
    //   262	300	303	java/lang/Throwable
    //   279	317	320	java/lang/Throwable
    //   307	345	348	java/lang/Throwable
    //   324	362	365	java/lang/Throwable
    //   352	380	383	java/lang/Throwable
    //   369	394	397	java/lang/Throwable
    //   497	511	511	java/lang/Throwable
    //   522	535	538	java/lang/Throwable
    //   527	550	553	java/lang/Throwable
    //   542	568	571	java/lang/Throwable
    //   557	598	601	java/lang/Throwable
    //   661	688	691	java/lang/Throwable
    //   678	709	712	java/lang/Throwable
    //   695	739	742	java/lang/Throwable
    //   716	750	750	java/lang/Throwable
    //   761	777	780	java/lang/Throwable
    //   784	874	877	java/lang/Throwable
    //   829	926	929	java/lang/Throwable
    //   881	937	937	java/lang/Throwable
  }
  
  static void Za(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '°`!nMM\},³Ëùè¿öRqüPQj=Â?½§XïÔjÿËti©§²ºðbm³ÓèÆ{õlÒñ¾JÏùå8ÿOpDÝ|³!Ð ð5:ªÕ òàéßäû¾ÉMÊÛ\\f¬Ë5àä;T\í4¥c\\tÂ$¶GsåkÝ\\t¦^ÇZyF*©\\bïÒ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #74
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
    //   68: ldc 'ZÜ%¿ T24¯wÝÃ¾T ~´øgM&HÐ\\ròY\\t"üXUXã)'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #51
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
    //   129: putstatic burp/Zrl5.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrl5.b : [Ljava/lang/String;
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
    //   212: bipush #102
    //   214: goto -> 244
    //   217: bipush #100
    //   219: goto -> 244
    //   222: bipush #125
    //   224: goto -> 244
    //   227: bipush #55
    //   229: goto -> 244
    //   232: bipush #47
    //   234: goto -> 244
    //   237: bipush #64
    //   239: goto -> 244
    //   242: bipush #109
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
    //   300: sipush #22439
    //   303: sipush #21906
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zrl5.ZG : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #34
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #-111
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #29
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #-50
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #90
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-24
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #-71
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #-42
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #-44
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #-69
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #82
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #14
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #75
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #-28
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #-5
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #76
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #11
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #97
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #104
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #-2
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #-50
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #51
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #84
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #88
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #-18
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #-87
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #18
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #8
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #62
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #-117
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #-81
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #98
    //   505: bastore
    //   506: invokespecial <init> : ([B)V
    //   509: putstatic burp/Zrl5.ZI : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x57A1) & 0xFFFF;
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
      byte b1 = 95;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrl5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */