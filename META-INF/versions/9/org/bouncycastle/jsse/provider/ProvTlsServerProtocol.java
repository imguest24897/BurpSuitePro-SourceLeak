package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.tls.TlsServerProtocol;

class ProvTlsServerProtocol extends TlsServerProtocol {
  private final Closeable closeable;
  
  ProvTlsServerProtocol(InputStream paramInputStream, OutputStream paramOutputStream, Closeable paramCloseable) {
    super(paramInputStream, paramOutputStream);
    this.closeable = paramCloseable;
  }
  
  protected void closeConnection() throws IOException {
    this.closeable.close();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvTlsServerProtocol.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */