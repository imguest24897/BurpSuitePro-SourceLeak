package org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.impl.TlsBlockCipherImpl;

public class JceBlockCipherWithCBCImplicitIVImpl implements TlsBlockCipherImpl {
  private static final int BUF_SIZE = 32768;
  
  private final JcaTlsCrypto crypto;
  
  private final Cipher cipher;
  
  private final String algorithm;
  
  private final int cipherMode;
  
  private SecretKey key;
  
  private byte[] nextIV;
  
  public JceBlockCipherWithCBCImplicitIVImpl(JcaTlsCrypto paramJcaTlsCrypto, Cipher paramCipher, String paramString, boolean paramBoolean) throws GeneralSecurityException {
    this.crypto = paramJcaTlsCrypto;
    this.cipher = paramCipher;
    this.algorithm = paramString;
    this.cipherMode = paramBoolean ? 1 : 2;
  }
  
  public void setKey(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.key = new SecretKeySpec(paramArrayOfbyte, paramInt1, paramInt2, this.algorithm);
  }
  
  public void init(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.nextIV != null)
      throw new IllegalStateException("unexpected reinitialization of an implicit-IV cipher"); 
    this.nextIV = TlsUtils.copyOfRangeExact(paramArrayOfbyte, paramInt1, paramInt1 + paramInt2);
  }
  
  public int doFinal(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) {
    SecureRandom secureRandom = this.crypto.getSecureRandom();
    try {
      this.cipher.init(this.cipherMode, this.key, new IvParameterSpec(this.nextIV), secureRandom);
      this.nextIV = null;
      if (1 != this.cipherMode)
        this.nextIV = TlsUtils.copyOfRangeExact(paramArrayOfbyte1, paramInt1 + paramInt2 - this.cipher.getBlockSize(), paramInt1 + paramInt2); 
      int i = 0;
      while (paramInt2 > 32768) {
        i += this.cipher.update(paramArrayOfbyte1, paramInt1, 32768, paramArrayOfbyte2, paramInt3 + i);
        paramInt1 += 32768;
        paramInt2 -= 32768;
      } 
      i += this.cipher.update(paramArrayOfbyte1, paramInt1, paramInt2, paramArrayOfbyte2, paramInt3 + i);
      i += this.cipher.doFinal(paramArrayOfbyte2, paramInt3 + i);
      if (1 == this.cipherMode)
        this.nextIV = TlsUtils.copyOfRangeExact(paramArrayOfbyte2, paramInt3 + i - this.cipher.getBlockSize(), paramInt3 + i); 
      return i;
    } catch (GeneralSecurityException generalSecurityException) {
      throw Exceptions.illegalStateException(generalSecurityException.getMessage(), generalSecurityException);
    } 
  }
  
  public int getBlockSize() {
    return this.cipher.getBlockSize();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JceBlockCipherWithCBCImplicitIVImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */