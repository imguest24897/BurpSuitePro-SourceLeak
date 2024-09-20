package burp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zsy;

public class Zzzf implements Zrk9 {
  private final Zsz6 ZD;
  
  private final Zxxr Zy;
  
  private final Zmzk Zm;
  
  private final Zkjm ZB;
  
  private final Zey9 ZE;
  
  private final Zsxe Ze;
  
  private final Zrgd Zi;
  
  private final Zsy Zf;
  
  private final Zmu_ ZG;
  
  private final Zmzk ZY;
  
  private final Zr5i Zh;
  
  public Zzzf(String paramString, int paramInt, Zxxr paramZxxr, Zmzk paramZmzk1, Zkjm paramZkjm, Zey9 paramZey9, Zsxe paramZsxe, Zrgd paramZrgd, Zsy paramZsy, Zmu_ paramZmu_, Zxk1 paramZxk1, Zmzk paramZmzk2, Zsfe paramZsfe) {
    this.Zy = paramZxxr;
    this.Zm = paramZmzk1;
    this.ZB = paramZkjm;
    this.ZE = paramZey9;
    boolean bool = Zre9.ZY();
    this.Ze = paramZsxe;
    this.Zi = paramZrgd;
    this.Zf = paramZsy;
    this.ZG = paramZmu_;
    this.ZY = paramZmzk2;
    this.Zh = new Zr5i(paramZxk1, paramZmzk1, paramZmzk2, paramZsfe);
    this.ZD = new Zv8f(paramString, paramInt, paramZkjm);
    if (Zbqc.Zwu() == null)
      Zre9.ZJ(!bool); 
  }
  
  public SSLSocket Zt(Zbzu paramZbzu, Zrps paramZrps) throws IOException, Zxt3, Zr9q, Zry8 {
    byte[] arrayOfByte = this.ZD.Zn();
    Zefx zefx = this.ZE.ZY(this.Zm, arrayOfByte);
    Socket socket = this.Zy.ZK(this.Zm, paramZrps);
    try {
      if (this.ZB != null && this.ZB.Zx())
        try {
          try {
          
          } catch (Zryj zryj) {
            throw a(null);
          } 
          Ztqv ztqv = (Ztqv)((this.ZB.Zn() == 3) ? new Ztqe(this.ZB) : new Ztqc(this.Zi, this.Zf, this.ZB));
          zefx = ztqv.ZF(new Zz5m(socket, paramZrps, this.Ze, this.Zi), zefx);
        } catch (Zryj zryj) {
          try {
            Zah.Zl(zryj, Zk_.COMMON_RUNTIME_FAILURE);
            this.ZG.ZI(Zt21.PROXY, this.ZY, this.ZB.Zn());
            switch (this.ZB.Zn()) {
              case 2:
              case 3:
                return this.Zh.ZL(paramZbzu, zryj.Ze, socket);
            } 
          } catch (Zryj zryj1) {
            throw a(null);
          } 
        }  
    } catch (Zryj zryj) {
      throw a(null);
    } 
    OutputStream outputStream = socket.getOutputStream();
    outputStream.write(zefx.Zb().ZD());
    Zlo7 zlo7 = new Zlo7(socket, this.Ze, this.Zi);
    try {
      zlo7.Zm(Zxfj.ZI);
    } catch (Zgsm zgsm) {
      Zah.Zl(zgsm, Zk_.COMMON_RUNTIME_FAILURE);
      throw new Zr9q(this.Zm);
    } 
    return this.Zh.ZL(paramZbzu, zlo7, socket);
  }
  
  private static Zryj a(Zryj paramZryj) {
    return paramZryj;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzzf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */