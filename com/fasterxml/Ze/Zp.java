package com.fasterxml.Ze;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zm.Z_;
import com.fasterxml.Zo.Zv;
import com.fasterxml.Zo.Zzb;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zy9;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zoz.Ziq;
import com.fasterxml.Zoz.Ziz;
import com.fasterxml.Zp.Zt;
import java.io.IOException;
import java.lang.reflect.Method;

public final class Zp extends Zv {
  private static final long serialVersionUID = 1L;
  
  protected final Ziq ZP;
  
  protected final transient Method Zm;
  
  protected final boolean Zs;
  
  public Zp(com.fasterxml.Zoz.Zp paramZp, Zk paramZk, Zt paramZt, Z_ paramZ_, Ziq paramZiq) {
    super(paramZp, paramZk, paramZt, paramZ_);
    this.ZP = paramZiq;
    this.Zm = paramZiq.Zu();
    this.Zs = Zoo.Zf(this.Z_);
  }
  
  protected Zp(Zp paramZp, Zyo<?> paramZyo, Zzb paramZzb) {
    super(paramZp, paramZyo, paramZzb);
    this.ZP = paramZp.ZP;
    this.Zm = paramZp.Zm;
    this.Zs = Zoo.Zf(paramZzb);
  }
  
  protected Zp(Zp paramZp, Zr paramZr) {
    super(paramZp, paramZr);
    this.ZP = paramZp.ZP;
    this.Zm = paramZp.Zm;
    this.Zs = paramZp.Zs;
  }
  
  protected Zp(Zp paramZp, Method paramMethod) {
    super(paramZp);
    this.ZP = paramZp.ZP;
    this.Zm = paramMethod;
    this.Zs = paramZp.Zs;
  }
  
  public Zv ZU(Zr paramZr) {
    return new Zp(this, paramZr);
  }
  
  public Zv Zt(Zyo<?> paramZyo) {
    if (this.Zz == paramZyo)
      return this; 
    Zzb zzb = (Zzb)((this.Zz == this.Z_) ? paramZyo : this.Z_);
    return new Zp(this, paramZyo, zzb);
  }
  
  public Zv ZC(Zzb paramZzb) {
    return new Zp(this, this.Zz, paramZzb);
  }
  
  public void ZL(Zyc paramZyc) {
    this.ZP.Zh(paramZyc.ZB(Zy9.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
  }
  
  public Ziz ZQ() {
    return (Ziz)this.ZP;
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
    //   16: getfield Zs : Z
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
    //   82: getfield Zs : Z
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
    //   133: getfield Zm : Ljava/lang/reflect/Method;
    //   136: aload_3
    //   137: iconst_1
    //   138: anewarray java/lang/Object
    //   141: dup
    //   142: iconst_0
    //   143: aload #5
    //   145: aastore
    //   146: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   149: pop
    //   150: goto -> 164
    //   153: astore #6
    //   155: aload_0
    //   156: aload_1
    //   157: aload #6
    //   159: aload #5
    //   161: invokevirtual Zr : (Lcom/fasterxml/Zb/Zg;Ljava/lang/Exception;Ljava/lang/Object;)V
    //   164: return
    // Exception table:
    //   from	to	target	type
    //   5	22	25	java/lang/Exception
    //   15	30	30	java/lang/Exception
    //   46	58	61	java/lang/Exception
    //   76	88	91	java/lang/Exception
    //   81	96	96	java/lang/Exception
    //   132	150	153	java/lang/Exception
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
    //   16: getfield Zs : Z
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
    //   83: getfield Zs : Z
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
    //   135: getfield Zm : Ljava/lang/reflect/Method;
    //   138: aload_3
    //   139: iconst_1
    //   140: anewarray java/lang/Object
    //   143: dup
    //   144: iconst_0
    //   145: aload #5
    //   147: aastore
    //   148: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   151: astore #6
    //   153: aload #6
    //   155: ifnonnull -> 166
    //   158: aload_3
    //   159: goto -> 168
    //   162: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   165: athrow
    //   166: aload #6
    //   168: areturn
    //   169: astore #6
    //   171: aload_0
    //   172: aload_1
    //   173: aload #6
    //   175: aload #5
    //   177: invokevirtual Zr : (Lcom/fasterxml/Zb/Zg;Ljava/lang/Exception;Ljava/lang/Object;)V
    //   180: aconst_null
    //   181: areturn
    // Exception table:
    //   from	to	target	type
    //   5	22	25	java/lang/Exception
    //   15	31	31	java/lang/Exception
    //   47	59	62	java/lang/Exception
    //   77	89	92	java/lang/Exception
    //   82	98	98	java/lang/Exception
    //   134	168	169	java/lang/Exception
    //   153	162	162	java/lang/Exception
  }
  
  public final void Zj(Object paramObject1, Object paramObject2) throws IOException {
    try {
      this.Zm.invoke(paramObject1, new Object[] { paramObject2 });
    } catch (Exception exception) {
      Zd(exception, paramObject2);
    } 
  }
  
  public Object ZN(Object paramObject1, Object paramObject2) throws IOException {
    try {
      Object object = this.Zm.invoke(paramObject1, new Object[] { paramObject2 });
      try {
      
      } catch (Exception exception) {
        throw b(null);
      } 
      return (object == null) ? paramObject1 : object;
    } catch (Exception exception) {
      Zd(exception, paramObject2);
      return null;
    } 
  }
  
  Object readResolve() {
    return new Zp(this, this.ZP.Zu());
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */