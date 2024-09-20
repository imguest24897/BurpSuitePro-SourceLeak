package net.portswigger.devtools.client.impl;

import burp.Zbqc;
import java.util.List;
import java.util.Objects;
import net.portswigger.browser.Zd;

public final class Zmf implements Zxf {
  private final int ZB;
  
  private final Zmg ZJ;
  
  private final Zd Zf;
  
  private final Zmv Zd;
  
  private final Zmd ZD;
  
  private static int Zz;
  
  public Zmf(int paramInt, Zmg paramZmg, Zd paramZd, List<Zv> paramList) {
    this(paramInt, paramZmg, paramZd, paramList, new Zmd());
  }
  
  public Zmf(int paramInt, Zmg paramZmg, Zd paramZd, List<Zv> paramList, Zmd paramZmd) {
    this.ZB = paramInt;
    this.ZJ = Objects.<Zmg>requireNonNull(paramZmg);
    this.Zf = Objects.<Zd>requireNonNull(paramZd);
    this.Zd = new Zmv(paramList);
    this.ZD = paramZmd;
    int i = ZT();
    if (Zbqc.Zwu() == null)
      ZS(++i); 
  }
  
  public int ZC() {
    return this.ZB;
  }
  
  public Zmg ZO() {
    return this.ZJ;
  }
  
  public Zd ZE() {
    return this.Zf;
  }
  
  public Zmv ZZ() {
    return this.Zd;
  }
  
  public Zmd ZU() {
    return this.ZD;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zmf zmf = (Zmf)paramObject;
    return (this.ZB == zmf.ZB);
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { Integer.valueOf(this.ZB) });
  }
  
  public static void ZS(int paramInt) {
    Zz = paramInt;
  }
  
  public static int Zc() {
    return Zz;
  }
  
  public static int ZT() {
    int i = Zc();
    return (i == 0) ? 44 : 0;
  }
  
  static {
    if (ZT() == 0)
      ZS(60); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zmf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */