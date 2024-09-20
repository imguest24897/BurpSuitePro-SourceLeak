package org.bouncycastle.jsse.provider;

import org.bouncycastle.tls.TlsContext;

interface ProvTlsPeer {
  String getID();
  
  ProvSSLSession getSession();
  
  TlsContext getTlsContext();
  
  boolean isHandshakeComplete();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\ProvTlsPeer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */