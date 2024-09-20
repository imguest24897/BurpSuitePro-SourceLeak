package org.bouncycastle.jsse.provider;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.tls.TlsClientProtocol;

class ProvTlsClientProtocol extends TlsClientProtocol {
  private static final boolean provAcceptRenegotiation = PropertyUtils.getBooleanSystemProperty("org.bouncycastle.jsse.client.acceptRenegotiation", false);
  
  private final Closeable closeable;
  
  ProvTlsClientProtocol(InputStream paramInputStream, OutputStream paramOutputStream, Closeable paramCloseable) {
    super(paramInputStream, paramOutputStream);
    this.closeable = paramCloseable;
  }
  
  protected void closeConnection() throws IOException {
    this.closeable.close();
  }
  
  protected int getRenegotiationPolicy() {
    return provAcceptRenegotiation ? 2 : 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\ProvTlsClientProtocol.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */