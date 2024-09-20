package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.util.List;
import java.util.function.BiFunction;
import javax.net.ssl.SSLEngine;
import org.bouncycastle.jsse.provider.ContextData;
import org.bouncycastle.jsse.provider.JsseUtils_8;
import org.bouncycastle.jsse.provider.ProvSSLEngine;

class ProvSSLEngine_8 extends ProvSSLEngine {
  protected ProvSSLEngine_8(ContextData paramContextData) {
    super(paramContextData);
  }
  
  protected ProvSSLEngine_8(ContextData paramContextData, String paramString, int paramInt) {
    super(paramContextData, paramString, paramInt);
  }
  
  public synchronized void setHandshakeApplicationProtocolSelector(BiFunction<SSLEngine, List<String>, String> paramBiFunction) {
    this.sslParameters.setEngineAPSelector(JsseUtils_8.importAPSelector(paramBiFunction));
  }
  
  public synchronized BiFunction<SSLEngine, List<String>, String> getHandshakeApplicationProtocolSelector() {
    return JsseUtils_8.exportAPSelector(this.sslParameters.getEngineAPSelector());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvSSLEngine_8.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */