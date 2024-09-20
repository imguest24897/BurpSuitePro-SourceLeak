package burp;

import java.util.Arrays;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zr2n extends Zr9a {
  private boolean ZH;
  
  private boolean Zg;
  
  private int Za;
  
  private int Zt;
  
  private byte[] Zd;
  
  private byte[] Zv;
  
  public Zte7 Zz(Zrp9 paramZrp9) {
    String str = Zerg.Zr();
    if (this.Zd == null) {
      this.Zd = paramZrp9.ZvM();
      this.ZH = paramZrp9.ZvU().ZaY();
      this.Za = paramZrp9.ZvU().Zl7();
      if (str == null) {
        Zbqc.Zr(new Zbqc[5]);
      } else {
        return super.Zz(paramZrp9);
      } 
    } 
    Zuh.Zb((this.Zv == null), Zqf.Zr);
    this.Zv = paramZrp9.ZvM();
    this.Zg = paramZrp9.ZvU().ZaY();
    this.Zt = paramZrp9.ZvU().Zl7();
    return super.Zz(paramZrp9);
  }
  
  boolean Zm() {
    return (!Arrays.equals(this.Zd, this.Zv) || (this.ZH ^ this.Zg) != 0 || this.Za != this.Zt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr2n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */