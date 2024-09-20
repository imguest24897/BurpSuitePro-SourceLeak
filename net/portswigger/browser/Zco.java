package net.portswigger.browser;

public class Zco {
  private final Zjl ZJ;
  
  private final Zd7 Zd;
  
  private final Zte Zh;
  
  private final int Zk;
  
  private final double ZE;
  
  private final double ZU;
  
  private Zdi ZH = Zdi.ZG;
  
  private int Zs = 1;
  
  private Zco(Zjl paramZjl, Zd7 paramZd7, Zte paramZte, double paramDouble1, double paramDouble2) {
    this.ZJ = paramZjl;
    this.Zd = paramZd7;
    this.Zh = paramZte;
    this.Zk = paramZte.ZL();
    this.ZE = paramDouble1;
    this.ZU = paramDouble2;
  }
  
  public Zjl ZT() {
    return this.ZJ;
  }
  
  public Zd7 ZQ() {
    return this.Zd;
  }
  
  public Zte ZK() {
    return this.Zh;
  }
  
  public int Zl() {
    return this.Zk;
  }
  
  public double Zz() {
    return this.ZE;
  }
  
  public double ZM() {
    return this.ZU;
  }
  
  public Zdi Zq() {
    return this.ZH;
  }
  
  public int ZS() {
    return this.Zs;
  }
  
  public static Zco Zd(Zca paramZca) {
    return new Zco(Zjl.MOUSE, Zd7.MOUSE_PRESSED, Zte.LEFT, paramZca.ZQ(), paramZca.ZG());
  }
  
  public static Zco Zg(Zca paramZca) {
    return new Zco(Zjl.MOUSE, Zd7.MOUSE_RELEASED, Zte.LEFT, paramZca.ZQ(), paramZca.ZG());
  }
  
  public Zco Zc(Zdi paramZdi) {
    this.ZH = paramZdi;
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zco.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */