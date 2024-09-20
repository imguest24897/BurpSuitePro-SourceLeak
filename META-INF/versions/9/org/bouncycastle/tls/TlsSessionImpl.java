package META-INF.versions.9.org.bouncycastle.tls;

import org.bouncycastle.tls.SessionParameters;
import org.bouncycastle.tls.TlsSession;
import org.bouncycastle.util.Arrays;

class TlsSessionImpl implements TlsSession {
  final byte[] sessionID;
  
  final SessionParameters sessionParameters;
  
  boolean resumable;
  
  TlsSessionImpl(byte[] paramArrayOfbyte, SessionParameters paramSessionParameters) {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'sessionID' cannot be null"); 
    if (paramArrayOfbyte.length > 32)
      throw new IllegalArgumentException("'sessionID' cannot be longer than 32 bytes"); 
    this.sessionID = Arrays.clone(paramArrayOfbyte);
    this.sessionParameters = paramSessionParameters;
    this.resumable = (paramArrayOfbyte.length > 0 && null != paramSessionParameters);
  }
  
  public synchronized SessionParameters exportSessionParameters() {
    return (this.sessionParameters == null) ? null : this.sessionParameters.copy();
  }
  
  public synchronized byte[] getSessionID() {
    return this.sessionID;
  }
  
  public synchronized void invalidate() {
    this.resumable = false;
  }
  
  public synchronized boolean isResumable() {
    return this.resumable;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsSessionImpl.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */