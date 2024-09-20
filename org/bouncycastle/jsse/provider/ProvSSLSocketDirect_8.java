package org.bouncycastle.jsse.provider;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.function.BiFunction;
import javax.net.ssl.SSLSocket;

class ProvSSLSocketDirect_8 extends ProvSSLSocketDirect {
  ProvSSLSocketDirect_8(ContextData paramContextData, boolean paramBoolean1, boolean paramBoolean2, ProvSSLParameters paramProvSSLParameters) {
    super(paramContextData, paramBoolean1, paramBoolean2, paramProvSSLParameters);
  }
  
  protected ProvSSLSocketDirect_8(ContextData paramContextData) {
    super(paramContextData);
  }
  
  protected ProvSSLSocketDirect_8(ContextData paramContextData, InetAddress paramInetAddress1, int paramInt1, InetAddress paramInetAddress2, int paramInt2) throws IOException {
    super(paramContextData, paramInetAddress1, paramInt1, paramInetAddress2, paramInt2);
  }
  
  protected ProvSSLSocketDirect_8(ContextData paramContextData, InetAddress paramInetAddress, int paramInt) throws IOException {
    super(paramContextData, paramInetAddress, paramInt);
  }
  
  protected ProvSSLSocketDirect_8(ContextData paramContextData, String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2) throws IOException, UnknownHostException {
    super(paramContextData, paramString, paramInt1, paramInetAddress, paramInt2);
  }
  
  protected ProvSSLSocketDirect_8(ContextData paramContextData, String paramString, int paramInt) throws IOException, UnknownHostException {
    super(paramContextData, paramString, paramInt);
  }
  
  public synchronized void setHandshakeApplicationProtocolSelector(BiFunction<SSLSocket, List<String>, String> paramBiFunction) {
    this.sslParameters.setSocketAPSelector(JsseUtils_8.importAPSelector(paramBiFunction));
  }
  
  public synchronized BiFunction<SSLSocket, List<String>, String> getHandshakeApplicationProtocolSelector() {
    return JsseUtils_8.exportAPSelector(this.sslParameters.getSocketAPSelector());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\ProvSSLSocketDirect_8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */