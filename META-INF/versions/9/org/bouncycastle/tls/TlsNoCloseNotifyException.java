package META-INF.versions.9.org.bouncycastle.tls;

import java.io.EOFException;

public class TlsNoCloseNotifyException extends EOFException {
  public TlsNoCloseNotifyException() {
    super("No close_notify alert received before connection closed");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsNoCloseNotifyException.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */