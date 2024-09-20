package burp;

class Zxvv extends Zxv7 implements Zs0m {
  Zxvv(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zefg<Zvo1> Zqd() {
    return (Zefg<Zvo1>)this.Za.ZJ(this, Zkpw.Zo);
  }
  
  public Zmzk ZqZ() {
    return this.Za.<Zmzk>ZJ(this, Zkpw.ZV);
  }
  
  public void Zz(Zmzk paramZmzk) {
    this.Za.Zq(this, Zkpw.ZV, paramZmzk);
  }
  
  public Zbr Zq9() {
    Zefg<Zk94> zefg = (Zefg)this.Za.ZJ(this, Zkpw.Zv);
    Zstu zstu = this.Za.<Zstu>ZA(this, Zkpw.Zw);
    int i = Zkic.ZA();
    byte b = this.Za.ZL(this, Zkpw.ZD);
    if (Zbqc.Zwu() == null)
      Zkic.ZE(++i); 
    return (zefg == null && zstu == null) ? null : Zbr.ZK(zefg, zstu, Zkyt.Zf(b));
  }
  
  public void Zd(Zbr paramZbr) {
    int i = Zkic.ZA();
    if (paramZbr != null) {
      this.Za.Zq(this, Zkpw.Zv, paramZbr.ZO());
      this.Za.ZQ(this, Zkpw.Zw, paramZbr.Zr());
      this.Za.Zc(this, Zkpw.ZD, (paramZbr.Zx()).persistedId);
      if (i == 0) {
        this.Za.Zq(this, (Zekb<Zk94>)Zkpw.Zv, null);
        this.Za.ZQ(this, Zkpw.Zw, null);
        this.Za.Zc(this, Zkpw.ZD, Zkyt.UNKNOWN.persistedId);
        return;
      } 
      return;
    } 
    this.Za.Zq(this, (Zekb<Zk94>)Zkpw.Zv, null);
    this.Za.ZQ(this, Zkpw.Zw, null);
    this.Za.Zc(this, Zkpw.ZD, Zkyt.UNKNOWN.persistedId);
  }
  
  public Zeix Zqs() {
    return this.Za.<Zeix>ZJ(this, Zkpw.ZP);
  }
  
  public void ZH(Zeix paramZeix) {
    this.Za.Zq(this, Zkpw.ZP, paramZeix);
  }
  
  public Zeed ZqY() {
    return this.Za.<Zeed>ZJ(this, Zkpw.ZR);
  }
  
  public boolean Zgn() {
    return this.Za.Zi(this, Zkpw.ZI);
  }
  
  public void ZXX(boolean paramBoolean) {
    this.Za.ZH(this, Zkpw.ZI, paramBoolean);
  }
  
  public String ZAs() {
    return this.Za.Zz(this, Zkpw.Zb);
  }
  
  public void ZWK(String paramString) {
    this.Za.ZR(this, Zkpw.Zb, paramString);
  }
  
  public boolean ZG(Zgi4 paramZgi4) {
    return paramZgi4.Zf(this);
  }
  
  public void ZHG() {
    this.Za.ZM(this, Zkpw.Za, 0);
  }
  
  public Zeu4<Zs0m> ZF() {
    return Zs0m.Zk;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxvv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */