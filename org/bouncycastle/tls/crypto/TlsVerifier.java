package org.bouncycastle.tls.crypto;

import java.io.IOException;
import org.bouncycastle.tls.DigitallySigned;

public interface TlsVerifier {
  TlsStreamVerifier getStreamVerifier(DigitallySigned paramDigitallySigned) throws IOException;
  
  boolean verifyRawSignature(DigitallySigned paramDigitallySigned, byte[] paramArrayOfbyte) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\TlsVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */