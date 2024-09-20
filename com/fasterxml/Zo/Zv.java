package com.fasterxml.Zo;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Ze.Zoo;
import com.fasterxml.Zm.Z_;
import com.fasterxml.Zm.Zev;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyb;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zoz.Zc;
import com.fasterxml.Zoz.Ziz;
import com.fasterxml.Zoz.Zp;
import com.fasterxml.Zp.Zt;
import java.io.IOException;
import java.io.Serializable;

public abstract class Zv extends Zc implements Serializable {
  protected static final Zyo<Object> ZJ;
  
  protected final Zr Ze;
  
  protected final Zk ZE;
  
  protected final Zr Zn;
  
  protected final transient Z_ Zt;
  
  protected final Zyo<Object> Zz;
  
  protected final Zt ZF;
  
  protected final Zzb Z_;
  
  protected String Zj;
  
  protected com.fasterxml.Zoz.Zv ZZ;
  
  protected Zev ZA;
  
  protected int Zi = -1;
  
  private static final String[] a;
  
  private static final String[] b;
  
  protected Zv(Zp paramZp, Zk paramZk, Zt paramZt, Z_ paramZ_) {
    this(paramZp.ZU(), paramZk, paramZp.ZV(), paramZt, paramZ_, paramZp.ZC());
  }
  
  protected Zv(Zr paramZr1, Zk paramZk, Zr paramZr2, Zt paramZt, Z_ paramZ_, Zyb paramZyb) {
    // Byte code:
    //   0: aload_0
    //   1: aload #6
    //   3: invokespecial <init> : (Lcom/fasterxml/Zor/Zyb;)V
    //   6: invokestatic ZP : ()Ljava/lang/String;
    //   9: aload_0
    //   10: iconst_m1
    //   11: putfield Zi : I
    //   14: astore #7
    //   16: aload_1
    //   17: ifnonnull -> 39
    //   20: aload_0
    //   21: getstatic com/fasterxml/Zor/Zr.ZJ : Lcom/fasterxml/Zor/Zr;
    //   24: putfield Ze : Lcom/fasterxml/Zor/Zr;
    //   27: aload #7
    //   29: ifnull -> 54
    //   32: goto -> 39
    //   35: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   38: athrow
    //   39: aload_0
    //   40: aload_1
    //   41: invokevirtual Zk : ()Lcom/fasterxml/Zor/Zr;
    //   44: putfield Ze : Lcom/fasterxml/Zor/Zr;
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   53: athrow
    //   54: aload_0
    //   55: aload_2
    //   56: putfield ZE : Lcom/fasterxml/Zor/Zk;
    //   59: aload_0
    //   60: aload_3
    //   61: putfield Zn : Lcom/fasterxml/Zor/Zr;
    //   64: aload_0
    //   65: aload #5
    //   67: putfield Zt : Lcom/fasterxml/Zm/Z_;
    //   70: aload_0
    //   71: aconst_null
    //   72: putfield ZA : Lcom/fasterxml/Zm/Zev;
    //   75: aload #4
    //   77: ifnull -> 88
    //   80: aload #4
    //   82: aload_0
    //   83: invokevirtual Zf : (Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zp/Zt;
    //   86: astore #4
    //   88: aload_0
    //   89: aload #4
    //   91: putfield ZF : Lcom/fasterxml/Zp/Zt;
    //   94: aload_0
    //   95: getstatic com/fasterxml/Zo/Zv.ZJ : Lcom/fasterxml/Zor/Zyo;
    //   98: putfield Zz : Lcom/fasterxml/Zor/Zyo;
    //   101: aload_0
    //   102: getstatic com/fasterxml/Zo/Zv.ZJ : Lcom/fasterxml/Zor/Zyo;
    //   105: putfield Z_ : Lcom/fasterxml/Zo/Zzb;
    //   108: return
    // Exception table:
    //   from	to	target	type
    //   16	32	35	java/lang/IllegalStateException
    //   20	47	50	java/lang/IllegalStateException
  }
  
  protected Zv(Zr paramZr, Zk paramZk, Zyb paramZyb, Zyo<Object> paramZyo) {
    // Byte code:
    //   0: invokestatic ZP : ()Ljava/lang/String;
    //   3: aload_0
    //   4: aload_3
    //   5: invokespecial <init> : (Lcom/fasterxml/Zor/Zyb;)V
    //   8: astore #5
    //   10: aload_0
    //   11: iconst_m1
    //   12: putfield Zi : I
    //   15: aload_1
    //   16: ifnonnull -> 38
    //   19: aload_0
    //   20: getstatic com/fasterxml/Zor/Zr.ZJ : Lcom/fasterxml/Zor/Zr;
    //   23: putfield Ze : Lcom/fasterxml/Zor/Zr;
    //   26: aload #5
    //   28: ifnull -> 53
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   37: athrow
    //   38: aload_0
    //   39: aload_1
    //   40: invokevirtual Zk : ()Lcom/fasterxml/Zor/Zr;
    //   43: putfield Ze : Lcom/fasterxml/Zor/Zr;
    //   46: goto -> 53
    //   49: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   52: athrow
    //   53: aload_0
    //   54: aload_2
    //   55: putfield ZE : Lcom/fasterxml/Zor/Zk;
    //   58: aload_0
    //   59: aconst_null
    //   60: putfield Zn : Lcom/fasterxml/Zor/Zr;
    //   63: aload_0
    //   64: aconst_null
    //   65: putfield Zt : Lcom/fasterxml/Zm/Z_;
    //   68: aload_0
    //   69: aconst_null
    //   70: putfield ZA : Lcom/fasterxml/Zm/Zev;
    //   73: aload_0
    //   74: aconst_null
    //   75: putfield ZF : Lcom/fasterxml/Zp/Zt;
    //   78: aload_0
    //   79: aload #4
    //   81: putfield Zz : Lcom/fasterxml/Zor/Zyo;
    //   84: aload_0
    //   85: aload #4
    //   87: putfield Z_ : Lcom/fasterxml/Zo/Zzb;
    //   90: return
    // Exception table:
    //   from	to	target	type
    //   10	31	34	java/lang/IllegalStateException
    //   19	46	49	java/lang/IllegalStateException
  }
  
  protected Zv(Zv paramZv) {
    super(paramZv);
    this.Ze = paramZv.Ze;
    this.ZE = paramZv.ZE;
    this.Zn = paramZv.Zn;
    this.Zt = paramZv.Zt;
    this.Zz = paramZv.Zz;
    this.ZF = paramZv.ZF;
    this.Zj = paramZv.Zj;
    this.Zi = paramZv.Zi;
    this.ZA = paramZv.ZA;
    this.ZZ = paramZv.ZZ;
    this.Z_ = paramZv.Z_;
  }
  
  protected Zv(Zv paramZv, Zyo<?> paramZyo, Zzb paramZzb) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial <init> : (Lcom/fasterxml/Zoz/Zc;)V
    //   5: aload_0
    //   6: iconst_m1
    //   7: putfield Zi : I
    //   10: aload_0
    //   11: aload_1
    //   12: getfield Ze : Lcom/fasterxml/Zor/Zr;
    //   15: putfield Ze : Lcom/fasterxml/Zor/Zr;
    //   18: aload_0
    //   19: aload_1
    //   20: getfield ZE : Lcom/fasterxml/Zor/Zk;
    //   23: putfield ZE : Lcom/fasterxml/Zor/Zk;
    //   26: aload_0
    //   27: aload_1
    //   28: getfield Zn : Lcom/fasterxml/Zor/Zr;
    //   31: putfield Zn : Lcom/fasterxml/Zor/Zr;
    //   34: aload_0
    //   35: aload_1
    //   36: getfield Zt : Lcom/fasterxml/Zm/Z_;
    //   39: putfield Zt : Lcom/fasterxml/Zm/Z_;
    //   42: invokestatic ZP : ()Ljava/lang/String;
    //   45: aload_0
    //   46: aload_1
    //   47: getfield ZF : Lcom/fasterxml/Zp/Zt;
    //   50: putfield ZF : Lcom/fasterxml/Zp/Zt;
    //   53: aload_0
    //   54: aload_1
    //   55: getfield Zj : Ljava/lang/String;
    //   58: putfield Zj : Ljava/lang/String;
    //   61: astore #4
    //   63: aload_0
    //   64: aload_1
    //   65: getfield Zi : I
    //   68: putfield Zi : I
    //   71: aload_2
    //   72: ifnonnull -> 94
    //   75: aload_0
    //   76: getstatic com/fasterxml/Zo/Zv.ZJ : Lcom/fasterxml/Zor/Zyo;
    //   79: putfield Zz : Lcom/fasterxml/Zor/Zyo;
    //   82: aload #4
    //   84: ifnull -> 106
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   93: athrow
    //   94: aload_0
    //   95: aload_2
    //   96: putfield Zz : Lcom/fasterxml/Zor/Zyo;
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   105: athrow
    //   106: aload_0
    //   107: aload_1
    //   108: getfield ZA : Lcom/fasterxml/Zm/Zev;
    //   111: putfield ZA : Lcom/fasterxml/Zm/Zev;
    //   114: aload_0
    //   115: aload_1
    //   116: getfield ZZ : Lcom/fasterxml/Zoz/Zv;
    //   119: putfield ZZ : Lcom/fasterxml/Zoz/Zv;
    //   122: aload_3
    //   123: getstatic com/fasterxml/Zo/Zv.ZJ : Lcom/fasterxml/Zor/Zyo;
    //   126: if_acmpne -> 134
    //   129: aload_0
    //   130: getfield Zz : Lcom/fasterxml/Zor/Zyo;
    //   133: astore_3
    //   134: aload_0
    //   135: aload_3
    //   136: putfield Z_ : Lcom/fasterxml/Zo/Zzb;
    //   139: return
    // Exception table:
    //   from	to	target	type
    //   63	87	90	java/lang/IllegalStateException
    //   75	99	102	java/lang/IllegalStateException
  }
  
  protected Zv(Zv paramZv, Zr paramZr) {
    super(paramZv);
    this.Ze = paramZr;
    this.ZE = paramZv.ZE;
    this.Zn = paramZv.Zn;
    this.Zt = paramZv.Zt;
    this.Zz = paramZv.Zz;
    this.ZF = paramZv.ZF;
    this.Zj = paramZv.Zj;
    this.Zi = paramZv.Zi;
    this.ZA = paramZv.ZA;
    this.ZZ = paramZv.ZZ;
    this.Z_ = paramZv.Z_;
  }
  
  public abstract Zv Zt(Zyo<?> paramZyo);
  
  public abstract Zv ZU(Zr paramZr);
  
  public Zv ZB(String paramString) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Zr zr = (this.Ze == null) ? new Zr(paramString) : this.Ze.ZJ(paramString);
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (zr == this.Ze) ? this : ZU(zr);
  }
  
  public abstract Zv ZC(Zzb paramZzb);
  
  public void ZZ(String paramString) {
    this.Zj = paramString;
  }
  
  public void ZN(com.fasterxml.Zoz.Zv paramZv) {
    this.ZZ = paramZv;
  }
  
  public void Zx(Class<?>[] paramArrayOfClass) {
    String str = Zzp.ZP();
    try {
      if (paramArrayOfClass == null) {
        try {
          this.ZA = null;
          if (str != null) {
            this.ZA = Zev.ZP(paramArrayOfClass);
            return;
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.ZA = Zev.ZP(paramArrayOfClass);
  }
  
  public void Za(int paramInt) {
    try {
      if (this.Zi != -1)
        throw new IllegalStateException(a(12425, -10158) + ZT() + a(12424, 11827) + this.Zi + a(12426, 19100) + paramInt); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.Zi = paramInt;
  }
  
  public void ZL(Zyc paramZyc) {}
  
  public void ZE() {}
  
  public boolean ZV() {
    return false;
  }
  
  public final String ZT() {
    return this.Ze.Zb();
  }
  
  public Zr ZS() {
    return this.Ze;
  }
  
  public Zk Zp() {
    return this.ZE;
  }
  
  public Zr Zb() {
    return this.Zn;
  }
  
  public abstract Ziz ZQ();
  
  protected Class<?> ZY() {
    return ZQ().ZE();
  }
  
  public String Zs() {
    return this.Zj;
  }
  
  public com.fasterxml.Zoz.Zv ZM() {
    return this.ZZ;
  }
  
  public boolean ZN() {
    try {
      if (this.Zz != null)
        try {
          if (this.Zz != ZJ);
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean Zz() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.ZF != null);
  }
  
  public Zyo<Object> ZD() {
    Zyo<Object> zyo = this.Zz;
    try {
      if (zyo == ZJ)
        return null; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return zyo;
  }
  
  public Zt Zc() {
    return this.ZF;
  }
  
  public Zzb Zj() {
    return this.Z_;
  }
  
  public boolean Zj(Class<?> paramClass) {
    try {
      if (this.ZA != null) {
        try {
          if (this.ZA.Zo(paramClass));
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public boolean Zk() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.ZA != null);
  }
  
  public int Zt() {
    throw new IllegalStateException(String.format(a(12430, -12302), new Object[] { ZT(), getClass().getName() }));
  }
  
  public Object ZP() {
    return null;
  }
  
  public boolean Zv() {
    return false;
  }
  
  public abstract void ZP(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException;
  
  public abstract Object ZR(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException;
  
  public abstract void Zj(Object paramObject1, Object paramObject2) throws IOException;
  
  public abstract Object ZN(Object paramObject1, Object paramObject2) throws IOException;
  
  public final Object Zt(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      if (paramZg.ZL(Zl.VALUE_NULL))
        return this.Z_.Zj(paramZyg); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.ZF != null)
        return this.Zz.Zf(paramZg, paramZyg, this.ZF); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Object object = this.Zz.deserialize(paramZg, paramZyg);
    if (object == null)
      object = this.Z_.Zj(paramZyg); 
    return object;
  }
  
  public final Object Zc(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException {
    try {
      if (paramZg.ZL(Zl.VALUE_NULL)) {
        try {
          if (Zoo.Zf(this.Z_))
            return paramObject; 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return this.Z_.Zj(paramZyg);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (this.ZF != null) {
      Zk zk = paramZyg.ZL().ZY(paramObject.getClass());
      Zyo zyo = paramZyg.ZC(zk, (Zo)this);
      return zyo.ZI(paramZg, paramZyg, paramObject);
    } 
    Object object = this.Zz.ZI(paramZg, paramZyg, paramObject);
    try {
      if (object == null) {
        try {
          if (Zoo.Zf(this.Z_))
            return paramObject; 
        } catch (IOException iOException) {
          throw a(null);
        } 
        object = this.Z_.Zj(paramZyg);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return object;
  }
  
  protected void Zr(Zg paramZg, Exception paramException, Object paramObject) throws IOException {
    StringBuilder stringBuilder;
    String str = Zzp.ZP();
    if (paramException instanceof IllegalArgumentException) {
      String str1 = Zx.ZZ(paramObject);
      stringBuilder = (new StringBuilder(a(12420, -1804))).append(ZT()).append(a(12427, -19337)).append(Zp()).append(a(12431, 19640)).append(str1).append(")");
      String str2 = Zx.Zr(paramException);
      try {
        if (str2 != null) {
          try {
            stringBuilder.append(a(12422, 24461)).append(str2);
            if (str != null) {
              stringBuilder.append(a(12429, 20659));
              throw Zy_.ZT(paramZg, stringBuilder.toString(), paramException);
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
          throw Zy_.ZT(paramZg, stringBuilder.toString(), paramException);
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } else {
      Zh(paramZg, paramException);
      return;
    } 
    stringBuilder.append(a(12429, 20659));
    throw Zy_.ZT(paramZg, stringBuilder.toString(), paramException);
  }
  
  protected IOException Zh(Zg paramZg, Exception paramException) throws IOException {
    Zx.Zf(paramException);
    Zx.Zq(paramException);
    Throwable throwable = Zx.Zs(paramException);
    throw Zy_.ZT(paramZg, Zx.Zr(throwable), throwable);
  }
  
  protected void Zd(Exception paramException, Object paramObject) throws IOException {
    Zr((Zg)null, paramException, paramObject);
  }
  
  public String toString() {
    return a(12428, 11780) + ZT() + a(12421, -30401);
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'xËÔ B¤×Ýr­F±ÜÔLÖ®îü6ä%Zyã°1dÛ{?.í-obs&s|£© ÜD×6¸3_<Ü¼ÌéY¢HW0[H·=ñÓ¸Ã²Eì<-²?tÕ"çàUS¥kRFS4,X=\\rÔÓ½Þ@b|»_:Ro¬qP\\nGDky]ÇGàÈêÖ4þÎ®v¬È¬ôÂþÒä(3&ªL3Ð+w¾Ú\\n\ n:a÷´À ³ÌCzRCeÕÙápLÁv\Ög¯Î'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #11
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #58
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
    //   68: ldc 'Ö.ßm*\\nsÝÀ}ê²®ëë\\t4iÊÊU.ú,? cmÓwá'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #11
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #109
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
    //   129: putstatic com/fasterxml/Zo/Zv.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zo/Zv.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #108
    //   214: goto -> 243
    //   217: bipush #30
    //   219: goto -> 243
    //   222: bipush #105
    //   224: goto -> 243
    //   227: bipush #80
    //   229: goto -> 243
    //   232: bipush #38
    //   234: goto -> 243
    //   237: iconst_2
    //   238: goto -> 243
    //   241: bipush #35
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
    //   300: new com/fasterxml/Ze/Zoi
    //   303: dup
    //   304: sipush #12423
    //   307: sipush #14147
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic com/fasterxml/Zo/Zv.ZJ : Lcom/fasterxml/Zor/Zyo;
    //   319: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x308C) & 0xFFFF;
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
      byte b1 = 89;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo\Zv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */