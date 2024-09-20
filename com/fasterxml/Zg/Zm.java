package com.fasterxml.Zg;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zk;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zvr;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Zm extends Zn {
  protected final long Zb;
  
  public Zm(long paramLong) {
    this.Zb = paramLong;
  }
  
  public static Zm ZI(long paramLong) {
    return new Zm(paramLong);
  }
  
  public Zl ZV() {
    return Zl.VALUE_NUMBER_INT;
  }
  
  public Zk ZO() {
    return Zk.LONG;
  }
  
  public boolean ZP() {
    return (this.Zb >= -2147483648L && this.Zb <= 2147483647L);
  }
  
  public boolean ZQ() {
    return true;
  }
  
  public Number Zu() {
    return Long.valueOf(this.Zb);
  }
  
  public int ZN() {
    return (int)this.Zb;
  }
  
  public long Zh() {
    return this.Zb;
  }
  
  public double Zg() {
    return this.Zb;
  }
  
  public BigDecimal Zq() {
    return BigDecimal.valueOf(this.Zb);
  }
  
  public BigInteger ZS() {
    return BigInteger.valueOf(this.Zb);
  }
  
  public String Zp() {
    return Zvr.ZC(this.Zb);
  }
  
  public boolean ZA(boolean paramBoolean) {
    return (this.Zb != 0L);
  }
  
  public final void Zh(Zf paramZf, Zyi paramZyi) throws IOException {
    paramZf.Zw(this.Zb);
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject == this) ? true : ((paramObject == null) ? false : ((paramObject instanceof Zm) ? ((((Zm)paramObject).Zb == this.Zb)) : false));
  }
  
  public int hashCode() {
    return (int)this.Zb ^ (int)(this.Zb >> 32L);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Zm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */