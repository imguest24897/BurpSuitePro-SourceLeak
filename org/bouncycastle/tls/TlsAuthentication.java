package org.bouncycastle.tls;

import java.io.IOException;

public interface TlsAuthentication {
  void notifyServerCertificate(TlsServerCertificate paramTlsServerCertificate) throws IOException;
  
  TlsCredentials getClientCredentials(CertificateRequest paramCertificateRequest) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsAuthentication.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */