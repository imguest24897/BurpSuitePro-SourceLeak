package burp;

import java.math.BigInteger;

class Zk5y extends ClassLoader {
  static String ZZ;
  
  static Object ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZO(Object paramObject) {
    Zrcx.ZW = a(27446, 166);
    Zrcx.Za = new BigInteger(a(27445, -18312));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Ztzw.Zi.charAt(Math.abs(((BigInteger)Zly7.Zt).intValue() % 32)) <= Zlh2.Zf.charAt(Math.abs(((BigInteger)Zx_u.Zy).intValue() % 32))) {
          try {
            Zx_b.ZD(Class.forName(a(27444, 941)));
            if (!bool)
              Zxyu.Zh(Class.forName(a(27442, -10892))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zxyu.Zh(Class.forName(a(27442, -10892)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Za(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zmy3.Zx : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Ztfr.Zr : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zty2.Zl : Ljava/lang/Object;
    //   22: getstatic burp/Zm1l.Za : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: getstatic burp/Ze7y.Zh : Ljava/lang/Object;
    //   31: checkcast java/math/BigInteger
    //   34: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   37: putstatic burp/Zeoi.ZE : Ljava/lang/Object;
    //   40: ldc2_w 8682522807148012
    //   43: invokestatic currentTimeMillis : ()J
    //   46: lxor
    //   47: lstore #4
    //   49: lload #4
    //   51: ldc2_w 25214903917
    //   54: lmul
    //   55: ldc2_w 11
    //   58: ladd
    //   59: ldc2_w 281474976710655
    //   62: land
    //   63: lstore #4
    //   65: lload #4
    //   67: bipush #32
    //   69: lshl
    //   70: lstore #6
    //   72: lload #4
    //   74: ldc2_w 25214903917
    //   77: lmul
    //   78: ldc2_w 11
    //   81: ladd
    //   82: ldc2_w 281474976710655
    //   85: land
    //   86: lstore #4
    //   88: lload #6
    //   90: lload #4
    //   92: ladd
    //   93: lstore #6
    //   95: bipush #16
    //   97: newarray byte
    //   99: dup
    //   100: iconst_0
    //   101: bipush #48
    //   103: bastore
    //   104: dup
    //   105: iconst_1
    //   106: bipush #49
    //   108: bastore
    //   109: dup
    //   110: iconst_2
    //   111: bipush #50
    //   113: bastore
    //   114: dup
    //   115: iconst_3
    //   116: bipush #51
    //   118: bastore
    //   119: dup
    //   120: iconst_4
    //   121: bipush #52
    //   123: bastore
    //   124: dup
    //   125: iconst_5
    //   126: bipush #53
    //   128: bastore
    //   129: dup
    //   130: bipush #6
    //   132: bipush #54
    //   134: bastore
    //   135: dup
    //   136: bipush #7
    //   138: bipush #55
    //   140: bastore
    //   141: dup
    //   142: bipush #8
    //   144: bipush #56
    //   146: bastore
    //   147: dup
    //   148: bipush #9
    //   150: bipush #57
    //   152: bastore
    //   153: dup
    //   154: bipush #10
    //   156: bipush #97
    //   158: bastore
    //   159: dup
    //   160: bipush #11
    //   162: bipush #98
    //   164: bastore
    //   165: dup
    //   166: bipush #12
    //   168: bipush #99
    //   170: bastore
    //   171: dup
    //   172: bipush #13
    //   174: bipush #100
    //   176: bastore
    //   177: dup
    //   178: bipush #14
    //   180: bipush #101
    //   182: bastore
    //   183: dup
    //   184: bipush #15
    //   186: bipush #102
    //   188: bastore
    //   189: astore #8
    //   191: bipush #64
    //   193: newarray byte
    //   195: astore #9
    //   197: bipush #64
    //   199: istore #10
    //   201: bipush #16
    //   203: istore #11
    //   205: iload #11
    //   207: iconst_1
    //   208: isub
    //   209: i2l
    //   210: lstore #12
    //   212: aload #9
    //   214: iinc #10, -1
    //   217: iload #10
    //   219: aload #8
    //   221: lload #6
    //   223: lload #12
    //   225: land
    //   226: l2i
    //   227: baload
    //   228: bastore
    //   229: lload #6
    //   231: iconst_4
    //   232: lushr
    //   233: lstore #6
    //   235: lload #6
    //   237: lconst_0
    //   238: lcmp
    //   239: ifne -> 212
    //   242: bipush #64
    //   244: iload #10
    //   246: isub
    //   247: newarray byte
    //   249: astore_3
    //   250: iconst_0
    //   251: istore #14
    //   253: iload #14
    //   255: aload_3
    //   256: arraylength
    //   257: if_icmpge -> 279
    //   260: aload_3
    //   261: iload #14
    //   263: aload #9
    //   265: iload #10
    //   267: iload #14
    //   269: iadd
    //   270: baload
    //   271: bastore
    //   272: iinc #14, 1
    //   275: iload_2
    //   276: ifne -> 253
    //   279: aload_3
    //   280: arraylength
    //   281: bipush #10
    //   283: if_icmplt -> 49
    //   286: sipush #27443
    //   289: sipush #27838
    //   292: invokestatic a : (II)Ljava/lang/String;
    //   295: iconst_1
    //   296: ldc burp/Zlps
    //   298: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   301: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   304: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   307: astore_3
    //   308: aload_3
    //   309: arraylength
    //   310: istore #4
    //   312: iconst_0
    //   313: istore #5
    //   315: iload #5
    //   317: iload #4
    //   319: if_icmpge -> 456
    //   322: aload_3
    //   323: iload #5
    //   325: aaload
    //   326: astore #6
    //   328: aload #6
    //   330: invokevirtual getModifiers : ()I
    //   333: invokestatic isStatic : (I)Z
    //   336: ifne -> 346
    //   339: goto -> 449
    //   342: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   345: athrow
    //   346: aload #6
    //   348: invokevirtual getType : ()Ljava/lang/Class;
    //   351: astore #7
    //   353: aload #7
    //   355: ifnull -> 436
    //   358: aload #7
    //   360: invokevirtual isPrimitive : ()Z
    //   363: ifne -> 436
    //   366: goto -> 373
    //   369: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   372: athrow
    //   373: aload #7
    //   375: invokevirtual getPackage : ()Ljava/lang/Package;
    //   378: ifnull -> 436
    //   381: goto -> 388
    //   384: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   387: athrow
    //   388: aload #7
    //   390: invokevirtual getPackage : ()Ljava/lang/Package;
    //   393: invokevirtual getName : ()Ljava/lang/String;
    //   396: ifnull -> 436
    //   399: goto -> 406
    //   402: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   405: athrow
    //   406: aload #7
    //   408: invokevirtual getPackage : ()Ljava/lang/Package;
    //   411: invokevirtual getName : ()Ljava/lang/String;
    //   414: sipush #27440
    //   417: sipush #-5064
    //   420: invokestatic a : (II)Ljava/lang/String;
    //   423: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   426: ifne -> 436
    //   429: goto -> 436
    //   432: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   435: athrow
    //   436: aload #6
    //   438: iconst_1
    //   439: invokevirtual setAccessible : (Z)V
    //   442: aload #6
    //   444: aconst_null
    //   445: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   448: pop
    //   449: iinc #5, 1
    //   452: iload_2
    //   453: ifne -> 315
    //   456: sipush #27447
    //   459: sipush #28081
    //   462: invokestatic a : (II)Ljava/lang/String;
    //   465: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   468: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   471: astore_3
    //   472: aload_3
    //   473: arraylength
    //   474: istore #4
    //   476: iconst_0
    //   477: istore #5
    //   479: iload #5
    //   481: iload #4
    //   483: if_icmpge -> 615
    //   486: aload_3
    //   487: iload #5
    //   489: aaload
    //   490: astore #6
    //   492: aload #6
    //   494: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   497: pop
    //   498: aload #6
    //   500: invokevirtual getModifiers : ()I
    //   503: invokestatic isStatic : (I)Z
    //   506: ifeq -> 601
    //   509: aload #6
    //   511: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   514: arraylength
    //   515: iconst_2
    //   516: if_icmpne -> 601
    //   519: goto -> 526
    //   522: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   525: athrow
    //   526: aload #6
    //   528: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   531: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   534: invokevirtual equals : (Ljava/lang/Object;)Z
    //   537: ifeq -> 601
    //   540: goto -> 547
    //   543: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   546: athrow
    //   547: aload #6
    //   549: iconst_1
    //   550: invokevirtual setAccessible : (Z)V
    //   553: aload #6
    //   555: aconst_null
    //   556: iconst_2
    //   557: anewarray java/lang/Object
    //   560: dup
    //   561: iconst_0
    //   562: aload_0
    //   563: aastore
    //   564: dup
    //   565: iconst_1
    //   566: aload_1
    //   567: ifnonnull -> 585
    //   570: goto -> 577
    //   573: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   576: athrow
    //   577: aload_1
    //   578: goto -> 592
    //   581: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   584: athrow
    //   585: aload_1
    //   586: checkcast [B
    //   589: invokevirtual clone : ()Ljava/lang/Object;
    //   592: aastore
    //   593: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   596: pop
    //   597: iload_2
    //   598: ifne -> 615
    //   601: iinc #5, 1
    //   604: iload_2
    //   605: ifne -> 479
    //   608: goto -> 615
    //   611: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   614: athrow
    //   615: getstatic burp/Zl1n.ZZ : Ljava/lang/String;
    //   618: getstatic burp/Zs9x.Zo : Ljava/lang/Object;
    //   621: checkcast java/math/BigInteger
    //   624: invokevirtual intValue : ()I
    //   627: bipush #32
    //   629: irem
    //   630: invokestatic abs : (I)I
    //   633: invokevirtual charAt : (I)C
    //   636: getstatic burp/Zx_u.Z_ : Ljava/lang/String;
    //   639: getstatic burp/Zsk4.Ze : Ljava/lang/Object;
    //   642: checkcast java/math/BigInteger
    //   645: invokevirtual intValue : ()I
    //   648: bipush #32
    //   650: irem
    //   651: invokestatic abs : (I)I
    //   654: invokevirtual charAt : (I)C
    //   657: if_icmple -> 764
    //   660: getstatic burp/Zk8g.ZH : Ljava/lang/String;
    //   663: getstatic burp/Zlxh.ZU : Ljava/lang/Object;
    //   666: checkcast java/math/BigInteger
    //   669: invokevirtual intValue : ()I
    //   672: bipush #32
    //   674: irem
    //   675: invokestatic abs : (I)I
    //   678: invokevirtual charAt : (I)C
    //   681: getstatic burp/Zlfi.Zg : Ljava/lang/String;
    //   684: getstatic burp/Zry9.Zw : Ljava/lang/Object;
    //   687: checkcast java/math/BigInteger
    //   690: invokevirtual intValue : ()I
    //   693: bipush #32
    //   695: irem
    //   696: invokestatic abs : (I)I
    //   699: invokevirtual charAt : (I)C
    //   702: if_icmple -> 764
    //   705: goto -> 712
    //   708: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   711: athrow
    //   712: getstatic burp/Zk8g.ZH : Ljava/lang/String;
    //   715: getstatic burp/Zg2z.ZU : Ljava/lang/Object;
    //   718: checkcast java/math/BigInteger
    //   721: invokevirtual intValue : ()I
    //   724: bipush #32
    //   726: irem
    //   727: invokestatic abs : (I)I
    //   730: invokevirtual charAt : (I)C
    //   733: getstatic burp/Zsdn.Zf : Ljava/lang/String;
    //   736: getstatic burp/Zl5d.Za : Ljava/lang/Object;
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
    //   328	342	342	java/lang/Throwable
    //   353	366	369	java/lang/Throwable
    //   358	381	384	java/lang/Throwable
    //   373	399	402	java/lang/Throwable
    //   388	429	432	java/lang/Throwable
    //   492	519	522	java/lang/Throwable
    //   509	540	543	java/lang/Throwable
    //   526	570	573	java/lang/Throwable
    //   547	581	581	java/lang/Throwable
    //   592	608	611	java/lang/Throwable
    //   615	705	708	java/lang/Throwable
    //   660	757	760	java/lang/Throwable
    //   712	768	768	java/lang/Throwable
  }
  
  static void ZH(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'k´Íÿ\\rÙÞüwâÄ£\\nF1å +Ñqeò \\fuÔ WðÀ\\b( î©¢ïµ\\t­¶\\b~%SM¼!¬ÕÈ$®çÉ¦®ÏêÌ³@ þ¢Ã²a*¼õ S<T0püàhÎHÝØÙ£EÃ`ÿ-EüWâ¼ÊH>3Øy§îcÃê¿²k,t¼òÅ\\t~ÊðÓbc\\baQ)KP'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #22
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
    //   68: ldc 'O¤ §XËf¾ÅYøÌÉñTUHæºpËØ~t:l\\rÇ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #31
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
    //   128: putstatic burp/Zk5y.a : [Ljava/lang/String;
    //   131: bipush #8
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zk5y.b : [Ljava/lang/String;
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
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #124
    //   214: goto -> 243
    //   217: bipush #37
    //   219: goto -> 243
    //   222: iconst_2
    //   223: goto -> 243
    //   226: bipush #102
    //   228: goto -> 243
    //   231: bipush #47
    //   233: goto -> 243
    //   236: bipush #67
    //   238: goto -> 243
    //   241: bipush #100
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
    //   300: sipush #27441
    //   303: sipush #16724
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zk5y.ZZ : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #126
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #-21
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #-23
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #-117
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #21
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #36
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #86
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #33
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #-71
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #44
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #80
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #9
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #104
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #77
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #50
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #31
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #119
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #36
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #77
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #-121
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #101
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #-62
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #-43
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #94
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #-128
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #-28
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #8
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #56
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #64
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #-7
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #108
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #-65
    //   505: bastore
    //   506: invokespecial <init> : ([B)V
    //   509: putstatic burp/Zk5y.ZL : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6B36) & 0xFFFF;
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
      byte b1 = 96;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk5y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */