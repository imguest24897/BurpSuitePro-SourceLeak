package burp;

import net.portswigger.Zkb;

public class Zg0r implements Zk5d {
  public String ZR;
  
  public String ZU;
  
  private final Zmsx ZE;
  
  private final Zmhe Zh;
  
  private Zs2i Zw;
  
  private Zs2i Ze;
  
  private Zstu Zq;
  
  private Zstu ZG;
  
  public Zg0r(Zmsx paramZmsx, Zmhe paramZmhe) {
    this.ZE = paramZmsx;
    this.Zh = paramZmhe;
  }
  
  public Zstu Zi() {
    if (this.Zw == null) {
      this.ZR = this.ZE.ZO();
      Zlvf zlvf = Zb(this.ZR);
      this.Zw = zlvf.ZY();
      this.Zq = zlvf.ZM().Zl();
      return this.Zq;
    } 
    return Zb(this.ZE.ZO()).ZM().Zl();
  }
  
  public Zstu ZQ() {
    if (this.Ze == null) {
      this.ZU = this.ZE.ZS();
      Zlvf zlvf = Zb(this.ZU);
      this.Ze = zlvf.ZY();
      this.ZG = zlvf.ZM().Zl();
      return this.ZG;
    } 
    return Zb(this.ZE.ZS()).ZM().Zl();
  }
  
  public Zvow Zk(Ze3n paramZe3n, Zkvd paramZkvd) {
    return paramZe3n.ZI().Zp(this.Zw.ZE()).ZK(this.Zw.ZO()).Zu(this.Zq).Z_(paramZkvd.ZF());
  }
  
  public Zvow Zz(Ze3n paramZe3n, Zkvd paramZkvd) {
    int[] arrayOfInt = Zxzf.ZR();
    if (Zbqc.Zwu() == null)
      Zxzf.Zy(new int[5]); 
    return paramZe3n.ZI().Zp(this.Ze.ZE()).ZK(this.Ze.ZO()).Zu(this.ZG).Z_(paramZkvd.ZR());
  }
  
  private Zlvf Zb(String paramString) {
    return this.Zh.ZK(Zri7.ZJ(new Zrrb(Zkb.Zy(paramString), (byte)0)), Zlp5.Zc().Zd(false));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg0r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */