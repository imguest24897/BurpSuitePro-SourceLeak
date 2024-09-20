package burp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public abstract class Zz57 implements Zkbo {
  private final Socket Zc;
  
  private final Zrps Zi;
  
  private final Zsxe Zl;
  
  private final Zrgd Zr;
  
  private final boolean Zf;
  
  private Zz57(Socket paramSocket, Zrps paramZrps, Zsxe paramZsxe, Zrgd paramZrgd, boolean paramBoolean) {
    this.Zc = paramSocket;
    this.Zi = paramZrps;
    this.Zl = paramZsxe;
    this.Zr = paramZrgd;
    this.Zf = paramBoolean;
  }
  
  public Zm7u ZJ(Zefx paramZefx) throws IOException {
    OutputStream outputStream = this.Zc.getOutputStream();
    outputStream.write(paramZefx.Zb().ZD());
    outputStream.flush();
    Zlov zlov = new Zlov(this.Zc, this.Zi.Zb(), this.Zi.ZG(), this.Zf, this.Zl, this.Zr);
    try {
      zlov.Zm(Zxfj.ZI);
    } catch (Zgsm zgsm) {
      Zah.Zl(zgsm, Zk_.COMMON_RUNTIME_FAILURE);
    } 
    return zlov;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz57.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */