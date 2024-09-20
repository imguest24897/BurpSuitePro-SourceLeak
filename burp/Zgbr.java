package burp;

import java.io.IOException;
import java.net.Socket;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;

public class Zgbr {
  private final Zskh Zm;
  
  private final Zrgd ZG;
  
  public Zgbr(Zskh paramZskh, Zrgd paramZrgd) {
    this.Zm = paramZskh;
    this.ZG = paramZrgd;
  }
  
  Zlam Zr(Socket paramSocket, boolean paramBoolean) throws IOException {
    Zsxe zsxe = new Zsxe(this.Zm);
    Zlob zlob = new Zlob(paramSocket, zsxe, this.ZG);
    try {
      if (paramBoolean)
        Zm2.ZC(Zrrh.PROXY_OPTIONS_MISC_UNZIP_REQUESTS); 
    } catch (Zgsv zgsv) {
      throw a(null);
    } 
    zlob.ZO(paramBoolean);
    try {
      zlob.Zp();
    } catch (Zgsv zgsv) {
      Zah.Zl(zgsv, Zk_.IGNORED);
    } 
    return new Zlam(zlob.ZR(), zlob.Za().ZiD());
  }
  
  private static Zgsv a(Zgsv paramZgsv) {
    return paramZgsv;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgbr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */