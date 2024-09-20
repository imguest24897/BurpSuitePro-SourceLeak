package burp;

import java.util.List;

class Zslh implements Zk5d {
  private final Zmok ZW;
  
  private final Zmok ZB;
  
  private Zzud ZY;
  
  private Zzud Zc;
  
  private boolean ZK;
  
  final Zbld ZV;
  
  private Zslh(Zbld paramZbld, Zmok paramZmok1, Zmok paramZmok2) {
    this.ZW = paramZmok1;
    this.ZB = paramZmok2;
  }
  
  public Zstu Zi() {
    Zsex zsex = new Zsex(this.ZV.ZS.Zr((new Zlv5()).ZD(false)));
    if (this.ZY == null)
      this.ZY = zsex; 
    return zsex.Zl();
  }
  
  public Zstu ZQ() {
    int i = Zbld.Zm();
    Zsex zsex = new Zsex(this.ZV.ZS.Zr((new Zlv5()).Za(ZC()).ZD(false)));
    if (this.Zc == null)
      this.Zc = zsex; 
    if (Zbqc.Zwu() == null)
      Zbld.ZH(++i); 
    return zsex.Zl();
  }
  
  private Zxgd ZC() {
    return Zxgd.Zu(this::lambda$requestWithChangedHeader$0);
  }
  
  private Zvow Zy(Zkvd paramZkvd) {
    return (this.ZY != null) ? this.ZV.ZS.ZI().ZC(this.ZY.Z_()).ZK(ZF()).Zo(this.ZY.ZT()).Z_(paramZkvd.ZF()) : this.ZV.ZS.ZI().Zp(this.ZV.ZS.ZA().ZD()).ZK(ZF()).Zo(this.ZV.ZS.ZL()).Z_(paramZkvd.ZF());
  }
  
  private Zvow ZQ(Zkvd paramZkvd) {
    return this.ZV.ZS.ZI().ZC(this.Zc.Z_()).ZK(ZV()).Zo(this.Zc.ZT()).Z_(paramZkvd.ZR());
  }
  
  private List<Zl1r> ZF() {
    return this.ZK ? Zbld.Zz(this.ZV.ZQ, this.ZY.Z_().ZD()) : null;
  }
  
  private List<Zl1r> ZV() {
    byte[] arrayOfByte = this.Zc.Z_().ZD();
    return this.ZK ? this.ZW.ZA(this.ZV.ZQ, arrayOfByte) : this.ZB.ZA(this.ZV.ZQ, arrayOfByte);
  }
  
  private Zefx lambda$requestWithChangedHeader$0(Zefx paramZefx) {
    int i = Zbld.Zm();
    if (paramZefx.Zp(this.ZV.ZQ, false)) {
      this.ZK = true;
      Zefx zefx = this.ZW.ZK(this.ZV.ZQ).Zv(paramZefx);
      return (i != 0) ? this.ZB.ZK(this.ZV.ZQ).Zv(paramZefx) : zefx;
    } 
    return this.ZB.ZK(this.ZV.ZQ).Zv(paramZefx);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zslh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */