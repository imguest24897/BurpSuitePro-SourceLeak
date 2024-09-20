package com.fasterxml.Zor;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zk.Zn;
import com.fasterxml.Zn.Zl;
import com.fasterxml.Zp.Za;
import java.io.IOException;
import java.io.Serializable;

public final class Zyq implements Serializable {
  private static final long serialVersionUID = 1L;
  
  public static final Zyq ZJ = new Zyq(null, null, null);
  
  private final Zk ZD;
  
  private final Zyd<Object> ZO;
  
  private final Za Zp;
  
  private Zyq(Zk paramZk, Zyd<Object> paramZyd, Za paramZa) {
    this.ZD = paramZk;
    this.ZO = paramZyd;
    this.Zp = paramZa;
  }
  
  public Zyq Zo(Zn paramZn, Zk paramZk) {
    try {
      if (paramZk == null) {
        try {
          if (this.ZD != null)
            try {
              return (this.ZO != null) ? new Zyq(null, null, null) : this;
            } catch (Zy_ zy_) {
              throw a(null);
            }  
        } catch (Zy_ zy_) {
          throw a(null);
        } 
        return this;
      } 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    try {
      if (paramZk.equals(this.ZD))
        return this; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    if (paramZk.Zr()) {
      Za za;
      Zn zn = paramZn.Zm();
      try {
        za = zn.ZL(paramZk);
      } catch (Zy_ zy_) {
        throw new Zy2(zy_);
      } 
      return new Zyq(null, null, za);
    } 
    if (paramZn.Zt(Zy0.EAGER_SERIALIZER_FETCH)) {
      Zn zn = paramZn.Zm();
      try {
        Zyd<Object> zyd = zn.ZH(paramZk, true, null);
        return (zyd instanceof Zl) ? new Zyq(paramZk, null, ((Zl)zyd).Zx()) : new Zyq(paramZk, zyd, null);
      } catch (Zym zym) {}
    } 
    return new Zyq(paramZk, null, this.Zp);
  }
  
  public void Zi(Zf paramZf, Object paramObject, Zn paramZn) throws IOException {
    // Byte code:
    //   0: invokestatic ZZ : ()I
    //   3: istore #4
    //   5: aload_0
    //   6: getfield Zp : Lcom/fasterxml/Zp/Za;
    //   9: ifnull -> 42
    //   12: aload_3
    //   13: aload_1
    //   14: aload_2
    //   15: aload_0
    //   16: getfield ZD : Lcom/fasterxml/Zor/Zk;
    //   19: aload_0
    //   20: getfield ZO : Lcom/fasterxml/Zor/Zyd;
    //   23: aload_0
    //   24: getfield Zp : Lcom/fasterxml/Zp/Za;
    //   27: invokevirtual Zx : (Lcom/fasterxml/Zb/Zf;Ljava/lang/Object;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zyd;Lcom/fasterxml/Zp/Za;)V
    //   30: iload #4
    //   32: ifeq -> 131
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   41: athrow
    //   42: aload_0
    //   43: getfield ZO : Lcom/fasterxml/Zor/Zyd;
    //   46: ifnull -> 82
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   55: athrow
    //   56: aload_3
    //   57: aload_1
    //   58: aload_2
    //   59: aload_0
    //   60: getfield ZD : Lcom/fasterxml/Zor/Zk;
    //   63: aload_0
    //   64: getfield ZO : Lcom/fasterxml/Zor/Zyd;
    //   67: invokevirtual ZJ : (Lcom/fasterxml/Zb/Zf;Ljava/lang/Object;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zyd;)V
    //   70: iload #4
    //   72: ifeq -> 131
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   81: athrow
    //   82: aload_0
    //   83: getfield ZD : Lcom/fasterxml/Zor/Zk;
    //   86: ifnull -> 118
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   95: athrow
    //   96: aload_3
    //   97: aload_1
    //   98: aload_2
    //   99: aload_0
    //   100: getfield ZD : Lcom/fasterxml/Zor/Zk;
    //   103: invokevirtual ZI : (Lcom/fasterxml/Zb/Zf;Ljava/lang/Object;Lcom/fasterxml/Zor/Zk;)V
    //   106: iload #4
    //   108: ifeq -> 131
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   117: athrow
    //   118: aload_3
    //   119: aload_1
    //   120: aload_2
    //   121: invokevirtual Zz : (Lcom/fasterxml/Zb/Zf;Ljava/lang/Object;)V
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   130: athrow
    //   131: return
    // Exception table:
    //   from	to	target	type
    //   5	35	38	java/io/IOException
    //   12	49	52	java/io/IOException
    //   42	75	78	java/io/IOException
    //   56	89	92	java/io/IOException
    //   82	111	114	java/io/IOException
    //   96	124	127	java/io/IOException
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zyq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */