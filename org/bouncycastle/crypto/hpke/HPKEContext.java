package org.bouncycastle.crypto.hpke;

import org.bouncycastle.crypto.InvalidCipherTextException;

public class HPKEContext {
  protected final AEAD aead;
  
  protected final HKDF hkdf;
  
  protected final byte[] exporterSecret;
  
  protected final byte[] suiteId;
  
  HPKEContext(AEAD paramAEAD, HKDF paramHKDF, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this.aead = paramAEAD;
    this.hkdf = paramHKDF;
    this.exporterSecret = paramArrayOfbyte1;
    this.suiteId = paramArrayOfbyte2;
  }
  
  public byte[] export(byte[] paramArrayOfbyte, int paramInt) {
    return this.hkdf.LabeledExpand(this.exporterSecret, this.suiteId, "sec", paramArrayOfbyte, paramInt);
  }
  
  public byte[] seal(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) throws InvalidCipherTextException {
    return this.aead.seal(paramArrayOfbyte1, paramArrayOfbyte2);
  }
  
  public byte[] seal(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) throws InvalidCipherTextException {
    return this.aead.seal(paramArrayOfbyte1, paramArrayOfbyte2, paramInt1, paramInt2);
  }
  
  public byte[] open(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) throws InvalidCipherTextException {
    return this.aead.open(paramArrayOfbyte1, paramArrayOfbyte2);
  }
  
  public byte[] open(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) throws InvalidCipherTextException {
    return this.aead.open(paramArrayOfbyte1, paramArrayOfbyte2, paramInt1, paramInt2);
  }
  
  public byte[] extract(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    return this.hkdf.Extract(paramArrayOfbyte1, paramArrayOfbyte2);
  }
  
  public byte[] expand(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    return this.hkdf.Expand(paramArrayOfbyte1, paramArrayOfbyte2, paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\hpke\HPKEContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */