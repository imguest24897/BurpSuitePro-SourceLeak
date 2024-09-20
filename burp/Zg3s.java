package burp;

import java.io.IOException;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zsy;

public class Zg3s {
  private final Ztwv ZC;
  
  private final Zbnt Z_;
  
  private final Zl11 ZJ;
  
  private final Zzen Zx;
  
  private final Zts5 Ze;
  
  private final Zey9 ZV;
  
  private final Ze2b ZZ;
  
  public Zg3s(Ztwv paramZtwv, Zbnt paramZbnt, Zl11 paramZl11, Zsy paramZsy, Zskh paramZskh, Zgb6 paramZgb6, Zey9 paramZey9) {
    this.ZC = paramZtwv;
    this.Z_ = paramZbnt;
    this.ZJ = paramZl11;
    this.ZV = paramZey9;
    this.Zx = new Zlbx(paramZskh);
    this.Ze = Zs38.ZG(paramZgb6).ZM().Zy();
    this.ZZ = new Ze2b(paramZsy);
  }
  
  public Zma9 Zd(Zk75 paramZk75) {
    try {
      if (!paramZk75.Zh())
        return new Zma9(paramZk75.Zc); 
    } catch (Zxgy zxgy) {
      throw a(null);
    } 
    try {
      return Zh(paramZk75);
    } catch (Zxgy zxgy) {
      Zah.Zl(zxgy, Zk_.IGNORED);
      return new Zma9(Zr42.BAD_HOST);
    } catch (Zxg5 zxg5) {
      Zah.Zl(zxg5, Zk_.IGNORED);
      return new Zma9(Zr42.BAD_PORT);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
      return new Zma9(Zr42.CONNECTION_FAILED);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return new Zma9(Zr42.CONNECTION_FAILED);
    } 
  }
  
  private Zma9 Zh(Zk75 paramZk75) throws Exception {
    Zmzk zmzk = this.Z_.ZY(paramZk75.Zi, paramZk75.ZU, paramZk75.Zo);
    Zefx zefx = this.ZV.ZY(zmzk, paramZk75.ZI);
    Zxfx zxfx = new Zxfx(this.ZC, this.ZZ, zefx.ZF());
    Zg3d zg3d = this.ZJ.ZE(zefx, this.Ze, zxfx, this.Zx).ZG();
    if (zg3d.Zb() != Zvom.RESPONSE_RECEIVED) {
      Zr42 zr42 = Zr42.CONNECTION_FAILED;
      if (zg3d.Zx() instanceof java.net.UnknownHostException)
        zr42 = Zr42.UNKNOWN_HOST; 
      if (zg3d.Zb() == Zvom.STREAMING_RESPONSE)
        zr42 = Zr42.STREAMING_RESPONSE; 
      return new Zma9(zr42);
    } 
    return zxfx.ZU(zg3d.Ze());
  }
  
  private static Zxgy a(Zxgy paramZxgy) {
    return paramZxgy;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg3s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */