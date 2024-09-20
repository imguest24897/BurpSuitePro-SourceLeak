package burp;

import javax.net.ssl.SSLSocket;

class Zg9d implements Zsg0 {
  final Zsx2 Zb;
  
  private Zg9d(Zsx2 paramZsx2) {}
  
  public void Zw(Zsb paramZsb) {
    SSLSocket sSLSocket = this.Zb.ZR.ZA(this.Zb.Zz, paramZsb, this.Zb.Zj.toString());
    if (sSLSocket != null)
      this.Zb.Zz = sSLSocket; 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg9d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */