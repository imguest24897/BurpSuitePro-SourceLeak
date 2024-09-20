package org.bouncycastle.jsse.provider;

import java.util.List;
import java.util.function.BiFunction;
import javax.net.ssl.SSLEngine;

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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\ProvSSLEngine_8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */