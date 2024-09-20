package com.fasterxml.Zn;

import com.fasterxml.Zm.Zp;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zyd;

final class Z_w {
  public final Zyd<Object> Zo;
  
  public final Z_w ZT;
  
  protected final Class<?> Zv;
  
  protected final Zk Zm;
  
  protected final boolean Zy;
  
  public Z_w(Z_w paramZ_w, Zp paramZp, Zyd<Object> paramZyd) {
    this.ZT = paramZ_w;
    this.Zo = paramZyd;
    this.Zy = paramZp.Zw();
    this.Zv = paramZp.Zj();
    this.Zm = paramZp.ZU();
  }
  
  public boolean ZA(Class<?> paramClass) {
    return (this.Zv == paramClass && this.Zy);
  }
  
  public boolean ZU(Class<?> paramClass) {
    return (this.Zv == paramClass && !this.Zy);
  }
  
  public boolean Z_(Zk paramZk) {
    return (this.Zy && paramZk.equals(this.Zm));
  }
  
  public boolean ZD(Zk paramZk) {
    return (!this.Zy && paramZk.equals(this.Zm));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zn\Z_w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */