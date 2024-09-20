package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.tls.HeartbeatMode;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;

public class HeartbeatExtension {
  protected short mode;
  
  public HeartbeatExtension(short paramShort) {
    if (!HeartbeatMode.isValid(paramShort))
      throw new IllegalArgumentException("'mode' is not a valid HeartbeatMode value"); 
    this.mode = paramShort;
  }
  
  public short getMode() {
    return this.mode;
  }
  
  public void encode(OutputStream paramOutputStream) throws IOException {
    TlsUtils.writeUint8(this.mode, paramOutputStream);
  }
  
  public static org.bouncycastle.tls.HeartbeatExtension parse(InputStream paramInputStream) throws IOException {
    short s = TlsUtils.readUint8(paramInputStream);
    if (!HeartbeatMode.isValid(s))
      throw new TlsFatalAlert((short)47); 
    return new org.bouncycastle.tls.HeartbeatExtension(s);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\HeartbeatExtension.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */