package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.impl.TlsAEADCipherImpl;
import org.bouncycastle.util.Arrays;

final class BcTlsAEADCipherImpl implements TlsAEADCipherImpl {
  private final boolean isEncrypting;
  
  private final AEADBlockCipher cipher;
  
  private KeyParameter key;
  
  BcTlsAEADCipherImpl(AEADBlockCipher paramAEADBlockCipher, boolean paramBoolean) {
    this.cipher = paramAEADBlockCipher;
    this.isEncrypting = paramBoolean;
  }
  
  public void setKey(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.key = new KeyParameter(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public void init(byte[] paramArrayOfbyte, int paramInt) {
    this.cipher.init(this.isEncrypting, (CipherParameters)new AEADParameters(this.key, paramInt * 8, paramArrayOfbyte, null));
  }
  
  public int getOutputSize(int paramInt) {
    return this.cipher.getOutputSize(paramInt);
  }
  
  public int doFinal(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2, byte[] paramArrayOfbyte3, int paramInt3) throws IOException {
    if (!Arrays.isNullOrEmpty(paramArrayOfbyte1))
      this.cipher.processAADBytes(paramArrayOfbyte1, 0, paramArrayOfbyte1.length); 
    int i = this.cipher.processBytes(paramArrayOfbyte2, paramInt1, paramInt2, paramArrayOfbyte3, paramInt3);
    try {
      i += this.cipher.doFinal(paramArrayOfbyte3, paramInt3 + i);
    } catch (InvalidCipherTextException invalidCipherTextException) {
      throw new TlsFatalAlert((short)20, invalidCipherTextException);
    } 
    return i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsAEADCipherImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */