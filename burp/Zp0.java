package burp;

import java.io.Writer;

public class Zp0 extends Zni implements Zrkg {
  @Zzvo(32)
  private final Zefg<Zglw> ZR;
  
  Zp0(Zefg<Zglw> paramZefg) {
    this.ZR = paramZefg;
  }
  
  public Zehu Zu2() {
    return new Zgbx(this);
  }
  
  public void Zi(Zz_r paramZz_r) {
    Zzmy.Zu(paramZz_r, this);
  }
  
  public boolean ZR(Zbx0 paramZbx0) {
    return Zzmy.Zh(paramZbx0, this);
  }
  
  public void Zg(Zb03 paramZb03) {
    Zzmy.Zt(paramZb03, this);
  }
  
  public Zll7 Zub() {
    return null;
  }
  
  public int Zuj() {
    return 4;
  }
  
  public void ZY(Zb_h paramZb_h) {
    Zbqc[] arrayOfZbqc = Zzmy.Zj();
    for (Zglw zglw : this.ZR) {
      zglw.ZDt().ZY(paramZb_h);
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  public Zeu4<? extends Zgkc> ZF() {
    return (Zeu4)Zz;
  }
  
  public Zte7 ZC(Zr9a paramZr9a) {
    return paramZr9a.ZO(this);
  }
  
  public Zte7 Zq(Zr9a paramZr9a) {
    Zbqc[] arrayOfZbqc = Zzmy.Zj();
    Zte7 zte7 = ZC(paramZr9a);
    if (zte7 != Zte7.CONTINUE)
      return zte7; 
    for (Zglw zglw : Zcy()) {
      Zte7 zte71 = zglw.ZDt().Zq(paramZr9a);
      if (zte71 != Zte7.CONTINUE)
        return zte7; 
      if (arrayOfZbqc != null)
        break; 
    } 
    return Zte7.CONTINUE;
  }
  
  public Zzk5 Zu(Zgkc paramZgkc, Zz1h paramZz1h) {
    return Zzmy.ZA(paramZgkc, this);
  }
  
  public Zefg<Zglw> Zcy() {
    return this.ZR;
  }
  
  public void ZR(Zvon paramZvon, Zsh9 paramZsh9, Zbnt paramZbnt, Zey9 paramZey9) {
    Zzmy.ZT(paramZvon, paramZsh9, paramZbnt, this, paramZey9);
  }
  
  public void Ze(Writer paramWriter, Zsh9 paramZsh9, Zey9 paramZey9) {
    Zzmy.Zr(paramWriter, paramZsh9, this, paramZey9);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zp0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */