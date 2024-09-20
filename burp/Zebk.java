package burp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zebk implements Runnable {
  private final Socket Zu;
  
  private final Socket ZX;
  
  private final InputStream ZK;
  
  private final Zbnt Zy;
  
  private final Zg0u Zm;
  
  private final Zmwv Zp;
  
  Zebk(Socket paramSocket1, Socket paramSocket2, InputStream paramInputStream, Zg0u paramZg0u, Zmwv paramZmwv, Zbnt paramZbnt) {
    this.Zu = paramSocket1;
    this.ZX = paramSocket2;
    this.Zy = paramZbnt;
    this.ZK = paramInputStream;
    this.Zm = paramZg0u;
    this.Zp = paramZmwv;
  }
  
  public void run() {
    String[] arrayOfString = Zz2j.ZJ();
    Zs68 zs68 = null;
    try {
      OutputStream outputStream = this.Zu.getOutputStream();
      byte[] arrayOfByte = new byte[4096];
      while (true) {
        int i = this.ZK.read(arrayOfByte);
        try {
          if (i == -1)
            throw new IOException(); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
          outputStream.write(arrayOfByte, 0, i);
          outputStream.flush();
          if (this.Zp != null) {
            this.Zp.ZG(arrayOfByte, i);
            if (zs68 == null) {
              Zstu zstu = this.Zp.ZX7();
              int j = Zgyj.Zi(zstu);
              if (j > 0) {
                zs68 = Zbwc.Zt((Zlit)null, zstu, Zt0k.NO_HTML_ANALYSIS, this.Zy);
                this.Zm.Zu(this.Zp, zs68, null);
              } 
              try {
                if (arrayOfString == null)
                  continue; 
              } catch (IOException iOException) {
                throw a(null);
              } 
              continue;
            } 
            continue;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        continue;
        this.Zm.Zd(this.Zp, SYNTHETIC_LOCAL_VARIABLE_5);
      } 
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
      Zsdz.ZW(this.ZX);
      Zsdz.ZW(this.Zu);
      return;
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zebk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */