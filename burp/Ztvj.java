package burp;

import java.math.BigInteger;

class Ztvj extends ClassLoader {
  private static Object ZN;
  
  static String ZK;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zr(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZL(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: sipush #30613
    //   7: sipush #-540
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   19: astore_3
    //   20: aload_3
    //   21: arraylength
    //   22: istore #4
    //   24: iconst_0
    //   25: istore #5
    //   27: iload #5
    //   29: iload #4
    //   31: if_icmpge -> 119
    //   34: aload_3
    //   35: iload #5
    //   37: aaload
    //   38: astore #6
    //   40: aload #6
    //   42: invokevirtual getModifiers : ()I
    //   45: invokestatic isStatic : (I)Z
    //   48: ifeq -> 112
    //   51: aload #6
    //   53: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   56: arraylength
    //   57: iconst_2
    //   58: if_icmpne -> 112
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   67: athrow
    //   68: aload #6
    //   70: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   73: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   76: if_acmpne -> 112
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   85: athrow
    //   86: aload #6
    //   88: aconst_null
    //   89: iconst_2
    //   90: anewarray java/lang/Object
    //   93: dup
    //   94: iconst_0
    //   95: aload_0
    //   96: aastore
    //   97: dup
    //   98: iconst_1
    //   99: aload_1
    //   100: aastore
    //   101: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   104: pop
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   111: athrow
    //   112: iinc #5, 1
    //   115: iload_2
    //   116: ifeq -> 27
    //   119: aload_0
    //   120: iconst_0
    //   121: aaload
    //   122: checkcast java/lang/Class
    //   125: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   128: astore_3
    //   129: aload_3
    //   130: arraylength
    //   131: istore #4
    //   133: iconst_0
    //   134: istore #5
    //   136: iload #5
    //   138: iload #4
    //   140: if_icmpge -> 223
    //   143: aload_3
    //   144: iload #5
    //   146: aaload
    //   147: astore #6
    //   149: aload #6
    //   151: invokevirtual getModifiers : ()I
    //   154: invokestatic isStatic : (I)Z
    //   157: ifeq -> 216
    //   160: aload #6
    //   162: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   165: arraylength
    //   166: iconst_2
    //   167: if_icmpeq -> 184
    //   170: goto -> 177
    //   173: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   176: athrow
    //   177: goto -> 216
    //   180: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   183: athrow
    //   184: aload #6
    //   186: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   189: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   192: invokevirtual equals : (Ljava/lang/Object;)Z
    //   195: ifne -> 205
    //   198: goto -> 216
    //   201: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   204: athrow
    //   205: aload #6
    //   207: iconst_1
    //   208: invokevirtual setAccessible : (Z)V
    //   211: aload #6
    //   213: putstatic burp/Ztvj.ZN : Ljava/lang/Object;
    //   216: iinc #5, 1
    //   219: iload_2
    //   220: ifeq -> 136
    //   223: sipush #30610
    //   226: sipush #925
    //   229: invokestatic a : (II)Ljava/lang/String;
    //   232: iconst_1
    //   233: ldc burp/Zbu
    //   235: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   238: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   241: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   244: astore_3
    //   245: aload_3
    //   246: arraylength
    //   247: istore #4
    //   249: iconst_0
    //   250: istore #5
    //   252: iload #5
    //   254: iload #4
    //   256: if_icmpge -> 393
    //   259: aload_3
    //   260: iload #5
    //   262: aaload
    //   263: astore #6
    //   265: aload #6
    //   267: invokevirtual getModifiers : ()I
    //   270: invokestatic isStatic : (I)Z
    //   273: ifne -> 283
    //   276: goto -> 386
    //   279: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   282: athrow
    //   283: aload #6
    //   285: invokevirtual getType : ()Ljava/lang/Class;
    //   288: astore #7
    //   290: aload #7
    //   292: ifnull -> 373
    //   295: aload #7
    //   297: invokevirtual isPrimitive : ()Z
    //   300: ifne -> 373
    //   303: goto -> 310
    //   306: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   309: athrow
    //   310: aload #7
    //   312: invokevirtual getPackage : ()Ljava/lang/Package;
    //   315: ifnull -> 373
    //   318: goto -> 325
    //   321: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   324: athrow
    //   325: aload #7
    //   327: invokevirtual getPackage : ()Ljava/lang/Package;
    //   330: invokevirtual getName : ()Ljava/lang/String;
    //   333: ifnull -> 373
    //   336: goto -> 343
    //   339: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   342: athrow
    //   343: aload #7
    //   345: invokevirtual getPackage : ()Ljava/lang/Package;
    //   348: invokevirtual getName : ()Ljava/lang/String;
    //   351: sipush #30612
    //   354: sipush #28752
    //   357: invokestatic a : (II)Ljava/lang/String;
    //   360: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   363: ifne -> 373
    //   366: goto -> 373
    //   369: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   372: athrow
    //   373: aload #6
    //   375: iconst_1
    //   376: invokevirtual setAccessible : (Z)V
    //   379: aload #6
    //   381: aconst_null
    //   382: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   385: pop
    //   386: iinc #5, 1
    //   389: iload_2
    //   390: ifeq -> 252
    //   393: sipush #30609
    //   396: sipush #-22541
    //   399: invokestatic a : (II)Ljava/lang/String;
    //   402: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   405: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   408: astore_3
    //   409: aload_3
    //   410: arraylength
    //   411: istore #4
    //   413: iconst_0
    //   414: istore #5
    //   416: iload #5
    //   418: iload #4
    //   420: if_icmpge -> 552
    //   423: aload_3
    //   424: iload #5
    //   426: aaload
    //   427: astore #6
    //   429: aload #6
    //   431: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   434: pop
    //   435: aload #6
    //   437: invokevirtual getModifiers : ()I
    //   440: invokestatic isStatic : (I)Z
    //   443: ifeq -> 538
    //   446: aload #6
    //   448: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   451: arraylength
    //   452: iconst_2
    //   453: if_icmpne -> 538
    //   456: goto -> 463
    //   459: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   462: athrow
    //   463: aload #6
    //   465: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   468: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   471: invokevirtual equals : (Ljava/lang/Object;)Z
    //   474: ifeq -> 538
    //   477: goto -> 484
    //   480: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   483: athrow
    //   484: aload #6
    //   486: iconst_1
    //   487: invokevirtual setAccessible : (Z)V
    //   490: aload #6
    //   492: aconst_null
    //   493: iconst_2
    //   494: anewarray java/lang/Object
    //   497: dup
    //   498: iconst_0
    //   499: aload_0
    //   500: aastore
    //   501: dup
    //   502: iconst_1
    //   503: aload_1
    //   504: ifnonnull -> 522
    //   507: goto -> 514
    //   510: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   513: athrow
    //   514: aload_1
    //   515: goto -> 529
    //   518: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   521: athrow
    //   522: aload_1
    //   523: checkcast [B
    //   526: invokevirtual clone : ()Ljava/lang/Object;
    //   529: aastore
    //   530: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   533: pop
    //   534: iload_2
    //   535: ifeq -> 552
    //   538: iinc #5, 1
    //   541: iload_2
    //   542: ifeq -> 416
    //   545: goto -> 552
    //   548: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   551: athrow
    //   552: getstatic burp/Zk7f.ZA : Ljava/lang/String;
    //   555: getstatic burp/Ztj5.Zj : Ljava/lang/Object;
    //   558: checkcast java/math/BigInteger
    //   561: invokevirtual intValue : ()I
    //   564: bipush #32
    //   566: irem
    //   567: invokestatic abs : (I)I
    //   570: invokevirtual charAt : (I)C
    //   573: getstatic burp/Zrpu.Zy : Ljava/lang/String;
    //   576: getstatic burp/Zzyr.Za : Ljava/lang/Object;
    //   579: checkcast java/math/BigInteger
    //   582: invokevirtual intValue : ()I
    //   585: bipush #32
    //   587: irem
    //   588: invokestatic abs : (I)I
    //   591: invokevirtual charAt : (I)C
    //   594: if_icmple -> 701
    //   597: getstatic burp/Zmj8.ZL : Ljava/lang/String;
    //   600: getstatic burp/Zxzz.ZM : Ljava/lang/Object;
    //   603: checkcast java/math/BigInteger
    //   606: invokevirtual intValue : ()I
    //   609: bipush #32
    //   611: irem
    //   612: invokestatic abs : (I)I
    //   615: invokevirtual charAt : (I)C
    //   618: getstatic burp/Zg4w.ZC : Ljava/lang/String;
    //   621: getstatic burp/Zgq_.ZM : Ljava/lang/Object;
    //   624: checkcast java/math/BigInteger
    //   627: invokevirtual intValue : ()I
    //   630: bipush #32
    //   632: irem
    //   633: invokestatic abs : (I)I
    //   636: invokevirtual charAt : (I)C
    //   639: if_icmple -> 701
    //   642: goto -> 649
    //   645: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   648: athrow
    //   649: getstatic burp/Zb.Zt : Ljava/lang/String;
    //   652: getstatic burp/Zs00.ZF : Ljava/lang/Object;
    //   655: checkcast java/math/BigInteger
    //   658: invokevirtual intValue : ()I
    //   661: bipush #32
    //   663: irem
    //   664: invokestatic abs : (I)I
    //   667: invokevirtual charAt : (I)C
    //   670: getstatic burp/Zrpu.Zy : Ljava/lang/String;
    //   673: getstatic burp/Zs2n.ZK : Ljava/lang/Object;
    //   676: checkcast java/math/BigInteger
    //   679: invokevirtual intValue : ()I
    //   682: bipush #32
    //   684: irem
    //   685: invokestatic abs : (I)I
    //   688: invokevirtual charAt : (I)C
    //   691: if_icmple -> 709
    //   694: goto -> 701
    //   697: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   700: athrow
    //   701: iconst_1
    //   702: goto -> 710
    //   705: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   708: athrow
    //   709: iconst_0
    //   710: ireturn
    //   711: astore_3
    //   712: new java/lang/Exception
    //   715: dup
    //   716: aload_3
    //   717: invokevirtual getMessage : ()Ljava/lang/String;
    //   720: invokespecial <init> : (Ljava/lang/String;)V
    //   723: athrow
    // Exception table:
    //   from	to	target	type
    //   4	710	711	java/lang/Throwable
    //   40	61	64	java/lang/Throwable
    //   51	79	82	java/lang/Throwable
    //   68	105	108	java/lang/Throwable
    //   149	170	173	java/lang/Throwable
    //   160	180	180	java/lang/Throwable
    //   184	201	201	java/lang/Throwable
    //   265	279	279	java/lang/Throwable
    //   290	303	306	java/lang/Throwable
    //   295	318	321	java/lang/Throwable
    //   310	336	339	java/lang/Throwable
    //   325	366	369	java/lang/Throwable
    //   429	456	459	java/lang/Throwable
    //   446	477	480	java/lang/Throwable
    //   463	507	510	java/lang/Throwable
    //   484	518	518	java/lang/Throwable
    //   529	545	548	java/lang/Throwable
    //   552	642	645	java/lang/Throwable
    //   597	694	697	java/lang/Throwable
    //   649	705	705	java/lang/Throwable
  }
  
  static void Zr(Object paramObject) {
    Zefo.Zb = a(30608, 9460);
    Zefo.ZW = new BigInteger(1, new byte[] { 
          23, 61, 48, 44, -119, -58, -62, -112, -31, -44, 
          5, 10, 13, 113, -63, -37, 44, -107, 71, -95, 
          27, -99, 60, -81, -37, 107, -34, -126, 59, 3, 
          93, 46 });
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zrvb.ZU.charAt(Math.abs(((BigInteger)Zgnp.Zm).intValue() % 32)) <= Zz4r.Zq.charAt(Math.abs(((BigInteger)Zbsr.ZD).intValue() % 32))) {
          try {
            Zenr.Zx(Class.forName(a(30615, 24434)));
            if (bool)
              Zg1k.ZQ(Class.forName(a(30611, 8361))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zg1k.ZQ(Class.forName(a(30611, 8361)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Û¤*@\\t»;í5sOÉ;G *%\\rvå¡ÏÛé6ë"Á=\\rÃ[±ï"\\\f Ò\\b¦z9Ò Ý¾Î´TZ>wÀµwMu}2+k«P³Ù/ÓI`3HvD'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #119
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
    //   68: ldc 'g]\\nNP¬÷\\bèó¬p"'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #52
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
    //   129: putstatic burp/Ztvj.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztvj.b : [Ljava/lang/String;
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
    //   212: bipush #42
    //   214: goto -> 244
    //   217: bipush #72
    //   219: goto -> 244
    //   222: bipush #26
    //   224: goto -> 244
    //   227: bipush #105
    //   229: goto -> 244
    //   232: bipush #6
    //   234: goto -> 244
    //   237: bipush #121
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
    //   300: sipush #30614
    //   303: sipush #-27516
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Ztvj.ZK : Ljava/lang/String;
    //   312: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7795) & 0xFFFF;
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
      char c = '÷';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztvj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */