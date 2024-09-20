package burp;

import java.math.BigInteger;

class Ze8m extends ClassLoader {
  static Object Zm;
  
  static String Zx;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZQ(Object paramObject) {
    Zk7e.ZP = a(-20998, -20451);
    Zk7e.ZW = new BigInteger(a(-21000, 20752));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zkt7.ZM.charAt(Math.abs(((BigInteger)Zs83.ZT).intValue() % 32)) > Zk7e.ZP.charAt(Math.abs(((BigInteger)Zs83.ZT).intValue() % 32))) {
          try {
            Zmfw.ZR(Class.forName(a(-20995, -21782)));
            if (bool)
              Zzoi.Zs(Class.forName(a(-20997, -32193))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zzoi.Zs(Class.forName(a(-20997, -32193)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zd(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zsbt.Zl : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Ztdd.ZD : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Ze8m.Zm : Ljava/lang/Object;
    //   22: sipush #-20996
    //   25: getstatic burp/Zrof.ZB : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: getstatic burp/Zs4z.Ze : Ljava/lang/Object;
    //   34: checkcast java/math/BigInteger
    //   37: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   40: putstatic burp/Zg4w.ZR : Ljava/lang/Object;
    //   43: sipush #5635
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: iconst_1
    //   50: ldc burp/Zlo0
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
    //   168: sipush #-20999
    //   171: sipush #18114
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
    //   210: sipush #-20993
    //   213: sipush #-4709
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
    //   369: ldc2_w 8682522807148012
    //   372: invokestatic currentTimeMillis : ()J
    //   375: lxor
    //   376: lstore #4
    //   378: lload #4
    //   380: ldc2_w 25214903917
    //   383: lmul
    //   384: ldc2_w 11
    //   387: ladd
    //   388: ldc2_w 281474976710655
    //   391: land
    //   392: lstore #4
    //   394: lload #4
    //   396: bipush #32
    //   398: lshl
    //   399: lstore #6
    //   401: lload #4
    //   403: ldc2_w 25214903917
    //   406: lmul
    //   407: ldc2_w 11
    //   410: ladd
    //   411: ldc2_w 281474976710655
    //   414: land
    //   415: lstore #4
    //   417: lload #6
    //   419: lload #4
    //   421: ladd
    //   422: lstore #6
    //   424: bipush #16
    //   426: newarray byte
    //   428: dup
    //   429: iconst_0
    //   430: bipush #48
    //   432: bastore
    //   433: dup
    //   434: iconst_1
    //   435: bipush #49
    //   437: bastore
    //   438: dup
    //   439: iconst_2
    //   440: bipush #50
    //   442: bastore
    //   443: dup
    //   444: iconst_3
    //   445: bipush #51
    //   447: bastore
    //   448: dup
    //   449: iconst_4
    //   450: bipush #52
    //   452: bastore
    //   453: dup
    //   454: iconst_5
    //   455: bipush #53
    //   457: bastore
    //   458: dup
    //   459: bipush #6
    //   461: bipush #54
    //   463: bastore
    //   464: dup
    //   465: bipush #7
    //   467: bipush #55
    //   469: bastore
    //   470: dup
    //   471: bipush #8
    //   473: bipush #56
    //   475: bastore
    //   476: dup
    //   477: bipush #9
    //   479: bipush #57
    //   481: bastore
    //   482: dup
    //   483: bipush #10
    //   485: bipush #97
    //   487: bastore
    //   488: dup
    //   489: bipush #11
    //   491: bipush #98
    //   493: bastore
    //   494: dup
    //   495: bipush #12
    //   497: bipush #99
    //   499: bastore
    //   500: dup
    //   501: bipush #13
    //   503: bipush #100
    //   505: bastore
    //   506: dup
    //   507: bipush #14
    //   509: bipush #101
    //   511: bastore
    //   512: dup
    //   513: bipush #15
    //   515: bipush #102
    //   517: bastore
    //   518: astore #8
    //   520: bipush #64
    //   522: newarray byte
    //   524: astore #9
    //   526: bipush #64
    //   528: istore #10
    //   530: bipush #16
    //   532: istore #11
    //   534: iload #11
    //   536: iconst_1
    //   537: isub
    //   538: i2l
    //   539: lstore #12
    //   541: aload #9
    //   543: iinc #10, -1
    //   546: iload #10
    //   548: aload #8
    //   550: lload #6
    //   552: lload #12
    //   554: land
    //   555: l2i
    //   556: baload
    //   557: bastore
    //   558: lload #6
    //   560: iconst_4
    //   561: lushr
    //   562: lstore #6
    //   564: lload #6
    //   566: lconst_0
    //   567: lcmp
    //   568: ifne -> 541
    //   571: bipush #64
    //   573: iload #10
    //   575: isub
    //   576: newarray byte
    //   578: astore_3
    //   579: iconst_0
    //   580: istore #14
    //   582: iload #14
    //   584: aload_3
    //   585: arraylength
    //   586: if_icmpge -> 608
    //   589: aload_3
    //   590: iload #14
    //   592: aload #9
    //   594: iload #10
    //   596: iload #14
    //   598: iadd
    //   599: baload
    //   600: bastore
    //   601: iinc #14, 1
    //   604: iload_2
    //   605: ifne -> 582
    //   608: aload_3
    //   609: arraylength
    //   610: bipush #10
    //   612: if_icmplt -> 378
    //   615: getstatic burp/Zltz.Za : Ljava/lang/String;
    //   618: getstatic burp/Zr48.ZZ : Ljava/lang/Object;
    //   621: checkcast java/math/BigInteger
    //   624: invokevirtual intValue : ()I
    //   627: bipush #32
    //   629: irem
    //   630: invokestatic abs : (I)I
    //   633: invokevirtual charAt : (I)C
    //   636: getstatic burp/Zel.Zi : Ljava/lang/String;
    //   639: getstatic burp/Zgq_.ZM : Ljava/lang/Object;
    //   642: checkcast java/math/BigInteger
    //   645: invokevirtual intValue : ()I
    //   648: bipush #32
    //   650: irem
    //   651: invokestatic abs : (I)I
    //   654: invokevirtual charAt : (I)C
    //   657: if_icmpgt -> 764
    //   660: getstatic burp/Zzox.ZB : Ljava/lang/String;
    //   663: getstatic burp/Zqp.ZA : Ljava/lang/Object;
    //   666: checkcast java/math/BigInteger
    //   669: invokevirtual intValue : ()I
    //   672: bipush #32
    //   674: irem
    //   675: invokestatic abs : (I)I
    //   678: invokevirtual charAt : (I)C
    //   681: getstatic burp/Ztye.ZR : Ljava/lang/String;
    //   684: getstatic burp/Zlh8.Zm : Ljava/lang/Object;
    //   687: checkcast java/math/BigInteger
    //   690: invokevirtual intValue : ()I
    //   693: bipush #32
    //   695: irem
    //   696: invokestatic abs : (I)I
    //   699: invokevirtual charAt : (I)C
    //   702: if_icmpgt -> 764
    //   705: goto -> 712
    //   708: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   711: athrow
    //   712: getstatic burp/Zgqi.Zv : Ljava/lang/String;
    //   715: getstatic burp/Zera.Zy : Ljava/lang/Object;
    //   718: checkcast java/math/BigInteger
    //   721: invokevirtual intValue : ()I
    //   724: bipush #32
    //   726: irem
    //   727: invokestatic abs : (I)I
    //   730: invokevirtual charAt : (I)C
    //   733: getstatic burp/Zgq_.ZQ : Ljava/lang/String;
    //   736: getstatic burp/Zk7e.ZW : Ljava/lang/Object;
    //   739: checkcast java/math/BigInteger
    //   742: invokevirtual intValue : ()I
    //   745: bipush #32
    //   747: irem
    //   748: invokestatic abs : (I)I
    //   751: invokevirtual charAt : (I)C
    //   754: if_icmple -> 772
    //   757: goto -> 764
    //   760: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   763: athrow
    //   764: iconst_1
    //   765: goto -> 773
    //   768: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   771: athrow
    //   772: iconst_0
    //   773: ireturn
    //   774: astore_3
    //   775: new java/lang/Exception
    //   778: dup
    //   779: aload_3
    //   780: invokevirtual getMessage : ()Ljava/lang/String;
    //   783: invokespecial <init> : (Ljava/lang/String;)V
    //   786: athrow
    // Exception table:
    //   from	to	target	type
    //   4	773	774	java/lang/Throwable
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
    //   615	705	708	java/lang/Throwable
    //   660	757	760	java/lang/Throwable
    //   712	768	768	java/lang/Throwable
  }
  
  static void ZS(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'äoçîz>¾r5ówg9ìªmø¿³ú7âUGV¢ßºæKÕâá'ëx÷^:¸æë£7sk½)Fo¢gbÛx7NyLû fØÑÿá'Êñdöâ×7QåBÀZÚÇ]ðàYK\\t\E\\rsé|c\\t½ö1÷ô[ôi\\t&8B.`ÊÒ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #77
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #111
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
    //   68: ldc '¿_ÌÐÌ_3W>GC ç}Ù½«c ¶{QK!\\tjêÓl°0c'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #61
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
    //   129: putstatic burp/Ze8m.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ze8m.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 236
    //   212: bipush #83
    //   214: goto -> 243
    //   217: bipush #26
    //   219: goto -> 243
    //   222: bipush #50
    //   224: goto -> 243
    //   227: bipush #67
    //   229: goto -> 243
    //   232: iconst_4
    //   233: goto -> 243
    //   236: bipush #107
    //   238: goto -> 243
    //   241: bipush #28
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
    //   311: bipush #117
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #11
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #89
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #-79
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #-85
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #57
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #-51
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #-78
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #84
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #-63
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: iconst_m1
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #-62
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #-30
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #-37
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #69
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #96
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #-77
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #48
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #-95
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #-103
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #-14
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #8
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #88
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #-53
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #-46
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #67
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #22
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #126
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #-127
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #-107
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #-75
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #-103
    //   493: bastore
    //   494: invokespecial <init> : (I[B)V
    //   497: putstatic burp/Ze8m.Zm : Ljava/lang/Object;
    //   500: sipush #-20994
    //   503: sipush #-1299
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Ze8m.Zx : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFADF8) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze8m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */