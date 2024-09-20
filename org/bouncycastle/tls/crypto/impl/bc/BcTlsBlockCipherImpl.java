package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.tls.crypto.impl.TlsBlockCipherImpl;

final class BcTlsBlockCipherImpl implements TlsBlockCipherImpl {
  private final boolean isEncrypting;
  
  private final BlockCipher cipher;
  
  private KeyParameter key;
  
  BcTlsBlockCipherImpl(BlockCipher paramBlockCipher, boolean paramBoolean) {
    this.cipher = paramBlockCipher;
    this.isEncrypting = paramBoolean;
  }
  
  public void setKey(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.key = new KeyParameter(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public void init(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.cipher.init(this.isEncrypting, (CipherParameters)new ParametersWithIV((CipherParameters)this.key, paramArrayOfbyte, paramInt1, paramInt2));
  }
  
  public int doFinal(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) {
    int i = this.cipher.getBlockSize();
    int j;
    for (j = 0; j < paramInt2; j += i)
      this.cipher.processBlock(paramArrayOfbyte1, paramInt1 + j, paramArrayOfbyte2, paramInt3 + j); 
    return paramInt2;
  }
  
  public int getBlockSize() {
    return this.cipher.getBlockSize();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsBlockCipherImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */