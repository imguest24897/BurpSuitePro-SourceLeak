package com.fasterxml.Zor;

import com.fasterxml.Zgy;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zoz.Ziv;
import com.fasterxml.Zoz.Ziz;
import com.fasterxml.Zz_;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class Zi implements Zo, Serializable {
  private static final long serialVersionUID = 1L;
  
  protected final Zr Zr;
  
  protected final Zk ZU;
  
  protected final Zr Zb;
  
  protected final Zyb ZG;
  
  protected final Ziz ZS;
  
  public Zi(Zr paramZr1, Zk paramZk, Zr paramZr2, Ziz paramZiz, Zyb paramZyb) {
    this.Zr = paramZr1;
    this.ZU = paramZk;
    this.Zb = paramZr2;
    this.ZG = paramZyb;
    this.ZS = paramZiz;
  }
  
  public Zgy ZN(Zf<?> paramZf, Class<?> paramClass) {
    Zgy zgy1 = paramZf.Zy(paramClass);
    Zt zt = paramZf.ZK();
    if (zt == null || this.ZS == null)
      return zgy1; 
    Zgy zgy2 = zt.ZY((Ziv)this.ZS);
    return (zgy2 == null) ? zgy1 : zgy1.Zx(zgy2);
  }
  
  public Zz_ Zj(Zf<?> paramZf, Class<?> paramClass) {
    Zz_ zz_1 = paramZf.ZU(paramClass, this.ZU.Zf());
    Zt zt = paramZf.ZK();
    if (zt == null || this.ZS == null)
      return zz_1; 
    Zz_ zz_2 = zt.Zp((Ziv)this.ZS);
    return (zz_2 == null) ? zz_1 : zz_1.ZI(zz_2);
  }
  
  public List<Zr> ZR(Zf<?> paramZf) {
    return Collections.emptyList();
  }
  
  public String ZT() {
    return this.Zr.Zb();
  }
  
  public Zr ZS() {
    return this.Zr;
  }
  
  public Zk Zp() {
    return this.ZU;
  }
  
  public Zr Zb() {
    return this.Zb;
  }
  
  public boolean ZW() {
    return this.ZG.ZT();
  }
  
  public Zyb ZO() {
    return this.ZG;
  }
  
  public Ziz ZQ() {
    return this.ZS;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */