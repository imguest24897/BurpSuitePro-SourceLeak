package org.bouncycastle.tls;

public interface TlsSession {
  SessionParameters exportSessionParameters();
  
  byte[] getSessionID();
  
  void invalidate();
  
  boolean isResumable();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsSession.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */