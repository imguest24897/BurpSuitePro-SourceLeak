package burp;

import java.io.IOException;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zswn implements Runnable {
  private final Zx87 Zm;
  
  private final Zd3 Zc;
  
  private final Zsg9 ZJ;
  
  private boolean Zg;
  
  Zswn(Zx87 paramZx87, Zd3 paramZd3, Zsg9 paramZsg9) {
    this.Zm = paramZx87;
    this.Zc = paramZd3;
    this.ZJ = paramZsg9;
  }
  
  public void run() {
    try {
      while (true) {
        byte[] arrayOfByte = new byte[4096];
        int i = this.Zm.ZJ.read(arrayOfByte);
        try {
          if (i == -1)
            throw new IOException(); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        this.Zc.Za(arrayOfByte, i);
      } 
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
      this.Zm.ZU();
      this.Zg = true;
      this.ZJ.Zs();
      return;
    } 
  }
  
  public boolean ZR() {
    return this.Zg;
  }
  
  public void Ze() {
    this.Zm.ZU();
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zswn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */