package com.fasterxml.Zj;

import com.fasterxml.Zgy;
import com.fasterxml.Zoz.Zi8;
import com.fasterxml.Zoz.Zw;
import com.fasterxml.Zyk;
import com.fasterxml.Zz_;
import java.io.Serializable;
import java.util.Map;

public class Zn implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected Map<Class<?>, Zl> ZC;
  
  protected Zz_ ZL;
  
  protected Zyk ZH;
  
  protected Zi8<?> ZG;
  
  protected Boolean Zz;
  
  protected Boolean ZJ;
  
  public Zn() {
    this(null, Zz_.Zt(), Zyk.ZJ(), (Zi8<?>)Zw.Zl(), null, null);
  }
  
  protected Zn(Map<Class<?>, Zl> paramMap, Zz_ paramZz_, Zyk paramZyk, Zi8<?> paramZi8, Boolean paramBoolean1, Boolean paramBoolean2) {
    this.ZC = paramMap;
    this.ZL = paramZz_;
    this.ZH = paramZyk;
    this.ZG = paramZi8;
    this.Zz = paramBoolean1;
    this.ZJ = paramBoolean2;
  }
  
  public Z_ ZP(Class<?> paramClass) {
    return (this.ZC == null) ? null : this.ZC.get(paramClass);
  }
  
  public Zgy ZD(Class<?> paramClass) {
    if (this.ZC != null) {
      Z_ z_ = this.ZC.get(paramClass);
      if (z_ != null) {
        Zgy zgy = z_.Zw();
        if (zgy != null)
          return !zgy.ZQ() ? zgy.Zp(this.ZJ) : zgy; 
      } 
    } 
    return (this.ZJ == null) ? Zgy.Zm() : Zgy.Zl(this.ZJ.booleanValue());
  }
  
  public Zz_ Zd() {
    return this.ZL;
  }
  
  public Zyk Zm() {
    return this.ZH;
  }
  
  public Boolean ZK() {
    return this.Zz;
  }
  
  public Zi8<?> Zs() {
    return this.ZG;
  }
  
  public void ZD(Zz_ paramZz_) {
    this.ZL = paramZz_;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zj\Zn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */