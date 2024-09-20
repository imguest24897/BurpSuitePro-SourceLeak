package com.fasterxml.Zg;

import com.fasterxml.Zb.Zl;
import com.fasterxml.Zm.Zj;
import com.fasterxml.Zor.Zb;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class Zv<T extends Zv<T>> extends Zf implements Zfv {
  private static final long serialVersionUID = 1L;
  
  protected final Zfc Zc;
  
  protected Zv(Zfc paramZfc) {
    this.Zc = paramZfc;
  }
  
  protected Zv() {
    this.Zc = null;
  }
  
  public abstract Zl ZV();
  
  public String Zp() {
    return "";
  }
  
  public abstract int Zv();
  
  public abstract Zb ZC(int paramInt);
  
  public abstract Zb ZL(String paramString);
  
  public final Zs Zc() {
    return this.Zc.ZW();
  }
  
  public final Zh Z_() {
    return this.Zc.Z_();
  }
  
  public final Zr Ze() {
    return this.Zc.Ze();
  }
  
  public final Zg Zp(BigInteger paramBigInteger) {
    return this.Zc.Zp(paramBigInteger);
  }
  
  public final Zg ZO(BigDecimal paramBigDecimal) {
    return this.Zc.ZO(paramBigDecimal);
  }
  
  public final Zb ZV(String paramString) {
    return this.Zc.ZP(paramString);
  }
  
  public final Zg Zs(Object paramObject) {
    return this.Zc.Zs(paramObject);
  }
  
  public final Zg Za(Zj paramZj) {
    return this.Zc.Za(paramZj);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Zv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */