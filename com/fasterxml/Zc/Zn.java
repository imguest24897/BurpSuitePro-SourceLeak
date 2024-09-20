package com.fasterxml.Zc;

import java.util.concurrent.atomic.AtomicReference;

public abstract class Zn<P extends Zxc<P>> extends Zx<P> {
  private static final long serialVersionUID = 1L;
  
  private final transient AtomicReference<Zi<P>> Zp = new AtomicReference<>();
  
  protected Zn(int paramInt) {
    super(paramInt);
  }
  
  public P Zj() {
    byte b = 0;
    String str = Zs.Zc();
    while (b < 3) {
      Zi<P> zi = this.Zp.get();
      if (zi == null)
        return Zx(); 
      if (this.Zp.compareAndSet(zi, zi.ZH)) {
        zi.ZH = null;
        return zi.Zt;
      } 
      b++;
      if (str != null)
        break; 
    } 
    return Zx();
  }
  
  public void Zy(P paramP) {
    Zi<P> zi = new Zi<>(paramP);
    byte b = 0;
    String str = Zs.Zc();
    while (b < 3) {
      zi.ZH = this.Zp.get();
      if (this.Zp.compareAndSet(zi.ZH, zi))
        return; 
      b++;
      if (str != null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zc\Zn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */