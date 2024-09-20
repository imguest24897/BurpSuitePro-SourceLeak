package burp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import net.portswigger.Zm2;

class Zgg1 {
  private final Zbw_ Zd;
  
  private final Zz8e ZW;
  
  private final Zi8 Zy;
  
  private final Zbnt Z_;
  
  private final Ztwv ZY;
  
  Zgg1(Zbw_ paramZbw_, Zz8e paramZz8e, Zi8 paramZi8, Zbnt paramZbnt, Ztwv paramZtwv) {
    this.Zd = paramZbw_;
    this.ZW = paramZz8e;
    this.Zy = paramZi8;
    this.Z_ = paramZbnt;
    this.ZY = paramZtwv;
  }
  
  void ZR() throws Zxgy, Zxg5, IOException, Zxro {
    try {
    
    } catch (Zxgy zxgy) {
      throw a(null);
    } 
    String str = (this.Zy.Z_ == null) ? this.ZW.Zi() : this.Zy.Z_;
    try {
    
    } catch (Zxgy zxgy) {
      throw a(null);
    } 
    int i = (this.Zy.ZU == 0) ? this.ZW.Zf() : this.Zy.ZU;
    Zmzk zmzk = this.Z_.ZY(str, i, false);
    Ztpu ztpu = this.Zd.ZF0();
    Socket socket = ztpu.ZV(zmzk);
    try {
      if (socket == null)
        throw new Zxro(zmzk); 
    } catch (Zxgy zxgy) {
      throw a(null);
    } 
    Zm2.ZC(Zrrh.PROXY_OPTIONS_SSL_PASS_THROUGH_USED);
    Zm(this.ZW.Zt(), socket.getOutputStream(), this.ZW.Zr(), socket);
    Zm(socket.getInputStream(), this.ZW.Zv(), socket, this.ZW.Zr());
  }
  
  void Zm(InputStream paramInputStream, OutputStream paramOutputStream, Socket paramSocket1, Socket paramSocket2) {
    this.ZY.Zx(new Zet9(paramInputStream, paramOutputStream, paramSocket1, paramSocket2));
  }
  
  private static Zxgy a(Zxgy paramZxgy) {
    return paramZxgy;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgg1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */