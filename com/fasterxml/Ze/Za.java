package com.fasterxml.Ze;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zm.Z_;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zo.Zv;
import com.fasterxml.Zo.Zzb;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zy9;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zoz.Zi6;
import com.fasterxml.Zoz.Ziz;
import com.fasterxml.Zoz.Zp;
import com.fasterxml.Zp.Zt;
import java.io.IOException;
import java.lang.reflect.Field;

public final class Za extends Zv {
  private static final long serialVersionUID = 1L;
  
  protected final Zi6 ZH;
  
  protected final transient Field ZO;
  
  protected final boolean ZW;
  
  private static final String c;
  
  public Za(Zp paramZp, Zk paramZk, Zt paramZt, Z_ paramZ_, Zi6 paramZi6) {
    super(paramZp, paramZk, paramZt, paramZ_);
    this.ZH = paramZi6;
    this.ZO = paramZi6.ZG();
    this.ZW = Zoo.Zf(this.Z_);
  }
  
  protected Za(Za paramZa, Zyo<?> paramZyo, Zzb paramZzb) {
    super(paramZa, paramZyo, paramZzb);
    this.ZH = paramZa.ZH;
    this.ZO = paramZa.ZO;
    this.ZW = Zoo.Zf(paramZzb);
  }
  
  protected Za(Za paramZa, Zr paramZr) {
    super(paramZa, paramZr);
    this.ZH = paramZa.ZH;
    this.ZO = paramZa.ZO;
    this.ZW = paramZa.ZW;
  }
  
  protected Za(Za paramZa) {
    super(paramZa);
    this.ZH = paramZa.ZH;
    Field field = this.ZH.ZG();
    try {
      if (field == null)
        throw new IllegalArgumentException(c); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    this.ZO = field;
    this.ZW = paramZa.ZW;
  }
  
  public Zv ZU(Zr paramZr) {
    return new Za(this, paramZr);
  }
  
  public Zv Zt(Zyo<?> paramZyo) {
    try {
      if (this.Zz == paramZyo)
        return this; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    Zzb zzb = (Zzb)((this.Zz == this.Z_) ? paramZyo : this.Z_);
    return new Za(this, paramZyo, zzb);
  }
  
  public Zv ZC(Zzb paramZzb) {
    return new Za(this, this.Zz, paramZzb);
  }
  
  public void ZL(Zyc paramZyc) {
    Zx.ZR(this.ZO, paramZyc.ZB(Zy9.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
  }
  
  public Ziz ZQ() {
    return (Ziz)this.ZH;
  }
  
  public void ZP(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: aload_1
    //   6: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   9: invokevirtual ZL : (Lcom/fasterxml/Zb/Zl;)Z
    //   12: ifeq -> 51
    //   15: aload_0
    //   16: getfield ZW : Z
    //   19: ifeq -> 34
    //   22: goto -> 29
    //   25: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   28: athrow
    //   29: return
    //   30: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   33: athrow
    //   34: aload_0
    //   35: getfield Z_ : Lcom/fasterxml/Zo/Zzb;
    //   38: aload_2
    //   39: invokeinterface Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   44: astore #5
    //   46: aload #4
    //   48: ifnull -> 132
    //   51: aload_0
    //   52: getfield ZF : Lcom/fasterxml/Zp/Zt;
    //   55: ifnonnull -> 117
    //   58: goto -> 65
    //   61: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   64: athrow
    //   65: aload_0
    //   66: getfield Zz : Lcom/fasterxml/Zor/Zyo;
    //   69: aload_1
    //   70: aload_2
    //   71: invokevirtual deserialize : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   74: astore #5
    //   76: aload #5
    //   78: ifnonnull -> 132
    //   81: aload_0
    //   82: getfield ZW : Z
    //   85: ifeq -> 100
    //   88: goto -> 95
    //   91: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   94: athrow
    //   95: return
    //   96: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: aload_0
    //   101: getfield Z_ : Lcom/fasterxml/Zo/Zzb;
    //   104: aload_2
    //   105: invokeinterface Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   110: astore #5
    //   112: aload #4
    //   114: ifnull -> 132
    //   117: aload_0
    //   118: getfield Zz : Lcom/fasterxml/Zor/Zyo;
    //   121: aload_1
    //   122: aload_2
    //   123: aload_0
    //   124: getfield ZF : Lcom/fasterxml/Zp/Zt;
    //   127: invokevirtual Zf : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zp/Zt;)Ljava/lang/Object;
    //   130: astore #5
    //   132: aload_0
    //   133: getfield ZO : Ljava/lang/reflect/Field;
    //   136: aload_3
    //   137: aload #5
    //   139: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   142: goto -> 156
    //   145: astore #6
    //   147: aload_0
    //   148: aload_1
    //   149: aload #6
    //   151: aload #5
    //   153: invokevirtual Zr : (Lcom/fasterxml/Zb/Zg;Ljava/lang/Exception;Ljava/lang/Object;)V
    //   156: return
    // Exception table:
    //   from	to	target	type
    //   5	22	25	java/lang/Exception
    //   15	30	30	java/lang/Exception
    //   46	58	61	java/lang/Exception
    //   76	88	91	java/lang/Exception
    //   81	96	96	java/lang/Exception
    //   132	142	145	java/lang/Exception
  }
  
  public Object ZR(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: aload_1
    //   6: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   9: invokevirtual ZL : (Lcom/fasterxml/Zb/Zl;)Z
    //   12: ifeq -> 52
    //   15: aload_0
    //   16: getfield ZW : Z
    //   19: ifeq -> 35
    //   22: goto -> 29
    //   25: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   28: athrow
    //   29: aload_3
    //   30: areturn
    //   31: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   34: athrow
    //   35: aload_0
    //   36: getfield Z_ : Lcom/fasterxml/Zo/Zzb;
    //   39: aload_2
    //   40: invokeinterface Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   45: astore #5
    //   47: aload #4
    //   49: ifnull -> 134
    //   52: aload_0
    //   53: getfield ZF : Lcom/fasterxml/Zp/Zt;
    //   56: ifnonnull -> 119
    //   59: goto -> 66
    //   62: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   65: athrow
    //   66: aload_0
    //   67: getfield Zz : Lcom/fasterxml/Zor/Zyo;
    //   70: aload_1
    //   71: aload_2
    //   72: invokevirtual deserialize : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   75: astore #5
    //   77: aload #5
    //   79: ifnonnull -> 134
    //   82: aload_0
    //   83: getfield ZW : Z
    //   86: ifeq -> 102
    //   89: goto -> 96
    //   92: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   95: athrow
    //   96: aload_3
    //   97: areturn
    //   98: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   101: athrow
    //   102: aload_0
    //   103: getfield Z_ : Lcom/fasterxml/Zo/Zzb;
    //   106: aload_2
    //   107: invokeinterface Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   112: astore #5
    //   114: aload #4
    //   116: ifnull -> 134
    //   119: aload_0
    //   120: getfield Zz : Lcom/fasterxml/Zor/Zyo;
    //   123: aload_1
    //   124: aload_2
    //   125: aload_0
    //   126: getfield ZF : Lcom/fasterxml/Zp/Zt;
    //   129: invokevirtual Zf : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zp/Zt;)Ljava/lang/Object;
    //   132: astore #5
    //   134: aload_0
    //   135: getfield ZO : Ljava/lang/reflect/Field;
    //   138: aload_3
    //   139: aload #5
    //   141: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   144: goto -> 158
    //   147: astore #6
    //   149: aload_0
    //   150: aload_1
    //   151: aload #6
    //   153: aload #5
    //   155: invokevirtual Zr : (Lcom/fasterxml/Zb/Zg;Ljava/lang/Exception;Ljava/lang/Object;)V
    //   158: aload_3
    //   159: areturn
    // Exception table:
    //   from	to	target	type
    //   5	22	25	java/lang/Exception
    //   15	31	31	java/lang/Exception
    //   47	59	62	java/lang/Exception
    //   77	89	92	java/lang/Exception
    //   82	98	98	java/lang/Exception
    //   134	144	147	java/lang/Exception
  }
  
  public void Zj(Object paramObject1, Object paramObject2) throws IOException {
    try {
      this.ZO.set(paramObject1, paramObject2);
    } catch (Exception exception) {
      Zd(exception, paramObject2);
    } 
  }
  
  public Object ZN(Object paramObject1, Object paramObject2) throws IOException {
    try {
      this.ZO.set(paramObject1, paramObject2);
    } catch (Exception exception) {
      Zd(exception, paramObject2);
    } 
    return paramObject1;
  }
  
  Object readResolve() {
    return new Za(this);
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #21
    //   2: ldc 'PBu E\=Mo6O5It<NU=aB[_xu6\\tBZqB|2BTs/'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Ze/Za.c : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #8
    //   82: goto -> 112
    //   85: bipush #62
    //   87: goto -> 112
    //   90: bipush #19
    //   92: goto -> 112
    //   95: bipush #70
    //   97: goto -> 112
    //   100: bipush #110
    //   102: goto -> 112
    //   105: bipush #62
    //   107: goto -> 112
    //   110: bipush #46
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Za.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */