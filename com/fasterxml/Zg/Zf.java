package com.fasterxml.Zg;

import com.fasterxml.Zb.Z_;
import com.fasterxml.Zb.Zk;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zi.Z_;
import com.fasterxml.Zm.Zz;
import com.fasterxml.Zor.Zb;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class Zf extends Zb implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private static String Zd;
  
  Object writeReplace() {
    return Zc.Zq(this);
  }
  
  public abstract int hashCode();
  
  public abstract Zl ZV();
  
  public Zk ZO() {
    return null;
  }
  
  public abstract void Zh(com.fasterxml.Zb.Zf paramZf, Zyi paramZyi) throws IOException;
  
  public abstract void Zy(com.fasterxml.Zb.Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException;
  
  public String toString() {
    return Z_.Zi(this);
  }
  
  protected BigInteger ZJ(BigDecimal paramBigDecimal) {
    try {
      Z_.Zo().Zn(paramBigDecimal.scale());
    } catch (Z_ z_) {
      Zz.Zc((IOException)z_);
    } 
    return paramBigDecimal.toBigInteger();
  }
  
  public static void Zj(String paramString) {
    Zd = paramString;
  }
  
  public static String ZE() {
    return Zd;
  }
  
  static {
    if (ZE() == null)
      Zj("mcRrf"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Zf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */