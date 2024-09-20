package META-INF.versions.9.org.bouncycastle.tls;

import org.bouncycastle.tls.crypto.TlsSecret;

public interface TlsPSK {
  byte[] getIdentity();
  
  TlsSecret getKey();
  
  int getPRFAlgorithm();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsPSK.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */