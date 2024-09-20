package com.fasterxml.Zk;

import com.fasterxml.Zm.Zet;
import com.fasterxml.Zm.Zp;
import com.fasterxml.Zm.Zu;
import com.fasterxml.Zn.Ze;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import java.util.concurrent.atomic.AtomicReference;

public final class Zy {
  private final Zet<Zp, Zyd<Object>> ZO;
  
  private final AtomicReference<Ze> Zh = new AtomicReference<>();
  
  public Zy() {
    this(4000);
  }
  
  public Zy(int paramInt) {
    int i = Math.min(64, paramInt >> 2);
    this.ZO = (Zet<Zp, Zyd<Object>>)new Zu(i, paramInt);
  }
  
  public Ze ZK() {
    Ze ze = this.Zh.get();
    return (ze != null) ? ze : Zd();
  }
  
  private final synchronized Ze Zd() {
    Ze ze = this.Zh.get();
    if (ze == null) {
      ze = Ze.ZI(this.ZO);
      this.Zh.set(ze);
    } 
    return ze;
  }
  
  public Zyd<Object> ZN(Class<?> paramClass) {
    synchronized (this) {
      return (Zyd<Object>)this.ZO.ZM(new Zp(paramClass, false));
    } 
  }
  
  public Zyd<Object> ZC(Zk paramZk) {
    synchronized (this) {
      return (Zyd<Object>)this.ZO.ZM(new Zp(paramZk, false));
    } 
  }
  
  public Zyd<Object> Zr(Zk paramZk) {
    synchronized (this) {
      return (Zyd<Object>)this.ZO.ZM(new Zp(paramZk, true));
    } 
  }
  
  public Zyd<Object> ZV(Class<?> paramClass) {
    synchronized (this) {
      return (Zyd<Object>)this.ZO.ZM(new Zp(paramClass, true));
    } 
  }
  
  public void ZC(Zk paramZk, Zyd<Object> paramZyd) {
    synchronized (this) {
      if (this.ZO.Zm(new Zp(paramZk, true), paramZyd) == null)
        this.Zh.set(null); 
    } 
  }
  
  public void ZM(Class<?> paramClass, Zyd<Object> paramZyd) {
    synchronized (this) {
      if (this.ZO.Zm(new Zp(paramClass, true), paramZyd) == null)
        this.Zh.set(null); 
    } 
  }
  
  public void ZJ(Zk paramZk, Zyd<Object> paramZyd, Zyi paramZyi) throws Zy_ {
    synchronized (this) {
      if (this.ZO.Zm(new Zp(paramZk, false), paramZyd) == null)
        this.Zh.set(null); 
      try {
        if (paramZyd instanceof Z_)
          ((Z_)paramZyd).resolve(paramZyi); 
      } catch (Zy_ zy_) {
        throw a(null);
      } 
    } 
  }
  
  public void ZR(Class<?> paramClass, Zk paramZk, Zyd<Object> paramZyd, Zyi paramZyi) throws Zy_ {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: astore #5
    //   4: monitorenter
    //   5: aload_0
    //   6: getfield ZO : Lcom/fasterxml/Zm/Zet;
    //   9: new com/fasterxml/Zm/Zp
    //   12: dup
    //   13: aload_1
    //   14: iconst_0
    //   15: invokespecial <init> : (Ljava/lang/Class;Z)V
    //   18: aload_3
    //   19: invokeinterface Zm : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   24: astore #6
    //   26: aload_0
    //   27: getfield ZO : Lcom/fasterxml/Zm/Zet;
    //   30: new com/fasterxml/Zm/Zp
    //   33: dup
    //   34: aload_2
    //   35: iconst_0
    //   36: invokespecial <init> : (Lcom/fasterxml/Zor/Zk;Z)V
    //   39: aload_3
    //   40: invokeinterface Zm : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   45: astore #7
    //   47: aload #6
    //   49: ifnull -> 64
    //   52: aload #7
    //   54: ifnonnull -> 79
    //   57: goto -> 64
    //   60: invokestatic a : (Lcom/fasterxml/Zor/Zy_;)Lcom/fasterxml/Zor/Zy_;
    //   63: athrow
    //   64: aload_0
    //   65: getfield Zh : Ljava/util/concurrent/atomic/AtomicReference;
    //   68: aconst_null
    //   69: invokevirtual set : (Ljava/lang/Object;)V
    //   72: goto -> 79
    //   75: invokestatic a : (Lcom/fasterxml/Zor/Zy_;)Lcom/fasterxml/Zor/Zy_;
    //   78: athrow
    //   79: aload_3
    //   80: instanceof com/fasterxml/Zk/Z_
    //   83: ifeq -> 104
    //   86: aload_3
    //   87: checkcast com/fasterxml/Zk/Z_
    //   90: aload #4
    //   92: invokeinterface resolve : (Lcom/fasterxml/Zor/Zyi;)V
    //   97: goto -> 104
    //   100: invokestatic a : (Lcom/fasterxml/Zor/Zy_;)Lcom/fasterxml/Zor/Zy_;
    //   103: athrow
    //   104: aload #5
    //   106: monitorexit
    //   107: goto -> 118
    //   110: astore #8
    //   112: aload #5
    //   114: monitorexit
    //   115: aload #8
    //   117: athrow
    //   118: return
    // Exception table:
    //   from	to	target	type
    //   5	107	110	finally
    //   47	57	60	com/fasterxml/Zor/Zy_
    //   52	72	75	com/fasterxml/Zor/Zy_
    //   79	97	100	com/fasterxml/Zor/Zy_
    //   110	115	110	finally
  }
  
  private static Zy_ a(Zy_ paramZy_) {
    return paramZy_;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zk\Zy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */