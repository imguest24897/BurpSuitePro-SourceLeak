package com.fasterxml.Zh;

import com.fasterxml.Zor.Zk;

abstract class Zt extends Zv {
  private static final long serialVersionUID = 1L;
  
  protected Zt(Class<?> paramClass, Zr paramZr, Zk paramZk, Zk[] paramArrayOfZk, int paramInt, Object paramObject1, Object paramObject2, boolean paramBoolean) {
    super(paramClass, paramZr, paramZk, paramArrayOfZk, paramInt, paramObject1, paramObject2, paramBoolean);
  }
  
  public final boolean equals(Object paramObject) {
    return (paramObject == this);
  }
  
  public final int hashCode() {
    return System.identityHashCode(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zh\Zt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */