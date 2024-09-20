package burp;

public class Zio extends Zvy<Zio> {
  private Zmtz Zg;
  
  private boolean Zt;
  
  private String Zj;
  
  private boolean ZV = true;
  
  private Zxaq ZE = Zxaq.TEXT;
  
  private Zmlc Z_ = (new Zrbg()).ZV();
  
  protected Zb2c ZG = Zb2c.NONE;
  
  private String Ze = "";
  
  public Zio ZG(Zmtz paramZmtz) {
    this.Zg = paramZmtz;
    return this;
  }
  
  public Zio ZF(boolean paramBoolean) {
    this.Zt = paramBoolean;
    return this;
  }
  
  public Zio ZO(boolean paramBoolean) {
    this.ZV = paramBoolean;
    return this;
  }
  
  public Zio ZR(Zxaq paramZxaq) {
    this.ZE = paramZxaq;
    return this;
  }
  
  public Zio Zo(Zmlc paramZmlc) {
    this.Z_ = paramZmlc;
    return this;
  }
  
  public Zio Zv(Zb2c paramZb2c) {
    this.ZG = paramZb2c;
    return this;
  }
  
  public Zio ZM(String paramString) {
    this.Ze = paramString;
    return this;
  }
  
  public Zs3b Zb() {
    return new Zs3b(this.Zg, this.Zp, this.Zz, this.Zc, this.Zu, this.Zt, this.ZV, this.Zv, this.Zj, this.ZE, this.Z_, this.ZG, this.Ze);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zio.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */