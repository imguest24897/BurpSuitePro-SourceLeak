package org.bouncycastle.tls.crypto;

import java.io.IOException;

public interface TlsAgreement {
  byte[] generateEphemeral() throws IOException;
  
  void receivePeerValue(byte[] paramArrayOfbyte) throws IOException;
  
  TlsSecret calculateSecret() throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\TlsAgreement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */