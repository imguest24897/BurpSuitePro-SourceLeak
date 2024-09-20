package META-INF.versions.9.org.bouncycastle.tls;

import org.bouncycastle.tls.SessionParameters;

public interface TlsSession {
  SessionParameters exportSessionParameters();
  
  byte[] getSessionID();
  
  void invalidate();
  
  boolean isResumable();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsSession.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */