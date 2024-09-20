package com.fasterxml.Zg;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zk;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zvr;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Zi extends Zn {
  protected final double Zw;
  
  public Zi(double paramDouble) {
    this.Zw = paramDouble;
  }
  
  public static Zi Zk(double paramDouble) {
    return new Zi(paramDouble);
  }
  
  public Zl ZV() {
    return Zl.VALUE_NUMBER_FLOAT;
  }
  
  public Zk ZO() {
    return Zk.DOUBLE;
  }
  
  public boolean ZP() {
    return (this.Zw >= -2.147483648E9D && this.Zw <= 2.147483647E9D);
  }
  
  public boolean ZQ() {
    return (this.Zw >= -9.223372036854776E18D && this.Zw <= 9.223372036854776E18D);
  }
  
  public Number Zu() {
    return Double.valueOf(this.Zw);
  }
  
  public int ZN() {
    return (int)this.Zw;
  }
  
  public long Zh() {
    return (long)this.Zw;
  }
  
  public double Zg() {
    return this.Zw;
  }
  
  public BigDecimal Zq() {
    return BigDecimal.valueOf(this.Zw);
  }
  
  public BigInteger ZS() {
    return Zq().toBigInteger();
  }
  
  public String Zp() {
    return Zvr.Z_(this.Zw);
  }
  
  public boolean Ze() {
    return (Double.isNaN(this.Zw) || Double.isInfinite(this.Zw));
  }
  
  public final void Zh(Zf paramZf, Zyi paramZyi) throws IOException {
    paramZf.ZF(this.Zw);
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject == null)
      return false; 
    if (paramObject instanceof Zi) {
      double d = ((Zi)paramObject).Zw;
      return (Double.compare(this.Zw, d) == 0);
    } 
    return false;
  }
  
  public int hashCode() {
    long l = Double.doubleToLongBits(this.Zw);
    return (int)l ^ (int)(l >> 32L);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Zi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */