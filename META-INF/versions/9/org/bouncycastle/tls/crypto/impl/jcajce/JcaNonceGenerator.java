package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.prng.SP800SecureRandom;
import org.bouncycastle.crypto.prng.SP800SecureRandomBuilder;
import org.bouncycastle.tls.crypto.TlsNonceGenerator;

class JcaNonceGenerator implements TlsNonceGenerator {
  private final SP800SecureRandom random;
  
  JcaNonceGenerator(SecureRandom paramSecureRandom, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[32];
    paramSecureRandom.nextBytes(arrayOfByte);
    this.random = (new SP800SecureRandomBuilder(paramSecureRandom, false)).setPersonalizationString(paramArrayOfbyte).buildHash((Digest)new SHA512Digest(), arrayOfByte, false);
  }
  
  public byte[] generateNonce(int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    this.random.nextBytes(arrayOfByte);
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\JcaNonceGenerator.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */