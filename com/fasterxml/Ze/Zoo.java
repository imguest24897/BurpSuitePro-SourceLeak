package com.fasterxml.Ze;

import com.fasterxml.Zm.Zq;
import com.fasterxml.Zo.Zzb;
import com.fasterxml.Zor.Zyg;
import java.io.Serializable;

public class Zoo implements Zzb, Serializable {
  private static final long serialVersionUID = 1L;
  
  private static final Zoo ZK = new Zoo(null);
  
  private static final Zoo Zq = new Zoo(null);
  
  protected final Object Zt;
  
  protected final Zq Zi;
  
  protected Zoo(Object paramObject) {
    this.Zt = paramObject;
    this.Zi = (this.Zt == null) ? Zq.ALWAYS_NULL : Zq.CONSTANT;
  }
  
  public static Zoo Zp() {
    return ZK;
  }
  
  public static Zoo Zv() {
    return Zq;
  }
  
  public static Zoo Zk(Object paramObject) {
    return (paramObject == null) ? Zq : new Zoo(paramObject);
  }
  
  public static boolean Zf(Zzb paramZzb) {
    return (paramZzb == ZK);
  }
  
  public Object Zj(Zyg paramZyg) {
    return this.Zt;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zoo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */