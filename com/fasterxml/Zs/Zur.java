package com.fasterxml.Zs;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zm.Zq;
import com.fasterxml.Zo.Zi;
import com.fasterxml.Zo.Zzp;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zp.Zt;
import java.io.IOException;

public abstract class Zur<T> extends Zl<T> implements Zi {
  private static final long serialVersionUID = 2L;
  
  protected final Zk ZX;
  
  protected final Zzp ZU;
  
  protected final Zt Zu;
  
  protected final Zyo<Object> Zt;
  
  public Zur(Zk paramZk, Zzp paramZzp, Zt paramZt, Zyo<?> paramZyo) {
    super(paramZk);
    this.ZU = paramZzp;
    this.ZX = paramZk;
    this.Zt = (Zyo)paramZyo;
    this.Zu = paramZt;
  }
  
  public Zyo<?> Zq(Zyg paramZyg, Zo paramZo) throws Zy_ {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: getfield Zt : Lcom/fasterxml/Zor/Zyo;
    //   7: astore #4
    //   9: astore_3
    //   10: aload_0
    //   11: aload_1
    //   12: aload_2
    //   13: aload #4
    //   15: invokevirtual Zq : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zo;Lcom/fasterxml/Zor/Zyo;)Lcom/fasterxml/Zor/Zyo;
    //   18: astore #4
    //   20: aload #4
    //   22: ifnonnull -> 43
    //   25: aload_1
    //   26: aload_0
    //   27: getfield ZX : Lcom/fasterxml/Zor/Zk;
    //   30: invokevirtual Zn : ()Lcom/fasterxml/Zor/Zk;
    //   33: aload_2
    //   34: invokevirtual ZC : (Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyo;
    //   37: astore #4
    //   39: aload_3
    //   40: ifnull -> 59
    //   43: aload_1
    //   44: aload #4
    //   46: aload_2
    //   47: aload_0
    //   48: getfield ZX : Lcom/fasterxml/Zor/Zk;
    //   51: invokevirtual Zn : ()Lcom/fasterxml/Zor/Zk;
    //   54: invokevirtual Zm : (Lcom/fasterxml/Zor/Zyo;Lcom/fasterxml/Zor/Zo;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zyo;
    //   57: astore #4
    //   59: aload_0
    //   60: getfield Zu : Lcom/fasterxml/Zp/Zt;
    //   63: astore #5
    //   65: aload #5
    //   67: ifnull -> 78
    //   70: aload #5
    //   72: aload_2
    //   73: invokevirtual Zf : (Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zp/Zt;
    //   76: astore #5
    //   78: aload #4
    //   80: aload_0
    //   81: getfield Zt : Lcom/fasterxml/Zor/Zyo;
    //   84: if_acmpne -> 109
    //   87: aload #5
    //   89: aload_0
    //   90: getfield Zu : Lcom/fasterxml/Zp/Zt;
    //   93: if_acmpne -> 109
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   102: athrow
    //   103: aload_0
    //   104: areturn
    //   105: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   108: athrow
    //   109: aload_0
    //   110: aload #5
    //   112: aload #4
    //   114: invokevirtual ZV : (Lcom/fasterxml/Zp/Zt;Lcom/fasterxml/Zor/Zyo;)Lcom/fasterxml/Zs/Zur;
    //   117: areturn
    // Exception table:
    //   from	to	target	type
    //   78	96	99	com/fasterxml/Zor/Zy_
    //   87	105	105	com/fasterxml/Zor/Zy_
  }
  
  public Zq Zm() {
    return Zq.DYNAMIC;
  }
  
  protected abstract Zur<T> ZV(Zt paramZt, Zyo<?> paramZyo);
  
  public abstract T Zj(Zyg paramZyg) throws Zy_;
  
  public Object Zy(Zyg paramZyg) throws Zy_ {
    return Zj(paramZyg);
  }
  
  public abstract T ZU(Object paramObject);
  
  public abstract T Za(T paramT, Object paramObject);
  
  public abstract Object ZT(T paramT);
  
  public Zzp Zw() {
    return this.ZU;
  }
  
  public Zk ZH() {
    return this.ZX;
  }
  
  public Zd Zb() {
    return (this.Zt != null) ? this.Zt.Zb() : super.Zb();
  }
  
  public Boolean Zu(Zyc paramZyc) {
    return (this.Zt == null) ? null : this.Zt.Zu(paramZyc);
  }
  
  public T deserialize(Zg paramZg, Zyg paramZyg) throws IOException {
    if (this.ZU != null) {
      Object object1 = this.ZU.Zy(paramZyg);
      return ZI(paramZg, paramZyg, (T)object1);
    } 
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    Object object = (this.Zu == null) ? this.Zt.deserialize(paramZg, paramZyg) : this.Zt.Zf(paramZg, paramZyg, this.Zu);
    return ZU(object);
  }
  
  public T ZI(Zg paramZg, Zyg paramZyg, T paramT) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: getfield Zt : Lcom/fasterxml/Zor/Zyo;
    //   7: aload_2
    //   8: invokevirtual Za : ()Lcom/fasterxml/Zor/Zyc;
    //   11: invokevirtual Zu : (Lcom/fasterxml/Zor/Zyc;)Ljava/lang/Boolean;
    //   14: astore #6
    //   16: astore #4
    //   18: aload #6
    //   20: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   23: invokevirtual equals : (Ljava/lang/Object;)Z
    //   26: ifne -> 43
    //   29: aload_0
    //   30: getfield Zu : Lcom/fasterxml/Zp/Zt;
    //   33: ifnull -> 93
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   42: athrow
    //   43: aload_0
    //   44: getfield Zu : Lcom/fasterxml/Zp/Zt;
    //   47: ifnonnull -> 73
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   56: athrow
    //   57: aload_0
    //   58: getfield Zt : Lcom/fasterxml/Zor/Zyo;
    //   61: aload_1
    //   62: aload_2
    //   63: invokevirtual deserialize : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   66: goto -> 86
    //   69: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   72: athrow
    //   73: aload_0
    //   74: getfield Zt : Lcom/fasterxml/Zor/Zyo;
    //   77: aload_1
    //   78: aload_2
    //   79: aload_0
    //   80: getfield Zu : Lcom/fasterxml/Zp/Zt;
    //   83: invokevirtual Zf : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zp/Zt;)Ljava/lang/Object;
    //   86: astore #5
    //   88: aload #4
    //   90: ifnull -> 170
    //   93: aload_0
    //   94: aload_3
    //   95: invokevirtual ZT : (Ljava/lang/Object;)Ljava/lang/Object;
    //   98: astore #5
    //   100: aload #5
    //   102: ifnonnull -> 157
    //   105: aload_0
    //   106: getfield Zu : Lcom/fasterxml/Zp/Zt;
    //   109: ifnonnull -> 135
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   118: athrow
    //   119: aload_0
    //   120: getfield Zt : Lcom/fasterxml/Zor/Zyo;
    //   123: aload_1
    //   124: aload_2
    //   125: invokevirtual deserialize : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   128: goto -> 148
    //   131: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   134: athrow
    //   135: aload_0
    //   136: getfield Zt : Lcom/fasterxml/Zor/Zyo;
    //   139: aload_1
    //   140: aload_2
    //   141: aload_0
    //   142: getfield Zu : Lcom/fasterxml/Zp/Zt;
    //   145: invokevirtual Zf : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zp/Zt;)Ljava/lang/Object;
    //   148: astore #5
    //   150: aload_0
    //   151: aload #5
    //   153: invokevirtual ZU : (Ljava/lang/Object;)Ljava/lang/Object;
    //   156: areturn
    //   157: aload_0
    //   158: getfield Zt : Lcom/fasterxml/Zor/Zyo;
    //   161: aload_1
    //   162: aload_2
    //   163: aload #5
    //   165: invokevirtual ZI : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/lang/Object;)Ljava/lang/Object;
    //   168: astore #5
    //   170: aload_0
    //   171: aload_3
    //   172: aload #5
    //   174: invokevirtual Za : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   177: areturn
    // Exception table:
    //   from	to	target	type
    //   18	36	39	java/io/IOException
    //   29	50	53	java/io/IOException
    //   43	69	69	java/io/IOException
    //   100	112	115	java/io/IOException
    //   105	131	131	java/io/IOException
  }
  
  public Object Zf(Zg paramZg, Zyg paramZyg, Zt paramZt) throws IOException {
    try {
      if (paramZg.ZL(Zl.VALUE_NULL))
        return Zj(paramZyg); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zu == null)
        return deserialize(paramZg, paramZyg); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return ZU(this.Zu.Zy(paramZg, paramZyg));
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zur.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */