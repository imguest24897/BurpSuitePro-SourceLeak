package burp;

import java.math.BigInteger;

class Ztnn extends ClassLoader {
  static Object ZA;
  
  static String ZS;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zt(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZU(Object paramObject) {
    Zm7v.ZX = a(-17019, -4068);
    Zm7v.ZP = new BigInteger(a(-17010, -3464));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zkdq.ZZ.charAt(Math.abs(((BigInteger)Zlo0.Zu).intValue() % 32)) > Zr60.ZQ.charAt(Math.abs(((BigInteger)Ze8j.ZQ).intValue() % 32))) {
          try {
            Zb4d.Zj(Class.forName(a(-17018, 26231)));
            if (!bool)
              Zrqd.Zr(Class.forName(a(-17024, 13640))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zrqd.Zr(Class.forName(a(-17024, 13640)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zx(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zt9f.Zl : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zbwj.ZW : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zbnz.Zb : Ljava/lang/Object;
    //   22: sipush #-17017
    //   25: sipush #-11361
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Ztys
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
    //   150: sipush #-17020
    //   153: sipush #-20402
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
    //   189: ifeq -> 51
    //   192: sipush #-17023
    //   195: sipush #-9668
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
    //   334: ifeq -> 351
    //   337: iinc #5, 1
    //   340: iload_2
    //   341: ifeq -> 215
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   350: athrow
    //   351: getstatic burp/Zlcc.ZP : Ljava/lang/Object;
    //   354: checkcast java/math/BigInteger
    //   357: invokevirtual toByteArray : ()[B
    //   360: astore_3
    //   361: aload_3
    //   362: arraylength
    //   363: iconst_2
    //   364: iadd
    //   365: newarray byte
    //   367: astore #5
    //   369: iconst_0
    //   370: istore #6
    //   372: iload #6
    //   374: aload_3
    //   375: arraylength
    //   376: if_icmpge -> 395
    //   379: aload #5
    //   381: iload #6
    //   383: aload_3
    //   384: iload #6
    //   386: baload
    //   387: bastore
    //   388: iinc #6, 1
    //   391: iload_2
    //   392: ifeq -> 372
    //   395: aload #5
    //   397: arraylength
    //   398: iconst_3
    //   399: idiv
    //   400: iconst_4
    //   401: imul
    //   402: newarray byte
    //   404: astore #4
    //   406: iconst_0
    //   407: istore #6
    //   409: iconst_0
    //   410: istore #7
    //   412: iload #6
    //   414: aload_3
    //   415: arraylength
    //   416: if_icmpge -> 527
    //   419: aload #4
    //   421: iload #7
    //   423: aload #5
    //   425: iload #6
    //   427: baload
    //   428: iconst_2
    //   429: iushr
    //   430: bipush #63
    //   432: iand
    //   433: i2b
    //   434: bastore
    //   435: aload #4
    //   437: iload #7
    //   439: iconst_1
    //   440: iadd
    //   441: aload #5
    //   443: iload #6
    //   445: iconst_1
    //   446: iadd
    //   447: baload
    //   448: iconst_4
    //   449: iushr
    //   450: bipush #15
    //   452: iand
    //   453: aload #5
    //   455: iload #6
    //   457: baload
    //   458: iconst_4
    //   459: ishl
    //   460: bipush #63
    //   462: iand
    //   463: ior
    //   464: i2b
    //   465: bastore
    //   466: aload #4
    //   468: iload #7
    //   470: iconst_2
    //   471: iadd
    //   472: aload #5
    //   474: iload #6
    //   476: iconst_2
    //   477: iadd
    //   478: baload
    //   479: bipush #6
    //   481: iushr
    //   482: iconst_3
    //   483: iand
    //   484: aload #5
    //   486: iload #6
    //   488: iconst_1
    //   489: iadd
    //   490: baload
    //   491: iconst_2
    //   492: ishl
    //   493: bipush #63
    //   495: iand
    //   496: ior
    //   497: i2b
    //   498: bastore
    //   499: aload #4
    //   501: iload #7
    //   503: iconst_3
    //   504: iadd
    //   505: aload #5
    //   507: iload #6
    //   509: iconst_2
    //   510: iadd
    //   511: baload
    //   512: bipush #63
    //   514: iand
    //   515: i2b
    //   516: bastore
    //   517: iinc #6, 3
    //   520: iinc #7, 4
    //   523: iload_2
    //   524: ifeq -> 412
    //   527: iconst_0
    //   528: istore #6
    //   530: iload #6
    //   532: aload #4
    //   534: arraylength
    //   535: if_icmpge -> 719
    //   538: aload #4
    //   540: iload #6
    //   542: baload
    //   543: bipush #26
    //   545: if_icmpge -> 573
    //   548: aload #4
    //   550: iload #6
    //   552: aload #4
    //   554: iload #6
    //   556: baload
    //   557: bipush #65
    //   559: iadd
    //   560: i2b
    //   561: bastore
    //   562: iload_2
    //   563: ifeq -> 712
    //   566: goto -> 573
    //   569: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   572: athrow
    //   573: aload #4
    //   575: iload #6
    //   577: baload
    //   578: bipush #52
    //   580: if_icmpge -> 618
    //   583: goto -> 590
    //   586: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   589: athrow
    //   590: aload #4
    //   592: iload #6
    //   594: aload #4
    //   596: iload #6
    //   598: baload
    //   599: bipush #97
    //   601: iadd
    //   602: bipush #26
    //   604: isub
    //   605: i2b
    //   606: bastore
    //   607: iload_2
    //   608: ifeq -> 712
    //   611: goto -> 618
    //   614: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   617: athrow
    //   618: aload #4
    //   620: iload #6
    //   622: baload
    //   623: bipush #62
    //   625: if_icmpge -> 663
    //   628: goto -> 635
    //   631: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   634: athrow
    //   635: aload #4
    //   637: iload #6
    //   639: aload #4
    //   641: iload #6
    //   643: baload
    //   644: bipush #48
    //   646: iadd
    //   647: bipush #52
    //   649: isub
    //   650: i2b
    //   651: bastore
    //   652: iload_2
    //   653: ifeq -> 712
    //   656: goto -> 663
    //   659: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   662: athrow
    //   663: aload #4
    //   665: iload #6
    //   667: baload
    //   668: bipush #63
    //   670: if_icmpge -> 698
    //   673: goto -> 680
    //   676: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   679: athrow
    //   680: aload #4
    //   682: iload #6
    //   684: bipush #43
    //   686: bastore
    //   687: iload_2
    //   688: ifeq -> 712
    //   691: goto -> 698
    //   694: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   697: athrow
    //   698: aload #4
    //   700: iload #6
    //   702: bipush #47
    //   704: bastore
    //   705: goto -> 712
    //   708: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   711: athrow
    //   712: iinc #6, 1
    //   715: iload_2
    //   716: ifeq -> 530
    //   719: aload #4
    //   721: arraylength
    //   722: iconst_1
    //   723: isub
    //   724: istore #6
    //   726: iload #6
    //   728: aload_3
    //   729: arraylength
    //   730: iconst_4
    //   731: imul
    //   732: iconst_3
    //   733: idiv
    //   734: if_icmple -> 751
    //   737: aload #4
    //   739: iload #6
    //   741: bipush #61
    //   743: bastore
    //   744: iinc #6, -1
    //   747: iload_2
    //   748: ifeq -> 726
    //   751: getstatic burp/Zku9.Zl : Ljava/lang/String;
    //   754: getstatic burp/Zmli.Zh : Ljava/lang/Object;
    //   757: checkcast java/math/BigInteger
    //   760: invokevirtual intValue : ()I
    //   763: bipush #32
    //   765: irem
    //   766: invokestatic abs : (I)I
    //   769: invokevirtual charAt : (I)C
    //   772: getstatic burp/Zxp5.ZO : Ljava/lang/String;
    //   775: getstatic burp/Zr17.ZR : Ljava/lang/Object;
    //   778: checkcast java/math/BigInteger
    //   781: invokevirtual intValue : ()I
    //   784: bipush #32
    //   786: irem
    //   787: invokestatic abs : (I)I
    //   790: invokevirtual charAt : (I)C
    //   793: if_icmple -> 900
    //   796: getstatic burp/Zso.ZL : Ljava/lang/String;
    //   799: getstatic burp/Zg0q.Zf : Ljava/lang/Object;
    //   802: checkcast java/math/BigInteger
    //   805: invokevirtual intValue : ()I
    //   808: bipush #32
    //   810: irem
    //   811: invokestatic abs : (I)I
    //   814: invokevirtual charAt : (I)C
    //   817: getstatic burp/Zvh.ZP : Ljava/lang/String;
    //   820: getstatic burp/Zenr.ZA : Ljava/lang/Object;
    //   823: checkcast java/math/BigInteger
    //   826: invokevirtual intValue : ()I
    //   829: bipush #32
    //   831: irem
    //   832: invokestatic abs : (I)I
    //   835: invokevirtual charAt : (I)C
    //   838: if_icmpgt -> 900
    //   841: goto -> 848
    //   844: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   847: athrow
    //   848: getstatic burp/Zk9q.Zk : Ljava/lang/String;
    //   851: getstatic burp/Zb2n.ZR : Ljava/lang/Object;
    //   854: checkcast java/math/BigInteger
    //   857: invokevirtual intValue : ()I
    //   860: bipush #32
    //   862: irem
    //   863: invokestatic abs : (I)I
    //   866: invokevirtual charAt : (I)C
    //   869: getstatic burp/Ztzj.ZB : Ljava/lang/String;
    //   872: getstatic burp/Zgrz.ZX : Ljava/lang/Object;
    //   875: checkcast java/math/BigInteger
    //   878: invokevirtual intValue : ()I
    //   881: bipush #32
    //   883: irem
    //   884: invokestatic abs : (I)I
    //   887: invokevirtual charAt : (I)C
    //   890: if_icmpgt -> 908
    //   893: goto -> 900
    //   896: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   899: athrow
    //   900: iconst_1
    //   901: goto -> 909
    //   904: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   907: athrow
    //   908: iconst_0
    //   909: ireturn
    //   910: astore_3
    //   911: new java/lang/Exception
    //   914: dup
    //   915: aload_3
    //   916: invokevirtual getMessage : ()Ljava/lang/String;
    //   919: invokespecial <init> : (Ljava/lang/String;)V
    //   922: athrow
    // Exception table:
    //   from	to	target	type
    //   4	909	910	java/lang/Throwable
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
    //   538	566	569	java/lang/Throwable
    //   548	583	586	java/lang/Throwable
    //   573	611	614	java/lang/Throwable
    //   590	628	631	java/lang/Throwable
    //   618	656	659	java/lang/Throwable
    //   635	673	676	java/lang/Throwable
    //   663	691	694	java/lang/Throwable
    //   680	705	708	java/lang/Throwable
    //   751	841	844	java/lang/Throwable
    //   796	893	896	java/lang/Throwable
    //   848	904	904	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ';g)llÎÏ\\tg¢BdLQ}yVaJ Ì²þQçF8Dn9.ú)­ðæ5!æ8k²)&ÛÐZMlÓ:Ó¤Zþ´z]ãÂe©fUí,ß¼Czd¨Æp¬P¹&1«ãrÎtÊÃ9%Ýwºìô78sð¸_ÔÛAñÃm±8\ &úx G¢¢qñD×TD±.JÓ{Ü_ü¾ôFîõv\\t  Jyùzf'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #26
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
    //   68: ldc '~Òá9k©ÊHMN®/=ÜÄÞÍ¥ Æ\\bä_Na§YKW\\bjûqcK0X:$\\bôU\\nõUÉÔãÅj,¥eë"%ÓÌüj\\tõßú¼ËW'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #66
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
    //   129: putstatic burp/Ztnn.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztnn.b : [Ljava/lang/String;
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
    //   217: bipush #66
    //   219: goto -> 244
    //   222: bipush #72
    //   224: goto -> 244
    //   227: bipush #58
    //   229: goto -> 244
    //   232: bipush #114
    //   234: goto -> 244
    //   237: bipush #62
    //   239: goto -> 244
    //   242: bipush #89
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
    //   304: sipush #-17022
    //   307: sipush #-6012
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Ztnn.ZA : Ljava/lang/Object;
    //   319: sipush #-17021
    //   322: sipush #-18164
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Ztnn.ZS : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBD86) & 0xFFFF;
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
      byte b1 = 101;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztnn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */