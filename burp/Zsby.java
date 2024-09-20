package burp;

import java.math.BigInteger;

class Zsby extends ClassLoader {
  static Object ZZ;
  
  static String Zx;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZD(Object paramObject) {
    Zg0j.Ze = a(-4785, 32712);
    Zg0j.ZV = new BigInteger(a(-4787, -22595));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zr0g.Zf.charAt(Math.abs(((BigInteger)Zx4w.Zp).intValue() % 32)) > Zsxj.Zp.charAt(Math.abs(((BigInteger)Ze13.ZD).intValue() % 32))) {
          try {
            Zxso.ZT(Class.forName(a(-4790, -9289)));
            if (!bool)
              Zxl5.Zq(Class.forName(a(-4789, 3675))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zxl5.Zq(Class.forName(a(-4789, 3675)));
    } catch (Throwable throwable) {}
  }
  
  static void Zi(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zp(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zxfu.ZA : Ljava/lang/Object;
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
    //   45: ifeq -> 25
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
    //   177: ifeq -> 65
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
    //   216: ifeq -> 365
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
    //   261: ifeq -> 365
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
    //   306: ifeq -> 365
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
    //   341: ifeq -> 365
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
    //   369: ifeq -> 183
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
    //   401: ifeq -> 379
    //   404: new java/math/BigInteger
    //   407: dup
    //   408: aload #4
    //   410: invokespecial <init> : ([B)V
    //   413: invokevirtual abs : ()Ljava/math/BigInteger;
    //   416: putstatic burp/Zsxm.Zv : Ljava/lang/Object;
    //   419: sipush #-4792
    //   422: getstatic burp/Zl_k.ZH : Ljava/lang/Object;
    //   425: checkcast java/math/BigInteger
    //   428: getstatic burp/Zxzd.ZD : Ljava/lang/Object;
    //   431: checkcast java/math/BigInteger
    //   434: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   437: putstatic burp/Zg7z.ZV : Ljava/lang/Object;
    //   440: sipush #9820
    //   443: getstatic burp/Zllw.ZW : Ljava/lang/Object;
    //   446: checkcast java/math/BigInteger
    //   449: getstatic burp/Zzap.ZL : Ljava/lang/Object;
    //   452: checkcast java/math/BigInteger
    //   455: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   458: putstatic burp/Zsde.Zx : Ljava/lang/Object;
    //   461: invokestatic a : (II)Ljava/lang/String;
    //   464: iconst_1
    //   465: ldc burp/Zgrf
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
    //   583: sipush #-4788
    //   586: sipush #-24468
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
    //   625: sipush #-4786
    //   628: sipush #-25415
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
    //   784: getstatic burp/Zxfu.Zo : Ljava/lang/String;
    //   787: getstatic burp/Zsm3.ZC : Ljava/lang/Object;
    //   790: checkcast java/math/BigInteger
    //   793: invokevirtual intValue : ()I
    //   796: bipush #32
    //   798: irem
    //   799: invokestatic abs : (I)I
    //   802: invokevirtual charAt : (I)C
    //   805: getstatic burp/Zxzd.ZM : Ljava/lang/String;
    //   808: getstatic burp/Zkig.ZK : Ljava/lang/Object;
    //   811: checkcast java/math/BigInteger
    //   814: invokevirtual intValue : ()I
    //   817: bipush #32
    //   819: irem
    //   820: invokestatic abs : (I)I
    //   823: invokevirtual charAt : (I)C
    //   826: if_icmple -> 941
    //   829: getstatic burp/Zg0j.Ze : Ljava/lang/String;
    //   832: getstatic burp/Zsxj.Zi : Ljava/lang/Object;
    //   835: checkcast java/math/BigInteger
    //   838: invokevirtual intValue : ()I
    //   841: bipush #32
    //   843: irem
    //   844: invokestatic abs : (I)I
    //   847: invokevirtual charAt : (I)C
    //   850: getstatic burp/Zgw0.ZL : Ljava/lang/String;
    //   853: getstatic burp/Zr0g.Zj : Ljava/lang/Object;
    //   856: checkcast java/math/BigInteger
    //   859: invokevirtual intValue : ()I
    //   862: bipush #32
    //   864: irem
    //   865: invokestatic abs : (I)I
    //   868: invokevirtual charAt : (I)C
    //   871: if_icmpgt -> 941
    //   874: goto -> 881
    //   877: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   880: athrow
    //   881: getstatic burp/Zrnu.ZO : Ljava/lang/String;
    //   884: getstatic burp/Zeh9.ZY : Ljava/lang/Object;
    //   887: checkcast java/math/BigInteger
    //   890: invokevirtual intValue : ()I
    //   893: bipush #32
    //   895: irem
    //   896: invokestatic abs : (I)I
    //   899: invokevirtual charAt : (I)C
    //   902: getstatic burp/Zrnu.ZO : Ljava/lang/String;
    //   905: getstatic burp/Zr0u.ZB : Ljava/lang/Object;
    //   908: checkcast java/math/BigInteger
    //   911: invokevirtual intValue : ()I
    //   914: bipush #32
    //   916: irem
    //   917: invokestatic abs : (I)I
    //   920: invokevirtual charAt : (I)C
    //   923: if_icmpgt -> 941
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
    //   191	219	222	java/lang/Throwable
    //   201	236	239	java/lang/Throwable
    //   226	264	267	java/lang/Throwable
    //   243	281	284	java/lang/Throwable
    //   271	309	312	java/lang/Throwable
    //   288	326	329	java/lang/Throwable
    //   316	344	347	java/lang/Throwable
    //   333	358	361	java/lang/Throwable
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
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '8¯!\\rhÒz\\tuã¿Q\\tW§f\\f¬, gdå¨ÐáÝ]_oÊ²<FU¬cr÷\AâÚ¯\\tq\\bMÏ9@ þ¦áOßõu¹¸µ§óâàÔZ?Ú~-o,I4 ç}»»»'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #93
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
    //   68: ldc '!ö MiLÖy²éo¾ÍiÍÏèvL>5,õlÈoÍw{1u\m þ+d\\bpé7ùÇÜ\\tiËñ\sZß ÷¡üE­Å¡1.â'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #28
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
    //   128: putstatic burp/Zsby.a : [Ljava/lang/String;
    //   131: bipush #8
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zsby.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #46
    //   214: goto -> 244
    //   217: bipush #58
    //   219: goto -> 244
    //   222: bipush #34
    //   224: goto -> 244
    //   227: bipush #60
    //   229: goto -> 244
    //   232: bipush #88
    //   234: goto -> 244
    //   237: bipush #25
    //   239: goto -> 244
    //   242: bipush #67
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #114
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-73
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #-61
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #37
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #-77
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-107
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #43
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #46
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #122
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #-15
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #-29
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #-121
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: iconst_5
    //   378: bastore
    //   379: dup
    //   380: bipush #13
    //   382: bipush #29
    //   384: bastore
    //   385: dup
    //   386: bipush #14
    //   388: bipush #-122
    //   390: bastore
    //   391: dup
    //   392: bipush #15
    //   394: bipush #-55
    //   396: bastore
    //   397: dup
    //   398: bipush #16
    //   400: bipush #63
    //   402: bastore
    //   403: dup
    //   404: bipush #17
    //   406: bipush #-94
    //   408: bastore
    //   409: dup
    //   410: bipush #18
    //   412: bipush #126
    //   414: bastore
    //   415: dup
    //   416: bipush #19
    //   418: bipush #-86
    //   420: bastore
    //   421: dup
    //   422: bipush #20
    //   424: bipush #-32
    //   426: bastore
    //   427: dup
    //   428: bipush #21
    //   430: bipush #80
    //   432: bastore
    //   433: dup
    //   434: bipush #22
    //   436: bipush #-9
    //   438: bastore
    //   439: dup
    //   440: bipush #23
    //   442: bipush #119
    //   444: bastore
    //   445: dup
    //   446: bipush #24
    //   448: bipush #-77
    //   450: bastore
    //   451: dup
    //   452: bipush #25
    //   454: bipush #15
    //   456: bastore
    //   457: dup
    //   458: bipush #26
    //   460: bipush #107
    //   462: bastore
    //   463: dup
    //   464: bipush #27
    //   466: bipush #72
    //   468: bastore
    //   469: dup
    //   470: bipush #28
    //   472: bipush #-43
    //   474: bastore
    //   475: dup
    //   476: bipush #29
    //   478: bipush #-124
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #-79
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: bipush #45
    //   492: bastore
    //   493: invokespecial <init> : ([B)V
    //   496: putstatic burp/Zsby.ZZ : Ljava/lang/Object;
    //   499: sipush #-4791
    //   502: sipush #-13446
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Zsby.Zx : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFED4A) & 0xFFFF;
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
      byte b1 = 33;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsby.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */