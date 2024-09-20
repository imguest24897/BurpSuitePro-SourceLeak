package burp;

import java.util.Iterator;

public class Zgzi {
  private final Iterator<Zb3t> ZB;
  
  private final Zes3 Zd;
  
  private final Zs89 Zh;
  
  private final Zxpd ZN;
  
  private Zrum ZI;
  
  public Zgzi(Zes3 paramZes3, Zs89 paramZs89, Zxpd paramZxpd) {
    this.Zd = paramZes3;
    boolean bool = Zrn9.Za();
    this.Zh = paramZs89;
    this.ZN = paramZxpd;
    this.ZB = (new Zz61(paramZes3.Zq())).iterator();
    this.ZI = Zx();
    if (Zbqc.Zwu() == null)
      Zrn9.Z_(!bool); 
  }
  
  public Zkal Zz() {
    boolean bool = Zrn9.Za();
    if (this.ZI == null)
      return null; 
    Zkal zkal = null;
    while (zkal == null) {
      zkal = this.ZI.Zx();
      if (zkal == null) {
        this.ZI = Zx();
        if (this.ZI == null)
          return null; 
        zkal = this.ZI.Zx();
        if (!bool)
          break; 
      } 
    } 
    return zkal;
  }
  
  private Zrum Zx() {
    boolean bool = Zrn9.Zn();
    while (this.ZB.hasNext()) {
      Zb3t zb3t = this.ZB.next();
      if (zb3t.ZO(Zxc6.TaintSource) != null)
        return new Zrum(this.Zd, zb3t, this.Zh, this.ZN); 
      if (bool)
        break; 
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgzi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */