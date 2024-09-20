package org.bouncycastle.tls.crypto;

import java.io.IOException;

public interface TlsSecret {
  byte[] calculateHMAC(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3);
  
  TlsSecret deriveUsingPRF(int paramInt1, String paramString, byte[] paramArrayOfbyte, int paramInt2);
  
  void destroy();
  
  byte[] encrypt(TlsEncryptor paramTlsEncryptor) throws IOException;
  
  byte[] extract();
  
  TlsSecret hkdfExpand(int paramInt1, byte[] paramArrayOfbyte, int paramInt2);
  
  TlsSecret hkdfExtract(int paramInt, TlsSecret paramTlsSecret);
  
  boolean isAlive();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\TlsSecret.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */