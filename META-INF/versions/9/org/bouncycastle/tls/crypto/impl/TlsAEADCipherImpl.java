package META-INF.versions.9.org.bouncycastle.tls.crypto.impl;

import java.io.IOException;

public interface TlsAEADCipherImpl {
  void setKey(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException;
  
  void init(byte[] paramArrayOfbyte, int paramInt) throws IOException;
  
  int getOutputSize(int paramInt);
  
  int doFinal(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2, byte[] paramArrayOfbyte3, int paramInt3) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\TlsAEADCipherImpl.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */