package burp;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicReference;

class Zmjn extends OutputStream {
  private final AtomicReference<OutputStream> ZS;
  
  private Zmjn(OutputStream paramOutputStream) {
    this.ZS = new AtomicReference<>(paramOutputStream);
  }
  
  private void Zu() {
    this.ZS.set(new Zscu());
  }
  
  public void write(int paramInt) throws IOException {
    ((OutputStream)this.ZS.get()).write(paramInt);
  }
  
  public void write(byte[] paramArrayOfbyte) throws IOException {
    ((OutputStream)this.ZS.get()).write(paramArrayOfbyte);
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    ((OutputStream)this.ZS.get()).write(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public void flush() throws IOException {
    ((OutputStream)this.ZS.get()).flush();
  }
  
  public void close() throws IOException {
    ((OutputStream)this.ZS.get()).close();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmjn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */