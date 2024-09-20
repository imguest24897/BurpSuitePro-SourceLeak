package META-INF.versions.9.org.bouncycastle.tls.crypto;

import java.io.IOException;
import org.bouncycastle.tls.DigitallySigned;
import org.bouncycastle.tls.crypto.TlsStreamVerifier;

public interface TlsVerifier {
  TlsStreamVerifier getStreamVerifier(DigitallySigned paramDigitallySigned) throws IOException;
  
  boolean verifyRawSignature(DigitallySigned paramDigitallySigned, byte[] paramArrayOfbyte) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\TlsVerifier.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */