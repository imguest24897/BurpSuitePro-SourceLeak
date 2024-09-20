package com.fasterxml.Zoz;

import com.fasterxml.Zm.Zn;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zyb;
import com.fasterxml.Zor.Zz;
import com.fasterxml.Zz_;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class Zp implements Zn {
  protected static final Zz_ ZQ = Zz_.Zt();
  
  public abstract String ZT();
  
  public abstract Zr ZU();
  
  public boolean ZL(Zr paramZr) {
    return ZU().equals(paramZr);
  }
  
  public abstract String ZW();
  
  public abstract Zr ZV();
  
  public abstract boolean Zb();
  
  public boolean ZF() {
    return Zb();
  }
  
  public abstract Zk ZB();
  
  public abstract Class<?> Zx();
  
  public abstract Zyb ZC();
  
  public boolean Zv() {
    return (ZE() != null);
  }
  
  public boolean Zc() {
    return (Zj() != null);
  }
  
  public abstract boolean ZA();
  
  public abstract boolean Zg();
  
  public abstract boolean Zy();
  
  public abstract boolean Zf();
  
  public abstract Ziq Zz();
  
  public abstract Ziq Zi();
  
  public abstract Zi6 ZY();
  
  public abstract Zin ZN();
  
  public Iterator<Zin> Zk() {
    return Zx.Zd();
  }
  
  public Ziz Zj() {
    Zi6 zi6;
    Ziq ziq = Zz();
    if (ziq == null)
      zi6 = ZY(); 
    return zi6;
  }
  
  public Ziz ZE() {
    Zi6 zi6;
    Zin zin = ZN();
    if (zin == null) {
      Ziq ziq = Zi();
      if (ziq == null)
        zi6 = ZY(); 
    } 
    return zi6;
  }
  
  public Ziz Ze() {
    Zi6 zi6;
    Ziq ziq = Zi();
    if (ziq == null)
      zi6 = ZY(); 
    return zi6;
  }
  
  public abstract Ziz Zu();
  
  public Class<?>[] ZR() {
    return null;
  }
  
  public Zz Zw() {
    return null;
  }
  
  public String ZP() {
    Zz zz = Zw();
    return (zz == null) ? null : zz.Zs();
  }
  
  public boolean ZI() {
    return false;
  }
  
  public Zv ZM() {
    return null;
  }
  
  public abstract Zz_ Z_();
  
  public List<Zr> Zp() {
    return Collections.emptyList();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Zp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */