package org.bouncycastle.tls;

import java.io.IOException;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsSecret;

public interface TlsCredentialedDecryptor extends TlsCredentials {
  TlsSecret decrypt(TlsCryptoParameters paramTlsCryptoParameters, byte[] paramArrayOfbyte) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsCredentialedDecryptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */