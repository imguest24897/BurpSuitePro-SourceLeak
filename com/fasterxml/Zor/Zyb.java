package com.fasterxml.Zor;

import com.fasterxml.Zvg;
import java.io.Serializable;

public class Zyb implements Serializable {
  private static final long serialVersionUID = -1L;
  
  public static final Zyb Zd = new Zyb(Boolean.TRUE, null, null, null, null, null, null);
  
  public static final Zyb Zo = new Zyb(Boolean.FALSE, null, null, null, null, null, null);
  
  public static final Zyb Zf = new Zyb(null, null, null, null, null, null, null);
  
  protected final Boolean Zv;
  
  protected final String ZN;
  
  protected final Integer Zz;
  
  protected final String ZG;
  
  protected final transient Zd ZS;
  
  protected Zvg ZA;
  
  protected Zvg ZD;
  
  protected Zyb(Boolean paramBoolean, String paramString1, Integer paramInteger, String paramString2, Zd paramZd, Zvg paramZvg1, Zvg paramZvg2) {
    this.Zv = paramBoolean;
    this.ZN = paramString1;
    this.Zz = paramInteger;
    this.ZG = (paramString2 == null || paramString2.isEmpty()) ? null : paramString2;
    this.ZS = paramZd;
    this.ZA = paramZvg1;
    this.ZD = paramZvg2;
  }
  
  public static Zyb ZB(Boolean paramBoolean, String paramString1, Integer paramInteger, String paramString2) {
    return (paramString1 != null || paramInteger != null || paramString2 != null) ? new Zyb(paramBoolean, paramString1, paramInteger, paramString2, null, null, null) : ((paramBoolean == null) ? Zf : (paramBoolean.booleanValue() ? Zd : Zo));
  }
  
  protected Object readResolve() {
    return (this.ZN == null && this.Zz == null && this.ZG == null && this.ZS == null && this.ZA == null && this.ZD == null) ? ((this.Zv == null) ? Zf : (this.Zv.booleanValue() ? Zd : Zo)) : this;
  }
  
  public Zyb ZC(String paramString) {
    return new Zyb(this.Zv, paramString, this.Zz, this.ZG, this.ZS, this.ZA, this.ZD);
  }
  
  public Zyb Zi(Zd paramZd) {
    return new Zyb(this.Zv, this.ZN, this.Zz, this.ZG, paramZd, this.ZA, this.ZD);
  }
  
  public Zyb Zr(Zvg paramZvg1, Zvg paramZvg2) {
    return new Zyb(this.Zv, this.ZN, this.Zz, this.ZG, this.ZS, paramZvg1, paramZvg2);
  }
  
  public boolean ZT() {
    return (this.Zv != null && this.Zv.booleanValue());
  }
  
  public Integer Zv() {
    return this.Zz;
  }
  
  public boolean ZE() {
    return (this.Zz != null);
  }
  
  public Zd Zs() {
    return this.ZS;
  }
  
  public Zvg Zb() {
    return this.ZA;
  }
  
  public Zvg ZI() {
    return this.ZD;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zyb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */