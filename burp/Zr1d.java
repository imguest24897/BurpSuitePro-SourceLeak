package burp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zr1d extends OutputStream implements Runnable {
  private final Zgll Zo;
  
  private final OutputStream Zs;
  
  private final OutputStream Zr;
  
  private final byte[] ZJ = new byte[10000];
  
  private InputStream Za;
  
  Zr1d(OutputStream paramOutputStream, Ztwv paramZtwv) {
    this.Zr = paramOutputStream;
    this.Zo = new Zgll(10000);
    this.Zs = this.Zo.ZE();
    paramZtwv.Zx(this);
  }
  
  public void close() throws IOException {
    this.Zs.close();
  }
  
  public void flush() throws IOException {
    this.Zs.flush();
    this.Zr.flush();
  }
  
  public void write(byte[] paramArrayOfbyte) throws IOException {
    this.Zs.write(paramArrayOfbyte);
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    this.Zs.write(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public void write(int paramInt) throws IOException {
    this.Zs.write(paramInt);
  }
  
  public void run() {
    int i = Zloq.ZW();
    try {
      this.Za = new GZIPInputStream(this.Zo.Zb());
      do {
        int j = this.Za.read(this.ZJ);
        if (j <= 0)
          break; 
        this.Zr.write(this.ZJ, 0, j);
      } while (i == 0);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
    } 
    try {
      close();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
    } 
    try {
      this.Zr.close();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
    } 
    try {
      this.Zo.Zb().close();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
    } 
    try {
      this.Za.close();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr1d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */