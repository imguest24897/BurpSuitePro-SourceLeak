package burp;

import java.io.InputStream;
import java.net.Socket;

class Ze4o implements Zms7 {
  private final Ztwv ZL;
  
  private final Zbnt ZX;
  
  private final Zg0u ZW;
  
  private final Zeo2 ZP;
  
  private final Socket ZM;
  
  Ze4o(Ztwv paramZtwv, Zbnt paramZbnt, Zg0u paramZg0u, Zeo2 paramZeo2, Socket paramSocket) {
    this.ZL = paramZtwv;
    this.ZX = paramZbnt;
    this.ZW = paramZg0u;
    this.ZP = paramZeo2;
    this.ZM = paramSocket;
  }
  
  public void ZQ(Socket paramSocket, InputStream paramInputStream) {
    Zeo2 zeo2 = this.ZW.Zi(this.ZP);
    boolean bool = zeo2.ZoZ();
    this.ZL.Zx(new Zebk(this.ZM, paramSocket, paramInputStream, bool ? this.ZW : null, bool ? (Zmwv)zeo2 : null, this.ZX));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze4o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */