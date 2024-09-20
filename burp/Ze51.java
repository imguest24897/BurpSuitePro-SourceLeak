package burp;

import net.portswigger.Zsy;

public class Ze51 {
  private final Zsy ZC;
  
  private final Zxs7 Zh;
  
  private final Zs6l ZY;
  
  private final Zspd Zg;
  
  public Ze51(Zsy paramZsy, Zxs7 paramZxs7, Zmhe paramZmhe, Zspd paramZspd) {
    this.ZC = paramZsy;
    this.Zh = paramZxs7;
    this.Zg = paramZspd;
    this.ZY = new Zs6l(paramZmhe);
  }
  
  public Zmgx ZJ() {
    return new Zrdx(this.ZC, this.ZY, this.Zg, new Zmgx[0]);
  }
  
  public Zmgx ZA(Zgfe paramZgfe) {
    boolean bool = Zs6l.Zu();
    if (Zbqc.Zwu() == null)
      Zs6l.ZF(!bool); 
    return new Zeen(paramZgfe, new Zmgx[] { new Zrz8(new Zrzo(this.ZC, this.ZY, this.Zg), this.ZC, this.ZY, this.Zg), new Zrzf(this.ZC, this.ZY, this.Zg), new Zr6y(this.ZC, this.ZY, this.Zg), new Zr65(this.ZC, this.ZY, this.Zg) });
  }
  
  public Zmgx Zo() {
    return new Zrwn(this.Zh, this.ZC, this.ZY, this.Zg);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze51.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */