package burp;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;

class Zlww {
  private final Zs9s ZV;
  
  private final Zbw_ Zf;
  
  private final boolean ZU;
  
  private final Zgbr Zp;
  
  private Socket ZD;
  
  private Zlam ZA;
  
  private Zky_ ZM;
  
  Zlww(Zml3 paramZml3, Zbw_ paramZbw_, boolean paramBoolean, Zskh paramZskh, Zrgd paramZrgd) {
    this.Zf = paramZbw_;
    this.ZU = paramBoolean;
    this.Zp = new Zgbr(paramZskh, paramZrgd);
    this.ZD = paramZml3.Zu();
    this.ZV = paramZml3.ZL();
  }
  
  void Zg() throws IOException, Zz8v, Zz8e {
    ZA();
    ZJ();
    Zk();
    Zr();
  }
  
  Zlam ZK() {
    return this.ZA;
  }
  
  Zky_ Zt() {
    return this.ZM;
  }
  
  private void ZA() throws SocketException {
    this.ZD.setKeepAlive(true);
    this.ZD.setSoTimeout(0);
  }
  
  private void ZJ() throws IOException, Zz8e {
    try {
      if (this.ZU) {
        this.ZM = new Zky_(this.Zf, this.ZD, this.ZV, null, this.ZV.ZS(), false);
        this.ZM.ZW();
        this.ZD = this.ZM.ZC();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private void Zk() throws IOException {
    boolean bool = this.Zf.ZFM().Zlk();
    this.ZA = this.Zp.Zr(this.ZD, bool);
  }
  
  private void Zr() throws Zz8v {
    byte[] arrayOfByte = this.ZA.ZI();
    try {
      if (arrayOfByte != null)
        try {
          if (arrayOfByte.length != 0)
            return; 
          throw new Zz8m();
        } catch (Zz8v zz8v) {
          throw a(null);
        }  
    } catch (Zz8v zz8v) {
      throw a(null);
    } 
    throw new Zz8m();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlww.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */