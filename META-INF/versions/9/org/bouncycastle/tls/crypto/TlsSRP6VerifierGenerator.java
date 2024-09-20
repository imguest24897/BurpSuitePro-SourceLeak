package META-INF.versions.9.org.bouncycastle.tls.crypto;

import java.math.BigInteger;

public interface TlsSRP6VerifierGenerator {
  BigInteger generateVerifier(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\TlsSRP6VerifierGenerator.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */