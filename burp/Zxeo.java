package burp;

import java.util.Objects;

class Zxeo extends Zxsr implements Zrss {
  Zxeo(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public void ZR(Zrss paramZrss) {
    Zkhk.Zc(this, paramZrss);
  }
  
  public String ZAs() {
    Zbqc[] arrayOfZbqc = Zkhk.ZD();
    String str = this.Za.Zz(this, Zk3a.Ze);
    if (str == null && this.Za.ZQ(this, 0))
      str = Objects.toString(this.Za.Zg(this, Zk3a.ZF, false), null); 
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[2]); 
    return (str == null) ? "" : str;
  }
  
  public void ZWK(String paramString) {
    this.Za.ZR(this, Zk3a.Ze, paramString);
  }
  
  public byte Zm7() {
    return this.Za.ZL(this, Zk3a.ZS);
  }
  
  public void ZV(byte paramByte) {
    this.Za.Zc(this, Zk3a.ZS, paramByte);
  }
  
  public Zeu4<Zrss> ZF() {
    return Ze;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxeo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */