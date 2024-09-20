package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zebw extends Zebx {
  final short Zc;
  
  final Zzh_ ZR;
  
  Zebw(Zzh_ paramZzh_, short paramShort) {}
  
  public void Zo(Zrtx paramZrtx) {
    this.ZR.ZC.Zt(paramZrtx.Zkb());
    Zlit zlit = paramZrtx.ZlL();
    if (this.ZR.ZC.ZM.ZQ(zlit, this.Zc)) {
      byte[] arrayOfByte1 = zlit.ZdH();
      byte[] arrayOfByte2 = new byte[arrayOfByte1.length + 1];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
      arrayOfByte2[arrayOfByte1.length] = 47;
      Zez3 zez3 = this.ZR.ZC.Zj.Zq(new Zax(zlit.Zdz(), arrayOfByte2), this.Zc);
      this.ZR.ZC.ZI.Zh(zez3);
    } 
  }
  
  public void Zk(Zmxt paramZmxt) {
    Zuh.Zb(this.ZR.ZC.ZM.ZQ(paramZmxt.ZlL(), (short)0), Zqf.Zk);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zebw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */