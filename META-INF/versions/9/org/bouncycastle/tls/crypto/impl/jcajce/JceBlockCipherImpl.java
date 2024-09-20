package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.tls.crypto.impl.TlsBlockCipherImpl;
import org.bouncycastle.tls.crypto.impl.jcajce.Exceptions;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;

public class JceBlockCipherImpl implements TlsBlockCipherImpl {
  private static final int BUF_SIZE = 32768;
  
  private final JcaTlsCrypto crypto;
  
  private final Cipher cipher;
  
  private final String algorithm;
  
  private final int keySize;
  
  private final int cipherMode;
  
  private SecretKey key;
  
  public JceBlockCipherImpl(JcaTlsCrypto paramJcaTlsCrypto, Cipher paramCipher, String paramString, int paramInt, boolean paramBoolean) throws GeneralSecurityException {
    this.crypto = paramJcaTlsCrypto;
    this.cipher = paramCipher;
    this.algorithm = paramString;
    this.keySize = paramInt;
    this.cipherMode = paramBoolean ? 1 : 2;
  }
  
  public void setKey(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.keySize != paramInt2)
      throw new IllegalStateException(); 
    this.key = new SecretKeySpec(paramArrayOfbyte, paramInt1, paramInt2, this.algorithm);
  }
  
  public void init(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    SecureRandom secureRandom = this.crypto.getSecureRandom();
    try {
      this.cipher.init(this.cipherMode, this.key, new IvParameterSpec(paramArrayOfbyte, paramInt1, paramInt2), secureRandom);
    } catch (GeneralSecurityException generalSecurityException) {
      throw Exceptions.illegalStateException(generalSecurityException.getMessage(), generalSecurityException);
    } 
  }
  
  public int doFinal(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) {
    try {
      int i = 0;
      while (paramInt2 > 32768) {
        i += this.cipher.update(paramArrayOfbyte1, paramInt1, 32768, paramArrayOfbyte2, paramInt3 + i);
        paramInt1 += 32768;
        paramInt2 -= 32768;
      } 
      i += this.cipher.update(paramArrayOfbyte1, paramInt1, paramInt2, paramArrayOfbyte2, paramInt3 + i);
      i += this.cipher.doFinal(paramArrayOfbyte2, paramInt3 + i);
      return i;
    } catch (GeneralSecurityException generalSecurityException) {
      throw Exceptions.illegalStateException(generalSecurityException.getMessage(), generalSecurityException);
    } 
  }
  
  public int getBlockSize() {
    return this.cipher.getBlockSize();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\JceBlockCipherImpl.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */