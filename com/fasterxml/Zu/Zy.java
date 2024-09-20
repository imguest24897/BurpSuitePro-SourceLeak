package com.fasterxml.Zu;

import burp.Zbqc;
import com.fasterxml.Zh.Ze;
import com.fasterxml.Zh.Zf;
import com.fasterxml.Zh.Zg;
import com.fasterxml.Zh.Zo;
import com.fasterxml.Zh.Zp;
import com.fasterxml.Zh.Zs;
import com.fasterxml.Zk.Zk;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zy7;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyv;
import com.fasterxml.Zp.Za;
import java.io.Serializable;
import java.util.HashMap;

public class Zy extends Zk implements Serializable {
  private static final long serialVersionUID = 3L;
  
  protected HashMap<Zp, Zyd<?>> ZJ = null;
  
  protected HashMap<Zp, Zyd<?>> ZQ = null;
  
  protected boolean Zv = false;
  
  public <T> void ZG(Class<? extends T> paramClass, Zyd<T> paramZyd) {
    Ze(paramClass, paramZyd);
  }
  
  public Zyd<?> Zf(Zy7 paramZy7, Zk paramZk, Zyv paramZyv) {
    Class<?> clazz = paramZk.Zf();
    Zp zp = new Zp(clazz);
    Zyd<?> zyd = null;
    int[] arrayOfInt = Zq.Zu();
    if (clazz.isInterface()) {
      if (this.ZQ != null) {
        zyd = this.ZQ.get(zp);
        if (zyd != null)
          return zyd; 
      } 
    } else if (this.ZJ != null) {
      zyd = this.ZJ.get(zp);
      if (zyd != null)
        return zyd; 
      if (this.Zv && paramZk.ZF()) {
        zp.Zp(Enum.class);
        zyd = this.ZJ.get(zp);
        if (zyd != null)
          return zyd; 
      } 
      Class<?> clazz1 = clazz;
      while (clazz1 != null) {
        zp.Zp(clazz1);
        zyd = this.ZJ.get(zp);
        if (zyd != null)
          return zyd; 
        clazz1 = clazz1.getSuperclass();
        if (arrayOfInt == null)
          break; 
      } 
    } 
    if (this.ZQ != null) {
      zyd = ZZ(clazz, zp);
      if (zyd != null)
        return zyd; 
      if (!clazz.isInterface())
        while ((clazz = clazz.getSuperclass()) != null) {
          zyd = ZZ(clazz, zp);
          if (zyd != null)
            return zyd; 
        }  
    } 
    if (Zbqc.Zwu() == null)
      Zq.Zy(new int[4]); 
    return null;
  }
  
  public Zyd<?> ZF(Zy7 paramZy7, Zg paramZg, Zyv paramZyv, Za paramZa, Zyd<Object> paramZyd) {
    return Zf(paramZy7, (Zk)paramZg, paramZyv);
  }
  
  public Zyd<?> Zp(Zy7 paramZy7, Zs paramZs, Zyv paramZyv, Za paramZa, Zyd<Object> paramZyd) {
    return Zf(paramZy7, (Zk)paramZs, paramZyv);
  }
  
  public Zyd<?> Zs(Zy7 paramZy7, Ze paramZe, Zyv paramZyv, Za paramZa, Zyd<Object> paramZyd) {
    return Zf(paramZy7, (Zk)paramZe, paramZyv);
  }
  
  public Zyd<?> ZV(Zy7 paramZy7, Zf paramZf, Zyv paramZyv, Zyd<Object> paramZyd1, Za paramZa, Zyd<Object> paramZyd2) {
    return Zf(paramZy7, (Zk)paramZf, paramZyv);
  }
  
  public Zyd<?> Za(Zy7 paramZy7, Zo paramZo, Zyv paramZyv, Zyd<Object> paramZyd1, Za paramZa, Zyd<Object> paramZyd2) {
    return Zf(paramZy7, (Zk)paramZo, paramZyv);
  }
  
  protected Zyd<?> ZZ(Class<?> paramClass, Zp paramZp) {
    Class[] arrayOfClass = paramClass.getInterfaces();
    int i = arrayOfClass.length;
    byte b = 0;
    int[] arrayOfInt = Zq.Zu();
    while (b < i) {
      Class<?> clazz = arrayOfClass[b];
      paramZp.Zp(clazz);
      Zyd<?> zyd = this.ZQ.get(paramZp);
      if (zyd != null)
        return zyd; 
      zyd = ZZ(clazz, paramZp);
      if (zyd != null)
        return zyd; 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return null;
  }
  
  protected void Ze(Class<?> paramClass, Zyd<?> paramZyd) {
    // Byte code:
    //   0: invokestatic Zu : ()[I
    //   3: new com/fasterxml/Zh/Zp
    //   6: dup
    //   7: aload_1
    //   8: invokespecial <init> : (Ljava/lang/Class;)V
    //   11: astore #4
    //   13: astore_3
    //   14: aload_1
    //   15: invokevirtual isInterface : ()Z
    //   18: ifeq -> 54
    //   21: aload_0
    //   22: getfield ZQ : Ljava/util/HashMap;
    //   25: ifnonnull -> 39
    //   28: aload_0
    //   29: new java/util/HashMap
    //   32: dup
    //   33: invokespecial <init> : ()V
    //   36: putfield ZQ : Ljava/util/HashMap;
    //   39: aload_0
    //   40: getfield ZQ : Ljava/util/HashMap;
    //   43: aload #4
    //   45: aload_2
    //   46: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   49: pop
    //   50: aload_3
    //   51: ifnonnull -> 94
    //   54: aload_0
    //   55: getfield ZJ : Ljava/util/HashMap;
    //   58: ifnonnull -> 72
    //   61: aload_0
    //   62: new java/util/HashMap
    //   65: dup
    //   66: invokespecial <init> : ()V
    //   69: putfield ZJ : Ljava/util/HashMap;
    //   72: aload_0
    //   73: getfield ZJ : Ljava/util/HashMap;
    //   76: aload #4
    //   78: aload_2
    //   79: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   82: pop
    //   83: aload_1
    //   84: ldc java/lang/Enum
    //   86: if_acmpne -> 94
    //   89: aload_0
    //   90: iconst_1
    //   91: putfield Zv : Z
    //   94: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zu\Zy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */