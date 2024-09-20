package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import org.bouncycastle.tls.CertificateRequest;
import org.bouncycastle.tls.TlsCredentials;
import org.bouncycastle.tls.TlsServerCertificate;

public interface TlsAuthentication {
  void notifyServerCertificate(TlsServerCertificate paramTlsServerCertificate) throws IOException;
  
  TlsCredentials getClientCredentials(CertificateRequest paramCertificateRequest) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsAuthentication.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */