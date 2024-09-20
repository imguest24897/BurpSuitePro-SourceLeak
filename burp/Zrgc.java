package burp;

import java.math.BigInteger;

class Zrgc extends ClassLoader {
  static Object ZP;
  
  static String Za;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZZ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: aload_0
    //   5: iconst_0
    //   6: iconst_1
    //   7: anewarray java/lang/Object
    //   10: aastore
    //   11: sipush #21468
    //   14: sipush #10194
    //   17: invokestatic a : (II)Ljava/lang/String;
    //   20: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   23: invokevirtual getClass : ()Ljava/lang/Class;
    //   26: sipush #21456
    //   29: sipush #9431
    //   32: invokestatic a : (II)Ljava/lang/String;
    //   35: aconst_null
    //   36: checkcast [Ljava/lang/Class;
    //   39: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   42: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   45: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   48: astore_3
    //   49: aload_3
    //   50: arraylength
    //   51: istore #4
    //   53: iconst_0
    //   54: istore #5
    //   56: iload #5
    //   58: iload #4
    //   60: if_icmpge -> 235
    //   63: aload_3
    //   64: iload #5
    //   66: aaload
    //   67: astore #6
    //   69: aload #6
    //   71: invokevirtual getName : ()Ljava/lang/String;
    //   74: sipush #21465
    //   77: sipush #-2820
    //   80: invokestatic a : (II)Ljava/lang/String;
    //   83: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   86: ifeq -> 228
    //   89: aload #6
    //   91: invokevirtual getModifiers : ()I
    //   94: invokestatic isStatic : (I)Z
    //   97: ifne -> 228
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   106: athrow
    //   107: aload #6
    //   109: invokevirtual getModifiers : ()I
    //   112: invokestatic isProtected : (I)Z
    //   115: ifeq -> 228
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   124: athrow
    //   125: aload #6
    //   127: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   130: astore #7
    //   132: aload #7
    //   134: arraylength
    //   135: iconst_4
    //   136: if_icmpeq -> 146
    //   139: goto -> 228
    //   142: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   145: athrow
    //   146: aload #7
    //   148: iconst_0
    //   149: aaload
    //   150: ldc java/lang/String
    //   152: if_acmpeq -> 162
    //   155: goto -> 228
    //   158: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   161: athrow
    //   162: aload #7
    //   164: iconst_1
    //   165: aaload
    //   166: ldc [B
    //   168: if_acmpeq -> 178
    //   171: goto -> 228
    //   174: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   177: athrow
    //   178: aload #7
    //   180: iconst_2
    //   181: aaload
    //   182: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   185: if_acmpeq -> 195
    //   188: goto -> 228
    //   191: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   194: athrow
    //   195: aload #7
    //   197: iconst_3
    //   198: aaload
    //   199: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   202: if_acmpeq -> 212
    //   205: goto -> 228
    //   208: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   211: athrow
    //   212: aload #6
    //   214: iconst_1
    //   215: invokevirtual setAccessible : (Z)V
    //   218: aload_0
    //   219: iconst_0
    //   220: aaload
    //   221: checkcast [Ljava/lang/Object;
    //   224: iconst_0
    //   225: aload #6
    //   227: aastore
    //   228: iinc #5, 1
    //   231: iload_2
    //   232: ifeq -> 56
    //   235: sipush #21466
    //   238: sipush #-17897
    //   241: invokestatic a : (II)Ljava/lang/String;
    //   244: iconst_1
    //   245: ldc burp/Zb29
    //   247: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   250: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   253: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   256: astore_3
    //   257: aload_3
    //   258: arraylength
    //   259: istore #4
    //   261: iconst_0
    //   262: istore #5
    //   264: iload #5
    //   266: iload #4
    //   268: if_icmpge -> 405
    //   271: aload_3
    //   272: iload #5
    //   274: aaload
    //   275: astore #6
    //   277: aload #6
    //   279: invokevirtual getModifiers : ()I
    //   282: invokestatic isStatic : (I)Z
    //   285: ifne -> 295
    //   288: goto -> 398
    //   291: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   294: athrow
    //   295: aload #6
    //   297: invokevirtual getType : ()Ljava/lang/Class;
    //   300: astore #7
    //   302: aload #7
    //   304: ifnull -> 385
    //   307: aload #7
    //   309: invokevirtual isPrimitive : ()Z
    //   312: ifne -> 385
    //   315: goto -> 322
    //   318: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   321: athrow
    //   322: aload #7
    //   324: invokevirtual getPackage : ()Ljava/lang/Package;
    //   327: ifnull -> 385
    //   330: goto -> 337
    //   333: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   336: athrow
    //   337: aload #7
    //   339: invokevirtual getPackage : ()Ljava/lang/Package;
    //   342: invokevirtual getName : ()Ljava/lang/String;
    //   345: ifnull -> 385
    //   348: goto -> 355
    //   351: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   354: athrow
    //   355: aload #7
    //   357: invokevirtual getPackage : ()Ljava/lang/Package;
    //   360: invokevirtual getName : ()Ljava/lang/String;
    //   363: sipush #21469
    //   366: sipush #-29021
    //   369: invokestatic a : (II)Ljava/lang/String;
    //   372: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   375: ifne -> 385
    //   378: goto -> 385
    //   381: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   384: athrow
    //   385: aload #6
    //   387: iconst_1
    //   388: invokevirtual setAccessible : (Z)V
    //   391: aload #6
    //   393: aconst_null
    //   394: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   397: pop
    //   398: iinc #5, 1
    //   401: iload_2
    //   402: ifeq -> 264
    //   405: sipush #21459
    //   408: sipush #-7239
    //   411: invokestatic a : (II)Ljava/lang/String;
    //   414: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   417: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   420: astore_3
    //   421: aload_3
    //   422: arraylength
    //   423: istore #4
    //   425: iconst_0
    //   426: istore #5
    //   428: iload #5
    //   430: iload #4
    //   432: if_icmpge -> 564
    //   435: aload_3
    //   436: iload #5
    //   438: aaload
    //   439: astore #6
    //   441: aload #6
    //   443: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   446: pop
    //   447: aload #6
    //   449: invokevirtual getModifiers : ()I
    //   452: invokestatic isStatic : (I)Z
    //   455: ifeq -> 550
    //   458: aload #6
    //   460: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   463: arraylength
    //   464: iconst_2
    //   465: if_icmpne -> 550
    //   468: goto -> 475
    //   471: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   474: athrow
    //   475: aload #6
    //   477: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   480: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   483: invokevirtual equals : (Ljava/lang/Object;)Z
    //   486: ifeq -> 550
    //   489: goto -> 496
    //   492: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   495: athrow
    //   496: aload #6
    //   498: iconst_1
    //   499: invokevirtual setAccessible : (Z)V
    //   502: aload #6
    //   504: aconst_null
    //   505: iconst_2
    //   506: anewarray java/lang/Object
    //   509: dup
    //   510: iconst_0
    //   511: aload_0
    //   512: aastore
    //   513: dup
    //   514: iconst_1
    //   515: aload_1
    //   516: ifnonnull -> 534
    //   519: goto -> 526
    //   522: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   525: athrow
    //   526: aload_1
    //   527: goto -> 541
    //   530: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   533: athrow
    //   534: aload_1
    //   535: checkcast [B
    //   538: invokevirtual clone : ()Ljava/lang/Object;
    //   541: aastore
    //   542: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   545: pop
    //   546: iload_2
    //   547: ifeq -> 564
    //   550: iinc #5, 1
    //   553: iload_2
    //   554: ifeq -> 428
    //   557: goto -> 564
    //   560: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   563: athrow
    //   564: getstatic burp/Zl_k.Zw : Ljava/lang/String;
    //   567: getstatic burp/Zer.Zk : Ljava/lang/Object;
    //   570: checkcast java/math/BigInteger
    //   573: invokevirtual intValue : ()I
    //   576: bipush #32
    //   578: irem
    //   579: invokestatic abs : (I)I
    //   582: invokevirtual charAt : (I)C
    //   585: getstatic burp/Zg7p.ZA : Ljava/lang/String;
    //   588: getstatic burp/Zkyc.ZD : Ljava/lang/Object;
    //   591: checkcast java/math/BigInteger
    //   594: invokevirtual intValue : ()I
    //   597: bipush #32
    //   599: irem
    //   600: invokestatic abs : (I)I
    //   603: invokevirtual charAt : (I)C
    //   606: if_icmpgt -> 721
    //   609: getstatic burp/Zr8h.Zk : Ljava/lang/String;
    //   612: getstatic burp/Zkbf.Zx : Ljava/lang/Object;
    //   615: checkcast java/math/BigInteger
    //   618: invokevirtual intValue : ()I
    //   621: bipush #32
    //   623: irem
    //   624: invokestatic abs : (I)I
    //   627: invokevirtual charAt : (I)C
    //   630: getstatic burp/Zein.ZN : Ljava/lang/String;
    //   633: getstatic burp/Zsxj.Zi : Ljava/lang/Object;
    //   636: checkcast java/math/BigInteger
    //   639: invokevirtual intValue : ()I
    //   642: bipush #32
    //   644: irem
    //   645: invokestatic abs : (I)I
    //   648: invokevirtual charAt : (I)C
    //   651: if_icmple -> 721
    //   654: goto -> 661
    //   657: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   660: athrow
    //   661: getstatic burp/Zb2s.Zq : Ljava/lang/String;
    //   664: getstatic burp/Zxso.ZF : Ljava/lang/Object;
    //   667: checkcast java/math/BigInteger
    //   670: invokevirtual intValue : ()I
    //   673: bipush #32
    //   675: irem
    //   676: invokestatic abs : (I)I
    //   679: invokevirtual charAt : (I)C
    //   682: getstatic burp/Zx54.Zs : Ljava/lang/String;
    //   685: getstatic burp/Zb8v.ZA : Ljava/lang/Object;
    //   688: checkcast java/math/BigInteger
    //   691: invokevirtual intValue : ()I
    //   694: bipush #32
    //   696: irem
    //   697: invokestatic abs : (I)I
    //   700: invokevirtual charAt : (I)C
    //   703: if_icmple -> 721
    //   706: goto -> 713
    //   709: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   712: athrow
    //   713: iconst_1
    //   714: goto -> 722
    //   717: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   720: athrow
    //   721: iconst_0
    //   722: ireturn
    //   723: astore_3
    //   724: new java/lang/Exception
    //   727: dup
    //   728: aload_3
    //   729: invokevirtual getMessage : ()Ljava/lang/String;
    //   732: invokespecial <init> : (Ljava/lang/String;)V
    //   735: athrow
    // Exception table:
    //   from	to	target	type
    //   4	722	723	java/lang/Throwable
    //   69	100	103	java/lang/Throwable
    //   89	118	121	java/lang/Throwable
    //   132	142	142	java/lang/Throwable
    //   146	158	158	java/lang/Throwable
    //   162	174	174	java/lang/Throwable
    //   178	191	191	java/lang/Throwable
    //   195	208	208	java/lang/Throwable
    //   277	291	291	java/lang/Throwable
    //   302	315	318	java/lang/Throwable
    //   307	330	333	java/lang/Throwable
    //   322	348	351	java/lang/Throwable
    //   337	378	381	java/lang/Throwable
    //   441	468	471	java/lang/Throwable
    //   458	489	492	java/lang/Throwable
    //   475	519	522	java/lang/Throwable
    //   496	530	530	java/lang/Throwable
    //   541	557	560	java/lang/Throwable
    //   564	654	657	java/lang/Throwable
    //   609	706	709	java/lang/Throwable
    //   661	717	717	java/lang/Throwable
  }
  
  static void Zs(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zp(Object paramObject) {
    Zlv6.Zt = a(21470, -24717);
    Zlv6.ZN = new BigInteger(a(21471, -32629));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zxyu.ZM.charAt(Math.abs(((BigInteger)Zlum.Zj).intValue() % 32)) > Zz3w.ZB.charAt(Math.abs(((BigInteger)Zro5.ZT).intValue() % 32))) {
          try {
            Zb0z.ZB(Class.forName(a(21458, -16834)));
            if (!bool)
              Zeud.Zw(Class.forName(a(21467, 32200))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zeud.Zw(Class.forName(a(21467, 32200)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'çk§TJfM¿6\\tÌH ·øï ýQ÷ô{QitÎÐïîQù#É³*³¯S­¡S¦ºæ?5 íë\\te0ÐÉYm¿­u##M!MS'¡ØÍ÷LMInÝ``ñPsÌ»÷úêû¿ç÷r§!£Ê?çGq ]E\\béÑØËêp1y§LÇvÍÙV:Vì'6õk~ôÒÚÁ¿4¬É\\tBÖãÜ*=®*\\t¸x.±)#'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #113
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
    //   68: ldc '2ÉÅØÞ/N§}ú©¢¸½ù%l'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #78
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
    //   129: putstatic burp/Zrgc.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrgc.b : [Ljava/lang/String;
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
    //   212: bipush #99
    //   214: goto -> 244
    //   217: bipush #85
    //   219: goto -> 244
    //   222: bipush #52
    //   224: goto -> 244
    //   227: bipush #103
    //   229: goto -> 244
    //   232: bipush #117
    //   234: goto -> 244
    //   237: bipush #123
    //   239: goto -> 244
    //   242: bipush #123
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
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #59
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-57
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #-113
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #76
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #93
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #56
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-79
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #-123
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #-55
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #116
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #113
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: iconst_2
    //   372: bastore
    //   373: dup
    //   374: bipush #12
    //   376: bipush #-116
    //   378: bastore
    //   379: dup
    //   380: bipush #13
    //   382: bipush #11
    //   384: bastore
    //   385: dup
    //   386: bipush #14
    //   388: bipush #91
    //   390: bastore
    //   391: dup
    //   392: bipush #15
    //   394: bipush #-64
    //   396: bastore
    //   397: dup
    //   398: bipush #16
    //   400: bipush #-81
    //   402: bastore
    //   403: dup
    //   404: bipush #17
    //   406: bipush #-12
    //   408: bastore
    //   409: dup
    //   410: bipush #18
    //   412: bipush #-20
    //   414: bastore
    //   415: dup
    //   416: bipush #19
    //   418: bipush #-12
    //   420: bastore
    //   421: dup
    //   422: bipush #20
    //   424: iconst_3
    //   425: bastore
    //   426: dup
    //   427: bipush #21
    //   429: bipush #65
    //   431: bastore
    //   432: dup
    //   433: bipush #22
    //   435: bipush #-35
    //   437: bastore
    //   438: dup
    //   439: bipush #23
    //   441: bipush #-27
    //   443: bastore
    //   444: dup
    //   445: bipush #24
    //   447: bipush #120
    //   449: bastore
    //   450: dup
    //   451: bipush #25
    //   453: bipush #67
    //   455: bastore
    //   456: dup
    //   457: bipush #26
    //   459: bipush #17
    //   461: bastore
    //   462: dup
    //   463: bipush #27
    //   465: bipush #61
    //   467: bastore
    //   468: dup
    //   469: bipush #28
    //   471: bipush #70
    //   473: bastore
    //   474: dup
    //   475: bipush #29
    //   477: bipush #51
    //   479: bastore
    //   480: dup
    //   481: bipush #30
    //   483: bipush #-111
    //   485: bastore
    //   486: dup
    //   487: bipush #31
    //   489: bipush #-60
    //   491: bastore
    //   492: invokespecial <init> : ([B)V
    //   495: putstatic burp/Zrgc.ZP : Ljava/lang/Object;
    //   498: sipush #21464
    //   501: sipush #22429
    //   504: invokestatic a : (II)Ljava/lang/String;
    //   507: putstatic burp/Zrgc.Za : Ljava/lang/String;
    //   510: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x53DA) & 0xFFFF;
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
      char c = '§';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrgc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */