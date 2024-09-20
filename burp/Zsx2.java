package burp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zdo;
import net.portswigger.Zk_;
import net.portswigger.Zli;

class Zsx2 implements Runnable {
  private final Zb25 Zj;
  
  private final Zl3v Zm;
  
  private final Zx5k ZR;
  
  private final Zgzu Zs;
  
  private final ByteArrayOutputStream ZS;
  
  private final Zsb ZM;
  
  private final Zg9d Zb;
  
  private final Ze2n Zx;
  
  private Socket Zz;
  
  Zsx2(Zb25 paramZb25, Socket paramSocket, Zlhe paramZlhe, Zl3v paramZl3v, Zx5k paramZx5k, List<String> paramList, long paramLong) {
    this.Zj = paramZb25;
    this.Zz = paramSocket;
    String[] arrayOfString = Zgzu.Zk();
    this.Zm = paramZl3v;
    this.ZR = paramZx5k;
    this.Zx = new Ze2n(paramZlhe, paramZb25, Zkj4.Zy(paramSocket.getRemoteSocketAddress()), paramSocket.getPort());
    this.ZM = new Zsb(this.Zx, paramZb25, paramLong, Zkj4.Zy(paramSocket.getRemoteSocketAddress()), paramSocket.getPort());
    this.Zs = new Zgzu(this.ZM, paramList);
    this.ZS = new ByteArrayOutputStream();
    this.Zb = new Zg9d(this);
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public void run() {
    try {
      Zg();
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
    } finally {
      this.ZM.ZI();
      this.Zx.Zy();
      Zrxg.ZE(this.Zz);
      this.Zm.ZT();
    } 
  }
  
  private void Zg() throws IOException {
    Zc();
    byte[] arrayOfByte = new byte[1024];
    boolean bool = false;
    String[] arrayOfString = Zgzu.Zk();
    boolean bool1 = this.Zz instanceof javax.net.ssl.SSLSocket;
    while (!this.Zs.ZX()) {
      int i;
      try {
        if ((i = this.Zz.getInputStream().read(arrayOfByte)) != -1) {
          try {
            if (!bool1 && this.Zz instanceof javax.net.ssl.SSLSocket) {
              this.ZM.Zw();
              this.Zx.Zm();
              this.Zx.ZX();
              bool1 = true;
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
          try {
            if (i != 0 || arrayOfString != null) {
              int j = 0;
              try {
                if (bool && arrayOfByte[0] == 10) {
                  Zo(arrayOfByte, 0, 1);
                  j = 1;
                } 
              } catch (IOException iOException) {
                throw a(null);
              } 
              int k;
              while ((k = ZI(arrayOfByte, i, j)) != -1) {
                int m = k + Zdo.Zn.length;
                Zo(arrayOfByte, j, m - j);
                j = m;
                if (arrayOfString != null)
                  break; 
              } 
              try {
                this.ZS.write(arrayOfByte, j, i - j);
              } catch (IOException iOException) {
                throw a(null);
              } 
              bool = (arrayOfByte[i - 1] == 13) ? true : false;
              if (arrayOfString != null)
                break; 
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    try {
      if (this.ZS.size() > 0)
        ZT(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private void Zc() throws IOException {
    this.Zz.getOutputStream().write(this.Zs.Zd());
  }
  
  private static int ZI(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return Zli.Zw(paramArrayOfbyte, Zdo.Zn, paramInt2, paramInt1);
  }
  
  private void Zo(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    this.ZS.write(paramArrayOfbyte, paramInt1, paramInt2);
    ZT();
    this.ZS.reset();
  }
  
  private void ZT() throws IOException {
    byte[] arrayOfByte = this.Zs.ZI(this.ZS.toByteArray(), this.Zb);
    try {
      if (arrayOfByte != null)
        this.Zz.getOutputStream().write(arrayOfByte); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsx2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */