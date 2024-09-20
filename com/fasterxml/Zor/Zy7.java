package com.fasterxml.Zor;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zi;
import com.fasterxml.Zb.Zp;
import com.fasterxml.Zc.Zb;
import com.fasterxml.Zc.Zc;
import com.fasterxml.Zj.Ze;
import com.fasterxml.Zj.Zh;
import com.fasterxml.Zj.Zn;
import com.fasterxml.Zj.Zp;
import com.fasterxml.Zj.Zz;
import com.fasterxml.Zk.Zx;
import com.fasterxml.Zm.Zek;
import com.fasterxml.Zoz.Zij;
import com.fasterxml.Zoz.Ziw;
import com.fasterxml.Zp.Zq;
import java.io.Serializable;

public final class Zy7 extends Zh<Zy0, Zy7> implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected static final Zp ZI = (Zp)new Zc();
  
  private static final int Zb = ZG(Zy0.class);
  
  protected final Zx Zp = null;
  
  protected final Zp Zc = ZI;
  
  protected final int ZD = Zb;
  
  protected final int Zh = 0;
  
  protected final int ZT = 0;
  
  protected final int Zi = 0;
  
  protected final int Zo = 0;
  
  public Zy7(Ze paramZe, Zq paramZq, Ziw paramZiw, Zek paramZek, Zn paramZn, Zp paramZp) {
    super(paramZe, paramZq, paramZiw, paramZek, paramZn, paramZp);
  }
  
  private Zy7(Zy7 paramZy7, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    super(paramZy7, paramLong);
  }
  
  private Zy7(Zy7 paramZy7, Ze paramZe) {
    super(paramZy7, paramZe);
  }
  
  private Zy7(Zy7 paramZy7, Class<?> paramClass) {
    super(paramZy7, paramClass);
  }
  
  protected final Zy7 Zq(Ze paramZe) {
    return (this.ZP == paramZe) ? this : new Zy7(this, paramZe);
  }
  
  protected final Zy7 ZW(long paramLong) {
    return new Zy7(this, paramLong, this.ZD, this.Zh, this.ZT, this.Zi, this.Zo);
  }
  
  public Zy7 ZX(Class<?> paramClass) {
    return (this.ZB == paramClass) ? this : new Zy7(this, paramClass);
  }
  
  public Zy7 ZI(Zy0 paramZy0) {
    int i = this.ZD | paramZy0.Zu();
    return (i == this.ZD) ? this : new Zy7(this, this.ZA, i, this.Zh, this.ZT, this.Zi, this.Zo);
  }
  
  public Zy7 Zz(Zy0 paramZy0) {
    int i = this.ZD & (paramZy0.Zu() ^ 0xFFFFFFFF);
    return (i == this.ZD) ? this : new Zy7(this, this.ZA, i, this.Zh, this.ZT, this.Zi, this.Zo);
  }
  
  public Zp Zp() {
    Zp zp = this.Zc;
    if (zp instanceof Zb)
      zp = (Zp)((Zb)zp).Zm(); 
    return zp;
  }
  
  public void Za(Zf paramZf) {
    if (Zy0.INDENT_OUTPUT.Zq(this.ZD) && paramZf.ZP() == null) {
      Zp zp = Zp();
      if (zp != null)
        paramZf.Zy(zp); 
    } 
    boolean bool = Zy0.WRITE_BIGDECIMAL_AS_PLAIN.Zq(this.ZD);
    int i = this.ZT;
    if (i != 0 || bool) {
      int j = this.Zh;
      if (bool) {
        int k = Zi.WRITE_BIGDECIMAL_AS_PLAIN.Zf();
        j |= k;
        i |= k;
      } 
      paramZf.ZK(j, i);
    } 
    if (this.Zo != 0)
      paramZf.Za(this.Zi, this.Zo); 
  }
  
  public boolean Zs() {
    return (this.Zw != null) ? (!this.Zw.Zf()) : Zo(Zy0.WRAP_ROOT_VALUE);
  }
  
  public final boolean Zo(Zy0 paramZy0) {
    return ((this.ZD & paramZy0.Zu()) != 0);
  }
  
  public final boolean ZV(Zz paramZz) {
    return this.ZM.Zc(paramZz);
  }
  
  public Zx ZI() {
    return this.Zp;
  }
  
  public Zp ZU() {
    return this.Zc;
  }
  
  public Zyv ZU(Zk paramZk) {
    return Zt().ZO(this, paramZk, (Zij)this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zy7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */