package com.fasterxml.Zor;

import burp.Zbqc;
import com.fasterxml.Zb.Za;
import com.fasterxml.Zb.Zb;
import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zb.Zm0;
import com.fasterxml.Zb.Zmd;
import com.fasterxml.Zb.Zmi;
import com.fasterxml.Zb.Zmk;
import com.fasterxml.Zb.Zmt;
import com.fasterxml.Zb.Zu;
import com.fasterxml.Zg.Zk;
import com.fasterxml.Zh.Zi;
import com.fasterxml.Zi.Za;
import com.fasterxml.Zj.Zv;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zo.Zk;
import com.fasterxml.Zo.Zzd;
import com.fasterxml.Zo.Zzu;
import com.fasterxml.Zyb;
import com.fasterxml.Zyg;
import com.fasterxml.Zyu;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

public class Zy4 extends Zmd implements Zu, Serializable {
  private static final long serialVersionUID = 2L;
  
  protected final Zyc ZH;
  
  protected final Zzd Zo;
  
  protected final Zmi Zf;
  
  protected final boolean Zv;
  
  private final Zyg ZN;
  
  protected final Zk Zi;
  
  protected final Zyo<Object> ZZ;
  
  protected final Object ZW;
  
  protected final Zb Zb;
  
  protected final Zyk ZK;
  
  protected final Zzu ZV;
  
  protected final ConcurrentHashMap<Zk, Zyo<Object>> ZF;
  
  protected transient Zk ZT;
  
  private static final String[] a;
  
  private static final String[] b;
  
  protected Zy4(Zy6 paramZy6, Zyc paramZyc, Zk paramZk, Object paramObject, Zb paramZb, Zyk paramZyk) {
    this.ZH = paramZyc;
    this.Zo = paramZy6.Zg;
    this.ZF = paramZy6.Zf;
    this.Zf = paramZy6.Zd;
    this.Zi = paramZk;
    this.ZW = paramObject;
    this.Zb = paramZb;
    this.ZK = paramZyk;
    this.Zv = paramZyc.Zs();
    this.ZZ = Zm(paramZk);
    this.ZV = null;
    this.ZN = null;
  }
  
  protected Zy4(Zy4 paramZy4, Zyc paramZyc, Zk paramZk, Zyo<Object> paramZyo, Object paramObject, Zb paramZb, Zyk paramZyk, Zzu paramZzu) {
    this.ZH = paramZyc;
    this.Zo = paramZy4.Zo;
    this.ZF = paramZy4.ZF;
    this.Zf = paramZy4.Zf;
    this.Zi = paramZk;
    this.ZZ = paramZyo;
    this.ZW = paramObject;
    this.Zb = paramZb;
    this.ZK = paramZyk;
    this.Zv = paramZyc.Zs();
    this.ZV = paramZzu;
    this.ZN = paramZy4.ZN;
  }
  
  protected Zy4(Zy4 paramZy4, Zyc paramZyc) {
    this.ZH = paramZyc;
    int i = Zyo.ZZ();
    try {
      this.Zo = paramZy4.Zo;
      this.ZF = paramZy4.ZF;
      this.Zf = paramZy4.Zf;
      this.Zi = paramZy4.Zi;
      this.ZZ = paramZy4.ZZ;
      this.ZW = paramZy4.ZW;
      this.Zb = paramZy4.Zb;
      this.ZK = paramZy4.ZK;
      this.Zv = paramZyc.Zs();
      this.ZV = paramZy4.ZV;
      this.ZN = paramZy4.ZN;
      if (Zbqc.Zwu() == null)
        Zyo.ZK(++i); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public Zmk version() {
    return Zv.ZV;
  }
  
  protected Zy4 Zw(Zy4 paramZy4, Zyc paramZyc) {
    return new Zy4(paramZy4, paramZyc);
  }
  
  protected Zy4 ZY(Zy4 paramZy4, Zyc paramZyc, Zk paramZk, Zyo<Object> paramZyo, Object paramObject, Zb paramZb, Zyk paramZyk, Zzu paramZzu) {
    return new Zy4(paramZy4, paramZyc, paramZk, paramZyo, paramObject, paramZb, paramZyk, paramZzu);
  }
  
  protected Zl Zu(Zyg paramZyg, Zg paramZg) throws IOException {
    this.ZH.Zi(paramZg, this.Zb);
    Zl zl = paramZg.Zh();
    if (zl == null) {
      zl = paramZg.ZV();
      try {
        if (zl == null)
          paramZyg.Z_(this.Zi, a(24095, 6616), new Object[0]); 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    return zl;
  }
  
  public Zy4 Zm(Zyp paramZyp) {
    return Za(this.ZH.Zk(paramZyp));
  }
  
  public Zy4 Zh(Zyc paramZyc) {
    return Za(paramZyc);
  }
  
  public Zy4 Zf(Zk paramZk) {
    try {
      if (paramZk != null)
        try {
          if (paramZk.equals(this.Zi))
            return this; 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Zyo<Object> zyo = Zm(paramZk);
    Zzu zzu = this.ZV;
    if (zzu != null)
      zzu = zzu.ZE(paramZk); 
    return ZY(this, this.ZH, paramZk, zyo, this.ZW, this.Zb, this.ZK, zzu);
  }
  
  public Zy4 ZG(Class<?> paramClass) {
    return Zf(this.ZH.Zu(paramClass));
  }
  
  public Zy4 Zv(Object paramObject) {
    int i = Zyo.ZZ();
    try {
      if (paramObject == this.ZW)
        return this; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (paramObject == null)
        return ZY(this, this.ZH, this.Zi, this.ZZ, null, this.Zb, this.ZK, this.ZV); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    if (this.Zi == null) {
      Zk zk1 = this.ZH.Zu(paramObject.getClass());
      if (i != 0) {
        zk1 = this.Zi;
        return ZY(this, this.ZH, zk1, this.ZZ, paramObject, this.Zb, this.ZK, this.ZV);
      } 
      return ZY(this, this.ZH, zk1, this.ZZ, paramObject, this.Zb, this.ZK, this.ZV);
    } 
    Zk zk = this.Zi;
    return ZY(this, this.ZH, zk, this.ZZ, paramObject, this.Zb, this.ZK, this.ZV);
  }
  
  public Zy4 ZZ(Zzu paramZzu) {
    return ZY(this, this.ZH, this.Zi, this.ZZ, this.ZW, this.Zb, this.ZK, paramZzu);
  }
  
  protected Zy4 Za(Zyc paramZyc) {
    try {
      if (paramZyc == this.ZH)
        return this; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Zy4 zy4 = Zw(this, paramZyc);
    if (this.ZV != null)
      zy4 = zy4.ZZ(this.ZV.ZP(paramZyc)); 
    return zy4;
  }
  
  public Zmi ZE() {
    return this.Zf;
  }
  
  public Zi Zb() {
    return this.ZH.Zg();
  }
  
  public Zg Zt(byte[] paramArrayOfbyte) throws IOException {
    ZL(a(24094, 12615), paramArrayOfbyte);
    return this.ZH.Zi(this.Zf.ZG(paramArrayOfbyte), this.Zb);
  }
  
  public <T> T ZU(Zg paramZg) throws IOException {
    ZL("p", paramZg);
    return (T)Zj(paramZg, this.ZW);
  }
  
  public <T> T ZB(Zg paramZg, Class<T> paramClass) throws IOException {
    ZL("p", paramZg);
    return ZG(paramClass).ZU(paramZg);
  }
  
  public Zg ZF(Za paramZa) {
    ZL("n", paramZa);
    Zy4 zy4 = Zv(null);
    return (Zg)new Zk((Zb)paramZa, zy4);
  }
  
  public <T extends Za> T Zz(Zg paramZg) throws IOException {
    ZL("p", paramZg);
    return (T)ZD(paramZg);
  }
  
  public <T> T ZA(byte[] paramArrayOfbyte) throws IOException {
    try {
      if (this.ZV != null)
        return (T)ZQ(paramArrayOfbyte, 0, paramArrayOfbyte.length); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (T)ZV(Zw(Zt(paramArrayOfbyte), false));
  }
  
  public <T> T Zc(Zb paramZb) throws IOException {
    try {
      ZL(a(24083, 2188), paramZb);
      if (this.ZV != null)
        Zc(paramZb); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (T)ZV(Zw(ZF(paramZb), false));
  }
  
  public <T> T Zi(Za paramZa, Class<T> paramClass) throws Zmt {
    ZL("n", paramZa);
    try {
      return ZB(ZF(paramZa), paramClass);
    } catch (Zmt zmt) {
      throw zmt;
    } catch (IOException iOException) {
      throw Zy_.ZG(iOException);
    } 
  }
  
  public void ZZ(Zf paramZf, Object paramObject) throws IOException {
    throw new UnsupportedOperationException(a(24093, -2079));
  }
  
  protected Object Zj(Zg paramZg, Object paramObject) throws IOException {
    // Byte code:
    //   0: invokestatic Zp : ()I
    //   3: aload_0
    //   4: aload_1
    //   5: invokevirtual Zd : (Lcom/fasterxml/Zb/Zg;)Lcom/fasterxml/Zo/Zzd;
    //   8: astore #5
    //   10: istore_3
    //   11: aload_0
    //   12: aload #5
    //   14: aload_1
    //   15: invokevirtual Zu : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zb/Zg;)Lcom/fasterxml/Zb/Zl;
    //   18: astore #6
    //   20: aload #6
    //   22: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   25: if_acmpne -> 63
    //   28: aload_2
    //   29: ifnonnull -> 56
    //   32: goto -> 39
    //   35: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   38: athrow
    //   39: aload_0
    //   40: aload #5
    //   42: invokevirtual Zi : (Lcom/fasterxml/Zor/Zyg;)Lcom/fasterxml/Zor/Zyo;
    //   45: aload #5
    //   47: invokevirtual Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   50: astore #4
    //   52: iload_3
    //   53: ifne -> 122
    //   56: aload_2
    //   57: astore #4
    //   59: iload_3
    //   60: ifne -> 122
    //   63: aload #6
    //   65: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   68: if_acmpeq -> 93
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   77: athrow
    //   78: aload #6
    //   80: getstatic com/fasterxml/Zb/Zl.END_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   83: if_acmpne -> 100
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   92: athrow
    //   93: aload_2
    //   94: astore #4
    //   96: iload_3
    //   97: ifne -> 122
    //   100: aload #5
    //   102: aload_1
    //   103: aload_0
    //   104: getfield Zi : Lcom/fasterxml/Zor/Zk;
    //   107: aload_0
    //   108: aload #5
    //   110: invokevirtual Zi : (Lcom/fasterxml/Zor/Zyg;)Lcom/fasterxml/Zor/Zyo;
    //   113: aload_0
    //   114: getfield ZW : Ljava/lang/Object;
    //   117: invokevirtual ZU : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zyo;Ljava/lang/Object;)Ljava/lang/Object;
    //   120: astore #4
    //   122: aload_1
    //   123: invokevirtual Zo : ()V
    //   126: aload_0
    //   127: getfield ZH : Lcom/fasterxml/Zor/Zyc;
    //   130: getstatic com/fasterxml/Zor/Zyp.FAIL_ON_TRAILING_TOKENS : Lcom/fasterxml/Zor/Zyp;
    //   133: invokevirtual ZG : (Lcom/fasterxml/Zor/Zyp;)Z
    //   136: ifeq -> 157
    //   139: aload_0
    //   140: aload_1
    //   141: aload #5
    //   143: aload_0
    //   144: getfield Zi : Lcom/fasterxml/Zor/Zk;
    //   147: invokevirtual ZZ : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zk;)V
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   156: athrow
    //   157: aload #4
    //   159: areturn
    // Exception table:
    //   from	to	target	type
    //   20	32	35	java/io/IOException
    //   59	71	74	java/io/IOException
    //   63	86	89	java/io/IOException
    //   122	150	153	java/io/IOException
  }
  
  protected Object ZV(Zg paramZg) throws IOException {
    // Byte code:
    //   0: aload_1
    //   1: astore_3
    //   2: invokestatic Zp : ()I
    //   5: aconst_null
    //   6: astore #4
    //   8: istore_2
    //   9: aload_0
    //   10: aload_3
    //   11: invokevirtual Zd : (Lcom/fasterxml/Zb/Zg;)Lcom/fasterxml/Zo/Zzd;
    //   14: astore #6
    //   16: aload_0
    //   17: aload #6
    //   19: aload_3
    //   20: invokevirtual Zu : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zb/Zg;)Lcom/fasterxml/Zb/Zl;
    //   23: astore #7
    //   25: aload #7
    //   27: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   30: if_acmpne -> 74
    //   33: aload_0
    //   34: getfield ZW : Ljava/lang/Object;
    //   37: ifnonnull -> 64
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   46: athrow
    //   47: aload_0
    //   48: aload #6
    //   50: invokevirtual Zi : (Lcom/fasterxml/Zor/Zyg;)Lcom/fasterxml/Zor/Zyo;
    //   53: aload #6
    //   55: invokevirtual Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   58: astore #5
    //   60: iload_2
    //   61: ifne -> 136
    //   64: aload_0
    //   65: getfield ZW : Ljava/lang/Object;
    //   68: astore #5
    //   70: iload_2
    //   71: ifne -> 136
    //   74: aload #7
    //   76: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   79: if_acmpeq -> 104
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   88: athrow
    //   89: aload #7
    //   91: getstatic com/fasterxml/Zb/Zl.END_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   94: if_acmpne -> 114
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   103: athrow
    //   104: aload_0
    //   105: getfield ZW : Ljava/lang/Object;
    //   108: astore #5
    //   110: iload_2
    //   111: ifne -> 136
    //   114: aload #6
    //   116: aload_3
    //   117: aload_0
    //   118: getfield Zi : Lcom/fasterxml/Zor/Zk;
    //   121: aload_0
    //   122: aload #6
    //   124: invokevirtual Zi : (Lcom/fasterxml/Zor/Zyg;)Lcom/fasterxml/Zor/Zyo;
    //   127: aload_0
    //   128: getfield ZW : Ljava/lang/Object;
    //   131: invokevirtual ZU : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zyo;Ljava/lang/Object;)Ljava/lang/Object;
    //   134: astore #5
    //   136: aload_0
    //   137: getfield ZH : Lcom/fasterxml/Zor/Zyc;
    //   140: getstatic com/fasterxml/Zor/Zyp.FAIL_ON_TRAILING_TOKENS : Lcom/fasterxml/Zor/Zyp;
    //   143: invokevirtual ZG : (Lcom/fasterxml/Zor/Zyp;)Z
    //   146: ifeq -> 167
    //   149: aload_0
    //   150: aload_3
    //   151: aload #6
    //   153: aload_0
    //   154: getfield Zi : Lcom/fasterxml/Zor/Zk;
    //   157: invokevirtual ZZ : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zk;)V
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   166: athrow
    //   167: aload #5
    //   169: astore #8
    //   171: aload_3
    //   172: ifnull -> 218
    //   175: aload #4
    //   177: ifnull -> 207
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   186: athrow
    //   187: aload_3
    //   188: invokevirtual close : ()V
    //   191: goto -> 218
    //   194: astore #9
    //   196: aload #4
    //   198: aload #9
    //   200: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   203: iload_2
    //   204: ifne -> 218
    //   207: aload_3
    //   208: invokevirtual close : ()V
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   217: athrow
    //   218: aload #8
    //   220: areturn
    //   221: astore #5
    //   223: aload #5
    //   225: astore #4
    //   227: aload #5
    //   229: athrow
    //   230: astore #10
    //   232: aload_3
    //   233: ifnull -> 279
    //   236: aload #4
    //   238: ifnull -> 268
    //   241: goto -> 248
    //   244: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   247: athrow
    //   248: aload_3
    //   249: invokevirtual close : ()V
    //   252: goto -> 279
    //   255: astore #11
    //   257: aload #4
    //   259: aload #11
    //   261: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   264: iload_2
    //   265: ifne -> 279
    //   268: aload_3
    //   269: invokevirtual close : ()V
    //   272: goto -> 279
    //   275: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   278: athrow
    //   279: aload #10
    //   281: athrow
    // Exception table:
    //   from	to	target	type
    //   9	171	221	java/lang/Throwable
    //   9	171	230	finally
    //   25	40	43	java/lang/Throwable
    //   70	82	85	java/lang/Throwable
    //   74	97	100	java/lang/Throwable
    //   136	160	163	java/lang/Throwable
    //   171	180	183	java/lang/Throwable
    //   187	191	194	java/lang/Throwable
    //   196	211	214	java/lang/Throwable
    //   221	232	230	finally
    //   232	241	244	java/lang/Throwable
    //   248	252	255	java/lang/Throwable
    //   257	272	275	java/lang/Throwable
  }
  
  protected final Zb ZD(Zg paramZg) throws IOException {
    // Byte code:
    //   0: invokestatic Zp : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield ZW : Ljava/lang/Object;
    //   8: ifnull -> 28
    //   11: aload_0
    //   12: aload_1
    //   13: aload_0
    //   14: getfield ZW : Ljava/lang/Object;
    //   17: invokevirtual Zj : (Lcom/fasterxml/Zb/Zg;Ljava/lang/Object;)Ljava/lang/Object;
    //   20: checkcast com/fasterxml/Zor/Zb
    //   23: areturn
    //   24: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   27: athrow
    //   28: aload_0
    //   29: getfield ZH : Lcom/fasterxml/Zor/Zyc;
    //   32: aload_1
    //   33: invokevirtual ZO : (Lcom/fasterxml/Zb/Zg;)Lcom/fasterxml/Zb/Zg;
    //   36: pop
    //   37: aload_0
    //   38: getfield Zb : Lcom/fasterxml/Zb/Zb;
    //   41: ifnull -> 59
    //   44: aload_1
    //   45: aload_0
    //   46: getfield Zb : Lcom/fasterxml/Zb/Zb;
    //   49: invokevirtual ZQ : (Lcom/fasterxml/Zb/Zb;)V
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   58: athrow
    //   59: aload_1
    //   60: invokevirtual Zh : ()Lcom/fasterxml/Zb/Zl;
    //   63: astore_3
    //   64: aload_3
    //   65: ifnonnull -> 83
    //   68: aload_1
    //   69: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   72: astore_3
    //   73: aload_3
    //   74: ifnonnull -> 83
    //   77: aconst_null
    //   78: areturn
    //   79: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   82: athrow
    //   83: aload_0
    //   84: aload_1
    //   85: invokevirtual Zd : (Lcom/fasterxml/Zb/Zg;)Lcom/fasterxml/Zo/Zzd;
    //   88: astore #4
    //   90: aload_3
    //   91: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   94: if_acmpne -> 113
    //   97: aload_0
    //   98: getfield ZH : Lcom/fasterxml/Zor/Zyc;
    //   101: invokevirtual ZX : ()Lcom/fasterxml/Zg/Zfc;
    //   104: invokevirtual ZW : ()Lcom/fasterxml/Zg/Zs;
    //   107: astore #5
    //   109: iload_2
    //   110: ifne -> 135
    //   113: aload #4
    //   115: aload_1
    //   116: aload_0
    //   117: invokevirtual ZC : ()Lcom/fasterxml/Zor/Zk;
    //   120: aload_0
    //   121: aload #4
    //   123: invokevirtual Zq : (Lcom/fasterxml/Zor/Zyg;)Lcom/fasterxml/Zor/Zyo;
    //   126: aconst_null
    //   127: invokevirtual ZU : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zyo;Ljava/lang/Object;)Ljava/lang/Object;
    //   130: checkcast com/fasterxml/Zor/Zb
    //   133: astore #5
    //   135: aload_1
    //   136: invokevirtual Zo : ()V
    //   139: aload_0
    //   140: getfield ZH : Lcom/fasterxml/Zor/Zyc;
    //   143: getstatic com/fasterxml/Zor/Zyp.FAIL_ON_TRAILING_TOKENS : Lcom/fasterxml/Zor/Zyp;
    //   146: invokevirtual ZG : (Lcom/fasterxml/Zor/Zyp;)Z
    //   149: ifeq -> 170
    //   152: aload_0
    //   153: aload_1
    //   154: aload #4
    //   156: aload_0
    //   157: invokevirtual ZC : ()Lcom/fasterxml/Zor/Zk;
    //   160: invokevirtual ZZ : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zk;)V
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   169: athrow
    //   170: aload #5
    //   172: areturn
    // Exception table:
    //   from	to	target	type
    //   4	24	24	java/io/IOException
    //   28	52	55	java/io/IOException
    //   73	79	79	java/io/IOException
    //   135	163	166	java/io/IOException
  }
  
  protected Zg Zw(Zg paramZg, boolean paramBoolean) {
    try {
      if (this.ZN != null) {
        try {
          if (Zyb.class.isInstance(paramZg));
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        return (Zg)new Zyb(paramZg, this.ZN, Zyu.ONLY_INCLUDE_ALL, paramBoolean);
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  protected final void ZZ(Zg paramZg, Zyg paramZyg, Zk paramZk) throws IOException {
    Zl zl = paramZg.ZV();
    if (zl != null) {
      Class<?> clazz = Zx.ZB(paramZk);
      try {
        if (clazz == null && this.ZW != null)
          clazz = this.ZW.getClass(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      paramZyg.Zq(clazz, paramZg, zl);
    } 
  }
  
  protected Object ZQ(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    Zk zk = this.ZV.Zm(paramArrayOfbyte, paramInt1, paramInt2);
    try {
      if (!zk.Zk())
        Zc(this.ZV, zk); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zg zg = zk.ZM();
    return zk.ZU().ZV(zg);
  }
  
  protected void Zc(Zzu paramZzu, Zk paramZk) throws IOException {
    throw new Zm0(null, a(24082, 12043) + paramZzu.toString());
  }
  
  protected Zzd Zd(Zg paramZg) {
    return this.Zo.Zz(this.ZH, paramZg, this.ZK);
  }
  
  protected Zzd Zh() {
    return this.Zo.Zk(this.ZH);
  }
  
  protected void Zc(Object paramObject) throws Za {
    throw new Zm0(null, a(24092, -12592) + paramObject.getClass().getName() + a(24081, -11078));
  }
  
  protected Zyo<Object> Zi(Zyg paramZyg) throws Zym {
    try {
      if (this.ZZ != null)
        return this.ZZ; 
    } catch (Zym zym) {
      throw a(null);
    } 
    Zk zk = this.Zi;
    try {
      if (zk == null)
        paramZyg.Zm((Zk)null, a(24089, 1284)); 
    } catch (Zym zym) {
      throw a(null);
    } 
    Zyo<Object> zyo = this.ZF.get(zk);
    try {
      if (zyo != null)
        return zyo; 
    } catch (Zym zym) {
      throw a(null);
    } 
    zyo = paramZyg.ZP(zk);
    try {
      if (zyo == null)
        paramZyg.Zm(zk, a(24090, -19775) + zk); 
    } catch (Zym zym) {
      throw a(null);
    } 
    this.ZF.put(zk, zyo);
    return zyo;
  }
  
  protected Zyo<Object> Zq(Zyg paramZyg) throws Zym {
    Zk zk = ZC();
    Zyo<Object> zyo = this.ZF.get(zk);
    if (zyo == null) {
      zyo = paramZyg.ZP(zk);
      try {
        if (zyo == null)
          paramZyg.Zm(zk, a(24088, 32577) + zk); 
      } catch (Zym zym) {
        throw a(null);
      } 
      this.ZF.put(zk, zyo);
    } 
    return zyo;
  }
  
  protected Zyo<Object> Zm(Zk paramZk) {
    try {
      if (paramZk != null)
        try {
          if (this.ZH.ZG(Zyp.EAGER_DESERIALIZER_FETCH)) {
            Zyo<Object> zyo = this.ZF.get(paramZk);
            if (zyo == null)
              try {
                Zzd zzd = Zh();
                zyo = zzd.ZP(paramZk);
                try {
                  if (zyo != null)
                    this.ZF.put(paramZk, zyo); 
                } catch (Zd zd) {
                  throw a(null);
                } 
                return zyo;
              } catch (Zd zd) {} 
            return zyo;
          } 
          return null;
        } catch (Zd zd) {
          throw a(null);
        }  
    } catch (Zd zd) {
      throw a(null);
    } 
    return null;
  }
  
  protected final Zk ZC() {
    Zk zk = this.ZT;
    if (zk == null) {
      zk = Zb().ZY(Zb.class);
      this.ZT = zk;
    } 
    return zk;
  }
  
  protected final void ZL(String paramString, Object paramObject) {
    try {
      if (paramObject == null)
        throw new IllegalArgumentException(String.format(a(24091, 3388), new Object[] { paramString })); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'gø>&»ÞþãÖ²ßCÕzê¢$´îÛïdHñÉ(gíÿWÆþß6,ÍÏ0s½©\/)H9ßýÝB\\bä÷¹îTáHÐ ®É»CV_[ã°¾Y'@á$pÏ:È¸áJ#ü_5µN¥#EH·5'¦n^ÞÝÎÒF%(µ¹¾É{>©ë¬©µ¢\\rvù!£¡w{;ðË½nï`°§ÿ Ì¨ê³J~¸"5Øù À}Y(µ?¯7æ^#£¢Ñ`DÀVâY É,K`´ôÊ\DÓ j«È~þ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #21
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #60
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
    //   68: ldc '£¦Y\\b0ª\\nÿ vqè Wþ6-BmúÈ¿Tßs1odò|òéE¬9ô8öþçy¦×^QªÑj%F¡5üÕ[|¸*9{U I<?>h\\n^åj.ýGfíVRï"x¢¾EÆÛeÄ]\\tx.-ÞV²ä7Ù-õÙ/'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #78
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #100
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
    //   129: putstatic com/fasterxml/Zor/Zy4.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zor/Zy4.b : [Ljava/lang/String;
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
    //   212: bipush #119
    //   214: goto -> 244
    //   217: bipush #36
    //   219: goto -> 244
    //   222: bipush #36
    //   224: goto -> 244
    //   227: bipush #98
    //   229: goto -> 244
    //   232: bipush #124
    //   234: goto -> 244
    //   237: bipush #104
    //   239: goto -> 244
    //   242: bipush #110
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
    int i = (paramInt1 ^ 0x5E1B) & 0xFFFF;
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
      char c = 'Â';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zy4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */