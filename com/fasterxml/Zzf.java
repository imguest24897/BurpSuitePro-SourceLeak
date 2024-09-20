package com.fasterxml;

import com.fasterxml.Zh.Zn;
import com.fasterxml.Zm.Zee;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zp.Za;
import java.util.concurrent.atomic.AtomicReference;

public class Zzf extends Zz9<AtomicReference<?>> {
  private static final long serialVersionUID = 1L;
  
  public Zzf(Zn paramZn, boolean paramBoolean, Za paramZa, Zyd<Object> paramZyd) {
    super(paramZn, paramBoolean, paramZa, paramZyd);
  }
  
  protected Zzf(Zzf paramZzf, Zo paramZo, Za paramZa, Zyd<?> paramZyd, Zee paramZee, Object paramObject, boolean paramBoolean) {
    super(paramZzf, paramZo, paramZa, paramZyd, paramZee, paramObject, paramBoolean);
  }
  
  protected Zz9<AtomicReference<?>> Zh(Zo paramZo, Za paramZa, Zyd<?> paramZyd, Zee paramZee) {
    return new Zzf(this, paramZo, paramZa, paramZyd, paramZee, this.ZW, this.ZO);
  }
  
  public Zz9<AtomicReference<?>> ZD(Object paramObject, boolean paramBoolean) {
    return new Zzf(this, this.ZS, this.ZX, this.Zt, this.ZD, paramObject, paramBoolean);
  }
  
  protected boolean ZC(AtomicReference<?> paramAtomicReference) {
    return (paramAtomicReference.get() != null);
  }
  
  protected Object ZA(AtomicReference<?> paramAtomicReference) {
    return paramAtomicReference.get();
  }
  
  protected Object ZI(AtomicReference<?> paramAtomicReference) {
    return paramAtomicReference.get();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zzf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */