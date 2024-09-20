package burp;

import java.io.IOException;
import java.net.Socket;

class Zmgk {
  private final Zxdt Zo;
  
  private final Zxtv Zr;
  
  private final Zle7 ZR;
  
  Zmgk(Zb_d paramZb_d, Zxdt paramZxdt, Zxtv paramZxtv) {
    this.Zr = paramZxtv;
    this.Zo = paramZxdt;
    this.ZR = new Zle7(paramZb_d);
  }
  
  Zgke Zc(Socket paramSocket, Zmzk paramZmzk) throws IOException {
    Zly6 zly6 = this.Zr.ZL();
    try {
      if (!this.Zr.ZK())
        return this.ZR.ZA(paramSocket, new Zspv(paramSocket::lambda$from$0), paramZmzk, zly6.ZD()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zx0q zx0q = (Zx0q)(zly6.ZZ() ? new Zx0h(this.ZR, this.Zo.Zb(), zly6) : new Zx07(this.ZR, this.Zo.ZM(), paramZmzk));
    return zx0q.Zh(paramSocket, paramZmzk, zly6);
  }
  
  private static void lambda$from$0(Socket paramSocket) {
    Zsdz.ZQ(paramSocket);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmgk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */