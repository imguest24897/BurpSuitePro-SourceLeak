package org.bouncycastle.pqc.crypto.util;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.security.auth.DestroyFailedException;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.util.Arrays;

public class SecretWithEncapsulationImpl implements SecretWithEncapsulation {
  private final AtomicBoolean hasBeenDestroyed = new AtomicBoolean(false);
  
  private final byte[] sessionKey;
  
  private final byte[] cipher_text;
  
  public SecretWithEncapsulationImpl(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this.sessionKey = paramArrayOfbyte1;
    this.cipher_text = paramArrayOfbyte2;
  }
  
  public byte[] getSecret() {
    byte[] arrayOfByte = Arrays.clone(this.sessionKey);
    checkDestroyed();
    return arrayOfByte;
  }
  
  public byte[] getEncapsulation() {
    byte[] arrayOfByte = Arrays.clone(this.cipher_text);
    checkDestroyed();
    return arrayOfByte;
  }
  
  public void destroy() throws DestroyFailedException {
    if (!this.hasBeenDestroyed.getAndSet(true)) {
      Arrays.clear(this.sessionKey);
      Arrays.clear(this.cipher_text);
    } 
  }
  
  public boolean isDestroyed() {
    return this.hasBeenDestroyed.get();
  }
  
  void checkDestroyed() {
    if (isDestroyed())
      throw new IllegalStateException("data has been destroyed"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypt\\util\SecretWithEncapsulationImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */