package burp;

import javax.net.ssl.SSLSocket;

class Zkfx implements Zlv7 {
  final SSLSocket ZG;
  
  final Zi8 Z_;
  
  final boolean ZE;
  
  final Zs9s Zx;
  
  final Zlb7 ZS;
  
  Zkfx(Zlb7 paramZlb7, SSLSocket paramSSLSocket, Zi8 paramZi8, boolean paramBoolean, Zs9s paramZs9s) {}
  
  public void ZG(Zli3 paramZli3) {
    Zis zis = new Zis(this.ZG, paramZli3);
    Zb2f zb2f = this.ZS.ZD(zis, this.Z_, this.ZE, false, this.Zx);
    this.ZS.ZS.Zx(zb2f);
  }
  
  public void ZE(Throwable paramThrowable) {
    String[] arrayOfString = Zz2j.ZJ();
    if (paramThrowable instanceof Zmfz)
      this.ZS.Zz.ZM(new Zt2b((Zmfz)paramThrowable, this.Zx), Zlb7.Zc); 
    if (paramThrowable instanceof Zzt7) {
      this.ZS.Zz.ZM(new Zt2b((Zzt7)paramThrowable, this.Zx), Zlb7.Zc);
      if (arrayOfString == null) {
        this.ZS.Zz.ZM(paramThrowable, Zlb7.Zc);
        return;
      } 
      return;
    } 
    this.ZS.Zz.ZM(paramThrowable, Zlb7.Zc);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkfx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */