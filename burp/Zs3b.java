package burp;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Zs3b implements Ze7n {
  private final Zmtz Zr;
  
  private final Zz_4 Zx;
  
  private final String ZS;
  
  private final String Zb;
  
  private final String ZG;
  
  private final boolean Zq;
  
  private final boolean ZR;
  
  private final List<String> ZT;
  
  private final String Zs;
  
  private final Zxaq Zv;
  
  private final Zmlc Zz;
  
  private final Zb2c ZM;
  
  private final String Ze;
  
  private Zs3b(Zmtz paramZmtz, Zz_4 paramZz_4, String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2, List<String> paramList, String paramString4, Zxaq paramZxaq, Zmlc paramZmlc, Zb2c paramZb2c, String paramString5) {
    this.Zr = paramZmtz;
    this.Zx = paramZz_4;
    this.ZS = paramString1;
    this.Zb = paramString2;
    this.ZG = paramString3;
    this.Zq = paramBoolean1;
    this.ZR = paramBoolean2;
    this.ZT = paramList;
    this.Zs = paramString4;
    this.Zv = paramZxaq;
    this.Zz = paramZmlc;
    this.ZM = paramZb2c;
    this.Ze = paramString5;
  }
  
  public Zmtz ZY() {
    return this.Zr;
  }
  
  public byte Zg() {
    return this.Zr.persistedForm;
  }
  
  public Zz_4 ZI() {
    return this.Zx;
  }
  
  public String ZW() {
    return this.ZS;
  }
  
  public String Ze() {
    return this.Zb;
  }
  
  public String ZS() {
    return this.ZG;
  }
  
  public List<String> ZX() {
    return this.ZT;
  }
  
  public boolean Zy() {
    return false;
  }
  
  public Zb2c Zx() {
    return this.ZM;
  }
  
  public String Zs() {
    return this.Ze;
  }
  
  public Optional<Zegu> Zu() {
    return Optional.empty();
  }
  
  public Zxaq Zm() {
    return this.Zv;
  }
  
  public Zzuz ZH() {
    return (new Zssk()).Zr(this.Zq).ZE(this.ZR).Ze();
  }
  
  public Zmlc ZE() {
    return this.Zz;
  }
  
  public Ze7n Zg(String paramString) {
    return new Zs3b(this.Zr, this.Zx, this.ZS, paramString, this.ZG, this.Zq, this.ZR, this.ZT, this.Zs, this.Zv, this.Zz, this.ZM, this.Ze);
  }
  
  public Zz_b Zn() {
    return (new Zegt(ZY(), ZI(), ZW(), Ze(), ZS(), ZH().Zl(), ZH().Zh(), ZX())).Zg(new Zruo());
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zs3b zs3b = (Zs3b)paramObject;
    return (this.Zq == zs3b.Zq && this.Zr == zs3b.Zr && this.Zx == zs3b.Zx && Objects.equals(this.ZS, zs3b.ZS) && Objects.equals(this.Zb, zs3b.Zb) && Objects.equals(this.ZG, zs3b.ZG) && Objects.equals(this.ZT, zs3b.ZT));
  }
  
  public int hashCode() {
    String str = Zvy.ZD();
    if (Zbqc.Zwu() == null)
      Zvy.Zk("iF8TYb"); 
    return Objects.hash(new Object[] { this.Zr, this.Zx, this.ZS, this.Zb, this.ZG, Boolean.valueOf(this.Zq), this.ZT });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs3b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */