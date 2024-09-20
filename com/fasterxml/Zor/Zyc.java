package com.fasterxml.Zor;

import com.fasterxml.Zb.Zb;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zg.Zfc;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zj.Ze;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zj.Zg;
import com.fasterxml.Zj.Zh;
import com.fasterxml.Zj.Zn;
import com.fasterxml.Zj.Zp;
import com.fasterxml.Zj.Zq;
import com.fasterxml.Zj.Zqf;
import com.fasterxml.Zj.Zx;
import com.fasterxml.Zj.Zz;
import com.fasterxml.Zm.Zek;
import com.fasterxml.Zm.Zm;
import com.fasterxml.Zo.Zo;
import com.fasterxml.Zoz.Zia;
import com.fasterxml.Zoz.Zij;
import com.fasterxml.Zoz.Ziw;
import com.fasterxml.Zp.Zk;
import com.fasterxml.Zp.Zq;
import com.fasterxml.Zp.Zt;
import java.io.Serializable;
import java.util.Collection;

public final class Zyc extends Zh<Zyp, Zyc> implements Serializable {
  private static final long serialVersionUID = 2L;
  
  private static final int Zv = ZG(Zyp.class);
  
  protected final Zm<Zo> Zo = null;
  
  protected final Zfc ZE = Zfc.Zc;
  
  protected final Zqf ZZ;
  
  protected final Zg Zp;
  
  protected final int ZD = Zv;
  
  protected final int Zm;
  
  protected final int ZI;
  
  protected final int ZU;
  
  protected final int ZF;
  
  public Zyc(Ze paramZe, Zq paramZq, Ziw paramZiw, Zek paramZek, Zn paramZn, Zqf paramZqf, Zp paramZp) {
    super(paramZe, paramZq, paramZiw, paramZek, paramZn, paramZp);
    this.Zp = null;
    this.ZZ = paramZqf;
    this.Zm = 0;
    this.ZI = 0;
    this.ZU = 0;
    this.ZF = 0;
  }
  
  private Zyc(Zyc paramZyc, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    super(paramZyc, paramLong);
    this.ZZ = paramZyc.ZZ;
    this.Zp = paramZyc.Zp;
    this.Zm = paramInt2;
    this.ZI = paramInt3;
    this.ZU = paramInt4;
    this.ZF = paramInt5;
  }
  
  private Zyc(Zyc paramZyc, Ze paramZe) {
    super(paramZyc, paramZe);
    this.ZZ = paramZyc.ZZ;
    this.Zp = paramZyc.Zp;
    this.Zm = paramZyc.Zm;
    this.ZI = paramZyc.ZI;
    this.ZU = paramZyc.ZU;
    this.ZF = paramZyc.ZF;
  }
  
  protected final Zyc ZU(Ze paramZe) {
    return (this.ZP == paramZe) ? this : new Zyc(this, paramZe);
  }
  
  protected final Zyc Zv(long paramLong) {
    return new Zyc(this, paramLong, this.ZD, this.Zm, this.ZI, this.ZU, this.ZF);
  }
  
  public Zyc Zk(Zyp paramZyp) {
    int i = this.ZD | paramZyp.Zu();
    return (i == this.ZD) ? this : new Zyc(this, this.ZA, i, this.Zm, this.ZI, this.ZU, this.ZF);
  }
  
  public Zyc ZL(Zyp paramZyp) {
    int i = this.ZD & (paramZyp.Zu() ^ 0xFFFFFFFF);
    return (i == this.ZD) ? this : new Zyc(this, this.ZA, i, this.Zm, this.ZI, this.ZU, this.ZF);
  }
  
  public Zg ZO(Zg paramZg) {
    if (this.ZI != 0)
      paramZg.ZG(this.Zm, this.ZI); 
    if (this.ZF != 0)
      paramZg.Zy(this.ZU, this.ZF); 
    return paramZg;
  }
  
  public Zg Zi(Zg paramZg, Zb paramZb) {
    if (this.ZI != 0)
      paramZg.ZG(this.Zm, this.ZI); 
    if (this.ZF != 0)
      paramZg.Zy(this.ZU, this.ZF); 
    if (paramZb != null)
      paramZg.ZQ(paramZb); 
    return paramZg;
  }
  
  public boolean Zs() {
    return (this.Zw != null) ? (!this.Zw.Zf()) : ZG(Zyp.UNWRAP_ROOT_VALUE);
  }
  
  public final boolean ZG(Zyp paramZyp) {
    return ((this.ZD & paramZyp.Zu()) != 0);
  }
  
  public final int Zq() {
    return this.ZD;
  }
  
  public final boolean ZV(Zz paramZz) {
    return this.ZM.Zc(paramZz);
  }
  
  public Zm<Zo> Zp() {
    return this.Zo;
  }
  
  public final Zfc ZX() {
    return this.ZE;
  }
  
  public Zg ZB() {
    return (this.Zp == null) ? Zg.Zk : this.Zp;
  }
  
  public Zyv ZA(Zk paramZk) {
    return Zt().ZC(this, paramZk, (Zij)this);
  }
  
  public Zyv Zs(Zk paramZk) {
    return Zt().Zr(this, paramZk, (Zij)this);
  }
  
  public Zyv Zq(Zk paramZk, Zyv paramZyv) {
    return Zt().ZD(this, paramZk, (Zij)this, paramZyv);
  }
  
  public Zt ZW(Zk paramZk) throws Zy_ {
    Zyv zyv = Zv(paramZk.Zf());
    Zia zia = zyv.Zo();
    Zk<?> zk = ZK().ZP((Zf<?>)this, zia, paramZk);
    Collection collection = null;
    if (zk == null) {
      zk = Zg(paramZk);
      try {
        if (zk == null)
          return null; 
      } catch (Zy_ zy_) {
        throw a(null);
      } 
    } else {
      collection = Zo().Zx((Zf)this, zia);
    } 
    return zk.Zn(this, paramZk, collection);
  }
  
  public Zx ZV(Zd paramZd, Class<?> paramClass, Zq paramZq) {
    return this.ZZ.Zn(this, paramZd, paramClass, paramZq);
  }
  
  public Zx ZU(Zd paramZd, Class<?> paramClass, Zx paramZx) {
    return this.ZZ.ZJ(this, paramZd, paramClass, paramZx);
  }
  
  private static Zy_ a(Zy_ paramZy_) {
    return paramZy_;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zyc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */