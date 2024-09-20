package com.fasterxml.Zm;

import com.fasterxml.Zj.Zf;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zor.Zyb;
import com.fasterxml.Zoz.Zi6;
import com.fasterxml.Zoz.Zin;
import com.fasterxml.Zoz.Ziq;
import com.fasterxml.Zoz.Ziv;
import com.fasterxml.Zoz.Ziz;
import com.fasterxml.Zoz.Zp;
import com.fasterxml.Zqg;
import com.fasterxml.Zz_;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Zi extends Zp {
  protected final Zt ZH;
  
  protected final Ziz ZD;
  
  protected final Zyb ZL;
  
  protected final Zr ZN;
  
  protected final Zz_ Zl;
  
  protected Zi(Zt paramZt, Ziz paramZiz, Zr paramZr, Zyb paramZyb, Zz_ paramZz_) {
    this.ZH = paramZt;
    this.ZD = paramZiz;
    this.ZN = paramZr;
    this.ZL = (paramZyb == null) ? Zyb.Zo : paramZyb;
    this.Zl = paramZz_;
  }
  
  public static Zi Zx(Zf<?> paramZf, Ziz paramZiz, Zr paramZr) {
    return Zn(paramZf, paramZiz, paramZr, null, ZQ);
  }
  
  public static Zi Zq(Zf<?> paramZf, Ziz paramZiz, Zr paramZr, Zyb paramZyb, Zqg paramZqg) {
    Zz_ zz_ = (paramZqg == null || paramZqg == Zqg.USE_DEFAULTS) ? ZQ : Zz_.ZB(paramZqg, null);
    return new Zi(paramZf.ZK(), paramZiz, paramZr, paramZyb, zz_);
  }
  
  public static Zi Zn(Zf<?> paramZf, Ziz paramZiz, Zr paramZr, Zyb paramZyb, Zz_ paramZz_) {
    return new Zi(paramZf.ZK(), paramZiz, paramZr, paramZyb, paramZz_);
  }
  
  public String ZT() {
    return this.ZN.Zb();
  }
  
  public Zr ZU() {
    return this.ZN;
  }
  
  public boolean ZL(Zr paramZr) {
    return this.ZN.equals(paramZr);
  }
  
  public String ZW() {
    return ZT();
  }
  
  public Zr ZV() {
    return (this.ZH == null || this.ZD == null) ? null : this.ZH.ZP((Ziv)this.ZD);
  }
  
  public boolean Zb() {
    return false;
  }
  
  public boolean ZF() {
    return false;
  }
  
  public Zyb ZC() {
    return this.ZL;
  }
  
  public Zk ZB() {
    return (this.ZD == null) ? com.fasterxml.Zh.Zi.Zs() : this.ZD.Zf();
  }
  
  public Class<?> Zx() {
    return (this.ZD == null) ? Object.class : this.ZD.ZN();
  }
  
  public Zz_ Z_() {
    return this.Zl;
  }
  
  public List<Zr> Zp() {
    Ziz ziz = Zu();
    if (ziz != null) {
      List<Zr> list = this.ZH.Ze((Ziv)ziz);
      if (list != null)
        return list; 
    } 
    return Collections.emptyList();
  }
  
  public boolean ZA() {
    return (Zz() != null);
  }
  
  public boolean Zg() {
    return (Zi() != null);
  }
  
  public boolean Zy() {
    return this.ZD instanceof Zi6;
  }
  
  public boolean Zf() {
    return this.ZD instanceof Zin;
  }
  
  public Ziq Zz() {
    return (this.ZD instanceof Ziq && ((Ziq)this.ZD).ZL() == 0) ? (Ziq)this.ZD : null;
  }
  
  public Ziq Zi() {
    return (this.ZD instanceof Ziq && ((Ziq)this.ZD).ZL() == 1) ? (Ziq)this.ZD : null;
  }
  
  public Zi6 ZY() {
    return (this.ZD instanceof Zi6) ? (Zi6)this.ZD : null;
  }
  
  public Zin ZN() {
    return (this.ZD instanceof Zin) ? (Zin)this.ZD : null;
  }
  
  public Iterator<Zin> Zk() {
    Zin zin = ZN();
    return (zin == null) ? Zx.Zd() : Collections.<Zin>singleton(zin).iterator();
  }
  
  public Ziz Zu() {
    return this.ZD;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Zi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */