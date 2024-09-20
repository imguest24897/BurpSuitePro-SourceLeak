package org.bouncycastle.tls.crypto.impl;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.tls.DigitallySigned;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.SignatureScheme;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.Tls13Verifier;
import org.bouncycastle.tls.crypto.TlsStreamVerifier;
import org.bouncycastle.tls.crypto.TlsVerifier;

public final class LegacyTls13Verifier implements TlsVerifier {
  private final int signatureScheme;
  
  private final Tls13Verifier tls13Verifier;
  
  public LegacyTls13Verifier(int paramInt, Tls13Verifier paramTls13Verifier) {
    if (!TlsUtils.isValidUint16(paramInt))
      throw new IllegalArgumentException("'signatureScheme'"); 
    if (paramTls13Verifier == null)
      throw new NullPointerException("'tls13Verifier' cannot be null"); 
    this.signatureScheme = paramInt;
    this.tls13Verifier = paramTls13Verifier;
  }
  
  public TlsStreamVerifier getStreamVerifier(DigitallySigned paramDigitallySigned) throws IOException {
    SignatureAndHashAlgorithm signatureAndHashAlgorithm = paramDigitallySigned.getAlgorithm();
    if (signatureAndHashAlgorithm == null || SignatureScheme.from(signatureAndHashAlgorithm) != this.signatureScheme)
      throw new IllegalStateException("Invalid algorithm: " + signatureAndHashAlgorithm); 
    final byte[] signature = paramDigitallySigned.getSignature();
    return new TlsStreamVerifier() {
        public OutputStream getOutputStream() throws IOException {
          return LegacyTls13Verifier.this.tls13Verifier.getOutputStream();
        }
        
        public boolean isVerified() throws IOException {
          return LegacyTls13Verifier.this.tls13Verifier.verifySignature(signature);
        }
      };
  }
  
  public boolean verifyRawSignature(DigitallySigned paramDigitallySigned, byte[] paramArrayOfbyte) throws IOException {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\LegacyTls13Verifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */