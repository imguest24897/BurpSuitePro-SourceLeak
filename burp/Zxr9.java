package burp;

import java.util.List;

public class Zxr9 {
  private final Ze4y ZD;
  
  private final Zeeq Zu;
  
  private final Zt0e Zr;
  
  private final Zzgp ZS = new Zbwd(this);
  
  private final Zkr1<Zss1> Zy = new Zkr1<>();
  
  private final Zmf5 Zm;
  
  private Ztm5 ZG;
  
  private boolean Zf;
  
  private boolean ZN;
  
  public Zxr9(Ze4y paramZe4y, Zeeq paramZeeq, Zt0e paramZt0e) {
    this.ZD = paramZe4y;
    this.Zm = paramZe4y.ZD();
    this.Zu = paramZeeq;
    this.Zr = paramZt0e;
  }
  
  public Zes3 Zw(List<Zsvc> paramList) throws Zgxx {
    this.ZG = new Ztm5(paramList, this.ZD.ZH());
    this.Zm.Zm();
    boolean bool = Zse4.ZM();
    this.Zy.Zy(new Zss1(0, null));
    while (!this.Zf) {
      try {
        if (!this.ZN) {
          ZT();
          if (!bool)
            break; 
        } 
      } catch (Zgxx zgxx) {
        throw a(null);
      } 
    } 
    try {
      if (this.ZN)
        throw new Zgxw(this.Zy, this.ZG, this.Zr); 
    } catch (Zgxx zgxx) {
      throw a(null);
    } 
    return new Zes3(((Zss1)this.Zy.Zc()).Zu);
  }
  
  public Zzgp ZV() {
    return this.ZS;
  }
  
  public boolean ZT() {
    return Zn(this.ZS);
  }
  
  public boolean Zn(Zzgp paramZzgp) {
    this.Zu.ZK(((Zss1)this.Zy.ZP()).Zi, ZI(), paramZzgp);
    return !this.ZN;
  }
  
  private Zbop ZI() {
    Zgho zgho;
    Zrl zrl = Zrl.EOF;
    Zsvc zsvc = this.ZG.Zk();
    if (zsvc != null)
      zgho = zsvc.ZE; 
    return zgho;
  }
  
  private static Zgxx a(Zgxx paramZgxx) {
    return paramZgxx;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxr9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */