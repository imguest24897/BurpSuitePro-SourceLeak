package org.bouncycastle.crypto.hpke;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.modes.ChaCha20Poly1305;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

public class AEAD {
  private final short aeadId;
  
  private final byte[] key;
  
  private final byte[] baseNonce;
  
  private long seq = 0L;
  
  private AEADCipher cipher;
  
  public AEAD(short paramShort, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this.key = paramArrayOfbyte1;
    this.baseNonce = paramArrayOfbyte2;
    this.aeadId = paramShort;
    this.seq = 0L;
    switch (paramShort) {
      case 1:
      case 2:
        this.cipher = (AEADCipher)new GCMBlockCipher((BlockCipher)new AESEngine());
        break;
      case 3:
        this.cipher = (AEADCipher)new ChaCha20Poly1305();
        break;
    } 
  }
  
  public byte[] seal(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) throws InvalidCipherTextException {
    ParametersWithIV parametersWithIV;
    byte[] arrayOfByte;
    int i;
    if (paramInt1 < 0 || paramInt1 > paramArrayOfbyte2.length)
      throw new IndexOutOfBoundsException("Invalid offset"); 
    if (paramInt1 + paramInt2 > paramArrayOfbyte2.length)
      throw new IndexOutOfBoundsException("Invalid length"); 
    switch (this.aeadId) {
      case 1:
      case 2:
      case 3:
        parametersWithIV = new ParametersWithIV((CipherParameters)new KeyParameter(this.key), ComputeNonce());
        this.cipher.init(true, (CipherParameters)parametersWithIV);
        this.cipher.processAADBytes(paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
        arrayOfByte = new byte[this.cipher.getOutputSize(paramInt2)];
        i = this.cipher.processBytes(paramArrayOfbyte2, paramInt1, paramInt2, arrayOfByte, 0);
        this.cipher.doFinal(arrayOfByte, i);
        this.seq++;
        return arrayOfByte;
    } 
    throw new IllegalStateException("Export only mode, cannot be used to seal/open");
  }
  
  public byte[] seal(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) throws InvalidCipherTextException {
    return seal(paramArrayOfbyte1, paramArrayOfbyte2, 0, paramArrayOfbyte2.length);
  }
  
  public byte[] open(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) throws InvalidCipherTextException {
    ParametersWithIV parametersWithIV;
    byte[] arrayOfByte;
    int i;
    if (paramInt1 < 0 || paramInt1 > paramArrayOfbyte2.length)
      throw new IndexOutOfBoundsException("Invalid offset"); 
    if (paramInt1 + paramInt2 > paramArrayOfbyte2.length)
      throw new IndexOutOfBoundsException("Invalid length"); 
    switch (this.aeadId) {
      case 1:
      case 2:
      case 3:
        parametersWithIV = new ParametersWithIV((CipherParameters)new KeyParameter(this.key), ComputeNonce());
        this.cipher.init(false, (CipherParameters)parametersWithIV);
        this.cipher.processAADBytes(paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
        arrayOfByte = new byte[this.cipher.getOutputSize(paramInt2)];
        i = this.cipher.processBytes(paramArrayOfbyte2, paramInt1, paramInt2, arrayOfByte, 0);
        i += this.cipher.doFinal(arrayOfByte, i);
        this.seq++;
        return arrayOfByte;
    } 
    throw new IllegalStateException("Export only mode, cannot be used to seal/open");
  }
  
  public byte[] open(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) throws InvalidCipherTextException {
    return open(paramArrayOfbyte1, paramArrayOfbyte2, 0, paramArrayOfbyte2.length);
  }
  
  private byte[] ComputeNonce() {
    byte[] arrayOfByte1 = Pack.longToBigEndian(this.seq);
    int i = this.baseNonce.length;
    byte[] arrayOfByte2 = Arrays.clone(this.baseNonce);
    for (byte b = 0; b < 8; b++)
      arrayOfByte2[i - 8 + b] = (byte)(arrayOfByte2[i - 8 + b] ^ arrayOfByte1[b]); 
    return arrayOfByte2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\hpke\AEAD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */