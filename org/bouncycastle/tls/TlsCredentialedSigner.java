package org.bouncycastle.tls;

import java.io.IOException;
import org.bouncycastle.tls.crypto.TlsStreamSigner;

public interface TlsCredentialedSigner extends TlsCredentials {
  byte[] generateRawSignature(byte[] paramArrayOfbyte) throws IOException;
  
  SignatureAndHashAlgorithm getSignatureAndHashAlgorithm();
  
  TlsStreamSigner getStreamSigner() throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsCredentialedSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */