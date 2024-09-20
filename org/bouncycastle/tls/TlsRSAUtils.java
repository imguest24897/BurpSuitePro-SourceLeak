package org.bouncycastle.tls;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsEncryptor;
import org.bouncycastle.tls.crypto.TlsSecret;

public abstract class TlsRSAUtils {
  public static TlsSecret generateEncryptedPreMasterSecret(TlsContext paramTlsContext, TlsCertificate paramTlsCertificate, OutputStream paramOutputStream) throws IOException {
    TlsEncryptor tlsEncryptor = paramTlsCertificate.createEncryptor(3);
    return TlsUtils.generateEncryptedPreMasterSecret(paramTlsContext, tlsEncryptor, paramOutputStream);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsRSAUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */