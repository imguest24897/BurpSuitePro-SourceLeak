package com.fasterxml.Zof;

import com.fasterxml.Zb.Z_;
import com.fasterxml.Zb.Zm3;
import com.fasterxml.Zb.Zmr;
import com.fasterxml.Zi.Z_;
import java.io.IOException;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

public final class Zn {
  protected final Zn Zn = null;
  
  protected final AtomicReference<Zk> ZC;
  
  protected final Z_ ZF;
  
  protected final int ZZ;
  
  protected final int Zp;
  
  protected boolean Zi;
  
  protected String[] Zc;
  
  protected Zq[] Zd;
  
  protected int ZY;
  
  protected int ZU;
  
  protected int Zo;
  
  protected int Zm;
  
  protected boolean ZJ;
  
  protected BitSet Zt;
  
  private static String[] Zh;
  
  private static final String[] b;
  
  private static final String[] c;
  
  private Zn(Z_ paramZ_, int paramInt1, int paramInt2) {
    this.ZZ = paramInt2;
    this.ZF = paramZ_;
    this.Zi = true;
    this.Zp = paramInt1;
    this.ZJ = false;
    this.Zm = 0;
    this.ZC = new AtomicReference<>(Zk.Zt(64));
  }
  
  private Zn(Zn paramZn, Z_ paramZ_, int paramInt1, int paramInt2, Zk paramZk) {
    this.ZF = paramZ_;
    this.ZZ = paramInt2;
    this.ZC = null;
    this.Zp = paramInt1;
    this.Zi = Zmr.CANONICALIZE_FIELD_NAMES.ZR(paramInt1);
    this.Zc = paramZk.ZO;
    this.Zd = paramZk.Zb;
    this.ZY = paramZk.ZQ;
    this.Zm = paramZk.Zn;
    int i = this.Zc.length;
    this.ZU = ZS(i);
    this.Zo = i - 1;
    this.ZJ = true;
  }
  
  private static int ZS(int paramInt) {
    return paramInt - (paramInt >> 2);
  }
  
  public static Zn Zx(Zm3 paramZm3) {
    return Zn(paramZm3, 0);
  }
  
  public static Zn Zn(Zm3 paramZm3, int paramInt) {
    Z_ z_;
    int i;
    if (paramInt == 0)
      paramInt = System.identityHashCode(paramZm3); 
    if (paramZm3 == null) {
      z_ = Z_.Zo();
      i = 0;
    } else {
      z_ = paramZm3.ZU();
      i = paramZm3.Zr();
    } 
    return new Zn(z_, i, paramInt);
  }
  
  public Zn Zt() {
    return new Zn(this, this.ZF, this.Zp, this.ZZ, this.ZC.get());
  }
  
  public void ZR() {
    try {
      if (!Zz())
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (this.Zn != null)
        try {
          if (this.Zi) {
            this.Zn.Z_(new Zk(this));
            this.ZJ = true;
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  private void Z_(Zk paramZk) {
    int i = paramZk.ZQ;
    Zk zk = this.ZC.get();
    try {
      if (i == zk.ZQ)
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    if (i > 12000)
      paramZk = Zk.Zt(64); 
    this.ZC.compareAndSet(zk, paramZk);
  }
  
  public boolean Zz() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return !this.ZJ;
  }
  
  public int ZA() {
    return this.ZZ;
  }
  
  public String Zw(char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3) throws IOException {
    try {
      if (paramInt2 < 1)
        return ""; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (!this.Zi) {
        this.ZF.Zr(paramInt2);
        return new String(paramArrayOfchar, paramInt1, paramInt2);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = Zb(paramInt3);
    String str = this.Zc[i];
    try {
      if (str != null) {
        if (str.length() == paramInt2) {
          byte b = 0;
          while (str.charAt(b) == paramArrayOfchar[paramInt1 + b]) {
            if (++b == paramInt2)
              return str; 
          } 
        } 
        Zq zq = this.Zd[i >> 1];
        if (zq != null) {
          str = zq.Zw(paramArrayOfchar, paramInt1, paramInt2);
          try {
            if (str != null)
              return str; 
          } catch (IOException iOException) {
            throw a(null);
          } 
          str = Zz(paramArrayOfchar, paramInt1, paramInt2, zq.Zv);
          try {
            if (str != null)
              return str; 
          } catch (IOException iOException) {
            throw a(null);
          } 
        } 
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZF.Zr(paramInt2);
    return Zp(paramArrayOfchar, paramInt1, paramInt2, paramInt3, i);
  }
  
  private String Zz(char[] paramArrayOfchar, int paramInt1, int paramInt2, Zq paramZq) {
    String[] arrayOfString = ZJ();
    while (paramZq != null) {
      String str = paramZq.Zw(paramArrayOfchar, paramInt1, paramInt2);
      try {
        if (str != null)
          return str; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      paramZq = paramZq.Zv;
      if (arrayOfString == null)
        break; 
    } 
    return null;
  }
  
  private String Zp(char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3, int paramInt4) throws IOException {
    // Byte code:
    //   0: invokestatic ZJ : ()[Ljava/lang/String;
    //   3: astore #6
    //   5: aload_0
    //   6: getfield ZJ : Z
    //   9: ifeq -> 33
    //   12: aload_0
    //   13: invokespecial ZP : ()V
    //   16: aload_0
    //   17: iconst_0
    //   18: putfield ZJ : Z
    //   21: aload #6
    //   23: ifnonnull -> 68
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   32: athrow
    //   33: aload_0
    //   34: getfield ZY : I
    //   37: aload_0
    //   38: getfield ZU : I
    //   41: if_icmplt -> 68
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   50: athrow
    //   51: aload_0
    //   52: invokespecial ZN : ()V
    //   55: aload_0
    //   56: aload_0
    //   57: aload_1
    //   58: iload_2
    //   59: iload_3
    //   60: invokevirtual ZX : ([CII)I
    //   63: invokevirtual Zb : (I)I
    //   66: istore #5
    //   68: new java/lang/String
    //   71: dup
    //   72: aload_1
    //   73: iload_2
    //   74: iload_3
    //   75: invokespecial <init> : ([CII)V
    //   78: astore #7
    //   80: getstatic com/fasterxml/Zb/Zmr.INTERN_FIELD_NAMES : Lcom/fasterxml/Zb/Zmr;
    //   83: aload_0
    //   84: getfield Zp : I
    //   87: invokevirtual ZR : (I)Z
    //   90: ifeq -> 103
    //   93: getstatic com/fasterxml/Zc/Zx9.Ze : Lcom/fasterxml/Zc/Zx9;
    //   96: aload #7
    //   98: invokevirtual Zk : (Ljava/lang/String;)Ljava/lang/String;
    //   101: astore #7
    //   103: aload_0
    //   104: dup
    //   105: getfield ZY : I
    //   108: iconst_1
    //   109: iadd
    //   110: putfield ZY : I
    //   113: aload_0
    //   114: getfield Zc : [Ljava/lang/String;
    //   117: iload #5
    //   119: aaload
    //   120: ifnonnull -> 144
    //   123: aload_0
    //   124: getfield Zc : [Ljava/lang/String;
    //   127: iload #5
    //   129: aload #7
    //   131: aastore
    //   132: aload #6
    //   134: ifnonnull -> 234
    //   137: goto -> 144
    //   140: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   143: athrow
    //   144: iload #5
    //   146: iconst_1
    //   147: ishr
    //   148: istore #8
    //   150: new com/fasterxml/Zof/Zq
    //   153: dup
    //   154: aload #7
    //   156: aload_0
    //   157: getfield Zd : [Lcom/fasterxml/Zof/Zq;
    //   160: iload #8
    //   162: aaload
    //   163: invokespecial <init> : (Ljava/lang/String;Lcom/fasterxml/Zof/Zq;)V
    //   166: astore #9
    //   168: aload #9
    //   170: getfield Zn : I
    //   173: istore #10
    //   175: iload #10
    //   177: sipush #150
    //   180: if_icmple -> 205
    //   183: aload_0
    //   184: iload #8
    //   186: aload #9
    //   188: iload #5
    //   190: invokespecial ZZ : (ILcom/fasterxml/Zof/Zq;I)V
    //   193: aload #6
    //   195: ifnonnull -> 234
    //   198: goto -> 205
    //   201: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   204: athrow
    //   205: aload_0
    //   206: getfield Zd : [Lcom/fasterxml/Zof/Zq;
    //   209: iload #8
    //   211: aload #9
    //   213: aastore
    //   214: aload_0
    //   215: iload #10
    //   217: aload_0
    //   218: getfield Zm : I
    //   221: invokestatic max : (II)I
    //   224: putfield Zm : I
    //   227: goto -> 234
    //   230: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   233: athrow
    //   234: aload #7
    //   236: areturn
    // Exception table:
    //   from	to	target	type
    //   5	26	29	java/io/IOException
    //   12	44	47	java/io/IOException
    //   103	137	140	java/io/IOException
    //   175	198	201	java/io/IOException
    //   183	227	230	java/io/IOException
  }
  
  private void ZZ(int paramInt1, Zq paramZq, int paramInt2) throws IOException {
    // Byte code:
    //   0: invokestatic ZJ : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: aload_0
    //   6: getfield Zt : Ljava/util/BitSet;
    //   9: ifnonnull -> 43
    //   12: aload_0
    //   13: new java/util/BitSet
    //   16: dup
    //   17: invokespecial <init> : ()V
    //   20: putfield Zt : Ljava/util/BitSet;
    //   23: aload_0
    //   24: getfield Zt : Ljava/util/BitSet;
    //   27: iload_1
    //   28: invokevirtual set : (I)V
    //   31: aload #4
    //   33: ifnonnull -> 120
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   42: athrow
    //   43: aload_0
    //   44: getfield Zt : Ljava/util/BitSet;
    //   47: iload_1
    //   48: invokevirtual get : (I)Z
    //   51: ifeq -> 105
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   60: athrow
    //   61: getstatic com/fasterxml/Zb/Zmr.FAIL_ON_SYMBOL_HASH_OVERFLOW : Lcom/fasterxml/Zb/Zmr;
    //   64: aload_0
    //   65: getfield Zp : I
    //   68: invokevirtual ZR : (I)Z
    //   71: ifeq -> 95
    //   74: goto -> 81
    //   77: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   80: athrow
    //   81: aload_0
    //   82: sipush #150
    //   85: invokevirtual Zm : (I)V
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   94: athrow
    //   95: aload_0
    //   96: iconst_0
    //   97: putfield Zi : Z
    //   100: aload #4
    //   102: ifnonnull -> 120
    //   105: aload_0
    //   106: getfield Zt : Ljava/util/BitSet;
    //   109: iload_1
    //   110: invokevirtual set : (I)V
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   119: athrow
    //   120: aload_0
    //   121: getfield Zc : [Ljava/lang/String;
    //   124: iload_3
    //   125: aload_2
    //   126: getfield ZD : Ljava/lang/String;
    //   129: aastore
    //   130: aload_0
    //   131: getfield Zd : [Lcom/fasterxml/Zof/Zq;
    //   134: iload_1
    //   135: aconst_null
    //   136: aastore
    //   137: aload_0
    //   138: dup
    //   139: getfield ZY : I
    //   142: aload_2
    //   143: getfield Zn : I
    //   146: isub
    //   147: putfield ZY : I
    //   150: aload_0
    //   151: iconst_m1
    //   152: putfield Zm : I
    //   155: return
    // Exception table:
    //   from	to	target	type
    //   5	36	39	java/io/IOException
    //   12	54	57	java/io/IOException
    //   43	74	77	java/io/IOException
    //   61	88	91	java/io/IOException
    //   95	113	116	java/io/IOException
  }
  
  public int Zb(int paramInt) {
    paramInt += paramInt >>> 15;
    paramInt ^= paramInt << 7;
    paramInt += paramInt >>> 3;
    return paramInt & this.Zo;
  }
  
  public int ZX(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    int i = this.ZZ;
    int j = paramInt1;
    String[] arrayOfString = ZJ();
    int k = paramInt1 + paramInt2;
    while (j < k) {
      i = i * 33 + paramArrayOfchar[j];
      j++;
      if (arrayOfString == null)
        break; 
    } 
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (i == 0) ? 1 : i;
  }
  
  public int ZK(String paramString) {
    int i = paramString.length();
    int j = this.ZZ;
    byte b = 0;
    String[] arrayOfString = ZJ();
    while (b < i) {
      j = j * 33 + paramString.charAt(b);
      b++;
      if (arrayOfString == null)
        break; 
    } 
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (j == 0) ? 1 : j;
  }
  
  private void ZP() {
    String[] arrayOfString = this.Zc;
    this.Zc = Arrays.<String>copyOf(arrayOfString, arrayOfString.length);
    Zq[] arrayOfZq = this.Zd;
    this.Zd = Arrays.<Zq>copyOf(arrayOfZq, arrayOfZq.length);
  }
  
  private void ZN() throws IOException {
    // Byte code:
    //   0: invokestatic ZJ : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: getfield Zc : [Ljava/lang/String;
    //   7: arraylength
    //   8: istore_2
    //   9: iload_2
    //   10: iload_2
    //   11: iadd
    //   12: istore_3
    //   13: astore_1
    //   14: iload_3
    //   15: ldc 65536
    //   17: if_icmple -> 64
    //   20: aload_0
    //   21: iconst_0
    //   22: putfield ZY : I
    //   25: aload_0
    //   26: iconst_0
    //   27: putfield Zi : Z
    //   30: aload_0
    //   31: bipush #64
    //   33: anewarray java/lang/String
    //   36: putfield Zc : [Ljava/lang/String;
    //   39: aload_0
    //   40: bipush #32
    //   42: anewarray com/fasterxml/Zof/Zq
    //   45: putfield Zd : [Lcom/fasterxml/Zof/Zq;
    //   48: aload_0
    //   49: bipush #63
    //   51: putfield Zo : I
    //   54: aload_0
    //   55: iconst_0
    //   56: putfield ZJ : Z
    //   59: return
    //   60: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   63: athrow
    //   64: aload_0
    //   65: getfield Zc : [Ljava/lang/String;
    //   68: astore #4
    //   70: aload_0
    //   71: getfield Zd : [Lcom/fasterxml/Zof/Zq;
    //   74: astore #5
    //   76: aload_0
    //   77: iload_3
    //   78: anewarray java/lang/String
    //   81: putfield Zc : [Ljava/lang/String;
    //   84: aload_0
    //   85: iload_3
    //   86: iconst_1
    //   87: ishr
    //   88: anewarray com/fasterxml/Zof/Zq
    //   91: putfield Zd : [Lcom/fasterxml/Zof/Zq;
    //   94: aload_0
    //   95: iload_3
    //   96: iconst_1
    //   97: isub
    //   98: putfield Zo : I
    //   101: aload_0
    //   102: iload_3
    //   103: invokestatic ZS : (I)I
    //   106: putfield ZU : I
    //   109: iconst_0
    //   110: istore #6
    //   112: iconst_0
    //   113: istore #7
    //   115: iconst_0
    //   116: istore #8
    //   118: iload #8
    //   120: iload_2
    //   121: if_icmpge -> 233
    //   124: aload #4
    //   126: iload #8
    //   128: aaload
    //   129: astore #9
    //   131: aload #9
    //   133: ifnull -> 226
    //   136: iinc #6, 1
    //   139: aload_0
    //   140: aload_0
    //   141: aload #9
    //   143: invokevirtual ZK : (Ljava/lang/String;)I
    //   146: invokevirtual Zb : (I)I
    //   149: istore #10
    //   151: aload_0
    //   152: getfield Zc : [Ljava/lang/String;
    //   155: iload #10
    //   157: aaload
    //   158: ifnonnull -> 181
    //   161: aload_0
    //   162: getfield Zc : [Ljava/lang/String;
    //   165: iload #10
    //   167: aload #9
    //   169: aastore
    //   170: aload_1
    //   171: ifnonnull -> 226
    //   174: goto -> 181
    //   177: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   180: athrow
    //   181: iload #10
    //   183: iconst_1
    //   184: ishr
    //   185: istore #11
    //   187: new com/fasterxml/Zof/Zq
    //   190: dup
    //   191: aload #9
    //   193: aload_0
    //   194: getfield Zd : [Lcom/fasterxml/Zof/Zq;
    //   197: iload #11
    //   199: aaload
    //   200: invokespecial <init> : (Ljava/lang/String;Lcom/fasterxml/Zof/Zq;)V
    //   203: astore #12
    //   205: aload_0
    //   206: getfield Zd : [Lcom/fasterxml/Zof/Zq;
    //   209: iload #11
    //   211: aload #12
    //   213: aastore
    //   214: iload #7
    //   216: aload #12
    //   218: getfield Zn : I
    //   221: invokestatic max : (II)I
    //   224: istore #7
    //   226: iinc #8, 1
    //   229: aload_1
    //   230: ifnonnull -> 118
    //   233: iload_2
    //   234: iconst_1
    //   235: ishr
    //   236: istore #8
    //   238: iconst_0
    //   239: istore #9
    //   241: iload #9
    //   243: iload #8
    //   245: if_icmpge -> 375
    //   248: aload #5
    //   250: iload #9
    //   252: aaload
    //   253: astore #10
    //   255: aload #10
    //   257: ifnull -> 368
    //   260: iinc #6, 1
    //   263: aload #10
    //   265: getfield ZD : Ljava/lang/String;
    //   268: astore #11
    //   270: aload_0
    //   271: aload_0
    //   272: aload #11
    //   274: invokevirtual ZK : (Ljava/lang/String;)I
    //   277: invokevirtual Zb : (I)I
    //   280: istore #12
    //   282: aload_0
    //   283: getfield Zc : [Ljava/lang/String;
    //   286: iload #12
    //   288: aaload
    //   289: ifnonnull -> 312
    //   292: aload_0
    //   293: getfield Zc : [Ljava/lang/String;
    //   296: iload #12
    //   298: aload #11
    //   300: aastore
    //   301: aload_1
    //   302: ifnonnull -> 357
    //   305: goto -> 312
    //   308: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   311: athrow
    //   312: iload #12
    //   314: iconst_1
    //   315: ishr
    //   316: istore #13
    //   318: new com/fasterxml/Zof/Zq
    //   321: dup
    //   322: aload #11
    //   324: aload_0
    //   325: getfield Zd : [Lcom/fasterxml/Zof/Zq;
    //   328: iload #13
    //   330: aaload
    //   331: invokespecial <init> : (Ljava/lang/String;Lcom/fasterxml/Zof/Zq;)V
    //   334: astore #14
    //   336: aload_0
    //   337: getfield Zd : [Lcom/fasterxml/Zof/Zq;
    //   340: iload #13
    //   342: aload #14
    //   344: aastore
    //   345: iload #7
    //   347: aload #14
    //   349: getfield Zn : I
    //   352: invokestatic max : (II)I
    //   355: istore #7
    //   357: aload #10
    //   359: getfield Zv : Lcom/fasterxml/Zof/Zq;
    //   362: astore #10
    //   364: aload_1
    //   365: ifnonnull -> 255
    //   368: iinc #9, 1
    //   371: aload_1
    //   372: ifnonnull -> 241
    //   375: aload_0
    //   376: iload #7
    //   378: putfield Zm : I
    //   381: aload_0
    //   382: aconst_null
    //   383: putfield Zt : Ljava/util/BitSet;
    //   386: iload #6
    //   388: aload_0
    //   389: getfield ZY : I
    //   392: if_icmpeq -> 441
    //   395: new java/lang/IllegalStateException
    //   398: dup
    //   399: sipush #2450
    //   402: sipush #-9338
    //   405: invokestatic a : (II)Ljava/lang/String;
    //   408: iconst_2
    //   409: anewarray java/lang/Object
    //   412: dup
    //   413: iconst_0
    //   414: aload_0
    //   415: getfield ZY : I
    //   418: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   421: aastore
    //   422: dup
    //   423: iconst_1
    //   424: iload #6
    //   426: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   429: aastore
    //   430: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   433: invokespecial <init> : (Ljava/lang/String;)V
    //   436: athrow
    //   437: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   440: athrow
    //   441: return
    // Exception table:
    //   from	to	target	type
    //   14	60	60	java/io/IOException
    //   151	174	177	java/io/IOException
    //   282	305	308	java/io/IOException
    //   375	437	437	java/io/IOException
  }
  
  protected void Zm(int paramInt) throws Z_ {
    throw new Z_(a(2448, -19407) + this.ZY + a(2449, -19271) + paramInt + a(2451, -1515));
  }
  
  public static void ZT(String[] paramArrayOfString) {
    Zh = paramArrayOfString;
  }
  
  public static String[] ZJ() {
    return Zh;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: iconst_4
    //   9: anewarray java/lang/String
    //   12: ldc 'ÛñM¸[ÅÛ=,(ÍJ1¥Ï¸<ßª1S±RKwkºrùÇÂêç#N¾ú9o ``±lTéX(qP[ Zt$!Ñ±'
    //   14: dup
    //   15: astore_2
    //   16: invokevirtual length : ()I
    //   19: istore #4
    //   21: bipush #23
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: invokestatic ZT : ([Ljava/lang/String;)V
    //   29: bipush #114
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 148
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: ldc 'úÔÁ<&eéûKõÚtsÉ|{#Ò CSé#Gë}l'4ü4¬em¿òÁÉ¡C?dºáC"['x¼Qw'°¹Ël{òº2ß$LE¥(õ©Ú]È«W1Ô/Û:=CÙ¦~cæ®'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: bipush #49
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: bipush #85
    //   90: iinc #0, 1
    //   93: aload_2
    //   94: iload_0
    //   95: dup
    //   96: iload_1
    //   97: iadd
    //   98: invokevirtual substring : (II)Ljava/lang/String;
    //   101: iconst_0
    //   102: goto -> 148
    //   105: aload #5
    //   107: swap
    //   108: iload_3
    //   109: iinc #3, 1
    //   112: swap
    //   113: aastore
    //   114: iload_0
    //   115: iload_1
    //   116: iadd
    //   117: dup
    //   118: istore_0
    //   119: iload #4
    //   121: if_icmpge -> 133
    //   124: aload_2
    //   125: iload_0
    //   126: invokevirtual charAt : (I)C
    //   129: istore_1
    //   130: goto -> 88
    //   133: aload #5
    //   135: putstatic com/fasterxml/Zof/Zn.b : [Ljava/lang/String;
    //   138: iconst_4
    //   139: anewarray java/lang/String
    //   142: putstatic com/fasterxml/Zof/Zn.c : [Ljava/lang/String;
    //   145: goto -> 304
    //   148: dup_x2
    //   149: pop
    //   150: invokevirtual toCharArray : ()[C
    //   153: dup_x1
    //   154: arraylength
    //   155: dup_x2
    //   156: pop
    //   157: iconst_0
    //   158: istore #6
    //   160: dup2_x1
    //   161: pop2
    //   162: dup_x2
    //   163: iconst_1
    //   164: if_icmpgt -> 264
    //   167: dup2
    //   168: swap
    //   169: iload #6
    //   171: dup2_x1
    //   172: caload
    //   173: swap
    //   174: iload #6
    //   176: bipush #7
    //   178: irem
    //   179: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #66
    //   218: goto -> 248
    //   221: bipush #30
    //   223: goto -> 248
    //   226: bipush #32
    //   228: goto -> 248
    //   231: bipush #50
    //   233: goto -> 248
    //   236: bipush #30
    //   238: goto -> 248
    //   241: bipush #10
    //   243: goto -> 248
    //   246: bipush #127
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 171
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 167
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 46, 0 -> 105
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x991) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      char c = 'ò';
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zof\Zn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */