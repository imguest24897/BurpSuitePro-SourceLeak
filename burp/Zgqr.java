package burp;

import java.awt.Component;
import java.util.List;
import net.portswigger.Zm2;

class Zgqr implements Zt80 {
  private final Zkrw ZY;
  
  private final Zr_4 ZO;
  
  private final String ZH;
  
  private final Zxgc Za;
  
  private final Zbp5 Z_;
  
  private final Zsza Zu;
  
  Zgqr(Zkrw paramZkrw, Zr_4 paramZr_4, String paramString, Zxgc paramZxgc, Zbp5 paramZbp5, Zsza paramZsza) {
    this.ZY = paramZkrw;
    this.ZO = paramZr_4;
    this.ZH = paramString;
    this.Za = paramZxgc;
    this.Z_ = paramZbp5;
    this.Zu = paramZsza;
  }
  
  public void Zu(Zbx0 paramZbx0) {
    this.ZY.Zy().ZFN().ZF(paramZbx0);
  }
  
  public List<Zsor> Zc() {
    return this.ZY.Zy().ZFN().ZJ();
  }
  
  public void Zk() {
    this.ZY.Zy().ZD(this.Za.ZK1(), this.ZH);
  }
  
  public void Zx(Zx8n paramZx8n) {
    this.ZY.Zy().ZD(this.Za.Zg(paramZx8n), this.ZH);
  }
  
  public void Zf(Zlit paramZlit, Zstu paramZstu, Component paramComponent, byte paramByte) {
    Zm2.ZC(Zrrh.SUITE_MESSAGE_EDITOR_SHOW_RESPONSE_IN_BROWSER);
    this.ZY.Zy().ZFW().ZZ(paramZlit, paramZstu, paramComponent, paramByte);
  }
  
  public void Zj(Zlit paramZlit, Zstu paramZstu, boolean paramBoolean, Component paramComponent) {
    Zrrh zrrh = paramBoolean ? Zrrh.SUITE_MESSAGE_EDITOR_REQUEST_IN_BROWSER_CURRENT_SESSION : Zrrh.SUITE_MESSAGE_EDITOR_REQUEST_IN_BROWSER_ORIGINAL_SESSION;
    Zm2.ZC(zrrh);
    if (!(paramZstu instanceof Zxsr))
      paramZstu = paramZstu.Zp(this.ZO); 
    this.ZY.Zy().ZFC().Zk(paramZlit, paramZstu, paramBoolean, paramComponent, (byte)1);
  }
  
  public Zzh6<Zeo2> Zh() {
    return this.ZY.Zy().ZFS();
  }
  
  public boolean ZA() {
    return this.ZY.Zy().ZFL();
  }
  
  public void Zc(boolean paramBoolean) {
    this.ZY.Zy().ZdN(paramBoolean);
  }
  
  public void Zf() {
    this.ZY.Zy().ZF2();
  }
  
  public void ZW() {
    this.ZY.Zy().ZF4();
  }
  
  public void Zv() {
    this.ZY.Zy().ZF_();
  }
  
  public void Zz() {
    this.ZY.Zy().ZFA();
  }
  
  public List<Zrzh> ZC() {
    return this.ZY.Zy().ZFh().Zn().stream().map(this::lambda$getWebSocketProxyHistory$0).toList();
  }
  
  public void Zr(Zktl paramZktl) {
    this.Zu.ZW(paramZktl);
  }
  
  private Zrzh lambda$getWebSocketProxyHistory$0(Zzh2 paramZzh2) {
    return new Zrzh(paramZzh2, this.Z_);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgqr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */