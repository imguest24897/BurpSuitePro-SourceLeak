package burp;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zma4 extends OutputStream {
  private final Zli3 Zs;
  
  private Zma4(Zli3 paramZli3) {
    this.Zs = paramZli3;
  }
  
  public void write(int paramInt) throws IOException {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void write(byte[] paramArrayOfbyte) {
    this.Zs.Zw(paramArrayOfbyte);
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.Zs.Zw(Arrays.copyOfRange(paramArrayOfbyte, paramInt1, paramInt2));
  }
  
  public void flush() {}
  
  public void close() {
    this.Zs.Zw();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zma4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */