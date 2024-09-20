package com.fasterxml.Zs;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Ze.Zz;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zm.Zee;
import com.fasterxml.Zm.Zq;
import com.fasterxml.Zo.Zi;
import com.fasterxml.Zo.Zq;
import com.fasterxml.Zo.Zv;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zp.Zt;
import java.io.IOException;
import java.util.Collection;

public abstract class Zu_ extends Zl<Object> implements Zi, Zq {
  private static final long serialVersionUID = 1L;
  
  protected final Zyo<?> ZI;
  
  public Zu_(Zyo<?> paramZyo) {
    super(paramZyo.ZX());
    this.ZI = paramZyo;
  }
  
  protected abstract Zyo<?> Zq(Zyo<?> paramZyo);
  
  public void Zs(Zyg paramZyg) throws Zy_ {
    try {
      if (this.ZI instanceof Zq)
        ((Zq)this.ZI).Zs(paramZyg); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
  }
  
  public Zyo<?> Zq(Zyg paramZyg, Zo paramZo) throws Zy_ {
    Zk zk = paramZyg.ZW(this.ZI.ZX());
    Zyo<?> zyo = paramZyg.Zm(this.ZI, paramZo, zk);
    try {
      if (zyo == this.ZI)
        return this; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return Zq(zyo);
  }
  
  public Zyo<Object> Zv(Zee paramZee) {
    Zyo<?> zyo = this.ZI.Zv(paramZee);
    return (zyo == this.ZI) ? this : Zq(zyo);
  }
  
  public Zyo<?> Zt(Zyo<?> paramZyo) {
    return (paramZyo == this.ZI) ? this : Zq(paramZyo);
  }
  
  public Object deserialize(Zg paramZg, Zyg paramZyg) throws IOException {
    return this.ZI.deserialize(paramZg, paramZyg);
  }
  
  public Object ZI(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException {
    return this.ZI.ZI(paramZg, paramZyg, paramObject);
  }
  
  public Object Zf(Zg paramZg, Zyg paramZyg, Zt paramZt) throws IOException {
    return this.ZI.Zf(paramZg, paramZyg, paramZt);
  }
  
  public boolean Zs() {
    return this.ZI.Zs();
  }
  
  public Boolean Zu(Zyc paramZyc) {
    return this.ZI.Zu(paramZyc);
  }
  
  public Zyo<?> Za() {
    return this.ZI;
  }
  
  public Zv ZW(String paramString) {
    return this.ZI.ZW(paramString);
  }
  
  public Object Zj(Zyg paramZyg) throws Zy_ {
    return this.ZI.Zj(paramZyg);
  }
  
  public Object Zk(Zyg paramZyg) throws Zy_ {
    return this.ZI.Zk(paramZyg);
  }
  
  public Object Zy(Zyg paramZyg) throws Zy_ {
    return this.ZI.Zy(paramZyg);
  }
  
  public Zq Zm() {
    return this.ZI.Zm();
  }
  
  public Zd Zb() {
    return this.ZI.Zb();
  }
  
  public Collection<Object> Z_() {
    return this.ZI.Z_();
  }
  
  public Zz Zd() {
    return this.ZI.Zd();
  }
  
  private static Zy_ a(Zy_ paramZy_) {
    return paramZy_;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zu_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */