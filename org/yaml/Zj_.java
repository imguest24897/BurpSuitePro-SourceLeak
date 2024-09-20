package org.yaml;

import java.io.IOException;

class Zj_ implements Zd {
  final Zb ZP;
  
  private Zj_(Zb paramZb) {}
  
  public void Zt() throws IOException {
    try {
      this.ZP.Zv(":", false, false, false);
      Zb.Za(this.ZP, Zb.ZS(this.ZP).ZY(Zb.ZJ(this.ZP)));
      if (!Zb.Zk(this.ZP, Zb.ZJ(this.ZP)))
        try {
          if (Zb.Zl(this.ZP)) {
            Zb.ZE(this.ZP, true, false);
            this.ZP.ZJ();
            Zb.ZE(this.ZP, Zb.Zf(this.ZP).ZE());
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      Zb.Za(this.ZP, Zb.ZM(this.ZP).ZY(Zb.ZJ(this.ZP)));
      if (!Zb.ZM(this.ZP).ZR()) {
        Zb.ZE(this.ZP, true, false);
        Zb.ZB(this.ZP);
        this.ZP.ZJ();
        Zb.ZE(this.ZP, Zb.Zf(this.ZP).ZE());
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zb.Za(this.ZP).Zq(new Zlw(this.ZP, false));
    Zb.Zu(this.ZP, false, true, false);
    Zb.ZS(this.ZP).Zh();
    Zb.Zl(this.ZP);
  }
  
  Zj_(Zb paramZb, Zjq paramZjq) {
    this(paramZb);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zj_.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */