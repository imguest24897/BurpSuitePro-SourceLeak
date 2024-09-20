package com.fasterxml.Zn;

import com.fasterxml.Zm.Zet;
import com.fasterxml.Zm.Zp;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zyd;

public final class Ze {
  private final Z_w[] ZT;
  
  private final int Zh;
  
  private final int Zd;
  
  public Ze(Zet<Zp, Zyd<Object>> paramZet) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: invokeinterface Zm : ()I
    //   11: invokestatic ZK : (I)I
    //   14: putfield Zh : I
    //   17: aload_0
    //   18: aload_0
    //   19: getfield Zh : I
    //   22: iconst_1
    //   23: isub
    //   24: putfield Zd : I
    //   27: aload_0
    //   28: getfield Zh : I
    //   31: anewarray com/fasterxml/Zn/Z_w
    //   34: astore_2
    //   35: aload_1
    //   36: aload_0
    //   37: aload_2
    //   38: <illegal opcode> accept : (Lcom/fasterxml/Zn/Ze;[Lcom/fasterxml/Zn/Z_w;)Ljava/util/function/BiConsumer;
    //   43: invokeinterface Z_ : (Ljava/util/function/BiConsumer;)V
    //   48: aload_0
    //   49: aload_2
    //   50: putfield ZT : [Lcom/fasterxml/Zn/Z_w;
    //   53: return
  }
  
  private static final int ZK(int paramInt) {
    String str = Zj.Zl();
    int i = (paramInt <= 64) ? (paramInt + paramInt) : (paramInt + (paramInt >> 2));
    int j = 8;
    while (j < i) {
      j += j;
      if (str != null)
        break; 
    } 
    return j;
  }
  
  public static Ze ZI(Zet<Zp, Zyd<Object>> paramZet) {
    return new Ze(paramZet);
  }
  
  public Zyd<Object> ZZ(Zk paramZk) {
    Z_w z_w = this.ZT[Zp.ZD(paramZk) & this.Zd];
    if (z_w == null)
      return null; 
    if (z_w.Z_(paramZk))
      return z_w.Zo; 
    while ((z_w = z_w.ZT) != null) {
      if (z_w.Z_(paramZk))
        return z_w.Zo; 
    } 
    return null;
  }
  
  public Zyd<Object> ZW(Class<?> paramClass) {
    Z_w z_w = this.ZT[Zp.ZZ(paramClass) & this.Zd];
    if (z_w == null)
      return null; 
    if (z_w.ZA(paramClass))
      return z_w.Zo; 
    while ((z_w = z_w.ZT) != null) {
      if (z_w.ZA(paramClass))
        return z_w.Zo; 
    } 
    return null;
  }
  
  public Zyd<Object> ZW(Zk paramZk) {
    Z_w z_w = this.ZT[Zp.Zt(paramZk) & this.Zd];
    if (z_w == null)
      return null; 
    if (z_w.ZD(paramZk))
      return z_w.Zo; 
    while ((z_w = z_w.ZT) != null) {
      if (z_w.ZD(paramZk))
        return z_w.Zo; 
    } 
    return null;
  }
  
  public Zyd<Object> ZZ(Class<?> paramClass) {
    Z_w z_w = this.ZT[Zp.ZQ(paramClass) & this.Zd];
    if (z_w == null)
      return null; 
    if (z_w.ZU(paramClass))
      return z_w.Zo; 
    while ((z_w = z_w.ZT) != null) {
      if (z_w.ZU(paramClass))
        return z_w.Zo; 
    } 
    return null;
  }
  
  private void lambda$new$0(Z_w[] paramArrayOfZ_w, Zp paramZp, Zyd<Object> paramZyd) {
    int i = paramZp.hashCode() & this.Zd;
    paramArrayOfZ_w[i] = new Z_w(paramArrayOfZ_w[i], paramZp, paramZyd);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zn\Ze.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */