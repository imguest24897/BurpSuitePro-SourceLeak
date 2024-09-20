package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.TlsCredentials;
import org.bouncycastle.tls.crypto.TlsStreamSigner;

public interface TlsCredentialedSigner extends TlsCredentials {
  byte[] generateRawSignature(byte[] paramArrayOfbyte) throws IOException;
  
  SignatureAndHashAlgorithm getSignatureAndHashAlgorithm();
  
  TlsStreamSigner getStreamSigner() throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsCredentialedSigner.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */