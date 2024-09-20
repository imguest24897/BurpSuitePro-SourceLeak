package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.TlsEncryptor;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;

final class JcaTlsRSAEncryptor implements TlsEncryptor {
  private final JcaTlsCrypto crypto;
  
  private final PublicKey pubKeyRSA;
  
  JcaTlsRSAEncryptor(JcaTlsCrypto paramJcaTlsCrypto, PublicKey paramPublicKey) {
    this.crypto = paramJcaTlsCrypto;
    this.pubKeyRSA = paramPublicKey;
  }
  
  public byte[] encrypt(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    try {
      Cipher cipher = this.crypto.createRSAEncryptionCipher();
      try {
        cipher.init(3, this.pubKeyRSA, this.crypto.getSecureRandom());
        return cipher.wrap(new SecretKeySpec(paramArrayOfbyte, paramInt1, paramInt2, "TLS"));
      } catch (Exception exception) {
        try {
          cipher.init(1, this.pubKeyRSA, this.crypto.getSecureRandom());
          return cipher.doFinal(paramArrayOfbyte, paramInt1, paramInt2);
        } catch (Exception exception1) {
          throw new TlsFatalAlert((short)80, exception);
        } 
      } 
    } catch (GeneralSecurityException generalSecurityException) {
      throw new TlsFatalAlert((short)80, generalSecurityException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsRSAEncryptor.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */