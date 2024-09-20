package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.tls.ByteQueue;

public class ByteQueueOutputStream extends OutputStream {
  private ByteQueue buffer = new ByteQueue();
  
  public ByteQueue getBuffer() {
    return this.buffer;
  }
  
  public void write(int paramInt) throws IOException {
    this.buffer.addData(new byte[] { (byte)paramInt }, 0, 1);
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    this.buffer.addData(paramArrayOfbyte, paramInt1, paramInt2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\ByteQueueOutputStream.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */