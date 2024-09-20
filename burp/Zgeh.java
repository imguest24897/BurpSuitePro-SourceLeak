package burp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zgeh {
  private final Zbz4 Zd = new Zbz4();
  
  private final Zkk3 Zp;
  
  private final Zbkv Zb;
  
  private Pattern ZC;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zgeh(Zkk3 paramZkk3, Zbkv paramZbkv) {
    this.Zp = paramZkk3;
    this.Zb = paramZbkv;
    Zg05 zg05 = paramZkk3.Z_();
    this.Zd.ZU(zg05.Zou());
    this.Zd.Zc(zg05.Zoh());
    this.Zd.Zj(Zg12.ZI(zg05.ZoA(), paramZbkv.Zf()));
    String str = Zbz4.ZI();
    try {
      this.Zd.Zg(Zg12.ZI(zg05.Zox(), paramZbkv.Zf()));
      this.Zd.ZL(zg05.Zo0());
      this.Zd.Zc(zg05.ZoF());
      this.Zd.Zt(zg05.Zob());
      this.Zd.ZF(zg05.Zoi());
      this.Zd.Za(zg05.Zon());
      this.Zd.ZV(zg05.ZoY());
      if (this.Zd.Zr() != null)
        this.ZC = ZT(); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    try {
      this.Zd.ZI(paramZbkv.ZU(zg05.Zop()));
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      Zah.Zl(indexOutOfBoundsException, Zk_.IGNORED);
      this.Zd.ZI(zg05.Zop());
    } 
    if (zg05.ZoN() > -1) {
      try {
        if (zg05.Zop() > -1) {
          int i = paramZbkv.ZU(zg05.Zop() + zg05.ZoN());
          try {
            this.Zd.ZK(i - this.Zd.ZC());
            if (str != null)
              this.Zd.ZK(paramZbkv.ZU(zg05.ZoN())); 
          } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw a(null);
          } 
          return;
        } 
        this.Zd.ZK(paramZbkv.ZU(zg05.ZoN()));
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        try {
          Zah.Zl(indexOutOfBoundsException, Zk_.IGNORED);
          this.Zd.ZK(zg05.ZoN());
          if (str != null) {
            this.Zd.ZK(-1);
            return;
          } 
        } catch (IndexOutOfBoundsException indexOutOfBoundsException1) {
          throw a(null);
        } 
      } 
      return;
    } 
    this.Zd.ZK(-1);
  }
  
  public Zkk3 Zm() {
    int i;
    int j;
    Zg05 zg05 = this.Zp.Z_();
    zg05.ZA(Zk());
    zg05.ZZ(Zw());
    zg05.Zw(Zg12.ZB(Zg(), this.Zb.Zf()));
    zg05.Zq(Zg12.ZB(ZI(), this.Zb.Zf()));
    zg05.Zcf(ZR());
    zg05.ZcO(ZU());
    zg05.ZsS(Zj());
    zg05.Zsv(Zo());
    if (ZL()) {
      zg05.ZcE(true);
      try {
        this.Zp.ZF(Zb());
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.USER_ERROR);
        throw new RuntimeException(exception);
      } 
    } else {
      zg05.ZcE(false);
      zg05.Zs8(null);
    } 
    try {
      i = this.Zb.ZH(ZX());
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      Zah.Zl(indexOutOfBoundsException, Zk_.IGNORED);
      i = ZX();
    } 
    try {
      j = this.Zb.ZH(ZX() + Zu());
    } catch (RuntimeException runtimeException) {
      Zah.Zl(runtimeException, Zk_.IGNORED);
      j = ZX() + Zu();
    } 
    zg05.ZWl(i);
    zg05.ZWF(j - i);
    return this.Zp;
  }
  
  public void Zr() {
    this.Zd.Zt(false);
    ZF();
  }
  
  public void ZP() {
    this.Zd.Zt(true);
    ZF();
  }
  
  public String Zo() {
    return this.Zd.ZF();
  }
  
  public String Zj() {
    return this.Zd.Zv();
  }
  
  public String toString() {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    return (this.Zd.Zv() == null) ? a(-24297, -12545) : this.Zd.Zv();
  }
  
  private String Zb() {
    return this.Zd.Zr();
  }
  
  private Pattern ZT() {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    return Pattern.compile(this.Zd.Zr(), 0x20 | (this.Zd.Zi() ? 0 : 2));
  }
  
  public int[] Zs(String paramString, int paramInt) {
    return ZA(paramString, paramInt, 0);
  }
  
  public int[] ZA(String paramString, int paramInt1, int paramInt2) {
    if (this.Zd.Zw())
      paramInt2 = Math.max(paramInt2, paramInt1); 
    int i = paramString.length();
    try {
      if (ZL())
        return Zp(paramString, paramInt2); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    return ZM(paramString, paramInt2, i);
  }
  
  private int[] Zp(String paramString, int paramInt) {
    try {
      if (this.ZC == null)
        return null; 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Matcher matcher = this.ZC.matcher(paramString);
    try {
      if (!matcher.find(paramInt))
        return null; 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    try {
      if (matcher.groupCount() < 1)
        return null; 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    return new int[] { matcher.start(1), matcher.end(1) };
  }
  
  private int[] ZM(String paramString, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZI : ()Ljava/lang/String;
    //   3: astore #4
    //   5: aload_0
    //   6: getfield Zd : Lburp/Zbz4;
    //   9: invokevirtual ZP : ()B
    //   12: lookupswitch default -> 128, 0 -> 40, 1 -> 114
    //   40: aload_0
    //   41: getfield Zd : Lburp/Zbz4;
    //   44: invokevirtual ZX : ()Ljava/lang/String;
    //   47: invokevirtual length : ()I
    //   50: ifne -> 68
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   59: athrow
    //   60: iload_2
    //   61: istore #5
    //   63: aload #4
    //   65: ifnull -> 149
    //   68: aload_1
    //   69: aload_0
    //   70: getfield Zd : Lburp/Zbz4;
    //   73: invokevirtual ZX : ()Ljava/lang/String;
    //   76: iload_2
    //   77: invokevirtual indexOf : (Ljava/lang/String;I)I
    //   80: istore #5
    //   82: iload #5
    //   84: iconst_m1
    //   85: if_icmpne -> 94
    //   88: aconst_null
    //   89: areturn
    //   90: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   93: athrow
    //   94: iload #5
    //   96: aload_0
    //   97: getfield Zd : Lburp/Zbz4;
    //   100: invokevirtual ZX : ()Ljava/lang/String;
    //   103: invokevirtual length : ()I
    //   106: iadd
    //   107: istore #5
    //   109: aload #4
    //   111: ifnull -> 149
    //   114: aload_0
    //   115: getfield Zd : Lburp/Zbz4;
    //   118: invokevirtual ZC : ()I
    //   121: istore #5
    //   123: aload #4
    //   125: ifnull -> 149
    //   128: iconst_0
    //   129: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   132: aload_0
    //   133: getfield Zd : Lburp/Zbz4;
    //   136: invokevirtual ZP : ()B
    //   139: i2l
    //   140: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   143: aconst_null
    //   144: areturn
    //   145: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   148: athrow
    //   149: iload #5
    //   151: iload_2
    //   152: if_icmplt -> 168
    //   155: iload #5
    //   157: iload_3
    //   158: if_icmple -> 174
    //   161: goto -> 168
    //   164: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   167: athrow
    //   168: aconst_null
    //   169: areturn
    //   170: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   173: athrow
    //   174: aload_0
    //   175: getfield Zd : Lburp/Zbz4;
    //   178: invokevirtual ZD : ()B
    //   181: lookupswitch default -> 291, 0 -> 208, 1 -> 265
    //   208: aload_0
    //   209: getfield Zd : Lburp/Zbz4;
    //   212: invokevirtual ZV : ()Ljava/lang/String;
    //   215: invokevirtual length : ()I
    //   218: ifne -> 236
    //   221: goto -> 228
    //   224: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   227: athrow
    //   228: iload_3
    //   229: istore #6
    //   231: aload #4
    //   233: ifnull -> 312
    //   236: aload_1
    //   237: aload_0
    //   238: getfield Zd : Lburp/Zbz4;
    //   241: invokevirtual ZV : ()Ljava/lang/String;
    //   244: iload #5
    //   246: invokevirtual indexOf : (Ljava/lang/String;I)I
    //   249: istore #6
    //   251: iload #6
    //   253: iconst_m1
    //   254: if_icmpne -> 312
    //   257: iload_3
    //   258: istore #6
    //   260: aload #4
    //   262: ifnull -> 312
    //   265: iload #5
    //   267: aload_0
    //   268: getfield Zd : Lburp/Zbz4;
    //   271: invokevirtual Zy : ()I
    //   274: iadd
    //   275: istore #6
    //   277: iload #6
    //   279: iload_3
    //   280: if_icmple -> 312
    //   283: iload_3
    //   284: istore #6
    //   286: aload #4
    //   288: ifnull -> 312
    //   291: iconst_0
    //   292: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   295: aload_0
    //   296: getfield Zd : Lburp/Zbz4;
    //   299: invokevirtual ZD : ()B
    //   302: i2l
    //   303: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   306: aconst_null
    //   307: areturn
    //   308: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   311: athrow
    //   312: iload #6
    //   314: iload #5
    //   316: if_icmple -> 332
    //   319: iload #6
    //   321: iload_3
    //   322: if_icmple -> 338
    //   325: goto -> 332
    //   328: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   331: athrow
    //   332: aconst_null
    //   333: areturn
    //   334: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   337: athrow
    //   338: iload #5
    //   340: iload_2
    //   341: if_icmpne -> 363
    //   344: iload #6
    //   346: iload_3
    //   347: if_icmpne -> 363
    //   350: goto -> 357
    //   353: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   356: athrow
    //   357: aconst_null
    //   358: areturn
    //   359: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   362: athrow
    //   363: iconst_2
    //   364: newarray int
    //   366: dup
    //   367: iconst_0
    //   368: iload #5
    //   370: iastore
    //   371: dup
    //   372: iconst_1
    //   373: iload #6
    //   375: iastore
    //   376: areturn
    // Exception table:
    //   from	to	target	type
    //   5	53	56	java/lang/IndexOutOfBoundsException
    //   82	90	90	java/lang/IndexOutOfBoundsException
    //   123	145	145	java/lang/IndexOutOfBoundsException
    //   149	161	164	java/lang/IndexOutOfBoundsException
    //   155	170	170	java/lang/IndexOutOfBoundsException
    //   174	221	224	java/lang/IndexOutOfBoundsException
    //   286	308	308	java/lang/IndexOutOfBoundsException
    //   312	325	328	java/lang/IndexOutOfBoundsException
    //   319	334	334	java/lang/IndexOutOfBoundsException
    //   338	350	353	java/lang/IndexOutOfBoundsException
    //   344	359	359	java/lang/IndexOutOfBoundsException
  }
  
  private void ZF() {
    String str = Zbz4.ZI();
    try {
      try {
        this.Zd.ZV(null);
        this.Zd.ZF(null);
        if (!this.Zd.Z_())
          try {
            if (this.Zd.ZP() == 0)
              try {
                if (this.Zd.ZX().length() == 0)
                  try {
                    if (this.Zd.ZD() == 0)
                      try {
                        if (this.Zd.ZV().length() == 0)
                          throw new Exception(); 
                      } catch (Exception exception) {
                        throw a(null);
                      }  
                  } catch (Exception exception) {
                    throw a(null);
                  }  
              } catch (Exception exception) {
                throw a(null);
              }  
          } catch (Exception exception) {
            throw a(null);
          }  
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
        if (this.Zd.Z_()) {
          try {
            ZK();
            if (str != null)
              ZQ(); 
          } catch (Exception exception) {
            throw a(null);
          } 
          return;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      ZQ();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      this.Zd.ZF(null);
    } 
  }
  
  private void ZK() throws Exception {
    try {
      if (this.ZC == null)
        throw new Exception(); 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      if (this.ZC.matcher("").groupCount() < 1)
        throw new Exception(); 
    } catch (Exception exception) {
      throw a(null);
    } 
    this.Zd.ZV(this.Zd.Zr());
    this.Zd.ZF(a(-24290, -16173) + a(-24290, -16173));
  }
  
  private void ZQ() throws Exception {
    // Byte code:
    //   0: invokestatic ZI : ()Ljava/lang/String;
    //   3: astore_1
    //   4: new java/lang/StringBuilder
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_2
    //   12: aload_0
    //   13: getfield Zd : Lburp/Zbz4;
    //   16: invokevirtual ZP : ()B
    //   19: lookupswitch default -> 230, 0 -> 44, 1 -> 156
    //   44: aload_0
    //   45: getfield Zd : Lburp/Zbz4;
    //   48: invokevirtual ZX : ()Ljava/lang/String;
    //   51: invokevirtual length : ()I
    //   54: ifne -> 88
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   63: athrow
    //   64: aload_2
    //   65: sipush #-24291
    //   68: bipush #114
    //   70: invokestatic a : (II)Ljava/lang/String;
    //   73: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: pop
    //   77: aload_1
    //   78: ifnull -> 257
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   87: athrow
    //   88: aload_0
    //   89: getfield Zd : Lburp/Zbz4;
    //   92: aload_0
    //   93: getfield Zd : Lburp/Zbz4;
    //   96: invokevirtual ZX : ()Ljava/lang/String;
    //   99: iconst_0
    //   100: aload_0
    //   101: getfield Zd : Lburp/Zbz4;
    //   104: invokevirtual ZX : ()Ljava/lang/String;
    //   107: invokevirtual length : ()I
    //   110: invokestatic ZQ : (Ljava/lang/String;II)Ljava/lang/String;
    //   113: invokevirtual ZV : (Ljava/lang/String;)V
    //   116: aload_2
    //   117: sipush #-24302
    //   120: sipush #-20977
    //   123: invokestatic a : (II)Ljava/lang/String;
    //   126: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: aload_0
    //   130: getfield Zd : Lburp/Zbz4;
    //   133: invokevirtual ZF : ()Ljava/lang/String;
    //   136: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: ldc ']'
    //   141: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: pop
    //   145: aload_1
    //   146: ifnull -> 257
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   155: athrow
    //   156: aload_0
    //   157: getfield Zd : Lburp/Zbz4;
    //   160: invokevirtual ZC : ()I
    //   163: ifge -> 185
    //   166: goto -> 173
    //   169: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   172: athrow
    //   173: new java/lang/Exception
    //   176: dup
    //   177: invokespecial <init> : ()V
    //   180: athrow
    //   181: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   184: athrow
    //   185: aload_0
    //   186: getfield Zd : Lburp/Zbz4;
    //   189: aload_0
    //   190: getfield Zd : Lburp/Zbz4;
    //   193: invokevirtual ZC : ()I
    //   196: invokestatic toString : (I)Ljava/lang/String;
    //   199: invokevirtual ZV : (Ljava/lang/String;)V
    //   202: aload_2
    //   203: sipush #-24298
    //   206: sipush #-30264
    //   209: invokestatic a : (II)Ljava/lang/String;
    //   212: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: aload_0
    //   216: getfield Zd : Lburp/Zbz4;
    //   219: invokevirtual ZF : ()Ljava/lang/String;
    //   222: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: pop
    //   226: aload_1
    //   227: ifnull -> 257
    //   230: iconst_0
    //   231: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   234: aload_0
    //   235: getfield Zd : Lburp/Zbz4;
    //   238: invokevirtual ZP : ()B
    //   241: i2l
    //   242: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   245: new java/lang/Exception
    //   248: dup
    //   249: invokespecial <init> : ()V
    //   252: athrow
    //   253: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   256: athrow
    //   257: aload_0
    //   258: getfield Zd : Lburp/Zbz4;
    //   261: invokevirtual ZD : ()B
    //   264: lookupswitch default -> 585, 0 -> 292, 1 -> 457
    //   292: aload_2
    //   293: invokevirtual length : ()I
    //   296: ifle -> 331
    //   299: goto -> 306
    //   302: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   305: athrow
    //   306: aload_2
    //   307: sipush #-24299
    //   310: sipush #-5412
    //   313: invokestatic a : (II)Ljava/lang/String;
    //   316: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   319: pop
    //   320: aload_1
    //   321: ifnull -> 352
    //   324: goto -> 331
    //   327: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   330: athrow
    //   331: aload_2
    //   332: sipush #-24289
    //   335: sipush #-6093
    //   338: invokestatic a : (II)Ljava/lang/String;
    //   341: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   344: pop
    //   345: goto -> 352
    //   348: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   351: athrow
    //   352: aload_0
    //   353: getfield Zd : Lburp/Zbz4;
    //   356: invokevirtual ZV : ()Ljava/lang/String;
    //   359: invokevirtual length : ()I
    //   362: ifne -> 390
    //   365: aload_2
    //   366: sipush #-24303
    //   369: sipush #1687
    //   372: invokestatic a : (II)Ljava/lang/String;
    //   375: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   378: pop
    //   379: aload_1
    //   380: ifnull -> 612
    //   383: goto -> 390
    //   386: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   389: athrow
    //   390: aload_0
    //   391: getfield Zd : Lburp/Zbz4;
    //   394: invokevirtual ZV : ()Ljava/lang/String;
    //   397: iconst_0
    //   398: aload_0
    //   399: getfield Zd : Lburp/Zbz4;
    //   402: invokevirtual ZV : ()Ljava/lang/String;
    //   405: invokevirtual length : ()I
    //   408: invokestatic ZQ : (Ljava/lang/String;II)Ljava/lang/String;
    //   411: astore_3
    //   412: aload_2
    //   413: ldc '['
    //   415: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   418: aload_3
    //   419: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   422: ldc ']'
    //   424: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   427: pop
    //   428: aload_0
    //   429: getfield Zd : Lburp/Zbz4;
    //   432: invokevirtual ZF : ()Ljava/lang/String;
    //   435: ifnonnull -> 453
    //   438: aload_0
    //   439: getfield Zd : Lburp/Zbz4;
    //   442: aload_3
    //   443: invokevirtual ZV : (Ljava/lang/String;)V
    //   446: goto -> 453
    //   449: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   452: athrow
    //   453: aload_1
    //   454: ifnull -> 612
    //   457: aload_0
    //   458: getfield Zd : Lburp/Zbz4;
    //   461: invokevirtual Zy : ()I
    //   464: ifge -> 486
    //   467: goto -> 474
    //   470: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   473: athrow
    //   474: new java/lang/Exception
    //   477: dup
    //   478: invokespecial <init> : ()V
    //   481: athrow
    //   482: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   485: athrow
    //   486: aload_2
    //   487: invokevirtual length : ()I
    //   490: ifle -> 518
    //   493: aload_2
    //   494: sipush #-24292
    //   497: sipush #1689
    //   500: invokestatic a : (II)Ljava/lang/String;
    //   503: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   506: pop
    //   507: aload_1
    //   508: ifnull -> 539
    //   511: goto -> 518
    //   514: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   517: athrow
    //   518: aload_2
    //   519: sipush #-24301
    //   522: sipush #-13929
    //   525: invokestatic a : (II)Ljava/lang/String;
    //   528: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   531: pop
    //   532: goto -> 539
    //   535: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   538: athrow
    //   539: aload_0
    //   540: getfield Zd : Lburp/Zbz4;
    //   543: invokevirtual Zy : ()I
    //   546: invokestatic toString : (I)Ljava/lang/String;
    //   549: astore_3
    //   550: aload_2
    //   551: aload_3
    //   552: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   555: pop
    //   556: aload_0
    //   557: getfield Zd : Lburp/Zbz4;
    //   560: invokevirtual ZF : ()Ljava/lang/String;
    //   563: ifnonnull -> 612
    //   566: aload_0
    //   567: getfield Zd : Lburp/Zbz4;
    //   570: aload_3
    //   571: invokevirtual ZV : (Ljava/lang/String;)V
    //   574: aload_1
    //   575: ifnull -> 612
    //   578: goto -> 585
    //   581: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   584: athrow
    //   585: iconst_0
    //   586: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   589: aload_0
    //   590: getfield Zd : Lburp/Zbz4;
    //   593: invokevirtual ZD : ()B
    //   596: i2l
    //   597: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   600: new java/lang/Exception
    //   603: dup
    //   604: invokespecial <init> : ()V
    //   607: athrow
    //   608: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   611: athrow
    //   612: aload_0
    //   613: getfield Zd : Lburp/Zbz4;
    //   616: aload_2
    //   617: invokevirtual toString : ()Ljava/lang/String;
    //   620: invokevirtual ZF : (Ljava/lang/String;)V
    //   623: return
    // Exception table:
    //   from	to	target	type
    //   12	57	60	java/lang/Exception
    //   44	81	84	java/lang/Exception
    //   64	149	152	java/lang/Exception
    //   88	166	169	java/lang/Exception
    //   156	181	181	java/lang/Exception
    //   185	253	253	java/lang/Exception
    //   257	299	302	java/lang/Exception
    //   292	324	327	java/lang/Exception
    //   306	345	348	java/lang/Exception
    //   352	383	386	java/lang/Exception
    //   412	446	449	java/lang/Exception
    //   453	467	470	java/lang/Exception
    //   457	482	482	java/lang/Exception
    //   486	511	514	java/lang/Exception
    //   493	532	535	java/lang/Exception
    //   550	578	581	java/lang/Exception
    //   566	608	608	java/lang/Exception
  }
  
  public byte Zw() {
    return this.Zd.ZD();
  }
  
  public String ZI() {
    return this.Zd.ZV();
  }
  
  public int Zu() {
    return this.Zd.Zy();
  }
  
  public byte Zk() {
    return this.Zd.ZP();
  }
  
  public String Zg() {
    return this.Zd.ZX();
  }
  
  public int ZX() {
    return this.Zd.ZC();
  }
  
  public boolean ZR() {
    return this.Zd.Zi();
  }
  
  public String ZW() {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    return (this.ZC == null) ? null : this.ZC.pattern();
  }
  
  public boolean ZU() {
    return this.Zd.Zw();
  }
  
  public void ZV(byte paramByte) {
    this.Zd.Zc(paramByte);
    ZF();
  }
  
  public void Zr(String paramString) {
    this.Zd.Zj(paramString);
    ZF();
  }
  
  public void ZX(int paramInt) {
    this.Zd.ZK(paramInt);
    ZF();
  }
  
  public void ZB(byte paramByte) {
    this.Zd.ZU(paramByte);
    ZF();
  }
  
  public void Zn(String paramString) {
    this.Zd.Zg(paramString);
    ZF();
  }
  
  public void ZH(int paramInt) {
    this.Zd.ZI(paramInt);
    ZF();
  }
  
  public void Zq(boolean paramBoolean) {
    try {
      this.Zd.ZL(paramBoolean);
      if (this.Zd.Zr() != null)
        this.ZC = ZT(); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    ZF();
  }
  
  public void Zf(String paramString) throws Exception {
    String str = Zbz4.ZI();
    try {
      try {
        this.Zd.Za(paramString);
        this.ZC = ZT();
        if (this.ZC.matcher("").groupCount() < 1)
          throw new Exception(a(-24304, 26895)); 
      } catch (PatternSyntaxException patternSyntaxException) {
        throw a(null);
      } 
      ZF();
    } catch (PatternSyntaxException patternSyntaxException) {
      Zah.Zl(patternSyntaxException, Zk_.USER_ERROR);
      this.ZC = null;
      ZF();
      throw new Exception(a(-24300, -30110));
    } 
    try {
      if (Zbqc.Zwu() == null)
        Zbz4.ZQ("AMjar"); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  public void Za(boolean paramBoolean) {
    this.Zd.Zc(paramBoolean);
    ZF();
  }
  
  public boolean ZL() {
    return this.Zd.Z_();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'á$6\Ì¾RÇ\\f=N2v(¬å¶QÅÀl'¹\\rrbz!DD½=×±=¼6¦ÏÊTdý_´q\½Éòîÿx¦¥kÚ:ñh6\\nòLE'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #67
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
    //   68: ldc '­\\tÜb\\tæfÍB\\b\\t«Î8¸æ×R&'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #10
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #92
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
    //   129: putstatic burp/Zgeh.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zgeh.b : [Ljava/lang/String;
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
    //   212: bipush #90
    //   214: goto -> 244
    //   217: bipush #92
    //   219: goto -> 244
    //   222: bipush #20
    //   224: goto -> 244
    //   227: bipush #78
    //   229: goto -> 244
    //   232: bipush #101
    //   234: goto -> 244
    //   237: bipush #7
    //   239: goto -> 244
    //   242: bipush #108
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA117) & 0xFFFF;
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
      char c = 'Ì';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgeh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */