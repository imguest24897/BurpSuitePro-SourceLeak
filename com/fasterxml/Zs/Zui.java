package com.fasterxml.Zs;

import com.fasterxml.Zo.Zzp;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zp.Zt;
import java.util.concurrent.atomic.AtomicReference;

public class Zui extends Zur<AtomicReference<Object>> {
  private static final long serialVersionUID = 1L;
  
  public Zui(Zk paramZk, Zzp paramZzp, Zt paramZt, Zyo<?> paramZyo) {
    super(paramZk, paramZzp, paramZt, paramZyo);
  }
  
  public Zui ZF(Zt paramZt, Zyo<?> paramZyo) {
    return new Zui(this.ZX, this.ZU, paramZt, paramZyo);
  }
  
  public AtomicReference<Object> Zh(Zyg paramZyg) throws Zy_ {
    return new AtomicReference(this.Zt.Zj(paramZyg));
  }
  
  public Object Zy(Zyg paramZyg) throws Zy_ {
    return Zh(paramZyg);
  }
  
  public Object Zk(Zyg paramZyg) throws Zy_ {
    return null;
  }
  
  public AtomicReference<Object> Zj(Object paramObject) {
    return new AtomicReference(paramObject);
  }
  
  public Object Zh(AtomicReference<Object> paramAtomicReference) {
    return paramAtomicReference.get();
  }
  
  public AtomicReference<Object> Zm(AtomicReference<Object> paramAtomicReference, Object paramObject) {
    paramAtomicReference.set(paramObject);
    return paramAtomicReference;
  }
  
  public Boolean Zu(Zyc paramZyc) {
    return Boolean.TRUE;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zui.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */