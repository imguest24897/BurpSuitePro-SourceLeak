package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.List;
import java.util.function.BiFunction;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.provider.ContextData;
import org.bouncycastle.jsse.provider.JsseUtils_8;
import org.bouncycastle.jsse.provider.ProvSSLSocketWrap;

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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvSSLSocketWrap_8.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */