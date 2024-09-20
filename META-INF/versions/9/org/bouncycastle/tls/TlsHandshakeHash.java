package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.tls.crypto.TlsHash;

public interface TlsHandshakeHash extends TlsHash {
  void copyBufferTo(OutputStream paramOutputStream) throws IOException;
  
  void forceBuffering();
  
  void notifyPRFDetermined();
  
  void trackHashAlgorithm(int paramInt);
  
  void sealHashAlgorithms();
  
  void stopTracking();
  
  TlsHash forkPRFHash();
  
  byte[] getFinalHash(int paramInt);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsHandshakeHash.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */