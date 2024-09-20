package org.bouncycastle.jsse.provider;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.List;
import java.util.function.BiFunction;
import javax.net.ssl.SSLSocket;

class ProvSSLSocketWrap_8 extends ProvSSLSocketWrap {
  protected ProvSSLSocketWrap_8(ContextData paramContextData, Socket paramSocket, InputStream paramInputStream, boolean paramBoolean) throws IOException {
    super(paramContextData, paramSocket, paramInputStream, paramBoolean);
  }
  
  protected ProvSSLSocketWrap_8(ContextData paramContextData, Socket paramSocket, String paramString, int paramInt, boolean paramBoolean) throws IOException {
    super(paramContextData, paramSocket, paramString, paramInt, paramBoolean);
  }
  
  public synchronized void setHandshakeApplicationProtocolSelector(BiFunction<SSLSocket, List<String>, String> paramBiFunction) {
    this.sslParameters.setSocketAPSelector(JsseUtils_8.importAPSelector(paramBiFunction));
  }
  
  public synchronized BiFunction<SSLSocket, List<String>, String> getHandshakeApplicationProtocolSelector() {
    return JsseUtils_8.exportAPSelector(this.sslParameters.getSocketAPSelector());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\ProvSSLSocketWrap_8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */