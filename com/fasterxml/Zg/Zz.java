package com.fasterxml.Zg;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zk;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zyi;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

public class Zz extends Zn {
  private static final BigInteger Zf = BigInteger.valueOf(-2147483648L);
  
  private static final BigInteger Zt = BigInteger.valueOf(2147483647L);
  
  private static final BigInteger ZN = BigInteger.valueOf(Long.MIN_VALUE);
  
  private static final BigInteger ZD = BigInteger.valueOf(Long.MAX_VALUE);
  
  protected final BigInteger ZQ;
  
  public Zz(BigInteger paramBigInteger) {
    this.ZQ = paramBigInteger;
  }
  
  public static Zz Zc(BigInteger paramBigInteger) {
    return new Zz(paramBigInteger);
  }
  
  public Zl ZV() {
    return Zl.VALUE_NUMBER_INT;
  }
  
  public Zk ZO() {
    return Zk.BIG_INTEGER;
  }
  
  public boolean ZP() {
    return (this.ZQ.compareTo(Zf) >= 0 && this.ZQ.compareTo(Zt) <= 0);
  }
  
  public boolean ZQ() {
    return (this.ZQ.compareTo(ZN) >= 0 && this.ZQ.compareTo(ZD) <= 0);
  }
  
  public Number Zu() {
    return this.ZQ;
  }
  
  public int ZN() {
    return this.ZQ.intValue();
  }
  
  public long Zh() {
    return this.ZQ.longValue();
  }
  
  public BigInteger ZS() {
    return this.ZQ;
  }
  
  public double Zg() {
    return this.ZQ.doubleValue();
  }
  
  public BigDecimal Zq() {
    return new BigDecimal(this.ZQ);
  }
  
  public String Zp() {
    return this.ZQ.toString();
  }
  
  public boolean ZA(boolean paramBoolean) {
    return !BigInteger.ZERO.equals(this.ZQ);
  }
  
  public final void Zh(Zf paramZf, Zyi paramZyi) throws IOException {
    paramZf.Zy(this.ZQ);
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject == null)
      return false; 
    if (paramObject instanceof Zz) {
      Zz zz = (Zz)paramObject;
      return Objects.equals(zz.ZQ, this.ZQ);
    } 
    return false;
  }
  
  public int hashCode() {
    return Objects.hashCode(this.ZQ);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Zz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */