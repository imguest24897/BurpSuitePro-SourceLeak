package org.bouncycastle.tls;

public abstract class ServerOnlyTlsAuthentication implements TlsAuthentication {
  public final TlsCredentials getClientCredentials(CertificateRequest paramCertificateRequest) {
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\ServerOnlyTlsAuthentication.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */