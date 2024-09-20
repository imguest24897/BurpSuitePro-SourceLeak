package org.bouncycastle.tls.crypto.impl;

import java.io.IOException;

public interface TlsBlockCipherImpl {
  void setKey(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException;
  
  void init(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException;
  
  int doFinal(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) throws IOException;
  
  int getBlockSize();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\TlsBlockCipherImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */