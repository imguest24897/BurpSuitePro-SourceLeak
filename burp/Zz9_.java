package burp;

import java.util.Iterator;

public class Zz9_ {
  private Zgzi ZY;
  
  private Zes3 Zt;
  
  private Zzwk Zg;
  
  private final Ztgs ZG;
  
  private final Zxpd ZB;
  
  private boolean ZU = false;
  
  private Zs89 Zd;
  
  public Zz9_(Zls2 paramZls2, Zes3 paramZes3, Zzwk paramZzwk, Zxpd paramZxpd) {
    this.Zt = paramZes3;
    this.Zg = paramZzwk;
    int[] arrayOfInt = Zm4y.Zd();
    this.ZG = paramZls2.Zn();
    this.ZB = paramZxpd;
    this.Zd = new Zs89(paramZls2.ZN());
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  private void ZT() {
    Ze();
    Zz();
    ZO();
    Zu();
    this.ZY = new Zgzi(this.Zt, this.Zd, this.ZB);
    this.ZU = true;
  }
  
  public Zkal Zo() {
    if (!this.ZU)
      ZT(); 
    return this.ZY.Zz();
  }
  
  public Zrn9 Zy(Zkal paramZkal) {
    return this.Zd.ZW(paramZkal);
  }
  
  private void Ze() {
    Zz61 zz61 = new Zz61(this.Zt.Zq());
    Iterator<Zb3t> iterator = zz61.iterator();
    int[] arrayOfInt = Zm4y.Zd();
    while (iterator.hasNext()) {
      Zb3t zb3t = iterator.next();
      this.ZB.ZZ();
      this.Zg.Zc(zb3t);
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  private void Zz() {
    (new Zkv0(this.Zt, this.ZG, this.ZB)).ZH();
  }
  
  public void ZO() {
    Zz61 zz61 = new Zz61(this.Zt.Zq());
    Iterator<Zb3t> iterator = zz61.iterator();
    int[] arrayOfInt = Zm4y.Zd();
    while (iterator.hasNext()) {
      Zb3t zb3t = iterator.next();
      this.ZB.ZZ();
      if (zb3t.ZO(Zxc6.TaintHops) != null)
        this.Zg.Zf(zb3t); 
      if (arrayOfInt == null)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zm4y.Z_(new int[5]); 
  }
  
  private void Zu() {
    (new Zxp0(this.Zt, this.ZB)).ZW();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz9_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */