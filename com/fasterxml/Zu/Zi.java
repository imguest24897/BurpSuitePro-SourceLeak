package com.fasterxml.Zu;

import com.fasterxml.Zh.Ze;
import com.fasterxml.Zh.Zf;
import com.fasterxml.Zh.Zg;
import com.fasterxml.Zh.Zn;
import com.fasterxml.Zh.Zo;
import com.fasterxml.Zh.Zp;
import com.fasterxml.Zh.Zs;
import com.fasterxml.Zo.Zz1;
import com.fasterxml.Zor.Zb;
import com.fasterxml.Zor.Zf;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zor.Zyv;
import com.fasterxml.Zp.Zt;
import java.io.Serializable;
import java.util.HashMap;

public class Zi extends Zz1 implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected HashMap<Zp, Zyo<?>> ZD = null;
  
  protected boolean Zj = false;
  
  public <T> void Zc(Class<T> paramClass, Zyo<? extends T> paramZyo) {
    Zp zp = new Zp(paramClass);
    if (this.ZD == null)
      this.ZD = new HashMap<>(); 
    this.ZD.put(zp, paramZyo);
    if (paramClass == Enum.class)
      this.Zj = true; 
  }
  
  public Zyo<?> ZN(Zg paramZg, Zyc paramZyc, Zyv paramZyv, Zt paramZt, Zyo<?> paramZyo) throws Zy_ {
    return Zv((Zk)paramZg);
  }
  
  public Zyo<?> ZV(Zk paramZk, Zyc paramZyc, Zyv paramZyv) throws Zy_ {
    return Zv(paramZk);
  }
  
  public Zyo<?> Zg(Zs paramZs, Zyc paramZyc, Zyv paramZyv, Zt paramZt, Zyo<?> paramZyo) throws Zy_ {
    return Zv((Zk)paramZs);
  }
  
  public Zyo<?> ZQ(Ze paramZe, Zyc paramZyc, Zyv paramZyv, Zt paramZt, Zyo<?> paramZyo) throws Zy_ {
    return Zv((Zk)paramZe);
  }
  
  public Zyo<?> Zw(Class<?> paramClass, Zyc paramZyc, Zyv paramZyv) throws Zy_ {
    try {
      if (this.ZD == null)
        return null; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    Zyo<?> zyo = this.ZD.get(new Zp(paramClass));
    try {
      if (zyo == null)
        try {
          if (this.Zj && paramClass.isEnum())
            zyo = this.ZD.get(new Zp(Enum.class)); 
        } catch (Zy_ zy_) {
          throw a(null);
        }  
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return zyo;
  }
  
  public Zyo<?> Zy(Class<? extends Zb> paramClass, Zyc paramZyc, Zyv paramZyv) throws Zy_ {
    try {
      if (this.ZD == null)
        return null; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return this.ZD.get(new Zp(paramClass));
  }
  
  public Zyo<?> Z_(Zn paramZn, Zyc paramZyc, Zyv paramZyv, Zt paramZt, Zyo<?> paramZyo) throws Zy_ {
    return Zv((Zk)paramZn);
  }
  
  public Zyo<?> Zt(Zf paramZf, Zyc paramZyc, Zyv paramZyv, Zf paramZf1, Zt paramZt, Zyo<?> paramZyo) throws Zy_ {
    return Zv((Zk)paramZf);
  }
  
  public Zyo<?> ZV(Zo paramZo, Zyc paramZyc, Zyv paramZyv, Zf paramZf, Zt paramZt, Zyo<?> paramZyo) throws Zy_ {
    return Zv((Zk)paramZo);
  }
  
  private final Zyo<?> Zv(Zk paramZk) {
    return (this.ZD == null) ? null : this.ZD.get(new Zp(paramZk.Zf()));
  }
  
  private static Zy_ a(Zy_ paramZy_) {
    return paramZy_;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zu\Zi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */