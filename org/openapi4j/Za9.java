package org.openapi4j;

import java.util.regex.Pattern;

abstract class Za9<O extends Zpf, T> extends Zae<O, T> {
  protected static final Zpy Zm;
  
  protected static final Zpy ZW;
  
  protected static final Zpy ZF;
  
  private static final Zpy Zz;
  
  private static final Pattern Zs;
  
  <F extends Zpk<F>> F ZU(O paramO, Zl<F> paramZl, Zpu paramZpu, Za paramZa, Class<F> paramClass) {
    Zh zh = paramZl.getReference(paramO.getContext());
    String str = Zp4.Zi();
    try {
      if (zh == null) {
        paramZpu.ZL(paramZa, ZW, new Object[] { paramZl.getRef() });
        if (str != null) {
          try {
            return (F)zh.<Zpk>Zg(paramClass);
          } catch (Zau zau) {
            paramZpu.ZL(paramZa, ZF, new Object[] { paramZl.getRef() });
          } 
          return null;
        } 
        return null;
      } 
    } catch (Zau zau) {
      throw b(null);
    } 
    try {
      return (F)zh.<Zpk>Zg(paramClass);
    } catch (Zau zau) {
      paramZpu.ZL(paramZa, ZF, new Object[] { paramZl.getRef() });
    } 
    return null;
  }
  
  <F extends Zpk<F>> void ZD(Zpg<Zpf> paramZpg, O paramO, Zl<F> paramZl, Zpu paramZpu, Za paramZa, Zpm<Zpf, F> paramZpm, Class<F> paramClass) {
    F f = (F)ZU(paramO, (Zl)paramZl, paramZpu, paramZa, (Class)paramClass);
    if (f != null)
      paramZpg.ZZ((Zpf)paramO, f, paramZpm, paramZpu); 
  }
  
  protected void ZH(O paramO, String paramString, Zpu paramZpu, boolean paramBoolean, Za paramZa) {
    ZD(paramString, paramZpu, paramBoolean, null, paramZa);
    if (paramString != null)
      ZS(paramO, paramString, paramZpu, paramZa); 
  }
  
  private void ZS(O paramO, String paramString, Zpu paramZpu, Za paramZa) {
    // Byte code:
    //   0: invokestatic Zi : ()Ljava/lang/String;
    //   3: astore #5
    //   5: aload_0
    //   6: aload_2
    //   7: invokevirtual ZF : (Ljava/lang/String;)Z
    //   10: ifeq -> 49
    //   13: new java/net/URL
    //   16: dup
    //   17: aload_2
    //   18: invokespecial <init> : (Ljava/lang/String;)V
    //   21: pop
    //   22: goto -> 272
    //   25: astore #6
    //   27: aload_3
    //   28: aload #4
    //   30: getstatic org/openapi4j/Za9.Zm : Lorg/openapi4j/Zpy;
    //   33: iconst_1
    //   34: anewarray java/lang/Object
    //   37: dup
    //   38: iconst_0
    //   39: aload_2
    //   40: aastore
    //   41: invokevirtual ZL : (Lorg/openapi4j/Za;Lorg/openapi4j/Zpy;[Ljava/lang/Object;)V
    //   44: aload #5
    //   46: ifnull -> 272
    //   49: aload_1
    //   50: invokevirtual hasServers : ()Z
    //   53: ifne -> 92
    //   56: goto -> 63
    //   59: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   62: athrow
    //   63: aload_3
    //   64: aload #4
    //   66: getstatic org/openapi4j/Za9.Zz : Lorg/openapi4j/Zpy;
    //   69: iconst_1
    //   70: anewarray java/lang/Object
    //   73: dup
    //   74: iconst_0
    //   75: aload_2
    //   76: aastore
    //   77: invokevirtual ZL : (Lorg/openapi4j/Za;Lorg/openapi4j/Zpy;[Ljava/lang/Object;)V
    //   80: aload #5
    //   82: ifnull -> 272
    //   85: goto -> 92
    //   88: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   91: athrow
    //   92: aload_1
    //   93: invokevirtual getServers : ()Ljava/util/List;
    //   96: iconst_0
    //   97: invokeinterface get : (I)Ljava/lang/Object;
    //   102: checkcast org/openapi4j/Zp9
    //   105: invokevirtual getDefaultUrl : ()Ljava/lang/String;
    //   108: astore #6
    //   110: aload_0
    //   111: aload #6
    //   113: invokevirtual ZF : (Ljava/lang/String;)Z
    //   116: ifeq -> 171
    //   119: new java/net/URL
    //   122: dup
    //   123: new java/net/URL
    //   126: dup
    //   127: aload #6
    //   129: invokespecial <init> : (Ljava/lang/String;)V
    //   132: aload_2
    //   133: invokespecial <init> : (Ljava/net/URL;Ljava/lang/String;)V
    //   136: pop
    //   137: goto -> 272
    //   140: astore #7
    //   142: aload_3
    //   143: aload #4
    //   145: getstatic org/openapi4j/Za9.Zm : Lorg/openapi4j/Zpy;
    //   148: iconst_1
    //   149: anewarray java/lang/Object
    //   152: dup
    //   153: iconst_0
    //   154: aload #6
    //   156: aload_2
    //   157: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   162: aastore
    //   163: invokevirtual ZL : (Lorg/openapi4j/Za;Lorg/openapi4j/Zpy;[Ljava/lang/Object;)V
    //   166: aload #5
    //   168: ifnull -> 272
    //   171: aload_1
    //   172: invokevirtual getContext : ()Lorg/openapi4j/Zx;
    //   175: invokeinterface Z_ : ()Ljava/net/URL;
    //   180: astore #7
    //   182: new java/net/URL
    //   185: dup
    //   186: aload #7
    //   188: aload #6
    //   190: invokespecial <init> : (Ljava/net/URL;Ljava/lang/String;)V
    //   193: astore #8
    //   195: goto -> 229
    //   198: astore #9
    //   200: aload_3
    //   201: aload #4
    //   203: getstatic org/openapi4j/Za9.Zm : Lorg/openapi4j/Zpy;
    //   206: iconst_1
    //   207: anewarray java/lang/Object
    //   210: dup
    //   211: iconst_0
    //   212: aload #7
    //   214: invokevirtual toString : ()Ljava/lang/String;
    //   217: aload #6
    //   219: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   224: aastore
    //   225: invokevirtual ZL : (Lorg/openapi4j/Za;Lorg/openapi4j/Zpy;[Ljava/lang/Object;)V
    //   228: return
    //   229: new java/net/URL
    //   232: dup
    //   233: aload #8
    //   235: aload_2
    //   236: invokespecial <init> : (Ljava/net/URL;Ljava/lang/String;)V
    //   239: pop
    //   240: goto -> 272
    //   243: astore #9
    //   245: aload_3
    //   246: aload #4
    //   248: getstatic org/openapi4j/Za9.Zm : Lorg/openapi4j/Zpy;
    //   251: iconst_1
    //   252: anewarray java/lang/Object
    //   255: dup
    //   256: iconst_0
    //   257: aload #8
    //   259: invokevirtual toString : ()Ljava/lang/String;
    //   262: aload_2
    //   263: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   268: aastore
    //   269: invokevirtual ZL : (Lorg/openapi4j/Za;Lorg/openapi4j/Zpy;[Ljava/lang/Object;)V
    //   272: return
    // Exception table:
    //   from	to	target	type
    //   13	22	25	java/net/MalformedURLException
    //   27	56	59	java/net/MalformedURLException
    //   49	85	88	java/net/MalformedURLException
    //   119	137	140	java/net/MalformedURLException
    //   182	195	198	java/net/MalformedURLException
    //   229	240	243	java/net/MalformedURLException
  }
  
  protected boolean ZF(String paramString) {
    return Zs.matcher(paramString).matches();
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'p\\n>N\\n&}l3C++{\\\np/bz;xC,2>:P'/>)\\rnC&8x1Gl_'>rp'Rt>ig1Sq\\b-\\bp=Nb)q\-G&}::DC!2p\\b:Lb;qF1z>\\f0K\\r68lR'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #49
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #68
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 129
    //   39: aload_0
    //   40: swap
    //   41: iload #4
    //   43: iinc #4, 1
    //   46: swap
    //   47: aastore
    //   48: iload_1
    //   49: iload_2
    //   50: iadd
    //   51: dup
    //   52: istore_1
    //   53: iload #5
    //   55: if_icmpge -> 67
    //   58: aload_3
    //   59: iload_1
    //   60: invokevirtual charAt : (I)C
    //   63: istore_2
    //   64: goto -> 22
    //   67: ldc 'z!F (p77INhu`V}3C+pF#Ij#4'
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: bipush #17
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #73
    //   83: iinc #1, 1
    //   86: aload_3
    //   87: iload_1
    //   88: dup
    //   89: iload_2
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 129
    //   98: aload_0
    //   99: swap
    //   100: iload #4
    //   102: iinc #4, 1
    //   105: swap
    //   106: aastore
    //   107: iload_1
    //   108: iload_2
    //   109: iadd
    //   110: dup
    //   111: istore_1
    //   112: iload #5
    //   114: if_icmpge -> 126
    //   117: aload_3
    //   118: iload_1
    //   119: invokevirtual charAt : (I)C
    //   122: istore_2
    //   123: goto -> 81
    //   126: goto -> 288
    //   129: dup_x2
    //   130: pop
    //   131: invokevirtual toCharArray : ()[C
    //   134: dup_x1
    //   135: arraylength
    //   136: dup_x2
    //   137: pop
    //   138: iconst_0
    //   139: istore #6
    //   141: dup2_x1
    //   142: pop2
    //   143: dup_x2
    //   144: iconst_1
    //   145: if_icmpgt -> 248
    //   148: dup2
    //   149: swap
    //   150: iload #6
    //   152: dup2_x1
    //   153: caload
    //   154: swap
    //   155: iload #6
    //   157: bipush #7
    //   159: irem
    //   160: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #25
    //   202: goto -> 232
    //   205: bipush #90
    //   207: goto -> 232
    //   210: bipush #56
    //   212: goto -> 232
    //   215: bipush #27
    //   217: goto -> 232
    //   220: bipush #102
    //   222: goto -> 232
    //   225: bipush #39
    //   227: goto -> 232
    //   230: bipush #6
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 152
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 148
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 39, 0 -> 98
    //   288: new org/openapi4j/Zpy
    //   291: dup
    //   292: getstatic org/openapi4j/Zd.ERROR : Lorg/openapi4j/Zd;
    //   295: bipush #108
    //   297: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   300: aload_0
    //   301: iconst_4
    //   302: aaload
    //   303: invokespecial <init> : (Lorg/openapi4j/Zd;Ljava/lang/Integer;Ljava/lang/String;)V
    //   306: putstatic org/openapi4j/Za9.Zm : Lorg/openapi4j/Zpy;
    //   309: new org/openapi4j/Zpy
    //   312: dup
    //   313: getstatic org/openapi4j/Zd.ERROR : Lorg/openapi4j/Zd;
    //   316: bipush #109
    //   318: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   321: aload_0
    //   322: iconst_3
    //   323: aaload
    //   324: invokespecial <init> : (Lorg/openapi4j/Zd;Ljava/lang/Integer;Ljava/lang/String;)V
    //   327: putstatic org/openapi4j/Za9.ZW : Lorg/openapi4j/Zpy;
    //   330: new org/openapi4j/Zpy
    //   333: dup
    //   334: getstatic org/openapi4j/Zd.ERROR : Lorg/openapi4j/Zd;
    //   337: bipush #110
    //   339: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   342: aload_0
    //   343: iconst_2
    //   344: aaload
    //   345: invokespecial <init> : (Lorg/openapi4j/Zd;Ljava/lang/Integer;Ljava/lang/String;)V
    //   348: putstatic org/openapi4j/Za9.ZF : Lorg/openapi4j/Zpy;
    //   351: new org/openapi4j/Zpy
    //   354: dup
    //   355: getstatic org/openapi4j/Zd.ERROR : Lorg/openapi4j/Zd;
    //   358: sipush #145
    //   361: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   364: aload_0
    //   365: iconst_0
    //   366: aaload
    //   367: invokespecial <init> : (Lorg/openapi4j/Zd;Ljava/lang/Integer;Ljava/lang/String;)V
    //   370: putstatic org/openapi4j/Za9.Zz : Lorg/openapi4j/Zpy;
    //   373: aload_0
    //   374: iconst_1
    //   375: aaload
    //   376: iconst_2
    //   377: invokestatic compile : (Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   380: putstatic org/openapi4j/Za9.Zs : Ljava/util/regex/Pattern;
    //   383: return
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Za9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */