package org.openapi4j;

import burp.Zbqc;
import java.net.URL;
import java.util.function.Predicate;

public class Zpi {
  private final String Za;
  
  private final Zp ZW;
  
  private final String ZN;
  
  private final Predicate<URL> Z_;
  
  public Zp Zb() {
    return this.ZW;
  }
  
  public String ZX() {
    return this.ZN;
  }
  
  public String ZE() {
    return this.Za;
  }
  
  public Predicate<URL> ZS() {
    return this.Z_;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zpi zpi = (Zpi)paramObject;
    return !this.ZW.equals(zpi.Zb()) ? false : (!this.ZN.equals(zpi.ZX()) ? false : (!this.Za.equals(zpi.ZE()) ? false : this.Z_.equals(zpi.ZS())));
  }
  
  public int hashCode() {
    int i = this.Za.hashCode();
    i = 31 * i + this.ZW.hashCode();
    int[] arrayOfInt = Zp.ZV();
    i = 31 * i + this.ZN.hashCode();
    i = 31 * i + this.Z_.hashCode();
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[3]); 
    return i;
  }
  
  private static boolean lambda$new$0(URL paramURL) {
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zpi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */