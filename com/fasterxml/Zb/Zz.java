package com.fasterxml.Zb;

import com.fasterxml.Zc.Zd;
import com.fasterxml.Zc.Ze;
import com.fasterxml.Zc.Zo;
import com.fasterxml.Zc.Zp;
import com.fasterxml.Zya;
import com.fasterxml.Zyw;
import java.util.List;

public abstract class Zz<F extends Zmi, B extends Zz<F, B>> {
  protected static final int Zb = Zmr.ZO();
  
  protected static final int Zw = Zm.Zb();
  
  protected static final int Zv = Zi.ZN();
  
  protected int Ze;
  
  protected int ZE;
  
  protected int ZX;
  
  protected Ze<Zo> Zp = Zp.Zr();
  
  protected Zyw Zj;
  
  protected Zya ZH;
  
  protected Z_ ZZ;
  
  protected Zr Zg;
  
  protected Zv ZT;
  
  protected List<Zd> Z_;
  
  protected Zz() {
    this(Zb, Zw, Zv);
  }
  
  protected Zz(int paramInt1, int paramInt2, int paramInt3) {
    this.Ze = paramInt1;
    this.ZE = paramInt2;
    this.ZX = paramInt3;
    this.Zj = null;
    this.ZH = null;
    this.ZZ = Z_.Zo();
    this.Zg = Zr.ZW();
    this.ZT = Zv.ZU();
    this.Z_ = null;
  }
  
  public B ZD(Zmv paramZmv) {
    this.ZE |= paramZmv.ZN().Zi();
    return ZE();
  }
  
  public abstract F ZL();
  
  protected final B ZE() {
    return (B)this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zb\Zz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */