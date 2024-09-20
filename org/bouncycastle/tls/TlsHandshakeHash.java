package org.bouncycastle.tls;

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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsHandshakeHash.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */