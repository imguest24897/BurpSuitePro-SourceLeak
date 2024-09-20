package burp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zxtp extends ByteArrayOutputStream {
  private final Zskh ZJ;
  
  Zxtp(int paramInt, Zskh paramZskh) {
    super(paramInt);
    Zuh.Zb((paramZskh != null), Zqf.Zv);
    this.ZJ = paramZskh;
  }
  
  public synchronized void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    try {
      super.write(paramArrayOfbyte, paramInt1, paramInt2);
    } catch (OutOfMemoryError outOfMemoryError) {
      Zah.Zl(outOfMemoryError, Zk_.COMMON_RUNTIME_FAILURE);
      Ztyh.ZR(this.ZJ);
      super.write(paramArrayOfbyte, paramInt1, paramInt2);
    } 
  }
  
  public void write(byte[] paramArrayOfbyte) throws IOException {
    write(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public synchronized byte[] toByteArray() {
    try {
      return super.toByteArray();
    } catch (OutOfMemoryError outOfMemoryError) {
      Zah.Zl(outOfMemoryError, Zk_.COMMON_RUNTIME_FAILURE);
      Ztyh.ZR(this.ZJ);
      return super.toByteArray();
    } 
  }
  
  public void ZU(int paramInt) {
    if (paramInt - this.buf.length > 0)
      Zr(paramInt); 
  }
  
  private void Zr(int paramInt) {
    int i = this.buf.length;
    int j = i << 1;
    if (j - paramInt < 0)
      j = paramInt; 
    if (j < 0) {
      if (paramInt < 0)
        throw new OutOfMemoryError(); 
      j = Integer.MAX_VALUE;
    } 
    this.buf = Arrays.copyOf(this.buf, j);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxtp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */