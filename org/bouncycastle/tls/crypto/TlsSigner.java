package org.bouncycastle.tls.crypto;

import java.io.IOException;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;

public interface TlsSigner {
  byte[] generateRawSignature(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm, byte[] paramArrayOfbyte) throws IOException;
  
  TlsStreamSigner getStreamSigner(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\TlsSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */