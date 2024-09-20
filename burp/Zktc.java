package burp;

import java.io.IOException;
import net.portswigger.Zkb;
import net.portswigger.Zmw;

public class Zktc extends Zkte {
  private final Zbsq Zd;
  
  public Zktc(Zr_4 paramZr_4, Zbsq paramZbsq) {
    super(paramZr_4, paramZbsq);
    this.Zd = paramZbsq;
  }
  
  public void Zy4() throws Ztku {
    this.Zd.Zy4();
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    this.Zd.ZS(paramZs4f);
  }
  
  protected byte[][] Zw(Zzlx paramZzlx, byte[] paramArrayOfbyte) {
    if (this.Zd.ZPv().isEmpty()) {
      if (this.Zd.ZP1() == this.Zd.ZP7().size()) {
        this.Zd.ZvH(this.Zd.ZPV());
        this.Zd.ZcN(false);
        return null;
      } 
      byte[] arrayOfByte = (byte[])((Zstu)this.Zd.ZP7().get(this.Zd.ZP1())).ZiD().clone();
      this.Zd.Zhf(this.Zd.ZP1() + 1);
      if (this.Zd.ZPA())
        this.Zd.Zp(this.Zn.Zz(Zkb.ZG(arrayOfByte))); 
      if (this.Zd.ZP9()) {
        Zmw.Zp(arrayOfByte);
        Zsdr zsdr1 = this.Zn.Zz(Zkb.ZG(arrayOfByte));
        if (!this.Zd.ZPv().contains(zsdr1))
          this.Zd.Zp(zsdr1); 
      } 
      if (this.Zd.ZPL()) {
        Zmw.ZX(arrayOfByte);
        Zsdr zsdr1 = this.Zn.Zz(Zkb.ZG(arrayOfByte));
        if (!this.Zd.ZPv().contains(zsdr1))
          this.Zd.Zp(zsdr1); 
      } 
      if (this.Zd.ZP3()) {
        Zmw.ZO(arrayOfByte);
        Zsdr zsdr1 = this.Zn.Zz(Zkb.ZG(arrayOfByte));
        if (!this.Zd.ZPv().contains(zsdr1))
          this.Zd.Zp(zsdr1); 
      } 
      if (this.Zd.ZPi()) {
        Zmw.Zq(arrayOfByte);
        Zsdr zsdr1 = this.Zn.Zz(Zkb.ZG(arrayOfByte));
        if (!this.Zd.ZPv().contains(zsdr1))
          this.Zd.Zp(zsdr1); 
      } 
      if (this.Zd.ZPv().isEmpty())
        return null; 
    } 
    Zsdr zsdr = this.Zd.ZPv().get(0);
    this.Zd.Zhz(0);
    this.Zd.Zh2(this.Zd.ZPV() + 1);
    return this.Zd.Zyn().Zm(new Zr1f(paramZzlx), paramArrayOfbyte, Zkb.Zy(zsdr.toString()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zktc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */