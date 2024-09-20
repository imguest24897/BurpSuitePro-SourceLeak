package org.bouncycastle.tls.crypto.impl;

import java.io.IOException;
import org.bouncycastle.tls.crypto.TlsEncryptor;
import org.bouncycastle.tls.crypto.TlsHMAC;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.util.Arrays;

public abstract class AbstractTlsSecret implements TlsSecret {
  protected byte[] data;
  
  protected static byte[] copyData(AbstractTlsSecret paramAbstractTlsSecret) {
    return paramAbstractTlsSecret.copyData();
  }
  
  protected AbstractTlsSecret(byte[] paramArrayOfbyte) {
    this.data = paramArrayOfbyte;
  }
  
  protected void checkAlive() {
    if (this.data == null)
      throw new IllegalStateException("Secret has already been extracted or destroyed"); 
  }
  
  protected abstract AbstractTlsCrypto getCrypto();
  
  public synchronized byte[] calculateHMAC(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    checkAlive();
    TlsHMAC tlsHMAC = getCrypto().createHMACForHash(paramInt1);
    tlsHMAC.setKey(this.data, 0, this.data.length);
    tlsHMAC.update(paramArrayOfbyte, paramInt2, paramInt3);
    return tlsHMAC.calculateMAC();
  }
  
  public synchronized void destroy() {
    if (this.data != null) {
      Arrays.fill(this.data, (byte)0);
      this.data = null;
    } 
  }
  
  public synchronized byte[] encrypt(TlsEncryptor paramTlsEncryptor) throws IOException {
    checkAlive();
    return paramTlsEncryptor.encrypt(this.data, 0, this.data.length);
  }
  
  public synchronized byte[] extract() {
    checkAlive();
    byte[] arrayOfByte = this.data;
    this.data = null;
    return arrayOfByte;
  }
  
  public synchronized boolean isAlive() {
    return (null != this.data);
  }
  
  synchronized byte[] copyData() {
    return Arrays.clone(this.data);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\AbstractTlsSecret.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */