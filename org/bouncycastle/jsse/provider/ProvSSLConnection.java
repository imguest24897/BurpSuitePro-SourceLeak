package org.bouncycastle.jsse.provider;

import java.util.concurrent.atomic.AtomicLong;
import org.bouncycastle.jsse.BCExtendedSSLSession;
import org.bouncycastle.jsse.BCSSLConnection;
import org.bouncycastle.tls.TlsContext;

class ProvSSLConnection implements BCSSLConnection {
  private static final AtomicLong CONNECTION_IDS = new AtomicLong(0L);
  
  protected final ProvTlsPeer tlsPeer;
  
  static long allocateConnectionID() {
    return CONNECTION_IDS.incrementAndGet();
  }
  
  ProvSSLConnection(ProvTlsPeer paramProvTlsPeer) {
    this.tlsPeer = paramProvTlsPeer;
  }
  
  public byte[] exportKeyingMaterial(String paramString, byte[] paramArrayOfbyte, int paramInt) {
    return getTlsContext().exportKeyingMaterial(paramString, paramArrayOfbyte, paramInt);
  }
  
  public String getApplicationProtocol() {
    return JsseUtils.getApplicationProtocol(getTlsContext().getSecurityParametersConnection());
  }
  
  public byte[] getChannelBinding(String paramString) {
    if (paramString.equals("tls-exporter"))
      return getTlsContext().exportChannelBinding(3); 
    if (paramString.equals("tls-server-end-point"))
      return getTlsContext().exportChannelBinding(0); 
    if (paramString.equals("tls-unique"))
      return getTlsContext().exportChannelBinding(1); 
    throw new UnsupportedOperationException();
  }
  
  public String getID() {
    return this.tlsPeer.getID();
  }
  
  public ProvSSLSession getSession() {
    return this.tlsPeer.getSession();
  }
  
  protected TlsContext getTlsContext() {
    return this.tlsPeer.getTlsContext();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\ProvSSLConnection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */