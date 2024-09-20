package burp;

import java.util.Iterator;
import java.util.Set;

public class Zxc1 {
  private final Zrn9 Zs;
  
  private final Zxpd Zf;
  
  private final Iterator<Zb3t> ZC;
  
  private Zzzp Zt;
  
  private Zb3t ZG;
  
  public Zxc1(Zes3 paramZes3, Zrn9 paramZrn9, Zxpd paramZxpd) {
    this.Zs = paramZrn9;
    String[] arrayOfString = Zsdd.Zv();
    this.Zf = paramZxpd;
    this.ZC = (new Zl3x(paramZes3.Zq())).iterator();
    Zk();
    this.Zt = new Zzzp(this.ZG, paramZrn9, paramZxpd);
    if (Zbqc.Zwu() == null)
      Zsdd.Zs(new String[3]); 
  }
  
  public Zsdd Zi() {
    String[] arrayOfString = Zsdd.Zv();
    if (this.ZG == null)
      return null; 
    Zsdd zsdd = this.Zt.Zf();
    while (zsdd == null) {
      Zk();
      if (this.ZG == null)
        return null; 
      this.Zt = new Zzzp(this.ZG, this.Zs, this.Zf);
      zsdd = this.Zt.Zf();
      if (arrayOfString != null)
        break; 
    } 
    return zsdd;
  }
  
  private void Zk() {
    String[] arrayOfString = Zsdd.Zv();
    this.ZG = null;
    while (this.ZG == null) {
      this.ZG = this.ZC.next();
      if (this.ZG == null)
        return; 
      Set<Zb3t> set = this.ZG.<Set>ZO(Zxc6.ReachableNodes);
      if (set == null || set.isEmpty())
        continue; 
      if (!Zz(set, this.Zs))
        this.ZG = null; 
      if (arrayOfString != null)
        break; 
    } 
  }
  
  private boolean Zz(Set<Zb3t> paramSet, Zrn9 paramZrn9) {
    String[] arrayOfString = Zsdd.Zv();
    for (Zb3t zb3t : paramZrn9.Zp()) {
      if (!paramSet.contains(zb3t))
        return false; 
      if (arrayOfString != null)
        break; 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxc1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */