package org.bouncycastle.jsse;

public interface BCSSLConnection {
  String getApplicationProtocol();
  
  byte[] getChannelBinding(String paramString);
  
  String getID();
  
  BCExtendedSSLSession getSession();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\BCSSLConnection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */