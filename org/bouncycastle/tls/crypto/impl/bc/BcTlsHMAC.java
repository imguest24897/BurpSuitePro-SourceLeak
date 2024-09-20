package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.tls.crypto.TlsHMAC;

final class BcTlsHMAC implements TlsHMAC {
  private final HMac hmac;
  
  BcTlsHMAC(HMac paramHMac) {
    this.hmac = paramHMac;
  }
  
  public void setKey(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.hmac.init((CipherParameters)new KeyParameter(paramArrayOfbyte, paramInt1, paramInt2));
  }
  
  public void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.hmac.update(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public byte[] calculateMAC() {
    byte[] arrayOfByte = new byte[this.hmac.getMacSize()];
    this.hmac.doFinal(arrayOfByte, 0);
    return arrayOfByte;
  }
  
  public void calculateMAC(byte[] paramArrayOfbyte, int paramInt) {
    this.hmac.doFinal(paramArrayOfbyte, paramInt);
  }
  
  public int getInternalBlockSize() {
    return ((ExtendedDigest)this.hmac.getUnderlyingDigest()).getByteLength();
  }
  
  public int getMacLength() {
    return this.hmac.getMacSize();
  }
  
  public void reset() {
    this.hmac.reset();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsHMAC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */