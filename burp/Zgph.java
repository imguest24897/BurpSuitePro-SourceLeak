package burp;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public abstract class Zgph implements Zkbo {
  final Zln Zz;
  
  final Zkm Zu;
  
  final Zrps ZN;
  
  final Zst5 ZO;
  
  final Zsil Zw;
  
  final Zzen Zf;
  
  final Zlhd Zd;
  
  final Zefx ZW;
  
  final Zto5 ZS;
  
  final AtomicBoolean Zy;
  
  Zgph(Zln paramZln, Zkm paramZkm, Zrps paramZrps, Zst5 paramZst5, Zsil paramZsil, Zzen paramZzen, Zlhd paramZlhd, Zto5 paramZto5, Zefx paramZefx) {
    this.Zz = paramZln;
    this.Zu = paramZkm;
    this.ZN = paramZrps;
    this.ZO = paramZst5;
    this.Zw = paramZsil;
    this.Zf = paramZzen;
    this.Zd = paramZlhd;
    this.ZS = paramZto5;
    this.ZW = paramZefx;
    this.Zy = new AtomicBoolean();
  }
  
  abstract void ZA(Zefx paramZefx) throws IOException;
  
  abstract boolean Zm(Zefx paramZefx) throws IOException;
  
  abstract Zm7u Zb(int paramInt, Zefx paramZefx, Zlhj paramZlhj) throws IOException;
  
  abstract Zg4n ZR(Zm7u paramZm7u, Zefx paramZefx, Zsil paramZsil) throws IOException, Zgsm;
  
  abstract void Zl(Zefx paramZefx, Zm7u paramZm7u) throws IOException;
  
  abstract void ZW();
  
  Zefx Zn(Zefx paramZefx) throws IOException, Zryo, Zxt3, Zryj {
    Zefx zefx = Zq(paramZefx);
    try {
      ZA(zefx);
      this.Zf.ZT(zefx);
      return zefx;
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.RETHROWN);
      this.ZS.ZS(zefx, iOException);
      throw iOException;
    } 
  }
  
  private Zefx Zq(Zefx paramZefx) throws Zryo, Zxt3, Zryj, IOException {
    try {
      return this.Zu.Z_(this, paramZefx);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.RETHROWN);
      this.ZS.ZF(iOException);
      throw iOException;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgph.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */