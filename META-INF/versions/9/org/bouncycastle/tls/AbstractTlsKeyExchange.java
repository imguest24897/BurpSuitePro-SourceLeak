package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.TlsContext;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsKeyExchange;

public abstract class AbstractTlsKeyExchange implements TlsKeyExchange {
  protected int keyExchange;
  
  protected TlsContext context;
  
  protected AbstractTlsKeyExchange(int paramInt) {
    this.keyExchange = paramInt;
  }
  
  public void init(TlsContext paramTlsContext) {
    this.context = paramTlsContext;
  }
  
  public void processServerCertificate(Certificate paramCertificate) throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public boolean requiresServerKeyExchange() {
    return false;
  }
  
  public byte[] generateServerKeyExchange() throws IOException {
    if (requiresServerKeyExchange())
      throw new TlsFatalAlert((short)80); 
    return null;
  }
  
  public void skipServerKeyExchange() throws IOException {
    if (requiresServerKeyExchange())
      throw new TlsFatalAlert((short)10); 
  }
  
  public void processServerKeyExchange(InputStream paramInputStream) throws IOException {
    if (!requiresServerKeyExchange())
      throw new TlsFatalAlert((short)10); 
  }
  
  public short[] getClientCertificateTypes() {
    return null;
  }
  
  public void skipClientCredentials() throws IOException {}
  
  public void processClientCertificate(Certificate paramCertificate) throws IOException {}
  
  public void processClientKeyExchange(InputStream paramInputStream) throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public boolean requiresCertificateVerify() {
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\AbstractTlsKeyExchange.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */