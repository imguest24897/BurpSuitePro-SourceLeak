package com.fasterxml.Zg;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zk;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zvr;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Za extends Zn {
  protected final float ZW;
  
  public Za(float paramFloat) {
    this.ZW = paramFloat;
  }
  
  public static Za Zh(float paramFloat) {
    return new Za(paramFloat);
  }
  
  public Zl ZV() {
    return Zl.VALUE_NUMBER_FLOAT;
  }
  
  public Zk ZO() {
    return Zk.FLOAT;
  }
  
  public boolean ZP() {
    return (this.ZW >= -2.1474836E9F && this.ZW <= 2.1474836E9F);
  }
  
  public boolean ZQ() {
    return (this.ZW >= -9.223372E18F && this.ZW <= 9.223372E18F);
  }
  
  public Number Zu() {
    return Float.valueOf(this.ZW);
  }
  
  public int ZN() {
    return (int)this.ZW;
  }
  
  public long Zh() {
    return (long)this.ZW;
  }
  
  public double Zg() {
    return this.ZW;
  }
  
  public BigDecimal Zq() {
    return BigDecimal.valueOf(this.ZW);
  }
  
  public BigInteger ZS() {
    return Zq().toBigInteger();
  }
  
  public String Zp() {
    return Zvr.Zo(this.ZW);
  }
  
  public boolean Ze() {
    return (Float.isNaN(this.ZW) || Float.isInfinite(this.ZW));
  }
  
  public final void Zh(Zf paramZf, Zyi paramZyi) throws IOException {
    paramZf.Za(this.ZW);
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject == null)
      return false; 
    if (paramObject instanceof Za) {
      float f = ((Za)paramObject).ZW;
      return (Float.compare(this.ZW, f) == 0);
    } 
    return false;
  }
  
  public int hashCode() {
    return Float.floatToIntBits(this.ZW);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Za.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */