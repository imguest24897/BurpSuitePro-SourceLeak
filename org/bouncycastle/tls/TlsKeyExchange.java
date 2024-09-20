package org.bouncycastle.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.tls.crypto.TlsSecret;

public interface TlsKeyExchange {
  void init(TlsContext paramTlsContext);
  
  void skipServerCredentials() throws IOException;
  
  void processServerCredentials(TlsCredentials paramTlsCredentials) throws IOException;
  
  void processServerCertificate(Certificate paramCertificate) throws IOException;
  
  boolean requiresServerKeyExchange();
  
  byte[] generateServerKeyExchange() throws IOException;
  
  void skipServerKeyExchange() throws IOException;
  
  void processServerKeyExchange(InputStream paramInputStream) throws IOException;
  
  short[] getClientCertificateTypes();
  
  void skipClientCredentials() throws IOException;
  
  void processClientCredentials(TlsCredentials paramTlsCredentials) throws IOException;
  
  void processClientCertificate(Certificate paramCertificate) throws IOException;
  
  void generateClientKeyExchange(OutputStream paramOutputStream) throws IOException;
  
  void processClientKeyExchange(InputStream paramInputStream) throws IOException;
  
  boolean requiresCertificateVerify();
  
  TlsSecret generatePreMasterSecret() throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsKeyExchange.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */