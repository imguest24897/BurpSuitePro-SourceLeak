package com.fasterxml.Zg;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zk;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zvr;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Zu extends Zn {
  private static final Zu[] Zy;
  
  protected final int Zw;
  
  public Zu(int paramInt) {
    this.Zw = paramInt;
  }
  
  public static Zu Zi(int paramInt) {
    return (paramInt > 10 || paramInt < -1) ? new Zu(paramInt) : Zy[paramInt - -1];
  }
  
  public Zl ZV() {
    return Zl.VALUE_NUMBER_INT;
  }
  
  public Zk ZO() {
    return Zk.INT;
  }
  
  public boolean Za() {
    return true;
  }
  
  public boolean ZP() {
    return true;
  }
  
  public boolean ZQ() {
    return true;
  }
  
  public Number Zu() {
    return Integer.valueOf(this.Zw);
  }
  
  public int ZN() {
    return this.Zw;
  }
  
  public long Zh() {
    return this.Zw;
  }
  
  public double Zg() {
    return this.Zw;
  }
  
  public BigDecimal Zq() {
    return BigDecimal.valueOf(this.Zw);
  }
  
  public BigInteger ZS() {
    return BigInteger.valueOf(this.Zw);
  }
  
  public String Zp() {
    return Zvr.ZW(this.Zw);
  }
  
  public boolean ZA(boolean paramBoolean) {
    return (this.Zw != 0);
  }
  
  public final void Zh(Zf paramZf, Zyi paramZyi) throws IOException {
    paramZf.Zd(this.Zw);
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject == this) ? true : ((paramObject == null) ? false : ((paramObject instanceof Zu) ? ((((Zu)paramObject).Zw == this.Zw)) : false));
  }
  
  public int hashCode() {
    return this.Zw;
  }
  
  static {
    byte b1 = 12;
    Zy = new Zu[b1];
    for (byte b2 = 0; b2 < b1; b2++)
      Zy[b2] = new Zu(-1 + b2); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Zu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */