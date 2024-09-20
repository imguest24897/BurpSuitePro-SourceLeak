package burp;

import java.net.Socket;

class Zsnf implements Zlm {
  final Socket ZJ;
  
  final Zth_ Zt;
  
  final Zlit ZT;
  
  final Zt4s ZL;
  
  Zsnf(Zt4s paramZt4s, Socket paramSocket, Zth_ paramZth_, Zlit paramZlit) {}
  
  public void Zx(Zl3z paramZl3z) {
    (new Zrib(this.ZL.ZE, paramZl3z, Ze3o.CLIENT_TO_SERVER, this.ZJ.getLocalPort(), this.Zt, this.ZT, this.Zt.ZR(), this.ZL.Zg, this.ZL.Zz, this.ZL.Zi)).ZI();
  }
  
  public void ZM(Zl3z paramZl3z) {
    (new Zrib(this.ZL.ZE, paramZl3z, Ze3o.SERVER_TO_CLIENT, this.ZJ.getLocalPort(), this.Zt, this.ZT, this.Zt.ZR(), this.ZL.Zg, this.ZL.Zz, this.ZL.Zi)).ZI();
  }
  
  public void ZI() {
    this.Zt.Zv();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsnf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */