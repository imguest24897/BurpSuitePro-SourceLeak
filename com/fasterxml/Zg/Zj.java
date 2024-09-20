package com.fasterxml.Zg;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zk;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zyi;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Zj extends Zn {
  public static final Zj ZS = new Zj(BigDecimal.ZERO);
  
  private static final BigDecimal Zm = BigDecimal.valueOf(-2147483648L);
  
  private static final BigDecimal Zr = BigDecimal.valueOf(2147483647L);
  
  private static final BigDecimal Zc = BigDecimal.valueOf(Long.MIN_VALUE);
  
  private static final BigDecimal ZV = BigDecimal.valueOf(Long.MAX_VALUE);
  
  protected final BigDecimal Zp;
  
  public Zj(BigDecimal paramBigDecimal) {
    this.Zp = paramBigDecimal;
  }
  
  public static Zj ZC(BigDecimal paramBigDecimal) {
    return new Zj(paramBigDecimal);
  }
  
  public Zl ZV() {
    return Zl.VALUE_NUMBER_FLOAT;
  }
  
  public Zk ZO() {
    return Zk.BIG_DECIMAL;
  }
  
  public boolean ZP() {
    return (this.Zp.compareTo(Zm) >= 0 && this.Zp.compareTo(Zr) <= 0);
  }
  
  public boolean ZQ() {
    return (this.Zp.compareTo(Zc) >= 0 && this.Zp.compareTo(ZV) <= 0);
  }
  
  public Number Zu() {
    return this.Zp;
  }
  
  public int ZN() {
    return this.Zp.intValue();
  }
  
  public long Zh() {
    return this.Zp.longValue();
  }
  
  public BigInteger ZS() {
    return ZJ(this.Zp);
  }
  
  public double Zg() {
    return this.Zp.doubleValue();
  }
  
  public BigDecimal Zq() {
    return this.Zp;
  }
  
  public String Zp() {
    return this.Zp.toString();
  }
  
  public final void Zh(Zf paramZf, Zyi paramZyi) throws IOException {
    paramZf.ZI(this.Zp);
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject == null)
      return false; 
    if (paramObject instanceof Zj) {
      Zj zj = (Zj)paramObject;
      return (zj.Zp == null) ? ((this.Zp == null)) : ((this.Zp == null) ? false : ((zj.Zp.compareTo(this.Zp) == 0)));
    } 
    return false;
  }
  
  public int hashCode() {
    return (this.Zp == null) ? 0 : Double.hashCode(Zg());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Zj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */