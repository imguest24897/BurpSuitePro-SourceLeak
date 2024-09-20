package net.portswigger.browser;

import burp.Zbqc;
import java.util.Date;
import java.util.Objects;

public class Zcd {
  private final String Zo;
  
  private final String Z_;
  
  private final String ZD;
  
  private final String Zc;
  
  private final Double Ze;
  
  private final Boolean Zt;
  
  private final Boolean ZL;
  
  private final Zdv Zr;
  
  private final Zz3 ZJ;
  
  private final Boolean Zf;
  
  private final Ze8 Zi;
  
  private final Integer ZB;
  
  private final Zd8 ZO;
  
  public Zcd(String paramString1, String paramString2, String paramString3, String paramString4, Double paramDouble, Boolean paramBoolean1, Boolean paramBoolean2, Zdv paramZdv, Zz3 paramZz3, Boolean paramBoolean3, Ze8 paramZe8, Integer paramInteger, Zd8 paramZd8) {
    this.Zo = paramString1;
    this.Z_ = paramString2;
    this.ZD = paramString3;
    this.Zc = paramString4;
    this.Ze = paramDouble;
    boolean bool = Ze8.Zr();
    this.Zt = paramBoolean1;
    this.ZL = paramBoolean2;
    this.Zr = paramZdv;
    this.ZJ = paramZz3;
    this.Zf = paramBoolean3;
    this.Zi = paramZe8;
    this.ZB = paramInteger;
    this.ZO = paramZd8;
    if (Zbqc.Zwu() == null)
      Ze8.ZW(!bool); 
  }
  
  public static Zcd Zy(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean1, boolean paramBoolean2, Date paramDate) {
    return new Zcd(paramString1, paramString2, paramString3, paramString4, (paramDate != null) ? Double.valueOf(paramDate.toInstant().toEpochMilli() / 1000.0D) : null, Boolean.valueOf(paramBoolean2), Boolean.valueOf(paramBoolean1), null, null, null, null, null, null);
  }
  
  public String Zl() {
    return this.Zo;
  }
  
  public String Zd() {
    return this.Z_;
  }
  
  public String ZI() {
    return this.ZD;
  }
  
  public String ZW() {
    return this.Zc;
  }
  
  public Double Zg() {
    return this.Ze;
  }
  
  public Boolean Zv() {
    return this.Zt;
  }
  
  public Boolean Zh() {
    return this.ZL;
  }
  
  public Zdv Zw() {
    return this.Zr;
  }
  
  public Zz3 Zf() {
    return this.ZJ;
  }
  
  public Boolean ZB() {
    return this.Zf;
  }
  
  public Ze8 ZF() {
    return this.Zi;
  }
  
  public Integer Zy() {
    return this.ZB;
  }
  
  public Zd8 ZS() {
    return this.ZO;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zcd zcd = (Zcd)paramObject;
    return (Objects.equals(this.Zo, zcd.Zo) && Objects.equals(this.Z_, zcd.Z_) && Objects.equals(this.ZD, zcd.ZD) && Objects.equals(this.Zc, zcd.Zc) && Objects.equals(this.Ze, zcd.Ze) && Objects.equals(this.Zt, zcd.Zt) && Objects.equals(this.ZL, zcd.ZL) && this.Zr == zcd.Zr && this.ZJ == zcd.ZJ && Objects.equals(this.Zf, zcd.Zf) && this.Zi == zcd.Zi && Objects.equals(this.ZB, zcd.ZB) && Objects.equals(this.ZO, zcd.ZO));
  }
  
  public int hashCode() {
    boolean bool = Ze8.Zr();
    if (!bool)
      Zbqc.Zr(new Zbqc[5]); 
    return Objects.hash(new Object[] { 
          this.Zo, this.Z_, this.ZD, this.Zc, this.Ze, this.Zt, this.ZL, this.Zr, this.ZJ, this.Zf, 
          this.Zi, this.ZB, this.ZO });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zcd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */