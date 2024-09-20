package org.bouncycastle.tsp;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.tsp.Accuracy;

public class GenTimeAccuracy {
  private Accuracy accuracy;
  
  public GenTimeAccuracy(Accuracy paramAccuracy) {
    this.accuracy = paramAccuracy;
  }
  
  public int getSeconds() {
    return getTimeComponent(this.accuracy.getSeconds());
  }
  
  public int getMillis() {
    return getTimeComponent(this.accuracy.getMillis());
  }
  
  public int getMicros() {
    return getTimeComponent(this.accuracy.getMicros());
  }
  
  private int getTimeComponent(ASN1Integer paramASN1Integer) {
    return (paramASN1Integer != null) ? paramASN1Integer.intValueExact() : 0;
  }
  
  public String toString() {
    return getSeconds() + "." + format(getMillis()) + format(getMicros());
  }
  
  private String format(int paramInt) {
    return (paramInt < 10) ? ("00" + paramInt) : ((paramInt < 100) ? ("0" + paramInt) : Integer.toString(paramInt));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tsp\GenTimeAccuracy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */