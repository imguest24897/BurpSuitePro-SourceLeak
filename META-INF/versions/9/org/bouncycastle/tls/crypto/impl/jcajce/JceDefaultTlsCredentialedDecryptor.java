package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import org.bouncycastle.jcajce.spec.TLSRSAPremasterSecretParameterSpec;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.TlsCredentialedDecryptor;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;
import org.bouncycastle.util.Arrays;

public class JceDefaultTlsCredentialedDecryptor implements TlsCredentialedDecryptor {
  protected JcaTlsCrypto crypto;
  
  protected Certificate certificate;
  
  protected PrivateKey privateKey;
  
  public JceDefaultTlsCredentialedDecryptor(JcaTlsCrypto paramJcaTlsCrypto, Certificate paramCertificate, PrivateKey paramPrivateKey) {
    if (paramJcaTlsCrypto == null)
      throw new IllegalArgumentException("'crypto' cannot be null"); 
    if (paramCertificate == null)
      throw new IllegalArgumentException("'certificate' cannot be null"); 
    if (paramCertificate.isEmpty())
      throw new IllegalArgumentException("'certificate' cannot be empty"); 
    if (paramPrivateKey == null)
      throw new IllegalArgumentException("'privateKey' cannot be null"); 
    if (paramPrivateKey instanceof java.security.interfaces.RSAPrivateKey || "RSA".equals(paramPrivateKey.getAlgorithm())) {
      this.crypto = paramJcaTlsCrypto;
      this.certificate = paramCertificate;
      this.privateKey = paramPrivateKey;
    } else {
      throw new IllegalArgumentException("'privateKey' type not supported: " + paramPrivateKey.getClass().getName());
    } 
  }
  
  public Certificate getCertificate() {
    return this.certificate;
  }
  
  public TlsSecret decrypt(TlsCryptoParameters paramTlsCryptoParameters, byte[] paramArrayOfbyte) throws IOException {
    return safeDecryptPreMasterSecret(paramTlsCryptoParameters, this.privateKey, paramArrayOfbyte);
  }
  
  protected TlsSecret safeDecryptPreMasterSecret(TlsCryptoParameters paramTlsCryptoParameters, PrivateKey paramPrivateKey, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte;
    SecureRandom secureRandom = this.crypto.getSecureRandom();
    ProtocolVersion protocolVersion = paramTlsCryptoParameters.getRSAPreMasterSecretVersion();
    try {
      Cipher cipher = this.crypto.createRSAEncryptionCipher();
      cipher.init(2, paramPrivateKey, (AlgorithmParameterSpec)new TLSRSAPremasterSecretParameterSpec(protocolVersion.getFullVersion()), secureRandom);
      arrayOfByte = cipher.doFinal(paramArrayOfbyte);
    } catch (Exception exception) {
      byte[] arrayOfByte1 = new byte[48];
      secureRandom.nextBytes(arrayOfByte1);
      arrayOfByte = Arrays.clone(arrayOfByte1);
      try {
        Cipher cipher = this.crypto.createRSAEncryptionCipher();
        cipher.init(2, paramPrivateKey, secureRandom);
        byte[] arrayOfByte2 = cipher.doFinal(paramArrayOfbyte);
        if (arrayOfByte2 != null && arrayOfByte2.length == 48)
          arrayOfByte = arrayOfByte2; 
      } catch (Exception exception1) {}
      int i = protocolVersion.getMajorVersion() ^ arrayOfByte[0] & 0xFF | protocolVersion.getMinorVersion() ^ arrayOfByte[1] & 0xFF;
      i = i - 1 >> 31;
      for (byte b = 0; b < 48; b++)
        arrayOfByte[b] = (byte)(arrayOfByte[b] & i | arrayOfByte1[b] & (i ^ 0xFFFFFFFF)); 
    } 
    return this.crypto.createSecret(arrayOfByte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\JceDefaultTlsCredentialedDecryptor.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */