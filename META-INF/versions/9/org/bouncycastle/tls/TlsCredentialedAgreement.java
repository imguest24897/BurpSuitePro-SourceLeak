package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import org.bouncycastle.tls.TlsCredentials;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsSecret;

public interface TlsCredentialedAgreement extends TlsCredentials {
  TlsSecret generateAgreement(TlsCertificate paramTlsCertificate) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsCredentialedAgreement.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */