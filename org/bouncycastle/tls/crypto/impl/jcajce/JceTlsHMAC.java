package org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.InvalidKeyException;
import javax.crypto.Mac;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.tls.crypto.TlsCryptoUtils;
import org.bouncycastle.tls.crypto.TlsHMAC;

public class JceTlsHMAC implements TlsHMAC {
  private final Mac hmac;
  
  private final String algorithm;
  
  private final int internalBlockSize;
  
  public JceTlsHMAC(int paramInt, Mac paramMac, String paramString) {
    this.hmac = paramMac;
    this.algorithm = paramString;
    this.internalBlockSize = TlsCryptoUtils.getHashInternalSize(paramInt);
  }
  
  public void setKey(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    try {
      this.hmac.init(new SecretKeySpec(paramArrayOfbyte, paramInt1, paramInt2, this.algorithm));
    } catch (InvalidKeyException invalidKeyException) {
      throw new IllegalArgumentException(invalidKeyException.getMessage());
    } 
  }
  
  public void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.hmac.update(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public byte[] calculateMAC() {
    return this.hmac.doFinal();
  }
  
  public void calculateMAC(byte[] paramArrayOfbyte, int paramInt) {
    try {
      this.hmac.doFinal(paramArrayOfbyte, paramInt);
    } catch (ShortBufferException shortBufferException) {
      throw new IllegalArgumentException(shortBufferException.getMessage());
    } 
  }
  
  public int getInternalBlockSize() {
    return this.internalBlockSize;
  }
  
  public int getMacLength() {
    return this.hmac.getMacLength();
  }
  
  public void reset() {
    this.hmac.reset();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JceTlsHMAC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */