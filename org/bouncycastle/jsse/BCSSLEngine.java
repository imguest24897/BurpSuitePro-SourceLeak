package org.bouncycastle.jsse;

import javax.net.ssl.SSLEngine;

public interface BCSSLEngine {
  String getApplicationProtocol();
  
  BCApplicationProtocolSelector<SSLEngine> getBCHandshakeApplicationProtocolSelector();
  
  void setBCHandshakeApplicationProtocolSelector(BCApplicationProtocolSelector<SSLEngine> paramBCApplicationProtocolSelector);
  
  void setBCSessionToResume(BCExtendedSSLSession paramBCExtendedSSLSession);
  
  BCExtendedSSLSession getBCHandshakeSession();
  
  BCExtendedSSLSession getBCSession();
  
  BCSSLConnection getConnection();
  
  String getHandshakeApplicationProtocol();
  
  BCSSLParameters getParameters();
  
  void setParameters(BCSSLParameters paramBCSSLParameters);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\BCSSLEngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */