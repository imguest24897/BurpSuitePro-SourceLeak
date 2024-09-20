package burp;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zlzn extends OutputStream {
  private final Zsnl Zk;
  
  Zlzn(Zsnl paramZsnl) {
    this.Zk = paramZsnl;
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    Objects.checkFromIndexSize(paramInt1, paramInt2, paramArrayOfbyte.length);
    int i = paramInt1;
    Zbqc[] arrayOfZbqc = Zsnl.ZS();
    while (i < paramInt1 + paramInt2) {
      Zf(paramArrayOfbyte[i]);
      i++;
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  public void write(int paramInt) throws IOException {
    Zf((byte)(paramInt & 0xFF));
  }
  
  public void close() throws IOException {
    this.Zk.Zd();
  }
  
  private void Zf(byte paramByte) {
    Zbqc[] arrayOfZbqc = Zsnl.ZS();
    boolean bool = this.Zk.Zi(paramByte);
    while (!bool) {
      try {
        Thread.sleep(50L);
      } catch (InterruptedException interruptedException) {
        Zah.Zl(interruptedException, Zk_.COMMON_RUNTIME_FAILURE);
      } 
      bool = this.Zk.Zi(paramByte);
      if (arrayOfZbqc != null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlzn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */