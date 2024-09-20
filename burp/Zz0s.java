package burp;

import java.io.IOException;
import java.net.Socket;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zz0s {
  private final Zz95 Zl;
  
  private final Zrps ZF;
  
  private final Zxtv ZU;
  
  private final Zthe Zw;
  
  private final Ztxn Zs;
  
  private final Zsil Zy;
  
  private final Zzen Zq;
  
  public Zz0s(Zz95 paramZz95, Zrps paramZrps, Zxtv paramZxtv, Zthe paramZthe, Ztxn paramZtxn, Zsil paramZsil, Zzen paramZzen) {
    this.Zl = paramZz95;
    this.ZF = paramZrps;
    this.ZU = paramZxtv;
    this.Zw = paramZthe;
    this.Zs = paramZtxn;
    this.Zy = paramZsil;
    this.Zq = paramZzen;
  }
  
  Socket Zf(Zmzk paramZmzk) {
    Zqr zqr = Zqr.ZX(this.Zl, this.ZF, this.ZU, this.Zq, paramZmzk, this.Zw);
    Socket socket = null;
    try {
      socket = zqr.ZX();
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
      this.Zq.ZE().Zl(paramZmzk);
      this.Zw.Zh(iOException);
    } 
    try {
      if (socket == null) {
        this.Zs.ZM();
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zy.Zb() == Zg4n.ABORT) {
        this.Zs.Ze();
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return socket;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz0s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */