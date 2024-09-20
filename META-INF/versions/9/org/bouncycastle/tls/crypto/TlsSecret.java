package META-INF.versions.9.org.bouncycastle.tls.crypto;

import java.io.IOException;
import org.bouncycastle.tls.crypto.TlsEncryptor;

public interface TlsSecret {
  byte[] calculateHMAC(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3);
  
  org.bouncycastle.tls.crypto.TlsSecret deriveUsingPRF(int paramInt1, String paramString, byte[] paramArrayOfbyte, int paramInt2);
  
  void destroy();
  
  byte[] encrypt(TlsEncryptor paramTlsEncryptor) throws IOException;
  
  byte[] extract();
  
  org.bouncycastle.tls.crypto.TlsSecret hkdfExpand(int paramInt1, byte[] paramArrayOfbyte, int paramInt2);
  
  org.bouncycastle.tls.crypto.TlsSecret hkdfExtract(int paramInt, org.bouncycastle.tls.crypto.TlsSecret paramTlsSecret);
  
  boolean isAlive();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\TlsSecret.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */