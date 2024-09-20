package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.TlsContext;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;

public final class DigitallySigned {
  private final SignatureAndHashAlgorithm algorithm;
  
  private final byte[] signature;
  
  public DigitallySigned(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm, byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'signature' cannot be null"); 
    this.algorithm = paramSignatureAndHashAlgorithm;
    this.signature = paramArrayOfbyte;
  }
  
  public SignatureAndHashAlgorithm getAlgorithm() {
    return this.algorithm;
  }
  
  public byte[] getSignature() {
    return this.signature;
  }
  
  public void encode(OutputStream paramOutputStream) throws IOException {
    if (this.algorithm != null)
      this.algorithm.encode(paramOutputStream); 
    TlsUtils.writeOpaque16(this.signature, paramOutputStream);
  }
  
  public static org.bouncycastle.tls.DigitallySigned parse(TlsContext paramTlsContext, InputStream paramInputStream) throws IOException {
    SignatureAndHashAlgorithm signatureAndHashAlgorithm = null;
    if (TlsUtils.isTLSv12(paramTlsContext)) {
      signatureAndHashAlgorithm = SignatureAndHashAlgorithm.parse(paramInputStream);
      if (0 == signatureAndHashAlgorithm.getSignature())
        throw new TlsFatalAlert((short)47); 
    } 
    byte[] arrayOfByte = TlsUtils.readOpaque16(paramInputStream);
    return new org.bouncycastle.tls.DigitallySigned(signatureAndHashAlgorithm, arrayOfByte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\DigitallySigned.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */