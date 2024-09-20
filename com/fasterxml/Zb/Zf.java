package com.fasterxml.Zb;

import com.fasterxml.Zc.Zs;
import com.fasterxml.Zc.Zz;
import com.fasterxml.Zi.Zg;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zyh;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public abstract class Zf implements Closeable, Flushable, Zu {
  protected static final Zz<Zm6> ZV;
  
  protected static final Zz<Zm6> ZF;
  
  protected static final Zz<Zm6> ZB;
  
  protected Zp Ze;
  
  private static boolean Z_;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zr ZV() {
    return Zr.ZW();
  }
  
  public abstract Zmk version();
  
  public abstract Ze Zz();
  
  public void Z_(Object paramObject) {
    Ze ze = Zz();
    try {
      if (ze != null)
        ze.Z_(paramObject); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw b(null);
    } 
  }
  
  @Deprecated
  public void Zr(Object paramObject) {
    Z_(paramObject);
  }
  
  public abstract Zf Zf(Zi paramZi);
  
  public abstract boolean Za(Zi paramZi);
  
  public abstract int Za();
  
  @Deprecated
  public abstract Zf ZG(int paramInt);
  
  public Zf ZK(int paramInt1, int paramInt2) {
    int i = Za();
    int j = i & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2;
    return ZG(j);
  }
  
  public Zf Za(int paramInt1, int paramInt2) {
    return this;
  }
  
  public void Zs(Zb paramZb) {
    throw new UnsupportedOperationException(String.format(a(-15260, 24406), new Object[] { getClass().getName(), paramZb.Zd() }));
  }
  
  public Zf Zy(Zp paramZp) {
    this.Ze = paramZp;
    return this;
  }
  
  public Zp ZP() {
    return this.Ze;
  }
  
  public Zf ZP(int paramInt) {
    return this;
  }
  
  public Zf ZH(Zyh paramZyh) {
    return this;
  }
  
  public Zf Zf(Zj paramZj) {
    throw new UnsupportedOperationException();
  }
  
  public boolean ZB() {
    return false;
  }
  
  public boolean ZH() {
    return false;
  }
  
  public boolean Ze() {
    return false;
  }
  
  public boolean Zu() {
    return true;
  }
  
  public abstract void Zd() throws IOException;
  
  @Deprecated
  public void ZF(int paramInt) throws IOException {
    Zd();
  }
  
  public void Zo(Object paramObject) throws IOException {
    Zd();
    Zr(paramObject);
  }
  
  public void Zf(Object paramObject, int paramInt) throws IOException {
    ZF(paramInt);
    Zr(paramObject);
  }
  
  public abstract void ZI() throws IOException;
  
  public abstract void ZJ() throws IOException;
  
  public void ZB(Object paramObject) throws IOException {
    ZJ();
    Zr(paramObject);
  }
  
  public void Ze(Object paramObject, int paramInt) throws IOException {
    ZB(paramObject);
  }
  
  public abstract void Zh() throws IOException;
  
  public abstract void ZY(String paramString) throws IOException;
  
  public abstract void Zm(Zj paramZj) throws IOException;
  
  public void ZI(long paramLong) throws IOException {
    ZY(Long.toString(paramLong));
  }
  
  public void Zm(int[] paramArrayOfint, int paramInt1, int paramInt2) throws IOException {
    boolean bool = Zd.ZR();
    try {
      if (paramArrayOfint == null)
        throw new IllegalArgumentException(a(-15263, 32620)); 
    } catch (IOException iOException) {
      throw b(null);
    } 
    Zl(paramArrayOfint.length, paramInt1, paramInt2);
    Zf(paramArrayOfint, paramInt2);
    int i = paramInt1;
    int j = paramInt1 + paramInt2;
    while (i < j) {
      Zd(paramArrayOfint[i]);
      i++;
      if (bool)
        break; 
    } 
    ZI();
  }
  
  public void Zx(long[] paramArrayOflong, int paramInt1, int paramInt2) throws IOException {
    boolean bool = Zd.Zm();
    try {
      if (paramArrayOflong == null)
        throw new IllegalArgumentException(a(-15259, 2245)); 
    } catch (IOException iOException) {
      throw b(null);
    } 
    Zl(paramArrayOflong.length, paramInt1, paramInt2);
    Zf(paramArrayOflong, paramInt2);
    int i = paramInt1;
    int j = paramInt1 + paramInt2;
    while (i < j) {
      Zw(paramArrayOflong[i]);
      i++;
      if (!bool)
        break; 
    } 
    ZI();
  }
  
  public void ZW(double[] paramArrayOfdouble, int paramInt1, int paramInt2) throws IOException {
    boolean bool = Zd.Zm();
    try {
      if (paramArrayOfdouble == null)
        throw new IllegalArgumentException(a(-15259, 2245)); 
    } catch (IOException iOException) {
      throw b(null);
    } 
    Zl(paramArrayOfdouble.length, paramInt1, paramInt2);
    Zf(paramArrayOfdouble, paramInt2);
    int i = paramInt1;
    int j = paramInt1 + paramInt2;
    while (i < j) {
      ZF(paramArrayOfdouble[i]);
      i++;
      if (!bool)
        break; 
    } 
    ZI();
  }
  
  public abstract void ZD(String paramString) throws IOException;
  
  public abstract void ZA(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException;
  
  public abstract void Zr(Zj paramZj) throws IOException;
  
  public abstract void ZM(String paramString) throws IOException;
  
  public abstract void Zt(String paramString, int paramInt1, int paramInt2) throws IOException;
  
  public abstract void Zh(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException;
  
  public abstract void ZB(char paramChar) throws IOException;
  
  public void Zg(Zj paramZj) throws IOException {
    ZM(paramZj.ZV());
  }
  
  public abstract void Ze(String paramString) throws IOException;
  
  public void Zh(Zj paramZj) throws IOException {
    Ze(paramZj.ZV());
  }
  
  public abstract void Z_(Zy paramZy, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException;
  
  public void ZI(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    Z_(Zmw.Zx(), paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public void ZO(byte[] paramArrayOfbyte) throws IOException {
    Z_(Zmw.Zx(), paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public int ZL(InputStream paramInputStream, int paramInt) throws IOException {
    return ZE(Zmw.Zx(), paramInputStream, paramInt);
  }
  
  public abstract int ZE(Zy paramZy, InputStream paramInputStream, int paramInt) throws IOException;
  
  public void ZF(short paramShort) throws IOException {
    Zd(paramShort);
  }
  
  public abstract void Zd(int paramInt) throws IOException;
  
  public abstract void Zw(long paramLong) throws IOException;
  
  public abstract void Zy(BigInteger paramBigInteger) throws IOException;
  
  public abstract void ZF(double paramDouble) throws IOException;
  
  public abstract void Za(float paramFloat) throws IOException;
  
  public abstract void ZI(BigDecimal paramBigDecimal) throws IOException;
  
  public abstract void Zu(String paramString) throws IOException;
  
  public abstract void Zs(boolean paramBoolean) throws IOException;
  
  public abstract void ZT() throws IOException;
  
  public void ZJ(Object paramObject) throws IOException {
    try {
      if (paramObject == null) {
        ZT();
        return;
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
    try {
      if (paramObject instanceof byte[]) {
        ZO((byte[])paramObject);
        return;
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
    throw new Zm1(a(-15258, -31552) + paramObject.getClass().getName(), this);
  }
  
  public void ZV(Object paramObject) throws IOException {
    throw new Zm1(a(-15250, -12102), this);
  }
  
  public void Zf(Object paramObject) throws IOException {
    throw new Zm1(a(-15256, -29194), this);
  }
  
  public void Zu(Object paramObject) throws IOException {
    throw new Zm1(a(-15252, -17331), this);
  }
  
  public Zn ZI(Zn paramZn) throws IOException {
    // Byte code:
    //   0: invokestatic Zm : ()Z
    //   3: aload_1
    //   4: getfield ZM : Ljava/lang/Object;
    //   7: astore_3
    //   8: aload_1
    //   9: getfield Zg : Lcom/fasterxml/Zb/Zl;
    //   12: astore #4
    //   14: istore_2
    //   15: aload_0
    //   16: invokevirtual ZH : ()Z
    //   19: ifeq -> 43
    //   22: aload_1
    //   23: iconst_0
    //   24: putfield Zj : Z
    //   27: aload_0
    //   28: aload_3
    //   29: invokevirtual Zu : (Ljava/lang/Object;)V
    //   32: iload_2
    //   33: ifne -> 237
    //   36: goto -> 43
    //   39: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   42: athrow
    //   43: aload_3
    //   44: instanceof java/lang/String
    //   47: ifeq -> 68
    //   50: goto -> 57
    //   53: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: aload_3
    //   58: checkcast java/lang/String
    //   61: goto -> 72
    //   64: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   67: athrow
    //   68: aload_3
    //   69: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   72: astore #5
    //   74: aload_1
    //   75: iconst_1
    //   76: putfield Zj : Z
    //   79: aload_1
    //   80: getfield ZJ : Lcom/fasterxml/Zo2/Zx;
    //   83: astore #6
    //   85: aload #4
    //   87: getstatic com/fasterxml/Zb/Zl.START_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   90: if_acmpeq -> 118
    //   93: aload #6
    //   95: invokevirtual Zf : ()Z
    //   98: ifeq -> 118
    //   101: goto -> 108
    //   104: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   107: athrow
    //   108: aload_1
    //   109: getstatic com/fasterxml/Zo2/Zx.WRAPPER_ARRAY : Lcom/fasterxml/Zo2/Zx;
    //   112: dup
    //   113: astore #6
    //   115: putfield ZJ : Lcom/fasterxml/Zo2/Zx;
    //   118: getstatic com/fasterxml/Zb/Zx.ZF : [I
    //   121: aload #6
    //   123: invokevirtual ordinal : ()I
    //   126: iaload
    //   127: tableswitch default -> 220, 1 -> 160, 2 -> 171, 3 -> 182, 4 -> 206, 5 -> 220
    //   160: iload_2
    //   161: ifne -> 237
    //   164: goto -> 171
    //   167: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   170: athrow
    //   171: iload_2
    //   172: ifne -> 237
    //   175: goto -> 182
    //   178: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   181: athrow
    //   182: aload_0
    //   183: aload_1
    //   184: getfield ZB : Ljava/lang/Object;
    //   187: invokevirtual ZB : (Ljava/lang/Object;)V
    //   190: aload_0
    //   191: aload_1
    //   192: getfield Z_ : Ljava/lang/String;
    //   195: aload #5
    //   197: invokevirtual ZN : (Ljava/lang/String;Ljava/lang/String;)V
    //   200: aload_1
    //   201: areturn
    //   202: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   205: athrow
    //   206: aload_0
    //   207: invokevirtual ZJ : ()V
    //   210: aload_0
    //   211: aload #5
    //   213: invokevirtual ZY : (Ljava/lang/String;)V
    //   216: iload_2
    //   217: ifne -> 237
    //   220: aload_0
    //   221: invokevirtual Zd : ()V
    //   224: aload_0
    //   225: aload #5
    //   227: invokevirtual ZD : (Ljava/lang/String;)V
    //   230: goto -> 237
    //   233: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   236: athrow
    //   237: aload #4
    //   239: getstatic com/fasterxml/Zb/Zl.START_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   242: if_acmpne -> 264
    //   245: aload_0
    //   246: aload_1
    //   247: getfield ZB : Ljava/lang/Object;
    //   250: invokevirtual ZB : (Ljava/lang/Object;)V
    //   253: iload_2
    //   254: ifne -> 290
    //   257: goto -> 264
    //   260: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   263: athrow
    //   264: aload #4
    //   266: getstatic com/fasterxml/Zb/Zl.START_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   269: if_acmpne -> 290
    //   272: goto -> 279
    //   275: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   278: athrow
    //   279: aload_0
    //   280: invokevirtual Zd : ()V
    //   283: goto -> 290
    //   286: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   289: athrow
    //   290: aload_1
    //   291: areturn
    // Exception table:
    //   from	to	target	type
    //   15	36	39	java/io/IOException
    //   22	50	53	java/io/IOException
    //   43	64	64	java/io/IOException
    //   85	101	104	java/io/IOException
    //   118	164	167	java/io/IOException
    //   160	175	178	java/io/IOException
    //   171	202	202	java/io/IOException
    //   206	230	233	java/io/IOException
    //   237	257	260	java/io/IOException
    //   245	272	275	java/io/IOException
    //   264	283	286	java/io/IOException
  }
  
  public Zn ZJ(Zn paramZn) throws IOException {
    // Byte code:
    //   0: invokestatic Zm : ()Z
    //   3: aload_1
    //   4: getfield Zg : Lcom/fasterxml/Zb/Zl;
    //   7: astore_3
    //   8: istore_2
    //   9: aload_3
    //   10: getstatic com/fasterxml/Zb/Zl.START_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   13: if_acmpne -> 31
    //   16: aload_0
    //   17: invokevirtual Zh : ()V
    //   20: iload_2
    //   21: ifne -> 56
    //   24: goto -> 31
    //   27: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: aload_3
    //   32: getstatic com/fasterxml/Zb/Zl.START_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   35: if_acmpne -> 56
    //   38: goto -> 45
    //   41: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: aload_0
    //   46: invokevirtual ZI : ()V
    //   49: goto -> 56
    //   52: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   55: athrow
    //   56: aload_1
    //   57: getfield Zj : Z
    //   60: ifeq -> 196
    //   63: getstatic com/fasterxml/Zb/Zx.ZF : [I
    //   66: aload_1
    //   67: getfield ZJ : Lcom/fasterxml/Zo2/Zx;
    //   70: invokevirtual ordinal : ()I
    //   73: iaload
    //   74: tableswitch default -> 185, 1 -> 127, 2 -> 174, 3 -> 174, 4 -> 185, 5 -> 112
    //   108: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   111: athrow
    //   112: aload_0
    //   113: invokevirtual ZI : ()V
    //   116: iload_2
    //   117: ifne -> 196
    //   120: goto -> 127
    //   123: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   126: athrow
    //   127: aload_1
    //   128: getfield ZM : Ljava/lang/Object;
    //   131: astore #4
    //   133: aload #4
    //   135: instanceof java/lang/String
    //   138: ifeq -> 153
    //   141: aload #4
    //   143: checkcast java/lang/String
    //   146: goto -> 158
    //   149: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   152: athrow
    //   153: aload #4
    //   155: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   158: astore #5
    //   160: aload_0
    //   161: aload_1
    //   162: getfield Z_ : Ljava/lang/String;
    //   165: aload #5
    //   167: invokevirtual ZN : (Ljava/lang/String;Ljava/lang/String;)V
    //   170: iload_2
    //   171: ifne -> 196
    //   174: iload_2
    //   175: ifne -> 196
    //   178: goto -> 185
    //   181: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   184: athrow
    //   185: aload_0
    //   186: invokevirtual Zh : ()V
    //   189: goto -> 196
    //   192: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   195: athrow
    //   196: aload_1
    //   197: areturn
    // Exception table:
    //   from	to	target	type
    //   9	24	27	java/io/IOException
    //   16	38	41	java/io/IOException
    //   31	49	52	java/io/IOException
    //   56	108	108	java/io/IOException
    //   63	120	123	java/io/IOException
    //   133	149	149	java/io/IOException
    //   160	178	181	java/io/IOException
    //   174	189	192	java/io/IOException
  }
  
  public abstract void ZZ(Object paramObject) throws IOException;
  
  public void Zf(String paramString) throws IOException {
    ZY(paramString);
    ZT();
  }
  
  public void ZN(String paramString1, String paramString2) throws IOException {
    ZY(paramString1);
    ZD(paramString2);
  }
  
  public void Zr(String paramString, Object paramObject) throws IOException {
    ZY(paramString);
    ZZ(paramObject);
  }
  
  public void Zd(String paramString) throws IOException {}
  
  public void Zg(Zg paramZg) throws IOException {
    Zl zl = paramZg.Zh();
    boolean bool = Zd.ZR();
    try {
    
    } catch (IOException iOException) {
      throw b(null);
    } 
    boolean bool1 = (zl == null) ? true : zl.Zs();
    try {
      switch (bool1) {
        case true:
          throw ZG(a(-15257, -17875));
        case true:
          try {
            ZJ();
            if (bool);
          } catch (IOException iOException) {
            throw b(null);
          } 
          return;
        case true:
          try {
            Zh();
            if (bool);
          } catch (IOException iOException) {
            throw b(null);
          } 
          return;
        case true:
          try {
            Zd();
            if (bool);
          } catch (IOException iOException) {
            throw b(null);
          } 
          return;
        case true:
          try {
            ZI();
            if (bool);
          } catch (IOException iOException) {
            throw b(null);
          } 
          return;
        case true:
          try {
            ZY(paramZg.ZS());
            if (bool);
          } catch (IOException iOException) {
            throw b(null);
          } 
          return;
        case true:
          try {
            ZO(paramZg);
            if (bool);
          } catch (IOException iOException) {
            throw b(null);
          } 
          return;
        case true:
          try {
            Zt(paramZg);
            if (bool);
          } catch (IOException iOException) {
            throw b(null);
          } 
          return;
        case true:
          try {
            ZB(paramZg);
            if (bool);
          } catch (IOException iOException) {
            throw b(null);
          } 
          return;
        case true:
          try {
            Zs(true);
            if (bool);
          } catch (IOException iOException) {
            throw b(null);
          } 
          return;
        case true:
          try {
            Zs(false);
            if (bool);
          } catch (IOException iOException) {
            throw b(null);
          } 
          return;
        case true:
          try {
            ZT();
            if (bool);
          } catch (IOException iOException) {
            throw b(null);
          } 
          return;
        case true:
          try {
            ZZ(paramZg.ZO());
            if (bool)
              break; 
          } catch (IOException iOException) {
            throw b(null);
          } 
          return;
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
    throw new IllegalStateException(a(-15251, -28734) + zl);
  }
  
  public void ZE(Zg paramZg) throws IOException {
    Zl zl = paramZg.Zh();
    try {
    
    } catch (IOException iOException) {
      throw b(null);
    } 
    boolean bool = (zl == null) ? true : zl.Zs();
    if (bool == 5) {
      ZY(paramZg.ZS());
      zl = paramZg.ZV();
      try {
      
      } catch (IOException iOException) {
        throw b(null);
      } 
      bool = (zl == null) ? true : zl.Zs();
    } 
    try {
      switch (bool) {
        case true:
          ZJ();
          Z_(paramZg);
          return;
        case true:
          Zd();
          Z_(paramZg);
          return;
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
    Zg(paramZg);
  }
  
  protected void Z_(Zg paramZg) throws IOException {
    byte b = 1;
    boolean bool = Zd.Zm();
    Zl zl;
    while ((zl = paramZg.ZV()) != null) {
      try {
        switch (zl.Zs()) {
          case 5:
            ZY(paramZg.ZS());
          case 3:
            Zd();
            b++;
          case 1:
            ZJ();
            b++;
          case 4:
            ZI();
            if (--b == 0)
              return; 
            continue;
          case 2:
            Zh();
            continue;
          case 6:
            ZO(paramZg);
          case 7:
            Zt(paramZg);
          case 8:
            ZB(paramZg);
          case 9:
            Zs(true);
          case 10:
            Zs(false);
          case 11:
            ZT();
          case 12:
            ZZ(paramZg.ZO());
            if (!bool)
              break; 
            continue;
        } 
      } catch (IOException iOException) {
        throw b(null);
      } 
      throw new IllegalStateException(a(-15255, -11535) + zl);
      if (--b == 0)
        return; 
    } 
  }
  
  protected void ZB(Zg paramZg) throws IOException {
    // Byte code:
    //   0: invokestatic ZR : ()Z
    //   3: aload_1
    //   4: invokevirtual ZL : ()Lcom/fasterxml/Zb/Zk;
    //   7: astore_3
    //   8: istore_2
    //   9: aload_3
    //   10: getstatic com/fasterxml/Zb/Zk.BIG_DECIMAL : Lcom/fasterxml/Zb/Zk;
    //   13: if_acmpne -> 35
    //   16: aload_0
    //   17: aload_1
    //   18: invokevirtual ZT : ()Ljava/math/BigDecimal;
    //   21: invokevirtual ZI : (Ljava/math/BigDecimal;)V
    //   24: iload_2
    //   25: ifeq -> 83
    //   28: goto -> 35
    //   31: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   34: athrow
    //   35: aload_3
    //   36: getstatic com/fasterxml/Zb/Zk.FLOAT : Lcom/fasterxml/Zb/Zk;
    //   39: if_acmpne -> 68
    //   42: goto -> 49
    //   45: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   48: athrow
    //   49: aload_0
    //   50: aload_1
    //   51: invokevirtual Zg : ()F
    //   54: invokevirtual Za : (F)V
    //   57: iload_2
    //   58: ifeq -> 83
    //   61: goto -> 68
    //   64: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   67: athrow
    //   68: aload_0
    //   69: aload_1
    //   70: invokevirtual ZH : ()D
    //   73: invokevirtual ZF : (D)V
    //   76: goto -> 83
    //   79: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: return
    // Exception table:
    //   from	to	target	type
    //   9	28	31	java/io/IOException
    //   16	42	45	java/io/IOException
    //   35	61	64	java/io/IOException
    //   49	76	79	java/io/IOException
  }
  
  protected void Zt(Zg paramZg) throws IOException {
    // Byte code:
    //   0: invokestatic Zm : ()Z
    //   3: aload_1
    //   4: invokevirtual ZL : ()Lcom/fasterxml/Zb/Zk;
    //   7: astore_3
    //   8: istore_2
    //   9: aload_3
    //   10: getstatic com/fasterxml/Zb/Zk.INT : Lcom/fasterxml/Zb/Zk;
    //   13: if_acmpne -> 35
    //   16: aload_0
    //   17: aload_1
    //   18: invokevirtual Ze : ()I
    //   21: invokevirtual Zd : (I)V
    //   24: iload_2
    //   25: ifne -> 83
    //   28: goto -> 35
    //   31: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   34: athrow
    //   35: aload_3
    //   36: getstatic com/fasterxml/Zb/Zk.LONG : Lcom/fasterxml/Zb/Zk;
    //   39: if_acmpne -> 68
    //   42: goto -> 49
    //   45: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   48: athrow
    //   49: aload_0
    //   50: aload_1
    //   51: invokevirtual ZE : ()J
    //   54: invokevirtual Zw : (J)V
    //   57: iload_2
    //   58: ifne -> 83
    //   61: goto -> 68
    //   64: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   67: athrow
    //   68: aload_0
    //   69: aload_1
    //   70: invokevirtual ZX : ()Ljava/math/BigInteger;
    //   73: invokevirtual Zy : (Ljava/math/BigInteger;)V
    //   76: goto -> 83
    //   79: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: return
    // Exception table:
    //   from	to	target	type
    //   9	28	31	java/io/IOException
    //   16	42	45	java/io/IOException
    //   35	61	64	java/io/IOException
    //   49	76	79	java/io/IOException
  }
  
  protected void ZO(Zg paramZg) throws IOException {
    boolean bool = Zd.Zm();
    try {
      if (paramZg.Zi()) {
        try {
          ZA(paramZg.ZW(), paramZg.Zk(), paramZg.Zn());
          if (!bool) {
            ZD(paramZg.ZR());
            return;
          } 
        } catch (IOException iOException) {
          throw b(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
    ZD(paramZg.ZR());
  }
  
  public abstract void flush() throws IOException;
  
  public abstract boolean ZU();
  
  public abstract void close() throws IOException;
  
  protected void Zr(String paramString) throws Zm1 {
    throw (Zm1)ZG(paramString);
  }
  
  protected final void ZN() {
    Zs.ZP();
  }
  
  protected void ZY() {
    Za(a(-15253, -22962) + getClass().getName());
  }
  
  protected void Za(String paramString) {
    throw new UnsupportedOperationException(paramString);
  }
  
  protected Zg ZG(String paramString) {
    return new Zm1(paramString, this);
  }
  
  protected final void Zl(int paramInt1, int paramInt2, int paramInt3) {
    try {
      if (paramInt2 >= 0)
        try {
          if (paramInt2 + paramInt3 <= paramInt1)
            return; 
          throw new IllegalArgumentException(String.format(a(-15254, -2418), new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt1) }));
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw b(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw b(null);
    } 
    throw new IllegalArgumentException(String.format(a(-15254, -2418), new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt1) }));
  }
  
  protected void Zz(Object paramObject) throws IOException {
    boolean bool = Zd.Zm();
    try {
      if (paramObject == null) {
        ZT();
        return;
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
    try {
      if (paramObject instanceof String) {
        ZD((String)paramObject);
        return;
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
    if (paramObject instanceof Number) {
      Number number = (Number)paramObject;
      try {
        if (number instanceof Integer) {
          Zd(number.intValue());
          return;
        } 
      } catch (IOException iOException) {
        throw b(null);
      } 
      try {
        if (number instanceof Long) {
          Zw(number.longValue());
          return;
        } 
      } catch (IOException iOException) {
        throw b(null);
      } 
      try {
        if (number instanceof Double) {
          ZF(number.doubleValue());
          return;
        } 
      } catch (IOException iOException) {
        throw b(null);
      } 
      try {
        if (number instanceof Float) {
          Za(number.floatValue());
          return;
        } 
      } catch (IOException iOException) {
        throw b(null);
      } 
      try {
        if (number instanceof Short) {
          ZF(number.shortValue());
          return;
        } 
      } catch (IOException iOException) {
        throw b(null);
      } 
      try {
        if (number instanceof Byte) {
          ZF((short)number.byteValue());
          return;
        } 
      } catch (IOException iOException) {
        throw b(null);
      } 
      try {
        if (number instanceof BigInteger) {
          Zy((BigInteger)number);
          return;
        } 
      } catch (IOException iOException) {
        throw b(null);
      } 
      try {
        if (number instanceof BigDecimal) {
          ZI((BigDecimal)number);
          return;
        } 
      } catch (IOException iOException) {
        throw b(null);
      } 
      try {
        if (number instanceof AtomicInteger) {
          Zd(((AtomicInteger)number).get());
          return;
        } 
      } catch (IOException iOException) {
        throw b(null);
      } 
      try {
        if (number instanceof AtomicLong) {
          Zw(((AtomicLong)number).get());
          return;
        } 
      } catch (IOException iOException) {
        throw b(null);
      } 
      try {
        if (!bool) {
          try {
            if (paramObject instanceof byte[]) {
              ZO((byte[])paramObject);
              return;
            } 
          } catch (IOException iOException) {
            throw b(null);
          } 
          try {
            if (paramObject instanceof Boolean) {
              Zs(((Boolean)paramObject).booleanValue());
              return;
            } 
          } catch (IOException iOException) {
            throw b(null);
          } 
          try {
            if (paramObject instanceof AtomicBoolean) {
              Zs(((AtomicBoolean)paramObject).get());
              return;
            } 
          } catch (IOException iOException) {
            throw b(null);
          } 
          throw new IllegalStateException(a(-15249, -13679) + paramObject.getClass().getName() + ")");
        } 
      } catch (IOException iOException) {
        throw b(null);
      } 
      throw new IllegalStateException(a(-15249, -13679) + paramObject.getClass().getName() + ")");
    } 
    try {
      if (paramObject instanceof byte[]) {
        ZO((byte[])paramObject);
        return;
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
    try {
      if (paramObject instanceof Boolean) {
        Zs(((Boolean)paramObject).booleanValue());
        return;
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
    try {
      if (paramObject instanceof AtomicBoolean) {
        Zs(((AtomicBoolean)paramObject).get());
        return;
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
    throw new IllegalStateException(a(-15249, -13679) + paramObject.getClass().getName() + ")");
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_1
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic Zy : (Z)V
    //   13: ldc ')yWé:5ïD«U'Õ¹Ô}Lc1Éùù\\bCO¸~ÌLqÃX¦AW&¹ Û'­'° èº*;\\tÿèojÝf5üV±æEvîw&"}M*Ü_^\\nNaMhYõGÞFüFY\\ríïy,Tß©UN\\tL«mÚVJ$*ÏLªðË¿ÃV7ùÆòEå\\r()O+F±cýãË¬6ÀÇW]ÿ´(? &ìçK?lsÚY7g~%_¸]- U*6zíVA$ÂQ_' £ÒüéÙÙäæÎuèws¤¸XV\\füQ\\bñÖ¬-8&(èÐñ9èäxýµÚ]ÃbèPç@Ã#öT.¤éçºP h·9òÃ+3°DF\\n]oÀU]ª?^L¼@ûËp¨éÏ7E÷Å0ðBMgoÈO¡µY\\f°HW¾Àe=ÎJy ôY¹SÚã9@äÊÛÒI5m©'%#2LkQ©~r "û¹(ïÑ}1q(çad(N±\\nÙõ!yq9rAé9þUè¤RÁ²Ôj¦`[~ÇÝ¢°þàZ/1lùm¾ÀQ:äøHP\T7~+·¤£:Ð»`S+ëÜ¦\\t_'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #39
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #47
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc 'ã..ºuþÔ¨÷<ZxÈÙìþ®`55s½´é¡»\\t\\rSuöÿÌ·vÙ.\\r})<&K\\n{]UãñY5'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #55
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #26
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic com/fasterxml/Zb/Zf.a : [Ljava/lang/String;
    //   136: bipush #13
    //   138: anewarray java/lang/String
    //   141: putstatic com/fasterxml/Zb/Zf.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #6
    //   218: goto -> 248
    //   221: bipush #46
    //   223: goto -> 248
    //   226: bipush #108
    //   228: goto -> 248
    //   231: bipush #15
    //   233: goto -> 248
    //   236: bipush #33
    //   238: goto -> 248
    //   241: bipush #42
    //   243: goto -> 248
    //   246: bipush #9
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: invokestatic values : ()[Lcom/fasterxml/Zb/Zm6;
    //   307: invokestatic ZU : ([Lcom/fasterxml/Zc/Zm;)Lcom/fasterxml/Zc/Zz;
    //   310: putstatic com/fasterxml/Zb/Zf.ZV : Lcom/fasterxml/Zc/Zz;
    //   313: getstatic com/fasterxml/Zb/Zf.ZV : Lcom/fasterxml/Zc/Zz;
    //   316: getstatic com/fasterxml/Zb/Zm6.CAN_WRITE_FORMATTED_NUMBERS : Lcom/fasterxml/Zb/Zm6;
    //   319: invokevirtual Zj : (Lcom/fasterxml/Zc/Zm;)Lcom/fasterxml/Zc/Zz;
    //   322: putstatic com/fasterxml/Zb/Zf.ZF : Lcom/fasterxml/Zc/Zz;
    //   325: getstatic com/fasterxml/Zb/Zf.ZV : Lcom/fasterxml/Zc/Zz;
    //   328: getstatic com/fasterxml/Zb/Zm6.CAN_WRITE_BINARY_NATIVELY : Lcom/fasterxml/Zb/Zm6;
    //   331: invokevirtual Zj : (Lcom/fasterxml/Zc/Zm;)Lcom/fasterxml/Zc/Zz;
    //   334: putstatic com/fasterxml/Zb/Zf.ZB : Lcom/fasterxml/Zc/Zz;
    //   337: return
  }
  
  public static void Zy(boolean paramBoolean) {
    Z_ = paramBoolean;
  }
  
  public static boolean ZW() {
    return Z_;
  }
  
  public static boolean Zy() {
    boolean bool = ZW();
    try {
      if (!bool)
        return true; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw b(null);
    } 
    return false;
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC46D) & 0xFFFF;
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
      byte b1 = 15;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zb\Zf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */