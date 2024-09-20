package org.bouncycastle.tls.crypto;

import java.io.IOException;
import java.io.OutputStream;

public interface TlsStreamVerifier {
  OutputStream getOutputStream() throws IOException;
  
  boolean isVerified() throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\TlsStreamVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */